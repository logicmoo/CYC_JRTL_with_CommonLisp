/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_S;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      WALES
 *  source file: /cyc/top/cycl/wales.lisp
 *  created:     2019/07/03 17:38:16
 */
public final class wales extends SubLTranslatedFile implements V02 {
    // // Constructor
    private wales() {
    }

    public static final SubLFile me = new wales();

    public static final String myName = "com.cyc.cycjava.cycl.wales";

    // // Definitions
    // defparameter
    public static final SubLSymbol $c10_wales_string$ = makeSymbol("*C10-WALES-STRING*");

    // defparameter
    public static final SubLSymbol $c10_wales_word$ = makeSymbol("*C10-WALES-WORD*");

    // defparameter
    public static final SubLSymbol $c10_wales_pos$ = makeSymbol("*C10-WALES-POS*");

    // defparameter
    public static final SubLSymbol $regular_wales_stringP$ = makeSymbol("*REGULAR-WALES-STRING?*");





    // defparameter
    public static final SubLSymbol $c10_wales_mt$ = makeSymbol("*C10-WALES-MT*");

    // defparameter
    public static final SubLSymbol $c10_wales_gen_col$ = makeSymbol("*C10-WALES-GEN-COL*");

    // defparameter
    public static final SubLSymbol $c10_wales_gen_mt$ = makeSymbol("*C10-WALES-GEN-MT*");

