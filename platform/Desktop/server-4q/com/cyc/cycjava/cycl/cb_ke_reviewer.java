package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_ke_reviewer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_ke_reviewer";
    public static final String myFingerPrint = "080ee9c85ce1692d1bf8340ee3b6d126663d4c7a8ec020204bff12bf8ddfd86a";
    private static final SubLList $list0;
    private static final SubLString $str1$Could_not_determine_an_assertion_;
    private static final SubLSymbol $sym2$CB_KE_EDIT;
    private static final SubLSymbol $kw3$HTML_HANDLER;
    private static final SubLSymbol $sym4$CB_KEC_EDIT;
    private static final SubLSymbol $sym5$CB_CONSTANT_REVIEW_HANDLER;
    private static final SubLSymbol $sym6$CB_ASSERTION_REVIEW_HANDLER;
    private static final SubLSymbol $sym7$CB_TAF;
    private static final SubLSymbol $sym8$CB_TCF;
    private static final SubLString $str9$Approve_Constant;
    private static final SubLString $str10$Email_Comments;
    private static final SubLString $str11$Assert_Comments;
    private static final SubLString $str12$comment;
    private static final SubLObject $const13$myReviewer;
    private static final SubLObject $const14$BookkeepingMt;
    private static final SubLSymbol $kw15$MONOTONIC;
    private static final SubLSymbol $kw16$BACKWARD;
    private static final SubLObject $const17$cyclistNotes;
    private static final SubLSymbol $kw18$DEFAULT;
    private static final SubLSymbol $kw19$FORWARD;
    private static final SubLString $str20$Approved_Constant;
    private static final SubLSymbol $kw21$CB_CONSTANT_REVIEW;
    private static final SubLString $str22$cb_constant_review_html;
    private static final SubLString $str23$post;
    private static final SubLString $str24$cb_constant_review_handler;
    private static final SubLSymbol $kw25$SELF;
    private static final SubLString $str26$Review_the_Cyc_Constant;
    private static final SubLString $str27$Cancel;
    private static final SubLString $str28$Current_Values;
    private static final SubLString $str29$Submit_Values;
    private static final SubLString $str30$Cyc_Constant__A__ID____A;
    private static final SubLString $str31$Approve_the_Constant_for_Addition;
    private static final SubLString $str32$Copy_the_Comment_Field_to_myCreat;
    private static final SubLString $str33$Assert_the_Comments_as_a___cyclis;
    private static final SubLInteger $int34$80;
    private static final SubLString $str35$virtual;
    private static final SubLString $str36$The_requested_term_is_not_availab;
    private static final SubLString $str37$cb_assertion_review_handler;
    private static final SubLString $str38$cb_assertion_review;
    private static final SubLString $str39$Review_the_Cyc_Assertion;
    private static final SubLString $str40$Cyc_Assertion__ID____A;
    private static final SubLString $str41$Meta_Assertions__;
    private static final SubLString $str42$Approve_Assertion;
    private static final SubLString $str43$Approve_the_Assertion_for_Additio;
    private static final SubLObject $const44$ist;
    private static final SubLString $str45$;
    private static final SubLString $str46$Approved_Assertion;
    private static final SubLSymbol $kw47$KE_REVIEW;
    private static final SubLString $str48$ke_review_html;
    private static final SubLString $str49$Knowledge_Entry_Review_Tools;
    private static final SubLString $str50$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str51$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw52$UNINITIALIZED;
    private static final SubLSymbol $kw53$CB_CYC;
    private static final SubLSymbol $kw54$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw55$SHA1;
    private static final SubLString $str56$yui_skin_sam;
    private static final SubLString $str57$reloadFrameButton;
    private static final SubLString $str58$button;
    private static final SubLString $str59$reload;
    private static final SubLString $str60$Refresh_Frames;
    private static final SubLString $str61$ke_review_handler;
    private static final SubLString $str62$Knowledge_Entry_Review_Options;
    private static final SubLString $str63$Change_KE_Options;
    private static final SubLString $str64$General_KE_Review_Options;
    private static final SubLString $str65$Allow_KE_Review_Tags_and_links;
    private static final SubLSymbol $kw66$LEFT;
    private static final SubLSymbol $kw67$TOP;
    private static final SubLSymbol $sym68$ASSERTION_REVIEW;
    private static final SubLString $str69$enable_ke_assertion_review;
    private static final SubLString $str70$on_assertions;
    private static final SubLSymbol $sym71$CONSTANT_REVIEW;
    private static final SubLString $str72$enable_ke_constant_review;
    private static final SubLString $str73$on_constants;
    private static final SubLString $str74$Enter_in_the_start_date_;
    private static final SubLString $str75$Tools_will_be_limited_to_constant;
    private static final SubLString $str76$cb_show_start;
    private static final SubLString $str77$Enter_in_the_ending_date_;
    private static final SubLString $str78$cb_show_end;
    private static final SubLString $str79$Enter_the_cyclist_s__to_examine__;
    private static final SubLString $str80$Tools_will_be_limited_to_constant;
    private static final SubLSymbol $sym81$CB_PROMPT_CYCLISTS;
    private static final SubLString $str82$foo;
    private static final SubLString $str83$narrow_filter_too;
    private static final SubLString $str84$Also_narrow_our_viewpoint_to_incl;
    private static final SubLSymbol $sym85$KE_REVIEW;
    private static final SubLSymbol $sym86$MYCREATOR;
    private static final SubLSymbol $sym87$KE_REVIEW_HANDLER;
    private static final SubLString $str88$KE_Review_Options_have_been_modif;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 590L)
    public static SubLObject cb_ke_edit(final SubLObject args) {
        SubLObject assertion_id = (SubLObject)cb_ke_reviewer.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_ke_reviewer.$list0);
        assertion_id = args.first();
        final SubLObject current = args.rest();
        if (cb_ke_reviewer.NIL == current) {
            final SubLObject assertion = cb_utilities.cb_guess_assertion(assertion_id);
            if (cb_ke_reviewer.NIL == assertion_handles.assertion_p(assertion)) {
                return cb_utilities.cb_error((SubLObject)cb_ke_reviewer.$str1$Could_not_determine_an_assertion_, assertion_id, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            }
            cb_ke_edit_internal(assertion);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_ke_reviewer.$list0);
        }
        return (SubLObject)cb_ke_reviewer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 945L)
    public static SubLObject cb_kec_edit(SubLObject args) {
        if (args == cb_ke_reviewer.UNPROVIDED) {
            args = (SubLObject)cb_ke_reviewer.NIL;
        }
        return cb_ke_term_internal(args.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 1040L)
    public static SubLObject cb_constant_review_handler(final SubLObject args) {
        return cb_constant_review(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 1131L)
    public static SubLObject cb_assertion_review_handler(final SubLObject args) {
        return cb_assertion_review(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 1224L)
    public static SubLObject cb_taf(final SubLObject args) {
        return cb_ke_edit(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 1298L)
    public static SubLObject cb_tcf(SubLObject args) {
        if (args == cb_ke_reviewer.UNPROVIDED) {
            args = (SubLObject)cb_ke_reviewer.NIL;
        }
        return cb_kec_edit(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 1370L)
    public static SubLObject cb_constant_review(final SubLObject args) {
        final SubLObject approve_p = html_utilities.html_extract_input((SubLObject)cb_ke_reviewer.$str9$Approve_Constant, args);
        final SubLObject fort = (SubLObject)((cb_ke_reviewer.NIL != approve_p) ? cb_utilities.cb_guess_fort(approve_p, (SubLObject)cb_ke_reviewer.UNPROVIDED) : cb_ke_reviewer.NIL);
        final SubLObject email_p = html_utilities.html_extract_input((SubLObject)cb_ke_reviewer.$str10$Email_Comments, args);
        final SubLObject assert_p = html_utilities.html_extract_input((SubLObject)cb_ke_reviewer.$str11$Assert_Comments, args);
        final SubLObject comment_text = html_utilities.html_extract_input((SubLObject)cb_ke_reviewer.$str12$comment, args);
        if (cb_ke_reviewer.NIL != approve_p) {
            ke.ke_assert((SubLObject)ConsesLow.list(cb_ke_reviewer.$const13$myReviewer, fort, operation_communication.the_cyclist()), cb_ke_reviewer.$const14$BookkeepingMt, (SubLObject)cb_ke_reviewer.$kw15$MONOTONIC, (SubLObject)cb_ke_reviewer.$kw16$BACKWARD);
        }
        if (cb_ke_reviewer.NIL != comment_text && cb_ke_reviewer.NIL != approve_p && cb_ke_reviewer.NIL != assert_p) {
            ke.ke_assert((SubLObject)ConsesLow.list(cb_ke_reviewer.$const17$cyclistNotes, fort, comment_text), mt_vars.$default_comment_mt$.getGlobalValue(), (SubLObject)cb_ke_reviewer.$kw18$DEFAULT, (SubLObject)cb_ke_reviewer.$kw19$FORWARD);
        }
        cb_assertion_editor.cb_note_edit_change((SubLObject)cb_ke_reviewer.$str20$Approved_Constant, (SubLObject)cb_ke_reviewer.T, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
        return (SubLObject)cb_ke_reviewer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 2252L)
    public static SubLObject cb_ke_term_internal(final SubLObject fort_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ke.ensure_cyclist_ok();
        final SubLObject fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)cb_ke_reviewer.UNPROVIDED);
        if (cb_ke_reviewer.NIL != forts.fort_p(fort)) {
            if (cb_ke_reviewer.NIL != nart_handles.nart_p(fort)) {
                cb_tools.cb_add_to_nat_history(fort);
            }
            else {
                cb_tools.cb_add_to_constant_history(fort);
            }
            final SubLObject identifier = cb_utilities.cb_fort_identifier(fort);
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_ke_reviewer.NIL);
            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str23$post);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            if (cb_ke_reviewer.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
                html_macros.$within_html_form$.bind((SubLObject)cb_ke_reviewer.T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                html_utilities.html_hidden_input((SubLObject)cb_ke_reviewer.$str24$cb_constant_review_handler, (SubLObject)cb_ke_reviewer.T, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                cb_utilities.cb_help_preamble((SubLObject)cb_ke_reviewer.$kw21$CB_CONSTANT_REVIEW, (SubLObject)cb_ke_reviewer.$kw25$SELF, (SubLObject)cb_ke_reviewer.$str26$Review_the_Cyc_Constant);
                html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
                cb_utilities.cb_back_button((SubLObject)cb_ke_reviewer.$kw25$SELF, (SubLObject)cb_ke_reviewer.$str27$Cancel);
                html_utilities.html_indent((SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_reset_input((SubLObject)cb_ke_reviewer.$str28$Current_Values);
                html_utilities.html_indent((SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_submit_input((SubLObject)cb_ke_reviewer.$str29$Submit_Values, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_hr((SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_ke_reviewer.$str30$Cyc_Constant__A__ID____A, fort, identifier);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                html_utilities.html_checkbox_input((SubLObject)cb_ke_reviewer.$str9$Approve_Constant, fort, (SubLObject)cb_ke_reviewer.NIL, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str31$Approve_the_Constant_for_Addition);
                html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_checkbox_input((SubLObject)cb_ke_reviewer.$str10$Email_Comments, (SubLObject)cb_ke_reviewer.T, (SubLObject)cb_ke_reviewer.NIL, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str32$Copy_the_Comment_Field_to_myCreat);
                html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_checkbox_input((SubLObject)cb_ke_reviewer.$str11$Assert_Comments, (SubLObject)cb_ke_reviewer.T, (SubLObject)cb_ke_reviewer.T, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str33$Assert_the_Comments_as_a___cyclis);
                html_utilities.html_newline((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                if (cb_ke_reviewer.NIL != cb_parameters.$cb_wrap_interactor$.getDynamicValue(thread)) {
                    html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str12$comment);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_ke_reviewer.$int34$80);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_ke_reviewer.TWENTY_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str35$virtual);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                }
                else {
                    html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str12$comment);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_ke_reviewer.$int34$80);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_ke_reviewer.TWENTY_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                }
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            }
            finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        }
        else {
            cb_utilities.cb_error((SubLObject)cb_ke_reviewer.$str36$The_requested_term_is_not_availab, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
        }
        return (SubLObject)cb_ke_reviewer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 4641L)
    public static SubLObject cb_ke_edit_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ke.ensure_cyclist_ok();
        cb_tools.cb_add_to_assertion_history(assertion);
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_ke_reviewer.NIL);
        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str23$post);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
        if (cb_ke_reviewer.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
            html_macros.$within_html_form$.bind((SubLObject)cb_ke_reviewer.T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_utilities.html_hidden_input((SubLObject)cb_ke_reviewer.$str37$cb_assertion_review_handler, (SubLObject)cb_ke_reviewer.T, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            cb_utilities.cb_help_preamble((SubLObject)cb_ke_reviewer.$str38$cb_assertion_review, (SubLObject)cb_ke_reviewer.$kw25$SELF, (SubLObject)cb_ke_reviewer.$str39$Review_the_Cyc_Assertion);
            html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
            cb_utilities.cb_back_button((SubLObject)cb_ke_reviewer.$kw25$SELF, (SubLObject)cb_ke_reviewer.$str27$Cancel);
            html_utilities.html_indent((SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_reset_input((SubLObject)cb_ke_reviewer.$str28$Current_Values);
            html_utilities.html_indent((SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_submit_input((SubLObject)cb_ke_reviewer.$str29$Submit_Values, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_hr((SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_ke_reviewer.$str40$Cyc_Assertion__ID____A, id);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
            cb_assertion_browser.cb_assertion_info(assertion);
            cb_assertion_browser.cb_assertion_diagnostics(assertion);
            if (cb_ke_reviewer.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                html_utilities.html_hr((SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str41$Meta_Assertions__);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                cb_browser.cb_c_total_internal(assertion);
            }
            html_utilities.html_hr((SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_checkbox_input((SubLObject)cb_ke_reviewer.$str42$Approve_Assertion, id, (SubLObject)cb_ke_reviewer.NIL, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_ke_reviewer.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str43$Approve_the_Assertion_for_Additio);
            html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_checkbox_input((SubLObject)cb_ke_reviewer.$str10$Email_Comments, (SubLObject)cb_ke_reviewer.T, (SubLObject)cb_ke_reviewer.NIL, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_ke_reviewer.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str32$Copy_the_Comment_Field_to_myCreat);
            html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_checkbox_input((SubLObject)cb_ke_reviewer.$str11$Assert_Comments, (SubLObject)cb_ke_reviewer.T, (SubLObject)cb_ke_reviewer.T, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_ke_reviewer.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str33$Assert_the_Comments_as_a___cyclis);
            html_utilities.html_newline((SubLObject)cb_ke_reviewer.TWO_INTEGER);
            if (cb_ke_reviewer.NIL != cb_parameters.$cb_wrap_interactor$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str12$comment);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_ke_reviewer.$int34$80);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_ke_reviewer.TWENTY_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str35$virtual);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
            }
            else {
                html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str12$comment);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_ke_reviewer.$int34$80);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_ke_reviewer.TWENTY_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
            }
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return (SubLObject)cb_ke_reviewer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 7214L)
    public static SubLObject cb_assertion_review(final SubLObject args) {
        final SubLObject approve_p = html_utilities.html_extract_input((SubLObject)cb_ke_reviewer.$str42$Approve_Assertion, args);
        final SubLObject assertion = (SubLObject)((cb_ke_reviewer.NIL != approve_p) ? assertion_handles.find_assertion_by_id(reader.parse_integer(approve_p, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED)) : cb_ke_reviewer.NIL);
        final SubLObject formula = (SubLObject)((cb_ke_reviewer.NIL != assertion) ? uncanonicalizer.assertion_el_formula(assertion) : cb_ke_reviewer.NIL);
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        final SubLObject assert_p = html_utilities.html_extract_input((SubLObject)cb_ke_reviewer.$str11$Assert_Comments, args);
        final SubLObject comment_text = html_utilities.html_extract_input((SubLObject)cb_ke_reviewer.$str12$comment, args);
        if (cb_ke_reviewer.NIL != approve_p && cb_ke_reviewer.NIL != assertion) {
            ke.ke_assert((SubLObject)ConsesLow.list(cb_ke_reviewer.$const13$myReviewer, (SubLObject)ConsesLow.list(cb_ke_reviewer.$const44$ist, assertion_mt, formula), operation_communication.the_cyclist()), cb_ke_reviewer.$const14$BookkeepingMt, (SubLObject)cb_ke_reviewer.$kw15$MONOTONIC, (SubLObject)cb_ke_reviewer.$kw19$FORWARD);
        }
        if (cb_ke_reviewer.NIL != comment_text && !comment_text.equal((SubLObject)cb_ke_reviewer.$str45$) && cb_ke_reviewer.NIL != approve_p && cb_ke_reviewer.NIL != assert_p) {
            ke.ke_assert((SubLObject)ConsesLow.list(cb_ke_reviewer.$const17$cyclistNotes, formula, comment_text), assertion_mt, (SubLObject)cb_ke_reviewer.$kw18$DEFAULT, (SubLObject)cb_ke_reviewer.$kw19$FORWARD);
        }
        cb_assertion_editor.cb_note_edit_change((SubLObject)cb_ke_reviewer.$str46$Approved_Assertion, (SubLObject)cb_ke_reviewer.T, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
        return (SubLObject)cb_ke_reviewer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 8307L)
    public static SubLObject constant_needs_review_p(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time = bookkeeping_store.creation_time(constant, (SubLObject)cb_ke_reviewer.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_ke_reviewer.NIL == kb_accessors.reviewer(constant, (SubLObject)cb_ke_reviewer.UNPROVIDED) && cb_ke_reviewer.NIL != time && cb_parameters.$cb_ke_review_start_date$.getDynamicValue(thread).numLE(time) && time.numLE(cb_parameters.$cb_ke_review_end_date$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 8577L)
    public static SubLObject assertion_needs_review_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_ke_reviewer.NIL == cb_adornments.bookkeeping_assertion_p(assertion) && cb_ke_reviewer.NIL == subl_promotions.memberP(cb_utilities.assertion_marker(assertion), cb_parameters.$cb_nonreviewable_assertion_markers$.getDynamicValue(thread), (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED) && cb_ke_reviewer.NIL != assertions_high.asserted_when(assertion) && cb_parameters.$cb_ke_review_start_date$.getDynamicValue(thread).numLE(assertions_high.asserted_when(assertion)) && assertions_high.asserted_when(assertion).numLE(cb_parameters.$cb_ke_review_end_date$.getDynamicValue(thread)) && cb_ke_reviewer.NIL == cb_utilities.asserted_reviewer(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 9457L)
    public static SubLObject ke_review(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_ke_reviewer.$str49$Knowledge_Entry_Review_Tools;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_ke_reviewer.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str50$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_ke_reviewer.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_ke_reviewer.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str51$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_ke_reviewer.UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_ke_reviewer.$kw52$UNINITIALIZED) ? ConsesLow.list(cb_ke_reviewer.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_ke_reviewer.$kw53$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_ke_reviewer.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_ke_reviewer.$kw54$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_ke_reviewer.UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_ke_reviewer.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_ke_reviewer.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str56$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str57$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str58$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str59$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str60$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            if (cb_ke_reviewer.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_ke_reviewer.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_ke_reviewer.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_ke_reviewer.$str23$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                        if (cb_ke_reviewer.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_ke_reviewer.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_ke_reviewer.$str61$ke_review_handler, (SubLObject)cb_ke_reviewer.T, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_ke_reviewer.$kw47$KE_REVIEW, (SubLObject)cb_ke_reviewer.$kw25$SELF, (SubLObject)cb_ke_reviewer.$str62$Knowledge_Entry_Review_Options);
                            html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
                            cb_utilities.cb_back_button((SubLObject)cb_ke_reviewer.$kw25$SELF, (SubLObject)cb_ke_reviewer.$str27$Cancel);
                            html_utilities.html_indent((SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_ke_reviewer.$str28$Current_Values);
                            html_utilities.html_indent((SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_ke_reviewer.$str63$Change_KE_Options, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str64$General_KE_Review_Options);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_ke_reviewer.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_ke_reviewer.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_ke_reviewer.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str65$Allow_KE_Review_Tags_and_links);
                                    html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_ke_reviewer.$kw66$LEFT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_ke_reviewer.$kw67$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
                                        final SubLObject assertion_adornment_active_p = cb_adornments.active_adornment_p((SubLObject)cb_ke_reviewer.$sym68$ASSERTION_REVIEW);
                                        html_utilities.html_checkbox_input((SubLObject)cb_ke_reviewer.$str69$enable_ke_assertion_review, (SubLObject)cb_ke_reviewer.T, assertion_adornment_active_p, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                        html_utilities.html_indent((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                                        html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str70$on_assertions);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_ke_reviewer.$kw66$LEFT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_ke_reviewer.$kw67$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_ke_reviewer.T, thread);
                                        final SubLObject constant_adornment_active_p = cb_adornments.active_adornment_p((SubLObject)cb_ke_reviewer.$sym71$CONSTANT_REVIEW);
                                        html_utilities.html_checkbox_input((SubLObject)cb_ke_reviewer.$str72$enable_ke_constant_review, (SubLObject)cb_ke_reviewer.T, constant_adornment_active_p, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                                        html_utilities.html_indent((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                                        html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str73$on_constants);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_ke_reviewer.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_utilities.html_hr((SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str74$Enter_in_the_start_date_);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_ke_reviewer.THREE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str75$Tools_will_be_limited_to_constant);
                            html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
                            cb_utilities.prompt_for_simple_date(cb_parameters.$cb_ke_review_start_date$.getDynamicValue(thread), (SubLObject)cb_ke_reviewer.$str76$cb_show_start);
                            html_utilities.html_newline((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str77$Enter_in_the_ending_date_);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
                            cb_utilities.prompt_for_simple_date(cb_parameters.$cb_ke_review_end_date$.getDynamicValue(thread), (SubLObject)cb_ke_reviewer.$str78$cb_show_end);
                            html_utilities.html_newline((SubLObject)cb_ke_reviewer.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str79$Enter_the_cyclist_s__to_examine__);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_ke_reviewer.THREE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str80$Tools_will_be_limited_to_constant);
                            Functions.apply(Symbols.symbol_function((SubLObject)cb_ke_reviewer.$sym81$CB_PROMPT_CYCLISTS), (SubLObject)cb_ke_reviewer.$str82$foo, cb_parameters.cb_ke_review_creators());
                            html_utilities.html_newline((SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_ke_reviewer.THREE_INTEGER);
                            html_utilities.html_checkbox_input((SubLObject)cb_ke_reviewer.$str83$narrow_filter_too, (SubLObject)cb_ke_reviewer.NIL, (SubLObject)SubLObjectFactory.makeBoolean(cb_ke_reviewer.NIL != cb_parameters.cb_ke_review_creators() && cb_ke_reviewer.NIL == cb_viewpoint.cb_mycreator_filter()), (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED, (SubLObject)cb_ke_reviewer.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_ke_reviewer.$str84$Also_narrow_our_viewpoint_to_incl);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_ke_reviewer.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_ke_reviewer.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$6, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$5, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_ke_reviewer.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_ke_reviewer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 12324L)
    public static SubLObject ke_review_handler(final SubLObject args) {
        final SubLObject enable_assertions = html_utilities.html_extract_input((SubLObject)cb_ke_reviewer.$str69$enable_ke_assertion_review, args);
        final SubLObject enable_constants = html_utilities.html_extract_input((SubLObject)cb_ke_reviewer.$str72$enable_ke_constant_review, args);
        cb_adornments.enable_adornment((SubLObject)cb_ke_reviewer.$sym68$ASSERTION_REVIEW, enable_assertions);
        cb_adornments.enable_adornment((SubLObject)cb_ke_reviewer.$sym71$CONSTANT_REVIEW, enable_constants);
        cb_parameters.$cb_ke_review_start_date$.setDynamicValue(cb_utilities.read_args_for_simple_date((SubLObject)cb_ke_reviewer.$str76$cb_show_start, args));
        cb_parameters.$cb_ke_review_end_date$.setDynamicValue(cb_utilities.read_args_for_simple_date((SubLObject)cb_ke_reviewer.$str78$cb_show_end, args));
        cb_parameters.set_cb_ke_review_creators(cb_viewpoint.cb_get_cyclists((SubLObject)cb_ke_reviewer.$str82$foo, args));
        if (cb_ke_reviewer.NIL != cb_parameters.cb_ke_review_creators() && cb_ke_reviewer.NIL != html_utilities.html_extract_input((SubLObject)cb_ke_reviewer.$str83$narrow_filter_too, args)) {
            cb_viewpoint.enable_filter((SubLObject)cb_ke_reviewer.$sym86$MYCREATOR, (SubLObject)cb_ke_reviewer.UNPROVIDED);
            cb_viewpoint.set_cb_mycreator_filter(cb_parameters.cb_ke_review_creators());
        }
        cb_ke_review_result_page();
        return (SubLObject)cb_ke_reviewer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-ke-reviewer.lisp", position = 13146L)
    public static SubLObject cb_ke_review_result_page() {
        cb_utilities.cb_message_page_with_history((SubLObject)cb_ke_reviewer.$str88$KE_Review_Options_have_been_modif, (SubLObject)cb_ke_reviewer.T);
        return (SubLObject)cb_ke_reviewer.NIL;
    }
    
    public static SubLObject declare_cb_ke_reviewer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "cb_ke_edit", "CB-KE-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "cb_kec_edit", "CB-KEC-EDIT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "cb_constant_review_handler", "CB-CONSTANT-REVIEW-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "cb_assertion_review_handler", "CB-ASSERTION-REVIEW-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "cb_taf", "CB-TAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "cb_tcf", "CB-TCF", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "cb_constant_review", "CB-CONSTANT-REVIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "cb_ke_term_internal", "CB-KE-TERM-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "cb_ke_edit_internal", "CB-KE-EDIT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "cb_assertion_review", "CB-ASSERTION-REVIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "constant_needs_review_p", "CONSTANT-NEEDS-REVIEW-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "assertion_needs_review_p", "ASSERTION-NEEDS-REVIEW-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "ke_review", "KE-REVIEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "ke_review_handler", "KE-REVIEW-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_ke_reviewer", "cb_ke_review_result_page", "CB-KE-REVIEW-RESULT-PAGE", 0, 0, false);
        return (SubLObject)cb_ke_reviewer.NIL;
    }
    
    public static SubLObject init_cb_ke_reviewer_file() {
        return (SubLObject)cb_ke_reviewer.NIL;
    }
    
    public static SubLObject setup_cb_ke_reviewer_file() {
        html_macros.note_cgi_handler_function((SubLObject)cb_ke_reviewer.$sym2$CB_KE_EDIT, (SubLObject)cb_ke_reviewer.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_ke_reviewer.$sym4$CB_KEC_EDIT, (SubLObject)cb_ke_reviewer.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_ke_reviewer.$sym5$CB_CONSTANT_REVIEW_HANDLER, (SubLObject)cb_ke_reviewer.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_ke_reviewer.$sym6$CB_ASSERTION_REVIEW_HANDLER, (SubLObject)cb_ke_reviewer.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_ke_reviewer.$sym7$CB_TAF, (SubLObject)cb_ke_reviewer.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_ke_reviewer.$sym8$CB_TCF, (SubLObject)cb_ke_reviewer.$kw3$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_ke_reviewer.$kw21$CB_CONSTANT_REVIEW, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_ke_reviewer.$str22$cb_constant_review_html, (SubLObject)cb_ke_reviewer.NIL));
        Hashtables.sethash((SubLObject)cb_ke_reviewer.$kw47$KE_REVIEW, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_ke_reviewer.$str48$ke_review_html, (SubLObject)cb_ke_reviewer.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_ke_reviewer.$sym85$KE_REVIEW, (SubLObject)cb_ke_reviewer.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_ke_reviewer.$sym87$KE_REVIEW_HANDLER, (SubLObject)cb_ke_reviewer.$kw3$HTML_HANDLER);
        return (SubLObject)cb_ke_reviewer.NIL;
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
        me = (SubLFile)new cb_ke_reviewer();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ID"));
        $str1$Could_not_determine_an_assertion_ = SubLObjectFactory.makeString("Could not determine an assertion from ~a");
        $sym2$CB_KE_EDIT = SubLObjectFactory.makeSymbol("CB-KE-EDIT");
        $kw3$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym4$CB_KEC_EDIT = SubLObjectFactory.makeSymbol("CB-KEC-EDIT");
        $sym5$CB_CONSTANT_REVIEW_HANDLER = SubLObjectFactory.makeSymbol("CB-CONSTANT-REVIEW-HANDLER");
        $sym6$CB_ASSERTION_REVIEW_HANDLER = SubLObjectFactory.makeSymbol("CB-ASSERTION-REVIEW-HANDLER");
        $sym7$CB_TAF = SubLObjectFactory.makeSymbol("CB-TAF");
        $sym8$CB_TCF = SubLObjectFactory.makeSymbol("CB-TCF");
        $str9$Approve_Constant = SubLObjectFactory.makeString("Approve-Constant");
        $str10$Email_Comments = SubLObjectFactory.makeString("Email-Comments");
        $str11$Assert_Comments = SubLObjectFactory.makeString("Assert-Comments");
        $str12$comment = SubLObjectFactory.makeString("comment");
        $const13$myReviewer = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myReviewer"));
        $const14$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $kw15$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $kw16$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $const17$cyclistNotes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNotes"));
        $kw18$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw19$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $str20$Approved_Constant = SubLObjectFactory.makeString("Approved Constant");
        $kw21$CB_CONSTANT_REVIEW = SubLObjectFactory.makeKeyword("CB-CONSTANT-REVIEW");
        $str22$cb_constant_review_html = SubLObjectFactory.makeString("cb-constant-review.html");
        $str23$post = SubLObjectFactory.makeString("post");
        $str24$cb_constant_review_handler = SubLObjectFactory.makeString("cb-constant-review-handler");
        $kw25$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str26$Review_the_Cyc_Constant = SubLObjectFactory.makeString("Review the Cyc Constant");
        $str27$Cancel = SubLObjectFactory.makeString("Cancel");
        $str28$Current_Values = SubLObjectFactory.makeString("Current Values");
        $str29$Submit_Values = SubLObjectFactory.makeString("Submit Values");
        $str30$Cyc_Constant__A__ID____A = SubLObjectFactory.makeString("Cyc Constant ~A, ID: #~A");
        $str31$Approve_the_Constant_for_Addition = SubLObjectFactory.makeString("Approve the Constant for Addition to Cyc");
        $str32$Copy_the_Comment_Field_to_myCreat = SubLObjectFactory.makeString("Copy the Comment Field to myCreator via Email");
        $str33$Assert_the_Comments_as_a___cyclis = SubLObjectFactory.makeString("Assert the Comments as a #$cyclistNotes");
        $int34$80 = SubLObjectFactory.makeInteger(80);
        $str35$virtual = SubLObjectFactory.makeString("virtual");
        $str36$The_requested_term_is_not_availab = SubLObjectFactory.makeString("The requested term is not available.");
        $str37$cb_assertion_review_handler = SubLObjectFactory.makeString("cb-assertion-review-handler");
        $str38$cb_assertion_review = SubLObjectFactory.makeString("cb-assertion-review");
        $str39$Review_the_Cyc_Assertion = SubLObjectFactory.makeString("Review the Cyc Assertion");
        $str40$Cyc_Assertion__ID____A = SubLObjectFactory.makeString("Cyc Assertion  ID: #~A");
        $str41$Meta_Assertions__ = SubLObjectFactory.makeString("Meta Assertions :");
        $str42$Approve_Assertion = SubLObjectFactory.makeString("Approve-Assertion");
        $str43$Approve_the_Assertion_for_Additio = SubLObjectFactory.makeString("Approve the Assertion for Addition to Cyc");
        $const44$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $str45$ = SubLObjectFactory.makeString("");
        $str46$Approved_Assertion = SubLObjectFactory.makeString("Approved Assertion");
        $kw47$KE_REVIEW = SubLObjectFactory.makeKeyword("KE-REVIEW");
        $str48$ke_review_html = SubLObjectFactory.makeString("ke-review.html");
        $str49$Knowledge_Entry_Review_Tools = SubLObjectFactory.makeString("Knowledge Entry Review Tools");
        $str50$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str51$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw52$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw53$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw54$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw55$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str56$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str57$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str58$button = SubLObjectFactory.makeString("button");
        $str59$reload = SubLObjectFactory.makeString("reload");
        $str60$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str61$ke_review_handler = SubLObjectFactory.makeString("ke-review-handler");
        $str62$Knowledge_Entry_Review_Options = SubLObjectFactory.makeString("Knowledge Entry Review Options");
        $str63$Change_KE_Options = SubLObjectFactory.makeString("Change KE Options");
        $str64$General_KE_Review_Options = SubLObjectFactory.makeString("General KE Review Options");
        $str65$Allow_KE_Review_Tags_and_links = SubLObjectFactory.makeString("Allow KE Review Tags and links");
        $kw66$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw67$TOP = SubLObjectFactory.makeKeyword("TOP");
        $sym68$ASSERTION_REVIEW = SubLObjectFactory.makeSymbol("ASSERTION-REVIEW");
        $str69$enable_ke_assertion_review = SubLObjectFactory.makeString("enable-ke-assertion-review");
        $str70$on_assertions = SubLObjectFactory.makeString("on assertions");
        $sym71$CONSTANT_REVIEW = SubLObjectFactory.makeSymbol("CONSTANT-REVIEW");
        $str72$enable_ke_constant_review = SubLObjectFactory.makeString("enable-ke-constant-review");
        $str73$on_constants = SubLObjectFactory.makeString("on constants");
        $str74$Enter_in_the_start_date_ = SubLObjectFactory.makeString("Enter in the start date:");
        $str75$Tools_will_be_limited_to_constant = SubLObjectFactory.makeString("Tools will be limited to constants and assertions for which #$myCreationTime is between the start and end date.");
        $str76$cb_show_start = SubLObjectFactory.makeString("cb-show-start");
        $str77$Enter_in_the_ending_date_ = SubLObjectFactory.makeString("Enter in the ending date:");
        $str78$cb_show_end = SubLObjectFactory.makeString("cb-show-end");
        $str79$Enter_the_cyclist_s__to_examine__ = SubLObjectFactory.makeString("Enter the cyclist(s) to examine (blank indicates to examine ALL cyclists):");
        $str80$Tools_will_be_limited_to_constant = SubLObjectFactory.makeString("Tools will be limited to constants and assertions which the below cyclists are the #$myCreator for.");
        $sym81$CB_PROMPT_CYCLISTS = SubLObjectFactory.makeSymbol("CB-PROMPT-CYCLISTS");
        $str82$foo = SubLObjectFactory.makeString("foo");
        $str83$narrow_filter_too = SubLObjectFactory.makeString("narrow-filter-too");
        $str84$Also_narrow_our_viewpoint_to_incl = SubLObjectFactory.makeString("Also narrow our viewpoint to include only these cyclists as the myCreator");
        $sym85$KE_REVIEW = SubLObjectFactory.makeSymbol("KE-REVIEW");
        $sym86$MYCREATOR = SubLObjectFactory.makeSymbol("MYCREATOR");
        $sym87$KE_REVIEW_HANDLER = SubLObjectFactory.makeSymbol("KE-REVIEW-HANDLER");
        $str88$KE_Review_Options_have_been_modif = SubLObjectFactory.makeString("KE Review Options have been modified");
    }
}

/*

	Total time: 290 ms
	
*/