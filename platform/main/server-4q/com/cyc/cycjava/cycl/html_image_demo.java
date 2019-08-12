/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
 *  module:      HTML-IMAGE-DEMO
 *  source file: /cyc/top/cycl/html-image-demo.lisp
 *  created:     2019/07/03 17:38:27
 */
public final class html_image_demo extends SubLTranslatedFile implements V02 {
    // // Constructor
    private html_image_demo() {
    }

    public static final SubLFile me = new html_image_demo();

    public static final String myName = "com.cyc.cycjava.cycl.html_image_demo";

    // // Definitions
    // defparameter
    private static final SubLSymbol $top_frame_quantum$ = makeSymbol("*TOP-FRAME-QUANTUM*");

    // defparameter
    private static final SubLSymbol $left_column_quantum$ = makeSymbol("*LEFT-COLUMN-QUANTUM*");

    // defparameter
    private static final SubLSymbol $ir_image_directory$ = makeSymbol("*IR-IMAGE-DIRECTORY*");

    // defparameter
    private static final SubLSymbol $inference_failure_reasons$ = makeSymbol("*INFERENCE-FAILURE-REASONS*");

    public static final SubLObject ir_form(SubLObject v_object, SubLObject depth, SubLObject wrap_axioms) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axioms == UNPROVIDED) {
            wrap_axioms = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = cb_parameters.$cb_default_term_frame$.currentBinding(thread);
                try {
                    cb_parameters.$cb_default_term_frame$.bind($TOP, thread);
                    cb_utilities.cb_form(v_object, depth, wrap_axioms);
                } finally {
                    cb_parameters.$cb_default_term_frame$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_inference_failure_reason(SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject reason = assoc(key, $inference_failure_reasons$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                if (!reason.isString()) {
                    reason = $str_alt5$The_reason_is_unknown_;
                }
                return reason;
            }
        }
    }

    public static final SubLObject ir_reset() {
        image_demo_internals.ir_init(operation_communication.the_cyclist());
        apps_shared.configure_app_colors();
        image_demo_internals.ir_initialize_parse_query_cache(file_utilities.cyc_home_filename($list_alt6, $str_alt7$ir_parse_query_tests, $$$lisp), UNPROVIDED);
        ir_reset_frame_sources();
        return NIL;
    }

    public static final SubLObject ir_start(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        ir_reset();
        return ir_main_page(UNPROVIDED);
    }

    public static final SubLObject ir_switch_mode(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject mode = image_demo_internals.ir_value(operation_communication.the_cyclist(), $MODE);
            SubLObject v_new = (mode == $QUERY) ? ((SubLObject) ($FIND_CREATE)) : $QUERY;
            image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MODE, $REPLACE, v_new);
            ir_typein(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject ir_typein_table(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mode = image_demo_internals.ir_value(operation_communication.the_cyclist(), $MODE);
                SubLObject heading = (mode == $QUERY) ? ((SubLObject) ($str_alt15$Find____)) : mode == $FIND_CREATE ? ((SubLObject) ($str_alt16$Object_to_caption_)) : $$$Caption_for;
                SubLObject mt = (mode == $CAPTION) ? ((SubLObject) (image_demo_internals.ir_value(operation_communication.the_cyclist(), $MT))) : NIL;
                SubLObject keys = image_demo_internals.ir_value(operation_communication.the_cyclist(), $OBJECT_KEYS);
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
                            SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        cyc_navigator_internals.nav_link($IR_SWITCH_MODE, NIL, $str_alt22$ir_top_frame, heading, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (mode == $CAPTION) {
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt23$__);
                                            ir_form(mt, UNPROVIDED, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt24$_);
                                        }
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_br();
                                        html_utilities.html_text_input($str_alt25$input_string, $str_alt26$, $int$45);
                                        html_utilities.html_br();
                                        html_utilities.html_br();
                                        html_utilities.html_reset_input($$$Clear);
                                        html_utilities.html_submit_input(NIL != find(mode, $list_alt29, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) ($$$Parse)) : $$$Go, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.verify_not_within_html_pre();
                                        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                        {
                                            SubLObject _prev_bind_0_4 = html_macros.$within_html_pre$.currentBinding(thread);
                                            try {
                                                html_macros.$within_html_pre$.bind(T, thread);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt32$___);
                                            } finally {
                                                html_macros.$within_html_pre$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), mode == $QUERY ? ((SubLObject) ($str_alt33$Items_to_include_)) : $str_alt34$Object_type_);
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_br();
                                        if (mode == $QUERY) {
                                            html_utilities.html_checkbox_input($$$type, $str_alt36$_image, intersection($list_alt37, keys, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            html_utilities.html_radio_input($$$type, $str_alt36$_image, T);
                                        }
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt38$_Digitized_image_a, mode == $QUERY ? ((SubLObject) ($$$s)) : $str_alt26$);
                                        html_utilities.html_br();
                                        if (mode == $QUERY) {
                                            html_utilities.html_checkbox_input($$$type, $str_alt40$_text, intersection($list_alt41, keys, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            html_utilities.html_radio_input($$$type, $str_alt40$_text, NIL);
                                        }
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt42$_Text_document_a, mode == $QUERY ? ((SubLObject) ($$$s)) : $str_alt26$);
                                        html_utilities.html_br();
                                        if (mode == $QUERY) {
                                            html_utilities.html_checkbox_input($$$type, $str_alt43$_web_page, intersection($list_alt44, keys, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            html_utilities.html_radio_input($$$type, $str_alt43$_web_page, NIL);
                                        }
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt45$_Web_page_a, mode == $QUERY ? ((SubLObject) ($$$s)) : $str_alt26$);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
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

    public static final SubLObject ir_link_table(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                        SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cyc_navigator_internals.nav_link($TINY_CYCORP_SYMBOL_TO_NAVIGATOR, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cyc_navigator_internals.nav_link($IR_PREFERENCES, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cyc_navigator_internals.nav_link($IR_MAIN, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
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

    public static final SubLObject ir_typein(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color = image_demo_internals.ir_value(operation_communication.the_cyclist(), $STANDARD_BG_COLOR);
                {
                    SubLObject _prev_bind_0 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$html_generation_target$.bind(html_macros.$html_parent_target$.getGlobalValue(), thread);
                        {
                            SubLObject mode = image_demo_internals.ir_value(operation_communication.the_cyclist(), $MODE);
                            SubLObject target = (NIL != find(mode, $list_alt29, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) ($str_alt54$ir_bottom_left_frame)) : NIL != find(mode, $list_alt55, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (html_macros.$html_parent_target$.getGlobalValue())) : html_macros.$html_parent_target$.getGlobalValue();
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            {
                                SubLObject _prev_bind_0_10 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != color) {
                                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(color));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                            ir_link_table(UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup($$$post);
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != target) {
                                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(target);
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
                                                    html_utilities.html_hidden_input($str_alt57$ir_handle_typein, $$$T, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                    ir_typein_table(args);
                                                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_10, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    } finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_handle_query_typein(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject string = html_utilities.html_extract_input($str_alt25$input_string, args);
            SubLObject type_indicators = html_utilities.html_extract_input_values($$$type, args);
            SubLObject types = Mapping.mapcar(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), type_indicators);
            SubLObject raw_parses = image_demo_internals.ir_generate_parses(string);
            SubLObject parses = NIL;
            SubLObject id_parse_pairs = NIL;
            if (NIL == types) {
                types = $list_alt61;
            }
            image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $OBJECT_KEYS, $REPLACE, types);
            parses = remove(NIL, Mapping.mapcar(symbol_function(INSERT_CONTENT_LITERALS), raw_parses), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            id_parse_pairs = Mapping.mapcar(symbol_function(ADD_PARSE_ID), parses);
            image_demo_internals.ir_clear_data();
            image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $LAST_INPUT_STRING, $REPLACE, string);
            image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $LAST_PARSES, $REPLACE, id_parse_pairs);
            if (NIL == id_parse_pairs) {
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE, $REPLACE, format(NIL, $str_alt67$No_parses_were_generated_for_the_, string));
            }
            ir_choose_parse(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject ir_make_valid_mt_name(SubLObject string) {
        if (!string.isString()) {
            return NIL;
        }
        Strings.set_char(string, ZERO_INTEGER, char_upcase(Strings.sublisp_char(string, ZERO_INTEGER)));
        {
            SubLObject cdotimes_end_var = length(string);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                if (NIL == constant_completion_high.valid_constant_name_char_p(Strings.sublisp_char(string, i))) {
                    Strings.set_char(string, i, CHAR_X);
                }
            }
        }
        if (NIL != fi.fi_find_int(string)) {
            string = format(NIL, $str_alt69$_a__a, string, gentemp($str_alt70$IR_));
        }
        return string;
    }

    public static final SubLObject ir_create_mt(SubLObject name, SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject valid_name = ir_make_valid_mt_name(name);
                SubLObject success = NIL;
                if (valid_name.isString()) {
                    {
                        SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                        try {
                            api_control_vars.$use_local_queueP$.bind(NIL, thread);
                            {
                                SubLObject constant = fi.fi_create(valid_name, UNPROVIDED);
                                fi.fi_timestamp_constant(operation_communication.the_cyclist(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                fi.fi_assert(list($$isa, constant, collection), mt_vars.$default_assert_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                                if (NIL != fi.safe_fi($ASK, list($$isa, constant, collection), mt_vars.$default_ask_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    success = constant;
                                }
                            }
                        } finally {
                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return success;
            }
        }
    }

    public static final SubLObject ir_handle_create_typein(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = html_utilities.html_extract_input($str_alt25$input_string, args);
                SubLObject type_ind = html_utilities.html_extract_input($$$type, args);
                SubLObject v_term = (NIL != string_utilities.non_empty_stringP(string)) ? ((SubLObject) (ke_utilities.cycl_from_string(string))) : NIL;
                SubLObject type = read_from_string_ignoring_errors(type_ind, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject collection = third(assoc(type, image_demo_internals.$ir_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                SubLObject already_of_typeP = isa.isa_in_any_mtP(v_term, collection);
                SubLObject isas = NIL;
                if (((NIL != v_term) && (NIL == already_of_typeP)) && (NIL != forts.valid_fortP(function_terms.naut_to_nart(v_term)))) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            isas = isa.min_isa(v_term, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if ((NIL != string_utilities.null_stringP(string)) || (NIL == string)) {
                    image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE_PAGE_MESSAGE, $REPLACE, format(NIL, $str_alt76$Please_enter_a_name_for_the_objec));
                    image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MODE, $REPLACE, $FIND_CREATE);
                    ir_bottom_left_source($list_alt77);
                } else
                    if (NIL != already_of_typeP) {
                        image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MODE, $REPLACE, $CAPTION);
                        image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MT, $REPLACE, v_term);
                    } else
                        if (NIL != isas) {
                            image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE_PAGE_MESSAGE, $REPLACE, format(NIL, $str_alt78$_a_is_an_instance_of__a__and_not_, new SubLObject[]{ v_term, isas.first(), misc_kb_utilities.coerce_name(collection) }));
                            image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MODE, $REPLACE, $FIND_CREATE);
                            ir_bottom_left_source($list_alt77);
                        } else {
                            {
                                SubLObject new_mt = ir_create_mt(string, collection);
                                if (NIL != forts.valid_fortP(new_mt)) {
                                    image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MODE, $REPLACE, $CAPTION);
                                    image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MT, $REPLACE, new_mt);
                                } else {
                                    image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE_PAGE_MESSAGE, $REPLACE, format(NIL, $str_alt79$_a_could_not_be_coerced_into_a_le, string));
                                    image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MODE, $REPLACE, $FIND_CREATE);
                                }
                            }
                        }


            }
            ir_main_page(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject ir_handle_caption_typein(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return ir_handle_query_typein(args);
    }

    public static final SubLObject ir_handle_typein(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject mode = image_demo_internals.ir_value(operation_communication.the_cyclist(), $MODE);
            SubLObject pcase_var = mode;
            if (pcase_var.eql($QUERY)) {
                ir_handle_query_typein(args);
            } else
                if (pcase_var.eql($FIND_CREATE)) {
                    ir_handle_create_typein(args);
                } else
                    if (pcase_var.eql($CAPTION)) {
                        ir_handle_caption_typein(args);
                    }


        }
        return NIL;
    }

    public static final SubLObject ir_inference_parameters(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject backchain = image_demo_internals.ir_value(operation_communication.the_cyclist(), $BACKCHAIN);
                SubLObject number = image_demo_internals.ir_value(operation_communication.the_cyclist(), $NUMBER);
                SubLObject time = image_demo_internals.ir_value(operation_communication.the_cyclist(), $TIME);
                SubLObject depth = image_demo_internals.ir_value(operation_communication.the_cyclist(), $DEPTH);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt87$Inference_parameters_);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt88$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$right));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt90$Backchain__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_text_input($$$backchain, NIL != backchain ? ((SubLObject) (backchain)) : $$$NIL, THREE_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt88$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$right));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt93$Number__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_text_input($$$number, NIL != number ? ((SubLObject) (number)) : $$$NIL, THREE_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt88$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$right));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt95$Time__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_text_input($$$time, NIL != time ? ((SubLObject) (time)) : $$$NIL, THREE_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt88$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$right));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt97$Depth__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_text_input($$$depth, NIL != depth ? ((SubLObject) (depth)) : $$$NIL, THREE_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_utilities.html_checkbox_input($str_alt99$clear_psc, $str_alt99$clear_psc, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt100$_Clear_context_);
                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(NIL, thread);
                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $$$context);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject pscs = Mapping.mapcar(symbol_function(SEVENTH), image_demo_internals.$ir_types$.getDynamicValue(thread));
                                    SubLObject psc_names = Mapping.mapcar(symbol_function(COERCE_NAME), pscs);
                                    SubLObject cdolist_list_var = Sort.sort(copy_list(psc_names), symbol_function(STRING_LESSP), UNPROVIDED);
                                    SubLObject v_psc = NIL;
                                    for (v_psc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_psc = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                        {
                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                if (v_psc.equalp(misc_kb_utilities.coerce_name(image_demo_internals.ir_value(operation_communication.the_cyclist(), $PSC)))) {
                                                    html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt105$_a, v_psc);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject ir_interface_parameters(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject quantum = image_demo_internals.ir_value(operation_communication.the_cyclist(), $INDENT_QUANTUM);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt109$Interface_parameters_);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_br();
                html_utilities.html_br();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt110$Background_color__);
                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(NIL, thread);
                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt111$bg_color);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject cdolist_list_var = apps_shared.$app_color_name_map$.getDynamicValue(thread);
                                    SubLObject pair = NIL;
                                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                        {
                                            SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                if (pair.first() == image_demo_internals.ir_value(operation_communication.the_cyclist(), $STANDARD_BG_COLOR)) {
                                                    html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), pair.rest());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                html_utilities.html_br();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt112$Message_color__);
                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(NIL, thread);
                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt113$msg_color);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject cdolist_list_var = apps_shared.$app_color_name_map$.getDynamicValue(thread);
                                    SubLObject pair = NIL;
                                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                        {
                                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                if (pair.first() == image_demo_internals.ir_value(operation_communication.the_cyclist(), $MESSAGE_COLOR)) {
                                                    html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), pair.rest());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
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
                            SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_radio_input($$$language, $$$cycl, makeBoolean((NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL)) && (NIL == image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_ENGLISH))));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt120$_Show_assertions_in_CycL);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_radio_input($$$language, $$$english, makeBoolean((NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_ENGLISH)) && (NIL == image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL))));
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
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt122$_Show_assertions_in_English);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
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
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_radio_input($$$language, $$$both, makeBoolean((NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_ENGLISH)) && (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL))));
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
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt124$_Show_English_and_CycL);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_checkbox_input($$$inline, $$$yes, image_demo_internals.ir_value(operation_communication.the_cyclist(), $INLINE_IMAGES), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt128$_Inline_images);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
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
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_checkbox_input($$$captions, $$$yes, image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CAPTION), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt131$_Show_caption_strings);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_checkbox_input($$$annotate, $$$yes, image_demo_internals.ir_value(operation_communication.the_cyclist(), $ANNOTATE_JUSTIFICATION), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt134$_Annotate_justifications);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_checkbox_input($$$floating, $$$yes, image_demo_internals.ir_value(operation_communication.the_cyclist(), $USE_FLOATING_PAGE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt137$_Use_extra__floating__page);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt138$Table_indent_quantum_);
                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(NIL, thread);
                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $$$quantum);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject cdolist_list_var = $list_alt140;
                                    SubLObject n = NIL;
                                    for (n = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , n = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                        {
                                            SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                if (n.equal(quantum)) {
                                                    html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt105$_a, n);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject ir_nl_parameters(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parser_limit = image_demo_internals.ir_value(operation_communication.the_cyclist(), $PARSER_TIME_LIMIT);
                SubLObject semantics_limit = image_demo_internals.ir_value(operation_communication.the_cyclist(), $SEMANTICS_TIME_LIMIT);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt144$NL_parameters_);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$right));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt145$Parser_time_limit__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_text_input($$$parser, NIL != parser_limit ? ((SubLObject) (parser_limit)) : $$$NIL, THREE_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$right));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt147$Semantics_time_limit__);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_text_input($$$semantics, NIL != semantics_limit ? ((SubLObject) (semantics_limit)) : $$$NIL, THREE_INTEGER);
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
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
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
                            SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_checkbox_input($$$partial, $$$yes, image_demo_internals.ir_value(operation_communication.the_cyclist(), $PARTIAL_SEMANTICS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt151$_Use_partial_semantics);
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
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_checkbox_input($str_alt152$group_plurals, $$$yes, image_demo_internals.ir_value(operation_communication.the_cyclist(), $GROUP_PLURALS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt154$_Pluralize_groups);
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
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_checkbox_input($str_alt155$clear_caches, $$$yes, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt156$_Clear_NL_caches_now);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
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

    public static final SubLObject ir_operation_parameters(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject modes = Sort.sort(copy_list(apps_shared.$app_communication_mode_map$.getDynamicValue(thread)), symbol_function(STRING_LESSP), symbol_function(CAR));
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ($str_alt159$Cyc_operation_parameters_);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_br();
                html_utilities.html_br();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt160$Communication_mode__);
                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(NIL, thread);
                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt161$comm_mode);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject cdolist_list_var = modes;
                                    SubLObject pair = NIL;
                                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                        {
                                            SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                if (pair.rest() == operation_communication.communication_mode()) {
                                                    html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), pair.first());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
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
                            SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($$$middle));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_checkbox_input($str_alt162$use_local_queue, $$$yes, api_control_vars.$use_local_queueP$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt163$_Use_local_queue);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
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

    public static final SubLObject ir_preferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color = image_demo_internals.ir_value(operation_communication.the_cyclist(), $STANDARD_BG_COLOR);
                {
                    SubLObject _prev_bind_0 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$html_generation_target$.bind(html_macros.$html_parent_target$.getGlobalValue(), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0_83 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $$$User_Preferences);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$post);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt166$ir_bottom_right_frame);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                html_utilities.html_hidden_input($str_alt167$ir_handle_preferences, T, UNPROVIDED);
                                                ir_message(NIL, ONE_INTEGER, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Update, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                ir_inference_parameters(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                ir_interface_parameters(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                ir_nl_parameters(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                ir_operation_parameters(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                html_utilities.html_submit_input($$$Update, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_83, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_handle_preferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject backchain = html_utilities.html_extract_input($$$backchain, args);
                SubLObject number = html_utilities.html_extract_input($$$number, args);
                SubLObject time = html_utilities.html_extract_input($$$time, args);
                SubLObject depth = html_utilities.html_extract_input($$$depth, args);
                SubLObject clear_psc = html_utilities.html_extract_input($str_alt99$clear_psc, args);
                SubLObject v_context = html_utilities.html_extract_input($$$context, args);
                SubLObject background_color = html_utilities.html_extract_input($str_alt111$bg_color, args);
                SubLObject message_color = html_utilities.html_extract_input($str_alt113$msg_color, args);
                SubLObject language = html_utilities.html_extract_input($$$language, args);
                SubLObject inline = html_utilities.html_extract_input($$$inline, args);
                SubLObject captions = html_utilities.html_extract_input($$$captions, args);
                SubLObject quantum = html_utilities.html_extract_input($$$quantum, args);
                SubLObject annotate = html_utilities.html_extract_input($$$annotate, args);
                SubLObject floating = html_utilities.html_extract_input($$$floating, args);
                SubLObject v_parser = html_utilities.html_extract_input($$$parser, args);
                SubLObject semantics = html_utilities.html_extract_input($$$semanics, args);
                SubLObject partial = html_utilities.html_extract_input($$$partial, args);
                SubLObject group_plurals = html_utilities.html_extract_input($str_alt152$group_plurals, args);
                SubLObject clear_caches = html_utilities.html_extract_input($str_alt155$clear_caches, args);
                SubLObject comm_mode = html_utilities.html_extract_input($str_alt161$comm_mode, args);
                SubLObject use_local_queue = html_utilities.html_extract_input($str_alt162$use_local_queue, args);
                if (NIL != string_utilities.non_empty_stringP(backchain)) {
                    backchain = read_from_string_ignoring_errors(backchain, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    backchain = NIL;
                }
                if (NIL != string_utilities.non_empty_stringP(number)) {
                    number = read_from_string_ignoring_errors(number, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    number = NIL;
                }
                if (NIL != string_utilities.non_empty_stringP(time)) {
                    time = read_from_string_ignoring_errors(time, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    time = NIL;
                }
                if (NIL != string_utilities.non_empty_stringP(depth)) {
                    depth = read_from_string_ignoring_errors(depth, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    depth = NIL;
                }
                if (clear_psc.equalp($str_alt99$clear_psc)) {
                    clear_psc = T;
                } else {
                    clear_psc = NIL;
                }
                if (((NIL != clear_psc) && v_context.isString()) && length(v_context).numG(ZERO_INTEGER)) {
                    v_context = ke_utilities.cycl_from_string(v_context);
                    if (NIL == forts.valid_fortP(v_context)) {
                        v_context = NIL;
                    }
                }
                if (background_color.isString()) {
                    background_color = rassoc(background_color, apps_shared.$app_color_name_map$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED).first();
                } else {
                    background_color = $DEFAULT;
                }
                if (message_color.isString()) {
                    message_color = rassoc(message_color, apps_shared.$app_color_name_map$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED).first();
                } else {
                    message_color = $BLACK;
                }
                if (NIL == find(language, $list_alt173, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    language = $$$both;
                }
                inline = equalp(inline, $$$yes);
                captions = equalp(captions, $$$yes);
                if (NIL != string_utilities.non_empty_stringP(quantum)) {
                    quantum = read_from_string_ignoring_errors(quantum, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    quantum = TWO_INTEGER;
                }
                annotate = equalp(annotate, $$$yes);
                floating = equalp(floating, $$$yes);
                if (NIL != string_utilities.non_empty_stringP(v_parser)) {
                    v_parser = read_from_string_ignoring_errors(v_parser, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    v_parser = NIL;
                }
                if (NIL != string_utilities.non_empty_stringP(semantics)) {
                    semantics = read_from_string_ignoring_errors(semantics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    semantics = NIL;
                }
                partial = equalp(partial, $$$yes);
                group_plurals = equalp(group_plurals, $$$yes);
                clear_caches = equalp(clear_caches, $$$yes);
                if (NIL != find(comm_mode, $list_alt174, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    comm_mode = assoc(comm_mode, apps_shared.$app_communication_mode_map$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED).rest();
                } else {
                    comm_mode = $RECEIVE_ONLY;
                }
                use_local_queue = equalp(use_local_queue, $$$yes);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $BACKCHAIN, $REPLACE, backchain);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $NUMBER, $REPLACE, number);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $TIME, $REPLACE, time);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $DEPTH, $REPLACE, depth);
                if (((NIL != clear_psc) && (NIL != v_context)) && (NIL != isa.isa_in_any_mtP(v_context, $$Microtheory))) {
                    misc_kb_utilities.remove_mt_assertions(v_context);
                }
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $STANDARD_BG_COLOR, $REPLACE, background_color);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE_COLOR, $REPLACE, message_color);
                if (language.equalp($$$cycl)) {
                    image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $SHOW_CYCL, $REPLACE, T);
                    image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $SHOW_ENGLISH, $REPLACE, NIL);
                } else
                    if (language.equalp($$$english)) {
                        image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $SHOW_ENGLISH, $REPLACE, T);
                        image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $SHOW_CYCL, $REPLACE, NIL);
                    } else {
                        image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $SHOW_CYCL, $REPLACE, T);
                        image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $SHOW_ENGLISH, $REPLACE, T);
                    }

                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $INLINE_IMAGES, $REPLACE, inline);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $SHOW_CAPTION, $REPLACE, captions);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $ANNOTATE_JUSTIFICATION, $REPLACE, annotate);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $USE_FLOATING_PAGE, $REPLACE, floating);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $INDENT_QUANTUM, $REPLACE, quantum);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $PARSER_TIME_LIMIT, $REPLACE, v_parser);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $SEMANTICS_TIME_LIMIT, $REPLACE, semantics);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $PARTIAL_SEMANTICS, $REPLACE, partial);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $GROUP_PLURALS, $REPLACE, group_plurals);
                if (NIL != clear_caches) {
                    image_demo_internals.ir_clear_nl_caches();
                }
                operation_communication.set_communication_mode(comm_mode);
                api_control_vars.$use_local_queueP$.setDynamicValue(use_local_queue, thread);
            }
            image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE, $REPLACE, format(NIL, $str_alt177$Preferences_for__a_have_been_upda, misc_kb_utilities.coerce_name(operation_communication.the_cyclist())));
            return ir_preferences(UNPROVIDED);
        }
    }

    public static final SubLObject ir_welcome(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color = image_demo_internals.ir_value(operation_communication.the_cyclist(), $STANDARD_BG_COLOR);
                {
                    SubLObject _prev_bind_0 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$html_generation_target$.bind(html_macros.$html_parent_target$.getGlobalValue(), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0_86 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.$cycorp_homepage_url$.getDynamicValue(thread));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (NIL != html_macros.$html_parent_target$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_parent_target$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($CYCORP_LOGO_BIG));
                                                    SubLObject align = (true) ? ((SubLObject) ($$$middle)) : $CENTER;
                                                    SubLObject alt = (true) ? ((SubLObject) ($str_alt181$Cycorp__Inc_)) : cyc_file_dependencies.get_html_icon_alt_string($CYCORP_LOGO_BIG);
                                                    SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
                                                    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(image_src);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (NIL != alt) {
                                                        html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(alt);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != align) {
                                                        html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_align(align));
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (NIL != border) {
                                                        html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(border);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                                    html_utilities.html_br();
                                                    {
                                                        SubLObject size_val = FIVE_INTEGER;
                                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                        if (NIL != size_val) {
                                                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(size_val);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt182$www_cyc_com);
                                                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), image_demo_internals.ir_value(operation_communication.the_cyclist(), $STARTUP_MESSAGE));
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_86, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_message_page(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color = image_demo_internals.ir_value(operation_communication.the_cyclist(), $STANDARD_BG_COLOR);
                {
                    SubLObject _prev_bind_0 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$html_generation_target$.bind(html_macros.$html_parent_target$.getGlobalValue(), thread);
                        {
                            SubLObject message = args.first();
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            {
                                SubLObject _prev_bind_0_91 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != color) {
                                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(color));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_br();
                                            if (message.isString()) {
                                                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE_PAGE_MESSAGE, $REPLACE, message);
                                            }
                                            ir_message(ONE_INTEGER, NIL, T);
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_91, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    } finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_message(SubLObject top_spaces, SubLObject bottom_spaces, SubLObject use_message_page_messageP) {
        if (top_spaces == UNPROVIDED) {
            top_spaces = NIL;
        }
        if (bottom_spaces == UNPROVIDED) {
            bottom_spaces = NIL;
        }
        if (use_message_page_messageP == UNPROVIDED) {
            use_message_page_messageP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = (NIL != use_message_page_messageP) ? ((SubLObject) (image_demo_internals.ir_value(operation_communication.the_cyclist(), $MESSAGE_PAGE_MESSAGE))) : image_demo_internals.ir_value(operation_communication.the_cyclist(), $MESSAGE);
                SubLObject color = image_demo_internals.ir_value(operation_communication.the_cyclist(), $MESSAGE_COLOR);
                if (message.isString()) {
                    if (top_spaces.isInteger()) {
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(top_spaces); i = add(i, ONE_INTEGER)) {
                                html_utilities.html_br();
                            }
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    {
                        SubLObject color_val = color;
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (NIL != color_val) {
                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color_val));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                format(html_macros.$html_stream$.getDynamicValue(thread), message);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    if (bottom_spaces.isInteger()) {
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(bottom_spaces); i = add(i, ONE_INTEGER)) {
                                html_utilities.html_br();
                            }
                        }
                    }
                    if (NIL != use_message_page_messageP) {
                        image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE_PAGE_MESSAGE, $REPLACE, NIL);
                    } else {
                        image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE, $REPLACE, NIL);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_top_source(SubLObject arg) {
        if (arg == UNPROVIDED) {
            arg = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = arg.first();
                SubLObject stored_source = image_demo_internals.ir_value(operation_communication.the_cyclist(), $TOP_SOURCE);
                SubLObject source = NIL;
                source = (string.isString()) ? ((SubLObject) (format(NIL, $str_alt187$_a__a, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), string))) : stored_source.isString() ? ((SubLObject) (format(NIL, $str_alt105$_a, stored_source))) : format(NIL, $str_alt188$_a_ir_typein, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $TOP_SOURCE, $REPLACE, source);
                return source;
            }
        }
    }

    public static final SubLObject ir_bottom_left_source(SubLObject arg) {
        if (arg == UNPROVIDED) {
            arg = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = arg.first();
                SubLObject stored_source = image_demo_internals.ir_value(operation_communication.the_cyclist(), $BOTTOM_LEFT_SOURCE);
                SubLObject source = NIL;
                source = (string.isString()) ? ((SubLObject) (format(NIL, $str_alt187$_a__a, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), string))) : stored_source.isString() ? ((SubLObject) (format(NIL, $str_alt105$_a, stored_source))) : format(NIL, $str_alt191$_a_ir_welcome, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $BOTTOM_LEFT_SOURCE, $REPLACE, source);
                return source;
            }
        }
    }

    public static final SubLObject ir_bottom_right_source(SubLObject arg) {
        if (arg == UNPROVIDED) {
            arg = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = arg.first();
                SubLObject stored_source = image_demo_internals.ir_value(operation_communication.the_cyclist(), $BOTTOM_RIGHT_SOURCE);
                SubLObject source = NIL;
                source = (string.isString()) ? ((SubLObject) (format(NIL, $str_alt187$_a__a, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), string))) : stored_source.isString() ? ((SubLObject) (format(NIL, $str_alt105$_a, stored_source))) : format(NIL, $str_alt194$_a_ir_preferences, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $BOTTOM_RIGHT_SOURCE, $REPLACE, source);
                return source;
            }
        }
    }

    public static final SubLObject ir_floating_source(SubLObject arg) {
        if (arg == UNPROVIDED) {
            arg = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = arg.first();
                SubLObject stored_source = image_demo_internals.ir_value(operation_communication.the_cyclist(), $FLOATING_SOURCE);
                SubLObject source = NIL;
                source = (string.isString()) ? ((SubLObject) (format(NIL, $str_alt187$_a__a, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), string))) : stored_source.isString() ? ((SubLObject) (format(NIL, $str_alt105$_a, stored_source))) : format(NIL, $str_alt197$_a_ir_justify__a, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), $str_alt105$_a);
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $FLOATING_SOURCE, $REPLACE, source);
                return source;
            }
        }
    }

    public static final SubLObject ir_main_page(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject top_source = ir_top_source(args);
                SubLObject bottom_left_source = ir_bottom_left_source(args);
                SubLObject bottom_right_source = ir_bottom_right_source(args);
                SubLObject row_spec = format(NIL, $str_alt199$_a__, $top_frame_quantum$.getDynamicValue(thread));
                SubLObject column_spec = format(NIL, $str_alt199$_a__, $left_column_quantum$.getDynamicValue(thread));
                {
                    SubLObject _prev_bind_0 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$html_generation_target$.bind(html_macros.$html_parent_target$.getGlobalValue(), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ($$$Cyc_Information_Retrieval);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        if (NIL != html_macros.html_inside_body_p()) {
                            Errors.error($str_alt201$Cannot_have_a_FRAMESET_tag_inside);
                        }
                        html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_frameset_cols$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($str_alt202$_);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != row_spec) {
                            html_utilities.html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(row_spec);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_frameset_frameborder$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup($$$no);
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_frame_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_frame_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt22$ir_top_frame);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_frame_src$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(top_source);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_frame_scrolling$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($$$yes);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_frame_marginheight$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(ZERO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_frame_marginwidth$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(ZERO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                if (NIL != html_macros.html_inside_body_p()) {
                                    Errors.error($str_alt201$Cannot_have_a_FRAMESET_tag_inside);
                                }
                                html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                                if (NIL != column_spec) {
                                    html_utilities.html_markup(html_macros.$html_frameset_cols$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(column_spec);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt202$_);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_frameset_frameborder$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($$$no);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_frame_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_frame_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt54$ir_bottom_left_frame);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_frame_src$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(bottom_left_source);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_frame_scrolling$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$yes);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_frame_marginheight$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_frame_marginwidth$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_frame_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_frame_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt166$ir_bottom_right_frame);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_frame_src$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(bottom_right_source);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_frame_scrolling$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$yes);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_frame_marginheight$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_frame_marginwidth$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_reset_frame_sources() {
        ir_top_source(UNPROVIDED);
        ir_bottom_left_source(UNPROVIDED);
        ir_bottom_right_source(UNPROVIDED);
        ir_floating_source(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject add_parse_id(SubLObject parse) {
        {
            SubLObject id = gentemp($$$P);
            return list(id, parse);
        }
    }

    public static final SubLObject ir_present_parse_cycl(SubLObject parse) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
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
                        SubLObject _prev_bind_0_95 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(ZERO_INTEGER);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            ir_form(parse, ZERO_INTEGER, T);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_95, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static final SubLObject ir_present_parse_english(SubLObject parse, SubLObject with_variablesP) {
        if (with_variablesP == UNPROVIDED) {
            with_variablesP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject strings = NIL;
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                        if (parse.first().equal($$and)) {
                            {
                                SubLObject cdolist_list_var = parse.rest();
                                SubLObject form = NIL;
                                for (form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , form = cdolist_list_var.first()) {
                                    strings = cons(pph_html.html_generate_anchor_text(form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), strings);
                                }
                            }
                            strings = nreverse(strings);
                        } else {
                            strings = cons(pph_html.html_generate_anchor_text(parse, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), strings);
                        }
                    } finally {
                        pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != strings) {
                    if ((NIL != with_variablesP) && (NIL != list_utilities.cons_tree_find($sym208$_CONTEXT, parse, UNPROVIDED, UNPROVIDED))) {
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_utilities.html_indent(TWO_INTEGER);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt209$_Find__acontext_a_such_that, image_demo_internals.ir_value(operation_communication.the_cyclist(), $NUMBER).eql(ONE_INTEGER) ? ((SubLObject) ($str_alt210$a_)) : $str_alt26$, image_demo_internals.ir_value(operation_communication.the_cyclist(), $NUMBER).eql(ONE_INTEGER) ? ((SubLObject) ($str_alt26$)) : $$$s);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject cdolist_list_var = strings;
                                SubLObject s = NIL;
                                for (s = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , s = cdolist_list_var.first()) {
                                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt105$_a, string_utilities.string_subst($$$the_context, $str_alt212$_CONTEXT, s, UNPROVIDED));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_present_parses(SubLObject sym_parse_pairs) {
        {
            SubLObject count = ONE_INTEGER;
            SubLObject len = length(sym_parse_pairs);
            SubLObject show_english = image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_ENGLISH);
            SubLObject show_cycl = image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL);
            SubLObject mode = image_demo_internals.ir_value(operation_communication.the_cyclist(), $MODE);
            SubLObject target = (mode == $QUERY) ? ((SubLObject) ($str_alt166$ir_bottom_right_frame)) : $str_alt213$ir_floating_page;
            if (len.numG(ONE_INTEGER) && (mode == $QUERY)) {
                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                cyc_navigator_internals.nav_link($IR_USE_PARSE, $list_alt215, target, format(NIL, $str_alt216$Try__a_interpretations, len.numE(TWO_INTEGER) ? ((SubLObject) ($$$both)) : format(NIL, $str_alt217$all__a, len)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                html_utilities.html_br();
            }
            {
                SubLObject cdolist_list_var = sym_parse_pairs;
                SubLObject p = NIL;
                for (p = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , p = cdolist_list_var.first()) {
                    {
                        SubLObject datum = p;
                        SubLObject current = datum;
                        SubLObject sym = NIL;
                        SubLObject parse = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt218);
                        sym = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt218);
                        parse = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cyc_navigator_internals.nav_link($IR_USE_PARSE, list(sym), target, format(NIL, $str_alt219$Interpretation__a_, count), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_br();
                            html_utilities.html_br();
                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                            if (NIL != show_english) {
                                ir_present_parse_english(parse, T);
                            }
                            if (NIL != show_cycl) {
                                ir_present_parse_cycl(parse);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt218);
                        }
                    }
                    count = add(count, ONE_INTEGER);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject ir_choose_parse(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color = image_demo_internals.ir_value(operation_communication.the_cyclist(), $STANDARD_BG_COLOR);
                SubLObject sym_parse_pairs = image_demo_internals.ir_value(operation_communication.the_cyclist(), $LAST_PARSES);
                {
                    SubLObject _prev_bind_0 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$html_generation_target$.bind(html_macros.$html_parent_target$.getGlobalValue(), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0_101 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != sym_parse_pairs) {
                                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $$$Select_Interpretation);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                            ir_present_parses(sym_parse_pairs);
                                        } else {
                                            ir_message(TWO_INTEGER, UNPROVIDED, UNPROVIDED);
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_101, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_use_parse(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject obj = args.first();
            SubLObject last_parses = image_demo_internals.ir_value(operation_communication.the_cyclist(), $LAST_PARSES);
            SubLObject sym = (obj.isString()) ? ((SubLObject) (read_from_string_ignoring_errors(obj, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
            SubLObject cycl = (sym == ALL) ? ((SubLObject) (cons($$or, Mapping.mapcar(symbol_function(SECOND), last_parses)))) : second(assoc(sym, last_parses, UNPROVIDED, UNPROVIDED));
            SubLObject mode = image_demo_internals.ir_value(operation_communication.the_cyclist(), $MODE);
            if (NIL == cycl) {
                image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE, $REPLACE, format(NIL, $str_alt226$There_is_no_CycL_expression_index, sym, operation_communication.the_cyclist()));
            }
            image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $LAST_INPUT_CYCL, $REPLACE, cycl);
            {
                SubLObject pcase_var = mode;
                if (pcase_var.eql($QUERY)) {
                    ir_pose_query(UNPROVIDED);
                } else
                    if (pcase_var.eql($CAPTION)) {
                        ir_enter_caption(UNPROVIDED);
                    }

            }
        }
        return NIL;
    }

    public static final SubLObject ir_enter_caption(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject success = NIL;
                SubLObject cycl = image_demo_internals.ir_value(operation_communication.the_cyclist(), $LAST_INPUT_CYCL);
                SubLObject mt = image_demo_internals.ir_value(operation_communication.the_cyclist(), $MT);
                SubLObject string = image_demo_internals.ir_value(operation_communication.the_cyclist(), $LAST_INPUT_STRING);
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        if ((NIL != cycl) && (NIL != mt)) {
                            success = prove.fi_hypothesize(cycl, mt, $$$IR, UNPROVIDED);
                        }
                        if (NIL == success) {
                            image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE, $REPLACE, format(NIL, $str_alt230$The_CycL_expression_resulting_fro, string, misc_kb_utilities.coerce_name(mt)));
                        }
                        ir_mt_content(UNPROVIDED);
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
                return success;
            }
        }
    }

    public static final SubLObject ir_pose_query(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject cycl = image_demo_internals.ir_value(operation_communication.the_cyclist(), $LAST_INPUT_CYCL);
            image_demo_internals.ir_ask_query(cycl);
            ir_query_results(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject ir_maybe_show_caption(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CAPTION)) {
                {
                    SubLObject fort = cb_utilities.cb_guess_fort(id, UNPROVIDED);
                    SubLObject caption = image_demo_internals.pit_caption(fort);
                    if (NIL != caption) {
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
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
                                {
                                    SubLObject cdolist_list_var = caption;
                                    SubLObject string = NIL;
                                    for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                                        {
                                            SubLObject ch = Strings.sublisp_char(string, ZERO_INTEGER);
                                            set_aref(string, ZERO_INTEGER, char_upcase(ch));
                                        }
                                        string = string_utilities.trim_sides(string, CHAR_period);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_103 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (length(caption).numE(ONE_INTEGER)) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt233$_a_, string);
                                                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } else {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt233$_a_, string);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_103, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    }
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_present_query_results(SubLObject table, SubLObject types) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = types;
                SubLObject type = NIL;
                for (type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type = cdolist_list_var.first()) {
                    {
                        SubLObject function = sixth(assoc(type, image_demo_internals.$ir_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                        if (NIL != fboundp(function)) {
                            {
                                SubLObject id = NIL;
                                SubLObject val = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(table);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            id = getEntryKey(cdohash_entry);
                                            val = getEntryValue(cdohash_entry);
                                            {
                                                SubLObject keyword = val.first();
                                                SubLObject target = (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $USE_FLOATING_PANE)) ? ((SubLObject) ($str_alt236$ir_floating_pane)) : $str_alt166$ir_bottom_right_frame;
                                                if (keyword == type) {
                                                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    funcall(function, id);
                                                    html_utilities.html_br();
                                                    cyc_navigator_internals.nav_link($IR_MT_CONTENT, list(id), target, $str_alt238$_View_Context_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_br();
                                                    cyc_navigator_internals.nav_link($IR_JUSTIFY, list(id), target, $str_alt240$_Show_Justification_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                    ir_maybe_show_caption(id);
                                                }
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_query_results(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color = image_demo_internals.ir_value(operation_communication.the_cyclist(), $STANDARD_BG_COLOR);
                SubLObject table = image_demo_internals.ir_value(operation_communication.the_cyclist(), $RESULTS_TABLE);
                SubLObject count = hash_table_count(table);
                SubLObject keys = image_demo_internals.ir_value(operation_communication.the_cyclist(), $OBJECT_KEYS);
                SubLObject types = (NIL != find($PIT, keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (remove($PIT, Mapping.mapcar(symbol_function(CAR), image_demo_internals.$ir_types$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : keys;
                {
                    SubLObject _prev_bind_0 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$html_generation_target$.bind(html_macros.$html_parent_target$.getGlobalValue(), thread);
                        if (!count.numG(ZERO_INTEGER)) {
                            image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE, $REPLACE, format(NIL, $str_alt243$Inference_has_stopped____a, ir_inference_failure_reason(image_demo_internals.ir_value(operation_communication.the_cyclist(), $FAILURE_REASON))));
                        }
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0_106 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_107 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $$$Query_Results);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        ir_message(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (count.numG(ZERO_INTEGER)) {
                                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                            ir_present_query_results(table, types);
                                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_107, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_106, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_present_image(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = cb_utilities.cb_guess_fort(id, UNPROVIDED);
                SubLObject name = misc_kb_utilities.coerce_name(fort);
                SubLObject source = format(NIL, $str_alt247$_a_a_gif, $ir_image_directory$.getDynamicValue(thread), name);
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(source);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != name) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(name);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align($$$middle));
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject ir_present_support(SubLObject tag, SubLObject support, SubLObject level, SubLObject already_seen) {
        if (already_seen == UNPROVIDED) {
            already_seen = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formula = arguments.support_formula(support);
                SubLObject mt = arguments.support_mt(support);
                SubLObject module = arguments.support_module(support);
                SubLObject assertionP = assertion_handles.assertion_p(support);
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_quantify_varsP$.bind(NIL, thread);
                        {
                            SubLObject english = pph_html.html_generate_anchor_text(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject seenP = find(support, already_seen, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject annotateP = image_demo_internals.ir_value(operation_communication.the_cyclist(), $ANNOTATE_JUSTIFICATION);
                            {
                                SubLObject indent = level;
                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_108 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_109 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_br();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_109, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_108, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                            {
                                SubLObject indent = level;
                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_110 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                            SubLObject _prev_bind_0_111 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), tag);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                                if (NIL != seenP) {
                                                    if (NIL != assertionP) {
                                                        cb_utilities.cb_link($ASSERTION, support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        if (NIL != assertions_high.asserted_assertionP(support)) {
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt250$_Repeated_assertion_);
                                                        } else {
                                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt250$_Repeated_assertion_);
                                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                        }
                                                    } else {
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt251$_Repeated_HL_support_);
                                                    }
                                                } else
                                                    if (NIL != assertionP) {
                                                        if (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_ENGLISH)) {
                                                            if (NIL == image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL)) {
                                                                cb_utilities.cb_link($ASSERTION, support, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != assertions_high.asserted_assertionP(support)) {
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt105$_a, english);
                                                            } else {
                                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt105$_a, english);
                                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                            }
                                                            if (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL)) {
                                                                html_utilities.html_br();
                                                                html_utilities.html_br();
                                                            }
                                                        }
                                                        if (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL)) {
                                                            ir_form(support, ZERO_INTEGER, T);
                                                        }
                                                    } else {
                                                        if (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_ENGLISH)) {
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt105$_a, english);
                                                            if (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL)) {
                                                                html_utilities.html_br();
                                                                html_utilities.html_br();
                                                            }
                                                        }
                                                        if (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL)) {
                                                            ir_form(support, ZERO_INTEGER, T);
                                                        }
                                                        already_seen = cons(support, already_seen);
                                                    }

                                                if (NIL != annotateP) {
                                                    {
                                                        SubLObject size_val = TWO_INTEGER;
                                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                        if (NIL != size_val) {
                                                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(size_val);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_112 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                if (NIL != mt) {
                                                                    html_utilities.html_br();
                                                                    html_utilities.html_br();
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt252$In_);
                                                                    ir_form(mt, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != module) {
                                                                    html_utilities.html_br();
                                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt253$_s, module);
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_112, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_111, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_110, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            }
                            if (NIL == seenP) {
                                if (NIL != assertionP) {
                                    {
                                        SubLObject v_arguments = assertions_high.assertion_arguments(support);
                                        SubLObject local = list_utilities.remove_if_not(symbol_function(ASSERTED_ARGUMENT_P), v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        SubLObject remote = set_difference(v_arguments, local, symbol_function(EQUAL), UNPROVIDED);
                                        SubLObject rl = length(remote);
                                        SubLObject i1 = ZERO_INTEGER;
                                        SubLObject i2 = ZERO_INTEGER;
                                        if (NIL != local) {
                                            v_arguments = local;
                                        }
                                        {
                                            SubLObject cdolist_list_var = v_arguments;
                                            SubLObject argument = NIL;
                                            for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                                                i1 = add(i1, ONE_INTEGER);
                                                i2 = ZERO_INTEGER;
                                                if (NIL != arguments.asserted_argument_p(argument)) {
                                                    if (NIL != annotateP) {
                                                        {
                                                            SubLObject indent = level;
                                                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_113 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                        SubLObject _prev_bind_0_114 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            {
                                                                                SubLObject size_val = TWO_INTEGER;
                                                                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                                if (NIL != size_val) {
                                                                                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(size_val);
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_115 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        cb_assertion_browser.cb_asserted_argument(support);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_115, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                            }
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_114, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_113, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                    }
                                                } else {
                                                    if ((NIL != annotateP) && rl.numG(ONE_INTEGER)) {
                                                        {
                                                            SubLObject indent = add(level, ONE_INTEGER);
                                                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_116 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                        SubLObject _prev_bind_0_117 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_br();
                                                                            {
                                                                                SubLObject size_val = TWO_INTEGER;
                                                                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                                if (NIL != size_val) {
                                                                                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                    html_utilities.html_markup(size_val);
                                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                }
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_118 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt255$Argument__a_, i1);
                                                                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_118, thread);
                                                                                    }
                                                                                }
                                                                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                            }
                                                                            html_utilities.html_br();
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_117, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_116, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                    }
                                                    {
                                                        SubLObject cdolist_list_var_119 = deductions_high.deduction_supports(argument);
                                                        SubLObject s2 = NIL;
                                                        for (s2 = cdolist_list_var_119.first(); NIL != cdolist_list_var_119; cdolist_list_var_119 = cdolist_list_var_119.rest() , s2 = cdolist_list_var_119.first()) {
                                                            i2 = add(i2, ONE_INTEGER);
                                                            {
                                                                SubLObject new_tag = format(NIL, $str_alt256$_a__a__a, new SubLObject[]{ tag, i1, i2 });
                                                                ir_present_support(new_tag, s2, add(level, ONE_INTEGER), cons(support, already_seen));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_present_justification_table(SubLObject supports) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject quantum = image_demo_internals.ir_value(operation_communication.the_cyclist(), $INDENT_QUANTUM);
                SubLObject level = ZERO_INTEGER;
                SubLObject index = ZERO_INTEGER;
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
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$html_indent_table_max$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$html_indent_table_max$.bind(TWENTY_INTEGER, thread);
                        {
                            SubLObject cdolist_list_var = supports;
                            SubLObject sup = NIL;
                            for (sup = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sup = cdolist_list_var.first()) {
                                index = add(index, ONE_INTEGER);
                                {
                                    SubLObject tag = format(NIL, $str_alt105$_a, index);
                                    ir_present_support(tag, sup, level, UNPROVIDED);
                                }
                            }
                            html_utilities.html_indent_table_internal(quantum);
                        }
                    } finally {
                        html_macros.$html_indent_table_max$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject ir_present_justification(SubLObject id, SubLObject cycl, SubLObject supports) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            image_demo_internals.ir_clear_utility_tables();
            {
                SubLObject fort = cb_utilities.cb_guess_fort(id, UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt252$In_);
                ir_form(fort, UNPROVIDED, UNPROVIDED);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt258$_);
                ir_present_parse_english(cycl, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $$$Supporting_Assertions);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                ir_present_justification_table(supports);
            }
            return NIL;
        }
    }

    public static final SubLObject ir_justify(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject color = image_demo_internals.ir_value(operation_communication.the_cyclist(), $STANDARD_BG_COLOR);
                SubLObject obj = args.first();
                SubLObject id = (obj.isString() && length(obj).numG(ZERO_INTEGER)) ? ((SubLObject) (read_from_string_ignoring_errors(obj, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                SubLObject table = image_demo_internals.ir_value(operation_communication.the_cyclist(), $RESULTS_TABLE);
                SubLObject form = second(gethash(id, table, UNPROVIDED));
                SubLObject cycl = form.first();
                SubLObject supports = second(form);
                {
                    SubLObject _prev_bind_0 = pph_vars.$html_generation_target$.currentBinding(thread);
                    try {
                        pph_vars.$html_generation_target$.bind(html_macros.$html_parent_target$.getGlobalValue(), thread);
                        if (!((NIL != cycl) || (NIL != supports))) {
                            image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE, $REPLACE, format(NIL, $str_alt260$No_justification_is_available_));
                        }
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0_120 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != color) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_121 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $$$Retrieval_Justification);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        ir_message(ONE_INTEGER, UNPROVIDED, UNPROVIDED);
                                        if ((NIL != cycl) || (NIL != supports)) {
                                            ir_present_justification(id, cycl, supports);
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_121, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_120, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        pph_vars.$html_generation_target$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_present_mt_assertions(SubLObject assertions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject local = NIL;
                SubLObject remote = NIL;
                {
                    SubLObject cdolist_list_var = assertions;
                    SubLObject ass = NIL;
                    for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                        if (NIL != assertions_high.asserted_assertionP(ass)) {
                            local = cons(ass, local);
                        } else {
                            remote = cons(ass, remote);
                        }
                    }
                }
                if (NIL != local) {
                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt263$Local_assertions_);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    html_utilities.html_br();
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject cdolist_list_var = local;
                                SubLObject ass = NIL;
                                for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_122 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_ENGLISH)) {
                                                if (NIL == image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL)) {
                                                    cb_utilities.cb_link($ASSERTION, ass, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                                pph_html.html_text_with_target(ass, PARAPHRASE_LINK_TO_CB_START, html_macros.$html_top_target$.getGlobalValue(), pph_vars.$pph_language_mt$.getDynamicValue(thread), assertions_high.assertion_mt(ass));
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                            }
                                            if (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL)) {
                                                ir_form(ass, ZERO_INTEGER, T);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_122, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                }
                if (NIL != remote) {
                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt265$Inferred_assertions_);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    html_utilities.html_br();
                    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            {
                                SubLObject cdolist_list_var = remote;
                                SubLObject ass = NIL;
                                for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_123 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_ENGLISH)) {
                                                if (NIL == image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL)) {
                                                    cb_utilities.cb_link($ASSERTION, ass, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                pph_html.html_text_with_target(ass, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                            }
                                            if (NIL != image_demo_internals.ir_value(operation_communication.the_cyclist(), $SHOW_CYCL)) {
                                                ir_form(ass, ZERO_INTEGER, T);
                                                html_utilities.html_br();
                                                html_utilities.html_br();
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_123, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                }
            }
            return NIL;
        }
    }

    public static final SubLObject ir_mt_content(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mode = image_demo_internals.ir_value(operation_communication.the_cyclist(), $MODE);
                SubLObject color = image_demo_internals.ir_value(operation_communication.the_cyclist(), $STANDARD_BG_COLOR);
                SubLObject obj = args.first();
                SubLObject id = (obj.isString() && length(obj).numG(ZERO_INTEGER)) ? ((SubLObject) (read_from_string_ignoring_errors(obj, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
                SubLObject mt = (mode == $QUERY) ? ((SubLObject) (id.isInteger() ? ((SubLObject) (cb_utilities.cb_guess_fort(id, UNPROVIDED))) : NIL)) : function_terms.naut_to_nart(image_demo_internals.ir_value(operation_communication.the_cyclist(), $MT));
                SubLObject assertions = (NIL != forts.valid_fortP(mt)) ? ((SubLObject) (kb_mapping.gather_mt_index(mt))) : NIL;
                if ((mode == $QUERY) && (NIL == assertions)) {
                    image_demo_internals.change_ir_value(operation_communication.the_cyclist(), $MESSAGE, $REPLACE, format(NIL, $str_alt267$There_are_no_assertions_in__a_, misc_kb_utilities.coerce_name(mt)));
                }
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != color) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(color));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_124 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                if (mode == $CAPTION) {
                                    ir_message(ONE_INTEGER, UNPROVIDED, UNPROVIDED);
                                }
                                if (NIL != assertions) {
                                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt268$Assertions_in_);
                                    ir_form(mt, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                    ir_present_mt_assertions(assertions);
                                } else {
                                    if (mode == $QUERY) {
                                        ir_message(ONE_INTEGER, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_124, thread);
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

    public static final SubLObject declare_html_image_demo_file() {
        declareFunction("ir_form", "IR-FORM", 1, 2, false);
        declareFunction("ir_inference_failure_reason", "IR-INFERENCE-FAILURE-REASON", 1, 0, false);
        declareFunction("ir_reset", "IR-RESET", 0, 0, false);
        declareFunction("ir_start", "IR-START", 0, 1, false);
        declareFunction("ir_switch_mode", "IR-SWITCH-MODE", 0, 1, false);
        declareFunction("ir_typein_table", "IR-TYPEIN-TABLE", 0, 1, false);
        declareFunction("ir_link_table", "IR-LINK-TABLE", 0, 1, false);
        declareFunction("ir_typein", "IR-TYPEIN", 0, 1, false);
        declareFunction("ir_handle_query_typein", "IR-HANDLE-QUERY-TYPEIN", 0, 1, false);
        declareFunction("ir_make_valid_mt_name", "IR-MAKE-VALID-MT-NAME", 1, 0, false);
        declareFunction("ir_create_mt", "IR-CREATE-MT", 2, 0, false);
        declareFunction("ir_handle_create_typein", "IR-HANDLE-CREATE-TYPEIN", 0, 1, false);
        declareFunction("ir_handle_caption_typein", "IR-HANDLE-CAPTION-TYPEIN", 0, 1, false);
        declareFunction("ir_handle_typein", "IR-HANDLE-TYPEIN", 0, 1, false);
        declareFunction("ir_inference_parameters", "IR-INFERENCE-PARAMETERS", 0, 1, false);
        declareFunction("ir_interface_parameters", "IR-INTERFACE-PARAMETERS", 0, 1, false);
        declareFunction("ir_nl_parameters", "IR-NL-PARAMETERS", 0, 1, false);
        declareFunction("ir_operation_parameters", "IR-OPERATION-PARAMETERS", 0, 1, false);
        declareFunction("ir_preferences", "IR-PREFERENCES", 0, 1, false);
        declareFunction("ir_handle_preferences", "IR-HANDLE-PREFERENCES", 0, 1, false);
        declareFunction("ir_welcome", "IR-WELCOME", 0, 1, false);
        declareFunction("ir_message_page", "IR-MESSAGE-PAGE", 0, 1, false);
        declareFunction("ir_message", "IR-MESSAGE", 0, 3, false);
        declareFunction("ir_top_source", "IR-TOP-SOURCE", 0, 1, false);
        declareFunction("ir_bottom_left_source", "IR-BOTTOM-LEFT-SOURCE", 0, 1, false);
        declareFunction("ir_bottom_right_source", "IR-BOTTOM-RIGHT-SOURCE", 0, 1, false);
        declareFunction("ir_floating_source", "IR-FLOATING-SOURCE", 0, 1, false);
        declareFunction("ir_main_page", "IR-MAIN-PAGE", 0, 1, false);
        declareFunction("ir_reset_frame_sources", "IR-RESET-FRAME-SOURCES", 0, 0, false);
        declareFunction("add_parse_id", "ADD-PARSE-ID", 1, 0, false);
        declareFunction("ir_present_parse_cycl", "IR-PRESENT-PARSE-CYCL", 1, 0, false);
        declareFunction("ir_present_parse_english", "IR-PRESENT-PARSE-ENGLISH", 1, 1, false);
        declareFunction("ir_present_parses", "IR-PRESENT-PARSES", 1, 0, false);
        declareFunction("ir_choose_parse", "IR-CHOOSE-PARSE", 0, 1, false);
        declareFunction("ir_use_parse", "IR-USE-PARSE", 0, 1, false);
        declareFunction("ir_enter_caption", "IR-ENTER-CAPTION", 0, 1, false);
        declareFunction("ir_pose_query", "IR-POSE-QUERY", 0, 1, false);
        declareFunction("ir_maybe_show_caption", "IR-MAYBE-SHOW-CAPTION", 1, 0, false);
        declareFunction("ir_present_query_results", "IR-PRESENT-QUERY-RESULTS", 2, 0, false);
        declareFunction("ir_query_results", "IR-QUERY-RESULTS", 0, 1, false);
        declareFunction("ir_present_image", "IR-PRESENT-IMAGE", 1, 0, false);
        declareFunction("ir_present_support", "IR-PRESENT-SUPPORT", 3, 1, false);
        declareFunction("ir_present_justification_table", "IR-PRESENT-JUSTIFICATION-TABLE", 1, 0, false);
        declareFunction("ir_present_justification", "IR-PRESENT-JUSTIFICATION", 3, 0, false);
        declareFunction("ir_justify", "IR-JUSTIFY", 0, 1, false);
        declareFunction("ir_present_mt_assertions", "IR-PRESENT-MT-ASSERTIONS", 1, 0, false);
        declareFunction("ir_mt_content", "IR-MT-CONTENT", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_html_image_demo_file() {
        defparameter("*TOP-FRAME-QUANTUM*", $str_alt0$25_);
        defparameter("*LEFT-COLUMN-QUANTUM*", $str_alt1$50_);
        defparameter("*IR-IMAGE-DIRECTORY*", $str_alt2$_pict_);
        defparameter("*INFERENCE-FAILURE-REASONS*", $list_alt3);
        return NIL;
    }

    public static final SubLObject setup_html_image_demo_file() {
                html_macros.note_html_handler_function(IR_START);
        html_macros.note_html_handler_function(IR_SWITCH_MODE);
        html_macros.note_html_handler_function(IR_TYPEIN_TABLE);
        sethash($IR_PREFERENCES, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str_alt48$cyc_preferences_gif, $str_alt49$_Preferences_));
        html_macros.note_html_handler_function(IR_LINK_TABLE);
        html_macros.note_html_handler_function(IR_TYPEIN);
        html_macros.note_html_handler_function(IR_HANDLE_QUERY_TYPEIN);
        html_macros.note_html_handler_function(IR_HANDLE_CREATE_TYPEIN);
        html_macros.note_html_handler_function(IR_HANDLE_CAPTION_TYPEIN);
        html_macros.note_html_handler_function(IR_HANDLE_TYPEIN);
        html_macros.note_html_handler_function(IR_INFERENCE_PARAMETERS);
        html_macros.note_html_handler_function(IR_INTERFACE_PARAMETERS);
        html_macros.note_html_handler_function(IR_NL_PARAMETERS);
        html_macros.note_html_handler_function(IR_OPERATION_PARAMETERS);
        html_macros.note_html_handler_function(IR_PREFERENCES);
        html_macros.note_html_handler_function(IR_HANDLE_PREFERENCES);
        html_macros.note_html_handler_function(IR_WELCOME);
        html_macros.note_html_handler_function(IR_MESSAGE_PAGE);
        html_macros.note_html_handler_function(IR_TOP_SOURCE);
        html_macros.note_html_handler_function(IR_BOTTOM_LEFT_SOURCE);
        html_macros.note_html_handler_function(IR_BOTTOM_RIGHT_SOURCE);
        html_macros.note_html_handler_function(IR_FLOATING_SOURCE);
        html_macros.note_html_handler_function(IR_MAIN_PAGE);
        html_macros.note_html_handler_function(IR_PRESENT_PARSE_CYCL);
        html_macros.note_html_handler_function(IR_PRESENT_PARSES);
        html_macros.note_html_handler_function(IR_CHOOSE_PARSE);
        html_macros.note_html_handler_function(IR_USE_PARSE);
        html_macros.note_html_handler_function(IR_ENTER_CAPTION);
        html_macros.note_html_handler_function(IR_POSE_QUERY);
        html_macros.note_html_handler_function(IR_MAYBE_SHOW_CAPTION);
        html_macros.note_html_handler_function(IR_QUERY_RESULTS);
        html_macros.note_html_handler_function(IR_PRESENT_IMAGE);
        html_macros.note_html_handler_function(IR_PRESENT_JUSTIFICATION_TABLE);
        html_macros.note_html_handler_function(IR_JUSTIFY);
        html_macros.note_html_handler_function(IR_PRESENT_MT_ASSERTIONS);
        html_macros.note_html_handler_function(IR_MT_CONTENT);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$25_ = makeString("25%");

    static private final SubLString $str_alt1$50_ = makeString("50%");

    static private final SubLString $str_alt2$_pict_ = makeString("/pict/");

    static private final SubLList $list_alt3 = list(cons(makeKeyword("EXHAUST"), makeString("The search space was exhausted.")), cons($TIME, makeString("The allotted time was exceeded.")), cons(makeKeyword("NUMBER"), makeString("The required number of answers was found.")), cons(makeKeyword("DEPTH"), makeString("The allotted search depth was exceeded.")));



    static private final SubLString $str_alt5$The_reason_is_unknown_ = makeString("The reason is unknown.");

    static private final SubLList $list_alt6 = list(makeString("tests"));

    static private final SubLString $str_alt7$ir_parse_query_tests = makeString("ir-parse-query-tests");

    static private final SubLString $$$lisp = makeString("lisp");

    private static final SubLSymbol IR_START = makeSymbol("IR-START");





    private static final SubLSymbol $FIND_CREATE = makeKeyword("FIND-CREATE");



    private static final SubLSymbol IR_SWITCH_MODE = makeSymbol("IR-SWITCH-MODE");

    static private final SubLString $str_alt15$Find____ = makeString("Find ...");

    static private final SubLString $str_alt16$Object_to_caption_ = makeString("Object to caption:");

    static private final SubLString $$$Caption_for = makeString("Caption for");





    private static final SubLSymbol $OBJECT_KEYS = makeKeyword("OBJECT-KEYS");

    private static final SubLSymbol $IR_SWITCH_MODE = makeKeyword("IR-SWITCH-MODE");

    static private final SubLString $str_alt22$ir_top_frame = makeString("ir-top-frame");

    static private final SubLString $str_alt23$__ = makeString("  ");

    static private final SubLString $str_alt24$_ = makeString(":");

    static private final SubLString $str_alt25$input_string = makeString("input-string");

    static private final SubLString $str_alt26$ = makeString("");

    public static final SubLInteger $int$45 = makeInteger(45);

    static private final SubLString $$$Clear = makeString("Clear");

    static private final SubLList $list_alt29 = list(makeKeyword("QUERY"), makeKeyword("CAPTION"));

    static private final SubLString $$$Parse = makeString("Parse");

    static private final SubLString $$$Go = makeString("Go");

    static private final SubLString $str_alt32$___ = makeString("   ");

    static private final SubLString $str_alt33$Items_to_include_ = makeString("Items to include:");

    static private final SubLString $str_alt34$Object_type_ = makeString("Object type:");

    static private final SubLString $$$type = makeString("type");

    static private final SubLString $str_alt36$_image = makeString(":image");

    static private final SubLList $list_alt37 = list(makeKeyword("IMAGE"), makeKeyword("PIT"));

    static private final SubLString $str_alt38$_Digitized_image_a = makeString(" Digitized image~a");

    static private final SubLString $$$s = makeString("s");

    static private final SubLString $str_alt40$_text = makeString(":text");

    static private final SubLList $list_alt41 = list($TEXT, makeKeyword("PIT"));

    static private final SubLString $str_alt42$_Text_document_a = makeString(" Text document~a");

    static private final SubLString $str_alt43$_web_page = makeString(":web-page");

    static private final SubLList $list_alt44 = list(makeKeyword("WEB-PAGE"), makeKeyword("PIT"));

    static private final SubLString $str_alt45$_Web_page_a = makeString(" Web page~a");

    private static final SubLSymbol IR_TYPEIN_TABLE = makeSymbol("IR-TYPEIN-TABLE");

    private static final SubLSymbol $IR_PREFERENCES = makeKeyword("IR-PREFERENCES");

    static private final SubLString $str_alt48$cyc_preferences_gif = makeString("cyc-preferences.gif");

    static private final SubLString $str_alt49$_Preferences_ = makeString("[Preferences]");

    private static final SubLSymbol $TINY_CYCORP_SYMBOL_TO_NAVIGATOR = makeKeyword("TINY-CYCORP-SYMBOL-TO-NAVIGATOR");

    private static final SubLSymbol $IR_MAIN = makeKeyword("IR-MAIN");

    private static final SubLSymbol IR_LINK_TABLE = makeSymbol("IR-LINK-TABLE");

    private static final SubLSymbol $STANDARD_BG_COLOR = makeKeyword("STANDARD-BG-COLOR");

    static private final SubLString $str_alt54$ir_bottom_left_frame = makeString("ir-bottom-left-frame");

    static private final SubLList $list_alt55 = list(makeKeyword("FIND-CREATE"));

    static private final SubLString $$$post = makeString("post");

    static private final SubLString $str_alt57$ir_handle_typein = makeString("ir-handle-typein");

    static private final SubLString $$$T = makeString("T");

    private static final SubLSymbol IR_TYPEIN = makeSymbol("IR-TYPEIN");



    static private final SubLList $list_alt61 = list(makeKeyword("PIT"));

    private static final SubLSymbol INSERT_CONTENT_LITERALS = makeSymbol("INSERT-CONTENT-LITERALS");

    private static final SubLSymbol ADD_PARSE_ID = makeSymbol("ADD-PARSE-ID");

    private static final SubLSymbol $LAST_INPUT_STRING = makeKeyword("LAST-INPUT-STRING");

    private static final SubLSymbol $LAST_PARSES = makeKeyword("LAST-PARSES");



    static private final SubLString $str_alt67$No_parses_were_generated_for_the_ = makeString("No parses were generated for the input string ~s");

    private static final SubLSymbol IR_HANDLE_QUERY_TYPEIN = makeSymbol("IR-HANDLE-QUERY-TYPEIN");

    static private final SubLString $str_alt69$_a__a = makeString("~a-~a");

    static private final SubLString $str_alt70$IR_ = makeString("IR-");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));





    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol $MESSAGE_PAGE_MESSAGE = makeKeyword("MESSAGE-PAGE-MESSAGE");

    static private final SubLString $str_alt76$Please_enter_a_name_for_the_objec = makeString("Please enter a name for the object to be captioned.");

    static private final SubLList $list_alt77 = list(makeString("ir-message-page"));

    static private final SubLString $str_alt78$_a_is_an_instance_of__a__and_not_ = makeString("~a is an instance of ~a, and not an instance of ~a.  It cannot be captioned.  Please try a different name.");

    static private final SubLString $str_alt79$_a_could_not_be_coerced_into_a_le = makeString("~a could not be coerced into a legal Cyc constant name, or the constant could not be created.  Please try a different name.");

    private static final SubLSymbol IR_HANDLE_CREATE_TYPEIN = makeSymbol("IR-HANDLE-CREATE-TYPEIN");

    private static final SubLSymbol IR_HANDLE_CAPTION_TYPEIN = makeSymbol("IR-HANDLE-CAPTION-TYPEIN");

    private static final SubLSymbol IR_HANDLE_TYPEIN = makeSymbol("IR-HANDLE-TYPEIN");









    static private final SubLString $str_alt87$Inference_parameters_ = makeString("Inference parameters:");

    static private final SubLString $str_alt88$_ = makeString(" ");

    static private final SubLString $$$right = makeString("right");

    static private final SubLString $str_alt90$Backchain__ = makeString("Backchain: ");

    static private final SubLString $$$backchain = makeString("backchain");

    static private final SubLString $$$NIL = makeString("NIL");

    static private final SubLString $str_alt93$Number__ = makeString("Number: ");

    static private final SubLString $$$number = makeString("number");

    static private final SubLString $str_alt95$Time__ = makeString("Time: ");

    static private final SubLString $$$time = makeString("time");

    static private final SubLString $str_alt97$Depth__ = makeString("Depth: ");

    static private final SubLString $$$depth = makeString("depth");

    static private final SubLString $str_alt99$clear_psc = makeString("clear-psc");

    static private final SubLString $str_alt100$_Clear_context_ = makeString(" Clear context ");

    static private final SubLString $$$context = makeString("context");

    private static final SubLSymbol SEVENTH = makeSymbol("SEVENTH");

    private static final SubLSymbol COERCE_NAME = makeSymbol("COERCE-NAME");

    private static final SubLSymbol $PSC = makeKeyword("PSC");

    static private final SubLString $str_alt105$_a = makeString("~a");



    private static final SubLSymbol IR_INFERENCE_PARAMETERS = makeSymbol("IR-INFERENCE-PARAMETERS");

    private static final SubLSymbol $INDENT_QUANTUM = makeKeyword("INDENT-QUANTUM");

    static private final SubLString $str_alt109$Interface_parameters_ = makeString("Interface parameters:");

    static private final SubLString $str_alt110$Background_color__ = makeString("Background color: ");

    static private final SubLString $str_alt111$bg_color = makeString("bg-color");

    static private final SubLString $str_alt112$Message_color__ = makeString("Message color: ");

    static private final SubLString $str_alt113$msg_color = makeString("msg-color");

    private static final SubLSymbol $MESSAGE_COLOR = makeKeyword("MESSAGE-COLOR");

    static private final SubLString $$$middle = makeString("middle");

    static private final SubLString $$$language = makeString("language");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol $SHOW_CYCL = makeKeyword("SHOW-CYCL");



    static private final SubLString $str_alt120$_Show_assertions_in_CycL = makeString(" Show assertions in CycL");

    static private final SubLString $$$english = makeString("english");

    static private final SubLString $str_alt122$_Show_assertions_in_English = makeString(" Show assertions in English");

    static private final SubLString $$$both = makeString("both");

    static private final SubLString $str_alt124$_Show_English_and_CycL = makeString(" Show English and CycL");

    static private final SubLString $$$inline = makeString("inline");

    static private final SubLString $$$yes = makeString("yes");

    private static final SubLSymbol $INLINE_IMAGES = makeKeyword("INLINE-IMAGES");

    static private final SubLString $str_alt128$_Inline_images = makeString(" Inline images");

    static private final SubLString $$$captions = makeString("captions");

    private static final SubLSymbol $SHOW_CAPTION = makeKeyword("SHOW-CAPTION");

    static private final SubLString $str_alt131$_Show_caption_strings = makeString(" Show caption strings");

    static private final SubLString $$$annotate = makeString("annotate");

    private static final SubLSymbol $ANNOTATE_JUSTIFICATION = makeKeyword("ANNOTATE-JUSTIFICATION");

    static private final SubLString $str_alt134$_Annotate_justifications = makeString(" Annotate justifications");

    static private final SubLString $$$floating = makeString("floating");

    private static final SubLSymbol $USE_FLOATING_PAGE = makeKeyword("USE-FLOATING-PAGE");

    static private final SubLString $str_alt137$_Use_extra__floating__page = makeString(" Use extra (floating) page");

    static private final SubLString $str_alt138$Table_indent_quantum_ = makeString("Table indent quantum:");

    static private final SubLString $$$quantum = makeString("quantum");

    static private final SubLList $list_alt140 = list(new SubLObject[]{ ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER });

    private static final SubLSymbol IR_INTERFACE_PARAMETERS = makeSymbol("IR-INTERFACE-PARAMETERS");

    private static final SubLSymbol $PARSER_TIME_LIMIT = makeKeyword("PARSER-TIME-LIMIT");

    private static final SubLSymbol $SEMANTICS_TIME_LIMIT = makeKeyword("SEMANTICS-TIME-LIMIT");

    static private final SubLString $str_alt144$NL_parameters_ = makeString("NL parameters:");

    static private final SubLString $str_alt145$Parser_time_limit__ = makeString("Parser time limit: ");

    static private final SubLString $$$parser = makeString("parser");

    static private final SubLString $str_alt147$Semantics_time_limit__ = makeString("Semantics time limit: ");

    static private final SubLString $$$semantics = makeString("semantics");

    static private final SubLString $$$partial = makeString("partial");

    private static final SubLSymbol $PARTIAL_SEMANTICS = makeKeyword("PARTIAL-SEMANTICS");

    static private final SubLString $str_alt151$_Use_partial_semantics = makeString(" Use partial semantics");

    static private final SubLString $str_alt152$group_plurals = makeString("group-plurals");

    private static final SubLSymbol $GROUP_PLURALS = makeKeyword("GROUP-PLURALS");

    static private final SubLString $str_alt154$_Pluralize_groups = makeString(" Pluralize groups");

    static private final SubLString $str_alt155$clear_caches = makeString("clear-caches");

    static private final SubLString $str_alt156$_Clear_NL_caches_now = makeString(" Clear NL caches now");

    private static final SubLSymbol IR_NL_PARAMETERS = makeSymbol("IR-NL-PARAMETERS");



    static private final SubLString $str_alt159$Cyc_operation_parameters_ = makeString("Cyc operation parameters:");

    static private final SubLString $str_alt160$Communication_mode__ = makeString("Communication mode: ");

    static private final SubLString $str_alt161$comm_mode = makeString("comm-mode");

    static private final SubLString $str_alt162$use_local_queue = makeString("use-local-queue");

    static private final SubLString $str_alt163$_Use_local_queue = makeString(" Use local queue");

    private static final SubLSymbol IR_OPERATION_PARAMETERS = makeSymbol("IR-OPERATION-PARAMETERS");

    static private final SubLString $$$User_Preferences = makeString("User Preferences");

    static private final SubLString $str_alt166$ir_bottom_right_frame = makeString("ir-bottom-right-frame");

    static private final SubLString $str_alt167$ir_handle_preferences = makeString("ir-handle-preferences");

    static private final SubLString $$$Update = makeString("Update");

    private static final SubLSymbol IR_PREFERENCES = makeSymbol("IR-PREFERENCES");

    static private final SubLString $$$semanics = makeString("semanics");





    static private final SubLList $list_alt173 = list(makeString("english"), makeString("cycl"), makeString("both"));

    static private final SubLList $list_alt174 = list(makeString("transmit and receive"), makeString("receive only"), makeString("deaf"), makeString("dead"), makeString("isolated"));



    public static final SubLObject $$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));

    static private final SubLString $str_alt177$Preferences_for__a_have_been_upda = makeString("Preferences for ~a have been updated.");

    private static final SubLSymbol IR_HANDLE_PREFERENCES = makeSymbol("IR-HANDLE-PREFERENCES");

    private static final SubLSymbol $CYCORP_LOGO_BIG = makeKeyword("CYCORP-LOGO-BIG");



    static private final SubLString $str_alt181$Cycorp__Inc_ = makeString("Cycorp, Inc.");

    static private final SubLString $str_alt182$www_cyc_com = makeString("www.cyc.com");

    private static final SubLSymbol $STARTUP_MESSAGE = makeKeyword("STARTUP-MESSAGE");

    private static final SubLSymbol IR_WELCOME = makeSymbol("IR-WELCOME");

    private static final SubLSymbol IR_MESSAGE_PAGE = makeSymbol("IR-MESSAGE-PAGE");

    private static final SubLSymbol $TOP_SOURCE = makeKeyword("TOP-SOURCE");

    static private final SubLString $str_alt187$_a__a = makeString("~a?~a");

    static private final SubLString $str_alt188$_a_ir_typein = makeString("~a?ir-typein");

    private static final SubLSymbol IR_TOP_SOURCE = makeSymbol("IR-TOP-SOURCE");

    private static final SubLSymbol $BOTTOM_LEFT_SOURCE = makeKeyword("BOTTOM-LEFT-SOURCE");

    static private final SubLString $str_alt191$_a_ir_welcome = makeString("~a?ir-welcome");

    private static final SubLSymbol IR_BOTTOM_LEFT_SOURCE = makeSymbol("IR-BOTTOM-LEFT-SOURCE");

    private static final SubLSymbol $BOTTOM_RIGHT_SOURCE = makeKeyword("BOTTOM-RIGHT-SOURCE");

    static private final SubLString $str_alt194$_a_ir_preferences = makeString("~a?ir-preferences");

    private static final SubLSymbol IR_BOTTOM_RIGHT_SOURCE = makeSymbol("IR-BOTTOM-RIGHT-SOURCE");

    private static final SubLSymbol $FLOATING_SOURCE = makeKeyword("FLOATING-SOURCE");

    static private final SubLString $str_alt197$_a_ir_justify__a = makeString("~a?ir-justify|~a");

    private static final SubLSymbol IR_FLOATING_SOURCE = makeSymbol("IR-FLOATING-SOURCE");

    static private final SubLString $str_alt199$_a__ = makeString("~a,*");

    static private final SubLString $$$Cyc_Information_Retrieval = makeString("Cyc Information Retrieval");

    static private final SubLString $str_alt201$Cannot_have_a_FRAMESET_tag_inside = makeString("Cannot have a FRAMESET tag inside a BODY tag.");

    static private final SubLString $str_alt202$_ = makeString("*");

    static private final SubLString $$$no = makeString("no");

    private static final SubLSymbol IR_MAIN_PAGE = makeSymbol("IR-MAIN-PAGE");

    static private final SubLString $$$P = makeString("P");

    private static final SubLSymbol IR_PRESENT_PARSE_CYCL = makeSymbol("IR-PRESENT-PARSE-CYCL");

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    static private final SubLSymbol $sym208$_CONTEXT = makeSymbol("?CONTEXT");

    static private final SubLString $str_alt209$_Find__acontext_a_such_that = makeString(" Find ~acontext~a such that");

    static private final SubLString $str_alt210$a_ = makeString("a ");

    static private final SubLString $$$the_context = makeString("the context");

    static private final SubLString $str_alt212$_CONTEXT = makeString("?CONTEXT");

    static private final SubLString $str_alt213$ir_floating_page = makeString("ir-floating-page");

    private static final SubLSymbol $IR_USE_PARSE = makeKeyword("IR-USE-PARSE");

    static private final SubLList $list_alt215 = list(makeSymbol("ALL"));

    static private final SubLString $str_alt216$Try__a_interpretations = makeString("Try ~a interpretations");

    static private final SubLString $str_alt217$all__a = makeString("all ~a");

    static private final SubLList $list_alt218 = list(makeSymbol("SYM"), makeSymbol("PARSE"));

    static private final SubLString $str_alt219$Interpretation__a_ = makeString("Interpretation ~a:");

    private static final SubLSymbol IR_PRESENT_PARSES = makeSymbol("IR-PRESENT-PARSES");

    static private final SubLString $$$Select_Interpretation = makeString("Select Interpretation");

    private static final SubLSymbol IR_CHOOSE_PARSE = makeSymbol("IR-CHOOSE-PARSE");



    public static final SubLObject $$or = constant_handles.reader_make_constant_shell(makeString("or"));



    static private final SubLString $str_alt226$There_is_no_CycL_expression_index = makeString("There is no CycL expression indexed by ~s.  Data in the state vector for ~a is corrupted, or state has been cleared.");

    private static final SubLSymbol $LAST_INPUT_CYCL = makeKeyword("LAST-INPUT-CYCL");

    private static final SubLSymbol IR_USE_PARSE = makeSymbol("IR-USE-PARSE");

    static private final SubLString $$$IR = makeString("IR");

    static private final SubLString $str_alt230$The_CycL_expression_resulting_fro = makeString("The CycL expression resulting from the input string ~s could not be entered.  The necessary contexts (mts) may not be accessible from ~a.");

    private static final SubLSymbol IR_ENTER_CAPTION = makeSymbol("IR-ENTER-CAPTION");

    private static final SubLSymbol IR_POSE_QUERY = makeSymbol("IR-POSE-QUERY");

    static private final SubLString $str_alt233$_a_ = makeString("~a.");

    private static final SubLSymbol IR_MAYBE_SHOW_CAPTION = makeSymbol("IR-MAYBE-SHOW-CAPTION");

    private static final SubLSymbol $USE_FLOATING_PANE = makeKeyword("USE-FLOATING-PANE");

    static private final SubLString $str_alt236$ir_floating_pane = makeString("ir-floating-pane");

    private static final SubLSymbol $IR_MT_CONTENT = makeKeyword("IR-MT-CONTENT");

    static private final SubLString $str_alt238$_View_Context_ = makeString("[View Context]");

    private static final SubLSymbol $IR_JUSTIFY = makeKeyword("IR-JUSTIFY");

    static private final SubLString $str_alt240$_Show_Justification_ = makeString("[Show Justification]");

    private static final SubLSymbol $RESULTS_TABLE = makeKeyword("RESULTS-TABLE");

    private static final SubLSymbol $PIT = makeKeyword("PIT");

    static private final SubLString $str_alt243$Inference_has_stopped____a = makeString("Inference has stopped.  ~a");



    static private final SubLString $$$Query_Results = makeString("Query Results");

    private static final SubLSymbol IR_QUERY_RESULTS = makeSymbol("IR-QUERY-RESULTS");

    static private final SubLString $str_alt247$_a_a_gif = makeString("~a~a.gif");

    private static final SubLSymbol IR_PRESENT_IMAGE = makeSymbol("IR-PRESENT-IMAGE");



    static private final SubLString $str_alt250$_Repeated_assertion_ = makeString("[Repeated assertion]");

    static private final SubLString $str_alt251$_Repeated_HL_support_ = makeString("[Repeated HL support]");

    static private final SubLString $str_alt252$In_ = makeString("In ");

    static private final SubLString $str_alt253$_s = makeString("~s");



    static private final SubLString $str_alt255$Argument__a_ = makeString("Argument ~a:");

    static private final SubLString $str_alt256$_a__a__a = makeString("~a.~a.~a");

    private static final SubLSymbol IR_PRESENT_JUSTIFICATION_TABLE = makeSymbol("IR-PRESENT-JUSTIFICATION-TABLE");

    static private final SubLString $str_alt258$_ = makeString(",");

    static private final SubLString $$$Supporting_Assertions = makeString("Supporting Assertions");

    static private final SubLString $str_alt260$No_justification_is_available_ = makeString("No justification is available.");

    static private final SubLString $$$Retrieval_Justification = makeString("Retrieval Justification");

    private static final SubLSymbol IR_JUSTIFY = makeSymbol("IR-JUSTIFY");

    static private final SubLString $str_alt263$Local_assertions_ = makeString("Local assertions:");

    private static final SubLSymbol PARAPHRASE_LINK_TO_CB_START = makeSymbol("PARAPHRASE-LINK-TO-CB-START");

    static private final SubLString $str_alt265$Inferred_assertions_ = makeString("Inferred assertions:");

    private static final SubLSymbol IR_PRESENT_MT_ASSERTIONS = makeSymbol("IR-PRESENT-MT-ASSERTIONS");

    static private final SubLString $str_alt267$There_are_no_assertions_in__a_ = makeString("There are no assertions in ~a.");

    static private final SubLString $str_alt268$Assertions_in_ = makeString("Assertions in ");

    private static final SubLSymbol IR_MT_CONTENT = makeSymbol("IR-MT-CONTENT");

    // // Initializers
    public void declareFunctions() {
        declare_html_image_demo_file();
    }

    public void initializeVariables() {
        init_html_image_demo_file();
    }

    public void runTopLevelForms() {
        setup_html_image_demo_file();
    }
}

