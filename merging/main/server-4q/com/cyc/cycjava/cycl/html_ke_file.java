/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_wrap_interactor$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_list_selector;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_help_definitions$;
import static com.cyc.cycjava.cycl.html_utilities.generate_html_filename_input_fieldname;
import static com.cyc.cycjava.cycl.html_utilities.html_arguments_contain_multipart_form_dataP;
import static com.cyc.cycjava.cycl.html_utilities.html_br;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_filename_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_prin1;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_doc_string;
import static com.cyc.cycjava.cycl.html_utilities.html_radio_input;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      HTML-KE-FILE
 * source file: /cyc/top/cycl/html-ke-file.lisp
 * created:     2019/07/03 17:38:12
 */
public final class html_ke_file extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt17$ = makeString("");

    public static final SubLFile me = new html_ke_file();

 public static final String myName = "com.cyc.cycjava.cycl.html_ke_file";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $remove_non_printing_characters$ = makeSymbol("*REMOVE-NON-PRINTING-CHARACTERS*");

    public static final SubLSymbol $check_for_existing_assertions$ = makeSymbol("*CHECK-FOR-EXISTING-ASSERTIONS*");

    private static final SubLSymbol $KE_NAME_FILE = makeKeyword("KE-NAME-FILE");

    static private final SubLString $str3$ke_name_file_html = makeString("ke-name-file.html");

    static private final SubLString $$$KE_File = makeString("KE File");

    static private final SubLString $$$Load_a_KE_File = makeString("Load a KE File");

    private static final SubLString $str6$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str7$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str12$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str18$handle_ke_file_input = makeString("handle-ke-file-input");

    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $$$Load_File = makeString("Load File");

    private static final SubLString $str23$eval_ke_text = makeString("eval-ke-text");

    private static final SubLString $str24$Project__ = makeString("Project: ");

    private static final SubLString $$$project = makeString("project");

    private static final SubLString $$$No_project_selected = makeString("No project selected");

    private static final SubLString $str27$Type_in_pathname_of_the_file_to_l = makeString("Type in pathname of the file to load:");

    private static final SubLString $str28$pathname_radio = makeString("pathname-radio");

    private static final SubLString $str29$ = makeString("");

    private static final SubLString $$$pathname = makeString("pathname");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $str32$And_select_any_options_ = makeString("And select any options:");

    private static final SubLString $$$remove = makeString("remove");

    private static final SubLString $str34$_Remove_non_printing_characters_i = makeString(" Remove non-printing characters in strings");

    private static final SubLString $$$check = makeString("check");

    private static final SubLString $$$_Check_for_existing_assertions = makeString(" Check for existing assertions");

    private static final SubLSymbol KE_NAME_FILE = makeSymbol("KE-NAME-FILE");

    private static final SubLString $str40$ke_compose_html = makeString("ke-compose.html");

    private static final SubLString $$$Compose_KE_Text_Expressions = makeString("Compose KE Text Expressions");

    private static final SubLString $str42$handle_compose_input = makeString("handle-compose-input");

    private static final SubLString $$$Cancel_Compose = makeString("Cancel Compose");

    private static final SubLString $$$Eval = makeString("Eval");

    private static final SubLString $str45$Type_KE_text_below___ = makeString("Type KE text below.  ");

    private static final SubLString $str46$Include_a_period_after_each_expre = makeString("Include a period after each expression.");

    private static final SubLString $str47$compose_text = makeString("compose-text");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLInteger $int$80 = makeInteger(80);



    private static final SubLString $$$virtual = makeString("virtual");

    private static final SubLSymbol KE_COMPOSE = makeSymbol("KE-COMPOSE");

    private static final SubLString $str55$use_old_ke_text = makeString("use-old-ke-text");

    private static final SubLString $str56$Content_is_in_the_arguments____co = makeString("Content is in the arguments -- contents of ~A in the HTML message.");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $str58$_filename = makeString(":filename");

    private static final SubLString $str59$_content = makeString(":content");

    private static final SubLString $str60$__check_existing = makeString(":?check-existing");

    private static final SubLString $str61$check_and_show = makeString("check-and-show");

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLString $str63$__project = makeString(":$project");

    private static final SubLString $$$File_Access_Problem = makeString("File Access Problem");

    private static final SubLString $str65$The_file__s_does_not_exist__or_ca = makeString("The file ~s does not exist, or cannot be accessed.");

    private static final SubLString $str66$The_file__A_cannot_be_found____A_ = makeString("The file ~A cannot be found. (~A)");

    private static final SubLString $str68$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$Pathname_Input_Problem = makeString("Pathname Input Problem");

    private static final SubLString $str70$Please_try_again__typing_a_non_em = makeString("Please try again, typing a non-empty string.  ~s is not a valid input.");

    private static final SubLSymbol HANDLE_KE_FILE_INPUT = makeSymbol("HANDLE-KE-FILE-INPUT");

    private static final SubLSymbol FROB_COMMENTS = makeSymbol("FROB-COMMENTS");

    private static final SubLSymbol $sym73$NON_LINE_BREAK_CHAR_ = makeSymbol("NON-LINE-BREAK-CHAR?");

    private static final SubLString $str74$_ke_text = makeString(":ke-text");

    private static final SubLSymbol HANDLE_COMPOSE_INPUT = makeSymbol("HANDLE-COMPOSE-INPUT");

    private static final SubLSymbol $OK_TOKEN_FORMS = makeKeyword("OK-TOKEN-FORMS");

    private static final SubLString $str78$Please_check_the_input_for_missin = makeString("Please check the input for missing parens, periods, etc.  These token lists are malformed:");

    private static final SubLString $$$File_Error = makeString("File Error");

    private static final SubLString $str83$Problem_loading_file__s___The_fil = makeString("Problem loading file ~s.  The file contains fatal syntax errors, or cannot be located by the pathname given.");

    private static final SubLString $$$Input_Error = makeString("Input Error");

    private static final SubLString $str85$The_input_text_contains_fatal_syn = makeString("The input text contains fatal syntax errors, or has unanticipated syntactic forms.");

    private static final SubLSymbol KE_SIGNAL_INPUT_ERROR_2 = makeSymbol("KE-SIGNAL-INPUT-ERROR-2");

    private static final SubLString $$$Unknown_Constants = makeString("Unknown Constants");

    private static final SubLString $str88$Make_Cyc_constants_of_the_followi = makeString("Make Cyc constants of the following strings?");

    private static final SubLString $str89$If_so__be_sure_that_you_have_spec = makeString("If so, be sure that you have specified an #$isa for each new constant,\na #$genls for each new collection, and a #$genlMt for each new microtheory.");

    private static final SubLSymbol KE_UNKNOWNS_ALERT = makeSymbol("KE-UNKNOWNS-ALERT");

    private static final SubLString $$$Waiting_for_Constant_Creations = makeString("Waiting for Constant Creations");

    private static final SubLString $str93$Waiting_for_constant_creations_to = makeString("Waiting for constant creations to be processed ....");

    private static final SubLString $$$There_are_ = makeString("There are ");

    private static final SubLString $str95$_operations_still_to_be_processed = makeString(" operations still to be processed in the local queue.");

    private static final SubLString $$$Click_ = makeString("Click ");

    private static final SubLSymbol $CHECK_AND_POLL = makeKeyword("CHECK-AND-POLL");

    private static final SubLString $str98$_to_proceed_when_you_think_you_ve = makeString(" to proceed when you think you've waited long enough, or attend to the Cyc Agenda if there seems to be a problem.");

    private static final SubLSymbol KE_CHECK_AND_POLL = makeSymbol("KE-CHECK-AND-POLL");

    private static final SubLSymbol KE_CONSTANTIFY = makeSymbol("KE-CONSTANTIFY");

    private static final SubLString $str101$There_is_a_problem_that_may_requi = makeString("There is a problem that may require debugging.  Some expressions cannot be coerced into CycL.  Some of these token lists may be malformed:");

    private static final SubLString $$$Possibly_Malformed_Token_Lists = makeString("Possibly Malformed Token Lists");

    private static final SubLString $str103$_s = makeString("~s");

    private static final SubLString $$$_in_ = makeString(" in ");

    private static final SubLString $$$_is_not_in_ = makeString(" is not in ");

    private static final SubLString $str106$_a_form_a_to_evaluate_ = makeString("~a form~a to evaluate:");

    private static final SubLString $$$One = makeString("One");

    private static final SubLString $str108$__a = makeString(" ~a");

    private static final SubLString $$$s = makeString("s");

    private static final SubLString $str112$Evaluate_the_a_form_a_below = makeString("Evaluate the~a form~a below");

    private static final SubLString $str113$Evaluate_the_a_form_a_above = makeString("Evaluate the~a form~a above");

    private static final SubLSymbol $FORMS_TO_EVAL = makeKeyword("FORMS-TO-EVAL");

    private static final SubLSymbol $ALREADY_IN_KB = makeKeyword("ALREADY-IN-KB");

    private static final SubLSymbol $NOT_IN_KB = makeKeyword("NOT-IN-KB");

    private static final SubLSymbol $NOT_VALID_CONSTANTS = makeKeyword("NOT-VALID-CONSTANTS");

    private static final SubLString $$$Check_Forms_to_Eval = makeString("Check Forms to Eval");

    private static final SubLString $str120$Apparently_you_have_specified_no_ = makeString("Apparently you have specified no new assertions.");

    private static final SubLString $str121$These_assertions_are_already_in_t = makeString("These assertions are already in the KB for the Cyc image ~a:");

    private static final SubLString $str122$These_assertions_are_not_in_the_K = makeString("These assertions are not in the KB for the Cyc image ~a.  They cannot be deleted:");

    private static final SubLString $str123$These_strings_are_not_names_of_va = makeString("These strings are not names of valid constants.  They cannot be killed:");

    private static final SubLString $str124$These_strings_are_already_the_nam = makeString("These strings are already the names of constants.  They cannot be used for renaming:");

    private static final SubLString $str125$State_has_been_cleared___There_ar = makeString("State has been cleared.  There are no forms to evaluate.");

    private static final SubLString $str126$_a_form_a_ha_a_been_evaluated_ = makeString("~a form~a ha~a been evaluated.");

    private static final SubLString $$$ve = makeString("ve");

    private static final SubLString $str128$State_has_been_cleared___No_forms = makeString("State has been cleared.  No forms have been evaluated.");

    private static final SubLString $$$KE_Evaluation_Notification = makeString("KE Evaluation Notification");

    private static final SubLSymbol KE_EVAL = makeSymbol("KE-EVAL");

    public static final SubLObject ke_name_file_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$KE_File);
            } else {
                {
                    SubLObject title_var = $$$Load_a_KE_File;
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                        try {
                            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            cb_head_shortcut_icon();
                            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                            if (NIL != title_var) {
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_princ(title_var);
                                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            }
                            html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str_alt8$yui_skin_sam);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != title_var) {
                                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_markup(TWO_INTEGER);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                html_princ(title_var);
                                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_markup(TWO_INTEGER);
                                                html_char(CHAR_greater, UNPROVIDED);
                                            }
                                            {
                                                SubLObject frame_name_var = cb_frame_name(NIL);
                                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != frame_name_var) {
                                                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(frame_name_var);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_hidden_input($str_alt9$handle_ke_file_input, T, UNPROVIDED);
                                                        cb_help_preamble($KE_NAME_FILE, NIL, UNPROVIDED);
                                                        cb_back_button($SELF, $$$Back);
                                                        html_newline(TWO_INTEGER);
                                                        html_reset_input($$$Clear);
                                                        html_indent(TWO_INTEGER);
                                                        html_submit_input($$$Load_File, $str_alt14$eval_ke_text, UNPROVIDED);
                                                        html_newline(TWO_INTEGER);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt15$Type_in_pathname_of_the_file_to_l);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_newline(UNPROVIDED);
                                                        html_indent(FIVE_INTEGER);
                                                        html_radio_input($str_alt16$pathname_radio, $str_alt17$, T);
                                                        html_indent(UNPROVIDED);
                                                        html_filename_input($$$pathname, $str_alt17$, $int$60);
                                                        html_newline(UNPROVIDED);
                                                        {
                                                            SubLObject ke_file_list = NIL;
                                                            SubLObject user_name = Environment.get_user_name(UNPROVIDED);
                                                            SubLObject directory_name = format(NIL, $str_alt20$_home__A_ke_, user_name);
                                                            if (NIL != Filesys.probe_file(directory_name)) {
                                                                {
                                                                    SubLObject cdolist_list_var = nreverse(Sort.sort(Filesys.directory(directory_name, T), symbol_function($sym23$STRING_), UNPROVIDED));
                                                                    SubLObject filename = NIL;
                                                                    for (filename = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , filename = cdolist_list_var.first()) {
                                                                        if ((NIL != string_utilities.ends_with(filename, $str_alt21$_ke, UNPROVIDED)) && (NIL == string_utilities.starts_with(filename, $str_alt22$_))) {
                                                                            ke_file_list = cons(filename, ke_file_list);
                                                                        }
                                                                    }
                                                                }
                                                                if (NIL != ke_file_list) {
                                                                    html_br();
                                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                    html_princ($str_alt24$Or_select_a_file_in_your___ke_dir);
                                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                    html_newline(UNPROVIDED);
                                                                    {
                                                                        SubLObject cdolist_list_var = ke_file_list;
                                                                        SubLObject v_ke_file = NIL;
                                                                        for (v_ke_file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_ke_file = cdolist_list_var.first()) {
                                                                            html_indent(FIVE_INTEGER);
                                                                            html_radio_input($str_alt16$pathname_radio, v_ke_file, UNPROVIDED);
                                                                            html_indent(UNPROVIDED);
                                                                            html_princ(string_utilities.pre_remove(v_ke_file, directory_name, UNPROVIDED));
                                                                            html_newline(UNPROVIDED);
                                                                        }
                                                                    }
                                                                    html_br();
                                                                }
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt25$And_select_any_options_);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_newline(UNPROVIDED);
                                                        html_indent(FIVE_INTEGER);
                                                        html_checkbox_input($$$remove, $$$remove, $remove_non_printing_characters$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt27$_Remove_non_printing_characters_i);
                                                        html_newline(UNPROVIDED);
                                                        html_indent(FIVE_INTEGER);
                                                        html_checkbox_input($$$check, $$$check, $check_for_existing_assertions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt29$_Check_for_existing_assertions);
                                                        html_newline(TWO_INTEGER);
                                                        html_reset_input($$$Clear);
                                                        html_indent(TWO_INTEGER);
                                                        html_submit_input($$$Load_File, $str_alt14$eval_ke_text, UNPROVIDED);
                                                        html_newline(TWO_INTEGER);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
                                            html_source_readability_terpri(UNPROVIDED);
                                            html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject ke_name_file(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$KE_File);
        } else {
            final SubLObject title_var = $$$Load_a_KE_File;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str7$_meta_http_equiv__X_UA_Compatible);
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
                        html_markup($str12$yui_skin_sam);
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
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str18$handle_ke_file_input, T, UNPROVIDED);
                                cb_help_preamble($KE_NAME_FILE, NIL, UNPROVIDED);
                                cb_back_button($SELF, $$$Back);
                                html_newline(TWO_INTEGER);
                                html_reset_input($$$Clear);
                                html_indent(TWO_INTEGER);
                                html_submit_input($$$Load_File, $str23$eval_ke_text, UNPROVIDED);
                                final SubLObject projects = kb_utilities.sort_terms(cb_system_tools.ongoing_cyc_projects(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != projects) {
                                    html_newline(TWO_INTEGER);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str24$Project__);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    cb_fort_list_selector($$$project, projects, NIL != api_control_vars.$ke_purpose$.getDynamicValue(thread) ? api_control_vars.$ke_purpose$.getDynamicValue(thread) : NIL, ONE_INTEGER, symbol_function(IDENTITY), T, $$$No_project_selected);
                                }
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str27$Type_in_pathname_of_the_file_to_l);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_indent(FIVE_INTEGER);
                                html_radio_input($str28$pathname_radio, $str29$, T, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_filename_input($$$pathname, $str29$, $int$60);
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str32$And_select_any_options_);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_indent(FIVE_INTEGER);
                                html_checkbox_input($$$remove, $$$remove, $remove_non_printing_characters$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str34$_Remove_non_printing_characters_i);
                                html_newline(UNPROVIDED);
                                html_indent(FIVE_INTEGER);
                                html_checkbox_input($$$check, $$$check, $check_for_existing_assertions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $$$_Check_for_existing_assertions);
                                html_newline(TWO_INTEGER);
                                html_reset_input($$$Clear);
                                html_indent(TWO_INTEGER);
                                html_submit_input($$$Load_File, $str23$eval_ke_text, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
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
        }
        return NIL;
    }

    public static final SubLObject ke_compose_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$KE_File);
            } else {
                {
                    SubLObject title_var = $$$Compose_KE_Text_Expressions;
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                        try {
                            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                            html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            cb_head_shortcut_icon();
                            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                            if (NIL != title_var) {
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_title_head$.getGlobalValue());
                                html_princ(title_var);
                                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            }
                            html_complete.html_complete_script();
                            html_complete.html_autocomplete_css();
                            html_complete.html_autocomplete_scripts();
                            html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                try {
                                    html_macros.$html_inside_bodyP$.bind(T, thread);
                                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str_alt8$yui_skin_sam);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != title_var) {
                                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_markup(TWO_INTEGER);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                html_princ(title_var);
                                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_markup(TWO_INTEGER);
                                                html_char(CHAR_greater, UNPROVIDED);
                                            }
                                            {
                                                SubLObject frame_name_var = cb_frame_name(NIL);
                                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (NIL != frame_name_var) {
                                                    html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(frame_name_var);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        html_hidden_input($str_alt34$handle_compose_input, T, UNPROVIDED);
                                                        cb_help_preamble($KE_COMPOSE, NIL, UNPROVIDED);
                                                        cb_back_button($SELF, $$$Cancel_Compose);
                                                        html_indent(TWO_INTEGER);
                                                        html_submit_input($$$Eval, $str_alt14$eval_ke_text, UNPROVIDED);
                                                        html_newline(TWO_INTEGER);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt37$Type_KE_text_below___);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                                                        html_princ($str_alt38$Include_a_period_after_each_expre);
                                                        html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                                                        html_newline(UNPROVIDED);
                                                        html_newline(UNPROVIDED);
                                                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                        if (true) {
                                                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup(ZERO_INTEGER);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                        }
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_reset_input($$$Clear);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_complete.html_complete_button($str_alt39$compose_text, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_indent(FIVE_INTEGER);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                html_checkbox_input($$$remove, $$$remove, $remove_non_printing_characters$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt27$_Remove_non_printing_characters_i);
                                                                                html_newline(UNPROVIDED);
                                                                                html_checkbox_input($$$check, $$$check, $check_for_existing_assertions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt29$_Check_for_existing_assertions);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                        if (NIL != $cb_wrap_interactor$.getDynamicValue(thread)) {
                                                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup($str_alt39$compose_text);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            if (true) {
                                                                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup($int$80);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup($int$30);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup($$$virtual);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                        } else {
                                                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            html_markup($str_alt39$compose_text);
                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                            if (true) {
                                                                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup($int$80);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            if (true) {
                                                                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup($int$30);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                        }
                                                        html_newline(UNPROVIDED);
                                                        html_newline(UNPROVIDED);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            }
                                            html_source_readability_terpri(UNPROVIDED);
                                            html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                            html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject ke_compose(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$KE_File);
        } else {
            final SubLObject title_var = $$$Compose_KE_Text_Expressions;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str7$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str12$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
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
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str42$handle_compose_input, T, UNPROVIDED);
                                cb_help_preamble($KE_COMPOSE, NIL, UNPROVIDED);
                                cb_back_button($SELF, $$$Cancel_Compose);
                                html_indent(TWO_INTEGER);
                                html_submit_input($$$Eval, $str23$eval_ke_text, UNPROVIDED);
                                final SubLObject projects = kb_utilities.sort_terms(cb_system_tools.ongoing_cyc_projects(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != projects) {
                                    html_newline(TWO_INTEGER);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str24$Project__);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    cb_fort_list_selector($$$project, projects, NIL != api_control_vars.$ke_purpose$.getDynamicValue(thread) ? api_control_vars.$ke_purpose$.getDynamicValue(thread) : NIL, ONE_INTEGER, symbol_function(IDENTITY), T, $$$No_project_selected);
                                }
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str45$Type_KE_text_below___);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                                html_princ($str46$Include_a_period_after_each_expre);
                                html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_reset_input($$$Clear);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_complete.html_complete_button($str47$compose_text, $$$Complete, NIL, NIL, NIL, NIL, cb_form_widgets.$legacy_sentence_editor_class$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_indent(FIVE_INTEGER);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_checkbox_input($$$remove, $$$remove, $remove_non_printing_characters$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str34$_Remove_non_printing_characters_i);
                                            html_newline(UNPROVIDED);
                                            html_checkbox_input($$$check, $$$check, $check_for_existing_assertions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $$$_Check_for_existing_assertions);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                if (NIL != $cb_wrap_interactor$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                    html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str47$compose_text);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($int$80);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($int$30);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$virtual);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != cb_form_widgets.$ke_text_code_editor_textarea_class$.getGlobalValue()) {
                                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(cb_form_widgets.$ke_text_code_editor_textarea_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                    }
                                    html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                } else {
                                    html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                    html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str47$compose_text);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($int$80);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($int$30);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != cb_form_widgets.$ke_text_code_editor_textarea_class$.getGlobalValue()) {
                                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(cb_form_widgets.$ke_text_code_editor_textarea_class$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                    }
                                    html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                }
                                html_newline(UNPROVIDED);
                                html_newline(UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_script_utilities.html_ke_text_editor_enable_editors();
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$6, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject init_ke_state_alt() {
        if (ke_utilities.ke_value(operation_communication.the_cyclist(), $APPLICATION).equal($ALAKU)) {
            ke_file.blast_ke_state();
        }
        return ke_file.ke_init(operation_communication.the_cyclist());
    }

    public static SubLObject init_ke_state() {
        if (ke_utilities.ke_value(operation_communication.the_cyclist(), $APPLICATION).equal($ALAKU)) {
            ke_file.blast_ke_state();
        }
        return ke_file.ke_init(operation_communication.the_cyclist());
    }

    public static final SubLObject handle_ke_file_input_alt(SubLObject args) {
        com.cyc.cycjava.cycl.html_ke_file.init_ke_state();
        {
            SubLObject pathname_field = $$$pathname;
            SubLObject pathname = string_utilities.trim_whitespace(html_extract_input(pathname_field, args));
            SubLObject pathname_radio = html_extract_input($str_alt16$pathname_radio, args);
            SubLObject remove = html_extract_input($$$remove, args);
            SubLObject check = html_extract_input($$$check, args);
            SubLObject content_in_argsP = html_arguments_contain_multipart_form_dataP(args);
            SubLObject potential_content = html_extract_input(generate_html_filename_input_fieldname(pathname_field), args);
            SubLObject use_new_ke_textP = sublisp_null(html_extract_input($str_alt47$use_old_ke_text, args));
            if (NIL != string_utilities.non_empty_stringP(pathname_radio)) {
                pathname = pathname_radio;
            }
            if (NIL != use_new_ke_textP) {
                if (NIL != content_in_argsP) {
                    Errors.warn($str_alt48$Content_is_in_the_arguments____co, pathname);
                    cb_ke_text.cb_handle_ke_text_file(list($$$t, list($str_alt50$_filename, pathname), list($str_alt51$_content, potential_content), list($str_alt52$__check_existing, NIL != check ? ((SubLObject) ($str_alt53$check_and_show)) : $$$nil)));
                } else {
                    if (NIL != string_utilities.null_stringP(pathname)) {
                        cyc_navigator_internals.generic_message_page($$$File_Access_Problem, format(NIL, $str_alt56$The_file__s_does_not_exist__or_ca, pathname));
                    } else {
                        if (NIL == Filesys.probe_file(pathname)) {
                            cyc_navigator_internals.generic_message_page($$$File_Access_Problem, format(NIL, $str_alt57$The_file__A_cannot_be_probed____A, pathname, file_utilities.why_not_probe_fileP(pathname)));
                        } else {
                            cb_ke_text.cb_handle_ke_text_file(list($$$t, list($str_alt50$_filename, pathname), list($str_alt52$__check_existing, NIL != check ? ((SubLObject) ($str_alt53$check_and_show)) : $$$nil)));
                        }
                    }
                }
            } else {
                if ((NIL != string_utilities.non_empty_stringP(pathname)) && (NIL != Filesys.probe_file(pathname))) {
                    $remove_non_printing_characters$.setDynamicValue(equalp(remove, $$$remove));
                    $check_for_existing_assertions$.setDynamicValue(equalp(check, $$$check));
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(pathname, $INPUT, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt59$Unable_to_open__S, pathname);
                            }
                            {
                                SubLObject str = stream;
                                ke_file.tokenize_read(str, UNPROVIDED);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                    com.cyc.cycjava.cycl.html_ke_file.ke_check_and_maybe_cyclify(pathname);
                } else {
                    if (NIL != string_utilities.non_empty_stringP(pathname)) {
                        cyc_navigator_internals.generic_message_page($$$File_Access_Problem, format(NIL, $str_alt56$The_file__s_does_not_exist__or_ca, pathname));
                    } else {
                        cyc_navigator_internals.generic_message_page($$$Pathname_Input_Problem, format(NIL, $str_alt61$Please_try_again__typing_a_non_em, pathname));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject handle_ke_file_input(final SubLObject args) {
        init_ke_state();
        final SubLObject pathname_field = $$$pathname;
        SubLObject pathname = string_utilities.trim_whitespace(html_extract_input(pathname_field, args));
        final SubLObject pathname_radio = html_extract_input($str28$pathname_radio, args);
        final SubLObject remove = html_extract_input($$$remove, args);
        final SubLObject check = html_extract_input($$$check, args);
        final SubLObject project = html_extract_input($$$project, args);
        final SubLObject content_in_argsP = html_arguments_contain_multipart_form_dataP(args);
        final SubLObject potential_content = html_extract_input(generate_html_filename_input_fieldname(pathname_field), args);
        final SubLObject use_new_ke_textP = sublisp_null(html_extract_input($str55$use_old_ke_text, args));
        if (NIL != string_utilities.non_empty_stringP(pathname_radio)) {
            pathname = pathname_radio;
        }
        if (NIL != use_new_ke_textP) {
            if (NIL != content_in_argsP) {
                Errors.warn($str56$Content_is_in_the_arguments____co, pathname);
                cb_ke_text.cb_handle_ke_text_file(list($$$t, list($str58$_filename, pathname), list($str59$_content, potential_content), list($str60$__check_existing, NIL != check ? $str61$check_and_show : $$$nil), list($str63$__project, project)));
            } else
                if (NIL != string_utilities.null_stringP(pathname)) {
                    cyc_navigator_internals.generic_message_page($$$File_Access_Problem, format(NIL, $str65$The_file__s_does_not_exist__or_ca, pathname));
                } else
                    if (NIL == Filesys.probe_file(pathname)) {
                        cyc_navigator_internals.generic_message_page($$$File_Access_Problem, format(NIL, $str66$The_file__A_cannot_be_found____A_, pathname, file_utilities.why_not_probe_fileP(pathname)));
                    } else {
                        cb_ke_text.cb_handle_ke_text_file(list($$$t, list($str58$_filename, pathname), list($str60$__check_existing, NIL != check ? $str61$check_and_show : $$$nil), list($str63$__project, project)));
                    }


        } else
            if ((NIL != string_utilities.non_empty_stringP(pathname)) && (NIL != Filesys.probe_file(pathname))) {
                $remove_non_printing_characters$.setDynamicValue(equalp(remove, $$$remove));
                $check_for_existing_assertions$.setDynamicValue(equalp(check, $$$check));
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(pathname, $INPUT);
                    if (!stream.isStream()) {
                        Errors.error($str68$Unable_to_open__S, pathname);
                    }
                    final SubLObject str = stream;
                    ke_file.tokenize_read(str, UNPROVIDED);
                } finally {
                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
                ke_check_and_maybe_cyclify(pathname);
            } else
                if (NIL != string_utilities.non_empty_stringP(pathname)) {
                    cyc_navigator_internals.generic_message_page($$$File_Access_Problem, format(NIL, $str65$The_file__s_does_not_exist__or_ca, pathname));
                } else {
                    cyc_navigator_internals.generic_message_page($$$Pathname_Input_Problem, format(NIL, $str70$Please_try_again__typing_a_non_em, pathname));
                }


        return NIL;
    }

    public static final SubLObject non_line_break_charP_alt(SubLObject ch) {
        return makeBoolean(NIL == ke_file.lbrP(ch));
    }

    public static SubLObject non_line_break_charP(final SubLObject ch) {
        return makeBoolean(NIL == ke_file.lbrP(ch));
    }

    public static final SubLObject ke_text_handle_comments_alt(SubLObject input_text) {
        return string_utilities.bunge(Mapping.mapcar(symbol_function(FROB_COMMENTS), string_utilities.break_words(input_text, symbol_function($sym64$NON_LINE_BREAK_CHAR_), UNPROVIDED)), UNPROVIDED);
    }

    public static SubLObject ke_text_handle_comments(final SubLObject input_text) {
        return string_utilities.bunge(Mapping.mapcar(symbol_function(FROB_COMMENTS), string_utilities.break_words(input_text, symbol_function($sym73$NON_LINE_BREAK_CHAR_), UNPROVIDED)), UNPROVIDED);
    }

    public static final SubLObject handle_compose_input_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.html_ke_file.init_ke_state();
            {
                SubLObject check = html_extract_input($$$check, args);
                SubLObject compose_text = html_extract_input($str_alt39$compose_text, args);
                SubLObject use_new_ke_textP = sublisp_null(html_extract_input($str_alt47$use_old_ke_text, args));
                if (NIL != use_new_ke_textP) {
                    cb_ke_text.cb_handle_ke_text_compose(list($$$t, list($str_alt65$_ke_text, compose_text), list($str_alt52$__check_existing, NIL != check ? ((SubLObject) ($str_alt53$check_and_show)) : $$$nil)));
                } else {
                    {
                        SubLObject remove = html_extract_input($$$remove, args);
                        SubLObject text = NIL;
                        $remove_non_printing_characters$.setDynamicValue(equalp(remove, $$$remove), thread);
                        $check_for_existing_assertions$.setDynamicValue(equalp(check, $$$check), thread);
                        if (NIL == compose_text) {
                            compose_text = $str_alt17$;
                        }
                        text = com.cyc.cycjava.cycl.html_ke_file.ke_text_handle_comments(compose_text);
                        text = ke_utilities.strip_garbage_chars(text, $remove_non_printing_characters$.getDynamicValue(thread));
                        ke_file.tokenize_read(text, UNPROVIDED);
                        com.cyc.cycjava.cycl.html_ke_file.ke_check_and_maybe_cyclify(UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject handle_compose_input(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        init_ke_state();
        final SubLObject check = html_extract_input($$$check, args);
        final SubLObject project = html_extract_input($$$project, args);
        SubLObject compose_text = html_extract_input($str47$compose_text, args);
        final SubLObject use_new_ke_textP = sublisp_null(html_extract_input($str55$use_old_ke_text, args));
        if (NIL != use_new_ke_textP) {
            cb_ke_text.cb_handle_ke_text_compose(list($$$t, list($str74$_ke_text, compose_text), list($str60$__check_existing, NIL != check ? $str61$check_and_show : $$$nil), list($str63$__project, project)));
        } else {
            final SubLObject remove = html_extract_input($$$remove, args);
            SubLObject text = NIL;
            $remove_non_printing_characters$.setDynamicValue(equalp(remove, $$$remove), thread);
            $check_for_existing_assertions$.setDynamicValue(equalp(check, $$$check), thread);
            if (NIL == compose_text) {
                compose_text = $str29$;
            }
            text = ke_text_handle_comments(compose_text);
            text = ke_utilities.strip_garbage_chars(text, $remove_non_printing_characters$.getDynamicValue(thread));
            ke_file.tokenize_read(text, UNPROVIDED);
            ke_check_and_maybe_cyclify(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject ke_check_and_maybe_cyclify_alt(SubLObject string) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        {
            SubLObject ok = ke_utilities.ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS);
            SubLObject malformed = ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
            if (!((NIL != ok) || (NIL != malformed))) {
                com.cyc.cycjava.cycl.html_ke_file.ke_signal_input_error(string);
            } else {
                if (NIL != malformed) {
                    com.cyc.cycjava.cycl.html_ke_file.ke_problem_alert($str_alt69$Please_check_the_input_for_missin);
                } else {
                    {
                        SubLObject unknowns = ke_file.unknown_constants_among_tokens(ok);
                        ke_utilities.change_ke_value(operation_communication.the_cyclist(), $UNKNOWNS, $REPLACE, unknowns);
                        if ((NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS)) && (NIL != set_difference(ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS), ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_CREATED), symbol_function(EQUALP), UNPROVIDED))) {
                            com.cyc.cycjava.cycl.html_ke_file.ke_unknowns_alert(UNPROVIDED);
                        } else {
                            com.cyc.cycjava.cycl.html_ke_file.ke_cyclify_forms();
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject ke_check_and_maybe_cyclify(SubLObject string) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        final SubLObject ok = ke_utilities.ke_value(operation_communication.the_cyclist(), $OK_TOKEN_FORMS);
        final SubLObject malformed = ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
        if ((NIL == ok) && (NIL == malformed)) {
            ke_signal_input_error(string);
        } else
            if (NIL != malformed) {
                ke_problem_alert($str78$Please_check_the_input_for_missin);
            } else {
                final SubLObject unknowns = ke_file.unknown_constants_among_tokens(ok);
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $UNKNOWNS, $REPLACE, unknowns);
                if ((NIL != ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS)) && (NIL != set_difference(ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS), ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_CREATED), symbol_function(EQUALP), UNPROVIDED))) {
                    ke_unknowns_alert(UNPROVIDED);
                } else {
                    ke_cyclify_forms();
                }
            }

        return NIL;
    }

    public static final SubLObject ke_signal_input_error_1_alt(SubLObject string) {
        cyc_navigator_internals.generic_message_page($$$File_Error, format(NIL, $str_alt74$Problem_loading_file__s___The_fil, string));
        return NIL;
    }

    public static SubLObject ke_signal_input_error_1(final SubLObject string) {
        cyc_navigator_internals.generic_message_page($$$File_Error, format(NIL, $str83$Problem_loading_file__s___The_fil, string));
        return NIL;
    }

    public static final SubLObject ke_signal_input_error_2_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        cyc_navigator_internals.generic_message_page($$$Input_Error, format(NIL, $str_alt76$The_input_text_contains_fatal_syn));
        return NIL;
    }

    public static SubLObject ke_signal_input_error_2(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        cyc_navigator_internals.generic_message_page($$$Input_Error, format(NIL, $str85$The_input_text_contains_fatal_syn));
        return NIL;
    }

    public static final SubLObject ke_signal_input_error_alt(SubLObject string) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        if (NIL != string) {
            com.cyc.cycjava.cycl.html_ke_file.ke_signal_input_error_1(string);
        } else {
            com.cyc.cycjava.cycl.html_ke_file.ke_signal_input_error_2(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject ke_signal_input_error(SubLObject string) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        if (NIL != string) {
            ke_signal_input_error_1(string);
        } else {
            ke_signal_input_error_2(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject ke_unknowns_alert_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Unknown_Constants;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_15 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt8$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                        {
                                            SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                cb_help_preamble($KE_COMPOSE, NIL, UNPROVIDED);
                                                cb_back_button($SELF, $$$Back);
                                                html_indent(TWO_INTEGER);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                html_princ($str_alt79$Make_Cyc_constants_of_the_followi);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                html_newline(TWO_INTEGER);
                                                html_princ_doc_string($str_alt80$If_so__be_sure_that_you_have_spec, UNPROVIDED);
                                                html_newline(TWO_INTEGER);
                                                cyc_navigator_internals.nav_link($CONSTANTIFY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_newline(TWO_INTEGER);
                                                {
                                                    SubLObject unknowns = ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS);
                                                    SubLObject cdolist_list_var = unknowns;
                                                    SubLObject string = NIL;
                                                    for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                                                        html_prin1(string);
                                                        html_newline(UNPROVIDED);
                                                    }
                                                    if (length(unknowns).numG(TEN_INTEGER)) {
                                                        html_newline(UNPROVIDED);
                                                        cyc_navigator_internals.nav_link($CONSTANTIFY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                                html_newline(TWO_INTEGER);
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_15, thread);
                            }
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject ke_unknowns_alert(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Unknown_Constants;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
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
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
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
                    html_markup($str12$yui_skin_sam);
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
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
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
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($KE_COMPOSE, NIL, UNPROVIDED);
                            cb_back_button($SELF, $$$Back);
                            html_indent(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str88$Make_Cyc_constants_of_the_followi);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            html_princ_doc_string($str89$If_so__be_sure_that_you_have_spec, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            cyc_navigator_internals.nav_link($CONSTANTIFY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            SubLObject cdolist_list_var;
                            final SubLObject unknowns = cdolist_list_var = ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS);
                            SubLObject string = NIL;
                            string = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_prin1(string);
                                html_newline(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                string = cdolist_list_var.first();
                            } 
                            if (length(unknowns).numG(TEN_INTEGER)) {
                                html_newline(UNPROVIDED);
                                cyc_navigator_internals.nav_link($CONSTANTIFY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            html_newline(TWO_INTEGER);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
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
        return NIL;
    }

    public static final SubLObject ke_check_and_poll_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unknowns = ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS);
                if (NIL != ke_file.unknown_constants_in_listP(unknowns)) {
                    {
                        SubLObject title_var = $$$Waiting_for_Constant_Creations;
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                            try {
                                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                                html_markup(html_macros.$html_html_head$.getGlobalValue());
                                html_markup(html_macros.$html_head_head$.getGlobalValue());
                                html_macros.html_head_content_type();
                                cb_head_shortcut_icon();
                                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                                if (NIL != title_var) {
                                    html_source_readability_terpri(UNPROVIDED);
                                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                                    html_princ(title_var);
                                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                                }
                                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_18 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                            html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_markup(html_macros.$html_body_class$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($str_alt8$yui_skin_sam);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
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
                                                {
                                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_macros.$within_html_form$.bind(T, thread);
                                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                        cb_help_preamble($KE_COMPOSE, NIL, UNPROVIDED);
                                                        cb_back_button($SELF, $$$Back);
                                                        html_newline(TWO_INTEGER);
                                                        html_princ($str_alt84$Waiting_for_constant_creations_to);
                                                        html_newline(TWO_INTEGER);
                                                        html_princ($str_alt85$There_are_);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ(operation_queues.local_queue_size());
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_princ($str_alt86$_operations_still_to_be_processed);
                                                        html_newline(TWO_INTEGER);
                                                        html_princ($str_alt87$Click_);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        cyc_navigator_internals.nav_link($CHECK_AND_POLL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_princ($str_alt89$_to_proceed_when_you_think_you_ve);
                                                        html_newline(TWO_INTEGER);
                                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                    } finally {
                                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                                html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_18, thread);
                                    }
                                }
                                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    ke_utilities.change_ke_value(operation_communication.the_cyclist(), $UNKNOWNS, UNPROVIDED, UNPROVIDED);
                    com.cyc.cycjava.cycl.html_ke_file.ke_cyclify_forms();
                }
            }
            return NIL;
        }
    }

    public static SubLObject ke_check_and_poll(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unknowns = ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS);
        if (NIL != ke_file.unknown_constants_in_listP(unknowns)) {
            final SubLObject title_var = $$$Waiting_for_Constant_Creations;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str7$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$24 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$25 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str12$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
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
                            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                cb_help_preamble($KE_COMPOSE, NIL, UNPROVIDED);
                                cb_back_button($SELF, $$$Back);
                                html_newline(TWO_INTEGER);
                                html_princ($str93$Waiting_for_constant_creations_to);
                                html_newline(TWO_INTEGER);
                                html_princ($$$There_are_);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ(operation_queues.local_queue_size());
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_princ($str95$_operations_still_to_be_processed);
                                html_newline(TWO_INTEGER);
                                html_princ($$$Click_);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                cyc_navigator_internals.nav_link($CHECK_AND_POLL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_princ($str98$_to_proceed_when_you_think_you_ve);
                                html_newline(TWO_INTEGER);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$25, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$24, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        } else {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $UNKNOWNS, UNPROVIDED, UNPROVIDED);
            ke_cyclify_forms();
        }
        return NIL;
    }

    public static final SubLObject ke_constantify_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject unknowns = ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS);
            SubLObject already_created = ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_CREATED);
            if ((NIL != unknowns) && (NIL != set_difference(unknowns, already_created, symbol_function(EQUALP), UNPROVIDED))) {
                ke_utilities.constantify(unknowns);
            }
            if (NIL != ke_file.unknown_constants_in_listP(unknowns)) {
                com.cyc.cycjava.cycl.html_ke_file.ke_check_and_poll(UNPROVIDED);
            } else {
                ke_utilities.change_ke_value(operation_communication.the_cyclist(), $UNKNOWNS, UNPROVIDED, UNPROVIDED);
                com.cyc.cycjava.cycl.html_ke_file.ke_cyclify_forms();
            }
        }
        return NIL;
    }

    public static SubLObject ke_constantify(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject unknowns = ke_utilities.ke_value(operation_communication.the_cyclist(), $UNKNOWNS);
        final SubLObject already_created = ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_CREATED);
        if ((NIL != unknowns) && (NIL != set_difference(unknowns, already_created, symbol_function(EQUALP), UNPROVIDED))) {
            ke_utilities.constantify(unknowns);
        }
        if (NIL != ke_file.unknown_constants_in_listP(unknowns)) {
            ke_check_and_poll(UNPROVIDED);
        } else {
            ke_utilities.change_ke_value(operation_communication.the_cyclist(), $UNKNOWNS, UNPROVIDED, UNPROVIDED);
            ke_cyclify_forms();
        }
        return NIL;
    }

    public static final SubLObject ke_cyclify_forms_alt() {
        ke_file.build_eval_form_list();
        {
            SubLObject problems = ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
            if (NIL != problems) {
                com.cyc.cycjava.cycl.html_ke_file.ke_problem_alert($str_alt92$There_is_a_problem_that_may_requi);
            } else {
                {
                    SubLObject pcase_var = ke_utilities.ke_value(operation_communication.the_cyclist(), $APPLICATION);
                    com.cyc.cycjava.cycl.html_ke_file.ke_check_forms_to_eval();
                }
            }
        }
        return NIL;
    }

    public static SubLObject ke_cyclify_forms() {
        ke_file.build_eval_form_list();
        final SubLObject problems = ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
        if (NIL != problems) {
            ke_problem_alert($str101$There_is_a_problem_that_may_requi);
        } else {
            final SubLObject pcase_var = ke_utilities.ke_value(operation_communication.the_cyclist(), $APPLICATION);
            ke_check_forms_to_eval();
        }
        return NIL;
    }

    public static final SubLObject ke_problem_alert_alt(SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $$$Possibly_Malformed_Token_Lists;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_21 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt8$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            html_princ(title_var);
                                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        html_princ(message);
                                        html_newline(UNPROVIDED);
                                        html_newline(UNPROVIDED);
                                        {
                                            SubLObject cdolist_list_var = ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
                                            SubLObject tl = NIL;
                                            for (tl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tl = cdolist_list_var.first()) {
                                                html_princ(tl);
                                                html_newline(UNPROVIDED);
                                                html_newline(UNPROVIDED);
                                            }
                                        }
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_21, thread);
                            }
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject ke_problem_alert(final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Possibly_Malformed_Token_Lists;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$29 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$30 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str12$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
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
                        html_princ(message);
                        html_newline(UNPROVIDED);
                        html_newline(UNPROVIDED);
                        SubLObject cdolist_list_var = ke_utilities.ke_value(operation_communication.the_cyclist(), $MALFORMED);
                        SubLObject tl = NIL;
                        tl = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_princ(tl);
                            html_newline(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            tl = cdolist_list_var.first();
                        } 
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$30, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$29, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject ke_print_forms_1_alt(SubLObject forms, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forms) {
                if (NIL != string_utilities.non_empty_stringP(message)) {
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(message);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                }
                {
                    SubLObject cdolist_list_var = forms;
                    SubLObject x = NIL;
                    for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                        html_newline(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_indent(THREE_INTEGER);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt94$_s, x);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                    }
                }
                html_newline(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject ke_print_forms_1(final SubLObject forms, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forms) {
            if (NIL != string_utilities.non_empty_stringP(message)) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ(message);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
            }
            SubLObject cdolist_list_var = forms;
            SubLObject x = NIL;
            x = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_indent(THREE_INTEGER);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str103$_s, x);
                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            } 
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject ke_print_forms_2_alt(SubLObject ids, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (NIL != ids) {
            if (NIL != string_utilities.non_empty_stringP(message)) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ(message);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
            }
            {
                SubLObject cdolist_list_var = ids;
                SubLObject x = NIL;
                for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                    {
                        SubLObject ass = assertion_handles.find_assertion_by_id(x);
                        SubLObject mt = assertions_high.assertion_mt(ass);
                        html_newline(UNPROVIDED);
                        cb_form(ass, ZERO_INTEGER, T);
                        html_princ($str_alt95$_in_);
                        cb_form(mt, UNPROVIDED, UNPROVIDED);
                        html_newline(UNPROVIDED);
                    }
                }
            }
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject ke_print_forms_2(final SubLObject ids, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (NIL != ids) {
            if (NIL != string_utilities.non_empty_stringP(message)) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ(message);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
            }
            SubLObject cdolist_list_var = ids;
            SubLObject x = NIL;
            x = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject ass = assertion_handles.find_assertion_by_id(x);
                final SubLObject mt = assertions_high.assertion_mt(ass);
                html_newline(UNPROVIDED);
                cb_form(ass, ZERO_INTEGER, T);
                html_princ($$$_in_);
                cb_form(mt, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            } 
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject ke_print_forms_3_alt(SubLObject forms, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (NIL != forms) {
            if (NIL != string_utilities.non_empty_stringP(message)) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ(message);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
            }
            {
                SubLObject cdolist_list_var = forms;
                SubLObject x = NIL;
                for (x = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , x = cdolist_list_var.first()) {
                    html_newline(UNPROVIDED);
                    cb_form(x.first(), ZERO_INTEGER, T);
                    html_princ($str_alt96$_is_not_in_);
                    cb_form(second(x), UNPROVIDED, UNPROVIDED);
                    html_newline(UNPROVIDED);
                }
            }
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject ke_print_forms_3(final SubLObject forms, SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        if (NIL != forms) {
            if (NIL != string_utilities.non_empty_stringP(message)) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ(message);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
            }
            SubLObject cdolist_list_var = forms;
            SubLObject x = NIL;
            x = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_newline(UNPROVIDED);
                cb_form(x.first(), ZERO_INTEGER, T);
                html_princ($$$_is_not_in_);
                cb_form(second(x), UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            } 
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject ke_present_forms_to_eval_alt(SubLObject forms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forms) {
                {
                    SubLObject len = length(forms);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt97$_a_form_a_to_evaluate_, len.numE(ONE_INTEGER) ? ((SubLObject) ($$$One)) : format(NIL, $str_alt99$__a, len), len.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt17$)) : $$$s);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_newline(UNPROVIDED);
                    html_newline(UNPROVIDED);
                    cyc_navigator_internals.nav_link($KE_EVAL, NIL, $MAIN, format(NIL, $str_alt103$Evaluate_the_a_form_a_below, len.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt17$)) : format(NIL, $str_alt99$__a, len), len.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt17$)) : $$$s), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_newline(UNPROVIDED);
                    {
                        SubLObject cdolist_list_var = forms;
                        SubLObject f = NIL;
                        for (f = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , f = cdolist_list_var.first()) {
                            html_newline(UNPROVIDED);
                            cb_form(f, ZERO_INTEGER, T);
                            html_newline(UNPROVIDED);
                        }
                    }
                    html_newline(UNPROVIDED);
                    cyc_navigator_internals.nav_link($KE_EVAL, NIL, $MAIN, format(NIL, $str_alt104$Evaluate_the_a_form_a_above, len.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt17$)) : format(NIL, $str_alt99$__a, len), len.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt17$)) : $$$s), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_newline(UNPROVIDED);
                    html_newline(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject ke_present_forms_to_eval(final SubLObject forms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forms) {
            final SubLObject len = length(forms);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $str106$_a_form_a_to_evaluate_, len.numE(ONE_INTEGER) ? $$$One : format(NIL, $str108$__a, len), len.numE(ONE_INTEGER) ? $str29$ : $$$s);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            html_newline(UNPROVIDED);
            cyc_navigator_internals.nav_link($KE_EVAL, NIL, $MAIN, format(NIL, $str112$Evaluate_the_a_form_a_below, len.numE(ONE_INTEGER) ? $str29$ : format(NIL, $str108$__a, len), len.numE(ONE_INTEGER) ? $str29$ : $$$s), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
            SubLObject cdolist_list_var = forms;
            SubLObject f = NIL;
            f = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_newline(UNPROVIDED);
                cb_form(f, ZERO_INTEGER, T);
                html_newline(UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                f = cdolist_list_var.first();
            } 
            html_newline(UNPROVIDED);
            cyc_navigator_internals.nav_link($KE_EVAL, NIL, $MAIN, format(NIL, $str113$Evaluate_the_a_form_a_above, len.numE(ONE_INTEGER) ? $str29$ : format(NIL, $str108$__a, len), len.numE(ONE_INTEGER) ? $str29$ : $$$s), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_newline(UNPROVIDED);
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject ke_check_forms_to_eval_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject forms_to_eval = ke_utilities.ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL);
                SubLObject already_in_kb = ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_IN_KB);
                SubLObject not_in_kb = ke_utilities.ke_value(operation_communication.the_cyclist(), $NOT_IN_KB);
                SubLObject not_valid_constants = ke_utilities.ke_value(operation_communication.the_cyclist(), $NOT_VALID_CONSTANTS);
                SubLObject already_constants = ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_CONSTANTS);
                SubLObject title_var = $$$Check_Forms_to_Eval;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_23 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt8$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
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
                                        {
                                            SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_macros.$within_html_form$.bind(T, thread);
                                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                cb_help_preamble($KE_COMPOSE, NIL, UNPROVIDED);
                                                cb_back_button($SELF, $$$Back);
                                                html_indent(TWO_INTEGER);
                                                if ((NIL != already_in_kb) && (NIL == forms_to_eval)) {
                                                    html_princ($str_alt111$Apparently_you_have_specified_no_);
                                                    html_newline(TWO_INTEGER);
                                                }
                                                com.cyc.cycjava.cycl.html_ke_file.ke_print_forms_2(already_in_kb, format(NIL, $str_alt112$These_assertions_are_already_in_t, cyc_image_id()));
                                                com.cyc.cycjava.cycl.html_ke_file.ke_print_forms_3(not_in_kb, format(NIL, $str_alt113$These_assertions_are_not_in_the_K, cyc_image_id()));
                                                com.cyc.cycjava.cycl.html_ke_file.ke_print_forms_1(not_valid_constants, $str_alt114$These_strings_are_not_names_of_va);
                                                com.cyc.cycjava.cycl.html_ke_file.ke_print_forms_1(already_constants, $str_alt115$These_strings_are_already_the_nam);
                                                com.cyc.cycjava.cycl.html_ke_file.ke_present_forms_to_eval(forms_to_eval);
                                                if (!(((((NIL != forms_to_eval) || (NIL != already_in_kb)) || (NIL != not_in_kb)) || (NIL != not_valid_constants)) || (NIL != already_constants))) {
                                                    html_princ($str_alt116$State_has_been_cleared___There_ar);
                                                }
                                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                            } finally {
                                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_23, thread);
                            }
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject ke_check_forms_to_eval() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject forms_to_eval = ke_utilities.ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL);
        final SubLObject already_in_kb = ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_IN_KB);
        final SubLObject not_in_kb = ke_utilities.ke_value(operation_communication.the_cyclist(), $NOT_IN_KB);
        final SubLObject not_valid_constants = ke_utilities.ke_value(operation_communication.the_cyclist(), $NOT_VALID_CONSTANTS);
        final SubLObject already_constants = ke_utilities.ke_value(operation_communication.the_cyclist(), $ALREADY_CONSTANTS);
        final SubLObject title_var = $$$Check_Forms_to_Eval;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$33 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$34 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str12$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
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
                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($KE_COMPOSE, NIL, UNPROVIDED);
                            cb_back_button($SELF, $$$Back);
                            html_indent(TWO_INTEGER);
                            if ((NIL != already_in_kb) && (NIL == forms_to_eval)) {
                                html_princ($str120$Apparently_you_have_specified_no_);
                                html_newline(TWO_INTEGER);
                            }
                            ke_print_forms_2(already_in_kb, format(NIL, $str121$These_assertions_are_already_in_t, cyc_image_id()));
                            ke_print_forms_3(not_in_kb, format(NIL, $str122$These_assertions_are_not_in_the_K, cyc_image_id()));
                            ke_print_forms_1(not_valid_constants, $str123$These_strings_are_not_names_of_va);
                            ke_print_forms_1(already_constants, $str124$These_strings_are_already_the_nam);
                            ke_present_forms_to_eval(forms_to_eval);
                            if (((((NIL == forms_to_eval) && (NIL == already_in_kb)) && (NIL == not_in_kb)) && (NIL == not_valid_constants)) && (NIL == already_constants)) {
                                html_princ($str125$State_has_been_cleared___There_ar);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$34, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$33, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject ke_eval_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject forms = ke_utilities.ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL);
            SubLObject len = length(forms);
            SubLObject cdolist_list_var = forms;
            SubLObject f = NIL;
            for (f = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , f = cdolist_list_var.first()) {
                eval(f);
            }
            ke_file.reset_ke_state(operation_communication.the_cyclist());
            {
                SubLObject message = NIL;
                if (len.numGE(ONE_INTEGER)) {
                    message = format(NIL, $str_alt117$_a_form_a_ha_a_been_evaluated_, new SubLObject[]{ len.numE(ONE_INTEGER) ? ((SubLObject) ($$$One)) : len, len.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt17$)) : $$$s, len.numE(ONE_INTEGER) ? ((SubLObject) ($$$s)) : $$$ve });
                } else {
                    message = $str_alt119$State_has_been_cleared___No_forms;
                }
                cyc_navigator_internals.generic_message_page($$$KE_Evaluation_Notification, message);
            }
        }
        return NIL;
    }

    public static SubLObject ke_eval(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject forms = ke_utilities.ke_value(operation_communication.the_cyclist(), $FORMS_TO_EVAL);
        final SubLObject len = length(forms);
        SubLObject cdolist_list_var = forms;
        SubLObject f = NIL;
        f = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            eval(f);
            cdolist_list_var = cdolist_list_var.rest();
            f = cdolist_list_var.first();
        } 
        ke_file.reset_ke_state(operation_communication.the_cyclist());
        SubLObject message = NIL;
        if (len.numGE(ONE_INTEGER)) {
            message = format(NIL, $str126$_a_form_a_ha_a_been_evaluated_, new SubLObject[]{ len.numE(ONE_INTEGER) ? $$$One : len, len.numE(ONE_INTEGER) ? $str29$ : $$$s, len.numE(ONE_INTEGER) ? $$$s : $$$ve });
        } else {
            message = $str128$State_has_been_cleared___No_forms;
        }
        cyc_navigator_internals.generic_message_page($$$KE_Evaluation_Notification, message);
        return NIL;
    }

    static private final SubLString $str_alt3$ke_name_file_html = makeString("ke-name-file.html");

    static private final SubLString $str_alt7$text_javascript = makeString("text/javascript");

    public static SubLObject declare_html_ke_file_file() {
        declareFunction("ke_name_file", "KE-NAME-FILE", 0, 1, false);
        declareFunction("ke_compose", "KE-COMPOSE", 0, 1, false);
        declareFunction("init_ke_state", "INIT-KE-STATE", 0, 0, false);
        declareFunction("handle_ke_file_input", "HANDLE-KE-FILE-INPUT", 1, 0, false);
        declareFunction("non_line_break_charP", "NON-LINE-BREAK-CHAR?", 1, 0, false);
        declareFunction("ke_text_handle_comments", "KE-TEXT-HANDLE-COMMENTS", 1, 0, false);
        declareFunction("handle_compose_input", "HANDLE-COMPOSE-INPUT", 1, 0, false);
        declareFunction("ke_check_and_maybe_cyclify", "KE-CHECK-AND-MAYBE-CYCLIFY", 0, 1, false);
        declareFunction("ke_signal_input_error_1", "KE-SIGNAL-INPUT-ERROR-1", 1, 0, false);
        declareFunction("ke_signal_input_error_2", "KE-SIGNAL-INPUT-ERROR-2", 0, 1, false);
        declareFunction("ke_signal_input_error", "KE-SIGNAL-INPUT-ERROR", 0, 1, false);
        declareFunction("ke_unknowns_alert", "KE-UNKNOWNS-ALERT", 0, 1, false);
        declareFunction("ke_check_and_poll", "KE-CHECK-AND-POLL", 0, 1, false);
        declareFunction("ke_constantify", "KE-CONSTANTIFY", 0, 1, false);
        declareFunction("ke_cyclify_forms", "KE-CYCLIFY-FORMS", 0, 0, false);
        declareFunction("ke_problem_alert", "KE-PROBLEM-ALERT", 1, 0, false);
        declareFunction("ke_print_forms_1", "KE-PRINT-FORMS-1", 1, 1, false);
        declareFunction("ke_print_forms_2", "KE-PRINT-FORMS-2", 1, 1, false);
        declareFunction("ke_print_forms_3", "KE-PRINT-FORMS-3", 1, 1, false);
        declareFunction("ke_present_forms_to_eval", "KE-PRESENT-FORMS-TO-EVAL", 1, 0, false);
        declareFunction("ke_check_forms_to_eval", "KE-CHECK-FORMS-TO-EVAL", 0, 0, false);
        declareFunction("ke_eval", "KE-EVAL", 0, 1, false);
        return NIL;
    }

    static private final SubLString $str_alt8$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt9$handle_ke_file_input = makeString("handle-ke-file-input");

    static private final SubLString $str_alt14$eval_ke_text = makeString("eval-ke-text");

    static private final SubLString $str_alt15$Type_in_pathname_of_the_file_to_l = makeString("Type in pathname of the file to load:");

    static private final SubLString $str_alt16$pathname_radio = makeString("pathname-radio");

    static private final SubLString $str_alt20$_home__A_ke_ = makeString("/home/~A/ke/");

    static private final SubLString $str_alt21$_ke = makeString(".ke");

    static private final SubLString $str_alt22$_ = makeString(".");

    static private final SubLSymbol $sym23$STRING_ = makeSymbol("STRING<");

    static private final SubLString $str_alt24$Or_select_a_file_in_your___ke_dir = makeString("Or select a file in your ~/ke directory:");

    static private final SubLString $str_alt25$And_select_any_options_ = makeString("And select any options:");

    static private final SubLString $str_alt27$_Remove_non_printing_characters_i = makeString(" Remove non-printing characters in strings");

    static private final SubLString $str_alt29$_Check_for_existing_assertions = makeString(" Check for existing assertions");

    public static SubLObject init_html_ke_file_file() {
        defparameter("*REMOVE-NON-PRINTING-CHARACTERS*", NIL);
        defparameter("*CHECK-FOR-EXISTING-ASSERTIONS*", NIL);
        return NIL;
    }

    static private final SubLString $str_alt32$ke_compose_html = makeString("ke-compose.html");

    public static final SubLObject setup_html_ke_file_file_alt() {
        register_html_state_variable($remove_non_printing_characters$);
        register_html_state_variable($check_for_existing_assertions$);
        sethash($KE_NAME_FILE, $cb_help_definitions$.getGlobalValue(), list($str_alt3$ke_name_file_html, NIL));
        html_macros.note_html_handler_function(KE_NAME_FILE);
        sethash($KE_COMPOSE, $cb_help_definitions$.getGlobalValue(), list($str_alt32$ke_compose_html, NIL));
        html_macros.note_html_handler_function(KE_COMPOSE);
        html_macros.note_html_handler_function(HANDLE_KE_FILE_INPUT);
        html_macros.note_html_handler_function(HANDLE_COMPOSE_INPUT);
        html_macros.note_html_handler_function(KE_SIGNAL_INPUT_ERROR_2);
        html_macros.note_html_handler_function(KE_UNKNOWNS_ALERT);
        html_macros.note_html_handler_function(KE_CHECK_AND_POLL);
        html_macros.note_html_handler_function(KE_CONSTANTIFY);
        html_macros.note_html_handler_function(KE_EVAL);
        return NIL;
    }

    public static SubLObject setup_html_ke_file_file() {
        if (SubLFiles.USE_V1) {
            register_html_state_variable($remove_non_printing_characters$);
            register_html_state_variable($check_for_existing_assertions$);
            sethash($KE_NAME_FILE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str3$ke_name_file_html, NIL));
            html_macros.note_cgi_handler_function(KE_NAME_FILE, $HTML_HANDLER);
            sethash($KE_COMPOSE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str40$ke_compose_html, NIL));
            html_macros.note_cgi_handler_function(KE_COMPOSE, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(HANDLE_KE_FILE_INPUT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(HANDLE_COMPOSE_INPUT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(KE_SIGNAL_INPUT_ERROR_2, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(KE_UNKNOWNS_ALERT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(KE_CHECK_AND_POLL, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(KE_CONSTANTIFY, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(KE_EVAL, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(KE_NAME_FILE);
            sethash($KE_COMPOSE, $cb_help_definitions$.getGlobalValue(), list($str_alt32$ke_compose_html, NIL));
            html_macros.note_html_handler_function(KE_COMPOSE);
            html_macros.note_html_handler_function(HANDLE_KE_FILE_INPUT);
            html_macros.note_html_handler_function(HANDLE_COMPOSE_INPUT);
            html_macros.note_html_handler_function(KE_SIGNAL_INPUT_ERROR_2);
            html_macros.note_html_handler_function(KE_UNKNOWNS_ALERT);
            html_macros.note_html_handler_function(KE_CHECK_AND_POLL);
            html_macros.note_html_handler_function(KE_CONSTANTIFY);
            html_macros.note_html_handler_function(KE_EVAL);
        }
        return NIL;
    }

    public static SubLObject setup_html_ke_file_file_Previous() {
        register_html_state_variable($remove_non_printing_characters$);
        register_html_state_variable($check_for_existing_assertions$);
        sethash($KE_NAME_FILE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str3$ke_name_file_html, NIL));
        html_macros.note_cgi_handler_function(KE_NAME_FILE, $HTML_HANDLER);
        sethash($KE_COMPOSE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str40$ke_compose_html, NIL));
        html_macros.note_cgi_handler_function(KE_COMPOSE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HANDLE_KE_FILE_INPUT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HANDLE_COMPOSE_INPUT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(KE_SIGNAL_INPUT_ERROR_2, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(KE_UNKNOWNS_ALERT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(KE_CHECK_AND_POLL, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(KE_CONSTANTIFY, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(KE_EVAL, $HTML_HANDLER);
        return NIL;
    }

    static private final SubLString $str_alt34$handle_compose_input = makeString("handle-compose-input");

    static private final SubLString $str_alt37$Type_KE_text_below___ = makeString("Type KE text below.  ");

    static private final SubLString $str_alt38$Include_a_period_after_each_expre = makeString("Include a period after each expression.");

    static private final SubLString $str_alt39$compose_text = makeString("compose-text");

    static private final SubLString $str_alt47$use_old_ke_text = makeString("use-old-ke-text");

    static private final SubLString $str_alt48$Content_is_in_the_arguments____co = makeString("Content is in the arguments -- contents of ~A in the HTML message.");

    @Override
    public void declareFunctions() {
        declare_html_ke_file_file();
    }

    @Override
    public void initializeVariables() {
        init_html_ke_file_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_html_ke_file_file();
    }

    static private final SubLString $str_alt50$_filename = makeString(":filename");

    

    static private final SubLString $str_alt51$_content = makeString(":content");

    static private final SubLString $str_alt52$__check_existing = makeString(":?check-existing");

    static private final SubLString $str_alt53$check_and_show = makeString("check-and-show");

    static private final SubLString $str_alt56$The_file__s_does_not_exist__or_ca = makeString("The file ~s does not exist, or cannot be accessed.");

    static private final SubLString $str_alt57$The_file__A_cannot_be_probed____A = makeString("The file ~A cannot be probed. (~A)");

    static private final SubLString $str_alt59$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt61$Please_try_again__typing_a_non_em = makeString("Please try again, typing a non-empty string.  ~s is not a valid input.");

    static private final SubLSymbol $sym64$NON_LINE_BREAK_CHAR_ = makeSymbol("NON-LINE-BREAK-CHAR?");

    static private final SubLString $str_alt65$_ke_text = makeString(":ke-text");

    static private final SubLString $str_alt69$Please_check_the_input_for_missin = makeString("Please check the input for missing parens, periods, etc.  These token lists are malformed:");

    static private final SubLString $str_alt74$Problem_loading_file__s___The_fil = makeString("Problem loading file ~s.  The file contains fatal syntax errors, or cannot be located by the pathname given.");

    static private final SubLString $str_alt76$The_input_text_contains_fatal_syn = makeString("The input text contains fatal syntax errors, or has unanticipated syntactic forms.");

    static private final SubLString $str_alt79$Make_Cyc_constants_of_the_followi = makeString("Make Cyc constants of the following strings?");

    static private final SubLString $str_alt80$If_so__be_sure_that_you_have_spec = makeString("If so, be sure that you have specified an #$isa for each new constant,\na #$genls for each new collection, and a #$genlMt for each new microtheory.");

    static private final SubLString $str_alt84$Waiting_for_constant_creations_to = makeString("Waiting for constant creations to be processed ....");

    static private final SubLString $str_alt85$There_are_ = makeString("There are ");

    static private final SubLString $str_alt86$_operations_still_to_be_processed = makeString(" operations still to be processed in the local queue.");

    static private final SubLString $str_alt87$Click_ = makeString("Click ");

    static private final SubLString $str_alt89$_to_proceed_when_you_think_you_ve = makeString(" to proceed when you think you've waited long enough, or attend to the Cyc Agenda if there seems to be a problem.");

    static private final SubLString $str_alt92$There_is_a_problem_that_may_requi = makeString("There is a problem that may require debugging.  Some expressions cannot be coerced into CycL.  Some of these token lists may be malformed:");

    static private final SubLString $str_alt94$_s = makeString("~s");

    static private final SubLString $str_alt95$_in_ = makeString(" in ");

    static private final SubLString $str_alt96$_is_not_in_ = makeString(" is not in ");

    static private final SubLString $str_alt97$_a_form_a_to_evaluate_ = makeString("~a form~a to evaluate:");

    static private final SubLString $str_alt99$__a = makeString(" ~a");

    static private final SubLString $str_alt103$Evaluate_the_a_form_a_below = makeString("Evaluate the~a form~a below");

    static private final SubLString $str_alt104$Evaluate_the_a_form_a_above = makeString("Evaluate the~a form~a above");

    static private final SubLString $str_alt111$Apparently_you_have_specified_no_ = makeString("Apparently you have specified no new assertions.");

    static private final SubLString $str_alt112$These_assertions_are_already_in_t = makeString("These assertions are already in the KB for the Cyc image ~a:");

    static private final SubLString $str_alt113$These_assertions_are_not_in_the_K = makeString("These assertions are not in the KB for the Cyc image ~a.  They cannot be deleted:");

    static private final SubLString $str_alt114$These_strings_are_not_names_of_va = makeString("These strings are not names of valid constants.  They cannot be killed:");

    static private final SubLString $str_alt115$These_strings_are_already_the_nam = makeString("These strings are already the names of constants.  They cannot be used for renaming:");

    static private final SubLString $str_alt116$State_has_been_cleared___There_ar = makeString("State has been cleared.  There are no forms to evaluate.");

    static private final SubLString $str_alt117$_a_form_a_ha_a_been_evaluated_ = makeString("~a form~a ha~a been evaluated.");

    static private final SubLString $str_alt119$State_has_been_cleared___No_forms = makeString("State has been cleared.  No forms have been evaluated.");
}

/**
 * Total time: 744 ms
 */
