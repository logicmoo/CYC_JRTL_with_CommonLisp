package com.cyc.cycjava.cycl.sksi.sks_browser;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.cb_viewpoint;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.cb_browser;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_external_gaf_argument_browser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser";
    public static final String myFingerPrint = "9d880149eb96eecf7846896e64acb57c577ad1988641a38b6e02049251d8444c";
    private static final SubLSymbol $kw0$CONTENT;
    private static final SubLString $str1$sksi_external_gaf_argument__A;
    private static final SubLString $str2$__a;
    private static final SubLString $str3$Arg__a;
    private static final SubLString $str4$External_GAFs;
    private static final SubLString $str5$___a_;
    private static final SubLSymbol $kw6$SKSI_EXTERNAL_GAF_ARGUMENT;
    private static final SubLSymbol $sym7$CB_LINK_SKSI_EXTERNAL_GAF_ARGUMENT;
    private static final SubLSymbol $sym8$_;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLString $str11$Could_not_determine_an_index_hook;
    private static final SubLString $str12$Could_not_determine_an_arg_from__;
    private static final SubLString $str13$Could_not_determine_a_term_from__;
    private static final SubLString $str14$External_GAF_index_for_;
    private static final SubLString $str15$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str16$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw17$UNINITIALIZED;
    private static final SubLSymbol $kw18$CB_CYC;
    private static final SubLString $str19$yui_skin_sam;
    private static final SubLString $str20$reloadFrameButton;
    private static final SubLString $str21$button;
    private static final SubLString $str22$reload;
    private static final SubLString $str23$Refresh;
    private static final SubLString $str24$reloadCurrentFrame__reloadFrameBu;
    private static final SubLSymbol $sym25$SKSI_EXTERNAL_GAF_ARGUMENT;
    private static final SubLSymbol $kw26$HTML_HANDLER;
    private static final SubLSymbol $sym27$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const28$EverythingPSC;
    private static final SubLSymbol $kw29$NEW;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-gaf-argument-browser.lisp", position = 1081L)
    public static SubLObject cb_link_sksi_external_gaf_argument(final SubLObject index_hook, SubLObject argument_position, SubLObject predicate, SubLObject mt, SubLObject count) {
        if (argument_position == sksi_external_gaf_argument_browser.UNPROVIDED) {
            argument_position = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        if (predicate == sksi_external_gaf_argument_browser.UNPROVIDED) {
            predicate = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        if (mt == sksi_external_gaf_argument_browser.UNPROVIDED) {
            mt = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        if (count == sksi_external_gaf_argument_browser.UNPROVIDED) {
            count = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_external_gaf_argument_browser.NIL != sksi_external_browser_utilities.count_not_too_expensive_for_browser_supportP(count)) {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)sksi_external_gaf_argument_browser.$kw0$CONTENT);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_external_gaf_argument_browser.$str1$sksi_external_gaf_argument__A, cb_utilities.cb_index_identifier(index_hook));
            if (sksi_external_gaf_argument_browser.NIL != argument_position) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_external_gaf_argument_browser.$str2$__a, argument_position);
                if (sksi_external_gaf_argument_browser.NIL != predicate) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_external_gaf_argument_browser.$str2$__a, cb_utilities.cb_fort_identifier(predicate));
                    if (sksi_external_gaf_argument_browser.NIL != mt) {
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_external_gaf_argument_browser.$str2$__a, cb_utilities.cb_fort_identifier(mt));
                    }
                }
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
            if (sksi_external_gaf_argument_browser.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)sksi_external_gaf_argument_browser.T, thread);
                if (sksi_external_gaf_argument_browser.NIL != mt) {
                    html_utilities.html_princ(cb_utilities.cb_fort_display_string(mt));
                }
                else if (sksi_external_gaf_argument_browser.NIL != predicate) {
                    html_utilities.html_princ(cb_utilities.cb_fort_display_string(predicate));
                }
                else if (sksi_external_gaf_argument_browser.NIL != argument_position) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_external_gaf_argument_browser.$str3$Arg__a, argument_position);
                }
                else {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_external_gaf_argument_browser.$str4$External_GAFs);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            if (count.isInteger()) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)sksi_external_gaf_argument_browser.$str5$___a_, count);
            }
        }
        return index_hook;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-gaf-argument-browser.lisp", position = 2250L)
    public static SubLObject display_sksi_supported_gaf_argument_positions_for_term(final SubLObject v_term) {
        SubLObject cdolist_list_var;
        final SubLObject argument_positions = cdolist_list_var = Sort.sort(sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_positions_for_term(v_term, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED), (SubLObject)sksi_external_gaf_argument_browser.$sym8$_, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
        SubLObject arg = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        arg = cdolist_list_var.first();
        while (sksi_external_gaf_argument_browser.NIL != cdolist_list_var) {
            sksi_external_gaf_argument_index(v_term, arg);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)sksi_external_gaf_argument_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-gaf-argument-browser.lisp", position = 2527L)
    public static SubLObject sksi_external_gaf_argument_index(final SubLObject v_term, final SubLObject argument_position) {
        html_utilities.html_newline((SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_utilities.html_indent((SubLObject)sksi_external_gaf_argument_browser.ONE_INTEGER);
        cb_utilities.cb_link((SubLObject)sksi_external_gaf_argument_browser.$kw6$SKSI_EXTERNAL_GAF_ARGUMENT, v_term, argument_position, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        SubLObject cdolist_list_var;
        final SubLObject preds = cdolist_list_var = sksi_external_browser_utilities.sksi_sort_preds_for_display(sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_predicates_for_term_argument_position(v_term, argument_position, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED));
        SubLObject pred = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        pred = cdolist_list_var.first();
        while (sksi_external_gaf_argument_browser.NIL != cdolist_list_var) {
            sksi_external_gaf_argument_predicate_index(v_term, argument_position, pred);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return (SubLObject)sksi_external_gaf_argument_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-gaf-argument-browser.lisp", position = 2953L)
    public static SubLObject sksi_external_gaf_argument_predicate_index(final SubLObject v_term, final SubLObject argument_position, final SubLObject pred) {
        final SubLObject mt_count_pairs = sksi_external_browser_utilities.sksi_sort_mt_count_pairs(sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_mt_count_pairs_for_term_argument_position_predicate(v_term, argument_position, pred, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED));
        html_utilities.html_newline((SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_utilities.html_indent((SubLObject)sksi_external_gaf_argument_browser.TWO_INTEGER);
        cb_utilities.cb_link((SubLObject)sksi_external_gaf_argument_browser.$kw6$SKSI_EXTERNAL_GAF_ARGUMENT, v_term, argument_position, pred, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
        SubLObject cdolist_list_var = mt_count_pairs;
        SubLObject mt_count_pair = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        mt_count_pair = cdolist_list_var.first();
        while (sksi_external_gaf_argument_browser.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = mt_count_pair;
            SubLObject mt = (SubLObject)sksi_external_gaf_argument_browser.NIL;
            SubLObject count = (SubLObject)sksi_external_gaf_argument_browser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_external_gaf_argument_browser.$list9);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_external_gaf_argument_browser.$list9);
            count = current.first();
            current = current.rest();
            if (sksi_external_gaf_argument_browser.NIL == current) {
                html_utilities.html_newline((SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_utilities.html_indent((SubLObject)sksi_external_gaf_argument_browser.THREE_INTEGER);
                cb_utilities.cb_link((SubLObject)sksi_external_gaf_argument_browser.$kw6$SKSI_EXTERNAL_GAF_ARGUMENT, v_term, argument_position, pred, mt, count);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_external_gaf_argument_browser.$list9);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt_count_pair = cdolist_list_var.first();
        }
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return (SubLObject)sksi_external_gaf_argument_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-gaf-argument-browser.lisp", position = 3575L)
    public static SubLObject sksi_external_gaf_argument(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index_spec = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)sksi_external_gaf_argument_browser.$list10);
        index_spec = args.first();
        SubLObject current = args.rest();
        final SubLObject arg_string = (SubLObject)(current.isCons() ? current.first() : sksi_external_gaf_argument_browser.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)sksi_external_gaf_argument_browser.$list10);
        current = current.rest();
        final SubLObject pred_spec = (SubLObject)(current.isCons() ? current.first() : sksi_external_gaf_argument_browser.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)sksi_external_gaf_argument_browser.$list10);
        current = current.rest();
        final SubLObject mt_spec = (SubLObject)(current.isCons() ? current.first() : sksi_external_gaf_argument_browser.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)sksi_external_gaf_argument_browser.$list10);
        current = current.rest();
        if (sksi_external_gaf_argument_browser.NIL == current) {
            final SubLObject index_hook = cb_utilities.cb_guess_index(index_spec);
            SubLObject arg = (SubLObject)sksi_external_gaf_argument_browser.NIL;
            SubLObject predicate = (SubLObject)sksi_external_gaf_argument_browser.NIL;
            SubLObject mt = (SubLObject)sksi_external_gaf_argument_browser.NIL;
            if (sksi_external_gaf_argument_browser.NIL == cb_utilities.cb_index_hook_p(index_hook)) {
                return cb_utilities.cb_error((SubLObject)sksi_external_gaf_argument_browser.$str11$Could_not_determine_an_index_hook, index_spec, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
            }
            if (sksi_external_gaf_argument_browser.NIL != arg_string) {
                arg = reader.read_from_string_ignoring_errors(arg_string, (SubLObject)sksi_external_gaf_argument_browser.NIL, (SubLObject)sksi_external_gaf_argument_browser.NIL, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                if (!arg.isFixnum()) {
                    return cb_utilities.cb_error((SubLObject)sksi_external_gaf_argument_browser.$str12$Could_not_determine_an_arg_from__, arg_string, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                }
                if (sksi_external_gaf_argument_browser.NIL != pred_spec) {
                    predicate = cb_utilities.cb_guess_term(pred_spec, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                    if (sksi_external_gaf_argument_browser.NIL == forts.fort_p(predicate)) {
                        return cb_utilities.cb_error((SubLObject)sksi_external_gaf_argument_browser.$str13$Could_not_determine_a_term_from__, pred_spec, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                    }
                    if (sksi_external_gaf_argument_browser.NIL != mt_spec) {
                        mt = cb_utilities.cb_guess_term(mt_spec, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                        if (sksi_external_gaf_argument_browser.NIL == forts.fort_p(mt)) {
                            return cb_utilities.cb_error((SubLObject)sksi_external_gaf_argument_browser.$str13$Could_not_determine_a_term_from__, mt_spec, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                        }
                    }
                }
            }
            final SubLObject title_var;
            final SubLObject title = title_var = Sequences.cconcatenate((SubLObject)sksi_external_gaf_argument_browser.$str14$External_GAF_index_for_, format_nil.format_nil_s_no_copy(index_hook));
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((sksi_external_gaf_argument_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)sksi_external_gaf_argument_browser.$str15$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (sksi_external_gaf_argument_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)sksi_external_gaf_argument_browser.$str16$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == sksi_external_gaf_argument_browser.$kw17$UNINITIALIZED) ? ConsesLow.list(sksi_external_gaf_argument_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)sksi_external_gaf_argument_browser.$kw18$CB_CYC);
                    if (sksi_external_gaf_argument_browser.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    dhtml_macros.html_basic_cb_scripts();
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)sksi_external_gaf_argument_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (sksi_external_gaf_argument_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)sksi_external_gaf_argument_browser.$str19$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)sksi_external_gaf_argument_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)sksi_external_gaf_argument_browser.$str20$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)sksi_external_gaf_argument_browser.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)sksi_external_gaf_argument_browser.$str21$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)sksi_external_gaf_argument_browser.$str22$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)sksi_external_gaf_argument_browser.$str23$Refresh);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)sksi_external_gaf_argument_browser.$str24$reloadCurrentFrame__reloadFrameBu);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                                if (sksi_external_gaf_argument_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            cb_browser.cb_c_term_header(index_hook);
                            html_utilities.html_newline((SubLObject)sksi_external_gaf_argument_browser.TWO_INTEGER);
                            sksi_external_gaf_argument_internal(index_hook, arg, predicate, mt, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                            html_utilities.html_source_readability_terpri((SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)sksi_external_gaf_argument_browser.$list10);
        }
        return (SubLObject)sksi_external_gaf_argument_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-gaf-argument-browser.lisp", position = 4714L)
    public static SubLObject sksi_external_gaf_argument_internal(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, SubLObject mt, SubLObject external_termP, SubLObject visible_mt) {
        if (external_termP == sksi_external_gaf_argument_browser.UNPROVIDED) {
            external_termP = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        if (visible_mt == sksi_external_gaf_argument_browser.UNPROVIDED) {
            visible_mt = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_utilities.$assertion_filter_hook$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            cb_utilities.$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)sksi_external_gaf_argument_browser.NIL, thread);
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
                                    if (sksi_external_gaf_argument_browser.NIL == arg) {
                                        sksi_external_gaf_argument_rec(index_hook, external_termP, visible_mt);
                                    }
                                    else if (sksi_external_gaf_argument_browser.NIL == predicate) {
                                        sksi_external_gaf_argument_rec_arg(index_hook, arg, external_termP, visible_mt);
                                    }
                                    else {
                                        cb_browser.cb_c_gaf_arg_header(arg);
                                        if (sksi_external_gaf_argument_browser.NIL == mt) {
                                            final SubLObject mts = sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_mts_for_term_argument_position_predicate((sksi_external_gaf_argument_browser.NIL != external_termP) ? sksi_external_term_browser.sksi_supported_external_term_logical_schema(index_hook) : index_hook, arg, predicate, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
                                            if (sksi_external_gaf_argument_browser.NIL != list_utilities.singletonP(mts)) {
                                                mt = mts.first();
                                            }
                                        }
                                        if (sksi_external_gaf_argument_browser.NIL == mt) {
                                            sksi_external_gaf_argument_rec_arg_pred(index_hook, arg, predicate, external_termP, visible_mt);
                                        }
                                        else {
                                            final SubLObject _prev_bind_0_$9 = cb_parameters.$cb_c_gaf_arg_use_binary$.currentBinding(thread);
                                            try {
                                                cb_parameters.$cb_c_gaf_arg_use_binary$.bind((SubLObject)SubLObjectFactory.makeBoolean(sksi_external_gaf_argument_browser.NIL != cb_parameters.$cb_c_gaf_arg_use_binary$.getDynamicValue(thread) && arg.eql((SubLObject)sksi_external_gaf_argument_browser.ONE_INTEGER)), thread);
                                                if (sksi_external_gaf_argument_browser.NIL != cb_parameters.$cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) {
                                                    final SubLObject _prev_bind_0_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$11 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                    try {
                                                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_external_gaf_argument_browser.$sym27$RELEVANT_MT_IS_EVERYTHING, thread);
                                                        mt_relevance_macros.$mt$.bind(sksi_external_gaf_argument_browser.$const28$EverythingPSC, thread);
                                                        cb_parameters.$cb_c_gaf_arg_use_binary$.setDynamicValue(arity.binaryP(predicate), thread);
                                                    }
                                                    finally {
                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$11, thread);
                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$10, thread);
                                                    }
                                                }
                                                sksi_external_gaf_argument_rec_arg_pred_mt(index_hook, arg, predicate, mt, external_termP);
                                            }
                                            finally {
                                                cb_parameters.$cb_c_gaf_arg_use_binary$.rebind(_prev_bind_0_$9, thread);
                                            }
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_external_gaf_argument_browser.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$7, thread);
                        }
                        if (new_or_reused == sksi_external_gaf_argument_browser.$kw29$NEW && sksi_external_gaf_argument_browser.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$6, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_external_gaf_argument_browser.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (sksi_external_gaf_argument_browser.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$5, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_2, thread);
            cb_utilities.$assertion_filter_hook$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_external_gaf_argument_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-gaf-argument-browser.lisp", position = 5883L)
    public static SubLObject sksi_external_gaf_argument_rec(final SubLObject index_hook, SubLObject external_termP, SubLObject visible_mt) {
        if (external_termP == sksi_external_gaf_argument_browser.UNPROVIDED) {
            external_termP = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        if (visible_mt == sksi_external_gaf_argument_browser.UNPROVIDED) {
            visible_mt = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        SubLObject some_arg_done = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_positions_for_term((sksi_external_gaf_argument_browser.NIL != external_termP) ? sksi_external_term_browser.sksi_supported_external_term_logical_schema(index_hook) : index_hook, visible_mt);
        SubLObject arg = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        arg = cdolist_list_var.first();
        while (sksi_external_gaf_argument_browser.NIL != cdolist_list_var) {
            if (sksi_external_gaf_argument_browser.NIL != some_arg_done) {
                html_utilities.html_hr((SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
            }
            sksi_external_gaf_argument_rec_arg(index_hook, arg, external_termP, visible_mt);
            some_arg_done = (SubLObject)sksi_external_gaf_argument_browser.T;
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)sksi_external_gaf_argument_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-gaf-argument-browser.lisp", position = 6360L)
    public static SubLObject sksi_external_gaf_argument_rec_arg(final SubLObject index_hook, final SubLObject arg, SubLObject external_termP, SubLObject visible_mt) {
        if (external_termP == sksi_external_gaf_argument_browser.UNPROVIDED) {
            external_termP = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        if (visible_mt == sksi_external_gaf_argument_browser.UNPROVIDED) {
            visible_mt = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        cb_browser.cb_c_gaf_arg_header(arg);
        SubLObject cdolist_list_var;
        final SubLObject predicates = cdolist_list_var = sksi_external_browser_utilities.sksi_sort_preds_for_display(sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_predicates_for_term_argument_position((sksi_external_gaf_argument_browser.NIL != external_termP) ? sksi_external_term_browser.sksi_supported_external_term_logical_schema(index_hook) : index_hook, arg, visible_mt));
        SubLObject predicate = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        predicate = cdolist_list_var.first();
        while (sksi_external_gaf_argument_browser.NIL != cdolist_list_var) {
            sksi_external_gaf_argument_rec_arg_pred(index_hook, arg, predicate, external_termP, visible_mt);
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return (SubLObject)sksi_external_gaf_argument_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-gaf-argument-browser.lisp", position = 6874L)
    public static SubLObject sksi_external_gaf_argument_rec_arg_pred(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, SubLObject external_termP, SubLObject visible_mt) {
        if (external_termP == sksi_external_gaf_argument_browser.UNPROVIDED) {
            external_termP = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        if (visible_mt == sksi_external_gaf_argument_browser.UNPROVIDED) {
            visible_mt = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_parameters.$cb_c_gaf_arg_use_binary$.currentBinding(thread);
        try {
            cb_parameters.$cb_c_gaf_arg_use_binary$.bind((SubLObject)SubLObjectFactory.makeBoolean(sksi_external_gaf_argument_browser.NIL != cb_parameters.$cb_c_gaf_arg_use_binary$.getDynamicValue(thread) && arg.eql((SubLObject)sksi_external_gaf_argument_browser.ONE_INTEGER)), thread);
            final SubLObject mts = sksi_external_browser_utilities.sksi_sort_mts_for_display(sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_mts_for_term_argument_position_predicate((sksi_external_gaf_argument_browser.NIL != external_termP) ? sksi_external_term_browser.sksi_supported_external_term_logical_schema(index_hook) : index_hook, arg, predicate, visible_mt));
            if (sksi_external_gaf_argument_browser.NIL != cb_parameters.$cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) {
                final SubLObject _prev_bind_0_$14 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_external_gaf_argument_browser.$sym27$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(sksi_external_gaf_argument_browser.$const28$EverythingPSC, thread);
                    cb_parameters.$cb_c_gaf_arg_use_binary$.setDynamicValue(arity.binaryP(predicate), thread);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$14, thread);
                }
            }
            cb_browser.cb_c_pred_header(predicate);
            SubLObject cdolist_list_var = mts;
            SubLObject mt = (SubLObject)sksi_external_gaf_argument_browser.NIL;
            mt = cdolist_list_var.first();
            while (sksi_external_gaf_argument_browser.NIL != cdolist_list_var) {
                sksi_external_gaf_argument_rec_arg_pred_mt(index_hook, arg, predicate, mt, external_termP);
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
        }
        finally {
            cb_parameters.$cb_c_gaf_arg_use_binary$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_external_gaf_argument_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-gaf-argument-browser.lisp", position = 7589L)
    public static SubLObject sksi_external_gaf_argument_rec_arg_pred_mt(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, final SubLObject mt, SubLObject external_termP) {
        if (external_termP == sksi_external_gaf_argument_browser.UNPROVIDED) {
            external_termP = (SubLObject)sksi_external_gaf_argument_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_browser.cb_c_mt_header(mt, cb_parameters.$cb_c_gaf_arg_last_mt$.getDynamicValue(thread), (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED, (SubLObject)sksi_external_gaf_argument_browser.UNPROVIDED);
        final SubLObject query_form_module_list_pairs = sksi_sks_gaf_arg_indexing.gather_query_form_module_list_pairs_from_sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt((sksi_external_gaf_argument_browser.NIL != external_termP) ? sksi_external_term_browser.sksi_supported_external_term_logical_schema(index_hook) : index_hook, arg, predicate, mt);
        if (sksi_external_gaf_argument_browser.NIL != external_termP) {
            return sksi_external_browser_utilities.sksi_display_external_term_facts(index_hook, arg, query_form_module_list_pairs, mt);
        }
        return sksi_external_browser_utilities.sksi_display_external_facts(query_form_module_list_pairs, mt);
    }
    
    public static SubLObject declare_sksi_external_gaf_argument_browser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser", "cb_link_sksi_external_gaf_argument", "CB-LINK-SKSI-EXTERNAL-GAF-ARGUMENT", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser", "display_sksi_supported_gaf_argument_positions_for_term", "DISPLAY-SKSI-SUPPORTED-GAF-ARGUMENT-POSITIONS-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser", "sksi_external_gaf_argument_index", "SKSI-EXTERNAL-GAF-ARGUMENT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser", "sksi_external_gaf_argument_predicate_index", "SKSI-EXTERNAL-GAF-ARGUMENT-PREDICATE-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser", "sksi_external_gaf_argument", "SKSI-EXTERNAL-GAF-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser", "sksi_external_gaf_argument_internal", "SKSI-EXTERNAL-GAF-ARGUMENT-INTERNAL", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser", "sksi_external_gaf_argument_rec", "SKSI-EXTERNAL-GAF-ARGUMENT-REC", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser", "sksi_external_gaf_argument_rec_arg", "SKSI-EXTERNAL-GAF-ARGUMENT-REC-ARG", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser", "sksi_external_gaf_argument_rec_arg_pred", "SKSI-EXTERNAL-GAF-ARGUMENT-REC-ARG-PRED", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser", "sksi_external_gaf_argument_rec_arg_pred_mt", "SKSI-EXTERNAL-GAF-ARGUMENT-REC-ARG-PRED-MT", 4, 1, false);
        return (SubLObject)sksi_external_gaf_argument_browser.NIL;
    }
    
    public static SubLObject init_sksi_external_gaf_argument_browser_file() {
        return (SubLObject)sksi_external_gaf_argument_browser.NIL;
    }
    
    public static SubLObject setup_sksi_external_gaf_argument_browser_file() {
        cb_utilities.setup_cb_link_method((SubLObject)sksi_external_gaf_argument_browser.$kw6$SKSI_EXTERNAL_GAF_ARGUMENT, (SubLObject)sksi_external_gaf_argument_browser.$sym7$CB_LINK_SKSI_EXTERNAL_GAF_ARGUMENT, (SubLObject)sksi_external_gaf_argument_browser.FIVE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)sksi_external_gaf_argument_browser.$sym25$SKSI_EXTERNAL_GAF_ARGUMENT, (SubLObject)sksi_external_gaf_argument_browser.$kw26$HTML_HANDLER);
        return (SubLObject)sksi_external_gaf_argument_browser.NIL;
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
    
    static {
        me = (SubLFile)new sksi_external_gaf_argument_browser();
        $kw0$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $str1$sksi_external_gaf_argument__A = SubLObjectFactory.makeString("sksi-external-gaf-argument&~A");
        $str2$__a = SubLObjectFactory.makeString("&~a");
        $str3$Arg__a = SubLObjectFactory.makeString("Arg ~a");
        $str4$External_GAFs = SubLObjectFactory.makeString("External GAFs");
        $str5$___a_ = SubLObjectFactory.makeString(" (~a)");
        $kw6$SKSI_EXTERNAL_GAF_ARGUMENT = SubLObjectFactory.makeKeyword("SKSI-EXTERNAL-GAF-ARGUMENT");
        $sym7$CB_LINK_SKSI_EXTERNAL_GAF_ARGUMENT = SubLObjectFactory.makeSymbol("CB-LINK-SKSI-EXTERNAL-GAF-ARGUMENT");
        $sym8$_ = SubLObjectFactory.makeSymbol("<");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("MT-SPEC"));
        $str11$Could_not_determine_an_index_hook = SubLObjectFactory.makeString("Could not determine an index-hook from ~a");
        $str12$Could_not_determine_an_arg_from__ = SubLObjectFactory.makeString("Could not determine an arg from ~a");
        $str13$Could_not_determine_a_term_from__ = SubLObjectFactory.makeString("Could not determine a term from ~a");
        $str14$External_GAF_index_for_ = SubLObjectFactory.makeString("External GAF index for ");
        $str15$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str16$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw17$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw18$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str19$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str20$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str21$button = SubLObjectFactory.makeString("button");
        $str22$reload = SubLObjectFactory.makeString("reload");
        $str23$Refresh = SubLObjectFactory.makeString("Refresh");
        $str24$reloadCurrentFrame__reloadFrameBu = SubLObjectFactory.makeString("reloadCurrentFrame('reloadFrameButton');");
        $sym25$SKSI_EXTERNAL_GAF_ARGUMENT = SubLObjectFactory.makeSymbol("SKSI-EXTERNAL-GAF-ARGUMENT");
        $kw26$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym27$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const28$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw29$NEW = SubLObjectFactory.makeKeyword("NEW");
    }
}

/*

	Total time: 231 ms
	
*/