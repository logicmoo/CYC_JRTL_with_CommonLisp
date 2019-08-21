package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cb_ke_reviewer;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.cb_ke_reviewer.*;
import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cb_ke_reviewer extends SubLTranslatedFile {
    public static final SubLFile me = new cb_ke_reviewer();

    public static final String myName = "com.cyc.cycjava.cycl.cb_ke_reviewer";

    public static final String myFingerPrint = "080ee9c85ce1692d1bf8340ee3b6d126663d4c7a8ec020204bff12bf8ddfd86a";

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("ASSERTION-ID"));

    public static final SubLString $str1$Could_not_determine_an_assertion_ = makeString("Could not determine an assertion from ~a");

    public static final SubLSymbol CB_KE_EDIT = makeSymbol("CB-KE-EDIT");



    private static final SubLSymbol CB_KEC_EDIT = makeSymbol("CB-KEC-EDIT");

    private static final SubLSymbol CB_CONSTANT_REVIEW_HANDLER = makeSymbol("CB-CONSTANT-REVIEW-HANDLER");

    private static final SubLSymbol CB_ASSERTION_REVIEW_HANDLER = makeSymbol("CB-ASSERTION-REVIEW-HANDLER");

    private static final SubLSymbol CB_TAF = makeSymbol("CB-TAF");

    private static final SubLSymbol CB_TCF = makeSymbol("CB-TCF");

    private static final SubLString $str9$Approve_Constant = makeString("Approve-Constant");

    private static final SubLString $str10$Email_Comments = makeString("Email-Comments");

    private static final SubLString $str11$Assert_Comments = makeString("Assert-Comments");

    private static final SubLString $$$comment = makeString("comment");

    private static final SubLObject $$myReviewer = reader_make_constant_shell(makeString("myReviewer"));

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));





    private static final SubLObject $$cyclistNotes = reader_make_constant_shell(makeString("cyclistNotes"));





    private static final SubLString $$$Approved_Constant = makeString("Approved Constant");

    private static final SubLSymbol $CB_CONSTANT_REVIEW = makeKeyword("CB-CONSTANT-REVIEW");

    private static final SubLString $str22$cb_constant_review_html = makeString("cb-constant-review.html");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str24$cb_constant_review_handler = makeString("cb-constant-review-handler");



    private static final SubLString $$$Review_the_Cyc_Constant = makeString("Review the Cyc Constant");

    private static final SubLString $$$Cancel = makeString("Cancel");

    private static final SubLString $$$Current_Values = makeString("Current Values");

    private static final SubLString $$$Submit_Values = makeString("Submit Values");

    private static final SubLString $str30$Cyc_Constant__A__ID____A = makeString("Cyc Constant ~A, ID: #~A");

    private static final SubLString $str31$Approve_the_Constant_for_Addition = makeString("Approve the Constant for Addition to Cyc");

    private static final SubLString $str32$Copy_the_Comment_Field_to_myCreat = makeString("Copy the Comment Field to myCreator via Email");

    private static final SubLString $str33$Assert_the_Comments_as_a___cyclis = makeString("Assert the Comments as a #$cyclistNotes");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $$$virtual = makeString("virtual");

    private static final SubLString $str36$The_requested_term_is_not_availab = makeString("The requested term is not available.");

    private static final SubLString $str37$cb_assertion_review_handler = makeString("cb-assertion-review-handler");

    private static final SubLString $str38$cb_assertion_review = makeString("cb-assertion-review");

    private static final SubLString $$$Review_the_Cyc_Assertion = makeString("Review the Cyc Assertion");

    private static final SubLString $str40$Cyc_Assertion__ID____A = makeString("Cyc Assertion  ID: #~A");

    private static final SubLString $str41$Meta_Assertions__ = makeString("Meta Assertions :");

    private static final SubLString $str42$Approve_Assertion = makeString("Approve-Assertion");

    private static final SubLString $str43$Approve_the_Assertion_for_Additio = makeString("Approve the Assertion for Addition to Cyc");

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLString $str45$ = makeString("");

    private static final SubLString $$$Approved_Assertion = makeString("Approved Assertion");



    private static final SubLString $str48$ke_review_html = makeString("ke-review.html");

    private static final SubLString $$$Knowledge_Entry_Review_Tools = makeString("Knowledge Entry Review Tools");

    private static final SubLString $str50$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str51$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str56$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str61$ke_review_handler = makeString("ke-review-handler");

    private static final SubLString $$$Knowledge_Entry_Review_Options = makeString("Knowledge Entry Review Options");

    private static final SubLString $$$Change_KE_Options = makeString("Change KE Options");

    private static final SubLString $$$General_KE_Review_Options = makeString("General KE Review Options");

    private static final SubLString $$$Allow_KE_Review_Tags_and_links = makeString("Allow KE Review Tags and links");





    private static final SubLSymbol ASSERTION_REVIEW = makeSymbol("ASSERTION-REVIEW");

    private static final SubLString $str69$enable_ke_assertion_review = makeString("enable-ke-assertion-review");

    private static final SubLString $$$on_assertions = makeString("on assertions");

    private static final SubLSymbol CONSTANT_REVIEW = makeSymbol("CONSTANT-REVIEW");

    private static final SubLString $str72$enable_ke_constant_review = makeString("enable-ke-constant-review");

    private static final SubLString $$$on_constants = makeString("on constants");

    private static final SubLString $str74$Enter_in_the_start_date_ = makeString("Enter in the start date:");

    private static final SubLString $str75$Tools_will_be_limited_to_constant = makeString("Tools will be limited to constants and assertions for which #$myCreationTime is between the start and end date.");

    private static final SubLString $str76$cb_show_start = makeString("cb-show-start");

    private static final SubLString $str77$Enter_in_the_ending_date_ = makeString("Enter in the ending date:");

    private static final SubLString $str78$cb_show_end = makeString("cb-show-end");

    private static final SubLString $str79$Enter_the_cyclist_s__to_examine__ = makeString("Enter the cyclist(s) to examine (blank indicates to examine ALL cyclists):");

    private static final SubLString $str80$Tools_will_be_limited_to_constant = makeString("Tools will be limited to constants and assertions which the below cyclists are the #$myCreator for.");

    private static final SubLSymbol CB_PROMPT_CYCLISTS = makeSymbol("CB-PROMPT-CYCLISTS");

    private static final SubLString $$$foo = makeString("foo");

    private static final SubLString $str83$narrow_filter_too = makeString("narrow-filter-too");

    private static final SubLString $str84$Also_narrow_our_viewpoint_to_incl = makeString("Also narrow our viewpoint to include only these cyclists as the myCreator");

    private static final SubLSymbol KE_REVIEW = makeSymbol("KE-REVIEW");

    private static final SubLSymbol MYCREATOR = makeSymbol("MYCREATOR");

    private static final SubLSymbol KE_REVIEW_HANDLER = makeSymbol("KE-REVIEW-HANDLER");

    private static final SubLString $str88$KE_Review_Options_have_been_modif = makeString("KE Review Options have been modified");

    public static SubLObject cb_ke_edit(final SubLObject args) {
        SubLObject assertion_id = NIL;
        destructuring_bind_must_consp(args, args, $list0);
        assertion_id = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            final SubLObject assertion = cb_guess_assertion(assertion_id);
            if (NIL == assertion_handles.assertion_p(assertion)) {
                return cb_error($str1$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cb_ke_edit_internal(assertion);
        } else {
            cdestructuring_bind_error(args, $list0);
        }
        return NIL;
    }

    public static SubLObject cb_kec_edit(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_ke_term_internal(args.first());
    }

    public static SubLObject cb_constant_review_handler(final SubLObject args) {
        return cb_constant_review(args);
    }

    public static SubLObject cb_assertion_review_handler(final SubLObject args) {
        return cb_assertion_review(args);
    }

    public static SubLObject cb_taf(final SubLObject args) {
        return cb_ke_edit(args);
    }

    public static SubLObject cb_tcf(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_kec_edit(args);
    }

    public static SubLObject cb_constant_review(final SubLObject args) {
        final SubLObject approve_p = html_extract_input($str9$Approve_Constant, args);
        final SubLObject fort = (NIL != approve_p) ? cb_guess_fort(approve_p, UNPROVIDED) : NIL;
        final SubLObject email_p = html_extract_input($str10$Email_Comments, args);
        final SubLObject assert_p = html_extract_input($str11$Assert_Comments, args);
        final SubLObject comment_text = html_extract_input($$$comment, args);
        if (NIL != approve_p) {
            ke.ke_assert(list($$myReviewer, fort, operation_communication.the_cyclist()), $$BookkeepingMt, $MONOTONIC, $BACKWARD);
        }
        if (((NIL != comment_text) && (NIL != approve_p)) && (NIL != assert_p)) {
            ke.ke_assert(list($$cyclistNotes, fort, comment_text), mt_vars.$default_comment_mt$.getGlobalValue(), $DEFAULT, $FORWARD);
        }
        cb_assertion_editor.cb_note_edit_change($$$Approved_Constant, T, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_ke_term_internal(final SubLObject fort_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ke.ensure_cyclist_ok();
        final SubLObject fort = cb_guess_fort(fort_spec, UNPROVIDED);
        if (NIL != forts.fort_p(fort)) {
            if (NIL != nart_handles.nart_p(fort)) {
                cb_tools.cb_add_to_nat_history(fort);
            } else {
                cb_tools.cb_add_to_constant_history(fort);
            }
            final SubLObject identifier = cb_fort_identifier(fort);
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
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_macros.$within_html_form$.bind(T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                html_hidden_input($str24$cb_constant_review_handler, T, UNPROVIDED);
                cb_help_preamble($CB_CONSTANT_REVIEW, $SELF, $$$Review_the_Cyc_Constant);
                html_newline(UNPROVIDED);
                cb_back_button($SELF, $$$Cancel);
                html_indent(UNPROVIDED);
                html_reset_input($$$Current_Values);
                html_indent(UNPROVIDED);
                html_submit_input($$$Submit_Values, UNPROVIDED, UNPROVIDED);
                html_hr(UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str30$Cyc_Constant__A__ID____A, fort, identifier);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                html_newline(TWO_INTEGER);
                html_checkbox_input($str9$Approve_Constant, fort, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(TWO_INTEGER);
                html_princ($str31$Approve_the_Constant_for_Addition);
                html_newline(UNPROVIDED);
                html_checkbox_input($str10$Email_Comments, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(TWO_INTEGER);
                html_princ($str32$Copy_the_Comment_Field_to_myCreat);
                html_newline(UNPROVIDED);
                html_checkbox_input($str11$Assert_Comments, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                html_indent(TWO_INTEGER);
                html_princ($str33$Assert_the_Comments_as_a___cyclis);
                html_newline(TWO_INTEGER);
                if (NIL != $cb_wrap_interactor$.getDynamicValue(thread)) {
                    html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                    html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$comment);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($int$80);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(TWENTY_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$virtual);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
                    }
                    html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                } else {
                    html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                    html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($$$comment);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($int$80);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(TWENTY_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                    }
                    html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                }
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            } finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_form_tail$.getGlobalValue());
        } else {
            cb_error($str36$The_requested_term_is_not_availab, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_ke_edit_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ke.ensure_cyclist_ok();
        cb_tools.cb_add_to_assertion_history(assertion);
        final SubLObject id = assertion_handles.assertion_id(assertion);
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
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_macros.$within_html_form$.bind(T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_hidden_input($str37$cb_assertion_review_handler, T, UNPROVIDED);
            cb_help_preamble($str38$cb_assertion_review, $SELF, $$$Review_the_Cyc_Assertion);
            html_newline(UNPROVIDED);
            cb_back_button($SELF, $$$Cancel);
            html_indent(UNPROVIDED);
            html_reset_input($$$Current_Values);
            html_indent(UNPROVIDED);
            html_submit_input($$$Submit_Values, UNPROVIDED, UNPROVIDED);
            html_hr(UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $str40$Cyc_Assertion__ID____A, id);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            cb_assertion_browser.cb_assertion_info(assertion);
            cb_assertion_browser.cb_assertion_diagnostics(assertion);
            if (NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                html_hr(UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str41$Meta_Assertions__);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                html_newline(TWO_INTEGER);
                cb_browser.cb_c_total_internal(assertion);
            }
            html_hr(UNPROVIDED, UNPROVIDED);
            html_checkbox_input($str42$Approve_Assertion, id, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_princ($str43$Approve_the_Assertion_for_Additio);
            html_newline(UNPROVIDED);
            html_checkbox_input($str10$Email_Comments, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_princ($str32$Copy_the_Comment_Field_to_myCreat);
            html_newline(UNPROVIDED);
            html_checkbox_input($str11$Assert_Comments, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_princ($str33$Assert_the_Comments_as_a___cyclis);
            html_newline(TWO_INTEGER);
            if (NIL != $cb_wrap_interactor$.getDynamicValue(thread)) {
                html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$comment);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($int$80);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWENTY_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$virtual);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
            } else {
                html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$comment);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($int$80);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWENTY_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
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

    public static SubLObject cb_assertion_review(final SubLObject args) {
        final SubLObject approve_p = html_extract_input($str42$Approve_Assertion, args);
        final SubLObject assertion = (NIL != approve_p) ? assertion_handles.find_assertion_by_id(parse_integer(approve_p, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : NIL;
        final SubLObject formula = (NIL != assertion) ? uncanonicalizer.assertion_el_formula(assertion) : NIL;
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        final SubLObject assert_p = html_extract_input($str11$Assert_Comments, args);
        final SubLObject comment_text = html_extract_input($$$comment, args);
        if ((NIL != approve_p) && (NIL != assertion)) {
            ke.ke_assert(list($$myReviewer, list($$ist, assertion_mt, formula), operation_communication.the_cyclist()), $$BookkeepingMt, $MONOTONIC, $FORWARD);
        }
        if ((((NIL != comment_text) && (!comment_text.equal($str45$))) && (NIL != approve_p)) && (NIL != assert_p)) {
            ke.ke_assert(list($$cyclistNotes, formula, comment_text), assertion_mt, $DEFAULT, $FORWARD);
        }
        cb_assertion_editor.cb_note_edit_change($$$Approved_Assertion, T, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject constant_needs_review_p(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time = bookkeeping_store.creation_time(constant, UNPROVIDED);
        return makeBoolean((((NIL == kb_accessors.reviewer(constant, UNPROVIDED)) && (NIL != time)) && $cb_ke_review_start_date$.getDynamicValue(thread).numLE(time)) && time.numLE($cb_ke_review_end_date$.getDynamicValue(thread)));
    }

    public static SubLObject assertion_needs_review_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((((NIL == cb_adornments.bookkeeping_assertion_p(assertion)) && (NIL == subl_promotions.memberP(assertion_marker(assertion), $cb_nonreviewable_assertion_markers$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) && (NIL != assertions_high.asserted_when(assertion))) && $cb_ke_review_start_date$.getDynamicValue(thread).numLE(assertions_high.asserted_when(assertion))) && assertions_high.asserted_when(assertion).numLE($cb_ke_review_end_date$.getDynamicValue(thread))) && (NIL == asserted_reviewer(assertion)));
    }

    public static SubLObject ke_review(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Knowledge_Entry_Review_Tools;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str50$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str51$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$6 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str56$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
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
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str61$ke_review_handler, T, UNPROVIDED);
                            cb_help_preamble($KE_REVIEW, $SELF, $$$Knowledge_Entry_Review_Options);
                            html_newline(UNPROVIDED);
                            cb_back_button($SELF, $$$Cancel);
                            html_indent(UNPROVIDED);
                            html_reset_input($$$Current_Values);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Change_KE_Options, UNPROVIDED, UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($$$General_KE_Review_Options);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$Allow_KE_Review_Tags_and_links);
                                    html_newline(UNPROVIDED);
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
                                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        final SubLObject assertion_adornment_active_p = cb_adornments.active_adornment_p(ASSERTION_REVIEW);
                                        html_checkbox_input($str69$enable_ke_assertion_review, T, assertion_adornment_active_p, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_indent(TWO_INTEGER);
                                        html_princ($$$on_assertions);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_newline(UNPROVIDED);
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
                                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        final SubLObject constant_adornment_active_p = cb_adornments.active_adornment_p(CONSTANT_REVIEW);
                                        html_checkbox_input($str72$enable_ke_constant_review, T, constant_adornment_active_p, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_indent(TWO_INTEGER);
                                        html_princ($$$on_constants);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str74$Enter_in_the_start_date_);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_princ($str75$Tools_will_be_limited_to_constant);
                            html_newline(UNPROVIDED);
                            prompt_for_simple_date($cb_ke_review_start_date$.getDynamicValue(thread), $str76$cb_show_start);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str77$Enter_in_the_ending_date_);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            prompt_for_simple_date($cb_ke_review_end_date$.getDynamicValue(thread), $str78$cb_show_end);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str79$Enter_the_cyclist_s__to_examine__);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_princ($str80$Tools_will_be_limited_to_constant);
                            apply(symbol_function(CB_PROMPT_CYCLISTS), $$$foo, cb_ke_review_creators());
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_checkbox_input($str83$narrow_filter_too, NIL, makeBoolean((NIL != cb_ke_review_creators()) && (NIL == cb_viewpoint.cb_mycreator_filter())), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_princ($str84$Also_narrow_our_viewpoint_to_incl);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$6, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$5, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject ke_review_handler(final SubLObject args) {
        final SubLObject enable_assertions = html_extract_input($str69$enable_ke_assertion_review, args);
        final SubLObject enable_constants = html_extract_input($str72$enable_ke_constant_review, args);
        cb_adornments.enable_adornment(ASSERTION_REVIEW, enable_assertions);
        cb_adornments.enable_adornment(CONSTANT_REVIEW, enable_constants);
        $cb_ke_review_start_date$.setDynamicValue(read_args_for_simple_date($str76$cb_show_start, args));
        $cb_ke_review_end_date$.setDynamicValue(read_args_for_simple_date($str78$cb_show_end, args));
        set_cb_ke_review_creators(cb_viewpoint.cb_get_cyclists($$$foo, args));
        if ((NIL != cb_ke_review_creators()) && (NIL != html_extract_input($str83$narrow_filter_too, args))) {
            cb_viewpoint.enable_filter(MYCREATOR, UNPROVIDED);
            cb_viewpoint.set_cb_mycreator_filter(cb_ke_review_creators());
        }
        cb_ke_review_result_page();
        return NIL;
    }

    public static SubLObject cb_ke_review_result_page() {
        cb_message_page_with_history($str88$KE_Review_Options_have_been_modif, T);
        return NIL;
    }

    public static SubLObject declare_cb_ke_reviewer_file() {
        declareFunction(me, "cb_ke_edit", "CB-KE-EDIT", 1, 0, false);
        declareFunction(me, "cb_kec_edit", "CB-KEC-EDIT", 0, 1, false);
        declareFunction(me, "cb_constant_review_handler", "CB-CONSTANT-REVIEW-HANDLER", 1, 0, false);
        declareFunction(me, "cb_assertion_review_handler", "CB-ASSERTION-REVIEW-HANDLER", 1, 0, false);
        declareFunction(me, "cb_taf", "CB-TAF", 1, 0, false);
        declareFunction(me, "cb_tcf", "CB-TCF", 0, 1, false);
        declareFunction(me, "cb_constant_review", "CB-CONSTANT-REVIEW", 1, 0, false);
        declareFunction(me, "cb_ke_term_internal", "CB-KE-TERM-INTERNAL", 1, 0, false);
        declareFunction(me, "cb_ke_edit_internal", "CB-KE-EDIT-INTERNAL", 1, 0, false);
        declareFunction(me, "cb_assertion_review", "CB-ASSERTION-REVIEW", 1, 0, false);
        declareFunction(me, "constant_needs_review_p", "CONSTANT-NEEDS-REVIEW-P", 1, 0, false);
        declareFunction(me, "assertion_needs_review_p", "ASSERTION-NEEDS-REVIEW-P", 1, 0, false);
        declareFunction(me, "ke_review", "KE-REVIEW", 1, 0, false);
        declareFunction(me, "ke_review_handler", "KE-REVIEW-HANDLER", 1, 0, false);
        declareFunction(me, "cb_ke_review_result_page", "CB-KE-REVIEW-RESULT-PAGE", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_ke_reviewer_file() {
        return NIL;
    }

    public static SubLObject setup_cb_ke_reviewer_file() {
        html_macros.note_cgi_handler_function(CB_KE_EDIT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_KEC_EDIT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_CONSTANT_REVIEW_HANDLER, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_ASSERTION_REVIEW_HANDLER, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TAF, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TCF, $HTML_HANDLER);
        sethash($CB_CONSTANT_REVIEW, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str22$cb_constant_review_html, NIL));
        sethash($KE_REVIEW, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str48$ke_review_html, NIL));
        html_macros.note_cgi_handler_function(KE_REVIEW, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(KE_REVIEW_HANDLER, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_ke_reviewer_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_ke_reviewer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_ke_reviewer_file();
    }

    static {


























































































    }
}

/**
 * Total time: 290 ms
 */
