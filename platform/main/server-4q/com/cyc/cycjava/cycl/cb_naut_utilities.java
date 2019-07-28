package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cb_naut_utilities;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_gaf_argument_browser;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_term_browser;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.cb_naut_utilities.*;
import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cb_naut_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new cb_naut_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.cb_naut_utilities";

    public static final String myFingerPrint = "342aa704c39b4fcd2296ef756377db7a67083e6e30fb7b09daeab6a8ec412e98";

    private static final SubLString $$$NAUT = makeString("NAUT");

    private static final SubLString $str1$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str2$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    public static final SubLString $str7$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");



    private static final SubLSymbol $KBQ_ASK_IN_PROOF_CHECKER = makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");



    private static final SubLSymbol INDEX_BROWSER = makeSymbol("INDEX-BROWSER");









    private static final SubLSymbol CB_C_PERTINENT_QUERY_LINKS = makeSymbol("CB-C-PERTINENT-QUERY-LINKS");



    private static final SubLString $$$term = makeString("term");



    private static final SubLString $str24$Checking_for_Pertinent_Queries___ = makeString("Checking for Pertinent Queries...");



    private static final SubLString $$$div = makeString("div");



    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol $SKSI_EXTERNAL_TERM_GAF_ARGUMENT = makeKeyword("SKSI-EXTERNAL-TERM-GAF-ARGUMENT");

    private static final SubLSymbol $SKSI_EXTERNAL_TERM_PREDICATE_EXTENT = makeKeyword("SKSI-EXTERNAL-TERM-PREDICATE-EXTENT");



    private static final SubLString $str32$Definitional_and_Documentation_In = makeString("Definitional and Documentation Info for ~S");

    private static final SubLString $$$Refresh = makeString("Refresh");

    private static final SubLString $str34$reloadCurrentFrame__reloadFrameBu = makeString("reloadCurrentFrame('reloadFrameButton');");

    private static final SubLString $str35$Documentation_for_NAUT__ = makeString("Documentation for NAUT: ");

    private static final SubLString $str36$___ = makeString(" : ");

    private static final SubLString $str37$Derived_SBHL_Assertions_ = makeString("Derived SBHL Assertions:");

    private static final SubLString $str38$Mt__ = makeString("Mt: ");

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLString $str42$Definitional_info_for__A = makeString("Definitional info for ~A");

    private static final SubLString $str43$Corresponding_Cyc_terms_ = makeString("Corresponding Cyc terms:");

    private static final SubLList $list44 = list(reader_make_constant_shell(makeString("SchemaObjectFn")), reader_make_constant_shell(makeString("SourceSchemaObjectFn")));

    private static final SubLString $str45$External_Assertions_ = makeString("External Assertions:");

    private static final SubLString $str46$Definitional_Information_for_NAUT = makeString("Definitional Information for NAUT: ");

    private static final SubLString $str47$Corresponding_HL_NART__ = makeString("Corresponding HL NART: ");

    private static final SubLObject $const48$functionCorrespondingPredicate_Ca = reader_make_constant_shell(makeString("functionCorrespondingPredicate-Canonical"));

    private static final SubLList $list49 = list(TWO_INTEGER, THREE_INTEGER);

    private static final SubLString $str50$Corresponding_formula_via___funct = makeString("Corresponding formula via #$functionCorrespondingPredicate-Canonical:");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $str53$_ff0000 = makeString("#ff0000");

    private static final SubLString $str54$_NOT_STRICTLY_WFF_ = makeString("(NOT STRICTLY WFF)");

    private static final SubLString $str55$KB_Assertions_ = makeString("KB Assertions:");

    private static final SubLObject $$salientAssertions = reader_make_constant_shell(makeString("salientAssertions"));

    private static final SubLSymbol $GAF_ARG_NAUT = makeKeyword("GAF-ARG-NAUT");



    private static final SubLList $list59 = list(makeSymbol("INDEX-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("ARG-STRING"), makeSymbol("PRED-SPEC"), makeSymbol("MT-SPEC"));

    private static final SubLString $str60$Could_not_determine_a_NAUT_from__ = makeString("Could not determine a NAUT from ~a");

    private static final SubLString $str61$Could_not_determine_an_arg_from__ = makeString("Could not determine an arg from ~a");

    private static final SubLString $str62$Could_not_determine_a_term_from__ = makeString("Could not determine a term from ~a");

    private static final SubLString $str63$Could_not_determine_a_microtheory = makeString("Could not determine a microtheory from ~a");

    private static final SubLString $str64$GAF_index_for__S = makeString("GAF index for ~S");

    private static final SubLSymbol CB_C_GAF_ARG_NAUT = makeSymbol("CB-C-GAF-ARG-NAUT");





    private static final SubLString $str68$cb_c_gaf_arg_naut__A = makeString("cb-c-gaf-arg-naut&~A");

    private static final SubLString $str69$__a = makeString("&~a");

    private static final SubLString $str70$Arg__a = makeString("Arg ~a");

    private static final SubLString $$$All_GAFs = makeString("All GAFs");

    private static final SubLString $str72$___a_ = makeString(" (~a)");

    private static final SubLSymbol CB_LINK_GAF_ARG_NAUT = makeSymbol("CB-LINK-GAF-ARG-NAUT");





    private static final SubLString $str76$Got_invalid_args_ARGNUM___A__PRED = makeString("Got invalid args ARGNUM: ~A, PRED: ~A, MT: ~A.~%");



    private static final SubLList $list78 = list(makeSymbol("INDEX-SPEC"));

    private static final SubLString $str79$OTHER_index_for__A = makeString("OTHER index for ~A");

    private static final SubLSymbol CB_C_OTHER_NAUT = makeSymbol("CB-C-OTHER-NAUT");

    private static final SubLString $str81$cb_c_other_naut__A = makeString("cb-c-other-naut&~A");

    private static final SubLString $$$Miscellaneous = makeString("Miscellaneous");

    private static final SubLSymbol CB_LINK_OTHER_NAUT = makeSymbol("CB-LINK-OTHER-NAUT");

    private static final SubLString $str84$Miscellaneous_References_ = makeString("Miscellaneous References:");

    private static final SubLSymbol CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY = makeSymbol("CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY");

    private static final SubLSymbol CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY = makeSymbol("CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY");

    private static final SubLSymbol CB_ASSERTION_LINK_WITH_MT = makeSymbol("CB-ASSERTION-LINK-WITH-MT");

    private static final SubLSymbol CB_ASSERTION_LINK = makeSymbol("CB-ASSERTION-LINK");

    public static SubLObject cb_naut_index(final SubLObject index_hook) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$NAUT;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str2$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str7$yui_skin_sam);
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
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        final SubLObject _prev_bind_0_$5 = dhtml_macros.$html_element_id$.currentBinding(thread);
                        try {
                            dhtml_macros.$html_element_id$.bind(ZERO_INTEGER, thread);
                            dhtml_macros.basic_ajax_scripts();
                            html_markup(dhtml_macros.$js_load_later$.getGlobalValue());
                            cb_naut_index_guts(index_hook);
                        } finally {
                            dhtml_macros.$html_element_id$.rebind(_prev_bind_0_$5, thread);
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

    public static SubLObject cb_naut_term_toolbar(final SubLObject naut) {
        if (NIL != kb_query.kbq_query_spec_p(naut)) {
            html_indent(UNPROVIDED);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            cb_link($KBQ_ASK, naut, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            if (NIL != cb_kb_query.kbq_query_practice_rules(naut)) {
                html_indent(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_link($KBQ_ASK_IN_PROOF_CHECKER, naut, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            html_indent(UNPROVIDED);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            cb_link($KBQ_EDIT, naut, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            html_hr(UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_naut_index_guts(final SubLObject index_hook) {
        final SubLThread thread = SubLProcess.currentSubLThread();
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
            final SubLObject _prev_bind_0_$6 = $cb_inside_quoteP$.currentBinding(thread);
            try {
                $cb_inside_quoteP$.bind(T, thread);
                cb_browser.cb_term_page_heading(index_hook, INDEX_BROWSER);
            } finally {
                $cb_inside_quoteP$.rebind(_prev_bind_0_$6, thread);
            }
            html_hr(UNPROVIDED, UNPROVIDED);
            if (NIL != narts_high.naut_p(index_hook)) {
                cb_naut_term_toolbar(index_hook);
                if ($CYCL == $cb_major_presentation_language$.getDynamicValue(thread)) {
                    cb_browser.cb_c_el_hl_formulas_link(index_hook);
                }
                html_newline(UNPROVIDED);
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_indent(ZERO_INTEGER);
                cb_link($DOCUMENTATION, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_indent(ZERO_INTEGER);
                cb_link($DEFINITIONAL, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                dhtml_macros.js_delayed_load_int(list(new SubLObject[]{ $HANDLER, CB_C_PERTINENT_QUERY_LINKS, $ARGS, list(bq_cons($$$term, index_hook)), $MESSAGE, $str24$Checking_for_Pertinent_Queries___, $TAG, $$$div, $DELAY, $int$50 }));
            }
            html_hr(UNPROVIDED, UNPROVIDED);
            cb_browser.cb_c_index_kb_assertions_guts(index_hook);
            if (NIL != sksi_external_term_browser.sksi_supported_external_gaf_argument_termP(index_hook)) {
                html_hr(UNPROVIDED, UNPROVIDED);
                cb_link($SKSI_EXTERNAL_TERM_GAF_ARGUMENT, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                sksi_external_term_browser.display_sksi_supported_gaf_argument_positions_for_external_term(index_hook);
            }
            if (NIL != sksi_external_term_browser.sksi_supported_external_predicate_termP(index_hook)) {
                html_hr(UNPROVIDED, UNPROVIDED);
                cb_link($SKSI_EXTERNAL_TERM_PREDICATE_EXTENT, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_default_naut_content_internal(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($cb_c_default_content$.getDynamicValue(thread) == $NONE) {
            return cb_frames.cb_empty_content_frame(naut);
        }
        cb_c_naut_info(naut);
        return NIL;
    }

    public static SubLObject cb_c_naut_info(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var;
        final SubLObject title = title_var = format(NIL, $str32$Definitional_and_Documentation_In, naut);
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str7$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_markup($str34$reloadCurrentFrame__reloadFrameBu);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        cb_browser.cb_c_term_header(naut);
                        html_br();
                        html_br();
                        cb_print_definitional_information_naut(naut);
                        html_br();
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_br();
                        cb_print_documentation_information_naut(naut);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject html_title_for_term(final SubLObject title, final SubLObject v_term, SubLObject size, SubLObject extra_newline) {
        if (size == UNPROVIDED) {
            size = FOUR_INTEGER;
        }
        if (extra_newline == UNPROVIDED) {
            extra_newline = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        SubLObject size_val = size;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(title);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_br();
        if (NIL != v_term) {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            size_val = (size.numE(ONE_INTEGER)) ? ONE_INTEGER : subtract(size, ONE_INTEGER);
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != size_val) {
                html_markup(html_macros.$html_font_size$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(size_val);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_form(v_term, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_br();
        }
        if (NIL != extra_newline) {
            html_br();
        }
        return NIL;
    }

    public static SubLObject cb_print_documentation_information_naut(final SubLObject naut) {
        html_title_for_term($str35$Documentation_for_NAUT__, naut, UNPROVIDED, UNPROVIDED);
        final SubLObject function = cycl_utilities.formula_operator_recursive(naut);
        if (NIL != forts.fort_p(function)) {
            cb_browser.cb_c_documentation_internal_guts(function);
        }
        return NIL;
    }

    public static SubLObject htmlize_derived_naut_definitional_info_int(final SubLObject items, final SubLObject pred) {
        if (NIL != items) {
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            cb_form(pred, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_princ($str36$___);
            SubLObject cdolist_list_var = items;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_form(item, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject htmlize_derived_naut_definitional_info(final SubLObject naut, final SubLObject preds) {
        html_br();
        html_title_for_term($str37$Derived_SBHL_Assertions_, NIL, FOUR_INTEGER, UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str38$Mt__);
        cb_form($$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        if (NIL != subl_promotions.memberP($$isa, preds, UNPROVIDED, UNPROVIDED)) {
            final SubLObject isas = isa.min_isa(naut, $$UniversalVocabularyMt, UNPROVIDED);
            htmlize_derived_naut_definitional_info_int(isas, $$isa);
        }
        if (NIL != subl_promotions.memberP($$genls, preds, UNPROVIDED, UNPROVIDED)) {
            final SubLObject v_genls = genls.min_genls(naut, $$UniversalVocabularyMt, UNPROVIDED);
            htmlize_derived_naut_definitional_info_int(v_genls, $$genls);
        }
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_c_definitional_internal_naut(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var;
        final SubLObject title = title_var = format(NIL, $str42$Definitional_info_for__A, naut);
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str7$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_markup($str34$reloadCurrentFrame__reloadFrameBu);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        cb_print_definitional_information_naut(naut);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$12, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$11, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject display_cyc_terms_for_sksi_external_term_naut(final SubLObject naut) {
        final SubLObject cyc_terms = sksi_kb_accessors.cyc_terms_for_sksi_external_term_naut(naut);
        if (NIL != cyc_terms) {
            html_title_for_term($str43$Corresponding_Cyc_terms_, NIL, FOUR_INTEGER, NIL);
            SubLObject cdolist_list_var = cyc_terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_form(v_term, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
            html_newline(TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject display_external_definitional_information_for_naut(final SubLObject naut, final SubLObject preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject functor = cycl_utilities.nat_functor(naut);
        final SubLObject _prev_bind_0 = $cb_c_gaf_arg_last_mt$.currentBinding(thread);
        try {
            $cb_c_gaf_arg_last_mt$.bind(NIL, thread);
            if (NIL != subl_promotions.memberP(functor, $list44, UNPROVIDED, UNPROVIDED)) {
                html_newline(UNPROVIDED);
                html_title_for_term($str45$External_Assertions_, NIL, FOUR_INTEGER, NIL);
                html_newline(UNPROVIDED);
                final SubLObject visible_mt = sksi_external_term_browser.mt_for_external_term(naut);
                SubLObject cdolist_list_var = preds;
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate(sksi_external_term_browser.sksi_supported_external_term_logical_schema(naut), ONE_INTEGER, pred, visible_mt)) {
                        sksi_external_gaf_argument_browser.sksi_external_gaf_argument_internal(naut, ONE_INTEGER, pred, NIL, T, visible_mt);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            }
        } finally {
            $cb_c_gaf_arg_last_mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_print_definitional_information_naut(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_title_for_term($str46$Definitional_Information_for_NAUT, naut, UNPROVIDED, UNPROVIDED);
        final SubLObject corresponding_nart = narts_high.find_nart(naut);
        SubLObject type = NIL;
        final SubLObject _prev_bind_0 = cb_viewpoint.$cb_use_mts_filter$.currentBinding(thread);
        try {
            cb_viewpoint.$cb_use_mts_filter$.bind(NIL, thread);
            if (NIL != nart_handles.nart_p(corresponding_nart)) {
                html_title_for_term($str47$Corresponding_HL_NART__, corresponding_nart, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
            } else
                if (NIL != indexed_term_p(narts_high.nart_substitute(cycl_utilities.nat_functor(naut)))) {
                    final SubLObject corresponding_fn_canons = kb_mapping_utilities.pred_value_tuples_in_any_mt(narts_high.nart_substitute(cycl_utilities.nat_functor(naut)), $const48$functionCorrespondingPredicate_Ca, ONE_INTEGER, $list49, UNPROVIDED);
                    if (NIL != corresponding_fn_canons) {
                        html_title_for_term($str50$Corresponding_formula_via___funct, NIL, FOUR_INTEGER, NIL);
                        SubLObject cdolist_list_var = corresponding_fn_canons;
                        SubLObject corresponding_fn_canon = NIL;
                        corresponding_fn_canon = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject corresponding_fn_canon_pred = corresponding_fn_canon.first();
                            final SubLObject corresponding_fn_canon_pos = second(corresponding_fn_canon);
                            SubLObject corresponding_formula = append(list(corresponding_fn_canon_pred), copy_list(cycl_utilities.nat_args(naut, UNPROVIDED)));
                            corresponding_formula = list_utilities.ninsert_by_position(copy_list(naut), corresponding_formula, corresponding_fn_canon_pos);
                            final SubLObject _prev_bind_0_$15 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                if (NIL == wff.el_strictly_wffP(corresponding_formula, UNPROVIDED, UNPROVIDED)) {
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color($str53$_ff0000));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str54$_NOT_STRICTLY_WFF_);
                                        html_newline(UNPROVIDED);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$15, thread);
                            }
                            cb_form(corresponding_formula, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            cdolist_list_var = cdolist_list_var.rest();
                            corresponding_fn_canon = cdolist_list_var.first();
                        } 
                    }
                }

            display_cyc_terms_for_sksi_external_term_naut(naut);
            final SubLObject _prev_bind_0_$17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                type = kb_utilities.definitional_type_for_naut(naut);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$17, thread);
            }
            cb_browser.cb_c_gaf_arg_header(ONE_INTEGER);
            final SubLObject _prev_bind_0_$18 = $cb_c_gaf_arg_last_mt$.currentBinding(thread);
            try {
                $cb_c_gaf_arg_last_mt$.bind(NIL, thread);
                final SubLObject preds = cb_definitional_preds_for_type(type);
                htmlize_derived_naut_definitional_info(naut, preds);
                html_title_for_term($str55$KB_Assertions_, NIL, FOUR_INTEGER, NIL);
                SubLObject cdolist_list_var2 = preds;
                SubLObject pred = NIL;
                pred = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    cb_c_gaf_arg_rec_arg_pred_naut(naut, ONE_INTEGER, pred);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    pred = cdolist_list_var2.first();
                } 
                cb_c_gaf_arg_rec_arg_pred_naut(naut, ONE_INTEGER, $$salientAssertions);
                display_external_definitional_information_for_naut(naut, preds);
            } finally {
                $cb_c_gaf_arg_last_mt$.rebind(_prev_bind_0_$18, thread);
            }
        } finally {
            cb_viewpoint.$cb_use_mts_filter$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_c_total_internal_naut(final SubLObject naut) {
        cb_c_gaf_arg_naut_internal(naut, NIL, NIL, NIL);
        html_hr(UNPROVIDED, UNPROVIDED);
        cb_c_other_naut_internal(naut);
        return NIL;
    }

    public static SubLObject cb_c_index_naut_index(final SubLObject naut) {
        cb_c_index_gaf_args_naut(naut);
        cb_c_index_other_naut(naut);
        if (NIL != hlmt.hlmtP(naut)) {
            cb_browser.cb_c_index_mt(naut);
        }
        return NIL;
    }

    public static SubLObject cb_c_index_gaf_args_naut(final SubLObject index_hook) {
        final SubLObject gaf_count = cb_relevant_num_gaf_arg_index_naut(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (gaf_count.numG(ZERO_INTEGER)) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_indent(ZERO_INTEGER);
            cb_link($GAF_ARG_NAUT, index_hook, gaf_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            SubLObject cdolist_list_var;
            final SubLObject arg_list = cdolist_list_var = cb_relevant_key_gaf_arg_index_naut(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_gaf_arg_index_naut(index_hook, arg);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject cb_gaf_arg_index_naut(final SubLObject index_hook, final SubLObject arg) {
        final SubLObject count = cb_relevant_num_gaf_arg_index_naut(index_hook, arg, UNPROVIDED, UNPROVIDED);
        if (count.numG(ZERO_INTEGER)) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_indent(ONE_INTEGER);
            cb_link($GAF_ARG_NAUT, index_hook, count, arg, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            SubLObject cdolist_list_var;
            final SubLObject preds = cdolist_list_var = cb_relevant_key_gaf_arg_index_naut(index_hook, arg, UNPROVIDED, UNPROVIDED);
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_gaf_arg_pred_index_naut(index_hook, arg, pred);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject cb_gaf_arg_pred_index_naut(final SubLObject index_hook, final SubLObject arg, final SubLObject pred) {
        final SubLObject count = cb_relevant_num_gaf_arg_index_naut(index_hook, arg, pred, UNPROVIDED);
        if (count.numG(ZERO_INTEGER)) {
            final SubLObject mts = cb_relevant_key_gaf_arg_index_naut(index_hook, arg, pred, UNPROVIDED);
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_indent(TWO_INTEGER);
            cb_link($GAF_ARG_NAUT, index_hook, count, arg, pred, UNPROVIDED);
            if (!length(mts).numLE(ONE_INTEGER)) {
                SubLObject cdolist_list_var = mts;
                SubLObject mt = NIL;
                mt = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cb_gaf_arg_pred_mt_index_naut(index_hook, arg, pred, mt);
                    cdolist_list_var = cdolist_list_var.rest();
                    mt = cdolist_list_var.first();
                } 
            }
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_gaf_arg_pred_mt_index_naut(final SubLObject index_hook, final SubLObject arg, final SubLObject pred, final SubLObject mt) {
        final SubLObject count = cb_relevant_num_gaf_arg_index_naut(index_hook, arg, pred, mt);
        if (count.numG(ZERO_INTEGER)) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_indent(THREE_INTEGER);
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            cb_link($GAF_ARG_NAUT, index_hook, count, arg, pred, mt);
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_c_index_other_naut(final SubLObject index_hook) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject count = cb_relevant_num_other_index_naut(index_hook, UNPROVIDED);
            if (count.numG(ZERO_INTEGER)) {
                html_hr(UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_indent(ZERO_INTEGER);
                cb_link($OTHER_NAUT, index_hook, count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_c_gaf_arg_naut(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index_spec = NIL;
        destructuring_bind_must_consp(args, args, $list59);
        index_spec = args.first();
        SubLObject current = args.rest();
        final SubLObject arg_string = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list59);
        current = current.rest();
        final SubLObject pred_spec = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list59);
        current = current.rest();
        final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list59);
        current = current.rest();
        if (NIL == current) {
            final SubLObject index_hook = cb_guess_naut(index_spec, UNPROVIDED);
            SubLObject arg = NIL;
            SubLObject predicate = NIL;
            SubLObject mt = NIL;
            if (NIL == term.closed_nautP(index_hook, UNPROVIDED)) {
                return cb_error($str60$Could_not_determine_a_NAUT_from__, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != arg_string) {
                arg = read_from_string_ignoring_errors(arg_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
                if (!arg.isFixnum()) {
                    return cb_error($str61$Could_not_determine_an_arg_from__, arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != pred_spec) {
                    predicate = cb_guess_fort(pred_spec, UNPROVIDED);
                    if (NIL == forts.fort_p(predicate)) {
                        return cb_error($str62$Could_not_determine_a_term_from__, pred_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != mt_spec) {
                        mt = cb_guess_hlmt(mt_spec);
                        if (NIL == hlmt.hlmt_p(mt)) {
                            return cb_error($str63$Could_not_determine_a_microtheory, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            final SubLObject title_var;
            final SubLObject title = title_var = format(NIL, $str64$GAF_index_for__S, index_hook);
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str2$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str7$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_markup($str34$reloadCurrentFrame__reloadFrameBu);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            cb_browser.cb_c_term_header(index_hook);
                            html_newline(TWO_INTEGER);
                            cb_c_gaf_arg_naut_internal(index_hook, arg, predicate, mt);
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$19, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(args, $list59);
        }
        return NIL;
    }

    public static SubLObject cb_link_gaf_arg_naut(final SubLObject index_hook, final SubLObject count, SubLObject arg, SubLObject predicate, SubLObject mt) {
        if (arg == UNPROVIDED) {
            arg = NIL;
        }
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($CONTENT);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str68$cb_c_gaf_arg_naut__A, cb_index_identifier(index_hook));
        if (NIL != arg) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str69$__a, arg);
            if (NIL != predicate) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str69$__a, cb_fort_identifier(predicate));
                if (NIL != mt) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str69$__a, cb_hlmt_identifier(mt));
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
                cb_show_assertion_hlmt_readably(mt);
            } else
                if (NIL != predicate) {
                    html_princ(cb_fort_display_string(predicate));
                } else
                    if (NIL != arg) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str70$Arg__a, arg);
                    } else {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $$$All_GAFs);
                    }


        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        if (count.numG(ONE_INTEGER)) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str72$___a_, count);
        }
        return index_hook;
    }

    public static SubLObject cb_c_gaf_arg_naut_internal(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_c_gaf_arg_last_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $assertion_filter_hook$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            $cb_c_gaf_arg_last_mt$.bind(NIL, thread);
            $assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$23 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$24 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$25 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$26 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$27 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$28 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                        pph_vars.$paraphrase_mode$.bind($HTML, thread);
                                        if (NIL == arg) {
                                            cb_c_gaf_arg_rec_naut(index_hook);
                                        } else
                                            if (NIL == predicate) {
                                                cb_c_gaf_arg_rec_arg_naut(index_hook, arg);
                                            } else {
                                                cb_browser.cb_c_gaf_arg_header(arg);
                                                if (NIL == mt) {
                                                    cb_c_gaf_arg_rec_arg_pred_naut(index_hook, arg, predicate);
                                                } else {
                                                    final SubLObject _prev_bind_0_$28 = $cb_c_gaf_arg_use_binary$.currentBinding(thread);
                                                    try {
                                                        $cb_c_gaf_arg_use_binary$.bind(makeBoolean((NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) && arg.eql(ONE_INTEGER)), thread);
                                                        if (NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) {
                                                            final SubLObject _prev_bind_0_$29 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$29 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                            try {
                                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                $cb_c_gaf_arg_use_binary$.setDynamicValue(arity.binaryP(predicate), thread);
                                                            } finally {
                                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$29, thread);
                                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$29, thread);
                                                            }
                                                        }
                                                        cb_browser.cb_c_gaf_arg_rec_arg_pred_mt(index_hook, arg, predicate, mt);
                                                    } finally {
                                                        $cb_c_gaf_arg_use_binary$.rebind(_prev_bind_0_$28, thread);
                                                    }
                                                }
                                            }

                                    } finally {
                                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_1_$28, thread);
                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$27, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$26, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$25, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$24, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$23, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_3, thread);
            $assertion_filter_hook$.rebind(_prev_bind_2, thread);
            $cb_c_gaf_arg_last_mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_c_gaf_arg_rec_naut(final SubLObject index_hook) {
        SubLObject some_arg_done = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cb_relevant_key_gaf_arg_index_naut(index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != some_arg_done) {
                html_hr(UNPROVIDED, UNPROVIDED);
            }
            cb_c_gaf_arg_rec_arg_naut(index_hook, arg);
            some_arg_done = T;
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cb_c_gaf_arg_rec_arg_naut(final SubLObject index_hook, final SubLObject arg) {
        cb_browser.cb_c_gaf_arg_header(arg);
        final SubLObject predicates = cb_relevant_key_gaf_arg_index_naut(index_hook, arg, UNPROVIDED, UNPROVIDED);
        $cb_c_gaf_arg_last_mt$.setDynamicValue(NIL);
        SubLObject cdolist_list_var = predicates;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cb_c_gaf_arg_rec_arg_pred_naut(index_hook, arg, predicate);
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cb_c_gaf_arg_rec_arg_pred_naut(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_c_gaf_arg_use_binary$.currentBinding(thread);
        try {
            $cb_c_gaf_arg_use_binary$.bind(makeBoolean((NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) && arg.eql(ONE_INTEGER)), thread);
            final SubLObject mts = cb_relevant_key_gaf_arg_index_naut(index_hook, arg, predicate, UNPROVIDED);
            if (NIL != $cb_c_gaf_arg_use_binary$.getDynamicValue(thread)) {
                final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    $cb_c_gaf_arg_use_binary$.setDynamicValue(arity.binaryP(predicate), thread);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
                }
            }
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_browser.cb_c_gaf_arg_rec_arg_pred_mt(index_hook, arg, predicate, mt);
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            } 
        } finally {
            $cb_c_gaf_arg_use_binary$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_relevant_gaf_arg_index_naut_args_validP(final SubLObject argnum, final SubLObject pred, final SubLObject mt) {
        if (NIL != mt) {
            return makeBoolean((NIL != argnum) && (NIL != pred));
        }
        if (NIL != pred) {
            return list_utilities.sublisp_boolean(argnum);
        }
        return T;
    }

    public static SubLObject cb_relevant_key_gaf_arg_index_naut(final SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cb_relevant_gaf_arg_index_naut_args_validP(argnum, pred, mt)) {
            Errors.error($str76$Got_invalid_args_ARGNUM___A__PRED, argnum, pred, mt);
        }
        SubLObject result = NIL;
        if (NIL == argnum) {
            if (NIL != mt) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                    SubLObject indexed_terms = cycl_utilities.expression_gather(v_term, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                    if (NIL != indexed_term_p(pred)) {
                        indexed_terms = cons(pred, indexed_terms);
                    }
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, UNPROVIDED);
                    SubLObject assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (((NIL == pred) || pred.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion)))) && (NIL != term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion)))) {
                            result = cons(term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion)), result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else {
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    SubLObject indexed_terms2 = cycl_utilities.expression_gather(v_term, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                    if (NIL != indexed_term_p(pred)) {
                        indexed_terms2 = cons(pred, indexed_terms2);
                    }
                    SubLObject cdolist_list_var2 = virtual_indexing.gather_overlap_index(indexed_terms2, UNPROVIDED);
                    SubLObject assertion2 = NIL;
                    assertion2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (((NIL == pred) || pred.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion2)))) && (NIL != term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion2)))) {
                            result = cons(term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion2)), result);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion2 = cdolist_list_var2.first();
                    } 
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                }
            }
        } else
            if (NIL == pred) {
                if (NIL != mt) {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                        SubLObject indexed_terms = cycl_utilities.expression_gather(v_term, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                        if (NIL != indexed_term_p(NIL)) {
                            indexed_terms = cons(NIL, indexed_terms);
                        }
                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, UNPROVIDED);
                        SubLObject assertion = NIL;
                        assertion = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != (NIL != argnum ? equal(v_term, cycl_utilities.formula_arg(assertions_high.assertion_formula(assertion), argnum, UNPROVIDED)) : term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion)))) {
                                result = cons(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion)), result);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion = cdolist_list_var.first();
                        } 
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        SubLObject indexed_terms2 = cycl_utilities.expression_gather(v_term, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                        if (NIL != indexed_term_p(NIL)) {
                            indexed_terms2 = cons(NIL, indexed_terms2);
                        }
                        SubLObject cdolist_list_var2 = virtual_indexing.gather_overlap_index(indexed_terms2, UNPROVIDED);
                        SubLObject assertion2 = NIL;
                        assertion2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if (NIL != (NIL != argnum ? equal(v_term, cycl_utilities.formula_arg(assertions_high.assertion_formula(assertion2), argnum, UNPROVIDED)) : term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion2)))) {
                                result = cons(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion2)), result);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            assertion2 = cdolist_list_var2.first();
                        } 
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                    }
                }
            } else
                if (NIL == mt) {
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        SubLObject indexed_terms2 = cycl_utilities.expression_gather(v_term, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                        if (NIL != indexed_term_p(pred)) {
                            indexed_terms2 = cons(pred, indexed_terms2);
                        }
                        SubLObject cdolist_list_var2 = virtual_indexing.gather_overlap_index(indexed_terms2, UNPROVIDED);
                        SubLObject assertion2 = NIL;
                        assertion2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if (((NIL == pred) || pred.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion2)))) && (NIL != (NIL != argnum ? equal(v_term, cycl_utilities.formula_arg(assertions_high.assertion_formula(assertion2), argnum, UNPROVIDED)) : term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion2))))) {
                                result = cons(assertions_high.assertion_mt(assertion2), result);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            assertion2 = cdolist_list_var2.first();
                        } 
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                    }
                }


        result = nreverse(list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if (NIL == argnum) {
            result = cb_sort_args_for_display(result);
        } else
            if (NIL == pred) {
                result = cb_sort_preds_for_display(v_term, result, UNPROVIDED);
            } else
                if (NIL == mt) {
                    result = cb_sort_mts_for_display(result, UNPROVIDED);
                }


        return result;
    }

    public static SubLObject cb_relevant_num_gaf_arg_index_naut(final SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt) {
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cb_relevant_gaf_arg_index_naut_args_validP(argnum, pred, mt)) {
            Errors.error($str76$Got_invalid_args_ARGNUM___A__PRED, argnum, pred, mt);
        }
        SubLObject result = ZERO_INTEGER;
        if (NIL != mt) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                SubLObject indexed_terms = cycl_utilities.expression_gather(v_term, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                if (NIL != indexed_term_p(pred)) {
                    indexed_terms = cons(pred, indexed_terms);
                }
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, UNPROVIDED);
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (((NIL == pred) || pred.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion)))) && (NIL != (NIL != argnum ? equal(v_term, cycl_utilities.formula_arg(assertions_high.assertion_formula(assertion), argnum, UNPROVIDED)) : term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion))))) {
                        result = add(result, ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject indexed_terms2 = cycl_utilities.expression_gather(v_term, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                if (NIL != indexed_term_p(pred)) {
                    indexed_terms2 = cons(pred, indexed_terms2);
                }
                SubLObject cdolist_list_var2 = virtual_indexing.gather_overlap_index(indexed_terms2, UNPROVIDED);
                SubLObject assertion2 = NIL;
                assertion2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (((NIL == pred) || pred.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion2)))) && (NIL != (NIL != argnum ? equal(v_term, cycl_utilities.formula_arg(assertions_high.assertion_formula(assertion2), argnum, UNPROVIDED)) : term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion2))))) {
                        result = add(result, ONE_INTEGER);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    assertion2 = cdolist_list_var2.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            }
        }
        return result;
    }

    public static SubLObject cb_c_other_naut(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index_spec = NIL;
        destructuring_bind_must_consp(args, args, $list78);
        index_spec = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            final SubLObject index_hook = cb_guess_naut(index_spec, UNPROVIDED);
            if (NIL == term.closed_nautP(index_hook, UNPROVIDED)) {
                return cb_error($str60$Could_not_determine_a_NAUT_from__, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject title_var;
            final SubLObject title = title_var = format(NIL, $str79$OTHER_index_for__A, index_hook);
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str2$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$36 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str7$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_markup($str34$reloadCurrentFrame__reloadFrameBu);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            cb_browser.cb_c_term_header(index_hook);
                            html_newline(TWO_INTEGER);
                            cb_c_other_naut_internal(index_hook);
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$36, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$35, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(args, $list78);
        }
        return NIL;
    }

    public static SubLObject cb_link_other_naut(final SubLObject index_hook, final SubLObject count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($CONTENT);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str81$cb_c_other_naut__A, cb_naut_identifier(index_hook));
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
            html_princ($$$Miscellaneous);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        if (count.numG(ONE_INTEGER)) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str72$___a_, count);
        }
        return index_hook;
    }

    public static SubLObject cb_c_other_naut_internal(final SubLObject index_hook) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $assertion_filter_hook$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            $assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
            if (cb_relevant_num_other_index_naut(index_hook, UNPROVIDED).numG(ZERO_INTEGER)) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_princ($str84$Miscellaneous_References_);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(TWO_INTEGER);
                final SubLObject assertion_link_fn = (NIL != cb_browser.cb_show_el_formulas_for_hookP(index_hook)) ? symbol_function(CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY) : symbol_function(CB_ASSERTION_LINK_WITH_MT);
                final SubLObject _prev_bind_0_$39 = $cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
                final SubLObject _prev_bind_1_$40 = $cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
                try {
                    $cb_show_el_assertion_readably_last_formula$.bind(NIL, thread);
                    $cb_show_el_assertion_readably_last_mt$.bind(NIL, thread);
                    cb_relevant_key_other_index_naut(assertion_link_fn, index_hook, NIL);
                } finally {
                    $cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_1_$40, thread);
                    $cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0_$39, thread);
                }
            }
        } finally {
            $assertion_filter_hook$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_relevant_key_other_index_naut(final SubLObject function, final SubLObject v_term, final SubLObject truth) {
        kb_utilities.map_misc_index_naut(function, v_term, truth);
        return NIL;
    }

    public static SubLObject cb_relevant_num_other_index_naut(final SubLObject v_term, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject indexed_terms = cycl_utilities.expression_gather(v_term, INDEXED_TERM_P, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((((NIL == truth) || (NIL != assertions_high.assertion_has_truth(assertion, truth))) && (NIL == term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion)))) && ((NIL != cycl_utilities.expression_find(v_term, assertions_high.assertion_formula(assertion), T, symbol_function(EQUAL), UNPROVIDED)) || (NIL != cycl_utilities.expression_find(v_term, assertions_high.assertion_mt(assertion), T, symbol_function(EQUAL), UNPROVIDED)))) {
                    v_answer = add(v_answer, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject declare_cb_naut_utilities_file() {
        declareFunction(me, "cb_naut_index", "CB-NAUT-INDEX", 1, 0, false);
        declareFunction(me, "cb_naut_term_toolbar", "CB-NAUT-TERM-TOOLBAR", 1, 0, false);
        declareFunction(me, "cb_naut_index_guts", "CB-NAUT-INDEX-GUTS", 1, 0, false);
        declareFunction(me, "cb_default_naut_content_internal", "CB-DEFAULT-NAUT-CONTENT-INTERNAL", 1, 0, false);
        declareFunction(me, "cb_c_naut_info", "CB-C-NAUT-INFO", 1, 0, false);
        declareFunction(me, "html_title_for_term", "HTML-TITLE-FOR-TERM", 2, 2, false);
        declareFunction(me, "cb_print_documentation_information_naut", "CB-PRINT-DOCUMENTATION-INFORMATION-NAUT", 1, 0, false);
        declareFunction(me, "htmlize_derived_naut_definitional_info_int", "HTMLIZE-DERIVED-NAUT-DEFINITIONAL-INFO-INT", 2, 0, false);
        declareFunction(me, "htmlize_derived_naut_definitional_info", "HTMLIZE-DERIVED-NAUT-DEFINITIONAL-INFO", 2, 0, false);
        declareFunction(me, "cb_c_definitional_internal_naut", "CB-C-DEFINITIONAL-INTERNAL-NAUT", 1, 0, false);
        declareFunction(me, "display_cyc_terms_for_sksi_external_term_naut", "DISPLAY-CYC-TERMS-FOR-SKSI-EXTERNAL-TERM-NAUT", 1, 0, false);
        declareFunction(me, "display_external_definitional_information_for_naut", "DISPLAY-EXTERNAL-DEFINITIONAL-INFORMATION-FOR-NAUT", 2, 0, false);
        declareFunction(me, "cb_print_definitional_information_naut", "CB-PRINT-DEFINITIONAL-INFORMATION-NAUT", 1, 0, false);
        declareFunction(me, "cb_c_total_internal_naut", "CB-C-TOTAL-INTERNAL-NAUT", 1, 0, false);
        declareFunction(me, "cb_c_index_naut_index", "CB-C-INDEX-NAUT-INDEX", 1, 0, false);
        declareFunction(me, "cb_c_index_gaf_args_naut", "CB-C-INDEX-GAF-ARGS-NAUT", 1, 0, false);
        declareFunction(me, "cb_gaf_arg_index_naut", "CB-GAF-ARG-INDEX-NAUT", 2, 0, false);
        declareFunction(me, "cb_gaf_arg_pred_index_naut", "CB-GAF-ARG-PRED-INDEX-NAUT", 3, 0, false);
        declareFunction(me, "cb_gaf_arg_pred_mt_index_naut", "CB-GAF-ARG-PRED-MT-INDEX-NAUT", 4, 0, false);
        declareFunction(me, "cb_c_index_other_naut", "CB-C-INDEX-OTHER-NAUT", 1, 0, false);
        declareFunction(me, "cb_c_gaf_arg_naut", "CB-C-GAF-ARG-NAUT", 1, 0, false);
        declareFunction(me, "cb_link_gaf_arg_naut", "CB-LINK-GAF-ARG-NAUT", 2, 3, false);
        declareFunction(me, "cb_c_gaf_arg_naut_internal", "CB-C-GAF-ARG-NAUT-INTERNAL", 4, 0, false);
        declareFunction(me, "cb_c_gaf_arg_rec_naut", "CB-C-GAF-ARG-REC-NAUT", 1, 0, false);
        declareFunction(me, "cb_c_gaf_arg_rec_arg_naut", "CB-C-GAF-ARG-REC-ARG-NAUT", 2, 0, false);
        declareFunction(me, "cb_c_gaf_arg_rec_arg_pred_naut", "CB-C-GAF-ARG-REC-ARG-PRED-NAUT", 3, 0, false);
        declareFunction(me, "cb_relevant_gaf_arg_index_naut_args_validP", "CB-RELEVANT-GAF-ARG-INDEX-NAUT-ARGS-VALID?", 3, 0, false);
        declareFunction(me, "cb_relevant_key_gaf_arg_index_naut", "CB-RELEVANT-KEY-GAF-ARG-INDEX-NAUT", 1, 3, false);
        declareFunction(me, "cb_relevant_num_gaf_arg_index_naut", "CB-RELEVANT-NUM-GAF-ARG-INDEX-NAUT", 1, 3, false);
        declareFunction(me, "cb_c_other_naut", "CB-C-OTHER-NAUT", 1, 0, false);
        declareFunction(me, "cb_link_other_naut", "CB-LINK-OTHER-NAUT", 2, 0, false);
        declareFunction(me, "cb_c_other_naut_internal", "CB-C-OTHER-NAUT-INTERNAL", 1, 0, false);
        declareFunction(me, "cb_relevant_key_other_index_naut", "CB-RELEVANT-KEY-OTHER-INDEX-NAUT", 3, 0, false);
        declareFunction(me, "cb_relevant_num_other_index_naut", "CB-RELEVANT-NUM-OTHER-INDEX-NAUT", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_cb_naut_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_cb_naut_utilities_file() {
        html_macros.note_cgi_handler_function(CB_C_GAF_ARG_NAUT, $HTML_HANDLER);
        setup_cb_link_method($GAF_ARG_NAUT, CB_LINK_GAF_ARG_NAUT, FIVE_INTEGER);
        html_macros.note_cgi_handler_function(CB_C_OTHER_NAUT, $HTML_HANDLER);
        setup_cb_link_method($OTHER_NAUT, CB_LINK_OTHER_NAUT, TWO_INTEGER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_naut_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_naut_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_naut_utilities_file();
    }

    static {


























































































    }
}

/**
 * Total time: 589 ms
 */
