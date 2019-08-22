package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.$cb_form_cons_methods_active$;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.compute_cb_form_cons_methods_active;
import static com.cyc.cycjava.cycl.cb_utilities.html_assertion_marker;
import static com.cyc.cycjava.cycl.cb_utilities.register_cb_form_cons_method;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_br;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_ke_text extends SubLTranslatedFile {
    public static final SubLFile me = new cb_ke_text();

    public static final String myName = "com.cyc.cycjava.cycl.cb_ke_text";

    public static final String myFingerPrint = "436fede6d011d4f254c9bba351bc6a091e6c77c13fc9859fe93c95ab385718f9";

    // defparameter
    private static final SubLSymbol $ket_do_ke_operations_data_keywords$ = makeSymbol("*KET-DO-KE-OPERATIONS-DATA-KEYWORDS*");

    // defparameter
    private static final SubLSymbol $cb_ke_text_default_cb_form_cons_method_keywords$ = makeSymbol("*CB-KE-TEXT-DEFAULT-CB-FORM-CONS-METHOD-KEYWORDS*");

    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("SUMMARY-FN"), makeSymbol("DO-KE-OPERATIONS-SUMMARY"), makeKeyword("DISPLAY-FN"), makeSymbol("CB-DO-KE-OPERATIONS-DISPLAY"), makeKeyword("HANDLER-FN"), makeSymbol("CB-DO-KE-OPERATIONS-HANDLER"));

    private static final SubLSymbol $DO_KE_OPERATIONS = makeKeyword("DO-KE-OPERATIONS");

    public static final SubLList $list2 = list(makeKeyword("USER-ACTION-ID-STRING"), makeKeyword("SOURCE"), makeKeyword("FILENAME"), makeKeyword("CHECK-EXISTING"), makeKeyword("KE-TEXT-LIST"), makeKeyword("KE-OPERATIONS"), makeKeyword("PROJECT"));



    public static final SubLString $$$unknown_file = makeString("unknown file");



    public static final SubLString $str6$ke_text_compose = makeString("ke-text compose");

    public static final SubLString $$$unknown_source = makeString("unknown source");







    public static final SubLString $str11$cg_cb_handle_ke_text_file__filena = makeString("cg?cb-handle-ke-text-file&:filename=~A");

    public static final SubLString $str12$__user_action_id_string_ = makeString("&:user-action-id-string=");

    public static final SubLString $str13$_2 = makeString("+2");

    public static final SubLString $$$Reload_File = makeString("Reload File");







    public static final SubLString $$$Evaluate_ = makeString("Evaluate ");

    public static final SubLString $$$_forms_from_ = makeString(" forms from ");

    public static final SubLSymbol NEW_KE_TEXT_CONSTANT = makeSymbol("NEW-KE-TEXT-CONSTANT");

    public static final SubLList $list21 = list(makeKeyword("NAME"), makeString("new-ke-text-constant"), makeKeyword("KEYWORD"), makeKeyword("NEW-KE-TEXT-CONSTANT"), makeKeyword("APPLICABILITY-TEST-FN"), makeSymbol("NEW-KE-TEXT-CONSTANT-APPLICABILITY-TEST"), makeKeyword("HTML-OUTPUT-FN"), makeSymbol("NEW-KE-TEXT-CONSTANT-HTML-OUTPUT-FN"));

    public static final SubLList $list22 = list(makeKeyword("NEW-KE-TEXT-CONSTANT"));

    private static final SubLSymbol $CHECK_AND_SHOW = makeKeyword("CHECK-AND-SHOW");

    private static final SubLSymbol $CHECK_AND_REMOVE = makeKeyword("CHECK-AND-REMOVE");

    public static final SubLList $list25 = list(makeKeyword("ASSERT"), makeKeyword("UNASSERT"));



    public static final SubLString $$$already_exists_ = makeString("already exists ");



    public static final SubLString $$$does_not_exist = makeString("does not exist");

    public static final SubLSymbol CB_DO_KE_OPERATIONS_DISPLAY = makeSymbol("CB-DO-KE-OPERATIONS-DISPLAY");



    private static final SubLSymbol $USER_ACTION_ID_STRING = makeKeyword("USER-ACTION-ID-STRING");



    private static final SubLString $$$Fatal_Error = makeString("Fatal Error");

    private static final SubLString $str35$cb_do_ke_operations_display_inter = makeString("cb-do-ke-operations-display-internal called without a valid user-action-id-string");







    private static final SubLString $str39$KE_Text__Parse_Status = makeString("KE-Text: Parse Status");

    private static final SubLString $str40$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str41$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str46$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str51$Your_KE_Text__from_ = makeString("Your KE-Text (from ");

    private static final SubLString $str52$__did_not_parse_into_any_operatio = makeString(") did not parse into any operations.");

    private static final SubLString $str53$__has_been_successfully_parsed_in = makeString(") has been successfully parsed into the below lists.");

    private static final SubLString $str54$cg_cb_handle_ke_operations__user_ = makeString("cg?cb-handle-ke-operations&:user-action-id-string=~A&::check-existing=check-and-remove");

    private static final SubLString $str55$Remove_Redundant_Asserts_Unassert = makeString("Remove Redundant Asserts/Unasserts.");

    private static final SubLString $str56$cg_cb_handle_ke_operations__user_ = makeString("cg?cb-handle-ke-operations&:user-action-id-string=~A&::check-existing=check-and-show");

    private static final SubLString $str57$Check_for_Existing_Assertions_ = makeString("Check for Existing Assertions.");

    private static final SubLString $str58$cg__A__A___method_agenda = makeString("cg?~A&~A&::method=agenda");

    private static final SubLString $$$Add_Forms_to_Agenda = makeString("Add Forms to Agenda");

    private static final SubLString $$$merged = makeString("merged");

    private static final SubLString $$$renamed = makeString("renamed");

    private static final SubLString $$$killed = makeString("killed");

    private static final SubLString $$$created = makeString("created");

    private static final SubLList $list64 = list(makeString(" or "));

    private static final SubLList $list65 = list(makeString(", "), makeString(", or "));

    private static final SubLList $list66 = list(makeString(", "), makeString(", "), makeString(" or "));

    private static final SubLString $$$The_following_constants_will_be_ = makeString("The following constants will be ");

    private static final SubLString $str68$_ = makeString(":");



    private static final SubLString $str70$Create__ = makeString("Create: ");



    private static final SubLString $str72$Kill__ = makeString("Kill: ");



    private static final SubLString $str74$Rename__ = makeString("Rename: ");



    private static final SubLString $str76$Merge__ = makeString("Merge: ");



    private static final SubLString $$$_to_ = makeString(" to ");

    private static final SubLString $$$_onto_ = makeString(" onto ");

    private static final SubLString $$$Project_ = makeString("Project ");

    private static final SubLString $str81$_will_be_used_as_the_KE_purpose_ = makeString(" will be used as the KE purpose.");

    private static final SubLString $str82$100_ = makeString("100%");

    private static final SubLString $str83$Operations_ = makeString("Operations:");

    private static final SubLString $str84$_A_existing_assertion_A = makeString("~A existing assertion~A");

    private static final SubLString $$$no = makeString("no");

    private static final SubLString $$$one = makeString("one");

    private static final SubLString $str87$ = makeString("");

    private static final SubLString $$$s = makeString("s");

    private static final SubLSymbol $KET_ADD_TO_HISTORY = makeKeyword("KET-ADD-TO-HISTORY");

    private static final SubLString $str90$_Add_to_History_ = makeString("[Add to History]");

    private static final SubLString $str91$_dddddd = makeString("#dddddd");

    private static final SubLString $str92$_cccccc = makeString("#cccccc");



    private static final SubLString $str94$cb_ket_add_to_history__a = makeString("cb-ket-add-to-history&~a");

    private static final SubLSymbol CB_LINK_KET_ADD_TO_HISTORY = makeSymbol("CB-LINK-KET-ADD-TO-HISTORY");



    private static final SubLList $list97 = list(makeSymbol("USER-ACTION-ID-STRING"));

    private static final SubLSymbol CB_KET_ADD_TO_HISTORY = makeSymbol("CB-KET-ADD-TO-HISTORY");



    private static final SubLString $str100$cb_do_ke_operations_handler_calle = makeString("cb-do-ke-operations-handler called without a valid user-action-id-string");



    private static final SubLString $str102$KE_Text__Forms_Added_to_Agenda = makeString("KE-Text: Forms Added to Agenda");





    private static final SubLSymbol CB_DO_KE_OPERATIONS_HANDLER = makeSymbol("CB-DO-KE-OPERATIONS-HANDLER");

    private static final SubLSymbol CB_HANDLE_KE_OPERATIONS = makeSymbol("CB-HANDLE-KE-OPERATIONS");





    private static final SubLString $str109$ket_handle_ke_operations__Could_n = makeString("ket-handle-ke-operations: Could not create a user action.");



    private static final SubLString $str111$User_action__do_ke_operations_not = makeString("User action :do-ke-operations not defined.");

    private static final SubLString $str112$KE_Text__Errors_Found = makeString("KE-Text: Errors Found");

    private static final SubLString $str113$Some_errors_were_found_parsing_yo = makeString("Some errors were found parsing your KE-Text.  Please fix and try again.");



    private static final SubLString $str115$1_ = makeString("1%");

    private static final SubLString $str116$_ = makeString("-");



    private static final SubLString $$$Looking_over_the_ = makeString("Looking over the ");

    private static final SubLString $str119$ref_ke_file_html = makeString("ref/ke-file.html");

    private static final SubLString $$$KE_Text_specification = makeString("KE Text specification");

    private static final SubLString $str121$_may_also_help_ = makeString(" may also help.");

    private static final SubLSymbol $KE_TEXT_LIST = makeKeyword("KE-TEXT-LIST");



    private static final SubLSymbol CB_HANDLE_KE_TEXT_FILE = makeSymbol("CB-HANDLE-KE-TEXT-FILE");



    private static final SubLSymbol CB_HANDLE_KE_TEXT_COMPOSE = makeSymbol("CB-HANDLE-KE-TEXT-COMPOSE");

    public static SubLObject ket_string_for_source(SubLObject source, SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = NIL;
        }
        if (source.eql($FILE)) {
            if (filename.isString()) {
                return filename;
            }
            return $$$unknown_file;
        } else {
            if (source.eql($COMPOSE)) {
                return $str6$ke_text_compose;
            }
            html_princ($$$unknown_source);
            return NIL;
        }
    }

    public static SubLObject ket_check_ke_operation(final SubLObject ke_operation) {
        final SubLObject ke_operation_type = ke_operation.first();
        final SubLObject ke_operation_args = ke_operation.rest();
        final SubLObject pcase_var = ke_operation_type;
        if (pcase_var.eql($ASSERT) || pcase_var.eql($UNASSERT)) {
            final SubLObject sentence = ke_operation_args.first();
            SubLObject mt = second(ke_operation_args);
            if ((NIL == list_utilities.tree_find($NEW_CONSTANT, sentence, UNPROVIDED, UNPROVIDED)) && (NIL == list_utilities.tree_find($NEW_CONSTANT, mt, UNPROVIDED, UNPROVIDED))) {
                if ((NIL == forts.fort_p(mt)) && mt.isCons()) {
                    mt = narts_high.find_nart(mt);
                }
                if (NIL != forts.fort_p(mt)) {
                    final SubLObject assertions = fi.sentence_assertions(sentence, mt);
                    SubLObject asserted_assertion = NIL;
                    SubLObject doneP = NIL;
                    if (NIL == doneP) {
                        SubLObject csome_list_var = assertions;
                        SubLObject assertion = NIL;
                        assertion = csome_list_var.first();
                        while ((NIL == doneP) && (NIL != csome_list_var)) {
                            if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.asserted_assertionP(assertion))) {
                                asserted_assertion = assertion;
                                doneP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            assertion = csome_list_var.first();
                        } 
                    }
                    return asserted_assertion;
                }
            }
            return NIL;
        }
        return NIL;
    }

    public static SubLObject html_reload_ke_file_link(final SubLObject filename, SubLObject user_action_id_string) {
        if (user_action_id_string == UNPROVIDED) {
            user_action_id_string = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject href = format(NIL, $str11$cg_cb_handle_ke_text_file__filena, filename);
        if (user_action_id_string.isString()) {
            href = cconcatenate(href, new SubLObject[]{ $str12$__user_action_id_string_, user_action_id_string });
        }
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(href);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str13$_2);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($$$Reload_File);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject do_ke_operations_summary(final SubLObject user_action_id_string) {
        final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
        final SubLObject type = user_actions.user_action_type(user_action);
        final SubLObject source = html_arghash.get_arghash_value($SOURCE, user_actions.user_action_data(user_action));
        final SubLObject filename = html_arghash.get_arghash_value($FILENAME, user_actions.user_action_data(user_action));
        final SubLObject ke_operations = html_arghash.get_arghash_value($KE_OPERATIONS, user_actions.user_action_data(user_action));
        html_princ($$$Evaluate_);
        html_princ(length(ke_operations));
        html_princ($$$_forms_from_);
        html_princ(ket_string_for_source(source, filename));
        return NIL;
    }

    public static SubLObject new_ke_text_constant_applicability_test(final SubLObject cons) {
        return makeBoolean((cons.isList() && (NIL != list_utilities.lengthE(cons, TWO_INTEGER, UNPROVIDED))) && (cons.first() == $NEW_CONSTANT));
    }

    public static SubLObject new_ke_text_constant_html_output_fn(final SubLObject cons, final SubLObject depth, final SubLObject wrap_axiomsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
            html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(second(cons));
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject ket_show_ke_operation_row(final SubLObject ke_operation, SubLObject bgcolor, SubLObject check_existing) {
        if (bgcolor == UNPROVIDED) {
            bgcolor = NIL;
        }
        if (check_existing == UNPROVIDED) {
            check_existing = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ke_operation_type = ke_operation.first();
        SubLObject asserted_assertion = NIL;
        SubLObject operation_displayedP = T;
        if (((check_existing == $CHECK_AND_SHOW) || (check_existing == $CHECK_AND_REMOVE)) && (NIL != subl_promotions.memberP(ke_operation_type, $list25, UNPROVIDED, UNPROVIDED))) {
            asserted_assertion = ket_check_ke_operation(ke_operation);
            if (check_existing == $CHECK_AND_REMOVE) {
                final SubLObject pcase_var = ke_operation_type;
                if (pcase_var.eql($ASSERT)) {
                    if (NIL != asserted_assertion) {
                        operation_displayedP = NIL;
                    }
                } else
                    if (pcase_var.eql($UNASSERT) && (NIL == asserted_assertion)) {
                        operation_displayedP = NIL;
                    }

            }
        }
        if (NIL != operation_displayedP) {
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (NIL != bgcolor) {
                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(bgcolor);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $cb_form_cons_methods_active$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    $cb_form_cons_methods_active$.bind(compute_cb_form_cons_methods_active($cb_ke_text_default_cb_form_cons_method_keywords$.getDynamicValue(thread)), thread);
                    cb_form(ke_operation, ZERO_INTEGER, T);
                } finally {
                    $cb_form_cons_methods_active$.rebind(_prev_bind_2, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if ((check_existing == $CHECK_AND_SHOW) || (check_existing == $CHECK_AND_REMOVE)) {
                        final SubLObject pcase_var2 = ke_operation_type;
                        if (pcase_var2.eql($ASSERT)) {
                            if (NIL != asserted_assertion) {
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$already_exists_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_assertion_marker(asserted_assertion, $BOTTOM);
                            }
                        } else
                            if (pcase_var2.eql($UNASSERT)) {
                                if (NIL != asserted_assertion) {
                                    html_assertion_marker(asserted_assertion, $BOTTOM);
                                } else {
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$does_not_exist);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                            }

                    }
                    html_br();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        }
        return operation_displayedP;
    }

    public static SubLObject cb_do_ke_operations_display(final SubLObject args) {
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        return cb_do_ke_operations_display_internal(arghash);
    }

    public static SubLObject cb_do_ke_operations_display_internal(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject user_action_id_string = html_arghash.get_arghash_value($USER_ACTION_ID_STRING, arghash);
        if (NIL == user_action_id_string) {
            user_action_id_string = html_arghash.get_arghash_value($JUST_STRING, arghash);
            html_arghash.set_arghash_value($USER_ACTION_ID_STRING, arghash, user_action_id_string);
        }
        final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
        if (NIL == user_actions.user_action_p(user_action)) {
            cyc_navigator_internals.generic_message_page($$$Fatal_Error, format(NIL, $str35$cb_do_ke_operations_display_inter));
        } else {
            final SubLObject cyclist = user_actions.user_action_cyclist(user_action);
            final SubLObject type = user_actions.user_action_type(user_action);
            final SubLObject arghash_$6 = user_actions.user_action_data(user_action);
            final SubLObject source = html_arghash.get_arghash_value($SOURCE, arghash_$6);
            final SubLObject filename = html_arghash.get_arghash_value($FILENAME, arghash_$6);
            final SubLObject check_existing = html_arghash.get_arghash_value($CHECK_EXISTING, arghash_$6);
            SubLObject ke_operations = html_arghash.get_arghash_value($KE_OPERATIONS, arghash_$6);
            final SubLObject project = html_arghash.get_arghash_value($PROJECT, arghash_$6);
            remhash($NOT_REDUNDANT, arghash_$6);
            final SubLObject title_var = $str39$KE_Text__Parse_Status;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str41$_meta_http_equiv__X_UA_Compatible);
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
                        html_markup($str46$yui_skin_sam);
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
                            html_princ($str51$Your_KE_Text__from_);
                            html_princ(ket_string_for_source(source, filename));
                            if (NIL == ke_operations) {
                                html_princ($str52$__did_not_parse_into_any_operatio);
                            } else {
                                html_princ($str53$__has_been_successfully_parsed_in);
                            }
                            html_newline(TWO_INTEGER);
                            if ((source == $FILE) && filename.isString()) {
                                html_reload_ke_file_link(filename, user_action_id_string);
                            }
                            if (NIL != ke_operations) {
                                final SubLObject pcase_var = check_existing;
                                if (!pcase_var.eql($CHECK_AND_REMOVE)) {
                                    if (pcase_var.eql($CHECK_AND_SHOW)) {
                                        final SubLObject href = format(NIL, $str54$cg_cb_handle_ke_operations__user_, user_action_id_string);
                                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(href);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($str13$_2);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str55$Remove_Redundant_Asserts_Unassert);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                            }
                                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                        }
                                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        html_newline(UNPROVIDED);
                                    } else {
                                        final SubLObject href = format(NIL, $str56$cg_cb_handle_ke_operations__user_, user_action_id_string);
                                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(href);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($str13$_2);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str57$Check_for_Existing_Assertions_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                            }
                                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                        }
                                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        html_newline(UNPROVIDED);
                                    }
                                }
                                html_newline(UNPROVIDED);
                                final SubLObject href2 = format(NIL, $str58$cg__A__A___method_agenda, user_actions.user_action_handler_fn(user_action), user_action_id_string);
                                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(href2);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    html_markup(html_macros.$html_font_size$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str13$_2);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$Add_Forms_to_Agenda);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                }
                                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                html_newline(TWO_INTEGER);
                                thread.resetMultipleValues();
                                final SubLObject new_killed_renamed_constants = ke_text.ke_operations_new_killed_renamed_merged_constant_names(ke_operations);
                                final SubLObject new_constantsP = thread.secondMultipleValue();
                                final SubLObject killed_constantsP = thread.thirdMultipleValue();
                                final SubLObject renamed_constantsP = thread.fourthMultipleValue();
                                final SubLObject merged_constantsP = thread.fifthMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject string_list = NIL;
                                SubLObject filler_list = NIL;
                                if (NIL != merged_constantsP) {
                                    string_list = cons($$$merged, string_list);
                                }
                                if (NIL != renamed_constantsP) {
                                    string_list = cons($$$renamed, string_list);
                                }
                                if (NIL != killed_constantsP) {
                                    string_list = cons($$$killed, string_list);
                                }
                                if (NIL != new_constantsP) {
                                    string_list = cons($$$created, string_list);
                                }
                                final SubLObject pcase_var2 = length(string_list);
                                if (pcase_var2.eql(TWO_INTEGER)) {
                                    filler_list = $list64;
                                } else
                                    if (pcase_var2.eql(THREE_INTEGER)) {
                                        filler_list = $list65;
                                    } else
                                        if (pcase_var2.eql(FOUR_INTEGER)) {
                                            filler_list = $list66;
                                        }


                                if (NIL != string_list) {
                                    html_princ($$$The_following_constants_will_be_);
                                    SubLObject string = NIL;
                                    SubLObject string_$17 = NIL;
                                    SubLObject filler = NIL;
                                    SubLObject filler_$18 = NIL;
                                    string = string_list;
                                    string_$17 = string.first();
                                    filler = filler_list;
                                    filler_$18 = filler.first();
                                    while ((NIL != filler) || (NIL != string)) {
                                        if (NIL != string_$17) {
                                            html_princ(string_$17);
                                        }
                                        if (NIL != filler_$18) {
                                            html_princ(filler_$18);
                                        }
                                        string = string.rest();
                                        string_$17 = string.first();
                                        filler = filler.rest();
                                        filler_$18 = filler.first();
                                    } 
                                    html_princ($str68$_);
                                }
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(THREE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject cdolist_list_var = new_killed_renamed_constants;
                                    SubLObject new_killed_renamed_constant = NIL;
                                    new_killed_renamed_constant = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject operation_type = new_killed_renamed_constant.first();
                                        final SubLObject column1 = second(new_killed_renamed_constant);
                                        final SubLObject column2 = third(new_killed_renamed_constant);
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                final SubLObject pcase_var3 = operation_type;
                                                if (pcase_var3.eql($CREATE)) {
                                                    if ((NIL != killed_constantsP) || (NIL != renamed_constantsP)) {
                                                        html_princ($str70$Create__);
                                                    }
                                                } else
                                                    if (pcase_var3.eql($KILL)) {
                                                        html_princ($str72$Kill__);
                                                    } else
                                                        if (pcase_var3.eql($RENAME)) {
                                                            html_princ($str74$Rename__);
                                                        } else
                                                            if (pcase_var3.eql($MERGE)) {
                                                                html_princ($str76$Merge__);
                                                            }



                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != column1) {
                                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                    html_princ(column1);
                                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($CENTER));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                final SubLObject pcase_var3 = operation_type;
                                                if (pcase_var3.eql($RENAME)) {
                                                    html_princ($$$_to_);
                                                } else
                                                    if (pcase_var3.eql($MERGE)) {
                                                        html_princ($$$_onto_);
                                                    }

                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != column2) {
                                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                    html_princ(column2);
                                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        new_killed_renamed_constant = cdolist_list_var.first();
                                    } 
                                    html_newline(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                if (NIL != project) {
                                    html_newline(UNPROVIDED);
                                    html_princ($$$Project_);
                                    cb_form(project, UNPROVIDED, UNPROVIDED);
                                    html_princ($str81$_will_be_used_as_the_KE_purpose_);
                                    html_newline(TWO_INTEGER);
                                }
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
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
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str82$100_);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($str13$_2);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str83$Operations_);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                            }
                                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            final SubLObject existing = ke_operations_existing_assertions(ke_operations);
                                            final SubLObject existing_count = length(existing);
                                            if (NIL != existing) {
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str84$_A_existing_assertion_A, existing_count.isZero() ? $$$no : NIL != number_utilities.onep(existing_count) ? $$$one : existing_count, NIL != number_utilities.onep(existing_count) ? $str87$ : $$$s);
                                                html_indent(UNPROVIDED);
                                                cb_link($KET_ADD_TO_HISTORY, user_action_id_string, $str90$_Add_to_History_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    SubLObject new_ke_operations = NIL;
                                    SubLObject bgcolor = NIL;
                                    SubLObject color_toggle = NIL;
                                    SubLObject list_var = NIL;
                                    SubLObject ke_operation = NIL;
                                    SubLObject ignore_me = NIL;
                                    list_var = ke_operations;
                                    ke_operation = list_var.first();
                                    for (ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , ke_operation = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                        if (NIL != color_toggle) {
                                            color_toggle = NIL;
                                        } else {
                                            color_toggle = T;
                                        }
                                        bgcolor = (NIL != color_toggle) ? $str91$_dddddd : $str92$_cccccc;
                                        final SubLObject operation_displayedP = ket_show_ke_operation_row(ke_operation, bgcolor, check_existing);
                                        if (NIL != operation_displayedP) {
                                            new_ke_operations = cons(ke_operation, new_ke_operations);
                                        }
                                    }
                                    ke_operations = nreverse(new_ke_operations);
                                    html_arghash.set_arghash_value($KE_OPERATIONS, user_actions.user_action_data(user_action), ke_operations);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
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
        }
        return NIL;
    }

    public static SubLObject cb_link_ket_add_to_history(final SubLObject user_action_id_string, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str90$_Add_to_History_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str94$cb_ket_add_to_history__a, user_action_id_string);
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
        return user_action_id_string;
    }

    public static SubLObject ke_operations_existing_assertions(final SubLObject ke_operations) {
        assert NIL != listp(ke_operations) : "Types.listp(ke_operations) " + "CommonSymbols.NIL != Types.listp(ke_operations) " + ke_operations;
        SubLObject assertions = NIL;
        SubLObject cdolist_list_var = ke_operations;
        SubLObject ke_operation = NIL;
        ke_operation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject assertion = ket_check_ke_operation(ke_operation);
            if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                assertions = cons(assertion, assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ke_operation = cdolist_list_var.first();
        } 
        return nreverse(assertions);
    }

    public static SubLObject cb_ket_add_to_history(final SubLObject args) {
        SubLObject user_action_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list97);
        user_action_id_string = args.first();
        final SubLObject current = args.rest();
        if (NIL == current) {
            final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
            final SubLObject arghash = user_actions.user_action_data(user_action);
            final SubLObject ke_operations = html_arghash.get_arghash_value($KE_OPERATIONS, arghash);
            final SubLObject existing_assertions = ke_operations_existing_assertions(ke_operations);
            SubLObject cdolist_list_var = reverse(existing_assertions);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_tools.cb_add_to_history(assertion);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
            return cb_tools.cb_history(UNPROVIDED);
        }
        cdestructuring_bind_error(args, $list97);
        return NIL;
    }

    public static SubLObject cb_do_ke_operations_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        SubLObject user_action_id_string = html_arghash.get_arghash_value($USER_ACTION_ID_STRING, arghash);
        final SubLObject method = html_arghash.get_arghash_value($METHOD, arghash);
        if (NIL == user_action_id_string) {
            user_action_id_string = html_arghash.get_arghash_value($JUST_STRING, arghash);
        }
        final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
        if (NIL == user_actions.user_action_p(user_action)) {
            cyc_navigator_internals.generic_message_page($$$Fatal_Error, format(NIL, $str100$cb_do_ke_operations_handler_calle));
        } else {
            final SubLObject arghash_$30 = user_actions.user_action_data(user_action);
            final SubLObject ke_operations = html_arghash.get_arghash_value($KE_OPERATIONS, arghash_$30);
            final SubLObject project = html_arghash.get_arghash_value($PROJECT, arghash_$30);
            final SubLObject _prev_bind_0 = api_control_vars.$ke_purpose$.currentBinding(thread);
            try {
                api_control_vars.$ke_purpose$.bind(NIL != forts.fort_p(project) ? project : api_control_vars.$ke_purpose$.getDynamicValue(thread), thread);
                final SubLObject pcase_var = method;
                if (pcase_var.eql($AGENDA)) {
                    final SubLObject title_var = $str102$KE_Text__Forms_Added_to_Agenda;
                    final SubLObject _prev_bind_0_$31 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_markup($str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup($str41$_meta_http_equiv__X_UA_Compatible);
                        }
                        html_source_readability_terpri(UNPROVIDED);
                        final SubLObject _prev_bind_0_$32 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                            final SubLObject _prev_bind_0_$33 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                html_markup($str46$yui_skin_sam);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$reloadFrameButton);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
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
                                    SubLObject cdolist_list_var = ke_operations;
                                    SubLObject ke_operation = NIL;
                                    ke_operation = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        ke_text.do_ke_operation(ke_operation, method);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        ke_operation = cdolist_list_var.first();
                                    } 
                                    html_source_readability_terpri(UNPROVIDED);
                                    html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$33, thread);
                            }
                            html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        } finally {
                            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$32, thread);
                        }
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0_$31, thread);
                    }
                    user_actions.delete_user_action(user_action);
                } else
                    if (pcase_var.eql($MAKE_CONSTANTS)) {
                        SubLObject cdolist_list_var2 = ke_operations;
                        SubLObject ke_operation2 = NIL;
                        ke_operation2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            if ($CREATE.equal(ke_operation2.first())) {
                                ke_text.do_ke_operation(ke_operation2, $NOW);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            ke_operation2 = cdolist_list_var2.first();
                        } 
                        ket_handle_ke_text_list(arghash_$30);
                    }

            } finally {
                api_control_vars.$ke_purpose$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject cb_handle_ke_operations(final SubLObject args) {
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        ket_handle_ke_operations(arghash);
        return NIL;
    }

    public static SubLObject ket_handle_ke_operations(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user_action_type_key = $DO_KE_OPERATIONS;
        final SubLObject existing_user_action_id_string = html_arghash.get_arghash_value($USER_ACTION_ID_STRING, arghash);
        SubLObject user_action = user_actions.user_action_by_id_string(existing_user_action_id_string);
        if (NIL == user_action) {
            user_action = user_actions.new_user_action(list($CYCLIST, operation_communication.the_cyclist(), $TYPE_KEY, user_action_type_key));
        }
        if (NIL == user_actions.user_action_p(user_action)) {
            Errors.error($str109$ket_handle_ke_operations__Could_n);
        }
        user_actions._csetf_user_action_creation_time(user_action, get_universal_time());
        if (!user_actions.user_action_data(user_action).isHashtable()) {
            user_actions._csetf_user_action_data(user_action, make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        }
        html_arghash.set_arghash_value($USER_ACTION_ID_STRING, user_actions.user_action_data(user_action), user_actions.user_action_id_string(user_action));
        SubLObject k = NIL;
        SubLObject v = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(arghash);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                k = getEntryKey(cdohash_entry);
                v = getEntryValue(cdohash_entry);
                if (NIL != subl_promotions.memberP(k, $ket_do_ke_operations_data_keywords$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    html_arghash.set_arghash_value_list(k, user_actions.user_action_data(user_action), v);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        final SubLObject user_action_id_string = user_actions.user_action_id_string(user_action);
        final SubLObject user_action_display_fn = user_actions.user_action_display_fn(user_action);
        if (NIL != user_action_display_fn) {
            funcall(user_action_display_fn, list(user_action_id_string));
        } else {
            Errors.error($str111$User_action__do_ke_operations_not);
        }
        return NIL;
    }

    public static SubLObject ket_html_error_table(final SubLObject error_lists, SubLObject arghash) {
        if (arghash == UNPROVIDED) {
            arghash = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str112$KE_Text__Errors_Found;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str41$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$36 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$37 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str46$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
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
                        html_princ($str113$Some_errors_were_found_parsing_yo);
                        html_newline(TWO_INTEGER);
                        if (NIL != arghash) {
                            final SubLObject filename = html_arghash.get_arghash_value($FILENAME, arghash);
                            if (NIL != filename) {
                                html_reload_ke_file_link(filename, UNPROVIDED);
                            }
                        }
                        html_newline(UNPROVIDED);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_width$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str82$100_);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject bgcolor = NIL;
                            SubLObject color_toggle = NIL;
                            SubLObject list_var = NIL;
                            SubLObject error_list = NIL;
                            SubLObject ignore_me = NIL;
                            list_var = error_lists;
                            error_list = list_var.first();
                            for (ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , error_list = list_var.first() , ignore_me = add(ONE_INTEGER, ignore_me)) {
                                if (NIL != color_toggle) {
                                    color_toggle = NIL;
                                } else {
                                    color_toggle = T;
                                }
                                bgcolor = (NIL != color_toggle) ? $str91$_dddddd : $str92$_cccccc;
                                final SubLObject error_file = error_list.first();
                                final SubLObject error_line_number_start = second(error_list);
                                final SubLObject error_line_number_end = third(error_list);
                                final SubLObject error_string = fourth(error_list);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                if (NIL != bgcolor) {
                                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(bgcolor);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str115$1_);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != error_file) {
                                            html_princ(error_file);
                                        }
                                        html_princ($str68$_);
                                        if (NIL != error_line_number_start) {
                                            html_princ(error_line_number_start);
                                        }
                                        if (!error_line_number_start.eql(error_line_number_end)) {
                                            html_princ($str116$_);
                                            if (NIL != error_line_number_end) {
                                                html_princ(error_line_number_end);
                                            }
                                        }
                                        html_princ($str68$_);
                                        html_glyph($NBSP, ONE_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(error_string);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        html_princ($$$Looking_over_the_);
                        final SubLObject href = cconcatenate(system_parameters.$cyc_documentation_url$.getDynamicValue(thread), $str119$ref_ke_file_html);
                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(href);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($$$KE_Text_specification);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                        }
                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_princ($str121$_may_also_help_);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$37, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$36, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject ket_handle_ke_text_list(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filename = html_arghash.get_arghash_value($FILENAME, arghash);
        final SubLObject ke_text_list = html_arghash.get_arghash_value($KE_TEXT_LIST, arghash);
        thread.resetMultipleValues();
        final SubLObject ke_operations = ke_text.ke_text_list_to_ke_operations(ke_text_list, filename, UNPROVIDED, UNPROVIDED);
        final SubLObject error_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != error_lists) {
            ket_html_error_table(error_lists, arghash);
        } else {
            html_arghash.set_arghash_value($KE_OPERATIONS, arghash, ke_operations);
            ket_handle_ke_operations(arghash);
        }
        return NIL;
    }

    public static SubLObject cb_handle_ke_text_file(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        final SubLObject content = html_arghash.get_arghash_value($CONTENT, arghash);
        final SubLObject filename = html_arghash.get_arghash_value($FILENAME, arghash);
        SubLObject error_lists = NIL;
        SubLObject ke_text_list = NIL;
        if (NIL != content) {
            thread.resetMultipleValues();
            final SubLObject good_ke = ke_text.ke_text_to_ke_text_list(content, filename);
            final SubLObject bad_ke = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ke_text_list = good_ke;
            error_lists = bad_ke;
        } else {
            thread.resetMultipleValues();
            final SubLObject good_ke = ke_text.ke_text_file_to_ke_text_list(filename);
            final SubLObject bad_ke = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ke_text_list = good_ke;
            error_lists = bad_ke;
        }
        if (NIL != error_lists) {
            ket_html_error_table(error_lists, arghash);
        } else {
            html_arghash.set_arghash_value($SOURCE, arghash, $FILE);
            html_arghash.set_arghash_value($KE_TEXT_LIST, arghash, ke_text_list);
            ket_handle_ke_text_list(arghash);
        }
        return NIL;
    }

    public static SubLObject cb_handle_ke_text_compose(final SubLObject args) {
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        final SubLObject text = html_arghash.get_arghash_value($KE_TEXT, arghash);
        final SubLObject ke_text_list = string_utilities.string_tokenize(text, list(Strings.make_string(ONE_INTEGER, CHAR_newline)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_arghash.set_arghash_value($SOURCE, arghash, $COMPOSE);
        html_arghash.set_arghash_value($KE_TEXT_LIST, arghash, ke_text_list);
        ket_handle_ke_text_list(arghash);
        return NIL;
    }

    public static SubLObject declare_cb_ke_text_file() {
        declareFunction(me, "ket_string_for_source", "KET-STRING-FOR-SOURCE", 1, 1, false);
        declareFunction(me, "ket_check_ke_operation", "KET-CHECK-KE-OPERATION", 1, 0, false);
        declareFunction(me, "html_reload_ke_file_link", "HTML-RELOAD-KE-FILE-LINK", 1, 1, false);
        declareFunction(me, "do_ke_operations_summary", "DO-KE-OPERATIONS-SUMMARY", 1, 0, false);
        declareFunction(me, "new_ke_text_constant_applicability_test", "NEW-KE-TEXT-CONSTANT-APPLICABILITY-TEST", 1, 0, false);
        declareFunction(me, "new_ke_text_constant_html_output_fn", "NEW-KE-TEXT-CONSTANT-HTML-OUTPUT-FN", 3, 0, false);
        declareFunction(me, "ket_show_ke_operation_row", "KET-SHOW-KE-OPERATION-ROW", 1, 2, false);
        declareFunction(me, "cb_do_ke_operations_display", "CB-DO-KE-OPERATIONS-DISPLAY", 1, 0, false);
        declareFunction(me, "cb_do_ke_operations_display_internal", "CB-DO-KE-OPERATIONS-DISPLAY-INTERNAL", 1, 0, false);
        declareFunction(me, "cb_link_ket_add_to_history", "CB-LINK-KET-ADD-TO-HISTORY", 1, 1, false);
        declareFunction(me, "ke_operations_existing_assertions", "KE-OPERATIONS-EXISTING-ASSERTIONS", 1, 0, false);
        declareFunction(me, "cb_ket_add_to_history", "CB-KET-ADD-TO-HISTORY", 1, 0, false);
        declareFunction(me, "cb_do_ke_operations_handler", "CB-DO-KE-OPERATIONS-HANDLER", 1, 0, false);
        declareFunction(me, "cb_handle_ke_operations", "CB-HANDLE-KE-OPERATIONS", 1, 0, false);
        declareFunction(me, "ket_handle_ke_operations", "KET-HANDLE-KE-OPERATIONS", 1, 0, false);
        declareFunction(me, "ket_html_error_table", "KET-HTML-ERROR-TABLE", 1, 1, false);
        declareFunction(me, "ket_handle_ke_text_list", "KET-HANDLE-KE-TEXT-LIST", 1, 0, false);
        declareFunction(me, "cb_handle_ke_text_file", "CB-HANDLE-KE-TEXT-FILE", 1, 0, false);
        declareFunction(me, "cb_handle_ke_text_compose", "CB-HANDLE-KE-TEXT-COMPOSE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_ke_text_file() {
        defparameter("*KET-DO-KE-OPERATIONS-DATA-KEYWORDS*", $list2);
        defparameter("*CB-KE-TEXT-DEFAULT-CB-FORM-CONS-METHOD-KEYWORDS*", $list22);
        return NIL;
    }

    public static SubLObject setup_cb_ke_text_file() {
        final SubLObject new_action_type = user_actions.make_action_type($list0);
        user_actions._csetf_action_type_key(new_action_type, $DO_KE_OPERATIONS);
        sethash(user_actions.action_type_key(new_action_type), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type);
        register_cb_form_cons_method(NEW_KE_TEXT_CONSTANT, $list21);
        html_macros.note_cgi_handler_function(CB_DO_KE_OPERATIONS_DISPLAY, $HTML_HANDLER);
        setup_cb_link_method($KET_ADD_TO_HISTORY, CB_LINK_KET_ADD_TO_HISTORY, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_KET_ADD_TO_HISTORY, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_DO_KE_OPERATIONS_HANDLER, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_KE_OPERATIONS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_KE_TEXT_FILE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_KE_TEXT_COMPOSE, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_ke_text_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_ke_text_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_ke_text_file();
    }

    
}

/**
 * Total time: 969 ms
 */
