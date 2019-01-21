package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Processes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class operation_communication extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.operation_communication";
    public static final String myFingerPrint = "77a90412ef7b6b2f8e2a3b8e37ce2d7bde68d4198483548393e9a1ba3780f908";
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 433L)
    public static SubLSymbol $available_communication_modes$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 3235L)
    public static SubLSymbol $all_communication_modes$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 3330L)
    public static SubLSymbol $startup_communication_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 3528L)
    public static SubLSymbol $allow_transmitting$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 4249L)
    public static SubLSymbol $kb_full_transcript_loaded$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 4614L)
    public static SubLSymbol $experimental_image$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 5756L)
    public static SubLSymbol $read_transcript_op_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 6372L)
    public static SubLSymbol $receiving_remote_operationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 6740L)
    public static SubLSymbol $process_local_operationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 7070L)
    public static SubLSymbol $process_auxiliary_operationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 7508L)
    public static SubLSymbol $total_remote_operations_run$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 7902L)
    public static SubLSymbol $total_auxiliary_operations_run$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 8256L)
    public static SubLSymbol $total_local_operations_recorded$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 8725L)
    public static SubLSymbol $total_local_operations_transmitted$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 9224L)
    public static SubLSymbol $read_master_transcript_op_number$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 10074L)
    public static SubLSymbol $total_master_transcript_operations_processed$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 11727L)
    private static SubLSymbol $image_requires_authenticationP$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 12119L)
    public static SubLSymbol $cyclist_authenticating_app$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 13212L)
    public static SubLSymbol $default_cyclist_authentication_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 21722L)
    private static SubLSymbol $transmit_states$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 21912L)
    private static SubLSymbol $receive_states$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 30368L)
    public static SubLSymbol $build_request_email$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 39839L)
    private static SubLSymbol $save_transcript_ops_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 41868L)
    private static SubLSymbol $save_hl_transcript_ops_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 47242L)
    public static SubLSymbol $transcript_load_succeeded$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 47284L)
    public static SubLSymbol $transcript_read_attempted$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 47328L)
    public static SubLSymbol $initial_read_transcript_size$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 51513L)
    private static SubLSymbol $catch_up_kb_transcript_server_wait_time$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 51583L)
    private static SubLSymbol $catch_up_kb_agenda_halt_wait_time$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 73986L)
    private static SubLSymbol $remote_operations_kb_check_point$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$MODE;
    private static final SubLSymbol $kw2$UNKNOWN;
    private static final SubLSymbol $kw3$NAME;
    private static final SubLString $str4$unknown_mode;
    private static final SubLSymbol $kw5$RECEIVE_;
    private static final SubLSymbol $kw6$STORE_;
    private static final SubLSymbol $kw7$TRANSMIT_;
    private static final SubLSymbol $sym8$COMM_MODE_DESC_MODE;
    private static final SubLSymbol $sym9$_STARTUP_COMMUNICATION_MODE_;
    private static final SubLSymbol $kw10$DEAF;
    private static final SubLList $list11;
    private static final SubLString $str12$This_is_the_communication_mode_th;
    private static final SubLSymbol $kw13$UNSET;
    private static final SubLSymbol $sym14$_ALLOW_TRANSMITTING_;
    private static final SubLSymbol $sym15$_KB_FULL_TRANSCRIPT_LOADED_;
    private static final SubLSymbol $kw16$TRANSMIT_AND_RECEIVE;
    private static final SubLSymbol $kw17$RECEIVE_ONLY;
    private static final SubLSymbol $kw18$TRANSMIT_ONLY;
    private static final SubLInteger $int19$200;
    private static final SubLSymbol $sym20$_RECEIVING_REMOTE_OPERATIONS__;
    private static final SubLSymbol $sym21$_PROCESS_LOCAL_OPERATIONS__;
    private static final SubLSymbol $sym22$_PROCESS_AUXILIARY_OPERATIONS__;
    private static final SubLSymbol $sym23$_TOTAL_REMOTE_OPERATIONS_RUN_;
    private static final SubLSymbol $sym24$_TOTAL_AUXILIARY_OPERATIONS_RUN_;
    private static final SubLSymbol $sym25$_TOTAL_LOCAL_OPERATIONS_RECORDED_;
    private static final SubLSymbol $sym26$_TOTAL_LOCAL_OPERATIONS_TRANSMITTED_;
    private static final SubLSymbol $sym27$_READ_MASTER_TRANSCRIPT_OP_NUMBER_;
    private static final SubLSymbol $sym28$_TOTAL_MASTER_TRANSCRIPT_OPERATIONS_PROCESSED_;
    private static final SubLSymbol $sym29$THE_CYCLIST;
    private static final SubLObject $const30$Guest;
    private static final SubLSymbol $sym31$THE_CYCLIST_IS_GUEST_;
    private static final SubLString $str32$Return_T_iff_the_current_CyclIst_;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$IMAGE_REQUIRES_AUTHENTICATION_;
    private static final SubLString $str35$_return_non_NIL_iff_this_Cyc_imag;
    private static final SubLList $list36;
    private static final SubLObject $const37$CycBrowser;
    private static final SubLSymbol $sym38$STRINGP;
    private static final SubLSymbol $sym39$FORT_P;
    private static final SubLSymbol $sym40$AUTHENTICATE_THE_CYCLIST;
    private static final SubLList $list41;
    private static final SubLString $str42$Ensure_that_the_encrypted_passphr;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLObject $const45$CyclistsMt;
    private static final SubLObject $const46$UserOfProgramFn;
    private static final SubLSymbol $sym47$RELEVANT_MT_IS_GENL_MT;
    private static final SubLObject $const48$encryptedPasswordForUser;
    private static final SubLString $str49$Please_login_to_specify_authentic;
    private static final SubLSymbol $sym50$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str51$Cyclists_can_only_edit_their_own_;
    private static final SubLSymbol $sym52$SPECIFY_AUTHENTICATION_INFO_FOR_USER;
    private static final SubLList $list53;
    private static final SubLString $str54$Store_the_authenitcation_informat;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLString $str57$__Error__A___A__;
    private static final SubLString $str58$Cannot_assert_passphrase_for__A__;
    private static final SubLString $str59$Cannot_unassert_missing_passphras;
    private static final SubLString $str60$Cannot_unassert_passphrase__A_for;
    private static final SubLSymbol $sym61$KB_VERSION_STRING;
    private static final SubLString $str62$_;
    private static final SubLSymbol $sym63$KB_NUMBER_STRING;
    private static final SubLString $str64$_4__0D;
    private static final SubLSymbol $sym65$KB_LOADED_STRING;
    private static final SubLSymbol $sym66$CAR;
    private static final SubLSymbol $sym67$KEYWORDP;
    private static final SubLSymbol $sym68$COMMUNICATION_MODE_;
    private static final SubLSymbol $kw69$DEAD;
    private static final SubLSymbol $kw70$DEAD_RECEIVE;
    private static final SubLSymbol $kw71$RECEIVE_RECORD_TRANSMIT;
    private static final SubLSymbol $kw72$RECORD_TRANSMIT;
    private static final SubLString $str73$Unsupported_communication_mode__A;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$STRING_EQUAL;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$TRANSMIT_STATE_P;
    private static final SubLSymbol $sym78$RECEIVE_STATE_P;
    private static final SubLString $str79$SENT;
    private static final SubLSymbol $sym80$SET_TO_RECEIVING_EVERYTHING;
    private static final SubLString $str81$transmit_and_store;
    private static final SubLString $str82$store;
    private static final SubLString $str83$transmit;
    private static final SubLString $str84$none;
    private static final SubLString $str85$yes;
    private static final SubLString $str86$no;
    private static final SubLString $str87$None;
    private static final SubLString $str88$Yes;
    private static final SubLString $str89$CLEARED;
    private static final SubLString $str90$build_requests_cyc_com;
    private static final SubLSymbol $kw91$APPEND;
    private static final SubLSymbol $kw92$OUTPUT;
    private static final SubLString $str93$Unable_to_open__S;
    private static final SubLString $str94$_s__;
    private static final SubLString $str95$Save_Transcript_OPS_lock;
    private static final SubLString $str96$Save_Hl_Transcript_OPS_lock;
    private static final SubLSymbol $kw97$EOF;
    private static final SubLSymbol $kw98$ERROR;
    private static final SubLString $str99$Bogus_form__S_read_from_transcrip;
    private static final SubLString $str100$Skip_forward_until_a_valid_transc;
    private static final SubLString $str101$Assume_the_rest_of_the_operation_;
    private static final SubLString $str102$Partial_transcript_operation__S_w;
    private static final SubLSymbol $sym103$_TRANSCRIPT_READ_ATTEMPTED_;
    private static final SubLSymbol $sym104$_INITIAL_READ_TRANSCRIPT_SIZE_;
    private static final SubLString $str105$The_transcript_file__s_has_alread;
    private static final SubLSymbol $kw106$INPUT;
    private static final SubLString $str107$__Processing_master_transcript_op;
    private static final SubLInteger $int108$100;
    private static final SubLString $str109$___4__0D__2__0D__2__0D__2__0D__2_;
    private static final SubLString $str110$__Finished_processing__A_master_t;
    private static final SubLSymbol $kw111$UNENCAPSULATION_ERROR;
    private static final SubLInteger $int112$600;
    private static final SubLSymbol $sym113$CATCH_UP_TO_CURRENT;
    private static final SubLSymbol $sym114$CYC_CATCH_UP;
    private static final SubLSymbol $sym115$CATCH_UP_KB;
    private static final SubLString $str116$Cannot_catchup_backwards_from_KB_;
    private static final SubLString $str117$Cannot_catchup_backwards_from_KB_;
    private static final SubLString $str118$_A_ops_to_run_from_KB__A__;
    private static final SubLString $str119$Shutting_down_agenda;
    private static final SubLString $str120$Could_not_shut_down_agenda_;
    private static final SubLString $str121$Will_load_submitted_transcripts;
    private static final SubLString $str122$Will_send_submitted_transcript_no;
    private static final SubLString $str123$Will_not_send_submitted_transcrip;
    private static final SubLString $str124$Catching_up_on_;
    private static final SubLString $str125$_operations_from_KB_;
    private static final SubLString $str126$_to_;
    private static final SubLString $str127$_A_At_KB__A__waiting__A_seconds_f;
    private static final SubLString $str128$Last_operation___S__;
    private static final SubLSymbol $kw129$AUX;
    private static final SubLSymbol $kw130$NONE;
    private static final SubLString $str131$Evaluating__load_transcript_;
    private static final SubLString $str132$_;
    private static final SubLString $str133$;
    private static final SubLString $str134$_;
    private static final SubLSymbol $kw135$LOCAL;
    private static final SubLString $str136$___s_operation_A_performed__;
    private static final SubLString $str137$s_were;
    private static final SubLString $str138$_was;
    private static final SubLSymbol $kw139$SILENT;
    private static final SubLString $str140$___A__;
    private static final SubLString $str141$___s_constant_A__A__;
    private static final SubLString $str142$created;
    private static final SubLString $str143$destroyed;
    private static final SubLString $str144$___s_nart_A__A__;
    private static final SubLString $str145$___s_assertion_A__A__;
    private static final SubLString $str146$___s_kb_hl_support_A__A__;
    private static final SubLString $str147$___s_deduction_A__A__;
    private static final SubLSymbol $sym148$LOAD_TRANSCRIPT_FILE_TO_SUBMIT;
    private static final SubLInteger $int149$10000;
    private static final SubLString $str150$Loading_;
    private static final SubLString $str151$_to_send_____;
    private static final SubLString $str152$__Server_Summary____A;
    private static final SubLString $str153$___Machine___A;
    private static final SubLString $str154$__A;
    private static final SubLString $str155$__Cyclist___A;
    private static final SubLString $str156$___KB___A;
    private static final SubLString $str157$___System___A;
    private static final SubLString $str158$___A_;
    private static final SubLString $str159$__Comm___A;
    private static final SubLString $str160$___Agenda___A;
    private static final SubLString $str161$__Queues_;
    private static final SubLString $str162$___Aux__;
    private static final SubLString $str163$__d__d_;
    private static final SubLString $str164$__d_;
    private static final SubLString $str165$___Remote__;
    private static final SubLString $str166$___Local__;
    private static final SubLString $str167$__d__d__d_;
    private static final SubLList $list168;
    private static final SubLList $list169;
    private static final SubLSymbol $kw170$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw171$AGENDA_TIMEOUT;
    private static final SubLSymbol $kw172$DISABLE_TCP_SERVERS_;
    private static final SubLSymbol $sym173$AGENDA_RUNNING_;
    private static final SubLSymbol $sym174$SAVED_LOCAL_TRANSCRIPT;
    private static final SubLSymbol $sym175$SAVED_READ_TRANSCRIPT;
    private static final SubLSymbol $sym176$SAVED_COMMUNICATION_MODE;
    private static final SubLSymbol $sym177$SAVED_REMOTE_QUEUE;
    private static final SubLSymbol $sym178$SAVED_LOCAL_QUEUE;
    private static final SubLSymbol $sym179$SAVED_AUXILIARY_QUEUE;
    private static final SubLSymbol $sym180$SAVED_TRANSCRIPT_QUEUE;
    private static final SubLSymbol $sym181$DISABLED_SERVERS;
    private static final SubLSymbol $sym182$PROGN;
    private static final SubLList $list183;
    private static final SubLList $list184;
    private static final SubLList $list185;
    private static final SubLList $list186;
    private static final SubLList $list187;
    private static final SubLSymbol $sym188$CLET;
    private static final SubLList $list189;
    private static final SubLList $list190;
    private static final SubLList $list191;
    private static final SubLList $list192;
    private static final SubLList $list193;
    private static final SubLList $list194;
    private static final SubLList $list195;
    private static final SubLList $list196;
    private static final SubLList $list197;
    private static final SubLSymbol $sym198$CUNWIND_PROTECT;
    private static final SubLSymbol $sym199$NOTING_PROGRESS;
    private static final SubLString $str200$Setting_up_safe_KB_dump_environme;
    private static final SubLList $list201;
    private static final SubLSymbol $sym202$PWHEN;
    private static final SubLSymbol $sym203$CSETQ;
    private static final SubLList $list204;
    private static final SubLSymbol $sym205$ENSURE_AGENDA_HALTED;
    private static final SubLSymbol $sym206$CAND;
    private static final SubLList $list207;
    private static final SubLList $list208;
    private static final SubLString $str209$Restoring_pre_dump_environment;
    private static final SubLList $list210;
    private static final SubLSymbol $sym211$_LOCAL_TRANSCRIPT_;
    private static final SubLSymbol $sym212$SET_READ_TRANSCRIPT;
    private static final SubLSymbol $sym213$SET_COMMUNICATION_MODE;
    private static final SubLSymbol $sym214$_REMOTE_QUEUE_;
    private static final SubLSymbol $sym215$SET_LOCAL_QUEUE;
    private static final SubLSymbol $sym216$_AUXILIARY_QUEUE_;
    private static final SubLSymbol $sym217$_TRANSCRIPT_QUEUE_;
    private static final SubLList $list218;
    private static final SubLSymbol $sym219$RE_ENABLE_DISABLED_TCP_SERVERS;
    private static final SubLList $list220;
    private static final SubLSymbol $sym221$WITH_SAFE_KB_DUMP_ENVIRONMENT;
    private static final SubLString $str222$Agenda_was_not_successfully_halte;
    private static final SubLInteger $int223$25;
    private static final SubLString $str224$Minor_version__S_is_not_in_the_ra;
    private static final SubLString $str225$ABCDEFGHIJKLMNOPQRSTUVWXYZ;
    private static final SubLList $list226;
    private static final SubLSymbol $sym227$TO_STRING;
    private static final SubLString $str228$p;
    private static final SubLString $str229$cyc_s_D_A__C;
    private static final SubLString $str230$cyc_s_D_A_kb_A__C;
    private static final SubLString $str231$cyc_s_D_A_kb_A_op__A__C;
    private static final SubLString $str232$world;
    private static final SubLSymbol $sym233$DIRECTORY_P;
    private static final SubLString $str234$Directory__S_is_not_writeable;
    private static final SubLInteger $int235$26;
    private static final SubLString $str236$done;
    private static final SubLString $str237$Halting_Cyc_image____A;
    private static final SubLString $str238$QUIT;
    private static final SubLSymbol $sym239$_REMOTE_OPERATIONS_KB_CHECK_POINT_;
    private static final SubLSymbol $sym240$NOTE_KB_CHECK_POINT_REACHED;
    private static final SubLSymbol $sym241$WITH_ASSERTION_MANAGER_FULLY_LOADED;
    private static final SubLSymbol $sym242$WITH_DEDUCTION_MANAGER_FULLY_LOADED;
    private static final SubLSymbol $sym243$WITH_KB_HL_SUPPORT_CONTENT_INDEX_FULLY_LOADED;
    private static final SubLSymbol $sym244$WITH_NART_INDEX_FULLY_LOADED;
    private static final SubLSymbol $sym245$WITH_CONSTANT_INDEX_FULLY_LOADED;
    private static final SubLList $list246;
    private static final SubLString $str247$Timeout_of__A_secs_arrived__witho;
    private static final SubLInteger $int248$60;
    private static final SubLSymbol $kw249$ESSENTIAL;
    private static final SubLString $str250$Create_directory_and_continue_;
    private static final SubLString $str251$Directory__S_does_not_exist_;
    private static final SubLString $str252$Still_cannot_write_to_dump_direct;
    private static final SubLSymbol $kw253$FULL;
    private static final SubLSymbol $kw254$STANDARD;
    private static final SubLString $str255$Unknown_dump_style__A_not_impleme;
    private static final SubLInteger $int256$2048;
    private static final SubLInteger $int257$256;
    private static final SubLString $str258$_fastscratch_tmp_;
    private static final SubLString $str259$Dump_incremental_KB_trivially_fin;
    private static final SubLString $str260$__Successfully_dumped_incremental;
    private static final SubLString $str261$op;
    private static final SubLString $str262$Loading_transformation_rule_stati;
    private static final SubLString $str263$incremental_stats;
    private static final SubLString $str264$received_experience;
    private static final SubLSymbol $kw265$TOTAL_REMOTE_OPERATIONS_RUN;
    private static final SubLSymbol $kw266$READ_MASTER_TRANSCRIPT_OP_NUMBER;
    private static final SubLList $list267;
    private static final SubLList $list268;
    private static final SubLSymbol $kw269$DONE;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 1430L)
    public static SubLObject comm_mode_desc_mode(final SubLObject desc) {
        return conses_high.getf(desc, (SubLObject)operation_communication.$kw1$MODE, (SubLObject)operation_communication.$kw2$UNKNOWN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 1513L)
    public static SubLObject comm_mode_desc_name(final SubLObject desc) {
        return conses_high.getf(desc, (SubLObject)operation_communication.$kw3$NAME, (SubLObject)operation_communication.$str4$unknown_mode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 1601L)
    public static SubLObject comm_mode_desc_receivingP(final SubLObject desc) {
        return conses_high.getf(desc, (SubLObject)operation_communication.$kw5$RECEIVE_, (SubLObject)operation_communication.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 1688L)
    public static SubLObject comm_mode_desc_storingP(final SubLObject desc) {
        return conses_high.getf(desc, (SubLObject)operation_communication.$kw6$STORE_, (SubLObject)operation_communication.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 1771L)
    public static SubLObject comm_mode_desc_transmittingP(final SubLObject desc) {
        return conses_high.getf(desc, (SubLObject)operation_communication.$kw7$TRANSMIT_, (SubLObject)operation_communication.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 1862L)
    public static SubLObject get_communication_mode_description(final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.find(mode, operation_communication.$available_communication_modes$.getDynamicValue(thread), (SubLObject)operation_communication.EQL, (SubLObject)operation_communication.$sym8$COMM_MODE_DESC_MODE, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 2003L)
    public static SubLObject comm_mode_name(final SubLObject mode) {
        return comm_mode_desc_name(get_communication_mode_description(mode));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 2117L)
    public static SubLObject comm_mode_receivingP(final SubLObject mode) {
        return comm_mode_desc_receivingP(get_communication_mode_description(mode));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 2243L)
    public static SubLObject comm_mode_storingP(final SubLObject mode) {
        return comm_mode_desc_storingP(get_communication_mode_description(mode));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 2365L)
    public static SubLObject comm_mode_transmittingP(final SubLObject mode) {
        return comm_mode_desc_transmittingP(get_communication_mode_description(mode));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 2497L)
    public static SubLObject compile_legacy_communication_mode_information() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject modes = (SubLObject)operation_communication.NIL;
        SubLObject cdolist_list_var = operation_communication.$available_communication_modes$.getDynamicValue(thread);
        SubLObject description = (SubLObject)operation_communication.NIL;
        description = cdolist_list_var.first();
        while (operation_communication.NIL != cdolist_list_var) {
            final SubLObject mode = comm_mode_desc_mode(description);
            final SubLObject name = comm_mode_desc_name(description);
            modes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(mode, name), modes);
            cdolist_list_var = cdolist_list_var.rest();
            description = cdolist_list_var.first();
        }
        return Sequences.nreverse(modes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 2820L)
    public static SubLObject find_communication_mode(final SubLObject receiveP, final SubLObject storeP, final SubLObject transmitP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = operation_communication.$available_communication_modes$.getDynamicValue(thread);
        SubLObject description = (SubLObject)operation_communication.NIL;
        description = cdolist_list_var.first();
        while (operation_communication.NIL != cdolist_list_var) {
            if (receiveP.eql(comm_mode_desc_receivingP(description)) && storeP.eql(comm_mode_desc_storingP(description)) && transmitP.eql(comm_mode_desc_transmittingP(description))) {
                return comm_mode_desc_mode(description);
            }
            cdolist_list_var = cdolist_list_var.rest();
            description = cdolist_list_var.first();
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 3977L)
    public static SubLObject allow_transmitting() {
        return operation_communication.$allow_transmitting$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 4085L)
    public static SubLObject set_allow_transmitting(final SubLObject v_boolean) {
        operation_communication.$allow_transmitting$.setGlobalValue(v_boolean);
        return operation_communication.$allow_transmitting$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 4295L)
    public static SubLObject kb_full_transcript_loaded() {
        return operation_communication.$kb_full_transcript_loaded$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 4422L)
    public static SubLObject set_kb_full_transcript_loaded(final SubLObject v_boolean) {
        operation_communication.$kb_full_transcript_loaded$.setGlobalValue(v_boolean);
        return operation_communication.$kb_full_transcript_loaded$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 4979L)
    public static SubLObject experimental_image() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return operation_communication.$experimental_image$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 5085L)
    public static SubLObject set_experimental_image(final SubLObject v_boolean) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (communication_mode().equal((SubLObject)operation_communication.$kw16$TRANSMIT_AND_RECEIVE)) {
            set_communication_mode((SubLObject)operation_communication.$kw17$RECEIVE_ONLY);
        }
        if (communication_mode().equal((SubLObject)operation_communication.$kw18$TRANSMIT_ONLY)) {
            set_communication_mode((SubLObject)operation_communication.$kw10$DEAF);
        }
        operation_queues.clear_transmit_queue();
        operation_queues.clear_local_operation_storage_queue();
        set_allow_transmitting((SubLObject)SubLObjectFactory.makeBoolean(operation_communication.NIL == v_boolean));
        operation_communication.$experimental_image$.setDynamicValue(v_boolean, thread);
        return operation_communication.$experimental_image$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 5861L)
    public static SubLObject read_transcript_op_limit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return operation_communication.$read_transcript_op_limit$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 5940L)
    public static SubLObject set_read_transcript_op_limit(final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        operation_communication.$read_transcript_op_limit$.setDynamicValue(number, thread);
        return operation_communication.$read_transcript_op_limit$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 6074L)
    public static SubLObject dont_record_operations_locally() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_parameters.$dont_record_operations_locally$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 6218L)
    public static SubLObject set_dont_record_operations_locally(final SubLObject v_boolean) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        system_parameters.$dont_record_operations_locally$.setDynamicValue(v_boolean, thread);
        return system_parameters.$dont_record_operations_locally$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 6419L)
    public static SubLObject receiving_remote_operationsP() {
        return operation_communication.$receiving_remote_operationsP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 6592L)
    public static SubLObject set_receiving_remote_operationsP(final SubLObject v_boolean) {
        operation_communication.$receiving_remote_operationsP$.setGlobalValue(v_boolean);
        return operation_communication.$receiving_remote_operationsP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 6784L)
    public static SubLObject process_local_operationsP() {
        return operation_communication.$process_local_operationsP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 6931L)
    public static SubLObject set_process_local_operationsP(final SubLObject v_boolean) {
        operation_communication.$process_local_operationsP$.setGlobalValue(v_boolean);
        return operation_communication.$process_local_operationsP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 7118L)
    public static SubLObject process_auxiliary_operationsP() {
        return operation_communication.$process_auxiliary_operationsP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 7277L)
    public static SubLObject set_process_auxiliary_operationsP(final SubLObject v_boolean) {
        operation_communication.$process_auxiliary_operationsP$.setGlobalValue(v_boolean);
        return operation_communication.$process_auxiliary_operationsP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 7428L)
    public static SubLObject saving_operationsP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(operation_communication.NIL != storingP() || operation_communication.NIL != transmittingP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 7673L)
    public static SubLObject total_remote_operations_run() {
        return operation_communication.$total_remote_operations_run$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 7759L)
    public static SubLObject set_total_remote_operations_run(final SubLObject number) {
        operation_communication.$total_remote_operations_run$.setGlobalValue(number);
        return operation_communication.$total_remote_operations_run$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 8026L)
    public static SubLObject total_auxiliary_operations_run() {
        return operation_communication.$total_auxiliary_operations_run$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 8118L)
    public static SubLObject inc_total_auxiliary_operations_run() {
        operation_communication.$total_auxiliary_operations_run$.setGlobalValue(Numbers.add(operation_communication.$total_auxiliary_operations_run$.getGlobalValue(), (SubLObject)operation_communication.ONE_INTEGER));
        return operation_communication.$total_auxiliary_operations_run$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 8490L)
    public static SubLObject total_local_operations_recorded() {
        return operation_communication.$total_local_operations_recorded$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 8584L)
    public static SubLObject inc_total_local_operations_recorded() {
        operation_communication.$total_local_operations_recorded$.setGlobalValue(Numbers.add(operation_communication.$total_local_operations_recorded$.getGlobalValue(), (SubLObject)operation_communication.ONE_INTEGER));
        return operation_communication.$total_local_operations_recorded$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 8974L)
    public static SubLObject total_local_operations_transmitted() {
        return operation_communication.$total_local_operations_transmitted$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 9074L)
    public static SubLObject inc_total_local_operations_transmitted() {
        operation_communication.$total_local_operations_transmitted$.setGlobalValue(Numbers.add(operation_communication.$total_local_operations_transmitted$.getGlobalValue(), (SubLObject)operation_communication.ONE_INTEGER));
        return operation_communication.$total_local_operations_transmitted$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 9705L)
    public static SubLObject read_master_transcript_op_number() {
        return operation_communication.$read_master_transcript_op_number$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 9872L)
    public static SubLObject set_read_master_transcript_op_number(final SubLObject number) {
        operation_communication.$read_master_transcript_op_number$.setGlobalValue(number);
        return number;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 10241L)
    public static SubLObject total_master_transcript_operations_processed() {
        return operation_communication.$total_master_transcript_operations_processed$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 10361L)
    public static SubLObject set_total_master_transcript_operations_processed(final SubLObject number) {
        operation_communication.$total_master_transcript_operations_processed$.setGlobalValue(number);
        return operation_communication.$total_master_transcript_operations_processed$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 10555L)
    public static SubLObject the_cyclist() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return api_control_vars.$the_cyclist$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 10923L)
    public static SubLObject set_the_cyclist(SubLObject name) {
        if (name == operation_communication.UNPROVIDED) {
            name = (SubLObject)operation_communication.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = map_cyclist_name_to_cyclist_term(name);
        api_control_vars.$the_cyclist$.setDynamicValue(fort, thread);
        return api_control_vars.$the_cyclist$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 11087L)
    public static SubLObject map_cyclist_name_to_cyclist_term(final SubLObject name) {
        final SubLObject cyclist_term = (SubLObject)(name.isString() ? fi.fi_find_int(name) : ((operation_communication.NIL != forts.valid_fortP(name)) ? name : operation_communication.NIL));
        if (operation_communication.NIL != cyclist_term && operation_communication.NIL != kb_accessors.cyclistP(cyclist_term)) {
            return cyclist_term;
        }
        return operation_communication.$const30$Guest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 11369L)
    public static SubLObject non_guest_cyclist_nameP(final SubLObject name) {
        final SubLObject cyclist = map_cyclist_name_to_cyclist_term(name);
        return (SubLObject)SubLObjectFactory.makeBoolean(operation_communication.NIL != forts.fort_p(cyclist) && operation_communication.NIL == kb_utilities.kbeq(cyclist, operation_communication.$const30$Guest));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 11553L)
    public static SubLObject the_cyclist_is_guestP() {
        return Equality.equal(the_cyclist(), operation_communication.$const30$Guest);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 11927L)
    public static SubLObject image_requires_authenticationP() {
        return list_utilities.sublisp_boolean(operation_communication.$image_requires_authenticationP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 12255L)
    public static SubLObject authenticate_the_cyclist(final SubLObject name, final SubLObject encrypted_password, SubLObject application) {
        if (application == operation_communication.UNPROVIDED) {
            application = operation_communication.$cyclist_authenticating_app$.getDynamicValue();
        }
        enforceType(name, operation_communication.$sym38$STRINGP);
        enforceType(encrypted_password, operation_communication.$sym38$STRINGP);
        enforceType(application, operation_communication.$sym39$FORT_P);
        set_the_cyclist((SubLObject)operation_communication.UNPROVIDED);
        final SubLObject cyclist = map_cyclist_name_to_cyclist_term(name);
        if (!cyclist.equal(operation_communication.$const30$Guest)) {
            final SubLObject fetched_password = lookup_password_for_cyclist_from_kb(cyclist, application);
            if (fetched_password.isString() && operation_communication.NIL != Strings.stringE(encrypted_password, fetched_password, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED)) {
                api_control_vars.$the_cyclist$.setDynamicValue(cyclist);
            }
        }
        return the_cyclist();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 13410L)
    public static SubLObject lookup_password_for_cyclist_from_kb(final SubLObject cyclist, SubLObject application) {
        if (application == operation_communication.UNPROVIDED) {
            application = operation_communication.$cyclist_authenticating_app$.getDynamicValue();
        }
        SubLObject password = (SubLObject)operation_communication.NIL;
        if (operation_communication.NIL != forts.fort_p(application)) {
            final SubLObject raw_compound_cyclist = el_utilities.make_binary_formula(operation_communication.$const46$UserOfProgramFn, application, cyclist);
            final SubLObject compound_cyclist = narts_high.find_nart(raw_compound_cyclist);
            if (operation_communication.NIL == compound_cyclist) {
                password = lookup_password_for_cyclist_from_kb(cyclist, (SubLObject)operation_communication.NIL);
            }
            else {
                password = get_stored_password_for_cyclist_from_kb(compound_cyclist);
                if (operation_communication.NIL == password) {
                    password = lookup_password_for_cyclist_from_kb(cyclist, (SubLObject)operation_communication.NIL);
                }
            }
        }
        else {
            password = get_stored_password_for_cyclist_from_kb(cyclist);
        }
        return password;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 14602L)
    public static SubLObject get_stored_password_for_cyclist_from_kb(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject passwords = (SubLObject)operation_communication.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)operation_communication.$sym47$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(operation_communication.$default_cyclist_authentication_mt$.getDynamicValue(thread), thread);
            passwords = kb_mapping_utilities.fpred_value(cyclist, operation_communication.$const48$encryptedPasswordForUser, (SubLObject)operation_communication.ONE_INTEGER, (SubLObject)operation_communication.TWO_INTEGER, (SubLObject)operation_communication.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return passwords.isCons() ? passwords.first() : passwords;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 15006L)
    public static SubLObject specify_authentication_info_for_user(final SubLObject cyclist, final SubLObject passphrase, SubLObject application) {
        if (application == operation_communication.UNPROVIDED) {
            application = operation_communication.$cyclist_authenticating_app$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(cyclist, operation_communication.$sym39$FORT_P);
        enforceType(passphrase, operation_communication.$sym38$STRINGP);
        if (operation_communication.NIL != the_cyclist_is_guestP()) {
            return Values.values((SubLObject)operation_communication.NIL, (SubLObject)operation_communication.$str49$Please_login_to_specify_authentic);
        }
        final SubLObject el_context_term = (operation_communication.NIL == application) ? cyclist : el_utilities.make_binary_formula(operation_communication.$const46$UserOfProgramFn, application, cyclist);
        final SubLObject hl_context_term = (operation_communication.NIL == application) ? cyclist : narts_high.find_nart(el_context_term);
        if (operation_communication.NIL == hl_context_term || operation_communication.NIL == get_stored_password_for_cyclist_from_kb(hl_context_term)) {
            SubLObject msg = (SubLObject)operation_communication.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)operation_communication.$sym50$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        assert_stored_password_for_cyclist_in_kb(el_context_term, passphrase);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)operation_communication.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            return Values.values((SubLObject)SubLObjectFactory.makeBoolean(!msg.isString()), msg);
        }
        if (!the_cyclist().equal(cyclist)) {
            return Values.values((SubLObject)operation_communication.NIL, (SubLObject)operation_communication.$str51$Cyclists_can_only_edit_their_own_);
        }
        unassert_stored_password_for_cyclist_in_kb(hl_context_term);
        return specify_authentication_info_for_user(cyclist, passphrase, application);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 16840L)
    public static SubLObject assert_stored_password_for_cyclist_in_kb(final SubLObject hl_context_term, final SubLObject passphrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject successP = ke.ke_assert_now((SubLObject)ConsesLow.list(operation_communication.$const48$encryptedPasswordForUser, hl_context_term, passphrase), operation_communication.$default_cyclist_authentication_mt$.getDynamicValue(thread), (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
        final SubLObject problems = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (operation_communication.NIL == successP) {
            SubLObject msg = (SubLObject)operation_communication.NIL;
            SubLObject s = (SubLObject)operation_communication.NIL;
            try {
                s = streams_high.make_private_string_output_stream();
                SubLObject remainder;
                SubLObject type;
                SubLObject errmsg;
                for (remainder = (SubLObject)operation_communication.NIL, remainder = problems; operation_communication.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                    type = remainder.first();
                    errmsg = conses_high.cadr(remainder);
                    PrintLow.format(s, (SubLObject)operation_communication.$str57$__Error__A___A__, type, errmsg);
                }
                msg = streams_high.get_output_stream_string(s);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(s, (SubLObject)operation_communication.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            Errors.error((SubLObject)operation_communication.$str58$Cannot_assert_passphrase_for__A__, hl_context_term, msg);
        }
        return hl_context_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 17393L)
    public static SubLObject unassert_stored_password_for_cyclist_in_kb(final SubLObject hl_context_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject passphrase = get_stored_password_for_cyclist_from_kb(hl_context_term);
        if (operation_communication.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !passphrase.isString()) {
            Errors.error((SubLObject)operation_communication.$str59$Cannot_unassert_missing_passphras, hl_context_term);
        }
        thread.resetMultipleValues();
        final SubLObject successP = ke.ke_unassert_now((SubLObject)ConsesLow.list(operation_communication.$const48$encryptedPasswordForUser, hl_context_term, passphrase), operation_communication.$default_cyclist_authentication_mt$.getDynamicValue(thread));
        final SubLObject problems = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (operation_communication.NIL == successP) {
            SubLObject msg = (SubLObject)operation_communication.NIL;
            SubLObject s = (SubLObject)operation_communication.NIL;
            try {
                s = streams_high.make_private_string_output_stream();
                SubLObject remainder;
                SubLObject type;
                SubLObject errmsg;
                for (remainder = (SubLObject)operation_communication.NIL, remainder = problems; operation_communication.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                    type = remainder.first();
                    errmsg = conses_high.cadr(remainder);
                    PrintLow.format(s, (SubLObject)operation_communication.$str57$__Error__A___A__, type, errmsg);
                }
                msg = streams_high.get_output_stream_string(s);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(s, (SubLObject)operation_communication.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            Errors.error((SubLObject)operation_communication.$str60$Cannot_unassert_passphrase__A_for, hl_context_term, passphrase, msg);
        }
        return hl_context_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 18183L)
    public static SubLObject kb_op_number() {
        return (SubLObject)(read_master_transcript_op_number().numG((SubLObject)operation_communication.ZERO_INTEGER) ? read_master_transcript_op_number() : operation_communication.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 18430L)
    public static SubLObject kb_version_string() {
        if (read_master_transcript_op_number().numG((SubLObject)operation_communication.ZERO_INTEGER)) {
            return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(control_vars.kb_loaded()), new SubLObject[] { operation_communication.$str62$_, format_nil.format_nil_a_no_copy(read_master_transcript_op_number()) });
        }
        return format_nil.format_nil_a(control_vars.kb_loaded());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 18752L)
    public static SubLObject remote_ops_processed() {
        return total_remote_operations_run();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 19060L)
    public static SubLObject kb_number_string(SubLObject kb_num) {
        if (kb_num == operation_communication.UNPROVIDED) {
            kb_num = control_vars.kb_loaded();
        }
        return PrintLow.format((SubLObject)operation_communication.NIL, (SubLObject)operation_communication.$str64$_4__0D, kb_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 19230L)
    public static SubLObject kb_loaded_string() {
        return kb_number_string((SubLObject)operation_communication.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 19359L)
    public static SubLObject available_communication_modes(SubLObject remove_current_modeP) {
        if (remove_current_modeP == operation_communication.UNPROVIDED) {
            remove_current_modeP = (SubLObject)operation_communication.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject available = (SubLObject)operation_communication.NIL;
        available = Mapping.mapcar(Symbols.symbol_function((SubLObject)operation_communication.$sym66$CAR), operation_communication.$all_communication_modes$.getDynamicValue(thread));
        if (operation_communication.NIL != remove_current_modeP) {
            available = Sequences.remove(communication_mode(), available, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
        }
        return available;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 19941L)
    public static SubLObject communication_modeP(final SubLObject mode) {
        return subl_promotions.memberP(mode, available_communication_modes((SubLObject)operation_communication.UNPROVIDED), (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 20040L)
    public static SubLObject communication_mode_name(final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert operation_communication.NIL != Types.keywordp(mode) : mode;
        return conses_high.assoc(mode, operation_communication.$all_communication_modes$.getDynamicValue(thread), (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 20221L)
    public static SubLObject communication_mode() {
        return control_vars.$communication_mode$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 20328L)
    public static SubLObject set_communication_mode_internal(final SubLObject mode) {
        control_vars.$communication_mode$.setGlobalValue(mode);
        return control_vars.$communication_mode$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 20450L)
    public static SubLObject set_communication_mode(SubLObject keyword) {
        if (keyword == operation_communication.UNPROVIDED) {
            keyword = (SubLObject)operation_communication.$kw17$RECEIVE_ONLY;
        }
        assert operation_communication.NIL != communication_modeP(keyword) : keyword;
        if (operation_communication.NIL == control_vars.cyc_image_id()) {
            control_vars.set_cyc_image_id();
        }
        if (!communication_mode().eql(keyword)) {
            if (operation_communication.NIL == transcript_utilities.master_transcript()) {
                transcript_utilities.set_master_transcript((SubLObject)operation_communication.UNPROVIDED);
            }
            if (operation_communication.NIL != control_vars.$init_file_loadedP$.getGlobalValue() && operation_communication.NIL != transcript_utilities.local_transcript()) {
                save_transcript_ops();
            }
            final SubLObject pcase_var = keyword;
            if (pcase_var.eql((SubLObject)operation_communication.$kw69$DEAD)) {
                set_to_dead();
            }
            else if (pcase_var.eql((SubLObject)operation_communication.$kw70$DEAD_RECEIVE)) {
                set_to_dead_receive();
            }
            else if (pcase_var.eql((SubLObject)operation_communication.$kw10$DEAF)) {
                set_to_deaf();
            }
            else if (pcase_var.eql((SubLObject)operation_communication.$kw17$RECEIVE_ONLY)) {
                set_to_receive_only();
            }
            else if (pcase_var.eql((SubLObject)operation_communication.$kw71$RECEIVE_RECORD_TRANSMIT)) {
                set_to_receive_record_transmit();
            }
            else if (pcase_var.eql((SubLObject)operation_communication.$kw72$RECORD_TRANSMIT)) {
                set_to_record_transmit();
            }
            else if (pcase_var.eql((SubLObject)operation_communication.$kw16$TRANSMIT_AND_RECEIVE)) {
                set_to_transmit_and_receive();
            }
            else if (pcase_var.eql((SubLObject)operation_communication.$kw18$TRANSMIT_ONLY)) {
                set_to_transmit_only();
            }
            else {
                Errors.error((SubLObject)operation_communication.$str73$Unsupported_communication_mode__A, keyword);
            }
            control_vars.$use_transcriptP$.setDynamicValue(saving_operationsP());
        }
        return communication_mode();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 21812L)
    public static SubLObject transmit_state_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, operation_communication.$transmit_states$.getGlobalValue(), (SubLObject)operation_communication.$sym75$STRING_EQUAL, (SubLObject)operation_communication.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 21965L)
    public static SubLObject receive_state_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, operation_communication.$receive_states$.getGlobalValue(), (SubLObject)operation_communication.$sym75$STRING_EQUAL, (SubLObject)operation_communication.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 22063L)
    public static SubLObject set_communication_state(final SubLObject transmit_state, final SubLObject receive_state) {
        assert operation_communication.NIL != transmit_state_p(transmit_state) : transmit_state;
        assert operation_communication.NIL != receive_state_p(receive_state) : receive_state;
        return set_communication_mode(get_communication_state(transmit_state, receive_state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 22316L)
    public static SubLObject set_transmit_state(final SubLObject transmit_state) {
        return set_communication_state(transmit_state, get_receive_state((SubLObject)operation_communication.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 22481L)
    public static SubLObject set_receive_state(final SubLObject receive_state) {
        return set_communication_state(get_transmit_state((SubLObject)operation_communication.UNPROVIDED), receive_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 22642L)
    public static SubLObject set_to_recording_as_sent() {
        return set_to_recording((SubLObject)operation_communication.$str79$SENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 22835L)
    public static SubLObject set_to_recording_locally() {
        return set_to_recording((SubLObject)operation_communication.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 22908L)
    public static SubLObject set_to_recording(SubLObject ts_mark) {
        if (ts_mark == operation_communication.UNPROVIDED) {
            ts_mark = (SubLObject)operation_communication.NIL;
        }
        transcript_utilities.new_local_transcript();
        if (ts_mark.isString()) {
            transcript_utilities.mark_local_transcript(ts_mark);
        }
        set_process_auxiliary_operationsP((SubLObject)operation_communication.T);
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 23106L)
    public static SubLObject set_to_no_record() {
        transcript_utilities.new_local_transcript();
        set_process_auxiliary_operationsP((SubLObject)operation_communication.NIL);
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 23223L)
    public static SubLObject set_to_receiving() {
        transcript_utilities.set_read_transcript(transcript_utilities.master_transcript());
        set_receiving_remote_operationsP((SubLObject)operation_communication.T);
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 23356L)
    public static SubLObject set_to_receiving_everything() {
        control_vars.set_load_submitted_transcripts((SubLObject)operation_communication.T);
        return set_to_receiving();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 23555L)
    public static SubLObject set_to_not_receiving() {
        set_receiving_remote_operationsP((SubLObject)operation_communication.NIL);
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 23650L)
    public static SubLObject transmitting_changeP(final SubLObject new_mode) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!get_transmit_state(new_mode).equal(get_transmit_state(communication_mode())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 23893L)
    public static SubLObject receiving_changeP(final SubLObject new_mode) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!get_receive_state(new_mode).equal(get_receive_state(communication_mode())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 24119L)
    public static SubLObject set_to_receive_only() {
        if (operation_communication.NIL != transmitting_changeP((SubLObject)operation_communication.$kw17$RECEIVE_ONLY)) {
            set_to_recording_locally();
        }
        if (operation_communication.NIL != receiving_changeP((SubLObject)operation_communication.$kw17$RECEIVE_ONLY)) {
            set_to_receiving();
        }
        set_communication_mode_internal((SubLObject)operation_communication.$kw17$RECEIVE_ONLY);
        return (SubLObject)operation_communication.$kw17$RECEIVE_ONLY;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 24930L)
    public static SubLObject set_to_deaf() {
        if (operation_communication.NIL != transmitting_changeP((SubLObject)operation_communication.$kw10$DEAF)) {
            set_to_recording_locally();
        }
        if (operation_communication.NIL != receiving_changeP((SubLObject)operation_communication.$kw10$DEAF)) {
            set_to_not_receiving();
        }
        set_communication_mode_internal((SubLObject)operation_communication.$kw10$DEAF);
        return (SubLObject)operation_communication.$kw10$DEAF;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 25152L)
    public static SubLObject set_to_dead() {
        if (operation_communication.NIL != transmitting_changeP((SubLObject)operation_communication.$kw69$DEAD)) {
            set_to_no_record();
        }
        if (operation_communication.NIL != receiving_changeP((SubLObject)operation_communication.$kw69$DEAD)) {
            set_to_not_receiving();
        }
        set_communication_mode_internal((SubLObject)operation_communication.$kw69$DEAD);
        return (SubLObject)operation_communication.$kw69$DEAD;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 25394L)
    public static SubLObject set_to_transmit_and_receive() {
        if (operation_communication.NIL != transmitting_changeP((SubLObject)operation_communication.$kw16$TRANSMIT_AND_RECEIVE)) {
            set_to_no_record();
        }
        if (operation_communication.NIL != receiving_changeP((SubLObject)operation_communication.$kw16$TRANSMIT_AND_RECEIVE)) {
            set_to_receiving();
        }
        set_communication_mode_internal((SubLObject)operation_communication.$kw16$TRANSMIT_AND_RECEIVE);
        return (SubLObject)operation_communication.$kw16$TRANSMIT_AND_RECEIVE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 25704L)
    public static SubLObject set_to_transmit_only() {
        if (operation_communication.NIL != transmitting_changeP((SubLObject)operation_communication.$kw18$TRANSMIT_ONLY)) {
            set_to_no_record();
        }
        if (operation_communication.NIL != receiving_changeP((SubLObject)operation_communication.$kw18$TRANSMIT_ONLY)) {
            set_to_not_receiving();
        }
        set_communication_mode_internal((SubLObject)operation_communication.$kw18$TRANSMIT_ONLY);
        return (SubLObject)operation_communication.$kw18$TRANSMIT_ONLY;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 25983L)
    public static SubLObject set_to_receive_record_transmit() {
        if (operation_communication.NIL != transmitting_changeP((SubLObject)operation_communication.$kw71$RECEIVE_RECORD_TRANSMIT)) {
            set_to_recording_as_sent();
        }
        if (operation_communication.NIL != receiving_changeP((SubLObject)operation_communication.$kw71$RECEIVE_RECORD_TRANSMIT)) {
            set_to_receiving();
        }
        set_communication_mode_internal((SubLObject)operation_communication.$kw71$RECEIVE_RECORD_TRANSMIT);
        return (SubLObject)operation_communication.$kw71$RECEIVE_RECORD_TRANSMIT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 26296L)
    public static SubLObject set_to_dead_receive() {
        if (operation_communication.NIL != transmitting_changeP((SubLObject)operation_communication.$kw70$DEAD_RECEIVE)) {
            set_to_no_record();
        }
        if (operation_communication.NIL != receiving_changeP((SubLObject)operation_communication.$kw70$DEAD_RECEIVE)) {
            set_to_receiving();
        }
        set_communication_mode_internal((SubLObject)operation_communication.$kw70$DEAD_RECEIVE);
        return (SubLObject)operation_communication.$kw70$DEAD_RECEIVE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 26582L)
    public static SubLObject set_to_record_transmit() {
        if (operation_communication.NIL != transmitting_changeP((SubLObject)operation_communication.$kw72$RECORD_TRANSMIT)) {
            set_to_recording_as_sent();
        }
        if (operation_communication.NIL != receiving_changeP((SubLObject)operation_communication.$kw72$RECORD_TRANSMIT)) {
            set_to_not_receiving();
        }
        set_communication_mode_internal((SubLObject)operation_communication.$kw72$RECORD_TRANSMIT);
        return (SubLObject)operation_communication.$kw72$RECORD_TRANSMIT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 26859L)
    public static SubLObject transmittingP() {
        return comm_mode_transmittingP(communication_mode());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 26948L)
    public static SubLObject storingP() {
        return comm_mode_storingP(communication_mode());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 27027L)
    public static SubLObject not_recordingP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(operation_communication.NIL == storingP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 27088L)
    public static SubLObject receivingP() {
        return comm_mode_receivingP(communication_mode());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 27171L)
    public static SubLObject get_transmit_state(SubLObject mode) {
        if (mode == operation_communication.UNPROVIDED) {
            mode = communication_mode();
        }
        final SubLObject storingP = comm_mode_storingP(mode);
        final SubLObject transmittingP = comm_mode_transmittingP(mode);
        if (operation_communication.NIL != storingP && operation_communication.NIL != transmittingP) {
            return (SubLObject)operation_communication.$str81$transmit_and_store;
        }
        if (operation_communication.NIL != list_utilities.sublisp_boolean(storingP)) {
            return (SubLObject)operation_communication.$str82$store;
        }
        if (operation_communication.NIL != list_utilities.sublisp_boolean(transmittingP)) {
            return (SubLObject)operation_communication.$str83$transmit;
        }
        if (operation_communication.NIL != list_utilities.sublisp_boolean(get_communication_mode_description(mode))) {
            return (SubLObject)operation_communication.$str84$none;
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 27700L)
    public static SubLObject get_receive_state(SubLObject mode) {
        if (mode == operation_communication.UNPROVIDED) {
            mode = communication_mode();
        }
        final SubLObject desc = get_communication_mode_description(mode);
        if (operation_communication.NIL != list_utilities.sublisp_boolean(desc)) {
            return (SubLObject)((operation_communication.NIL != comm_mode_desc_receivingP(desc)) ? operation_communication.$str85$yes : operation_communication.$str86$no);
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 27965L)
    public static SubLObject get_communication_state(final SubLObject transmit_state, final SubLObject receive_state) {
        if (operation_communication.NIL != transmit_state && !operation_communication.assertionsDisabledSynth && operation_communication.NIL == transmit_state_p(transmit_state)) {
            throw new AssertionError(transmit_state);
        }
        if (operation_communication.NIL != receive_state && !operation_communication.assertionsDisabledSynth && operation_communication.NIL == receive_state_p(receive_state)) {
            throw new AssertionError(receive_state);
        }
        if (operation_communication.NIL != transmit_state && operation_communication.NIL != receive_state) {
            final SubLObject receivingP = Strings.stringE((SubLObject)operation_communication.$str85$yes, receive_state, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
            final SubLObject storingP = list_utilities.sublisp_boolean(Sequences.search((SubLObject)operation_communication.$str82$store, transmit_state, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED));
            final SubLObject transmittingP = list_utilities.sublisp_boolean(Sequences.search((SubLObject)operation_communication.$str83$transmit, transmit_state, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED));
            return find_communication_mode(receivingP, storingP, transmittingP);
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 28464L)
    public static SubLObject valid_transcript_expression(final SubLObject exp) {
        return (SubLObject)SubLObjectFactory.makeBoolean(exp.isCons() && Sequences.length(exp).numE((SubLObject)operation_communication.FOUR_INTEGER) && conses_high.second(exp).isString() && conses_high.third(exp).isInteger() && conses_high.fourth(exp).isCons());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 29380L)
    public static SubLObject operation_from_meP(final SubLObject form) {
        if (control_vars.cyc_image_id().equalp(conses_high.second(form))) {
            return (SubLObject)operation_communication.T;
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 29493L)
    public static SubLObject writing_transcriptsP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(!get_transmit_state(communication_mode()).equal((SubLObject)operation_communication.$str87$None));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 29623L)
    public static SubLObject reading_transcriptsP() {
        return Equality.equal(get_receive_state(communication_mode()), (SubLObject)operation_communication.$str88$Yes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 29727L)
    public static SubLObject clear_stored_operations() {
        save_transcript_ops();
        if (operation_communication.NIL == operation_queues.local_operation_storage_queue_empty()) {
            transcript_utilities.mark_local_transcript((SubLObject)operation_communication.$str89$CLEARED);
            transcript_utilities.new_local_transcript();
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 29927L)
    public static SubLObject send_stored_operations() {
        save_transcript_ops();
        if (operation_communication.NIL == operation_queues.local_operation_storage_queue_empty()) {
            while (operation_communication.NIL == operation_queues.local_operation_storage_queue_empty()) {
                operation_queues.transmit_queue_enqueue(operation_queues.local_operation_storage_queue_dequeue());
                inc_total_local_operations_transmitted();
            }
            transcript_utilities.mark_local_transcript((SubLObject)operation_communication.$str79$SENT);
            transcript_utilities.new_local_transcript();
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 39174L)
    public static SubLObject fi_save_ops() {
        save_transcript_ops();
        send_local_transcript();
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 39380L)
    public static SubLObject send_local_transcript() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.NIL != transcript_server.use_transcript_server()) {
            transcript_server.send_operations_to_server();
        }
        else {
            final SubLObject master_transcript = transcript_utilities.master_transcript();
            final SubLObject direction = (SubLObject)((operation_communication.NIL != Filesys.probe_file(master_transcript)) ? operation_communication.$kw91$APPEND : operation_communication.$kw92$OUTPUT);
            SubLObject stream = (SubLObject)operation_communication.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)operation_communication.NIL, thread);
                    stream = compatibility.open_text(master_transcript, direction);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)operation_communication.$str93$Unable_to_open__S, master_transcript);
                }
                final SubLObject stream_$1 = stream;
                if (stream_$1.isStream()) {
                    while (operation_communication.NIL == operation_queues.transmit_queue_empty()) {
                        PrintLow.format(stream_$1, (SubLObject)operation_communication.$str94$_s__, operation_queues.transmit_queue_dequeue());
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)operation_communication.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 40121L)
    public static SubLObject possibly_save_transcript_ops() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.NIL != Locks.lock_idle_p(operation_communication.$save_transcript_ops_lock$.getDynamicValue(thread))) {
            return save_transcript_ops();
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 40311L)
    public static SubLObject save_transcript_ops() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.NIL != operation_queues.$hl_transcripts_enabledP$.getDynamicValue(thread)) {
            save_hl_transcript_ops();
        }
        if (operation_communication.NIL == operation_queues.transcript_queue_empty()) {
            SubLObject release = (SubLObject)operation_communication.NIL;
            try {
                release = Locks.seize_lock(operation_communication.$save_transcript_ops_lock$.getDynamicValue(thread));
                save_transcript_ops_internal((SubLObject)operation_communication.UNPROVIDED);
            }
            finally {
                if (operation_communication.NIL != release) {
                    Locks.release_lock(operation_communication.$save_transcript_ops_lock$.getDynamicValue(thread));
                }
            }
            return (SubLObject)operation_communication.T;
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 40592L)
    public static SubLObject save_transcript_ops_internal(SubLObject transcript_known_to_exist) {
        if (transcript_known_to_exist == operation_communication.UNPROVIDED) {
            transcript_known_to_exist = (SubLObject)operation_communication.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_transcript = transcript_utilities.local_transcript();
        final SubLObject direction = (SubLObject)((operation_communication.NIL != Filesys.probe_file(local_transcript)) ? operation_communication.$kw91$APPEND : operation_communication.$kw92$OUTPUT);
        final SubLObject write_locallyP = (SubLObject)SubLObjectFactory.makeBoolean(operation_communication.NIL == dont_record_operations_locally() && operation_communication.NIL != storingP());
        final SubLObject send_remotelyP = (SubLObject)SubLObjectFactory.makeBoolean(operation_communication.NIL != allow_transmitting() && operation_communication.NIL != transmittingP());
        SubLObject stream = (SubLObject)operation_communication.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)operation_communication.NIL, thread);
                stream = compatibility.open_text(local_transcript, direction);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)operation_communication.$str93$Unable_to_open__S, local_transcript);
            }
            final SubLObject stream_$2 = stream;
            if (stream_$2.isStream()) {
                final SubLObject _prev_bind_2 = print_high.$print_level$.currentBinding(thread);
                final SubLObject _prev_bind_3 = print_high.$print_length$.currentBinding(thread);
                try {
                    print_high.$print_level$.bind((SubLObject)operation_communication.NIL, thread);
                    print_high.$print_length$.bind((SubLObject)operation_communication.NIL, thread);
                    while (operation_communication.NIL == operation_queues.transcript_queue_empty()) {
                        final SubLObject op = operation_queues.transcript_queue_dequeue();
                        if (operation_communication.NIL != write_locallyP) {
                            PrintLow.format(stream_$2, (SubLObject)operation_communication.$str94$_s__, op);
                        }
                        if (operation_communication.NIL != send_remotelyP) {
                            operation_queues.transmit_queue_enqueue(op);
                            inc_total_local_operations_transmitted();
                        }
                        if (operation_communication.NIL != write_locallyP && operation_communication.NIL == send_remotelyP) {
                            operation_queues.local_operation_storage_queue_enqueue(op);
                            inc_total_local_operations_recorded();
                        }
                    }
                }
                finally {
                    print_high.$print_length$.rebind(_prev_bind_3, thread);
                    print_high.$print_level$.rebind(_prev_bind_2, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)operation_communication.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 42214L)
    public static SubLObject possibly_save_hl_transcript_ops() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.NIL != Locks.lock_idle_p(operation_communication.$save_hl_transcript_ops_lock$.getDynamicValue(thread))) {
            return save_hl_transcript_ops();
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 42416L)
    public static SubLObject save_hl_transcript_ops() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.NIL == operation_queues.hl_transcript_queue_emptyP()) {
            SubLObject release = (SubLObject)operation_communication.NIL;
            try {
                release = Locks.seize_lock(operation_communication.$save_hl_transcript_ops_lock$.getDynamicValue(thread));
                save_hl_transcript_ops_internal();
            }
            finally {
                if (operation_communication.NIL != release) {
                    Locks.release_lock(operation_communication.$save_hl_transcript_ops_lock$.getDynamicValue(thread));
                }
            }
            return (SubLObject)operation_communication.T;
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 42605L)
    public static SubLObject save_hl_transcript_ops_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_hl_transcript = transcript_utilities.local_hl_transcript();
        final SubLObject direction = (SubLObject)((operation_communication.NIL != Filesys.probe_file(local_hl_transcript)) ? operation_communication.$kw91$APPEND : operation_communication.$kw92$OUTPUT);
        SubLObject stream = (SubLObject)operation_communication.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)operation_communication.NIL, thread);
                stream = compatibility.open_text(local_hl_transcript, direction);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)operation_communication.$str93$Unable_to_open__S, local_hl_transcript);
            }
            final SubLObject stream_$3 = stream;
            if (stream_$3.isStream()) {
                final SubLObject _prev_bind_2 = print_high.$print_level$.currentBinding(thread);
                final SubLObject _prev_bind_3 = print_high.$print_length$.currentBinding(thread);
                try {
                    print_high.$print_level$.bind((SubLObject)operation_communication.NIL, thread);
                    print_high.$print_length$.bind((SubLObject)operation_communication.NIL, thread);
                    SubLObject op = (SubLObject)operation_communication.NIL;
                    while (operation_communication.NIL == operation_queues.hl_transcript_queue_emptyP()) {
                        op = operation_queues.hl_transcript_queue_dequeue();
                        if (operation_communication.NIL == dont_record_operations_locally() && operation_communication.NIL != storingP()) {
                            PrintLow.format(stream_$3, (SubLObject)operation_communication.$str94$_s__, op);
                            operation_queues.local_operation_storage_queue_enqueue(op);
                            inc_total_local_operations_recorded();
                        }
                        if (operation_communication.NIL != allow_transmitting() && operation_communication.NIL != transmittingP()) {
                            operation_queues.transmit_queue_enqueue(op);
                            inc_total_local_operations_transmitted();
                        }
                    }
                }
                finally {
                    print_high.$print_length$.rebind(_prev_bind_3, thread);
                    print_high.$print_level$.rebind(_prev_bind_2, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)operation_communication.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 43556L)
    public static SubLObject close_kb(final SubLObject old, final SubLObject v_new) {
        if (old.equal(control_vars.kb_loaded())) {
            if (operation_communication.NIL != control_vars.auto_increment_kb()) {
                control_vars.set_kb_loaded(v_new);
                set_read_master_transcript_op_number((SubLObject)operation_communication.ZERO_INTEGER);
                control_vars.set_caught_up_on_master_transcript((SubLObject)operation_communication.NIL);
                if (operation_communication.NIL != v_new) {
                    nl_generation_fort_cache.ensure_nl_generation_fort_cache_is_best_available();
                    transcript_utilities.roll_local_transcript();
                    set_kb_full_transcript_loaded((SubLObject)operation_communication.NIL);
                }
                if (operation_communication.NIL == experimental_image()) {
                    set_allow_transmitting((SubLObject)operation_communication.T);
                }
            }
            else {
                set_kb_full_transcript_loaded((SubLObject)operation_communication.T);
                set_communication_mode((SubLObject)operation_communication.$kw10$DEAF);
                set_allow_transmitting((SubLObject)operation_communication.NIL);
            }
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 44868L)
    public static SubLObject read_one_transcript_operation(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject position = compatibility.get_file_position(stream);
        thread.resetMultipleValues();
        SubLObject expr = reader.read_ignoring_errors(stream, (SubLObject)operation_communication.NIL, (SubLObject)operation_communication.$kw97$EOF);
        SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (expr == operation_communication.$kw97$EOF) {
            return (SubLObject)operation_communication.NIL;
        }
        if (status == operation_communication.$kw98$ERROR) {
            Errors.error((SubLObject)operation_communication.$str99$Bogus_form__S_read_from_transcrip, expr, position);
        }
        else {
            if (operation_communication.NIL != valid_transcript_expression(expr)) {
                return expr;
            }
            if (operation_communication.NIL == system_parameters.$auto_continue_transcript_problems$.getDynamicValue(thread)) {
                Errors.cerror((SubLObject)operation_communication.$str100$Skip_forward_until_a_valid_transc, (SubLObject)operation_communication.$str99$Bogus_form__S_read_from_transcrip, expr, position);
            }
            while (expr != operation_communication.$kw97$EOF && operation_communication.NIL == valid_transcript_expression(expr)) {
                position = Numbers.add(position, (SubLObject)operation_communication.ONE_INTEGER);
                compatibility.set_file_position(stream, position);
                thread.resetMultipleValues();
                final SubLObject new_expr = reader.read_ignoring_errors(stream, (SubLObject)operation_communication.NIL, (SubLObject)operation_communication.$kw97$EOF);
                final SubLObject new_status = thread.secondMultipleValue();
                thread.resetMultipleValues();
                expr = new_expr;
                status = new_status;
            }
            if (expr == operation_communication.$kw97$EOF) {
                return (SubLObject)operation_communication.NIL;
            }
            if (operation_communication.NIL != valid_transcript_expression(expr)) {
                return expr;
            }
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 46605L)
    public static SubLObject backup_transcript_stream(final SubLObject stream, final SubLObject backup_position) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject end_position = compatibility.get_file_position(stream);
        final SubLObject partial_string = Strings.make_string(Numbers.subtract(end_position, backup_position), (SubLObject)operation_communication.UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject index;
        for (cdotimes_end_var = Sequences.length(partial_string), index = (SubLObject)operation_communication.NIL, index = (SubLObject)operation_communication.ZERO_INTEGER; index.numL(cdotimes_end_var); index = Numbers.add(index, (SubLObject)operation_communication.ONE_INTEGER)) {
            Strings.set_char(partial_string, index, streams_high.read_char(stream, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED));
        }
        if (operation_communication.NIL == system_parameters.$auto_continue_transcript_problems$.getDynamicValue(thread)) {
            Errors.cerror((SubLObject)operation_communication.$str101$Assume_the_rest_of_the_operation_, (SubLObject)operation_communication.$str102$Partial_transcript_operation__S_w, partial_string);
        }
        compatibility.set_file_position(stream, backup_position);
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 47373L)
    public static SubLObject load_transcript_exprs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject use_transcript_server = transcript_server.use_transcript_server();
		if (operation_communication.NIL != use_transcript_server) {
            transcript_server.read_operations_from_server();
        }
        else {
        	final SubLObject read_transcript = transcript_utilities.read_transcript();
            SubLObject master_transcript = transcript_utilities.master_transcript();
			SubLObject master_transcript_already_exists = transcript_utilities.master_transcript_already_exists();
			SubLObject file_exists = NIL;
			if(read_transcript!=NIL) file_exists = Filesys.probe_file(read_transcript);
			if (read_transcript.equal(master_transcript) && operation_communication.NIL != master_transcript_already_exists && operation_communication.NIL == file_exists) {
                Errors.error((SubLObject)operation_communication.$str105$The_transcript_file__s_has_alread, master_transcript);
            }
            else if (operation_communication.NIL != read_transcript && operation_communication.NIL != file_exists) {
                if (read_transcript.equal(master_transcript)) {
                    transcript_utilities.set_master_transcript_already_exists((SubLObject)operation_communication.T);
                }
                if (operation_communication.NIL == operation_communication.$transcript_read_attempted$.getGlobalValue()) {
                    SubLObject stream = (SubLObject)operation_communication.NIL;
                    try {
                        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)operation_communication.NIL, thread);
                            stream = compatibility.open_text(read_transcript, (SubLObject)operation_communication.$kw106$INPUT);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                        if (!stream.isStream()) {
                            Errors.error((SubLObject)operation_communication.$str93$Unable_to_open__S, read_transcript);
                        }
                        final SubLObject s = stream;
                        operation_communication.$initial_read_transcript_size$.setGlobalValue(streams_high.file_length(s));
                    }
                    finally {
                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (stream.isStream()) {
                                streams_high.close(stream, (SubLObject)operation_communication.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
                final SubLObject _prev_bind_3 = operation_communication.$transcript_load_succeeded$.currentBinding(thread);
                try {
                    operation_communication.$transcript_load_succeeded$.bind((SubLObject)operation_communication.NIL, thread);
                    load_transcript_exprs_internal();
                    if (operation_communication.NIL != operation_communication.$transcript_load_succeeded$.getDynamicValue(thread)) {
                        if (operation_communication.NIL == operation_communication.$transcript_read_attempted$.getGlobalValue()) {
                            operation_communication.$transcript_read_attempted$.setGlobalValue((SubLObject)operation_communication.T);
                        }
                        if (transcript_utilities.read_transcript_position().numGE(operation_communication.$initial_read_transcript_size$.getGlobalValue())) {
                            control_vars.set_caught_up_on_master_transcript((SubLObject)operation_communication.T);
                        }
                    }
                }
                finally {
                    operation_communication.$transcript_load_succeeded$.rebind(_prev_bind_3, thread);
                }
            }
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 48494L)
    public static SubLObject load_transcript_exprs_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)operation_communication.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)operation_communication.NIL, thread);
                stream = compatibility.open_text(transcript_utilities.read_transcript(), (SubLObject)operation_communication.$kw106$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)operation_communication.$str93$Unable_to_open__S, transcript_utilities.read_transcript());
            }
            final SubLObject stream_$4 = stream;
            compatibility.set_file_position(stream_$4, transcript_utilities.read_transcript_position());
            SubLObject total_ops_read = (SubLObject)operation_communication.ONE_INTEGER;
            SubLObject expr = (SubLObject)operation_communication.NIL;
            SubLObject pos = (SubLObject)operation_communication.NIL;
            expr = read_one_transcript_operation(stream_$4);
            pos = compatibility.get_file_position(stream_$4);
            while (operation_communication.NIL != expr && (operation_communication.NIL == read_transcript_op_limit() || !total_ops_read.numE(read_transcript_op_limit()))) {
                if (operation_communication.NIL == control_vars.caught_up_on_master_transcript() && pos.numG(operation_communication.$initial_read_transcript_size$.getGlobalValue())) {
                    control_vars.set_caught_up_on_master_transcript((SubLObject)operation_communication.T);
                }
                total_ops_read = Numbers.add(total_ops_read, (SubLObject)operation_communication.ONE_INTEGER);
                operation_queues.add_to_remote_queue(expr);
                expr = read_one_transcript_operation(stream_$4);
                pos = compatibility.get_file_position(stream_$4);
            }
            if (operation_communication.NIL != read_transcript_op_limit() && total_ops_read.numE(read_transcript_op_limit())) {
                if (operation_communication.NIL == control_vars.caught_up_on_master_transcript() && pos.numG(operation_communication.$initial_read_transcript_size$.getGlobalValue())) {
                    control_vars.set_caught_up_on_master_transcript((SubLObject)operation_communication.T);
                }
                total_ops_read = Numbers.add(total_ops_read, (SubLObject)operation_communication.ONE_INTEGER);
                operation_queues.add_to_remote_queue(expr);
            }
            transcript_utilities.set_read_transcript_position(compatibility.get_file_position(stream_$4));
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)operation_communication.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        operation_communication.$transcript_load_succeeded$.setDynamicValue((SubLObject)operation_communication.T, thread);
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 49599L)
    public static SubLObject remote_operation_to_runP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(operation_communication.NIL != receiving_remote_operationsP() && operation_communication.NIL == operation_queues.remote_queue_empty());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 49781L)
    public static SubLObject master_transcript_catch_up() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str107$__Processing_master_transcript_op);
        streams_high.finish_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        while (operation_communication.NIL == control_vars.caught_up_on_master_transcript()) {
            load_transcript_exprs();
            while (operation_communication.NIL == operation_queues.remote_queue_empty()) {
                SubLObject error_message = (SubLObject)operation_communication.NIL;
                if (Numbers.mod(kb_op_number(), (SubLObject)operation_communication.$int108$100).numE((SubLObject)operation_communication.ZERO_INTEGER)) {
                    streams_high.finish_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    thread.resetMultipleValues();
                    final SubLObject second = Time.decode_universal_time(Time.get_universal_time(), (SubLObject)operation_communication.UNPROVIDED);
                    final SubLObject minute = thread.secondMultipleValue();
                    final SubLObject hour = thread.thirdMultipleValue();
                    final SubLObject date = thread.fourthMultipleValue();
                    final SubLObject month = thread.fifthMultipleValue();
                    final SubLObject year = thread.sixthMultipleValue();
                    thread.resetMultipleValues();
                    PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str109$___4__0D__2__0D__2__0D__2__0D__2_, new SubLObject[] { year, month, date, hour, minute, second, kb_op_number() });
                    streams_high.finish_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                }
                fi.reset_fi_error_state();
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)operation_communication.$sym50$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject _prev_bind_0_$5 = Errors.$continue_cerrorP$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = Errors.$ignore_warnsP$.currentBinding(thread);
                            try {
                                Errors.$continue_cerrorP$.bind((SubLObject)operation_communication.T, thread);
                                Errors.$ignore_warnsP$.bind((SubLObject)operation_communication.T, thread);
                                operation_queues.run_one_remote_op();
                            }
                            finally {
                                Errors.$ignore_warnsP$.rebind(_prev_bind_2, thread);
                                Errors.$continue_cerrorP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)operation_communication.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (operation_communication.NIL != fi.fi_error_signaledP()) {
                    error_message = fi.fi_get_error_string_int();
                }
                if (error_message.isString()) {
                    Errors.warn(error_message);
                }
            }
        }
        streams_high.finish_output(StreamsLow.$error_output$.getDynamicValue(thread));
        PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str110$__Finished_processing__A_master_t, kb_op_number());
        streams_high.finish_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 51110L)
    public static SubLObject run_random_transcript_op(final SubLObject expr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)operation_communication.NIL, thread);
            final SubLObject op = conses_high.fourth(expr);
            if (operation_communication.NIL != op) {
                control_vars.$last_agenda_op$.setGlobalValue(op);
                final SubLObject _prev_bind_0_$6 = control_vars.$unencapsulating_within_agenda$.currentBinding(thread);
                try {
                    control_vars.$unencapsulating_within_agenda$.bind((SubLObject)operation_communication.T, thread);
                    SubLObject unencapsulated_op = (SubLObject)operation_communication.NIL;
                    try {
                        thread.throwStack.push(operation_communication.$kw111$UNENCAPSULATION_ERROR);
                        unencapsulated_op = encapsulation.unencapsulate(op);
                    }
                    catch (Throwable ccatch_env_var) {
                        unencapsulated_op = Errors.handleThrowable(ccatch_env_var, (SubLObject)operation_communication.$kw111$UNENCAPSULATION_ERROR);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (operation_communication.NIL != unencapsulated_op) {
                        Eval.eval(unencapsulated_op);
                    }
                }
                finally {
                    control_vars.$unencapsulating_within_agenda$.rebind(_prev_bind_0_$6, thread);
                }
            }
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 51646L)
    public static SubLObject catch_up_to_current() {
        return catch_up_kb((SubLObject)operation_communication.NIL, (SubLObject)operation_communication.NIL, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 51718L)
    public static SubLObject cyc_catch_up(SubLObject to_kb_number, SubLObject to_op_number, SubLObject load_submitted_transcriptsP, SubLObject send_submitted_transcript_loading_noticesP) {
        if (to_kb_number == operation_communication.UNPROVIDED) {
            to_kb_number = control_vars.kb_loaded();
        }
        if (to_op_number == operation_communication.UNPROVIDED) {
            to_op_number = transcript_utilities.total_master_transcript_operations(to_kb_number);
        }
        if (load_submitted_transcriptsP == operation_communication.UNPROVIDED) {
            load_submitted_transcriptsP = (SubLObject)operation_communication.NIL;
        }
        if (send_submitted_transcript_loading_noticesP == operation_communication.UNPROVIDED) {
            send_submitted_transcript_loading_noticesP = (SubLObject)operation_communication.NIL;
        }
        return catch_up_kb(to_kb_number, to_op_number, load_submitted_transcriptsP, send_submitted_transcript_loading_noticesP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 52077L)
    public static SubLObject catch_up_kb(SubLObject to_kb_number, SubLObject to_op_number, SubLObject load_submitted_transcriptsP, SubLObject send_submitted_transcript_loading_noticesP) {
        if (to_kb_number == operation_communication.UNPROVIDED) {
            to_kb_number = control_vars.kb_loaded();
        }
        if (to_op_number == operation_communication.UNPROVIDED) {
            to_op_number = transcript_utilities.total_master_transcript_operations(to_kb_number);
        }
        if (load_submitted_transcriptsP == operation_communication.UNPROVIDED) {
            load_submitted_transcriptsP = (SubLObject)operation_communication.NIL;
        }
        if (send_submitted_transcript_loading_noticesP == operation_communication.UNPROVIDED) {
            send_submitted_transcript_loading_noticesP = (SubLObject)operation_communication.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_up_to_currentP = (SubLObject)operation_communication.NIL;
        if (operation_communication.NIL == subl_promotions.positive_integer_p(to_kb_number)) {
            catch_up_to_currentP = (SubLObject)operation_communication.T;
            to_kb_number = control_vars.kb_loaded();
            to_op_number = transcript_utilities.total_master_transcript_operations(to_kb_number);
            while (operation_communication.NIL != subl_promotions.non_zero_integer_p(transcript_utilities.total_master_transcript_operations(Numbers.add((SubLObject)operation_communication.ONE_INTEGER, to_kb_number)))) {
                to_kb_number = Numbers.add(to_kb_number, (SubLObject)operation_communication.ONE_INTEGER);
                to_op_number = transcript_utilities.total_master_transcript_operations(to_kb_number);
            }
        }
        if (to_kb_number.numL(control_vars.kb_loaded())) {
            Errors.error((SubLObject)operation_communication.$str116$Cannot_catchup_backwards_from_KB_, kb_version_string(), to_kb_number);
        }
        if (to_kb_number.numE(control_vars.kb_loaded()) && to_op_number.numL(read_master_transcript_op_number()) && operation_communication.NIL == catch_up_to_currentP) {
            Errors.error((SubLObject)operation_communication.$str117$Cannot_catchup_backwards_from_KB_, kb_version_string(), to_kb_number, to_op_number);
        }
        final SubLObject agenda_runningP = agenda.agenda_running();
        final SubLObject saved_communication_mode = control_vars.$communication_mode$.getGlobalValue();
        SubLObject ops_run = (SubLObject)operation_communication.ZERO_INTEGER;
        SubLObject ops_to_run = (SubLObject)operation_communication.ZERO_INTEGER;
        for (SubLObject temp_kb_number = control_vars.kb_loaded(); temp_kb_number.numLE(to_kb_number); temp_kb_number = Numbers.add(temp_kb_number, (SubLObject)operation_communication.ONE_INTEGER)) {
            final SubLObject op_count = Numbers.subtract(temp_kb_number.eql(to_kb_number) ? Numbers.max(transcript_utilities.total_master_transcript_operations(temp_kb_number), to_op_number) : transcript_utilities.total_master_transcript_operations(temp_kb_number), (SubLObject)(temp_kb_number.eql(control_vars.kb_loaded()) ? read_master_transcript_op_number() : operation_communication.ZERO_INTEGER), (SubLObject)(temp_kb_number.eql(to_kb_number) ? Numbers.subtract(transcript_utilities.total_master_transcript_operations(temp_kb_number), to_op_number) : operation_communication.ZERO_INTEGER));
            if (!to_kb_number.eql(control_vars.kb_loaded())) {
                format_nil.force_format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str118$_A_ops_to_run_from_KB__A__, op_count, temp_kb_number, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
            }
            ops_to_run = Numbers.add(ops_to_run, op_count);
        }
        try {
            if (operation_communication.NIL != agenda_runningP) {
                final SubLObject str = (SubLObject)operation_communication.$str119$Shutting_down_agenda;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)operation_communication.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((operation_communication.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : operation_communication.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    ensure_agenda_halted(operation_communication.$catch_up_kb_agenda_halt_wait_time$.getDynamicValue(thread));
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
                if (operation_communication.NIL != agenda.agenda_running()) {
                    Errors.error((SubLObject)operation_communication.$str120$Could_not_shut_down_agenda_);
                }
            }
            control_vars.$communication_mode$.setGlobalValue((SubLObject)operation_communication.$kw2$UNKNOWN);
            if (operation_communication.NIL != load_submitted_transcriptsP) {
                final SubLObject str = (SubLObject)operation_communication.$str121$Will_load_submitted_transcripts;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)operation_communication.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((operation_communication.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : operation_communication.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
                control_vars.set_load_submitted_transcripts(load_submitted_transcriptsP);
                if (operation_communication.NIL != send_submitted_transcript_loading_noticesP) {
                    PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str122$Will_send_submitted_transcript_no);
                    control_vars.set_send_submitted_transcript_loading_notices(send_submitted_transcript_loading_noticesP);
                }
                else {
                    PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str123$Will_not_send_submitted_transcrip);
                }
            }
            final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_11 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_12 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)operation_communication.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)operation_communication.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)operation_communication.$str124$Catching_up_on_, new SubLObject[] { format_nil.format_nil_a_no_copy(ops_to_run), operation_communication.$str125$_operations_from_KB_, format_nil.format_nil_a_no_copy(kb_version_string()), operation_communication.$str126$_to_, format_nil.format_nil_a_no_copy(to_kb_number), operation_communication.$str62$_, format_nil.format_nil_a_no_copy(to_op_number) }));
                    load_transcript_exprs();
                    while (to_kb_number.numG(control_vars.kb_loaded()) || (to_kb_number.numE(control_vars.kb_loaded()) && to_op_number.numG(read_master_transcript_op_number())) || operation_communication.NIL != catch_up_to_currentP) {
                        if (operation_communication.NIL != operation_queues.remote_queue_empty()) {
                            load_transcript_exprs();
                            if (operation_communication.NIL != catch_up_to_currentP) {
                                catch_up_to_currentP = (SubLObject)operation_communication.NIL;
                            }
                            else if (operation_communication.NIL != operation_queues.remote_queue_empty()) {
                                format_nil.force_format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str127$_A_At_KB__A__waiting__A_seconds_f, numeric_date_utilities.timestring((SubLObject)operation_communication.UNPROVIDED), kb_version_string(), operation_communication.$catch_up_kb_transcript_server_wait_time$.getDynamicValue(thread), (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
                                Threads.sleep(operation_communication.$catch_up_kb_transcript_server_wait_time$.getDynamicValue(thread));
                            }
                        }
                        if (operation_communication.NIL == operation_queues.remote_queue_empty()) {
                            SubLObject error_message = (SubLObject)operation_communication.NIL;
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$7 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)operation_communication.$sym50$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        final SubLObject _prev_bind_0_$8 = Errors.$continue_cerrorP$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$9 = Errors.$ignore_warnsP$.currentBinding(thread);
                                        try {
                                            Errors.$continue_cerrorP$.bind((SubLObject)operation_communication.T, thread);
                                            Errors.$ignore_warnsP$.bind((SubLObject)operation_communication.T, thread);
                                            operation_queues.run_one_remote_op();
                                            ops_run = Numbers.add(ops_run, (SubLObject)operation_communication.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(ops_run, ops_to_run);
                                        }
                                        finally {
                                            Errors.$ignore_warnsP$.rebind(_prev_bind_1_$9, thread);
                                            Errors.$continue_cerrorP$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    }
                                    catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, (SubLObject)operation_communication.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$7, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (operation_communication.NIL != fi.fi_error_signaledP()) {
                                error_message = fi.fi_get_error_string_int();
                            }
                            if (operation_communication.NIL == error_message) {
                                continue;
                            }
                            PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str128$Last_operation___S__, encapsulation.unencapsulate_partial(control_vars.$last_agenda_op$.getGlobalValue()));
                            Errors.warn(error_message);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_12, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_11, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_9, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                control_vars.set_load_submitted_transcripts((SubLObject)operation_communication.NIL);
                control_vars.set_send_submitted_transcript_loading_notices((SubLObject)operation_communication.NIL);
                if (operation_communication.NIL != communication_modeP(saved_communication_mode)) {
                    set_communication_mode(saved_communication_mode);
                }
                if (operation_communication.NIL != agenda_runningP) {
                    agenda.start_agenda((SubLObject)operation_communication.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_13, thread);
            }
        }
        return ops_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 56541L)
    public static SubLObject load_transcript_file(final SubLObject filename, SubLObject use_transcriptP, SubLObject queue, SubLObject start_position, SubLObject start_op_number, SubLObject continue_on_errorP) {
        if (use_transcriptP == operation_communication.UNPROVIDED) {
            use_transcriptP = (SubLObject)operation_communication.NIL;
        }
        if (queue == operation_communication.UNPROVIDED) {
            queue = (SubLObject)operation_communication.$kw129$AUX;
        }
        if (start_position == operation_communication.UNPROVIDED) {
            start_position = (SubLObject)operation_communication.NIL;
        }
        if (start_op_number == operation_communication.UNPROVIDED) {
            start_op_number = (SubLObject)operation_communication.NIL;
        }
        if (continue_on_errorP == operation_communication.UNPROVIDED) {
            continue_on_errorP = (SubLObject)operation_communication.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.NIL != Filesys.probe_file(filename)) {
            SubLObject count = (SubLObject)operation_communication.ZERO_INTEGER;
            SubLObject op_number = (SubLObject)operation_communication.ZERO_INTEGER;
            final SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
            try {
                control_vars.$use_transcriptP$.bind((queue == operation_communication.$kw130$NONE) ? use_transcriptP : control_vars.$use_transcriptP$.getDynamicValue(thread), thread);
                Errors.$continue_cerrorP$.bind(continue_on_errorP, thread);
                final SubLObject total_file_size = file_utilities.get_file_length(filename);
                SubLObject stream = (SubLObject)operation_communication.NIL;
                try {
                    final SubLObject _prev_bind_0_$11 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)operation_communication.NIL, thread);
                        stream = compatibility.open_text(filename, (SubLObject)operation_communication.$kw106$INPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$11, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error((SubLObject)operation_communication.$str93$Unable_to_open__S, filename);
                    }
                    final SubLObject stream_$12 = stream;
                    if (start_position.isInteger()) {
                        compatibility.set_file_position(stream_$12, start_position);
                    }
                    final SubLObject _prev_bind_0_$12 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)operation_communication.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)operation_communication.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)operation_communication.$str131$Evaluating__load_transcript_, new SubLObject[] { format_nil.format_nil_s_no_copy(filename), operation_communication.$str132$_, format_nil.format_nil_a_no_copy(use_transcriptP), operation_communication.$str132$_, format_nil.format_nil_s_no_copy(queue), format_nil.format_nil_a_no_copy((SubLObject)((operation_communication.NIL != start_position) ? Sequences.cconcatenate((SubLObject)operation_communication.$str132$_, format_nil.format_nil_a_no_copy(start_position)) : operation_communication.$str133$)), format_nil.format_nil_a_no_copy((SubLObject)((operation_communication.NIL != start_op_number) ? Sequences.cconcatenate((SubLObject)operation_communication.$str132$_, format_nil.format_nil_a_no_copy(start_op_number)) : operation_communication.$str133$)), operation_communication.$str134$_ }));
                            SubLObject expr;
                            for (expr = (SubLObject)operation_communication.NIL, expr = read_one_transcript_operation(stream_$12); operation_communication.NIL != expr && expr != operation_communication.$kw97$EOF; expr = read_one_transcript_operation(stream_$12)) {
                                if (expr.isCons()) {
                                    op_number = Numbers.add(op_number, (SubLObject)operation_communication.ONE_INTEGER);
                                }
                                if (operation_communication.NIL == start_op_number || (start_op_number.isInteger() && op_number.numGE(start_op_number))) {
                                    if (queue == operation_communication.$kw135$LOCAL) {
                                        operation_queues.add_to_local_queue(conses_high.fourth(expr), (SubLObject)operation_communication.NIL);
                                    }
                                    else if (queue == operation_communication.$kw130$NONE) {
                                        run_random_transcript_op(expr);
                                    }
                                    else {
                                        operation_queues.add_to_auxiliary_queue(expr);
                                    }
                                    count = Numbers.add(count, (SubLObject)operation_communication.ONE_INTEGER);
                                }
                                utilities_macros.note_percent_progress(compatibility.get_file_position(stream_$12), total_file_size);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$14, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$12, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (stream.isStream()) {
                            streams_high.close(stream, (SubLObject)operation_communication.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            }
            finally {
                Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
                control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
            }
            return count;
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 59246L)
    public static SubLObject load_transcript(final SubLObject filename, SubLObject use_transcriptP, SubLObject queue, SubLObject start_position, SubLObject start_op_number) {
        if (use_transcriptP == operation_communication.UNPROVIDED) {
            use_transcriptP = (SubLObject)operation_communication.NIL;
        }
        if (queue == operation_communication.UNPROVIDED) {
            queue = (SubLObject)operation_communication.$kw130$NONE;
        }
        if (start_position == operation_communication.UNPROVIDED) {
            start_position = (SubLObject)operation_communication.NIL;
        }
        if (start_op_number == operation_communication.UNPROVIDED) {
            start_op_number = (SubLObject)operation_communication.NIL;
        }
        return load_transcript_file(filename, use_transcriptP, queue, start_position, start_op_number, (SubLObject)operation_communication.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 59533L)
    public static SubLObject load_transcript_verbose(final SubLObject filename, SubLObject use_transcriptP, SubLObject queue, SubLObject start_position, SubLObject start_op_number) {
        if (use_transcriptP == operation_communication.UNPROVIDED) {
            use_transcriptP = (SubLObject)operation_communication.NIL;
        }
        if (queue == operation_communication.UNPROVIDED) {
            queue = (SubLObject)operation_communication.$kw130$NONE;
        }
        if (start_position == operation_communication.UNPROVIDED) {
            start_position = (SubLObject)operation_communication.NIL;
        }
        if (start_op_number == operation_communication.UNPROVIDED) {
            start_op_number = (SubLObject)operation_communication.NIL;
        }
        SubLObject result = (SubLObject)operation_communication.NIL;
        final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
        result = load_transcript_file(filename, use_transcriptP, queue, start_position, start_op_number, (SubLObject)operation_communication.UNPROVIDED);
        if (result.isInteger()) {
            PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str136$___s_operation_A_performed__, result, (SubLObject)(result.numG((SubLObject)operation_communication.ONE_INTEGER) ? operation_communication.$str137$s_were : operation_communication.$str138$_was));
        }
        final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
        final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
        if (operation_communication.NIL != subl_promotions.non_zero_integer_p(new_constant_count) || operation_communication.NIL != subl_promotions.non_zero_integer_p(new_nart_count) || operation_communication.NIL != subl_promotions.non_zero_integer_p(new_assertion_count) || operation_communication.NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count) || operation_communication.NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
            if (operation_communication.NIL.isString()) {
                PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str140$___A__, (SubLObject)operation_communication.NIL);
            }
            if (operation_communication.NIL != subl_promotions.non_zero_integer_p(new_constant_count)) {
                PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str141$___s_constant_A__A__, new SubLObject[] { Numbers.abs(new_constant_count), Numbers.abs(new_constant_count).numG((SubLObject)operation_communication.ONE_INTEGER) ? operation_communication.$str137$s_were : operation_communication.$str138$_was, (operation_communication.NIL != subl_promotions.positive_integer_p(new_constant_count)) ? operation_communication.$str142$created : operation_communication.$str143$destroyed });
            }
            if (operation_communication.NIL != subl_promotions.non_zero_integer_p(new_nart_count)) {
                PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str144$___s_nart_A__A__, new SubLObject[] { Numbers.abs(new_nart_count), Numbers.abs(new_nart_count).numG((SubLObject)operation_communication.ONE_INTEGER) ? operation_communication.$str137$s_were : operation_communication.$str138$_was, (operation_communication.NIL != subl_promotions.positive_integer_p(new_nart_count)) ? operation_communication.$str142$created : operation_communication.$str143$destroyed });
            }
            if (operation_communication.NIL != subl_promotions.non_zero_integer_p(new_assertion_count)) {
                PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str145$___s_assertion_A__A__, new SubLObject[] { Numbers.abs(new_assertion_count), Numbers.abs(new_assertion_count).numG((SubLObject)operation_communication.ONE_INTEGER) ? operation_communication.$str137$s_were : operation_communication.$str138$_was, (operation_communication.NIL != subl_promotions.positive_integer_p(new_assertion_count)) ? operation_communication.$str142$created : operation_communication.$str143$destroyed });
            }
            if (operation_communication.NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count)) {
                PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str146$___s_kb_hl_support_A__A__, new SubLObject[] { Numbers.abs(new_kb_hl_support_count), Numbers.abs(new_kb_hl_support_count).numG((SubLObject)operation_communication.ONE_INTEGER) ? operation_communication.$str137$s_were : operation_communication.$str138$_was, (operation_communication.NIL != subl_promotions.positive_integer_p(new_kb_hl_support_count)) ? operation_communication.$str142$created : operation_communication.$str143$destroyed });
            }
            if (operation_communication.NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str147$___s_deduction_A__A__, new SubLObject[] { Numbers.abs(new_deduction_count), Numbers.abs(new_deduction_count).numG((SubLObject)operation_communication.ONE_INTEGER) ? operation_communication.$str137$s_were : operation_communication.$str138$_was, (operation_communication.NIL != subl_promotions.positive_integer_p(new_deduction_count)) ? operation_communication.$str142$created : operation_communication.$str143$destroyed });
            }
        }
        else if (operation_communication.NIL.isString()) {
            PrintLow.format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str140$___A__, (SubLObject)operation_communication.NIL);
        }
        streams_high.force_output((SubLObject)operation_communication.T);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 60065L)
    public static SubLObject load_transcript_file_to_submit(final SubLObject filename, SubLObject chunk_size) {
        if (chunk_size == operation_communication.UNPROVIDED) {
            chunk_size = (SubLObject)operation_communication.$int149$10000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject has_agendaP = agenda.agenda_running();
        SubLObject count = (SubLObject)operation_communication.NIL;
        agenda.halt_agenda((SubLObject)operation_communication.UNPROVIDED);
        if (operation_communication.NIL != Filesys.probe_file(filename)) {
            SubLObject op_number = (SubLObject)operation_communication.ZERO_INTEGER;
            final SubLObject total_file_size = file_utilities.get_file_length(filename);
            count = (SubLObject)operation_communication.ZERO_INTEGER;
            SubLObject stream = (SubLObject)operation_communication.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)operation_communication.NIL, thread);
                    stream = compatibility.open_text(filename, (SubLObject)operation_communication.$kw106$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)operation_communication.$str93$Unable_to_open__S, filename);
                }
                final SubLObject stream_$17 = stream;
                final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)operation_communication.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)operation_communication.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(Sequences.cconcatenate((SubLObject)operation_communication.$str150$Loading_, new SubLObject[] { format_nil.format_nil_a_no_copy(filename), operation_communication.$str151$_to_send_____ }));
                        SubLObject expr;
                        for (expr = (SubLObject)operation_communication.NIL, expr = read_one_transcript_operation(stream_$17); operation_communication.NIL != expr && expr != operation_communication.$kw97$EOF; expr = read_one_transcript_operation(stream_$17)) {
                            if (expr.isCons()) {
                                op_number = Numbers.add(op_number, (SubLObject)operation_communication.ONE_INTEGER);
                            }
                            operation_queues.transmit_queue_enqueue(expr);
                            count = Numbers.add(count, (SubLObject)operation_communication.ONE_INTEGER);
                            if (count.isPositive() && Numbers.mod(count, chunk_size).isZero()) {
                                transcript_server.send_operations_to_server();
                            }
                            utilities_macros.note_percent_progress(compatibility.get_file_position(stream_$17), total_file_size);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)operation_communication.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
                }
            }
        }
        if (operation_communication.NIL != has_agendaP) {
            agenda.start_agenda((SubLObject)operation_communication.UNPROVIDED);
            agenda.wait_for_agenda_running((SubLObject)operation_communication.UNPROVIDED);
        }
        transcript_server.send_operations_to_server();
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 61587L)
    public static SubLObject server_summary(SubLObject stream) {
        if (stream == operation_communication.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(stream, (SubLObject)operation_communication.$str152$__Server_Summary____A, numeric_date_utilities.timestring((SubLObject)operation_communication.UNPROVIDED));
        PrintLow.format(stream, (SubLObject)operation_communication.$str153$___Machine___A, Environment.get_machine_name((SubLObject)operation_communication.UNPROVIDED));
        final SubLObject base_port = system_parameters.$base_tcp_port$.getDynamicValue(thread);
        if (base_port.isInteger() && operation_communication.NIL != tcp_server_utilities.all_tcp_servers()) {
            PrintLow.format(stream, (SubLObject)operation_communication.$str154$__A, base_port);
        }
        PrintLow.format(stream, (SubLObject)operation_communication.$str155$__Cyclist___A, the_cyclist());
        PrintLow.format(stream, (SubLObject)operation_communication.$str156$___KB___A, kb_version_string());
        PrintLow.format(stream, (SubLObject)operation_communication.$str157$___System___A, system_info.cyc_revision_string());
        final SubLObject system_code_string = misc_utilities.cyc_system_code_string();
        if (operation_communication.NIL != string_utilities.non_empty_string_p(system_code_string)) {
            PrintLow.format(stream, (SubLObject)operation_communication.$str158$___A_, system_code_string);
        }
        PrintLow.format(stream, (SubLObject)operation_communication.$str159$__Comm___A, communication_mode_name(communication_mode()));
        PrintLow.format(stream, (SubLObject)operation_communication.$str160$___Agenda___A, agenda.agenda_state());
        PrintLow.format(stream, (SubLObject)operation_communication.$str161$__Queues_);
        if (operation_queues.auxiliary_queue_size().isPositive() || total_auxiliary_operations_run().isPositive()) {
            PrintLow.format(stream, (SubLObject)operation_communication.$str162$___Aux__);
            if (operation_queues.auxiliary_queue_size().isPositive()) {
                PrintLow.format(stream, (SubLObject)operation_communication.$str163$__d__d_, operation_queues.auxiliary_queue_size(), total_auxiliary_operations_run());
            }
            else {
                PrintLow.format(stream, (SubLObject)operation_communication.$str164$__d_, total_auxiliary_operations_run());
            }
        }
        if (kb_op_number().isPositive() || (operation_queues.remote_queue_size().isPositive() && operation_communication.NIL != receiving_remote_operationsP())) {
            PrintLow.format(stream, (SubLObject)operation_communication.$str165$___Remote__);
            if (operation_queues.remote_queue_size().isPositive() && operation_communication.NIL != receiving_remote_operationsP()) {
                PrintLow.format(stream, (SubLObject)operation_communication.$str163$__d__d_, operation_queues.remote_queue_size(), kb_op_number());
            }
            else {
                PrintLow.format(stream, (SubLObject)operation_communication.$str164$__d_, kb_op_number());
            }
        }
        if (operation_communication.NIL != operation_queues.local_operations_anywhere()) {
            PrintLow.format(stream, (SubLObject)operation_communication.$str166$___Local__);
            if (operation_queues.local_queue_size().isPositive() || operation_queues.transcript_queue_size().isPositive()) {
                PrintLow.format(stream, (SubLObject)operation_communication.$str167$__d__d__d_, new SubLObject[] { operation_queues.local_queue_size(), operation_queues.transcript_queue_size(), operation_queues.local_operation_storage_queue_size() });
            }
            else {
                PrintLow.format(stream, (SubLObject)operation_communication.$str164$__d_, operation_queues.local_operation_storage_queue_size());
            }
        }
        streams_high.terpri(stream);
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 65232L)
    public static SubLObject with_safe_kb_dump_environment(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)operation_communication.$list168);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)operation_communication.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)operation_communication.NIL;
        SubLObject current_$19 = (SubLObject)operation_communication.NIL;
        while (operation_communication.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)operation_communication.$list168);
            current_$19 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)operation_communication.$list168);
            if (operation_communication.NIL == conses_high.member(current_$19, (SubLObject)operation_communication.$list169, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED)) {
                bad = (SubLObject)operation_communication.T;
            }
            if (current_$19 == operation_communication.$kw170$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (operation_communication.NIL != bad && operation_communication.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)operation_communication.$list168);
        }
        final SubLObject agenda_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)operation_communication.$kw171$AGENDA_TIMEOUT, current);
        final SubLObject agenda_timeout = (SubLObject)((operation_communication.NIL != agenda_timeout_tail) ? conses_high.cadr(agenda_timeout_tail) : operation_communication.NIL);
        final SubLObject disable_tcp_serversP_tail = cdestructuring_bind.property_list_member((SubLObject)operation_communication.$kw172$DISABLE_TCP_SERVERS_, current);
        final SubLObject disable_tcp_serversP = (SubLObject)((operation_communication.NIL != disable_tcp_serversP_tail) ? conses_high.cadr(disable_tcp_serversP_tail) : operation_communication.T);
        final SubLObject body;
        current = (body = temp);
        final SubLObject agenda_runningP = (SubLObject)operation_communication.$sym173$AGENDA_RUNNING_;
        final SubLObject saved_local_transcript = (SubLObject)operation_communication.$sym174$SAVED_LOCAL_TRANSCRIPT;
        final SubLObject saved_read_transcript = (SubLObject)operation_communication.$sym175$SAVED_READ_TRANSCRIPT;
        final SubLObject saved_communication_mode = (SubLObject)operation_communication.$sym176$SAVED_COMMUNICATION_MODE;
        final SubLObject saved_remote_queue = (SubLObject)operation_communication.$sym177$SAVED_REMOTE_QUEUE;
        final SubLObject saved_local_queue = (SubLObject)operation_communication.$sym178$SAVED_LOCAL_QUEUE;
        final SubLObject saved_auxiliary_queue = (SubLObject)operation_communication.$sym179$SAVED_AUXILIARY_QUEUE;
        final SubLObject saved_transcript_queue = (SubLObject)operation_communication.$sym180$SAVED_TRANSCRIPT_QUEUE;
        final SubLObject disabled_servers = (SubLObject)operation_communication.$sym181$DISABLED_SERVERS;
        return (SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym182$PROGN, (SubLObject)operation_communication.$list183, (SubLObject)operation_communication.$list184, (SubLObject)operation_communication.$list185, (SubLObject)operation_communication.$list186, (SubLObject)operation_communication.$list187, (SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym188$CLET, (SubLObject)ConsesLow.list(new SubLObject[] { reader.bq_cons(agenda_runningP, (SubLObject)operation_communication.$list189), reader.bq_cons(saved_local_transcript, (SubLObject)operation_communication.$list190), reader.bq_cons(saved_read_transcript, (SubLObject)operation_communication.$list191), reader.bq_cons(saved_communication_mode, (SubLObject)operation_communication.$list192), reader.bq_cons(saved_remote_queue, (SubLObject)operation_communication.$list193), reader.bq_cons(saved_local_queue, (SubLObject)operation_communication.$list194), reader.bq_cons(saved_auxiliary_queue, (SubLObject)operation_communication.$list195), reader.bq_cons(saved_transcript_queue, (SubLObject)operation_communication.$list196), reader.bq_cons(disabled_servers, (SubLObject)operation_communication.$list197) }), (SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym198$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)operation_communication.$sym182$PROGN, (SubLObject)ConsesLow.listS((SubLObject)operation_communication.$sym199$NOTING_PROGRESS, new SubLObject[] { operation_communication.$str200$Setting_up_safe_KB_dump_environme, operation_communication.$list201, ConsesLow.list((SubLObject)operation_communication.$sym202$PWHEN, disable_tcp_serversP, (SubLObject)ConsesLow.listS((SubLObject)operation_communication.$sym203$CSETQ, disabled_servers, (SubLObject)operation_communication.$list204)), ConsesLow.list((SubLObject)operation_communication.$sym202$PWHEN, agenda_runningP, (SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym205$ENSURE_AGENDA_HALTED, agenda_timeout)), ConsesLow.listS((SubLObject)operation_communication.$sym202$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)operation_communication.$sym206$CAND, agenda_runningP, (SubLObject)operation_communication.$list189), (SubLObject)operation_communication.$list207), operation_communication.$list208 }), ConsesLow.append(body, (SubLObject)operation_communication.NIL)), (SubLObject)ConsesLow.list(new SubLObject[] { operation_communication.$sym199$NOTING_PROGRESS, operation_communication.$str209$Restoring_pre_dump_environment, operation_communication.$list210, ConsesLow.list((SubLObject)operation_communication.$sym203$CSETQ, (SubLObject)operation_communication.$sym211$_LOCAL_TRANSCRIPT_, saved_local_transcript), ConsesLow.list((SubLObject)operation_communication.$sym212$SET_READ_TRANSCRIPT, saved_read_transcript), ConsesLow.list((SubLObject)operation_communication.$sym202$PWHEN, (SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym68$COMMUNICATION_MODE_, saved_communication_mode), (SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym213$SET_COMMUNICATION_MODE, saved_communication_mode)), ConsesLow.list((SubLObject)operation_communication.$sym203$CSETQ, (SubLObject)operation_communication.$sym214$_REMOTE_QUEUE_, saved_remote_queue), ConsesLow.list((SubLObject)operation_communication.$sym215$SET_LOCAL_QUEUE, saved_local_queue), ConsesLow.list((SubLObject)operation_communication.$sym203$CSETQ, (SubLObject)operation_communication.$sym216$_AUXILIARY_QUEUE_, saved_auxiliary_queue), ConsesLow.list((SubLObject)operation_communication.$sym203$CSETQ, (SubLObject)operation_communication.$sym217$_TRANSCRIPT_QUEUE_, saved_transcript_queue), ConsesLow.listS((SubLObject)operation_communication.$sym202$PWHEN, agenda_runningP, (SubLObject)operation_communication.$list218), ConsesLow.list((SubLObject)operation_communication.$sym219$RE_ENABLE_DISABLED_TCP_SERVERS, disabled_servers) }))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 68060L)
    public static SubLObject with_safe_hl_transcript_recording(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)operation_communication.$list220);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)operation_communication.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)operation_communication.NIL;
        SubLObject current_$20 = (SubLObject)operation_communication.NIL;
        while (operation_communication.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)operation_communication.$list220);
            current_$20 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)operation_communication.$list220);
            if (operation_communication.NIL == conses_high.member(current_$20, (SubLObject)operation_communication.$list169, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED)) {
                bad = (SubLObject)operation_communication.T;
            }
            if (current_$20 == operation_communication.$kw170$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (operation_communication.NIL != bad && operation_communication.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)operation_communication.$list220);
        }
        final SubLObject agenda_timeout_tail = cdestructuring_bind.property_list_member((SubLObject)operation_communication.$kw171$AGENDA_TIMEOUT, current);
        final SubLObject agenda_timeout = (SubLObject)((operation_communication.NIL != agenda_timeout_tail) ? conses_high.cadr(agenda_timeout_tail) : operation_communication.NIL);
        final SubLObject disable_tcp_serversP_tail = cdestructuring_bind.property_list_member((SubLObject)operation_communication.$kw172$DISABLE_TCP_SERVERS_, current);
        final SubLObject disable_tcp_serversP = (SubLObject)((operation_communication.NIL != disable_tcp_serversP_tail) ? conses_high.cadr(disable_tcp_serversP_tail) : operation_communication.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)operation_communication.$sym221$WITH_SAFE_KB_DUMP_ENVIRONMENT, (SubLObject)ConsesLow.list((SubLObject)operation_communication.$kw171$AGENDA_TIMEOUT, agenda_timeout, (SubLObject)operation_communication.$kw172$DISABLE_TCP_SERVERS_, disable_tcp_serversP), ConsesLow.append(body, (SubLObject)operation_communication.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 68310L)
    public static SubLObject cyc_write_image(final SubLObject filename, SubLObject do_full_gcP) {
        if (do_full_gcP == operation_communication.UNPROVIDED) {
            do_full_gcP = (SubLObject)operation_communication.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert operation_communication.NIL != Types.stringp(filename) : filename;
        SubLObject result = (SubLObject)operation_communication.NIL;
        if (operation_communication.NIL == operation_queues.local_queue_empty()) {
            while (operation_communication.NIL == operation_queues.local_queue_empty()) {
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
        final SubLObject saved_communication_mode = control_vars.$communication_mode$.getGlobalValue();
        final SubLObject saved_remote_queue = queues.queue_copy(operation_queues.$remote_queue$.getGlobalValue());
        final SubLObject saved_local_queue = queues.queue_copy(operation_queues.local_queue());
        final SubLObject saved_auxiliary_queue = queues.queue_copy(operation_queues.$auxiliary_queue$.getGlobalValue());
        final SubLObject saved_transcript_queue = queues.queue_copy(operation_queues.$transcript_queue$.getGlobalValue());
        SubLObject disabled_servers = (SubLObject)operation_communication.NIL;
        try {
            final SubLObject str = (SubLObject)operation_communication.$str200$Setting_up_safe_KB_dump_environme;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)operation_communication.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((operation_communication.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : operation_communication.T), thread);
                utilities_macros.noting_progress_preamble(str);
                Storage.room((SubLObject)operation_communication.UNPROVIDED);
                disabled_servers = tcp_server_utilities.disable_some_tcp_servers((SubLObject)operation_communication.UNPROVIDED);
                if (operation_communication.NIL != agenda_runningP) {
                    ensure_agenda_halted((SubLObject)operation_communication.NIL);
                }
                if (operation_communication.NIL != agenda_runningP && operation_communication.NIL != agenda.agenda_running()) {
                    Errors.warn((SubLObject)operation_communication.$str222$Agenda_was_not_successfully_halte);
                }
                transcript_utilities.$master_transcript$.setGlobalValue((SubLObject)operation_communication.NIL);
                transcript_utilities.$local_transcript$.setGlobalValue((SubLObject)operation_communication.NIL);
                transcript_utilities.set_read_transcript((SubLObject)operation_communication.NIL);
                control_vars.$communication_mode$.setGlobalValue((SubLObject)operation_communication.$kw2$UNKNOWN);
                operation_queues.clear_remote_queue();
                operation_queues.clear_local_queue();
                operation_queues.clear_auxiliary_queue();
                operation_queues.clear_transcript_queue();
                kb_utilities.swap_out_all_pristine_kb_objects();
                misc_utilities.flush_all_logs();
                Storage.room((SubLObject)operation_communication.UNPROVIDED);
                kb_utilities.kb_statistics((SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
            }
            result = Mapper.write_image(filename, do_full_gcP);
        }
        finally {
            final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                final SubLObject str2 = (SubLObject)operation_communication.$str209$Restoring_pre_dump_environment;
                final SubLObject _prev_bind_0_$21 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_13 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_14 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_15 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_16 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)operation_communication.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((operation_communication.NIL != str2) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : operation_communication.T), thread);
                    utilities_macros.noting_progress_preamble(str2);
                    transcript_utilities.set_master_transcript((SubLObject)operation_communication.UNPROVIDED);
                    transcript_utilities.$local_transcript$.setGlobalValue(saved_local_transcript);
                    transcript_utilities.set_read_transcript(saved_read_transcript);
                    if (operation_communication.NIL != communication_modeP(saved_communication_mode)) {
                        set_communication_mode(saved_communication_mode);
                    }
                    operation_queues.$remote_queue$.setGlobalValue(saved_remote_queue);
                    operation_queues.set_local_queue(saved_local_queue);
                    operation_queues.$auxiliary_queue$.setGlobalValue(saved_auxiliary_queue);
                    operation_queues.$transcript_queue$.setGlobalValue(saved_transcript_queue);
                    if (operation_communication.NIL != agenda_runningP) {
                        agenda.start_agenda((SubLObject)operation_communication.UNPROVIDED);
                    }
                    tcp_server_utilities.re_enable_disabled_tcp_servers(disabled_servers);
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_16, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_15, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_14, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_13, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_12, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$21, thread);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 68741L)
    public static SubLObject write_cyc_image(final SubLObject filename, SubLObject do_full_gcP) {
        if (do_full_gcP == operation_communication.UNPROVIDED) {
            do_full_gcP = (SubLObject)operation_communication.NIL;
        }
        assert operation_communication.NIL != Types.stringp(filename) : filename;
        if (operation_communication.NIL == operation_queues.local_queue_empty()) {
            while (operation_communication.NIL == operation_queues.local_queue_empty()) {
                operation_queues.run_one_local_op();
            }
        }
        save_transcript_ops();
        final SubLObject agenda_runningP = agenda.agenda_running();
        final SubLObject saved_local_transcript = transcript_utilities.$local_transcript$.getGlobalValue();
        final SubLObject saved_read_transcript = transcript_utilities.$read_transcript$.getGlobalValue();
        final SubLObject saved_communication_mode = control_vars.$communication_mode$.getGlobalValue();
        final SubLObject saved_remote_queue = queues.queue_copy(operation_queues.$remote_queue$.getGlobalValue());
        final SubLObject saved_local_queue = queues.queue_copy(operation_queues.local_queue());
        final SubLObject saved_auxiliary_queue = queues.queue_copy(operation_queues.$auxiliary_queue$.getGlobalValue());
        final SubLObject saved_transcript_queue = queues.queue_copy(operation_queues.$transcript_queue$.getGlobalValue());
        SubLObject result = (SubLObject)operation_communication.NIL;
        if (operation_communication.NIL != agenda_runningP) {
            agenda.halt_agenda((SubLObject)operation_communication.UNPROVIDED);
        }
        transcript_utilities.$master_transcript$.setGlobalValue((SubLObject)operation_communication.NIL);
        transcript_utilities.$local_transcript$.setGlobalValue((SubLObject)operation_communication.NIL);
        transcript_utilities.set_read_transcript((SubLObject)operation_communication.NIL);
        control_vars.$communication_mode$.setGlobalValue((SubLObject)operation_communication.$kw2$UNKNOWN);
        operation_queues.clear_remote_queue();
        operation_queues.clear_local_queue();
        operation_queues.clear_auxiliary_queue();
        operation_queues.clear_transcript_queue();
        result = Mapper.write_image(filename, do_full_gcP);
        transcript_utilities.set_master_transcript((SubLObject)operation_communication.UNPROVIDED);
        transcript_utilities.$local_transcript$.setGlobalValue(saved_local_transcript);
        transcript_utilities.set_read_transcript(saved_read_transcript);
        if (operation_communication.NIL != communication_modeP(saved_communication_mode)) {
            set_communication_mode(saved_communication_mode);
        }
        operation_queues.$remote_queue$.setGlobalValue(saved_remote_queue);
        operation_queues.set_local_queue(saved_local_queue);
        operation_queues.$auxiliary_queue$.setGlobalValue(saved_auxiliary_queue);
        operation_queues.$transcript_queue$.setGlobalValue(saved_transcript_queue);
        if (operation_communication.NIL != agenda_runningP) {
            agenda.start_agenda((SubLObject)operation_communication.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 70628L)
    public static SubLObject make_cyc_image_filename(SubLObject minor_version) {
        if (minor_version == operation_communication.UNPROVIDED) {
            minor_version = (SubLObject)operation_communication.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (operation_communication.NIL == subl_promotions.non_negative_integer_p(minor_version) || !minor_version.numLE((SubLObject)operation_communication.$int223$25))) {
            Errors.error((SubLObject)operation_communication.$str224$Minor_version__S_is_not_in_the_ra);
        }
        final SubLObject minor_version_char = Strings.sublisp_char((SubLObject)operation_communication.$str225$ABCDEFGHIJKLMNOPQRSTUVWXYZ, minor_version);
        final SubLObject kb_loaded = control_vars.kb_loaded();
        final SubLObject op_number = kb_op_number();
        SubLObject filename = (SubLObject)operation_communication.NIL;
        SubLObject extension = (SubLObject)operation_communication.NIL;
        SubLObject current;
        final SubLObject datum = current = system_info.cyc_revision_numbers();
        SubLObject system_number = (SubLObject)operation_communication.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)operation_communication.$list226);
        system_number = current.first();
        final SubLObject patch_numbers;
        current = (patch_numbers = current.rest());
        final SubLObject patch_strings = Mapping.mapcar(Symbols.symbol_function((SubLObject)operation_communication.$sym227$TO_STRING), patch_numbers);
        SubLObject complete_patch_string = (SubLObject)operation_communication.$str133$;
        SubLObject cdolist_list_var = patch_strings;
        SubLObject patch_string = (SubLObject)operation_communication.NIL;
        patch_string = cdolist_list_var.first();
        while (operation_communication.NIL != cdolist_list_var) {
            complete_patch_string = Sequences.cconcatenate(complete_patch_string, new SubLObject[] { operation_communication.$str228$p, patch_string });
            cdolist_list_var = cdolist_list_var.rest();
            patch_string = cdolist_list_var.first();
        }
        if (operation_communication.NIL == kb_loaded) {
            filename = PrintLow.format((SubLObject)operation_communication.NIL, (SubLObject)operation_communication.$str229$cyc_s_D_A__C, new SubLObject[] { system_number, complete_patch_string, minor_version_char });
        }
        else if (operation_communication.NIL == op_number || op_number.isZero()) {
            filename = PrintLow.format((SubLObject)operation_communication.NIL, (SubLObject)operation_communication.$str230$cyc_s_D_A_kb_A__C, new SubLObject[] { system_number, complete_patch_string, kb_loaded_string(), minor_version_char });
        }
        else {
            filename = PrintLow.format((SubLObject)operation_communication.NIL, (SubLObject)operation_communication.$str231$cyc_s_D_A_kb_A_op__A__C, new SubLObject[] { system_number, complete_patch_string, kb_loaded_string(), op_number, minor_version_char });
        }
        extension = (SubLObject)operation_communication.$str232$world;
        return Sequences.cconcatenate(filename, new SubLObject[] { operation_communication.$str62$_, extension });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 72649L)
    public static SubLObject make_next_cyc_image_filename(final SubLObject directory_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert operation_communication.NIL != Filesys.directory_p(directory_string) : directory_string;
        if (operation_communication.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && operation_communication.NIL == file_utilities.directory_writeable_p(directory_string, (SubLObject)operation_communication.UNPROVIDED)) {
            Errors.error((SubLObject)operation_communication.$str234$Directory__S_is_not_writeable);
        }
        SubLObject minor_version;
        SubLObject cyc_image_filename;
        SubLObject full_filename;
        for (minor_version = (SubLObject)operation_communication.NIL, minor_version = (SubLObject)operation_communication.ZERO_INTEGER; minor_version.numL((SubLObject)operation_communication.$int235$26); minor_version = Numbers.add(minor_version, (SubLObject)operation_communication.ONE_INTEGER)) {
            cyc_image_filename = make_cyc_image_filename(minor_version);
            full_filename = Sequences.cconcatenate(directory_string, cyc_image_filename);
            if (operation_communication.NIL == Filesys.probe_file(full_filename)) {
                return full_filename;
            }
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 73427L)
    public static SubLObject halt_cyc_image(SubLObject reason) {
        if (reason == operation_communication.UNPROVIDED) {
            reason = (SubLObject)operation_communication.$str236$done;
        }
        Errors.warn((SubLObject)operation_communication.$str237$Halting_Cyc_image____A, reason);
        agenda.halt_agenda((SubLObject)operation_communication.UNPROVIDED);
        misc_utilities.flush_all_logs();
        if (operation_communication.NIL != control_vars.kb_loaded()) {
            save_transcript_ops();
            transcript_utilities.mark_local_transcript((SubLObject)operation_communication.$str238$QUIT);
            inference_analysis.save_recent_experience();
            inference_analysis.save_recent_asked_queries();
            hl_transcript_tracing.flush_hl_transcript_trace();
        }
        return Processes.exit((SubLObject)operation_communication.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 74112L)
    public static SubLObject get_remote_operations_kb_check_point() {
        return operation_communication.$remote_operations_kb_check_point$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 74212L)
    public static SubLObject set_remote_operations_kb_check_point(final SubLObject fort) {
        assert operation_communication.NIL != forts.fort_p(fort) : fort;
        operation_communication.$remote_operations_kb_check_point$.setGlobalValue(fort);
        return get_remote_operations_kb_check_point();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 74398L)
    public static SubLObject clear_remote_operations_kb_check_point() {
        operation_communication.$remote_operations_kb_check_point$.setGlobalValue((SubLObject)operation_communication.NIL);
        return get_remote_operations_kb_check_point();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 74553L)
    public static SubLObject note_kb_check_point_reached(final SubLObject check_point_value) {
        if (operation_communication.$remote_operations_kb_check_point$.getGlobalValue().eql(check_point_value)) {
            set_communication_mode(get_communication_state(get_transmit_state(communication_mode()), (SubLObject)operation_communication.$str86$no));
            clear_remote_operations_kb_check_point();
        }
        return check_point_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 74873L)
    public static SubLObject transmit_kb_check_point_operation(final SubLObject check_point_value) {
        return operation_queues.add_to_transcript_queue(encapsulation.encapsulate((SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym240$NOTE_KB_CHECK_POINT_REACHED, check_point_value)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 75045L)
    public static SubLObject possibly_roll_to_allow_transmitting() {
        if (operation_communication.NIL == allow_transmitting()) {
            final SubLObject current_kb = control_vars.kb_loaded();
            final SubLObject next_kb = number_utilities.f_1X(current_kb);
            close_kb(current_kb, next_kb);
        }
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 75303L)
    public static SubLObject with_rebuilding_stream_optimizations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym241$WITH_ASSERTION_MANAGER_FULLY_LOADED, (SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym242$WITH_DEDUCTION_MANAGER_FULLY_LOADED, (SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym243$WITH_KB_HL_SUPPORT_CONTENT_INDEX_FULLY_LOADED, (SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym244$WITH_NART_INDEX_FULLY_LOADED, (SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym245$WITH_CONSTANT_INDEX_FULLY_LOADED, (SubLObject)ConsesLow.list((SubLObject)operation_communication.$sym188$CLET, (SubLObject)operation_communication.$list246, reader.bq_cons((SubLObject)operation_communication.$sym182$PROGN, ConsesLow.append(body, (SubLObject)operation_communication.NIL))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 76416L)
    public static SubLObject ensure_agenda_halted(SubLObject timeout_secs) {
        if (timeout_secs == operation_communication.UNPROVIDED) {
            timeout_secs = (SubLObject)operation_communication.NIL;
        }
        set_to_not_receiving();
        final SubLObject timeout_spec;
        SubLObject time_to_wait = timeout_spec = ((operation_communication.NIL == timeout_secs) ? Numbers.$most_positive_fixnum$.getGlobalValue() : timeout_secs);
        while (operation_communication.NIL != agenda.agenda_busyP()) {
            if (time_to_wait.isZero()) {
                Errors.error((SubLObject)operation_communication.$str247$Timeout_of__A_secs_arrived__witho, timeout_spec);
            }
            time_to_wait = Numbers.subtract(time_to_wait, (SubLObject)operation_communication.ONE_INTEGER);
            Threads.sleep((SubLObject)operation_communication.ONE_INTEGER);
        }
        agenda.halt_agenda((SubLObject)operation_communication.TEN_INTEGER);
        return time_to_wait;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 77223L)
    public static SubLObject prepare_incremental_kb_dump(SubLObject timeout_secs) {
        if (timeout_secs == operation_communication.UNPROVIDED) {
            timeout_secs = (SubLObject)operation_communication.$int248$60;
        }
        return ensure_agenda_halted(timeout_secs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 77342L)
    public static SubLObject dump_incremental_kb(SubLObject directory_path, SubLObject style) {
        if (directory_path == operation_communication.UNPROVIDED) {
            directory_path = (SubLObject)operation_communication.NIL;
        }
        if (style == operation_communication.UNPROVIDED) {
            style = (SubLObject)operation_communication.$kw249$ESSENTIAL;
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
                            final SubLObject _prev_bind_0 = control_vars.$save_asked_queriesP$.currentBinding(thread);
                            try {
                                control_vars.$save_asked_queriesP$.bind((SubLObject)operation_communication.NIL, thread);
                                if (!directory_path.isString()) {
                                    directory_path = kb_incremental_dump_directory((SubLObject)operation_communication.UNPROVIDED);
                                }
                                if (operation_communication.NIL == file_utilities.directory_writeable_p(directory_path, (SubLObject)operation_communication.UNPROVIDED)) {
                                    Errors.cerror((SubLObject)operation_communication.$str250$Create_directory_and_continue_, (SubLObject)operation_communication.$str251$Directory__S_does_not_exist_, directory_path);
                                    file_utilities.make_directory_recursive(directory_path, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
                                    if (operation_communication.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && operation_communication.NIL == file_utilities.directory_writeable_p(directory_path, (SubLObject)operation_communication.UNPROVIDED)) {
                                        Errors.error((SubLObject)operation_communication.$str252$Still_cannot_write_to_dump_direct, directory_path);
                                    }
                                }
                                final SubLObject curr_kb = control_vars.kb_loaded();
                                try {
                                    control_vars.set_kb_loaded(Numbers.subtract(curr_kb, (SubLObject)operation_communication.ONE_INTEGER));
                                    final SubLObject pcase_var = style;
                                    if (pcase_var.eql((SubLObject)operation_communication.$kw253$FULL)) {
                                        dumper.dump_kb(directory_path);
                                    }
                                    else if (pcase_var.eql((SubLObject)operation_communication.$kw254$STANDARD)) {
                                        dumper.dump_standard_kb(directory_path);
                                    }
                                    else if (pcase_var.eql((SubLObject)operation_communication.$kw249$ESSENTIAL)) {
                                        dumper.dump_non_computable_kb(directory_path);
                                    }
                                    else {
                                        Errors.error((SubLObject)operation_communication.$str255$Unknown_dump_style__A_not_impleme, style);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        control_vars.set_kb_loaded(curr_kb);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                    }
                                }
                                dump_incremental_stats_information(directory_path);
                            }
                            finally {
                                control_vars.$save_asked_queriesP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (operation_communication.NIL != maintaining_countsP_$26) {
                                    kb_object_manager.maintain_kb_object_usage_counts(manager_$25);
                                }
                                if (operation_communication.NIL == memory_mappedP_$27) {
                                    kb_object_manager.kb_object_manager_change_stream_buffer_sizes(manager_$25, (SubLObject)operation_communication.$int256$2048, (SubLObject)operation_communication.$int257$256);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            if (operation_communication.NIL != maintaining_countsP_$25) {
                                kb_object_manager.maintain_kb_object_usage_counts(manager_$24);
                            }
                            if (operation_communication.NIL == memory_mappedP_$26) {
                                kb_object_manager.kb_object_manager_change_stream_buffer_sizes(manager_$24, (SubLObject)operation_communication.$int256$2048, (SubLObject)operation_communication.$int257$256);
                            }
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                        final SubLObject _values4 = Values.getValuesAsVector();
                        if (operation_communication.NIL != maintaining_countsP_$24) {
                            kb_object_manager.maintain_kb_object_usage_counts(manager_$23);
                        }
                        if (operation_communication.NIL == memory_mappedP_$25) {
                            kb_object_manager.kb_object_manager_change_stream_buffer_sizes(manager_$23, (SubLObject)operation_communication.$int256$2048, (SubLObject)operation_communication.$int257$256);
                        }
                        Values.restoreValuesFromVector(_values4);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                    final SubLObject _values5 = Values.getValuesAsVector();
                    if (operation_communication.NIL != maintaining_countsP_$23) {
                        kb_object_manager.maintain_kb_object_usage_counts(manager_$22);
                    }
                    if (operation_communication.NIL == memory_mappedP_$24) {
                        kb_object_manager.kb_object_manager_change_stream_buffer_sizes(manager_$22, (SubLObject)operation_communication.$int256$2048, (SubLObject)operation_communication.$int257$256);
                    }
                    Values.restoreValuesFromVector(_values5);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                final SubLObject _values6 = Values.getValuesAsVector();
                if (operation_communication.NIL != maintaining_countsP) {
                    kb_object_manager.maintain_kb_object_usage_counts(manager);
                }
                if (operation_communication.NIL == memory_mappedP) {
                    kb_object_manager.kb_object_manager_change_stream_buffer_sizes(manager, (SubLObject)operation_communication.$int256$2048, (SubLObject)operation_communication.$int257$256);
                }
                Values.restoreValuesFromVector(_values6);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return Values.values(directory_path, style);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 78782L)
    public static SubLObject cyc_dump_incremental_kb(final SubLObject dump_dir, SubLObject style, SubLObject temp_dir, SubLObject timeout_secs, SubLObject worker_count) {
        if (style == operation_communication.UNPROVIDED) {
            style = (SubLObject)operation_communication.$kw254$STANDARD;
        }
        if (temp_dir == operation_communication.UNPROVIDED) {
            temp_dir = (SubLObject)operation_communication.$str258$_fastscratch_tmp_;
        }
        if (timeout_secs == operation_communication.UNPROVIDED) {
            timeout_secs = (SubLObject)operation_communication.$int248$60;
        }
        if (worker_count == operation_communication.UNPROVIDED) {
            worker_count = (SubLObject)operation_communication.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (misc_utilities.generic_caches_directory().isString() && operation_communication.NIL != Strings.stringE(misc_utilities.generic_caches_directory(), dump_dir, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED)) {
            Errors.warn((SubLObject)operation_communication.$str259$Dump_incremental_KB_trivially_fin, dump_dir);
            return dump_dir;
        }
        SubLObject result_directory_path = (SubLObject)operation_communication.NIL;
        SubLObject result_style = (SubLObject)operation_communication.NIL;
        if (operation_communication.NIL == operation_queues.local_queue_empty()) {
            while (operation_communication.NIL == operation_queues.local_queue_empty()) {
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
        final SubLObject saved_communication_mode = control_vars.$communication_mode$.getGlobalValue();
        final SubLObject saved_remote_queue = queues.queue_copy(operation_queues.$remote_queue$.getGlobalValue());
        final SubLObject saved_local_queue = queues.queue_copy(operation_queues.local_queue());
        final SubLObject saved_auxiliary_queue = queues.queue_copy(operation_queues.$auxiliary_queue$.getGlobalValue());
        final SubLObject saved_transcript_queue = queues.queue_copy(operation_queues.$transcript_queue$.getGlobalValue());
        SubLObject disabled_servers = (SubLObject)operation_communication.NIL;
        try {
            final SubLObject str = (SubLObject)operation_communication.$str200$Setting_up_safe_KB_dump_environme;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)operation_communication.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((operation_communication.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : operation_communication.T), thread);
                utilities_macros.noting_progress_preamble(str);
                Storage.room((SubLObject)operation_communication.UNPROVIDED);
                disabled_servers = tcp_server_utilities.disable_some_tcp_servers((SubLObject)operation_communication.UNPROVIDED);
                if (operation_communication.NIL != agenda_runningP) {
                    ensure_agenda_halted(timeout_secs);
                }
                if (operation_communication.NIL != agenda_runningP && operation_communication.NIL != agenda.agenda_running()) {
                    Errors.warn((SubLObject)operation_communication.$str222$Agenda_was_not_successfully_halte);
                }
                transcript_utilities.$master_transcript$.setGlobalValue((SubLObject)operation_communication.NIL);
                transcript_utilities.$local_transcript$.setGlobalValue((SubLObject)operation_communication.NIL);
                transcript_utilities.set_read_transcript((SubLObject)operation_communication.NIL);
                control_vars.$communication_mode$.setGlobalValue((SubLObject)operation_communication.$kw2$UNKNOWN);
                operation_queues.clear_remote_queue();
                operation_queues.clear_local_queue();
                operation_queues.clear_auxiliary_queue();
                operation_queues.clear_transcript_queue();
                kb_utilities.swap_out_all_pristine_kb_objects();
                misc_utilities.flush_all_logs();
                Storage.room((SubLObject)operation_communication.UNPROVIDED);
                kb_utilities.kb_statistics((SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
            }
            final SubLObject old_temp_dir = file_utilities.$temp_directory$.getGlobalValue();
            SubLObject old_worker_count = (SubLObject)operation_communication.NIL;
            try {
                file_utilities.$temp_directory$.setGlobalValue(temp_dir);
                if (operation_communication.NIL != subl_promotions.positive_integer_p(worker_count)) {
                    old_worker_count = builder_utilities.set_build_process_worker_count(worker_count);
                }
                thread.resetMultipleValues();
                final SubLObject result_directory_path_$35 = dump_incremental_kb(dump_dir, style);
                final SubLObject result_style_$36 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result_directory_path = result_directory_path_$35;
                result_style = result_style_$36;
            }
            finally {
                final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    file_utilities.$temp_directory$.setGlobalValue(old_temp_dir);
                    if (operation_communication.NIL != subl_promotions.positive_integer_p(old_worker_count)) {
                        builder_utilities.set_build_process_worker_count(old_worker_count);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
                }
            }
            format_nil.force_format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str260$__Successfully_dumped_incremental, dump_dir, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                final SubLObject str2 = (SubLObject)operation_communication.$str209$Restoring_pre_dump_environment;
                final SubLObject _prev_bind_0_$37 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_13 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_14 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_15 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_16 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_17 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)operation_communication.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((operation_communication.NIL != str2) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : operation_communication.T), thread);
                    utilities_macros.noting_progress_preamble(str2);
                    transcript_utilities.set_master_transcript((SubLObject)operation_communication.UNPROVIDED);
                    transcript_utilities.$local_transcript$.setGlobalValue(saved_local_transcript);
                    transcript_utilities.set_read_transcript(saved_read_transcript);
                    if (operation_communication.NIL != communication_modeP(saved_communication_mode)) {
                        set_communication_mode(saved_communication_mode);
                    }
                    operation_queues.$remote_queue$.setGlobalValue(saved_remote_queue);
                    operation_queues.set_local_queue(saved_local_queue);
                    operation_queues.$auxiliary_queue$.setGlobalValue(saved_auxiliary_queue);
                    operation_queues.$transcript_queue$.setGlobalValue(saved_transcript_queue);
                    if (operation_communication.NIL != agenda_runningP) {
                        agenda.start_agenda((SubLObject)operation_communication.UNPROVIDED);
                    }
                    tcp_server_utilities.re_enable_disabled_tcp_servers(disabled_servers);
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_17, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_16, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_15, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_14, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_13, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_12, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$37, thread);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
            }
        }
        return Values.values(result_directory_path, result_style);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 79943L)
    public static SubLObject prepare_and_dump_incremental_kb(SubLObject dump_dir, SubLObject temp_dir, SubLObject style, SubLObject timeout_secs) {
        if (dump_dir == operation_communication.UNPROVIDED) {
            dump_dir = (SubLObject)operation_communication.NIL;
        }
        if (temp_dir == operation_communication.UNPROVIDED) {
            temp_dir = (SubLObject)operation_communication.$str258$_fastscratch_tmp_;
        }
        if (style == operation_communication.UNPROVIDED) {
            style = (SubLObject)operation_communication.$kw253$FULL;
        }
        if (timeout_secs == operation_communication.UNPROVIDED) {
            timeout_secs = (SubLObject)operation_communication.$int248$60;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject disabled_servers = tcp_server_utilities.disable_some_tcp_servers((SubLObject)operation_communication.UNPROVIDED);
        set_receive_state((SubLObject)operation_communication.$str86$no);
        prepare_incremental_kb_dump(timeout_secs);
        kb_utilities.swap_out_all_pristine_kb_objects();
        Storage.room((SubLObject)operation_communication.UNPROVIDED);
        kb_utilities.kb_statistics((SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
        file_utilities.make_directory_recursive(dump_dir, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
        SubLObject result_directory_path = (SubLObject)operation_communication.NIL;
        SubLObject result_style = (SubLObject)operation_communication.NIL;
        final SubLObject old_temp_dir = file_utilities.$temp_directory$.getGlobalValue();
        try {
            file_utilities.$temp_directory$.setGlobalValue(temp_dir);
            thread.resetMultipleValues();
            final SubLObject result_directory_path_$38 = dump_incremental_kb(dump_dir, style);
            final SubLObject result_style_$39 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result_directory_path = result_directory_path_$38;
            result_style = result_style_$39;
            format_nil.force_format((SubLObject)operation_communication.T, (SubLObject)operation_communication.$str260$__Successfully_dumped_incremental, dump_dir, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_communication.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                file_utilities.$temp_directory$.setGlobalValue(old_temp_dir);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        tcp_server_utilities.re_enable_disabled_tcp_servers(disabled_servers);
        return Values.values(result_directory_path, result_style);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 81356L)
    public static SubLObject dump_incremental_stats_information(final SubLObject directory_path) {
        cfasl_utilities.cfasl_save(gather_incremental_operation_stats(), get_incremental_stats_dump_filename(directory_path));
        inference_analysis.receive_experience();
        inference_analysis.save_received_experience(get_incremental_experience_dump_filename(directory_path));
        return directory_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 81828L)
    public static SubLObject kb_incremental_dump_directory(SubLObject units_path) {
        if (units_path == operation_communication.UNPROVIDED) {
            units_path = (SubLObject)operation_communication.NIL;
        }
        final SubLObject raw_base_path = units_path.isString() ? dumper.kb_dump_directory(control_vars.kb_loaded(), (SubLObject)ConsesLow.list(units_path)) : dumper.kb_dump_directory(control_vars.kb_loaded(), (SubLObject)operation_communication.UNPROVIDED);
        final SubLObject path_terminator = string_utilities.to_string(string_utilities.last_char(raw_base_path));
        final SubLObject base_path = string_utilities.remove_last_char(raw_base_path, (SubLObject)operation_communication.UNPROVIDED);
        return Sequences.cconcatenate(base_path, new SubLObject[] { operation_communication.$str261$op, string_utilities.to_string(kb_op_number()), path_terminator });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 82388L)
    public static SubLObject load_incremental_kb(final SubLObject directory_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dumper.load_kb(directory_path);
        misc_utilities.system_code_initializations((SubLObject)operation_communication.UNPROVIDED);
        streams_high.terpri((SubLObject)operation_communication.UNPROVIDED);
        final SubLObject str = (SubLObject)operation_communication.$str262$Loading_transformation_rule_stati;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)operation_communication.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)operation_communication.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((operation_communication.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : operation_communication.T), thread);
            utilities_macros.noting_progress_preamble(str);
            final SubLObject received_experience = get_incremental_experience_dump_filename(directory_path);
            if (operation_communication.NIL != Filesys.probe_file(received_experience)) {
                inference_analysis.load_received_experience(received_experience);
            }
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        final SubLObject incremental_stats = cfasl_utilities.cfasl_load(get_incremental_stats_dump_filename(directory_path));
        apply_incremental_operation_stats(incremental_stats);
        return (SubLObject)operation_communication.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 83186L)
    public static SubLObject kb_incremental_unitsP(final SubLObject directory_path) {
        return list_utilities.sublisp_boolean(Filesys.probe_file(get_incremental_stats_dump_filename(directory_path)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 83347L)
    public static SubLObject get_incremental_stats_dump_filename(final SubLObject directory_path) {
        return dumper.kb_dump_file((SubLObject)operation_communication.$str263$incremental_stats, directory_path, (SubLObject)operation_communication.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 83585L)
    public static SubLObject get_incremental_experience_dump_filename(final SubLObject directory_path) {
        return dumper.kb_dump_file((SubLObject)operation_communication.$str264$received_experience, directory_path, (SubLObject)operation_communication.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 83820L)
    public static SubLObject gather_incremental_operation_stats() {
        return (SubLObject)ConsesLow.list((SubLObject)operation_communication.$kw265$TOTAL_REMOTE_OPERATIONS_RUN, total_remote_operations_run(), (SubLObject)operation_communication.$kw266$READ_MASTER_TRANSCRIPT_OP_NUMBER, kb_op_number());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-communication.lisp", position = 84012L)
    public static SubLObject apply_incremental_operation_stats(final SubLObject incremental_stats) {
        SubLObject allow_other_keys_p = (SubLObject)operation_communication.NIL;
        SubLObject rest = incremental_stats;
        SubLObject bad = (SubLObject)operation_communication.NIL;
        SubLObject current_$40 = (SubLObject)operation_communication.NIL;
        while (operation_communication.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, incremental_stats, (SubLObject)operation_communication.$list267);
            current_$40 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, incremental_stats, (SubLObject)operation_communication.$list267);
            if (operation_communication.NIL == conses_high.member(current_$40, (SubLObject)operation_communication.$list268, (SubLObject)operation_communication.UNPROVIDED, (SubLObject)operation_communication.UNPROVIDED)) {
                bad = (SubLObject)operation_communication.T;
            }
            if (current_$40 == operation_communication.$kw170$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (operation_communication.NIL != bad && operation_communication.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(incremental_stats, (SubLObject)operation_communication.$list267);
        }
        final SubLObject total_remote_operations_run_tail = cdestructuring_bind.property_list_member((SubLObject)operation_communication.$kw265$TOTAL_REMOTE_OPERATIONS_RUN, incremental_stats);
        final SubLObject total_remote_operations_run = (SubLObject)((operation_communication.NIL != total_remote_operations_run_tail) ? conses_high.cadr(total_remote_operations_run_tail) : operation_communication.NIL);
        final SubLObject read_master_transcript_op_number_tail = cdestructuring_bind.property_list_member((SubLObject)operation_communication.$kw266$READ_MASTER_TRANSCRIPT_OP_NUMBER, incremental_stats);
        final SubLObject read_master_transcript_op_number = (SubLObject)((operation_communication.NIL != read_master_transcript_op_number_tail) ? conses_high.cadr(read_master_transcript_op_number_tail) : operation_communication.NIL);
        set_total_remote_operations_run(total_remote_operations_run);
        set_read_master_transcript_op_number(read_master_transcript_op_number);
        return (SubLObject)operation_communication.$kw269$DONE;
    }
    
    public static SubLObject declare_operation_communication_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "comm_mode_desc_mode", "COMM-MODE-DESC-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "comm_mode_desc_name", "COMM-MODE-DESC-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "comm_mode_desc_receivingP", "COMM-MODE-DESC-RECEIVING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "comm_mode_desc_storingP", "COMM-MODE-DESC-STORING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "comm_mode_desc_transmittingP", "COMM-MODE-DESC-TRANSMITTING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "get_communication_mode_description", "GET-COMMUNICATION-MODE-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "comm_mode_name", "COMM-MODE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "comm_mode_receivingP", "COMM-MODE-RECEIVING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "comm_mode_storingP", "COMM-MODE-STORING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "comm_mode_transmittingP", "COMM-MODE-TRANSMITTING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "compile_legacy_communication_mode_information", "COMPILE-LEGACY-COMMUNICATION-MODE-INFORMATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "find_communication_mode", "FIND-COMMUNICATION-MODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "allow_transmitting", "ALLOW-TRANSMITTING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_allow_transmitting", "SET-ALLOW-TRANSMITTING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "kb_full_transcript_loaded", "KB-FULL-TRANSCRIPT-LOADED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_kb_full_transcript_loaded", "SET-KB-FULL-TRANSCRIPT-LOADED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "experimental_image", "EXPERIMENTAL-IMAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_experimental_image", "SET-EXPERIMENTAL-IMAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "read_transcript_op_limit", "READ-TRANSCRIPT-OP-LIMIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_read_transcript_op_limit", "SET-READ-TRANSCRIPT-OP-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "dont_record_operations_locally", "DONT-RECORD-OPERATIONS-LOCALLY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_dont_record_operations_locally", "SET-DONT-RECORD-OPERATIONS-LOCALLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "receiving_remote_operationsP", "RECEIVING-REMOTE-OPERATIONS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_receiving_remote_operationsP", "SET-RECEIVING-REMOTE-OPERATIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "process_local_operationsP", "PROCESS-LOCAL-OPERATIONS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_process_local_operationsP", "SET-PROCESS-LOCAL-OPERATIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "process_auxiliary_operationsP", "PROCESS-AUXILIARY-OPERATIONS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_process_auxiliary_operationsP", "SET-PROCESS-AUXILIARY-OPERATIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "saving_operationsP", "SAVING-OPERATIONS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "total_remote_operations_run", "TOTAL-REMOTE-OPERATIONS-RUN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_total_remote_operations_run", "SET-TOTAL-REMOTE-OPERATIONS-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "total_auxiliary_operations_run", "TOTAL-AUXILIARY-OPERATIONS-RUN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "inc_total_auxiliary_operations_run", "INC-TOTAL-AUXILIARY-OPERATIONS-RUN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "total_local_operations_recorded", "TOTAL-LOCAL-OPERATIONS-RECORDED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "inc_total_local_operations_recorded", "INC-TOTAL-LOCAL-OPERATIONS-RECORDED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "total_local_operations_transmitted", "TOTAL-LOCAL-OPERATIONS-TRANSMITTED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "inc_total_local_operations_transmitted", "INC-TOTAL-LOCAL-OPERATIONS-TRANSMITTED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "read_master_transcript_op_number", "READ-MASTER-TRANSCRIPT-OP-NUMBER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_read_master_transcript_op_number", "SET-READ-MASTER-TRANSCRIPT-OP-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "total_master_transcript_operations_processed", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_total_master_transcript_operations_processed", "SET-TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "the_cyclist", "THE-CYCLIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_the_cyclist", "SET-THE-CYCLIST", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "map_cyclist_name_to_cyclist_term", "MAP-CYCLIST-NAME-TO-CYCLIST-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "non_guest_cyclist_nameP", "NON-GUEST-CYCLIST-NAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "the_cyclist_is_guestP", "THE-CYCLIST-IS-GUEST?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "image_requires_authenticationP", "IMAGE-REQUIRES-AUTHENTICATION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "authenticate_the_cyclist", "AUTHENTICATE-THE-CYCLIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "lookup_password_for_cyclist_from_kb", "LOOKUP-PASSWORD-FOR-CYCLIST-FROM-KB", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "get_stored_password_for_cyclist_from_kb", "GET-STORED-PASSWORD-FOR-CYCLIST-FROM-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "specify_authentication_info_for_user", "SPECIFY-AUTHENTICATION-INFO-FOR-USER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "assert_stored_password_for_cyclist_in_kb", "ASSERT-STORED-PASSWORD-FOR-CYCLIST-IN-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "unassert_stored_password_for_cyclist_in_kb", "UNASSERT-STORED-PASSWORD-FOR-CYCLIST-IN-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "kb_op_number", "KB-OP-NUMBER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "kb_version_string", "KB-VERSION-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "remote_ops_processed", "REMOTE-OPS-PROCESSED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "kb_number_string", "KB-NUMBER-STRING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "kb_loaded_string", "KB-LOADED-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "available_communication_modes", "AVAILABLE-COMMUNICATION-MODES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "communication_modeP", "COMMUNICATION-MODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "communication_mode_name", "COMMUNICATION-MODE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "communication_mode", "COMMUNICATION-MODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_communication_mode_internal", "SET-COMMUNICATION-MODE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_communication_mode", "SET-COMMUNICATION-MODE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "transmit_state_p", "TRANSMIT-STATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "receive_state_p", "RECEIVE-STATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_communication_state", "SET-COMMUNICATION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_transmit_state", "SET-TRANSMIT-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_receive_state", "SET-RECEIVE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_recording_as_sent", "SET-TO-RECORDING-AS-SENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_recording_locally", "SET-TO-RECORDING-LOCALLY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_recording", "SET-TO-RECORDING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_no_record", "SET-TO-NO-RECORD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_receiving", "SET-TO-RECEIVING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_receiving_everything", "SET-TO-RECEIVING-EVERYTHING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_not_receiving", "SET-TO-NOT-RECEIVING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "transmitting_changeP", "TRANSMITTING-CHANGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "receiving_changeP", "RECEIVING-CHANGE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_receive_only", "SET-TO-RECEIVE-ONLY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_deaf", "SET-TO-DEAF", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_dead", "SET-TO-DEAD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_transmit_and_receive", "SET-TO-TRANSMIT-AND-RECEIVE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_transmit_only", "SET-TO-TRANSMIT-ONLY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_receive_record_transmit", "SET-TO-RECEIVE-RECORD-TRANSMIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_dead_receive", "SET-TO-DEAD-RECEIVE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_to_record_transmit", "SET-TO-RECORD-TRANSMIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "transmittingP", "TRANSMITTING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "storingP", "STORING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "not_recordingP", "NOT-RECORDING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "receivingP", "RECEIVING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "get_transmit_state", "GET-TRANSMIT-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "get_receive_state", "GET-RECEIVE-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "get_communication_state", "GET-COMMUNICATION-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "valid_transcript_expression", "VALID-TRANSCRIPT-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "operation_from_meP", "OPERATION-FROM-ME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "writing_transcriptsP", "WRITING-TRANSCRIPTS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "reading_transcriptsP", "READING-TRANSCRIPTS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "clear_stored_operations", "CLEAR-STORED-OPERATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "send_stored_operations", "SEND-STORED-OPERATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "fi_save_ops", "FI-SAVE-OPS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "send_local_transcript", "SEND-LOCAL-TRANSCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "possibly_save_transcript_ops", "POSSIBLY-SAVE-TRANSCRIPT-OPS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "save_transcript_ops", "SAVE-TRANSCRIPT-OPS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "save_transcript_ops_internal", "SAVE-TRANSCRIPT-OPS-INTERNAL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "possibly_save_hl_transcript_ops", "POSSIBLY-SAVE-HL-TRANSCRIPT-OPS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "save_hl_transcript_ops", "SAVE-HL-TRANSCRIPT-OPS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "save_hl_transcript_ops_internal", "SAVE-HL-TRANSCRIPT-OPS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "close_kb", "CLOSE-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "read_one_transcript_operation", "READ-ONE-TRANSCRIPT-OPERATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "backup_transcript_stream", "BACKUP-TRANSCRIPT-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "load_transcript_exprs", "LOAD-TRANSCRIPT-EXPRS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "load_transcript_exprs_internal", "LOAD-TRANSCRIPT-EXPRS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "remote_operation_to_runP", "REMOTE-OPERATION-TO-RUN?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "master_transcript_catch_up", "MASTER-TRANSCRIPT-CATCH-UP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "run_random_transcript_op", "RUN-RANDOM-TRANSCRIPT-OP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "catch_up_to_current", "CATCH-UP-TO-CURRENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "cyc_catch_up", "CYC-CATCH-UP", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "catch_up_kb", "CATCH-UP-KB", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "load_transcript_file", "LOAD-TRANSCRIPT-FILE", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "load_transcript", "LOAD-TRANSCRIPT", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "load_transcript_verbose", "LOAD-TRANSCRIPT-VERBOSE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "load_transcript_file_to_submit", "LOAD-TRANSCRIPT-FILE-TO-SUBMIT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "server_summary", "SERVER-SUMMARY", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.operation_communication", "with_safe_kb_dump_environment", "WITH-SAFE-KB-DUMP-ENVIRONMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.operation_communication", "with_safe_hl_transcript_recording", "WITH-SAFE-HL-TRANSCRIPT-RECORDING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "cyc_write_image", "CYC-WRITE-IMAGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "write_cyc_image", "WRITE-CYC-IMAGE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "make_cyc_image_filename", "MAKE-CYC-IMAGE-FILENAME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "make_next_cyc_image_filename", "MAKE-NEXT-CYC-IMAGE-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "halt_cyc_image", "HALT-CYC-IMAGE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "get_remote_operations_kb_check_point", "GET-REMOTE-OPERATIONS-KB-CHECK-POINT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "set_remote_operations_kb_check_point", "SET-REMOTE-OPERATIONS-KB-CHECK-POINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "clear_remote_operations_kb_check_point", "CLEAR-REMOTE-OPERATIONS-KB-CHECK-POINT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "note_kb_check_point_reached", "NOTE-KB-CHECK-POINT-REACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "transmit_kb_check_point_operation", "TRANSMIT-KB-CHECK-POINT-OPERATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "possibly_roll_to_allow_transmitting", "POSSIBLY-ROLL-TO-ALLOW-TRANSMITTING", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.operation_communication", "with_rebuilding_stream_optimizations", "WITH-REBUILDING-STREAM-OPTIMIZATIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "ensure_agenda_halted", "ENSURE-AGENDA-HALTED", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "prepare_incremental_kb_dump", "PREPARE-INCREMENTAL-KB-DUMP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "dump_incremental_kb", "DUMP-INCREMENTAL-KB", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "cyc_dump_incremental_kb", "CYC-DUMP-INCREMENTAL-KB", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "prepare_and_dump_incremental_kb", "PREPARE-AND-DUMP-INCREMENTAL-KB", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "dump_incremental_stats_information", "DUMP-INCREMENTAL-STATS-INFORMATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "kb_incremental_dump_directory", "KB-INCREMENTAL-DUMP-DIRECTORY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "load_incremental_kb", "LOAD-INCREMENTAL-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "kb_incremental_unitsP", "KB-INCREMENTAL-UNITS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "get_incremental_stats_dump_filename", "GET-INCREMENTAL-STATS-DUMP-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "get_incremental_experience_dump_filename", "GET-INCREMENTAL-EXPERIENCE-DUMP-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "gather_incremental_operation_stats", "GATHER-INCREMENTAL-OPERATION-STATS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_communication", "apply_incremental_operation_stats", "APPLY-INCREMENTAL-OPERATION-STATS", 1, 0, false);
        return (SubLObject)operation_communication.NIL;
    }
    
    public static SubLObject init_operation_communication_file() {
        operation_communication.$available_communication_modes$ = SubLFiles.defparameter("*AVAILABLE-COMMUNICATION-MODES*", (SubLObject)operation_communication.$list0);
        operation_communication.$all_communication_modes$ = SubLFiles.defparameter("*ALL-COMMUNICATION-MODES*", compile_legacy_communication_mode_information());
        operation_communication.$startup_communication_mode$ = SubLFiles.defvar("*STARTUP-COMMUNICATION-MODE*", (SubLObject)operation_communication.$kw13$UNSET);
        operation_communication.$allow_transmitting$ = SubLFiles.deflexical("*ALLOW-TRANSMITTING*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym14$_ALLOW_TRANSMITTING_)) ? operation_communication.$allow_transmitting$.getGlobalValue() : operation_communication.T));
        operation_communication.$kb_full_transcript_loaded$ = SubLFiles.deflexical("*KB-FULL-TRANSCRIPT-LOADED*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym15$_KB_FULL_TRANSCRIPT_LOADED_)) ? operation_communication.$kb_full_transcript_loaded$.getGlobalValue() : operation_communication.NIL));
        operation_communication.$experimental_image$ = SubLFiles.defparameter("*EXPERIMENTAL-IMAGE*", (SubLObject)operation_communication.NIL);
        operation_communication.$read_transcript_op_limit$ = SubLFiles.defparameter("*READ-TRANSCRIPT-OP-LIMIT*", (SubLObject)operation_communication.$int19$200);
        operation_communication.$receiving_remote_operationsP$ = SubLFiles.deflexical("*RECEIVING-REMOTE-OPERATIONS?*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym20$_RECEIVING_REMOTE_OPERATIONS__)) ? operation_communication.$receiving_remote_operationsP$.getGlobalValue() : operation_communication.T));
        operation_communication.$process_local_operationsP$ = SubLFiles.deflexical("*PROCESS-LOCAL-OPERATIONS?*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym21$_PROCESS_LOCAL_OPERATIONS__)) ? operation_communication.$process_local_operationsP$.getGlobalValue() : operation_communication.T));
        operation_communication.$process_auxiliary_operationsP$ = SubLFiles.deflexical("*PROCESS-AUXILIARY-OPERATIONS?*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym22$_PROCESS_AUXILIARY_OPERATIONS__)) ? operation_communication.$process_auxiliary_operationsP$.getGlobalValue() : operation_communication.T));
        operation_communication.$total_remote_operations_run$ = SubLFiles.deflexical("*TOTAL-REMOTE-OPERATIONS-RUN*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym23$_TOTAL_REMOTE_OPERATIONS_RUN_)) ? operation_communication.$total_remote_operations_run$.getGlobalValue() : operation_communication.ZERO_INTEGER));
        operation_communication.$total_auxiliary_operations_run$ = SubLFiles.deflexical("*TOTAL-AUXILIARY-OPERATIONS-RUN*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym24$_TOTAL_AUXILIARY_OPERATIONS_RUN_)) ? operation_communication.$total_auxiliary_operations_run$.getGlobalValue() : operation_communication.ZERO_INTEGER));
        operation_communication.$total_local_operations_recorded$ = SubLFiles.deflexical("*TOTAL-LOCAL-OPERATIONS-RECORDED*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym25$_TOTAL_LOCAL_OPERATIONS_RECORDED_)) ? operation_communication.$total_local_operations_recorded$.getGlobalValue() : operation_communication.ZERO_INTEGER));
        operation_communication.$total_local_operations_transmitted$ = SubLFiles.deflexical("*TOTAL-LOCAL-OPERATIONS-TRANSMITTED*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym26$_TOTAL_LOCAL_OPERATIONS_TRANSMITTED_)) ? operation_communication.$total_local_operations_transmitted$.getGlobalValue() : operation_communication.ZERO_INTEGER));
        operation_communication.$read_master_transcript_op_number$ = SubLFiles.deflexical("*READ-MASTER-TRANSCRIPT-OP-NUMBER*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym27$_READ_MASTER_TRANSCRIPT_OP_NUMBER_)) ? operation_communication.$read_master_transcript_op_number$.getGlobalValue() : operation_communication.ZERO_INTEGER));
        operation_communication.$total_master_transcript_operations_processed$ = SubLFiles.deflexical("*TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym28$_TOTAL_MASTER_TRANSCRIPT_OPERATIONS_PROCESSED_)) ? operation_communication.$total_master_transcript_operations_processed$.getGlobalValue() : operation_communication.ZERO_INTEGER));
        operation_communication.$image_requires_authenticationP$ = SubLFiles.deflexical("*IMAGE-REQUIRES-AUTHENTICATION?*", (SubLObject)operation_communication.NIL);
        operation_communication.$cyclist_authenticating_app$ = SubLFiles.defparameter("*CYCLIST-AUTHENTICATING-APP*", operation_communication.$const37$CycBrowser);
        operation_communication.$default_cyclist_authentication_mt$ = SubLFiles.defparameter("*DEFAULT-CYCLIST-AUTHENTICATION-MT*", operation_communication.$const45$CyclistsMt);
        operation_communication.$transmit_states$ = SubLFiles.deflexical("*TRANSMIT-STATES*", (SubLObject)operation_communication.$list74);
        operation_communication.$receive_states$ = SubLFiles.deflexical("*RECEIVE-STATES*", (SubLObject)operation_communication.$list76);
        operation_communication.$build_request_email$ = SubLFiles.deflexical("*BUILD-REQUEST-EMAIL*", (SubLObject)operation_communication.$str90$build_requests_cyc_com);
        operation_communication.$save_transcript_ops_lock$ = SubLFiles.defparameter("*SAVE-TRANSCRIPT-OPS-LOCK*", Locks.make_lock((SubLObject)operation_communication.$str95$Save_Transcript_OPS_lock));
        operation_communication.$save_hl_transcript_ops_lock$ = SubLFiles.defparameter("*SAVE-HL-TRANSCRIPT-OPS-LOCK*", Locks.make_lock((SubLObject)operation_communication.$str96$Save_Hl_Transcript_OPS_lock));
        operation_communication.$transcript_load_succeeded$ = SubLFiles.defvar("*TRANSCRIPT-LOAD-SUCCEEDED*", (SubLObject)operation_communication.NIL);
        operation_communication.$transcript_read_attempted$ = SubLFiles.deflexical("*TRANSCRIPT-READ-ATTEMPTED*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym103$_TRANSCRIPT_READ_ATTEMPTED_)) ? operation_communication.$transcript_read_attempted$.getGlobalValue() : operation_communication.NIL));
        operation_communication.$initial_read_transcript_size$ = SubLFiles.deflexical("*INITIAL-READ-TRANSCRIPT-SIZE*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym104$_INITIAL_READ_TRANSCRIPT_SIZE_)) ? operation_communication.$initial_read_transcript_size$.getGlobalValue() : operation_communication.ZERO_INTEGER));
        operation_communication.$catch_up_kb_transcript_server_wait_time$ = SubLFiles.defparameter("*CATCH-UP-KB-TRANSCRIPT-SERVER-WAIT-TIME*", (SubLObject)operation_communication.$int112$600);
        operation_communication.$catch_up_kb_agenda_halt_wait_time$ = SubLFiles.defparameter("*CATCH-UP-KB-AGENDA-HALT-WAIT-TIME*", (SubLObject)operation_communication.NIL);
        operation_communication.$remote_operations_kb_check_point$ = SubLFiles.deflexical("*REMOTE-OPERATIONS-KB-CHECK-POINT*", (SubLObject)((operation_communication.NIL != Symbols.boundp((SubLObject)operation_communication.$sym239$_REMOTE_OPERATIONS_KB_CHECK_POINT_)) ? operation_communication.$remote_operations_kb_check_point$.getGlobalValue() : operation_communication.NIL));
        return (SubLObject)operation_communication.NIL;
    }
    
    public static SubLObject setup_operation_communication_file() {
        system_parameters.register_system_parameter((SubLObject)operation_communication.$sym9$_STARTUP_COMMUNICATION_MODE_, (SubLObject)operation_communication.$kw10$DEAF, (SubLObject)operation_communication.$list11, (SubLObject)operation_communication.$str12$This_is_the_communication_mode_th);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym14$_ALLOW_TRANSMITTING_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym15$_KB_FULL_TRANSCRIPT_LOADED_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym20$_RECEIVING_REMOTE_OPERATIONS__);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym21$_PROCESS_LOCAL_OPERATIONS__);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym22$_PROCESS_AUXILIARY_OPERATIONS__);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym23$_TOTAL_REMOTE_OPERATIONS_RUN_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym24$_TOTAL_AUXILIARY_OPERATIONS_RUN_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym25$_TOTAL_LOCAL_OPERATIONS_RECORDED_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym26$_TOTAL_LOCAL_OPERATIONS_TRANSMITTED_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym27$_READ_MASTER_TRANSCRIPT_OP_NUMBER_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym28$_TOTAL_MASTER_TRANSCRIPT_OPERATIONS_PROCESSED_);
        access_macros.register_external_symbol((SubLObject)operation_communication.$sym29$THE_CYCLIST);
        utilities_macros.register_cyc_api_function((SubLObject)operation_communication.$sym31$THE_CYCLIST_IS_GUEST_, (SubLObject)operation_communication.NIL, (SubLObject)operation_communication.$str32$Return_T_iff_the_current_CyclIst_, (SubLObject)operation_communication.NIL, (SubLObject)operation_communication.$list33);
        utilities_macros.register_cyc_api_function((SubLObject)operation_communication.$sym34$IMAGE_REQUIRES_AUTHENTICATION_, (SubLObject)operation_communication.NIL, (SubLObject)operation_communication.$str35$_return_non_NIL_iff_this_Cyc_imag, (SubLObject)operation_communication.NIL, (SubLObject)operation_communication.$list36);
        utilities_macros.register_cyc_api_function((SubLObject)operation_communication.$sym40$AUTHENTICATE_THE_CYCLIST, (SubLObject)operation_communication.$list41, (SubLObject)operation_communication.$str42$Ensure_that_the_encrypted_passphr, (SubLObject)operation_communication.$list43, (SubLObject)operation_communication.$list44);
        utilities_macros.register_cyc_api_function((SubLObject)operation_communication.$sym52$SPECIFY_AUTHENTICATION_INFO_FOR_USER, (SubLObject)operation_communication.$list53, (SubLObject)operation_communication.$str54$Store_the_authenitcation_informat, (SubLObject)operation_communication.$list55, (SubLObject)operation_communication.$list56);
        access_macros.register_external_symbol((SubLObject)operation_communication.$sym61$KB_VERSION_STRING);
        access_macros.register_external_symbol((SubLObject)operation_communication.$sym63$KB_NUMBER_STRING);
        access_macros.register_external_symbol((SubLObject)operation_communication.$sym65$KB_LOADED_STRING);
        access_macros.register_external_symbol((SubLObject)operation_communication.$sym80$SET_TO_RECEIVING_EVERYTHING);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym103$_TRANSCRIPT_READ_ATTEMPTED_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym104$_INITIAL_READ_TRANSCRIPT_SIZE_);
        access_macros.register_external_symbol((SubLObject)operation_communication.$sym113$CATCH_UP_TO_CURRENT);
        access_macros.register_external_symbol((SubLObject)operation_communication.$sym114$CYC_CATCH_UP);
        access_macros.register_external_symbol((SubLObject)operation_communication.$sym115$CATCH_UP_KB);
        access_macros.register_external_symbol((SubLObject)operation_communication.$sym148$LOAD_TRANSCRIPT_FILE_TO_SUBMIT);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_communication.$sym239$_REMOTE_OPERATIONS_KB_CHECK_POINT_);
        return (SubLObject)operation_communication.NIL;
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
        me = (SubLFile)new operation_communication();
        operation_communication.$available_communication_modes$ = null;
        operation_communication.$all_communication_modes$ = null;
        operation_communication.$startup_communication_mode$ = null;
        operation_communication.$allow_transmitting$ = null;
        operation_communication.$kb_full_transcript_loaded$ = null;
        operation_communication.$experimental_image$ = null;
        operation_communication.$read_transcript_op_limit$ = null;
        operation_communication.$receiving_remote_operationsP$ = null;
        operation_communication.$process_local_operationsP$ = null;
        operation_communication.$process_auxiliary_operationsP$ = null;
        operation_communication.$total_remote_operations_run$ = null;
        operation_communication.$total_auxiliary_operations_run$ = null;
        operation_communication.$total_local_operations_recorded$ = null;
        operation_communication.$total_local_operations_transmitted$ = null;
        operation_communication.$read_master_transcript_op_number$ = null;
        operation_communication.$total_master_transcript_operations_processed$ = null;
        operation_communication.$image_requires_authenticationP$ = null;
        operation_communication.$cyclist_authenticating_app$ = null;
        operation_communication.$default_cyclist_authentication_mt$ = null;
        operation_communication.$transmit_states$ = null;
        operation_communication.$receive_states$ = null;
        operation_communication.$build_request_email$ = null;
        operation_communication.$save_transcript_ops_lock$ = null;
        operation_communication.$save_hl_transcript_ops_lock$ = null;
        operation_communication.$transcript_load_succeeded$ = null;
        operation_communication.$transcript_read_attempted$ = null;
        operation_communication.$initial_read_transcript_size$ = null;
        operation_communication.$catch_up_kb_transcript_server_wait_time$ = null;
        operation_communication.$catch_up_kb_agenda_halt_wait_time$ = null;
        operation_communication.$remote_operations_kb_check_point$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("RECEIVE-RECORD-TRANSMIT"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Receive and Record and Send"), SubLObjectFactory.makeKeyword("RECEIVE?"), operation_communication.T, SubLObjectFactory.makeKeyword("STORE?"), operation_communication.T, SubLObjectFactory.makeKeyword("TRANSMIT?"), operation_communication.T }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("RECEIVE-ONLY"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Storing and Receiving"), SubLObjectFactory.makeKeyword("RECEIVE?"), operation_communication.T, SubLObjectFactory.makeKeyword("STORE?"), operation_communication.T, SubLObjectFactory.makeKeyword("TRANSMIT?"), operation_communication.NIL }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("RECORD-TRANSMIT"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Storing and Sending"), SubLObjectFactory.makeKeyword("RECEIVE?"), operation_communication.NIL, SubLObjectFactory.makeKeyword("STORE?"), operation_communication.T, SubLObjectFactory.makeKeyword("TRANSMIT?"), operation_communication.T }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("DEAF"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Storing only"), SubLObjectFactory.makeKeyword("RECEIVE?"), operation_communication.NIL, SubLObjectFactory.makeKeyword("STORE?"), operation_communication.T, SubLObjectFactory.makeKeyword("TRANSMIT?"), operation_communication.NIL }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("TRANSMIT-AND-RECEIVE"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Sending and Receiving"), SubLObjectFactory.makeKeyword("RECEIVE?"), operation_communication.T, SubLObjectFactory.makeKeyword("STORE?"), operation_communication.NIL, SubLObjectFactory.makeKeyword("TRANSMIT?"), operation_communication.T }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("DEAD-RECEIVE"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Not Recording but Receiving"), SubLObjectFactory.makeKeyword("RECEIVE?"), operation_communication.T, SubLObjectFactory.makeKeyword("STORE?"), operation_communication.NIL, SubLObjectFactory.makeKeyword("TRANSMIT?"), operation_communication.NIL }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("TRANSMIT-ONLY"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Sending only"), SubLObjectFactory.makeKeyword("RECEIVE?"), operation_communication.NIL, SubLObjectFactory.makeKeyword("STORE?"), operation_communication.NIL, SubLObjectFactory.makeKeyword("TRANSMIT?"), operation_communication.T }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("DEAD"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Not Recording or Receiving"), SubLObjectFactory.makeKeyword("RECEIVE?"), operation_communication.NIL, SubLObjectFactory.makeKeyword("STORE?"), operation_communication.NIL, SubLObjectFactory.makeKeyword("TRANSMIT?"), operation_communication.NIL }));
        $kw1$MODE = SubLObjectFactory.makeKeyword("MODE");
        $kw2$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw3$NAME = SubLObjectFactory.makeKeyword("NAME");
        $str4$unknown_mode = SubLObjectFactory.makeString("unknown mode");
        $kw5$RECEIVE_ = SubLObjectFactory.makeKeyword("RECEIVE?");
        $kw6$STORE_ = SubLObjectFactory.makeKeyword("STORE?");
        $kw7$TRANSMIT_ = SubLObjectFactory.makeKeyword("TRANSMIT?");
        $sym8$COMM_MODE_DESC_MODE = SubLObjectFactory.makeSymbol("COMM-MODE-DESC-MODE");
        $sym9$_STARTUP_COMMUNICATION_MODE_ = SubLObjectFactory.makeSymbol("*STARTUP-COMMUNICATION-MODE*");
        $kw10$DEAF = SubLObjectFactory.makeKeyword("DEAF");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("*ALL-COMMUNICATION-MODES*"));
        $str12$This_is_the_communication_mode_th = SubLObjectFactory.makeString("This is the communication mode the cyc image should get \ninitialized to at system startup.");
        $kw13$UNSET = SubLObjectFactory.makeKeyword("UNSET");
        $sym14$_ALLOW_TRANSMITTING_ = SubLObjectFactory.makeSymbol("*ALLOW-TRANSMITTING*");
        $sym15$_KB_FULL_TRANSCRIPT_LOADED_ = SubLObjectFactory.makeSymbol("*KB-FULL-TRANSCRIPT-LOADED*");
        $kw16$TRANSMIT_AND_RECEIVE = SubLObjectFactory.makeKeyword("TRANSMIT-AND-RECEIVE");
        $kw17$RECEIVE_ONLY = SubLObjectFactory.makeKeyword("RECEIVE-ONLY");
        $kw18$TRANSMIT_ONLY = SubLObjectFactory.makeKeyword("TRANSMIT-ONLY");
        $int19$200 = SubLObjectFactory.makeInteger(200);
        $sym20$_RECEIVING_REMOTE_OPERATIONS__ = SubLObjectFactory.makeSymbol("*RECEIVING-REMOTE-OPERATIONS?*");
        $sym21$_PROCESS_LOCAL_OPERATIONS__ = SubLObjectFactory.makeSymbol("*PROCESS-LOCAL-OPERATIONS?*");
        $sym22$_PROCESS_AUXILIARY_OPERATIONS__ = SubLObjectFactory.makeSymbol("*PROCESS-AUXILIARY-OPERATIONS?*");
        $sym23$_TOTAL_REMOTE_OPERATIONS_RUN_ = SubLObjectFactory.makeSymbol("*TOTAL-REMOTE-OPERATIONS-RUN*");
        $sym24$_TOTAL_AUXILIARY_OPERATIONS_RUN_ = SubLObjectFactory.makeSymbol("*TOTAL-AUXILIARY-OPERATIONS-RUN*");
        $sym25$_TOTAL_LOCAL_OPERATIONS_RECORDED_ = SubLObjectFactory.makeSymbol("*TOTAL-LOCAL-OPERATIONS-RECORDED*");
        $sym26$_TOTAL_LOCAL_OPERATIONS_TRANSMITTED_ = SubLObjectFactory.makeSymbol("*TOTAL-LOCAL-OPERATIONS-TRANSMITTED*");
        $sym27$_READ_MASTER_TRANSCRIPT_OP_NUMBER_ = SubLObjectFactory.makeSymbol("*READ-MASTER-TRANSCRIPT-OP-NUMBER*");
        $sym28$_TOTAL_MASTER_TRANSCRIPT_OPERATIONS_PROCESSED_ = SubLObjectFactory.makeSymbol("*TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED*");
        $sym29$THE_CYCLIST = SubLObjectFactory.makeSymbol("THE-CYCLIST");
        $const30$Guest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Guest"));
        $sym31$THE_CYCLIST_IS_GUEST_ = SubLObjectFactory.makeSymbol("THE-CYCLIST-IS-GUEST?");
        $str32$Return_T_iff_the_current_CyclIst_ = SubLObjectFactory.makeString("Return T iff the current CyclIst is the #$Guest account.");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")));
        $sym34$IMAGE_REQUIRES_AUTHENTICATION_ = SubLObjectFactory.makeSymbol("IMAGE-REQUIRES-AUTHENTICATION?");
        $str35$_return_non_NIL_iff_this_Cyc_imag = SubLObjectFactory.makeString("@return non-NIL iff this Cyc image requires authentication.");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $const37$CycBrowser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycBrowser"));
        $sym38$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym39$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym40$AUTHENTICATE_THE_CYCLIST = SubLObjectFactory.makeSymbol("AUTHENTICATE-THE-CYCLIST");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ENCRYPTED-PASSWORD"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLICATION"), (SubLObject)SubLObjectFactory.makeSymbol("*CYCLIST-AUTHENTICATING-APP*")));
        $str42$Ensure_that_the_encrypted_passphr = SubLObjectFactory.makeString("Ensure that the encrypted passphrase (e.g. SHA1 of password and user name, or similar)\n   is the one recorded for APPLICATION for the Cyclist identified by NAME\n   in the current KB.\n   Otherwise, sets the cyclist to #$Guest.\n   @return FORT-P the current cyclist\n   @see THE-CYCLIST-IS-GUEST?");
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENCRYPTED-PASSWORD"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLICATION"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"));
        $const45$CyclistsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt"));
        $const46$UserOfProgramFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UserOfProgramFn"));
        $sym47$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $const48$encryptedPasswordForUser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("encryptedPasswordForUser"));
        $str49$Please_login_to_specify_authentic = SubLObjectFactory.makeString("Please login to specify authentication information for others.");
        $sym50$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str51$Cyclists_can_only_edit_their_own_ = SubLObjectFactory.makeString("Cyclists can only edit their own passwords.");
        $sym52$SPECIFY_AUTHENTICATION_INFO_FOR_USER = SubLObjectFactory.makeSymbol("SPECIFY-AUTHENTICATION-INFO-FOR-USER");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"), (SubLObject)SubLObjectFactory.makeSymbol("PASSPHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLICATION"), (SubLObject)SubLObjectFactory.makeSymbol("*CYCLIST-AUTHENTICATING-APP*")));
        $str54$Store_the_authenitcation_informat = SubLObjectFactory.makeString("Store the authenitcation information for the user in the currrent KB.\n   Any valid user may add a password, but only the same user may edit it.\n   @param CYCLIST the cyclist for whom to establish this credential\n   @param PASSPHRASE the password as a STRINGP\n   @param APPLICATION the FORT-P denoting the program or NIL if it is the general credential\n   @return 0 BOOLEANP success indicator\n   @return 1 STRINGP error message, valid if BOOLEANP is NIL");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSPHRASE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $str57$__Error__A___A__ = SubLObjectFactory.makeString("~&Error ~A: ~A~%");
        $str58$Cannot_assert_passphrase_for__A__ = SubLObjectFactory.makeString("Cannot assert passphrase for ~A: ~A");
        $str59$Cannot_unassert_missing_passphras = SubLObjectFactory.makeString("Cannot unassert missing passphrase for ~A ... concurrent modification?");
        $str60$Cannot_unassert_passphrase__A_for = SubLObjectFactory.makeString("Cannot unassert passphrase ~A for ~A: ~A");
        $sym61$KB_VERSION_STRING = SubLObjectFactory.makeSymbol("KB-VERSION-STRING");
        $str62$_ = SubLObjectFactory.makeString(".");
        $sym63$KB_NUMBER_STRING = SubLObjectFactory.makeSymbol("KB-NUMBER-STRING");
        $str64$_4__0D = SubLObjectFactory.makeString("~4,'0D");
        $sym65$KB_LOADED_STRING = SubLObjectFactory.makeSymbol("KB-LOADED-STRING");
        $sym66$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym67$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym68$COMMUNICATION_MODE_ = SubLObjectFactory.makeSymbol("COMMUNICATION-MODE?");
        $kw69$DEAD = SubLObjectFactory.makeKeyword("DEAD");
        $kw70$DEAD_RECEIVE = SubLObjectFactory.makeKeyword("DEAD-RECEIVE");
        $kw71$RECEIVE_RECORD_TRANSMIT = SubLObjectFactory.makeKeyword("RECEIVE-RECORD-TRANSMIT");
        $kw72$RECORD_TRANSMIT = SubLObjectFactory.makeKeyword("RECORD-TRANSMIT");
        $str73$Unsupported_communication_mode__A = SubLObjectFactory.makeString("Unsupported communication mode ~A.~%");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("transmit"), (SubLObject)SubLObjectFactory.makeString("store"), (SubLObject)SubLObjectFactory.makeString("none"), (SubLObject)SubLObjectFactory.makeString("transmit and store"));
        $sym75$STRING_EQUAL = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("yes"), (SubLObject)SubLObjectFactory.makeString("no"));
        $sym77$TRANSMIT_STATE_P = SubLObjectFactory.makeSymbol("TRANSMIT-STATE-P");
        $sym78$RECEIVE_STATE_P = SubLObjectFactory.makeSymbol("RECEIVE-STATE-P");
        $str79$SENT = SubLObjectFactory.makeString("SENT");
        $sym80$SET_TO_RECEIVING_EVERYTHING = SubLObjectFactory.makeSymbol("SET-TO-RECEIVING-EVERYTHING");
        $str81$transmit_and_store = SubLObjectFactory.makeString("transmit and store");
        $str82$store = SubLObjectFactory.makeString("store");
        $str83$transmit = SubLObjectFactory.makeString("transmit");
        $str84$none = SubLObjectFactory.makeString("none");
        $str85$yes = SubLObjectFactory.makeString("yes");
        $str86$no = SubLObjectFactory.makeString("no");
        $str87$None = SubLObjectFactory.makeString("None");
        $str88$Yes = SubLObjectFactory.makeString("Yes");
        $str89$CLEARED = SubLObjectFactory.makeString("CLEARED");
        $str90$build_requests_cyc_com = SubLObjectFactory.makeString("build-requests@cyc.com");
        $kw91$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $kw92$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str93$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str94$_s__ = SubLObjectFactory.makeString("~s~%");
        $str95$Save_Transcript_OPS_lock = SubLObjectFactory.makeString("Save Transcript OPS lock");
        $str96$Save_Hl_Transcript_OPS_lock = SubLObjectFactory.makeString("Save Hl-Transcript OPS lock");
        $kw97$EOF = SubLObjectFactory.makeKeyword("EOF");
        $kw98$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str99$Bogus_form__S_read_from_transcrip = SubLObjectFactory.makeString("Bogus form ~S read from transcript at position ~S");
        $str100$Skip_forward_until_a_valid_transc = SubLObjectFactory.makeString("Skip forward until a valid transcript form is reached");
        $str101$Assume_the_rest_of_the_operation_ = SubLObjectFactory.makeString("Assume the rest of the operation is now there and retry reading it");
        $str102$Partial_transcript_operation__S_w = SubLObjectFactory.makeString("Partial transcript operation ~S was read in");
        $sym103$_TRANSCRIPT_READ_ATTEMPTED_ = SubLObjectFactory.makeSymbol("*TRANSCRIPT-READ-ATTEMPTED*");
        $sym104$_INITIAL_READ_TRANSCRIPT_SIZE_ = SubLObjectFactory.makeSymbol("*INITIAL-READ-TRANSCRIPT-SIZE*");
        $str105$The_transcript_file__s_has_alread = SubLObjectFactory.makeString("The transcript file ~s has already been accessed, but cannot be found now.");
        $kw106$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str107$__Processing_master_transcript_op = SubLObjectFactory.makeString("~&Processing master transcript operations~%");
        $int108$100 = SubLObjectFactory.makeInteger(100);
        $str109$___4__0D__2__0D__2__0D__2__0D__2_ = SubLObjectFactory.makeString("~&~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D: processed ~A operations~%");
        $str110$__Finished_processing__A_master_t = SubLObjectFactory.makeString("~&Finished processing ~A master transcript operations~%");
        $kw111$UNENCAPSULATION_ERROR = SubLObjectFactory.makeKeyword("UNENCAPSULATION-ERROR");
        $int112$600 = SubLObjectFactory.makeInteger(600);
        $sym113$CATCH_UP_TO_CURRENT = SubLObjectFactory.makeSymbol("CATCH-UP-TO-CURRENT");
        $sym114$CYC_CATCH_UP = SubLObjectFactory.makeSymbol("CYC-CATCH-UP");
        $sym115$CATCH_UP_KB = SubLObjectFactory.makeSymbol("CATCH-UP-KB");
        $str116$Cannot_catchup_backwards_from_KB_ = SubLObjectFactory.makeString("Cannot catchup backwards from KB ~A to ~A");
        $str117$Cannot_catchup_backwards_from_KB_ = SubLObjectFactory.makeString("Cannot catchup backwards from KB ~A to ~A.~A");
        $str118$_A_ops_to_run_from_KB__A__ = SubLObjectFactory.makeString("~A ops to run from KB ~A~%");
        $str119$Shutting_down_agenda = SubLObjectFactory.makeString("Shutting down agenda");
        $str120$Could_not_shut_down_agenda_ = SubLObjectFactory.makeString("Could not shut down agenda.");
        $str121$Will_load_submitted_transcripts = SubLObjectFactory.makeString("Will load submitted transcripts");
        $str122$Will_send_submitted_transcript_no = SubLObjectFactory.makeString("Will send submitted transcript notification messages");
        $str123$Will_not_send_submitted_transcrip = SubLObjectFactory.makeString("Will not send submitted transcript notification messages");
        $str124$Catching_up_on_ = SubLObjectFactory.makeString("Catching up on ");
        $str125$_operations_from_KB_ = SubLObjectFactory.makeString(" operations from KB ");
        $str126$_to_ = SubLObjectFactory.makeString(" to ");
        $str127$_A_At_KB__A__waiting__A_seconds_f = SubLObjectFactory.makeString("~A At KB ~A, waiting ~A seconds for more operations from transcript server.~%");
        $str128$Last_operation___S__ = SubLObjectFactory.makeString("Last operation: ~S~%");
        $kw129$AUX = SubLObjectFactory.makeKeyword("AUX");
        $kw130$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str131$Evaluating__load_transcript_ = SubLObjectFactory.makeString("Evaluating (load-transcript ");
        $str132$_ = SubLObjectFactory.makeString(" ");
        $str133$ = SubLObjectFactory.makeString("");
        $str134$_ = SubLObjectFactory.makeString(")");
        $kw135$LOCAL = SubLObjectFactory.makeKeyword("LOCAL");
        $str136$___s_operation_A_performed__ = SubLObjectFactory.makeString("  ~s operation~A performed~%");
        $str137$s_were = SubLObjectFactory.makeString("s were");
        $str138$_was = SubLObjectFactory.makeString(" was");
        $kw139$SILENT = SubLObjectFactory.makeKeyword("SILENT");
        $str140$___A__ = SubLObjectFactory.makeString("~&~A~%");
        $str141$___s_constant_A__A__ = SubLObjectFactory.makeString("  ~s constant~A ~A~%");
        $str142$created = SubLObjectFactory.makeString("created");
        $str143$destroyed = SubLObjectFactory.makeString("destroyed");
        $str144$___s_nart_A__A__ = SubLObjectFactory.makeString("  ~s nart~A ~A~%");
        $str145$___s_assertion_A__A__ = SubLObjectFactory.makeString("  ~s assertion~A ~A~%");
        $str146$___s_kb_hl_support_A__A__ = SubLObjectFactory.makeString("  ~s kb-hl-support~A ~A~%");
        $str147$___s_deduction_A__A__ = SubLObjectFactory.makeString("  ~s deduction~A ~A~%");
        $sym148$LOAD_TRANSCRIPT_FILE_TO_SUBMIT = SubLObjectFactory.makeSymbol("LOAD-TRANSCRIPT-FILE-TO-SUBMIT");
        $int149$10000 = SubLObjectFactory.makeInteger(10000);
        $str150$Loading_ = SubLObjectFactory.makeString("Loading ");
        $str151$_to_send_____ = SubLObjectFactory.makeString(" to send ....");
        $str152$__Server_Summary____A = SubLObjectFactory.makeString("~%Server Summary:  ~A");
        $str153$___Machine___A = SubLObjectFactory.makeString("   Machine: ~A");
        $str154$__A = SubLObjectFactory.makeString(":~A");
        $str155$__Cyclist___A = SubLObjectFactory.makeString("~%Cyclist: ~A");
        $str156$___KB___A = SubLObjectFactory.makeString("   KB: ~A");
        $str157$___System___A = SubLObjectFactory.makeString("   System: ~A");
        $str158$___A_ = SubLObjectFactory.makeString(" (~A)");
        $str159$__Comm___A = SubLObjectFactory.makeString("~%Comm: ~A");
        $str160$___Agenda___A = SubLObjectFactory.makeString("   Agenda: ~A");
        $str161$__Queues_ = SubLObjectFactory.makeString("~%Queues:");
        $str162$___Aux__ = SubLObjectFactory.makeString("   Aux: ");
        $str163$__d__d_ = SubLObjectFactory.makeString("(~d ~d)");
        $str164$__d_ = SubLObjectFactory.makeString("(~d)");
        $str165$___Remote__ = SubLObjectFactory.makeString("   Remote: ");
        $str166$___Local__ = SubLObjectFactory.makeString("   Local: ");
        $str167$__d__d__d_ = SubLObjectFactory.makeString("(~d ~d ~d)");
        $list168 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AGENDA-TIMEOUT"), (SubLObject)operation_communication.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISABLE-TCP-SERVERS?"), (SubLObject)operation_communication.T)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AGENDA-TIMEOUT"), (SubLObject)SubLObjectFactory.makeKeyword("DISABLE-TCP-SERVERS?"));
        $kw170$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw171$AGENDA_TIMEOUT = SubLObjectFactory.makeKeyword("AGENDA-TIMEOUT");
        $kw172$DISABLE_TCP_SERVERS_ = SubLObjectFactory.makeKeyword("DISABLE-TCP-SERVERS?");
        $sym173$AGENDA_RUNNING_ = SubLObjectFactory.makeUninternedSymbol("AGENDA-RUNNING?");
        $sym174$SAVED_LOCAL_TRANSCRIPT = SubLObjectFactory.makeUninternedSymbol("SAVED-LOCAL-TRANSCRIPT");
        $sym175$SAVED_READ_TRANSCRIPT = SubLObjectFactory.makeUninternedSymbol("SAVED-READ-TRANSCRIPT");
        $sym176$SAVED_COMMUNICATION_MODE = SubLObjectFactory.makeUninternedSymbol("SAVED-COMMUNICATION-MODE");
        $sym177$SAVED_REMOTE_QUEUE = SubLObjectFactory.makeUninternedSymbol("SAVED-REMOTE-QUEUE");
        $sym178$SAVED_LOCAL_QUEUE = SubLObjectFactory.makeUninternedSymbol("SAVED-LOCAL-QUEUE");
        $sym179$SAVED_AUXILIARY_QUEUE = SubLObjectFactory.makeUninternedSymbol("SAVED-AUXILIARY-QUEUE");
        $sym180$SAVED_TRANSCRIPT_QUEUE = SubLObjectFactory.makeUninternedSymbol("SAVED-TRANSCRIPT-QUEUE");
        $sym181$DISABLED_SERVERS = SubLObjectFactory.makeUninternedSymbol("DISABLED-SERVERS");
        $sym182$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list183 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCAL-QUEUE-EMPTY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTING-ACTIVITY"), (SubLObject)SubLObjectFactory.makeString("Running pending local operations"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCAL-QUEUE-EMPTY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-ONE-LOCAL-OP")))));
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAVE-TRANSCRIPT-OPS"));
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAVE-RECENT-EXPERIENCE"));
        $list186 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAVE-RECENT-ASKED-QUERIES"));
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLUSH-HL-TRANSCRIPT-TRACE"));
        $sym188$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list189 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AGENDA-RUNNING")));
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*LOCAL-TRANSCRIPT*"));
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*READ-TRANSCRIPT*"));
        $list192 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*COMMUNICATION-MODE*"));
        $list193 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-COPY"), (SubLObject)SubLObjectFactory.makeSymbol("*REMOTE-QUEUE*")));
        $list194 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-COPY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCAL-QUEUE"))));
        $list195 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-COPY"), (SubLObject)SubLObjectFactory.makeSymbol("*AUXILIARY-QUEUE*")));
        $list196 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-COPY"), (SubLObject)SubLObjectFactory.makeSymbol("*TRANSCRIPT-QUEUE*")));
        $list197 = ConsesLow.list((SubLObject)operation_communication.NIL);
        $sym198$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym199$NOTING_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PROGRESS");
        $str200$Setting_up_safe_KB_dump_environme = SubLObjectFactory.makeString("Setting up safe KB dump environment");
        $list201 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("ALLEGRO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ROOM")));
        $sym202$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym203$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list204 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISABLE-SOME-TCP-SERVERS")));
        $sym205$ENSURE_AGENDA_HALTED = SubLObjectFactory.makeSymbol("ENSURE-AGENDA-HALTED");
        $sym206$CAND = SubLObjectFactory.makeSymbol("CAND");
        $list207 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Agenda was not successfully halted!")));
        $list208 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*MASTER-TRANSCRIPT*"), (SubLObject)operation_communication.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*LOCAL-TRANSCRIPT*"), (SubLObject)operation_communication.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-READ-TRANSCRIPT"), (SubLObject)operation_communication.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*COMMUNICATION-MODE*"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-REMOTE-QUEUE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-LOCAL-QUEUE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-AUXILIARY-QUEUE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-TRANSCRIPT-QUEUE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SWAP-OUT-ALL-PRISTINE-KB-OBJECTS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLUSH-ALL-LOGS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("ALLEGRO"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ROOM"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-STATISTICS")) });
        $str209$Restoring_pre_dump_environment = SubLObjectFactory.makeString("Restoring pre-dump environment");
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MASTER-TRANSCRIPT"));
        $sym211$_LOCAL_TRANSCRIPT_ = SubLObjectFactory.makeSymbol("*LOCAL-TRANSCRIPT*");
        $sym212$SET_READ_TRANSCRIPT = SubLObjectFactory.makeSymbol("SET-READ-TRANSCRIPT");
        $sym213$SET_COMMUNICATION_MODE = SubLObjectFactory.makeSymbol("SET-COMMUNICATION-MODE");
        $sym214$_REMOTE_QUEUE_ = SubLObjectFactory.makeSymbol("*REMOTE-QUEUE*");
        $sym215$SET_LOCAL_QUEUE = SubLObjectFactory.makeSymbol("SET-LOCAL-QUEUE");
        $sym216$_AUXILIARY_QUEUE_ = SubLObjectFactory.makeSymbol("*AUXILIARY-QUEUE*");
        $sym217$_TRANSCRIPT_QUEUE_ = SubLObjectFactory.makeSymbol("*TRANSCRIPT-QUEUE*");
        $list218 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-AGENDA")));
        $sym219$RE_ENABLE_DISABLED_TCP_SERVERS = SubLObjectFactory.makeSymbol("RE-ENABLE-DISABLED-TCP-SERVERS");
        $list220 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AGENDA-TIMEOUT"), (SubLObject)operation_communication.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISABLE-TCP-SERVERS?"), (SubLObject)operation_communication.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym221$WITH_SAFE_KB_DUMP_ENVIRONMENT = SubLObjectFactory.makeSymbol("WITH-SAFE-KB-DUMP-ENVIRONMENT");
        $str222$Agenda_was_not_successfully_halte = SubLObjectFactory.makeString("Agenda was not successfully halted!");
        $int223$25 = SubLObjectFactory.makeInteger(25);
        $str224$Minor_version__S_is_not_in_the_ra = SubLObjectFactory.makeString("Minor-version ~S is not in the range 0 - 25.");
        $str225$ABCDEFGHIJKLMNOPQRSTUVWXYZ = SubLObjectFactory.makeString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        $list226 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("PATCH-NUMBERS"));
        $sym227$TO_STRING = SubLObjectFactory.makeSymbol("TO-STRING");
        $str228$p = SubLObjectFactory.makeString("p");
        $str229$cyc_s_D_A__C = SubLObjectFactory.makeString("cyc-s~D~A-~C");
        $str230$cyc_s_D_A_kb_A__C = SubLObjectFactory.makeString("cyc-s~D~A-kb~A-~C");
        $str231$cyc_s_D_A_kb_A_op__A__C = SubLObjectFactory.makeString("cyc-s~D~A-kb~A-op-~A-~C");
        $str232$world = SubLObjectFactory.makeString("world");
        $sym233$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str234$Directory__S_is_not_writeable = SubLObjectFactory.makeString("Directory ~S is not writeable");
        $int235$26 = SubLObjectFactory.makeInteger(26);
        $str236$done = SubLObjectFactory.makeString("done");
        $str237$Halting_Cyc_image____A = SubLObjectFactory.makeString("Halting Cyc image : ~A");
        $str238$QUIT = SubLObjectFactory.makeString("QUIT");
        $sym239$_REMOTE_OPERATIONS_KB_CHECK_POINT_ = SubLObjectFactory.makeSymbol("*REMOTE-OPERATIONS-KB-CHECK-POINT*");
        $sym240$NOTE_KB_CHECK_POINT_REACHED = SubLObjectFactory.makeSymbol("NOTE-KB-CHECK-POINT-REACHED");
        $sym241$WITH_ASSERTION_MANAGER_FULLY_LOADED = SubLObjectFactory.makeSymbol("WITH-ASSERTION-MANAGER-FULLY-LOADED");
        $sym242$WITH_DEDUCTION_MANAGER_FULLY_LOADED = SubLObjectFactory.makeSymbol("WITH-DEDUCTION-MANAGER-FULLY-LOADED");
        $sym243$WITH_KB_HL_SUPPORT_CONTENT_INDEX_FULLY_LOADED = SubLObjectFactory.makeSymbol("WITH-KB-HL-SUPPORT-CONTENT-INDEX-FULLY-LOADED");
        $sym244$WITH_NART_INDEX_FULLY_LOADED = SubLObjectFactory.makeSymbol("WITH-NART-INDEX-FULLY-LOADED");
        $sym245$WITH_CONSTANT_INDEX_FULLY_LOADED = SubLObjectFactory.makeSymbol("WITH-CONSTANT-INDEX-FULLY-LOADED");
        $list246 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SAVE-ASKED-QUERIES?*"), (SubLObject)operation_communication.NIL));
        $str247$Timeout_of__A_secs_arrived__witho = SubLObjectFactory.makeString("Timeout of ~A secs arrived, without agenda stopping work.");
        $int248$60 = SubLObjectFactory.makeInteger(60);
        $kw249$ESSENTIAL = SubLObjectFactory.makeKeyword("ESSENTIAL");
        $str250$Create_directory_and_continue_ = SubLObjectFactory.makeString("Create directory and continue.");
        $str251$Directory__S_does_not_exist_ = SubLObjectFactory.makeString("Directory ~S does not exist.");
        $str252$Still_cannot_write_to_dump_direct = SubLObjectFactory.makeString("Still cannot write to dump directory ~A.");
        $kw253$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw254$STANDARD = SubLObjectFactory.makeKeyword("STANDARD");
        $str255$Unknown_dump_style__A_not_impleme = SubLObjectFactory.makeString("Unknown dump style ~A not implemented.~%");
        $int256$2048 = SubLObjectFactory.makeInteger(2048);
        $int257$256 = SubLObjectFactory.makeInteger(256);
        $str258$_fastscratch_tmp_ = SubLObjectFactory.makeString("/fastscratch/tmp/");
        $str259$Dump_incremental_KB_trivially_fin = SubLObjectFactory.makeString("Dump incremental KB trivially finished: dump directory and current units are both ~S");
        $str260$__Successfully_dumped_incremental = SubLObjectFactory.makeString("~&Successfully dumped incremental units to: ~A~%");
        $str261$op = SubLObjectFactory.makeString("op");
        $str262$Loading_transformation_rule_stati = SubLObjectFactory.makeString("Loading transformation rule statistics into incremental KB");
        $str263$incremental_stats = SubLObjectFactory.makeString("incremental-stats");
        $str264$received_experience = SubLObjectFactory.makeString("received-experience");
        $kw265$TOTAL_REMOTE_OPERATIONS_RUN = SubLObjectFactory.makeKeyword("TOTAL-REMOTE-OPERATIONS-RUN");
        $kw266$READ_MASTER_TRANSCRIPT_OP_NUMBER = SubLObjectFactory.makeKeyword("READ-MASTER-TRANSCRIPT-OP-NUMBER");
        $list267 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-REMOTE-OPERATIONS-RUN"), (SubLObject)SubLObjectFactory.makeSymbol("READ-MASTER-TRANSCRIPT-OP-NUMBER"));
        $list268 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TOTAL-REMOTE-OPERATIONS-RUN"), (SubLObject)SubLObjectFactory.makeKeyword("READ-MASTER-TRANSCRIPT-OP-NUMBER"));
        $kw269$DONE = SubLObjectFactory.makeKeyword("DONE");
    }
}

/*

	Total time: 1574 ms
	 synthetic 
*/