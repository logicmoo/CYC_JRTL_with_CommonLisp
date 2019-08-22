package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cb_major_presentation_language$;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_sentence_browser extends SubLTranslatedFile {
    public static final SubLFile me = new cb_sentence_browser();

    public static final String myName = "com.cyc.cycjava.cycl.cb_sentence_browser";

    public static final String myFingerPrint = "be9bca7e3451b03f76e53060dbbb6d2599aa013cff92503695ef68b0d49e88cd";

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("ID-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("JUSTIFY?"));

    public static final SubLString $str1$Could_not_determine_a_sentence_fr = makeString("Could not determine a sentence from ~a");

    public static final SubLSymbol CB_SENTENCE = makeSymbol("CB-SENTENCE");



    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLString $str5$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str6$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");



    private static final SubLString $$$CycL_Sentence = makeString("CycL Sentence");

    private static final SubLString $str9$Mt___ = makeString("Mt : ");



    private static final SubLString $str11$Sentence_Not_Well_formed__ = makeString("Sentence Not Well-formed :");

    private static final SubLString $str12$EL_Sentence___ = makeString("EL Sentence : ");

    private static final SubLString $str13$HL_Sentence___ = makeString("HL Sentence : ");

    private static final SubLString $str14$English_Translation___ = makeString("English Translation : ");







    private static final SubLString $$$_in_ = makeString(" in ");



    private static final SubLString $str20$cb_sentence_html = makeString("cb-sentence.html");

    private static final SubLSymbol $SHOW_ENGLISH_FOR_CYCL_SENTENCE = makeKeyword("SHOW-ENGLISH-FOR-CYCL-SENTENCE");

    private static final SubLSymbol $SHOW_EL_VERSION_OF_SENTENCE = makeKeyword("SHOW-EL-VERSION-OF-SENTENCE");

    private static final SubLSymbol $ASSERT_SIMILAR_SENTENCE = makeKeyword("ASSERT-SIMILAR-SENTENCE");





    private static final SubLSymbol $SENTENCE_QUERY_SIMILAR = makeKeyword("SENTENCE-QUERY-SIMILAR");





    private static final SubLString $str29$_Show_English_ = makeString("[Show English]");



    private static final SubLString $str31$cb_sentence_with_show_english__a = makeString("cb-sentence-with-show-english&~a");

    private static final SubLSymbol CB_LINK_SHOW_ENGLISH_FOR_CYCL_SENTENCE = makeSymbol("CB-LINK-SHOW-ENGLISH-FOR-CYCL-SENTENCE");

    private static final SubLSymbol CB_SENTENCE_WITH_SHOW_ENGLISH = makeSymbol("CB-SENTENCE-WITH-SHOW-ENGLISH");

    private static final SubLString $str34$_EL_Formula_ = makeString("[EL Formula]");

    private static final SubLString $str35$cb_sentence_with_show_el_formula_ = makeString("cb-sentence-with-show-el-formula&~a");

    private static final SubLSymbol CB_LINK_SHOW_EL_VERSION_OF_SENTENCE = makeSymbol("CB-LINK-SHOW-EL-VERSION-OF-SENTENCE");

    private static final SubLSymbol CB_SENTENCE_WITH_SHOW_EL_FORMULA = makeSymbol("CB-SENTENCE-WITH-SHOW-EL-FORMULA");

    private static final SubLString $str38$_WFF_Check_ = makeString("[WFF-Check]");

    private static final SubLString $str39$cb_wff_check_sentence__A = makeString("cb-wff-check-sentence&~A");

    private static final SubLSymbol $WFF_CHECK_SENTENCE = makeKeyword("WFF-CHECK-SENTENCE");

    private static final SubLSymbol CB_LINK_WFF_CHECK_SENTENCE = makeSymbol("CB-LINK-WFF-CHECK-SENTENCE");

    private static final SubLList $list42 = list(makeSymbol("ID-STRING"));

    private static final SubLString $str43$_a_does_not_specify_a_CycL_senten = makeString("~a does not specify a CycL sentence");

    private static final SubLSymbol CB_WFF_CHECK_SENTENCE = makeSymbol("CB-WFF-CHECK-SENTENCE");

    private static final SubLString $str45$cb_wff_check_forward_placement_se = makeString("cb-wff-check-forward-placement-sentence&~A&~A");

    private static final SubLSymbol $WFF_CHECK_FORWARD_PLACEMENT_SENTENCE = makeKeyword("WFF-CHECK-FORWARD-PLACEMENT-SENTENCE");

    private static final SubLSymbol CB_LINK_WFF_CHECK_FORWARD_PLACEMENT_SENTENCE = makeSymbol("CB-LINK-WFF-CHECK-FORWARD-PLACEMENT-SENTENCE");

    private static final SubLList $list48 = list(makeSymbol("ID-STRING"), makeSymbol("RULE-ID-STRING"));

    private static final SubLSymbol $sym49$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol CB_WFF_CHECK_FORWARD_PLACEMENT_SENTENCE = makeSymbol("CB-WFF-CHECK-FORWARD-PLACEMENT-SENTENCE");

    private static final SubLString $str51$_Assert_Similar_ = makeString("[Assert Similar]");



    private static final SubLString $str53$cb_assert_similar_sentence__a = makeString("cb-assert-similar-sentence&~a");

    private static final SubLSymbol CB_LINK_ASSERT_SIMILAR_SENTENCE = makeSymbol("CB-LINK-ASSERT-SIMILAR-SENTENCE");

    private static final SubLString $$$the_Cyc_KB_editing_facilities = makeString("the Cyc KB editing facilities");



    private static final SubLSymbol CB_ASSERT_SIMILAR_SENTENCE = makeSymbol("CB-ASSERT-SIMILAR-SENTENCE");

    private static final SubLString $str58$_Edit_ = makeString("[Edit]");

    private static final SubLString $str59$cb_edit_sentence__a = makeString("cb-edit-sentence&~a");

    private static final SubLSymbol CB_LINK_EDIT_SENTENCE = makeSymbol("CB-LINK-EDIT-SENTENCE");

    private static final SubLSymbol CB_EDIT_SENTENCE = makeSymbol("CB-EDIT-SENTENCE");

    private static final SubLString $str62$_Unassert_ = makeString("[Unassert]");

    private static final SubLString $str63$cb_unassert_sentence__a = makeString("cb-unassert-sentence&~a");

    private static final SubLSymbol CB_LINK_UNASSERT_SENTENCE = makeSymbol("CB-LINK-UNASSERT-SENTENCE");

    private static final SubLString $$$Unassert = makeString("Unassert");

    private static final SubLSymbol CB_UNASSERT_SENTENCE = makeSymbol("CB-UNASSERT-SENTENCE");



    private static final SubLString $str68$_Query_Similar_ = makeString("[Query Similar]");

    private static final SubLString $str69$cb_sentence_query_similar__A = makeString("cb-sentence-query-similar&~A");

    private static final SubLSymbol CB_LINK_SENTENCE_QUERY_SIMILAR = makeSymbol("CB-LINK-SENTENCE-QUERY-SIMILAR");

    private static final SubLString $str71$That_sentence_is_not_available_ = makeString("That sentence is not available.");

    private static final SubLSymbol CB_SENTENCE_QUERY_SIMILAR = makeSymbol("CB-SENTENCE-QUERY-SIMILAR");

    private static final SubLString $str73$_Clone_ = makeString("[Clone]");

    private static final SubLString $str74$cb_clone_sentence__a = makeString("cb-clone-sentence&~a");

    private static final SubLSymbol CB_LINK_CLONE_SENTENCE = makeSymbol("CB-LINK-CLONE-SENTENCE");

    private static final SubLSymbol CB_CLONE_SENTENCE = makeSymbol("CB-CLONE-SENTENCE");

    private static final SubLString $$$Clone_CycL_Sentence = makeString("Clone CycL Sentence");



    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str81$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str87$cb_handle_clone_sentence = makeString("cb-handle-clone-sentence");

    private static final SubLString $str88$clone_form = makeString("clone-form");

    private static final SubLString $$$Reset_Values = makeString("Reset Values");

    private static final SubLString $$$Clone = makeString("Clone");

    private static final SubLString $$$clone = makeString("clone");

    private static final SubLList $list92 = list(new SubLObject[]{ makeKeyword("INPUT-NAME"), makeString("sentence"), makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TWENTY_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });

    private static final SubLList $list93 = list(makeKeyword("INPUT-NAME"), makeString("sentence"));

    private static final SubLSymbol CB_HANDLE_CLONE_SENTENCE = makeSymbol("CB-HANDLE-CLONE-SENTENCE");



    private static final SubLString $str96$Bad_sentence__probably_due_to_a_m = makeString("Bad sentence, probably due to a misspelling.~%Check these inputs:~%~%~S");

    private static final SubLString $str97$CycL_Sentence_not_Well_Formed = makeString("CycL Sentence not Well-Formed");

    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $str99$Sentence___ = makeString("Sentence : ");

    private static final SubLString $str100$Diagnosis___ = makeString("Diagnosis : ");

    private static final SubLString $str101$This_is_not_a_syntactically_well_ = makeString("This is not a syntactically well-formed CycL sentence.  Please refer to the ");

    private static final SubLString $str102$_________cycdoc_ref_cycl_syntax_h = makeString("../../../cycdoc/ref/cycl-syntax.html#sentences");

    private static final SubLString $$$Syntax_of_CycL = makeString("Syntax of CycL");

    private static final SubLString $str104$_document_ = makeString(" document.");

    private static final SubLString $str105$_Justify_ = makeString("[Justify]");

    private static final SubLString $str106$cb_justify_sentence__a = makeString("cb-justify-sentence&~a");

    private static final SubLSymbol CB_LINK_JUSTIFY_SENTENCE = makeSymbol("CB-LINK-JUSTIFY-SENTENCE");

    private static final SubLSymbol CB_JUSTIFY_SENTENCE = makeSymbol("CB-JUSTIFY-SENTENCE");



    public static SubLObject cb_sentence(final SubLObject args) {
        SubLObject id_string = NIL;
        destructuring_bind_must_consp(args, args, $list0);
        id_string = args.first();
        SubLObject current = args.rest();
        final SubLObject justifyP = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list0);
        current = current.rest();
        if (NIL == current) {
            final SubLObject sentence = cb_glob_lookup_by_string(id_string);
            if (NIL == possibly_sentence_p(sentence)) {
                return cb_error($str1$Could_not_determine_a_sentence_fr, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject v_assert = czer_meta.find_assertion_cycl(sentence, UNPROVIDED);
            if (NIL != assertion_handles.assertion_p(v_assert)) {
                cb_tools.cb_rem_from_sentence_history(sentence);
                cb_assertion_browser.cb_assertion_internal(v_assert);
            } else {
                cb_sentence_internal(sentence, NIL, justifyP);
            }
        } else {
            cdestructuring_bind_error(args, $list0);
        }
        return NIL;
    }

    public static SubLObject cb_sentence_internal(final SubLObject sentence, SubLObject mt, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (NIL != ist_sentence_p(sentence, UNPROVIDED)) {
            final SubLObject new_mt = designated_mt(sentence);
            final SubLObject subsentence = designated_sentence(sentence);
            return cb_sentence_internal(subsentence, new_mt, justifyP);
        }
        return cb_sentence_internal_guts(sentence, mt, justifyP);
    }

    public static SubLObject cb_sentence_internal_guts(final SubLObject sentence, final SubLObject mt, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_tools.cb_add_to_sentence_history(make_el_formula($$ist, list(mt, sentence), UNPROVIDED));
        html_markup($str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str6$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $$$CycL_Sentence);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_princ($$$CycL_Sentence);
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(ONE_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        cb_sentence_toolbar(sentence, mt, justifyP);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_sentence_info(sentence, mt, justifyP);
                        cb_sentence_diagnostics(sentence, mt);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_sentence_info(final SubLObject sentence, final SubLObject mt, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (NIL != mt) {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str9$Mt___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_form(mt, UNPROVIDED, UNPROVIDED);
        }
        cb_sentence_show_variants(sentence, mt, justifyP);
        return NIL;
    }

    public static SubLObject cb_sentence_diagnostics(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cb_a_perform_access_diagnostics$.getDynamicValue(thread)) {
            cb_sentence_access_diagnostics(sentence, mt);
        }
        return NIL;
    }

    public static SubLObject cb_sentence_access_diagnostics(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject some_problem = NIL;
        if (NIL == wff.el_wffP(sentence, mt, UNPROVIDED)) {
            some_problem = T;
            html_macros.verify_not_within_html_pre();
            html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
            final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
            try {
                html_macros.$within_html_pre$.bind(T, thread);
                final SubLObject color_val = $RED;
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != color_val) {
                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_val));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_princ($str11$Sentence_Not_Well_formed__);
                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                wff.explain_why_not_wff(sentence, mt, html_macros.$html_stream$.getDynamicValue(thread));
            } finally {
                html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        }
        return some_problem;
    }

    public static SubLObject cb_sentence_show_variants(final SubLObject sentence, final SubLObject mt, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cb_a_show_el_formula$.getDynamicValue(thread)) {
            final SubLObject el_sentence = cycl_utilities.hl_to_el(sentence);
            if ((NIL == $cb_a_show_hl_formula$.getDynamicValue(thread)) || (!fi.assertion_expand(narts_high.nart_expand(el_sentence)).equal(fi.assertion_expand(narts_high.nart_expand(sentence))))) {
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str12$EL_Sentence___);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                cb_show_sentence(el_sentence, mt, justifyP);
                html_newline(UNPROVIDED);
            }
        }
        if (NIL != $cb_a_show_hl_formula$.getDynamicValue(thread)) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str13$HL_Sentence___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            cb_show_sentence(sentence, mt, justifyP);
            html_newline(UNPROVIDED);
        }
        if (NIL != $cb_a_show_english$.getDynamicValue(thread)) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str14$English_Translation___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            final SubLObject _prev_bind_0 = $cb_major_presentation_language$.currentBinding(thread);
            try {
                $cb_major_presentation_language$.bind($NL, thread);
                cb_show_sentence_readably(sentence, mt, $cb_c_wrap_assertions$.getDynamicValue(thread), T, justifyP);
            } finally {
                $cb_major_presentation_language$.rebind(_prev_bind_0, thread);
            }
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_show_sentence(final SubLObject sentence, SubLObject mt, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLObject ist_sentence = list($$ist, mt, sentence);
        cb_link($SENTENCE, ist_sentence, justifyP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        cb_form(sentence, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_show_sentence_readably(final SubLObject sentence, final SubLObject mt, SubLObject wrap, SubLObject include_mtP, SubLObject justifyP) {
        if (wrap == UNPROVIDED) {
            wrap = $cb_c_wrap_assertions$.getDynamicValue();
        }
        if (include_mtP == UNPROVIDED) {
            include_mtP = T;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ist_sentence = list($$ist, mt, sentence);
        cb_link($SENTENCE, ist_sentence, justifyP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject pcase_var = $cb_major_presentation_language$.getDynamicValue(thread);
        if (pcase_var.eql($NL)) {
            cb_show_sentence_in_nl(sentence, mt);
            return sentence;
        }
        if (pcase_var.eql($SILK)) {
            funcall(makeSymbol("CB-SHOW-SUPPORT-SENTENCE-IN-SILK"), sentence);
            if (NIL != include_mtP) {
                html_newline(UNPROVIDED);
                html_princ($$$_in_);
                funcall(makeSymbol("CB-SHOW-TERM-IN-SILK"), mt);
            }
            return sentence;
        }
        if (NIL != wrap) {
            cb_form(sentence, ZERO_INTEGER, T);
            if ((NIL != mt) && (NIL != include_mtP)) {
                html_princ($$$_in_);
                cb_form(mt, UNPROVIDED, UNPROVIDED);
            }
        } else {
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            cb_form(sentence, ZERO_INTEGER, NIL);
            if ((NIL != mt) && (NIL != include_mtP)) {
                html_princ($$$_in_);
                cb_form(mt, UNPROVIDED, UNPROVIDED);
            }
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        return sentence;
    }

    public static SubLObject sentence_modification_permittedP(final SubLObject sentence, final SubLObject mt) {
        if (NIL != subl_promotions.memberP(cycl_utilities.formula_operator(sentence), bookkeeping_store.bookkeeping_predicates_for_hl_store(), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (((NIL != sksi_kb_accessors.sksi_content_mt_p(mt)) && (NIL != sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt))) && (NIL == sksi_kb_accessors.modifiable_sk_source_in_any_mt_p(sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt)))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject cb_sentence_toolbar(final SubLObject sentence, final SubLObject mt, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != possibly_sentence_p(sentence)) {
            final SubLObject ist_sentence = list($$ist, mt, sentence);
            final SubLObject non_modifiable_via_fiP = makeBoolean(NIL == sentence_modification_permittedP(sentence, mt));
            cb_help_preamble($CB_SENTENCE, UNPROVIDED, UNPROVIDED);
            if (NIL == $cb_a_show_english$.getDynamicValue(thread)) {
                cb_link($SHOW_ENGLISH_FOR_CYCL_SENTENCE, ist_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            if (NIL == $cb_a_show_el_formula$.getDynamicValue(thread)) {
                cb_link($SHOW_EL_VERSION_OF_SENTENCE, ist_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            html_newline(UNPROVIDED);
            if (NIL != $cb_editing_enabled$.getDynamicValue(thread)) {
                cb_link($ASSERT_SIMILAR_SENTENCE, ist_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                cb_link($EDIT_SENTENCE, ist_sentence, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
                cb_link($UNASSERT_SENTENCE, ist_sentence, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
            cb_link($SENTENCE_QUERY_SIMILAR, ist_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
            cb_link($CLONE_SENTENCE, ist_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
            if (NIL != justifyP) {
                cb_link($JUSTIFY_SENTENCE, ist_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject cb_link_show_english_for_cycl_sentence(final SubLObject sentence, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str29$_Show_English_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str31$cb_sentence_with_show_english__a, cb_glob_id(sentence));
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
        return sentence;
    }

    public static SubLObject cb_sentence_with_show_english(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_a_show_english$.currentBinding(thread);
        try {
            $cb_a_show_english$.bind(T, thread);
            cb_sentence(args);
        } finally {
            $cb_a_show_english$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_show_el_version_of_sentence(final SubLObject sentence, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str34$_EL_Formula_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str35$cb_sentence_with_show_el_formula_, cb_glob_id(sentence));
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
        return sentence;
    }

    public static SubLObject cb_sentence_with_show_el_formula(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_a_show_el_formula$.currentBinding(thread);
        try {
            $cb_a_show_el_formula$.bind(T, thread);
            cb_sentence(args);
        } finally {
            $cb_a_show_el_formula$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_wff_check_sentence(final SubLObject sentence, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str38$_WFF_Check_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str39$cb_wff_check_sentence__A, cb_glob_id(sentence));
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
        return sentence;
    }

    public static SubLObject cb_wff_check_sentence(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_string = NIL;
        destructuring_bind_must_consp(args, args, $list42);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            final SubLObject sentence = cb_glob_lookup_by_string(id_string);
            SubLObject mt = mt_vars.$default_assert_mt$.getGlobalValue();
            if (NIL == possibly_sentence_p(sentence)) {
                cb_error($str43$_a_does_not_specify_a_CycL_senten, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != $cb_default_mt$.getDynamicValue(thread)) {
                mt = $cb_default_mt$.getDynamicValue(thread);
            }
            SubLObject mt_to_diagnose = mt;
            SubLObject sentence_to_diagnose = sentence;
            if (NIL != ist_sentence_p(sentence, UNPROVIDED)) {
                mt_to_diagnose = designated_mt(sentence);
                sentence_to_diagnose = designated_sentence(sentence);
            }
            return cb_assertion_editor.cb_wff_check_sentence_int(sentence_to_diagnose, mt_to_diagnose, T, T);
        }
        cdestructuring_bind_error(args, $list42);
        return NIL;
    }

    public static SubLObject cb_link_wff_check_forward_placement_sentence(final SubLObject sentence, final SubLObject rule, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str38$_WFF_Check_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str45$cb_wff_check_forward_placement_se, cb_glob_id(sentence), assertion_handles.assertion_id(rule));
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
        return sentence;
    }

    public static SubLObject cb_wff_check_forward_placement_sentence(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_string = NIL;
        SubLObject rule_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list48);
        id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list48);
        rule_id_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject sentence = cb_glob_lookup_by_string(id_string);
            final SubLObject rule = cb_guess_assertion(rule_id_string);
            SubLObject mt = mt_vars.$default_assert_mt$.getGlobalValue();
            if (NIL == possibly_sentence_p(sentence)) {
                cb_error($str43$_a_does_not_specify_a_CycL_senten, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != $cb_default_mt$.getDynamicValue(thread)) {
                mt = $cb_default_mt$.getDynamicValue(thread);
            }
            SubLObject mt_to_diagnose = mt;
            SubLObject sentence_to_diagnose = sentence;
            if (NIL != ist_sentence_p(sentence, UNPROVIDED)) {
                mt_to_diagnose = designated_mt(sentence);
                sentence_to_diagnose = designated_sentence(sentence);
            }
            final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = forward.$forward_inference_rule$.currentBinding(thread);
            try {
                kb_control_vars.$within_forward_inferenceP$.bind(list_utilities.sublisp_boolean(rule), thread);
                forward.$forward_inference_rule$.bind(rule, thread);
                return cb_assertion_editor.cb_wff_check_sentence_int(sentence_to_diagnose, mt_to_diagnose, T, T);
            } finally {
                forward.$forward_inference_rule$.rebind(_prev_bind_2, thread);
                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
            }
        }
        cdestructuring_bind_error(args, $list48);
        return NIL;
    }

    public static SubLObject cb_link_assert_similar_sentence(final SubLObject sentence, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str51$_Assert_Similar_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str53$cb_assert_similar_sentence__a, cb_glob_id(sentence));
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
        return sentence;
    }

    public static SubLObject cb_assert_similar_sentence(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(args, args, $list42);
            id_string = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject sentence = cb_glob_lookup_by_string(id_string);
                if (NIL == possibly_sentence_p(sentence)) {
                    cb_error($str43$_a_does_not_specify_a_CycL_senten, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                cb_assertion_editor.cb_assert_internal($SIMILAR, NIL, sentence, T);
            } else {
                cdestructuring_bind_error(args, $list42);
            }
        }
        return NIL;
    }

    public static SubLObject cb_link_edit_sentence(final SubLObject sentence, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str58$_Edit_;
        }
        if (NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str59$cb_edit_sentence__a, cb_glob_id(sentence));
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
        }
        return sentence;
    }

    public static SubLObject cb_edit_sentence(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(args, args, $list42);
            id_string = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject sentence = cb_glob_lookup_by_string(id_string);
                if (NIL == possibly_sentence_p(sentence)) {
                    cb_error($str43$_a_does_not_specify_a_CycL_senten, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                cb_assertion_editor.cb_assert_internal($EDIT_SENTENCE, NIL, sentence, T);
            } else {
                cdestructuring_bind_error(args, $list42);
            }
        }
        return NIL;
    }

    public static SubLObject cb_link_unassert_sentence(final SubLObject sentence, SubLObject linktext, SubLObject disabledP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (disabledP == UNPROVIDED) {
            disabledP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str62$_Unassert_;
        }
        if (NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        } else {
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str63$cb_unassert_sentence__a, cb_glob_id(sentence));
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
        }
        return sentence;
    }

    public static SubLObject cb_unassert_sentence(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Cyc_KB_editing_facilities);
        } else {
            SubLObject id_string = NIL;
            destructuring_bind_must_consp(args, args, $list42);
            id_string = args.first();
            final SubLObject current = args.rest();
            if (NIL == current) {
                final SubLObject sentence = cb_glob_lookup_by_string(id_string);
                if (NIL == possibly_sentence_p(sentence)) {
                    cb_error($str43$_a_does_not_specify_a_CycL_senten, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                if (NIL != ist_sentence_p(sentence, UNPROVIDED)) {
                    cb_tools.cb_rem_from_sentence_history(sentence);
                    ke.ke_unassert(cycl_utilities.formula_arg2(sentence, UNPROVIDED), cycl_utilities.formula_arg1(sentence, UNPROVIDED));
                    cb_assertion_editor.cb_note_edit_change($$$Unassert, T, TWO_INTEGER, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(args, $list42);
            }
        }
        return NIL;
    }

    public static SubLObject cb_link_sentence_query_similar(final SubLObject sentence, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != possibly_sentence_p(sentence) : "el_utilities.possibly_sentence_p(sentence) " + "CommonSymbols.NIL != el_utilities.possibly_sentence_p(sentence) " + sentence;
        if (NIL == linktext) {
            linktext = $str68$_Query_Similar_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str69$cb_sentence_query_similar__A, cb_glob_id(sentence));
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

    public static SubLObject cb_sentence_query_similar(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_string = NIL;
        destructuring_bind_must_consp(args, args, $list42);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list42);
            return NIL;
        }
        SubLObject sentence = cb_glob_lookup_by_string(id_string);
        if (NIL == possibly_sentence_p(sentence)) {
            return cb_error($str71$That_sentence_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject mt = (NIL != $cb_default_mt$.getDynamicValue(thread)) ? $cb_default_mt$.getDynamicValue(thread) : mt_vars.$default_ask_mt$.getGlobalValue();
        thread.resetMultipleValues();
        final SubLObject sentence_$5 = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
        final SubLObject mt_$6 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$5;
        mt = mt_$6;
        return cb_query.cb_similar_query(sentence, mt, UNPROVIDED);
    }

    public static SubLObject cb_link_clone_sentence(final SubLObject sentence, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != possibly_sentence_p(sentence) : "el_utilities.possibly_sentence_p(sentence) " + "CommonSymbols.NIL != el_utilities.possibly_sentence_p(sentence) " + sentence;
        if (NIL == linktext) {
            linktext = $str73$_Clone_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str74$cb_clone_sentence__a, cb_glob_id(sentence));
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

    public static SubLObject cb_clone_sentence(final SubLObject args) {
        SubLObject id_string = NIL;
        destructuring_bind_must_consp(args, args, $list42);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list42);
            return NIL;
        }
        final SubLObject sentence = cb_glob_lookup_by_string(id_string);
        if (NIL == possibly_sentence_p(sentence)) {
            return cb_error($str71$That_sentence_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_clone_sentence_int(sentence);
    }

    public static SubLObject cb_clone_sentence_int(final SubLObject input_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Clone_CycL_Sentence;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str6$_meta_http_equiv__X_UA_Compatible);
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
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
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
                    html_markup($str81$yui_skin_sam);
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
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
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
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str87$cb_handle_clone_sentence, T, UNPROVIDED);
                            SubLObject sentence = input_sentence;
                            SubLObject mt = (NIL != $cb_default_mt$.getDynamicValue(thread)) ? $cb_default_mt$.getDynamicValue(thread) : mt_vars.$default_clone_mt$.getGlobalValue();
                            if (NIL != ist_sentence_p(input_sentence, UNPROVIDED)) {
                                sentence = designated_sentence(input_sentence);
                                mt = designated_mt(input_sentence);
                            }
                            html_target_definition($str88$clone_form);
                            html_reset_input($$$Reset_Values);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Clone, $$$clone, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_form_widgets.cb_mt_input_section(mt, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_form_widgets.cb_el_sentence_input_section(sentence, $list92);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
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

    public static SubLObject cb_handle_clone_sentence(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, $list93);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, UNPROVIDED);
        }
        SubLObject errorP = NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_uses_kbP$.bind(NIL, thread);
            if (NIL == cycl_grammar.cycl_sentence_p(sentence)) {
                cb_explain_why_not_syntactically_wff(sentence);
                errorP = T;
            }
        } finally {
            cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != errorP) {
            return NIL;
        }
        final SubLObject sentence_to_view = (NIL != hlmt.hlmt_p(mt)) ? list($$ist, mt, sentence) : sentence;
        return cb_sentence(list(string_utilities.str(cb_glob_id(sentence_to_view))));
    }

    public static SubLObject cb_extract_cycl_sentence_from_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject sentence = read_from_string_ignoring_errors(string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        SubLObject errorP = NIL;
        if (NIL == sentence) {
            cb_error($str96$Bad_sentence__probably_due_to_a_m, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_uses_kbP$.bind(NIL, thread);
            if (NIL == cycl_grammar.cycl_sentence_p(sentence)) {
                cb_explain_why_not_syntactically_wff(sentence);
                errorP = T;
            }
        } finally {
            cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != errorP) {
            return NIL;
        }
        return sentence;
    }

    public static SubLObject cb_explain_why_not_syntactically_wff(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str97$CycL_Sentence_not_Well_Formed;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str6$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$13 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str81$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_back_button($SELF, $$$Back);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str99$Sentence___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            cb_form(sentence, ZERO_INTEGER, T);
                            html_macros.verify_not_within_html_pre();
                            html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$17 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind(T, thread);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str100$Diagnosis___);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_princ($str101$This_is_not_a_syntactically_well_);
                                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str102$_________cycdoc_ref_cycl_syntax_h);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Syntax_of_CycL);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                }
                                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                html_princ($str104$_document_);
                            } finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$12, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_justify_sentence(final SubLObject sentence, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != possibly_sentence_p(sentence) : "el_utilities.possibly_sentence_p(sentence) " + "CommonSymbols.NIL != el_utilities.possibly_sentence_p(sentence) " + sentence;
        if (NIL == linktext) {
            linktext = $str105$_Justify_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str106$cb_justify_sentence__a, cb_glob_id(sentence));
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

    public static SubLObject cb_justify_sentence(final SubLObject args) {
        SubLObject id_string = NIL;
        destructuring_bind_must_consp(args, args, $list42);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list42);
            return NIL;
        }
        final SubLObject sentence = cb_glob_lookup_by_string(id_string);
        if (NIL == possibly_sentence_p(sentence)) {
            return cb_error($str71$That_sentence_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_justify_sentence_int(sentence);
    }

    public static SubLObject cb_justify_sentence_int(final SubLObject input_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ist_sentence_p(input_sentence, UNPROVIDED)) {
            final SubLObject sentence = designated_sentence(input_sentence);
            final SubLObject mt = designated_mt(input_sentence);
            SubLObject justification = NIL;
            cb_show_sentence_readably(sentence, mt, $cb_c_wrap_assertions$.getDynamicValue(thread), T, T);
            html_newline(UNPROVIDED);
            justification = sksi_hl_support_utilities.sksi_justify_int(sentence, mt);
            return cb_assertion_browser.cb_hl_support_justify_int($SKSI, justification);
        }
        return NIL;
    }

    public static SubLObject declare_cb_sentence_browser_file() {
        declareFunction(me, "cb_sentence", "CB-SENTENCE", 1, 0, false);
        declareFunction(me, "cb_sentence_internal", "CB-SENTENCE-INTERNAL", 1, 2, false);
        declareFunction(me, "cb_sentence_internal_guts", "CB-SENTENCE-INTERNAL-GUTS", 2, 1, false);
        declareFunction(me, "cb_sentence_info", "CB-SENTENCE-INFO", 2, 1, false);
        declareFunction(me, "cb_sentence_diagnostics", "CB-SENTENCE-DIAGNOSTICS", 2, 0, false);
        declareFunction(me, "cb_sentence_access_diagnostics", "CB-SENTENCE-ACCESS-DIAGNOSTICS", 2, 0, false);
        declareFunction(me, "cb_sentence_show_variants", "CB-SENTENCE-SHOW-VARIANTS", 2, 1, false);
        declareFunction(me, "cb_show_sentence", "CB-SHOW-SENTENCE", 1, 2, false);
        declareFunction(me, "cb_show_sentence_readably", "CB-SHOW-SENTENCE-READABLY", 2, 3, false);
        declareFunction(me, "sentence_modification_permittedP", "SENTENCE-MODIFICATION-PERMITTED?", 2, 0, false);
        declareFunction(me, "cb_sentence_toolbar", "CB-SENTENCE-TOOLBAR", 2, 1, false);
        declareFunction(me, "cb_link_show_english_for_cycl_sentence", "CB-LINK-SHOW-ENGLISH-FOR-CYCL-SENTENCE", 1, 1, false);
        declareFunction(me, "cb_sentence_with_show_english", "CB-SENTENCE-WITH-SHOW-ENGLISH", 1, 0, false);
        declareFunction(me, "cb_link_show_el_version_of_sentence", "CB-LINK-SHOW-EL-VERSION-OF-SENTENCE", 1, 1, false);
        declareFunction(me, "cb_sentence_with_show_el_formula", "CB-SENTENCE-WITH-SHOW-EL-FORMULA", 1, 0, false);
        declareFunction(me, "cb_link_wff_check_sentence", "CB-LINK-WFF-CHECK-SENTENCE", 1, 1, false);
        declareFunction(me, "cb_wff_check_sentence", "CB-WFF-CHECK-SENTENCE", 1, 0, false);
        declareFunction(me, "cb_link_wff_check_forward_placement_sentence", "CB-LINK-WFF-CHECK-FORWARD-PLACEMENT-SENTENCE", 2, 1, false);
        declareFunction(me, "cb_wff_check_forward_placement_sentence", "CB-WFF-CHECK-FORWARD-PLACEMENT-SENTENCE", 1, 0, false);
        declareFunction(me, "cb_link_assert_similar_sentence", "CB-LINK-ASSERT-SIMILAR-SENTENCE", 1, 1, false);
        declareFunction(me, "cb_assert_similar_sentence", "CB-ASSERT-SIMILAR-SENTENCE", 1, 0, false);
        declareFunction(me, "cb_link_edit_sentence", "CB-LINK-EDIT-SENTENCE", 1, 2, false);
        declareFunction(me, "cb_edit_sentence", "CB-EDIT-SENTENCE", 1, 0, false);
        declareFunction(me, "cb_link_unassert_sentence", "CB-LINK-UNASSERT-SENTENCE", 1, 2, false);
        declareFunction(me, "cb_unassert_sentence", "CB-UNASSERT-SENTENCE", 1, 0, false);
        declareFunction(me, "cb_link_sentence_query_similar", "CB-LINK-SENTENCE-QUERY-SIMILAR", 1, 1, false);
        declareFunction(me, "cb_sentence_query_similar", "CB-SENTENCE-QUERY-SIMILAR", 1, 0, false);
        declareFunction(me, "cb_link_clone_sentence", "CB-LINK-CLONE-SENTENCE", 1, 1, false);
        declareFunction(me, "cb_clone_sentence", "CB-CLONE-SENTENCE", 1, 0, false);
        declareFunction(me, "cb_clone_sentence_int", "CB-CLONE-SENTENCE-INT", 1, 0, false);
        declareFunction(me, "cb_handle_clone_sentence", "CB-HANDLE-CLONE-SENTENCE", 1, 0, false);
        declareFunction(me, "cb_extract_cycl_sentence_from_string", "CB-EXTRACT-CYCL-SENTENCE-FROM-STRING", 1, 0, false);
        declareFunction(me, "cb_explain_why_not_syntactically_wff", "CB-EXPLAIN-WHY-NOT-SYNTACTICALLY-WFF", 1, 0, false);
        declareFunction(me, "cb_link_justify_sentence", "CB-LINK-JUSTIFY-SENTENCE", 1, 1, false);
        declareFunction(me, "cb_justify_sentence", "CB-JUSTIFY-SENTENCE", 1, 0, false);
        declareFunction(me, "cb_justify_sentence_int", "CB-JUSTIFY-SENTENCE-INT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_sentence_browser_file() {
        return NIL;
    }

    public static SubLObject setup_cb_sentence_browser_file() {
        html_macros.note_cgi_handler_function(CB_SENTENCE, $HTML_HANDLER);
        sethash($CB_SENTENCE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str20$cb_sentence_html, NIL));
        setup_cb_link_method($SHOW_ENGLISH_FOR_CYCL_SENTENCE, CB_LINK_SHOW_ENGLISH_FOR_CYCL_SENTENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_SENTENCE_WITH_SHOW_ENGLISH, $HTML_HANDLER);
        setup_cb_link_method($SHOW_EL_VERSION_OF_SENTENCE, CB_LINK_SHOW_EL_VERSION_OF_SENTENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_SENTENCE_WITH_SHOW_EL_FORMULA, $HTML_HANDLER);
        setup_cb_link_method($WFF_CHECK_SENTENCE, CB_LINK_WFF_CHECK_SENTENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_WFF_CHECK_SENTENCE, $HTML_HANDLER);
        setup_cb_link_method($WFF_CHECK_FORWARD_PLACEMENT_SENTENCE, CB_LINK_WFF_CHECK_FORWARD_PLACEMENT_SENTENCE, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_WFF_CHECK_FORWARD_PLACEMENT_SENTENCE, $HTML_HANDLER);
        setup_cb_link_method($ASSERT_SIMILAR_SENTENCE, CB_LINK_ASSERT_SIMILAR_SENTENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_ASSERT_SIMILAR_SENTENCE, $HTML_HANDLER);
        setup_cb_link_method($EDIT_SENTENCE, CB_LINK_EDIT_SENTENCE, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_EDIT_SENTENCE, $HTML_HANDLER);
        setup_cb_link_method($UNASSERT_SENTENCE, CB_LINK_UNASSERT_SENTENCE, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_UNASSERT_SENTENCE, $HTML_HANDLER);
        setup_cb_link_method($SENTENCE_QUERY_SIMILAR, CB_LINK_SENTENCE_QUERY_SIMILAR, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_SENTENCE_QUERY_SIMILAR, $HTML_HANDLER);
        setup_cb_link_method($CLONE_SENTENCE, CB_LINK_CLONE_SENTENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_CLONE_SENTENCE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_CLONE_SENTENCE, $HTML_HANDLER);
        setup_cb_link_method($JUSTIFY_SENTENCE, CB_LINK_JUSTIFY_SENTENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_JUSTIFY_SENTENCE, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_sentence_browser_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_sentence_browser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_sentence_browser_file();
    }

    
}

/**
 * Total time: 408 ms
 */