    public static final SubLObject c10_wales(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lexical_mts = delete($c10_wales_mt$.getDynamicValue(thread), isa.all_fort_instances($$LexicalMicrotheory, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject lexical_mts_text = Mapping.mapcar(symbol_function(CB_STRING_FOR_FORT), lexical_mts);
                SubLObject lexical_mts_sorted = Sort.stable_sort(lexical_mts_text, symbol_function($sym15$STRING_), UNPROVIDED);
                if (NIL != ke.cyclist_is_guest()) {
                    cyc_navigator_internals.guest_warn($str_alt16$Wales__the_Cyc_lexicon_tool_);
                } else {
                    $regular_wales_stringP$.setDynamicValue(NIL, thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$Add_to_Cyc_Lexicon);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_complete.html_complete_script();
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_princ($$$Add_to_Cyc_Lexicon);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_macros.verify_not_within_html_pre();
                                        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                        {
                                            SubLObject _prev_bind_0_2 = html_macros.$within_html_pre$.currentBinding(thread);
                                            try {
                                                html_macros.$within_html_pre$.bind(T, thread);
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
                                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                        html_utilities.html_markup(THREE_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        cb_utilities.cb_help_preamble($WALES, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_princ($$$Lexicon_Information);
                                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                        html_utilities.html_markup(THREE_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt19$Enter_word__);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        html_utilities.html_tab(THREE_INTEGER);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        html_utilities.html_text_input($str_alt20$c10_handle_wales, NIL != $c10_wales_string$.getDynamicValue(thread) ? ((SubLObject) ($c10_wales_string$.getDynamicValue(thread))) : NIL, $int$40);
                                                        html_utilities.html_indent(ONE_INTEGER);
                                                        html_utilities.html_submit_input($$$Add_Info, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_reset_input($$$Reset);
                                                        html_utilities.html_terpri(TWO_INTEGER);
                                                        html_utilities.html_radio_input($str_alt24$_add_stuff, $str_alt25$reg_strings, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt26$_Add_regular_strings_to_lexicon);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        html_utilities.html_radio_input($str_alt24$_add_stuff, $$$strings, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt28$_Add_irregular_strings_to_lexicon);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        html_utilities.html_radio_input($str_alt24$_add_stuff, $$$frames, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt30$_Add_other_lexical_information);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        html_utilities.html_radio_input($str_alt24$_add_stuff, $$$phrase, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt32$_Add_a_multi_word_phrase);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        html_utilities.html_radio_input($str_alt24$_add_stuff, $$$name_string, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt34$_Add_a_proper_name_string);
                                                        html_utilities.html_terpri(TWO_INTEGER);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt35$Choose_Mt__);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($str_alt36$choose_mt);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        if (true) {
                                                            html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup(FIVE_INTEGER);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                {
                                                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_utilities.html_princ(cb_utilities.cb_string_for_fort($c10_wales_mt$.getDynamicValue(thread)));
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                {
                                                                    SubLObject cdolist_list_var = lexical_mts_sorted;
                                                                    SubLObject mt_text = NIL;
                                                                    for (mt_text = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt_text = cdolist_list_var.first()) {
                                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                        {
                                                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                {
                                                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                    try {
                                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                                        html_utilities.html_princ(mt_text);
                                                                                    } finally {
                                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                            }
                                                                        }
                                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                html_utilities.html_terpri(TWO_INTEGER);
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
                                                    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                        html_utilities.html_markup(THREE_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        html_utilities.html_princ($$$Generation_Information);
                                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                        html_utilities.html_markup(THREE_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt38$Enter_constant__);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        html_utilities.html_tab(THREE_INTEGER);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        html_complete.html_complete_button($str_alt39$c10_handle_wales_gen, $str_alt40$C_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_text_input($str_alt39$c10_handle_wales_gen, NIL != $c10_wales_gen_col$.getDynamicValue(thread) ? ((SubLObject) (cb_utilities.cb_string_for_fort($c10_wales_gen_col$.getDynamicValue(thread)))) : NIL, $int$40);
                                                        html_utilities.html_indent(ONE_INTEGER);
                                                        html_utilities.html_submit_input($$$Add_Info, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_reset_input($$$Reset);
                                                        html_utilities.html_terpri(TWO_INTEGER);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ($str_alt35$Choose_Mt__);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        html_complete.html_complete_button($str_alt36$choose_mt, $str_alt40$C_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_text_input($str_alt36$choose_mt, cb_utilities.cb_string_for_fort($c10_wales_gen_mt$.getDynamicValue(thread)), $int$40);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                html_utilities.html_terpri(TWO_INTEGER);
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                if (NIL != $c10_wales_word$.getDynamicValue(thread)) {
                                                    html_utilities.html_princ($str_alt41$Last_word__);
                                                    html_utilities.html_terpri(TWO_INTEGER);
                                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_utilities.html_markup(TWO_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    cb_utilities.cb_form($c10_wales_word$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_utilities.html_markup(TWO_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                }
                                            } finally {
                                                html_macros.$within_html_pre$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
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
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject c10_handle_wales(SubLObject args) {
        {
            SubLObject add_stuff = html_utilities.html_extract_input($str_alt24$_add_stuff, args);
            SubLObject string = args.first();
            SubLObject mt = cb_utilities.cb_guess_fort(html_utilities.html_extract_input($str_alt36$choose_mt, args), UNPROVIDED);
            if (add_stuff.equalp($str_alt25$reg_strings)) {
                $regular_wales_stringP$.setDynamicValue(T);
            }
            if (NIL != forts.fort_p(mt)) {
                $c10_wales_mt$.setDynamicValue(mt);
            }
            if (add_stuff.equalp($$$name_string)) {
                c10_name_string(string);
            }
            if (string.isString()) {
                {
                    SubLObject words = lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject unit_wo_strings = cb_utilities.cb_guess_fort(lexicon_utilities.suggest_word_unit(string), UNPROVIDED);
                    $c10_wales_string$.setDynamicValue(string);
                    if (NIL != unit_wo_strings) {
                        {
                            SubLObject item_var = unit_wo_strings;
                            if (NIL == member(item_var, words, symbol_function(EQL), symbol_function(IDENTITY))) {
                                words = cons(item_var, words);
                            }
                        }
                    }
                    if (NIL != words) {
                        if (((NIL == add_stuff) || add_stuff.equalp($$$strings)) || add_stuff.equalp($str_alt25$reg_strings)) {
                            c10_confirm_word(words);
                        } else
                            if (add_stuff.equalp($$$frames)) {
                                c10_confirm_lex_word(words);
                            } else
                                if (add_stuff.equalp($$$phrase)) {
                                    c10_confirm_word(words);
                                }


                    } else {
                        if (add_stuff.equalp($$$phrase)) {
                            c10_handle_phrase(args);
                        } else {
                            c10_create_word(args);
                        }
                    }
                }
            } else {
                cb_utilities.cb_error($str_alt43$_S_was_not_a_string, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject c10_handle_wales_gen(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject col = cb_utilities.cb_guess_fort(args.first(), UNPROVIDED);
                SubLObject mt = cb_utilities.cb_guess_fort(html_utilities.html_extract_input($str_alt36$choose_mt, args), UNPROVIDED);
                $c10_wales_gen_mt$.setDynamicValue(mt, thread);
                if (NIL == forts.fort_p(col)) {
                    cb_utilities.cb_error($str_alt45$_S_did_not_specify_a_Cyc_term, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    {
                        SubLObject gen_format_assertions = pph_utilities.get_genformats(col, $c10_wales_gen_mt$.getDynamicValue(thread));
                        SubLObject pgu_assertions = pph_utilities.get_pgus(col, $c10_wales_gen_mt$.getDynamicValue(thread));
                        SubLObject gp_assertions = pph_utilities.get_genphrases(col, $c10_wales_gen_mt$.getDynamicValue(thread));
                        SubLObject words = pph_utilities.get_words_denoting_col(col);
                        $c10_wales_gen_col$.setDynamicValue(col, thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ($$$Add_Generation_Information);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                                        SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ($$$Add_Generation_Information);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt47$Words_denoting_);
                                            cb_utilities.cb_form($c10_wales_gen_col$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt48$____);
                                            {
                                                SubLObject cdolist_list_var = words;
                                                SubLObject word = NIL;
                                                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                                                    cb_utilities.cb_form(word, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_tab(TWO_INTEGER);
                                                }
                                            }
                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                            html_macros.verify_not_within_html_pre();
                                            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                            {
                                                SubLObject _prev_bind_0_11 = html_macros.$within_html_pre$.currentBinding(thread);
                                                try {
                                                    html_macros.$within_html_pre$.bind(T, thread);
                                                    if (NIL != pgu_assertions) {
                                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                        html_utilities.html_markup(ONE_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt49$Edit_Existing___preferredGenUnit_);
                                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                        html_utilities.html_markup(ONE_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject cdolist_list_var = pgu_assertions;
                                                            SubLObject pgu = NIL;
                                                            for (pgu = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pgu = cdolist_list_var.first()) {
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
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$Mt___);
                                                                        cb_utilities.cb_form(assertions_high.assertion_mt(pgu), UNPROVIDED, UNPROVIDED);
                                                                        html_utilities.html_terpri(UNPROVIDED);
                                                                        html_utilities.html_hidden_input($str_alt51$c10_edit_gen_assertion, assertion_handles.assertion_id(pgu), UNPROVIDED);
                                                                        {
                                                                            SubLObject formula = fi.assertion_fi_formula(pgu, UNPROVIDED);
                                                                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup($$$formula);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup($int$80);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    format_cycl_expression.format_cycl_expression(formula, html_macros.$html_stream$.getDynamicValue(thread), ZERO_INTEGER);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                                            html_utilities.html_terpri(UNPROVIDED);
                                                                            html_utilities.html_reset_input($$$Reset);
                                                                            html_utilities.html_submit_input($$$Assert, UNPROVIDED, UNPROVIDED);
                                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                    } finally {
                                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                            }
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_utilities.html_markup(ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    html_utilities.html_princ($str_alt55$Add_New___preferredGenUnit_Assert);
                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_utilities.html_markup(ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
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
                                                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$Mt___);
                                                            cb_utilities.cb_form($c10_wales_gen_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                            html_utilities.html_princ($str_alt56$Enter_word_unit____);
                                                            html_utilities.html_text_input($str_alt57$c10_add_new_pgu, NIL, $int$30);
                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                            html_utilities.html_princ($str_alt59$Choose_Part_of_Speech__);
                                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                            html_utilities.html_terpri(UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($str_alt60$_choose_pos);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(FIVE_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    {
                                                                        SubLObject pos = $list_alt61;
                                                                        SubLObject cdolist_list_var = pos;
                                                                        SubLObject part = NIL;
                                                                        for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                                                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                                            {
                                                                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                                    {
                                                                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                        try {
                                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                                            html_utilities.html_princ(cb_utilities.cb_string_for_fort(part));
                                                                                        } finally {
                                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                                        }
                                                                    }
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                            html_utilities.html_submit_input($$$Add_Info, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_reset_input($$$Reset);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    html_utilities.html_terpri(UNPROVIDED);
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    if (NIL != gen_format_assertions) {
                                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                        html_utilities.html_markup(ONE_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt62$Edit_Existing___genFormat_Asserti);
                                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                        html_utilities.html_markup(ONE_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject cdolist_list_var = gen_format_assertions;
                                                            SubLObject gfa = NIL;
                                                            for (gfa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gfa = cdolist_list_var.first()) {
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
                                                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_macros.$within_html_form$.bind(T, thread);
                                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$Mt___);
                                                                        cb_utilities.cb_form(assertions_high.assertion_mt(gfa), UNPROVIDED, UNPROVIDED);
                                                                        html_utilities.html_terpri(UNPROVIDED);
                                                                        html_utilities.html_hidden_input($str_alt51$c10_edit_gen_assertion, assertion_handles.assertion_id(gfa), UNPROVIDED);
                                                                        {
                                                                            SubLObject formula = fi.assertion_fi_formula(gfa, UNPROVIDED);
                                                                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup($$$formula);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup($int$80);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(THREE_INTEGER);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    format_cycl_expression.format_cycl_expression(formula, html_macros.$html_stream$.getDynamicValue(thread), ZERO_INTEGER);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                                            html_utilities.html_reset_input($$$Reset);
                                                                            html_utilities.html_submit_input($$$Assert, UNPROVIDED, UNPROVIDED);
                                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                    } finally {
                                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                            }
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_utilities.html_markup(ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    html_utilities.html_princ($str_alt63$Add_New___genFormat_Assertion);
                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_utilities.html_markup(ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
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
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$Mt___);
                                                            cb_utilities.cb_form($c10_wales_gen_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_terpri(UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($str_alt64$c10_add_new_gen_assertion);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($int$80);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                            html_utilities.html_reset_input($$$Reset);
                                                            html_utilities.html_submit_input($$$Assert, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    if (NIL != gp_assertions) {
                                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                        html_utilities.html_markup(ONE_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt65$Edit_Existing___genPhrase_Asserti);
                                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                        html_utilities.html_markup(ONE_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject cdolist_list_var = gp_assertions;
                                                            SubLObject gpa = NIL;
                                                            for (gpa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gpa = cdolist_list_var.first()) {
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
                                                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_macros.$within_html_form$.bind(T, thread);
                                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$Mt___);
                                                                        cb_utilities.cb_form(assertions_high.assertion_mt(gpa), UNPROVIDED, UNPROVIDED);
                                                                        html_utilities.html_terpri(UNPROVIDED);
                                                                        html_utilities.html_hidden_input($str_alt51$c10_edit_gen_assertion, assertion_handles.assertion_id(gpa), UNPROVIDED);
                                                                        {
                                                                            SubLObject formula = fi.assertion_fi_formula(gpa, UNPROVIDED);
                                                                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_utilities.html_markup($$$formula);
                                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup($int$80);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_utilities.html_markup(THREE_INTEGER);
                                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                    format_cycl_expression.format_cycl_expression(formula, html_macros.$html_stream$.getDynamicValue(thread), ZERO_INTEGER);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                                                }
                                                                            }
                                                                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                                            html_utilities.html_reset_input($$$Reset);
                                                                            html_utilities.html_submit_input($$$Assert, UNPROVIDED, UNPROVIDED);
                                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                                    } finally {
                                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                                    }
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                            }
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_utilities.html_markup(ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    html_utilities.html_princ($str_alt66$Add_New___genPhrase_Assertion);
                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_utilities.html_markup(ONE_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
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
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$Mt___);
                                                            cb_utilities.cb_form($c10_wales_gen_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_terpri(UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            html_utilities.html_markup($str_alt64$c10_add_new_gen_assertion);
                                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup($int$80);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                                }
                                                            }
                                                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                            html_utilities.html_reset_input($$$Reset);
                                                            html_utilities.html_submit_input($$$Assert, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$within_html_pre$.rebind(_prev_bind_0_11, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject c10_handle_phrase(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mws = multi_word_string_assertions($c10_wales_string$.getDynamicValue(thread), $c10_wales_mt$.getDynamicValue(thread));
                SubLObject cds = compound_string_assertions($c10_wales_string$.getDynamicValue(thread), $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($str_alt68$Add_a_multi_word_phrase);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                                SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_princ($str_alt68$Add_a_multi_word_phrase);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_macros.verify_not_within_html_pre();
                                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    {
                                        SubLObject _prev_bind_0_27 = html_macros.$within_html_pre$.currentBinding(thread);
                                        try {
                                            html_macros.$within_html_pre$.bind(T, thread);
                                            if ((NIL != mws) || (NIL != cds)) {
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(ONE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($$$Existing_Assertions);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(ONE_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_terpri(TWO_INTEGER);
                                                {
                                                    SubLObject cdolist_list_var = mws;
                                                    SubLObject mw = NIL;
                                                    for (mw = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mw = cdolist_list_var.first()) {
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
                                                                html_utilities.html_hidden_input($str_alt70$c10_edit_mw, assertion_handles.assertion_id(mw), UNPROVIDED);
                                                                {
                                                                    SubLObject formula = fi.assertion_fi_formula(mw, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($$$formula);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup($int$70);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(FIVE_INTEGER);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            format_cycl_expression.format_cycl_expression(formula, html_macros.$html_stream$.getDynamicValue(thread), ZERO_INTEGER);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                                    html_utilities.html_terpri(TWO_INTEGER);
                                                                    html_utilities.html_reset_input($$$Reset);
                                                                    html_utilities.html_submit_input($$$Assert, UNPROVIDED, UNPROVIDED);
                                                                    html_utilities.html_terpri(TWO_INTEGER);
                                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                }
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    }
                                                }
                                                {
                                                    SubLObject cdolist_list_var = cds;
                                                    SubLObject cd = NIL;
                                                    for (cd = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cd = cdolist_list_var.first()) {
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
                                                            SubLObject _prev_bind_0_30 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_utilities.html_hidden_input($str_alt72$c10_edit_cd, assertion_handles.assertion_id(cd), UNPROVIDED);
                                                                {
                                                                    SubLObject formula = fi.assertion_fi_formula(cd, UNPROVIDED);
                                                                    html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup($$$formula);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup($int$70);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup(FIVE_INTEGER);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            format_cycl_expression.format_cycl_expression(formula, html_macros.$html_stream$.getDynamicValue(thread), ZERO_INTEGER);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                                    html_utilities.html_terpri(TWO_INTEGER);
                                                                    html_utilities.html_reset_input($$$Reset);
                                                                    html_utilities.html_submit_input($$$Assert, UNPROVIDED, UNPROVIDED);
                                                                    html_utilities.html_terpri(TWO_INTEGER);
                                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                }
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_30, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    }
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ($$$Add_New_Assertion);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
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
                                                    html_utilities.html_terpri(UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($str_alt74$c10_add_new_mw);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup($int$70);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                        html_utilities.html_markup(FIVE_INTEGER);
                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                    html_utilities.html_terpri(TWO_INTEGER);
                                                    html_utilities.html_reset_input($$$Reset);
                                                    html_utilities.html_submit_input($$$Assert, UNPROVIDED, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$within_html_pre$.rebind(_prev_bind_0_27, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_name_string(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cols = lexicon_accessors.denots_of_name_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Add_a_Proper_Name_String);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_complete.html_complete_script();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                                SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_princ($$$Add_a_Proper_Name_String);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    html_macros.verify_not_within_html_pre();
                                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    {
                                        SubLObject _prev_bind_0_35 = html_macros.$within_html_pre$.currentBinding(thread);
                                        try {
                                            html_macros.$within_html_pre$.bind(T, thread);
                                            if (NIL != cols) {
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($str_alt77$Existing_Denotations_);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_terpri(UNPROVIDED);
                                                {
                                                    SubLObject cdolist_list_var = cols;
                                                    SubLObject col = NIL;
                                                    for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                                        cb_utilities.cb_form(col, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                    }
                                                }
                                                html_utilities.html_terpri(TWO_INTEGER);
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_terpri(TWO_INTEGER);
                                            }
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
                                                SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_hidden_input($str_alt78$c10_add_name_string, string, UNPROVIDED);
                                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_utilities.html_markup(TWO_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    html_utilities.html_princ($str_alt79$Add_New_Denotation_);
                                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_utilities.html_markup(TWO_INTEGER);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    html_utilities.html_terpri(UNPROVIDED);
                                                    html_complete.html_complete_button($str_alt80$name_string, $str_alt40$C_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_text_input($str_alt80$name_string, NIL, $int$35);
                                                    html_utilities.html_terpri(TWO_INTEGER);
                                                    html_utilities.html_reset_input($$$Reset);
                                                    html_utilities.html_submit_input($$$Assert, UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_terpri(TWO_INTEGER);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$within_html_pre$.rebind(_prev_bind_0_35, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                return NIL;
            }
        }
    }

    public static final SubLObject c10_add_name_string(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = args.first();
                SubLObject col = html_utilities.html_extract_input($str_alt80$name_string, args);
                SubLObject fort = cb_utilities.cb_guess_fort(col, UNPROVIDED);
                if (NIL == forts.fort_p(fort)) {
                    cb_utilities.cb_error($str_alt83$_S_did_not_specify_a_constant_, col, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    ke.ke_assert(list($$nameString, fort, string), $c10_wales_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                }
                c10_wales(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_edit_mw(SubLObject args) {
        {
            SubLObject old_assertion_id = read_from_string_ignoring_errors(args.first(), NIL, NIL, UNPROVIDED, UNPROVIDED);
            SubLObject formula = read_from_string_ignoring_errors(html_utilities.html_extract_input($$$formula, args), NIL, NIL, UNPROVIDED, UNPROVIDED);
            if (NIL == formula) {
                cb_utilities.cb_error($str_alt86$Bad_formula__probably_due_to_a_mi, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL == old_assertion_id) {
                    cb_utilities.cb_error($str_alt87$Can_t_determine_old_assertion__wh, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    {
                        SubLObject assertion = assertion_handles.find_assertion_by_id(old_assertion_id);
                        SubLObject mt = assertions_high.assertion_mt(assertion);
                        SubLObject strength = assertions_high.assertion_strength(assertion);
                        SubLObject direction = assertions_high.assertion_direction(assertion);
                        ke.ke_unassert_assertion(assertion);
                        ke.ke_assert(formula, mt, strength, direction);
                        c10_wales(UNPROVIDED);
                    }
                }

        }
        return NIL;
    }

    public static final SubLObject c10_edit_cd(SubLObject args) {
        {
            SubLObject old_assertion_id = read_from_string_ignoring_errors(args.first(), NIL, NIL, UNPROVIDED, UNPROVIDED);
            SubLObject formula = read_from_string_ignoring_errors(html_utilities.html_extract_input($$$formula, args), NIL, NIL, UNPROVIDED, UNPROVIDED);
            if (NIL == formula) {
                cb_utilities.cb_error($str_alt86$Bad_formula__probably_due_to_a_mi, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL == old_assertion_id) {
                    cb_utilities.cb_error($str_alt87$Can_t_determine_old_assertion__wh, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    {
                        SubLObject assertion = assertion_handles.find_assertion_by_id(old_assertion_id);
                        SubLObject mt = assertions_high.assertion_mt(assertion);
                        SubLObject strength = assertions_high.assertion_strength(assertion);
                        SubLObject direction = assertions_high.assertion_direction(assertion);
                        ke.ke_unassert_assertion(assertion);
                        ke.ke_assert(formula, mt, strength, direction);
                        c10_wales(UNPROVIDED);
                    }
                }

        }
        return NIL;
    }

    public static final SubLObject c10_edit_gen_assertion(SubLObject args) {
        {
            SubLObject old_assertion_id = read_from_string_ignoring_errors(args.first(), NIL, NIL, UNPROVIDED, UNPROVIDED);
            SubLObject formula = read_from_string_ignoring_errors(html_utilities.html_extract_input($$$formula, args), NIL, NIL, UNPROVIDED, UNPROVIDED);
            if (NIL == formula) {
                cb_utilities.cb_error($str_alt86$Bad_formula__probably_due_to_a_mi, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL == old_assertion_id) {
                    cb_utilities.cb_error($str_alt87$Can_t_determine_old_assertion__wh, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    {
                        SubLObject assertion = assertion_handles.find_assertion_by_id(old_assertion_id);
                        SubLObject mt = assertions_high.assertion_mt(assertion);
                        SubLObject strength = assertions_high.assertion_strength(assertion);
                        SubLObject direction = assertions_high.assertion_direction(assertion);
                        ke.ke_unassert_assertion(assertion);
                        ke.ke_assert(formula, mt, strength, direction);
                        c10_wales(UNPROVIDED);
                    }
                }

        }
        return NIL;
    }

    public static final SubLObject c10_add_new_mw(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formula = read_from_string_ignoring_errors(args.first(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                if (NIL == formula) {
                    cb_utilities.cb_error($str_alt86$Bad_formula__probably_due_to_a_mi, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    ke.ke_assert(formula, $c10_wales_mt$.getDynamicValue(thread), $DEFAULT, $FORWARD);
                    c10_wales(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject c10_add_new_gen_assertion(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formula = read_from_string_ignoring_errors(args.first(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                if (NIL == formula) {
                    cb_utilities.cb_error($str_alt86$Bad_formula__probably_due_to_a_mi, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    ke.ke_assert(formula, $c10_wales_gen_mt$.getDynamicValue(thread), $DEFAULT, $FORWARD);
                    c10_wales(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject c10_add_new_pgu(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject word = cb_utilities.cb_guess_fort(args.first(), UNPROVIDED);
                SubLObject col = $c10_wales_gen_col$.getDynamicValue(thread);
                SubLObject pos_list = NIL;
                {
                    SubLObject cdolist_list_var = args.rest();
                    SubLObject rest = NIL;
                    for (rest = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rest = cdolist_list_var.first()) {
                        pos_list = cons(cb_utilities.cb_guess_fort(html_utilities.html_extract_input($str_alt60$_choose_pos, list(rest)), UNPROVIDED), pos_list);
                    }
                }
                if (NIL == word) {
                    cb_utilities.cb_error($str_alt95$_s_did_not_specify_a_Cyc_constant, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    {
                        SubLObject cdolist_list_var = pos_list;
                        SubLObject pos = NIL;
                        for (pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos = cdolist_list_var.first()) {
                            if (NIL != forts.fort_p(pos)) {
                                ke.ke_assert(list($$preferredGenUnit, col, pos, word), $c10_wales_gen_mt$.getDynamicValue(thread), $DEFAULT, $FORWARD);
                            }
                        }
                    }
                    c10_wales(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject c10_confirm_word(SubLObject words) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$Choose_Word_Unit);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup(TWO_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_princ($$$Choose_Word_Unit);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(TWO_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_macros.verify_not_within_html_pre();
                                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                {
                                    SubLObject _prev_bind_0_38 = html_macros.$within_html_pre$.currentBinding(thread);
                                    try {
                                        html_macros.$within_html_pre$.bind(T, thread);
                                        html_utilities.html_princ($$$Choose_the_correct_word_unit);
                                        html_utilities.html_terpri(TWO_INTEGER);
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
                                            SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                {
                                                    SubLObject cdolist_list_var = words;
                                                    SubLObject word = NIL;
                                                    for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                                                        html_utilities.html_radio_input($str_alt100$c10_add_word_info, cb_utilities.cb_fort_identifier(word), NIL);
                                                        html_utilities.html_indent(TWO_INTEGER);
                                                        cb_utilities.cb_form(word, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                    }
                                                    html_utilities.html_radio_input($str_alt100$c10_add_word_info, $$$NIL, T);
                                                    html_utilities.html_indent(TWO_INTEGER);
                                                    html_utilities.html_princ($$$Create_a_new_word);
                                                    html_utilities.html_terpri(TWO_INTEGER);
                                                    html_utilities.html_submit_input($$$Done, UNPROVIDED, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_38, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject c10_create_word(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_unit_name = lexicon_utilities.suggest_word_unit($c10_wales_string$.getDynamicValue(thread));
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Create_New_Word_Unit);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                                SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_princ($$$Create_New_Word_Unit);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_macros.verify_not_within_html_pre();
                                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    {
                                        SubLObject _prev_bind_0_41 = html_macros.$within_html_pre$.currentBinding(thread);
                                        try {
                                            html_macros.$within_html_pre$.bind(T, thread);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt106$No_word_unit_for__s_currently_exi, $c10_wales_string$.getDynamicValue(thread));
                                            html_utilities.html_terpri(TWO_INTEGER);
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
                                                SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_princ($str_alt107$Unit_name___);
                                                    html_utilities.html_text_input($str_alt108$c10_handle_create_word, new_unit_name, $int$40);
                                                    html_utilities.html_terpri(TWO_INTEGER);
                                                    html_utilities.html_reset_input($$$Reset);
                                                    html_utilities.html_submit_input($$$Create, UNPROVIDED, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$within_html_pre$.rebind(_prev_bind_0_41, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return boolean; T iff MT is an instance of an English lexical microtheory
     * @unknown tom
     */
    public static final SubLObject is_english_lexical_mtP(SubLObject mt) {
        return isa.isa_in_any_mtP(mt, $$EnglishLexicalMicrotheory);
    }

    /**
     * Handle creation of constant to represent the new lexical word unless already exists
     *
     * @unknown If the current MT is EnglishMt, an EnglishWord is created in BaseKB. For other MTs,
    an instance of LexicalWord (or EnglishWord) is created in the current MT.
     * @unknown Infer the word-type (e.g., SpanishWord) from the MT (eg, SpanishLexicalMt)
     */
    public static final SubLObject c10_handle_create_word(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_unit_name = args.first();
                if (NIL != cb_utilities.cb_guess_fort(new_unit_name, UNPROVIDED)) {
                    cb_utilities.cb_error($str_alt112$There_already_exists_a_constant_n, new_unit_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    {
                        SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                        try {
                            api_control_vars.$use_local_queueP$.bind(NIL, thread);
                            ke.ke_create(new_unit_name);
                            {
                                SubLObject new_word = cb_utilities.cb_guess_fort(new_unit_name, UNPROVIDED);
                                if (NIL != forts.fort_p(new_word)) {
                                    {
                                        SubLObject word_type = $$EnglishWord;
                                        if ($c10_wales_mt$.getDynamicValue(thread) != $$GeneralEnglishMt) {
                                            if (NIL == is_english_lexical_mtP($c10_wales_mt$.getDynamicValue(thread))) {
                                                word_type = $$LexicalWord;
                                            }
                                        }
                                        ke.ke_assert(list($$isa, new_word, word_type), $c10_wales_mt$.getDynamicValue(thread), $MONOTONIC, UNPROVIDED);
                                        c10_add_word_info(list(cb_utilities.cb_fort_identifier(new_word)));
                                    }
                                } else {
                                    cb_utilities.cb_error($str_alt117$Unable_to_create_a_constant_for__, new_unit_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        } finally {
                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject c10_add_word_info(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $regular_wales_stringP$.getDynamicValue(thread)) {
                c10_add_reg_word_info(args);
                return NIL;
            } else {
                {
                    SubLObject fort = cb_utilities.cb_guess_fort(args.first(), UNPROVIDED);
                    $c10_wales_word$.setDynamicValue(fort, thread);
                    if (NIL == forts.fort_p(fort)) {
                        c10_create_word(args);
                    } else {
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt119$Add_Strings_for__S, fort);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                                        SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_macros.verify_not_within_html_pre();
                                            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                            {
                                                SubLObject _prev_bind_0_44 = html_macros.$within_html_pre$.currentBinding(thread);
                                                try {
                                                    html_macros.$within_html_pre$.bind(T, thread);
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
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
                                                        SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_macros.$within_html_form$.bind(T, thread);
                                                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                            html_utilities.html_markup(TWO_INTEGER);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            cb_utilities.cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_princ($str_alt120$__in_the__);
                                                            cb_utilities.cb_form($c10_wales_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                            html_utilities.html_markup(TWO_INTEGER);
                                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                            html_utilities.html_hidden_input($str_alt121$c10_handle_add_word_info, $$$T, UNPROVIDED);
                                                            html_utilities.html_terpri(UNPROVIDED);
                                                            html_utilities.html_radio_input($str_alt24$_add_stuff, $$$update, UNPROVIDED);
                                                            html_utilities.html_princ($str_alt124$_Update_Lexicon);
                                                            html_utilities.html_terpri(UNPROVIDED);
                                                            html_utilities.html_radio_input($str_alt24$_add_stuff, $$$semantics, UNPROVIDED);
                                                            html_utilities.html_princ($str_alt126$_Go_to_Add_Other_Lexical_Informat);
                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                            html_utilities.html_submit_input($$$Do_It, UNPROVIDED, UNPROVIDED);
                                                            c10_noun_info(fort);
                                                            c10_proper_noun_info(fort);
                                                            c10_agentive_noun_info(fort);
                                                            c10_verb_info(fort);
                                                            c10_adjective_info(fort);
                                                            c10_adverb_info(fort);
                                                            html_utilities.html_reset_input($$$Restore_Values);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        } finally {
                                                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                            html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                        }
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$within_html_pre$.rebind(_prev_bind_0_44, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            html_utilities.html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject c10_add_reg_word_info(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = cb_utilities.cb_guess_fort(args.first(), UNPROVIDED);
                $c10_wales_word$.setDynamicValue(fort, thread);
                if (NIL == forts.fort_p(fort)) {
                    c10_create_word(args);
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt119$Add_Strings_for__S, fort);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                                    SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.verify_not_within_html_pre();
                                        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                        {
                                            SubLObject _prev_bind_0_47 = html_macros.$within_html_pre$.currentBinding(thread);
                                            try {
                                                html_macros.$within_html_pre$.bind(T, thread);
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
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
                                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                        html_utilities.html_markup(TWO_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        cb_utilities.cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                        html_utilities.html_markup(TWO_INTEGER);
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        html_utilities.html_hidden_input($str_alt121$c10_handle_add_word_info, $$$T, UNPROVIDED);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        html_utilities.html_radio_input($str_alt24$_add_stuff, $$$update, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt124$_Update_Lexicon);
                                                        html_utilities.html_terpri(UNPROVIDED);
                                                        html_utilities.html_radio_input($str_alt24$_add_stuff, $$$semantics, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt130$_Go_to_Add_Semantic_Info);
                                                        html_utilities.html_terpri(TWO_INTEGER);
                                                        html_utilities.html_submit_input($$$Do_It, UNPROVIDED, UNPROVIDED);
                                                        c10_reg_noun_info(fort);
                                                        c10_reg_mass_noun_info(fort);
                                                        c10_reg_agentive_noun_info(fort);
                                                        c10_reg_verb_info(fort);
                                                        c10_reg_adj_info(fort);
                                                        c10_reg_adv_info(fort);
                                                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_reset_input($$$Restore_Values);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$within_html_pre$.rebind(_prev_bind_0_47, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            $regular_wales_stringP$.setDynamicValue(NIL, thread);
            return NIL;
        }
    }

    public static final SubLObject c10_noun_info(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject singular = lexicon_utilities.noun_form_singular(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject plural = lexicon_utilities.noun_form_plural(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject mass = lexicon_utilities.noun_form_mass(fort, $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($$$Simple_Noun_Form);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_princ($str_alt133$sing_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt134$_singular, NIL != singular ? ((SubLObject) (singular)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt136$plur_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt137$_plural, NIL != plural ? ((SubLObject) (plural)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt138$mass_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt139$_mass, NIL != mass ? ((SubLObject) (mass)) : $str_alt135$, FIFTEEN_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_reg_noun_info(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mass = lexicon_utilities.noun_form_singular(fort, $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($$$Simple_Noun_Form);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($str_alt133$sing_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt134$_singular, NIL != mass ? ((SubLObject) (mass)) : $str_alt135$, TWENTY_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_reg_mass_noun_info(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject singular = lexicon_utilities.noun_form_mass(fort, $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($$$Mass_Noun_Form);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($str_alt138$mass_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt139$_mass, NIL != singular ? ((SubLObject) (singular)) : $str_alt135$, TWENTY_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_proper_noun_info(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject singular = lexicon_utilities.proper_noun_form_singular(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject plural = lexicon_utilities.proper_noun_form_plural(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject mass = lexicon_utilities.proper_noun_form_mass(fort, $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($$$Proper_Noun_Form);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_princ($str_alt133$sing_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt145$_p_singular, NIL != singular ? ((SubLObject) (singular)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt136$plur_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt146$_p_plural, NIL != plural ? ((SubLObject) (plural)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt138$mass_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt147$_p_mass, NIL != mass ? ((SubLObject) (mass)) : $str_alt135$, FIFTEEN_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_agentive_noun_info(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject singular = lexicon_utilities.ag_noun_form_singular(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject plural = lexicon_utilities.ag_noun_form_plural(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject mass = lexicon_utilities.ag_noun_form_mass(fort, $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($$$Agentive_Noun_Form);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_princ($str_alt133$sing_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt150$_ag_singular, NIL != singular ? ((SubLObject) (singular)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt136$plur_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt151$_ag_plural, NIL != plural ? ((SubLObject) (plural)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt138$mass_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt152$_ag_mass, NIL != mass ? ((SubLObject) (mass)) : $str_alt135$, FIFTEEN_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_reg_agentive_noun_info(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject singular = lexicon_utilities.ag_noun_form_singular(fort, $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($$$Agentive_Noun_Form);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($str_alt133$sing_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt150$_ag_singular, NIL != singular ? ((SubLObject) (singular)) : $str_alt135$, TWENTY_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_verb_info(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject infinitive = lexicon_utilities.verb_form_infinitive(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject third_sing = lexicon_utilities.verb_form_third_sing(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject past = lexicon_utilities.verb_form_past(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject perfect = lexicon_utilities.verb_form_perfect(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject progressive = lexicon_utilities.verb_form_progressive(fort, $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($$$Verb_Form);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_princ($str_alt156$infin_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt157$_infinitive, NIL != infinitive ? ((SubLObject) (infinitive)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt158$3rd_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt159$_third_sing, NIL != third_sing ? ((SubLObject) (third_sing)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt160$prog_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt161$_progressive, NIL != progressive ? ((SubLObject) (progressive)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_princ($str_alt162$past_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt163$_past, NIL != past ? ((SubLObject) (past)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt164$perf_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt165$_perfect, NIL != perfect ? ((SubLObject) (perfect)) : $str_alt135$, FIFTEEN_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_reg_verb_info(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject infinitive = lexicon_utilities.verb_form_infinitive(fort, $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($$$Verb_Form);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($str_alt156$infin_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt157$_infinitive, NIL != infinitive ? ((SubLObject) (infinitive)) : $str_alt135$, TWENTY_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_adjective_info(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject regular = lexicon_utilities.adjective_form_regular(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject comparative = lexicon_utilities.adjective_form_comparative(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject superlative = lexicon_utilities.adjective_form_superlative(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject nongradable = lexicon_utilities.adjective_form_nongradable(fort, $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($$$Adjective_Form);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_princ($str_alt169$reg_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt170$_regular, NIL != regular ? ((SubLObject) (regular)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt171$comp_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt172$_comparative, NIL != comparative ? ((SubLObject) (comparative)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt173$sup_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt174$_superlative, NIL != superlative ? ((SubLObject) (superlative)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_princ($str_alt175$nongr_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt176$_nongradable, NIL != nongradable ? ((SubLObject) (nongradable)) : $str_alt135$, FIFTEEN_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_reg_adj_info(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject reg = lexicon_utilities.adjective_form_regular(fort, $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($$$Adjective_Form);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($str_alt169$reg_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt170$_regular, NIL != reg ? ((SubLObject) (reg)) : $str_alt135$, TWENTY_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_adverb_info(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject regular = lexicon_utilities.adverb_form_regular(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject comparative = lexicon_utilities.adverb_form_comparative(fort, $c10_wales_mt$.getDynamicValue(thread));
                SubLObject superlative = lexicon_utilities.adverb_form_superlative(fort, $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($$$Adverb_Form);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_terpri(UNPROVIDED);
                html_utilities.html_princ($str_alt169$reg_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt180$_adv_regular, NIL != regular ? ((SubLObject) (regular)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt171$comp_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt181$_adv_comparative, NIL != comparative ? ((SubLObject) (comparative)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_indent(TWO_INTEGER);
                html_utilities.html_princ($str_alt173$sup_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt182$_adv_superlative, NIL != superlative ? ((SubLObject) (superlative)) : $str_alt135$, FIFTEEN_INTEGER);
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_reg_adv_info(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject reg = lexicon_utilities.adverb_form_regular(fort, $c10_wales_mt$.getDynamicValue(thread));
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($$$Adverb_Form);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup(THREE_INTEGER);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                html_utilities.html_princ($str_alt169$reg_);
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_text_input($str_alt180$_adv_regular, NIL != reg ? ((SubLObject) (reg)) : $str_alt135$, TWENTY_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject c10_handle_add_word_info(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject add_stuff = html_utilities.html_extract_input($str_alt24$_add_stuff, args);
                SubLObject rest = args.rest();
                SubLObject lexical_info = NIL;
                if (add_stuff.equalp($$$semantics)) {
                    c10_choose_pos(list($c10_wales_word$.getDynamicValue(thread)));
                    return NIL;
                }
                for (; NIL != rest;) {
                    {
                        SubLObject field = read_from_string_ignoring_errors(rest.first().first(), NIL, NIL, UNPROVIDED, UNPROVIDED);
                        SubLObject value = second(rest.first());
                        if (field != $ADD_STUFF) {
                            if (value.equalp($str_alt135$)) {
                                lexical_info = cons(cons(field, NIL), lexical_info);
                            } else {
                                lexical_info = cons(cons(field, value), lexical_info);
                            }
                        }
                        rest = rest.rest();
                    }
                }
                {
                    SubLObject cdolist_list_var = nreverse(lexical_info);
                    SubLObject info = NIL;
                    for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                        set_lexical_info_1($c10_wales_word$.getDynamicValue(thread), info.first(), info.rest(), UNPROVIDED);
                        if (info.first().equal($SINGULAR) || info.first().equal($AG_SINGULAR)) {
                            $wales_noun_stem$.setDynamicValue(info.rest(), thread);
                        }
                        if (info.first().equal($INFINITIVE)) {
                            $wales_verb_stem$.setDynamicValue(info.rest(), thread);
                        }
                    }
                }
                $wales_noun_stem$.setDynamicValue(NIL, thread);
                $wales_verb_stem$.setDynamicValue(NIL, thread);
                c10_wales(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static final SubLObject set_lexical_info_1(SubLObject word, SubLObject prop, SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $c10_wales_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = prop;
                if (pcase_var.eql($SINGULAR)) {
                    lexicon_utilities.set_noun_form_singular(word, string, mt);
                } else
                    if (pcase_var.eql($PLURAL)) {
                        if (!((NIL != $wales_noun_stem$.getDynamicValue(thread)) && string.equalp(morphology.plural_reg($wales_noun_stem$.getDynamicValue(thread))))) {
                            lexicon_utilities.set_noun_form_plural(word, string, mt);
                        }
                    } else
                        if (pcase_var.eql($MASS)) {
                            lexicon_utilities.set_noun_form_mass(word, string, mt);
                        } else
                            if (pcase_var.eql($P_SINGULAR)) {
                                lexicon_utilities.set_proper_noun_form_singular(word, string, mt);
                            } else
                                if (pcase_var.eql($P_PLURAL)) {
                                    lexicon_utilities.set_proper_noun_form_plural(word, string, mt);
                                } else
                                    if (pcase_var.eql($P_MASS)) {
                                        lexicon_utilities.set_proper_noun_form_mass(word, string, mt);
                                    } else
                                        if (pcase_var.eql($AG_SINGULAR)) {
                                            lexicon_utilities.set_ag_noun_form_singular(word, string, mt);
                                        } else
                                            if (pcase_var.eql($AG_PLURAL)) {
                                                if (!((NIL != $wales_noun_stem$.getDynamicValue(thread)) && string.equalp(morphology.plural_reg($wales_noun_stem$.getDynamicValue(thread))))) {
                                                    lexicon_utilities.set_ag_noun_form_plural(word, string, mt);
                                                }
                                            } else
                                                if (pcase_var.eql($AG_MASS)) {
                                                    lexicon_utilities.set_ag_noun_form_mass(word, string, mt);
                                                } else
                                                    if (pcase_var.eql($INFINITIVE)) {
                                                        lexicon_utilities.set_verb_form_infinitive(word, string, mt);
                                                    } else
                                                        if (pcase_var.eql($THIRD_SING)) {
                                                            if (!((NIL != $wales_verb_stem$.getDynamicValue(thread)) && string.equalp(morphology.third_sg_reg($wales_verb_stem$.getDynamicValue(thread))))) {
                                                                lexicon_utilities.set_verb_form_third_sing(word, string, mt);
                                                            }
                                                        } else
                                                            if (pcase_var.eql($PROGRESSIVE)) {
                                                                if (!((NIL != $wales_verb_stem$.getDynamicValue(thread)) && string.equalp(morphology.gerund_reg($wales_verb_stem$.getDynamicValue(thread))))) {
                                                                    lexicon_utilities.set_verb_form_progressive(word, string, mt);
                                                                }
                                                            } else
                                                                if (pcase_var.eql($PAST)) {
                                                                    if (!((NIL != $wales_verb_stem$.getDynamicValue(thread)) && string.equalp(morphology.past_tense_reg($wales_verb_stem$.getDynamicValue(thread))))) {
                                                                        lexicon_utilities.set_verb_form_past(word, string, mt);
                                                                    }
                                                                } else
                                                                    if (pcase_var.eql($PERFECT)) {
                                                                        if (!((NIL != $wales_verb_stem$.getDynamicValue(thread)) && string.equalp(morphology.past_tense_reg($wales_verb_stem$.getDynamicValue(thread))))) {
                                                                            lexicon_utilities.set_verb_form_perfect(word, string, mt);
                                                                        }
                                                                    } else
                                                                        if (pcase_var.eql($REGULAR)) {
                                                                            lexicon_utilities.set_adjective_form_regular(word, string, mt);
                                                                        } else
                                                                            if (pcase_var.eql($COMPARATIVE)) {
                                                                                lexicon_utilities.set_adjective_form_comparative(word, string, mt);
                                                                            } else
                                                                                if (pcase_var.eql($SUPERLATIVE)) {
                                                                                    lexicon_utilities.set_adjective_form_superlative(word, string, mt);
                                                                                } else
                                                                                    if (pcase_var.eql($NONGRADABLE)) {
                                                                                        lexicon_utilities.set_adjective_form_nongradable(word, string, mt);
                                                                                    } else
                                                                                        if (pcase_var.eql($ADV_REGULAR)) {
                                                                                            lexicon_utilities.set_adverb_form_regular(word, string, mt);
                                                                                        } else
                                                                                            if (pcase_var.eql($ADV_COMPARATIVE)) {
                                                                                                lexicon_utilities.set_adverb_form_comparative(word, string, mt);
                                                                                            } else
                                                                                                if (pcase_var.eql($ADV_SUPERLATIVE)) {
                                                                                                    lexicon_utilities.set_adverb_form_superlative(word, string, mt);
                                                                                                }




















            }
            return NIL;
        }
    }

    public static final SubLObject c10_confirm_lex_word(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject words = args;
                if (length(words).numE(ONE_INTEGER)) {
                    $c10_wales_word$.setDynamicValue(words.first(), thread);
                    c10_choose_pos(list($c10_wales_word$.getDynamicValue(thread)));
                } else {
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ($$$Choose_Word_Unit);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                    {
                        SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                                    SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_utilities.html_princ($$$Choose_Word_Unit);
                                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_utilities.html_markup(TWO_INTEGER);
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        html_macros.verify_not_within_html_pre();
                                        html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                        {
                                            SubLObject _prev_bind_0_50 = html_macros.$within_html_pre$.currentBinding(thread);
                                            try {
                                                html_macros.$within_html_pre$.bind(T, thread);
                                                html_utilities.html_princ($$$Choose_the_correct_word_unit);
                                                html_utilities.html_terpri(TWO_INTEGER);
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
                                                        {
                                                            SubLObject cdolist_list_var = words;
                                                            SubLObject word = NIL;
                                                            for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                                                                html_utilities.html_radio_input($str_alt208$c10_choose_pos, cb_utilities.cb_fort_identifier(word), NIL);
                                                                html_utilities.html_indent(TWO_INTEGER);
                                                                cb_utilities.cb_form(word, UNPROVIDED, UNPROVIDED);
                                                                html_utilities.html_terpri(UNPROVIDED);
                                                            }
                                                            html_utilities.html_terpri(TWO_INTEGER);
                                                            html_utilities.html_submit_input($$$Done, UNPROVIDED, UNPROVIDED);
                                                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$within_html_pre$.rebind(_prev_bind_0_50, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject c10_back_to_enter_strings_page(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ($$$No_POS_Information_Found);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            {
                SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                                html_utilities.html_markup(TWO_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_utilities.html_princ($$$No_POS_Information_Found);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup(TWO_INTEGER);
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                html_macros.verify_not_within_html_pre();
                                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                {
                                    SubLObject _prev_bind_0_53 = html_macros.$within_html_pre$.currentBinding(thread);
                                    try {
                                        html_macros.$within_html_pre$.bind(T, thread);
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
                                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt211$No_part_of_speech_information_was, $c10_wales_word$.getDynamicValue(thread));
                                                html_utilities.html_terpri(TWO_INTEGER);
                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                html_utilities.html_radio_input($str_alt212$c10_wales_or_not, $$$add, UNPROVIDED);
                                                html_utilities.html_indent(ONE_INTEGER);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt214$Enter_strings_for__S, $c10_wales_word$.getDynamicValue(thread));
                                                html_utilities.html_terpri(UNPROVIDED);
                                                html_utilities.html_radio_input($str_alt212$c10_wales_or_not, $$$back, UNPROVIDED);
                                                html_utilities.html_indent(ONE_INTEGER);
                                                html_utilities.html_princ($$$Back_to_main_lexical_entry_page);
                                                html_utilities.html_terpri(TWO_INTEGER);
                                                html_utilities.html_submit_input($$$Done, UNPROVIDED, UNPROVIDED);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_53, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                html_utilities.html_copyright_notice();
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
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject c10_wales_or_not(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type = args.first();
                if (type.equalp($$$add)) {
                    c10_add_word_info(list($c10_wales_word$.getDynamicValue(thread)));
                }
                if (type.equalp($$$back)) {
                    c10_wales(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject c10_choose_pos(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = cb_utilities.cb_guess_fort(args.first(), UNPROVIDED);
                SubLObject pos = lexicon_accessors.pos_of_word(fort, UNPROVIDED);
                if (NIL != forts.fort_p(fort)) {
                    $c10_wales_word$.setDynamicValue(fort, thread);
                    if (NIL == pos) {
                        c10_back_to_enter_strings_page(args);
                    } else {
                        if (length(pos).equal(ONE_INTEGER)) {
                            c10_add_lex_info(pos);
                        } else {
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ($$$Choose_Part_of_Speech);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                                            SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($$$Choose_Part_of_Speech);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_macros.verify_not_within_html_pre();
                                                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                {
                                                    SubLObject _prev_bind_0_56 = html_macros.$within_html_pre$.currentBinding(thread);
                                                    try {
                                                        html_macros.$within_html_pre$.bind(T, thread);
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
                                                            SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_macros.$within_html_form$.bind(T, thread);
                                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                                html_utilities.html_terpri(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                cb_utilities.cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                                html_utilities.html_markup(TWO_INTEGER);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                html_utilities.html_terpri(TWO_INTEGER);
                                                                {
                                                                    SubLObject cdolist_list_var = pos;
                                                                    SubLObject sp = NIL;
                                                                    for (sp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sp = cdolist_list_var.first()) {
                                                                        html_utilities.html_radio_input($str_alt220$c10_add_lex_info, sp, NIL);
                                                                        html_utilities.html_indent(TWO_INTEGER);
                                                                        cb_utilities.cb_form(sp, UNPROVIDED, UNPROVIDED);
                                                                        html_utilities.html_terpri(UNPROVIDED);
                                                                    }
                                                                }
                                                                html_utilities.html_terpri(TWO_INTEGER);
                                                                html_utilities.html_submit_input($$$Done, UNPROVIDED, UNPROVIDED);
                                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                            } finally {
                                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_56, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject c10_add_lex_info(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = cb_utilities.cb_guess_fort(args.first(), UNPROVIDED);
                SubLObject senses = NIL;
                $c10_wales_pos$.setDynamicValue(pos, thread);
                senses = lexicon_accessors.senses_of_wuXpos($c10_wales_word$.getDynamicValue(thread), $c10_wales_pos$.getDynamicValue(thread), $c10_wales_mt$.getDynamicValue(thread));
                {
                    SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                                SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.verify_not_within_html_pre();
                                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    {
                                        SubLObject _prev_bind_0_59 = html_macros.$within_html_pre$.currentBinding(thread);
                                        try {
                                            html_macros.$within_html_pre$.bind(T, thread);
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
                                                SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_utilities.html_terpri(UNPROVIDED);
                                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                                    html_utilities.html_hidden_input($str_alt222$c10_handle_add_lex_info, $$$T, UNPROVIDED);
                                                    html_utilities.html_reset_input($$$Restore_Values);
                                                    html_utilities.html_submit_input($$$Update_Lexicon, UNPROVIDED, UNPROVIDED);
                                                    c10_existing_ws_info(senses);
                                                    c10_new_info(UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$within_html_pre$.rebind(_prev_bind_0_59, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Formats the existing word sense information of 'Lexical Information' page
     */
    public static final SubLObject c10_existing_ws_info(SubLObject senses) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup(TWO_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            cb_utilities.cb_form($c10_wales_pos$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            html_utilities.html_princ($str_alt225$__form_of__);
            cb_utilities.cb_form($c10_wales_word$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            html_utilities.html_princ($str_alt120$__in_the__);
            cb_utilities.cb_form($c10_wales_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup(TWO_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup(THREE_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            html_utilities.html_princ($str_alt226$Existing_Word_Senses_);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup(THREE_INTEGER);
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            if (NIL == senses) {
                html_utilities.html_tab(UNPROVIDED);
                html_utilities.html_princ($str_alt227$NONE_);
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            } else {
                html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
            }
            if (NIL != senses) {
                {
                    SubLObject cdolist_list_var = senses;
                    SubLObject sense = NIL;
                    for (sense = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sense = cdolist_list_var.first()) {
                        {
                            SubLObject denots = lexicon_accessors.denots_of_sense($c10_wales_word$.getDynamicValue(thread), $c10_wales_pos$.getDynamicValue(thread), sense, $c10_wales_mt$.getDynamicValue(thread));
                            SubLObject relateds = lexicon_accessors.related_denots_of_sense($c10_wales_word$.getDynamicValue(thread), $c10_wales_pos$.getDynamicValue(thread), sense, $c10_wales_mt$.getDynamicValue(thread));
                            SubLObject placeholders = lexicon_accessors.placeholder_denots_of_sense($c10_wales_word$.getDynamicValue(thread), $c10_wales_pos$.getDynamicValue(thread), sense, $c10_wales_mt$.getDynamicValue(thread));
                            SubLObject denot = (NIL != denots) ? ((SubLObject) (denots.first())) : NIL != relateds ? ((SubLObject) (relateds.first())) : placeholders.first();
                            SubLObject denot_label = (NIL != denots) ? ((SubLObject) ($str_alt228$denotation_WS)) : NIL != relateds ? ((SubLObject) ($str_alt229$related_to_WS)) : $str_alt230$placeholder_WS;
                            SubLObject denot_input_field = format(NIL, $str_alt231$__a_S, denot_label, sense);
                            SubLObject default_denot = (NIL != forts.valid_fortP(denot)) ? ((SubLObject) (cb_utilities.cb_string_for_fort(denot))) : denot;
                            SubLObject frames = lexicon_accessors.frames_of_sense($c10_wales_word$.getDynamicValue(thread), $c10_wales_pos$.getDynamicValue(thread), sense, $c10_wales_mt$.getDynamicValue(thread));
                            SubLObject right_frames = union(lexicon_accessors.right_frames_for_pos($c10_wales_pos$.getDynamicValue(thread)), frames, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup(FOUR_INTEGER);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt232$_A_sense__A_of_, $c10_wales_pos$.getDynamicValue(thread), sense);
                            cb_utilities.cb_form($c10_wales_word$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup(FOUR_INTEGER);
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            html_utilities.html_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt233$_a_S_, denot_label, sense);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_tab(NIL != denots ? ((SubLObject) (FOUR_INTEGER)) : TWO_INTEGER);
                            if (NIL != right_frames) {
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt234$frames_WS_S_, sense);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            }
                            html_utilities.html_terpri(UNPROVIDED);
                            html_complete.html_complete_button(denot_input_field, $str_alt40$C_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_utilities.html_text_input(denot_input_field, default_denot, $int$25);
                            html_utilities.html_tab(UNPROVIDED);
                            html_utilities.html_glyph($NBSP, TWO_INTEGER);
                            if (NIL != right_frames) {
                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup($str_alt237$_choose_frame);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(THREE_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != frames) {
                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            {
                                                SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_utilities.html_princ($$$REMOVE_ALL);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
                                                        }
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                        }
                                        {
                                            SubLObject cdolist_list_var_63 = right_frames;
                                            SubLObject r_frame = NIL;
                                            for (r_frame = cdolist_list_var_63.first(); NIL != cdolist_list_var_63; cdolist_list_var_63 = cdolist_list_var_63.rest() , r_frame = cdolist_list_var_63.first()) {
                                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                {
                                                    SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(NIL, thread);
                                                        if (NIL != subl_promotions.memberP(r_frame, frames, UNPROVIDED, UNPROVIDED)) {
                                                            html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                        }
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ(cb_utilities.cb_string_for_fort(r_frame));
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                            }
                            html_utilities.html_terpri(UNPROVIDED);
                            html_utilities.html_checkbox_input(format(NIL, $str_alt239$_is_related_WS_S, sense), relateds, relateds, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt240$_Denotation_Related_To_);
                            html_utilities.html_tab(UNPROVIDED);
                            html_utilities.html_checkbox_input(format(NIL, $str_alt241$_placeholder_WS_S, sense), placeholders, placeholders, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt242$_Denotation_Placeholder_);
                            html_utilities.html_terpri(UNPROVIDED);
                            show_existing_semtrans_info(sense);
                            html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Formats the display of the semantic translation assertions for the current word sense,
     * with the contextually-redundant information removed (ie., predicate, word, and sense#).
     *
     * @unknown *within-html-pre* is set to nil to make sure <br> get used for table cells.
     * @unknown tom
     */
    public static final SubLObject show_existing_semtrans_info(SubLObject sense) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_terpri(UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt244$semtrans_WS_S_, sense);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_terpri(UNPROVIDED);
            {
                SubLObject semtrans = lexicon_accessors.semtrans_assertion_lookup($c10_wales_word$.getDynamicValue(thread), $c10_wales_pos$.getDynamicValue(thread), sense);
                if (NIL == semtrans) {
                    html_utilities.html_princ($$$none);
                    html_utilities.html_terpri(UNPROVIDED);
                }
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
                            SubLObject cdolist_list_var = semtrans;
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                {
                                    SubLObject pred = assertions_high.gaf_arg0(assertion);
                                    SubLObject formula = assertions_high.assertion_formula(assertion);
                                    SubLObject template_arg = kb_mapping_utilities.fpred_value_in_any_mt(pred, $$semTransArg, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (template_arg.numG(THREE_INTEGER)) {
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align($TOP));
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_utilities.cb_form(cycl_utilities.formula_arg(formula, subtract(template_arg, ONE_INTEGER), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                        html_utilities.html_princ($str_alt248$_);
                                                        html_utilities.html_glyph($NBSP, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align($TOP));
                                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_pre$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_pre$.bind(NIL, thread);
                                                    cb_utilities.cb_form(cycl_utilities.formula_arg(formula, template_arg, UNPROVIDED), ZERO_INTEGER, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$within_html_pre$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
                                                }
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject c10_new_info(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject next = lexicon_utilities.next_available_ws($c10_wales_word$.getDynamicValue(thread), $c10_wales_pos$.getDynamicValue(thread), UNPROVIDED);
                SubLObject right_frames = lexicon_accessors.right_frames_for_pos($c10_wales_pos$.getDynamicValue(thread));
                SubLObject denot_input_field = NIL;
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ($$$Add_New_Lexical_Information);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_complete.html_complete_script();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
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
                                SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_princ($$$Add_New_Lexical_Information);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup(THREE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_princ($str_alt250$New_Word_Senses_);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup(THREE_INTEGER);
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt251$denotation_WS_S_, next);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    html_utilities.html_tab(FOUR_INTEGER);
                                    if (NIL != right_frames) {
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt234$frames_WS_S_, next);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_terpri(UNPROVIDED);
                                    denot_input_field = format(NIL, $str_alt252$_denotation_WS_S, next);
                                    html_complete.html_complete_button(denot_input_field, $str_alt40$C_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_text_input(denot_input_field, $str_alt135$, $int$25);
                                    html_utilities.html_tab(UNPROVIDED);
                                    html_utilities.html_glyph($NBSP, TWO_INTEGER);
                                    if (NIL != right_frames) {
                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt237$_choose_frame);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(THREE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = right_frames;
                                                    SubLObject frame = NIL;
                                                    for (frame = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , frame = cdolist_list_var.first()) {
                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                        {
                                                            SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(cb_utilities.cb_string_for_fort(frame));
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_terpri(UNPROVIDED);
                                    html_utilities.html_checkbox_input(format(NIL, $str_alt253$_related_WS_S, next), NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt240$_Denotation_Related_To_);
                                    html_utilities.html_tab(UNPROVIDED);
                                    html_utilities.html_checkbox_input(format(NIL, $str_alt241$_placeholder_WS_S, next), NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt242$_Denotation_Placeholder_);
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    next = add(ONE_INTEGER, next);
                                    if (NIL != lexicon_utilities.ws_availableP($c10_wales_word$.getDynamicValue(thread), $c10_wales_pos$.getDynamicValue(thread), next, UNPROVIDED)) {
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt251$denotation_WS_S_, next);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_utilities.html_tab(FOUR_INTEGER);
                                        if (NIL != right_frames) {
                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt234$frames_WS_S_, next);
                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        }
                                        html_utilities.html_terpri(UNPROVIDED);
                                        denot_input_field = format(NIL, $str_alt252$_denotation_WS_S, next);
                                        html_complete.html_complete_button(denot_input_field, $str_alt40$C_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_utilities.html_text_input(denot_input_field, $str_alt135$, $int$25);
                                    }
                                    html_utilities.html_tab(UNPROVIDED);
                                    html_utilities.html_glyph($NBSP, TWO_INTEGER);
                                    if (NIL != right_frames) {
                                        html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt237$_choose_frame);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(THREE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = right_frames;
                                                    SubLObject frame = NIL;
                                                    for (frame = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , frame = cdolist_list_var.first()) {
                                                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                        {
                                                            SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(NIL, thread);
                                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_utilities.html_princ(cb_utilities.cb_string_for_fort(frame));
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_terpri(UNPROVIDED);
                                    html_utilities.html_checkbox_input(format(NIL, $str_alt253$_related_WS_S, next), NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt240$_Denotation_Related_To_);
                                    html_utilities.html_tab(UNPROVIDED);
                                    html_utilities.html_checkbox_input(format(NIL, $str_alt241$_placeholder_WS_S, next), NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt242$_Denotation_Placeholder_);
                                    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    html_utilities.html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return Sense number from field (assuming '<field-name-proper>-WS<num>' format)
     */
    public static final SubLObject extract_sense_number(SubLObject field_name) {
        {
            SubLObject sense = read_from_string_ignoring_errors(string_utilities.string_after(field_name, CHAR_S), NIL, NIL, UNPROVIDED, UNPROVIDED);
            if (!sense.isInteger()) {
                Errors.warn($str_alt255$field_name_convention_not_followe, field_name);
            }
            return sense;
        }
    }

    /**
     * Processes the handling of the lexical sense information update
     */
    public static final SubLObject c10_handle_add_lex_info(SubLObject args) {
        {
            SubLObject rest = args.rest();
            SubLObject denot_info = NIL;
            SubLObject related_to_senses = NIL;
            SubLObject placeholder_senses = NIL;
            SubLObject frame_info = NIL;
            SubLObject frame_ans = NIL;
            SubLObject frame_ints = NIL;
            SubLObject wsn = NIL;
            for (; NIL != rest;) {
                {
                    SubLObject field = rest.first().first();
                    SubLObject value = second(rest.first());
                    if (NIL != string_utilities.starts_with(field, $str_alt256$_denotation)) {
                        wsn = extract_sense_number(field);
                        if (value.equalp($str_alt135$)) {
                            denot_info = cons(cons(field, $str_alt257$no_denot), denot_info);
                        } else {
                            denot_info = cons(cons(field, value), denot_info);
                        }
                    }
                    if (NIL != string_utilities.starts_with(field, $str_alt258$_related)) {
                        wsn = extract_sense_number(field);
                        related_to_senses = cons(wsn, related_to_senses);
                    }
                    if (NIL != string_utilities.starts_with(field, $str_alt259$_placeholder)) {
                        wsn = extract_sense_number(field);
                        placeholder_senses = cons(wsn, placeholder_senses);
                    }
                    if (field.equalp($str_alt237$_choose_frame)) {
                        frame_info = cons(cons(field, list(value, wsn)), frame_info);
                        {
                            SubLObject item_var = wsn;
                            if (NIL == member(item_var, frame_ints, symbol_function(EQL), symbol_function(IDENTITY))) {
                                frame_ints = cons(item_var, frame_ints);
                            }
                        }
                    }
                    rest = rest.rest();
                }
            }
            {
                SubLObject cdolist_list_var = frame_ints;
                SubLObject frame_int = NIL;
                for (frame_int = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , frame_int = cdolist_list_var.first()) {
                    frame_ans = cons(remove(frame_int, frame_info, symbol_function(NOT_EQ), symbol_function(THIRD), UNPROVIDED, UNPROVIDED, UNPROVIDED), frame_ans);
                }
            }
            {
                SubLObject cdolist_list_var = nreverse(denot_info);
                SubLObject info = NIL;
                for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                    {
                        SubLObject wsn_76 = extract_sense_number(info.first());
                        SubLObject is_related_toP = member(wsn_76, related_to_senses, UNPROVIDED, UNPROVIDED);
                        SubLObject is_placeholderP = member(wsn_76, placeholder_senses, UNPROVIDED, UNPROVIDED);
                        SubLObject denot_type = (NIL != is_related_toP) ? ((SubLObject) ($RELATED)) : NIL != is_placeholderP ? ((SubLObject) ($ANY)) : $DENOT;
                        set_denot_info(wsn_76, info, denot_type);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = frame_ans;
                SubLObject info = NIL;
                for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                    set_frame_info(info);
                }
            }
        }
        c10_wales(UNPROVIDED);
        return NIL;
    }

    /**
     * Perform the denotation specified in the denotation-spec (<wales-field> . <fort-spec>)
     */
    public static final SubLObject set_denot_info(SubLObject sense, SubLObject info_list, SubLObject denot_type) {
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assert_ok = NIL;
                if (!info_list.rest().equalp($str_alt257$no_denot)) {
                    {
                        SubLObject denot_spec = string_utilities.cyclify_string(info_list.rest());
                        SubLObject denot_value = read_from_string_ignoring_errors(denot_spec, NIL, NIL, UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                            try {
                                api_control_vars.$use_local_queueP$.bind(NIL, thread);
                                {
                                    SubLObject v_term = (denot_value.isNumber()) ? ((SubLObject) (denot_value)) : cb_utilities.cb_guess_fort(denot_spec, UNPROVIDED);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject valid = (NIL != function_terms.nat_formula_p(denot_value)) ? ((SubLObject) (do_nat_denotation(sense, v_term, denot_value, denot_spec, denot_type))) : do_constant_denotation(sense, v_term, denot_type);
                                        SubLObject explanation = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL == valid) {
                                            cb_utilities.cb_error($str_alt266$_S_is_not_a_valid_denotation____a, denot_spec, explanation, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            assert_ok = T;
                                        }
                                    }
                                }
                            } finally {
                                api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return assert_ok;
            }
        }
    }

    /**
     * Perform the denotation of the current wales sense to a constant term.
     *
     * @return Multiple values: boolean status for assertion and error message if not good
     */
    public static final SubLObject do_constant_denotation(SubLObject sense, SubLObject v_term, SubLObject denot_type) {
        if (denot_type == UNPROVIDED) {
            denot_type = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return values(lexicon_utilities.set_denot($c10_wales_word$.getDynamicValue(thread), $c10_wales_pos$.getDynamicValue(thread), sense, v_term, $c10_wales_mt$.getDynamicValue(thread), denot_type), $str_alt135$);
        }
    }

    /**
     * Performs the denotation for the current word into a NAT.
     */
    public static final SubLObject do_nat_denotation(SubLObject sense, SubLObject v_term, SubLObject denot_value, SubLObject specification, SubLObject denot_type) {
        if (denot_type == UNPROVIDED) {
            denot_type = $DENOT;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject valid_denot = T;
                SubLObject assert_ok = NIL;
                SubLObject reason = $str_alt135$;
                if (NIL == forts.fort_p(v_term)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject valid = lexicon_utilities.check_denot($c10_wales_word$.getDynamicValue(thread), $c10_wales_pos$.getDynamicValue(thread), sense, denot_value, $c10_wales_mt$.getDynamicValue(thread), denot_type);
                        SubLObject explanation = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        valid_denot = valid;
                        reason = explanation;
                    }
                    if (NIL != valid_denot) {
                        czer_main.cyc_find_or_create_nart(denot_value, UNPROVIDED);
                        v_term = cb_utilities.cb_guess_fort(specification, UNPROVIDED);
                    }
                }
                if (NIL != valid_denot) {
                    assert_ok = lexicon_utilities.set_denot($c10_wales_word$.getDynamicValue(thread), $c10_wales_pos$.getDynamicValue(thread), sense, v_term, $c10_wales_mt$.getDynamicValue(thread), denot_type);
                }
                return values(assert_ok, reason);
            }
        }
    }

    public static final SubLObject set_frame_info(SubLObject info_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sense = third(info_list.first());
                SubLObject frames = NIL;
                SubLObject cdolist_list_var = info_list;
                SubLObject info = NIL;
                for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                    {
                        SubLObject item_var = cb_utilities.cb_guess_fort(second(info), UNPROVIDED);
                        if (NIL == member(item_var, frames, symbol_function(EQL), symbol_function(IDENTITY))) {
                            frames = cons(item_var, frames);
                        }
                    }
                }
                lexicon_utilities.set_frames($c10_wales_word$.getDynamicValue(thread), $c10_wales_pos$.getDynamicValue(thread), sense, frames, $c10_wales_mt$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    public static final SubLObject multi_word_string_assertions(SubLObject phrase, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(phrase, STRINGP);
            {
                SubLObject strings = preprocessor.preprocess_phrase(phrase);
                SubLObject mw_strings = NIL;
                SubLObject mw_sems = NIL;
                if (strings.isCons()) {
                    {
                        SubLObject butlast_strings = butlast(strings, UNPROVIDED);
                        SubLObject butlast_length = length(butlast_strings);
                        SubLObject last_string = last(strings, UNPROVIDED).first();
                        SubLObject last_words = lexicon_cache.words_of_string(last_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = last_words;
                        SubLObject last_word = NIL;
                        for (last_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , last_word = cdolist_list_var.first()) {
                            {
                                SubLObject word_pos = lexicon_accessors.pos_of_stringXword(last_string, last_word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                        mt_relevance_macros.$mt$.bind(mt, thread);
                                        {
                                            SubLObject pred_var = $$multiWordString;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(last_word, TWO_INTEGER, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(last_word, TWO_INTEGER, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                        {
                                                                            SubLObject done_var_77 = NIL;
                                                                            SubLObject token_var_78 = NIL;
                                                                            while (NIL == done_var_77) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_78);
                                                                                    SubLObject valid_79 = makeBoolean(token_var_78 != assertion);
                                                                                    if (NIL != valid_79) {
                                                                                        {
                                                                                            SubLObject assertion_pos = assertions_high.gaf_arg3(assertion);
                                                                                            if (NIL != find(assertion_pos, word_pos, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                                                {
                                                                                                    SubLObject prefix_strings = lexicon_utilities.get_leading_strings_from_formula(assertions_high.gaf_formula(assertion));
                                                                                                    SubLObject prefix_length = length(prefix_strings);
                                                                                                    if (prefix_length.numE(butlast_length) && prefix_strings.equalp(butlast_strings)) {
                                                                                                        mw_strings = cons(assertion, mw_strings);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_77 = makeBoolean(NIL == valid_79);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_80 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_80, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                        mt_relevance_macros.$mt$.bind(mt, thread);
                                        {
                                            SubLObject pred_var = $$multiWordSemTrans;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(last_word, TWO_INTEGER, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(last_word, TWO_INTEGER, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                        {
                                                                            SubLObject done_var_81 = NIL;
                                                                            SubLObject token_var_82 = NIL;
                                                                            while (NIL == done_var_81) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_82);
                                                                                    SubLObject valid_83 = makeBoolean(token_var_82 != assertion);
                                                                                    if (NIL != valid_83) {
                                                                                        {
                                                                                            SubLObject assertion_pos = assertions_high.gaf_arg3(assertion);
                                                                                            if (NIL != find(assertion_pos, word_pos, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                                                {
                                                                                                    SubLObject prefix_strings = lexicon_utilities.get_leading_strings_from_formula(assertions_high.gaf_formula(assertion));
                                                                                                    SubLObject prefix_length = length(prefix_strings);
                                                                                                    if (prefix_length.numE(butlast_length) && prefix_strings.equalp(butlast_strings)) {
                                                                                                        mw_sems = cons(assertion, mw_sems);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_81 = makeBoolean(NIL == valid_83);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_84, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return nconc(mw_strings, mw_sems);
            }
        }
    }

    public static final SubLObject compound_string_assertions(SubLObject phrase, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(phrase, STRINGP);
            {
                SubLObject strings = preprocessor.preprocess_phrase(phrase);
                SubLObject compound_strings = NIL;
                SubLObject compound_sems = NIL;
                SubLObject compound_verb_sems = NIL;
                if (strings.isCons()) {
                    {
                        SubLObject rest_strings = strings.rest();
                        SubLObject rest_length = length(rest_strings);
                        SubLObject first_string = strings.first();
                        SubLObject first_words = lexicon_cache.words_of_string(first_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject cdolist_list_var = first_words;
                        SubLObject first_word = NIL;
                        for (first_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , first_word = cdolist_list_var.first()) {
                            {
                                SubLObject word_pos = lexicon_accessors.pos_of_stringXword(first_string, first_word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                        mt_relevance_macros.$mt$.bind(mt, thread);
                                        {
                                            SubLObject pred_var = $$compoundString;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(first_word, ONE_INTEGER, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(first_word, ONE_INTEGER, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                        {
                                                                            SubLObject done_var_85 = NIL;
                                                                            SubLObject token_var_86 = NIL;
                                                                            while (NIL == done_var_85) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_86);
                                                                                    SubLObject valid_87 = makeBoolean(token_var_86 != assertion);
                                                                                    if (NIL != valid_87) {
                                                                                        {
                                                                                            SubLObject assertion_pos = assertions_high.gaf_arg3(assertion);
                                                                                            if (NIL != find(assertion_pos, word_pos, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                                                {
                                                                                                    SubLObject postfix_strings = lexicon_utilities.get_following_strings_from_formula(assertions_high.gaf_formula(assertion));
                                                                                                    SubLObject postfix_length = length(postfix_strings);
                                                                                                    if (postfix_length.numE(rest_length) && postfix_strings.equalp(rest_strings)) {
                                                                                                        compound_strings = cons(assertion, compound_strings);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_85 = makeBoolean(NIL == valid_87);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_88 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_88, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                                        mt_relevance_macros.$mt$.bind(mt, thread);
                                        {
                                            SubLObject pred_var = $$compoundStringSemTrans;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(first_word, ONE_INTEGER, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(first_word, ONE_INTEGER, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                        {
                                                                            SubLObject done_var_89 = NIL;
                                                                            SubLObject token_var_90 = NIL;
                                                                            while (NIL == done_var_89) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_90);
                                                                                    SubLObject valid_91 = makeBoolean(token_var_90 != assertion);
                                                                                    if (NIL != valid_91) {
                                                                                        {
                                                                                            SubLObject assertion_pos = assertions_high.gaf_arg3(assertion);
                                                                                            if (NIL != find(assertion_pos, word_pos, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                                                {
                                                                                                    SubLObject postfix_strings = lexicon_utilities.get_following_strings_from_formula(assertions_high.gaf_formula(assertion));
                                                                                                    SubLObject postfix_length = length(postfix_strings);
                                                                                                    if (postfix_length.numE(rest_length) && postfix_strings.equalp(rest_strings)) {
                                                                                                        compound_sems = cons(assertion, compound_sems);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_89 = makeBoolean(NIL == valid_91);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_92 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_92, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return nconc(compound_strings, compound_sems, compound_verb_sems);
            }
        }
    }

    public static final SubLObject declare_wales_file() {
        declareFunction("c10_wales", "C10-WALES", 0, 1, false);
        declareFunction("c10_handle_wales", "C10-HANDLE-WALES", 1, 0, false);
        declareFunction("c10_handle_wales_gen", "C10-HANDLE-WALES-GEN", 1, 0, false);
        declareFunction("c10_handle_phrase", "C10-HANDLE-PHRASE", 1, 0, false);
        declareFunction("c10_name_string", "C10-NAME-STRING", 1, 0, false);
        declareFunction("c10_add_name_string", "C10-ADD-NAME-STRING", 1, 0, false);
        declareFunction("c10_edit_mw", "C10-EDIT-MW", 1, 0, false);
        declareFunction("c10_edit_cd", "C10-EDIT-CD", 1, 0, false);
        declareFunction("c10_edit_gen_assertion", "C10-EDIT-GEN-ASSERTION", 1, 0, false);
        declareFunction("c10_add_new_mw", "C10-ADD-NEW-MW", 1, 0, false);
        declareFunction("c10_add_new_gen_assertion", "C10-ADD-NEW-GEN-ASSERTION", 1, 0, false);
        declareFunction("c10_add_new_pgu", "C10-ADD-NEW-PGU", 1, 0, false);
        declareFunction("c10_confirm_word", "C10-CONFIRM-WORD", 1, 0, false);
        declareFunction("c10_create_word", "C10-CREATE-WORD", 1, 0, false);
        declareFunction("is_english_lexical_mtP", "IS-ENGLISH-LEXICAL-MT?", 1, 0, false);
        declareFunction("c10_handle_create_word", "C10-HANDLE-CREATE-WORD", 1, 0, false);
        declareFunction("c10_add_word_info", "C10-ADD-WORD-INFO", 1, 0, false);
        declareFunction("c10_add_reg_word_info", "C10-ADD-REG-WORD-INFO", 1, 0, false);
        declareFunction("c10_noun_info", "C10-NOUN-INFO", 1, 0, false);
        declareFunction("c10_reg_noun_info", "C10-REG-NOUN-INFO", 1, 0, false);
        declareFunction("c10_reg_mass_noun_info", "C10-REG-MASS-NOUN-INFO", 1, 0, false);
        declareFunction("c10_proper_noun_info", "C10-PROPER-NOUN-INFO", 1, 0, false);
        declareFunction("c10_agentive_noun_info", "C10-AGENTIVE-NOUN-INFO", 1, 0, false);
        declareFunction("c10_reg_agentive_noun_info", "C10-REG-AGENTIVE-NOUN-INFO", 1, 0, false);
        declareFunction("c10_verb_info", "C10-VERB-INFO", 1, 0, false);
        declareFunction("c10_reg_verb_info", "C10-REG-VERB-INFO", 1, 0, false);
        declareFunction("c10_adjective_info", "C10-ADJECTIVE-INFO", 1, 0, false);
        declareFunction("c10_reg_adj_info", "C10-REG-ADJ-INFO", 1, 0, false);
        declareFunction("c10_adverb_info", "C10-ADVERB-INFO", 1, 0, false);
        declareFunction("c10_reg_adv_info", "C10-REG-ADV-INFO", 1, 0, false);
        declareFunction("c10_handle_add_word_info", "C10-HANDLE-ADD-WORD-INFO", 1, 0, false);
        declareFunction("set_lexical_info_1", "SET-LEXICAL-INFO-1", 3, 1, false);
        declareFunction("c10_confirm_lex_word", "C10-CONFIRM-LEX-WORD", 1, 0, false);
        declareFunction("c10_back_to_enter_strings_page", "C10-BACK-TO-ENTER-STRINGS-PAGE", 1, 0, false);
        declareFunction("c10_wales_or_not", "C10-WALES-OR-NOT", 1, 0, false);
        declareFunction("c10_choose_pos", "C10-CHOOSE-POS", 1, 0, false);
        declareFunction("c10_add_lex_info", "C10-ADD-LEX-INFO", 1, 0, false);
        declareFunction("c10_existing_ws_info", "C10-EXISTING-WS-INFO", 1, 0, false);
        declareFunction("show_existing_semtrans_info", "SHOW-EXISTING-SEMTRANS-INFO", 1, 0, false);
        declareFunction("c10_new_info", "C10-NEW-INFO", 0, 1, false);
        declareFunction("extract_sense_number", "EXTRACT-SENSE-NUMBER", 1, 0, false);
        declareFunction("c10_handle_add_lex_info", "C10-HANDLE-ADD-LEX-INFO", 1, 0, false);
        declareFunction("set_denot_info", "SET-DENOT-INFO", 2, 1, false);
        declareFunction("do_constant_denotation", "DO-CONSTANT-DENOTATION", 2, 1, false);
        declareFunction("do_nat_denotation", "DO-NAT-DENOTATION", 4, 1, false);
        declareFunction("set_frame_info", "SET-FRAME-INFO", 1, 0, false);
        declareFunction("multi_word_string_assertions", "MULTI-WORD-STRING-ASSERTIONS", 1, 1, false);
        declareFunction("compound_string_assertions", "COMPOUND-STRING-ASSERTIONS", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_wales_file() {
        defparameter("*C10-WALES-STRING*", NIL);
        defparameter("*C10-WALES-WORD*", NIL);
        defparameter("*C10-WALES-POS*", NIL);
        defparameter("*REGULAR-WALES-STRING?*", NIL);
        defparameter("*WALES-NOUN-STEM*", NIL);
        defparameter("*WALES-VERB-STEM*", NIL);
        defparameter("*C10-WALES-MT*", $$GeneralEnglishMt);
        defparameter("*C10-WALES-GEN-COL*", NIL);
        defparameter("*C10-WALES-GEN-MT*", $$EnglishParaphraseMt);
        return NIL;
    }

    public static final SubLObject setup_wales_file() {
                utilities_macros.register_html_state_variable($sym0$_C10_WALES_STRING_);
        utilities_macros.register_html_state_variable($sym1$_C10_WALES_WORD_);
        utilities_macros.register_html_state_variable($sym2$_C10_WALES_POS_);
        utilities_macros.register_html_state_variable($sym3$_REGULAR_WALES_STRING__);
        utilities_macros.register_html_state_variable($wales_noun_stem$);
        utilities_macros.register_html_state_variable($wales_verb_stem$);
        utilities_macros.register_html_state_variable($sym7$_C10_WALES_MT_);
        utilities_macros.register_html_state_variable($sym8$_C10_WALES_GEN_COL_);
        utilities_macros.register_html_state_variable($sym10$_C10_WALES_GEN_MT_);
        sethash($WALES, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str_alt12$wales_html, NIL));
        html_macros.note_html_handler_function(C10_WALES);
        html_macros.note_html_handler_function(C10_HANDLE_WALES);
        html_macros.note_html_handler_function(C10_HANDLE_WALES_GEN);
        html_macros.note_html_handler_function(C10_HANDLE_PHRASE);
        html_macros.note_html_handler_function(C10_NAME_STRING);
        html_macros.note_html_handler_function(C10_ADD_NAME_STRING);
        html_macros.note_html_handler_function(C10_EDIT_MW);
        html_macros.note_html_handler_function(C10_EDIT_CD);
        html_macros.note_html_handler_function(C10_EDIT_GEN_ASSERTION);
        html_macros.note_html_handler_function(C10_ADD_NEW_MW);
        html_macros.note_html_handler_function(C10_ADD_NEW_GEN_ASSERTION);
        html_macros.note_html_handler_function(C10_ADD_NEW_PGU);
        html_macros.note_html_handler_function(C10_CONFIRM_WORD);
        html_macros.note_html_handler_function(C10_CREATE_WORD);
        html_macros.note_html_handler_function(C10_HANDLE_CREATE_WORD);
        html_macros.note_html_handler_function(C10_ADD_WORD_INFO);
        html_macros.note_html_handler_function(C10_ADD_REG_WORD_INFO);
        html_macros.note_html_handler_function(C10_NOUN_INFO);
        html_macros.note_html_handler_function(C10_REG_NOUN_INFO);
        html_macros.note_html_handler_function(C10_REG_MASS_NOUN_INFO);
        html_macros.note_html_handler_function(C10_PROPER_NOUN_INFO);
        html_macros.note_html_handler_function(C10_AGENTIVE_NOUN_INFO);
        html_macros.note_html_handler_function(C10_REG_AGENTIVE_NOUN_INFO);
        html_macros.note_html_handler_function(C10_VERB_INFO);
        html_macros.note_html_handler_function(C10_REG_VERB_INFO);
        html_macros.note_html_handler_function(C10_ADJECTIVE_INFO);
        html_macros.note_html_handler_function(C10_REG_ADJ_INFO);
        html_macros.note_html_handler_function(C10_ADVERB_INFO);
        html_macros.note_html_handler_function(C10_REG_ADV_INFO);
        html_macros.note_html_handler_function(C10_HANDLE_ADD_WORD_INFO);
        html_macros.note_html_handler_function(C10_CONFIRM_LEX_WORD);
        html_macros.note_html_handler_function(C10_BACK_TO_ENTER_STRINGS_PAGE);
        html_macros.note_html_handler_function(C10_WALES_OR_NOT);
        html_macros.note_html_handler_function(C10_CHOOSE_POS);
        html_macros.note_html_handler_function(C10_ADD_LEX_INFO);
        html_macros.note_html_handler_function(C10_EXISTING_WS_INFO);
        html_macros.note_html_handler_function(C10_NEW_INFO);
        html_macros.note_html_handler_function(C10_HANDLE_ADD_LEX_INFO);
        return NIL;
    }

    // // Internal Constants
    static private final SubLSymbol $sym0$_C10_WALES_STRING_ = makeSymbol("*C10-WALES-STRING*");

    static private final SubLSymbol $sym1$_C10_WALES_WORD_ = makeSymbol("*C10-WALES-WORD*");

    static private final SubLSymbol $sym2$_C10_WALES_POS_ = makeSymbol("*C10-WALES-POS*");

    static private final SubLSymbol $sym3$_REGULAR_WALES_STRING__ = makeSymbol("*REGULAR-WALES-STRING?*");

    public static final SubLSymbol $wales_noun_stem$ = makeSymbol("*WALES-NOUN-STEM*");

    public static final SubLSymbol $wales_verb_stem$ = makeSymbol("*WALES-VERB-STEM*");

    public static final SubLObject $$GeneralEnglishMt = constant_handles.reader_make_constant_shell(makeString("GeneralEnglishMt"));

    static private final SubLSymbol $sym7$_C10_WALES_MT_ = makeSymbol("*C10-WALES-MT*");

    static private final SubLSymbol $sym8$_C10_WALES_GEN_COL_ = makeSymbol("*C10-WALES-GEN-COL*");

    public static final SubLObject $$EnglishParaphraseMt = constant_handles.reader_make_constant_shell(makeString("EnglishParaphraseMt"));

    static private final SubLSymbol $sym10$_C10_WALES_GEN_MT_ = makeSymbol("*C10-WALES-GEN-MT*");

    private static final SubLSymbol $WALES = makeKeyword("WALES");

    static private final SubLString $str_alt12$wales_html = makeString("wales.html");

    public static final SubLObject $$LexicalMicrotheory = constant_handles.reader_make_constant_shell(makeString("LexicalMicrotheory"));

    private static final SubLSymbol CB_STRING_FOR_FORT = makeSymbol("CB-STRING-FOR-FORT");

    static private final SubLSymbol $sym15$STRING_ = makeSymbol("STRING<");

    static private final SubLString $str_alt16$Wales__the_Cyc_lexicon_tool_ = makeString("Wales, the Cyc lexicon tool,");

    static private final SubLString $$$Add_to_Cyc_Lexicon = makeString("Add to Cyc Lexicon");

    static private final SubLString $$$Lexicon_Information = makeString("Lexicon Information");

    static private final SubLString $str_alt19$Enter_word__ = makeString("Enter word: ");

    static private final SubLString $str_alt20$c10_handle_wales = makeString("c10-handle-wales");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $$$Add_Info = makeString("Add Info");

    static private final SubLString $$$Reset = makeString("Reset");

    static private final SubLString $str_alt24$_add_stuff = makeString(":add-stuff");

    static private final SubLString $str_alt25$reg_strings = makeString("reg-strings");

    static private final SubLString $str_alt26$_Add_regular_strings_to_lexicon = makeString(" Add regular strings to lexicon");

    static private final SubLString $$$strings = makeString("strings");

    static private final SubLString $str_alt28$_Add_irregular_strings_to_lexicon = makeString(" Add irregular strings to lexicon");

    static private final SubLString $$$frames = makeString("frames");

    static private final SubLString $str_alt30$_Add_other_lexical_information = makeString(" Add other lexical information");

    static private final SubLString $$$phrase = makeString("phrase");

    static private final SubLString $str_alt32$_Add_a_multi_word_phrase = makeString(" Add a multi-word phrase");

    static private final SubLString $$$name_string = makeString("name string");

    static private final SubLString $str_alt34$_Add_a_proper_name_string = makeString(" Add a proper name string");

    static private final SubLString $str_alt35$Choose_Mt__ = makeString("Choose Mt: ");

    static private final SubLString $str_alt36$choose_mt = makeString("choose-mt");

    static private final SubLString $$$Generation_Information = makeString("Generation Information");

    static private final SubLString $str_alt38$Enter_constant__ = makeString("Enter constant: ");

    static private final SubLString $str_alt39$c10_handle_wales_gen = makeString("c10-handle-wales-gen");

    static private final SubLString $str_alt40$C_ = makeString("C ");

    static private final SubLString $str_alt41$Last_word__ = makeString("Last word: ");

    private static final SubLSymbol C10_WALES = makeSymbol("C10-WALES");

    static private final SubLString $str_alt43$_S_was_not_a_string = makeString("~S was not a string");

    private static final SubLSymbol C10_HANDLE_WALES = makeSymbol("C10-HANDLE-WALES");

    static private final SubLString $str_alt45$_S_did_not_specify_a_Cyc_term = makeString("~S did not specify a Cyc term");

    static private final SubLString $$$Add_Generation_Information = makeString("Add Generation Information");

    static private final SubLString $str_alt47$Words_denoting_ = makeString("Words denoting ");

    static private final SubLString $str_alt48$____ = makeString(" :  ");

    static private final SubLString $str_alt49$Edit_Existing___preferredGenUnit_ = makeString("Edit Existing #$preferredGenUnit Assertions");

    static private final SubLString $str_alt50$Mt___ = makeString("Mt : ");

    static private final SubLString $str_alt51$c10_edit_gen_assertion = makeString("c10-edit-gen-assertion");

    static private final SubLString $$$formula = makeString("formula");

    public static final SubLInteger $int$80 = makeInteger(80);

    static private final SubLString $$$Assert = makeString("Assert");

    static private final SubLString $str_alt55$Add_New___preferredGenUnit_Assert = makeString("Add New #$preferredGenUnit Assertion");

    static private final SubLString $str_alt56$Enter_word_unit____ = makeString("Enter word unit:   ");

    static private final SubLString $str_alt57$c10_add_new_pgu = makeString("c10-add-new-pgu");

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $str_alt59$Choose_Part_of_Speech__ = makeString("Choose Part of Speech: ");

    static private final SubLString $str_alt60$_choose_pos = makeString(":choose-pos");

    static private final SubLList $list_alt61 = list(constant_handles.reader_make_constant_shell(makeString("CountNoun")), constant_handles.reader_make_constant_shell(makeString("AgentiveNoun")), constant_handles.reader_make_constant_shell(makeString("MassNoun")), constant_handles.reader_make_constant_shell(makeString("ProperCountNoun")), constant_handles.reader_make_constant_shell(makeString("ProperMassNoun")), constant_handles.reader_make_constant_shell(makeString("Adjective")), constant_handles.reader_make_constant_shell(makeString("Verb")), constant_handles.reader_make_constant_shell(makeString("Adverb")));

    static private final SubLString $str_alt62$Edit_Existing___genFormat_Asserti = makeString("Edit Existing #$genFormat Assertions");

    static private final SubLString $str_alt63$Add_New___genFormat_Assertion = makeString("Add New #$genFormat Assertion");

    static private final SubLString $str_alt64$c10_add_new_gen_assertion = makeString("c10-add-new-gen-assertion");

    static private final SubLString $str_alt65$Edit_Existing___genPhrase_Asserti = makeString("Edit Existing #$genPhrase Assertions");

    static private final SubLString $str_alt66$Add_New___genPhrase_Assertion = makeString("Add New #$genPhrase Assertion");

    private static final SubLSymbol C10_HANDLE_WALES_GEN = makeSymbol("C10-HANDLE-WALES-GEN");

    static private final SubLString $str_alt68$Add_a_multi_word_phrase = makeString("Add a multi-word phrase");

    static private final SubLString $$$Existing_Assertions = makeString("Existing Assertions");

    static private final SubLString $str_alt70$c10_edit_mw = makeString("c10-edit-mw");

    public static final SubLInteger $int$70 = makeInteger(70);

    static private final SubLString $str_alt72$c10_edit_cd = makeString("c10-edit-cd");

    static private final SubLString $$$Add_New_Assertion = makeString("Add New Assertion");

    static private final SubLString $str_alt74$c10_add_new_mw = makeString("c10-add-new-mw");

    private static final SubLSymbol C10_HANDLE_PHRASE = makeSymbol("C10-HANDLE-PHRASE");

    static private final SubLString $$$Add_a_Proper_Name_String = makeString("Add a Proper Name String");

    static private final SubLString $str_alt77$Existing_Denotations_ = makeString("Existing Denotations:");

    static private final SubLString $str_alt78$c10_add_name_string = makeString("c10-add-name-string");

    static private final SubLString $str_alt79$Add_New_Denotation_ = makeString("Add New Denotation:");

    static private final SubLString $str_alt80$name_string = makeString("name-string");

    public static final SubLInteger $int$35 = makeInteger(35);

    private static final SubLSymbol C10_NAME_STRING = makeSymbol("C10-NAME-STRING");

    static private final SubLString $str_alt83$_S_did_not_specify_a_constant_ = makeString("~S did not specify a constant.");

    public static final SubLObject $$nameString = constant_handles.reader_make_constant_shell(makeString("nameString"));

    private static final SubLSymbol C10_ADD_NAME_STRING = makeSymbol("C10-ADD-NAME-STRING");

    static private final SubLString $str_alt86$Bad_formula__probably_due_to_a_mi = makeString("Bad formula, probably due to a misspelling.~%Check these inputs:~%~%~s");

    static private final SubLString $str_alt87$Can_t_determine_old_assertion__wh = makeString("Can't determine old assertion (why?).~%Check these inputs:~%~%~s");

    private static final SubLSymbol C10_EDIT_MW = makeSymbol("C10-EDIT-MW");

    private static final SubLSymbol C10_EDIT_CD = makeSymbol("C10-EDIT-CD");

    private static final SubLSymbol C10_EDIT_GEN_ASSERTION = makeSymbol("C10-EDIT-GEN-ASSERTION");





    private static final SubLSymbol C10_ADD_NEW_MW = makeSymbol("C10-ADD-NEW-MW");

    private static final SubLSymbol C10_ADD_NEW_GEN_ASSERTION = makeSymbol("C10-ADD-NEW-GEN-ASSERTION");

    static private final SubLString $str_alt95$_s_did_not_specify_a_Cyc_constant = makeString("~s did not specify a Cyc constant.");

    public static final SubLObject $$preferredGenUnit = constant_handles.reader_make_constant_shell(makeString("preferredGenUnit"));

    private static final SubLSymbol C10_ADD_NEW_PGU = makeSymbol("C10-ADD-NEW-PGU");

    static private final SubLString $$$Choose_Word_Unit = makeString("Choose Word Unit");

    static private final SubLString $$$Choose_the_correct_word_unit = makeString("Choose the correct word unit");

    static private final SubLString $str_alt100$c10_add_word_info = makeString("c10-add-word-info");

    static private final SubLString $$$NIL = makeString("NIL");

    static private final SubLString $$$Create_a_new_word = makeString("Create a new word");

    static private final SubLString $$$Done = makeString("Done");

    private static final SubLSymbol C10_CONFIRM_WORD = makeSymbol("C10-CONFIRM-WORD");

    static private final SubLString $$$Create_New_Word_Unit = makeString("Create New Word Unit");

    static private final SubLString $str_alt106$No_word_unit_for__s_currently_exi = makeString("No word unit for ~s currently exists");

    static private final SubLString $str_alt107$Unit_name___ = makeString("Unit name:  ");

    static private final SubLString $str_alt108$c10_handle_create_word = makeString("c10-handle-create-word");

    static private final SubLString $$$Create = makeString("Create");

    private static final SubLSymbol C10_CREATE_WORD = makeSymbol("C10-CREATE-WORD");

    public static final SubLObject $$EnglishLexicalMicrotheory = constant_handles.reader_make_constant_shell(makeString("EnglishLexicalMicrotheory"));

    static private final SubLString $str_alt112$There_already_exists_a_constant_n = makeString("There already exists a constant named ~S");

    public static final SubLObject $$EnglishWord = constant_handles.reader_make_constant_shell(makeString("EnglishWord"));

    public static final SubLObject $$LexicalWord = constant_handles.reader_make_constant_shell(makeString("LexicalWord"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));



    static private final SubLString $str_alt117$Unable_to_create_a_constant_for__ = makeString("Unable to create a constant for ~S (Why?)");

    private static final SubLSymbol C10_HANDLE_CREATE_WORD = makeSymbol("C10-HANDLE-CREATE-WORD");

    static private final SubLString $str_alt119$Add_Strings_for__S = makeString("Add Strings for ~S");

    static private final SubLString $str_alt120$__in_the__ = makeString("  in the  ");

    static private final SubLString $str_alt121$c10_handle_add_word_info = makeString("c10-handle-add-word-info");

    static private final SubLString $$$T = makeString("T");

    static private final SubLString $$$update = makeString("update");

    static private final SubLString $str_alt124$_Update_Lexicon = makeString(" Update Lexicon");

    static private final SubLString $$$semantics = makeString("semantics");

    static private final SubLString $str_alt126$_Go_to_Add_Other_Lexical_Informat = makeString(" Go to Add Other Lexical Information");

    static private final SubLString $$$Do_It = makeString("Do It");

    static private final SubLString $$$Restore_Values = makeString("Restore Values");

    private static final SubLSymbol C10_ADD_WORD_INFO = makeSymbol("C10-ADD-WORD-INFO");

    static private final SubLString $str_alt130$_Go_to_Add_Semantic_Info = makeString(" Go to Add Semantic Info");

    private static final SubLSymbol C10_ADD_REG_WORD_INFO = makeSymbol("C10-ADD-REG-WORD-INFO");

    static private final SubLString $$$Simple_Noun_Form = makeString("Simple Noun Form");

    static private final SubLString $str_alt133$sing_ = makeString("sing:");

    static private final SubLString $str_alt134$_singular = makeString(":singular");

    static private final SubLString $str_alt135$ = makeString("");

    static private final SubLString $str_alt136$plur_ = makeString("plur:");

    static private final SubLString $str_alt137$_plural = makeString(":plural");

    static private final SubLString $str_alt138$mass_ = makeString("mass:");

    static private final SubLString $str_alt139$_mass = makeString(":mass");

    private static final SubLSymbol C10_NOUN_INFO = makeSymbol("C10-NOUN-INFO");

    private static final SubLSymbol C10_REG_NOUN_INFO = makeSymbol("C10-REG-NOUN-INFO");

    static private final SubLString $$$Mass_Noun_Form = makeString("Mass Noun Form");

    private static final SubLSymbol C10_REG_MASS_NOUN_INFO = makeSymbol("C10-REG-MASS-NOUN-INFO");

    static private final SubLString $$$Proper_Noun_Form = makeString("Proper Noun Form");

    static private final SubLString $str_alt145$_p_singular = makeString(":p-singular");

    static private final SubLString $str_alt146$_p_plural = makeString(":p-plural");

    static private final SubLString $str_alt147$_p_mass = makeString(":p-mass");

    private static final SubLSymbol C10_PROPER_NOUN_INFO = makeSymbol("C10-PROPER-NOUN-INFO");

    static private final SubLString $$$Agentive_Noun_Form = makeString("Agentive Noun Form");

    static private final SubLString $str_alt150$_ag_singular = makeString(":ag-singular");

    static private final SubLString $str_alt151$_ag_plural = makeString(":ag-plural");

    static private final SubLString $str_alt152$_ag_mass = makeString(":ag-mass");

    private static final SubLSymbol C10_AGENTIVE_NOUN_INFO = makeSymbol("C10-AGENTIVE-NOUN-INFO");

    private static final SubLSymbol C10_REG_AGENTIVE_NOUN_INFO = makeSymbol("C10-REG-AGENTIVE-NOUN-INFO");

    static private final SubLString $$$Verb_Form = makeString("Verb Form");

    static private final SubLString $str_alt156$infin_ = makeString("infin:");

    static private final SubLString $str_alt157$_infinitive = makeString(":infinitive");

    static private final SubLString $str_alt158$3rd_ = makeString("3rd:");

    static private final SubLString $str_alt159$_third_sing = makeString(":third-sing");

    static private final SubLString $str_alt160$prog_ = makeString("prog:");

    static private final SubLString $str_alt161$_progressive = makeString(":progressive");

    static private final SubLString $str_alt162$past_ = makeString("past:");

    static private final SubLString $str_alt163$_past = makeString(":past");

    static private final SubLString $str_alt164$perf_ = makeString("perf:");

    static private final SubLString $str_alt165$_perfect = makeString(":perfect");

    private static final SubLSymbol C10_VERB_INFO = makeSymbol("C10-VERB-INFO");

    private static final SubLSymbol C10_REG_VERB_INFO = makeSymbol("C10-REG-VERB-INFO");

    static private final SubLString $$$Adjective_Form = makeString("Adjective Form");

    static private final SubLString $str_alt169$reg_ = makeString("reg:");

    static private final SubLString $str_alt170$_regular = makeString(":regular");

    static private final SubLString $str_alt171$comp_ = makeString("comp:");

    static private final SubLString $str_alt172$_comparative = makeString(":comparative");

    static private final SubLString $str_alt173$sup_ = makeString("sup:");

    static private final SubLString $str_alt174$_superlative = makeString(":superlative");

    static private final SubLString $str_alt175$nongr_ = makeString("nongr:");

    static private final SubLString $str_alt176$_nongradable = makeString(":nongradable");

    private static final SubLSymbol C10_ADJECTIVE_INFO = makeSymbol("C10-ADJECTIVE-INFO");

    private static final SubLSymbol C10_REG_ADJ_INFO = makeSymbol("C10-REG-ADJ-INFO");

    static private final SubLString $$$Adverb_Form = makeString("Adverb Form");

    static private final SubLString $str_alt180$_adv_regular = makeString(":adv-regular");

    static private final SubLString $str_alt181$_adv_comparative = makeString(":adv-comparative");

    static private final SubLString $str_alt182$_adv_superlative = makeString(":adv-superlative");

    private static final SubLSymbol C10_ADVERB_INFO = makeSymbol("C10-ADVERB-INFO");

    private static final SubLSymbol C10_REG_ADV_INFO = makeSymbol("C10-REG-ADV-INFO");

    private static final SubLSymbol $ADD_STUFF = makeKeyword("ADD-STUFF");



    private static final SubLSymbol $AG_SINGULAR = makeKeyword("AG-SINGULAR");



    private static final SubLSymbol C10_HANDLE_ADD_WORD_INFO = makeSymbol("C10-HANDLE-ADD-WORD-INFO");



    private static final SubLSymbol $MASS = makeKeyword("MASS");

    private static final SubLSymbol $P_SINGULAR = makeKeyword("P-SINGULAR");

    private static final SubLSymbol $P_PLURAL = makeKeyword("P-PLURAL");

    private static final SubLSymbol $P_MASS = makeKeyword("P-MASS");

    private static final SubLSymbol $AG_PLURAL = makeKeyword("AG-PLURAL");

    private static final SubLSymbol $AG_MASS = makeKeyword("AG-MASS");

    private static final SubLSymbol $THIRD_SING = makeKeyword("THIRD-SING");

    private static final SubLSymbol $PROGRESSIVE = makeKeyword("PROGRESSIVE");



    private static final SubLSymbol $PERFECT = makeKeyword("PERFECT");

    private static final SubLSymbol $REGULAR = makeKeyword("REGULAR");

    private static final SubLSymbol $COMPARATIVE = makeKeyword("COMPARATIVE");

    private static final SubLSymbol $SUPERLATIVE = makeKeyword("SUPERLATIVE");

    private static final SubLSymbol $NONGRADABLE = makeKeyword("NONGRADABLE");

    private static final SubLSymbol $ADV_REGULAR = makeKeyword("ADV-REGULAR");

    private static final SubLSymbol $ADV_COMPARATIVE = makeKeyword("ADV-COMPARATIVE");

    private static final SubLSymbol $ADV_SUPERLATIVE = makeKeyword("ADV-SUPERLATIVE");

    static private final SubLString $str_alt208$c10_choose_pos = makeString("c10-choose-pos");

    private static final SubLSymbol C10_CONFIRM_LEX_WORD = makeSymbol("C10-CONFIRM-LEX-WORD");

    static private final SubLString $$$No_POS_Information_Found = makeString("No POS Information Found");

    static private final SubLString $str_alt211$No_part_of_speech_information_was = makeString("No part of speech information was found for ~S");

    static private final SubLString $str_alt212$c10_wales_or_not = makeString("c10-wales-or-not");

    static private final SubLString $$$add = makeString("add");

    static private final SubLString $str_alt214$Enter_strings_for__S = makeString("Enter strings for ~S");

    static private final SubLString $$$back = makeString("back");

    static private final SubLString $$$Back_to_main_lexical_entry_page = makeString("Back to main lexical entry page");

    private static final SubLSymbol C10_BACK_TO_ENTER_STRINGS_PAGE = makeSymbol("C10-BACK-TO-ENTER-STRINGS-PAGE");

    private static final SubLSymbol C10_WALES_OR_NOT = makeSymbol("C10-WALES-OR-NOT");

    static private final SubLString $$$Choose_Part_of_Speech = makeString("Choose Part of Speech");

    static private final SubLString $str_alt220$c10_add_lex_info = makeString("c10-add-lex-info");

    private static final SubLSymbol C10_CHOOSE_POS = makeSymbol("C10-CHOOSE-POS");

    static private final SubLString $str_alt222$c10_handle_add_lex_info = makeString("c10-handle-add-lex-info");

    static private final SubLString $$$Update_Lexicon = makeString("Update Lexicon");

    private static final SubLSymbol C10_ADD_LEX_INFO = makeSymbol("C10-ADD-LEX-INFO");

    static private final SubLString $str_alt225$__form_of__ = makeString("  form of  ");

    static private final SubLString $str_alt226$Existing_Word_Senses_ = makeString("Existing Word Senses:");

    static private final SubLString $str_alt227$NONE_ = makeString("NONE.");

    static private final SubLString $str_alt228$denotation_WS = makeString("denotation-WS");

    static private final SubLString $str_alt229$related_to_WS = makeString("related-to-WS");

    static private final SubLString $str_alt230$placeholder_WS = makeString("placeholder-WS");

    static private final SubLString $str_alt231$__a_S = makeString(":~a~S");

    static private final SubLString $str_alt232$_A_sense__A_of_ = makeString("~A sense ~A of ");

    static private final SubLString $str_alt233$_a_S_ = makeString("~a~S:");

    static private final SubLString $str_alt234$frames_WS_S_ = makeString("frames-WS~S:");

    public static final SubLInteger $int$25 = makeInteger(25);



    static private final SubLString $str_alt237$_choose_frame = makeString(":choose-frame");

    static private final SubLString $$$REMOVE_ALL = makeString("REMOVE ALL");

    static private final SubLString $str_alt239$_is_related_WS_S = makeString(":is-related-WS~S");

    static private final SubLString $str_alt240$_Denotation_Related_To_ = makeString(" Denotation Related To?");

    static private final SubLString $str_alt241$_placeholder_WS_S = makeString(":placeholder-WS~S");

    static private final SubLString $str_alt242$_Denotation_Placeholder_ = makeString(" Denotation Placeholder?");

    private static final SubLSymbol C10_EXISTING_WS_INFO = makeSymbol("C10-EXISTING-WS-INFO");

    static private final SubLString $str_alt244$semtrans_WS_S_ = makeString("semtrans-WS~S:");

    static private final SubLString $$$none = makeString("none");

    public static final SubLObject $$semTransArg = constant_handles.reader_make_constant_shell(makeString("semTransArg"));



    static private final SubLString $str_alt248$_ = makeString(":");

    static private final SubLString $$$Add_New_Lexical_Information = makeString("Add New Lexical Information");

    static private final SubLString $str_alt250$New_Word_Senses_ = makeString("New Word Senses:");

    static private final SubLString $str_alt251$denotation_WS_S_ = makeString("denotation-WS~S:");

    static private final SubLString $str_alt252$_denotation_WS_S = makeString(":denotation-WS~S");

    static private final SubLString $str_alt253$_related_WS_S = makeString(":related-WS~S");

    private static final SubLSymbol C10_NEW_INFO = makeSymbol("C10-NEW-INFO");

    static private final SubLString $str_alt255$field_name_convention_not_followe = makeString("field name convention not followed for ~a");

    static private final SubLString $str_alt256$_denotation = makeString(":denotation");

    static private final SubLString $str_alt257$no_denot = makeString("no-denot");

    static private final SubLString $str_alt258$_related = makeString(":related");

    static private final SubLString $str_alt259$_placeholder = makeString(":placeholder");











    private static final SubLSymbol C10_HANDLE_ADD_LEX_INFO = makeSymbol("C10-HANDLE-ADD-LEX-INFO");

    static private final SubLString $str_alt266$_S_is_not_a_valid_denotation____a = makeString("~S is not a valid denotation.~%~a~%");

    public static final SubLObject $$EnglishMt = constant_handles.reader_make_constant_shell(makeString("EnglishMt"));





    public static final SubLObject $$multiWordString = constant_handles.reader_make_constant_shell(makeString("multiWordString"));



    public static final SubLObject $$multiWordSemTrans = constant_handles.reader_make_constant_shell(makeString("multiWordSemTrans"));

    public static final SubLObject $$compoundString = constant_handles.reader_make_constant_shell(makeString("compoundString"));

    public static final SubLObject $$compoundStringSemTrans = constant_handles.reader_make_constant_shell(makeString("compoundStringSemTrans"));

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_wales_file();
    }

    @Override
    public void initializeVariables() {
        init_wales_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_wales_file();
    }
}

