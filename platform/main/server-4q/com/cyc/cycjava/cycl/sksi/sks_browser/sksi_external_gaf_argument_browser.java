package com.cyc.cycjava.cycl.sksi.sks_browser;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_c_gaf_arg_last_mt$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_c_gaf_arg_use_binary$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.$assertion_filter_hook$;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_display_string;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_index;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_index_hook_p;
import static com.cyc.cycjava.cycl.cb_utilities.cb_index_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.cb_browser;
import com.cyc.cycjava.cycl.cb_viewpoint;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_external_gaf_argument_browser extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_external_gaf_argument_browser();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser";

    public static final String myFingerPrint = "9d880149eb96eecf7846896e64acb57c577ad1988641a38b6e02049251d8444c";



    public static final SubLString $str1$sksi_external_gaf_argument__A = makeString("sksi-external-gaf-argument&~A");

    public static final SubLString $str2$__a = makeString("&~a");

    public static final SubLString $str3$Arg__a = makeString("Arg ~a");

    public static final SubLString $$$External_GAFs = makeString("External GAFs");

    public static final SubLString $str5$___a_ = makeString(" (~a)");

    private static final SubLSymbol $SKSI_EXTERNAL_GAF_ARGUMENT = makeKeyword("SKSI-EXTERNAL-GAF-ARGUMENT");

    public static final SubLSymbol CB_LINK_SKSI_EXTERNAL_GAF_ARGUMENT = makeSymbol("CB-LINK-SKSI-EXTERNAL-GAF-ARGUMENT");

    public static final SubLSymbol $sym8$_ = makeSymbol("<");

    public static final SubLList $list9 = list(makeSymbol("MT"), makeSymbol("COUNT"));

    public static final SubLList $list10 = list(makeSymbol("INDEX-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("ARG-STRING"), makeSymbol("PRED-SPEC"), makeSymbol("MT-SPEC"));

    public static final SubLString $str11$Could_not_determine_an_index_hook = makeString("Could not determine an index-hook from ~a");

    public static final SubLString $str12$Could_not_determine_an_arg_from__ = makeString("Could not determine an arg from ~a");

    public static final SubLString $str13$Could_not_determine_a_term_from__ = makeString("Could not determine a term from ~a");

    public static final SubLString $$$External_GAF_index_for_ = makeString("External GAF index for ");

    private static final SubLString $str15$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str16$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLString $str19$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh = makeString("Refresh");

    private static final SubLString $str24$reloadCurrentFrame__reloadFrameBu = makeString("reloadCurrentFrame('reloadFrameButton');");

    private static final SubLSymbol SKSI_EXTERNAL_GAF_ARGUMENT = makeSymbol("SKSI-EXTERNAL-GAF-ARGUMENT");





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    public static SubLObject cb_link_sksi_external_gaf_argument(final SubLObject index_hook, SubLObject argument_position, SubLObject predicate, SubLObject mt, SubLObject count) {
        if (argument_position == UNPROVIDED) {
            argument_position = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (count == UNPROVIDED) {
            count = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_external_browser_utilities.count_not_too_expensive_for_browser_supportP(count)) {
            final SubLObject frame_name_var = cb_frame_name($CONTENT);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str1$sksi_external_gaf_argument__A, cb_index_identifier(index_hook));
            if (NIL != argument_position) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str2$__a, argument_position);
                if (NIL != predicate) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str2$__a, cb_fort_identifier(predicate));
                    if (NIL != mt) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str2$__a, cb_fort_identifier(mt));
                    }
                }
            }
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
                if (NIL != mt) {
                    html_princ(cb_fort_display_string(mt));
                } else
                    if (NIL != predicate) {
                        html_princ(cb_fort_display_string(predicate));
                    } else
                        if (NIL != argument_position) {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str3$Arg__a, argument_position);
                        } else {
                            format(html_macros.$html_stream$.getDynamicValue(thread), $$$External_GAFs);
                        }


            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            if (count.isInteger()) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str5$___a_, count);
            }
        }
        return index_hook;
    }

    public static SubLObject display_sksi_supported_gaf_argument_positions_for_term(final SubLObject v_term) {
        SubLObject cdolist_list_var;
        final SubLObject argument_positions = cdolist_list_var = Sort.sort(sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_positions_for_term(v_term, UNPROVIDED), $sym8$_, UNPROVIDED);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_external_gaf_argument_index(v_term, arg);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_external_gaf_argument_index(final SubLObject v_term, final SubLObject argument_position) {
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_indent(ONE_INTEGER);
        cb_link($SKSI_EXTERNAL_GAF_ARGUMENT, v_term, argument_position, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        SubLObject cdolist_list_var;
        final SubLObject preds = cdolist_list_var = sksi_external_browser_utilities.sksi_sort_preds_for_display(sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_predicates_for_term_argument_position(v_term, argument_position, UNPROVIDED));
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_external_gaf_argument_predicate_index(v_term, argument_position, pred);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_external_gaf_argument_predicate_index(final SubLObject v_term, final SubLObject argument_position, final SubLObject pred) {
        final SubLObject mt_count_pairs = sksi_external_browser_utilities.sksi_sort_mt_count_pairs(sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_mt_count_pairs_for_term_argument_position_predicate(v_term, argument_position, pred, UNPROVIDED));
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_indent(TWO_INTEGER);
        cb_link($SKSI_EXTERNAL_GAF_ARGUMENT, v_term, argument_position, pred, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = mt_count_pairs;
        SubLObject mt_count_pair = NIL;
        mt_count_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = mt_count_pair;
            SubLObject mt = NIL;
            SubLObject count = NIL;
            destructuring_bind_must_consp(current, datum, $list9);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list9);
            count = current.first();
            current = current.rest();
            if (NIL == current) {
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_indent(THREE_INTEGER);
                cb_link($SKSI_EXTERNAL_GAF_ARGUMENT, v_term, argument_position, pred, mt, count);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            } else {
                cdestructuring_bind_error(datum, $list9);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_count_pair = cdolist_list_var.first();
        } 
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject sksi_external_gaf_argument(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index_spec = NIL;
        destructuring_bind_must_consp(args, args, $list10);
        index_spec = args.first();
        SubLObject current = args.rest();
        final SubLObject arg_string = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list10);
        current = current.rest();
        final SubLObject pred_spec = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list10);
        current = current.rest();
        final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list10);
        current = current.rest();
        if (NIL == current) {
            final SubLObject index_hook = cb_guess_index(index_spec);
            SubLObject arg = NIL;
            SubLObject predicate = NIL;
            SubLObject mt = NIL;
            if (NIL == cb_index_hook_p(index_hook)) {
                return cb_error($str11$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != arg_string) {
                arg = read_from_string_ignoring_errors(arg_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
                if (!arg.isFixnum()) {
                    return cb_error($str12$Could_not_determine_an_arg_from__, arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != pred_spec) {
                    predicate = cb_guess_term(pred_spec, UNPROVIDED);
                    if (NIL == forts.fort_p(predicate)) {
                        return cb_error($str13$Could_not_determine_a_term_from__, pred_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != mt_spec) {
                        mt = cb_guess_term(mt_spec, UNPROVIDED);
                        if (NIL == forts.fort_p(mt)) {
                            return cb_error($str13$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            final SubLObject title_var;
            final SubLObject title = title_var = cconcatenate($$$External_GAF_index_for_, format_nil.format_nil_s_no_copy(index_hook));
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str15$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str16$_meta_http_equiv__X_UA_Compatible);
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
                    if (NIL != title_var) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_princ(title_var);
                        html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    dhtml_macros.html_basic_cb_scripts();
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
                        html_markup($str19$yui_skin_sam);
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
                                html_princ($$$Refresh);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str24$reloadCurrentFrame__reloadFrameBu);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            cb_browser.cb_c_term_header(index_hook);
                            html_newline(TWO_INTEGER);
                            sksi_external_gaf_argument_internal(index_hook, arg, predicate, mt, UNPROVIDED, UNPROVIDED);
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
        } else {
            cdestructuring_bind_error(args, $list10);
        }
        return NIL;
    }

    public static SubLObject sksi_external_gaf_argument_internal(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, SubLObject mt, SubLObject external_termP, SubLObject visible_mt) {
        if (external_termP == UNPROVIDED) {
            external_termP = NIL;
        }
        if (visible_mt == UNPROVIDED) {
            visible_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $assertion_filter_hook$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            $assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$5 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$6 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$7 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$8 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    if (NIL == arg) {
                                        sksi_external_gaf_argument_rec(index_hook, external_termP, visible_mt);
                                    } else
                                        if (NIL == predicate) {
                                            sksi_external_gaf_argument_rec_arg(index_hook, arg, external_termP, visible_mt);
                                        } else {
                                            cb_browser.cb_c_gaf_arg_header(arg);
                                            if (NIL == mt) {
                                                final SubLObject mts = sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_mts_for_term_argument_position_predicate(NIL != external_termP ? sksi_external_term_browser.sksi_supported_external_term_logical_schema(index_hook) : index_hook, arg, predicate, UNPROVIDED);
                                                if (NIL != list_utilities.singletonP(mts)) {
                                                    mt = mts.first();
                                                }
                                            }
                                            if (NIL == mt) {
                                                sksi_external_gaf_argument_rec_arg_pred(index_hook, arg, predicate, external_termP, visible_mt);
                                            } else {
                                                final SubLObject _prev_bind_0_$9 = $cb_c_gaf_arg_use_binary$.currentBinding(thread);
                                                try {
                                                    $cb_c_gaf_arg_use_binary$.bind(makeBoolean((NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) && arg.eql(ONE_INTEGER)), thread);
                                                    if (NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) {
                                                        final SubLObject _prev_bind_0_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$11 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                            $cb_c_gaf_arg_use_binary$.setDynamicValue(arity.binaryP(predicate), thread);
                                                        } finally {
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$11, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$10, thread);
                                                        }
                                                    }
                                                    sksi_external_gaf_argument_rec_arg_pred_mt(index_hook, arg, predicate, mt, external_termP);
                                                } finally {
                                                    $cb_c_gaf_arg_use_binary$.rebind(_prev_bind_0_$9, thread);
                                                }
                                            }
                                        }

                                } finally {
                                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$8, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$7, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$6, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_2, thread);
            $assertion_filter_hook$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_external_gaf_argument_rec(final SubLObject index_hook, SubLObject external_termP, SubLObject visible_mt) {
        if (external_termP == UNPROVIDED) {
            external_termP = NIL;
        }
        if (visible_mt == UNPROVIDED) {
            visible_mt = NIL;
        }
        SubLObject some_arg_done = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_positions_for_term(NIL != external_termP ? sksi_external_term_browser.sksi_supported_external_term_logical_schema(index_hook) : index_hook, visible_mt);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != some_arg_done) {
                html_hr(UNPROVIDED, UNPROVIDED);
            }
            sksi_external_gaf_argument_rec_arg(index_hook, arg, external_termP, visible_mt);
            some_arg_done = T;
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_external_gaf_argument_rec_arg(final SubLObject index_hook, final SubLObject arg, SubLObject external_termP, SubLObject visible_mt) {
        if (external_termP == UNPROVIDED) {
            external_termP = NIL;
        }
        if (visible_mt == UNPROVIDED) {
            visible_mt = NIL;
        }
        cb_browser.cb_c_gaf_arg_header(arg);
        SubLObject cdolist_list_var;
        final SubLObject predicates = cdolist_list_var = sksi_external_browser_utilities.sksi_sort_preds_for_display(sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_predicates_for_term_argument_position(NIL != external_termP ? sksi_external_term_browser.sksi_supported_external_term_logical_schema(index_hook) : index_hook, arg, visible_mt));
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_external_gaf_argument_rec_arg_pred(index_hook, arg, predicate, external_termP, visible_mt);
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_external_gaf_argument_rec_arg_pred(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, SubLObject external_termP, SubLObject visible_mt) {
        if (external_termP == UNPROVIDED) {
            external_termP = NIL;
        }
        if (visible_mt == UNPROVIDED) {
            visible_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_c_gaf_arg_use_binary$.currentBinding(thread);
        try {
            $cb_c_gaf_arg_use_binary$.bind(makeBoolean((NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) && arg.eql(ONE_INTEGER)), thread);
            final SubLObject mts = sksi_external_browser_utilities.sksi_sort_mts_for_display(sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_mts_for_term_argument_position_predicate(NIL != external_termP ? sksi_external_term_browser.sksi_supported_external_term_logical_schema(index_hook) : index_hook, arg, predicate, visible_mt));
            if (NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) {
                final SubLObject _prev_bind_0_$14 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    $cb_c_gaf_arg_use_binary$.setDynamicValue(arity.binaryP(predicate), thread);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$14, thread);
                }
            }
            cb_browser.cb_c_pred_header(predicate);
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sksi_external_gaf_argument_rec_arg_pred_mt(index_hook, arg, predicate, mt, external_termP);
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            } 
        } finally {
            $cb_c_gaf_arg_use_binary$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sksi_external_gaf_argument_rec_arg_pred_mt(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, final SubLObject mt, SubLObject external_termP) {
        if (external_termP == UNPROVIDED) {
            external_termP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_browser.cb_c_mt_header(mt, $cb_c_gaf_arg_last_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        final SubLObject query_form_module_list_pairs = sksi_sks_gaf_arg_indexing.gather_query_form_module_list_pairs_from_sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt(NIL != external_termP ? sksi_external_term_browser.sksi_supported_external_term_logical_schema(index_hook) : index_hook, arg, predicate, mt);
        if (NIL != external_termP) {
            return sksi_external_browser_utilities.sksi_display_external_term_facts(index_hook, arg, query_form_module_list_pairs, mt);
        }
        return sksi_external_browser_utilities.sksi_display_external_facts(query_form_module_list_pairs, mt);
    }

    public static SubLObject declare_sksi_external_gaf_argument_browser_file() {
        declareFunction(me, "cb_link_sksi_external_gaf_argument", "CB-LINK-SKSI-EXTERNAL-GAF-ARGUMENT", 1, 4, false);
        declareFunction(me, "display_sksi_supported_gaf_argument_positions_for_term", "DISPLAY-SKSI-SUPPORTED-GAF-ARGUMENT-POSITIONS-FOR-TERM", 1, 0, false);
        declareFunction(me, "sksi_external_gaf_argument_index", "SKSI-EXTERNAL-GAF-ARGUMENT-INDEX", 2, 0, false);
        declareFunction(me, "sksi_external_gaf_argument_predicate_index", "SKSI-EXTERNAL-GAF-ARGUMENT-PREDICATE-INDEX", 3, 0, false);
        declareFunction(me, "sksi_external_gaf_argument", "SKSI-EXTERNAL-GAF-ARGUMENT", 1, 0, false);
        declareFunction(me, "sksi_external_gaf_argument_internal", "SKSI-EXTERNAL-GAF-ARGUMENT-INTERNAL", 4, 2, false);
        declareFunction(me, "sksi_external_gaf_argument_rec", "SKSI-EXTERNAL-GAF-ARGUMENT-REC", 1, 2, false);
        declareFunction(me, "sksi_external_gaf_argument_rec_arg", "SKSI-EXTERNAL-GAF-ARGUMENT-REC-ARG", 2, 2, false);
        declareFunction(me, "sksi_external_gaf_argument_rec_arg_pred", "SKSI-EXTERNAL-GAF-ARGUMENT-REC-ARG-PRED", 3, 2, false);
        declareFunction(me, "sksi_external_gaf_argument_rec_arg_pred_mt", "SKSI-EXTERNAL-GAF-ARGUMENT-REC-ARG-PRED-MT", 4, 1, false);
        return NIL;
    }

    public static SubLObject init_sksi_external_gaf_argument_browser_file() {
        return NIL;
    }

    public static SubLObject setup_sksi_external_gaf_argument_browser_file() {
        setup_cb_link_method($SKSI_EXTERNAL_GAF_ARGUMENT, CB_LINK_SKSI_EXTERNAL_GAF_ARGUMENT, FIVE_INTEGER);
        html_macros.note_cgi_handler_function(SKSI_EXTERNAL_GAF_ARGUMENT, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_external_gaf_argument_browser_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_external_gaf_argument_browser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_external_gaf_argument_browser_file();
    }

    
}

/**
 * Total time: 231 ms
 */
