package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.$transcript_file_shorthand$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_decode_fort_list_selector_result;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_list_none_selected_p;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_list_selector;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_update_message_page_info;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_message_page_with_history;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_assertion_readably;
import static com.cyc.cycjava.cycl.cb_utilities.cb_string_for_term;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cache_inference_results$;
import static com.cyc.cycjava.cycl.control_vars.$cyc_image_id$;
import static com.cyc.cycjava.cycl.control_vars.$last_agenda_error_explanatory_supports$;
import static com.cyc.cycjava.cycl.control_vars.$last_agenda_error_message$;
import static com.cyc.cycjava.cycl.control_vars.$last_agenda_op$;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_br;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_string;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_value;
import static com.cyc.cycjava.cycl.html_utilities.html_filename_input;
import static com.cyc.cycjava.cycl.html_utilities.html_flush;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_doc_string;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_radio_input;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.html_utilities.html_user_id_and_password;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.lower_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.list_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_system_tools extends SubLTranslatedFile {
    public static final SubLFile me = new cb_system_tools();

    public static final String myName = "com.cyc.cycjava.cycl.cb_system_tools";

    public static final String myFingerPrint = "fadab3ca953b2a254f534e9f04ee98f6d8e5bd1fbae08d1d11589e57a81a139f";

    // defparameter
    public static final SubLSymbol $cyc_system_doc_comm_mode_index$ = makeSymbol("*CYC-SYSTEM-DOC-COMM-MODE-INDEX*");



    // deflexical
    public static final SubLSymbol $oe_patch_messages_enabledP$ = makeSymbol("*OE-PATCH-MESSAGES-ENABLED?*");





    // defparameter
    // The index where the agenda is described
    public static final SubLSymbol $cyc_system_doc_agenda_index$ = makeSymbol("*CYC-SYSTEM-DOC-AGENDA-INDEX*");

    // defparameter
    public static final SubLSymbol $image_purpose$ = makeSymbol("*IMAGE-PURPOSE*");



    // deflexical
    private static final SubLSymbol $cb_address_titles$ = makeSymbol("*CB-ADDRESS-TITLES*");

    // Internal Constants
    public static final SubLString $str0$_Aref_system_html = makeString("~Aref/system.html");

    public static final SubLString $str1$com_modes = makeString("com-modes");



    public static final SubLString $str3$cb_mode_html = makeString("cb-mode.html");

    public static final SubLString $str4$Cyc_communication_status_changing = makeString("Cyc communication status changing facilities");

    public static final SubLString $$$Communication_Status_Area = makeString("Communication Status Area");

    private static final SubLString $str6$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str7$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str12$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$message = makeString("message");



    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str20$cb_mode_handler = makeString("cb-mode-handler");

    private static final SubLString $$$Current_Value = makeString("Current Value");

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLString $str23$You_can_not_change_your_transmitt = makeString("You can not change your transmitting status until you empty ");

    private static final SubLString $str24$your_local_transcript_by_either_s = makeString("your local transcript by either sending or clearing it");

    private static final SubLSymbol CB_MODE = makeSymbol("CB-MODE");



    private static final SubLString $str27$What_Do_You_Want_To_Do_With_Proce = makeString("What Do You Want To Do With Processed Operations?");



    private static final SubLString $str29$transmit_mode = makeString("transmit-mode");

    private static final SubLString $$$transmit = makeString("transmit");





    private static final SubLString $$$Send_Immediately_To_Everybody = makeString("Send Immediately To Everybody");

    private static final SubLString $$$transmit_and_store = makeString("transmit and store");

    private static final SubLString $str35$____and_Record_Locally = makeString("... and Record Locally");

    private static final SubLString $str36$to_ = makeString("to:");



    private static final SubLString $$$transmit_and_store_rolled = makeString("transmit and store rolled");

    private static final SubLString $str39$____and_Record_Locally_to_a_New_T = makeString("... and Record Locally to a New Transcript");

    private static final SubLString $$$store = makeString("store");

    private static final SubLString $$$Store_For_Later = makeString("Store For Later");

    private static final SubLString $$$none = makeString("none");

    private static final SubLString $$$Do_Not_Record = makeString("Do Not Record");

    private static final SubLString $str44$Send_KB_Check_Point_for__ = makeString("Send KB Check Point for: ");

    private static final SubLString $str45$kb_checkpoint_to_send = makeString("kb_checkpoint_to_send");

    private static final SubLString $str46$Currently__you_are_not_allowed_to = makeString("Currently, you are not allowed to send operations, most likely because you are not in the current KB.");

    private static final SubLString $str47$Try_receiving_operations_if_you_w = makeString("Try receiving operations if you wish to send.");

    private static final SubLString $$$You_have_ = makeString("You have ");



    private static final SubLString $str50$cb_system_ready_transcript_file_w = makeString("cb-system-ready-transcript-file&write");

    private static final SubLString $$$_operations = makeString(" operations");

    private static final SubLString $str52$_stored_ = makeString(" stored.");

    private static final SubLString $$$send = makeString("send");

    private static final SubLString $$$Send_Stored_Operations_Now = makeString("Send Stored Operations Now");

    private static final SubLString $$$clear = makeString("clear");

    private static final SubLString $$$Clear_Stored_Operations = makeString("Clear Stored Operations");

    private static final SubLString $str57$Note_ = makeString("Note:");

    private static final SubLString $str58$_All_of_the_above_options_will_st = makeString(" All of the above options will start a new local transcript");

    private static final SubLString $$$You_still_have_ = makeString("You still have ");

    private static final SubLString $str60$_unprocessed_operations_on_your_l = makeString(" unprocessed operations on your local queue.  You can not change your transmitting status until the queue has been processed.");

    private static final SubLString $str61$Do_You_Want_To_Receive_Operations = makeString("Do You Want To Receive Operations From Others?");



    private static final SubLString $str63$receive_mode = makeString("receive-mode");

    private static final SubLString $$$no = makeString("no");

    public static final SubLString $$$No = makeString("No");

    public static final SubLString $$$yes = makeString("yes");

    public static final SubLString $$$Yes = makeString("Yes");

    private static final SubLString $str68$kb_checkpoint_ = makeString("kb_checkpoint?");

    private static final SubLString $str69$Receive_only_up_to_KB_Check_Point = makeString("Receive only up to KB Check Point :");

    private static final SubLString $str70$kb_checkpoint = makeString("kb_checkpoint");

    private static final SubLSymbol $USE_CURRENT_CHECK_POINT = makeKeyword("USE-CURRENT-CHECK-POINT");

    private static final SubLSymbol $cb_mode_checkpoint_collection$ = makeSymbol("*CB-MODE-CHECKPOINT-COLLECTION*");

    private static final SubLObject $$Cyc_BasedProject = reader_make_constant_shell(makeString("Cyc-BasedProject"));

    private static final SubLSymbol $sym74$_OE_PATCH_MESSAGES_ENABLED__ = makeSymbol("*OE-PATCH-MESSAGES-ENABLED?*");

    private static final SubLString $str75$filters_ = makeString("filters?");

    private static final SubLString $$$SENT = makeString("SENT");

    private static final SubLSymbol CB_MODE_HANDLER = makeSymbol("CB-MODE-HANDLER");

    private static final SubLString $str78$cb_mode = makeString("cb-mode");

    private static final SubLString $str79$Comm_ = makeString("Comm:");



    private static final SubLSymbol CB_LINK_MODE = makeSymbol("CB-LINK-MODE");

    public static final SubLSymbol $default_oe_patch_message_recipient$ = makeSymbol("*DEFAULT-OE-PATCH-MESSAGE-RECIPIENT*");

    private static final SubLString $str83$ = makeString("");

    public static final SubLSymbol $oe_patch_message_smtp_host$ = makeSymbol("*OE-PATCH-MESSAGE-SMTP-HOST*");

    private static final SubLSymbol $DISPLAY_OE_PATCH_MESSAGE = makeKeyword("DISPLAY-OE-PATCH-MESSAGE");

    private static final SubLString $str86$display_oe_patch_message_html = makeString("display-oe-patch-message.html");

    private static final SubLString $$$notes = makeString("notes");

    private static final SubLString $$$builder = makeString("builder");

    private static final SubLString $$$OE_Patch_Message = makeString("OE Patch Message");

    private static final SubLString $str90$cb_handle_oe_patch_message = makeString("cb-handle-oe-patch-message");

    private static final SubLString $str91$window_open__ = makeString("window.open('");

    private static final SubLString $str92$__ = makeString("',");

    private static final SubLString $str93$__A_ = makeString("'~A'");

    private static final SubLString $$$null = makeString("null");

    private static final SubLString $str95$___A____ = makeString(",'~A'); ");

    private static final SubLString $str96$return_false_ = makeString("return false;");

    private static final SubLString $str97$Enter_a_short_description_to_go_i = makeString("Enter a short description to go in the subject of the email message, and a longer description in the \"Patch Message\" if warranted.  To not send a message at all, remove all email addresses from the \"To\" line.   ");

    private static final SubLString $str98$To__ = makeString("To: ");

    private static final SubLString $$$to = makeString("to");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $str101$Short_Description__ = makeString("Short Description: ");

    private static final SubLString $$$subj = makeString("subj");

    private static final SubLString $str103$Patch_Message__ = makeString("Patch Message: ");



    private static final SubLString $$$virtual = makeString("virtual");

    private static final SubLString $str106$send_message_ = makeString("send-message?");

    private static final SubLString $$$Transmit_and_Send_Patch_Message = makeString("Transmit and Send Patch Message");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$Transmit_without_Patch_Message = makeString("Transmit without Patch Message");

    private static final SubLString $str110$OE_Patch__kb_ = makeString("OE Patch (kb=");

    private static final SubLString $str111$___ = makeString("): ");



    private static final SubLList $list113 = list(makeSymbol("OPERATION-COUNT"), makeSymbol("TRANSCRIPT-CREATE-LIST"), makeSymbol("TRANSCRIPT-RENAME-LIST"), makeSymbol("TRANSCRIPT-KILL-LIST"));

    private static final SubLString $str114$_A = makeString("~A");

    private static final SubLString $$$Submitted = makeString("Submitted");

    private static final SubLString $$$Transmitted = makeString("Transmitted");

    private static final SubLString $str117$_from_KB___A____ = makeString(" from KB: ~A~%~%");

    private static final SubLString $str118$Patch_Description_____ = makeString("Patch Description:~%~%");

    private static final SubLString $str119$_S__ = makeString("~S~%");

    private static final SubLString $str120$__Transcript___A__ = makeString("~%Transcript: ~A~%");

    private static final SubLString $str121$Total_Operations___A__ = makeString("Total Operations: ~A~%");

    private static final SubLString $str122$__Killed_Constants____ = makeString("~%Killed Constants: ~%");

    private static final SubLList $list123 = list(makeSymbol("OP-NUM"), makeSymbol("EXTERNAL-ID"), makeSymbol("NAME"), makeSymbol("WHO"), makeSymbol("WHEN"));

    private static final SubLString $str124$_A__ = makeString("~A~%");

    private static final SubLString $str125$_and__A_more___ = makeString("[and ~A more]~%");

    private static final SubLString $str126$__Renames____ = makeString("~%Renames: ~%");

    private static final SubLList $list127 = list(makeSymbol("OP-NUM"), makeSymbol("EXTERNAL-ID"), makeSymbol("OLD-NAME"), makeSymbol("NEW-NAME"), makeSymbol("WHO"), makeSymbol("WHEN"));

    private static final SubLString $str128$_A_____A__ = makeString("~A -> ~A~%");

    private static final SubLString $str129$__New_Constants____ = makeString("~%New Constants: ~%");

    private static final SubLSymbol CB_HANDLE_OE_PATCH_MESSAGE = makeSymbol("CB-HANDLE-OE-PATCH-MESSAGE");

    private static final SubLString $str131$Mail_not_sent_due_to_invalid_from = makeString("Mail not sent due to invalid from (");

    private static final SubLString $str132$__or_to__ = makeString(") or to (");

    private static final SubLString $str133$__address = makeString(") address");

    private static final SubLString $$$sent = makeString("sent");

    private static final SubLString $$$submitted = makeString("submitted");

    private static final SubLString $$$Transcript_ = makeString("Transcript ");

    private static final SubLString $str137$__but_no_mail_sent_ = makeString(", but no mail sent.");

    private static final SubLString $str138$__but_mail_message_encountered_er = makeString(", but mail message encountered error: ");

    private static final SubLInteger $int$5000 = makeInteger(5000);

    private static final SubLString $str140$_________________________ = makeString("~%---------------------~%");

    private static final SubLString $str141$Transcript_as_KE_Text___ = makeString("Transcript as KE Text ~%");

    private static final SubLString $str142$___and__A_more_operations___ = makeString(";;[and ~A more operations]~%");

    private static final SubLString $str143$_Roll_to_KB_ = makeString("[Roll to KB ");

    private static final SubLString $str144$_ = makeString("]");



    private static final SubLString $str146$cb_roll_current_kb = makeString("cb-roll-current-kb");

    private static final SubLSymbol $ROLL_CURRENT_KB = makeKeyword("ROLL-CURRENT-KB");

    private static final SubLSymbol CB_LINK_ROLL_CURRENT_KB = makeSymbol("CB-LINK-ROLL-CURRENT-KB");

    private static final SubLSymbol $CB_REMOTE_FILTERS = makeKeyword("CB-REMOTE-FILTERS");

    private static final SubLString $str150$cb_remote_filters_html = makeString("cb-remote-filters.html");

    private static final SubLString $$$Rolling_the_KB = makeString("Rolling the KB");

    private static final SubLString $$$Roll_to_KB_ = makeString("Roll to KB ");

    private static final SubLString $str153$cb_handle_roll_current_kb = makeString("cb-handle-roll-current-kb");

    private static final SubLString $str154$WARNING_ = makeString("WARNING:");

    private static final SubLString $str155$Rolling_the_KB_is_will_filter_eve = makeString("Rolling the KB is will filter every operation until the start of the next KB.");

    public static final SubLString $str156$Do_you_still_want_to_roll_to_KB__ = makeString("Do you still want to roll to KB ~S ?");

    public static final SubLSymbol CB_ROLL_CURRENT_KB = makeSymbol("CB-ROLL-CURRENT-KB");

    public static final SubLSymbol CB_HANDLE_ROLL_CURRENT_KB = makeSymbol("CB-HANDLE-ROLL-CURRENT-KB");

    public static final SubLString $str159$cyc_agenda = makeString("cyc-agenda");

    public static final SubLString $str160$Agenda_halted_due_to_ = makeString("Agenda halted due to:");

    private static final SubLInteger $int$32768 = makeInteger(32768);



    private static final SubLString $str163$cb_agenda_html = makeString("cb-agenda.html");

    private static final SubLString $$$The_Cyc_Agenda_Control_Facilities = makeString("The Cyc Agenda Control Facilities");

    private static final SubLString $$$Agenda_Process_Control = makeString("Agenda Process Control");

    private static final SubLString $str166$cb_abort_agenda = makeString("cb-abort-agenda");

    private static final SubLString $str167$Here_you_control_the_turning_on_a = makeString("Here you control the turning on and off of your Cyc Agenda.");

    private static final SubLString $str168$Currently__your_Agenda_is_ = makeString("Currently, your Agenda is ");

    private static final SubLString $$$running = makeString("running");

    private static final SubLString $$$halted = makeString("halted");

    private static final SubLString $str171$_ = makeString(".");



    private static final SubLString $$$Run = makeString("Run");

    private static final SubLString $$$Current = makeString("Current");

    private static final SubLString $$$Last = makeString("Last");

    private static final SubLString $str176$_Agenda_operation_ = makeString(" Agenda operation:");

    private static final SubLString $$$Abort_Operation = makeString("Abort Operation");



    private static final SubLString $str179$_Refresh_ = makeString("[Refresh]");

    private static final SubLString $str180$50_ = makeString("50%");

    private static final SubLString $str181$Propagating_Assertion_ = makeString("Propagating Assertion:");

    private static final SubLString $str182$_A_direct_ = makeString("~A direct ");

    private static final SubLString $str183$and__A_indirect_ = makeString("and ~A indirect ");



    private static final SubLString $$$dependencies = makeString("dependencies");

    private static final SubLSymbol CB_AGENDA = makeSymbol("CB-AGENDA");

    private static final SubLString $str187$Agenda_ = makeString("Agenda:");

    private static final SubLString $str188$cb_agenda = makeString("cb-agenda");

    private static final SubLSymbol CB_LINK_AGENDA = makeSymbol("CB-LINK-AGENDA");

    private static final SubLString $str190$The_agenda_is_no_longer_running_ = makeString("The agenda is no longer running.");

    private static final SubLSymbol CB_ABORT_AGENDA = makeSymbol("CB-ABORT-AGENDA");

    private static final SubLString $str192$cb_toggle_agenda_status = makeString("cb-toggle-agenda-status");

    private static final SubLString $str193$Click_the_button_to_change_your_A = makeString("Click the button to change your Agenda status:");

    private static final SubLString $$$Halt_Agenda = makeString("Halt Agenda");

    private static final SubLString $$$Start_Agenda = makeString("Start Agenda");

    private static final SubLString $str196$__For_detailed_help_on_the_Cyc_ag = makeString("--For detailed help on the Cyc agenda, read the ");

    private static final SubLString $str197$_A__A = makeString("~A#~A");

    private static final SubLString $$$Cyc_Agenda_Documentation = makeString("Cyc Agenda Documentation");

    private static final SubLString $$$Agenda_Process_Changed = makeString("Agenda Process Changed");

    private static final SubLString $str200$Halting_the_Agenda____ = makeString("Halting the Agenda ...");

    private static final SubLString $str201$Starting_the_Agenda____ = makeString("Starting the Agenda ...");

    private static final SubLString $$$Your_Cyc_Agenda_is_now_ = makeString("Your Cyc Agenda is now ");

    private static final SubLString $$$Your_Cyc_Agenda_is_still_ = makeString("Your Cyc Agenda is still ");

    private static final SubLString $str204$When_it_finishes_its_current_oper = makeString("When it finishes its current operation, its state will change as you requested.");

    private static final SubLString $$$Agenda = makeString("Agenda");

    private static final SubLSymbol CB_TOGGLE_AGENDA_STATUS = makeSymbol("CB-TOGGLE-AGENDA-STATUS");

    private static final SubLString $str207$cb_agenda_error_mode_handler = makeString("cb-agenda-error-mode-handler");

    private static final SubLString $str208$Currently__when_Cyc_encounters_an = makeString("Currently, when Cyc encounters an error with local operations within the Agenda it:");



    private static final SubLString $str210$Continues__ignoring_the_error_ = makeString("Continues, ignoring the error.");

    private static final SubLString $str211$Halts_the_Agenda_and_displays_the = makeString("Halts the Agenda and displays the reasons.");



    private static final SubLString $str213$Enters_the_debugger_ = makeString("Enters the debugger.");



    private static final SubLString $str215$Logs_the_error_and_continues_ = makeString("Logs the error and continues.");

    private static final SubLSymbol $AGENDA_ERROR_FILE = makeKeyword("AGENDA-ERROR-FILE");

    private static final SubLString $str217$Illegal_state_in_cb_agenda_error_ = makeString("Illegal state in cb-agenda-error-mode-display.");

    private static final SubLString $str218$Choose_the_new_error_handling_mod = makeString("Choose the new error handling mode below and select [");

    private static final SubLString $$$Submit_New_Mode = makeString("Submit New Mode");

    private static final SubLString $str220$__to_initiate_the_change_ = makeString("] to initiate the change:");

    private static final SubLString $str221$agenda_error_state = makeString("agenda-error-state");

    private static final SubLString $str222$_ignore = makeString(":ignore");

    private static final SubLString $$$Ignore_and_Continue = makeString("Ignore and Continue");

    private static final SubLString $str224$_halt = makeString(":halt");

    private static final SubLString $$$Halt_and_Display_Reason = makeString("Halt and Display Reason");

    private static final SubLString $str226$_log = makeString(":log");

    private static final SubLString $$$Log_Errors_to_File = makeString("Log Errors to File");

    private static final SubLString $$$pathname = makeString("pathname");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $$$Current_Mode = makeString("Current Mode");

    private static final SubLSymbol CB_AGENDA_ERROR_MODE_HANDLER = makeSymbol("CB-AGENDA-ERROR-MODE-HANDLER");

    private static final SubLString $str232$_operations_waiting_in_your_local = makeString(" operations waiting in your local queue.");

    private static final SubLSymbol $SHOW_LOCAL_OPS = makeKeyword("SHOW-LOCAL-OPS");

    private static final SubLString $str234$Look_at_the_operations_in_the_loc = makeString("Look at the operations in the local queue.");

    private static final SubLSymbol $DELETE_LOCAL_OPS = makeKeyword("DELETE-LOCAL-OPS");

    private static final SubLString $str236$Delete_the_local_queue_ = makeString("Delete the local queue.");

    private static final SubLSymbol $DELETE_LOCAL_AND_RESTART = makeKeyword("DELETE-LOCAL-AND-RESTART");

    private static final SubLString $str238$Delete_the_local_queue_and_restar = makeString("Delete the local queue and restart agenda.");

    private static final SubLString $str239$cb_agenda_error_file_viewer = makeString("cb-agenda-error-file-viewer");

    private static final SubLString $str240$Agenda_Error_File___A = makeString("Agenda Error File: ~A");

    private static final SubLSymbol CB_LINK_AGENDA_ERROR_FILE = makeSymbol("CB-LINK-AGENDA-ERROR-FILE");

    private static final SubLString $str242$Agenda_log_file_empty___S = makeString("Agenda log file empty: ~S");

    private static final SubLSymbol CB_AGENDA_ERROR_FILE_VIEWER = makeSymbol("CB-AGENDA-ERROR-FILE-VIEWER");

    private static final SubLString $str244$cb_system = makeString("cb-system");



    private static final SubLSymbol CB_LINK_SYSTEM1 = makeSymbol("CB-LINK-SYSTEM1");

    private static final SubLString $str247$System_ = makeString("System:");



    private static final SubLSymbol CB_LINK_SYSTEM = makeSymbol("CB-LINK-SYSTEM");



    private static final SubLString $str251$cb_system_html = makeString("cb-system.html");

    private static final SubLString $$$Cyc_System_Area = makeString("Cyc System Area");

    private static final SubLString $$$System_Area = makeString("System Area");

    private static final SubLString $str254$Here_are_your_system_settings_ = makeString("Here are your system settings:");

    private static final SubLSymbol $CONFIRM_HALT_CYC = makeKeyword("CONFIRM-HALT-CYC");

    private static final SubLString $str256$_Halt_this_image_ = makeString("[Halt this image]");



    private static final SubLString $str258$_Process_Inspector_ = makeString("[Process Inspector]");

    private static final SubLSymbol CB_SYSTEM = makeSymbol("CB-SYSTEM");

    private static final SubLString $str260$cb_write_image_handler = makeString("cb-write-image-handler");

    private static final SubLString $str261$Write_image_to_file__ = makeString("Write image to file: ");

    private static final SubLString $str262$File_name__ = makeString("File name: ");

    private static final SubLString $$$file = makeString("file");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLString $$$Write_image = makeString("Write image");

    private static final SubLString $str266$_Warning__this_may_take_some_time = makeString(" Warning: this may take some time.");

    private static final SubLString $$$Write_Image = makeString("Write Image");

    private static final SubLString $str268$Please_enter_a_filename_ = makeString("Please enter a filename.");

    private static final SubLString $str269$Writing_to_file__ = makeString("Writing to file \"");

    private static final SubLString $str270$__ = makeString("\".");

    private static final SubLString $str271$__Done_ = makeString("  Done.");

    private static final SubLSymbol CB_WRITE_IMAGE_HANDLER = makeSymbol("CB-WRITE-IMAGE-HANDLER");

    private static final SubLString $str273$Machine_name__ = makeString("Machine name: ");

    private static final SubLString $$$unknown = makeString("unknown");

    private static final SubLString $str275$SubL_implementation__ = makeString("SubL implementation: ");

    private static final SubLString $str276$Base_TCP_port__ = makeString("Base TCP port: ");

    private static final SubLString $str277$Image_name__ = makeString("Image name: ");

    private static final SubLString $str278$Image_Process_ID__ = makeString("Image Process ID: ");

    private static final SubLString $str279$Image_start_time_ = makeString("Image start time:");

    private static final SubLString $str280$__up__A_ = makeString(" (up ~A)");

    private static final SubLString $str281$Cyc_revision_level__ = makeString("Cyc revision level: ");

    private static final SubLString $str282$Cyc_code_version__ = makeString("Cyc code version: ");

    private static final SubLString $str283$Current_KB__ = makeString("Current KB: ");

    private static final SubLString $str284$Queue_Information__ = makeString("Queue Information: ");

    private static final SubLString $str285$Master_Transcript_Operations_Read = makeString("Master Transcript Operations Read:  ");

    private static final SubLString $str286$Master_Transcript_Operations_Read = makeString("Master Transcript Operations Read but Unprocessed:  ");

    private static final SubLString $str287$Master_Transcript_Operations_Proc = makeString("Master Transcript Operations Processed:  ");

    private static final SubLString $str288$Master_Transcript_Operations_Proc = makeString("Master Transcript Operations Processed but Filtered:  ");

    private static final SubLString $str289$Master_Transcript_Operations_Proc = makeString("Master Transcript Operations Processed and Evaluated:  ");

    private static final SubLString $str290$Unprocessed_Local_Queue_Operation = makeString("Unprocessed Local Queue Operations:  ");

    private static final SubLString $str291$Local_Queue_Operations_Processed_ = makeString("Local Queue Operations Processed But Unrecorded:  ");

    private static final SubLString $str292$Current_Local_Transcript_Operatio = makeString("Current Local Transcript Operations Processed And Recorded:  ");

    private static final SubLString $str293$Unprocessed_auxiliary_queue_opera = makeString("Unprocessed auxiliary queue operations:  ");

    private static final SubLString $str294$Transcript_Information_ = makeString("Transcript Information:");

    private static final SubLString $str295$Master_Transcript___ = makeString("Master Transcript:  ");

    private static final SubLString $$$Maintained_By_Transcript_Server = makeString("Maintained By Transcript Server");

    private static final SubLString $str297$___A__A_ = makeString(" (~A:~A)");

    private static final SubLString $str298$Operations___ = makeString("Operations:  ");



    private static final SubLString $$$None = makeString("None");

    private static final SubLString $str301$Characters___ = makeString("Characters:  ");

    private static final SubLString $str302$Estimated_Ops___ = makeString("Estimated Ops:  ");

    private static final SubLString $str303$Local_Transcript___ = makeString("Local Transcript:  ");

    private static final SubLString $str304$Historical_Information_ = makeString("Historical Information:");

    private static final SubLString $str305$Remote_Operations_Processed__ = makeString("Remote Operations Processed: ");

    private static final SubLString $str306$Local_Operations_Recorded___ = makeString("Local Operations Recorded:  ");

    private static final SubLString $str307$Local_Operations_Sent_To_Master_T = makeString("Local Operations Sent To Master Transcript:  ");

    private static final SubLString $str308$Auxiliary_Queue_Operations_Proces = makeString("Auxiliary Queue Operations Processed:  ");

    private static final SubLString $$$read = makeString("read");



    private static final SubLString $str311$cb_system_ready_transcript_file_r = makeString("cb-system-ready-transcript-file&read");

    private static final SubLSymbol CB_LINK_READ_TRANS = makeSymbol("CB-LINK-READ-TRANS");

    private static final SubLString $$$write = makeString("write");

    private static final SubLSymbol CB_LINK_WRITE_TRANS = makeSymbol("CB-LINK-WRITE-TRANS");

    private static final SubLString $str315$cb_system_ready_transcript_file__ = makeString("cb-system-ready-transcript-file&~A");



    private static final SubLSymbol CB_LINK_VIEW_TRANSCRIPT = makeSymbol("CB-LINK-VIEW-TRANSCRIPT");

    private static final SubLString $str318$cb_transcript_viewer_handler_ = makeString("cb-transcript-viewer-handler&");

    private static final SubLString $str319$stats_ = makeString("stats:");

    private static final SubLString $str320$_Stats_ = makeString("[Stats]");

    private static final SubLSymbol $sym321$STRING_ = makeSymbol("STRING=");

    private static final SubLSymbol CB_SYSTEM_READY_TRANSCRIPT_FILE = makeSymbol("CB-SYSTEM-READY-TRANSCRIPT-FILE");



    private static final SubLString $str324$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol $CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE = makeKeyword("CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE");

    private static final SubLString $str326$cb_system_show_specific_transcrip = makeString("cb-system-show-specific-transcript-file.html");

    private static final SubLString $str327$File_Contents__Transcript_File = makeString("File Contents: Transcript File");

    private static final SubLString $str328$cg_cb_system_show_specific_transc = makeString("cg?cb-system-show-specific-transcript-file-as-ke-text&transcript-filename=~A");

    private static final SubLString $str329$View_Transcript_in_KE_Text_format = makeString("View Transcript in KE Text format.");

    private static final SubLString $str330$File__ = makeString("File: ");

    private static final SubLString $str331$Operations__ = makeString("Operations: ");

    private static final SubLString $str332$No_operations_have_been_saved_yet = makeString("No operations have been saved yet in");

    private static final SubLString $str333$_s_is_not_a_pathname_string_ = makeString("~s is not a pathname string.");

    private static final SubLSymbol $CB_CHOOSE_PROJECT = makeKeyword("CB-CHOOSE-PROJECT");

    private static final SubLString $str335$cb_choose_project_html = makeString("cb-choose-project.html");

    private static final SubLString $$$Choose_KE_Project = makeString("Choose KE Project");

    private static final SubLString $str337$cb_choose_project_handler = makeString("cb-choose-project-handler");

    private static final SubLString $str338$Choose_your_project_from_the_opti = makeString("Choose your project from the options below.");

    private static final SubLString $$$project = makeString("project");

    private static final SubLString $$$No_Project_Selected = makeString("No Project Selected");

    private static final SubLString $$$Reset = makeString("Reset");

    private static final SubLSymbol CB_CHOOSE_PROJECT = makeSymbol("CB-CHOOSE-PROJECT");

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$OngoingStatus = reader_make_constant_shell(makeString("OngoingStatus"));

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLString $str346$Project_has_been_changed_ = makeString("Project has been changed.");

    private static final SubLSymbol CB_CHOOSE_PROJECT_HANDLER = makeSymbol("CB-CHOOSE-PROJECT-HANDLER");

    private static final SubLString $$$Current_Project = makeString("Current Project");

    private static final SubLString $str349$cb_choose_project = makeString("cb-choose-project");



    private static final SubLSymbol CB_LINK_CHOOSE_PROJECT = makeSymbol("CB-LINK-CHOOSE-PROJECT");

    private static final SubLObject $$CycBrowser = reader_make_constant_shell(makeString("CycBrowser"));

    private static final SubLSymbol $sym353$_PROJECT = makeSymbol("?PROJECT");

    private static final SubLObject $$cyclistPrimaryProject = reader_make_constant_shell(makeString("cyclistPrimaryProject"));

    private static final SubLList $list355 = list(makeSymbol("?PROJECT"));

    private static final SubLList $list356 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);



    private static final SubLString $str358$cb_login_html = makeString("cb-login.html");

    private static final SubLString $str359$new_login_name = makeString("new_login_name");

    private static final SubLString $$$Login_Area = makeString("Login Area");

    private static final SubLString $str361$cb_login_handler = makeString("cb-login-handler");

    private static final SubLString $str362$This_image_has_been_designated__ = makeString("This image has been designated: ");

    private static final SubLString $$$You_are_currently_logged_in_as_ = makeString("You are currently logged in as ");

    private static final SubLString $$$Click_ = makeString("Click ");



    private static final SubLString $$$here = makeString("here");

    private static final SubLString $str367$_to_logout_now_ = makeString(" to logout now.");

    private static final SubLString $str368$Type_in_your_new_login_name_below = makeString("Type in your new login name below and press the [");

    private static final SubLString $str369$__button_ = makeString("] button:");

    private static final SubLString $str370$new_login_hashed_password = makeString("new_login_hashed_password");

    private static final SubLString $$$Cyclist = makeString("Cyclist");

    private static final SubLString $$$Password = makeString("Password");

    private static final SubLString $str373$___ = makeString(" : ");

    private static final SubLString $str374$The_following_are_currently_logge = makeString("The following are currently logged in to ");

    private static final SubLString $str375$_ = makeString(":");

    private static final SubLString $$$User = makeString("User");

    private static final SubLString $$$Local_Machine = makeString("Local Machine");

    private static final SubLList $list378 = list(makeSymbol("MACHINE-NAME"), makeSymbol("USER-NAME"));

    private static final SubLString $str379$_Session_id__ = makeString("(Session id: ");



    private static final SubLString $str381$_Force_Logout_ = makeString("[Force Logout]");

    private static final SubLString $str382$_ = makeString(")");



    private static final SubLString $$$_you = makeString(" you");

    private static final SubLSymbol $NOTIFY_ALL_USERS = makeKeyword("NOTIFY-ALL-USERS");

    private static final SubLSymbol CB_LOGIN = makeSymbol("CB-LOGIN");

    private static final SubLString $$$sessionId = makeString("sessionId");





    private static final SubLSymbol CB_FORCE_LOGOUT = makeSymbol("CB-FORCE-LOGOUT");

    private static final SubLString $str391$_a_sessionId__a = makeString("~a&sessionId=~a");

    private static final SubLString $str392$cb_force_logout = makeString("cb-force-logout");

    private static final SubLSymbol CB_LINK_FORCE_LOGOUT = makeSymbol("CB-LINK-FORCE-LOGOUT");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLObject $$HumanCyclist = reader_make_constant_shell(makeString("HumanCyclist"));

    private static final SubLInteger $int$27 = makeInteger(27);

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $str398$cb_notify_all_users = makeString("cb-notify-all-users");

    private static final SubLString $$$Send_Email_to_all_Users = makeString("Send Email to all Users");

    private static final SubLSymbol CB_LINK_NOTIFY_ALL_USERS = makeSymbol("CB-LINK-NOTIFY-ALL-USERS");

    private static final SubLString $$$Mail_all_users = makeString("Mail all users");

    private static final SubLString $str402$Please_enter_the_message_you_wish = makeString("Please enter the message you wish to send to the following users.");

    private static final SubLString $str403$cb_send_email_to_selected_users = makeString("cb-send-email-to-selected-users");

    private static final SubLList $list404 = list(makeSymbol("MACHINE-NAME"), makeSymbol("USER"));

    private static final SubLObject $$Guest = reader_make_constant_shell(makeString("Guest"));

    private static final SubLString $str406$To_ = makeString("To:");



    private static final SubLString $str408$From__ = makeString("From: ");

    private static final SubLString $str409$Subject__ = makeString("Subject: ");

    private static final SubLString $$$subject = makeString("subject");

    private static final SubLInteger $int$72 = makeInteger(72);

    private static final SubLString $str412$Message__ = makeString("Message: ");

    private static final SubLString $$$Send_Email = makeString("Send Email");

    private static final SubLSymbol CB_NOTIFY_ALL_USERS = makeSymbol("CB-NOTIFY-ALL-USERS");

    private static final SubLString $$$exclude = makeString("exclude");

    private static final SubLString $$$Email_Address = makeString("Email Address");

    private static final SubLString $str417$Exclude_ = makeString("Exclude?");

    private static final SubLSymbol CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER = makeSymbol("CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER");

    private static final SubLString $str419$exclude_ = makeString("exclude_");

    private static final SubLSymbol $cb_notify_users_generate_exclusion_mark_from_user_caching_state$ = makeSymbol("*CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER-CACHING-STATE*");



    private static final SubLObject $$preferredEMailAddressText = reader_make_constant_shell(makeString("preferredEMailAddressText"));

    private static final SubLList $list423 = list(makeKeyword("ADDRESS"));

    private static final SubLObject $$CyclistsMt = reader_make_constant_shell(makeString("CyclistsMt"));

    private static final SubLString $$$Sending_Message = makeString("Sending Message");

    private static final SubLString $str426$Sending_message_with_following_co = makeString("Sending message with following content:");

    private static final SubLString $$$Subject = makeString("Subject");

    private static final SubLString $str428$Message_ = makeString("Message:");

    private static final SubLString $$$Sending_Log = makeString("Sending Log");

    private static final SubLList $list430 = list(makeSymbol("MACHINE"), makeSymbol("USER"));

    private static final SubLString $$$Excluding_user_ = makeString("Excluding user ");

    private static final SubLString $$$Sent_message_to_ = makeString("Sent message to ");

    private static final SubLString $$$Error_on_sending_message_to_ = makeString("Error on sending message to ");

    private static final SubLSymbol CB_SEND_EMAIL_TO_SELECTED_USERS = makeSymbol("CB-SEND-EMAIL-TO-SELECTED-USERS");

    private static final SubLString $str435$Login_ = makeString("Login:");

    private static final SubLString $str436$cb_login = makeString("cb-login");



    private static final SubLSymbol CB_LINK_LOGIN = makeSymbol("CB-LINK-LOGIN");



    private static final SubLSymbol CB_LOGIN_HANDLER = makeSymbol("CB-LOGIN-HANDLER");

    private static final SubLSymbol $sym441$HUMAN_CYCLIST_ = makeSymbol("HUMAN-CYCLIST?");

    private static final SubLString $str442$redirect_handler = makeString("redirect-handler");

    private static final SubLSymbol FIRST_LIST = makeSymbol("FIRST-LIST");

    private static final SubLString $$$Known_Constant = makeString("Known Constant");

    private static final SubLString $str445$The_name_you_typed_in__ = makeString("The name you typed in, ");

    private static final SubLString $str446$_is_already_used_in_the_Knowledge = makeString(" is already used in the Knowledge Base as a Cyc constant.");

    private static final SubLString $str447$Please_go_back_and_try_a_differen = makeString("Please go back and try a different login name.");

    private static final SubLString $$$Successful_Login = makeString("Successful Login");

    private static final SubLString $str449$Welcome__ = makeString("Welcome, ");

    private static final SubLString $str450$_ = makeString("!");

    private static final SubLString $$$Your_project_has_been_set_to_ = makeString("Your project has been set to ");

    private static final SubLString $$$Change_Project = makeString("Change Project");

    private static final SubLString $str453$Your_project_is_currently_not_set = makeString("Your project is currently not set.");

    private static final SubLString $$$Choose_Project = makeString("Choose Project");

    private static final SubLString $$$Login = makeString("Login");

    private static final SubLList $list456 = list(cons(reader_make_constant_shell(makeString("Dr")), makeString("Dr.")), cons(reader_make_constant_shell(makeString("Reverend-Title")), makeString("Rev.")), cons(reader_make_constant_shell(makeString("Prof")), makeString("Prof.")), cons(reader_make_constant_shell(makeString("President-Title")), makeString("President")), cons(reader_make_constant_shell(makeString("Sir")), makeString("Sir")), cons(reader_make_constant_shell(makeString("Major-Title")), makeString("Maj.")), cons(reader_make_constant_shell(makeString("Lieutenant-Title")), makeString("Lt.")), cons(reader_make_constant_shell(makeString("LieutenantColonel-Title")), makeString("Ltc.")));

    private static final SubLSymbol $sym457$_TITLE = makeSymbol("?TITLE");

    private static final SubLObject $$titleOfPerson = reader_make_constant_shell(makeString("titleOfPerson"));

    private static final SubLList $list459 = list(makeSymbol("?TITLE"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLList $list461 = cons(makeSymbol("KNOWN-TITLE"), makeSymbol("PREFIX-STRING"));

    private static final SubLObject $$Sir = reader_make_constant_shell(makeString("Sir"));

    private static final SubLObject $$givenNames = reader_make_constant_shell(makeString("givenNames"));

    private static final SubLObject $$familyName = reader_make_constant_shell(makeString("familyName"));



    private static final SubLList $list466 = list(reader_make_constant_shell(makeString("givenNames")));

    private static final SubLString $$$Unknown_Cyclist = makeString("Unknown Cyclist");

    private static final SubLString $str468$cb_create_new_cyclist = makeString("cb-create-new-cyclist");

    private static final SubLString $$$The_name_ = makeString("The name ");

    private static final SubLString $$$_is_not_the_name_of_a_known_ = makeString(" is not the name of a known ");

    private static final SubLString $str471$Do_you_want_to_create_a_new_Cyc_c = makeString("Do you want to create a new Cyc constant with this name?  You will be able to use this constant as you would any other in the Knowledge Base as well as login with this new name.");

    private static final SubLString $str472$Yes__Create_Cyclist = makeString("Yes, Create Cyclist");

    private static final SubLString $$$creating_new_cyclists = makeString("creating new cyclists");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list475 = list(reader_make_constant_shell(makeString("HumanCyclist")));

    private static final SubLString $str476$Unable_to_create_a_new_cyclist__w = makeString("Unable to create a new cyclist (why?");

    private static final SubLSymbol CB_CREATE_NEW_CYCLIST = makeSymbol("CB-CREATE-NEW-CYCLIST");

    private static final SubLString $$$Logout = makeString("Logout");

    private static final SubLString $str479$You_have_now_logged_out_from_this = makeString("You have now logged out from this Cyc image.  Goodbye!");



    private static final SubLString $str481$_to_reconnect_to_Cyc_ = makeString(" to reconnect to Cyc.");

    private static final SubLSymbol CB_LOGOUT = makeSymbol("CB-LOGOUT");

    private static final SubLString $str483$_Logout_ = makeString("[Logout]");

    private static final SubLString $str484$cb_logout = makeString("cb-logout");

    private static final SubLSymbol CB_LINK_LOGOUT = makeSymbol("CB-LINK-LOGOUT");

    private static final SubLString $$$problem = makeString("problem");

    private static final SubLString $str487$user_login = makeString("user_login");

    private static final SubLString $$$Specify_Cyc_Browser_Password = makeString("Specify Cyc Browser Password");

    private static final SubLString $str489$80_ = makeString("80%");

    private static final SubLString $str490$Error_ = makeString("Error!");

    private static final SubLString $$$Could_not_set_password_for_ = makeString("Could not set password for ");

    private static final SubLString $str492$Reason_ = makeString("Reason:");

    private static final SubLString $str493$Please_specify_a_new_password_for = makeString("Please specify a new password for a cyclist.");

    private static final SubLString $str494$_Note__Only_you_can_reset_your_ow = makeString("(Note: Only you can reset your own password.)");

    private static final SubLString $str495$cb_set_password_handler = makeString("cb-set-password-handler");

    private static final SubLString $$$New_Password = makeString("New Password");

    private static final SubLSymbol CB_SET_PASSWORD = makeSymbol("CB-SET-PASSWORD");

    private static final SubLString $str498$_Set_Password_ = makeString("[Set Password]");

    private static final SubLString $str499$cb_set_password = makeString("cb-set-password");



    private static final SubLSymbol CB_LINK_SET_PASSWORD = makeSymbol("CB-LINK-SET-PASSWORD");

    private static final SubLString $$$Set_Password = makeString("Set Password");

    private static final SubLString $$$Passwd = makeString("Passwd");

    private static final SubLString $str504$Set_passwords_for_Cyclist_Authent = makeString("Set passwords for Cyclist Authentication");

    private static final SubLString $str505$Please_fill_in_all_fields_ = makeString("Please fill in all fields.");

    private static final SubLString $str506$No_known_cyclist_by_this_name_ = makeString("No known cyclist by this name.");

    private static final SubLString $str507$The_name_could_mean_any_of_follow = makeString("The name could mean any of following cyclists: ");

    private static final SubLList $list508 = list(reader_make_constant_shell(makeString("encryptedPasswordForUser")));

    private static final SubLSymbol CB_SET_PASSWORD_HANDLER = makeSymbol("CB-SET-PASSWORD-HANDLER");

    private static final SubLSymbol $CB_CONFIRM_HALT_CYC = makeKeyword("CB-CONFIRM-HALT-CYC");

    private static final SubLString $str511$cb_confirm_halt_cyc_html = makeString("cb-confirm-halt-cyc.html");

    private static final SubLString $$$the_Halt_Cyc_Image = makeString("the Halt Cyc Image");

    private static final SubLString $$$Halt_Cyc_Image = makeString("Halt Cyc Image");

    private static final SubLString $str514$cb_halt_cyc = makeString("cb-halt-cyc");

    private static final SubLString $$$halt = makeString("halt");

    private static final SubLSymbol CB_CONFIRM_HALT_CYC = makeSymbol("CB-CONFIRM-HALT-CYC");

    private static final SubLString $str517$_Halt_Cyc_ = makeString("[Halt Cyc]");

    private static final SubLString $str518$cb_confirm_halt_cyc = makeString("cb-confirm-halt-cyc");

    private static final SubLSymbol CB_LINK_CONFIRM_HALT_CYC = makeSymbol("CB-LINK-CONFIRM-HALT-CYC");

    private static final SubLString $$$Halt_Image_Not_Allowed = makeString("Halt Image Not Allowed");

    private static final SubLString $str521$Sorry__this_image_cannot_be_halte = makeString("Sorry, this image cannot be halted through the Cyc Browser.");

    private static final SubLString $$$Cyc_Image_Halted = makeString("Cyc Image Halted");

    private static final SubLString $str523$This_Cyc_image_will_be_halted___G = makeString("This Cyc image will be halted.  Goodbye!");

    private static final SubLString $$$Halted_by_ = makeString("Halted by ");

    private static final SubLString $$$_Via_HTML_interface = makeString(" Via HTML interface");

    private static final SubLSymbol CB_HALT_CYC = makeSymbol("CB-HALT-CYC");

    private static final SubLString $$$This_will_ = makeString("This will ");

    private static final SubLString $$$_the_Cyc_image_ = makeString(" the Cyc image ");

    private static final SubLString $$$red = makeString("red");

    private static final SubLString $str530$Warning__ = makeString("Warning: ");

    private static final SubLString $str531$There_are__A_operations_waiting_i = makeString("There are ~A operations waiting in the transmit queue.  If you ");

    private static final SubLString $str532$_now__they_will_be_lost_ = makeString(" now, they will be lost.");

    private static final SubLString $str533$Do_you_really_want_to_do_this_ = makeString("Do you really want to do this?");

    private static final SubLString $str534$Yes__ = makeString("Yes, ");

    private static final SubLString $$$_system = makeString(" system");

    private static final SubLSymbol $CB_TRANSCRIPT_VIEWER = makeKeyword("CB-TRANSCRIPT-VIEWER");

    private static final SubLString $str537$cb_transcript_viewer_html = makeString("cb-transcript-viewer.html");

    private static final SubLString $str538$show_stats = makeString("show-stats");

    private static final SubLString $str539$transcript_filename = makeString("transcript_filename");

    private static final SubLString $str540$Please_type_in_a_filename_ = makeString("Please type in a filename.");

    private static final SubLString $$$Transcript_Viewing_Area = makeString("Transcript Viewing Area");

    private static final SubLString $str542$cb_transcript_viewer_handler = makeString("cb-transcript-viewer-handler");

    private static final SubLSymbol $ALL_LOCAL_TRANS = makeKeyword("ALL-LOCAL-TRANS");

    private static final SubLString $str544$cg_cb_transcript_viewer = makeString("cg?cb-transcript-viewer");



    private static final SubLString $str546$cb_transcript_viewer = makeString("cb-transcript-viewer");

    private static final SubLString $str547$View_other_transcript_ = makeString("View other transcript:");

    private static final SubLString $str548$Please_type_in_the_full_path_to_t = makeString("Please type in the full path to the transcript: (e.g. /cyc/top/transcripts/[kb#]/[transcript_name])");

    private static final SubLString $str549$ERROR__ = makeString("ERROR: ");

    private static final SubLString $$$Stats = makeString("Stats");

    private static final SubLString $$$View_Transcript = makeString("View Transcript");

    private static final SubLSymbol CB_TRANSCRIPT_VIEWER = makeSymbol("CB-TRANSCRIPT-VIEWER");

    private static final SubLSymbol CB_TRANSCRIPT_VIEWER_HANDLER = makeSymbol("CB-TRANSCRIPT-VIEWER-HANDLER");

    private static final SubLString $$$Transcript_Statistics = makeString("Transcript Statistics");

    private static final SubLString $str555$Transcript__ = makeString("Transcript: ");

    private static final SubLString $str556$Constants_Created__ = makeString("Constants Created: ");

    private static final SubLString $str557$Constants_Renamed__ = makeString("Constants Renamed: ");

    private static final SubLString $str558$__ = makeString("=>");

    private static final SubLString $str559$Constants_Killed__ = makeString("Constants Killed: ");

    private static final SubLString $str560$No_transcripts_for_this_image_ = makeString("No transcripts for this image!");

    private static final SubLString $str561$Local_transcripts_for_this_image_ = makeString("Local transcripts for this image:");

    private static final SubLString $str562$cb_transcript_viewer_handler_stat = makeString("cb-transcript-viewer-handler&stats:");

    private static final SubLSymbol CB_LINK_ALL_LOCAL_TRANS = makeSymbol("CB-LINK-ALL-LOCAL-TRANS");

    private static final SubLString $$$Viewer = makeString("Viewer");



    private static final SubLSymbol CB_LINK_VIEWER = makeSymbol("CB-LINK-VIEWER");

    private static final SubLString $$$Transcript_Viewer = makeString("Transcript Viewer");

    private static final SubLString $$$View = makeString("View");

    private static final SubLString $$$View_Local_Transcripts = makeString("View Local Transcripts");

    private static final SubLSymbol $CB_SHOW_LOCAL_OPS = makeKeyword("CB-SHOW-LOCAL-OPS");

    private static final SubLString $str571$cb_show_local_ops_html = makeString("cb-show-local-ops.html");

    private static final SubLString $$$Local_Operations = makeString("Local Operations");

    private static final SubLString $str573$cb_confirm_clear_local_queue = makeString("cb-confirm-clear-local-queue");

    private static final SubLString $str574$You_have_nothing_in_your_local_qu = makeString("You have nothing in your local queue.");

    private static final SubLString $$$_item = makeString(" item");

    private static final SubLString $$$s = makeString("s");

    private static final SubLString $str577$_in_your_local_queue_ = makeString(" in your local queue.");

    private static final SubLString $str578$Click_this_button_to_erase_the_lo = makeString("Click this button to erase the local queue:");

    private static final SubLString $$$Clear_Local_Queue = makeString("Clear Local Queue");

    private static final SubLString $str580$Here_are_the_queued_local_operati = makeString("Here are the queued local operations:");

    private static final SubLSymbol CB_SHOW_LOCAL_OPS = makeSymbol("CB-SHOW-LOCAL-OPS");

    private static final SubLString $str582$Local_ = makeString("Local:");

    private static final SubLString $str583$cb_show_local_ops = makeString("cb-show-local-ops");

    private static final SubLSymbol CB_LINK_SHOW_LOCAL_OPS = makeSymbol("CB-LINK-SHOW-LOCAL-OPS");

    private static final SubLSymbol $CB_CONFIRM_CLEAR_LOCAL_QUEUE = makeKeyword("CB-CONFIRM-CLEAR-LOCAL-QUEUE");

    private static final SubLString $str586$cb_confirm_clear_local_queue_html = makeString("cb-confirm-clear-local-queue.html");

    private static final SubLString $str587$cb_clear_local_queue = makeString("cb-clear-local-queue");

    private static final SubLString $$$Are_you_ = makeString("Are you ");

    private static final SubLString $$$SURE = makeString("SURE");

    private static final SubLString $str590$_you_want_to_clear_your_local_que = makeString(" you want to clear your local queue?");

    private static final SubLString $str591$_operations_will_be_lost_ = makeString(" operations will be lost!");

    private static final SubLString $str592$Yes__Clear_Local_Queue = makeString("Yes, Clear Local Queue");

    private static final SubLSymbol CB_CONFIRM_CLEAR_LOCAL_QUEUE = makeSymbol("CB-CONFIRM-CLEAR-LOCAL-QUEUE");

    private static final SubLSymbol $CB_CONFIRM_CLEAR_LOCAL_AND_RESTART = makeKeyword("CB-CONFIRM-CLEAR-LOCAL-AND-RESTART");

    private static final SubLString $str595$cb_confirm_clear_local_and_restar = makeString("cb-confirm-clear-local-and-restart.html");

    private static final SubLString $str596$cb_clear_local_and_restart = makeString("cb-clear-local-and-restart");

    private static final SubLString $str597$You_have_nothing_in_your_local_qu = makeString("You have nothing in your local queue. Restarting agenda...");

    private static final SubLString $str598$Local_Queue_Cleared__Agenda_Resta = makeString("Local Queue Cleared, Agenda Restarted");

    private static final SubLString $str599$_you_want_to_clear_your_local_que = makeString(" you want to clear your local queue before restarting the agenda?");

    private static final SubLString $str600$Yes__Clear_Local_Queue_and_Restar = makeString("Yes, Clear Local Queue and Restart");

    private static final SubLSymbol CB_CONFIRM_CLEAR_LOCAL_AND_RESTART = makeSymbol("CB-CONFIRM-CLEAR-LOCAL-AND-RESTART");

    private static final SubLString $str602$cb_confirm_clear_local_and_restar = makeString("cb-confirm-clear-local-and-restart");

    private static final SubLSymbol CB_LINK_DELETE_LOCAL_AND_RESTART = makeSymbol("CB-LINK-DELETE-LOCAL-AND-RESTART");

    private static final SubLSymbol CB_LINK_DELETE_LOCAL_OPS = makeSymbol("CB-LINK-DELETE-LOCAL-OPS");

    private static final SubLSymbol CB_CLEAR_LOCAL_AND_RESTART = makeSymbol("CB-CLEAR-LOCAL-AND-RESTART");

    private static final SubLString $$$Local_Queue_Cleared = makeString("Local Queue Cleared");

    private static final SubLSymbol CB_CLEAR_LOCAL_QUEUE = makeSymbol("CB-CLEAR-LOCAL-QUEUE");

    private static final SubLSymbol $CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT = makeKeyword("CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT");

    private static final SubLString $str609$cb_system_show_specific_transcrip = makeString("cb-system-show-specific-transcript-file-as-ke-text.html");

    private static final SubLString $str610$transcript_filename = makeString("transcript-filename");

    private static final SubLString $str611$output_filename = makeString("output-filename");

    private static final SubLString $str612$error_message = makeString("error-message");

    private static final SubLString $str613$Transcript_file_viewed_in_KE_Text = makeString("Transcript file viewed in KE Text format");

    private static final SubLString $str614$The_transcript_file_contains_no_o = makeString("The transcript file contains no operations.");

    private static final SubLString $str615$cg_cb_write_local_transcript_as_k = makeString("cg?cb-write-local-transcript-as-ke-text");



    private static final SubLString $str617$cb_system_write_specific_transcri = makeString("cb-system-write-specific-transcript-file-as-ke-text");

    private static final SubLString $str618$You_may_write_this_transcript_in_ = makeString("You may write this transcript in KE Text format to a file.  Please type in the full path of the file to write to.");



    private static final SubLString $$$Write_to_File = makeString("Write to File");

    private static final SubLString $str621$This_is_what_the_transcript_curre = makeString("This is what the transcript currently looks like converted to KE Text:");

    private static final SubLSymbol CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT = makeSymbol("CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT");

    private static final SubLString $str623$Transcript_successfully_written_ = makeString("Transcript successfully written.");

    private static final SubLSymbol CB_SYSTEM_WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT = makeSymbol("CB-SYSTEM-WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT");

    public static SubLObject cyc_system_doc_file() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return format(NIL, $str0$_Aref_system_html, system_parameters.$cyc_documentation_url$.getDynamicValue(thread));
    }

    public static SubLObject cb_mode(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str4$Cyc_communication_status_changing);
            return NIL;
        }
        operation_communication.possibly_save_transcript_ops();
        cb_frames.html_update_cb_status_script();
        final SubLObject title_var = $$$Communication_Status_Area;
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
                        final SubLObject message = html_extract_input($$$message, args);
                        if (NIL != message) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(THREE_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject color_val = html_color($RED);
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_val));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(message);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(THREE_INTEGER);
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
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str20$cb_mode_handler, T, UNPROVIDED);
                            cb_help_preamble($CB_MODE, UNPROVIDED, UNPROVIDED);
                            html_reset_input($$$Current_Value);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            if (NIL != operation_queues.local_queue_empty()) {
                                if (NIL != transcript_server.use_transcript_server()) {
                                    transcript_server.transcript_server_check();
                                }
                                if (NIL != operation_queues.local_operations_anywhere()) {
                                    html_princ($str23$You_can_not_change_your_transmitt);
                                    html_princ($str24$your_local_transcript_by_either_s);
                                    html_newline(TWO_INTEGER);
                                    insert_stored_options();
                                } else {
                                    insert_transmit_options();
                                }
                            } else {
                                insert_local_queue_warning();
                            }
                            html_newline(TWO_INTEGER);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            insert_read_options();
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
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
        return NIL;
    }

    public static SubLObject insert_transmit_options() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str27$What_Do_You_Want_To_Do_With_Proce);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != operation_communication.allow_transmitting()) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_radio_input($str29$transmit_mode, $$$transmit, makeBoolean((NIL != operation_communication.not_recordingP()) && (NIL != operation_communication.transmittingP())), UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(TWO_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Send_Immediately_To_Everybody);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject t_and_s_modeP = makeBoolean((NIL != operation_communication.storingP()) && (NIL != operation_communication.transmittingP()));
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_radio_input($str29$transmit_mode, $$$transmit_and_store, t_and_s_modeP, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(TWO_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str35$____and_Record_Locally);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                if (NIL != t_and_s_modeP) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($str36$to_);
                            html_indent(UNPROVIDED);
                            cb_link($WRITE_TRANS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_radio_input($str29$transmit_mode, $$$transmit_and_store_rolled, NIL, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(TWO_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str39$____and_Record_Locally_to_a_New_T);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } else {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($LEFT);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        insert_kb_not_current_message();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_radio_input($str29$transmit_mode, $$$store, makeBoolean((NIL != operation_communication.storingP()) && (NIL == operation_communication.transmittingP())), UNPROVIDED);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(TWO_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Store_For_Later);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_radio_input($str29$transmit_mode, $$$none, makeBoolean((NIL == operation_communication.transmittingP()) && (NIL != operation_communication.not_recordingP())), UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(TWO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$Do_Not_Record);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_princ($str44$Send_KB_Check_Point_for__);
        html_indent(TWO_INTEGER);
        cb_mode_show_kb_checkpoint_options($str45$kb_checkpoint_to_send, UNPROVIDED);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject insert_kb_not_current_message() {
        html_princ($str46$Currently__you_are_not_allowed_to);
        html_newline(UNPROVIDED);
        html_princ($str47$Try_receiving_operations_if_you_w);
        return NIL;
    }

    public static SubLObject insert_stored_options() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_princ($$$You_have_);
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str50$cb_system_ready_transcript_file_w);
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
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ(operation_queues.local_operation_storage_queue_size());
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_princ($$$_operations);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_princ($str52$_stored_);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != operation_communication.allow_transmitting()) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_radio_input($$$store, $$$send, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$Send_Stored_Operations_Now);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } else {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    insert_kb_not_current_message();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_radio_input($$$store, $$$clear, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$Clear_Stored_Operations);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
        html_princ($str57$Note_);
        html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
        html_princ($str58$_All_of_the_above_options_will_st);
        return NIL;
    }

    public static SubLObject insert_local_queue_warning() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($$$You_still_have_);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        final SubLObject color_val = $RED;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != color_val) {
            html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_color(color_val));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ(operation_queues.local_queue_size());
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str60$_unprocessed_operations_on_your_l);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject insert_read_options() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str61$Do_You_Want_To_Receive_Operations);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_radio_input($str63$receive_mode, $$$no, makeBoolean(NIL == operation_communication.receivingP()), UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$No);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_radio_input($str63$receive_mode, $$$yes, operation_communication.receivingP(), UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$Yes);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_checkbox_input($str68$kb_checkpoint_, T, forts.fort_p(operation_communication.get_remote_operations_kb_check_point()), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(TWO_INTEGER);
                    html_princ($str69$Receive_only_up_to_KB_Check_Point);
                    html_indent(TWO_INTEGER);
                    cb_mode_show_kb_checkpoint_options($str70$kb_checkpoint, $USE_CURRENT_CHECK_POINT);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        possibly_insert_experience_options();
        return NIL;
    }

    public static SubLObject cb_mode_show_kb_checkpoint_options(final SubLObject label, SubLObject use_current_check_pointP) {
        if (use_current_check_pointP == UNPROVIDED) {
            use_current_check_pointP = NIL;
        }
        cb_fort_list_selector(label, isa.all_fort_instances($cb_mode_checkpoint_collection$.getGlobalValue(), UNPROVIDED, UNPROVIDED), NIL != use_current_check_pointP ? operation_communication.get_remote_operations_kb_check_point() : NIL, ONE_INTEGER, symbol_function(IDENTITY), T, $$$none);
        return NIL;
    }

    public static SubLObject oe_patch_messages_enabled_and_email_validP() {
        return $oe_patch_messages_enabledP$.getGlobalValue();
    }

    public static SubLObject cb_mode_handler(final SubLObject args) {
        SubLObject transmit_selection_string = html_extract_input($str29$transmit_mode, args);
        final SubLObject stored_selection_string = html_extract_input($$$store, args);
        final SubLObject receive_selection_string = html_extract_input($str63$receive_mode, args);
        final SubLObject use_filtersP = html_extract_input($str75$filters_, args);
        final SubLObject kb_checkpoint_sending = cb_decode_fort_list_selector_result($str45$kb_checkpoint_to_send, args);
        final SubLObject kb_checkpoint_receivingP = html_extract_input($str68$kb_checkpoint_, args);
        if (NIL != stored_selection_string) {
            if (stored_selection_string.equal($$$send)) {
                if (NIL != oe_patch_messages_enabled_and_email_validP()) {
                    display_oe_patch_message(args);
                } else {
                    operation_communication.send_stored_operations();
                }
            } else
                if (stored_selection_string.equal($$$clear)) {
                    operation_communication.clear_stored_operations();
                }

        }
        if (NIL == cb_fort_list_none_selected_p(kb_checkpoint_sending)) {
            operation_communication.transmit_kb_check_point_operation(kb_checkpoint_sending);
        }
        if (NIL != transmit_selection_string) {
            if (NIL != Strings.stringE($$$transmit_and_store_rolled, transmit_selection_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                transcript_utilities.new_local_transcript();
                transcript_utilities.mark_local_transcript($$$SENT);
                transmit_selection_string = $$$transmit_and_store;
            }
            if (!transmit_selection_string.equal(operation_communication.get_transmit_state(UNPROVIDED))) {
                operation_communication.set_transmit_state(transmit_selection_string);
            }
        }
        if ((NIL != receive_selection_string) && (!receive_selection_string.equal(operation_communication.get_receive_state(UNPROVIDED)))) {
            operation_communication.set_receive_state(receive_selection_string);
        }
        if (NIL != operation_communication.receivingP()) {
            if (NIL != kb_checkpoint_receivingP) {
                operation_communication.set_remote_operations_kb_check_point(cb_decode_fort_list_selector_result($str70$kb_checkpoint, args));
            }
        } else {
            operation_communication.clear_remote_operations_kb_check_point();
        }
        cb_mode(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str78$cb_mode);
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
            html_princ($str79$Comm_);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject display_oe_patch_message(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stored_selection_string = html_extract_input($$$store, args);
        final SubLObject builder_note = html_extract_input($$$notes, args);
        final SubLObject submitted_to_builderP = equalp(html_extract_input($$$store, args), $$$builder);
        final SubLObject new_suffix = $$$SENT;
        thread.resetMultipleValues();
        final SubLObject oe_message = default_oe_patch_message(builder_note, transcript_utilities.local_transcript(), new_suffix, submitted_to_builderP);
        final SubLObject require_patch_messageP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject title_var = $$$OE_Patch_Message;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$52 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$53 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
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
                        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str90$cb_handle_oe_patch_message, T, UNPROVIDED);
                            html_hidden_input($$$store, stored_selection_string, UNPROVIDED);
                            html_hidden_input($$$notes, builder_note, UNPROVIDED);
                            final SubLObject frame_name_var_$57 = NIL;
                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            cyc_cgi_url_int();
                            html_princ($str50$cb_system_ready_transcript_file_w);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != frame_name_var_$57) {
                                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(frame_name_var_$57);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str91$window_open__);
                            cyc_cgi_url_int();
                            html_princ($str50$cb_system_ready_transcript_file_w);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str92$__);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $$$null);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str95$___A____, $str83$);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str96$return_false_);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ(file_utilities.normal_pathstring(transcript_utilities.local_transcript()));
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                            }
                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str97$Enter_a_short_description_to_go_i);
                            cb_help_preamble($DISPLAY_OE_PATCH_MESSAGE, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_princ($str98$To__);
                            html_newline(UNPROVIDED);
                            html_text_input($$$to, $default_oe_patch_message_recipient$.getGlobalValue(), $int$80);
                            html_newline(TWO_INTEGER);
                            html_princ($str101$Short_Description__);
                            html_newline(UNPROVIDED);
                            html_text_input($$$subj, oe_patch_message_subject_prefix(), $int$80);
                            html_newline(TWO_INTEGER);
                            html_princ($str103$Patch_Message__);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$message);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($int$100);
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
                            final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(oe_message);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                            }
                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            if (stored_selection_string.equal($$$send)) {
                                html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_submit$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str106$send_message_);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_princ($$$Transmit_and_Send_Patch_Message);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                if (NIL == require_patch_messageP) {
                                    html_princ($$$_);
                                    html_submit_input($$$Transmit_without_Patch_Message, UNPROVIDED, UNPROVIDED);
                                }
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$53, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$52, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject oe_patch_message_subject_prefix() {
        return cconcatenate($str110$OE_Patch__kb_, new SubLObject[]{ format_nil.format_nil_a_no_copy(operation_communication.kb_version_string()), $str111$___ });
    }

    public static SubLObject default_oe_patch_message(SubLObject note, SubLObject transcript_file, SubLObject new_suffix, SubLObject submittedP) {
        if (note == UNPROVIDED) {
            note = NIL;
        }
        if (transcript_file == UNPROVIDED) {
            transcript_file = transcript_utilities.local_transcript();
        }
        if (new_suffix == UNPROVIDED) {
            new_suffix = $$$SENT;
        }
        if (submittedP == UNPROVIDED) {
            submittedP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject message_string = NIL;
        SubLObject require_patch_messageP = NIL;
        final SubLObject max_lines_per_type = $int$1000;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(T, thread);
            final SubLObject stats = transcript_utilities.constant_modifications_in_transcript(transcript_file);
            SubLObject current;
            final SubLObject datum = current = stats;
            SubLObject operation_count = NIL;
            SubLObject transcript_create_list = NIL;
            SubLObject transcript_rename_list = NIL;
            SubLObject transcript_kill_list = NIL;
            destructuring_bind_must_consp(current, datum, $list113);
            operation_count = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list113);
            transcript_create_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list113);
            transcript_rename_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list113);
            transcript_kill_list = current.first();
            current = current.rest();
            if (NIL == current) {
                require_patch_messageP = makeBoolean(((NIL != transcript_kill_list) || (NIL != transcript_rename_list)) || (NIL != transcript_create_list));
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    format(stream, $str114$_A, NIL != submittedP ? $$$Submitted : $$$Transmitted);
                    format(stream, $str117$_from_KB___A____, operation_communication.kb_version_string());
                    format(stream, $str118$Patch_Description_____);
                    if (NIL != string_utilities.non_empty_stringP(note)) {
                        format(stream, $str119$_S__, note);
                    }
                    format(stream, $str120$__Transcript___A__, transcript_utilities.mark_transcript_filename(file_utilities.normal_pathstring(transcript_file), new_suffix));
                    format(stream, $str121$Total_Operations___A__, operation_count);
                    if (NIL != transcript_kill_list) {
                        format(stream, $str122$__Killed_Constants____);
                        SubLObject done = NIL;
                        SubLObject list_var = NIL;
                        SubLObject info = NIL;
                        SubLObject line_count = NIL;
                        list_var = transcript_kill_list;
                        info = list_var.first();
                        for (line_count = ZERO_INTEGER; (NIL == done) && (NIL != list_var); list_var = list_var.rest() , info = list_var.first() , line_count = add(ONE_INTEGER, line_count)) {
                            SubLObject current_$61;
                            final SubLObject datum_$60 = current_$61 = info;
                            SubLObject op_num = NIL;
                            SubLObject external_id = NIL;
                            SubLObject name = NIL;
                            SubLObject who = NIL;
                            SubLObject when = NIL;
                            destructuring_bind_must_consp(current_$61, datum_$60, $list123);
                            op_num = current_$61.first();
                            current_$61 = current_$61.rest();
                            destructuring_bind_must_consp(current_$61, datum_$60, $list123);
                            external_id = current_$61.first();
                            current_$61 = current_$61.rest();
                            destructuring_bind_must_consp(current_$61, datum_$60, $list123);
                            name = current_$61.first();
                            current_$61 = current_$61.rest();
                            destructuring_bind_must_consp(current_$61, datum_$60, $list123);
                            who = current_$61.first();
                            current_$61 = current_$61.rest();
                            destructuring_bind_must_consp(current_$61, datum_$60, $list123);
                            when = current_$61.first();
                            current_$61 = current_$61.rest();
                            if (NIL == current_$61) {
                                format(stream, $str124$_A__, name);
                            } else {
                                cdestructuring_bind_error(datum_$60, $list123);
                            }
                            if (line_count.numG(max_lines_per_type)) {
                                done = T;
                                format(stream, $str125$_and__A_more___, subtract(length(transcript_kill_list), line_count));
                            }
                        }
                    }
                    if (NIL != transcript_rename_list) {
                        format(stream, $str126$__Renames____);
                        SubLObject done = NIL;
                        SubLObject list_var = NIL;
                        SubLObject info = NIL;
                        SubLObject line_count = NIL;
                        list_var = transcript_rename_list;
                        info = list_var.first();
                        for (line_count = ZERO_INTEGER; (NIL == done) && (NIL != list_var); list_var = list_var.rest() , info = list_var.first() , line_count = add(ONE_INTEGER, line_count)) {
                            SubLObject current_$62;
                            final SubLObject datum_$61 = current_$62 = info;
                            SubLObject op_num = NIL;
                            SubLObject external_id = NIL;
                            SubLObject old_name = NIL;
                            SubLObject new_name = NIL;
                            SubLObject who2 = NIL;
                            SubLObject when2 = NIL;
                            destructuring_bind_must_consp(current_$62, datum_$61, $list127);
                            op_num = current_$62.first();
                            current_$62 = current_$62.rest();
                            destructuring_bind_must_consp(current_$62, datum_$61, $list127);
                            external_id = current_$62.first();
                            current_$62 = current_$62.rest();
                            destructuring_bind_must_consp(current_$62, datum_$61, $list127);
                            old_name = current_$62.first();
                            current_$62 = current_$62.rest();
                            destructuring_bind_must_consp(current_$62, datum_$61, $list127);
                            new_name = current_$62.first();
                            current_$62 = current_$62.rest();
                            destructuring_bind_must_consp(current_$62, datum_$61, $list127);
                            who2 = current_$62.first();
                            current_$62 = current_$62.rest();
                            destructuring_bind_must_consp(current_$62, datum_$61, $list127);
                            when2 = current_$62.first();
                            current_$62 = current_$62.rest();
                            if (NIL == current_$62) {
                                format(stream, $str128$_A_____A__, old_name, new_name);
                            } else {
                                cdestructuring_bind_error(datum_$61, $list127);
                            }
                            if (line_count.numG(max_lines_per_type)) {
                                done = T;
                                format(stream, $str125$_and__A_more___, subtract(length(transcript_rename_list), line_count));
                            }
                        }
                    }
                    transcript_create_list = nreverse(transcript_create_list);
                    if (NIL != transcript_create_list) {
                        format(stream, $str129$__New_Constants____);
                        SubLObject cdolist_list_var = transcript_create_list;
                        SubLObject info2 = NIL;
                        info2 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current_$63;
                            final SubLObject datum_$62 = current_$63 = info2;
                            SubLObject op_num2 = NIL;
                            SubLObject external_id2 = NIL;
                            SubLObject name2 = NIL;
                            SubLObject who3 = NIL;
                            SubLObject when3 = NIL;
                            destructuring_bind_must_consp(current_$63, datum_$62, $list123);
                            op_num2 = current_$63.first();
                            current_$63 = current_$63.rest();
                            destructuring_bind_must_consp(current_$63, datum_$62, $list123);
                            external_id2 = current_$63.first();
                            current_$63 = current_$63.rest();
                            destructuring_bind_must_consp(current_$63, datum_$62, $list123);
                            name2 = current_$63.first();
                            current_$63 = current_$63.rest();
                            destructuring_bind_must_consp(current_$63, datum_$62, $list123);
                            who3 = current_$63.first();
                            current_$63 = current_$63.rest();
                            destructuring_bind_must_consp(current_$63, datum_$62, $list123);
                            when3 = current_$63.first();
                            current_$63 = current_$63.rest();
                            if (NIL == current_$63) {
                                format(stream, $str124$_A__, name2);
                            } else {
                                cdestructuring_bind_error(datum_$62, $list123);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            info2 = cdolist_list_var.first();
                        } 
                    }
                    message_string = get_output_stream_string(stream);
                } finally {
                    final SubLObject _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        close(stream, UNPROVIDED);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list113);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return values(message_string, require_patch_messageP);
    }

    public static SubLObject cb_handle_oe_patch_message(final SubLObject args) {
        final SubLObject subject = html_extract_input($$$subj, args);
        final SubLObject message = html_extract_string($$$message, args, UNPROVIDED);
        final SubLObject stored_selection_string = html_extract_input($$$store, args);
        final SubLObject send_mailP = html_extract_input($str106$send_message_, args);
        final SubLObject to = (NIL != send_mailP) ? html_extract_input($$$to, args) : NIL;
        final SubLObject from = kb_accessors.email_address_text(operation_communication.the_cyclist());
        SubLObject mode_args = NIL;
        mode_args = send_or_submit_transcript_with_message(transcript_utilities.local_transcript(), stored_selection_string, message, subject, from, to);
        cb_mode(mode_args);
        return NIL;
    }

    public static SubLObject send_or_submit_transcript_with_message(final SubLObject transcript, final SubLObject action_type, SubLObject message, final SubLObject email_subj, SubLObject email_from, SubLObject email_to) {
        if (email_from == UNPROVIDED) {
            email_from = kb_accessors.email_address_text(operation_communication.the_cyclist());
        }
        if (email_to == UNPROVIDED) {
            email_to = $default_oe_patch_message_recipient$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ret_value = NIL;
        SubLObject ke_text_file = NIL;
        SubLObject mail_successfulP = NIL;
        SubLObject mail_error_message = cconcatenate($str131$Mail_not_sent_due_to_invalid_from, new SubLObject[]{ format_nil.format_nil_s_no_copy(email_from), $str132$__or_to__, format_nil.format_nil_s_no_copy(email_to), $str133$__address });
        if ((NIL != string_utilities.non_empty_stringP(email_to)) && (NIL != string_utilities.non_empty_stringP(email_from))) {
            ke_text_file = ke_text_for_patch_message(transcript);
            message = cconcatenate(message, ke_text_file);
            thread.resetMultipleValues();
            final SubLObject mail_successfulP_$67 = mail_utilities.mail_message(email_from, email_to, message, email_subj, $oe_patch_message_smtp_host$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject mail_error_message_$68 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            mail_successfulP = mail_successfulP_$67;
            mail_error_message = mail_error_message_$68;
        }
        if (action_type.equal($$$send)) {
            operation_communication.send_stored_operations();
        }
        if (NIL == mail_successfulP) {
            final SubLObject result_string = (action_type.equal($$$send)) ? $$$sent : $$$submitted;
            final SubLObject message_$69 = (NIL == email_to) ? cconcatenate($$$Transcript_, new SubLObject[]{ result_string, $str137$__but_no_mail_sent_ }) : cconcatenate($$$Transcript_, new SubLObject[]{ result_string, $str138$__but_mail_message_encountered_er, mail_error_message });
            ret_value = list(list($$$message, message_$69));
        }
        return ret_value;
    }

    public static SubLObject ke_text_for_patch_message(SubLObject transcript_file) {
        if (transcript_file == UNPROVIDED) {
            transcript_file = transcript_utilities.local_transcript();
        }
        SubLObject ke_text_file = NIL;
        final SubLObject max_transcript_lines = $int$5000;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            format(stream, $str140$_________________________);
            format(stream, $str141$Transcript_as_KE_Text___);
            SubLObject done = NIL;
            final SubLObject ke_text_lines = transcript_utilities.transcript_file_to_ke_text(transcript_file);
            SubLObject list_var = NIL;
            SubLObject ke_text_line = NIL;
            SubLObject line_count = NIL;
            list_var = ke_text_lines;
            ke_text_line = list_var.first();
            for (line_count = ZERO_INTEGER; (NIL == done) && (NIL != list_var); list_var = list_var.rest() , ke_text_line = list_var.first() , line_count = add(ONE_INTEGER, line_count)) {
                format(stream, $str124$_A__, ke_text_line);
                if (line_count.numG(max_transcript_lines)) {
                    done = T;
                    format(stream, $str142$___and__A_more_operations___, subtract(length(ke_text_lines), line_count));
                }
            }
            ke_text_file = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ke_text_file;
    }

    public static SubLObject cb_link_roll_current_kb(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_kb = kb_loaded();
        final SubLObject next_kb = number_utilities.f_1X(current_kb);
        if (NIL == linktext) {
            linktext = cconcatenate($str143$_Roll_to_KB_, new SubLObject[]{ format_nil.format_nil_s_no_copy(next_kb), $str144$_ });
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str146$cb_roll_current_kb);
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

    public static SubLObject cb_roll_current_kb(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$Rolling_the_KB);
            return NIL;
        }
        final SubLObject current_kb = kb_loaded();
        final SubLObject next_kb = number_utilities.f_1X(current_kb);
        final SubLObject title_var;
        final SubLObject title = title_var = cconcatenate($$$Roll_to_KB_, format_nil.format_nil_a_no_copy(next_kb));
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$70 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$71 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
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
                        final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str153$cb_handle_roll_current_kb, T, UNPROVIDED);
                            cb_help_preamble($CB_REMOTE_FILTERS, UNPROVIDED, UNPROVIDED);
                            final SubLObject color_val = $RED;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != color_val) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_val));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_princ_strong($str154$WARNING_);
                                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_indent(TWO_INTEGER);
                            html_princ($str155$Rolling_the_KB_is_will_filter_eve);
                            html_newline(TWO_INTEGER);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str156$Do_you_still_want_to_roll_to_KB__, next_kb);
                            html_indent(FOUR_INTEGER);
                            html_submit_input($$$Yes, $$$yes, UNPROVIDED);
                            html_submit_input($$$No, $$$no, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$71, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$70, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_handle_roll_current_kb(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$Rolling_the_KB);
            return NIL;
        }
        final SubLObject rollP = html_extract_input($$$yes, args);
        if (NIL == rollP) {
            return cb_mode(UNPROVIDED);
        }
        final SubLObject current_kb = kb_loaded();
        final SubLObject next_kb = number_utilities.f_1X(current_kb);
        operation_communication.close_kb(current_kb, next_kb);
        return cb_mode(UNPROVIDED);
    }

    public static SubLObject cb_agenda_halt_explanation_display() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $last_agenda_error_message$.getGlobalValue()) {
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str160$Agenda_halted_due_to_);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            final SubLObject _prev_bind_0 = html_cycl_string_printer.$html_large_string_limit$.currentBinding(thread);
            try {
                html_cycl_string_printer.$html_large_string_limit$.bind($int$32768, thread);
                html_macros.verify_not_within_html_pre();
                html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                final SubLObject _prev_bind_0_$76 = html_macros.$within_html_pre$.currentBinding(thread);
                try {
                    html_macros.$within_html_pre$.bind(T, thread);
                    html_princ_doc_string($last_agenda_error_message$.getGlobalValue(), UNPROVIDED);
                } finally {
                    html_macros.$within_html_pre$.rebind(_prev_bind_0_$76, thread);
                }
                html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
            } finally {
                html_cycl_string_printer.$html_large_string_limit$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var = $last_agenda_error_explanatory_supports$.getGlobalValue();
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!support.eql($last_agenda_error_explanatory_supports$.getGlobalValue().first())) {
                    html_newline(UNPROVIDED);
                }
                if (NIL != assertion_handles.assertion_p(support)) {
                    cb_show_assertion_readably(support, T, UNPROVIDED);
                } else {
                    cb_form(support, ZERO_INTEGER, T);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject cb_agenda(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$The_Cyc_Agenda_Control_Facilities);
            return NIL;
        }
        final SubLObject title_var = $$$Agenda_Process_Control;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$77 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$78 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_help_preamble($CB_AGENDA, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
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
                        final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str166$cb_abort_agenda, T, UNPROVIDED);
                            html_princ($str167$Here_you_control_the_turning_on_a);
                            html_newline(UNPROVIDED);
                            html_princ($str168$Currently__your_Agenda_is_);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            if (NIL != agenda.agenda_running()) {
                                html_princ($$$running);
                            } else {
                                html_princ($$$halted);
                            }
                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_princ($str171$_);
                            if ((NIL != $last_agenda_op$.getGlobalValue()) && ((NIL != agenda.agenda_running()) || ($HALT == agenda.agenda_error_mode()))) {
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            final SubLObject state = agenda.agenda_state();
                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            if (agenda.agenda_state().equalp($$$Run)) {
                                                html_princ($$$Current);
                                            } else {
                                                html_princ($$$Last);
                                            }
                                            html_princ($str176$_Agenda_operation_);
                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            if (state.equalp($$$Run)) {
                                                html_indent(TWO_INTEGER);
                                                html_submit_input($$$Abort_Operation, UNPROVIDED, UNPROVIDED);
                                                html_indent(TWO_INTEGER);
                                                cb_link($AGENDA, $str179$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                            html_newline(UNPROVIDED);
                                            cb_form(cb_transform_operation_for_display(agenda.agenda_form_to_show()), ZERO_INTEGER, T);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        final SubLObject propagating_assertions = forward.all_currently_forward_propagating_assertions();
                                        if (NIL != propagating_assertions) {
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_align($TOP));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup($str180$50_);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                SubLObject list_var = NIL;
                                                SubLObject assertion = NIL;
                                                SubLObject index = NIL;
                                                list_var = propagating_assertions;
                                                assertion = list_var.first();
                                                for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , assertion = list_var.first() , index = add(ONE_INTEGER, index)) {
                                                    if (!index.isZero()) {
                                                        html_newline(TWO_INTEGER);
                                                    }
                                                    html_princ_strong($str181$Propagating_Assertion_);
                                                    thread.resetMultipleValues();
                                                    final SubLObject direct_count = cb_assertion_dependency_counts(assertion);
                                                    final SubLObject indirect_count = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (direct_count.isPositive()) {
                                                        html_indent(FOUR_INTEGER);
                                                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str182$_A_direct_, direct_count);
                                                        if (indirect_count.isPositive()) {
                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str183$and__A_indirect_, indirect_count);
                                                        }
                                                        cb_link($ASSERTION_DEPENDENCIES, assertion, $$$dependencies, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                    }
                                                    html_newline(UNPROVIDED);
                                                    cb_show_assertion_readably(assertion, T, T);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            if ((NIL == agenda.agenda_running()) && ($HALT == agenda.agenda_error_mode())) {
                                cb_agenda_halt_explanation_display();
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        cb_toggle_agenda_status_display();
                        cb_agenda_error_mode_display();
                        if (NIL == operation_queues.local_queue_empty()) {
                            cb_agenda_local_queue_display();
                        }
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$78, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$77, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_assertion_dependency_counts(final SubLObject assertion) {
        final SubLObject dependent_assertion_count = length(assertions_interface.all_dependent_assertions(assertion));
        final SubLObject direct_dependent_count;
        final SubLObject dependent_count = direct_dependent_count = assertions_high.assertion_dependent_count(assertion);
        final SubLObject indirect_dependent_count = subtract(dependent_assertion_count, direct_dependent_count, ONE_INTEGER);
        return values(direct_dependent_count, indirect_dependent_count);
    }

    public static SubLObject cb_link_agenda(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str187$Agenda_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str188$cb_agenda);
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

    public static SubLObject cb_abort_agenda(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL == agenda.agenda_running()) {
            return cb_error($str190$The_agenda_is_no_longer_running_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        agenda.abort_agenda();
        agenda.wait_for_agenda_not_running(THREE_INTEGER);
        cb_agenda(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_toggle_agenda_status_display() {
        final SubLThread thread = SubLProcess.currentSubLThread();
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
            html_hidden_input($str192$cb_toggle_agenda_status, T, UNPROVIDED);
            html_hr(UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str193$Click_the_button_to_change_your_A);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            if (NIL != agenda.agenda_running()) {
                html_submit_input($$$Halt_Agenda, UNPROVIDED, UNPROVIDED);
            } else {
                html_submit_input($$$Start_Agenda, UNPROVIDED, UNPROVIDED);
            }
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_princ($str196$__For_detailed_help_on_the_Cyc_ag);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str197$_A__A, cyc_system_doc_file(), $cyc_system_doc_agenda_index$.getDynamicValue(thread));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($$$Cyc_Agenda_Documentation);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_princ($str171$_);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_toggle_agenda_status(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject runningP = agenda.agenda_running();
        html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str7$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Agenda_Process_Changed);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            cb_frames.html_update_cb_status_script();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$87 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_princ($$$Agenda_Process_Changed);
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        if (NIL != runningP) {
                            html_princ($str200$Halting_the_Agenda____);
                        } else {
                            html_princ($str201$Starting_the_Agenda____);
                        }
                        html_flush();
                        if (NIL != runningP) {
                            agenda.halt_agenda(TWO_INTEGER);
                        } else {
                            agenda.start_agenda(TWO_INTEGER);
                        }
                        if (NIL != runningP) {
                            agenda.wait_for_agenda_not_running(THREE_INTEGER);
                        } else {
                            agenda.wait_for_agenda_running(THREE_INTEGER);
                        }
                        html_newline(UNPROVIDED);
                        final SubLObject now_runningP = agenda.agenda_running();
                        if (!runningP.equalp(now_runningP)) {
                            html_princ($$$Your_Cyc_Agenda_is_now_);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            if (NIL != now_runningP) {
                                html_princ($$$running);
                            } else {
                                html_princ($$$halted);
                            }
                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } else {
                            html_princ($$$Your_Cyc_Agenda_is_still_);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            if (NIL != now_runningP) {
                                html_princ($$$running);
                            } else {
                                html_princ($$$halted);
                            }
                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_princ($str204$When_it_finishes_its_current_oper);
                        }
                        cb_frame_update_message_page_info($$$Agenda);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$87, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_agenda_error_mode_display() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = agenda.agenda_error_mode();
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
            html_hidden_input($str207$cb_agenda_error_mode_handler, T, UNPROVIDED);
            html_hr(UNPROVIDED, UNPROVIDED);
            html_princ($str208$Currently__when_Cyc_encounters_an);
            html_newline(UNPROVIDED);
            html_indent(SEVEN_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            final SubLObject pcase_var = mode;
            if (pcase_var.eql($IGNORE)) {
                html_princ($str210$Continues__ignoring_the_error_);
            } else
                if (pcase_var.eql($HALT)) {
                    html_princ($str211$Halts_the_Agenda_and_displays_the);
                } else
                    if (pcase_var.eql($DEBUG)) {
                        html_princ($str213$Enters_the_debugger_);
                    } else
                        if (pcase_var.eql($LOG)) {
                            html_princ(format(NIL, $str215$Logs_the_error_and_continues_));
                            html_br();
                            html_indent(SEVEN_INTEGER);
                            if (NIL != agenda.get_agenda_log_file()) {
                                cb_link($AGENDA_ERROR_FILE, file_utilities.get_absolute_path_string(agenda.get_agenda_log_file()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } else {
                            cb_error($str217$Illegal_state_in_cb_agenda_error_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }



            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(TWO_INTEGER);
            html_princ($str218$Choose_the_new_error_handling_mod);
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_princ($$$Submit_New_Mode);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_princ($str220$__to_initiate_the_change_);
            html_newline(UNPROVIDED);
            html_radio_input($str221$agenda_error_state, $str222$_ignore, eq(mode, $IGNORE), UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_princ($$$Ignore_and_Continue);
            html_newline(UNPROVIDED);
            html_radio_input($str221$agenda_error_state, $str224$_halt, eq(mode, $HALT), UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_princ($$$Halt_and_Display_Reason);
            html_newline(UNPROVIDED);
            html_radio_input($str221$agenda_error_state, $str226$_log, eq(mode, $LOG), UNPROVIDED);
            html_indent(TWO_INTEGER);
            html_princ($$$Log_Errors_to_File);
            html_indent(EIGHT_INTEGER);
            html_filename_input($$$pathname, agenda.get_agenda_log_file(), $int$60);
            html_newline(UNPROVIDED);
            html_reset_input($$$Current_Mode);
            html_indent(TWO_INTEGER);
            html_submit_input($$$Submit_New_Mode, UNPROVIDED, UNPROVIDED);
            html_newline(TWO_INTEGER);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_agenda_error_mode_handler(final SubLObject args) {
        final SubLObject previous_mode = agenda.agenda_error_mode();
        final SubLObject selection_string = html_extract_input($str221$agenda_error_state, args);
        final SubLObject log_file = html_extract_input($$$pathname, args);
        final SubLObject selection = read_from_string_ignoring_errors(selection_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        agenda.set_agenda_error_mode(selection);
        if (NIL != agenda.agenda_logs_errorsP()) {
            if (NIL != string_utilities.non_empty_stringP(log_file)) {
                if (NIL == agenda.set_agenda_log_file(log_file)) {
                    agenda.set_agenda_error_mode(previous_mode);
                }
            } else {
                agenda.set_agenda_error_mode(previous_mode);
            }
        } else {
            agenda.clear_agenda_log_file();
        }
        cb_agenda(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_agenda_local_queue_display() {
        html_hr(UNPROVIDED, UNPROVIDED);
        html_princ($$$You_have_);
        html_markup(html_macros.$html_italic_head$.getGlobalValue());
        html_princ(operation_queues.local_queue_size());
        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
        html_princ($str232$_operations_waiting_in_your_local);
        html_newline(UNPROVIDED);
        html_indent(FOUR_INTEGER);
        cb_link($SHOW_LOCAL_OPS, $str234$Look_at_the_operations_in_the_loc, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        html_indent(FOUR_INTEGER);
        cb_link($DELETE_LOCAL_OPS, $str236$Delete_the_local_queue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        html_indent(FOUR_INTEGER);
        cb_link($DELETE_LOCAL_AND_RESTART, $str238$Delete_the_local_queue_and_restar, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_agenda_error_file(SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str239$cb_agenda_error_file_viewer);
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
            format(html_macros.$html_stream$.getDynamicValue(thread), $str240$Agenda_Error_File___A, filename);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_agenda_error_file_viewer(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != Filesys.probe_file(agenda.get_agenda_log_file())) {
            html_markup(file_utilities.slurp_file(agenda.get_agenda_log_file()));
        } else {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str242$Agenda_log_file_empty___S, agenda.get_agenda_log_file());
        }
        return NIL;
    }

    public static SubLObject cb_link_system1(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str244$cb_system);
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
            html_princ(text);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_link_system() {
        cb_link($SYSTEM1, $str247$System_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_system(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$Cyc_System_Area);
            return NIL;
        }
        operation_communication.possibly_save_transcript_ops();
        html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str7$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$System_Area);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            cb_frames.html_update_cb_status_script();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$90 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_princ($$$System_Area);
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        cb_help_preamble($CB_SYSTEM, $SELF, $str254$Here_are_your_system_settings_);
                        html_newline(TWO_INTEGER);
                        cb_show_system_settings();
                        if (NIL == ke.cyclist_is_guest()) {
                            html_newline(UNPROVIDED);
                            if (NIL != system_parameters.$cb_allow_halt_imageP$.getDynamicValue(thread)) {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                cb_link($CONFIRM_HALT_CYC, $str256$_Halt_this_image_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_indent(TWO_INTEGER);
                            }
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_link($PROCESS_INSPECTOR, $str258$_Process_Inspector_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_indent(TWO_INTEGER);
                            html_newline(UNPROVIDED);
                        }
                        show_transcript_information();
                        show_queue_information();
                        show_historical_information();
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$90, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_cb_write_image_int(SubLObject default_file) {
        if (default_file == UNPROVIDED) {
            default_file = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_hr(UNPROVIDED, UNPROVIDED);
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
            html_hidden_input($str260$cb_write_image_handler, T, UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str261$Write_image_to_file__);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            html_princ($str262$File_name__);
            html_filename_input($$$file, default_file, $int$40);
            html_indent(UNPROVIDED);
            html_submit_input($$$Write_image, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($str266$_Warning__this_may_take_some_time);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_write_image_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Write_Image;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$94 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$95 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
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
                        final SubLObject file = html_extract_input($$$file, args);
                        if ((NIL == file) || (NIL != string_utilities.empty_string_p(file))) {
                            html_princ($str268$Please_enter_a_filename_);
                            html_newline(UNPROVIDED);
                        } else {
                            thread.resetMultipleValues();
                            final SubLObject path = file_utilities.deconstruct_path(file);
                            final SubLObject filename = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject path_string = file_utilities.reconstruct_path(path, $str83$, UNPROVIDED);
                            if (NIL == Filesys.probe_file(path_string)) {
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(file_utilities.why_not_probe_fileP(path_string));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            } else {
                                html_princ($str269$Writing_to_file__);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ(file);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_princ($str270$__);
                                html_flush();
                                sleep(FIVE_INTEGER);
                                Mapper.write_image(file, T);
                                html_princ($str271$__Done_);
                                html_newline(UNPROVIDED);
                            }
                        }
                        html_cb_write_image_int(file);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$95, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$94, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_show_system_settings() {
        final SubLThread thread = SubLProcess.currentSubLThread();
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
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str273$Machine_name__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent(THREE_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(Environment.get_network_name(Environment.get_machine_name($$$unknown)));
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str275$SubL_implementation__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(Environment.lisp_implementation_type());
                    html_princ($$$_);
                    html_princ(Environment.lisp_implementation_version());
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str276$Base_TCP_port__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(system_parameters.$base_tcp_port$.getDynamicValue(thread));
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str277$Image_name__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(cyc_image_id());
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject pid = Environment.get_process_id(UNPROVIDED);
            if (NIL != pid) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str278$Image_Process_ID__);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ(pid);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            final SubLObject start_time = numeric_date_utilities.timestring(system_info.cycl_start_time());
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str279$Image_start_time_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(start_time);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str280$__up__A_, numeric_date_utilities.readable_elapsed_time_string(system_info.cycl_uptime(), ZERO_INTEGER));
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str281$Cyc_revision_level__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(system_info.cyc_revision_string());
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str282$Cyc_code_version__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(misc_utilities.cyc_system_code_string());
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str283$Current_KB__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(operation_communication.kb_version_string());
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return T;
    }

    public static SubLObject show_queue_information() {
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str284$Queue_Information__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_newline(UNPROVIDED);
        html_princ($str285$Master_Transcript_Operations_Read);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(add(operation_communication.kb_op_number(), operation_queues.remote_queue_size()));
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_princ($str286$Master_Transcript_Operations_Read);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(operation_queues.remote_queue_size());
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_princ($str287$Master_Transcript_Operations_Proc);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(operation_communication.remote_ops_processed());
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_princ($str288$Master_Transcript_Operations_Proc);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(subtract(operation_communication.remote_ops_processed(), operation_communication.total_master_transcript_operations_processed()));
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_princ($str289$Master_Transcript_Operations_Proc);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(operation_communication.total_master_transcript_operations_processed());
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_newline(UNPROVIDED);
        html_princ($str290$Unprocessed_Local_Queue_Operation);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(operation_queues.local_queue_size());
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_princ($str291$Local_Queue_Operations_Processed_);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(operation_queues.transcript_queue_size());
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_princ($str292$Current_Local_Transcript_Operatio);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(operation_queues.local_operation_storage_queue_size());
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (operation_communication.total_auxiliary_operations_run().numG(ZERO_INTEGER) || operation_queues.auxiliary_queue_size().numG(ZERO_INTEGER)) {
            html_newline(UNPROVIDED);
            html_princ($str293$Unprocessed_auxiliary_queue_opera);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ(operation_queues.auxiliary_queue_size());
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject show_transcript_information() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str294$Transcript_Information_);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str295$Master_Transcript___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        final SubLObject total_ops = transcript_utilities.total_master_transcript_operations(UNPROVIDED);
        if (NIL != transcript_server.use_transcript_server()) {
            html_princ($$$Maintained_By_Transcript_Server);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str297$___A__A_, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread));
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str298$Operations___);
            html_princ(total_ops);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
        } else {
            if (transcript_utilities.master_transcript().isString()) {
                cb_link($READ_TRANS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                html_princ($$$None);
            }
            if (transcript_utilities.master_transcript().isString()) {
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str301$Characters___);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_princ(file_utilities.get_file_length(transcript_utilities.master_transcript()));
                html_newline(UNPROVIDED);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                if (NIL != system_parameters.$really_count_transcript_ops$.getDynamicValue(thread)) {
                    html_princ($str298$Operations___);
                } else {
                    html_princ($str302$Estimated_Ops___);
                }
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_princ(total_ops);
            }
            html_newline(UNPROVIDED);
        }
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str303$Local_Transcript___);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (NIL != operation_communication.writing_transcriptsP()) {
            cb_link($WRITE_TRANS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            html_princ($$$None);
        }
        html_newline(UNPROVIDED);
        if (NIL != operation_communication.writing_transcriptsP()) {
            html_terpri(UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str298$Operations___);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            if (NIL != operation_communication.transmittingP()) {
                html_princ(operation_communication.total_local_operations_transmitted());
            } else {
                html_princ(operation_queues.local_operation_storage_queue_size());
            }
        }
        return NIL;
    }

    public static SubLObject show_historical_information() {
        html_hr(UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str304$Historical_Information_);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(TWO_INTEGER);
        html_princ($str305$Remote_Operations_Processed__);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(operation_communication.remote_ops_processed());
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_princ($str306$Local_Operations_Recorded___);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(operation_communication.total_local_operations_recorded());
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_princ($str307$Local_Operations_Sent_To_Master_T);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(operation_communication.total_local_operations_transmitted());
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (operation_communication.total_auxiliary_operations_run().numG(ZERO_INTEGER)) {
            html_newline(UNPROVIDED);
            html_princ($str308$Auxiliary_Queue_Operations_Proces);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ(operation_communication.total_auxiliary_operations_run());
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_link_read_trans() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filename = eval(second(assoc($$$read, $transcript_file_shorthand$.getDynamicValue(thread), symbol_function(STRING_EQUAL), UNPROVIDED)));
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str311$cb_system_ready_transcript_file_r);
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
            html_princ(filename);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_transcript_stats_link(filename);
        return NIL;
    }

    public static SubLObject cb_link_write_trans() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filename = eval(second(assoc($$$write, $transcript_file_shorthand$.getDynamicValue(thread), symbol_function(STRING_EQUAL), UNPROVIDED)));
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str50$cb_system_ready_transcript_file_w);
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
            html_princ(filename);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_transcript_stats_link(filename);
        return NIL;
    }

    public static SubLObject cb_link_view_transcript(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str315$cb_system_ready_transcript_file__, filename);
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
            html_princ(file_utilities.normal_pathstring(filename));
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_transcript_stats_link(filename);
        return NIL;
    }

    public static SubLObject html_transcript_stats_link(final SubLObject transcript_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (transcript_filename.isString()) {
            html_indent(UNPROVIDED);
            final SubLObject frame_name_var = cb_frame_name($MAIN);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            html_princ($str318$cb_transcript_viewer_handler_);
            html_princ(cconcatenate($str319$stats_, transcript_filename));
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
                html_princ($str320$_Stats_);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_system_ready_transcript_file(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject filename = args.first();
        if (NIL != assoc(filename, $transcript_file_shorthand$.getDynamicValue(thread), $sym321$STRING_, UNPROVIDED)) {
            filename = eval(second(assoc(filename, $transcript_file_shorthand$.getDynamicValue(thread), symbol_function(STRING_EQUAL), UNPROVIDED)));
        }
        cb_system_get_transcript(filename);
        return NIL;
    }

    public static SubLObject cb_system_get_transcript(final SubLObject filename) {
        SubLObject count = ZERO_INTEGER;
        SubLObject ops = NIL;
        if (filename.isString() && (NIL != Filesys.probe_file(filename))) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filename, $INPUT);
                if (!stream.isStream()) {
                    Errors.error($str324$Unable_to_open__S, filename);
                }
                SubLObject str;
                SubLObject expr;
                for (str = stream, expr = NIL, expr = read_ignoring_errors(str, NIL, NIL); NIL != expr; expr = read_ignoring_errors(str, NIL, NIL)) {
                    ops = cons(expr, ops);
                    count = add(count, ONE_INTEGER);
                }
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
            ops = nreverse(ops);
        }
        cb_system_show_specific_transcript_file(filename, count, ops);
        return NIL;
    }

    public static SubLObject cb_system_show_specific_transcript_file(final SubLObject name, final SubLObject count, final SubLObject ops) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str327$File_Contents__Transcript_File;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$135 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$136 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
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
                        final SubLObject _prev_bind_0_$139 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            final SubLObject href = format(NIL, $str328$cg_cb_system_show_specific_transc, name);
                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(href);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$140 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($str329$View_Transcript_in_KE_Text_format);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$140, thread);
                            }
                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str330$File__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            cb_link($VIEW_TRANSCRIPT, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str331$Operations__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_princ(count);
                            html_newline(TWO_INTEGER);
                            if (name.isString()) {
                                if ((NIL != Filesys.probe_file(name)) && count.numG(ZERO_INTEGER)) {
                                    html_macros.verify_not_within_html_pre();
                                    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$141 = html_macros.$within_html_pre$.currentBinding(thread);
                                    try {
                                        html_macros.$within_html_pre$.bind(T, thread);
                                        SubLObject cdolist_list_var = ops;
                                        SubLObject expr = NIL;
                                        expr = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            cb_form(cb_transform_operation_for_display(expr), ZERO_INTEGER, T);
                                            html_terpri(TWO_INTEGER);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            expr = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_$141, thread);
                                    }
                                    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                } else {
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str332$No_operations_have_been_saved_yet);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_newline(UNPROVIDED);
                                    html_princ(name);
                                }
                            } else {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str333$_s_is_not_a_pathname_string_, name);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$139, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$136, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$135, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_transform_operation_for_display(SubLObject expression) {
        expression = encapsulation.unencapsulate_partial(expression);
        expression = canon_tl.tl_var_to_el_var_transform(expression);
        expression = canon_tl.tl_nart_transform(expression);
        return expression;
    }

    public static SubLObject cb_choose_project(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject purpose = fi.ke_purpose();
        final SubLObject title_var = $$$Choose_KE_Project;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$142 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$143 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$145, thread);
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
                        final SubLObject _prev_bind_0_$146 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str337$cb_choose_project_handler, T, UNPROVIDED);
                            cb_help_preamble($CB_CHOOSE_PROJECT, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str338$Choose_your_project_from_the_opti);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            SubLObject project_list = ongoing_cyc_projects();
                            project_list = kb_utilities.sort_terms(project_list, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_radio_input($$$project, NIL, sublisp_null(purpose), UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_princ($$$No_Project_Selected);
                            html_newline(UNPROVIDED);
                            SubLObject cdolist_list_var = project_list;
                            SubLObject project = NIL;
                            project = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_indent(THREE_INTEGER);
                                html_radio_input($$$project, project, eq(purpose, project), UNPROVIDED);
                                html_indent(TWO_INTEGER);
                                cb_form(project, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                project = cdolist_list_var.first();
                            } 
                            html_reset_input($$$Reset);
                            html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$146, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$144, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$143, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$142, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject ongoing_cyc_projects() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject projects = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$EverythingPSC);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            projects = intersection(isa.all_fort_instances($$Cyc_BasedProject, UNPROVIDED, UNPROVIDED), isa.all_fort_instances($$OngoingStatus, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return projects;
    }

    public static SubLObject cb_choose_project_handler(final SubLObject args) {
        final SubLObject project = html_extract_input($$$project, args);
        if (project.equal($$$nil)) {
            fi.set_ke_purpose(NIL);
        } else {
            fi.set_ke_purpose(cb_guess_fort(project, UNPROVIDED));
        }
        cb_tools.html_update_cb_toolbar_script();
        cb_message_page_with_history($str346$Project_has_been_changed_, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_choose_project(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Current_Project;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str349$cb_choose_project);
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

    public static SubLObject cb_authenticate_the_cyclist(final SubLObject user, final SubLObject passphrase) {
        operation_communication.authenticate_the_cyclist(user, passphrase, $$CycBrowser);
        return cb_after_login_events();
    }

    public static SubLObject cb_set_the_cyclist(final SubLObject user) {
        operation_communication.set_the_cyclist(user);
        return cb_after_login_events();
    }

    public static SubLObject cb_after_login_events() {
        final SubLObject user = operation_communication.the_cyclist();
        if (NIL == operation_communication.the_cyclist_is_guestP()) {
            final SubLObject projects = cb_login_find_default_projects_for_cyclist(user);
            fi.set_ke_purpose(projects.first());
            cb_tools.load_user_preferences();
        }
        return user;
    }

    public static SubLObject cb_login_find_default_projects_for_cyclist(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = $cache_inference_results$.currentBinding(thread);
        try {
            $cache_inference_results$.bind(NIL, thread);
            results = ask_utilities.query_template($sym353$_PROJECT, listS($$cyclistPrimaryProject, cyclist, $list355), $$EverythingPSC, $list356);
        } finally {
            $cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static SubLObject note_image_purpose(final SubLObject purpose) {
        $image_purpose$.setDynamicValue(purpose);
        return purpose;
    }

    public static SubLObject cb_login(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject attempted_name = html_extract_value($str359$new_login_name, args, UNPROVIDED);
        final SubLObject bad_passwordP = stringp(attempted_name);
        final SubLObject title_var = $$$Login_Area;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$147 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                cyc_file_dependencies.javascript($SHA1);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$148 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$150, thread);
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
                        final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str361$cb_login_handler, T, UNPROVIDED);
                            cb_help_preamble($CB_LOGIN, UNPROVIDED, UNPROVIDED);
                            if (NIL != $image_purpose$.getDynamicValue(thread)) {
                                html_princ($str362$This_image_has_been_designated__);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($image_purpose$.getDynamicValue(thread));
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(TWO_INTEGER);
                            }
                            html_princ($$$You_are_currently_logged_in_as_);
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            cb_form(operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_princ($str171$_);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($$$Click_);
                            cb_link($LOGOUT, $$$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_princ($str367$_to_logout_now_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str368$Type_in_your_new_login_name_below);
                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            html_princ($$$Submit);
                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_princ($str369$__button_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            if (NIL != operation_communication.image_requires_authenticationP()) {
                                html_user_id_and_password($str359$new_login_name, $str370$new_login_hashed_password, $$$Cyclist, $$$Password, attempted_name, bad_passwordP);
                            } else {
                                cb_unauthenticated_login_pane($str359$new_login_name);
                            }
                            final SubLObject purpose = fi.ke_purpose();
                            html_newline(TWO_INTEGER);
                            cb_link($CHOOSE_PROJECT, $$$Current_Project, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_princ($str373$___);
                            if (NIL != purpose) {
                                cb_form(purpose, UNPROVIDED, UNPROVIDED);
                            } else {
                                html_princ($$$No_Project_Selected);
                            }
                            html_newline(THREE_INTEGER);
                            html_princ($str374$The_following_are_currently_logge);
                            html_princ(Environment.get_network_name($$$unknown));
                            html_princ($str375$_);
                            html_newline(TWO_INTEGER);
                            final SubLObject user_list = html_kernel.html_interface_users();
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
                            html_markup(FIVE_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$152 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_markup(html_macros.$html_underlined_head$.getGlobalValue());
                                        html_princ($$$User);
                                        html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$154, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_markup(html_macros.$html_underlined_head$.getGlobalValue());
                                        html_princ($$$Local_Machine);
                                        html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$155, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    SubLObject cdolist_list_var = user_list;
                                    SubLObject a_user = NIL;
                                    a_user = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$156 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            SubLObject current;
                                            final SubLObject datum = current = a_user;
                                            SubLObject machine_name = NIL;
                                            SubLObject user_name = NIL;
                                            destructuring_bind_must_consp(current, datum, $list378);
                                            machine_name = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list378);
                                            user_name = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$157 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_form(user_name, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$157, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                if (NIL != web_utilities.current_html_cyc_login_session_idP(machine_name)) {
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_princ(web_utilities.cyc_login_session_id_machine_name(machine_name));
                                                        html_indent(UNPROVIDED);
                                                        html_princ($str379$_Session_id__);
                                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_princ(machine_name);
                                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        html_indent(UNPROVIDED);
                                                        cb_link($FORCE_LOGOUT, machine_name, $str381$_Force_Logout_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_princ($str382$_);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$158, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } else {
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_princ(machine_name);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$159, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$160 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    if (machine_name.equal(html_kernel.http_state_key_for_request())) {
                                                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                                        html_indent(UNPROVIDED);
                                                        html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                        html_glyph($LARR, UNPROVIDED);
                                                        html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                        html_princ($$$_you);
                                                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$160, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } else {
                                                cdestructuring_bind_error(datum, $list378);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$156, thread);
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        a_user = cdolist_list_var.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$153, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$152, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            if (NIL == list_utilities.lengthL(html_kernel.html_interface_users(), TWO_INTEGER, UNPROVIDED)) {
                                html_newline(TWO_INTEGER);
                                cb_link($NOTIFY_ALL_USERS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$151, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$149, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$148, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$147, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_force_logout(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject session_id = html_extract_input($$$sessionId, args);
        final SubLObject logout_result = (NIL != html_kernel.clear_html_state_for_machine(session_id)) ? $SUCCESS : $FAILURE;
        web_utilities.destroy_cyc_login_session(session_id);
        cb_login(UNPROVIDED);
        return logout_result;
    }

    public static SubLObject cb_link_force_logout(final SubLObject session_id, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = session_id;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str391$_a_sessionId__a, $str392$cb_force_logout, session_id);
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

    public static SubLObject cb_unauthenticated_login_pane(final SubLObject user_id_field) {
        html_complete.html_complete_button(user_id_field, $$$Complete, $$HumanCyclist, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_text_input(user_id_field, NIL, $int$27);
        html_indent(UNPROVIDED);
        html_reset_input($$$Clear);
        html_indent(UNPROVIDED);
        html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_link_notify_all_users() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str398$cb_notify_all_users);
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
            html_princ($$$Send_Email_to_all_Users);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_notify_all_users(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Mail_all_users;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$161 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$162 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$163 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$164 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$164, thread);
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
                        html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        html_princ($str402$Please_enter_the_message_you_wish);
                        html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
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
                        final SubLObject _prev_bind_0_$165 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str403$cb_send_email_to_selected_users, T, UNPROVIDED);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$166 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_notify_users_draw_header();
                                SubLObject rows_count = ZERO_INTEGER;
                                SubLObject cdolist_list_var = remove_duplicates(html_kernel.html_interface_users(), symbol_function(EQL), symbol_function(SECOND), UNPROVIDED, UNPROVIDED);
                                SubLObject user_entry = NIL;
                                user_entry = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    SubLObject current;
                                    final SubLObject datum = current = user_entry;
                                    SubLObject machine_name = NIL;
                                    SubLObject user = NIL;
                                    destructuring_bind_must_consp(current, datum, $list404);
                                    machine_name = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list404);
                                    user = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if ((!user.eql(operation_communication.the_cyclist())) && (!user.eql($$Guest))) {
                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$167 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($CENTER));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($TOP));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$168 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    if (rows_count.isZero()) {
                                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_princ($str406$To_);
                                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    }
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$168, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                cb_notify_users_draw_one_user(user);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$167, thread);
                                            }
                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                            rows_count = add(rows_count, ONE_INTEGER);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list404);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    user_entry = cdolist_list_var.first();
                                } 
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$169 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$170 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str408$From__);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$170, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    cb_notify_users_draw_one_user(operation_communication.the_cyclist());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$169, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$171 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$172 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str409$Subject__);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$172, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(THREE_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$173 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(ZERO_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$174 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_text_input($$$subject, $str83$, $int$72);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$174, thread);
                                        }
                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$173, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$171, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$175 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$176 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str412$Message__);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$176, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(THREE_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$177 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($$$message);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($int$72);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(FIVE_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$178 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$178, thread);
                                        }
                                        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$177, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$175, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$166, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            html_submit_input($$$Send_Email, UNPROVIDED, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$165, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$163, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$162, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$161, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_notify_users_draw_one_user(final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_form(user, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(preferred_email_address_for_user(user));
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject input = cb_notify_users_generate_exclusion_mark_from_user(user);
            html_checkbox_input(input, $$$exclude, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return user;
    }

    public static SubLObject cb_notify_users_draw_header() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$179 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$179, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$180 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($$$User);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$180, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$181 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($$$Email_Address);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$181, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$182 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_princ($str417$Exclude_);
                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$182, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject clear_cb_notify_users_generate_exclusion_mark_from_user() {
        final SubLObject cs = $cb_notify_users_generate_exclusion_mark_from_user_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cb_notify_users_generate_exclusion_mark_from_user(final SubLObject user) {
        return memoization_state.caching_state_remove_function_results_with_args($cb_notify_users_generate_exclusion_mark_from_user_caching_state$.getGlobalValue(), list(user), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_notify_users_generate_exclusion_mark_from_user_internal(final SubLObject user) {
        return cconcatenate($str419$exclude_, kb_paths.fort_name(user));
    }

    public static SubLObject cb_notify_users_generate_exclusion_mark_from_user(final SubLObject user) {
        SubLObject caching_state = $cb_notify_users_generate_exclusion_mark_from_user_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER, $cb_notify_users_generate_exclusion_mark_from_user_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, user, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cb_notify_users_generate_exclusion_mark_from_user_internal(user)));
            memoization_state.caching_state_put(caching_state, user, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject preferred_email_address_for_user(final SubLObject user) {
        SubLObject result = NIL;
        result = ask_utilities.ask_variable($ADDRESS, listS($$preferredEMailAddressText, user, $list423), $$CyclistsMt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
        if (NIL == result) {
            return $$$unknown;
        }
        return result.first();
    }

    public static SubLObject cb_send_email_to_selected_users(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = html_extract_input($$$message, args);
        final SubLObject subject = html_extract_input($$$subject, args);
        SubLObject recipients = NIL;
        final SubLObject title_var = $$$Sending_Message;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$183 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$184 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$185 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$186 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$186, thread);
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
                        html_newline(TWO_INTEGER);
                        html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        html_princ($str426$Sending_message_with_following_co);
                        html_newline(TWO_INTEGER);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$187 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$188 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$189 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($$$Subject);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$189, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                                final SubLObject _prev_bind_0_$190 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.verify_not_within_html_pre();
                                    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$191 = html_macros.$within_html_pre$.currentBinding(thread);
                                    try {
                                        html_macros.$within_html_pre$.bind(T, thread);
                                        html_princ(subject);
                                    } finally {
                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_$191, thread);
                                    }
                                    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$190, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$188, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$192 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$193 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str428$Message_);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$193, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
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
                                final SubLObject _prev_bind_0_$194 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.verify_not_within_html_pre();
                                    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$195 = html_macros.$within_html_pre$.currentBinding(thread);
                                    try {
                                        html_macros.$within_html_pre$.bind(T, thread);
                                        html_princ(message);
                                    } finally {
                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_$195, thread);
                                    }
                                    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$194, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$192, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$187, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        html_newline(TWO_INTEGER);
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ($$$Sending_Log);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        html_newline(TWO_INTEGER);
                        html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$196 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var = html_kernel.html_interface_users();
                            SubLObject user_entry = NIL;
                            user_entry = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = user_entry;
                                SubLObject machine = NIL;
                                SubLObject user = NIL;
                                destructuring_bind_must_consp(current, datum, $list430);
                                machine = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list430);
                                user = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    final SubLObject exclude_mark = cb_notify_users_generate_exclusion_mark_from_user(user);
                                    if (NIL != html_extract_input(exclude_mark, args)) {
                                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$197 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($$$Excluding_user_);
                                            cb_form(user, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$197, thread);
                                        }
                                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                    } else {
                                        recipients = cons(user, recipients);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list430);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                user_entry = cdolist_list_var.first();
                            } 
                            final SubLObject from = preferred_email_address_for_user(operation_communication.the_cyclist());
                            SubLObject cdolist_list_var2 = recipients;
                            SubLObject recipient = NIL;
                            recipient = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                final SubLObject to = preferred_email_address_for_user(recipient);
                                thread.resetMultipleValues();
                                final SubLObject message_sent_p = mail_utilities.mail_message(from, to, message, subject, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                final SubLObject error_message = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != message_sent_p) {
                                    html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$198 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$Sent_message_to_);
                                        cb_form(recipient, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$198, thread);
                                    }
                                    html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                } else {
                                    html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$199 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        final SubLObject color_val = html_macros.$html_color_lighter_red$.getGlobalValue();
                                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (NIL != color_val) {
                                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_color(color_val));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$200 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($$$Error_on_sending_message_to_);
                                            cb_form(recipient, UNPROVIDED, UNPROVIDED);
                                            html_princ($str373$___);
                                            html_princ(error_message);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$200, thread);
                                        }
                                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$199, thread);
                                    }
                                    html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                recipient = cdolist_list_var2.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$196, thread);
                        }
                        html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$185, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$184, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$183, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return args;
    }

    public static SubLObject cb_link_login(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str435$Login_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str436$cb_login);
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

    public static SubLObject cb_login_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject input_name = string_utilities.trim_whitespace(html_extract_value($str359$new_login_name, args, $str83$));
        final SubLObject hashed_password = html_extract_value($str370$new_login_hashed_password, args, $str83$);
        final SubLObject login_result = cyc_login(input_name, hashed_password);
        if (login_result == $SUCCESS) {
            if (NIL == possibly_redirect(args)) {
                cb_login_known_cyclist();
            }
            return NIL;
        }
        if (NIL != operation_communication.image_requires_authenticationP()) {
            cb_login(args);
            return NIL;
        }
        final SubLObject dwimmed_cyclist = dwim_cyclist_name_to_cyclist(input_name);
        if (NIL != dwimmed_cyclist) {
            cb_set_the_cyclist(dwimmed_cyclist);
            if (NIL == possibly_redirect(args)) {
                cb_login_known_cyclist();
            }
            return NIL;
        }
        final SubLObject login_name = (length(input_name).numG(ZERO_INTEGER) && ((NIL != find(CHAR_space, input_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != lower_case_p(Strings.sublisp_char(input_name, ZERO_INTEGER))))) ? cyc_navigator_internals.make_ok_cyclist_name(input_name) : input_name;
        final SubLObject constant = fi.fi_find_int(login_name);
        if (login_name.isString() && (NIL != constant_completion_high.valid_constant_name_p(login_name))) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if ((NIL != constant) && (NIL != kb_accessors.human_cyclistP(constant))) {
                    cb_set_the_cyclist(constant);
                    if (NIL == possibly_redirect(args)) {
                        cb_login_known_cyclist();
                    }
                } else
                    if ((NIL != constant) && (NIL == kb_accessors.human_cyclistP(constant))) {
                        cb_login_used_constant(constant);
                    } else {
                        cb_login_unknown_cyclist(login_name);
                    }

            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            cb_login(args);
        }
        return NIL;
    }

    public static SubLObject dwim_cyclist_name_to_cyclist(final SubLObject input_name) {
        final SubLObject candidates = cb_frames.terms_for_browsing(input_name, UNPROVIDED, UNPROVIDED);
        final SubLObject cyclists = list_utilities.remove_if_not($sym441$HUMAN_CYCLIST_, candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != list_utilities.singletonP(cyclists) ? cyclists.first() : NIL;
    }

    public static SubLObject cyc_login(final SubLObject input_name, SubLObject hashed_password) {
        if (hashed_password == UNPROVIDED) {
            hashed_password = NIL;
        }
        if (NIL != operation_communication.non_guest_cyclist_nameP(input_name)) {
            if (NIL != operation_communication.image_requires_authenticationP()) {
                cb_authenticate_the_cyclist(input_name, hashed_password);
            } else {
                cb_set_the_cyclist(input_name);
            }
            if (NIL == operation_communication.the_cyclist_is_guestP()) {
                return $SUCCESS;
            }
        }
        return $FAILURE;
    }

    public static SubLObject possibly_redirect(final SubLObject args) {
        final SubLObject redirect_fn_string = html_extract_input($str442$redirect_handler, args);
        final SubLObject new_arg_start = position($str442$redirect_handler, args, symbol_function(EQUALP), FIRST_LIST, UNPROVIDED, UNPROVIDED);
        if (NIL != redirect_fn_string) {
            final SubLObject redirect_fn = read_from_string_ignoring_errors(redirect_fn_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != html_macros.html_handler_functionP(redirect_fn)) {
                funcall(redirect_fn, nthcdr(number_utilities.f_1X(new_arg_start), args));
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject first_list(final SubLObject obj) {
        if (NIL != list_utilities.proper_list_p(obj)) {
            return obj.first();
        }
        return NIL;
    }

    public static SubLObject cb_login_used_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Known_Constant;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$201 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$202 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$203 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$204 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$204, thread);
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
                        final SubLObject _prev_bind_0_$205 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_back_button(UNPROVIDED, UNPROVIDED);
                            html_princ($str445$The_name_you_typed_in__);
                            cb_form(constant, UNPROVIDED, UNPROVIDED);
                            html_princ($str446$_is_already_used_in_the_Knowledge);
                            html_newline(UNPROVIDED);
                            html_princ($str447$Please_go_back_and_try_a_differen);
                            html_newline(TWO_INTEGER);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$205, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$203, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$202, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$201, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_login_known_cyclist() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_events.cb_post_login_event(operation_communication.the_cyclist());
        html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str7$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Successful_Login);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            cb_tools.html_update_cb_toolbar_script();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$206 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$207 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($$$Successful_Login);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_princ($str449$Welcome__);
                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_princ(cb_user_address_string(operation_communication.the_cyclist()));
                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    html_princ($str450$_);
                    html_newline(TWO_INTEGER);
                    final SubLObject project = fi.ke_purpose();
                    if (NIL != project) {
                        html_princ($$$Your_project_has_been_set_to_);
                        cb_form(project, UNPROVIDED, UNPROVIDED);
                        html_princ($str171$_);
                        html_newline(UNPROVIDED);
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
                        final SubLObject _prev_bind_0_$208 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str349$cb_choose_project, T, UNPROVIDED);
                            html_submit_input($$$Change_Project, UNPROVIDED, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$208, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    } else {
                        html_princ($str453$Your_project_is_currently_not_set);
                        html_newline(UNPROVIDED);
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
                        final SubLObject _prev_bind_0_$209 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str349$cb_choose_project, T, UNPROVIDED);
                            html_submit_input($$$Choose_Project, UNPROVIDED, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$209, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    }
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$210 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        cb_frame_update_message_page_info($$$Login);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_5, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_4, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$210, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$207, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$206, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_user_address_string(SubLObject user) {
        if (user == UNPROVIDED) {
            user = operation_communication.the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        if (NIL != kb_control_vars.lexicon_kb_loaded_p()) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding(thread);
            try {
                pph_vars.$pph_demerit_cutoff$.bind(ONE_INTEGER, thread);
                pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                final SubLObject titles = ask_utilities.query_variable($sym457$_TITLE, listS($$titleOfPerson, user, $list459), $$InferencePSC, UNPROVIDED);
                SubLObject doneP;
                SubLObject rest;
                SubLObject cons;
                SubLObject current;
                SubLObject datum;
                SubLObject known_title;
                SubLObject prefix_string;
                SubLObject target_pred;
                SubLObject family_name;
                SubLObject pred;
                for (doneP = NIL, rest = NIL, rest = $cb_address_titles$.getGlobalValue(); (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                    cons = rest.first();
                    datum = current = cons;
                    known_title = NIL;
                    prefix_string = NIL;
                    destructuring_bind_must_consp(current, datum, $list461);
                    known_title = current.first();
                    current = prefix_string = current.rest();
                    if (NIL != subl_promotions.memberP(known_title, titles, UNPROVIDED, UNPROVIDED)) {
                        target_pred = (known_title.eql($$Sir)) ? $$givenNames : $$familyName;
                        thread.resetMultipleValues();
                        family_name = pph_main.generate_text_wXsentential_force(user, $NONE, list(target_pred), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        pred = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != family_name) && (NIL != genl_predicates.genl_predicateP(pred, target_pred, UNPROVIDED, UNPROVIDED))) {
                            string = cconcatenate(prefix_string, new SubLObject[]{ $$$_, family_name });
                        }
                        doneP = T;
                    }
                }
                if (NIL == string) {
                    thread.resetMultipleValues();
                    final SubLObject given_name = pph_main.generate_text_wXsentential_force(user, $NONE, $list466, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject pred2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != given_name) && (NIL != genl_predicates.genl_predicateP(pred2, $$givenNames, UNPROVIDED, UNPROVIDED))) {
                        string = given_name;
                    }
                }
            } finally {
                pph_vars.$pph_language_mt$.rebind(_prev_bind_2, thread);
                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == string) {
            string = cb_string_for_term(user);
        }
        return string;
    }

    public static SubLObject cb_login_unknown_cyclist(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Unknown_Cyclist;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$211 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$212 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$213 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$214 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$214, thread);
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
                        final SubLObject _prev_bind_0_$215 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str468$cb_create_new_cyclist, name, UNPROVIDED);
                            html_princ($$$The_name_);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ(name);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_princ($$$_is_not_the_name_of_a_known_);
                            cb_form($$HumanCyclist, UNPROVIDED, UNPROVIDED);
                            html_princ($str171$_);
                            html_newline(TWO_INTEGER);
                            if (NIL == ke.cyclist_is_guest()) {
                                html_princ($str471$Do_you_want_to_create_a_new_Cyc_c);
                                html_newline(TWO_INTEGER);
                                cb_back_button($SELF, $$$No);
                                html_submit_input($str472$Yes__Create_Cyclist, UNPROVIDED, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$215, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$213, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$212, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$211, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_create_new_cyclist(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$creating_new_cyclists);
            return NIL;
        }
        final SubLObject name = args.first();
        if (NIL != name) {
            final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
            try {
                api_control_vars.$use_local_queueP$.bind(NIL, thread);
                final SubLObject constant = ke.ke_create(name);
                ke.ke_assert(listS($$isa, constant, $list475), $$CyclistsMt, UNPROVIDED, UNPROVIDED);
                if (NIL != kb_accessors.human_cyclistP(constant)) {
                    cb_set_the_cyclist(constant);
                    cb_login_known_cyclist();
                }
            } finally {
                api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
            }
        } else {
            cb_error($str476$Unable_to_create_a_new_cyclist__w, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_logout(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Logout;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$216 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$217 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$218 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$219 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$219, thread);
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
                        html_princ($str479$You_have_now_logged_out_from_this);
                        html_newline(TWO_INTEGER);
                        html_princ($$$Click_);
                        cb_link($START, $$$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_princ($str481$_to_reconnect_to_Cyc_);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$218, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$217, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$216, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        html_flush();
        html_kernel.clear_html_state_for_machine(html_kernel.http_state_key_for_request());
        return NIL;
    }

    public static SubLObject cb_link_logout(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str483$_Logout_;
        }
        final SubLObject frame_name_var = cb_frame_name($TOP);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str484$cb_logout);
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

    public static SubLObject cb_set_password(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = html_extract_input($$$problem, args);
        final SubLObject login_name = html_extract_value($str487$user_login, args, kb_paths.fort_name(operation_communication.the_cyclist()));
        final SubLObject title_var = $$$Specify_Cyc_Browser_Password;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$220 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                cyc_file_dependencies.javascript($SHA1);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$221 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$222 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$223 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$223, thread);
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
                        if (problem.isString()) {
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($CENTER));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_width$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str489$80_);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$224 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$225 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$226 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$227 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            html_princ($str490$Error_);
                                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$227, thread);
                                        }
                                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$226, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$228 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($$$Could_not_set_password_for_);
                                        html_princ(login_name);
                                        html_princ($str171$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$228, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$225, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$229 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$230 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str492$Reason_);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$230, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$231 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(problem);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$231, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$229, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$224, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                        }
                        html_princ($str493$Please_specify_a_new_password_for);
                        html_newline(UNPROVIDED);
                        html_princ($str494$_Note__Only_you_can_reset_your_ow);
                        html_newline(UNPROVIDED);
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
                        final SubLObject _prev_bind_0_$232 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str495$cb_set_password_handler, T, UNPROVIDED);
                            html_user_id_and_password($str487$user_login, $str370$new_login_hashed_password, $$$Cyclist, $$$New_Password, login_name, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$232, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$222, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$221, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$220, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_set_password(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str498$_Set_Password_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str499$cb_set_password);
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

    public static SubLObject cb_set_password_handler(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject login_name = string_utilities.trim_whitespace(html_extract_value($str487$user_login, args, $str83$));
        final SubLObject password = html_extract_value($str370$new_login_hashed_password, args, $str83$);
        if ((NIL != string_utilities.empty_string_p(login_name)) || (NIL != string_utilities.empty_string_p(password))) {
            return cb_set_password(cb_set_password_args_with_problem(args, $str505$Please_fill_in_all_fields_));
        }
        final SubLObject candidates = cb_frames.terms_for_browsing(login_name, UNPROVIDED, UNPROVIDED);
        final SubLObject cyclists = list_utilities.remove_if_not($sym441$HUMAN_CYCLIST_, candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == cyclists) {
            return cb_set_password(cb_set_password_args_with_problem(args, $str506$No_known_cyclist_by_this_name_));
        }
        if (NIL == list_utilities.singletonP(cyclists)) {
            return cb_set_password(cb_set_password_args_with_problem(args, cconcatenate($str507$The_name_could_mean_any_of_follow, format_nil.format_nil_a_no_copy(cyclists))));
        }
        final SubLObject user = cyclists.first();
        thread.resetMultipleValues();
        final SubLObject status = operation_communication.specify_authentication_info_for_user(user, password, $$CycBrowser);
        final SubLObject message = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != status) {
            return cb_browser.cb_c_predicate_extent($list508);
        }
        return cb_set_password(cb_set_password_args_with_problem(args, message));
    }

    public static SubLObject cb_set_password_args_with_problem(final SubLObject args, final SubLObject message) {
        return cons(list($$$problem, message), args);
    }

    public static SubLObject cb_confirm_halt_cyc(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Halt_Cyc_Image);
        } else {
            final SubLObject title_var = $$$Halt_Cyc_Image;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str7$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$233 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$234 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$235 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$236 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$236, thread);
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
                            final SubLObject frame_name_var = cb_frame_name($TOP);
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
                            final SubLObject _prev_bind_0_$237 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str514$cb_halt_cyc, T, UNPROVIDED);
                                cb_help_preamble($CB_CONFIRM_HALT_CYC, UNPROVIDED, UNPROVIDED);
                                cb_halt_or_restart_confirm($$$halt);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$237, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$235, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$234, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$233, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject cb_link_confirm_halt_cyc(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str517$_Halt_Cyc_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str518$cb_confirm_halt_cyc);
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

    public static SubLObject cb_halt_cyc(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_Halt_Cyc_Image);
        } else
            if (NIL == system_parameters.$cb_allow_halt_imageP$.getDynamicValue(thread)) {
                final SubLObject title_var = $$$Halt_Image_Not_Allowed;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str7$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$238 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$239 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                            final SubLObject _prev_bind_0_$240 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reloadFrameButton);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$241 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$241, thread);
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
                                html_princ($str521$Sorry__this_image_cannot_be_halte);
                                html_flush();
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$240, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$239, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$238, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            } else {
                final SubLObject title_var = $$$Cyc_Image_Halted;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str7$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$242 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$243 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                            final SubLObject _prev_bind_0_$244 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reloadFrameButton);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$245 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$245, thread);
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
                                html_princ($str523$This_Cyc_image_will_be_halted___G);
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$244, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$243, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$242, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
                html_flush();
                final SubLObject _prev_bind_2 = StreamsLow.$error_output$.currentBinding(thread);
                try {
                    StreamsLow.$error_output$.bind(StreamsLow.$debug_io$.getDynamicValue(thread), thread);
                    final SubLObject message = cconcatenate($$$Halted_by_, new SubLObject[]{ format_nil.format_nil_s_no_copy(operation_communication.the_cyclist()), $$$_Via_HTML_interface });
                    operation_communication.halt_cyc_image(message);
                } finally {
                    StreamsLow.$error_output$.rebind(_prev_bind_2, thread);
                }
            }

        return NIL;
    }

    public static SubLObject cb_halt_or_restart_confirm(final SubLObject operation_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_newline(TWO_INTEGER);
        final SubLObject operation_string_$246 = $$$halt;
        html_princ($$$This_will_);
        html_princ(operation_string_$246);
        html_princ($$$_the_Cyc_image_);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($cyc_image_id$.getDynamicValue(thread));
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_princ($str171$_);
        if (operation_queues.transmit_queue_size().isPositive()) {
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_color($$$red));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($str530$Warning__);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $str531$There_are__A_operations_waiting_i, operation_queues.transmit_queue_size());
            html_princ(operation_string);
            html_princ($str532$_now__they_will_be_lost_);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        html_newline(TWO_INTEGER);
        html_princ($str533$Do_you_really_want_to_do_this_);
        html_newline(TWO_INTEGER);
        cb_back_button($SELF, $$$No);
        html_indent(TWO_INTEGER);
        final SubLObject label = cconcatenate($str534$Yes__, new SubLObject[]{ format_nil.format_nil_a_no_copy(operation_string), $$$_system });
        html_submit_input(label, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_transcript_viewer(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject transcript_filename = NIL;
        SubLObject show_stats = NIL;
        SubLObject error_message = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isList()) {
                if ($str538$show_stats.equal(arg.first())) {
                    show_stats = T;
                }
                if ($str539$transcript_filename.equal(arg.first())) {
                    transcript_filename = string_utilities.trim_whitespace(second(arg));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        if (NIL != transcript_filename) {
            if (transcript_filename.equal($str83$)) {
                error_message = $str540$Please_type_in_a_filename_;
            } else
                if (NIL == Filesys.probe_file(transcript_filename)) {
                    error_message = file_utilities.why_not_probe_fileP(transcript_filename);
                }

        }
        if ((NIL != transcript_filename) && (NIL == error_message)) {
            if (NIL != show_stats) {
                transcript_filename = cconcatenate($str319$stats_, transcript_filename);
            }
            cb_transcript_viewer_handler(list(transcript_filename));
        }
        final SubLObject title_var = $$$Transcript_Viewing_Area;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$247 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$248 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$249 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$250 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$250, thread);
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
                        final SubLObject _prev_bind_0_$251 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str542$cb_transcript_viewer_handler, T, UNPROVIDED);
                            cb_help_preamble($CB_TRANSCRIPT_VIEWER, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            cb_link($ALL_LOCAL_TRANS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$251, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str544$cg_cb_transcript_viewer);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($GET);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$252 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str546$cb_transcript_viewer, T, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str547$View_other_transcript_);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            html_indent(TWO_INTEGER);
                            html_princ($str548$Please_type_in_the_full_path_to_t);
                            html_br();
                            html_indent(TWO_INTEGER);
                            final SubLObject transcript_filename2 = (NIL != transcript_filename) ? transcript_filename : file_utilities.normal_pathstring(transcript_utilities.local_transcript());
                            html_filename_input($str539$transcript_filename, transcript_filename2, $int$80);
                            html_newline(UNPROVIDED);
                            if (NIL != error_message) {
                                html_indent(TWO_INTEGER);
                                final SubLObject color_val = $RED;
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != color_val) {
                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(color_val));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$253 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str549$ERROR__);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    html_princ(error_message);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$253, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            html_newline(UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_submit_input($$$Stats, $str538$show_stats, UNPROVIDED);
                            html_indent(FOUR_INTEGER);
                            html_submit_input($$$View_Transcript, UNPROVIDED, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_5, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_4, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$252, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$249, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$248, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$247, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_transcript_viewer_handler(final SubLObject args) {
        final SubLObject show_statistics = string_utilities.starts_with(args.first(), $str319$stats_);
        final SubLObject file = args.first();
        if (NIL != show_statistics) {
            get_statistics_on_transcript(string_utilities.remove_substring(file, $str319$stats_));
        } else {
            display_transcript(file);
        }
        return NIL;
    }

    public static SubLObject display_transcript(final SubLObject transcript) {
        cb_system_get_transcript(transcript);
        return NIL;
    }

    public static SubLObject get_statistics_on_transcript(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stats = transcript_utilities.constant_modifications_in_transcript(file);
        final SubLObject title_var = $$$Transcript_Statistics;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$254 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$255 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$256 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$257 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$257, thread);
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
                        final SubLObject _prev_bind_0_$258 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_back_button(UNPROVIDED, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str555$Transcript__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            final SubLObject frame_name_var = cb_frame_name($MAIN);
                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            cyc_cgi_url_int();
                            html_princ(cconcatenate($str318$cb_transcript_viewer_handler_, file));
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != frame_name_var) {
                                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(frame_name_var);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$259 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(file);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$259, thread);
                            }
                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str331$Operations__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_princ(stats.first());
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str556$Constants_Created__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_princ(list_length(second(stats)));
                            html_newline(UNPROVIDED);
                            SubLObject cdolist_list_var = second(stats);
                            SubLObject creates = NIL;
                            creates = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject constant = constants_high.find_constant(third(creates));
                                if (NIL != constant) {
                                    cb_form(constant, UNPROVIDED, UNPROVIDED);
                                } else {
                                    html_princ(third(creates));
                                }
                                html_indent(TWO_INTEGER);
                                html_terpri(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                creates = cdolist_list_var.first();
                            } 
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str557$Constants_Renamed__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_princ(list_length(third(stats)));
                            html_newline(UNPROVIDED);
                            cdolist_list_var = third(stats);
                            SubLObject renames = NIL;
                            renames = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_princ(third(renames));
                                html_princ($str558$__);
                                final SubLObject constant = constants_high.find_constant(fourth(renames));
                                if (NIL != constant) {
                                    cb_form(constant, UNPROVIDED, UNPROVIDED);
                                } else {
                                    html_princ(fourth(renames));
                                }
                                html_indent(TWO_INTEGER);
                                html_terpri(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                renames = cdolist_list_var.first();
                            } 
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str559$Constants_Killed__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_princ(list_length(fourth(stats)));
                            html_newline(UNPROVIDED);
                            cdolist_list_var = fourth(stats);
                            SubLObject kills = NIL;
                            kills = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_princ(third(kills));
                                html_indent(TWO_INTEGER);
                                html_terpri(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                kills = cdolist_list_var.first();
                            } 
                            html_newline(TWO_INTEGER);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$258, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$256, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$255, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$254, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_all_local_trans() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject transcripts = transcript_utilities.get_all_transcripts_image();
        if (NIL == transcripts) {
            html_princ($str560$No_transcripts_for_this_image_);
        } else {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str561$Local_transcripts_for_this_image_);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(TWO_INTEGER);
            SubLObject cdolist_list_var = reverse(transcript_utilities.get_all_transcripts_image());
            SubLObject file = NIL;
            file = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ(cconcatenate($str562$cb_transcript_viewer_handler_stat, file));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$Stats);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_indent(FIVE_INTEGER);
                frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ(cconcatenate($str318$cb_transcript_viewer_handler_, file));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(file);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_newline(TWO_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                file = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject cb_link_viewer(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Viewer;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str546$cb_transcript_viewer);
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

    public static SubLObject cb_show_local_ops(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Local_Operations;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$260 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$261 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$262 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$263 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$263, thread);
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
                        final SubLObject _prev_bind_0_$264 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str573$cb_confirm_clear_local_queue, T, UNPROVIDED);
                            cb_help_preamble($CB_SHOW_LOCAL_OPS, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            final SubLObject total = operation_queues.local_queue_size();
                            if (total.numE(ZERO_INTEGER)) {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str574$You_have_nothing_in_your_local_qu);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } else {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($$$You_have_);
                                html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_princ(total);
                                html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                html_princ($$$_item);
                                if (total.numG(ONE_INTEGER)) {
                                    html_princ($$$s);
                                }
                                html_princ($str577$_in_your_local_queue_);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str578$Click_this_button_to_erase_the_lo);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_indent(THREE_INTEGER);
                                html_submit_input($$$Clear_Local_Queue, UNPROVIDED, UNPROVIDED);
                                html_newline(UNPROVIDED);
                                html_hr(UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str580$Here_are_the_queued_local_operati);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(TWO_INTEGER);
                                SubLObject cdolist_list_var;
                                final SubLObject operations = cdolist_list_var = operation_queues.local_queue_contents();
                                SubLObject an_op = NIL;
                                an_op = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    an_op = cb_transform_operation_for_display(an_op);
                                    cb_form(an_op, ZERO_INTEGER, T);
                                    html_newline(UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    an_op = cdolist_list_var.first();
                                } 
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$264, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$262, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$261, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$260, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_show_local_ops(SubLObject text) {
        if (text == UNPROVIDED) {
            text = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == text) {
            text = $str582$Local_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str583$cb_show_local_ops);
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
            html_princ(text);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_confirm_clear_local_queue(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Clear_Local_Queue;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$265 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$266 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$267 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$268 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$268, thread);
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
                        final SubLObject _prev_bind_0_$269 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str587$cb_clear_local_queue, T, UNPROVIDED);
                            cb_help_preamble($CB_CONFIRM_CLEAR_LOCAL_QUEUE, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            final SubLObject total = operation_queues.local_queue_size();
                            if (total.numE(ZERO_INTEGER)) {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str574$You_have_nothing_in_your_local_qu);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } else {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($$$Are_you_);
                                html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_princ($$$SURE);
                                html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                html_princ($str590$_you_want_to_clear_your_local_que);
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_princ(total);
                                html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                html_princ($str591$_operations_will_be_lost_);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                cb_back_button($SELF, $$$No);
                                html_indent(TWO_INTEGER);
                                html_submit_input($str592$Yes__Clear_Local_Queue, UNPROVIDED, UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$269, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$267, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$266, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$265, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_confirm_clear_local_and_restart(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Clear_Local_Queue;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$270 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$271 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$272 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$273 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$273, thread);
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
                        final SubLObject _prev_bind_0_$274 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str596$cb_clear_local_and_restart, T, UNPROVIDED);
                            cb_help_preamble($CB_CONFIRM_CLEAR_LOCAL_AND_RESTART, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            final SubLObject total = operation_queues.local_queue_size();
                            if (total.numE(ZERO_INTEGER)) {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str597$You_have_nothing_in_your_local_qu);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                while (NIL == agenda.agenda_running()) {
                                    agenda.start_agenda(TWO_INTEGER);
                                } 
                                cb_message_page_with_history($str598$Local_Queue_Cleared__Agenda_Resta, T);
                            } else {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($$$Are_you_);
                                html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_princ($$$SURE);
                                html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                html_princ($str599$_you_want_to_clear_your_local_que);
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_princ(total);
                                html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                html_princ($str591$_operations_will_be_lost_);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                cb_back_button($SELF, $$$No);
                                html_indent(TWO_INTEGER);
                                html_submit_input($str600$Yes__Clear_Local_Queue_and_Restar, UNPROVIDED, UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$274, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$272, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$271, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$270, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_delete_local_and_restart(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str602$cb_confirm_clear_local_and_restar);
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
            html_princ(text);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_link_delete_local_ops(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str573$cb_confirm_clear_local_queue);
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
            html_princ(text);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_clear_local_and_restart(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        operation_queues.clear_local_queue();
        while (NIL == agenda.agenda_running()) {
            agenda.start_agenda(TWO_INTEGER);
        } 
        cb_message_page_with_history($str598$Local_Queue_Cleared__Agenda_Resta, T);
        return NIL;
    }

    public static SubLObject cb_clear_local_queue(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        operation_queues.clear_local_queue();
        cb_message_page_with_history($$$Local_Queue_Cleared, T);
        return NIL;
    }

    public static SubLObject cb_system_show_specific_transcript_file_as_ke_text(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject transcript_filename = NIL;
        SubLObject output_filename = $str83$;
        SubLObject error_message = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isList()) {
                if ($str610$transcript_filename.equal(arg.first())) {
                    transcript_filename = second(arg);
                }
                if ($str611$output_filename.equal(arg.first())) {
                    output_filename = second(arg);
                }
                if ($str612$error_message.equal(arg.first())) {
                    error_message = second(arg);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        final SubLObject title_var = $str613$Transcript_file_viewed_in_KE_Text;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$275 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$276 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$277 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$278 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$278, thread);
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
                        final SubLObject ke_text_string_list = transcript_utilities.transcript_file_to_ke_text(transcript_filename);
                        if (NIL == ke_text_string_list) {
                            html_princ($str614$The_transcript_file_contains_no_o);
                        } else
                            if (ke_text_string_list.isString()) {
                                html_princ(ke_text_string_list);
                            } else {
                                html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$279 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    cb_help_preamble($CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, UNPROVIDED, UNPROVIDED);
                                    html_newline(TWO_INTEGER);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str330$File__);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    cb_link($VIEW_TRANSCRIPT, transcript_filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_newline(TWO_INTEGER);
                                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str615$cg_cb_write_local_transcript_as_k);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_form_method$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($POST);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$280 = html_macros.$html_safe_print$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$281 = html_macros.$within_html_form$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$282 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_hidden_input($str617$cb_system_write_specific_transcri, T, UNPROVIDED);
                                        html_hidden_input($str610$transcript_filename, transcript_filename, UNPROVIDED);
                                        html_princ($str618$You_may_write_this_transcript_in_);
                                        html_newline(UNPROVIDED);
                                        html_text_input($str611$output_filename, output_filename, $int$60);
                                        html_glyph($NBSP, TWO_INTEGER);
                                        html_submit_input($$$Write_to_File, UNPROVIDED, UNPROVIDED);
                                        html_newline(UNPROVIDED);
                                        if (NIL != error_message) {
                                            final SubLObject color_val = $RED;
                                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                                            if (NIL != color_val) {
                                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_color(color_val));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$281 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                html_princ($str549$ERROR__);
                                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                html_princ(error_message);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$281, thread);
                                            }
                                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                            html_newline(UNPROVIDED);
                                        }
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2_$282, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1_$281, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$280, thread);
                                    }
                                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    html_princ($str621$This_is_what_the_transcript_curre);
                                    html_newline(UNPROVIDED);
                                    html_macros.verify_not_within_html_pre();
                                    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$282 = html_macros.$within_html_pre$.currentBinding(thread);
                                    try {
                                        html_macros.$within_html_pre$.bind(T, thread);
                                        SubLObject cdolist_list_var2 = ke_text_string_list;
                                        SubLObject ke_text_string = NIL;
                                        ke_text_string = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            html_princ(ke_text_string);
                                            html_newline(UNPROVIDED);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            ke_text_string = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_$282, thread);
                                    }
                                    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$279, thread);
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            }

                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$277, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$276, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$275, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_system_write_specific_transcript_file_as_ke_text(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject transcript_filename = NIL;
        SubLObject output_filename = NIL;
        SubLObject error_message = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isList()) {
                if ($str610$transcript_filename.equal(arg.first())) {
                    transcript_filename = string_utilities.trim_whitespace(second(arg));
                }
                if ($str611$output_filename.equal(arg.first())) {
                    output_filename = second(arg);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        if ((NIL != output_filename) && output_filename.equal($str83$)) {
            error_message = $str540$Please_type_in_a_filename_;
        }
        if (NIL != error_message) {
            cb_system_show_specific_transcript_file_as_ke_text(list(list($str610$transcript_filename, transcript_filename), list($str611$output_filename, output_filename), list($str612$error_message, error_message)));
            return NIL;
        }
        final SubLObject error_message_$285 = transcript_utilities.write_specific_transcript_file_as_ke_text(transcript_filename, output_filename);
        if (NIL != error_message_$285) {
            cb_system_show_specific_transcript_file_as_ke_text(list(list($str610$transcript_filename, transcript_filename), list($str611$output_filename, output_filename), list($str612$error_message, error_message_$285)));
        } else {
            final SubLObject title_var = $str623$Transcript_successfully_written_;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str7$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$286 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$287 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$288 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$289 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$289, thread);
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
                            cb_help_preamble($CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, UNPROVIDED, UNPROVIDED);
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$288, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$287, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$286, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject possibly_insert_experience_options() {
        return NIL;
    }

    public static SubLObject declare_cb_system_tools_file() {
        declareFunction(me, "cyc_system_doc_file", "CYC-SYSTEM-DOC-FILE", 0, 0, false);
        declareFunction(me, "cb_mode", "CB-MODE", 0, 1, false);
        declareFunction(me, "insert_transmit_options", "INSERT-TRANSMIT-OPTIONS", 0, 0, false);
        declareFunction(me, "insert_kb_not_current_message", "INSERT-KB-NOT-CURRENT-MESSAGE", 0, 0, false);
        declareFunction(me, "insert_stored_options", "INSERT-STORED-OPTIONS", 0, 0, false);
        declareFunction(me, "insert_local_queue_warning", "INSERT-LOCAL-QUEUE-WARNING", 0, 0, false);
        declareFunction(me, "insert_read_options", "INSERT-READ-OPTIONS", 0, 0, false);
        declareFunction(me, "cb_mode_show_kb_checkpoint_options", "CB-MODE-SHOW-KB-CHECKPOINT-OPTIONS", 1, 1, false);
        declareFunction(me, "oe_patch_messages_enabled_and_email_validP", "OE-PATCH-MESSAGES-ENABLED-AND-EMAIL-VALID?", 0, 0, false);
        declareFunction(me, "cb_mode_handler", "CB-MODE-HANDLER", 1, 0, false);
        declareFunction(me, "cb_link_mode", "CB-LINK-MODE", 0, 0, false);
        declareFunction(me, "display_oe_patch_message", "DISPLAY-OE-PATCH-MESSAGE", 1, 0, false);
        declareFunction(me, "oe_patch_message_subject_prefix", "OE-PATCH-MESSAGE-SUBJECT-PREFIX", 0, 0, false);
        declareFunction(me, "default_oe_patch_message", "DEFAULT-OE-PATCH-MESSAGE", 0, 4, false);
        declareFunction(me, "cb_handle_oe_patch_message", "CB-HANDLE-OE-PATCH-MESSAGE", 1, 0, false);
        declareFunction(me, "send_or_submit_transcript_with_message", "SEND-OR-SUBMIT-TRANSCRIPT-WITH-MESSAGE", 4, 2, false);
        declareFunction(me, "ke_text_for_patch_message", "KE-TEXT-FOR-PATCH-MESSAGE", 0, 1, false);
        declareFunction(me, "cb_link_roll_current_kb", "CB-LINK-ROLL-CURRENT-KB", 0, 1, false);
        declareFunction(me, "cb_roll_current_kb", "CB-ROLL-CURRENT-KB", 0, 1, false);
        declareFunction(me, "cb_handle_roll_current_kb", "CB-HANDLE-ROLL-CURRENT-KB", 1, 0, false);
        declareFunction(me, "cb_agenda_halt_explanation_display", "CB-AGENDA-HALT-EXPLANATION-DISPLAY", 0, 0, false);
        declareFunction(me, "cb_agenda", "CB-AGENDA", 0, 1, false);
        declareFunction(me, "cb_assertion_dependency_counts", "CB-ASSERTION-DEPENDENCY-COUNTS", 1, 0, false);
        declareFunction(me, "cb_link_agenda", "CB-LINK-AGENDA", 0, 1, false);
        declareFunction(me, "cb_abort_agenda", "CB-ABORT-AGENDA", 0, 1, false);
        declareFunction(me, "cb_toggle_agenda_status_display", "CB-TOGGLE-AGENDA-STATUS-DISPLAY", 0, 0, false);
        declareFunction(me, "cb_toggle_agenda_status", "CB-TOGGLE-AGENDA-STATUS", 0, 1, false);
        declareFunction(me, "cb_agenda_error_mode_display", "CB-AGENDA-ERROR-MODE-DISPLAY", 0, 0, false);
        declareFunction(me, "cb_agenda_error_mode_handler", "CB-AGENDA-ERROR-MODE-HANDLER", 1, 0, false);
        declareFunction(me, "cb_agenda_local_queue_display", "CB-AGENDA-LOCAL-QUEUE-DISPLAY", 0, 0, false);
        declareFunction(me, "cb_link_agenda_error_file", "CB-LINK-AGENDA-ERROR-FILE", 0, 1, false);
        declareFunction(me, "cb_agenda_error_file_viewer", "CB-AGENDA-ERROR-FILE-VIEWER", 1, 0, false);
        declareFunction(me, "cb_link_system1", "CB-LINK-SYSTEM1", 1, 0, false);
        declareFunction(me, "cb_link_system", "CB-LINK-SYSTEM", 0, 0, false);
        declareFunction(me, "cb_system", "CB-SYSTEM", 1, 0, false);
        declareFunction(me, "html_cb_write_image_int", "HTML-CB-WRITE-IMAGE-INT", 0, 1, false);
        declareFunction(me, "cb_write_image_handler", "CB-WRITE-IMAGE-HANDLER", 1, 0, false);
        declareFunction(me, "cb_show_system_settings", "CB-SHOW-SYSTEM-SETTINGS", 0, 0, false);
        declareFunction(me, "show_queue_information", "SHOW-QUEUE-INFORMATION", 0, 0, false);
        declareFunction(me, "show_transcript_information", "SHOW-TRANSCRIPT-INFORMATION", 0, 0, false);
        declareFunction(me, "show_historical_information", "SHOW-HISTORICAL-INFORMATION", 0, 0, false);
        declareFunction(me, "cb_link_read_trans", "CB-LINK-READ-TRANS", 0, 0, false);
        declareFunction(me, "cb_link_write_trans", "CB-LINK-WRITE-TRANS", 0, 0, false);
        declareFunction(me, "cb_link_view_transcript", "CB-LINK-VIEW-TRANSCRIPT", 1, 0, false);
        declareFunction(me, "html_transcript_stats_link", "HTML-TRANSCRIPT-STATS-LINK", 1, 0, false);
        declareFunction(me, "cb_system_ready_transcript_file", "CB-SYSTEM-READY-TRANSCRIPT-FILE", 1, 0, false);
        declareFunction(me, "cb_system_get_transcript", "CB-SYSTEM-GET-TRANSCRIPT", 1, 0, false);
        declareFunction(me, "cb_system_show_specific_transcript_file", "CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE", 3, 0, false);
        declareFunction(me, "cb_transform_operation_for_display", "CB-TRANSFORM-OPERATION-FOR-DISPLAY", 1, 0, false);
        declareFunction(me, "cb_choose_project", "CB-CHOOSE-PROJECT", 0, 1, false);
        declareFunction(me, "ongoing_cyc_projects", "ONGOING-CYC-PROJECTS", 0, 0, false);
        declareFunction(me, "cb_choose_project_handler", "CB-CHOOSE-PROJECT-HANDLER", 1, 0, false);
        declareFunction(me, "cb_link_choose_project", "CB-LINK-CHOOSE-PROJECT", 0, 1, false);
        declareFunction(me, "cb_authenticate_the_cyclist", "CB-AUTHENTICATE-THE-CYCLIST", 2, 0, false);
        declareFunction(me, "cb_set_the_cyclist", "CB-SET-THE-CYCLIST", 1, 0, false);
        declareFunction(me, "cb_after_login_events", "CB-AFTER-LOGIN-EVENTS", 0, 0, false);
        declareFunction(me, "cb_login_find_default_projects_for_cyclist", "CB-LOGIN-FIND-DEFAULT-PROJECTS-FOR-CYCLIST", 1, 0, false);
        declareFunction(me, "note_image_purpose", "NOTE-IMAGE-PURPOSE", 1, 0, false);
        declareFunction(me, "cb_login", "CB-LOGIN", 0, 1, false);
        declareFunction(me, "cb_force_logout", "CB-FORCE-LOGOUT", 0, 1, false);
        declareFunction(me, "cb_link_force_logout", "CB-LINK-FORCE-LOGOUT", 1, 1, false);
        declareFunction(me, "cb_unauthenticated_login_pane", "CB-UNAUTHENTICATED-LOGIN-PANE", 1, 0, false);
        declareFunction(me, "cb_link_notify_all_users", "CB-LINK-NOTIFY-ALL-USERS", 0, 0, false);
        declareFunction(me, "cb_notify_all_users", "CB-NOTIFY-ALL-USERS", 0, 1, false);
        declareFunction(me, "cb_notify_users_draw_one_user", "CB-NOTIFY-USERS-DRAW-ONE-USER", 1, 0, false);
        declareFunction(me, "cb_notify_users_draw_header", "CB-NOTIFY-USERS-DRAW-HEADER", 0, 0, false);
        declareFunction(me, "clear_cb_notify_users_generate_exclusion_mark_from_user", "CLEAR-CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER", 0, 0, false);
        declareFunction(me, "remove_cb_notify_users_generate_exclusion_mark_from_user", "REMOVE-CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER", 1, 0, false);
        declareFunction(me, "cb_notify_users_generate_exclusion_mark_from_user_internal", "CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER-INTERNAL", 1, 0, false);
        declareFunction(me, "cb_notify_users_generate_exclusion_mark_from_user", "CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER", 1, 0, false);
        declareFunction(me, "preferred_email_address_for_user", "PREFERRED-EMAIL-ADDRESS-FOR-USER", 1, 0, false);
        declareFunction(me, "cb_send_email_to_selected_users", "CB-SEND-EMAIL-TO-SELECTED-USERS", 1, 0, false);
        declareFunction(me, "cb_link_login", "CB-LINK-LOGIN", 0, 1, false);
        declareFunction(me, "cb_login_handler", "CB-LOGIN-HANDLER", 1, 0, false);
        declareFunction(me, "dwim_cyclist_name_to_cyclist", "DWIM-CYCLIST-NAME-TO-CYCLIST", 1, 0, false);
        declareFunction(me, "cyc_login", "CYC-LOGIN", 1, 1, false);
        declareFunction(me, "possibly_redirect", "POSSIBLY-REDIRECT", 1, 0, false);
        declareFunction(me, "first_list", "FIRST-LIST", 1, 0, false);
        declareFunction(me, "cb_login_used_constant", "CB-LOGIN-USED-CONSTANT", 1, 0, false);
        declareFunction(me, "cb_login_known_cyclist", "CB-LOGIN-KNOWN-CYCLIST", 0, 0, false);
        declareFunction(me, "cb_user_address_string", "CB-USER-ADDRESS-STRING", 0, 1, false);
        declareFunction(me, "cb_login_unknown_cyclist", "CB-LOGIN-UNKNOWN-CYCLIST", 1, 0, false);
        declareFunction(me, "cb_create_new_cyclist", "CB-CREATE-NEW-CYCLIST", 1, 0, false);
        declareFunction(me, "cb_logout", "CB-LOGOUT", 0, 1, false);
        declareFunction(me, "cb_link_logout", "CB-LINK-LOGOUT", 0, 1, false);
        declareFunction(me, "cb_set_password", "CB-SET-PASSWORD", 0, 1, false);
        declareFunction(me, "cb_link_set_password", "CB-LINK-SET-PASSWORD", 0, 1, false);
        declareFunction(me, "cb_set_password_handler", "CB-SET-PASSWORD-HANDLER", 0, 1, false);
        declareFunction(me, "cb_set_password_args_with_problem", "CB-SET-PASSWORD-ARGS-WITH-PROBLEM", 2, 0, false);
        declareFunction(me, "cb_confirm_halt_cyc", "CB-CONFIRM-HALT-CYC", 0, 1, false);
        declareFunction(me, "cb_link_confirm_halt_cyc", "CB-LINK-CONFIRM-HALT-CYC", 0, 1, false);
        declareFunction(me, "cb_halt_cyc", "CB-HALT-CYC", 0, 1, false);
        declareFunction(me, "cb_halt_or_restart_confirm", "CB-HALT-OR-RESTART-CONFIRM", 1, 0, false);
        declareFunction(me, "cb_transcript_viewer", "CB-TRANSCRIPT-VIEWER", 0, 1, false);
        declareFunction(me, "cb_transcript_viewer_handler", "CB-TRANSCRIPT-VIEWER-HANDLER", 1, 0, false);
        declareFunction(me, "display_transcript", "DISPLAY-TRANSCRIPT", 1, 0, false);
        declareFunction(me, "get_statistics_on_transcript", "GET-STATISTICS-ON-TRANSCRIPT", 1, 0, false);
        declareFunction(me, "cb_link_all_local_trans", "CB-LINK-ALL-LOCAL-TRANS", 0, 0, false);
        declareFunction(me, "cb_link_viewer", "CB-LINK-VIEWER", 0, 1, false);
        declareFunction(me, "cb_show_local_ops", "CB-SHOW-LOCAL-OPS", 0, 1, false);
        declareFunction(me, "cb_link_show_local_ops", "CB-LINK-SHOW-LOCAL-OPS", 0, 1, false);
        declareFunction(me, "cb_confirm_clear_local_queue", "CB-CONFIRM-CLEAR-LOCAL-QUEUE", 0, 1, false);
        declareFunction(me, "cb_confirm_clear_local_and_restart", "CB-CONFIRM-CLEAR-LOCAL-AND-RESTART", 0, 1, false);
        declareFunction(me, "cb_link_delete_local_and_restart", "CB-LINK-DELETE-LOCAL-AND-RESTART", 1, 0, false);
        declareFunction(me, "cb_link_delete_local_ops", "CB-LINK-DELETE-LOCAL-OPS", 1, 0, false);
        declareFunction(me, "cb_clear_local_and_restart", "CB-CLEAR-LOCAL-AND-RESTART", 0, 1, false);
        declareFunction(me, "cb_clear_local_queue", "CB-CLEAR-LOCAL-QUEUE", 0, 1, false);
        declareFunction(me, "cb_system_show_specific_transcript_file_as_ke_text", "CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT", 0, 1, false);
        declareFunction(me, "cb_system_write_specific_transcript_file_as_ke_text", "CB-SYSTEM-WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT", 0, 1, false);
        declareFunction(me, "possibly_insert_experience_options", "POSSIBLY-INSERT-EXPERIENCE-OPTIONS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_system_tools_file() {
        defparameter("*CYC-SYSTEM-DOC-COMM-MODE-INDEX*", $str1$com_modes);
        deflexical("*CB-MODE-CHECKPOINT-COLLECTION*", SubLTrampolineFile.maybeDefault($cb_mode_checkpoint_collection$, $cb_mode_checkpoint_collection$, $$Cyc_BasedProject));
        deflexical("*OE-PATCH-MESSAGES-ENABLED?*", SubLTrampolineFile.maybeDefault($sym74$_OE_PATCH_MESSAGES_ENABLED__, $oe_patch_messages_enabledP$, NIL));
        deflexical("*DEFAULT-OE-PATCH-MESSAGE-RECIPIENT*", SubLTrampolineFile.maybeDefault($default_oe_patch_message_recipient$, $default_oe_patch_message_recipient$, $str83$));
        deflexical("*OE-PATCH-MESSAGE-SMTP-HOST*", SubLTrampolineFile.maybeDefault($oe_patch_message_smtp_host$, $oe_patch_message_smtp_host$, $str83$));
        defparameter("*CYC-SYSTEM-DOC-AGENDA-INDEX*", $str159$cyc_agenda);
        defparameter("*IMAGE-PURPOSE*", NIL);
        deflexical("*CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER-CACHING-STATE*", NIL);
        deflexical("*CB-ADDRESS-TITLES*", $list456);
        return NIL;
    }

    public static SubLObject setup_cb_system_tools_file() {
        sethash($CB_MODE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str3$cb_mode_html, NIL));
        html_macros.note_cgi_handler_function(CB_MODE, $HTML_HANDLER);
        declare_defglobal($cb_mode_checkpoint_collection$);
        declare_defglobal($sym74$_OE_PATCH_MESSAGES_ENABLED__);
        html_macros.note_cgi_handler_function(CB_MODE_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($MODE, CB_LINK_MODE, ZERO_INTEGER);
        declare_defglobal($default_oe_patch_message_recipient$);
        declare_defglobal($oe_patch_message_smtp_host$);
        sethash($DISPLAY_OE_PATCH_MESSAGE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str86$display_oe_patch_message_html, NIL));
        html_macros.note_cgi_handler_function(CB_HANDLE_OE_PATCH_MESSAGE, $HTML_HANDLER);
        setup_cb_link_method($ROLL_CURRENT_KB, CB_LINK_ROLL_CURRENT_KB, ONE_INTEGER);
        sethash($CB_REMOTE_FILTERS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str150$cb_remote_filters_html, NIL));
        html_macros.note_cgi_handler_function(CB_ROLL_CURRENT_KB, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_ROLL_CURRENT_KB, $HTML_HANDLER);
        sethash($CB_AGENDA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str163$cb_agenda_html, NIL));
        html_macros.note_cgi_handler_function(CB_AGENDA, $HTML_HANDLER);
        setup_cb_link_method($AGENDA, CB_LINK_AGENDA, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_ABORT_AGENDA, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TOGGLE_AGENDA_STATUS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_AGENDA_ERROR_MODE_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($AGENDA_ERROR_FILE, CB_LINK_AGENDA_ERROR_FILE, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_AGENDA_ERROR_FILE_VIEWER, $HTML_HANDLER);
        setup_cb_link_method($SYSTEM1, CB_LINK_SYSTEM1, ONE_INTEGER);
        setup_cb_link_method($SYSTEM, CB_LINK_SYSTEM, ZERO_INTEGER);
        sethash($CB_SYSTEM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str251$cb_system_html, NIL));
        html_macros.note_cgi_handler_function(CB_SYSTEM, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_WRITE_IMAGE_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($READ_TRANS, CB_LINK_READ_TRANS, ZERO_INTEGER);
        setup_cb_link_method($WRITE_TRANS, CB_LINK_WRITE_TRANS, ZERO_INTEGER);
        setup_cb_link_method($VIEW_TRANSCRIPT, CB_LINK_VIEW_TRANSCRIPT, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_SYSTEM_READY_TRANSCRIPT_FILE, $HTML_HANDLER);
        sethash($CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str326$cb_system_show_specific_transcrip, NIL));
        sethash($CB_CHOOSE_PROJECT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str335$cb_choose_project_html, NIL));
        html_macros.note_cgi_handler_function(CB_CHOOSE_PROJECT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_CHOOSE_PROJECT_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($CHOOSE_PROJECT, CB_LINK_CHOOSE_PROJECT, ONE_INTEGER);
        sethash($CB_LOGIN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str358$cb_login_html, NIL));
        html_macros.note_cgi_handler_function(CB_LOGIN, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_FORCE_LOGOUT, $HTML_HANDLER);
        setup_cb_link_method($FORCE_LOGOUT, CB_LINK_FORCE_LOGOUT, TWO_INTEGER);
        setup_cb_link_method($NOTIFY_ALL_USERS, CB_LINK_NOTIFY_ALL_USERS, ZERO_INTEGER);
        html_macros.note_cgi_handler_function(CB_NOTIFY_ALL_USERS, $HTML_HANDLER);
        memoization_state.note_globally_cached_function(CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER);
        html_macros.note_cgi_handler_function(CB_SEND_EMAIL_TO_SELECTED_USERS, $HTML_HANDLER);
        setup_cb_link_method($LOGIN, CB_LINK_LOGIN, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_LOGIN_HANDLER, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_CREATE_NEW_CYCLIST, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_LOGOUT, $HTML_HANDLER);
        setup_cb_link_method($LOGOUT, CB_LINK_LOGOUT, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_SET_PASSWORD, $HTML_HANDLER);
        setup_cb_link_method($SET_PASSWORD, CB_LINK_SET_PASSWORD, ONE_INTEGER);
        declare_cb_tool($SET_PASSWORD, $$$Set_Password, $$$Passwd, $str504$Set_passwords_for_Cyclist_Authent);
        html_macros.note_cgi_handler_function(CB_SET_PASSWORD_HANDLER, $HTML_HANDLER);
        sethash($CB_CONFIRM_HALT_CYC, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str511$cb_confirm_halt_cyc_html, NIL));
        html_macros.note_cgi_handler_function(CB_CONFIRM_HALT_CYC, $HTML_HANDLER);
        setup_cb_link_method($CONFIRM_HALT_CYC, CB_LINK_CONFIRM_HALT_CYC, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_HALT_CYC, $HTML_HANDLER);
        sethash($CB_TRANSCRIPT_VIEWER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str537$cb_transcript_viewer_html, NIL));
        html_macros.note_cgi_handler_function(CB_TRANSCRIPT_VIEWER, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_TRANSCRIPT_VIEWER_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($ALL_LOCAL_TRANS, CB_LINK_ALL_LOCAL_TRANS, ZERO_INTEGER);
        setup_cb_link_method($VIEWER, CB_LINK_VIEWER, ONE_INTEGER);
        declare_cb_tool($VIEWER, $$$Transcript_Viewer, $$$View, $$$View_Local_Transcripts);
        sethash($CB_SHOW_LOCAL_OPS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str571$cb_show_local_ops_html, NIL));
        html_macros.note_cgi_handler_function(CB_SHOW_LOCAL_OPS, $HTML_HANDLER);
        setup_cb_link_method($SHOW_LOCAL_OPS, CB_LINK_SHOW_LOCAL_OPS, ONE_INTEGER);
        sethash($CB_CONFIRM_CLEAR_LOCAL_QUEUE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str586$cb_confirm_clear_local_queue_html, NIL));
        html_macros.note_cgi_handler_function(CB_CONFIRM_CLEAR_LOCAL_QUEUE, $HTML_HANDLER);
        sethash($CB_CONFIRM_CLEAR_LOCAL_AND_RESTART, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str595$cb_confirm_clear_local_and_restar, NIL));
        html_macros.note_cgi_handler_function(CB_CONFIRM_CLEAR_LOCAL_AND_RESTART, $HTML_HANDLER);
        setup_cb_link_method($DELETE_LOCAL_AND_RESTART, CB_LINK_DELETE_LOCAL_AND_RESTART, ONE_INTEGER);
        setup_cb_link_method($DELETE_LOCAL_OPS, CB_LINK_DELETE_LOCAL_OPS, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_CLEAR_LOCAL_AND_RESTART, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_CLEAR_LOCAL_QUEUE, $HTML_HANDLER);
        sethash($CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str609$cb_system_show_specific_transcrip, NIL));
        html_macros.note_cgi_handler_function(CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, $HTML_HANDLER);
        sethash($CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str609$cb_system_show_specific_transcrip, NIL));
        html_macros.note_cgi_handler_function(CB_SYSTEM_WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_system_tools_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_system_tools_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_system_tools_file();
    }

    
}

/**
 * Total time: 5832 ms
 */
