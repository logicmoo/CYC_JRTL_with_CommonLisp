package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.operation_communication.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.$print_length$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.$print_level$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class operation_communication extends SubLTranslatedFile {
    public static final SubLFile me = new operation_communication();

    public static final String myName = "com.cyc.cycjava.cycl.operation_communication";

    public static final String myFingerPrint = "77a90412ef7b6b2f8e2a3b8e37ce2d7bde68d4198483548393e9a1ba3780f908";

    // defparameter
    public static final SubLSymbol $available_communication_modes$ = makeSymbol("*AVAILABLE-COMMUNICATION-MODES*");

    // defparameter
    public static final SubLSymbol $all_communication_modes$ = makeSymbol("*ALL-COMMUNICATION-MODES*");







    // defparameter
    /**
     * Boolean: If T, then this image can not transmit operations. This parameter
     * should only be set at start up time. It is intended to provide an image that
     * can not transmit operations to the master transcript. It is closely tied to
     * allow-transmitting* and its accessor functions. For more info see
     * allow-transmitting*.
     */
    public static final SubLSymbol $experimental_image$ = makeSymbol("*EXPERIMENTAL-IMAGE*");

    // defparameter
    // The max number of read-transcript ops to load at once
    public static final SubLSymbol $read_transcript_op_limit$ = makeSymbol("*READ-TRANSCRIPT-OP-LIMIT*");

    // deflexical
    public static final SubLSymbol $receiving_remote_operationsP$ = makeSymbol("*RECEIVING-REMOTE-OPERATIONS?*");

    // deflexical
    public static final SubLSymbol $process_local_operationsP$ = makeSymbol("*PROCESS-LOCAL-OPERATIONS?*");

    // deflexical
    public static final SubLSymbol $process_auxiliary_operationsP$ = makeSymbol("*PROCESS-AUXILIARY-OPERATIONS?*");













    // deflexical
    // Determines whether the image requires authentication
    private static final SubLSymbol $image_requires_authenticationP$ = makeSymbol("*IMAGE-REQUIRES-AUTHENTICATION?*");

    // defparameter
    // The Application for which the user is being authenticated.
    public static final SubLSymbol $cyclist_authenticating_app$ = makeSymbol("*CYCLIST-AUTHENTICATING-APP*");

    // defparameter
    // The default MT for looking up the Cyclist authentication information.
    public static final SubLSymbol $default_cyclist_authentication_mt$ = makeSymbol("*DEFAULT-CYCLIST-AUTHENTICATION-MT*");

    // deflexical
    private static final SubLSymbol $transmit_states$ = makeSymbol("*TRANSMIT-STATES*");

    // deflexical
    private static final SubLSymbol $receive_states$ = makeSymbol("*RECEIVE-STATES*");

    // deflexical
    public static final SubLSymbol $build_request_email$ = makeSymbol("*BUILD-REQUEST-EMAIL*");

    // defparameter
    /**
     * This lock controls who actually gets to write to the transcript file, since
     * multiple threads could otherwise open the same file for appending and stomp
     * all over each other.
     */
    private static final SubLSymbol $save_transcript_ops_lock$ = makeSymbol("*SAVE-TRANSCRIPT-OPS-LOCK*");

    // defparameter
    /**
     * This lock controls who actually gets to write to the hl-transcript file,
     * since multiple threads could otherwise open the same file for appending and
     * stomp all over each other.
     */
    private static final SubLSymbol $save_hl_transcript_ops_lock$ = makeSymbol("*SAVE-HL-TRANSCRIPT-OPS-LOCK*");

    // defvar
    public static final SubLSymbol $transcript_load_succeeded$ = makeSymbol("*TRANSCRIPT-LOAD-SUCCEEDED*");





    // defparameter
    private static final SubLSymbol $catch_up_kb_transcript_server_wait_time$ = makeSymbol("*CATCH-UP-KB-TRANSCRIPT-SERVER-WAIT-TIME*");

    // defparameter
    private static final SubLSymbol $catch_up_kb_agenda_halt_wait_time$ = makeSymbol("*CATCH-UP-KB-AGENDA-HALT-WAIT-TIME*");



    // Internal Constants
    public static final SubLList $list0 = list(list(new SubLObject[]{ makeKeyword("MODE"), makeKeyword("RECEIVE-RECORD-TRANSMIT"), makeKeyword("NAME"), makeString("Receive and Record and Send"), makeKeyword("RECEIVE?"), T, makeKeyword("STORE?"), T, makeKeyword("TRANSMIT?"), T }), list(new SubLObject[]{ makeKeyword("MODE"), makeKeyword("RECEIVE-ONLY"), makeKeyword("NAME"), makeString("Storing and Receiving"), makeKeyword("RECEIVE?"), T, makeKeyword("STORE?"), T, makeKeyword("TRANSMIT?"), NIL }), list(new SubLObject[]{ makeKeyword("MODE"), makeKeyword("RECORD-TRANSMIT"), makeKeyword("NAME"), makeString("Storing and Sending"), makeKeyword("RECEIVE?"), NIL, makeKeyword("STORE?"), T, makeKeyword("TRANSMIT?"), T }), list(new SubLObject[]{ makeKeyword("MODE"), makeKeyword("DEAF"), makeKeyword("NAME"), makeString("Storing only"), makeKeyword("RECEIVE?"), NIL, makeKeyword("STORE?"), T, makeKeyword("TRANSMIT?"), NIL }), list(new SubLObject[]{ makeKeyword("MODE"), makeKeyword("TRANSMIT-AND-RECEIVE"), makeKeyword("NAME"), makeString("Sending and Receiving"), makeKeyword("RECEIVE?"), T, makeKeyword("STORE?"), NIL, makeKeyword("TRANSMIT?"), T }), list(new SubLObject[]{ makeKeyword("MODE"), makeKeyword("DEAD-RECEIVE"), makeKeyword("NAME"), makeString("Not Recording but Receiving"), makeKeyword("RECEIVE?"), T, makeKeyword("STORE?"), NIL, makeKeyword("TRANSMIT?"), NIL }), list(new SubLObject[]{ makeKeyword("MODE"), makeKeyword("TRANSMIT-ONLY"), makeKeyword("NAME"), makeString("Sending only"), makeKeyword("RECEIVE?"), NIL, makeKeyword("STORE?"), NIL, makeKeyword("TRANSMIT?"), T }), list(new SubLObject[]{ makeKeyword("MODE"), makeKeyword("DEAD"), makeKeyword("NAME"), makeString("Not Recording or Receiving"), makeKeyword("RECEIVE?"), NIL, makeKeyword("STORE?"), NIL, makeKeyword("TRANSMIT?"), NIL }));







    private static final SubLString $$$unknown_mode = makeString("unknown mode");







    private static final SubLSymbol COMM_MODE_DESC_MODE = makeSymbol("COMM-MODE-DESC-MODE");

    public static final SubLSymbol $startup_communication_mode$ = makeSymbol("*STARTUP-COMMUNICATION-MODE*");



    private static final SubLList $list11 = list(makeSymbol("MEMBER"), makeSymbol("*ALL-COMMUNICATION-MODES*"));

    private static final SubLString $str12$This_is_the_communication_mode_th = makeString("This is the communication mode the cyc image should get \ninitialized to at system startup.");



    public static final SubLSymbol $allow_transmitting$ = makeSymbol("*ALLOW-TRANSMITTING*");

    public static final SubLSymbol $kb_full_transcript_loaded$ = makeSymbol("*KB-FULL-TRANSCRIPT-LOADED*");

    private static final SubLSymbol $TRANSMIT_AND_RECEIVE = makeKeyword("TRANSMIT-AND-RECEIVE");





    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLSymbol $sym20$_RECEIVING_REMOTE_OPERATIONS__ = makeSymbol("*RECEIVING-REMOTE-OPERATIONS?*");

    private static final SubLSymbol $sym21$_PROCESS_LOCAL_OPERATIONS__ = makeSymbol("*PROCESS-LOCAL-OPERATIONS?*");

    private static final SubLSymbol $sym22$_PROCESS_AUXILIARY_OPERATIONS__ = makeSymbol("*PROCESS-AUXILIARY-OPERATIONS?*");

    public static final SubLSymbol $total_remote_operations_run$ = makeSymbol("*TOTAL-REMOTE-OPERATIONS-RUN*");

    public static final SubLSymbol $total_auxiliary_operations_run$ = makeSymbol("*TOTAL-AUXILIARY-OPERATIONS-RUN*");

    public static final SubLSymbol $total_local_operations_recorded$ = makeSymbol("*TOTAL-LOCAL-OPERATIONS-RECORDED*");

    public static final SubLSymbol $total_local_operations_transmitted$ = makeSymbol("*TOTAL-LOCAL-OPERATIONS-TRANSMITTED*");

    public static final SubLSymbol $read_master_transcript_op_number$ = makeSymbol("*READ-MASTER-TRANSCRIPT-OP-NUMBER*");

    public static final SubLSymbol $total_master_transcript_operations_processed$ = makeSymbol("*TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED*");

    private static final SubLSymbol THE_CYCLIST = makeSymbol("THE-CYCLIST");

    private static final SubLObject $$Guest = reader_make_constant_shell(makeString("Guest"));

    private static final SubLSymbol $sym31$THE_CYCLIST_IS_GUEST_ = makeSymbol("THE-CYCLIST-IS-GUEST?");

    private static final SubLString $str32$Return_T_iff_the_current_CyclIst_ = makeString("Return T iff the current CyclIst is the #$Guest account.");

    public static final SubLList $list33 = list(list(makeSymbol("LIST"), makeSymbol("BOOLEANP")));

    private static final SubLSymbol $sym34$IMAGE_REQUIRES_AUTHENTICATION_ = makeSymbol("IMAGE-REQUIRES-AUTHENTICATION?");

    private static final SubLString $str35$_return_non_NIL_iff_this_Cyc_imag = makeString("@return non-NIL iff this Cyc image requires authentication.");

    private static final SubLList $list36 = list(makeSymbol("BOOLEANP"));

    private static final SubLObject $$CycBrowser = reader_make_constant_shell(makeString("CycBrowser"));





    private static final SubLSymbol AUTHENTICATE_THE_CYCLIST = makeSymbol("AUTHENTICATE-THE-CYCLIST");

    private static final SubLList $list41 = list(makeSymbol("NAME"), makeSymbol("ENCRYPTED-PASSWORD"), makeSymbol("&OPTIONAL"), list(makeSymbol("APPLICATION"), makeSymbol("*CYCLIST-AUTHENTICATING-APP*")));

    private static final SubLString $str42$Ensure_that_the_encrypted_passphr = makeString("Ensure that the encrypted passphrase (e.g. SHA1 of password and user name, or similar)\n   is the one recorded for APPLICATION for the Cyclist identified by NAME\n   in the current KB.\n   Otherwise, sets the cyclist to #$Guest.\n   @return FORT-P the current cyclist\n   @see THE-CYCLIST-IS-GUEST?");

    private static final SubLList $list43 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")), list(makeSymbol("ENCRYPTED-PASSWORD"), makeSymbol("STRINGP")), list(makeSymbol("APPLICATION"), makeSymbol("FORT-P")));

    public static final SubLList $list44 = list(makeSymbol("FORT-P"));

    private static final SubLObject $$CyclistsMt = reader_make_constant_shell(makeString("CyclistsMt"));

    private static final SubLObject $$UserOfProgramFn = reader_make_constant_shell(makeString("UserOfProgramFn"));



    private static final SubLObject $$encryptedPasswordForUser = reader_make_constant_shell(makeString("encryptedPasswordForUser"));

    private static final SubLString $str49$Please_login_to_specify_authentic = makeString("Please login to specify authentication information for others.");



    private static final SubLString $str51$Cyclists_can_only_edit_their_own_ = makeString("Cyclists can only edit their own passwords.");

    private static final SubLSymbol SPECIFY_AUTHENTICATION_INFO_FOR_USER = makeSymbol("SPECIFY-AUTHENTICATION-INFO-FOR-USER");

    private static final SubLList $list53 = list(makeSymbol("CYCLIST"), makeSymbol("PASSPHRASE"), makeSymbol("&OPTIONAL"), list(makeSymbol("APPLICATION"), makeSymbol("*CYCLIST-AUTHENTICATING-APP*")));

    private static final SubLString $str54$Store_the_authenitcation_informat = makeString("Store the authenitcation information for the user in the currrent KB.\n   Any valid user may add a password, but only the same user may edit it.\n   @param CYCLIST the cyclist for whom to establish this credential\n   @param PASSPHRASE the password as a STRINGP\n   @param APPLICATION the FORT-P denoting the program or NIL if it is the general credential\n   @return 0 BOOLEANP success indicator\n   @return 1 STRINGP error message, valid if BOOLEANP is NIL");

    private static final SubLList $list55 = list(list(makeSymbol("CYCLIST"), makeSymbol("FORT-P")), list(makeSymbol("PASSPHRASE"), makeSymbol("STRINGP")));

    private static final SubLList $list56 = list(makeSymbol("BOOLEANP"), makeSymbol("STRINGP"));

    private static final SubLString $str57$__Error__A___A__ = makeString("~&Error ~A: ~A~%");

    private static final SubLString $str58$Cannot_assert_passphrase_for__A__ = makeString("Cannot assert passphrase for ~A: ~A");

    private static final SubLString $str59$Cannot_unassert_missing_passphras = makeString("Cannot unassert missing passphrase for ~A ... concurrent modification?");

    private static final SubLString $str60$Cannot_unassert_passphrase__A_for = makeString("Cannot unassert passphrase ~A for ~A: ~A");

    private static final SubLSymbol KB_VERSION_STRING = makeSymbol("KB-VERSION-STRING");

    private static final SubLString $str62$_ = makeString(".");

    private static final SubLSymbol KB_NUMBER_STRING = makeSymbol("KB-NUMBER-STRING");

    private static final SubLString $str64$_4__0D = makeString("~4,'0D");

    private static final SubLSymbol KB_LOADED_STRING = makeSymbol("KB-LOADED-STRING");





    private static final SubLSymbol $sym68$COMMUNICATION_MODE_ = makeSymbol("COMMUNICATION-MODE?");





    private static final SubLSymbol $RECEIVE_RECORD_TRANSMIT = makeKeyword("RECEIVE-RECORD-TRANSMIT");



    private static final SubLString $str73$Unsupported_communication_mode__A = makeString("Unsupported communication mode ~A.~%");

    private static final SubLList $list74 = list(makeString("transmit"), makeString("store"), makeString("none"), makeString("transmit and store"));



    private static final SubLList $list76 = list(makeString("yes"), makeString("no"));

    private static final SubLSymbol TRANSMIT_STATE_P = makeSymbol("TRANSMIT-STATE-P");

    private static final SubLSymbol RECEIVE_STATE_P = makeSymbol("RECEIVE-STATE-P");

    private static final SubLString $$$SENT = makeString("SENT");

    private static final SubLSymbol SET_TO_RECEIVING_EVERYTHING = makeSymbol("SET-TO-RECEIVING-EVERYTHING");

    private static final SubLString $$$transmit_and_store = makeString("transmit and store");

    private static final SubLString $$$store = makeString("store");

    private static final SubLString $$$transmit = makeString("transmit");

    private static final SubLString $$$none = makeString("none");

    private static final SubLString $$$yes = makeString("yes");

    private static final SubLString $$$no = makeString("no");

    private static final SubLString $$$None = makeString("None");

    private static final SubLString $$$Yes = makeString("Yes");

    private static final SubLString $$$CLEARED = makeString("CLEARED");

    private static final SubLString $str90$build_requests_cyc_com = makeString("build-requests@cyc.com");





    private static final SubLString $str93$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str94$_s__ = makeString("~s~%");

    private static final SubLString $$$Save_Transcript_OPS_lock = makeString("Save Transcript OPS lock");

    private static final SubLString $str96$Save_Hl_Transcript_OPS_lock = makeString("Save Hl-Transcript OPS lock");





    private static final SubLString $str99$Bogus_form__S_read_from_transcrip = makeString("Bogus form ~S read from transcript at position ~S");

    private static final SubLString $str100$Skip_forward_until_a_valid_transc = makeString("Skip forward until a valid transcript form is reached");

    private static final SubLString $str101$Assume_the_rest_of_the_operation_ = makeString("Assume the rest of the operation is now there and retry reading it");

    private static final SubLString $str102$Partial_transcript_operation__S_w = makeString("Partial transcript operation ~S was read in");

    public static final SubLSymbol $transcript_read_attempted$ = makeSymbol("*TRANSCRIPT-READ-ATTEMPTED*");

    public static final SubLSymbol $initial_read_transcript_size$ = makeSymbol("*INITIAL-READ-TRANSCRIPT-SIZE*");

    private static final SubLString $str105$The_transcript_file__s_has_alread = makeString("The transcript file ~s has already been accessed, but cannot be found now.");



    private static final SubLString $str107$__Processing_master_transcript_op = makeString("~&Processing master transcript operations~%");



    private static final SubLString $str109$___4__0D__2__0D__2__0D__2__0D__2_ = makeString("~&~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D: processed ~A operations~%");

    private static final SubLString $str110$__Finished_processing__A_master_t = makeString("~&Finished processing ~A master transcript operations~%");



    private static final SubLInteger $int$600 = makeInteger(600);

    private static final SubLSymbol CATCH_UP_TO_CURRENT = makeSymbol("CATCH-UP-TO-CURRENT");

    private static final SubLSymbol CYC_CATCH_UP = makeSymbol("CYC-CATCH-UP");

    private static final SubLSymbol CATCH_UP_KB = makeSymbol("CATCH-UP-KB");

    private static final SubLString $str116$Cannot_catchup_backwards_from_KB_ = makeString("Cannot catchup backwards from KB ~A to ~A");

    private static final SubLString $str117$Cannot_catchup_backwards_from_KB_ = makeString("Cannot catchup backwards from KB ~A to ~A.~A");

    private static final SubLString $str118$_A_ops_to_run_from_KB__A__ = makeString("~A ops to run from KB ~A~%");

    private static final SubLString $$$Shutting_down_agenda = makeString("Shutting down agenda");

    private static final SubLString $str120$Could_not_shut_down_agenda_ = makeString("Could not shut down agenda.");

    private static final SubLString $$$Will_load_submitted_transcripts = makeString("Will load submitted transcripts");

    private static final SubLString $str122$Will_send_submitted_transcript_no = makeString("Will send submitted transcript notification messages");

    private static final SubLString $str123$Will_not_send_submitted_transcrip = makeString("Will not send submitted transcript notification messages");

    private static final SubLString $$$Catching_up_on_ = makeString("Catching up on ");

    private static final SubLString $$$_operations_from_KB_ = makeString(" operations from KB ");

    private static final SubLString $$$_to_ = makeString(" to ");

    private static final SubLString $str127$_A_At_KB__A__waiting__A_seconds_f = makeString("~A At KB ~A, waiting ~A seconds for more operations from transcript server.~%");

    private static final SubLString $str128$Last_operation___S__ = makeString("Last operation: ~S~%");





    private static final SubLString $str131$Evaluating__load_transcript_ = makeString("Evaluating (load-transcript ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str133$ = makeString("");

    private static final SubLString $str134$_ = makeString(")");



    private static final SubLString $str136$___s_operation_A_performed__ = makeString("  ~s operation~A performed~%");

    private static final SubLString $$$s_were = makeString("s were");

    private static final SubLString $$$_was = makeString(" was");



    private static final SubLString $str140$___A__ = makeString("~&~A~%");

    private static final SubLString $str141$___s_constant_A__A__ = makeString("  ~s constant~A ~A~%");

    private static final SubLString $$$created = makeString("created");

    private static final SubLString $$$destroyed = makeString("destroyed");

    private static final SubLString $str144$___s_nart_A__A__ = makeString("  ~s nart~A ~A~%");

    private static final SubLString $str145$___s_assertion_A__A__ = makeString("  ~s assertion~A ~A~%");

    private static final SubLString $str146$___s_kb_hl_support_A__A__ = makeString("  ~s kb-hl-support~A ~A~%");

    private static final SubLString $str147$___s_deduction_A__A__ = makeString("  ~s deduction~A ~A~%");

    private static final SubLSymbol LOAD_TRANSCRIPT_FILE_TO_SUBMIT = makeSymbol("LOAD-TRANSCRIPT-FILE-TO-SUBMIT");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLString $$$Loading_ = makeString("Loading ");

    private static final SubLString $str151$_to_send_____ = makeString(" to send ....");

    private static final SubLString $str152$__Server_Summary____A = makeString("~%Server Summary:  ~A");

    private static final SubLString $str153$___Machine___A = makeString("   Machine: ~A");

    private static final SubLString $str154$__A = makeString(":~A");

    private static final SubLString $str155$__Cyclist___A = makeString("~%Cyclist: ~A");

    private static final SubLString $str156$___KB___A = makeString("   KB: ~A");

    private static final SubLString $str157$___System___A = makeString("   System: ~A");

    private static final SubLString $str158$___A_ = makeString(" (~A)");

    private static final SubLString $str159$__Comm___A = makeString("~%Comm: ~A");

    private static final SubLString $str160$___Agenda___A = makeString("   Agenda: ~A");

    private static final SubLString $str161$__Queues_ = makeString("~%Queues:");

    private static final SubLString $str162$___Aux__ = makeString("   Aux: ");

    private static final SubLString $str163$__d__d_ = makeString("(~d ~d)");

    private static final SubLString $str164$__d_ = makeString("(~d)");

    private static final SubLString $str165$___Remote__ = makeString("   Remote: ");

    private static final SubLString $str166$___Local__ = makeString("   Local: ");

    private static final SubLString $str167$__d__d__d_ = makeString("(~d ~d ~d)");

    private static final SubLList $list168 = list(list(makeSymbol("&KEY"), list(makeSymbol("AGENDA-TIMEOUT"), NIL), list(makeSymbol("DISABLE-TCP-SERVERS?"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list169 = list(makeKeyword("AGENDA-TIMEOUT"), makeKeyword("DISABLE-TCP-SERVERS?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $kw172$DISABLE_TCP_SERVERS_ = makeKeyword("DISABLE-TCP-SERVERS?");

    private static final SubLSymbol $sym173$AGENDA_RUNNING_ = makeUninternedSymbol("AGENDA-RUNNING?");

    private static final SubLSymbol $sym174$SAVED_LOCAL_TRANSCRIPT = makeUninternedSymbol("SAVED-LOCAL-TRANSCRIPT");

    private static final SubLSymbol $sym175$SAVED_READ_TRANSCRIPT = makeUninternedSymbol("SAVED-READ-TRANSCRIPT");

    private static final SubLSymbol $sym176$SAVED_COMMUNICATION_MODE = makeUninternedSymbol("SAVED-COMMUNICATION-MODE");

    private static final SubLSymbol $sym177$SAVED_REMOTE_QUEUE = makeUninternedSymbol("SAVED-REMOTE-QUEUE");

    private static final SubLSymbol $sym178$SAVED_LOCAL_QUEUE = makeUninternedSymbol("SAVED-LOCAL-QUEUE");

    private static final SubLSymbol $sym179$SAVED_AUXILIARY_QUEUE = makeUninternedSymbol("SAVED-AUXILIARY-QUEUE");

    private static final SubLSymbol $sym180$SAVED_TRANSCRIPT_QUEUE = makeUninternedSymbol("SAVED-TRANSCRIPT-QUEUE");

    private static final SubLSymbol $sym181$DISABLED_SERVERS = makeUninternedSymbol("DISABLED-SERVERS");



    private static final SubLList $list183 = list(makeSymbol("PUNLESS"), list(makeSymbol("LOCAL-QUEUE-EMPTY")), list(makeSymbol("NOTING-ACTIVITY"), makeString("Running pending local operations"), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("LOCAL-QUEUE-EMPTY"))), list(makeSymbol("RUN-ONE-LOCAL-OP")))));

    private static final SubLList $list184 = list(makeSymbol("SAVE-TRANSCRIPT-OPS"));

    private static final SubLList $list185 = list(makeSymbol("SAVE-RECENT-EXPERIENCE"));

    private static final SubLList $list186 = list(makeSymbol("SAVE-RECENT-ASKED-QUERIES"));

    private static final SubLList $list187 = list(makeSymbol("FLUSH-HL-TRANSCRIPT-TRACE"));



    private static final SubLList $list189 = list(list(makeSymbol("AGENDA-RUNNING")));

    private static final SubLList $list190 = list(makeSymbol("*LOCAL-TRANSCRIPT*"));

    private static final SubLList $list191 = list(makeSymbol("*READ-TRANSCRIPT*"));

    private static final SubLList $list192 = list(makeSymbol("*COMMUNICATION-MODE*"));

    private static final SubLList $list193 = list(list(makeSymbol("QUEUE-COPY"), makeSymbol("*REMOTE-QUEUE*")));

    private static final SubLList $list194 = list(list(makeSymbol("QUEUE-COPY"), list(makeSymbol("LOCAL-QUEUE"))));

    private static final SubLList $list195 = list(list(makeSymbol("QUEUE-COPY"), makeSymbol("*AUXILIARY-QUEUE*")));

    private static final SubLList $list196 = list(list(makeSymbol("QUEUE-COPY"), makeSymbol("*TRANSCRIPT-QUEUE*")));

    private static final SubLList $list197 = list(NIL);



    private static final SubLSymbol NOTING_PROGRESS = makeSymbol("NOTING-PROGRESS");

    private static final SubLString $str200$Setting_up_safe_KB_dump_environme = makeString("Setting up safe KB dump environment");

    private static final SubLList $list201 = list(makeSymbol("PUNLESS-FEATURE"), makeKeyword("ALLEGRO"), list(makeSymbol("ROOM")));





    private static final SubLList $list204 = list(list(makeSymbol("DISABLE-SOME-TCP-SERVERS")));

    private static final SubLSymbol ENSURE_AGENDA_HALTED = makeSymbol("ENSURE-AGENDA-HALTED");



    private static final SubLList $list207 = list(list(makeSymbol("WARN"), makeString("Agenda was not successfully halted!")));

    private static final SubLList $list208 = list(new SubLObject[]{ list(makeSymbol("CSETQ"), makeSymbol("*MASTER-TRANSCRIPT*"), NIL), list(makeSymbol("CSETQ"), makeSymbol("*LOCAL-TRANSCRIPT*"), NIL), list(makeSymbol("SET-READ-TRANSCRIPT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("*COMMUNICATION-MODE*"), makeKeyword("UNKNOWN")), list(makeSymbol("CLEAR-REMOTE-QUEUE")), list(makeSymbol("CLEAR-LOCAL-QUEUE")), list(makeSymbol("CLEAR-AUXILIARY-QUEUE")), list(makeSymbol("CLEAR-TRANSCRIPT-QUEUE")), list(makeSymbol("SWAP-OUT-ALL-PRISTINE-KB-OBJECTS")), list(makeSymbol("FLUSH-ALL-LOGS")), list(makeSymbol("PUNLESS-FEATURE"), makeKeyword("ALLEGRO"), list(makeSymbol("ROOM"))), list(makeSymbol("KB-STATISTICS")) });

    private static final SubLString $str209$Restoring_pre_dump_environment = makeString("Restoring pre-dump environment");

    private static final SubLList $list210 = list(makeSymbol("SET-MASTER-TRANSCRIPT"));

    private static final SubLSymbol $local_transcript$ = makeSymbol("*LOCAL-TRANSCRIPT*");

    private static final SubLSymbol SET_READ_TRANSCRIPT = makeSymbol("SET-READ-TRANSCRIPT");

    private static final SubLSymbol SET_COMMUNICATION_MODE = makeSymbol("SET-COMMUNICATION-MODE");

    private static final SubLSymbol $remote_queue$ = makeSymbol("*REMOTE-QUEUE*");

    private static final SubLSymbol SET_LOCAL_QUEUE = makeSymbol("SET-LOCAL-QUEUE");

    private static final SubLSymbol $auxiliary_queue$ = makeSymbol("*AUXILIARY-QUEUE*");

    private static final SubLSymbol $transcript_queue$ = makeSymbol("*TRANSCRIPT-QUEUE*");

    private static final SubLList $list218 = list(list(makeSymbol("START-AGENDA")));

    private static final SubLSymbol RE_ENABLE_DISABLED_TCP_SERVERS = makeSymbol("RE-ENABLE-DISABLED-TCP-SERVERS");

    private static final SubLList $list220 = list(list(makeSymbol("&KEY"), list(makeSymbol("AGENDA-TIMEOUT"), NIL), list(makeSymbol("DISABLE-TCP-SERVERS?"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_SAFE_KB_DUMP_ENVIRONMENT = makeSymbol("WITH-SAFE-KB-DUMP-ENVIRONMENT");

    private static final SubLString $str222$Agenda_was_not_successfully_halte = makeString("Agenda was not successfully halted!");

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLString $str224$Minor_version__S_is_not_in_the_ra = makeString("Minor-version ~S is not in the range 0 - 25.");

    private static final SubLString $$$ABCDEFGHIJKLMNOPQRSTUVWXYZ = makeString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

    private static final SubLList $list226 = list(makeSymbol("SYSTEM-NUMBER"), makeSymbol("&REST"), makeSymbol("PATCH-NUMBERS"));



    private static final SubLString $$$p = makeString("p");

    private static final SubLString $str229$cyc_s_D_A__C = makeString("cyc-s~D~A-~C");

    private static final SubLString $str230$cyc_s_D_A_kb_A__C = makeString("cyc-s~D~A-kb~A-~C");

    private static final SubLString $str231$cyc_s_D_A_kb_A_op__A__C = makeString("cyc-s~D~A-kb~A-op-~A-~C");

    private static final SubLString $$$world = makeString("world");



    private static final SubLString $str234$Directory__S_is_not_writeable = makeString("Directory ~S is not writeable");

    private static final SubLInteger $int$26 = makeInteger(26);

    private static final SubLString $$$done = makeString("done");

    private static final SubLString $str237$Halting_Cyc_image____A = makeString("Halting Cyc image : ~A");

    private static final SubLString $$$QUIT = makeString("QUIT");

    private static final SubLSymbol $remote_operations_kb_check_point$ = makeSymbol("*REMOTE-OPERATIONS-KB-CHECK-POINT*");

    private static final SubLSymbol NOTE_KB_CHECK_POINT_REACHED = makeSymbol("NOTE-KB-CHECK-POINT-REACHED");

    private static final SubLSymbol WITH_ASSERTION_MANAGER_FULLY_LOADED = makeSymbol("WITH-ASSERTION-MANAGER-FULLY-LOADED");

    private static final SubLSymbol WITH_DEDUCTION_MANAGER_FULLY_LOADED = makeSymbol("WITH-DEDUCTION-MANAGER-FULLY-LOADED");

    private static final SubLSymbol WITH_KB_HL_SUPPORT_CONTENT_INDEX_FULLY_LOADED = makeSymbol("WITH-KB-HL-SUPPORT-CONTENT-INDEX-FULLY-LOADED");

    private static final SubLSymbol WITH_NART_INDEX_FULLY_LOADED = makeSymbol("WITH-NART-INDEX-FULLY-LOADED");

    private static final SubLSymbol WITH_CONSTANT_INDEX_FULLY_LOADED = makeSymbol("WITH-CONSTANT-INDEX-FULLY-LOADED");

    private static final SubLList $list246 = list(list(makeSymbol("*SAVE-ASKED-QUERIES?*"), NIL));

    private static final SubLString $str247$Timeout_of__A_secs_arrived__witho = makeString("Timeout of ~A secs arrived, without agenda stopping work.");

    private static final SubLInteger $int$60 = makeInteger(60);



    private static final SubLString $str250$Create_directory_and_continue_ = makeString("Create directory and continue.");

    private static final SubLString $str251$Directory__S_does_not_exist_ = makeString("Directory ~S does not exist.");

    private static final SubLString $str252$Still_cannot_write_to_dump_direct = makeString("Still cannot write to dump directory ~A.");





    private static final SubLString $str255$Unknown_dump_style__A_not_impleme = makeString("Unknown dump style ~A not implemented.~%");

    private static final SubLInteger $int$2048 = makeInteger(2048);



    private static final SubLString $str258$_fastscratch_tmp_ = makeString("/fastscratch/tmp/");

    private static final SubLString $str259$Dump_incremental_KB_trivially_fin = makeString("Dump incremental KB trivially finished: dump directory and current units are both ~S");

    private static final SubLString $str260$__Successfully_dumped_incremental = makeString("~&Successfully dumped incremental units to: ~A~%");

    private static final SubLString $$$op = makeString("op");

    private static final SubLString $str262$Loading_transformation_rule_stati = makeString("Loading transformation rule statistics into incremental KB");

    private static final SubLString $str263$incremental_stats = makeString("incremental-stats");

    private static final SubLString $str264$received_experience = makeString("received-experience");

    private static final SubLSymbol $TOTAL_REMOTE_OPERATIONS_RUN = makeKeyword("TOTAL-REMOTE-OPERATIONS-RUN");

    private static final SubLSymbol $READ_MASTER_TRANSCRIPT_OP_NUMBER = makeKeyword("READ-MASTER-TRANSCRIPT-OP-NUMBER");

    private static final SubLList $list267 = list(makeSymbol("&KEY"), makeSymbol("TOTAL-REMOTE-OPERATIONS-RUN"), makeSymbol("READ-MASTER-TRANSCRIPT-OP-NUMBER"));

    private static final SubLList $list268 = list(makeKeyword("TOTAL-REMOTE-OPERATIONS-RUN"), makeKeyword("READ-MASTER-TRANSCRIPT-OP-NUMBER"));



    static final boolean assertionsDisabledSynth = true;

    public static SubLObject comm_mode_desc_mode(final SubLObject desc) {
        return getf(desc, $MODE, $UNKNOWN);
    }

    public static SubLObject comm_mode_desc_name(final SubLObject desc) {
        return getf(desc, $NAME, $$$unknown_mode);
    }

    public static SubLObject comm_mode_desc_receivingP(final SubLObject desc) {
        return getf(desc, $RECEIVE_, NIL);
    }

    public static SubLObject comm_mode_desc_storingP(final SubLObject desc) {
        return getf(desc, $STORE_, NIL);
    }

    public static SubLObject comm_mode_desc_transmittingP(final SubLObject desc) {
        return getf(desc, $TRANSMIT_, NIL);
    }

    public static SubLObject get_communication_mode_description(final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return find(mode, $available_communication_modes$.getDynamicValue(thread), EQL, COMM_MODE_DESC_MODE, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject comm_mode_name(final SubLObject mode) {
        return comm_mode_desc_name(get_communication_mode_description(mode));
    }

    public static SubLObject comm_mode_receivingP(final SubLObject mode) {
        return comm_mode_desc_receivingP(get_communication_mode_description(mode));
    }

    public static SubLObject comm_mode_storingP(final SubLObject mode) {
        return comm_mode_desc_storingP(get_communication_mode_description(mode));
    }

    public static SubLObject comm_mode_transmittingP(final SubLObject mode) {
        return comm_mode_desc_transmittingP(get_communication_mode_description(mode));
    }

    public static SubLObject compile_legacy_communication_mode_information() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject modes = NIL;
        SubLObject cdolist_list_var = $available_communication_modes$.getDynamicValue(thread);
        SubLObject description = NIL;
        description = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mode = comm_mode_desc_mode(description);
            final SubLObject name = comm_mode_desc_name(description);
            modes = cons(cons(mode, name), modes);
            cdolist_list_var = cdolist_list_var.rest();
            description = cdolist_list_var.first();
        } 
        return nreverse(modes);
    }

    public static SubLObject find_communication_mode(final SubLObject receiveP, final SubLObject storeP, final SubLObject transmitP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $available_communication_modes$.getDynamicValue(thread);
        SubLObject description = NIL;
        description = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((receiveP.eql(comm_mode_desc_receivingP(description)) && storeP.eql(comm_mode_desc_storingP(description))) && transmitP.eql(comm_mode_desc_transmittingP(description))) {
                return comm_mode_desc_mode(description);
            }
            cdolist_list_var = cdolist_list_var.rest();
            description = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject allow_transmitting() {
        return $allow_transmitting$.getGlobalValue();
    }

    public static SubLObject set_allow_transmitting(final SubLObject v_boolean) {
        $allow_transmitting$.setGlobalValue(v_boolean);
        return $allow_transmitting$.getGlobalValue();
    }

    public static SubLObject kb_full_transcript_loaded() {
        return $kb_full_transcript_loaded$.getGlobalValue();
    }

    public static SubLObject set_kb_full_transcript_loaded(final SubLObject v_boolean) {
        $kb_full_transcript_loaded$.setGlobalValue(v_boolean);
        return $kb_full_transcript_loaded$.getGlobalValue();
    }

    public static SubLObject experimental_image() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $experimental_image$.getDynamicValue(thread);
    }

    public static SubLObject set_experimental_image(final SubLObject v_boolean) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (communication_mode().equal($TRANSMIT_AND_RECEIVE)) {
            set_communication_mode($RECEIVE_ONLY);
        }
        if (communication_mode().equal($TRANSMIT_ONLY)) {
            set_communication_mode($DEAF);
        }
        operation_queues.clear_transmit_queue();
        operation_queues.clear_local_operation_storage_queue();
        set_allow_transmitting(makeBoolean(NIL == v_boolean));
        $experimental_image$.setDynamicValue(v_boolean, thread);
        return $experimental_image$.getDynamicValue(thread);
    }

    public static SubLObject read_transcript_op_limit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $read_transcript_op_limit$.getDynamicValue(thread);
    }

    public static SubLObject set_read_transcript_op_limit(final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $read_transcript_op_limit$.setDynamicValue(number, thread);
        return $read_transcript_op_limit$.getDynamicValue(thread);
    }

    public static SubLObject dont_record_operations_locally() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_parameters.$dont_record_operations_locally$.getDynamicValue(thread);
    }

    public static SubLObject set_dont_record_operations_locally(final SubLObject v_boolean) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        system_parameters.$dont_record_operations_locally$.setDynamicValue(v_boolean, thread);
        return system_parameters.$dont_record_operations_locally$.getDynamicValue(thread);
    }

    public static SubLObject receiving_remote_operationsP() {
        return $receiving_remote_operationsP$.getGlobalValue();
    }

    public static SubLObject set_receiving_remote_operationsP(final SubLObject v_boolean) {
        $receiving_remote_operationsP$.setGlobalValue(v_boolean);
        return $receiving_remote_operationsP$.getGlobalValue();
    }

    public static SubLObject process_local_operationsP() {
        return $process_local_operationsP$.getGlobalValue();
    }

    public static SubLObject set_process_local_operationsP(final SubLObject v_boolean) {
        $process_local_operationsP$.setGlobalValue(v_boolean);
        return $process_local_operationsP$.getGlobalValue();
    }

    public static SubLObject process_auxiliary_operationsP() {
        return $process_auxiliary_operationsP$.getGlobalValue();
    }

    public static SubLObject set_process_auxiliary_operationsP(final SubLObject v_boolean) {
        $process_auxiliary_operationsP$.setGlobalValue(v_boolean);
        return $process_auxiliary_operationsP$.getGlobalValue();
    }

    public static SubLObject saving_operationsP() {
        return makeBoolean((NIL != storingP()) || (NIL != transmittingP()));
    }

    public static SubLObject total_remote_operations_run() {
        return $total_remote_operations_run$.getGlobalValue();
    }

    public static SubLObject set_total_remote_operations_run(final SubLObject number) {
        $total_remote_operations_run$.setGlobalValue(number);
        return $total_remote_operations_run$.getGlobalValue();
    }

    public static SubLObject total_auxiliary_operations_run() {
        return $total_auxiliary_operations_run$.getGlobalValue();
    }

    public static SubLObject inc_total_auxiliary_operations_run() {
        $total_auxiliary_operations_run$.setGlobalValue(add($total_auxiliary_operations_run$.getGlobalValue(), ONE_INTEGER));
        return $total_auxiliary_operations_run$.getGlobalValue();
    }

    public static SubLObject total_local_operations_recorded() {
        return $total_local_operations_recorded$.getGlobalValue();
    }

    public static SubLObject inc_total_local_operations_recorded() {
        $total_local_operations_recorded$.setGlobalValue(add($total_local_operations_recorded$.getGlobalValue(), ONE_INTEGER));
        return $total_local_operations_recorded$.getGlobalValue();
    }

    public static SubLObject total_local_operations_transmitted() {
        return $total_local_operations_transmitted$.getGlobalValue();
    }

    public static SubLObject inc_total_local_operations_transmitted() {
        $total_local_operations_transmitted$.setGlobalValue(add($total_local_operations_transmitted$.getGlobalValue(), ONE_INTEGER));
        return $total_local_operations_transmitted$.getGlobalValue();
    }

    public static SubLObject read_master_transcript_op_number() {
        return $read_master_transcript_op_number$.getGlobalValue();
    }

    public static SubLObject set_read_master_transcript_op_number(final SubLObject number) {
        $read_master_transcript_op_number$.setGlobalValue(number);
        return number;
    }

    public static SubLObject total_master_transcript_operations_processed() {
        return $total_master_transcript_operations_processed$.getGlobalValue();
    }

    public static SubLObject set_total_master_transcript_operations_processed(final SubLObject number) {
        $total_master_transcript_operations_processed$.setGlobalValue(number);
        return $total_master_transcript_operations_processed$.getGlobalValue();
    }

    public static SubLObject the_cyclist() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return api_control_vars.$the_cyclist$.getDynamicValue(thread);
    }

    public static SubLObject set_the_cyclist(SubLObject name) {
        if (name == UNPROVIDED) {
            name = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = map_cyclist_name_to_cyclist_term(name);
        api_control_vars.$the_cyclist$.setDynamicValue(fort, thread);
        return api_control_vars.$the_cyclist$.getDynamicValue(thread);
    }

    public static SubLObject map_cyclist_name_to_cyclist_term(final SubLObject name) {
        final SubLObject cyclist_term = (name.isString()) ? fi.fi_find_int(name) : NIL != forts.valid_fortP(name) ? name : NIL;
        if ((NIL != cyclist_term) && (NIL != kb_accessors.cyclistP(cyclist_term))) {
            return cyclist_term;
        }
        return $$Guest;
    }

    public static SubLObject non_guest_cyclist_nameP(final SubLObject name) {
        final SubLObject cyclist = map_cyclist_name_to_cyclist_term(name);
        return makeBoolean((NIL != forts.fort_p(cyclist)) && (NIL == kb_utilities.kbeq(cyclist, $$Guest)));
    }

    public static SubLObject the_cyclist_is_guestP() {
        return equal(the_cyclist(), $$Guest);
    }

    public static SubLObject image_requires_authenticationP() {
        return list_utilities.sublisp_boolean($image_requires_authenticationP$.getGlobalValue());
    }

    public static SubLObject authenticate_the_cyclist(final SubLObject name, final SubLObject encrypted_password, SubLObject application) {
        if (application == UNPROVIDED) {
            application = $cyclist_authenticating_app$.getDynamicValue();
        }
        SubLTrampolineFile.enforceType(name, STRINGP);
        SubLTrampolineFile.enforceType(encrypted_password, STRINGP);
        SubLTrampolineFile.enforceType(application, FORT_P);
        set_the_cyclist(UNPROVIDED);
        final SubLObject cyclist = map_cyclist_name_to_cyclist_term(name);
        if (!cyclist.equal($$Guest)) {
            final SubLObject fetched_password = lookup_password_for_cyclist_from_kb(cyclist, application);
            if (fetched_password.isString() && (NIL != Strings.stringE(encrypted_password, fetched_password, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                api_control_vars.$the_cyclist$.setDynamicValue(cyclist);
            }
        }
        return the_cyclist();
    }

    public static SubLObject lookup_password_for_cyclist_from_kb(final SubLObject cyclist, SubLObject application) {
        if (application == UNPROVIDED) {
            application = $cyclist_authenticating_app$.getDynamicValue();
        }
        SubLObject password = NIL;
        if (NIL != forts.fort_p(application)) {
            final SubLObject raw_compound_cyclist = make_binary_formula($$UserOfProgramFn, application, cyclist);
            final SubLObject compound_cyclist = narts_high.find_nart(raw_compound_cyclist);
            if (NIL == compound_cyclist) {
                password = lookup_password_for_cyclist_from_kb(cyclist, NIL);
            } else {
                password = get_stored_password_for_cyclist_from_kb(compound_cyclist);
                if (NIL == password) {
                    password = lookup_password_for_cyclist_from_kb(cyclist, NIL);
                }
            }
        } else {
            password = get_stored_password_for_cyclist_from_kb(cyclist);
        }
        return password;
    }

    public static SubLObject get_stored_password_for_cyclist_from_kb(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject passwords = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind($default_cyclist_authentication_mt$.getDynamicValue(thread), thread);
            passwords = kb_mapping_utilities.fpred_value(cyclist, $$encryptedPasswordForUser, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return passwords.isCons() ? passwords.first() : passwords;
    }

    public static SubLObject specify_authentication_info_for_user(final SubLObject cyclist, final SubLObject passphrase, SubLObject application) {
        if (application == UNPROVIDED) {
            application = $cyclist_authenticating_app$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(cyclist, FORT_P);
        SubLTrampolineFile.enforceType(passphrase, STRINGP);
        if (NIL != the_cyclist_is_guestP()) {
            return values(NIL, $str49$Please_login_to_specify_authentic);
        }
        final SubLObject el_context_term = (NIL == application) ? cyclist : make_binary_formula($$UserOfProgramFn, application, cyclist);
        final SubLObject hl_context_term = (NIL == application) ? cyclist : narts_high.find_nart(el_context_term);
        if ((NIL == hl_context_term) || (NIL == get_stored_password_for_cyclist_from_kb(hl_context_term))) {
            SubLObject msg = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        assert_stored_password_for_cyclist_in_kb(el_context_term, passphrase);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            return values(makeBoolean(!msg.isString()), msg);
        }
        if (!the_cyclist().equal(cyclist)) {
            return values(NIL, $str51$Cyclists_can_only_edit_their_own_);
        }
        unassert_stored_password_for_cyclist_in_kb(hl_context_term);
        return specify_authentication_info_for_user(cyclist, passphrase, application);
    }

    public static SubLObject assert_stored_password_for_cyclist_in_kb(final SubLObject hl_context_term, final SubLObject passphrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject successP = ke.ke_assert_now(list($$encryptedPasswordForUser, hl_context_term, passphrase), $default_cyclist_authentication_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        final SubLObject problems = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successP) {
            SubLObject msg = NIL;
            SubLObject s = NIL;
            try {
                s = make_private_string_output_stream();
                SubLObject remainder;
                SubLObject type;
                SubLObject errmsg;
                for (remainder = NIL, remainder = problems; NIL != remainder; remainder = cddr(remainder)) {
                    type = remainder.first();
                    errmsg = cadr(remainder);
                    format(s, $str57$__Error__A___A__, type, errmsg);
                }
                msg = get_output_stream_string(s);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(s, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            Errors.error($str58$Cannot_assert_passphrase_for__A__, hl_context_term, msg);
        }
        return hl_context_term;
    }

    public static SubLObject unassert_stored_password_for_cyclist_in_kb(final SubLObject hl_context_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject passphrase = get_stored_password_for_cyclist_from_kb(hl_context_term);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!passphrase.isString())) {
            Errors.error($str59$Cannot_unassert_missing_passphras, hl_context_term);
        }
        thread.resetMultipleValues();
        final SubLObject successP = ke.ke_unassert_now(list($$encryptedPasswordForUser, hl_context_term, passphrase), $default_cyclist_authentication_mt$.getDynamicValue(thread));
        final SubLObject problems = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == successP) {
            SubLObject msg = NIL;
            SubLObject s = NIL;
            try {
                s = make_private_string_output_stream();
                SubLObject remainder;
                SubLObject type;
                SubLObject errmsg;
                for (remainder = NIL, remainder = problems; NIL != remainder; remainder = cddr(remainder)) {
                    type = remainder.first();
                    errmsg = cadr(remainder);
                    format(s, $str57$__Error__A___A__, type, errmsg);
                }
                msg = get_output_stream_string(s);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(s, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            Errors.error($str60$Cannot_unassert_passphrase__A_for, hl_context_term, passphrase, msg);
        }
        return hl_context_term;
    }

    public static SubLObject kb_op_number() {
        return read_master_transcript_op_number().numG(ZERO_INTEGER) ? read_master_transcript_op_number() : ZERO_INTEGER;
    }

    public static SubLObject kb_version_string() {
        if (read_master_transcript_op_number().numG(ZERO_INTEGER)) {
            return cconcatenate(format_nil.format_nil_a_no_copy(kb_loaded()), new SubLObject[]{ $str62$_, format_nil.format_nil_a_no_copy(read_master_transcript_op_number()) });
        }
        return format_nil.format_nil_a(kb_loaded());
    }

    public static SubLObject remote_ops_processed() {
        return total_remote_operations_run();
    }

    public static SubLObject kb_number_string(SubLObject kb_num) {
        if (kb_num == UNPROVIDED) {
            kb_num = kb_loaded();
        }
        return format(NIL, $str64$_4__0D, kb_num);
    }

    public static SubLObject kb_loaded_string() {
        return kb_number_string(UNPROVIDED);
    }

    public static SubLObject available_communication_modes(SubLObject remove_current_modeP) {
        if (remove_current_modeP == UNPROVIDED) {
            remove_current_modeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject available = NIL;
        available = Mapping.mapcar(symbol_function(CAR), $all_communication_modes$.getDynamicValue(thread));
        if (NIL != remove_current_modeP) {
            available = remove(communication_mode(), available, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return available;
    }

    public static SubLObject communication_modeP(final SubLObject mode) {
        return subl_promotions.memberP(mode, available_communication_modes(UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject communication_mode_name(final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != keywordp(mode) : "Types.keywordp(mode) " + "CommonSymbols.NIL != Types.keywordp(mode) " + mode;
        return assoc(mode, $all_communication_modes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject communication_mode() {
        return $communication_mode$.getGlobalValue();
    }

    public static SubLObject set_communication_mode_internal(final SubLObject mode) {
        $communication_mode$.setGlobalValue(mode);
        return $communication_mode$.getGlobalValue();
    }

    public static SubLObject set_communication_mode(SubLObject keyword) {
        if (keyword == UNPROVIDED) {
            keyword = $RECEIVE_ONLY;
        }
        assert NIL != communication_modeP(keyword) : "operation_communication.communication_modeP(keyword) " + "CommonSymbols.NIL != operation_communication.communication_modeP(keyword) " + keyword;
        if (NIL == cyc_image_id()) {
            set_cyc_image_id();
        }
        if (!communication_mode().eql(keyword)) {
            if (NIL == transcript_utilities.master_transcript()) {
                transcript_utilities.set_master_transcript(UNPROVIDED);
            }
            if ((NIL != $init_file_loadedP$.getGlobalValue()) && (NIL != transcript_utilities.local_transcript())) {
                save_transcript_ops();
            }
            final SubLObject pcase_var = keyword;
            if (pcase_var.eql($DEAD)) {
                set_to_dead();
            } else
                if (pcase_var.eql($DEAD_RECEIVE)) {
                    set_to_dead_receive();
                } else
                    if (pcase_var.eql($DEAF)) {
                        set_to_deaf();
                    } else
                        if (pcase_var.eql($RECEIVE_ONLY)) {
                            set_to_receive_only();
                        } else
                            if (pcase_var.eql($RECEIVE_RECORD_TRANSMIT)) {
                                set_to_receive_record_transmit();
                            } else
                                if (pcase_var.eql($RECORD_TRANSMIT)) {
                                    set_to_record_transmit();
                                } else
                                    if (pcase_var.eql($TRANSMIT_AND_RECEIVE)) {
                                        set_to_transmit_and_receive();
                                    } else
                                        if (pcase_var.eql($TRANSMIT_ONLY)) {
                                            set_to_transmit_only();
                                        } else {
                                            Errors.error($str73$Unsupported_communication_mode__A, keyword);
                                        }







            $use_transcriptP$.setDynamicValue(saving_operationsP());
        }
        return communication_mode();
    }

    public static SubLObject transmit_state_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $transmit_states$.getGlobalValue(), STRING_EQUAL, UNPROVIDED);
    }

    public static SubLObject receive_state_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $receive_states$.getGlobalValue(), STRING_EQUAL, UNPROVIDED);
    }

    public static SubLObject set_communication_state(final SubLObject transmit_state, final SubLObject receive_state) {
        assert NIL != transmit_state_p(transmit_state) : "operation_communication.transmit_state_p(transmit_state) " + "CommonSymbols.NIL != operation_communication.transmit_state_p(transmit_state) " + transmit_state;
        assert NIL != receive_state_p(receive_state) : "operation_communication.receive_state_p(receive_state) " + "CommonSymbols.NIL != operation_communication.receive_state_p(receive_state) " + receive_state;
        return set_communication_mode(get_communication_state(transmit_state, receive_state));
    }

    public static SubLObject set_transmit_state(final SubLObject transmit_state) {
        return set_communication_state(transmit_state, get_receive_state(UNPROVIDED));
    }

    public static SubLObject set_receive_state(final SubLObject receive_state) {
        return set_communication_state(get_transmit_state(UNPROVIDED), receive_state);
    }

    public static SubLObject set_to_recording_as_sent() {
        return set_to_recording($$$SENT);
    }

    public static SubLObject set_to_recording_locally() {
        return set_to_recording(UNPROVIDED);
    }

    public static SubLObject set_to_recording(SubLObject ts_mark) {
        if (ts_mark == UNPROVIDED) {
            ts_mark = NIL;
        }
        transcript_utilities.new_local_transcript();
        if (ts_mark.isString()) {
            transcript_utilities.mark_local_transcript(ts_mark);
        }
        set_process_auxiliary_operationsP(T);
        return NIL;
    }

    public static SubLObject set_to_no_record() {
        transcript_utilities.new_local_transcript();
        set_process_auxiliary_operationsP(NIL);
        return NIL;
    }

    public static SubLObject set_to_receiving() {
        transcript_utilities.set_read_transcript(transcript_utilities.master_transcript());
        set_receiving_remote_operationsP(T);
        return NIL;
    }

    public static SubLObject set_to_receiving_everything() {
        set_load_submitted_transcripts(T);
        return set_to_receiving();
    }

    public static SubLObject set_to_not_receiving() {
        set_receiving_remote_operationsP(NIL);
        return NIL;
    }

    public static SubLObject transmitting_changeP(final SubLObject new_mode) {
        return makeBoolean(!get_transmit_state(new_mode).equal(get_transmit_state(communication_mode())));
    }

    public static SubLObject receiving_changeP(final SubLObject new_mode) {
        return makeBoolean(!get_receive_state(new_mode).equal(get_receive_state(communication_mode())));
    }

    public static SubLObject set_to_receive_only() {
        if (NIL != transmitting_changeP($RECEIVE_ONLY)) {
            set_to_recording_locally();
        }
        if (NIL != receiving_changeP($RECEIVE_ONLY)) {
            set_to_receiving();
        }
        set_communication_mode_internal($RECEIVE_ONLY);
        return $RECEIVE_ONLY;
    }

    public static SubLObject set_to_deaf() {
        if (NIL != transmitting_changeP($DEAF)) {
            set_to_recording_locally();
        }
        if (NIL != receiving_changeP($DEAF)) {
            set_to_not_receiving();
        }
        set_communication_mode_internal($DEAF);
        return $DEAF;
    }

    public static SubLObject set_to_dead() {
        if (NIL != transmitting_changeP($DEAD)) {
            set_to_no_record();
        }
        if (NIL != receiving_changeP($DEAD)) {
            set_to_not_receiving();
        }
        set_communication_mode_internal($DEAD);
        return $DEAD;
    }

    public static SubLObject set_to_transmit_and_receive() {
        if (NIL != transmitting_changeP($TRANSMIT_AND_RECEIVE)) {
            set_to_no_record();
        }
        if (NIL != receiving_changeP($TRANSMIT_AND_RECEIVE)) {
            set_to_receiving();
        }
        set_communication_mode_internal($TRANSMIT_AND_RECEIVE);
        return $TRANSMIT_AND_RECEIVE;
    }

    public static SubLObject set_to_transmit_only() {
        if (NIL != transmitting_changeP($TRANSMIT_ONLY)) {
            set_to_no_record();
        }
        if (NIL != receiving_changeP($TRANSMIT_ONLY)) {
            set_to_not_receiving();
        }
        set_communication_mode_internal($TRANSMIT_ONLY);
        return $TRANSMIT_ONLY;
    }

    public static SubLObject set_to_receive_record_transmit() {
        if (NIL != transmitting_changeP($RECEIVE_RECORD_TRANSMIT)) {
            set_to_recording_as_sent();
        }
        if (NIL != receiving_changeP($RECEIVE_RECORD_TRANSMIT)) {
            set_to_receiving();
        }
        set_communication_mode_internal($RECEIVE_RECORD_TRANSMIT);
        return $RECEIVE_RECORD_TRANSMIT;
    }

    public static SubLObject set_to_dead_receive() {
        if (NIL != transmitting_changeP($DEAD_RECEIVE)) {
            set_to_no_record();
        }
        if (NIL != receiving_changeP($DEAD_RECEIVE)) {
            set_to_receiving();
        }
        set_communication_mode_internal($DEAD_RECEIVE);
        return $DEAD_RECEIVE;
    }

    public static SubLObject set_to_record_transmit() {
        if (NIL != transmitting_changeP($RECORD_TRANSMIT)) {
            set_to_recording_as_sent();
        }
        if (NIL != receiving_changeP($RECORD_TRANSMIT)) {
            set_to_not_receiving();
        }
        set_communication_mode_internal($RECORD_TRANSMIT);
        return $RECORD_TRANSMIT;
    }

    public static SubLObject transmittingP() {
        return comm_mode_transmittingP(communication_mode());
    }

    public static SubLObject storingP() {
        return comm_mode_storingP(communication_mode());
    }

    public static SubLObject not_recordingP() {
        return makeBoolean(NIL == storingP());
    }

    public static SubLObject receivingP() {
        return comm_mode_receivingP(communication_mode());
    }

    public static SubLObject get_transmit_state(SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = communication_mode();
        }
        final SubLObject storingP = comm_mode_storingP(mode);
        final SubLObject transmittingP = comm_mode_transmittingP(mode);
        if ((NIL != storingP) && (NIL != transmittingP)) {
            return $$$transmit_and_store;
        }
        if (NIL != list_utilities.sublisp_boolean(storingP)) {
            return $$$store;
        }
        if (NIL != list_utilities.sublisp_boolean(transmittingP)) {
            return $$$transmit;
        }
        if (NIL != list_utilities.sublisp_boolean(get_communication_mode_description(mode))) {
            return $$$none;
        }
        return NIL;
    }

    public static SubLObject get_receive_state(SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = communication_mode();
        }
        final SubLObject desc = get_communication_mode_description(mode);
        if (NIL != list_utilities.sublisp_boolean(desc)) {
            return NIL != comm_mode_desc_receivingP(desc) ? $$$yes : $$$no;
        }
        return NIL;
    }

    public static SubLObject get_communication_state(final SubLObject transmit_state, final SubLObject receive_state) {
        if (((NIL != transmit_state) && (!assertionsDisabledSynth)) && (NIL == transmit_state_p(transmit_state))) {
            throw new AssertionError(transmit_state);
        }
        if (((NIL != receive_state) && (!assertionsDisabledSynth)) && (NIL == receive_state_p(receive_state))) {
            throw new AssertionError(receive_state);
        }
        if ((NIL != transmit_state) && (NIL != receive_state)) {
            final SubLObject receivingP = Strings.stringE($$$yes, receive_state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject storingP = list_utilities.sublisp_boolean(search($$$store, transmit_state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            final SubLObject transmittingP = list_utilities.sublisp_boolean(search($$$transmit, transmit_state, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            return find_communication_mode(receivingP, storingP, transmittingP);
        }
        return NIL;
    }

    public static SubLObject valid_transcript_expression(final SubLObject exp) {
        return makeBoolean((((exp.isCons() && length(exp).numE(FOUR_INTEGER)) && second(exp).isString()) && third(exp).isInteger()) && fourth(exp).isCons());
    }

    public static SubLObject operation_from_meP(final SubLObject form) {
        if (cyc_image_id().equalp(second(form))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject writing_transcriptsP() {
        return makeBoolean(!get_transmit_state(communication_mode()).equal($$$None));
    }

    public static SubLObject reading_transcriptsP() {
        return equal(get_receive_state(communication_mode()), $$$Yes);
    }

    public static SubLObject clear_stored_operations() {
        save_transcript_ops();
        if (NIL == operation_queues.local_operation_storage_queue_empty()) {
            transcript_utilities.mark_local_transcript($$$CLEARED);
            transcript_utilities.new_local_transcript();
        }
        return NIL;
    }

    public static SubLObject send_stored_operations() {
        save_transcript_ops();
        if (NIL == operation_queues.local_operation_storage_queue_empty()) {
            while (NIL == operation_queues.local_operation_storage_queue_empty()) {
                operation_queues.transmit_queue_enqueue(operation_queues.local_operation_storage_queue_dequeue());
                inc_total_local_operations_transmitted();
            } 
            transcript_utilities.mark_local_transcript($$$SENT);
            transcript_utilities.new_local_transcript();
        }
        return NIL;
    }

    public static SubLObject fi_save_ops() {
        save_transcript_ops();
        send_local_transcript();
        return NIL;
    }

    public static SubLObject send_local_transcript() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != transcript_server.use_transcript_server()) {
            transcript_server.send_operations_to_server();
        } else {
            final SubLObject master_transcript = transcript_utilities.master_transcript();
            final SubLObject direction = (NIL != Filesys.probe_file(master_transcript)) ? $APPEND : $OUTPUT;
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(master_transcript, direction);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str93$Unable_to_open__S, master_transcript);
                }
                final SubLObject stream_$1 = stream;
                if (stream_$1.isStream()) {
                    while (NIL == operation_queues.transmit_queue_empty()) {
                        format(stream_$1, $str94$_s__, operation_queues.transmit_queue_dequeue());
                    } 
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_save_transcript_ops() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != lock_idle_p($save_transcript_ops_lock$.getDynamicValue(thread))) {
            return save_transcript_ops();
        }
        return NIL;
    }

    public static SubLObject save_transcript_ops() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != operation_queues.$hl_transcripts_enabledP$.getDynamicValue(thread)) {
            save_hl_transcript_ops();
        }
        if (NIL == operation_queues.transcript_queue_empty()) {
            SubLObject release = NIL;
            try {
                release = seize_lock($save_transcript_ops_lock$.getDynamicValue(thread));
                save_transcript_ops_internal(UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock($save_transcript_ops_lock$.getDynamicValue(thread));
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject save_transcript_ops_internal(SubLObject transcript_known_to_exist) {
        if (transcript_known_to_exist == UNPROVIDED) {
            transcript_known_to_exist = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_transcript = transcript_utilities.local_transcript();
        final SubLObject direction = (NIL != Filesys.probe_file(local_transcript)) ? $APPEND : $OUTPUT;
        final SubLObject write_locallyP = makeBoolean((NIL == dont_record_operations_locally()) && (NIL != storingP()));
        final SubLObject send_remotelyP = makeBoolean((NIL != allow_transmitting()) && (NIL != transmittingP()));
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(local_transcript, direction);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str93$Unable_to_open__S, local_transcript);
            }
            final SubLObject stream_$2 = stream;
            if (stream_$2.isStream()) {
                final SubLObject _prev_bind_2 = $print_level$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $print_length$.currentBinding(thread);
                try {
                    $print_level$.bind(NIL, thread);
                    $print_length$.bind(NIL, thread);
                    while (NIL == operation_queues.transcript_queue_empty()) {
                        final SubLObject op = operation_queues.transcript_queue_dequeue();
                        if (NIL != write_locallyP) {
                            format(stream_$2, $str94$_s__, op);
                        }
                        if (NIL != send_remotelyP) {
                            operation_queues.transmit_queue_enqueue(op);
                            inc_total_local_operations_transmitted();
                        }
                        if ((NIL != write_locallyP) && (NIL == send_remotelyP)) {
                            operation_queues.local_operation_storage_queue_enqueue(op);
                            inc_total_local_operations_recorded();
                        }
                    } 
                } finally {
                    $print_length$.rebind(_prev_bind_3, thread);
                    $print_level$.rebind(_prev_bind_2, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return NIL;
    }

    public static SubLObject possibly_save_hl_transcript_ops() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != lock_idle_p($save_hl_transcript_ops_lock$.getDynamicValue(thread))) {
            return save_hl_transcript_ops();
        }
        return NIL;
    }

    public static SubLObject save_hl_transcript_ops() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == operation_queues.hl_transcript_queue_emptyP()) {
            SubLObject release = NIL;
            try {
                release = seize_lock($save_hl_transcript_ops_lock$.getDynamicValue(thread));
                save_hl_transcript_ops_internal();
            } finally {
                if (NIL != release) {
                    release_lock($save_hl_transcript_ops_lock$.getDynamicValue(thread));
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject save_hl_transcript_ops_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_hl_transcript = transcript_utilities.local_hl_transcript();
        final SubLObject direction = (NIL != Filesys.probe_file(local_hl_transcript)) ? $APPEND : $OUTPUT;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(local_hl_transcript, direction);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str93$Unable_to_open__S, local_hl_transcript);
            }
            final SubLObject stream_$3 = stream;
            if (stream_$3.isStream()) {
                final SubLObject _prev_bind_2 = $print_level$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $print_length$.currentBinding(thread);
                try {
                    $print_level$.bind(NIL, thread);
                    $print_length$.bind(NIL, thread);
                    SubLObject op = NIL;
                    while (NIL == operation_queues.hl_transcript_queue_emptyP()) {
                        op = operation_queues.hl_transcript_queue_dequeue();
                        if ((NIL == dont_record_operations_locally()) && (NIL != storingP())) {
                            format(stream_$3, $str94$_s__, op);
                            operation_queues.local_operation_storage_queue_enqueue(op);
                            inc_total_local_operations_recorded();
                        }
                        if ((NIL != allow_transmitting()) && (NIL != transmittingP())) {
                            operation_queues.transmit_queue_enqueue(op);
                            inc_total_local_operations_transmitted();
                        }
                    } 
                } finally {
                    $print_length$.rebind(_prev_bind_3, thread);
                    $print_level$.rebind(_prev_bind_2, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return NIL;
    }

    public static SubLObject close_kb(final SubLObject old, final SubLObject v_new) {
        if (old.equal(kb_loaded())) {
            if (NIL != auto_increment_kb()) {
                set_kb_loaded(v_new);
                set_read_master_transcript_op_number(ZERO_INTEGER);
                set_caught_up_on_master_transcript(NIL);
                if (NIL != v_new) {
                    nl_generation_fort_cache.ensure_nl_generation_fort_cache_is_best_available();
                    transcript_utilities.roll_local_transcript();
                    set_kb_full_transcript_loaded(NIL);
                }
                if (NIL == experimental_image()) {
                    set_allow_transmitting(T);
                }
            } else {
                set_kb_full_transcript_loaded(T);
                set_communication_mode($DEAF);
                set_allow_transmitting(NIL);
            }
        }
        return NIL;
    }

    public static SubLObject read_one_transcript_operation(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject position = compatibility.get_file_position(stream);
        thread.resetMultipleValues();
        SubLObject expr = read_ignoring_errors(stream, NIL, $EOF);
        SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (expr == $EOF) {
            return NIL;
        }
        if (status == $ERROR) {
            Errors.error($str99$Bogus_form__S_read_from_transcrip, expr, position);
        } else {
            if (NIL != valid_transcript_expression(expr)) {
                return expr;
            }
            if (NIL == system_parameters.$auto_continue_transcript_problems$.getDynamicValue(thread)) {
                Errors.cerror($str100$Skip_forward_until_a_valid_transc, $str99$Bogus_form__S_read_from_transcrip, expr, position);
            }
            while ((expr != $EOF) && (NIL == valid_transcript_expression(expr))) {
                position = add(position, ONE_INTEGER);
                compatibility.set_file_position(stream, position);
                thread.resetMultipleValues();
                final SubLObject new_expr = read_ignoring_errors(stream, NIL, $EOF);
                final SubLObject new_status = thread.secondMultipleValue();
                thread.resetMultipleValues();
                expr = new_expr;
                status = new_status;
            } 
            if (expr == $EOF) {
                return NIL;
            }
            if (NIL != valid_transcript_expression(expr)) {
                return expr;
            }
        }
        return NIL;
    }

    public static SubLObject backup_transcript_stream(final SubLObject stream, final SubLObject backup_position) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject end_position = compatibility.get_file_position(stream);
        final SubLObject partial_string = Strings.make_string(subtract(end_position, backup_position), UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject index;
        for (cdotimes_end_var = length(partial_string), index = NIL, index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
            Strings.set_char(partial_string, index, read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        if (NIL == system_parameters.$auto_continue_transcript_problems$.getDynamicValue(thread)) {
            Errors.cerror($str101$Assume_the_rest_of_the_operation_, $str102$Partial_transcript_operation__S_w, partial_string);
        }
        compatibility.set_file_position(stream, backup_position);
        return NIL;
    }

    public static SubLObject load_transcript_exprs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject use_transcript_server = transcript_server.use_transcript_server();
        if (NIL != use_transcript_server) {
            transcript_server.read_operations_from_server();
        } else {
            final SubLObject read_transcript = transcript_utilities.read_transcript();
            final SubLObject master_transcript = transcript_utilities.master_transcript();
            final SubLObject master_transcript_already_exists = transcript_utilities.master_transcript_already_exists();
            SubLObject file_exists = NIL;
            if (read_transcript != NIL)
                file_exists = Filesys.probe_file(read_transcript);

            if ((read_transcript.equal(master_transcript) && (NIL != master_transcript_already_exists)) && (NIL == file_exists)) {
                Errors.error($str105$The_transcript_file__s_has_alread, master_transcript);
            } else
                if ((NIL != read_transcript) && (NIL != file_exists)) {
                    if (read_transcript.equal(master_transcript)) {
                        transcript_utilities.set_master_transcript_already_exists(T);
                    }
                    if (NIL == $transcript_read_attempted$.getGlobalValue()) {
                        SubLObject stream = NIL;
                        try {
                            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_text(read_transcript, $INPUT);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                            if (!stream.isStream()) {
                                Errors.error($str93$Unable_to_open__S, read_transcript);
                            }
                            final SubLObject s = stream;
                            $initial_read_transcript_size$.setGlobalValue(file_length(s));
                        } finally {
                            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                            }
                        }
                    }
                    final SubLObject _prev_bind_3 = $transcript_load_succeeded$.currentBinding(thread);
                    try {
                        $transcript_load_succeeded$.bind(NIL, thread);
                        load_transcript_exprs_internal();
                        if (NIL != $transcript_load_succeeded$.getDynamicValue(thread)) {
                            if (NIL == $transcript_read_attempted$.getGlobalValue()) {
                                $transcript_read_attempted$.setGlobalValue(T);
                            }
                            if (transcript_utilities.read_transcript_position().numGE($initial_read_transcript_size$.getGlobalValue())) {
                                set_caught_up_on_master_transcript(T);
                            }
                        }
                    } finally {
                        $transcript_load_succeeded$.rebind(_prev_bind_3, thread);
                    }
                }

        }
        return NIL;
    }

    public static SubLObject load_transcript_exprs_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(transcript_utilities.read_transcript(), $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str93$Unable_to_open__S, transcript_utilities.read_transcript());
            }
            final SubLObject stream_$4 = stream;
            compatibility.set_file_position(stream_$4, transcript_utilities.read_transcript_position());
            SubLObject total_ops_read = ONE_INTEGER;
            SubLObject expr = NIL;
            SubLObject pos = NIL;
            expr = read_one_transcript_operation(stream_$4);
            pos = compatibility.get_file_position(stream_$4);
            while ((NIL != expr) && ((NIL == read_transcript_op_limit()) || (!total_ops_read.numE(read_transcript_op_limit())))) {
                if ((NIL == caught_up_on_master_transcript()) && pos.numG($initial_read_transcript_size$.getGlobalValue())) {
                    set_caught_up_on_master_transcript(T);
                }
                total_ops_read = add(total_ops_read, ONE_INTEGER);
                operation_queues.add_to_remote_queue(expr);
                expr = read_one_transcript_operation(stream_$4);
                pos = compatibility.get_file_position(stream_$4);
            } 
            if ((NIL != read_transcript_op_limit()) && total_ops_read.numE(read_transcript_op_limit())) {
                if ((NIL == caught_up_on_master_transcript()) && pos.numG($initial_read_transcript_size$.getGlobalValue())) {
                    set_caught_up_on_master_transcript(T);
                }
                total_ops_read = add(total_ops_read, ONE_INTEGER);
                operation_queues.add_to_remote_queue(expr);
            }
            transcript_utilities.set_read_transcript_position(compatibility.get_file_position(stream_$4));
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        $transcript_load_succeeded$.setDynamicValue(T, thread);
        return NIL;
    }

    public static SubLObject remote_operation_to_runP() {
        return makeBoolean((NIL != receiving_remote_operationsP()) && (NIL == operation_queues.remote_queue_empty()));
    }

    public static SubLObject master_transcript_catch_up() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str107$__Processing_master_transcript_op);
        finish_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        while (NIL == caught_up_on_master_transcript()) {
            load_transcript_exprs();
            while (NIL == operation_queues.remote_queue_empty()) {
                SubLObject error_message = NIL;
                if (mod(kb_op_number(), $int$100).numE(ZERO_INTEGER)) {
                    finish_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    thread.resetMultipleValues();
                    final SubLObject second = decode_universal_time(get_universal_time(), UNPROVIDED);
                    final SubLObject minute = thread.secondMultipleValue();
                    final SubLObject hour = thread.thirdMultipleValue();
                    final SubLObject date = thread.fourthMultipleValue();
                    final SubLObject month = thread.fifthMultipleValue();
                    final SubLObject year = thread.sixthMultipleValue();
                    thread.resetMultipleValues();
                    format(T, $str109$___4__0D__2__0D__2__0D__2__0D__2_, new SubLObject[]{ year, month, date, hour, minute, second, kb_op_number() });
                    finish_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                }
                fi.reset_fi_error_state();
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject _prev_bind_0_$5 = Errors.$continue_cerrorP$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = Errors.$ignore_warnsP$.currentBinding(thread);
                            try {
                                Errors.$continue_cerrorP$.bind(T, thread);
                                Errors.$ignore_warnsP$.bind(T, thread);
                                operation_queues.run_one_remote_op();
                            } finally {
                                Errors.$ignore_warnsP$.rebind(_prev_bind_2, thread);
                                Errors.$continue_cerrorP$.rebind(_prev_bind_0_$5, thread);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != fi.fi_error_signaledP()) {
                    error_message = fi.fi_get_error_string_int();
                }
                if (error_message.isString()) {
                    Errors.warn(error_message);
                }
            } 
        } 
        finish_output(StreamsLow.$error_output$.getDynamicValue(thread));
        format(T, $str110$__Finished_processing__A_master_t, kb_op_number());
        finish_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject run_random_transcript_op(final SubLObject expr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            final SubLObject op = fourth(expr);
            if (NIL != op) {
                $last_agenda_op$.setGlobalValue(op);
                final SubLObject _prev_bind_0_$6 = $unencapsulating_within_agenda$.currentBinding(thread);
                try {
                    $unencapsulating_within_agenda$.bind(T, thread);
                    SubLObject unencapsulated_op = NIL;
                    try {
                        thread.throwStack.push($UNENCAPSULATION_ERROR);
                        unencapsulated_op = encapsulation.unencapsulate(op);
                    } catch (final Throwable ccatch_env_var) {
                        unencapsulated_op = Errors.handleThrowable(ccatch_env_var, $UNENCAPSULATION_ERROR);
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != unencapsulated_op) {
                        eval(unencapsulated_op);
                    }
                } finally {
                    $unencapsulating_within_agenda$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject catch_up_to_current() {
        return catch_up_kb(NIL, NIL, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyc_catch_up(SubLObject to_kb_number, SubLObject to_op_number, SubLObject load_submitted_transcriptsP, SubLObject send_submitted_transcript_loading_noticesP) {
        if (to_kb_number == UNPROVIDED) {
            to_kb_number = kb_loaded();
        }
        if (to_op_number == UNPROVIDED) {
            to_op_number = transcript_utilities.total_master_transcript_operations(to_kb_number);
        }
        if (load_submitted_transcriptsP == UNPROVIDED) {
            load_submitted_transcriptsP = NIL;
        }
        if (send_submitted_transcript_loading_noticesP == UNPROVIDED) {
            send_submitted_transcript_loading_noticesP = NIL;
        }
        return catch_up_kb(to_kb_number, to_op_number, load_submitted_transcriptsP, send_submitted_transcript_loading_noticesP);
    }

    public static SubLObject catch_up_kb(SubLObject to_kb_number, SubLObject to_op_number, SubLObject load_submitted_transcriptsP, SubLObject send_submitted_transcript_loading_noticesP) {
        if (to_kb_number == UNPROVIDED) {
            to_kb_number = kb_loaded();
        }
        if (to_op_number == UNPROVIDED) {
            to_op_number = transcript_utilities.total_master_transcript_operations(to_kb_number);
        }
        if (load_submitted_transcriptsP == UNPROVIDED) {
            load_submitted_transcriptsP = NIL;
        }
        if (send_submitted_transcript_loading_noticesP == UNPROVIDED) {
            send_submitted_transcript_loading_noticesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_up_to_currentP = NIL;
        if (NIL == subl_promotions.positive_integer_p(to_kb_number)) {
            catch_up_to_currentP = T;
            to_kb_number = kb_loaded();
            to_op_number = transcript_utilities.total_master_transcript_operations(to_kb_number);
            while (NIL != subl_promotions.non_zero_integer_p(transcript_utilities.total_master_transcript_operations(add(ONE_INTEGER, to_kb_number)))) {
                to_kb_number = add(to_kb_number, ONE_INTEGER);
                to_op_number = transcript_utilities.total_master_transcript_operations(to_kb_number);
            } 
        }
        if (to_kb_number.numL(kb_loaded())) {
            Errors.error($str116$Cannot_catchup_backwards_from_KB_, kb_version_string(), to_kb_number);
        }
        if ((to_kb_number.numE(kb_loaded()) && to_op_number.numL(read_master_transcript_op_number())) && (NIL == catch_up_to_currentP)) {
            Errors.error($str117$Cannot_catchup_backwards_from_KB_, kb_version_string(), to_kb_number, to_op_number);
        }
        final SubLObject agenda_runningP = agenda.agenda_running();
        final SubLObject saved_communication_mode = $communication_mode$.getGlobalValue();
        SubLObject ops_run = ZERO_INTEGER;
        SubLObject ops_to_run = ZERO_INTEGER;
        for (SubLObject temp_kb_number = kb_loaded(); temp_kb_number.numLE(to_kb_number); temp_kb_number = add(temp_kb_number, ONE_INTEGER)) {
            final SubLObject op_count = subtract(temp_kb_number.eql(to_kb_number) ? max(transcript_utilities.total_master_transcript_operations(temp_kb_number), to_op_number) : transcript_utilities.total_master_transcript_operations(temp_kb_number), temp_kb_number.eql(kb_loaded()) ? read_master_transcript_op_number() : ZERO_INTEGER, temp_kb_number.eql(to_kb_number) ? subtract(transcript_utilities.total_master_transcript_operations(temp_kb_number), to_op_number) : ZERO_INTEGER);
            if (!to_kb_number.eql(kb_loaded())) {
                format_nil.force_format(T, $str118$_A_ops_to_run_from_KB__A__, op_count, temp_kb_number, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            ops_to_run = add(ops_to_run, op_count);
        }
        try {
            if (NIL != agenda_runningP) {
                final SubLObject str = $$$Shutting_down_agenda;
                final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    ensure_agenda_halted($catch_up_kb_agenda_halt_wait_time$.getDynamicValue(thread));
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    $progress_start_time$.rebind(_prev_bind_0, thread);
                }
                if (NIL != agenda.agenda_running()) {
                    Errors.error($str120$Could_not_shut_down_agenda_);
                }
            }
            $communication_mode$.setGlobalValue($UNKNOWN);
            if (NIL != load_submitted_transcriptsP) {
                final SubLObject str = $$$Will_load_submitted_transcripts;
                final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    $progress_start_time$.rebind(_prev_bind_0, thread);
                }
                set_load_submitted_transcripts(load_submitted_transcriptsP);
                if (NIL != send_submitted_transcript_loading_noticesP) {
                    format(T, $str122$Will_send_submitted_transcript_no);
                    set_send_submitted_transcript_loading_notices(send_submitted_transcript_loading_noticesP);
                } else {
                    format(T, $str123$Will_not_send_submitted_transcrip);
                }
            }
            final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(cconcatenate($$$Catching_up_on_, new SubLObject[]{ format_nil.format_nil_a_no_copy(ops_to_run), $$$_operations_from_KB_, format_nil.format_nil_a_no_copy(kb_version_string()), $$$_to_, format_nil.format_nil_a_no_copy(to_kb_number), $str62$_, format_nil.format_nil_a_no_copy(to_op_number) }));
                    load_transcript_exprs();
                    while ((to_kb_number.numG(kb_loaded()) || (to_kb_number.numE(kb_loaded()) && to_op_number.numG(read_master_transcript_op_number()))) || (NIL != catch_up_to_currentP)) {
                        if (NIL != operation_queues.remote_queue_empty()) {
                            load_transcript_exprs();
                            if (NIL != catch_up_to_currentP) {
                                catch_up_to_currentP = NIL;
                            } else
                                if (NIL != operation_queues.remote_queue_empty()) {
                                    format_nil.force_format(T, $str127$_A_At_KB__A__waiting__A_seconds_f, numeric_date_utilities.timestring(UNPROVIDED), kb_version_string(), $catch_up_kb_transcript_server_wait_time$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    sleep($catch_up_kb_transcript_server_wait_time$.getDynamicValue(thread));
                                }

                        }
                        if (NIL == operation_queues.remote_queue_empty()) {
                            SubLObject error_message = NIL;
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$7 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        final SubLObject _prev_bind_0_$8 = Errors.$continue_cerrorP$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$9 = Errors.$ignore_warnsP$.currentBinding(thread);
                                        try {
                                            Errors.$continue_cerrorP$.bind(T, thread);
                                            Errors.$ignore_warnsP$.bind(T, thread);
                                            operation_queues.run_one_remote_op();
                                            ops_run = add(ops_run, ONE_INTEGER);
                                            note_percent_progress(ops_run, ops_to_run);
                                        } finally {
                                            Errors.$ignore_warnsP$.rebind(_prev_bind_1_$9, thread);
                                            Errors.$continue_cerrorP$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$7, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (NIL != fi.fi_error_signaledP()) {
                                error_message = fi.fi_get_error_string_int();
                            }
                            if (NIL == error_message) {
                                continue;
                            }
                            format(T, $str128$Last_operation___S__, encapsulation.unencapsulate_partial($last_agenda_op$.getGlobalValue()));
                            Errors.warn(error_message);
                        }
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_12, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                $last_percent_progress_index$.rebind(_prev_bind_9, thread);
            }
        } finally {
            final SubLObject _prev_bind_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                set_load_submitted_transcripts(NIL);
                set_send_submitted_transcript_loading_notices(NIL);
                if (NIL != communication_modeP(saved_communication_mode)) {
                    set_communication_mode(saved_communication_mode);
                }
                if (NIL != agenda_runningP) {
                    agenda.start_agenda(UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_13, thread);
            }
        }
        return ops_run;
    }

    public static SubLObject load_transcript_file(final SubLObject filename, SubLObject use_transcriptP, SubLObject queue, SubLObject start_position, SubLObject start_op_number, SubLObject continue_on_errorP) {
        if (use_transcriptP == UNPROVIDED) {
            use_transcriptP = NIL;
        }
        if (queue == UNPROVIDED) {
            queue = $AUX;
        }
        if (start_position == UNPROVIDED) {
            start_position = NIL;
        }
        if (start_op_number == UNPROVIDED) {
            start_op_number = NIL;
        }
        if (continue_on_errorP == UNPROVIDED) {
            continue_on_errorP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != Filesys.probe_file(filename)) {
            SubLObject count = ZERO_INTEGER;
            SubLObject op_number = ZERO_INTEGER;
            final SubLObject _prev_bind_0 = $use_transcriptP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
            try {
                $use_transcriptP$.bind(queue == $NONE ? use_transcriptP : $use_transcriptP$.getDynamicValue(thread), thread);
                Errors.$continue_cerrorP$.bind(continue_on_errorP, thread);
                final SubLObject total_file_size = file_utilities.get_file_length(filename);
                SubLObject stream = NIL;
                try {
                    final SubLObject _prev_bind_0_$11 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream = compatibility.open_text(filename, $INPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$11, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error($str93$Unable_to_open__S, filename);
                    }
                    final SubLObject stream_$12 = stream;
                    if (start_position.isInteger()) {
                        compatibility.set_file_position(stream_$12, start_position);
                    }
                    final SubLObject _prev_bind_0_$12 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$14 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(cconcatenate($str131$Evaluating__load_transcript_, new SubLObject[]{ format_nil.format_nil_s_no_copy(filename), $$$_, format_nil.format_nil_a_no_copy(use_transcriptP), $$$_, format_nil.format_nil_s_no_copy(queue), format_nil.format_nil_a_no_copy(NIL != start_position ? cconcatenate($$$_, format_nil.format_nil_a_no_copy(start_position)) : $str133$), format_nil.format_nil_a_no_copy(NIL != start_op_number ? cconcatenate($$$_, format_nil.format_nil_a_no_copy(start_op_number)) : $str133$), $str134$_ }));
                            SubLObject expr;
                            for (expr = NIL, expr = read_one_transcript_operation(stream_$12); (NIL != expr) && (expr != $EOF); expr = read_one_transcript_operation(stream_$12)) {
                                if (expr.isCons()) {
                                    op_number = add(op_number, ONE_INTEGER);
                                }
                                if ((NIL == start_op_number) || (start_op_number.isInteger() && op_number.numGE(start_op_number))) {
                                    if (queue == $LOCAL) {
                                        operation_queues.add_to_local_queue(fourth(expr), NIL);
                                    } else
                                        if (queue == $NONE) {
                                            run_random_transcript_op(expr);
                                        } else {
                                            operation_queues.add_to_auxiliary_queue(expr);
                                        }

                                    count = add(count, ONE_INTEGER);
                                }
                                note_percent_progress(compatibility.get_file_position(stream_$12), total_file_size);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1_$14, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$12, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            } finally {
                Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
                $use_transcriptP$.rebind(_prev_bind_0, thread);
            }
            return count;
        }
        return NIL;
    }

    public static SubLObject load_transcript(final SubLObject filename, SubLObject use_transcriptP, SubLObject queue, SubLObject start_position, SubLObject start_op_number) {
        if (use_transcriptP == UNPROVIDED) {
            use_transcriptP = NIL;
        }
        if (queue == UNPROVIDED) {
            queue = $NONE;
        }
        if (start_position == UNPROVIDED) {
            start_position = NIL;
        }
        if (start_op_number == UNPROVIDED) {
            start_op_number = NIL;
        }
        return load_transcript_file(filename, use_transcriptP, queue, start_position, start_op_number, UNPROVIDED);
    }

    public static SubLObject load_transcript_verbose(final SubLObject filename, SubLObject use_transcriptP, SubLObject queue, SubLObject start_position, SubLObject start_op_number) {
        if (use_transcriptP == UNPROVIDED) {
            use_transcriptP = NIL;
        }
        if (queue == UNPROVIDED) {
            queue = $NONE;
        }
        if (start_position == UNPROVIDED) {
            start_position = NIL;
        }
        if (start_op_number == UNPROVIDED) {
            start_op_number = NIL;
        }
        SubLObject result = NIL;
        final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
        result = load_transcript_file(filename, use_transcriptP, queue, start_position, start_op_number, UNPROVIDED);
        if (result.isInteger()) {
            format(T, $str136$___s_operation_A_performed__, result, result.numG(ONE_INTEGER) ? $$$s_were : $$$_was);
        }
        final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
        final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
        if (((((NIL != subl_promotions.non_zero_integer_p(new_constant_count)) || (NIL != subl_promotions.non_zero_integer_p(new_nart_count))) || (NIL != subl_promotions.non_zero_integer_p(new_assertion_count))) || (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count))) || (NIL != subl_promotions.non_zero_integer_p(new_deduction_count))) {
            if (NIL.isString()) {
                format(T, $str140$___A__, NIL);
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_constant_count)) {
                format(T, $str141$___s_constant_A__A__, new SubLObject[]{ abs(new_constant_count), abs(new_constant_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_constant_count) ? $$$created : $$$destroyed });
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_nart_count)) {
                format(T, $str144$___s_nart_A__A__, new SubLObject[]{ abs(new_nart_count), abs(new_nart_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_nart_count) ? $$$created : $$$destroyed });
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_assertion_count)) {
                format(T, $str145$___s_assertion_A__A__, new SubLObject[]{ abs(new_assertion_count), abs(new_assertion_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_assertion_count) ? $$$created : $$$destroyed });
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count)) {
                format(T, $str146$___s_kb_hl_support_A__A__, new SubLObject[]{ abs(new_kb_hl_support_count), abs(new_kb_hl_support_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_kb_hl_support_count) ? $$$created : $$$destroyed });
            }
            if (NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                format(T, $str147$___s_deduction_A__A__, new SubLObject[]{ abs(new_deduction_count), abs(new_deduction_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_deduction_count) ? $$$created : $$$destroyed });
            }
        } else
            if (NIL.isString()) {
                format(T, $str140$___A__, NIL);
            }

        force_output(T);
        return result;
    }

    public static SubLObject load_transcript_file_to_submit(final SubLObject filename, SubLObject chunk_size) {
        if (chunk_size == UNPROVIDED) {
            chunk_size = $int$10000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject has_agendaP = agenda.agenda_running();
        SubLObject count = NIL;
        agenda.halt_agenda(UNPROVIDED);
        if (NIL != Filesys.probe_file(filename)) {
            SubLObject op_number = ZERO_INTEGER;
            final SubLObject total_file_size = file_utilities.get_file_length(filename);
            count = ZERO_INTEGER;
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(filename, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str93$Unable_to_open__S, filename);
                }
                final SubLObject stream_$17 = stream;
                final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(cconcatenate($$$Loading_, new SubLObject[]{ format_nil.format_nil_a_no_copy(filename), $str151$_to_send_____ }));
                        SubLObject expr;
                        for (expr = NIL, expr = read_one_transcript_operation(stream_$17); (NIL != expr) && (expr != $EOF); expr = read_one_transcript_operation(stream_$17)) {
                            if (expr.isCons()) {
                                op_number = add(op_number, ONE_INTEGER);
                            }
                            operation_queues.transmit_queue_enqueue(expr);
                            count = add(count, ONE_INTEGER);
                            if (count.isPositive() && mod(count, chunk_size).isZero()) {
                                transcript_server.send_operations_to_server();
                            }
                            note_percent_progress(compatibility.get_file_position(stream_$17), total_file_size);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                }
            } finally {
                final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                }
            }
        }
        if (NIL != has_agendaP) {
            agenda.start_agenda(UNPROVIDED);
            agenda.wait_for_agenda_running(UNPROVIDED);
        }
        transcript_server.send_operations_to_server();
        return count;
    }

    public static SubLObject server_summary(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(stream, $str152$__Server_Summary____A, numeric_date_utilities.timestring(UNPROVIDED));
        format(stream, $str153$___Machine___A, Environment.get_machine_name(UNPROVIDED));
        final SubLObject base_port = system_parameters.$base_tcp_port$.getDynamicValue(thread);
        if (base_port.isInteger() && (NIL != tcp_server_utilities.all_tcp_servers())) {
            format(stream, $str154$__A, base_port);
        }
        format(stream, $str155$__Cyclist___A, the_cyclist());
        format(stream, $str156$___KB___A, kb_version_string());
        format(stream, $str157$___System___A, system_info.cyc_revision_string());
        final SubLObject system_code_string = misc_utilities.cyc_system_code_string();
        if (NIL != string_utilities.non_empty_string_p(system_code_string)) {
            format(stream, $str158$___A_, system_code_string);
        }
        format(stream, $str159$__Comm___A, communication_mode_name(communication_mode()));
        format(stream, $str160$___Agenda___A, agenda.agenda_state());
        format(stream, $str161$__Queues_);
        if (operation_queues.auxiliary_queue_size().isPositive() || total_auxiliary_operations_run().isPositive()) {
            format(stream, $str162$___Aux__);
            if (operation_queues.auxiliary_queue_size().isPositive()) {
                format(stream, $str163$__d__d_, operation_queues.auxiliary_queue_size(), total_auxiliary_operations_run());
            } else {
                format(stream, $str164$__d_, total_auxiliary_operations_run());
            }
        }
        if (kb_op_number().isPositive() || (operation_queues.remote_queue_size().isPositive() && (NIL != receiving_remote_operationsP()))) {
            format(stream, $str165$___Remote__);
            if (operation_queues.remote_queue_size().isPositive() && (NIL != receiving_remote_operationsP())) {
                format(stream, $str163$__d__d_, operation_queues.remote_queue_size(), kb_op_number());
            } else {
                format(stream, $str164$__d_, kb_op_number());
            }
        }
        if (NIL != operation_queues.local_operations_anywhere()) {
            format(stream, $str166$___Local__);
            if (operation_queues.local_queue_size().isPositive() || operation_queues.transcript_queue_size().isPositive()) {
                format(stream, $str167$__d__d__d_, new SubLObject[]{ operation_queues.local_queue_size(), operation_queues.transcript_queue_size(), operation_queues.local_operation_storage_queue_size() });
            } else {
                format(stream, $str164$__d_, operation_queues.local_operation_storage_queue_size());
            }
        }
        terpri(stream);
        return NIL;
    }

    public static SubLObject with_safe_kb_dump_environment(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list168);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$19 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list168);
            current_$19 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list168);
            if (NIL == member(current_$19, $list169, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$19 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list168);
        }
        final SubLObject agenda_timeout_tail = property_list_member($AGENDA_TIMEOUT, current);
        final SubLObject agenda_timeout = (NIL != agenda_timeout_tail) ? cadr(agenda_timeout_tail) : NIL;
        final SubLObject disable_tcp_serversP_tail = property_list_member($kw172$DISABLE_TCP_SERVERS_, current);
        final SubLObject disable_tcp_serversP = (NIL != disable_tcp_serversP_tail) ? cadr(disable_tcp_serversP_tail) : T;
        final SubLObject body;
        current = body = temp;
        final SubLObject agenda_runningP = $sym173$AGENDA_RUNNING_;
        final SubLObject saved_local_transcript = $sym174$SAVED_LOCAL_TRANSCRIPT;
        final SubLObject saved_read_transcript = $sym175$SAVED_READ_TRANSCRIPT;
        final SubLObject saved_communication_mode = $sym176$SAVED_COMMUNICATION_MODE;
        final SubLObject saved_remote_queue = $sym177$SAVED_REMOTE_QUEUE;
        final SubLObject saved_local_queue = $sym178$SAVED_LOCAL_QUEUE;
        final SubLObject saved_auxiliary_queue = $sym179$SAVED_AUXILIARY_QUEUE;
        final SubLObject saved_transcript_queue = $sym180$SAVED_TRANSCRIPT_QUEUE;
        final SubLObject disabled_servers = $sym181$DISABLED_SERVERS;
        return list(PROGN, $list183, $list184, $list185, $list186, $list187, list(CLET, list(new SubLObject[]{ bq_cons(agenda_runningP, $list189), bq_cons(saved_local_transcript, $list190), bq_cons(saved_read_transcript, $list191), bq_cons(saved_communication_mode, $list192), bq_cons(saved_remote_queue, $list193), bq_cons(saved_local_queue, $list194), bq_cons(saved_auxiliary_queue, $list195), bq_cons(saved_transcript_queue, $list196), bq_cons(disabled_servers, $list197) }), list(CUNWIND_PROTECT, listS(PROGN, listS(NOTING_PROGRESS, new SubLObject[]{ $str200$Setting_up_safe_KB_dump_environme, $list201, list(PWHEN, disable_tcp_serversP, listS(CSETQ, disabled_servers, $list204)), list(PWHEN, agenda_runningP, list(ENSURE_AGENDA_HALTED, agenda_timeout)), listS(PWHEN, listS(CAND, agenda_runningP, $list189), $list207), $list208 }), append(body, NIL)), list(new SubLObject[]{ NOTING_PROGRESS, $str209$Restoring_pre_dump_environment, $list210, list(CSETQ, $local_transcript$, saved_local_transcript), list(SET_READ_TRANSCRIPT, saved_read_transcript), list(PWHEN, list($sym68$COMMUNICATION_MODE_, saved_communication_mode), list(SET_COMMUNICATION_MODE, saved_communication_mode)), list(CSETQ, $remote_queue$, saved_remote_queue), list(SET_LOCAL_QUEUE, saved_local_queue), list(CSETQ, $auxiliary_queue$, saved_auxiliary_queue), list(CSETQ, $transcript_queue$, saved_transcript_queue), listS(PWHEN, agenda_runningP, $list218), list(RE_ENABLE_DISABLED_TCP_SERVERS, disabled_servers) }))));
    }

    public static SubLObject with_safe_hl_transcript_recording(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list220);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$20 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list220);
            current_$20 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list220);
            if (NIL == member(current_$20, $list169, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$20 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list220);
        }
        final SubLObject agenda_timeout_tail = property_list_member($AGENDA_TIMEOUT, current);
        final SubLObject agenda_timeout = (NIL != agenda_timeout_tail) ? cadr(agenda_timeout_tail) : NIL;
        final SubLObject disable_tcp_serversP_tail = property_list_member($kw172$DISABLE_TCP_SERVERS_, current);
        final SubLObject disable_tcp_serversP = (NIL != disable_tcp_serversP_tail) ? cadr(disable_tcp_serversP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(WITH_SAFE_KB_DUMP_ENVIRONMENT, list($AGENDA_TIMEOUT, agenda_timeout, $kw172$DISABLE_TCP_SERVERS_, disable_tcp_serversP), append(body, NIL));
    }

    public static SubLObject cyc_write_image(final SubLObject filename, SubLObject do_full_gcP) {
        if (do_full_gcP == UNPROVIDED) {
            do_full_gcP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        SubLObject result = NIL;
        if (NIL == operation_queues.local_queue_empty()) {
            while (NIL == operation_queues.local_queue_empty()) {
                operation_queues.run_one_local_op();
            } 
        }
        save_transcript_ops();
        inference_analysis.save_recent_experience();
        inference_analysis.save_recent_asked_queries();
        hl_transcript_tracing.flush_hl_transcript_trace();
        final SubLObject agenda_runningP = agenda.agenda_running();
        final SubLObject saved_local_transcript = transcript_utilities.$local_transcript$.getGlobalValue();
        final SubLObject saved_read_transcript = transcript_utilities.$read_transcript$.getGlobalValue();
        final SubLObject saved_communication_mode = $communication_mode$.getGlobalValue();
        final SubLObject saved_remote_queue = queues.queue_copy(operation_queues.$remote_queue$.getGlobalValue());
        final SubLObject saved_local_queue = queues.queue_copy(operation_queues.local_queue());
        final SubLObject saved_auxiliary_queue = queues.queue_copy(operation_queues.$auxiliary_queue$.getGlobalValue());
        final SubLObject saved_transcript_queue = queues.queue_copy(operation_queues.$transcript_queue$.getGlobalValue());
        SubLObject disabled_servers = NIL;
        try {
            final SubLObject str = $str200$Setting_up_safe_KB_dump_environme;
            final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str);
                Storage.room(UNPROVIDED);
                disabled_servers = tcp_server_utilities.disable_some_tcp_servers(UNPROVIDED);
                if (NIL != agenda_runningP) {
                    ensure_agenda_halted(NIL);
                }
                if ((NIL != agenda_runningP) && (NIL != agenda.agenda_running())) {
                    Errors.warn($str222$Agenda_was_not_successfully_halte);
                }
                transcript_utilities.$master_transcript$.setGlobalValue(NIL);
                transcript_utilities.$local_transcript$.setGlobalValue(NIL);
                transcript_utilities.set_read_transcript(NIL);
                $communication_mode$.setGlobalValue($UNKNOWN);
                operation_queues.clear_remote_queue();
                operation_queues.clear_local_queue();
                operation_queues.clear_auxiliary_queue();
                operation_queues.clear_transcript_queue();
                kb_utilities.swap_out_all_pristine_kb_objects();
                misc_utilities.flush_all_logs();
                Storage.room(UNPROVIDED);
                kb_utilities.kb_statistics(UNPROVIDED, UNPROVIDED);
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                $progress_start_time$.rebind(_prev_bind_0, thread);
            }
            result = Mapper.write_image(filename, do_full_gcP);
        } finally {
            final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                final SubLObject str2 = $str209$Restoring_pre_dump_environment;
                final SubLObject _prev_bind_0_$21 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_10 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_11 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_12 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_13 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_14 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_15 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_16 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str2 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str2);
                    transcript_utilities.set_master_transcript(UNPROVIDED);
                    transcript_utilities.$local_transcript$.setGlobalValue(saved_local_transcript);
                    transcript_utilities.set_read_transcript(saved_read_transcript);
                    if (NIL != communication_modeP(saved_communication_mode)) {
                        set_communication_mode(saved_communication_mode);
                    }
                    operation_queues.$remote_queue$.setGlobalValue(saved_remote_queue);
                    operation_queues.set_local_queue(saved_local_queue);
                    operation_queues.$auxiliary_queue$.setGlobalValue(saved_auxiliary_queue);
                    operation_queues.$transcript_queue$.setGlobalValue(saved_transcript_queue);
                    if (NIL != agenda_runningP) {
                        agenda.start_agenda(UNPROVIDED);
                    }
                    tcp_server_utilities.re_enable_disabled_tcp_servers(disabled_servers);
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_16, thread);
                    $is_noting_progressP$.rebind(_prev_bind_15, thread);
                    $progress_count$.rebind(_prev_bind_14, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_13, thread);
                    $progress_notification_count$.rebind(_prev_bind_12, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_11, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_10, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$21, thread);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return result;
    }

    public static SubLObject write_cyc_image(final SubLObject filename, SubLObject do_full_gcP) {
        if (do_full_gcP == UNPROVIDED) {
            do_full_gcP = NIL;
        }
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        if (NIL == operation_queues.local_queue_empty()) {
            while (NIL == operation_queues.local_queue_empty()) {
                operation_queues.run_one_local_op();
            } 
        }
        save_transcript_ops();
        final SubLObject agenda_runningP = agenda.agenda_running();
        final SubLObject saved_local_transcript = transcript_utilities.$local_transcript$.getGlobalValue();
        final SubLObject saved_read_transcript = transcript_utilities.$read_transcript$.getGlobalValue();
        final SubLObject saved_communication_mode = $communication_mode$.getGlobalValue();
        final SubLObject saved_remote_queue = queues.queue_copy(operation_queues.$remote_queue$.getGlobalValue());
        final SubLObject saved_local_queue = queues.queue_copy(operation_queues.local_queue());
        final SubLObject saved_auxiliary_queue = queues.queue_copy(operation_queues.$auxiliary_queue$.getGlobalValue());
        final SubLObject saved_transcript_queue = queues.queue_copy(operation_queues.$transcript_queue$.getGlobalValue());
        SubLObject result = NIL;
        if (NIL != agenda_runningP) {
            agenda.halt_agenda(UNPROVIDED);
        }
        transcript_utilities.$master_transcript$.setGlobalValue(NIL);
        transcript_utilities.$local_transcript$.setGlobalValue(NIL);
        transcript_utilities.set_read_transcript(NIL);
        $communication_mode$.setGlobalValue($UNKNOWN);
        operation_queues.clear_remote_queue();
        operation_queues.clear_local_queue();
        operation_queues.clear_auxiliary_queue();
        operation_queues.clear_transcript_queue();
        result = Mapper.write_image(filename, do_full_gcP);
        transcript_utilities.set_master_transcript(UNPROVIDED);
        transcript_utilities.$local_transcript$.setGlobalValue(saved_local_transcript);
        transcript_utilities.set_read_transcript(saved_read_transcript);
        if (NIL != communication_modeP(saved_communication_mode)) {
            set_communication_mode(saved_communication_mode);
        }
        operation_queues.$remote_queue$.setGlobalValue(saved_remote_queue);
        operation_queues.set_local_queue(saved_local_queue);
        operation_queues.$auxiliary_queue$.setGlobalValue(saved_auxiliary_queue);
        operation_queues.$transcript_queue$.setGlobalValue(saved_transcript_queue);
        if (NIL != agenda_runningP) {
            agenda.start_agenda(UNPROVIDED);
        }
        return result;
    }

    public static SubLObject make_cyc_image_filename(SubLObject minor_version) {
        if (minor_version == UNPROVIDED) {
            minor_version = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == subl_promotions.non_negative_integer_p(minor_version)) || (!minor_version.numLE($int$25)))) {
            Errors.error($str224$Minor_version__S_is_not_in_the_ra);
        }
        final SubLObject minor_version_char = Strings.sublisp_char($$$ABCDEFGHIJKLMNOPQRSTUVWXYZ, minor_version);
        final SubLObject kb_loaded = kb_loaded();
        final SubLObject op_number = kb_op_number();
        SubLObject filename = NIL;
        SubLObject extension = NIL;
        SubLObject current;
        final SubLObject datum = current = system_info.cyc_revision_numbers();
        SubLObject system_number = NIL;
        destructuring_bind_must_consp(current, datum, $list226);
        system_number = current.first();
        final SubLObject patch_numbers;
        current = patch_numbers = current.rest();
        final SubLObject patch_strings = Mapping.mapcar(symbol_function(TO_STRING), patch_numbers);
        SubLObject complete_patch_string = $str133$;
        SubLObject cdolist_list_var = patch_strings;
        SubLObject patch_string = NIL;
        patch_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            complete_patch_string = cconcatenate(complete_patch_string, new SubLObject[]{ $$$p, patch_string });
            cdolist_list_var = cdolist_list_var.rest();
            patch_string = cdolist_list_var.first();
        } 
        if (NIL == kb_loaded) {
            filename = format(NIL, $str229$cyc_s_D_A__C, new SubLObject[]{ system_number, complete_patch_string, minor_version_char });
        } else
            if ((NIL == op_number) || op_number.isZero()) {
                filename = format(NIL, $str230$cyc_s_D_A_kb_A__C, new SubLObject[]{ system_number, complete_patch_string, kb_loaded_string(), minor_version_char });
            } else {
                filename = format(NIL, $str231$cyc_s_D_A_kb_A_op__A__C, new SubLObject[]{ system_number, complete_patch_string, kb_loaded_string(), op_number, minor_version_char });
            }

        extension = $$$world;
        return cconcatenate(filename, new SubLObject[]{ $str62$_, extension });
    }

    public static SubLObject make_next_cyc_image_filename(final SubLObject directory_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(directory_string) : "Filesys.directory_p(directory_string) " + "CommonSymbols.NIL != Filesys.directory_p(directory_string) " + directory_string;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == file_utilities.directory_writeable_p(directory_string, UNPROVIDED))) {
            Errors.error($str234$Directory__S_is_not_writeable);
        }
        SubLObject minor_version;
        SubLObject cyc_image_filename;
        SubLObject full_filename;
        for (minor_version = NIL, minor_version = ZERO_INTEGER; minor_version.numL($int$26); minor_version = add(minor_version, ONE_INTEGER)) {
            cyc_image_filename = make_cyc_image_filename(minor_version);
            full_filename = cconcatenate(directory_string, cyc_image_filename);
            if (NIL == Filesys.probe_file(full_filename)) {
                return full_filename;
            }
        }
        return NIL;
    }

    public static SubLObject halt_cyc_image(SubLObject reason) {
        if (reason == UNPROVIDED) {
            reason = $$$done;
        }
        Errors.warn($str237$Halting_Cyc_image____A, reason);
        agenda.halt_agenda(UNPROVIDED);
        misc_utilities.flush_all_logs();
        if (NIL != kb_loaded()) {
            save_transcript_ops();
            transcript_utilities.mark_local_transcript($$$QUIT);
            inference_analysis.save_recent_experience();
            inference_analysis.save_recent_asked_queries();
            hl_transcript_tracing.flush_hl_transcript_trace();
        }
        return Processes.exit(ZERO_INTEGER);
    }

    public static SubLObject get_remote_operations_kb_check_point() {
        return $remote_operations_kb_check_point$.getGlobalValue();
    }

    public static SubLObject set_remote_operations_kb_check_point(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        $remote_operations_kb_check_point$.setGlobalValue(fort);
        return get_remote_operations_kb_check_point();
    }

    public static SubLObject clear_remote_operations_kb_check_point() {
        $remote_operations_kb_check_point$.setGlobalValue(NIL);
        return get_remote_operations_kb_check_point();
    }

    public static SubLObject note_kb_check_point_reached(final SubLObject check_point_value) {
        if ($remote_operations_kb_check_point$.getGlobalValue().eql(check_point_value)) {
            set_communication_mode(get_communication_state(get_transmit_state(communication_mode()), $$$no));
            clear_remote_operations_kb_check_point();
        }
        return check_point_value;
    }

    public static SubLObject transmit_kb_check_point_operation(final SubLObject check_point_value) {
        return operation_queues.add_to_transcript_queue(encapsulation.encapsulate(list(NOTE_KB_CHECK_POINT_REACHED, check_point_value)));
    }

    public static SubLObject possibly_roll_to_allow_transmitting() {
        if (NIL == allow_transmitting()) {
            final SubLObject current_kb = kb_loaded();
            final SubLObject next_kb = number_utilities.f_1X(current_kb);
            close_kb(current_kb, next_kb);
        }
        return NIL;
    }

    public static SubLObject with_rebuilding_stream_optimizations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_ASSERTION_MANAGER_FULLY_LOADED, list(WITH_DEDUCTION_MANAGER_FULLY_LOADED, list(WITH_KB_HL_SUPPORT_CONTENT_INDEX_FULLY_LOADED, list(WITH_NART_INDEX_FULLY_LOADED, list(WITH_CONSTANT_INDEX_FULLY_LOADED, list(CLET, $list246, bq_cons(PROGN, append(body, NIL))))))));
    }

    public static SubLObject ensure_agenda_halted(SubLObject timeout_secs) {
        if (timeout_secs == UNPROVIDED) {
            timeout_secs = NIL;
        }
        set_to_not_receiving();
        final SubLObject timeout_spec;
        SubLObject time_to_wait = timeout_spec = (NIL == timeout_secs) ? $most_positive_fixnum$.getGlobalValue() : timeout_secs;
        while (NIL != agenda.agenda_busyP()) {
            if (time_to_wait.isZero()) {
                Errors.error($str247$Timeout_of__A_secs_arrived__witho, timeout_spec);
            }
            time_to_wait = subtract(time_to_wait, ONE_INTEGER);
            sleep(ONE_INTEGER);
        } 
        agenda.halt_agenda(TEN_INTEGER);
        return time_to_wait;
    }

    public static SubLObject prepare_incremental_kb_dump(SubLObject timeout_secs) {
        if (timeout_secs == UNPROVIDED) {
            timeout_secs = $int$60;
        }
        return ensure_agenda_halted(timeout_secs);
    }

    public static SubLObject dump_incremental_kb(SubLObject directory_path, SubLObject style) {
        if (directory_path == UNPROVIDED) {
            directory_path = NIL;
        }
        if (style == UNPROVIDED) {
            style = $ESSENTIAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject manager = assertion_manager.$assertion_content_manager$.getGlobalValue();
        final SubLObject maintaining_countsP = kb_object_manager.kb_object_usage_counts_enabledP(manager);
        final SubLObject memory_mappedP = kb_object_manager.kb_object_manager_memory_mappedP(manager);
        try {
            kb_object_manager.dont_maintain_kb_object_usage_counts(manager);
            kb_object_manager.kb_object_manager_enable_memory_mapping(manager);
            final SubLObject manager_$22 = deduction_manager.$deduction_content_manager$.getGlobalValue();
            final SubLObject maintaining_countsP_$23 = kb_object_manager.kb_object_usage_counts_enabledP(manager_$22);
            final SubLObject memory_mappedP_$24 = kb_object_manager.kb_object_manager_memory_mappedP(manager_$22);
            try {
                kb_object_manager.dont_maintain_kb_object_usage_counts(manager_$22);
                kb_object_manager.kb_object_manager_enable_memory_mapping(manager_$22);
                final SubLObject manager_$23 = kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue();
                final SubLObject maintaining_countsP_$24 = kb_object_manager.kb_object_usage_counts_enabledP(manager_$23);
                final SubLObject memory_mappedP_$25 = kb_object_manager.kb_object_manager_memory_mappedP(manager_$23);
                try {
                    kb_object_manager.dont_maintain_kb_object_usage_counts(manager_$23);
                    kb_object_manager.kb_object_manager_enable_memory_mapping(manager_$23);
                    final SubLObject manager_$24 = nart_index_manager.$nart_index_manager$.getGlobalValue();
                    final SubLObject maintaining_countsP_$25 = kb_object_manager.kb_object_usage_counts_enabledP(manager_$24);
                    final SubLObject memory_mappedP_$26 = kb_object_manager.kb_object_manager_memory_mappedP(manager_$24);
                    try {
                        kb_object_manager.dont_maintain_kb_object_usage_counts(manager_$24);
                        kb_object_manager.kb_object_manager_enable_memory_mapping(manager_$24);
                        final SubLObject manager_$25 = constant_index_manager.$constant_index_manager$.getGlobalValue();
                        final SubLObject maintaining_countsP_$26 = kb_object_manager.kb_object_usage_counts_enabledP(manager_$25);
                        final SubLObject memory_mappedP_$27 = kb_object_manager.kb_object_manager_memory_mappedP(manager_$25);
                        try {
                            kb_object_manager.dont_maintain_kb_object_usage_counts(manager_$25);
                            kb_object_manager.kb_object_manager_enable_memory_mapping(manager_$25);
                            final SubLObject _prev_bind_0 = $save_asked_queriesP$.currentBinding(thread);
                            try {
                                $save_asked_queriesP$.bind(NIL, thread);
                                if (!directory_path.isString()) {
                                    directory_path = kb_incremental_dump_directory(UNPROVIDED);
                                }
                                if (NIL == file_utilities.directory_writeable_p(directory_path, UNPROVIDED)) {
                                    Errors.cerror($str250$Create_directory_and_continue_, $str251$Directory__S_does_not_exist_, directory_path);
                                    file_utilities.make_directory_recursive(directory_path, UNPROVIDED, UNPROVIDED);
                                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == file_utilities.directory_writeable_p(directory_path, UNPROVIDED))) {
                                        Errors.error($str252$Still_cannot_write_to_dump_direct, directory_path);
                                    }
                                }
                                final SubLObject curr_kb = kb_loaded();
                                try {
                                    set_kb_loaded(subtract(curr_kb, ONE_INTEGER));
                                    final SubLObject pcase_var = style;
                                    if (pcase_var.eql($FULL)) {
                                        dumper.dump_kb(directory_path);
                                    } else
                                        if (pcase_var.eql($STANDARD)) {
                                            dumper.dump_standard_kb(directory_path);
                                        } else
                                            if (pcase_var.eql($ESSENTIAL)) {
                                                dumper.dump_non_computable_kb(directory_path);
                                            } else {
                                                Errors.error($str255$Unknown_dump_style__A_not_impleme, style);
                                            }


                                } finally {
                                    final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        set_kb_loaded(curr_kb);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                    }
                                }
                                dump_incremental_stats_information(directory_path);
                            } finally {
                                $save_asked_queriesP$.rebind(_prev_bind_0, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != maintaining_countsP_$26) {
                                    kb_object_manager.maintain_kb_object_usage_counts(manager_$25);
                                }
                                if (NIL == memory_mappedP_$27) {
                                    kb_object_manager.kb_object_manager_change_stream_buffer_sizes(manager_$25, $int$2048, $int$256);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            if (NIL != maintaining_countsP_$25) {
                                kb_object_manager.maintain_kb_object_usage_counts(manager_$24);
                            }
                            if (NIL == memory_mappedP_$26) {
                                kb_object_manager.kb_object_manager_change_stream_buffer_sizes(manager_$24, $int$2048, $int$256);
                            }
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        if (NIL != maintaining_countsP_$24) {
                            kb_object_manager.maintain_kb_object_usage_counts(manager_$23);
                        }
                        if (NIL == memory_mappedP_$25) {
                            kb_object_manager.kb_object_manager_change_stream_buffer_sizes(manager_$23, $int$2048, $int$256);
                        }
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values5 = getValuesAsVector();
                    if (NIL != maintaining_countsP_$23) {
                        kb_object_manager.maintain_kb_object_usage_counts(manager_$22);
                    }
                    if (NIL == memory_mappedP_$24) {
                        kb_object_manager.kb_object_manager_change_stream_buffer_sizes(manager_$22, $int$2048, $int$256);
                    }
                    restoreValuesFromVector(_values5);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values6 = getValuesAsVector();
                if (NIL != maintaining_countsP) {
                    kb_object_manager.maintain_kb_object_usage_counts(manager);
                }
                if (NIL == memory_mappedP) {
                    kb_object_manager.kb_object_manager_change_stream_buffer_sizes(manager, $int$2048, $int$256);
                }
                restoreValuesFromVector(_values6);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return values(directory_path, style);
    }

    public static SubLObject cyc_dump_incremental_kb(final SubLObject dump_dir, SubLObject style, SubLObject temp_dir, SubLObject timeout_secs, SubLObject worker_count) {
        if (style == UNPROVIDED) {
            style = $STANDARD;
        }
        if (temp_dir == UNPROVIDED) {
            temp_dir = $str258$_fastscratch_tmp_;
        }
        if (timeout_secs == UNPROVIDED) {
            timeout_secs = $int$60;
        }
        if (worker_count == UNPROVIDED) {
            worker_count = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (misc_utilities.generic_caches_directory().isString() && (NIL != Strings.stringE(misc_utilities.generic_caches_directory(), dump_dir, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.warn($str259$Dump_incremental_KB_trivially_fin, dump_dir);
            return dump_dir;
        }
        SubLObject result_directory_path = NIL;
        SubLObject result_style = NIL;
        if (NIL == operation_queues.local_queue_empty()) {
            while (NIL == operation_queues.local_queue_empty()) {
                operation_queues.run_one_local_op();
            } 
        }
        save_transcript_ops();
        inference_analysis.save_recent_experience();
        inference_analysis.save_recent_asked_queries();
        hl_transcript_tracing.flush_hl_transcript_trace();
        final SubLObject agenda_runningP = agenda.agenda_running();
        final SubLObject saved_local_transcript = transcript_utilities.$local_transcript$.getGlobalValue();
        final SubLObject saved_read_transcript = transcript_utilities.$read_transcript$.getGlobalValue();
        final SubLObject saved_communication_mode = $communication_mode$.getGlobalValue();
        final SubLObject saved_remote_queue = queues.queue_copy(operation_queues.$remote_queue$.getGlobalValue());
        final SubLObject saved_local_queue = queues.queue_copy(operation_queues.local_queue());
        final SubLObject saved_auxiliary_queue = queues.queue_copy(operation_queues.$auxiliary_queue$.getGlobalValue());
        final SubLObject saved_transcript_queue = queues.queue_copy(operation_queues.$transcript_queue$.getGlobalValue());
        SubLObject disabled_servers = NIL;
        try {
            final SubLObject str = $str200$Setting_up_safe_KB_dump_environme;
            final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str);
                Storage.room(UNPROVIDED);
                disabled_servers = tcp_server_utilities.disable_some_tcp_servers(UNPROVIDED);
                if (NIL != agenda_runningP) {
                    ensure_agenda_halted(timeout_secs);
                }
                if ((NIL != agenda_runningP) && (NIL != agenda.agenda_running())) {
                    Errors.warn($str222$Agenda_was_not_successfully_halte);
                }
                transcript_utilities.$master_transcript$.setGlobalValue(NIL);
                transcript_utilities.$local_transcript$.setGlobalValue(NIL);
                transcript_utilities.set_read_transcript(NIL);
                $communication_mode$.setGlobalValue($UNKNOWN);
                operation_queues.clear_remote_queue();
                operation_queues.clear_local_queue();
                operation_queues.clear_auxiliary_queue();
                operation_queues.clear_transcript_queue();
                kb_utilities.swap_out_all_pristine_kb_objects();
                misc_utilities.flush_all_logs();
                Storage.room(UNPROVIDED);
                kb_utilities.kb_statistics(UNPROVIDED, UNPROVIDED);
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                $progress_start_time$.rebind(_prev_bind_0, thread);
            }
            final SubLObject old_temp_dir = file_utilities.$temp_directory$.getGlobalValue();
            SubLObject old_worker_count = NIL;
            try {
                file_utilities.$temp_directory$.setGlobalValue(temp_dir);
                if (NIL != subl_promotions.positive_integer_p(worker_count)) {
                    old_worker_count = builder_utilities.set_build_process_worker_count(worker_count);
                }
                thread.resetMultipleValues();
                final SubLObject result_directory_path_$35 = dump_incremental_kb(dump_dir, style);
                final SubLObject result_style_$36 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result_directory_path = result_directory_path_$35;
                result_style = result_style_$36;
            } finally {
                final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    file_utilities.$temp_directory$.setGlobalValue(old_temp_dir);
                    if (NIL != subl_promotions.positive_integer_p(old_worker_count)) {
                        builder_utilities.set_build_process_worker_count(old_worker_count);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
                }
            }
            format_nil.force_format(T, $str260$__Successfully_dumped_incremental, dump_dir, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                final SubLObject str2 = $str209$Restoring_pre_dump_environment;
                final SubLObject _prev_bind_0_$37 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_11 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_12 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_13 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_14 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_15 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_16 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_17 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str2 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str2);
                    transcript_utilities.set_master_transcript(UNPROVIDED);
                    transcript_utilities.$local_transcript$.setGlobalValue(saved_local_transcript);
                    transcript_utilities.set_read_transcript(saved_read_transcript);
                    if (NIL != communication_modeP(saved_communication_mode)) {
                        set_communication_mode(saved_communication_mode);
                    }
                    operation_queues.$remote_queue$.setGlobalValue(saved_remote_queue);
                    operation_queues.set_local_queue(saved_local_queue);
                    operation_queues.$auxiliary_queue$.setGlobalValue(saved_auxiliary_queue);
                    operation_queues.$transcript_queue$.setGlobalValue(saved_transcript_queue);
                    if (NIL != agenda_runningP) {
                        agenda.start_agenda(UNPROVIDED);
                    }
                    tcp_server_utilities.re_enable_disabled_tcp_servers(disabled_servers);
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_17, thread);
                    $is_noting_progressP$.rebind(_prev_bind_16, thread);
                    $progress_count$.rebind(_prev_bind_15, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_14, thread);
                    $progress_notification_count$.rebind(_prev_bind_13, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_12, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_11, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$37, thread);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
            }
        }
        return values(result_directory_path, result_style);
    }

    public static SubLObject prepare_and_dump_incremental_kb(SubLObject dump_dir, SubLObject temp_dir, SubLObject style, SubLObject timeout_secs) {
        if (dump_dir == UNPROVIDED) {
            dump_dir = NIL;
        }
        if (temp_dir == UNPROVIDED) {
            temp_dir = $str258$_fastscratch_tmp_;
        }
        if (style == UNPROVIDED) {
            style = $FULL;
        }
        if (timeout_secs == UNPROVIDED) {
            timeout_secs = $int$60;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject disabled_servers = tcp_server_utilities.disable_some_tcp_servers(UNPROVIDED);
        set_receive_state($$$no);
        prepare_incremental_kb_dump(timeout_secs);
        kb_utilities.swap_out_all_pristine_kb_objects();
        Storage.room(UNPROVIDED);
        kb_utilities.kb_statistics(UNPROVIDED, UNPROVIDED);
        file_utilities.make_directory_recursive(dump_dir, UNPROVIDED, UNPROVIDED);
        SubLObject result_directory_path = NIL;
        SubLObject result_style = NIL;
        final SubLObject old_temp_dir = file_utilities.$temp_directory$.getGlobalValue();
        try {
            file_utilities.$temp_directory$.setGlobalValue(temp_dir);
            thread.resetMultipleValues();
            final SubLObject result_directory_path_$38 = dump_incremental_kb(dump_dir, style);
            final SubLObject result_style_$39 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result_directory_path = result_directory_path_$38;
            result_style = result_style_$39;
            format_nil.force_format(T, $str260$__Successfully_dumped_incremental, dump_dir, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                file_utilities.$temp_directory$.setGlobalValue(old_temp_dir);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        tcp_server_utilities.re_enable_disabled_tcp_servers(disabled_servers);
        return values(result_directory_path, result_style);
    }

    public static SubLObject dump_incremental_stats_information(final SubLObject directory_path) {
        cfasl_utilities.cfasl_save(gather_incremental_operation_stats(), get_incremental_stats_dump_filename(directory_path));
        inference_analysis.receive_experience();
        inference_analysis.save_received_experience(get_incremental_experience_dump_filename(directory_path));
        return directory_path;
    }

    public static SubLObject kb_incremental_dump_directory(SubLObject units_path) {
        if (units_path == UNPROVIDED) {
            units_path = NIL;
        }
        final SubLObject raw_base_path = (units_path.isString()) ? dumper.kb_dump_directory(kb_loaded(), list(units_path)) : dumper.kb_dump_directory(kb_loaded(), UNPROVIDED);
        final SubLObject path_terminator = string_utilities.to_string(string_utilities.last_char(raw_base_path));
        final SubLObject base_path = string_utilities.remove_last_char(raw_base_path, UNPROVIDED);
        return cconcatenate(base_path, new SubLObject[]{ $$$op, string_utilities.to_string(kb_op_number()), path_terminator });
    }

    public static SubLObject load_incremental_kb(final SubLObject directory_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dumper.load_kb(directory_path);
        misc_utilities.system_code_initializations(UNPROVIDED);
        terpri(UNPROVIDED);
        final SubLObject str = $str262$Loading_transformation_rule_stati;
        final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
        try {
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            $progress_notification_count$.bind(ZERO_INTEGER, thread);
            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
            $progress_count$.bind(ZERO_INTEGER, thread);
            $is_noting_progressP$.bind(T, thread);
            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
            noting_progress_preamble(str);
            final SubLObject received_experience = get_incremental_experience_dump_filename(directory_path);
            if (NIL != Filesys.probe_file(received_experience)) {
                inference_analysis.load_received_experience(received_experience);
            }
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        final SubLObject incremental_stats = cfasl_utilities.cfasl_load(get_incremental_stats_dump_filename(directory_path));
        apply_incremental_operation_stats(incremental_stats);
        return NIL;
    }

    public static SubLObject kb_incremental_unitsP(final SubLObject directory_path) {
        return list_utilities.sublisp_boolean(Filesys.probe_file(get_incremental_stats_dump_filename(directory_path)));
    }

    public static SubLObject get_incremental_stats_dump_filename(final SubLObject directory_path) {
        return dumper.kb_dump_file($str263$incremental_stats, directory_path, UNPROVIDED);
    }

    public static SubLObject get_incremental_experience_dump_filename(final SubLObject directory_path) {
        return dumper.kb_dump_file($str264$received_experience, directory_path, UNPROVIDED);
    }

    public static SubLObject gather_incremental_operation_stats() {
        return list($TOTAL_REMOTE_OPERATIONS_RUN, total_remote_operations_run(), $READ_MASTER_TRANSCRIPT_OP_NUMBER, kb_op_number());
    }

    public static SubLObject apply_incremental_operation_stats(final SubLObject incremental_stats) {
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = incremental_stats;
        SubLObject bad = NIL;
        SubLObject current_$40 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, incremental_stats, $list267);
            current_$40 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, incremental_stats, $list267);
            if (NIL == member(current_$40, $list268, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$40 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(incremental_stats, $list267);
        }
        final SubLObject total_remote_operations_run_tail = property_list_member($TOTAL_REMOTE_OPERATIONS_RUN, incremental_stats);
        final SubLObject total_remote_operations_run = (NIL != total_remote_operations_run_tail) ? cadr(total_remote_operations_run_tail) : NIL;
        final SubLObject read_master_transcript_op_number_tail = property_list_member($READ_MASTER_TRANSCRIPT_OP_NUMBER, incremental_stats);
        final SubLObject read_master_transcript_op_number = (NIL != read_master_transcript_op_number_tail) ? cadr(read_master_transcript_op_number_tail) : NIL;
        set_total_remote_operations_run(total_remote_operations_run);
        set_read_master_transcript_op_number(read_master_transcript_op_number);
        return $DONE;
    }

    public static SubLObject declare_operation_communication_file() {
        declareFunction(me, "comm_mode_desc_mode", "COMM-MODE-DESC-MODE", 1, 0, false);
        declareFunction(me, "comm_mode_desc_name", "COMM-MODE-DESC-NAME", 1, 0, false);
        declareFunction(me, "comm_mode_desc_receivingP", "COMM-MODE-DESC-RECEIVING?", 1, 0, false);
        declareFunction(me, "comm_mode_desc_storingP", "COMM-MODE-DESC-STORING?", 1, 0, false);
        declareFunction(me, "comm_mode_desc_transmittingP", "COMM-MODE-DESC-TRANSMITTING?", 1, 0, false);
        declareFunction(me, "get_communication_mode_description", "GET-COMMUNICATION-MODE-DESCRIPTION", 1, 0, false);
        declareFunction(me, "comm_mode_name", "COMM-MODE-NAME", 1, 0, false);
        declareFunction(me, "comm_mode_receivingP", "COMM-MODE-RECEIVING?", 1, 0, false);
        declareFunction(me, "comm_mode_storingP", "COMM-MODE-STORING?", 1, 0, false);
        declareFunction(me, "comm_mode_transmittingP", "COMM-MODE-TRANSMITTING?", 1, 0, false);
        declareFunction(me, "compile_legacy_communication_mode_information", "COMPILE-LEGACY-COMMUNICATION-MODE-INFORMATION", 0, 0, false);
        declareFunction(me, "find_communication_mode", "FIND-COMMUNICATION-MODE", 3, 0, false);
        declareFunction(me, "allow_transmitting", "ALLOW-TRANSMITTING", 0, 0, false);
        declareFunction(me, "set_allow_transmitting", "SET-ALLOW-TRANSMITTING", 1, 0, false);
        declareFunction(me, "kb_full_transcript_loaded", "KB-FULL-TRANSCRIPT-LOADED", 0, 0, false);
        declareFunction(me, "set_kb_full_transcript_loaded", "SET-KB-FULL-TRANSCRIPT-LOADED", 1, 0, false);
        declareFunction(me, "experimental_image", "EXPERIMENTAL-IMAGE", 0, 0, false);
        declareFunction(me, "set_experimental_image", "SET-EXPERIMENTAL-IMAGE", 1, 0, false);
        declareFunction(me, "read_transcript_op_limit", "READ-TRANSCRIPT-OP-LIMIT", 0, 0, false);
        declareFunction(me, "set_read_transcript_op_limit", "SET-READ-TRANSCRIPT-OP-LIMIT", 1, 0, false);
        declareFunction(me, "dont_record_operations_locally", "DONT-RECORD-OPERATIONS-LOCALLY", 0, 0, false);
        declareFunction(me, "set_dont_record_operations_locally", "SET-DONT-RECORD-OPERATIONS-LOCALLY", 1, 0, false);
        declareFunction(me, "receiving_remote_operationsP", "RECEIVING-REMOTE-OPERATIONS?", 0, 0, false);
        declareFunction(me, "set_receiving_remote_operationsP", "SET-RECEIVING-REMOTE-OPERATIONS?", 1, 0, false);
        declareFunction(me, "process_local_operationsP", "PROCESS-LOCAL-OPERATIONS?", 0, 0, false);
        declareFunction(me, "set_process_local_operationsP", "SET-PROCESS-LOCAL-OPERATIONS?", 1, 0, false);
        declareFunction(me, "process_auxiliary_operationsP", "PROCESS-AUXILIARY-OPERATIONS?", 0, 0, false);
        declareFunction(me, "set_process_auxiliary_operationsP", "SET-PROCESS-AUXILIARY-OPERATIONS?", 1, 0, false);
        declareFunction(me, "saving_operationsP", "SAVING-OPERATIONS?", 0, 0, false);
        declareFunction(me, "total_remote_operations_run", "TOTAL-REMOTE-OPERATIONS-RUN", 0, 0, false);
        declareFunction(me, "set_total_remote_operations_run", "SET-TOTAL-REMOTE-OPERATIONS-RUN", 1, 0, false);
        declareFunction(me, "total_auxiliary_operations_run", "TOTAL-AUXILIARY-OPERATIONS-RUN", 0, 0, false);
        declareFunction(me, "inc_total_auxiliary_operations_run", "INC-TOTAL-AUXILIARY-OPERATIONS-RUN", 0, 0, false);
        declareFunction(me, "total_local_operations_recorded", "TOTAL-LOCAL-OPERATIONS-RECORDED", 0, 0, false);
        declareFunction(me, "inc_total_local_operations_recorded", "INC-TOTAL-LOCAL-OPERATIONS-RECORDED", 0, 0, false);
        declareFunction(me, "total_local_operations_transmitted", "TOTAL-LOCAL-OPERATIONS-TRANSMITTED", 0, 0, false);
        declareFunction(me, "inc_total_local_operations_transmitted", "INC-TOTAL-LOCAL-OPERATIONS-TRANSMITTED", 0, 0, false);
        declareFunction(me, "read_master_transcript_op_number", "READ-MASTER-TRANSCRIPT-OP-NUMBER", 0, 0, false);
        declareFunction(me, "set_read_master_transcript_op_number", "SET-READ-MASTER-TRANSCRIPT-OP-NUMBER", 1, 0, false);
        declareFunction(me, "total_master_transcript_operations_processed", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED", 0, 0, false);
        declareFunction(me, "set_total_master_transcript_operations_processed", "SET-TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED", 1, 0, false);
        declareFunction(me, "the_cyclist", "THE-CYCLIST", 0, 0, false);
        declareFunction(me, "set_the_cyclist", "SET-THE-CYCLIST", 0, 1, false);
        declareFunction(me, "map_cyclist_name_to_cyclist_term", "MAP-CYCLIST-NAME-TO-CYCLIST-TERM", 1, 0, false);
        declareFunction(me, "non_guest_cyclist_nameP", "NON-GUEST-CYCLIST-NAME?", 1, 0, false);
        declareFunction(me, "the_cyclist_is_guestP", "THE-CYCLIST-IS-GUEST?", 0, 0, false);
        declareFunction(me, "image_requires_authenticationP", "IMAGE-REQUIRES-AUTHENTICATION?", 0, 0, false);
        declareFunction(me, "authenticate_the_cyclist", "AUTHENTICATE-THE-CYCLIST", 2, 1, false);
        declareFunction(me, "lookup_password_for_cyclist_from_kb", "LOOKUP-PASSWORD-FOR-CYCLIST-FROM-KB", 1, 1, false);
        declareFunction(me, "get_stored_password_for_cyclist_from_kb", "GET-STORED-PASSWORD-FOR-CYCLIST-FROM-KB", 1, 0, false);
        declareFunction(me, "specify_authentication_info_for_user", "SPECIFY-AUTHENTICATION-INFO-FOR-USER", 2, 1, false);
        declareFunction(me, "assert_stored_password_for_cyclist_in_kb", "ASSERT-STORED-PASSWORD-FOR-CYCLIST-IN-KB", 2, 0, false);
        declareFunction(me, "unassert_stored_password_for_cyclist_in_kb", "UNASSERT-STORED-PASSWORD-FOR-CYCLIST-IN-KB", 1, 0, false);
        declareFunction(me, "kb_op_number", "KB-OP-NUMBER", 0, 0, false);
        declareFunction(me, "kb_version_string", "KB-VERSION-STRING", 0, 0, false);
        declareFunction(me, "remote_ops_processed", "REMOTE-OPS-PROCESSED", 0, 0, false);
        declareFunction(me, "kb_number_string", "KB-NUMBER-STRING", 0, 1, false);
        declareFunction(me, "kb_loaded_string", "KB-LOADED-STRING", 0, 0, false);
        declareFunction(me, "available_communication_modes", "AVAILABLE-COMMUNICATION-MODES", 0, 1, false);
        declareFunction(me, "communication_modeP", "COMMUNICATION-MODE?", 1, 0, false);
        declareFunction(me, "communication_mode_name", "COMMUNICATION-MODE-NAME", 1, 0, false);
        declareFunction(me, "communication_mode", "COMMUNICATION-MODE", 0, 0, false);
        declareFunction(me, "set_communication_mode_internal", "SET-COMMUNICATION-MODE-INTERNAL", 1, 0, false);
        declareFunction(me, "set_communication_mode", "SET-COMMUNICATION-MODE", 0, 1, false);
        declareFunction(me, "transmit_state_p", "TRANSMIT-STATE-P", 1, 0, false);
        declareFunction(me, "receive_state_p", "RECEIVE-STATE-P", 1, 0, false);
        declareFunction(me, "set_communication_state", "SET-COMMUNICATION-STATE", 2, 0, false);
        declareFunction(me, "set_transmit_state", "SET-TRANSMIT-STATE", 1, 0, false);
        declareFunction(me, "set_receive_state", "SET-RECEIVE-STATE", 1, 0, false);
        declareFunction(me, "set_to_recording_as_sent", "SET-TO-RECORDING-AS-SENT", 0, 0, false);
        declareFunction(me, "set_to_recording_locally", "SET-TO-RECORDING-LOCALLY", 0, 0, false);
        declareFunction(me, "set_to_recording", "SET-TO-RECORDING", 0, 1, false);
        declareFunction(me, "set_to_no_record", "SET-TO-NO-RECORD", 0, 0, false);
        declareFunction(me, "set_to_receiving", "SET-TO-RECEIVING", 0, 0, false);
        declareFunction(me, "set_to_receiving_everything", "SET-TO-RECEIVING-EVERYTHING", 0, 0, false);
        declareFunction(me, "set_to_not_receiving", "SET-TO-NOT-RECEIVING", 0, 0, false);
        declareFunction(me, "transmitting_changeP", "TRANSMITTING-CHANGE?", 1, 0, false);
        declareFunction(me, "receiving_changeP", "RECEIVING-CHANGE?", 1, 0, false);
        declareFunction(me, "set_to_receive_only", "SET-TO-RECEIVE-ONLY", 0, 0, false);
        declareFunction(me, "set_to_deaf", "SET-TO-DEAF", 0, 0, false);
        declareFunction(me, "set_to_dead", "SET-TO-DEAD", 0, 0, false);
        declareFunction(me, "set_to_transmit_and_receive", "SET-TO-TRANSMIT-AND-RECEIVE", 0, 0, false);
        declareFunction(me, "set_to_transmit_only", "SET-TO-TRANSMIT-ONLY", 0, 0, false);
        declareFunction(me, "set_to_receive_record_transmit", "SET-TO-RECEIVE-RECORD-TRANSMIT", 0, 0, false);
        declareFunction(me, "set_to_dead_receive", "SET-TO-DEAD-RECEIVE", 0, 0, false);
        declareFunction(me, "set_to_record_transmit", "SET-TO-RECORD-TRANSMIT", 0, 0, false);
        declareFunction(me, "transmittingP", "TRANSMITTING?", 0, 0, false);
        declareFunction(me, "storingP", "STORING?", 0, 0, false);
        declareFunction(me, "not_recordingP", "NOT-RECORDING?", 0, 0, false);
        declareFunction(me, "receivingP", "RECEIVING?", 0, 0, false);
        declareFunction(me, "get_transmit_state", "GET-TRANSMIT-STATE", 0, 1, false);
        declareFunction(me, "get_receive_state", "GET-RECEIVE-STATE", 0, 1, false);
        declareFunction(me, "get_communication_state", "GET-COMMUNICATION-STATE", 2, 0, false);
        declareFunction(me, "valid_transcript_expression", "VALID-TRANSCRIPT-EXPRESSION", 1, 0, false);
        declareFunction(me, "operation_from_meP", "OPERATION-FROM-ME?", 1, 0, false);
        declareFunction(me, "writing_transcriptsP", "WRITING-TRANSCRIPTS?", 0, 0, false);
        declareFunction(me, "reading_transcriptsP", "READING-TRANSCRIPTS?", 0, 0, false);
        declareFunction(me, "clear_stored_operations", "CLEAR-STORED-OPERATIONS", 0, 0, false);
        declareFunction(me, "send_stored_operations", "SEND-STORED-OPERATIONS", 0, 0, false);
        declareFunction(me, "fi_save_ops", "FI-SAVE-OPS", 0, 0, false);
        declareFunction(me, "send_local_transcript", "SEND-LOCAL-TRANSCRIPT", 0, 0, false);
        declareFunction(me, "possibly_save_transcript_ops", "POSSIBLY-SAVE-TRANSCRIPT-OPS", 0, 0, false);
        declareFunction(me, "save_transcript_ops", "SAVE-TRANSCRIPT-OPS", 0, 0, false);
        declareFunction(me, "save_transcript_ops_internal", "SAVE-TRANSCRIPT-OPS-INTERNAL", 0, 1, false);
        declareFunction(me, "possibly_save_hl_transcript_ops", "POSSIBLY-SAVE-HL-TRANSCRIPT-OPS", 0, 0, false);
        declareFunction(me, "save_hl_transcript_ops", "SAVE-HL-TRANSCRIPT-OPS", 0, 0, false);
        declareFunction(me, "save_hl_transcript_ops_internal", "SAVE-HL-TRANSCRIPT-OPS-INTERNAL", 0, 0, false);
        declareFunction(me, "close_kb", "CLOSE-KB", 2, 0, false);
        declareFunction(me, "read_one_transcript_operation", "READ-ONE-TRANSCRIPT-OPERATION", 1, 0, false);
        declareFunction(me, "backup_transcript_stream", "BACKUP-TRANSCRIPT-STREAM", 2, 0, false);
        declareFunction(me, "load_transcript_exprs", "LOAD-TRANSCRIPT-EXPRS", 0, 0, false);
        declareFunction(me, "load_transcript_exprs_internal", "LOAD-TRANSCRIPT-EXPRS-INTERNAL", 0, 0, false);
        declareFunction(me, "remote_operation_to_runP", "REMOTE-OPERATION-TO-RUN?", 0, 0, false);
        declareFunction(me, "master_transcript_catch_up", "MASTER-TRANSCRIPT-CATCH-UP", 0, 0, false);
        declareFunction(me, "run_random_transcript_op", "RUN-RANDOM-TRANSCRIPT-OP", 1, 0, false);
        declareFunction(me, "catch_up_to_current", "CATCH-UP-TO-CURRENT", 0, 0, false);
        declareFunction(me, "cyc_catch_up", "CYC-CATCH-UP", 0, 4, false);
        declareFunction(me, "catch_up_kb", "CATCH-UP-KB", 0, 4, false);
        declareFunction(me, "load_transcript_file", "LOAD-TRANSCRIPT-FILE", 1, 5, false);
        declareFunction(me, "load_transcript", "LOAD-TRANSCRIPT", 1, 4, false);
        declareFunction(me, "load_transcript_verbose", "LOAD-TRANSCRIPT-VERBOSE", 1, 4, false);
        declareFunction(me, "load_transcript_file_to_submit", "LOAD-TRANSCRIPT-FILE-TO-SUBMIT", 1, 1, false);
        declareFunction(me, "server_summary", "SERVER-SUMMARY", 0, 1, false);
        declareMacro(me, "with_safe_kb_dump_environment", "WITH-SAFE-KB-DUMP-ENVIRONMENT");
        declareMacro(me, "with_safe_hl_transcript_recording", "WITH-SAFE-HL-TRANSCRIPT-RECORDING");
        declareFunction(me, "cyc_write_image", "CYC-WRITE-IMAGE", 1, 1, false);
        declareFunction(me, "write_cyc_image", "WRITE-CYC-IMAGE", 1, 1, false);
        declareFunction(me, "make_cyc_image_filename", "MAKE-CYC-IMAGE-FILENAME", 0, 1, false);
        declareFunction(me, "make_next_cyc_image_filename", "MAKE-NEXT-CYC-IMAGE-FILENAME", 1, 0, false);
        declareFunction(me, "halt_cyc_image", "HALT-CYC-IMAGE", 0, 1, false);
        declareFunction(me, "get_remote_operations_kb_check_point", "GET-REMOTE-OPERATIONS-KB-CHECK-POINT", 0, 0, false);
        declareFunction(me, "set_remote_operations_kb_check_point", "SET-REMOTE-OPERATIONS-KB-CHECK-POINT", 1, 0, false);
        declareFunction(me, "clear_remote_operations_kb_check_point", "CLEAR-REMOTE-OPERATIONS-KB-CHECK-POINT", 0, 0, false);
        declareFunction(me, "note_kb_check_point_reached", "NOTE-KB-CHECK-POINT-REACHED", 1, 0, false);
        declareFunction(me, "transmit_kb_check_point_operation", "TRANSMIT-KB-CHECK-POINT-OPERATION", 1, 0, false);
        declareFunction(me, "possibly_roll_to_allow_transmitting", "POSSIBLY-ROLL-TO-ALLOW-TRANSMITTING", 0, 0, false);
        declareMacro(me, "with_rebuilding_stream_optimizations", "WITH-REBUILDING-STREAM-OPTIMIZATIONS");
        declareFunction(me, "ensure_agenda_halted", "ENSURE-AGENDA-HALTED", 0, 1, false);
        declareFunction(me, "prepare_incremental_kb_dump", "PREPARE-INCREMENTAL-KB-DUMP", 0, 1, false);
        declareFunction(me, "dump_incremental_kb", "DUMP-INCREMENTAL-KB", 0, 2, false);
        declareFunction(me, "cyc_dump_incremental_kb", "CYC-DUMP-INCREMENTAL-KB", 1, 4, false);
        declareFunction(me, "prepare_and_dump_incremental_kb", "PREPARE-AND-DUMP-INCREMENTAL-KB", 0, 4, false);
        declareFunction(me, "dump_incremental_stats_information", "DUMP-INCREMENTAL-STATS-INFORMATION", 1, 0, false);
        declareFunction(me, "kb_incremental_dump_directory", "KB-INCREMENTAL-DUMP-DIRECTORY", 0, 1, false);
        declareFunction(me, "load_incremental_kb", "LOAD-INCREMENTAL-KB", 1, 0, false);
        declareFunction(me, "kb_incremental_unitsP", "KB-INCREMENTAL-UNITS?", 1, 0, false);
        declareFunction(me, "get_incremental_stats_dump_filename", "GET-INCREMENTAL-STATS-DUMP-FILENAME", 1, 0, false);
        declareFunction(me, "get_incremental_experience_dump_filename", "GET-INCREMENTAL-EXPERIENCE-DUMP-FILENAME", 1, 0, false);
        declareFunction(me, "gather_incremental_operation_stats", "GATHER-INCREMENTAL-OPERATION-STATS", 0, 0, false);
        declareFunction(me, "apply_incremental_operation_stats", "APPLY-INCREMENTAL-OPERATION-STATS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_operation_communication_file() {
        defparameter("*AVAILABLE-COMMUNICATION-MODES*", $list0);
        defparameter("*ALL-COMMUNICATION-MODES*", compile_legacy_communication_mode_information());
        defvar("*STARTUP-COMMUNICATION-MODE*", $UNSET);
        deflexical("*ALLOW-TRANSMITTING*", SubLTrampolineFile.maybeDefault($allow_transmitting$, $allow_transmitting$, T));
        deflexical("*KB-FULL-TRANSCRIPT-LOADED*", SubLTrampolineFile.maybeDefault($kb_full_transcript_loaded$, $kb_full_transcript_loaded$, NIL));
        defparameter("*EXPERIMENTAL-IMAGE*", NIL);
        defparameter("*READ-TRANSCRIPT-OP-LIMIT*", $int$200);
        deflexical("*RECEIVING-REMOTE-OPERATIONS?*", SubLTrampolineFile.maybeDefault($sym20$_RECEIVING_REMOTE_OPERATIONS__, $receiving_remote_operationsP$, T));
        deflexical("*PROCESS-LOCAL-OPERATIONS?*", SubLTrampolineFile.maybeDefault($sym21$_PROCESS_LOCAL_OPERATIONS__, $process_local_operationsP$, T));
        deflexical("*PROCESS-AUXILIARY-OPERATIONS?*", SubLTrampolineFile.maybeDefault($sym22$_PROCESS_AUXILIARY_OPERATIONS__, $process_auxiliary_operationsP$, T));
        deflexical("*TOTAL-REMOTE-OPERATIONS-RUN*", SubLTrampolineFile.maybeDefault($total_remote_operations_run$, $total_remote_operations_run$, ZERO_INTEGER));
        deflexical("*TOTAL-AUXILIARY-OPERATIONS-RUN*", SubLTrampolineFile.maybeDefault($total_auxiliary_operations_run$, $total_auxiliary_operations_run$, ZERO_INTEGER));
        deflexical("*TOTAL-LOCAL-OPERATIONS-RECORDED*", SubLTrampolineFile.maybeDefault($total_local_operations_recorded$, $total_local_operations_recorded$, ZERO_INTEGER));
        deflexical("*TOTAL-LOCAL-OPERATIONS-TRANSMITTED*", SubLTrampolineFile.maybeDefault($total_local_operations_transmitted$, $total_local_operations_transmitted$, ZERO_INTEGER));
        deflexical("*READ-MASTER-TRANSCRIPT-OP-NUMBER*", SubLTrampolineFile.maybeDefault($read_master_transcript_op_number$, $read_master_transcript_op_number$, ZERO_INTEGER));
        deflexical("*TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED*", SubLTrampolineFile.maybeDefault($total_master_transcript_operations_processed$, $total_master_transcript_operations_processed$, ZERO_INTEGER));
        deflexical("*IMAGE-REQUIRES-AUTHENTICATION?*", NIL);
        defparameter("*CYCLIST-AUTHENTICATING-APP*", $$CycBrowser);
        defparameter("*DEFAULT-CYCLIST-AUTHENTICATION-MT*", $$CyclistsMt);
        deflexical("*TRANSMIT-STATES*", $list74);
        deflexical("*RECEIVE-STATES*", $list76);
        deflexical("*BUILD-REQUEST-EMAIL*", $str90$build_requests_cyc_com);
        defparameter("*SAVE-TRANSCRIPT-OPS-LOCK*", make_lock($$$Save_Transcript_OPS_lock));
        defparameter("*SAVE-HL-TRANSCRIPT-OPS-LOCK*", make_lock($str96$Save_Hl_Transcript_OPS_lock));
        defvar("*TRANSCRIPT-LOAD-SUCCEEDED*", NIL);
        deflexical("*TRANSCRIPT-READ-ATTEMPTED*", SubLTrampolineFile.maybeDefault($transcript_read_attempted$, $transcript_read_attempted$, NIL));
        deflexical("*INITIAL-READ-TRANSCRIPT-SIZE*", SubLTrampolineFile.maybeDefault($initial_read_transcript_size$, $initial_read_transcript_size$, ZERO_INTEGER));
        defparameter("*CATCH-UP-KB-TRANSCRIPT-SERVER-WAIT-TIME*", $int$600);
        defparameter("*CATCH-UP-KB-AGENDA-HALT-WAIT-TIME*", NIL);
        deflexical("*REMOTE-OPERATIONS-KB-CHECK-POINT*", SubLTrampolineFile.maybeDefault($remote_operations_kb_check_point$, $remote_operations_kb_check_point$, NIL));
        return NIL;
    }

    public static SubLObject setup_operation_communication_file() {
        system_parameters.register_system_parameter($startup_communication_mode$, $DEAF, $list11, $str12$This_is_the_communication_mode_th);
        declare_defglobal($allow_transmitting$);
        declare_defglobal($kb_full_transcript_loaded$);
        declare_defglobal($sym20$_RECEIVING_REMOTE_OPERATIONS__);
        declare_defglobal($sym21$_PROCESS_LOCAL_OPERATIONS__);
        declare_defglobal($sym22$_PROCESS_AUXILIARY_OPERATIONS__);
        declare_defglobal($total_remote_operations_run$);
        declare_defglobal($total_auxiliary_operations_run$);
        declare_defglobal($total_local_operations_recorded$);
        declare_defglobal($total_local_operations_transmitted$);
        declare_defglobal($read_master_transcript_op_number$);
        declare_defglobal($total_master_transcript_operations_processed$);
        register_external_symbol(THE_CYCLIST);
        register_cyc_api_function($sym31$THE_CYCLIST_IS_GUEST_, NIL, $str32$Return_T_iff_the_current_CyclIst_, NIL, $list33);
        register_cyc_api_function($sym34$IMAGE_REQUIRES_AUTHENTICATION_, NIL, $str35$_return_non_NIL_iff_this_Cyc_imag, NIL, $list36);
        register_cyc_api_function(AUTHENTICATE_THE_CYCLIST, $list41, $str42$Ensure_that_the_encrypted_passphr, $list43, $list44);
        register_cyc_api_function(SPECIFY_AUTHENTICATION_INFO_FOR_USER, $list53, $str54$Store_the_authenitcation_informat, $list55, $list56);
        register_external_symbol(KB_VERSION_STRING);
        register_external_symbol(KB_NUMBER_STRING);
        register_external_symbol(KB_LOADED_STRING);
        register_external_symbol(SET_TO_RECEIVING_EVERYTHING);
        declare_defglobal($transcript_read_attempted$);
        declare_defglobal($initial_read_transcript_size$);
        register_external_symbol(CATCH_UP_TO_CURRENT);
        register_external_symbol(CYC_CATCH_UP);
        register_external_symbol(CATCH_UP_KB);
        register_external_symbol(LOAD_TRANSCRIPT_FILE_TO_SUBMIT);
        declare_defglobal($remote_operations_kb_check_point$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_operation_communication_file();
    }

    @Override
    public void initializeVariables() {
        init_operation_communication_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_operation_communication_file();
    }

    static {













































































































































































































































































































    }
}

/**
 * Total time: 1574 ms synthetic
 */
