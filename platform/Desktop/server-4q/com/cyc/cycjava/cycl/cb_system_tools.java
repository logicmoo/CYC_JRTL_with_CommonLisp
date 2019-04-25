package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_system_tools extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_system_tools";
    public static final String myFingerPrint = "fadab3ca953b2a254f534e9f04ee98f6d8e5bd1fbae08d1d11589e57a81a139f";
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 770L)
    public static SubLSymbol $cyc_system_doc_comm_mode_index$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 9214L)
    private static SubLSymbol $cb_mode_checkpoint_collection$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 9669L)
    public static SubLSymbol $oe_patch_messages_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 12130L)
    public static SubLSymbol $default_oe_patch_message_recipient$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 12323L)
    public static SubLSymbol $oe_patch_message_smtp_host$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 23214L)
    public static SubLSymbol $cyc_system_doc_agenda_index$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 63168L)
    public static SubLSymbol $image_purpose$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70256L)
    private static SubLSymbol $cb_notify_users_generate_exclusion_mark_from_user_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 78461L)
    private static SubLSymbol $cb_address_titles$;
    private static final SubLString $str0$_Aref_system_html;
    private static final SubLString $str1$com_modes;
    private static final SubLSymbol $kw2$CB_MODE;
    private static final SubLString $str3$cb_mode_html;
    private static final SubLString $str4$Cyc_communication_status_changing;
    private static final SubLString $str5$Communication_Status_Area;
    private static final SubLString $str6$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str7$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw8$UNINITIALIZED;
    private static final SubLSymbol $kw9$CB_CYC;
    private static final SubLSymbol $kw10$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw11$SHA1;
    private static final SubLString $str12$yui_skin_sam;
    private static final SubLString $str13$reloadFrameButton;
    private static final SubLString $str14$button;
    private static final SubLString $str15$reload;
    private static final SubLString $str16$Refresh_Frames;
    private static final SubLString $str17$message;
    private static final SubLSymbol $kw18$RED;
    private static final SubLString $str19$post;
    private static final SubLString $str20$cb_mode_handler;
    private static final SubLString $str21$Current_Value;
    private static final SubLString $str22$Submit;
    private static final SubLString $str23$You_can_not_change_your_transmitt;
    private static final SubLString $str24$your_local_transcript_by_either_s;
    private static final SubLSymbol $sym25$CB_MODE;
    private static final SubLSymbol $kw26$HTML_HANDLER;
    private static final SubLString $str27$What_Do_You_Want_To_Do_With_Proce;
    private static final SubLSymbol $kw28$CENTER;
    private static final SubLString $str29$transmit_mode;
    private static final SubLString $str30$transmit;
    private static final SubLSymbol $kw31$LEFT;
    private static final SubLSymbol $kw32$TOP;
    private static final SubLString $str33$Send_Immediately_To_Everybody;
    private static final SubLString $str34$transmit_and_store;
    private static final SubLString $str35$____and_Record_Locally;
    private static final SubLString $str36$to_;
    private static final SubLSymbol $kw37$WRITE_TRANS;
    private static final SubLString $str38$transmit_and_store_rolled;
    private static final SubLString $str39$____and_Record_Locally_to_a_New_T;
    private static final SubLString $str40$store;
    private static final SubLString $str41$Store_For_Later;
    private static final SubLString $str42$none;
    private static final SubLString $str43$Do_Not_Record;
    private static final SubLString $str44$Send_KB_Check_Point_for__;
    private static final SubLString $str45$kb_checkpoint_to_send;
    private static final SubLString $str46$Currently__you_are_not_allowed_to;
    private static final SubLString $str47$Try_receiving_operations_if_you_w;
    private static final SubLString $str48$You_have_;
    private static final SubLSymbol $kw49$MAIN;
    private static final SubLString $str50$cb_system_ready_transcript_file_w;
    private static final SubLString $str51$_operations;
    private static final SubLString $str52$_stored_;
    private static final SubLString $str53$send;
    private static final SubLString $str54$Send_Stored_Operations_Now;
    private static final SubLString $str55$clear;
    private static final SubLString $str56$Clear_Stored_Operations;
    private static final SubLString $str57$Note_;
    private static final SubLString $str58$_All_of_the_above_options_will_st;
    private static final SubLString $str59$You_still_have_;
    private static final SubLString $str60$_unprocessed_operations_on_your_l;
    private static final SubLString $str61$Do_You_Want_To_Receive_Operations;
    private static final SubLSymbol $kw62$RIGHT;
    private static final SubLString $str63$receive_mode;
    private static final SubLString $str64$no;
    private static final SubLString $str65$No;
    private static final SubLString $str66$yes;
    private static final SubLString $str67$Yes;
    private static final SubLString $str68$kb_checkpoint_;
    private static final SubLString $str69$Receive_only_up_to_KB_Check_Point;
    private static final SubLString $str70$kb_checkpoint;
    private static final SubLSymbol $kw71$USE_CURRENT_CHECK_POINT;
    private static final SubLSymbol $sym72$_CB_MODE_CHECKPOINT_COLLECTION_;
    private static final SubLObject $const73$Cyc_BasedProject;
    private static final SubLSymbol $sym74$_OE_PATCH_MESSAGES_ENABLED__;
    private static final SubLString $str75$filters_;
    private static final SubLString $str76$SENT;
    private static final SubLSymbol $sym77$CB_MODE_HANDLER;
    private static final SubLString $str78$cb_mode;
    private static final SubLString $str79$Comm_;
    private static final SubLSymbol $kw80$MODE;
    private static final SubLSymbol $sym81$CB_LINK_MODE;
    private static final SubLSymbol $sym82$_DEFAULT_OE_PATCH_MESSAGE_RECIPIENT_;
    private static final SubLString $str83$;
    private static final SubLSymbol $sym84$_OE_PATCH_MESSAGE_SMTP_HOST_;
    private static final SubLSymbol $kw85$DISPLAY_OE_PATCH_MESSAGE;
    private static final SubLString $str86$display_oe_patch_message_html;
    private static final SubLString $str87$notes;
    private static final SubLString $str88$builder;
    private static final SubLString $str89$OE_Patch_Message;
    private static final SubLString $str90$cb_handle_oe_patch_message;
    private static final SubLString $str91$window_open__;
    private static final SubLString $str92$__;
    private static final SubLString $str93$__A_;
    private static final SubLString $str94$null;
    private static final SubLString $str95$___A____;
    private static final SubLString $str96$return_false_;
    private static final SubLString $str97$Enter_a_short_description_to_go_i;
    private static final SubLString $str98$To__;
    private static final SubLString $str99$to;
    private static final SubLInteger $int100$80;
    private static final SubLString $str101$Short_Description__;
    private static final SubLString $str102$subj;
    private static final SubLString $str103$Patch_Message__;
    private static final SubLInteger $int104$100;
    private static final SubLString $str105$virtual;
    private static final SubLString $str106$send_message_;
    private static final SubLString $str107$Transmit_and_Send_Patch_Message;
    private static final SubLString $str108$_;
    private static final SubLString $str109$Transmit_without_Patch_Message;
    private static final SubLString $str110$OE_Patch__kb_;
    private static final SubLString $str111$___;
    private static final SubLInteger $int112$1000;
    private static final SubLList $list113;
    private static final SubLString $str114$_A;
    private static final SubLString $str115$Submitted;
    private static final SubLString $str116$Transmitted;
    private static final SubLString $str117$_from_KB___A____;
    private static final SubLString $str118$Patch_Description_____;
    private static final SubLString $str119$_S__;
    private static final SubLString $str120$__Transcript___A__;
    private static final SubLString $str121$Total_Operations___A__;
    private static final SubLString $str122$__Killed_Constants____;
    private static final SubLList $list123;
    private static final SubLString $str124$_A__;
    private static final SubLString $str125$_and__A_more___;
    private static final SubLString $str126$__Renames____;
    private static final SubLList $list127;
    private static final SubLString $str128$_A_____A__;
    private static final SubLString $str129$__New_Constants____;
    private static final SubLSymbol $sym130$CB_HANDLE_OE_PATCH_MESSAGE;
    private static final SubLString $str131$Mail_not_sent_due_to_invalid_from;
    private static final SubLString $str132$__or_to__;
    private static final SubLString $str133$__address;
    private static final SubLString $str134$sent;
    private static final SubLString $str135$submitted;
    private static final SubLString $str136$Transcript_;
    private static final SubLString $str137$__but_no_mail_sent_;
    private static final SubLString $str138$__but_mail_message_encountered_er;
    private static final SubLInteger $int139$5000;
    private static final SubLString $str140$_________________________;
    private static final SubLString $str141$Transcript_as_KE_Text___;
    private static final SubLString $str142$___and__A_more_operations___;
    private static final SubLString $str143$_Roll_to_KB_;
    private static final SubLString $str144$_;
    private static final SubLSymbol $kw145$SELF;
    private static final SubLString $str146$cb_roll_current_kb;
    private static final SubLSymbol $kw147$ROLL_CURRENT_KB;
    private static final SubLSymbol $sym148$CB_LINK_ROLL_CURRENT_KB;
    private static final SubLSymbol $kw149$CB_REMOTE_FILTERS;
    private static final SubLString $str150$cb_remote_filters_html;
    private static final SubLString $str151$Rolling_the_KB;
    private static final SubLString $str152$Roll_to_KB_;
    private static final SubLString $str153$cb_handle_roll_current_kb;
    private static final SubLString $str154$WARNING_;
    private static final SubLString $str155$Rolling_the_KB_is_will_filter_eve;
    private static final SubLString $str156$Do_you_still_want_to_roll_to_KB__;
    private static final SubLSymbol $sym157$CB_ROLL_CURRENT_KB;
    private static final SubLSymbol $sym158$CB_HANDLE_ROLL_CURRENT_KB;
    private static final SubLString $str159$cyc_agenda;
    private static final SubLString $str160$Agenda_halted_due_to_;
    private static final SubLInteger $int161$32768;
    private static final SubLSymbol $kw162$CB_AGENDA;
    private static final SubLString $str163$cb_agenda_html;
    private static final SubLString $str164$The_Cyc_Agenda_Control_Facilities;
    private static final SubLString $str165$Agenda_Process_Control;
    private static final SubLString $str166$cb_abort_agenda;
    private static final SubLString $str167$Here_you_control_the_turning_on_a;
    private static final SubLString $str168$Currently__your_Agenda_is_;
    private static final SubLString $str169$running;
    private static final SubLString $str170$halted;
    private static final SubLString $str171$_;
    private static final SubLSymbol $kw172$HALT;
    private static final SubLString $str173$Run;
    private static final SubLString $str174$Current;
    private static final SubLString $str175$Last;
    private static final SubLString $str176$_Agenda_operation_;
    private static final SubLString $str177$Abort_Operation;
    private static final SubLSymbol $kw178$AGENDA;
    private static final SubLString $str179$_Refresh_;
    private static final SubLString $str180$50_;
    private static final SubLString $str181$Propagating_Assertion_;
    private static final SubLString $str182$_A_direct_;
    private static final SubLString $str183$and__A_indirect_;
    private static final SubLSymbol $kw184$ASSERTION_DEPENDENCIES;
    private static final SubLString $str185$dependencies;
    private static final SubLSymbol $sym186$CB_AGENDA;
    private static final SubLString $str187$Agenda_;
    private static final SubLString $str188$cb_agenda;
    private static final SubLSymbol $sym189$CB_LINK_AGENDA;
    private static final SubLString $str190$The_agenda_is_no_longer_running_;
    private static final SubLSymbol $sym191$CB_ABORT_AGENDA;
    private static final SubLString $str192$cb_toggle_agenda_status;
    private static final SubLString $str193$Click_the_button_to_change_your_A;
    private static final SubLString $str194$Halt_Agenda;
    private static final SubLString $str195$Start_Agenda;
    private static final SubLString $str196$__For_detailed_help_on_the_Cyc_ag;
    private static final SubLString $str197$_A__A;
    private static final SubLString $str198$Cyc_Agenda_Documentation;
    private static final SubLString $str199$Agenda_Process_Changed;
    private static final SubLString $str200$Halting_the_Agenda____;
    private static final SubLString $str201$Starting_the_Agenda____;
    private static final SubLString $str202$Your_Cyc_Agenda_is_now_;
    private static final SubLString $str203$Your_Cyc_Agenda_is_still_;
    private static final SubLString $str204$When_it_finishes_its_current_oper;
    private static final SubLString $str205$Agenda;
    private static final SubLSymbol $sym206$CB_TOGGLE_AGENDA_STATUS;
    private static final SubLString $str207$cb_agenda_error_mode_handler;
    private static final SubLString $str208$Currently__when_Cyc_encounters_an;
    private static final SubLSymbol $kw209$IGNORE;
    private static final SubLString $str210$Continues__ignoring_the_error_;
    private static final SubLString $str211$Halts_the_Agenda_and_displays_the;
    private static final SubLSymbol $kw212$DEBUG;
    private static final SubLString $str213$Enters_the_debugger_;
    private static final SubLSymbol $kw214$LOG;
    private static final SubLString $str215$Logs_the_error_and_continues_;
    private static final SubLSymbol $kw216$AGENDA_ERROR_FILE;
    private static final SubLString $str217$Illegal_state_in_cb_agenda_error_;
    private static final SubLString $str218$Choose_the_new_error_handling_mod;
    private static final SubLString $str219$Submit_New_Mode;
    private static final SubLString $str220$__to_initiate_the_change_;
    private static final SubLString $str221$agenda_error_state;
    private static final SubLString $str222$_ignore;
    private static final SubLString $str223$Ignore_and_Continue;
    private static final SubLString $str224$_halt;
    private static final SubLString $str225$Halt_and_Display_Reason;
    private static final SubLString $str226$_log;
    private static final SubLString $str227$Log_Errors_to_File;
    private static final SubLString $str228$pathname;
    private static final SubLInteger $int229$60;
    private static final SubLString $str230$Current_Mode;
    private static final SubLSymbol $sym231$CB_AGENDA_ERROR_MODE_HANDLER;
    private static final SubLString $str232$_operations_waiting_in_your_local;
    private static final SubLSymbol $kw233$SHOW_LOCAL_OPS;
    private static final SubLString $str234$Look_at_the_operations_in_the_loc;
    private static final SubLSymbol $kw235$DELETE_LOCAL_OPS;
    private static final SubLString $str236$Delete_the_local_queue_;
    private static final SubLSymbol $kw237$DELETE_LOCAL_AND_RESTART;
    private static final SubLString $str238$Delete_the_local_queue_and_restar;
    private static final SubLString $str239$cb_agenda_error_file_viewer;
    private static final SubLString $str240$Agenda_Error_File___A;
    private static final SubLSymbol $sym241$CB_LINK_AGENDA_ERROR_FILE;
    private static final SubLString $str242$Agenda_log_file_empty___S;
    private static final SubLSymbol $sym243$CB_AGENDA_ERROR_FILE_VIEWER;
    private static final SubLString $str244$cb_system;
    private static final SubLSymbol $kw245$SYSTEM1;
    private static final SubLSymbol $sym246$CB_LINK_SYSTEM1;
    private static final SubLString $str247$System_;
    private static final SubLSymbol $kw248$SYSTEM;
    private static final SubLSymbol $sym249$CB_LINK_SYSTEM;
    private static final SubLSymbol $kw250$CB_SYSTEM;
    private static final SubLString $str251$cb_system_html;
    private static final SubLString $str252$Cyc_System_Area;
    private static final SubLString $str253$System_Area;
    private static final SubLString $str254$Here_are_your_system_settings_;
    private static final SubLSymbol $kw255$CONFIRM_HALT_CYC;
    private static final SubLString $str256$_Halt_this_image_;
    private static final SubLSymbol $kw257$PROCESS_INSPECTOR;
    private static final SubLString $str258$_Process_Inspector_;
    private static final SubLSymbol $sym259$CB_SYSTEM;
    private static final SubLString $str260$cb_write_image_handler;
    private static final SubLString $str261$Write_image_to_file__;
    private static final SubLString $str262$File_name__;
    private static final SubLString $str263$file;
    private static final SubLInteger $int264$40;
    private static final SubLString $str265$Write_image;
    private static final SubLString $str266$_Warning__this_may_take_some_time;
    private static final SubLString $str267$Write_Image;
    private static final SubLString $str268$Please_enter_a_filename_;
    private static final SubLString $str269$Writing_to_file__;
    private static final SubLString $str270$__;
    private static final SubLString $str271$__Done_;
    private static final SubLSymbol $sym272$CB_WRITE_IMAGE_HANDLER;
    private static final SubLString $str273$Machine_name__;
    private static final SubLString $str274$unknown;
    private static final SubLString $str275$SubL_implementation__;
    private static final SubLString $str276$Base_TCP_port__;
    private static final SubLString $str277$Image_name__;
    private static final SubLString $str278$Image_Process_ID__;
    private static final SubLString $str279$Image_start_time_;
    private static final SubLString $str280$__up__A_;
    private static final SubLString $str281$Cyc_revision_level__;
    private static final SubLString $str282$Cyc_code_version__;
    private static final SubLString $str283$Current_KB__;
    private static final SubLString $str284$Queue_Information__;
    private static final SubLString $str285$Master_Transcript_Operations_Read;
    private static final SubLString $str286$Master_Transcript_Operations_Read;
    private static final SubLString $str287$Master_Transcript_Operations_Proc;
    private static final SubLString $str288$Master_Transcript_Operations_Proc;
    private static final SubLString $str289$Master_Transcript_Operations_Proc;
    private static final SubLString $str290$Unprocessed_Local_Queue_Operation;
    private static final SubLString $str291$Local_Queue_Operations_Processed_;
    private static final SubLString $str292$Current_Local_Transcript_Operatio;
    private static final SubLString $str293$Unprocessed_auxiliary_queue_opera;
    private static final SubLString $str294$Transcript_Information_;
    private static final SubLString $str295$Master_Transcript___;
    private static final SubLString $str296$Maintained_By_Transcript_Server;
    private static final SubLString $str297$___A__A_;
    private static final SubLString $str298$Operations___;
    private static final SubLSymbol $kw299$READ_TRANS;
    private static final SubLString $str300$None;
    private static final SubLString $str301$Characters___;
    private static final SubLString $str302$Estimated_Ops___;
    private static final SubLString $str303$Local_Transcript___;
    private static final SubLString $str304$Historical_Information_;
    private static final SubLString $str305$Remote_Operations_Processed__;
    private static final SubLString $str306$Local_Operations_Recorded___;
    private static final SubLString $str307$Local_Operations_Sent_To_Master_T;
    private static final SubLString $str308$Auxiliary_Queue_Operations_Proces;
    private static final SubLString $str309$read;
    private static final SubLSymbol $sym310$STRING_EQUAL;
    private static final SubLString $str311$cb_system_ready_transcript_file_r;
    private static final SubLSymbol $sym312$CB_LINK_READ_TRANS;
    private static final SubLString $str313$write;
    private static final SubLSymbol $sym314$CB_LINK_WRITE_TRANS;
    private static final SubLString $str315$cb_system_ready_transcript_file__;
    private static final SubLSymbol $kw316$VIEW_TRANSCRIPT;
    private static final SubLSymbol $sym317$CB_LINK_VIEW_TRANSCRIPT;
    private static final SubLString $str318$cb_transcript_viewer_handler_;
    private static final SubLString $str319$stats_;
    private static final SubLString $str320$_Stats_;
    private static final SubLSymbol $sym321$STRING_;
    private static final SubLSymbol $sym322$CB_SYSTEM_READY_TRANSCRIPT_FILE;
    private static final SubLSymbol $kw323$INPUT;
    private static final SubLString $str324$Unable_to_open__S;
    private static final SubLSymbol $kw325$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE;
    private static final SubLString $str326$cb_system_show_specific_transcrip;
    private static final SubLString $str327$File_Contents__Transcript_File;
    private static final SubLString $str328$cg_cb_system_show_specific_transc;
    private static final SubLString $str329$View_Transcript_in_KE_Text_format;
    private static final SubLString $str330$File__;
    private static final SubLString $str331$Operations__;
    private static final SubLString $str332$No_operations_have_been_saved_yet;
    private static final SubLString $str333$_s_is_not_a_pathname_string_;
    private static final SubLSymbol $kw334$CB_CHOOSE_PROJECT;
    private static final SubLString $str335$cb_choose_project_html;
    private static final SubLString $str336$Choose_KE_Project;
    private static final SubLString $str337$cb_choose_project_handler;
    private static final SubLString $str338$Choose_your_project_from_the_opti;
    private static final SubLString $str339$project;
    private static final SubLString $str340$No_Project_Selected;
    private static final SubLString $str341$Reset;
    private static final SubLSymbol $sym342$CB_CHOOSE_PROJECT;
    private static final SubLObject $const343$EverythingPSC;
    private static final SubLObject $const344$OngoingStatus;
    private static final SubLString $str345$nil;
    private static final SubLString $str346$Project_has_been_changed_;
    private static final SubLSymbol $sym347$CB_CHOOSE_PROJECT_HANDLER;
    private static final SubLString $str348$Current_Project;
    private static final SubLString $str349$cb_choose_project;
    private static final SubLSymbol $kw350$CHOOSE_PROJECT;
    private static final SubLSymbol $sym351$CB_LINK_CHOOSE_PROJECT;
    private static final SubLObject $const352$CycBrowser;
    private static final SubLSymbol $sym353$_PROJECT;
    private static final SubLObject $const354$cyclistPrimaryProject;
    private static final SubLList $list355;
    private static final SubLList $list356;
    private static final SubLSymbol $kw357$CB_LOGIN;
    private static final SubLString $str358$cb_login_html;
    private static final SubLString $str359$new_login_name;
    private static final SubLString $str360$Login_Area;
    private static final SubLString $str361$cb_login_handler;
    private static final SubLString $str362$This_image_has_been_designated__;
    private static final SubLString $str363$You_are_currently_logged_in_as_;
    private static final SubLString $str364$Click_;
    private static final SubLSymbol $kw365$LOGOUT;
    private static final SubLString $str366$here;
    private static final SubLString $str367$_to_logout_now_;
    private static final SubLString $str368$Type_in_your_new_login_name_below;
    private static final SubLString $str369$__button_;
    private static final SubLString $str370$new_login_hashed_password;
    private static final SubLString $str371$Cyclist;
    private static final SubLString $str372$Password;
    private static final SubLString $str373$___;
    private static final SubLString $str374$The_following_are_currently_logge;
    private static final SubLString $str375$_;
    private static final SubLString $str376$User;
    private static final SubLString $str377$Local_Machine;
    private static final SubLList $list378;
    private static final SubLString $str379$_Session_id__;
    private static final SubLSymbol $kw380$FORCE_LOGOUT;
    private static final SubLString $str381$_Force_Logout_;
    private static final SubLString $str382$_;
    private static final SubLSymbol $kw383$LARR;
    private static final SubLString $str384$_you;
    private static final SubLSymbol $kw385$NOTIFY_ALL_USERS;
    private static final SubLSymbol $sym386$CB_LOGIN;
    private static final SubLString $str387$sessionId;
    private static final SubLSymbol $kw388$SUCCESS;
    private static final SubLSymbol $kw389$FAILURE;
    private static final SubLSymbol $sym390$CB_FORCE_LOGOUT;
    private static final SubLString $str391$_a_sessionId__a;
    private static final SubLString $str392$cb_force_logout;
    private static final SubLSymbol $sym393$CB_LINK_FORCE_LOGOUT;
    private static final SubLString $str394$Complete;
    private static final SubLObject $const395$HumanCyclist;
    private static final SubLInteger $int396$27;
    private static final SubLString $str397$Clear;
    private static final SubLString $str398$cb_notify_all_users;
    private static final SubLString $str399$Send_Email_to_all_Users;
    private static final SubLSymbol $sym400$CB_LINK_NOTIFY_ALL_USERS;
    private static final SubLString $str401$Mail_all_users;
    private static final SubLString $str402$Please_enter_the_message_you_wish;
    private static final SubLString $str403$cb_send_email_to_selected_users;
    private static final SubLList $list404;
    private static final SubLObject $const405$Guest;
    private static final SubLString $str406$To_;
    private static final SubLSymbol $sym407$SECOND;
    private static final SubLString $str408$From__;
    private static final SubLString $str409$Subject__;
    private static final SubLString $str410$subject;
    private static final SubLInteger $int411$72;
    private static final SubLString $str412$Message__;
    private static final SubLString $str413$Send_Email;
    private static final SubLSymbol $sym414$CB_NOTIFY_ALL_USERS;
    private static final SubLString $str415$exclude;
    private static final SubLString $str416$Email_Address;
    private static final SubLString $str417$Exclude_;
    private static final SubLSymbol $sym418$CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER;
    private static final SubLString $str419$exclude_;
    private static final SubLSymbol $sym420$_CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER_CACHING_STATE_;
    private static final SubLSymbol $kw421$ADDRESS;
    private static final SubLObject $const422$preferredEMailAddressText;
    private static final SubLList $list423;
    private static final SubLObject $const424$CyclistsMt;
    private static final SubLString $str425$Sending_Message;
    private static final SubLString $str426$Sending_message_with_following_co;
    private static final SubLString $str427$Subject;
    private static final SubLString $str428$Message_;
    private static final SubLString $str429$Sending_Log;
    private static final SubLList $list430;
    private static final SubLString $str431$Excluding_user_;
    private static final SubLString $str432$Sent_message_to_;
    private static final SubLString $str433$Error_on_sending_message_to_;
    private static final SubLSymbol $sym434$CB_SEND_EMAIL_TO_SELECTED_USERS;
    private static final SubLString $str435$Login_;
    private static final SubLString $str436$cb_login;
    private static final SubLSymbol $kw437$LOGIN;
    private static final SubLSymbol $sym438$CB_LINK_LOGIN;
    private static final SubLSymbol $sym439$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLSymbol $sym440$CB_LOGIN_HANDLER;
    private static final SubLSymbol $sym441$HUMAN_CYCLIST_;
    private static final SubLString $str442$redirect_handler;
    private static final SubLSymbol $sym443$FIRST_LIST;
    private static final SubLString $str444$Known_Constant;
    private static final SubLString $str445$The_name_you_typed_in__;
    private static final SubLString $str446$_is_already_used_in_the_Knowledge;
    private static final SubLString $str447$Please_go_back_and_try_a_differen;
    private static final SubLString $str448$Successful_Login;
    private static final SubLString $str449$Welcome__;
    private static final SubLString $str450$_;
    private static final SubLString $str451$Your_project_has_been_set_to_;
    private static final SubLString $str452$Change_Project;
    private static final SubLString $str453$Your_project_is_currently_not_set;
    private static final SubLString $str454$Choose_Project;
    private static final SubLString $str455$Login;
    private static final SubLList $list456;
    private static final SubLSymbol $sym457$_TITLE;
    private static final SubLObject $const458$titleOfPerson;
    private static final SubLList $list459;
    private static final SubLObject $const460$InferencePSC;
    private static final SubLList $list461;
    private static final SubLObject $const462$Sir;
    private static final SubLObject $const463$givenNames;
    private static final SubLObject $const464$familyName;
    private static final SubLSymbol $kw465$NONE;
    private static final SubLList $list466;
    private static final SubLString $str467$Unknown_Cyclist;
    private static final SubLString $str468$cb_create_new_cyclist;
    private static final SubLString $str469$The_name_;
    private static final SubLString $str470$_is_not_the_name_of_a_known_;
    private static final SubLString $str471$Do_you_want_to_create_a_new_Cyc_c;
    private static final SubLString $str472$Yes__Create_Cyclist;
    private static final SubLString $str473$creating_new_cyclists;
    private static final SubLObject $const474$isa;
    private static final SubLList $list475;
    private static final SubLString $str476$Unable_to_create_a_new_cyclist__w;
    private static final SubLSymbol $sym477$CB_CREATE_NEW_CYCLIST;
    private static final SubLString $str478$Logout;
    private static final SubLString $str479$You_have_now_logged_out_from_this;
    private static final SubLSymbol $kw480$START;
    private static final SubLString $str481$_to_reconnect_to_Cyc_;
    private static final SubLSymbol $sym482$CB_LOGOUT;
    private static final SubLString $str483$_Logout_;
    private static final SubLString $str484$cb_logout;
    private static final SubLSymbol $sym485$CB_LINK_LOGOUT;
    private static final SubLString $str486$problem;
    private static final SubLString $str487$user_login;
    private static final SubLString $str488$Specify_Cyc_Browser_Password;
    private static final SubLString $str489$80_;
    private static final SubLString $str490$Error_;
    private static final SubLString $str491$Could_not_set_password_for_;
    private static final SubLString $str492$Reason_;
    private static final SubLString $str493$Please_specify_a_new_password_for;
    private static final SubLString $str494$_Note__Only_you_can_reset_your_ow;
    private static final SubLString $str495$cb_set_password_handler;
    private static final SubLString $str496$New_Password;
    private static final SubLSymbol $sym497$CB_SET_PASSWORD;
    private static final SubLString $str498$_Set_Password_;
    private static final SubLString $str499$cb_set_password;
    private static final SubLSymbol $kw500$SET_PASSWORD;
    private static final SubLSymbol $sym501$CB_LINK_SET_PASSWORD;
    private static final SubLString $str502$Set_Password;
    private static final SubLString $str503$Passwd;
    private static final SubLString $str504$Set_passwords_for_Cyclist_Authent;
    private static final SubLString $str505$Please_fill_in_all_fields_;
    private static final SubLString $str506$No_known_cyclist_by_this_name_;
    private static final SubLString $str507$The_name_could_mean_any_of_follow;
    private static final SubLList $list508;
    private static final SubLSymbol $sym509$CB_SET_PASSWORD_HANDLER;
    private static final SubLSymbol $kw510$CB_CONFIRM_HALT_CYC;
    private static final SubLString $str511$cb_confirm_halt_cyc_html;
    private static final SubLString $str512$the_Halt_Cyc_Image;
    private static final SubLString $str513$Halt_Cyc_Image;
    private static final SubLString $str514$cb_halt_cyc;
    private static final SubLString $str515$halt;
    private static final SubLSymbol $sym516$CB_CONFIRM_HALT_CYC;
    private static final SubLString $str517$_Halt_Cyc_;
    private static final SubLString $str518$cb_confirm_halt_cyc;
    private static final SubLSymbol $sym519$CB_LINK_CONFIRM_HALT_CYC;
    private static final SubLString $str520$Halt_Image_Not_Allowed;
    private static final SubLString $str521$Sorry__this_image_cannot_be_halte;
    private static final SubLString $str522$Cyc_Image_Halted;
    private static final SubLString $str523$This_Cyc_image_will_be_halted___G;
    private static final SubLString $str524$Halted_by_;
    private static final SubLString $str525$_Via_HTML_interface;
    private static final SubLSymbol $sym526$CB_HALT_CYC;
    private static final SubLString $str527$This_will_;
    private static final SubLString $str528$_the_Cyc_image_;
    private static final SubLString $str529$red;
    private static final SubLString $str530$Warning__;
    private static final SubLString $str531$There_are__A_operations_waiting_i;
    private static final SubLString $str532$_now__they_will_be_lost_;
    private static final SubLString $str533$Do_you_really_want_to_do_this_;
    private static final SubLString $str534$Yes__;
    private static final SubLString $str535$_system;
    private static final SubLSymbol $kw536$CB_TRANSCRIPT_VIEWER;
    private static final SubLString $str537$cb_transcript_viewer_html;
    private static final SubLString $str538$show_stats;
    private static final SubLString $str539$transcript_filename;
    private static final SubLString $str540$Please_type_in_a_filename_;
    private static final SubLString $str541$Transcript_Viewing_Area;
    private static final SubLString $str542$cb_transcript_viewer_handler;
    private static final SubLSymbol $kw543$ALL_LOCAL_TRANS;
    private static final SubLString $str544$cg_cb_transcript_viewer;
    private static final SubLSymbol $kw545$GET;
    private static final SubLString $str546$cb_transcript_viewer;
    private static final SubLString $str547$View_other_transcript_;
    private static final SubLString $str548$Please_type_in_the_full_path_to_t;
    private static final SubLString $str549$ERROR__;
    private static final SubLString $str550$Stats;
    private static final SubLString $str551$View_Transcript;
    private static final SubLSymbol $sym552$CB_TRANSCRIPT_VIEWER;
    private static final SubLSymbol $sym553$CB_TRANSCRIPT_VIEWER_HANDLER;
    private static final SubLString $str554$Transcript_Statistics;
    private static final SubLString $str555$Transcript__;
    private static final SubLString $str556$Constants_Created__;
    private static final SubLString $str557$Constants_Renamed__;
    private static final SubLString $str558$__;
    private static final SubLString $str559$Constants_Killed__;
    private static final SubLString $str560$No_transcripts_for_this_image_;
    private static final SubLString $str561$Local_transcripts_for_this_image_;
    private static final SubLString $str562$cb_transcript_viewer_handler_stat;
    private static final SubLSymbol $sym563$CB_LINK_ALL_LOCAL_TRANS;
    private static final SubLString $str564$Viewer;
    private static final SubLSymbol $kw565$VIEWER;
    private static final SubLSymbol $sym566$CB_LINK_VIEWER;
    private static final SubLString $str567$Transcript_Viewer;
    private static final SubLString $str568$View;
    private static final SubLString $str569$View_Local_Transcripts;
    private static final SubLSymbol $kw570$CB_SHOW_LOCAL_OPS;
    private static final SubLString $str571$cb_show_local_ops_html;
    private static final SubLString $str572$Local_Operations;
    private static final SubLString $str573$cb_confirm_clear_local_queue;
    private static final SubLString $str574$You_have_nothing_in_your_local_qu;
    private static final SubLString $str575$_item;
    private static final SubLString $str576$s;
    private static final SubLString $str577$_in_your_local_queue_;
    private static final SubLString $str578$Click_this_button_to_erase_the_lo;
    private static final SubLString $str579$Clear_Local_Queue;
    private static final SubLString $str580$Here_are_the_queued_local_operati;
    private static final SubLSymbol $sym581$CB_SHOW_LOCAL_OPS;
    private static final SubLString $str582$Local_;
    private static final SubLString $str583$cb_show_local_ops;
    private static final SubLSymbol $sym584$CB_LINK_SHOW_LOCAL_OPS;
    private static final SubLSymbol $kw585$CB_CONFIRM_CLEAR_LOCAL_QUEUE;
    private static final SubLString $str586$cb_confirm_clear_local_queue_html;
    private static final SubLString $str587$cb_clear_local_queue;
    private static final SubLString $str588$Are_you_;
    private static final SubLString $str589$SURE;
    private static final SubLString $str590$_you_want_to_clear_your_local_que;
    private static final SubLString $str591$_operations_will_be_lost_;
    private static final SubLString $str592$Yes__Clear_Local_Queue;
    private static final SubLSymbol $sym593$CB_CONFIRM_CLEAR_LOCAL_QUEUE;
    private static final SubLSymbol $kw594$CB_CONFIRM_CLEAR_LOCAL_AND_RESTART;
    private static final SubLString $str595$cb_confirm_clear_local_and_restar;
    private static final SubLString $str596$cb_clear_local_and_restart;
    private static final SubLString $str597$You_have_nothing_in_your_local_qu;
    private static final SubLString $str598$Local_Queue_Cleared__Agenda_Resta;
    private static final SubLString $str599$_you_want_to_clear_your_local_que;
    private static final SubLString $str600$Yes__Clear_Local_Queue_and_Restar;
    private static final SubLSymbol $sym601$CB_CONFIRM_CLEAR_LOCAL_AND_RESTART;
    private static final SubLString $str602$cb_confirm_clear_local_and_restar;
    private static final SubLSymbol $sym603$CB_LINK_DELETE_LOCAL_AND_RESTART;
    private static final SubLSymbol $sym604$CB_LINK_DELETE_LOCAL_OPS;
    private static final SubLSymbol $sym605$CB_CLEAR_LOCAL_AND_RESTART;
    private static final SubLString $str606$Local_Queue_Cleared;
    private static final SubLSymbol $sym607$CB_CLEAR_LOCAL_QUEUE;
    private static final SubLSymbol $kw608$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT;
    private static final SubLString $str609$cb_system_show_specific_transcrip;
    private static final SubLString $str610$transcript_filename;
    private static final SubLString $str611$output_filename;
    private static final SubLString $str612$error_message;
    private static final SubLString $str613$Transcript_file_viewed_in_KE_Text;
    private static final SubLString $str614$The_transcript_file_contains_no_o;
    private static final SubLString $str615$cg_cb_write_local_transcript_as_k;
    private static final SubLSymbol $kw616$POST;
    private static final SubLString $str617$cb_system_write_specific_transcri;
    private static final SubLString $str618$You_may_write_this_transcript_in_;
    private static final SubLSymbol $kw619$NBSP;
    private static final SubLString $str620$Write_to_File;
    private static final SubLString $str621$This_is_what_the_transcript_curre;
    private static final SubLSymbol $sym622$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT;
    private static final SubLString $str623$Transcript_successfully_written_;
    private static final SubLSymbol $sym624$CB_SYSTEM_WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 594L)
    public static SubLObject cyc_system_doc_file() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return PrintLow.format((SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.$str0$_Aref_system_html, system_parameters.$cyc_documentation_url$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 931L)
    public static SubLObject cb_mode(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_system_tools.$str4$Cyc_communication_status_changing);
            return (SubLObject)cb_system_tools.NIL;
        }
        operation_communication.possibly_save_transcript_ops();
        cb_frames.html_update_cb_status_script();
        final SubLObject title_var = (SubLObject)cb_system_tools.$str5$Communication_Status_Area;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject message = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str17$message, args);
                        if (cb_system_tools.NIL != message) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject color_val = html_utilities.html_color((SubLObject)cb_system_tools.$kw18$RED);
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (cb_system_tools.NIL != color_val) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_princ(message);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str20$cb_mode_handler, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw2$CB_MODE, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_system_tools.$str21$Current_Value);
                            html_utilities.html_indent((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_system_tools.$str22$Submit, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != operation_queues.local_queue_empty()) {
                                if (cb_system_tools.NIL != transcript_server.use_transcript_server()) {
                                    transcript_server.transcript_server_check();
                                }
                                if (cb_system_tools.NIL != operation_queues.local_operations_anywhere()) {
                                    html_utilities.html_princ((SubLObject)cb_system_tools.$str23$You_can_not_change_your_transmitt);
                                    html_utilities.html_princ((SubLObject)cb_system_tools.$str24$your_local_transcript_by_either_s);
                                    html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                                    insert_stored_options();
                                }
                                else {
                                    insert_transmit_options();
                                }
                            }
                            else {
                                insert_local_queue_warning();
                            }
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_hr((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            insert_read_options();
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 2458L)
    public static SubLObject insert_transmit_options() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str27$What_Do_You_Want_To_Do_With_Proce);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            if (cb_system_tools.NIL != operation_communication.allow_transmitting()) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_radio_input((SubLObject)cb_system_tools.$str29$transmit_mode, (SubLObject)cb_system_tools.$str30$transmit, (SubLObject)SubLObjectFactory.makeBoolean(cb_system_tools.NIL != operation_communication.not_recordingP() && cb_system_tools.NIL != operation_communication.transmittingP()), (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw31$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str33$Send_Immediately_To_Everybody);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject t_and_s_modeP = (SubLObject)SubLObjectFactory.makeBoolean(cb_system_tools.NIL != operation_communication.storingP() && cb_system_tools.NIL != operation_communication.transmittingP());
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_radio_input((SubLObject)cb_system_tools.$str29$transmit_mode, (SubLObject)cb_system_tools.$str34$transmit_and_store, t_and_s_modeP, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw31$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str35$____and_Record_Locally);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                if (cb_system_tools.NIL != t_and_s_modeP) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw31$LEFT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str36$to_);
                            html_utilities.html_indent((SubLObject)cb_system_tools.UNPROVIDED);
                            cb_utilities.cb_link((SubLObject)cb_system_tools.$kw37$WRITE_TRANS, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_radio_input((SubLObject)cb_system_tools.$str29$transmit_mode, (SubLObject)cb_system_tools.$str38$transmit_and_store_rolled, (SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw31$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str39$____and_Record_Locally_to_a_New_T);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            }
            else {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$kw31$LEFT);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        insert_kb_not_current_message();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_radio_input((SubLObject)cb_system_tools.$str29$transmit_mode, (SubLObject)cb_system_tools.$str40$store, (SubLObject)SubLObjectFactory.makeBoolean(cb_system_tools.NIL != operation_communication.storingP() && cb_system_tools.NIL == operation_communication.transmittingP()), (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw31$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str41$Store_For_Later);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_radio_input((SubLObject)cb_system_tools.$str29$transmit_mode, (SubLObject)cb_system_tools.$str42$none, (SubLObject)SubLObjectFactory.makeBoolean(cb_system_tools.NIL == operation_communication.transmittingP() && cb_system_tools.NIL != operation_communication.not_recordingP()), (SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw31$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str43$Do_Not_Record);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str44$Send_KB_Check_Point_for__);
        html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
        cb_mode_show_kb_checkpoint_options((SubLObject)cb_system_tools.$str45$kb_checkpoint_to_send, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 5054L)
    public static SubLObject insert_kb_not_current_message() {
        html_utilities.html_princ((SubLObject)cb_system_tools.$str46$Currently__you_are_not_allowed_to);
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str47$Try_receiving_operations_if_you_w);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 5530L)
    public static SubLObject insert_stored_options() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str48$You_have_);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str50$cb_system_ready_transcript_file_w);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ(operation_queues.local_operation_storage_queue_size());
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str51$_operations);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str52$_stored_);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            if (cb_system_tools.NIL != operation_communication.allow_transmitting()) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_radio_input((SubLObject)cb_system_tools.$str40$store, (SubLObject)cb_system_tools.$str53$send, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str54$Send_Stored_Operations_Now);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            }
            else {
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    insert_kb_not_current_message();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_radio_input((SubLObject)cb_system_tools.$str40$store, (SubLObject)cb_system_tools.$str55$clear, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str56$Clear_Stored_Operations);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str57$Note_);
        html_utilities.html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str58$_All_of_the_above_options_will_st);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 7577L)
    public static SubLObject insert_local_queue_warning() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str59$You_still_have_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        final SubLObject color_val = (SubLObject)cb_system_tools.$kw18$RED;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_system_tools.NIL != color_val) {
            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_color(color_val));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ(operation_queues.local_queue_size());
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str60$_unprocessed_operations_on_your_l);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 7927L)
    public static SubLObject insert_read_options() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str61$Do_You_Want_To_Receive_Operations);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw62$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_radio_input((SubLObject)cb_system_tools.$str63$receive_mode, (SubLObject)cb_system_tools.$str64$no, (SubLObject)SubLObjectFactory.makeBoolean(cb_system_tools.NIL == operation_communication.receivingP()), (SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw31$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str65$No);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw62$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_radio_input((SubLObject)cb_system_tools.$str63$receive_mode, (SubLObject)cb_system_tools.$str66$yes, operation_communication.receivingP(), (SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw31$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str67$Yes);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_checkbox_input((SubLObject)cb_system_tools.$str68$kb_checkpoint_, (SubLObject)cb_system_tools.T, forts.fort_p(operation_communication.get_remote_operations_kb_check_point()), (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str69$Receive_only_up_to_KB_Check_Point);
                    html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                    cb_mode_show_kb_checkpoint_options((SubLObject)cb_system_tools.$str70$kb_checkpoint, (SubLObject)cb_system_tools.$kw71$USE_CURRENT_CHECK_POINT);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        possibly_insert_experience_options();
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 9287L)
    public static SubLObject cb_mode_show_kb_checkpoint_options(final SubLObject label, SubLObject use_current_check_pointP) {
        if (use_current_check_pointP == cb_system_tools.UNPROVIDED) {
            use_current_check_pointP = (SubLObject)cb_system_tools.NIL;
        }
        cb_utilities.cb_fort_list_selector(label, isa.all_fort_instances(cb_system_tools.$cb_mode_checkpoint_collection$.getGlobalValue(), (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), (SubLObject)((cb_system_tools.NIL != use_current_check_pointP) ? operation_communication.get_remote_operations_kb_check_point() : cb_system_tools.NIL), (SubLObject)cb_system_tools.ONE_INTEGER, Symbols.symbol_function((SubLObject)cb_system_tools.IDENTITY), (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.$str42$none);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 9752L)
    public static SubLObject oe_patch_messages_enabled_and_email_validP() {
        return cb_system_tools.$oe_patch_messages_enabledP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 9853L)
    public static SubLObject cb_mode_handler(final SubLObject args) {
        SubLObject transmit_selection_string = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str29$transmit_mode, args);
        final SubLObject stored_selection_string = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str40$store, args);
        final SubLObject receive_selection_string = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str63$receive_mode, args);
        final SubLObject use_filtersP = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str75$filters_, args);
        final SubLObject kb_checkpoint_sending = cb_utilities.cb_decode_fort_list_selector_result((SubLObject)cb_system_tools.$str45$kb_checkpoint_to_send, args);
        final SubLObject kb_checkpoint_receivingP = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str68$kb_checkpoint_, args);
        if (cb_system_tools.NIL != stored_selection_string) {
            if (stored_selection_string.equal((SubLObject)cb_system_tools.$str53$send)) {
                if (cb_system_tools.NIL != oe_patch_messages_enabled_and_email_validP()) {
                    display_oe_patch_message(args);
                }
                else {
                    operation_communication.send_stored_operations();
                }
            }
            else if (stored_selection_string.equal((SubLObject)cb_system_tools.$str55$clear)) {
                operation_communication.clear_stored_operations();
            }
        }
        if (cb_system_tools.NIL == cb_utilities.cb_fort_list_none_selected_p(kb_checkpoint_sending)) {
            operation_communication.transmit_kb_check_point_operation(kb_checkpoint_sending);
        }
        if (cb_system_tools.NIL != transmit_selection_string) {
            if (cb_system_tools.NIL != Strings.stringE((SubLObject)cb_system_tools.$str38$transmit_and_store_rolled, transmit_selection_string, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED)) {
                transcript_utilities.new_local_transcript();
                transcript_utilities.mark_local_transcript((SubLObject)cb_system_tools.$str76$SENT);
                transmit_selection_string = (SubLObject)cb_system_tools.$str34$transmit_and_store;
            }
            if (!transmit_selection_string.equal(operation_communication.get_transmit_state((SubLObject)cb_system_tools.UNPROVIDED))) {
                operation_communication.set_transmit_state(transmit_selection_string);
            }
        }
        if (cb_system_tools.NIL != receive_selection_string && !receive_selection_string.equal(operation_communication.get_receive_state((SubLObject)cb_system_tools.UNPROVIDED))) {
            operation_communication.set_receive_state(receive_selection_string);
        }
        if (cb_system_tools.NIL != operation_communication.receivingP()) {
            if (cb_system_tools.NIL != kb_checkpoint_receivingP) {
                operation_communication.set_remote_operations_kb_check_point(cb_utilities.cb_decode_fort_list_selector_result((SubLObject)cb_system_tools.$str70$kb_checkpoint, args));
            }
        }
        else {
            operation_communication.clear_remote_operations_kb_check_point();
        }
        cb_mode((SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 12017L)
    public static SubLObject cb_link_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str78$cb_mode);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ((SubLObject)cb_system_tools.$str79$Comm_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 12488L)
    public static SubLObject display_oe_patch_message(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stored_selection_string = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str40$store, args);
        final SubLObject builder_note = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str87$notes, args);
        final SubLObject submitted_to_builderP = Equality.equalp(html_utilities.html_extract_input((SubLObject)cb_system_tools.$str40$store, args), (SubLObject)cb_system_tools.$str88$builder);
        final SubLObject new_suffix = (SubLObject)cb_system_tools.$str76$SENT;
        thread.resetMultipleValues();
        final SubLObject oe_message = default_oe_patch_message(builder_note, transcript_utilities.local_transcript(), new_suffix, submitted_to_builderP);
        final SubLObject require_patch_messageP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject title_var = (SubLObject)cb_system_tools.$str89$OE_Patch_Message;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$52 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$53 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str90$cb_handle_oe_patch_message, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str40$store, stored_selection_string, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str87$notes, builder_note, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject frame_name_var_$57 = (SubLObject)cb_system_tools.NIL;
                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            cb_parameters.cyc_cgi_url_int();
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str50$cb_system_ready_transcript_file_w);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != frame_name_var_$57) {
                                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var_$57);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str91$window_open__);
                            cb_parameters.cyc_cgi_url_int();
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str50$cb_system_ready_transcript_file_w);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str92$__);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str94$null);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str95$___A____, (SubLObject)cb_system_tools.$str83$);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str96$return_false_);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ(file_utilities.normal_pathstring(transcript_utilities.local_transcript()));
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str97$Enter_a_short_description_to_go_i);
                            cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw85$DISPLAY_OE_PATCH_MESSAGE, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str98$To__);
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_text_input((SubLObject)cb_system_tools.$str99$to, cb_system_tools.$default_oe_patch_message_recipient$.getGlobalValue(), (SubLObject)cb_system_tools.$int100$80);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str101$Short_Description__);
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_text_input((SubLObject)cb_system_tools.$str102$subj, oe_patch_message_subject_prefix(), (SubLObject)cb_system_tools.$int100$80);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str103$Patch_Message__);
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str17$message);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$int104$100);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWENTY_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str105$virtual);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_princ(oe_message);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            if (stored_selection_string.equal((SubLObject)cb_system_tools.$str53$send)) {
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_submit$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_system_tools.$str106$send_message_);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str107$Transmit_and_Send_Patch_Message);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                if (cb_system_tools.NIL == require_patch_messageP) {
                                    html_utilities.html_princ((SubLObject)cb_system_tools.$str108$_);
                                    html_utilities.html_submit_input((SubLObject)cb_system_tools.$str109$Transmit_without_Patch_Message, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                }
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$53, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$52, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 15067L)
    public static SubLObject oe_patch_message_subject_prefix() {
        return Sequences.cconcatenate((SubLObject)cb_system_tools.$str110$OE_Patch__kb_, new SubLObject[] { format_nil.format_nil_a_no_copy(operation_communication.kb_version_string()), cb_system_tools.$str111$___ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 15184L)
    public static SubLObject default_oe_patch_message(SubLObject note, SubLObject transcript_file, SubLObject new_suffix, SubLObject submittedP) {
        if (note == cb_system_tools.UNPROVIDED) {
            note = (SubLObject)cb_system_tools.NIL;
        }
        if (transcript_file == cb_system_tools.UNPROVIDED) {
            transcript_file = transcript_utilities.local_transcript();
        }
        if (new_suffix == cb_system_tools.UNPROVIDED) {
            new_suffix = (SubLObject)cb_system_tools.$str76$SENT;
        }
        if (submittedP == cb_system_tools.UNPROVIDED) {
            submittedP = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject message_string = (SubLObject)cb_system_tools.NIL;
        SubLObject require_patch_messageP = (SubLObject)cb_system_tools.NIL;
        final SubLObject max_lines_per_type = (SubLObject)cb_system_tools.$int112$1000;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)cb_system_tools.T, thread);
            final SubLObject stats = transcript_utilities.constant_modifications_in_transcript(transcript_file);
            SubLObject current;
            final SubLObject datum = current = stats;
            SubLObject operation_count = (SubLObject)cb_system_tools.NIL;
            SubLObject transcript_create_list = (SubLObject)cb_system_tools.NIL;
            SubLObject transcript_rename_list = (SubLObject)cb_system_tools.NIL;
            SubLObject transcript_kill_list = (SubLObject)cb_system_tools.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_system_tools.$list113);
            operation_count = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_system_tools.$list113);
            transcript_create_list = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_system_tools.$list113);
            transcript_rename_list = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_system_tools.$list113);
            transcript_kill_list = current.first();
            current = current.rest();
            if (cb_system_tools.NIL == current) {
                require_patch_messageP = (SubLObject)SubLObjectFactory.makeBoolean(cb_system_tools.NIL != transcript_kill_list || cb_system_tools.NIL != transcript_rename_list || cb_system_tools.NIL != transcript_create_list);
                SubLObject stream = (SubLObject)cb_system_tools.NIL;
                try {
                    stream = streams_high.make_private_string_output_stream();
                    PrintLow.format(stream, (SubLObject)cb_system_tools.$str114$_A, (SubLObject)((cb_system_tools.NIL != submittedP) ? cb_system_tools.$str115$Submitted : cb_system_tools.$str116$Transmitted));
                    PrintLow.format(stream, (SubLObject)cb_system_tools.$str117$_from_KB___A____, operation_communication.kb_version_string());
                    PrintLow.format(stream, (SubLObject)cb_system_tools.$str118$Patch_Description_____);
                    if (cb_system_tools.NIL != string_utilities.non_empty_stringP(note)) {
                        PrintLow.format(stream, (SubLObject)cb_system_tools.$str119$_S__, note);
                    }
                    PrintLow.format(stream, (SubLObject)cb_system_tools.$str120$__Transcript___A__, transcript_utilities.mark_transcript_filename(file_utilities.normal_pathstring(transcript_file), new_suffix));
                    PrintLow.format(stream, (SubLObject)cb_system_tools.$str121$Total_Operations___A__, operation_count);
                    if (cb_system_tools.NIL != transcript_kill_list) {
                        PrintLow.format(stream, (SubLObject)cb_system_tools.$str122$__Killed_Constants____);
                        SubLObject done = (SubLObject)cb_system_tools.NIL;
                        SubLObject list_var = (SubLObject)cb_system_tools.NIL;
                        SubLObject info = (SubLObject)cb_system_tools.NIL;
                        SubLObject line_count = (SubLObject)cb_system_tools.NIL;
                        list_var = transcript_kill_list;
                        info = list_var.first();
                        for (line_count = (SubLObject)cb_system_tools.ZERO_INTEGER; cb_system_tools.NIL == done && cb_system_tools.NIL != list_var; list_var = list_var.rest(), info = list_var.first(), line_count = Numbers.add((SubLObject)cb_system_tools.ONE_INTEGER, line_count)) {
                            SubLObject current_$61;
                            final SubLObject datum_$60 = current_$61 = info;
                            SubLObject op_num = (SubLObject)cb_system_tools.NIL;
                            SubLObject external_id = (SubLObject)cb_system_tools.NIL;
                            SubLObject name = (SubLObject)cb_system_tools.NIL;
                            SubLObject who = (SubLObject)cb_system_tools.NIL;
                            SubLObject when = (SubLObject)cb_system_tools.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$61, datum_$60, (SubLObject)cb_system_tools.$list123);
                            op_num = current_$61.first();
                            current_$61 = current_$61.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$61, datum_$60, (SubLObject)cb_system_tools.$list123);
                            external_id = current_$61.first();
                            current_$61 = current_$61.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$61, datum_$60, (SubLObject)cb_system_tools.$list123);
                            name = current_$61.first();
                            current_$61 = current_$61.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$61, datum_$60, (SubLObject)cb_system_tools.$list123);
                            who = current_$61.first();
                            current_$61 = current_$61.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$61, datum_$60, (SubLObject)cb_system_tools.$list123);
                            when = current_$61.first();
                            current_$61 = current_$61.rest();
                            if (cb_system_tools.NIL == current_$61) {
                                PrintLow.format(stream, (SubLObject)cb_system_tools.$str124$_A__, name);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$60, (SubLObject)cb_system_tools.$list123);
                            }
                            if (line_count.numG(max_lines_per_type)) {
                                done = (SubLObject)cb_system_tools.T;
                                PrintLow.format(stream, (SubLObject)cb_system_tools.$str125$_and__A_more___, Numbers.subtract(Sequences.length(transcript_kill_list), line_count));
                            }
                        }
                    }
                    if (cb_system_tools.NIL != transcript_rename_list) {
                        PrintLow.format(stream, (SubLObject)cb_system_tools.$str126$__Renames____);
                        SubLObject done = (SubLObject)cb_system_tools.NIL;
                        SubLObject list_var = (SubLObject)cb_system_tools.NIL;
                        SubLObject info = (SubLObject)cb_system_tools.NIL;
                        SubLObject line_count = (SubLObject)cb_system_tools.NIL;
                        list_var = transcript_rename_list;
                        info = list_var.first();
                        for (line_count = (SubLObject)cb_system_tools.ZERO_INTEGER; cb_system_tools.NIL == done && cb_system_tools.NIL != list_var; list_var = list_var.rest(), info = list_var.first(), line_count = Numbers.add((SubLObject)cb_system_tools.ONE_INTEGER, line_count)) {
                            SubLObject current_$62;
                            final SubLObject datum_$61 = current_$62 = info;
                            SubLObject op_num = (SubLObject)cb_system_tools.NIL;
                            SubLObject external_id = (SubLObject)cb_system_tools.NIL;
                            SubLObject old_name = (SubLObject)cb_system_tools.NIL;
                            SubLObject new_name = (SubLObject)cb_system_tools.NIL;
                            SubLObject who2 = (SubLObject)cb_system_tools.NIL;
                            SubLObject when2 = (SubLObject)cb_system_tools.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$62, datum_$61, (SubLObject)cb_system_tools.$list127);
                            op_num = current_$62.first();
                            current_$62 = current_$62.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$62, datum_$61, (SubLObject)cb_system_tools.$list127);
                            external_id = current_$62.first();
                            current_$62 = current_$62.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$62, datum_$61, (SubLObject)cb_system_tools.$list127);
                            old_name = current_$62.first();
                            current_$62 = current_$62.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$62, datum_$61, (SubLObject)cb_system_tools.$list127);
                            new_name = current_$62.first();
                            current_$62 = current_$62.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$62, datum_$61, (SubLObject)cb_system_tools.$list127);
                            who2 = current_$62.first();
                            current_$62 = current_$62.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$62, datum_$61, (SubLObject)cb_system_tools.$list127);
                            when2 = current_$62.first();
                            current_$62 = current_$62.rest();
                            if (cb_system_tools.NIL == current_$62) {
                                PrintLow.format(stream, (SubLObject)cb_system_tools.$str128$_A_____A__, old_name, new_name);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$61, (SubLObject)cb_system_tools.$list127);
                            }
                            if (line_count.numG(max_lines_per_type)) {
                                done = (SubLObject)cb_system_tools.T;
                                PrintLow.format(stream, (SubLObject)cb_system_tools.$str125$_and__A_more___, Numbers.subtract(Sequences.length(transcript_rename_list), line_count));
                            }
                        }
                    }
                    transcript_create_list = Sequences.nreverse(transcript_create_list);
                    if (cb_system_tools.NIL != transcript_create_list) {
                        PrintLow.format(stream, (SubLObject)cb_system_tools.$str129$__New_Constants____);
                        SubLObject cdolist_list_var = transcript_create_list;
                        SubLObject info2 = (SubLObject)cb_system_tools.NIL;
                        info2 = cdolist_list_var.first();
                        while (cb_system_tools.NIL != cdolist_list_var) {
                            SubLObject current_$63;
                            final SubLObject datum_$62 = current_$63 = info2;
                            SubLObject op_num2 = (SubLObject)cb_system_tools.NIL;
                            SubLObject external_id2 = (SubLObject)cb_system_tools.NIL;
                            SubLObject name2 = (SubLObject)cb_system_tools.NIL;
                            SubLObject who3 = (SubLObject)cb_system_tools.NIL;
                            SubLObject when3 = (SubLObject)cb_system_tools.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$63, datum_$62, (SubLObject)cb_system_tools.$list123);
                            op_num2 = current_$63.first();
                            current_$63 = current_$63.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$63, datum_$62, (SubLObject)cb_system_tools.$list123);
                            external_id2 = current_$63.first();
                            current_$63 = current_$63.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$63, datum_$62, (SubLObject)cb_system_tools.$list123);
                            name2 = current_$63.first();
                            current_$63 = current_$63.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$63, datum_$62, (SubLObject)cb_system_tools.$list123);
                            who3 = current_$63.first();
                            current_$63 = current_$63.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$63, datum_$62, (SubLObject)cb_system_tools.$list123);
                            when3 = current_$63.first();
                            current_$63 = current_$63.rest();
                            if (cb_system_tools.NIL == current_$63) {
                                PrintLow.format(stream, (SubLObject)cb_system_tools.$str124$_A__, name2);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$62, (SubLObject)cb_system_tools.$list123);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            info2 = cdolist_list_var.first();
                        }
                    }
                    message_string = streams_high.get_output_stream_string(stream);
                }
                finally {
                    final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_system_tools.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        streams_high.close(stream, (SubLObject)cb_system_tools.UNPROVIDED);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_system_tools.$list113);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(message_string, require_patch_messageP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 18312L)
    public static SubLObject cb_handle_oe_patch_message(final SubLObject args) {
        final SubLObject subject = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str102$subj, args);
        final SubLObject message = html_utilities.html_extract_string((SubLObject)cb_system_tools.$str17$message, args, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject stored_selection_string = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str40$store, args);
        final SubLObject send_mailP = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str106$send_message_, args);
        final SubLObject to = (SubLObject)((cb_system_tools.NIL != send_mailP) ? html_utilities.html_extract_input((SubLObject)cb_system_tools.$str99$to, args) : cb_system_tools.NIL);
        final SubLObject from = kb_accessors.email_address_text(operation_communication.the_cyclist());
        SubLObject mode_args = (SubLObject)cb_system_tools.NIL;
        mode_args = send_or_submit_transcript_with_message(transcript_utilities.local_transcript(), stored_selection_string, message, subject, from, to);
        cb_mode(mode_args);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 18891L)
    public static SubLObject send_or_submit_transcript_with_message(final SubLObject transcript, final SubLObject action_type, SubLObject message, final SubLObject email_subj, SubLObject email_from, SubLObject email_to) {
        if (email_from == cb_system_tools.UNPROVIDED) {
            email_from = kb_accessors.email_address_text(operation_communication.the_cyclist());
        }
        if (email_to == cb_system_tools.UNPROVIDED) {
            email_to = cb_system_tools.$default_oe_patch_message_recipient$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ret_value = (SubLObject)cb_system_tools.NIL;
        SubLObject ke_text_file = (SubLObject)cb_system_tools.NIL;
        SubLObject mail_successfulP = (SubLObject)cb_system_tools.NIL;
        SubLObject mail_error_message = Sequences.cconcatenate((SubLObject)cb_system_tools.$str131$Mail_not_sent_due_to_invalid_from, new SubLObject[] { format_nil.format_nil_s_no_copy(email_from), cb_system_tools.$str132$__or_to__, format_nil.format_nil_s_no_copy(email_to), cb_system_tools.$str133$__address });
        if (cb_system_tools.NIL != string_utilities.non_empty_stringP(email_to) && cb_system_tools.NIL != string_utilities.non_empty_stringP(email_from)) {
            ke_text_file = ke_text_for_patch_message(transcript);
            message = Sequences.cconcatenate(message, ke_text_file);
            thread.resetMultipleValues();
            final SubLObject mail_successfulP_$67 = mail_utilities.mail_message(email_from, email_to, message, email_subj, cb_system_tools.$oe_patch_message_smtp_host$.getGlobalValue(), (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject mail_error_message_$68 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            mail_successfulP = mail_successfulP_$67;
            mail_error_message = mail_error_message_$68;
        }
        if (action_type.equal((SubLObject)cb_system_tools.$str53$send)) {
            operation_communication.send_stored_operations();
        }
        if (cb_system_tools.NIL == mail_successfulP) {
            final SubLObject result_string = (SubLObject)(action_type.equal((SubLObject)cb_system_tools.$str53$send) ? cb_system_tools.$str134$sent : cb_system_tools.$str135$submitted);
            final SubLObject message_$69 = (cb_system_tools.NIL == email_to) ? Sequences.cconcatenate((SubLObject)cb_system_tools.$str136$Transcript_, new SubLObject[] { result_string, cb_system_tools.$str137$__but_no_mail_sent_ }) : Sequences.cconcatenate((SubLObject)cb_system_tools.$str136$Transcript_, new SubLObject[] { result_string, cb_system_tools.$str138$__but_mail_message_encountered_er, mail_error_message });
            ret_value = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str17$message, message_$69));
        }
        return ret_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 20391L)
    public static SubLObject ke_text_for_patch_message(SubLObject transcript_file) {
        if (transcript_file == cb_system_tools.UNPROVIDED) {
            transcript_file = transcript_utilities.local_transcript();
        }
        SubLObject ke_text_file = (SubLObject)cb_system_tools.NIL;
        final SubLObject max_transcript_lines = (SubLObject)cb_system_tools.$int139$5000;
        SubLObject stream = (SubLObject)cb_system_tools.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            PrintLow.format(stream, (SubLObject)cb_system_tools.$str140$_________________________);
            PrintLow.format(stream, (SubLObject)cb_system_tools.$str141$Transcript_as_KE_Text___);
            SubLObject done = (SubLObject)cb_system_tools.NIL;
            final SubLObject ke_text_lines = transcript_utilities.transcript_file_to_ke_text(transcript_file);
            SubLObject list_var = (SubLObject)cb_system_tools.NIL;
            SubLObject ke_text_line = (SubLObject)cb_system_tools.NIL;
            SubLObject line_count = (SubLObject)cb_system_tools.NIL;
            list_var = ke_text_lines;
            ke_text_line = list_var.first();
            for (line_count = (SubLObject)cb_system_tools.ZERO_INTEGER; cb_system_tools.NIL == done && cb_system_tools.NIL != list_var; list_var = list_var.rest(), ke_text_line = list_var.first(), line_count = Numbers.add((SubLObject)cb_system_tools.ONE_INTEGER, line_count)) {
                PrintLow.format(stream, (SubLObject)cb_system_tools.$str124$_A__, ke_text_line);
                if (line_count.numG(max_transcript_lines)) {
                    done = (SubLObject)cb_system_tools.T;
                    PrintLow.format(stream, (SubLObject)cb_system_tools.$str142$___and__A_more_operations___, Numbers.subtract(Sequences.length(ke_text_lines), line_count));
                }
            }
            ke_text_file = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cb_system_tools.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)cb_system_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return ke_text_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 21077L)
    public static SubLObject cb_link_roll_current_kb(SubLObject linktext) {
        if (linktext == cb_system_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_kb = control_vars.kb_loaded();
        final SubLObject next_kb = number_utilities.f_1X(current_kb);
        if (cb_system_tools.NIL == linktext) {
            linktext = Sequences.cconcatenate((SubLObject)cb_system_tools.$str143$_Roll_to_KB_, new SubLObject[] { format_nil.format_nil_s_no_copy(next_kb), cb_system_tools.$str144$_ });
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw145$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str146$cb_roll_current_kb);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 21518L)
    public static SubLObject cb_roll_current_kb(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_system_tools.$str151$Rolling_the_KB);
            return (SubLObject)cb_system_tools.NIL;
        }
        final SubLObject current_kb = control_vars.kb_loaded();
        final SubLObject next_kb = number_utilities.f_1X(current_kb);
        final SubLObject title_var;
        final SubLObject title = title_var = Sequences.cconcatenate((SubLObject)cb_system_tools.$str152$Roll_to_KB_, format_nil.format_nil_a_no_copy(next_kb));
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$70 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$71 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str153$cb_handle_roll_current_kb, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw149$CB_REMOTE_FILTERS, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject color_val = (SubLObject)cb_system_tools.$kw18$RED;
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (cb_system_tools.NIL != color_val) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(color_val));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_utilities.html_princ_strong((SubLObject)cb_system_tools.$str154$WARNING_);
                                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str155$Rolling_the_KB_is_will_filter_eve);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str156$Do_you_still_want_to_roll_to_KB__, next_kb);
                            html_utilities.html_indent((SubLObject)cb_system_tools.FOUR_INTEGER);
                            html_utilities.html_submit_input((SubLObject)cb_system_tools.$str67$Yes, (SubLObject)cb_system_tools.$str66$yes, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_system_tools.$str65$No, (SubLObject)cb_system_tools.$str64$no, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$71, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$70, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 22787L)
    public static SubLObject cb_handle_roll_current_kb(final SubLObject args) {
        if (cb_system_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_system_tools.$str151$Rolling_the_KB);
            return (SubLObject)cb_system_tools.NIL;
        }
        final SubLObject rollP = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str66$yes, args);
        if (cb_system_tools.NIL == rollP) {
            return cb_mode((SubLObject)cb_system_tools.UNPROVIDED);
        }
        final SubLObject current_kb = control_vars.kb_loaded();
        final SubLObject next_kb = number_utilities.f_1X(current_kb);
        operation_communication.close_kb(current_kb, next_kb);
        return cb_mode((SubLObject)cb_system_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 23384L)
    public static SubLObject cb_agenda_halt_explanation_display() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL != control_vars.$last_agenda_error_message$.getGlobalValue()) {
            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str160$Agenda_halted_due_to_);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            final SubLObject _prev_bind_0 = html_cycl_string_printer.$html_large_string_limit$.currentBinding(thread);
            try {
                html_cycl_string_printer.$html_large_string_limit$.bind((SubLObject)cb_system_tools.$int161$32768, thread);
                html_macros.verify_not_within_html_pre();
                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                final SubLObject _prev_bind_0_$76 = html_macros.$within_html_pre$.currentBinding(thread);
                try {
                    html_macros.$within_html_pre$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ_doc_string(control_vars.$last_agenda_error_message$.getGlobalValue(), (SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$within_html_pre$.rebind(_prev_bind_0_$76, thread);
                }
                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
            }
            finally {
                html_cycl_string_printer.$html_large_string_limit$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var = control_vars.$last_agenda_error_explanatory_supports$.getGlobalValue();
            SubLObject support = (SubLObject)cb_system_tools.NIL;
            support = cdolist_list_var.first();
            while (cb_system_tools.NIL != cdolist_list_var) {
                if (!support.eql(control_vars.$last_agenda_error_explanatory_supports$.getGlobalValue().first())) {
                    html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                }
                if (cb_system_tools.NIL != assertion_handles.assertion_p(support)) {
                    cb_utilities.cb_show_assertion_readably(support, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                }
                else {
                    cb_utilities.cb_form(support, (SubLObject)cb_system_tools.ZERO_INTEGER, (SubLObject)cb_system_tools.T);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 24071L)
    public static SubLObject cb_agenda(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_system_tools.$str164$The_Cyc_Agenda_Control_Facilities);
            return (SubLObject)cb_system_tools.NIL;
        }
        final SubLObject title_var = (SubLObject)cb_system_tools.$str165$Agenda_Process_Control;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$77 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$78 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw162$CB_AGENDA, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str166$cb_abort_agenda, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str167$Here_you_control_the_turning_on_a);
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str168$Currently__your_Agenda_is_);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            if (cb_system_tools.NIL != agenda.agenda_running()) {
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str169$running);
                            }
                            else {
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str170$halted);
                            }
                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str171$_);
                            if (cb_system_tools.NIL != control_vars.$last_agenda_op$.getGlobalValue() && (cb_system_tools.NIL != agenda.agenda_running() || cb_system_tools.$kw172$HALT == agenda.agenda_error_mode())) {
                                html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                            final SubLObject state = agenda.agenda_state();
                                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            if (agenda.agenda_state().equalp((SubLObject)cb_system_tools.$str173$Run)) {
                                                html_utilities.html_princ((SubLObject)cb_system_tools.$str174$Current);
                                            }
                                            else {
                                                html_utilities.html_princ((SubLObject)cb_system_tools.$str175$Last);
                                            }
                                            html_utilities.html_princ((SubLObject)cb_system_tools.$str176$_Agenda_operation_);
                                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            if (state.equalp((SubLObject)cb_system_tools.$str173$Run)) {
                                                html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                                                html_utilities.html_submit_input((SubLObject)cb_system_tools.$str177$Abort_Operation, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                                html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                                                cb_utilities.cb_link((SubLObject)cb_system_tools.$kw178$AGENDA, (SubLObject)cb_system_tools.$str179$_Refresh_, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                            }
                                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                            cb_utilities.cb_form(cb_transform_operation_for_display(agenda.agenda_form_to_show()), (SubLObject)cb_system_tools.ZERO_INTEGER, (SubLObject)cb_system_tools.T);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        final SubLObject propagating_assertions = forward.all_currently_forward_propagating_assertions();
                                        if (cb_system_tools.NIL != propagating_assertions) {
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)cb_system_tools.$str180$50_);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                                SubLObject list_var = (SubLObject)cb_system_tools.NIL;
                                                SubLObject assertion = (SubLObject)cb_system_tools.NIL;
                                                SubLObject index = (SubLObject)cb_system_tools.NIL;
                                                list_var = propagating_assertions;
                                                assertion = list_var.first();
                                                for (index = (SubLObject)cb_system_tools.ZERO_INTEGER; cb_system_tools.NIL != list_var; list_var = list_var.rest(), assertion = list_var.first(), index = Numbers.add((SubLObject)cb_system_tools.ONE_INTEGER, index)) {
                                                    if (!index.isZero()) {
                                                        html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                                                    }
                                                    html_utilities.html_princ_strong((SubLObject)cb_system_tools.$str181$Propagating_Assertion_);
                                                    thread.resetMultipleValues();
                                                    final SubLObject direct_count = cb_assertion_dependency_counts(assertion);
                                                    final SubLObject indirect_count = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (direct_count.isPositive()) {
                                                        html_utilities.html_indent((SubLObject)cb_system_tools.FOUR_INTEGER);
                                                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str182$_A_direct_, direct_count);
                                                        if (indirect_count.isPositive()) {
                                                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str183$and__A_indirect_, indirect_count);
                                                        }
                                                        cb_utilities.cb_link((SubLObject)cb_system_tools.$kw184$ASSERTION_DEPENDENCIES, assertion, (SubLObject)cb_system_tools.$str185$dependencies, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                    }
                                                    html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                                    cb_utilities.cb_show_assertion_readably(assertion, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.T);
                                                }
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            if (cb_system_tools.NIL == agenda.agenda_running() && cb_system_tools.$kw172$HALT == agenda.agenda_error_mode()) {
                                cb_agenda_halt_explanation_display();
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        cb_toggle_agenda_status_display();
                        cb_agenda_error_mode_display();
                        if (cb_system_tools.NIL == operation_queues.local_queue_empty()) {
                            cb_agenda_local_queue_display();
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$78, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$77, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 26637L)
    public static SubLObject cb_assertion_dependency_counts(final SubLObject assertion) {
        final SubLObject dependent_assertion_count = Sequences.length(assertions_interface.all_dependent_assertions(assertion));
        final SubLObject direct_dependent_count;
        final SubLObject dependent_count = direct_dependent_count = assertions_high.assertion_dependent_count(assertion);
        final SubLObject indirect_dependent_count = Numbers.subtract(dependent_assertion_count, direct_dependent_count, (SubLObject)cb_system_tools.ONE_INTEGER);
        return Values.values(direct_dependent_count, indirect_dependent_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 27097L)
    public static SubLObject cb_link_agenda(SubLObject linktext) {
        if (linktext == cb_system_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL == linktext) {
            linktext = (SubLObject)cb_system_tools.$str187$Agenda_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str188$cb_agenda);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 27285L)
    public static SubLObject cb_abort_agenda(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        if (cb_system_tools.NIL == agenda.agenda_running()) {
            return cb_utilities.cb_error((SubLObject)cb_system_tools.$str190$The_agenda_is_no_longer_running_, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        agenda.abort_agenda();
        agenda.wait_for_agenda_not_running((SubLObject)cb_system_tools.THREE_INTEGER);
        cb_agenda((SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 27533L)
    public static SubLObject cb_toggle_agenda_status_display() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str192$cb_toggle_agenda_status, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_hr((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str193$Click_the_button_to_change_your_A);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
            if (cb_system_tools.NIL != agenda.agenda_running()) {
                html_utilities.html_submit_input((SubLObject)cb_system_tools.$str194$Halt_Agenda, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
            }
            else {
                html_utilities.html_submit_input((SubLObject)cb_system_tools.$str195$Start_Agenda, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
            }
            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str196$__For_detailed_help_on_the_Cyc_ag);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str197$_A__A, cyc_system_doc_file(), cb_system_tools.$cyc_system_doc_agenda_index$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_princ((SubLObject)cb_system_tools.$str198$Cyc_Agenda_Documentation);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str171$_);
            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 28175L)
    public static SubLObject cb_toggle_agenda_status(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject runningP = agenda.agenda_running();
        html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str199$Agenda_Process_Changed);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            cb_frames.html_update_cb_status_script();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$87 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (cb_system_tools.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str199$Agenda_Process_Changed);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != runningP) {
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str200$Halting_the_Agenda____);
                        }
                        else {
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str201$Starting_the_Agenda____);
                        }
                        html_utilities.html_flush();
                        if (cb_system_tools.NIL != runningP) {
                            agenda.halt_agenda((SubLObject)cb_system_tools.TWO_INTEGER);
                        }
                        else {
                            agenda.start_agenda((SubLObject)cb_system_tools.TWO_INTEGER);
                        }
                        if (cb_system_tools.NIL != runningP) {
                            agenda.wait_for_agenda_not_running((SubLObject)cb_system_tools.THREE_INTEGER);
                        }
                        else {
                            agenda.wait_for_agenda_running((SubLObject)cb_system_tools.THREE_INTEGER);
                        }
                        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject now_runningP = agenda.agenda_running();
                        if (!runningP.equalp(now_runningP)) {
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str202$Your_Cyc_Agenda_is_now_);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            if (cb_system_tools.NIL != now_runningP) {
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str169$running);
                            }
                            else {
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str170$halted);
                            }
                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        else {
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str203$Your_Cyc_Agenda_is_still_);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            if (cb_system_tools.NIL != now_runningP) {
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str169$running);
                            }
                            else {
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str170$halted);
                            }
                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str204$When_it_finishes_its_current_oper);
                        }
                        cb_utilities.cb_frame_update_message_page_info((SubLObject)cb_system_tools.$str205$Agenda);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$87, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 29520L)
    public static SubLObject cb_agenda_error_mode_display() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = agenda.agenda_error_mode();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str207$cb_agenda_error_mode_handler, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_hr((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_system_tools.$str208$Currently__when_Cyc_encounters_an);
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_system_tools.SEVEN_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            final SubLObject pcase_var = mode;
            if (pcase_var.eql((SubLObject)cb_system_tools.$kw209$IGNORE)) {
                html_utilities.html_princ((SubLObject)cb_system_tools.$str210$Continues__ignoring_the_error_);
            }
            else if (pcase_var.eql((SubLObject)cb_system_tools.$kw172$HALT)) {
                html_utilities.html_princ((SubLObject)cb_system_tools.$str211$Halts_the_Agenda_and_displays_the);
            }
            else if (pcase_var.eql((SubLObject)cb_system_tools.$kw212$DEBUG)) {
                html_utilities.html_princ((SubLObject)cb_system_tools.$str213$Enters_the_debugger_);
            }
            else if (pcase_var.eql((SubLObject)cb_system_tools.$kw214$LOG)) {
                html_utilities.html_princ(PrintLow.format((SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.$str215$Logs_the_error_and_continues_));
                html_utilities.html_br();
                html_utilities.html_indent((SubLObject)cb_system_tools.SEVEN_INTEGER);
                if (cb_system_tools.NIL != agenda.get_agenda_log_file()) {
                    cb_utilities.cb_link((SubLObject)cb_system_tools.$kw216$AGENDA_ERROR_FILE, file_utilities.get_absolute_path_string(agenda.get_agenda_log_file()), (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                }
            }
            else {
                cb_utilities.cb_error((SubLObject)cb_system_tools.$str217$Illegal_state_in_cb_agenda_error_, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)cb_system_tools.$str218$Choose_the_new_error_handling_mod);
            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str219$Submit_New_Mode);
            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str220$__to_initiate_the_change_);
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_radio_input((SubLObject)cb_system_tools.$str221$agenda_error_state, (SubLObject)cb_system_tools.$str222$_ignore, Equality.eq(mode, (SubLObject)cb_system_tools.$kw209$IGNORE), (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)cb_system_tools.$str223$Ignore_and_Continue);
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_radio_input((SubLObject)cb_system_tools.$str221$agenda_error_state, (SubLObject)cb_system_tools.$str224$_halt, Equality.eq(mode, (SubLObject)cb_system_tools.$kw172$HALT), (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)cb_system_tools.$str225$Halt_and_Display_Reason);
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_radio_input((SubLObject)cb_system_tools.$str221$agenda_error_state, (SubLObject)cb_system_tools.$str226$_log, Equality.eq(mode, (SubLObject)cb_system_tools.$kw214$LOG), (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)cb_system_tools.$str227$Log_Errors_to_File);
            html_utilities.html_indent((SubLObject)cb_system_tools.EIGHT_INTEGER);
            html_utilities.html_filename_input((SubLObject)cb_system_tools.$str228$pathname, agenda.get_agenda_log_file(), (SubLObject)cb_system_tools.$int229$60);
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_reset_input((SubLObject)cb_system_tools.$str230$Current_Mode);
            html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
            html_utilities.html_submit_input((SubLObject)cb_system_tools.$str219$Submit_New_Mode, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 31596L)
    public static SubLObject cb_agenda_error_mode_handler(final SubLObject args) {
        final SubLObject previous_mode = agenda.agenda_error_mode();
        final SubLObject selection_string = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str221$agenda_error_state, args);
        final SubLObject log_file = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str228$pathname, args);
        final SubLObject selection = reader.read_from_string_ignoring_errors(selection_string, (SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        agenda.set_agenda_error_mode(selection);
        if (cb_system_tools.NIL != agenda.agenda_logs_errorsP()) {
            if (cb_system_tools.NIL != string_utilities.non_empty_stringP(log_file)) {
                if (cb_system_tools.NIL == agenda.set_agenda_log_file(log_file)) {
                    agenda.set_agenda_error_mode(previous_mode);
                }
            }
            else {
                agenda.set_agenda_error_mode(previous_mode);
            }
        }
        else {
            agenda.clear_agenda_log_file();
        }
        cb_agenda((SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 32423L)
    public static SubLObject cb_agenda_local_queue_display() {
        html_utilities.html_hr((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str48$You_have_);
        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
        html_utilities.html_princ(operation_queues.local_queue_size());
        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str232$_operations_waiting_in_your_local);
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_system_tools.FOUR_INTEGER);
        cb_utilities.cb_link((SubLObject)cb_system_tools.$kw233$SHOW_LOCAL_OPS, (SubLObject)cb_system_tools.$str234$Look_at_the_operations_in_the_loc, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_system_tools.FOUR_INTEGER);
        cb_utilities.cb_link((SubLObject)cb_system_tools.$kw235$DELETE_LOCAL_OPS, (SubLObject)cb_system_tools.$str236$Delete_the_local_queue_, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_system_tools.FOUR_INTEGER);
        cb_utilities.cb_link((SubLObject)cb_system_tools.$kw237$DELETE_LOCAL_AND_RESTART, (SubLObject)cb_system_tools.$str238$Delete_the_local_queue_and_restar, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 33034L)
    public static SubLObject cb_link_agenda_error_file(SubLObject filename) {
        if (filename == cb_system_tools.UNPROVIDED) {
            filename = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str239$cb_agenda_error_file_viewer);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str240$Agenda_Error_File___A, filename);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 33224L)
    public static SubLObject cb_agenda_error_file_viewer(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL != Filesys.probe_file(agenda.get_agenda_log_file())) {
            html_utilities.html_markup(file_utilities.slurp_file(agenda.get_agenda_log_file()));
        }
        else {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str242$Agenda_log_file_empty___S, agenda.get_agenda_log_file());
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 42984L)
    public static SubLObject cb_link_system1(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str244$cb_system);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(text);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 43813L)
    public static SubLObject cb_link_system() {
        cb_utilities.cb_link((SubLObject)cb_system_tools.$kw245$SYSTEM1, (SubLObject)cb_system_tools.$str247$System_, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 44698L)
    public static SubLObject cb_system(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_system_tools.$str252$Cyc_System_Area);
            return (SubLObject)cb_system_tools.NIL;
        }
        operation_communication.possibly_save_transcript_ops();
        html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str253$System_Area);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            cb_frames.html_update_cb_status_script();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$90 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (cb_system_tools.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str253$System_Area);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw250$CB_SYSTEM, (SubLObject)cb_system_tools.$kw145$SELF, (SubLObject)cb_system_tools.$str254$Here_are_your_system_settings_);
                        html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                        cb_show_system_settings();
                        if (cb_system_tools.NIL == ke.cyclist_is_guest()) {
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != system_parameters.$cb_allow_halt_imageP$.getDynamicValue(thread)) {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                cb_utilities.cb_link((SubLObject)cb_system_tools.$kw255$CONFIRM_HALT_CYC, (SubLObject)cb_system_tools.$str256$_Halt_this_image_, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                            }
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_utilities.cb_link((SubLObject)cb_system_tools.$kw257$PROCESS_INSPECTOR, (SubLObject)cb_system_tools.$str258$_Process_Inspector_, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        show_transcript_information();
                        show_queue_information();
                        show_historical_information();
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$90, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 46046L)
    public static SubLObject html_cb_write_image_int(SubLObject default_file) {
        if (default_file == cb_system_tools.UNPROVIDED) {
            default_file = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_hr((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str260$cb_write_image_handler, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str261$Write_image_to_file__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_system_tools.$str262$File_name__);
            html_utilities.html_filename_input((SubLObject)cb_system_tools.$str263$file, default_file, (SubLObject)cb_system_tools.$int264$40);
            html_utilities.html_indent((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_submit_input((SubLObject)cb_system_tools.$str265$Write_image, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_system_tools.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_princ((SubLObject)cb_system_tools.$str266$_Warning__this_may_take_some_time);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 46046L)
    public static SubLObject cb_write_image_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_system_tools.$str267$Write_Image;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$94 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$95 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject file = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str263$file, args);
                        if (cb_system_tools.NIL == file || cb_system_tools.NIL != string_utilities.empty_string_p(file)) {
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str268$Please_enter_a_filename_);
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        else {
                            thread.resetMultipleValues();
                            final SubLObject path = file_utilities.deconstruct_path(file);
                            final SubLObject filename = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject path_string = file_utilities.reconstruct_path(path, (SubLObject)cb_system_tools.$str83$, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL == Filesys.probe_file(path_string)) {
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (cb_system_tools.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_utilities.html_princ(file_utilities.why_not_probe_fileP(path_string));
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            else {
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str269$Writing_to_file__);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ(file);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str270$__);
                                html_utilities.html_flush();
                                Threads.sleep((SubLObject)cb_system_tools.FIVE_INTEGER);
                                Mapper.write_image(file, (SubLObject)cb_system_tools.T);
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str271$__Done_);
                                html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            }
                        }
                        html_cb_write_image_int(file);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$95, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$94, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 47401L)
    public static SubLObject cb_show_system_settings() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_system_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str273$Machine_name__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_indent((SubLObject)cb_system_tools.THREE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(Environment.get_network_name(Environment.get_machine_name((SubLObject)cb_system_tools.$str274$unknown)));
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str275$SubL_implementation__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(Environment.lisp_implementation_type());
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str108$_);
                    html_utilities.html_princ(Environment.lisp_implementation_version());
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str276$Base_TCP_port__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(system_parameters.$base_tcp_port$.getDynamicValue(thread));
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str277$Image_name__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(control_vars.cyc_image_id());
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject pid = Environment.get_process_id((SubLObject)cb_system_tools.UNPROVIDED);
            if (cb_system_tools.NIL != pid) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str278$Image_Process_ID__);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ(pid);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            }
            final SubLObject start_time = numeric_date_utilities.timestring(system_info.cycl_start_time());
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str279$Image_start_time_);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(start_time);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str280$__up__A_, numeric_date_utilities.readable_elapsed_time_string(system_info.cycl_uptime(), (SubLObject)cb_system_tools.ZERO_INTEGER));
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str281$Cyc_revision_level__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(system_info.cyc_revision_string());
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str282$Cyc_code_version__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(misc_utilities.cyc_system_code_string());
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str283$Current_KB__);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(operation_communication.kb_version_string());
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 49706L)
    public static SubLObject show_queue_information() {
        html_utilities.html_hr((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str284$Queue_Information__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str285$Master_Transcript_Operations_Read);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(Numbers.add(operation_communication.kb_op_number(), operation_queues.remote_queue_size()));
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str286$Master_Transcript_Operations_Read);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(operation_queues.remote_queue_size());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str287$Master_Transcript_Operations_Proc);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(operation_communication.remote_ops_processed());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str288$Master_Transcript_Operations_Proc);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(Numbers.subtract(operation_communication.remote_ops_processed(), operation_communication.total_master_transcript_operations_processed()));
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str289$Master_Transcript_Operations_Proc);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(operation_communication.total_master_transcript_operations_processed());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str290$Unprocessed_Local_Queue_Operation);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(operation_queues.local_queue_size());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str291$Local_Queue_Operations_Processed_);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(operation_queues.transcript_queue_size());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str292$Current_Local_Transcript_Operatio);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(operation_queues.local_operation_storage_queue_size());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (operation_communication.total_auxiliary_operations_run().numG((SubLObject)cb_system_tools.ZERO_INTEGER) || operation_queues.auxiliary_queue_size().numG((SubLObject)cb_system_tools.ZERO_INTEGER)) {
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_system_tools.$str293$Unprocessed_auxiliary_queue_opera);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ(operation_queues.auxiliary_queue_size());
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 52025L)
    public static SubLObject show_transcript_information() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_hr((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str294$Transcript_Information_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str295$Master_Transcript___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        final SubLObject total_ops = transcript_utilities.total_master_transcript_operations((SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != transcript_server.use_transcript_server()) {
            html_utilities.html_princ((SubLObject)cb_system_tools.$str296$Maintained_By_Transcript_Server);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str297$___A__A_, system_parameters.$master_transcript_lock_host$.getDynamicValue(thread), system_parameters.$master_transcript_server_port$.getDynamicValue(thread));
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str298$Operations___);
            html_utilities.html_princ(total_ops);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        }
        else {
            if (transcript_utilities.master_transcript().isString()) {
                cb_utilities.cb_link((SubLObject)cb_system_tools.$kw299$READ_TRANS, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
            }
            else {
                html_utilities.html_princ((SubLObject)cb_system_tools.$str300$None);
            }
            if (transcript_utilities.master_transcript().isString()) {
                html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_system_tools.$str301$Characters___);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_princ(file_utilities.get_file_length(transcript_utilities.master_transcript()));
                html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                if (cb_system_tools.NIL != system_parameters.$really_count_transcript_ops$.getDynamicValue(thread)) {
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str298$Operations___);
                }
                else {
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str302$Estimated_Ops___);
                }
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_princ(total_ops);
            }
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str303$Local_Transcript___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (cb_system_tools.NIL != operation_communication.writing_transcriptsP()) {
            cb_utilities.cb_link((SubLObject)cb_system_tools.$kw37$WRITE_TRANS, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        else {
            html_utilities.html_princ((SubLObject)cb_system_tools.$str300$None);
        }
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != operation_communication.writing_transcriptsP()) {
            html_utilities.html_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str298$Operations___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            if (cb_system_tools.NIL != operation_communication.transmittingP()) {
                html_utilities.html_princ(operation_communication.total_local_operations_transmitted());
            }
            else {
                html_utilities.html_princ(operation_queues.local_operation_storage_queue_size());
            }
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 53584L)
    public static SubLObject show_historical_information() {
        html_utilities.html_hr((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str304$Historical_Information_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str305$Remote_Operations_Processed__);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(operation_communication.remote_ops_processed());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str306$Local_Operations_Recorded___);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(operation_communication.total_local_operations_recorded());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str307$Local_Operations_Sent_To_Master_T);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(operation_communication.total_local_operations_transmitted());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (operation_communication.total_auxiliary_operations_run().numG((SubLObject)cb_system_tools.ZERO_INTEGER)) {
            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_system_tools.$str308$Auxiliary_Queue_Operations_Proces);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ(operation_communication.total_auxiliary_operations_run());
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 54351L)
    public static SubLObject cb_link_read_trans() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filename = Eval.eval(conses_high.second(conses_high.assoc((SubLObject)cb_system_tools.$str309$read, cb_parameters.$transcript_file_shorthand$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)cb_system_tools.$sym310$STRING_EQUAL), (SubLObject)cb_system_tools.UNPROVIDED)));
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str311$cb_system_ready_transcript_file_r);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(filename);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_transcript_stats_link(filename);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 54911L)
    public static SubLObject cb_link_write_trans() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filename = Eval.eval(conses_high.second(conses_high.assoc((SubLObject)cb_system_tools.$str313$write, cb_parameters.$transcript_file_shorthand$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)cb_system_tools.$sym310$STRING_EQUAL), (SubLObject)cb_system_tools.UNPROVIDED)));
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str50$cb_system_ready_transcript_file_w);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(filename);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_transcript_stats_link(filename);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 55459L)
    public static SubLObject cb_link_view_transcript(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str315$cb_system_ready_transcript_file__, filename);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(file_utilities.normal_pathstring(filename));
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_transcript_stats_link(filename);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 55804L)
    public static SubLObject html_transcript_stats_link(final SubLObject transcript_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (transcript_filename.isString()) {
            html_utilities.html_indent((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            html_utilities.html_princ((SubLObject)cb_system_tools.$str318$cb_transcript_viewer_handler_);
            html_utilities.html_princ(Sequences.cconcatenate((SubLObject)cb_system_tools.$str319$stats_, transcript_filename));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            if (cb_system_tools.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_princ((SubLObject)cb_system_tools.$str320$_Stats_);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 56116L)
    public static SubLObject cb_system_ready_transcript_file(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject filename = args.first();
        if (cb_system_tools.NIL != conses_high.assoc(filename, cb_parameters.$transcript_file_shorthand$.getDynamicValue(thread), (SubLObject)cb_system_tools.$sym321$STRING_, (SubLObject)cb_system_tools.UNPROVIDED)) {
            filename = Eval.eval(conses_high.second(conses_high.assoc(filename, cb_parameters.$transcript_file_shorthand$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)cb_system_tools.$sym310$STRING_EQUAL), (SubLObject)cb_system_tools.UNPROVIDED)));
        }
        cb_system_get_transcript(filename);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 57082L)
    public static SubLObject cb_system_get_transcript(final SubLObject filename) {
        SubLObject count = (SubLObject)cb_system_tools.ZERO_INTEGER;
        SubLObject ops = (SubLObject)cb_system_tools.NIL;
        if (filename.isString() && cb_system_tools.NIL != Filesys.probe_file(filename)) {
            SubLObject stream = (SubLObject)cb_system_tools.NIL;
            try {
                stream = compatibility.open_text(filename, (SubLObject)cb_system_tools.$kw323$INPUT);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)cb_system_tools.$str324$Unable_to_open__S, filename);
                }
                SubLObject str;
                SubLObject expr;
                for (str = stream, expr = (SubLObject)cb_system_tools.NIL, expr = reader.read_ignoring_errors(str, (SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.NIL); cb_system_tools.NIL != expr; expr = reader.read_ignoring_errors(str, (SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.NIL)) {
                    ops = (SubLObject)ConsesLow.cons(expr, ops);
                    count = Numbers.add(count, (SubLObject)cb_system_tools.ONE_INTEGER);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cb_system_tools.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            ops = Sequences.nreverse(ops);
        }
        cb_system_show_specific_transcript_file(filename, count, ops);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 57924L)
    public static SubLObject cb_system_show_specific_transcript_file(final SubLObject name, final SubLObject count, final SubLObject ops) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_system_tools.$str327$File_Contents__Transcript_File;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$135 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$136 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$139 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw325$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            final SubLObject href = PrintLow.format((SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.$str328$cg_cb_system_show_specific_transc, name);
                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(href);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$140 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str329$View_Transcript_in_KE_Text_format);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$140, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str330$File__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            cb_utilities.cb_link((SubLObject)cb_system_tools.$kw316$VIEW_TRANSCRIPT, name, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str331$Operations__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_princ(count);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            if (name.isString()) {
                                if (cb_system_tools.NIL != Filesys.probe_file(name) && count.numG((SubLObject)cb_system_tools.ZERO_INTEGER)) {
                                    html_macros.verify_not_within_html_pre();
                                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$141 = html_macros.$within_html_pre$.currentBinding(thread);
                                    try {
                                        html_macros.$within_html_pre$.bind((SubLObject)cb_system_tools.T, thread);
                                        SubLObject cdolist_list_var = ops;
                                        SubLObject expr = (SubLObject)cb_system_tools.NIL;
                                        expr = cdolist_list_var.first();
                                        while (cb_system_tools.NIL != cdolist_list_var) {
                                            cb_utilities.cb_form(cb_transform_operation_for_display(expr), (SubLObject)cb_system_tools.ZERO_INTEGER, (SubLObject)cb_system_tools.T);
                                            html_utilities.html_terpri((SubLObject)cb_system_tools.TWO_INTEGER);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            expr = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_$141, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                }
                                else {
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_system_tools.$str332$No_operations_have_been_saved_yet);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_princ(name);
                                }
                            }
                            else {
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str333$_s_is_not_a_pathname_string_, name);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$139, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$136, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$135, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 59250L)
    public static SubLObject cb_transform_operation_for_display(SubLObject expression) {
        expression = encapsulation.unencapsulate_partial(expression);
        expression = canon_tl.tl_var_to_el_var_transform(expression);
        expression = canon_tl.tl_nart_transform(expression);
        return expression;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 59720L)
    public static SubLObject cb_choose_project(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject purpose = fi.ke_purpose();
        final SubLObject title_var = (SubLObject)cb_system_tools.$str336$Choose_KE_Project;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$142 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$143 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$145, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$146 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str337$cb_choose_project_handler, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw334$CB_CHOOSE_PROJECT, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str338$Choose_your_project_from_the_opti);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            SubLObject project_list = ongoing_cyc_projects();
                            project_list = kb_utilities.sort_terms(project_list, (SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_system_tools.THREE_INTEGER);
                            html_utilities.html_radio_input((SubLObject)cb_system_tools.$str339$project, (SubLObject)cb_system_tools.NIL, Types.sublisp_null(purpose), (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str340$No_Project_Selected);
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            SubLObject cdolist_list_var = project_list;
                            SubLObject project = (SubLObject)cb_system_tools.NIL;
                            project = cdolist_list_var.first();
                            while (cb_system_tools.NIL != cdolist_list_var) {
                                html_utilities.html_indent((SubLObject)cb_system_tools.THREE_INTEGER);
                                html_utilities.html_radio_input((SubLObject)cb_system_tools.$str339$project, project, Equality.eq(purpose, project), (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                                cb_utilities.cb_form(project, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                project = cdolist_list_var.first();
                            }
                            html_utilities.html_reset_input((SubLObject)cb_system_tools.$str341$Reset);
                            html_utilities.html_submit_input((SubLObject)cb_system_tools.$str22$Submit, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$146, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$144, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$143, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$142, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 60803L)
    public static SubLObject ongoing_cyc_projects() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject projects = (SubLObject)cb_system_tools.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(cb_system_tools.$const343$EverythingPSC);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            projects = conses_high.intersection(isa.all_fort_instances(cb_system_tools.$const73$Cyc_BasedProject, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), isa.all_fort_instances(cb_system_tools.$const344$OngoingStatus, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return projects;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 61225L)
    public static SubLObject cb_choose_project_handler(final SubLObject args) {
        final SubLObject project = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str339$project, args);
        if (project.equal((SubLObject)cb_system_tools.$str345$nil)) {
            fi.set_ke_purpose((SubLObject)cb_system_tools.NIL);
        }
        else {
            fi.set_ke_purpose(cb_utilities.cb_guess_fort(project, (SubLObject)cb_system_tools.UNPROVIDED));
        }
        cb_tools.html_update_cb_toolbar_script();
        cb_utilities.cb_message_page_with_history((SubLObject)cb_system_tools.$str346$Project_has_been_changed_, (SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 61628L)
    public static SubLObject cb_link_choose_project(SubLObject linktext) {
        if (linktext == cb_system_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL == linktext) {
            linktext = (SubLObject)cb_system_tools.$str348$Current_Project;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str349$cb_choose_project);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 61891L)
    public static SubLObject cb_authenticate_the_cyclist(final SubLObject user, final SubLObject passphrase) {
        operation_communication.authenticate_the_cyclist(user, passphrase, cb_system_tools.$const352$CycBrowser);
        return cb_after_login_events();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 62195L)
    public static SubLObject cb_set_the_cyclist(final SubLObject user) {
        operation_communication.set_the_cyclist(user);
        return cb_after_login_events();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 62349L)
    public static SubLObject cb_after_login_events() {
        final SubLObject user = operation_communication.the_cyclist();
        if (cb_system_tools.NIL == operation_communication.the_cyclist_is_guestP()) {
            final SubLObject projects = cb_login_find_default_projects_for_cyclist(user);
            fi.set_ke_purpose(projects.first());
            cb_tools.load_user_preferences();
        }
        return user;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 62714L)
    public static SubLObject cb_login_find_default_projects_for_cyclist(final SubLObject cyclist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)cb_system_tools.NIL;
        final SubLObject _prev_bind_0 = control_vars.$cache_inference_results$.currentBinding(thread);
        try {
            control_vars.$cache_inference_results$.bind((SubLObject)cb_system_tools.NIL, thread);
            results = ask_utilities.query_template((SubLObject)cb_system_tools.$sym353$_PROJECT, (SubLObject)ConsesLow.listS(cb_system_tools.$const354$cyclistPrimaryProject, cyclist, (SubLObject)cb_system_tools.$list355), cb_system_tools.$const343$EverythingPSC, (SubLObject)cb_system_tools.$list356);
        }
        finally {
            control_vars.$cache_inference_results$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 63248L)
    public static SubLObject note_image_purpose(final SubLObject purpose) {
        cb_system_tools.$image_purpose$.setDynamicValue(purpose);
        return purpose;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 63389L)
    public static SubLObject cb_login(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject attempted_name = html_utilities.html_extract_value((SubLObject)cb_system_tools.$str359$new_login_name, args, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject bad_passwordP = Types.stringp(attempted_name);
        final SubLObject title_var = (SubLObject)cb_system_tools.$str360$Login_Area;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$147 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw10$SAM_AUTOCOMPLETE_CSS);
                cyc_file_dependencies.javascript((SubLObject)cb_system_tools.$kw11$SHA1);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$148 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$150, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str361$cb_login_handler, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw357$CB_LOGIN, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != cb_system_tools.$image_purpose$.getDynamicValue(thread)) {
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str362$This_image_has_been_designated__);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ(cb_system_tools.$image_purpose$.getDynamicValue(thread));
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            }
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str363$You_are_currently_logged_in_as_);
                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                            cb_utilities.cb_form(operation_communication.the_cyclist(), (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str171$_);
                            html_utilities.html_hr((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str364$Click_);
                            cb_utilities.cb_link((SubLObject)cb_system_tools.$kw365$LOGOUT, (SubLObject)cb_system_tools.$str366$here, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str367$_to_logout_now_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str368$Type_in_your_new_login_name_below);
                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str22$Submit);
                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str369$__button_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != operation_communication.image_requires_authenticationP()) {
                                html_utilities.html_user_id_and_password((SubLObject)cb_system_tools.$str359$new_login_name, (SubLObject)cb_system_tools.$str370$new_login_hashed_password, (SubLObject)cb_system_tools.$str371$Cyclist, (SubLObject)cb_system_tools.$str372$Password, attempted_name, bad_passwordP);
                            }
                            else {
                                cb_unauthenticated_login_pane((SubLObject)cb_system_tools.$str359$new_login_name);
                            }
                            final SubLObject purpose = fi.ke_purpose();
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            cb_utilities.cb_link((SubLObject)cb_system_tools.$kw350$CHOOSE_PROJECT, (SubLObject)cb_system_tools.$str348$Current_Project, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str373$___);
                            if (cb_system_tools.NIL != purpose) {
                                cb_utilities.cb_form(purpose, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            else {
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str340$No_Project_Selected);
                            }
                            html_utilities.html_newline((SubLObject)cb_system_tools.THREE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str374$The_following_are_currently_logge);
                            html_utilities.html_princ(Environment.get_network_name((SubLObject)cb_system_tools.$str274$unknown));
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str375$_);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            final SubLObject user_list = html_kernel.html_interface_users();
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.FIVE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$152 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_underlined_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str376$User);
                                        html_utilities.html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$154, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_underlined_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str377$Local_Machine);
                                        html_utilities.html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$155, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    SubLObject cdolist_list_var = user_list;
                                    SubLObject a_user = (SubLObject)cb_system_tools.NIL;
                                    a_user = cdolist_list_var.first();
                                    while (cb_system_tools.NIL != cdolist_list_var) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$156 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                            SubLObject current;
                                            final SubLObject datum = current = a_user;
                                            SubLObject machine_name = (SubLObject)cb_system_tools.NIL;
                                            SubLObject user_name = (SubLObject)cb_system_tools.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_system_tools.$list378);
                                            machine_name = current.first();
                                            current = current.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_system_tools.$list378);
                                            user_name = current.first();
                                            current = current.rest();
                                            if (cb_system_tools.NIL == current) {
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$157 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                                    cb_utilities.cb_form(user_name, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$157, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                if (cb_system_tools.NIL != web_utilities.current_html_cyc_login_session_idP(machine_name)) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                                        html_utilities.html_princ(web_utilities.cyc_login_session_id_machine_name(machine_name));
                                                        html_utilities.html_indent((SubLObject)cb_system_tools.UNPROVIDED);
                                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str379$_Session_id__);
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ(machine_name);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                        html_utilities.html_indent((SubLObject)cb_system_tools.UNPROVIDED);
                                                        cb_utilities.cb_link((SubLObject)cb_system_tools.$kw380$FORCE_LOGOUT, machine_name, (SubLObject)cb_system_tools.$str381$_Force_Logout_, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str382$_);
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$158, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                else {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                                        html_utilities.html_princ(machine_name);
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$159, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$160 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                                    if (machine_name.equal(html_kernel.http_state_key_for_request())) {
                                                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                                        html_utilities.html_indent((SubLObject)cb_system_tools.UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                        html_utilities.html_glyph((SubLObject)cb_system_tools.$kw383$LARR, (SubLObject)cb_system_tools.UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str384$_you);
                                                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                                    }
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$160, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_system_tools.$list378);
                                            }
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$156, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        a_user = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$153, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$152, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            if (cb_system_tools.NIL == list_utilities.lengthL(html_kernel.html_interface_users(), (SubLObject)cb_system_tools.TWO_INTEGER, (SubLObject)cb_system_tools.UNPROVIDED)) {
                                html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                                cb_utilities.cb_link((SubLObject)cb_system_tools.$kw385$NOTIFY_ALL_USERS, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$151, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$149, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$148, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$147, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 66728L)
    public static SubLObject cb_force_logout(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLObject session_id = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str387$sessionId, args);
        final SubLObject logout_result = (SubLObject)((cb_system_tools.NIL != html_kernel.clear_html_state_for_machine(session_id)) ? cb_system_tools.$kw388$SUCCESS : cb_system_tools.$kw389$FAILURE);
        web_utilities.destroy_cyc_login_session(session_id);
        cb_login((SubLObject)cb_system_tools.UNPROVIDED);
        return logout_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 67028L)
    public static SubLObject cb_link_force_logout(final SubLObject session_id, SubLObject linktext) {
        if (linktext == cb_system_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL == linktext) {
            linktext = session_id;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str391$_a_sessionId__a, (SubLObject)cb_system_tools.$str392$cb_force_logout, session_id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 67268L)
    public static SubLObject cb_unauthenticated_login_pane(final SubLObject user_id_field) {
        html_complete.html_complete_button(user_id_field, (SubLObject)cb_system_tools.$str394$Complete, cb_system_tools.$const395$HumanCyclist, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_text_input(user_id_field, (SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.$int396$27);
        html_utilities.html_indent((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_reset_input((SubLObject)cb_system_tools.$str397$Clear);
        html_utilities.html_indent((SubLObject)cb_system_tools.UNPROVIDED);
        html_utilities.html_submit_input((SubLObject)cb_system_tools.$str22$Submit, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 67561L)
    public static SubLObject cb_link_notify_all_users() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str398$cb_notify_all_users);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ((SubLObject)cb_system_tools.$str399$Send_Email_to_all_Users);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 67715L)
    public static SubLObject cb_notify_all_users(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_system_tools.$str401$Mail_all_users;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$161 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$162 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$163 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$164 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$164, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str402$Please_enter_the_message_you_wish);
                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$165 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str403$cb_send_email_to_selected_users, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$166 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                cb_notify_users_draw_header();
                                SubLObject rows_count = (SubLObject)cb_system_tools.ZERO_INTEGER;
                                SubLObject cdolist_list_var = Sequences.remove_duplicates(html_kernel.html_interface_users(), Symbols.symbol_function((SubLObject)cb_system_tools.EQL), Symbols.symbol_function((SubLObject)cb_system_tools.$sym407$SECOND), (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                SubLObject user_entry = (SubLObject)cb_system_tools.NIL;
                                user_entry = cdolist_list_var.first();
                                while (cb_system_tools.NIL != cdolist_list_var) {
                                    SubLObject current;
                                    final SubLObject datum = current = user_entry;
                                    SubLObject machine_name = (SubLObject)cb_system_tools.NIL;
                                    SubLObject user = (SubLObject)cb_system_tools.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_system_tools.$list404);
                                    machine_name = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_system_tools.$list404);
                                    user = current.first();
                                    current = current.rest();
                                    if (cb_system_tools.NIL == current) {
                                        if (!user.eql(operation_communication.the_cyclist()) && !user.eql(cb_system_tools.$const405$Guest)) {
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$167 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$168 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                                    if (rows_count.isZero()) {
                                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str406$To_);
                                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                    }
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$168, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                cb_notify_users_draw_one_user(user);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$167, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                                            rows_count = Numbers.add(rows_count, (SubLObject)cb_system_tools.ONE_INTEGER);
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_system_tools.$list404);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    user_entry = cdolist_list_var.first();
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$169 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$170 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str408$From__);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$170, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    cb_notify_users_draw_one_user(operation_communication.the_cyclist());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$169, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$171 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$172 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str409$Subject__);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$172, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_system_tools.THREE_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw31$LEFT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$173 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_system_tools.ZERO_INTEGER);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$174 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                            html_utilities.html_text_input((SubLObject)cb_system_tools.$str410$subject, (SubLObject)cb_system_tools.$str83$, (SubLObject)cb_system_tools.$int411$72);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$174, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$173, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$171, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$175 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$176 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str412$Message__);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$176, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_system_tools.THREE_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw31$LEFT));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$177 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_system_tools.$str17$message);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_system_tools.$int411$72);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_system_tools.FIVE_INTEGER);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$178 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$178, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$177, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$175, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$166, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_submit_input((SubLObject)cb_system_tools.$str413$Send_Email, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$165, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$163, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$162, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$161, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 69596L)
    public static SubLObject cb_notify_users_draw_one_user(final SubLObject user) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            cb_utilities.cb_form(user, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(preferred_email_address_for_user(user));
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            final SubLObject input = cb_notify_users_generate_exclusion_mark_from_user(user);
            html_utilities.html_checkbox_input(input, (SubLObject)cb_system_tools.$str415$exclude, (SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return user;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 69934L)
    public static SubLObject cb_notify_users_draw_header() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$179 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$179, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$180 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_system_tools.$str376$User);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$180, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$181 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_system_tools.$str416$Email_Address);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$181, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$182 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_system_tools.$str417$Exclude_);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$182, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70256L)
    public static SubLObject clear_cb_notify_users_generate_exclusion_mark_from_user() {
        final SubLObject cs = cb_system_tools.$cb_notify_users_generate_exclusion_mark_from_user_caching_state$.getGlobalValue();
        if (cb_system_tools.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70256L)
    public static SubLObject remove_cb_notify_users_generate_exclusion_mark_from_user(final SubLObject user) {
        return memoization_state.caching_state_remove_function_results_with_args(cb_system_tools.$cb_notify_users_generate_exclusion_mark_from_user_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(user), (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70256L)
    public static SubLObject cb_notify_users_generate_exclusion_mark_from_user_internal(final SubLObject user) {
        return Sequences.cconcatenate((SubLObject)cb_system_tools.$str419$exclude_, kb_paths.fort_name(user));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70256L)
    public static SubLObject cb_notify_users_generate_exclusion_mark_from_user(final SubLObject user) {
        SubLObject caching_state = cb_system_tools.$cb_notify_users_generate_exclusion_mark_from_user_caching_state$.getGlobalValue();
        if (cb_system_tools.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_system_tools.$sym418$CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER, (SubLObject)cb_system_tools.$sym420$_CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER_CACHING_STATE_, (SubLObject)cb_system_tools.NIL, (SubLObject)cb_system_tools.EQ, (SubLObject)cb_system_tools.ONE_INTEGER, (SubLObject)cb_system_tools.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, user, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cb_notify_users_generate_exclusion_mark_from_user_internal(user)));
            memoization_state.caching_state_put(caching_state, user, results, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70400L)
    public static SubLObject preferred_email_address_for_user(final SubLObject user) {
        SubLObject result = (SubLObject)cb_system_tools.NIL;
        result = ask_utilities.ask_variable((SubLObject)cb_system_tools.$kw421$ADDRESS, (SubLObject)ConsesLow.listS(cb_system_tools.$const422$preferredEMailAddressText, user, (SubLObject)cb_system_tools.$list423), cb_system_tools.$const424$CyclistsMt, (SubLObject)cb_system_tools.ZERO_INTEGER, (SubLObject)cb_system_tools.ONE_INTEGER, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL == result) {
            return (SubLObject)cb_system_tools.$str274$unknown;
        }
        return result.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70689L)
    public static SubLObject cb_send_email_to_selected_users(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str17$message, args);
        final SubLObject subject = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str410$subject, args);
        SubLObject recipients = (SubLObject)cb_system_tools.NIL;
        final SubLObject title_var = (SubLObject)cb_system_tools.$str425$Sending_Message;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$183 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$184 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$185 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$186 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$186, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str426$Sending_message_with_following_co);
                        html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.ZERO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$187 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$188 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$189 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_system_tools.$str427$Subject);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$189, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw31$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$190 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_macros.verify_not_within_html_pre();
                                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$191 = html_macros.$within_html_pre$.currentBinding(thread);
                                    try {
                                        html_macros.$within_html_pre$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_princ(subject);
                                    }
                                    finally {
                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_$191, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$190, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$188, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$192 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw62$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$193 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_system_tools.$str428$Message_);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$193, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw31$LEFT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$194 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_macros.verify_not_within_html_pre();
                                    html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$195 = html_macros.$within_html_pre$.currentBinding(thread);
                                    try {
                                        html_macros.$within_html_pre$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_princ(message);
                                    }
                                    finally {
                                        html_macros.$within_html_pre$.rebind(_prev_bind_0_$195, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$194, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$192, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$187, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str429$Sending_Log);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$196 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            SubLObject cdolist_list_var = html_kernel.html_interface_users();
                            SubLObject user_entry = (SubLObject)cb_system_tools.NIL;
                            user_entry = cdolist_list_var.first();
                            while (cb_system_tools.NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = user_entry;
                                SubLObject machine = (SubLObject)cb_system_tools.NIL;
                                SubLObject user = (SubLObject)cb_system_tools.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_system_tools.$list430);
                                machine = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_system_tools.$list430);
                                user = current.first();
                                current = current.rest();
                                if (cb_system_tools.NIL == current) {
                                    final SubLObject exclude_mark = cb_notify_users_generate_exclusion_mark_from_user(user);
                                    if (cb_system_tools.NIL != html_utilities.html_extract_input(exclude_mark, args)) {
                                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$197 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                            html_utilities.html_princ((SubLObject)cb_system_tools.$str431$Excluding_user_);
                                            cb_utilities.cb_form(user, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$197, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                    }
                                    else {
                                        recipients = (SubLObject)ConsesLow.cons(user, recipients);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_system_tools.$list430);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                user_entry = cdolist_list_var.first();
                            }
                            final SubLObject from = preferred_email_address_for_user(operation_communication.the_cyclist());
                            SubLObject cdolist_list_var2 = recipients;
                            SubLObject recipient = (SubLObject)cb_system_tools.NIL;
                            recipient = cdolist_list_var2.first();
                            while (cb_system_tools.NIL != cdolist_list_var2) {
                                final SubLObject to = preferred_email_address_for_user(recipient);
                                thread.resetMultipleValues();
                                final SubLObject message_sent_p = mail_utilities.mail_message(from, to, message, subject, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject error_message = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (cb_system_tools.NIL != message_sent_p) {
                                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$198 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str432$Sent_message_to_);
                                        cb_utilities.cb_form(recipient, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$198, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                }
                                else {
                                    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$199 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        final SubLObject color_val = html_macros.$html_color_lighter_red$.getGlobalValue();
                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (cb_system_tools.NIL != color_val) {
                                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(color_val));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        }
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$200 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                            html_utilities.html_princ((SubLObject)cb_system_tools.$str433$Error_on_sending_message_to_);
                                            cb_utilities.cb_form(recipient, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                            html_utilities.html_princ((SubLObject)cb_system_tools.$str373$___);
                                            html_utilities.html_princ(error_message);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$200, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$199, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                recipient = cdolist_list_var2.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$196, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$185, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$184, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$183, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return args;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 73084L)
    public static SubLObject cb_link_login(SubLObject linktext) {
        if (linktext == cb_system_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL == linktext) {
            linktext = (SubLObject)cb_system_tools.$str435$Login_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str436$cb_login);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 73275L)
    public static SubLObject cb_login_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject input_name = string_utilities.trim_whitespace(html_utilities.html_extract_value((SubLObject)cb_system_tools.$str359$new_login_name, args, (SubLObject)cb_system_tools.$str83$));
        final SubLObject hashed_password = html_utilities.html_extract_value((SubLObject)cb_system_tools.$str370$new_login_hashed_password, args, (SubLObject)cb_system_tools.$str83$);
        final SubLObject login_result = cyc_login(input_name, hashed_password);
        if (login_result == cb_system_tools.$kw388$SUCCESS) {
            if (cb_system_tools.NIL == possibly_redirect(args)) {
                cb_login_known_cyclist();
            }
            return (SubLObject)cb_system_tools.NIL;
        }
        if (cb_system_tools.NIL != operation_communication.image_requires_authenticationP()) {
            cb_login(args);
            return (SubLObject)cb_system_tools.NIL;
        }
        final SubLObject dwimmed_cyclist = dwim_cyclist_name_to_cyclist(input_name);
        if (cb_system_tools.NIL != dwimmed_cyclist) {
            cb_set_the_cyclist(dwimmed_cyclist);
            if (cb_system_tools.NIL == possibly_redirect(args)) {
                cb_login_known_cyclist();
            }
            return (SubLObject)cb_system_tools.NIL;
        }
        final SubLObject login_name = (Sequences.length(input_name).numG((SubLObject)cb_system_tools.ZERO_INTEGER) && (cb_system_tools.NIL != Sequences.find((SubLObject)Characters.CHAR_space, input_name, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED) || cb_system_tools.NIL != Characters.lower_case_p(Strings.sublisp_char(input_name, (SubLObject)cb_system_tools.ZERO_INTEGER)))) ? cyc_navigator_internals.make_ok_cyclist_name(input_name) : input_name;
        final SubLObject constant = fi.fi_find_int(login_name);
        if (login_name.isString() && cb_system_tools.NIL != constant_completion_high.valid_constant_name_p(login_name)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_system_tools.$sym439$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(cb_system_tools.$const343$EverythingPSC, thread);
                if (cb_system_tools.NIL != constant && cb_system_tools.NIL != kb_accessors.human_cyclistP(constant)) {
                    cb_set_the_cyclist(constant);
                    if (cb_system_tools.NIL == possibly_redirect(args)) {
                        cb_login_known_cyclist();
                    }
                }
                else if (cb_system_tools.NIL != constant && cb_system_tools.NIL == kb_accessors.human_cyclistP(constant)) {
                    cb_login_used_constant(constant);
                }
                else {
                    cb_login_unknown_cyclist(login_name);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cb_login(args);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 75576L)
    public static SubLObject dwim_cyclist_name_to_cyclist(final SubLObject input_name) {
        final SubLObject candidates = cb_frames.terms_for_browsing(input_name, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject cyclists = list_utilities.remove_if_not((SubLObject)cb_system_tools.$sym441$HUMAN_CYCLIST_, candidates, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)((cb_system_tools.NIL != list_utilities.singletonP(cyclists)) ? cyclists.first() : cb_system_tools.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 75811L)
    public static SubLObject cyc_login(final SubLObject input_name, SubLObject hashed_password) {
        if (hashed_password == cb_system_tools.UNPROVIDED) {
            hashed_password = (SubLObject)cb_system_tools.NIL;
        }
        if (cb_system_tools.NIL != operation_communication.non_guest_cyclist_nameP(input_name)) {
            if (cb_system_tools.NIL != operation_communication.image_requires_authenticationP()) {
                cb_authenticate_the_cyclist(input_name, hashed_password);
            }
            else {
                cb_set_the_cyclist(input_name);
            }
            if (cb_system_tools.NIL == operation_communication.the_cyclist_is_guestP()) {
                return (SubLObject)cb_system_tools.$kw388$SUCCESS;
            }
        }
        return (SubLObject)cb_system_tools.$kw389$FAILURE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 76195L)
    public static SubLObject possibly_redirect(final SubLObject args) {
        final SubLObject redirect_fn_string = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str442$redirect_handler, args);
        final SubLObject new_arg_start = Sequences.position((SubLObject)cb_system_tools.$str442$redirect_handler, args, Symbols.symbol_function((SubLObject)cb_system_tools.EQUALP), (SubLObject)cb_system_tools.$sym443$FIRST_LIST, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != redirect_fn_string) {
            final SubLObject redirect_fn = reader.read_from_string_ignoring_errors(redirect_fn_string, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
            if (cb_system_tools.NIL != html_macros.html_handler_functionP(redirect_fn)) {
                Functions.funcall(redirect_fn, conses_high.nthcdr(number_utilities.f_1X(new_arg_start), args));
                return (SubLObject)cb_system_tools.T;
            }
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 76633L)
    public static SubLObject first_list(final SubLObject obj) {
        if (cb_system_tools.NIL != list_utilities.proper_list_p(obj)) {
            return obj.first();
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 76802L)
    public static SubLObject cb_login_used_constant(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_system_tools.$str444$Known_Constant;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$201 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$202 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$203 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$204 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$204, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$205 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_back_button((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str445$The_name_you_typed_in__);
                            cb_utilities.cb_form(constant, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str446$_is_already_used_in_the_Knowledge);
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str447$Please_go_back_and_try_a_differen);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$205, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$203, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$202, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$201, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 77332L)
    public static SubLObject cb_login_known_cyclist() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_events.cb_post_login_event(operation_communication.the_cyclist());
        html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str448$Successful_Login);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            cb_tools.html_update_cb_toolbar_script();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$206 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (cb_system_tools.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$207 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str448$Successful_Login);
                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str449$Welcome__);
                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_utilities.html_princ(cb_user_address_string(operation_communication.the_cyclist()));
                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str450$_);
                    html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                    final SubLObject project = fi.ke_purpose();
                    if (cb_system_tools.NIL != project) {
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str451$Your_project_has_been_set_to_);
                        cb_utilities.cb_form(project, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str171$_);
                        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$208 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str349$cb_choose_project, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_system_tools.$str452$Change_Project, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$208, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    }
                    else {
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str453$Your_project_is_currently_not_set);
                        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$209 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str349$cb_choose_project, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_system_tools.$str454$Choose_Project, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$209, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$210 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        cb_utilities.cb_frame_update_message_page_info((SubLObject)cb_system_tools.$str455$Login);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_5, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_4, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$210, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$207, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$206, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 78755L)
    public static SubLObject cb_user_address_string(SubLObject user) {
        if (user == cb_system_tools.UNPROVIDED) {
            user = operation_communication.the_cyclist();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = (SubLObject)cb_system_tools.NIL;
        if (cb_system_tools.NIL != kb_control_vars.lexicon_kb_loaded_p()) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding(thread);
            try {
                pph_vars.$pph_demerit_cutoff$.bind((SubLObject)cb_system_tools.ONE_INTEGER, thread);
                pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                final SubLObject titles = ask_utilities.query_variable((SubLObject)cb_system_tools.$sym457$_TITLE, (SubLObject)ConsesLow.listS(cb_system_tools.$const458$titleOfPerson, user, (SubLObject)cb_system_tools.$list459), cb_system_tools.$const460$InferencePSC, (SubLObject)cb_system_tools.UNPROVIDED);
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
                for (doneP = (SubLObject)cb_system_tools.NIL, rest = (SubLObject)cb_system_tools.NIL, rest = cb_system_tools.$cb_address_titles$.getGlobalValue(); cb_system_tools.NIL == doneP && cb_system_tools.NIL != rest; rest = rest.rest()) {
                    cons = rest.first();
                    datum = (current = cons);
                    known_title = (SubLObject)cb_system_tools.NIL;
                    prefix_string = (SubLObject)cb_system_tools.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_system_tools.$list461);
                    known_title = current.first();
                    current = (prefix_string = current.rest());
                    if (cb_system_tools.NIL != subl_promotions.memberP(known_title, titles, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED)) {
                        target_pred = (known_title.eql(cb_system_tools.$const462$Sir) ? cb_system_tools.$const463$givenNames : cb_system_tools.$const464$familyName);
                        thread.resetMultipleValues();
                        family_name = pph_main.generate_text_wXsentential_force(user, (SubLObject)cb_system_tools.$kw465$NONE, (SubLObject)ConsesLow.list(target_pred), (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                        pred = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (cb_system_tools.NIL != family_name && cb_system_tools.NIL != genl_predicates.genl_predicateP(pred, target_pred, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED)) {
                            string = Sequences.cconcatenate(prefix_string, new SubLObject[] { cb_system_tools.$str108$_, family_name });
                        }
                        doneP = (SubLObject)cb_system_tools.T;
                    }
                }
                if (cb_system_tools.NIL == string) {
                    thread.resetMultipleValues();
                    final SubLObject given_name = pph_main.generate_text_wXsentential_force(user, (SubLObject)cb_system_tools.$kw465$NONE, (SubLObject)cb_system_tools.$list466, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject pred2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (cb_system_tools.NIL != given_name && cb_system_tools.NIL != genl_predicates.genl_predicateP(pred2, cb_system_tools.$const463$givenNames, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED)) {
                        string = given_name;
                    }
                }
            }
            finally {
                pph_vars.$pph_language_mt$.rebind(_prev_bind_2, thread);
                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
            }
        }
        if (cb_system_tools.NIL == string) {
            string = cb_utilities.cb_string_for_term(user);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 80017L)
    public static SubLObject cb_login_unknown_cyclist(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_system_tools.$str467$Unknown_Cyclist;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$211 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$212 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$213 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$214 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$214, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$215 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str468$cb_create_new_cyclist, name, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str469$The_name_);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ(name);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str470$_is_not_the_name_of_a_known_);
                            cb_utilities.cb_form(cb_system_tools.$const395$HumanCyclist, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str171$_);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            if (cb_system_tools.NIL == ke.cyclist_is_guest()) {
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str471$Do_you_want_to_create_a_new_Cyc_c);
                                html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                                cb_utilities.cb_back_button((SubLObject)cb_system_tools.$kw145$SELF, (SubLObject)cb_system_tools.$str65$No);
                                html_utilities.html_submit_input((SubLObject)cb_system_tools.$str472$Yes__Create_Cyclist, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$215, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$213, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$212, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$211, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 80888L)
    public static SubLObject cb_create_new_cyclist(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_system_tools.$str473$creating_new_cyclists);
            return (SubLObject)cb_system_tools.NIL;
        }
        final SubLObject name = args.first();
        if (cb_system_tools.NIL != name) {
            final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
            try {
                api_control_vars.$use_local_queueP$.bind((SubLObject)cb_system_tools.NIL, thread);
                final SubLObject constant = ke.ke_create(name);
                ke.ke_assert((SubLObject)ConsesLow.listS(cb_system_tools.$const474$isa, constant, (SubLObject)cb_system_tools.$list475), cb_system_tools.$const424$CyclistsMt, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                if (cb_system_tools.NIL != kb_accessors.human_cyclistP(constant)) {
                    cb_set_the_cyclist(constant);
                    cb_login_known_cyclist();
                }
            }
            finally {
                api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cb_utilities.cb_error((SubLObject)cb_system_tools.$str476$Unable_to_create_a_new_cyclist__w, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 81509L)
    public static SubLObject cb_logout(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_system_tools.$str478$Logout;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$216 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$217 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$218 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$219 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$219, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str479$You_have_now_logged_out_from_this);
                        html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str364$Click_);
                        cb_utilities.cb_link((SubLObject)cb_system_tools.$kw480$START, (SubLObject)cb_system_tools.$str366$here, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str481$_to_reconnect_to_Cyc_);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$218, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$217, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$216, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_flush();
        html_kernel.clear_html_state_for_machine(html_kernel.http_state_key_for_request());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 83101L)
    public static SubLObject cb_link_logout(SubLObject linktext) {
        if (linktext == cb_system_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL == linktext) {
            linktext = (SubLObject)cb_system_tools.$str483$_Logout_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw32$TOP);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str484$cb_logout);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 83299L)
    public static SubLObject cb_set_password(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = html_utilities.html_extract_input((SubLObject)cb_system_tools.$str486$problem, args);
        final SubLObject login_name = html_utilities.html_extract_value((SubLObject)cb_system_tools.$str487$user_login, args, kb_paths.fort_name(operation_communication.the_cyclist()));
        final SubLObject title_var = (SubLObject)cb_system_tools.$str488$Specify_Cyc_Browser_Password;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$220 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                cyc_file_dependencies.javascript((SubLObject)cb_system_tools.$kw11$SHA1);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$221 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$222 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$223 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$223, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        if (problem.isString()) {
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw28$CENTER));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str489$80_);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$224 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$225 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$226 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (cb_system_tools.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        }
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$227 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            html_utilities.html_princ((SubLObject)cb_system_tools.$str490$Error_);
                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$227, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$226, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$228 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str491$Could_not_set_password_for_);
                                        html_utilities.html_princ(login_name);
                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str171$_);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$228, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$225, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$229 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_system_tools.$kw32$TOP));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$230 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_system_tools.$str492$Reason_);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$230, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$231 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                        html_utilities.html_princ(problem);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$231, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$229, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$224, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str493$Please_specify_a_new_password_for);
                        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_system_tools.$str494$_Note__Only_you_can_reset_your_ow);
                        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$232 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str495$cb_set_password_handler, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_user_id_and_password((SubLObject)cb_system_tools.$str487$user_login, (SubLObject)cb_system_tools.$str370$new_login_hashed_password, (SubLObject)cb_system_tools.$str371$Cyclist, (SubLObject)cb_system_tools.$str496$New_Password, login_name, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$232, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$222, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$221, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$220, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 84813L)
    public static SubLObject cb_link_set_password(SubLObject linktext) {
        if (linktext == cb_system_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL == linktext) {
            linktext = (SubLObject)cb_system_tools.$str498$_Set_Password_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str499$cb_set_password);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 85125L)
    public static SubLObject cb_set_password_handler(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject login_name = string_utilities.trim_whitespace(html_utilities.html_extract_value((SubLObject)cb_system_tools.$str487$user_login, args, (SubLObject)cb_system_tools.$str83$));
        final SubLObject password = html_utilities.html_extract_value((SubLObject)cb_system_tools.$str370$new_login_hashed_password, args, (SubLObject)cb_system_tools.$str83$);
        if (cb_system_tools.NIL != string_utilities.empty_string_p(login_name) || cb_system_tools.NIL != string_utilities.empty_string_p(password)) {
            return cb_set_password(cb_set_password_args_with_problem(args, (SubLObject)cb_system_tools.$str505$Please_fill_in_all_fields_));
        }
        final SubLObject candidates = cb_frames.terms_for_browsing(login_name, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject cyclists = list_utilities.remove_if_not((SubLObject)cb_system_tools.$sym441$HUMAN_CYCLIST_, candidates, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL == cyclists) {
            return cb_set_password(cb_set_password_args_with_problem(args, (SubLObject)cb_system_tools.$str506$No_known_cyclist_by_this_name_));
        }
        if (cb_system_tools.NIL == list_utilities.singletonP(cyclists)) {
            return cb_set_password(cb_set_password_args_with_problem(args, Sequences.cconcatenate((SubLObject)cb_system_tools.$str507$The_name_could_mean_any_of_follow, format_nil.format_nil_a_no_copy(cyclists))));
        }
        final SubLObject user = cyclists.first();
        thread.resetMultipleValues();
        final SubLObject status = operation_communication.specify_authentication_info_for_user(user, password, cb_system_tools.$const352$CycBrowser);
        final SubLObject message = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_system_tools.NIL != status) {
            return cb_browser.cb_c_predicate_extent((SubLObject)cb_system_tools.$list508);
        }
        return cb_set_password(cb_set_password_args_with_problem(args, message));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 86616L)
    public static SubLObject cb_set_password_args_with_problem(final SubLObject args, final SubLObject message) {
        return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str486$problem, message), args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 86729L)
    public static SubLObject cb_confirm_halt_cyc(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_system_tools.$str512$the_Halt_Cyc_Image);
        }
        else {
            final SubLObject title_var = (SubLObject)cb_system_tools.$str513$Halt_Cyc_Image;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$233 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_system_tools.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$234 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$235 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$236 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$236, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_system_tools.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw32$TOP);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$237 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str514$cb_halt_cyc, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                                cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw510$CB_CONFIRM_HALT_CYC, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                cb_halt_or_restart_confirm((SubLObject)cb_system_tools.$str515$halt);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$237, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$235, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$234, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$233, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 86729L)
    public static SubLObject cb_link_confirm_halt_cyc(SubLObject linktext) {
        if (linktext == cb_system_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL == linktext) {
            linktext = (SubLObject)cb_system_tools.$str517$_Halt_Cyc_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str518$cb_confirm_halt_cyc);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 86729L)
    public static SubLObject cb_halt_cyc(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_system_tools.$str512$the_Halt_Cyc_Image);
        }
        else if (cb_system_tools.NIL == system_parameters.$cb_allow_halt_imageP$.getDynamicValue(thread)) {
            final SubLObject title_var = (SubLObject)cb_system_tools.$str520$Halt_Image_Not_Allowed;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$238 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_system_tools.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$239 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$240 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$241 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$241, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_system_tools.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str521$Sorry__this_image_cannot_be_halte);
                            html_utilities.html_flush();
                            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$240, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$239, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$238, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject title_var = (SubLObject)cb_system_tools.$str522$Cyc_Image_Halted;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$242 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_system_tools.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$243 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$244 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$245 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$245, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_system_tools.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str523$This_Cyc_image_will_be_halted___G);
                            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$244, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$243, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$242, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_flush();
            final SubLObject _prev_bind_2 = StreamsLow.$error_output$.currentBinding(thread);
            try {
                StreamsLow.$error_output$.bind(StreamsLow.$debug_io$.getDynamicValue(thread), thread);
                final SubLObject message = Sequences.cconcatenate((SubLObject)cb_system_tools.$str524$Halted_by_, new SubLObject[] { format_nil.format_nil_s_no_copy(operation_communication.the_cyclist()), cb_system_tools.$str525$_Via_HTML_interface });
                operation_communication.halt_cyc_image(message);
            }
            finally {
                StreamsLow.$error_output$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 86729L)
    public static SubLObject cb_halt_or_restart_confirm(final SubLObject operation_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
        final SubLObject operation_string_$246 = (SubLObject)cb_system_tools.$str515$halt;
        html_utilities.html_princ((SubLObject)cb_system_tools.$str527$This_will_);
        html_utilities.html_princ(operation_string_$246);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str528$_the_Cyc_image_);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(control_vars.$cyc_image_id$.getDynamicValue(thread));
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_system_tools.$str171$_);
        if (operation_queues.transmit_queue_size().isPositive()) {
            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_color((SubLObject)cb_system_tools.$str529$red));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                html_utilities.html_princ((SubLObject)cb_system_tools.$str530$Warning__);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_system_tools.$str531$There_are__A_operations_waiting_i, operation_queues.transmit_queue_size());
            html_utilities.html_princ(operation_string);
            html_utilities.html_princ((SubLObject)cb_system_tools.$str532$_now__they_will_be_lost_);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
        html_utilities.html_princ((SubLObject)cb_system_tools.$str533$Do_you_really_want_to_do_this_);
        html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
        cb_utilities.cb_back_button((SubLObject)cb_system_tools.$kw145$SELF, (SubLObject)cb_system_tools.$str65$No);
        html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
        final SubLObject label = Sequences.cconcatenate((SubLObject)cb_system_tools.$str534$Yes__, new SubLObject[] { format_nil.format_nil_a_no_copy(operation_string), cb_system_tools.$str535$_system });
        html_utilities.html_submit_input(label, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 90624L)
    public static SubLObject cb_transcript_viewer(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject transcript_filename = (SubLObject)cb_system_tools.NIL;
        SubLObject show_stats = (SubLObject)cb_system_tools.NIL;
        SubLObject error_message = (SubLObject)cb_system_tools.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)cb_system_tools.NIL;
        arg = cdolist_list_var.first();
        while (cb_system_tools.NIL != cdolist_list_var) {
            if (arg.isList()) {
                if (cb_system_tools.$str538$show_stats.equal(arg.first())) {
                    show_stats = (SubLObject)cb_system_tools.T;
                }
                if (cb_system_tools.$str539$transcript_filename.equal(arg.first())) {
                    transcript_filename = string_utilities.trim_whitespace(conses_high.second(arg));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        if (cb_system_tools.NIL != transcript_filename) {
            if (transcript_filename.equal((SubLObject)cb_system_tools.$str83$)) {
                error_message = (SubLObject)cb_system_tools.$str540$Please_type_in_a_filename_;
            }
            else if (cb_system_tools.NIL == Filesys.probe_file(transcript_filename)) {
                error_message = file_utilities.why_not_probe_fileP(transcript_filename);
            }
        }
        if (cb_system_tools.NIL != transcript_filename && cb_system_tools.NIL == error_message) {
            if (cb_system_tools.NIL != show_stats) {
                transcript_filename = Sequences.cconcatenate((SubLObject)cb_system_tools.$str319$stats_, transcript_filename);
            }
            cb_transcript_viewer_handler((SubLObject)ConsesLow.list(transcript_filename));
        }
        final SubLObject title_var = (SubLObject)cb_system_tools.$str541$Transcript_Viewing_Area;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$247 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$248 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$249 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$250 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$250, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$251 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str542$cb_transcript_viewer_handler, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw536$CB_TRANSCRIPT_VIEWER, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            cb_utilities.cb_link((SubLObject)cb_system_tools.$kw543$ALL_LOCAL_TRANS, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$251, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str544$cg_cb_transcript_viewer);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$kw545$GET);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$252 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str546$cb_transcript_viewer, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str547$View_other_transcript_);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str548$Please_type_in_the_full_path_to_t);
                            html_utilities.html_br();
                            html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                            final SubLObject transcript_filename2 = (cb_system_tools.NIL != transcript_filename) ? transcript_filename : file_utilities.normal_pathstring(transcript_utilities.local_transcript());
                            html_utilities.html_filename_input((SubLObject)cb_system_tools.$str539$transcript_filename, transcript_filename2, (SubLObject)cb_system_tools.$int100$80);
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != error_message) {
                                html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                                final SubLObject color_val = (SubLObject)cb_system_tools.$kw18$RED;
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (cb_system_tools.NIL != color_val) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_val));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$253 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_system_tools.$str549$ERROR__);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    html_utilities.html_princ(error_message);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$253, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_submit_input((SubLObject)cb_system_tools.$str550$Stats, (SubLObject)cb_system_tools.$str538$show_stats, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_system_tools.FOUR_INTEGER);
                            html_utilities.html_submit_input((SubLObject)cb_system_tools.$str551$View_Transcript, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_5, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_4, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$252, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$249, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$248, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$247, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 92512L)
    public static SubLObject cb_transcript_viewer_handler(final SubLObject args) {
        final SubLObject show_statistics = string_utilities.starts_with(args.first(), (SubLObject)cb_system_tools.$str319$stats_);
        final SubLObject file = args.first();
        if (cb_system_tools.NIL != show_statistics) {
            get_statistics_on_transcript(string_utilities.remove_substring(file, (SubLObject)cb_system_tools.$str319$stats_));
        }
        else {
            display_transcript(file);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 92790L)
    public static SubLObject display_transcript(final SubLObject transcript) {
        cb_system_get_transcript(transcript);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 92882L)
    public static SubLObject get_statistics_on_transcript(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stats = transcript_utilities.constant_modifications_in_transcript(file);
        final SubLObject title_var = (SubLObject)cb_system_tools.$str554$Transcript_Statistics;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$254 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$255 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$256 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$257 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$257, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$258 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_back_button((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str555$Transcript__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            cb_parameters.cyc_cgi_url_int();
                            html_utilities.html_princ(Sequences.cconcatenate((SubLObject)cb_system_tools.$str318$cb_transcript_viewer_handler_, file));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$259 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_princ(file);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$259, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str331$Operations__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_princ(stats.first());
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str556$Constants_Created__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_princ(conses_high.list_length(conses_high.second(stats)));
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            SubLObject cdolist_list_var = conses_high.second(stats);
                            SubLObject creates = (SubLObject)cb_system_tools.NIL;
                            creates = cdolist_list_var.first();
                            while (cb_system_tools.NIL != cdolist_list_var) {
                                final SubLObject constant = constants_high.find_constant(conses_high.third(creates));
                                if (cb_system_tools.NIL != constant) {
                                    cb_utilities.cb_form(constant, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                }
                                else {
                                    html_utilities.html_princ(conses_high.third(creates));
                                }
                                html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                creates = cdolist_list_var.first();
                            }
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str557$Constants_Renamed__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_princ(conses_high.list_length(conses_high.third(stats)));
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            cdolist_list_var = conses_high.third(stats);
                            SubLObject renames = (SubLObject)cb_system_tools.NIL;
                            renames = cdolist_list_var.first();
                            while (cb_system_tools.NIL != cdolist_list_var) {
                                html_utilities.html_princ(conses_high.third(renames));
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str558$__);
                                final SubLObject constant = constants_high.find_constant(conses_high.fourth(renames));
                                if (cb_system_tools.NIL != constant) {
                                    cb_utilities.cb_form(constant, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                }
                                else {
                                    html_utilities.html_princ(conses_high.fourth(renames));
                                }
                                html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                renames = cdolist_list_var.first();
                            }
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str559$Constants_Killed__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_princ(conses_high.list_length(conses_high.fourth(stats)));
                            html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                            cdolist_list_var = conses_high.fourth(stats);
                            SubLObject kills = (SubLObject)cb_system_tools.NIL;
                            kills = cdolist_list_var.first();
                            while (cb_system_tools.NIL != cdolist_list_var) {
                                html_utilities.html_princ(conses_high.third(kills));
                                html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                kills = cdolist_list_var.first();
                            }
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$258, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$256, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$255, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$254, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 94317L)
    public static SubLObject cb_link_all_local_trans() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject transcripts = transcript_utilities.get_all_transcripts_image();
        if (cb_system_tools.NIL == transcripts) {
            html_utilities.html_princ((SubLObject)cb_system_tools.$str560$No_transcripts_for_this_image_);
        }
        else {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_system_tools.$str561$Local_transcripts_for_this_image_);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
            SubLObject cdolist_list_var = Sequences.reverse(transcript_utilities.get_all_transcripts_image());
            SubLObject file = (SubLObject)cb_system_tools.NIL;
            file = cdolist_list_var.first();
            while (cb_system_tools.NIL != cdolist_list_var) {
                SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ(Sequences.cconcatenate((SubLObject)cb_system_tools.$str562$cb_transcript_viewer_handler_stat, file));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                if (cb_system_tools.NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ((SubLObject)cb_system_tools.$str550$Stats);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_utilities.html_indent((SubLObject)cb_system_tools.FIVE_INTEGER);
                frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ(Sequences.cconcatenate((SubLObject)cb_system_tools.$str318$cb_transcript_viewer_handler_, file));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                if (cb_system_tools.NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_princ(file);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                file = cdolist_list_var.first();
            }
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 95069L)
    public static SubLObject cb_link_viewer(SubLObject linktext) {
        if (linktext == cb_system_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL == linktext) {
            linktext = (SubLObject)cb_system_tools.$str564$Viewer;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str546$cb_transcript_viewer);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 95484L)
    public static SubLObject cb_show_local_ops(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_system_tools.$str572$Local_Operations;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$260 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$261 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$262 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$263 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$263, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$264 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str573$cb_confirm_clear_local_queue, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw570$CB_SHOW_LOCAL_OPS, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            final SubLObject total = operation_queues.local_queue_size();
                            if (total.numE((SubLObject)cb_system_tools.ZERO_INTEGER)) {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str574$You_have_nothing_in_your_local_qu);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            else {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str48$You_have_);
                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_utilities.html_princ(total);
                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str575$_item);
                                if (total.numG((SubLObject)cb_system_tools.ONE_INTEGER)) {
                                    html_utilities.html_princ((SubLObject)cb_system_tools.$str576$s);
                                }
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str577$_in_your_local_queue_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str578$Click_this_button_to_erase_the_lo);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_indent((SubLObject)cb_system_tools.THREE_INTEGER);
                                html_utilities.html_submit_input((SubLObject)cb_system_tools.$str579$Clear_Local_Queue, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_hr((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str580$Here_are_the_queued_local_operati);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                                SubLObject cdolist_list_var;
                                final SubLObject operations = cdolist_list_var = operation_queues.local_queue_contents();
                                SubLObject an_op = (SubLObject)cb_system_tools.NIL;
                                an_op = cdolist_list_var.first();
                                while (cb_system_tools.NIL != cdolist_list_var) {
                                    an_op = cb_transform_operation_for_display(an_op);
                                    cb_utilities.cb_form(an_op, (SubLObject)cb_system_tools.ZERO_INTEGER, (SubLObject)cb_system_tools.T);
                                    html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    an_op = cdolist_list_var.first();
                                }
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$264, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$262, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$261, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$260, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 96693L)
    public static SubLObject cb_link_show_local_ops(SubLObject text) {
        if (text == cb_system_tools.UNPROVIDED) {
            text = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_system_tools.NIL == text) {
            text = (SubLObject)cb_system_tools.$str582$Local_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str583$cb_show_local_ops);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(text);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 97058L)
    public static SubLObject cb_confirm_clear_local_queue(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_system_tools.$str579$Clear_Local_Queue;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$265 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$266 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$267 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$268 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$268, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$269 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str587$cb_clear_local_queue, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw585$CB_CONFIRM_CLEAR_LOCAL_QUEUE, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            final SubLObject total = operation_queues.local_queue_size();
                            if (total.numE((SubLObject)cb_system_tools.ZERO_INTEGER)) {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str574$You_have_nothing_in_your_local_qu);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            else {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str588$Are_you_);
                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str589$SURE);
                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str590$_you_want_to_clear_your_local_que);
                                html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_utilities.html_princ(total);
                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str591$_operations_will_be_lost_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                cb_utilities.cb_back_button((SubLObject)cb_system_tools.$kw145$SELF, (SubLObject)cb_system_tools.$str65$No);
                                html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_submit_input((SubLObject)cb_system_tools.$str592$Yes__Clear_Local_Queue, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$269, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$267, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$266, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$265, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 98048L)
    public static SubLObject cb_confirm_clear_local_and_restart(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_system_tools.$str579$Clear_Local_Queue;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$270 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$271 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$272 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$273 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$273, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        if (cb_system_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$274 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str596$cb_clear_local_and_restart, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw594$CB_CONFIRM_CLEAR_LOCAL_AND_RESTART, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                            final SubLObject total = operation_queues.local_queue_size();
                            if (total.numE((SubLObject)cb_system_tools.ZERO_INTEGER)) {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str597$You_have_nothing_in_your_local_qu);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                while (cb_system_tools.NIL == agenda.agenda_running()) {
                                    agenda.start_agenda((SubLObject)cb_system_tools.TWO_INTEGER);
                                }
                                cb_utilities.cb_message_page_with_history((SubLObject)cb_system_tools.$str598$Local_Queue_Cleared__Agenda_Resta, (SubLObject)cb_system_tools.T);
                            }
                            else {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str588$Are_you_);
                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str589$SURE);
                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str599$_you_want_to_clear_your_local_que);
                                html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_utilities.html_princ(total);
                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str591$_operations_will_be_lost_);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                cb_utilities.cb_back_button((SubLObject)cb_system_tools.$kw145$SELF, (SubLObject)cb_system_tools.$str65$No);
                                html_utilities.html_indent((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_submit_input((SubLObject)cb_system_tools.$str600$Yes__Clear_Local_Queue_and_Restar, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$274, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$272, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$271, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$270, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 99307L)
    public static SubLObject cb_link_delete_local_and_restart(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str602$cb_confirm_clear_local_and_restar);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(text);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 99599L)
    public static SubLObject cb_link_delete_local_ops(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_system_tools.$kw49$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_system_tools.$str573$cb_confirm_clear_local_queue);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        if (cb_system_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
            html_utilities.html_princ(text);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 99852L)
    public static SubLObject cb_clear_local_and_restart(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        operation_queues.clear_local_queue();
        while (cb_system_tools.NIL == agenda.agenda_running()) {
            agenda.start_agenda((SubLObject)cb_system_tools.TWO_INTEGER);
        }
        cb_utilities.cb_message_page_with_history((SubLObject)cb_system_tools.$str598$Local_Queue_Cleared__Agenda_Resta, (SubLObject)cb_system_tools.T);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 100286L)
    public static SubLObject cb_clear_local_queue(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        operation_queues.clear_local_queue();
        cb_utilities.cb_message_page_with_history((SubLObject)cb_system_tools.$str606$Local_Queue_Cleared, (SubLObject)cb_system_tools.T);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 100504L)
    public static SubLObject cb_system_show_specific_transcript_file_as_ke_text(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject transcript_filename = (SubLObject)cb_system_tools.NIL;
        SubLObject output_filename = (SubLObject)cb_system_tools.$str83$;
        SubLObject error_message = (SubLObject)cb_system_tools.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)cb_system_tools.NIL;
        arg = cdolist_list_var.first();
        while (cb_system_tools.NIL != cdolist_list_var) {
            if (arg.isList()) {
                if (cb_system_tools.$str610$transcript_filename.equal(arg.first())) {
                    transcript_filename = conses_high.second(arg);
                }
                if (cb_system_tools.$str611$output_filename.equal(arg.first())) {
                    output_filename = conses_high.second(arg);
                }
                if (cb_system_tools.$str612$error_message.equal(arg.first())) {
                    error_message = conses_high.second(arg);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        final SubLObject title_var = (SubLObject)cb_system_tools.$str613$Transcript_file_viewed_in_KE_Text;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$275 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_system_tools.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$276 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$277 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$278 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$278, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_system_tools.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        final SubLObject ke_text_string_list = transcript_utilities.transcript_file_to_ke_text(transcript_filename);
                        if (cb_system_tools.NIL == ke_text_string_list) {
                            html_utilities.html_princ((SubLObject)cb_system_tools.$str614$The_transcript_file_contains_no_o);
                        }
                        else if (ke_text_string_list.isString()) {
                            html_utilities.html_princ(ke_text_string_list);
                        }
                        else {
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$279 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw608$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str330$File__);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                cb_utilities.cb_link((SubLObject)cb_system_tools.$kw316$VIEW_TRANSCRIPT, transcript_filename, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_system_tools.$str615$cg_cb_write_local_transcript_as_k);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_system_tools.$kw616$POST);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$280 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$281 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$282 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_macros.$within_html_form$.bind((SubLObject)cb_system_tools.T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str617$cb_system_write_specific_transcri, (SubLObject)cb_system_tools.T, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_hidden_input((SubLObject)cb_system_tools.$str610$transcript_filename, transcript_filename, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_system_tools.$str618$You_may_write_this_transcript_in_);
                                    html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_text_input((SubLObject)cb_system_tools.$str611$output_filename, output_filename, (SubLObject)cb_system_tools.$int229$60);
                                    html_utilities.html_glyph((SubLObject)cb_system_tools.$kw619$NBSP, (SubLObject)cb_system_tools.TWO_INTEGER);
                                    html_utilities.html_submit_input((SubLObject)cb_system_tools.$str620$Write_to_File, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                    if (cb_system_tools.NIL != error_message) {
                                        final SubLObject color_val = (SubLObject)cb_system_tools.$kw18$RED;
                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (cb_system_tools.NIL != color_val) {
                                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(color_val));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                        }
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$281 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                            html_utilities.html_princ((SubLObject)cb_system_tools.$str549$ERROR__);
                                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                            html_utilities.html_princ(error_message);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$281, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                    }
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                }
                                finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2_$282, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_1_$281, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$280, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_utilities.html_hr((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str621$This_is_what_the_transcript_curre);
                                html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                html_macros.verify_not_within_html_pre();
                                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$282 = html_macros.$within_html_pre$.currentBinding(thread);
                                try {
                                    html_macros.$within_html_pre$.bind((SubLObject)cb_system_tools.T, thread);
                                    SubLObject cdolist_list_var2 = ke_text_string_list;
                                    SubLObject ke_text_string = (SubLObject)cb_system_tools.NIL;
                                    ke_text_string = cdolist_list_var2.first();
                                    while (cb_system_tools.NIL != cdolist_list_var2) {
                                        html_utilities.html_princ(ke_text_string);
                                        html_utilities.html_newline((SubLObject)cb_system_tools.UNPROVIDED);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        ke_text_string = cdolist_list_var2.first();
                                    }
                                }
                                finally {
                                    html_macros.$within_html_pre$.rebind(_prev_bind_0_$282, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$279, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$277, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$276, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$275, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 100504L)
    public static SubLObject cb_system_write_specific_transcript_file_as_ke_text(SubLObject args) {
        if (args == cb_system_tools.UNPROVIDED) {
            args = (SubLObject)cb_system_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject transcript_filename = (SubLObject)cb_system_tools.NIL;
        SubLObject output_filename = (SubLObject)cb_system_tools.NIL;
        SubLObject error_message = (SubLObject)cb_system_tools.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)cb_system_tools.NIL;
        arg = cdolist_list_var.first();
        while (cb_system_tools.NIL != cdolist_list_var) {
            if (arg.isList()) {
                if (cb_system_tools.$str610$transcript_filename.equal(arg.first())) {
                    transcript_filename = string_utilities.trim_whitespace(conses_high.second(arg));
                }
                if (cb_system_tools.$str611$output_filename.equal(arg.first())) {
                    output_filename = conses_high.second(arg);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        if (cb_system_tools.NIL != output_filename && output_filename.equal((SubLObject)cb_system_tools.$str83$)) {
            error_message = (SubLObject)cb_system_tools.$str540$Please_type_in_a_filename_;
        }
        if (cb_system_tools.NIL != error_message) {
            cb_system_show_specific_transcript_file_as_ke_text((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str610$transcript_filename, transcript_filename), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str611$output_filename, output_filename), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str612$error_message, error_message)));
            return (SubLObject)cb_system_tools.NIL;
        }
        final SubLObject error_message_$285 = transcript_utilities.write_specific_transcript_file_as_ke_text(transcript_filename, output_filename);
        if (cb_system_tools.NIL != error_message_$285) {
            cb_system_show_specific_transcript_file_as_ke_text((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str610$transcript_filename, transcript_filename), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str611$output_filename, output_filename), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str612$error_message, error_message_$285)));
        }
        else {
            final SubLObject title_var = (SubLObject)cb_system_tools.$str623$Transcript_successfully_written_;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_system_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_system_tools.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_system_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_system_tools.$str7$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$286 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_system_tools.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_system_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_system_tools.$kw9$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_system_tools.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$287 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_system_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_system_tools.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_system_tools.$str12$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$288 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_system_tools.$str13$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$289 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_system_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_system_tools.$str14$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_system_tools.$str15$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_system_tools.$str16$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_system_tools.UNPROVIDED);
                                if (cb_system_tools.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$289, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_system_tools.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_system_tools.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_system_tools.UNPROVIDED);
                            }
                            cb_utilities.cb_help_preamble((SubLObject)cb_system_tools.$kw608$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, (SubLObject)cb_system_tools.UNPROVIDED, (SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$288, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$287, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$286, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_system_tools.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_system_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 104507L)
    public static SubLObject possibly_insert_experience_options() {
        return (SubLObject)cb_system_tools.NIL;
    }
    
    public static SubLObject declare_cb_system_tools_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cyc_system_doc_file", "CYC-SYSTEM-DOC-FILE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_mode", "CB-MODE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "insert_transmit_options", "INSERT-TRANSMIT-OPTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "insert_kb_not_current_message", "INSERT-KB-NOT-CURRENT-MESSAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "insert_stored_options", "INSERT-STORED-OPTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "insert_local_queue_warning", "INSERT-LOCAL-QUEUE-WARNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "insert_read_options", "INSERT-READ-OPTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_mode_show_kb_checkpoint_options", "CB-MODE-SHOW-KB-CHECKPOINT-OPTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "oe_patch_messages_enabled_and_email_validP", "OE-PATCH-MESSAGES-ENABLED-AND-EMAIL-VALID?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_mode_handler", "CB-MODE-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_mode", "CB-LINK-MODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "display_oe_patch_message", "DISPLAY-OE-PATCH-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "oe_patch_message_subject_prefix", "OE-PATCH-MESSAGE-SUBJECT-PREFIX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "default_oe_patch_message", "DEFAULT-OE-PATCH-MESSAGE", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_handle_oe_patch_message", "CB-HANDLE-OE-PATCH-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "send_or_submit_transcript_with_message", "SEND-OR-SUBMIT-TRANSCRIPT-WITH-MESSAGE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "ke_text_for_patch_message", "KE-TEXT-FOR-PATCH-MESSAGE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_roll_current_kb", "CB-LINK-ROLL-CURRENT-KB", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_roll_current_kb", "CB-ROLL-CURRENT-KB", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_handle_roll_current_kb", "CB-HANDLE-ROLL-CURRENT-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_agenda_halt_explanation_display", "CB-AGENDA-HALT-EXPLANATION-DISPLAY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_agenda", "CB-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_assertion_dependency_counts", "CB-ASSERTION-DEPENDENCY-COUNTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_agenda", "CB-LINK-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_abort_agenda", "CB-ABORT-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_toggle_agenda_status_display", "CB-TOGGLE-AGENDA-STATUS-DISPLAY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_toggle_agenda_status", "CB-TOGGLE-AGENDA-STATUS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_agenda_error_mode_display", "CB-AGENDA-ERROR-MODE-DISPLAY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_agenda_error_mode_handler", "CB-AGENDA-ERROR-MODE-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_agenda_local_queue_display", "CB-AGENDA-LOCAL-QUEUE-DISPLAY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_agenda_error_file", "CB-LINK-AGENDA-ERROR-FILE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_agenda_error_file_viewer", "CB-AGENDA-ERROR-FILE-VIEWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_system1", "CB-LINK-SYSTEM1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_system", "CB-LINK-SYSTEM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_system", "CB-SYSTEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "html_cb_write_image_int", "HTML-CB-WRITE-IMAGE-INT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_write_image_handler", "CB-WRITE-IMAGE-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_show_system_settings", "CB-SHOW-SYSTEM-SETTINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "show_queue_information", "SHOW-QUEUE-INFORMATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "show_transcript_information", "SHOW-TRANSCRIPT-INFORMATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "show_historical_information", "SHOW-HISTORICAL-INFORMATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_read_trans", "CB-LINK-READ-TRANS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_write_trans", "CB-LINK-WRITE-TRANS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_view_transcript", "CB-LINK-VIEW-TRANSCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "html_transcript_stats_link", "HTML-TRANSCRIPT-STATS-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_system_ready_transcript_file", "CB-SYSTEM-READY-TRANSCRIPT-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_system_get_transcript", "CB-SYSTEM-GET-TRANSCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_system_show_specific_transcript_file", "CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_transform_operation_for_display", "CB-TRANSFORM-OPERATION-FOR-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_choose_project", "CB-CHOOSE-PROJECT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "ongoing_cyc_projects", "ONGOING-CYC-PROJECTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_choose_project_handler", "CB-CHOOSE-PROJECT-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_choose_project", "CB-LINK-CHOOSE-PROJECT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_authenticate_the_cyclist", "CB-AUTHENTICATE-THE-CYCLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_set_the_cyclist", "CB-SET-THE-CYCLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_after_login_events", "CB-AFTER-LOGIN-EVENTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_login_find_default_projects_for_cyclist", "CB-LOGIN-FIND-DEFAULT-PROJECTS-FOR-CYCLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "note_image_purpose", "NOTE-IMAGE-PURPOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_login", "CB-LOGIN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_force_logout", "CB-FORCE-LOGOUT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_force_logout", "CB-LINK-FORCE-LOGOUT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_unauthenticated_login_pane", "CB-UNAUTHENTICATED-LOGIN-PANE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_notify_all_users", "CB-LINK-NOTIFY-ALL-USERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_notify_all_users", "CB-NOTIFY-ALL-USERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_notify_users_draw_one_user", "CB-NOTIFY-USERS-DRAW-ONE-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_notify_users_draw_header", "CB-NOTIFY-USERS-DRAW-HEADER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "clear_cb_notify_users_generate_exclusion_mark_from_user", "CLEAR-CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "remove_cb_notify_users_generate_exclusion_mark_from_user", "REMOVE-CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_notify_users_generate_exclusion_mark_from_user_internal", "CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_notify_users_generate_exclusion_mark_from_user", "CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "preferred_email_address_for_user", "PREFERRED-EMAIL-ADDRESS-FOR-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_send_email_to_selected_users", "CB-SEND-EMAIL-TO-SELECTED-USERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_login", "CB-LINK-LOGIN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_login_handler", "CB-LOGIN-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "dwim_cyclist_name_to_cyclist", "DWIM-CYCLIST-NAME-TO-CYCLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cyc_login", "CYC-LOGIN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "possibly_redirect", "POSSIBLY-REDIRECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "first_list", "FIRST-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_login_used_constant", "CB-LOGIN-USED-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_login_known_cyclist", "CB-LOGIN-KNOWN-CYCLIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_user_address_string", "CB-USER-ADDRESS-STRING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_login_unknown_cyclist", "CB-LOGIN-UNKNOWN-CYCLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_create_new_cyclist", "CB-CREATE-NEW-CYCLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_logout", "CB-LOGOUT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_logout", "CB-LINK-LOGOUT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_set_password", "CB-SET-PASSWORD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_set_password", "CB-LINK-SET-PASSWORD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_set_password_handler", "CB-SET-PASSWORD-HANDLER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_set_password_args_with_problem", "CB-SET-PASSWORD-ARGS-WITH-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_confirm_halt_cyc", "CB-CONFIRM-HALT-CYC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_confirm_halt_cyc", "CB-LINK-CONFIRM-HALT-CYC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_halt_cyc", "CB-HALT-CYC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_halt_or_restart_confirm", "CB-HALT-OR-RESTART-CONFIRM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_transcript_viewer", "CB-TRANSCRIPT-VIEWER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_transcript_viewer_handler", "CB-TRANSCRIPT-VIEWER-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "display_transcript", "DISPLAY-TRANSCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "get_statistics_on_transcript", "GET-STATISTICS-ON-TRANSCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_all_local_trans", "CB-LINK-ALL-LOCAL-TRANS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_viewer", "CB-LINK-VIEWER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_show_local_ops", "CB-SHOW-LOCAL-OPS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_show_local_ops", "CB-LINK-SHOW-LOCAL-OPS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_confirm_clear_local_queue", "CB-CONFIRM-CLEAR-LOCAL-QUEUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_confirm_clear_local_and_restart", "CB-CONFIRM-CLEAR-LOCAL-AND-RESTART", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_delete_local_and_restart", "CB-LINK-DELETE-LOCAL-AND-RESTART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_link_delete_local_ops", "CB-LINK-DELETE-LOCAL-OPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_clear_local_and_restart", "CB-CLEAR-LOCAL-AND-RESTART", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_clear_local_queue", "CB-CLEAR-LOCAL-QUEUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_system_show_specific_transcript_file_as_ke_text", "CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "cb_system_write_specific_transcript_file_as_ke_text", "CB-SYSTEM-WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_system_tools", "possibly_insert_experience_options", "POSSIBLY-INSERT-EXPERIENCE-OPTIONS", 0, 0, false);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    public static SubLObject init_cb_system_tools_file() {
        cb_system_tools.$cyc_system_doc_comm_mode_index$ = SubLFiles.defparameter("*CYC-SYSTEM-DOC-COMM-MODE-INDEX*", (SubLObject)cb_system_tools.$str1$com_modes);
        cb_system_tools.$cb_mode_checkpoint_collection$ = SubLFiles.deflexical("*CB-MODE-CHECKPOINT-COLLECTION*", maybeDefault((SubLObject)cb_system_tools.$sym72$_CB_MODE_CHECKPOINT_COLLECTION_, cb_system_tools.$cb_mode_checkpoint_collection$, cb_system_tools.$const73$Cyc_BasedProject));
        cb_system_tools.$oe_patch_messages_enabledP$ = SubLFiles.deflexical("*OE-PATCH-MESSAGES-ENABLED?*", (SubLObject)(maybeDefault((SubLObject)cb_system_tools.$sym74$_OE_PATCH_MESSAGES_ENABLED__, cb_system_tools.$oe_patch_messages_enabledP$, cb_system_tools.NIL)));
        cb_system_tools.$default_oe_patch_message_recipient$ = SubLFiles.deflexical("*DEFAULT-OE-PATCH-MESSAGE-RECIPIENT*", (SubLObject)(maybeDefault((SubLObject)cb_system_tools.$sym82$_DEFAULT_OE_PATCH_MESSAGE_RECIPIENT_, cb_system_tools.$default_oe_patch_message_recipient$, cb_system_tools.$str83$)));
        cb_system_tools.$oe_patch_message_smtp_host$ = SubLFiles.deflexical("*OE-PATCH-MESSAGE-SMTP-HOST*", (SubLObject)(maybeDefault((SubLObject)cb_system_tools.$sym84$_OE_PATCH_MESSAGE_SMTP_HOST_, cb_system_tools.$oe_patch_message_smtp_host$, cb_system_tools.$str83$)));
        cb_system_tools.$cyc_system_doc_agenda_index$ = SubLFiles.defparameter("*CYC-SYSTEM-DOC-AGENDA-INDEX*", (SubLObject)cb_system_tools.$str159$cyc_agenda);
        cb_system_tools.$image_purpose$ = SubLFiles.defparameter("*IMAGE-PURPOSE*", (SubLObject)cb_system_tools.NIL);
        cb_system_tools.$cb_notify_users_generate_exclusion_mark_from_user_caching_state$ = SubLFiles.deflexical("*CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER-CACHING-STATE*", (SubLObject)cb_system_tools.NIL);
        cb_system_tools.$cb_address_titles$ = SubLFiles.deflexical("*CB-ADDRESS-TITLES*", (SubLObject)cb_system_tools.$list456);
        return (SubLObject)cb_system_tools.NIL;
    }
    
    public static SubLObject setup_cb_system_tools_file() {
        Hashtables.sethash((SubLObject)cb_system_tools.$kw2$CB_MODE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str3$cb_mode_html, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym25$CB_MODE, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_system_tools.$sym72$_CB_MODE_CHECKPOINT_COLLECTION_);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_system_tools.$sym74$_OE_PATCH_MESSAGES_ENABLED__);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym77$CB_MODE_HANDLER, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw80$MODE, (SubLObject)cb_system_tools.$sym81$CB_LINK_MODE, (SubLObject)cb_system_tools.ZERO_INTEGER);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_system_tools.$sym82$_DEFAULT_OE_PATCH_MESSAGE_RECIPIENT_);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_system_tools.$sym84$_OE_PATCH_MESSAGE_SMTP_HOST_);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw85$DISPLAY_OE_PATCH_MESSAGE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str86$display_oe_patch_message_html, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym130$CB_HANDLE_OE_PATCH_MESSAGE, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw147$ROLL_CURRENT_KB, (SubLObject)cb_system_tools.$sym148$CB_LINK_ROLL_CURRENT_KB, (SubLObject)cb_system_tools.ONE_INTEGER);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw149$CB_REMOTE_FILTERS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str150$cb_remote_filters_html, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym157$CB_ROLL_CURRENT_KB, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym158$CB_HANDLE_ROLL_CURRENT_KB, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw162$CB_AGENDA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str163$cb_agenda_html, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym186$CB_AGENDA, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw178$AGENDA, (SubLObject)cb_system_tools.$sym189$CB_LINK_AGENDA, (SubLObject)cb_system_tools.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym191$CB_ABORT_AGENDA, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym206$CB_TOGGLE_AGENDA_STATUS, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym231$CB_AGENDA_ERROR_MODE_HANDLER, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw216$AGENDA_ERROR_FILE, (SubLObject)cb_system_tools.$sym241$CB_LINK_AGENDA_ERROR_FILE, (SubLObject)cb_system_tools.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym243$CB_AGENDA_ERROR_FILE_VIEWER, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw245$SYSTEM1, (SubLObject)cb_system_tools.$sym246$CB_LINK_SYSTEM1, (SubLObject)cb_system_tools.ONE_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw248$SYSTEM, (SubLObject)cb_system_tools.$sym249$CB_LINK_SYSTEM, (SubLObject)cb_system_tools.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw250$CB_SYSTEM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str251$cb_system_html, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym259$CB_SYSTEM, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym272$CB_WRITE_IMAGE_HANDLER, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw299$READ_TRANS, (SubLObject)cb_system_tools.$sym312$CB_LINK_READ_TRANS, (SubLObject)cb_system_tools.ZERO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw37$WRITE_TRANS, (SubLObject)cb_system_tools.$sym314$CB_LINK_WRITE_TRANS, (SubLObject)cb_system_tools.ZERO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw316$VIEW_TRANSCRIPT, (SubLObject)cb_system_tools.$sym317$CB_LINK_VIEW_TRANSCRIPT, (SubLObject)cb_system_tools.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym322$CB_SYSTEM_READY_TRANSCRIPT_FILE, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw325$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str326$cb_system_show_specific_transcrip, (SubLObject)cb_system_tools.NIL));
        Hashtables.sethash((SubLObject)cb_system_tools.$kw334$CB_CHOOSE_PROJECT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str335$cb_choose_project_html, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym342$CB_CHOOSE_PROJECT, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym347$CB_CHOOSE_PROJECT_HANDLER, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw350$CHOOSE_PROJECT, (SubLObject)cb_system_tools.$sym351$CB_LINK_CHOOSE_PROJECT, (SubLObject)cb_system_tools.ONE_INTEGER);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw357$CB_LOGIN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str358$cb_login_html, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym386$CB_LOGIN, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym390$CB_FORCE_LOGOUT, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw380$FORCE_LOGOUT, (SubLObject)cb_system_tools.$sym393$CB_LINK_FORCE_LOGOUT, (SubLObject)cb_system_tools.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw385$NOTIFY_ALL_USERS, (SubLObject)cb_system_tools.$sym400$CB_LINK_NOTIFY_ALL_USERS, (SubLObject)cb_system_tools.ZERO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym414$CB_NOTIFY_ALL_USERS, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        memoization_state.note_globally_cached_function((SubLObject)cb_system_tools.$sym418$CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym434$CB_SEND_EMAIL_TO_SELECTED_USERS, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw437$LOGIN, (SubLObject)cb_system_tools.$sym438$CB_LINK_LOGIN, (SubLObject)cb_system_tools.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym440$CB_LOGIN_HANDLER, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym477$CB_CREATE_NEW_CYCLIST, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym482$CB_LOGOUT, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw365$LOGOUT, (SubLObject)cb_system_tools.$sym485$CB_LINK_LOGOUT, (SubLObject)cb_system_tools.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym497$CB_SET_PASSWORD, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw500$SET_PASSWORD, (SubLObject)cb_system_tools.$sym501$CB_LINK_SET_PASSWORD, (SubLObject)cb_system_tools.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_system_tools.$kw500$SET_PASSWORD, (SubLObject)cb_system_tools.$str502$Set_Password, (SubLObject)cb_system_tools.$str503$Passwd, (SubLObject)cb_system_tools.$str504$Set_passwords_for_Cyclist_Authent);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym509$CB_SET_PASSWORD_HANDLER, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw510$CB_CONFIRM_HALT_CYC, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str511$cb_confirm_halt_cyc_html, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym516$CB_CONFIRM_HALT_CYC, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw255$CONFIRM_HALT_CYC, (SubLObject)cb_system_tools.$sym519$CB_LINK_CONFIRM_HALT_CYC, (SubLObject)cb_system_tools.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym526$CB_HALT_CYC, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw536$CB_TRANSCRIPT_VIEWER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str537$cb_transcript_viewer_html, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym552$CB_TRANSCRIPT_VIEWER, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym553$CB_TRANSCRIPT_VIEWER_HANDLER, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw543$ALL_LOCAL_TRANS, (SubLObject)cb_system_tools.$sym563$CB_LINK_ALL_LOCAL_TRANS, (SubLObject)cb_system_tools.ZERO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw565$VIEWER, (SubLObject)cb_system_tools.$sym566$CB_LINK_VIEWER, (SubLObject)cb_system_tools.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_system_tools.$kw565$VIEWER, (SubLObject)cb_system_tools.$str567$Transcript_Viewer, (SubLObject)cb_system_tools.$str568$View, (SubLObject)cb_system_tools.$str569$View_Local_Transcripts);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw570$CB_SHOW_LOCAL_OPS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str571$cb_show_local_ops_html, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym581$CB_SHOW_LOCAL_OPS, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw233$SHOW_LOCAL_OPS, (SubLObject)cb_system_tools.$sym584$CB_LINK_SHOW_LOCAL_OPS, (SubLObject)cb_system_tools.ONE_INTEGER);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw585$CB_CONFIRM_CLEAR_LOCAL_QUEUE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str586$cb_confirm_clear_local_queue_html, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym593$CB_CONFIRM_CLEAR_LOCAL_QUEUE, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw594$CB_CONFIRM_CLEAR_LOCAL_AND_RESTART, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str595$cb_confirm_clear_local_and_restar, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym601$CB_CONFIRM_CLEAR_LOCAL_AND_RESTART, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw237$DELETE_LOCAL_AND_RESTART, (SubLObject)cb_system_tools.$sym603$CB_LINK_DELETE_LOCAL_AND_RESTART, (SubLObject)cb_system_tools.ONE_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_system_tools.$kw235$DELETE_LOCAL_OPS, (SubLObject)cb_system_tools.$sym604$CB_LINK_DELETE_LOCAL_OPS, (SubLObject)cb_system_tools.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym605$CB_CLEAR_LOCAL_AND_RESTART, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym607$CB_CLEAR_LOCAL_QUEUE, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw608$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str609$cb_system_show_specific_transcrip, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym622$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_system_tools.$kw608$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_system_tools.$str609$cb_system_show_specific_transcrip, (SubLObject)cb_system_tools.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_system_tools.$sym624$CB_SYSTEM_WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, (SubLObject)cb_system_tools.$kw26$HTML_HANDLER);
        return (SubLObject)cb_system_tools.NIL;
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
    
    static {
        me = (SubLFile)new cb_system_tools();
        cb_system_tools.$cyc_system_doc_comm_mode_index$ = null;
        cb_system_tools.$cb_mode_checkpoint_collection$ = null;
        cb_system_tools.$oe_patch_messages_enabledP$ = null;
        cb_system_tools.$default_oe_patch_message_recipient$ = null;
        cb_system_tools.$oe_patch_message_smtp_host$ = null;
        cb_system_tools.$cyc_system_doc_agenda_index$ = null;
        cb_system_tools.$image_purpose$ = null;
        cb_system_tools.$cb_notify_users_generate_exclusion_mark_from_user_caching_state$ = null;
        cb_system_tools.$cb_address_titles$ = null;
        $str0$_Aref_system_html = SubLObjectFactory.makeString("~Aref/system.html");
        $str1$com_modes = SubLObjectFactory.makeString("com-modes");
        $kw2$CB_MODE = SubLObjectFactory.makeKeyword("CB-MODE");
        $str3$cb_mode_html = SubLObjectFactory.makeString("cb-mode.html");
        $str4$Cyc_communication_status_changing = SubLObjectFactory.makeString("Cyc communication status changing facilities");
        $str5$Communication_Status_Area = SubLObjectFactory.makeString("Communication Status Area");
        $str6$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str7$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw8$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw9$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw10$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw11$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str12$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str13$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str14$button = SubLObjectFactory.makeString("button");
        $str15$reload = SubLObjectFactory.makeString("reload");
        $str16$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str17$message = SubLObjectFactory.makeString("message");
        $kw18$RED = SubLObjectFactory.makeKeyword("RED");
        $str19$post = SubLObjectFactory.makeString("post");
        $str20$cb_mode_handler = SubLObjectFactory.makeString("cb-mode-handler");
        $str21$Current_Value = SubLObjectFactory.makeString("Current Value");
        $str22$Submit = SubLObjectFactory.makeString("Submit");
        $str23$You_can_not_change_your_transmitt = SubLObjectFactory.makeString("You can not change your transmitting status until you empty ");
        $str24$your_local_transcript_by_either_s = SubLObjectFactory.makeString("your local transcript by either sending or clearing it");
        $sym25$CB_MODE = SubLObjectFactory.makeSymbol("CB-MODE");
        $kw26$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str27$What_Do_You_Want_To_Do_With_Proce = SubLObjectFactory.makeString("What Do You Want To Do With Processed Operations?");
        $kw28$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str29$transmit_mode = SubLObjectFactory.makeString("transmit-mode");
        $str30$transmit = SubLObjectFactory.makeString("transmit");
        $kw31$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw32$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str33$Send_Immediately_To_Everybody = SubLObjectFactory.makeString("Send Immediately To Everybody");
        $str34$transmit_and_store = SubLObjectFactory.makeString("transmit and store");
        $str35$____and_Record_Locally = SubLObjectFactory.makeString("... and Record Locally");
        $str36$to_ = SubLObjectFactory.makeString("to:");
        $kw37$WRITE_TRANS = SubLObjectFactory.makeKeyword("WRITE-TRANS");
        $str38$transmit_and_store_rolled = SubLObjectFactory.makeString("transmit and store rolled");
        $str39$____and_Record_Locally_to_a_New_T = SubLObjectFactory.makeString("... and Record Locally to a New Transcript");
        $str40$store = SubLObjectFactory.makeString("store");
        $str41$Store_For_Later = SubLObjectFactory.makeString("Store For Later");
        $str42$none = SubLObjectFactory.makeString("none");
        $str43$Do_Not_Record = SubLObjectFactory.makeString("Do Not Record");
        $str44$Send_KB_Check_Point_for__ = SubLObjectFactory.makeString("Send KB Check Point for: ");
        $str45$kb_checkpoint_to_send = SubLObjectFactory.makeString("kb_checkpoint_to_send");
        $str46$Currently__you_are_not_allowed_to = SubLObjectFactory.makeString("Currently, you are not allowed to send operations, most likely because you are not in the current KB.");
        $str47$Try_receiving_operations_if_you_w = SubLObjectFactory.makeString("Try receiving operations if you wish to send.");
        $str48$You_have_ = SubLObjectFactory.makeString("You have ");
        $kw49$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str50$cb_system_ready_transcript_file_w = SubLObjectFactory.makeString("cb-system-ready-transcript-file&write");
        $str51$_operations = SubLObjectFactory.makeString(" operations");
        $str52$_stored_ = SubLObjectFactory.makeString(" stored.");
        $str53$send = SubLObjectFactory.makeString("send");
        $str54$Send_Stored_Operations_Now = SubLObjectFactory.makeString("Send Stored Operations Now");
        $str55$clear = SubLObjectFactory.makeString("clear");
        $str56$Clear_Stored_Operations = SubLObjectFactory.makeString("Clear Stored Operations");
        $str57$Note_ = SubLObjectFactory.makeString("Note:");
        $str58$_All_of_the_above_options_will_st = SubLObjectFactory.makeString(" All of the above options will start a new local transcript");
        $str59$You_still_have_ = SubLObjectFactory.makeString("You still have ");
        $str60$_unprocessed_operations_on_your_l = SubLObjectFactory.makeString(" unprocessed operations on your local queue.  You can not change your transmitting status until the queue has been processed.");
        $str61$Do_You_Want_To_Receive_Operations = SubLObjectFactory.makeString("Do You Want To Receive Operations From Others?");
        $kw62$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $str63$receive_mode = SubLObjectFactory.makeString("receive-mode");
        $str64$no = SubLObjectFactory.makeString("no");
        $str65$No = SubLObjectFactory.makeString("No");
        $str66$yes = SubLObjectFactory.makeString("yes");
        $str67$Yes = SubLObjectFactory.makeString("Yes");
        $str68$kb_checkpoint_ = SubLObjectFactory.makeString("kb_checkpoint?");
        $str69$Receive_only_up_to_KB_Check_Point = SubLObjectFactory.makeString("Receive only up to KB Check Point :");
        $str70$kb_checkpoint = SubLObjectFactory.makeString("kb_checkpoint");
        $kw71$USE_CURRENT_CHECK_POINT = SubLObjectFactory.makeKeyword("USE-CURRENT-CHECK-POINT");
        $sym72$_CB_MODE_CHECKPOINT_COLLECTION_ = SubLObjectFactory.makeSymbol("*CB-MODE-CHECKPOINT-COLLECTION*");
        $const73$Cyc_BasedProject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc-BasedProject"));
        $sym74$_OE_PATCH_MESSAGES_ENABLED__ = SubLObjectFactory.makeSymbol("*OE-PATCH-MESSAGES-ENABLED?*");
        $str75$filters_ = SubLObjectFactory.makeString("filters?");
        $str76$SENT = SubLObjectFactory.makeString("SENT");
        $sym77$CB_MODE_HANDLER = SubLObjectFactory.makeSymbol("CB-MODE-HANDLER");
        $str78$cb_mode = SubLObjectFactory.makeString("cb-mode");
        $str79$Comm_ = SubLObjectFactory.makeString("Comm:");
        $kw80$MODE = SubLObjectFactory.makeKeyword("MODE");
        $sym81$CB_LINK_MODE = SubLObjectFactory.makeSymbol("CB-LINK-MODE");
        $sym82$_DEFAULT_OE_PATCH_MESSAGE_RECIPIENT_ = SubLObjectFactory.makeSymbol("*DEFAULT-OE-PATCH-MESSAGE-RECIPIENT*");
        $str83$ = SubLObjectFactory.makeString("");
        $sym84$_OE_PATCH_MESSAGE_SMTP_HOST_ = SubLObjectFactory.makeSymbol("*OE-PATCH-MESSAGE-SMTP-HOST*");
        $kw85$DISPLAY_OE_PATCH_MESSAGE = SubLObjectFactory.makeKeyword("DISPLAY-OE-PATCH-MESSAGE");
        $str86$display_oe_patch_message_html = SubLObjectFactory.makeString("display-oe-patch-message.html");
        $str87$notes = SubLObjectFactory.makeString("notes");
        $str88$builder = SubLObjectFactory.makeString("builder");
        $str89$OE_Patch_Message = SubLObjectFactory.makeString("OE Patch Message");
        $str90$cb_handle_oe_patch_message = SubLObjectFactory.makeString("cb-handle-oe-patch-message");
        $str91$window_open__ = SubLObjectFactory.makeString("window.open('");
        $str92$__ = SubLObjectFactory.makeString("',");
        $str93$__A_ = SubLObjectFactory.makeString("'~A'");
        $str94$null = SubLObjectFactory.makeString("null");
        $str95$___A____ = SubLObjectFactory.makeString(",'~A'); ");
        $str96$return_false_ = SubLObjectFactory.makeString("return false;");
        $str97$Enter_a_short_description_to_go_i = SubLObjectFactory.makeString("Enter a short description to go in the subject of the email message, and a longer description in the \"Patch Message\" if warranted.  To not send a message at all, remove all email addresses from the \"To\" line.   ");
        $str98$To__ = SubLObjectFactory.makeString("To: ");
        $str99$to = SubLObjectFactory.makeString("to");
        $int100$80 = SubLObjectFactory.makeInteger(80);
        $str101$Short_Description__ = SubLObjectFactory.makeString("Short Description: ");
        $str102$subj = SubLObjectFactory.makeString("subj");
        $str103$Patch_Message__ = SubLObjectFactory.makeString("Patch Message: ");
        $int104$100 = SubLObjectFactory.makeInteger(100);
        $str105$virtual = SubLObjectFactory.makeString("virtual");
        $str106$send_message_ = SubLObjectFactory.makeString("send-message?");
        $str107$Transmit_and_Send_Patch_Message = SubLObjectFactory.makeString("Transmit and Send Patch Message");
        $str108$_ = SubLObjectFactory.makeString(" ");
        $str109$Transmit_without_Patch_Message = SubLObjectFactory.makeString("Transmit without Patch Message");
        $str110$OE_Patch__kb_ = SubLObjectFactory.makeString("OE Patch (kb=");
        $str111$___ = SubLObjectFactory.makeString("): ");
        $int112$1000 = SubLObjectFactory.makeInteger(1000);
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATION-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSCRIPT-CREATE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSCRIPT-RENAME-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSCRIPT-KILL-LIST"));
        $str114$_A = SubLObjectFactory.makeString("~A");
        $str115$Submitted = SubLObjectFactory.makeString("Submitted");
        $str116$Transmitted = SubLObjectFactory.makeString("Transmitted");
        $str117$_from_KB___A____ = SubLObjectFactory.makeString(" from KB: ~A~%~%");
        $str118$Patch_Description_____ = SubLObjectFactory.makeString("Patch Description:~%~%");
        $str119$_S__ = SubLObjectFactory.makeString("~S~%");
        $str120$__Transcript___A__ = SubLObjectFactory.makeString("~%Transcript: ~A~%");
        $str121$Total_Operations___A__ = SubLObjectFactory.makeString("Total Operations: ~A~%");
        $str122$__Killed_Constants____ = SubLObjectFactory.makeString("~%Killed Constants: ~%");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OP-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("WHO"), (SubLObject)SubLObjectFactory.makeSymbol("WHEN"));
        $str124$_A__ = SubLObjectFactory.makeString("~A~%");
        $str125$_and__A_more___ = SubLObjectFactory.makeString("[and ~A more]~%");
        $str126$__Renames____ = SubLObjectFactory.makeString("~%Renames: ~%");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OP-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("EXTERNAL-ID"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("WHO"), (SubLObject)SubLObjectFactory.makeSymbol("WHEN"));
        $str128$_A_____A__ = SubLObjectFactory.makeString("~A -> ~A~%");
        $str129$__New_Constants____ = SubLObjectFactory.makeString("~%New Constants: ~%");
        $sym130$CB_HANDLE_OE_PATCH_MESSAGE = SubLObjectFactory.makeSymbol("CB-HANDLE-OE-PATCH-MESSAGE");
        $str131$Mail_not_sent_due_to_invalid_from = SubLObjectFactory.makeString("Mail not sent due to invalid from (");
        $str132$__or_to__ = SubLObjectFactory.makeString(") or to (");
        $str133$__address = SubLObjectFactory.makeString(") address");
        $str134$sent = SubLObjectFactory.makeString("sent");
        $str135$submitted = SubLObjectFactory.makeString("submitted");
        $str136$Transcript_ = SubLObjectFactory.makeString("Transcript ");
        $str137$__but_no_mail_sent_ = SubLObjectFactory.makeString(", but no mail sent.");
        $str138$__but_mail_message_encountered_er = SubLObjectFactory.makeString(", but mail message encountered error: ");
        $int139$5000 = SubLObjectFactory.makeInteger(5000);
        $str140$_________________________ = SubLObjectFactory.makeString("~%---------------------~%");
        $str141$Transcript_as_KE_Text___ = SubLObjectFactory.makeString("Transcript as KE Text ~%");
        $str142$___and__A_more_operations___ = SubLObjectFactory.makeString(";;[and ~A more operations]~%");
        $str143$_Roll_to_KB_ = SubLObjectFactory.makeString("[Roll to KB ");
        $str144$_ = SubLObjectFactory.makeString("]");
        $kw145$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str146$cb_roll_current_kb = SubLObjectFactory.makeString("cb-roll-current-kb");
        $kw147$ROLL_CURRENT_KB = SubLObjectFactory.makeKeyword("ROLL-CURRENT-KB");
        $sym148$CB_LINK_ROLL_CURRENT_KB = SubLObjectFactory.makeSymbol("CB-LINK-ROLL-CURRENT-KB");
        $kw149$CB_REMOTE_FILTERS = SubLObjectFactory.makeKeyword("CB-REMOTE-FILTERS");
        $str150$cb_remote_filters_html = SubLObjectFactory.makeString("cb-remote-filters.html");
        $str151$Rolling_the_KB = SubLObjectFactory.makeString("Rolling the KB");
        $str152$Roll_to_KB_ = SubLObjectFactory.makeString("Roll to KB ");
        $str153$cb_handle_roll_current_kb = SubLObjectFactory.makeString("cb-handle-roll-current-kb");
        $str154$WARNING_ = SubLObjectFactory.makeString("WARNING:");
        $str155$Rolling_the_KB_is_will_filter_eve = SubLObjectFactory.makeString("Rolling the KB is will filter every operation until the start of the next KB.");
        $str156$Do_you_still_want_to_roll_to_KB__ = SubLObjectFactory.makeString("Do you still want to roll to KB ~S ?");
        $sym157$CB_ROLL_CURRENT_KB = SubLObjectFactory.makeSymbol("CB-ROLL-CURRENT-KB");
        $sym158$CB_HANDLE_ROLL_CURRENT_KB = SubLObjectFactory.makeSymbol("CB-HANDLE-ROLL-CURRENT-KB");
        $str159$cyc_agenda = SubLObjectFactory.makeString("cyc-agenda");
        $str160$Agenda_halted_due_to_ = SubLObjectFactory.makeString("Agenda halted due to:");
        $int161$32768 = SubLObjectFactory.makeInteger(32768);
        $kw162$CB_AGENDA = SubLObjectFactory.makeKeyword("CB-AGENDA");
        $str163$cb_agenda_html = SubLObjectFactory.makeString("cb-agenda.html");
        $str164$The_Cyc_Agenda_Control_Facilities = SubLObjectFactory.makeString("The Cyc Agenda Control Facilities");
        $str165$Agenda_Process_Control = SubLObjectFactory.makeString("Agenda Process Control");
        $str166$cb_abort_agenda = SubLObjectFactory.makeString("cb-abort-agenda");
        $str167$Here_you_control_the_turning_on_a = SubLObjectFactory.makeString("Here you control the turning on and off of your Cyc Agenda.");
        $str168$Currently__your_Agenda_is_ = SubLObjectFactory.makeString("Currently, your Agenda is ");
        $str169$running = SubLObjectFactory.makeString("running");
        $str170$halted = SubLObjectFactory.makeString("halted");
        $str171$_ = SubLObjectFactory.makeString(".");
        $kw172$HALT = SubLObjectFactory.makeKeyword("HALT");
        $str173$Run = SubLObjectFactory.makeString("Run");
        $str174$Current = SubLObjectFactory.makeString("Current");
        $str175$Last = SubLObjectFactory.makeString("Last");
        $str176$_Agenda_operation_ = SubLObjectFactory.makeString(" Agenda operation:");
        $str177$Abort_Operation = SubLObjectFactory.makeString("Abort Operation");
        $kw178$AGENDA = SubLObjectFactory.makeKeyword("AGENDA");
        $str179$_Refresh_ = SubLObjectFactory.makeString("[Refresh]");
        $str180$50_ = SubLObjectFactory.makeString("50%");
        $str181$Propagating_Assertion_ = SubLObjectFactory.makeString("Propagating Assertion:");
        $str182$_A_direct_ = SubLObjectFactory.makeString("~A direct ");
        $str183$and__A_indirect_ = SubLObjectFactory.makeString("and ~A indirect ");
        $kw184$ASSERTION_DEPENDENCIES = SubLObjectFactory.makeKeyword("ASSERTION-DEPENDENCIES");
        $str185$dependencies = SubLObjectFactory.makeString("dependencies");
        $sym186$CB_AGENDA = SubLObjectFactory.makeSymbol("CB-AGENDA");
        $str187$Agenda_ = SubLObjectFactory.makeString("Agenda:");
        $str188$cb_agenda = SubLObjectFactory.makeString("cb-agenda");
        $sym189$CB_LINK_AGENDA = SubLObjectFactory.makeSymbol("CB-LINK-AGENDA");
        $str190$The_agenda_is_no_longer_running_ = SubLObjectFactory.makeString("The agenda is no longer running.");
        $sym191$CB_ABORT_AGENDA = SubLObjectFactory.makeSymbol("CB-ABORT-AGENDA");
        $str192$cb_toggle_agenda_status = SubLObjectFactory.makeString("cb-toggle-agenda-status");
        $str193$Click_the_button_to_change_your_A = SubLObjectFactory.makeString("Click the button to change your Agenda status:");
        $str194$Halt_Agenda = SubLObjectFactory.makeString("Halt Agenda");
        $str195$Start_Agenda = SubLObjectFactory.makeString("Start Agenda");
        $str196$__For_detailed_help_on_the_Cyc_ag = SubLObjectFactory.makeString("--For detailed help on the Cyc agenda, read the ");
        $str197$_A__A = SubLObjectFactory.makeString("~A#~A");
        $str198$Cyc_Agenda_Documentation = SubLObjectFactory.makeString("Cyc Agenda Documentation");
        $str199$Agenda_Process_Changed = SubLObjectFactory.makeString("Agenda Process Changed");
        $str200$Halting_the_Agenda____ = SubLObjectFactory.makeString("Halting the Agenda ...");
        $str201$Starting_the_Agenda____ = SubLObjectFactory.makeString("Starting the Agenda ...");
        $str202$Your_Cyc_Agenda_is_now_ = SubLObjectFactory.makeString("Your Cyc Agenda is now ");
        $str203$Your_Cyc_Agenda_is_still_ = SubLObjectFactory.makeString("Your Cyc Agenda is still ");
        $str204$When_it_finishes_its_current_oper = SubLObjectFactory.makeString("When it finishes its current operation, its state will change as you requested.");
        $str205$Agenda = SubLObjectFactory.makeString("Agenda");
        $sym206$CB_TOGGLE_AGENDA_STATUS = SubLObjectFactory.makeSymbol("CB-TOGGLE-AGENDA-STATUS");
        $str207$cb_agenda_error_mode_handler = SubLObjectFactory.makeString("cb-agenda-error-mode-handler");
        $str208$Currently__when_Cyc_encounters_an = SubLObjectFactory.makeString("Currently, when Cyc encounters an error with local operations within the Agenda it:");
        $kw209$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str210$Continues__ignoring_the_error_ = SubLObjectFactory.makeString("Continues, ignoring the error.");
        $str211$Halts_the_Agenda_and_displays_the = SubLObjectFactory.makeString("Halts the Agenda and displays the reasons.");
        $kw212$DEBUG = SubLObjectFactory.makeKeyword("DEBUG");
        $str213$Enters_the_debugger_ = SubLObjectFactory.makeString("Enters the debugger.");
        $kw214$LOG = SubLObjectFactory.makeKeyword("LOG");
        $str215$Logs_the_error_and_continues_ = SubLObjectFactory.makeString("Logs the error and continues.");
        $kw216$AGENDA_ERROR_FILE = SubLObjectFactory.makeKeyword("AGENDA-ERROR-FILE");
        $str217$Illegal_state_in_cb_agenda_error_ = SubLObjectFactory.makeString("Illegal state in cb-agenda-error-mode-display.");
        $str218$Choose_the_new_error_handling_mod = SubLObjectFactory.makeString("Choose the new error handling mode below and select [");
        $str219$Submit_New_Mode = SubLObjectFactory.makeString("Submit New Mode");
        $str220$__to_initiate_the_change_ = SubLObjectFactory.makeString("] to initiate the change:");
        $str221$agenda_error_state = SubLObjectFactory.makeString("agenda-error-state");
        $str222$_ignore = SubLObjectFactory.makeString(":ignore");
        $str223$Ignore_and_Continue = SubLObjectFactory.makeString("Ignore and Continue");
        $str224$_halt = SubLObjectFactory.makeString(":halt");
        $str225$Halt_and_Display_Reason = SubLObjectFactory.makeString("Halt and Display Reason");
        $str226$_log = SubLObjectFactory.makeString(":log");
        $str227$Log_Errors_to_File = SubLObjectFactory.makeString("Log Errors to File");
        $str228$pathname = SubLObjectFactory.makeString("pathname");
        $int229$60 = SubLObjectFactory.makeInteger(60);
        $str230$Current_Mode = SubLObjectFactory.makeString("Current Mode");
        $sym231$CB_AGENDA_ERROR_MODE_HANDLER = SubLObjectFactory.makeSymbol("CB-AGENDA-ERROR-MODE-HANDLER");
        $str232$_operations_waiting_in_your_local = SubLObjectFactory.makeString(" operations waiting in your local queue.");
        $kw233$SHOW_LOCAL_OPS = SubLObjectFactory.makeKeyword("SHOW-LOCAL-OPS");
        $str234$Look_at_the_operations_in_the_loc = SubLObjectFactory.makeString("Look at the operations in the local queue.");
        $kw235$DELETE_LOCAL_OPS = SubLObjectFactory.makeKeyword("DELETE-LOCAL-OPS");
        $str236$Delete_the_local_queue_ = SubLObjectFactory.makeString("Delete the local queue.");
        $kw237$DELETE_LOCAL_AND_RESTART = SubLObjectFactory.makeKeyword("DELETE-LOCAL-AND-RESTART");
        $str238$Delete_the_local_queue_and_restar = SubLObjectFactory.makeString("Delete the local queue and restart agenda.");
        $str239$cb_agenda_error_file_viewer = SubLObjectFactory.makeString("cb-agenda-error-file-viewer");
        $str240$Agenda_Error_File___A = SubLObjectFactory.makeString("Agenda Error File: ~A");
        $sym241$CB_LINK_AGENDA_ERROR_FILE = SubLObjectFactory.makeSymbol("CB-LINK-AGENDA-ERROR-FILE");
        $str242$Agenda_log_file_empty___S = SubLObjectFactory.makeString("Agenda log file empty: ~S");
        $sym243$CB_AGENDA_ERROR_FILE_VIEWER = SubLObjectFactory.makeSymbol("CB-AGENDA-ERROR-FILE-VIEWER");
        $str244$cb_system = SubLObjectFactory.makeString("cb-system");
        $kw245$SYSTEM1 = SubLObjectFactory.makeKeyword("SYSTEM1");
        $sym246$CB_LINK_SYSTEM1 = SubLObjectFactory.makeSymbol("CB-LINK-SYSTEM1");
        $str247$System_ = SubLObjectFactory.makeString("System:");
        $kw248$SYSTEM = SubLObjectFactory.makeKeyword("SYSTEM");
        $sym249$CB_LINK_SYSTEM = SubLObjectFactory.makeSymbol("CB-LINK-SYSTEM");
        $kw250$CB_SYSTEM = SubLObjectFactory.makeKeyword("CB-SYSTEM");
        $str251$cb_system_html = SubLObjectFactory.makeString("cb-system.html");
        $str252$Cyc_System_Area = SubLObjectFactory.makeString("Cyc System Area");
        $str253$System_Area = SubLObjectFactory.makeString("System Area");
        $str254$Here_are_your_system_settings_ = SubLObjectFactory.makeString("Here are your system settings:");
        $kw255$CONFIRM_HALT_CYC = SubLObjectFactory.makeKeyword("CONFIRM-HALT-CYC");
        $str256$_Halt_this_image_ = SubLObjectFactory.makeString("[Halt this image]");
        $kw257$PROCESS_INSPECTOR = SubLObjectFactory.makeKeyword("PROCESS-INSPECTOR");
        $str258$_Process_Inspector_ = SubLObjectFactory.makeString("[Process Inspector]");
        $sym259$CB_SYSTEM = SubLObjectFactory.makeSymbol("CB-SYSTEM");
        $str260$cb_write_image_handler = SubLObjectFactory.makeString("cb-write-image-handler");
        $str261$Write_image_to_file__ = SubLObjectFactory.makeString("Write image to file: ");
        $str262$File_name__ = SubLObjectFactory.makeString("File name: ");
        $str263$file = SubLObjectFactory.makeString("file");
        $int264$40 = SubLObjectFactory.makeInteger(40);
        $str265$Write_image = SubLObjectFactory.makeString("Write image");
        $str266$_Warning__this_may_take_some_time = SubLObjectFactory.makeString(" Warning: this may take some time.");
        $str267$Write_Image = SubLObjectFactory.makeString("Write Image");
        $str268$Please_enter_a_filename_ = SubLObjectFactory.makeString("Please enter a filename.");
        $str269$Writing_to_file__ = SubLObjectFactory.makeString("Writing to file \"");
        $str270$__ = SubLObjectFactory.makeString("\".");
        $str271$__Done_ = SubLObjectFactory.makeString("  Done.");
        $sym272$CB_WRITE_IMAGE_HANDLER = SubLObjectFactory.makeSymbol("CB-WRITE-IMAGE-HANDLER");
        $str273$Machine_name__ = SubLObjectFactory.makeString("Machine name: ");
        $str274$unknown = SubLObjectFactory.makeString("unknown");
        $str275$SubL_implementation__ = SubLObjectFactory.makeString("SubL implementation: ");
        $str276$Base_TCP_port__ = SubLObjectFactory.makeString("Base TCP port: ");
        $str277$Image_name__ = SubLObjectFactory.makeString("Image name: ");
        $str278$Image_Process_ID__ = SubLObjectFactory.makeString("Image Process ID: ");
        $str279$Image_start_time_ = SubLObjectFactory.makeString("Image start time:");
        $str280$__up__A_ = SubLObjectFactory.makeString(" (up ~A)");
        $str281$Cyc_revision_level__ = SubLObjectFactory.makeString("Cyc revision level: ");
        $str282$Cyc_code_version__ = SubLObjectFactory.makeString("Cyc code version: ");
        $str283$Current_KB__ = SubLObjectFactory.makeString("Current KB: ");
        $str284$Queue_Information__ = SubLObjectFactory.makeString("Queue Information: ");
        $str285$Master_Transcript_Operations_Read = SubLObjectFactory.makeString("Master Transcript Operations Read:  ");
        $str286$Master_Transcript_Operations_Read = SubLObjectFactory.makeString("Master Transcript Operations Read but Unprocessed:  ");
        $str287$Master_Transcript_Operations_Proc = SubLObjectFactory.makeString("Master Transcript Operations Processed:  ");
        $str288$Master_Transcript_Operations_Proc = SubLObjectFactory.makeString("Master Transcript Operations Processed but Filtered:  ");
        $str289$Master_Transcript_Operations_Proc = SubLObjectFactory.makeString("Master Transcript Operations Processed and Evaluated:  ");
        $str290$Unprocessed_Local_Queue_Operation = SubLObjectFactory.makeString("Unprocessed Local Queue Operations:  ");
        $str291$Local_Queue_Operations_Processed_ = SubLObjectFactory.makeString("Local Queue Operations Processed But Unrecorded:  ");
        $str292$Current_Local_Transcript_Operatio = SubLObjectFactory.makeString("Current Local Transcript Operations Processed And Recorded:  ");
        $str293$Unprocessed_auxiliary_queue_opera = SubLObjectFactory.makeString("Unprocessed auxiliary queue operations:  ");
        $str294$Transcript_Information_ = SubLObjectFactory.makeString("Transcript Information:");
        $str295$Master_Transcript___ = SubLObjectFactory.makeString("Master Transcript:  ");
        $str296$Maintained_By_Transcript_Server = SubLObjectFactory.makeString("Maintained By Transcript Server");
        $str297$___A__A_ = SubLObjectFactory.makeString(" (~A:~A)");
        $str298$Operations___ = SubLObjectFactory.makeString("Operations:  ");
        $kw299$READ_TRANS = SubLObjectFactory.makeKeyword("READ-TRANS");
        $str300$None = SubLObjectFactory.makeString("None");
        $str301$Characters___ = SubLObjectFactory.makeString("Characters:  ");
        $str302$Estimated_Ops___ = SubLObjectFactory.makeString("Estimated Ops:  ");
        $str303$Local_Transcript___ = SubLObjectFactory.makeString("Local Transcript:  ");
        $str304$Historical_Information_ = SubLObjectFactory.makeString("Historical Information:");
        $str305$Remote_Operations_Processed__ = SubLObjectFactory.makeString("Remote Operations Processed: ");
        $str306$Local_Operations_Recorded___ = SubLObjectFactory.makeString("Local Operations Recorded:  ");
        $str307$Local_Operations_Sent_To_Master_T = SubLObjectFactory.makeString("Local Operations Sent To Master Transcript:  ");
        $str308$Auxiliary_Queue_Operations_Proces = SubLObjectFactory.makeString("Auxiliary Queue Operations Processed:  ");
        $str309$read = SubLObjectFactory.makeString("read");
        $sym310$STRING_EQUAL = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $str311$cb_system_ready_transcript_file_r = SubLObjectFactory.makeString("cb-system-ready-transcript-file&read");
        $sym312$CB_LINK_READ_TRANS = SubLObjectFactory.makeSymbol("CB-LINK-READ-TRANS");
        $str313$write = SubLObjectFactory.makeString("write");
        $sym314$CB_LINK_WRITE_TRANS = SubLObjectFactory.makeSymbol("CB-LINK-WRITE-TRANS");
        $str315$cb_system_ready_transcript_file__ = SubLObjectFactory.makeString("cb-system-ready-transcript-file&~A");
        $kw316$VIEW_TRANSCRIPT = SubLObjectFactory.makeKeyword("VIEW-TRANSCRIPT");
        $sym317$CB_LINK_VIEW_TRANSCRIPT = SubLObjectFactory.makeSymbol("CB-LINK-VIEW-TRANSCRIPT");
        $str318$cb_transcript_viewer_handler_ = SubLObjectFactory.makeString("cb-transcript-viewer-handler&");
        $str319$stats_ = SubLObjectFactory.makeString("stats:");
        $str320$_Stats_ = SubLObjectFactory.makeString("[Stats]");
        $sym321$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $sym322$CB_SYSTEM_READY_TRANSCRIPT_FILE = SubLObjectFactory.makeSymbol("CB-SYSTEM-READY-TRANSCRIPT-FILE");
        $kw323$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str324$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw325$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE = SubLObjectFactory.makeKeyword("CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE");
        $str326$cb_system_show_specific_transcrip = SubLObjectFactory.makeString("cb-system-show-specific-transcript-file.html");
        $str327$File_Contents__Transcript_File = SubLObjectFactory.makeString("File Contents: Transcript File");
        $str328$cg_cb_system_show_specific_transc = SubLObjectFactory.makeString("cg?cb-system-show-specific-transcript-file-as-ke-text&transcript-filename=~A");
        $str329$View_Transcript_in_KE_Text_format = SubLObjectFactory.makeString("View Transcript in KE Text format.");
        $str330$File__ = SubLObjectFactory.makeString("File: ");
        $str331$Operations__ = SubLObjectFactory.makeString("Operations: ");
        $str332$No_operations_have_been_saved_yet = SubLObjectFactory.makeString("No operations have been saved yet in");
        $str333$_s_is_not_a_pathname_string_ = SubLObjectFactory.makeString("~s is not a pathname string.");
        $kw334$CB_CHOOSE_PROJECT = SubLObjectFactory.makeKeyword("CB-CHOOSE-PROJECT");
        $str335$cb_choose_project_html = SubLObjectFactory.makeString("cb-choose-project.html");
        $str336$Choose_KE_Project = SubLObjectFactory.makeString("Choose KE Project");
        $str337$cb_choose_project_handler = SubLObjectFactory.makeString("cb-choose-project-handler");
        $str338$Choose_your_project_from_the_opti = SubLObjectFactory.makeString("Choose your project from the options below.");
        $str339$project = SubLObjectFactory.makeString("project");
        $str340$No_Project_Selected = SubLObjectFactory.makeString("No Project Selected");
        $str341$Reset = SubLObjectFactory.makeString("Reset");
        $sym342$CB_CHOOSE_PROJECT = SubLObjectFactory.makeSymbol("CB-CHOOSE-PROJECT");
        $const343$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const344$OngoingStatus = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OngoingStatus"));
        $str345$nil = SubLObjectFactory.makeString("nil");
        $str346$Project_has_been_changed_ = SubLObjectFactory.makeString("Project has been changed.");
        $sym347$CB_CHOOSE_PROJECT_HANDLER = SubLObjectFactory.makeSymbol("CB-CHOOSE-PROJECT-HANDLER");
        $str348$Current_Project = SubLObjectFactory.makeString("Current Project");
        $str349$cb_choose_project = SubLObjectFactory.makeString("cb-choose-project");
        $kw350$CHOOSE_PROJECT = SubLObjectFactory.makeKeyword("CHOOSE-PROJECT");
        $sym351$CB_LINK_CHOOSE_PROJECT = SubLObjectFactory.makeSymbol("CB-LINK-CHOOSE-PROJECT");
        $const352$CycBrowser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycBrowser"));
        $sym353$_PROJECT = SubLObjectFactory.makeSymbol("?PROJECT");
        $const354$cyclistPrimaryProject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistPrimaryProject"));
        $list355 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PROJECT"));
        $list356 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)cb_system_tools.ONE_INTEGER);
        $kw357$CB_LOGIN = SubLObjectFactory.makeKeyword("CB-LOGIN");
        $str358$cb_login_html = SubLObjectFactory.makeString("cb-login.html");
        $str359$new_login_name = SubLObjectFactory.makeString("new_login_name");
        $str360$Login_Area = SubLObjectFactory.makeString("Login Area");
        $str361$cb_login_handler = SubLObjectFactory.makeString("cb-login-handler");
        $str362$This_image_has_been_designated__ = SubLObjectFactory.makeString("This image has been designated: ");
        $str363$You_are_currently_logged_in_as_ = SubLObjectFactory.makeString("You are currently logged in as ");
        $str364$Click_ = SubLObjectFactory.makeString("Click ");
        $kw365$LOGOUT = SubLObjectFactory.makeKeyword("LOGOUT");
        $str366$here = SubLObjectFactory.makeString("here");
        $str367$_to_logout_now_ = SubLObjectFactory.makeString(" to logout now.");
        $str368$Type_in_your_new_login_name_below = SubLObjectFactory.makeString("Type in your new login name below and press the [");
        $str369$__button_ = SubLObjectFactory.makeString("] button:");
        $str370$new_login_hashed_password = SubLObjectFactory.makeString("new_login_hashed_password");
        $str371$Cyclist = SubLObjectFactory.makeString("Cyclist");
        $str372$Password = SubLObjectFactory.makeString("Password");
        $str373$___ = SubLObjectFactory.makeString(" : ");
        $str374$The_following_are_currently_logge = SubLObjectFactory.makeString("The following are currently logged in to ");
        $str375$_ = SubLObjectFactory.makeString(":");
        $str376$User = SubLObjectFactory.makeString("User");
        $str377$Local_Machine = SubLObjectFactory.makeString("Local Machine");
        $list378 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACHINE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("USER-NAME"));
        $str379$_Session_id__ = SubLObjectFactory.makeString("(Session id: ");
        $kw380$FORCE_LOGOUT = SubLObjectFactory.makeKeyword("FORCE-LOGOUT");
        $str381$_Force_Logout_ = SubLObjectFactory.makeString("[Force Logout]");
        $str382$_ = SubLObjectFactory.makeString(")");
        $kw383$LARR = SubLObjectFactory.makeKeyword("LARR");
        $str384$_you = SubLObjectFactory.makeString(" you");
        $kw385$NOTIFY_ALL_USERS = SubLObjectFactory.makeKeyword("NOTIFY-ALL-USERS");
        $sym386$CB_LOGIN = SubLObjectFactory.makeSymbol("CB-LOGIN");
        $str387$sessionId = SubLObjectFactory.makeString("sessionId");
        $kw388$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $kw389$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $sym390$CB_FORCE_LOGOUT = SubLObjectFactory.makeSymbol("CB-FORCE-LOGOUT");
        $str391$_a_sessionId__a = SubLObjectFactory.makeString("~a&sessionId=~a");
        $str392$cb_force_logout = SubLObjectFactory.makeString("cb-force-logout");
        $sym393$CB_LINK_FORCE_LOGOUT = SubLObjectFactory.makeSymbol("CB-LINK-FORCE-LOGOUT");
        $str394$Complete = SubLObjectFactory.makeString("Complete");
        $const395$HumanCyclist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanCyclist"));
        $int396$27 = SubLObjectFactory.makeInteger(27);
        $str397$Clear = SubLObjectFactory.makeString("Clear");
        $str398$cb_notify_all_users = SubLObjectFactory.makeString("cb-notify-all-users");
        $str399$Send_Email_to_all_Users = SubLObjectFactory.makeString("Send Email to all Users");
        $sym400$CB_LINK_NOTIFY_ALL_USERS = SubLObjectFactory.makeSymbol("CB-LINK-NOTIFY-ALL-USERS");
        $str401$Mail_all_users = SubLObjectFactory.makeString("Mail all users");
        $str402$Please_enter_the_message_you_wish = SubLObjectFactory.makeString("Please enter the message you wish to send to the following users.");
        $str403$cb_send_email_to_selected_users = SubLObjectFactory.makeString("cb-send-email-to-selected-users");
        $list404 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACHINE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("USER"));
        $const405$Guest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Guest"));
        $str406$To_ = SubLObjectFactory.makeString("To:");
        $sym407$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $str408$From__ = SubLObjectFactory.makeString("From: ");
        $str409$Subject__ = SubLObjectFactory.makeString("Subject: ");
        $str410$subject = SubLObjectFactory.makeString("subject");
        $int411$72 = SubLObjectFactory.makeInteger(72);
        $str412$Message__ = SubLObjectFactory.makeString("Message: ");
        $str413$Send_Email = SubLObjectFactory.makeString("Send Email");
        $sym414$CB_NOTIFY_ALL_USERS = SubLObjectFactory.makeSymbol("CB-NOTIFY-ALL-USERS");
        $str415$exclude = SubLObjectFactory.makeString("exclude");
        $str416$Email_Address = SubLObjectFactory.makeString("Email Address");
        $str417$Exclude_ = SubLObjectFactory.makeString("Exclude?");
        $sym418$CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER = SubLObjectFactory.makeSymbol("CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER");
        $str419$exclude_ = SubLObjectFactory.makeString("exclude_");
        $sym420$_CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER-CACHING-STATE*");
        $kw421$ADDRESS = SubLObjectFactory.makeKeyword("ADDRESS");
        $const422$preferredEMailAddressText = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredEMailAddressText"));
        $list423 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ADDRESS"));
        $const424$CyclistsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt"));
        $str425$Sending_Message = SubLObjectFactory.makeString("Sending Message");
        $str426$Sending_message_with_following_co = SubLObjectFactory.makeString("Sending message with following content:");
        $str427$Subject = SubLObjectFactory.makeString("Subject");
        $str428$Message_ = SubLObjectFactory.makeString("Message:");
        $str429$Sending_Log = SubLObjectFactory.makeString("Sending Log");
        $list430 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("USER"));
        $str431$Excluding_user_ = SubLObjectFactory.makeString("Excluding user ");
        $str432$Sent_message_to_ = SubLObjectFactory.makeString("Sent message to ");
        $str433$Error_on_sending_message_to_ = SubLObjectFactory.makeString("Error on sending message to ");
        $sym434$CB_SEND_EMAIL_TO_SELECTED_USERS = SubLObjectFactory.makeSymbol("CB-SEND-EMAIL-TO-SELECTED-USERS");
        $str435$Login_ = SubLObjectFactory.makeString("Login:");
        $str436$cb_login = SubLObjectFactory.makeString("cb-login");
        $kw437$LOGIN = SubLObjectFactory.makeKeyword("LOGIN");
        $sym438$CB_LINK_LOGIN = SubLObjectFactory.makeSymbol("CB-LINK-LOGIN");
        $sym439$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $sym440$CB_LOGIN_HANDLER = SubLObjectFactory.makeSymbol("CB-LOGIN-HANDLER");
        $sym441$HUMAN_CYCLIST_ = SubLObjectFactory.makeSymbol("HUMAN-CYCLIST?");
        $str442$redirect_handler = SubLObjectFactory.makeString("redirect-handler");
        $sym443$FIRST_LIST = SubLObjectFactory.makeSymbol("FIRST-LIST");
        $str444$Known_Constant = SubLObjectFactory.makeString("Known Constant");
        $str445$The_name_you_typed_in__ = SubLObjectFactory.makeString("The name you typed in, ");
        $str446$_is_already_used_in_the_Knowledge = SubLObjectFactory.makeString(" is already used in the Knowledge Base as a Cyc constant.");
        $str447$Please_go_back_and_try_a_differen = SubLObjectFactory.makeString("Please go back and try a different login name.");
        $str448$Successful_Login = SubLObjectFactory.makeString("Successful Login");
        $str449$Welcome__ = SubLObjectFactory.makeString("Welcome, ");
        $str450$_ = SubLObjectFactory.makeString("!");
        $str451$Your_project_has_been_set_to_ = SubLObjectFactory.makeString("Your project has been set to ");
        $str452$Change_Project = SubLObjectFactory.makeString("Change Project");
        $str453$Your_project_is_currently_not_set = SubLObjectFactory.makeString("Your project is currently not set.");
        $str454$Choose_Project = SubLObjectFactory.makeString("Choose Project");
        $str455$Login = SubLObjectFactory.makeString("Login");
        $list456 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dr")), (SubLObject)SubLObjectFactory.makeString("Dr.")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Reverend-Title")), (SubLObject)SubLObjectFactory.makeString("Rev.")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Prof")), (SubLObject)SubLObjectFactory.makeString("Prof.")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("President-Title")), (SubLObject)SubLObjectFactory.makeString("President")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Sir")), (SubLObject)SubLObjectFactory.makeString("Sir")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Major-Title")), (SubLObject)SubLObjectFactory.makeString("Maj.")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lieutenant-Title")), (SubLObject)SubLObjectFactory.makeString("Lt.")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LieutenantColonel-Title")), (SubLObject)SubLObjectFactory.makeString("Ltc.")));
        $sym457$_TITLE = SubLObjectFactory.makeSymbol("?TITLE");
        $const458$titleOfPerson = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("titleOfPerson"));
        $list459 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TITLE"));
        $const460$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list461 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KNOWN-TITLE"), (SubLObject)SubLObjectFactory.makeSymbol("PREFIX-STRING"));
        $const462$Sir = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Sir"));
        $const463$givenNames = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("givenNames"));
        $const464$familyName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("familyName"));
        $kw465$NONE = SubLObjectFactory.makeKeyword("NONE");
        $list466 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("givenNames")));
        $str467$Unknown_Cyclist = SubLObjectFactory.makeString("Unknown Cyclist");
        $str468$cb_create_new_cyclist = SubLObjectFactory.makeString("cb-create-new-cyclist");
        $str469$The_name_ = SubLObjectFactory.makeString("The name ");
        $str470$_is_not_the_name_of_a_known_ = SubLObjectFactory.makeString(" is not the name of a known ");
        $str471$Do_you_want_to_create_a_new_Cyc_c = SubLObjectFactory.makeString("Do you want to create a new Cyc constant with this name?  You will be able to use this constant as you would any other in the Knowledge Base as well as login with this new name.");
        $str472$Yes__Create_Cyclist = SubLObjectFactory.makeString("Yes, Create Cyclist");
        $str473$creating_new_cyclists = SubLObjectFactory.makeString("creating new cyclists");
        $const474$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list475 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanCyclist")));
        $str476$Unable_to_create_a_new_cyclist__w = SubLObjectFactory.makeString("Unable to create a new cyclist (why?");
        $sym477$CB_CREATE_NEW_CYCLIST = SubLObjectFactory.makeSymbol("CB-CREATE-NEW-CYCLIST");
        $str478$Logout = SubLObjectFactory.makeString("Logout");
        $str479$You_have_now_logged_out_from_this = SubLObjectFactory.makeString("You have now logged out from this Cyc image.  Goodbye!");
        $kw480$START = SubLObjectFactory.makeKeyword("START");
        $str481$_to_reconnect_to_Cyc_ = SubLObjectFactory.makeString(" to reconnect to Cyc.");
        $sym482$CB_LOGOUT = SubLObjectFactory.makeSymbol("CB-LOGOUT");
        $str483$_Logout_ = SubLObjectFactory.makeString("[Logout]");
        $str484$cb_logout = SubLObjectFactory.makeString("cb-logout");
        $sym485$CB_LINK_LOGOUT = SubLObjectFactory.makeSymbol("CB-LINK-LOGOUT");
        $str486$problem = SubLObjectFactory.makeString("problem");
        $str487$user_login = SubLObjectFactory.makeString("user_login");
        $str488$Specify_Cyc_Browser_Password = SubLObjectFactory.makeString("Specify Cyc Browser Password");
        $str489$80_ = SubLObjectFactory.makeString("80%");
        $str490$Error_ = SubLObjectFactory.makeString("Error!");
        $str491$Could_not_set_password_for_ = SubLObjectFactory.makeString("Could not set password for ");
        $str492$Reason_ = SubLObjectFactory.makeString("Reason:");
        $str493$Please_specify_a_new_password_for = SubLObjectFactory.makeString("Please specify a new password for a cyclist.");
        $str494$_Note__Only_you_can_reset_your_ow = SubLObjectFactory.makeString("(Note: Only you can reset your own password.)");
        $str495$cb_set_password_handler = SubLObjectFactory.makeString("cb-set-password-handler");
        $str496$New_Password = SubLObjectFactory.makeString("New Password");
        $sym497$CB_SET_PASSWORD = SubLObjectFactory.makeSymbol("CB-SET-PASSWORD");
        $str498$_Set_Password_ = SubLObjectFactory.makeString("[Set Password]");
        $str499$cb_set_password = SubLObjectFactory.makeString("cb-set-password");
        $kw500$SET_PASSWORD = SubLObjectFactory.makeKeyword("SET-PASSWORD");
        $sym501$CB_LINK_SET_PASSWORD = SubLObjectFactory.makeSymbol("CB-LINK-SET-PASSWORD");
        $str502$Set_Password = SubLObjectFactory.makeString("Set Password");
        $str503$Passwd = SubLObjectFactory.makeString("Passwd");
        $str504$Set_passwords_for_Cyclist_Authent = SubLObjectFactory.makeString("Set passwords for Cyclist Authentication");
        $str505$Please_fill_in_all_fields_ = SubLObjectFactory.makeString("Please fill in all fields.");
        $str506$No_known_cyclist_by_this_name_ = SubLObjectFactory.makeString("No known cyclist by this name.");
        $str507$The_name_could_mean_any_of_follow = SubLObjectFactory.makeString("The name could mean any of following cyclists: ");
        $list508 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("encryptedPasswordForUser")));
        $sym509$CB_SET_PASSWORD_HANDLER = SubLObjectFactory.makeSymbol("CB-SET-PASSWORD-HANDLER");
        $kw510$CB_CONFIRM_HALT_CYC = SubLObjectFactory.makeKeyword("CB-CONFIRM-HALT-CYC");
        $str511$cb_confirm_halt_cyc_html = SubLObjectFactory.makeString("cb-confirm-halt-cyc.html");
        $str512$the_Halt_Cyc_Image = SubLObjectFactory.makeString("the Halt Cyc Image");
        $str513$Halt_Cyc_Image = SubLObjectFactory.makeString("Halt Cyc Image");
        $str514$cb_halt_cyc = SubLObjectFactory.makeString("cb-halt-cyc");
        $str515$halt = SubLObjectFactory.makeString("halt");
        $sym516$CB_CONFIRM_HALT_CYC = SubLObjectFactory.makeSymbol("CB-CONFIRM-HALT-CYC");
        $str517$_Halt_Cyc_ = SubLObjectFactory.makeString("[Halt Cyc]");
        $str518$cb_confirm_halt_cyc = SubLObjectFactory.makeString("cb-confirm-halt-cyc");
        $sym519$CB_LINK_CONFIRM_HALT_CYC = SubLObjectFactory.makeSymbol("CB-LINK-CONFIRM-HALT-CYC");
        $str520$Halt_Image_Not_Allowed = SubLObjectFactory.makeString("Halt Image Not Allowed");
        $str521$Sorry__this_image_cannot_be_halte = SubLObjectFactory.makeString("Sorry, this image cannot be halted through the Cyc Browser.");
        $str522$Cyc_Image_Halted = SubLObjectFactory.makeString("Cyc Image Halted");
        $str523$This_Cyc_image_will_be_halted___G = SubLObjectFactory.makeString("This Cyc image will be halted.  Goodbye!");
        $str524$Halted_by_ = SubLObjectFactory.makeString("Halted by ");
        $str525$_Via_HTML_interface = SubLObjectFactory.makeString(" Via HTML interface");
        $sym526$CB_HALT_CYC = SubLObjectFactory.makeSymbol("CB-HALT-CYC");
        $str527$This_will_ = SubLObjectFactory.makeString("This will ");
        $str528$_the_Cyc_image_ = SubLObjectFactory.makeString(" the Cyc image ");
        $str529$red = SubLObjectFactory.makeString("red");
        $str530$Warning__ = SubLObjectFactory.makeString("Warning: ");
        $str531$There_are__A_operations_waiting_i = SubLObjectFactory.makeString("There are ~A operations waiting in the transmit queue.  If you ");
        $str532$_now__they_will_be_lost_ = SubLObjectFactory.makeString(" now, they will be lost.");
        $str533$Do_you_really_want_to_do_this_ = SubLObjectFactory.makeString("Do you really want to do this?");
        $str534$Yes__ = SubLObjectFactory.makeString("Yes, ");
        $str535$_system = SubLObjectFactory.makeString(" system");
        $kw536$CB_TRANSCRIPT_VIEWER = SubLObjectFactory.makeKeyword("CB-TRANSCRIPT-VIEWER");
        $str537$cb_transcript_viewer_html = SubLObjectFactory.makeString("cb-transcript-viewer.html");
        $str538$show_stats = SubLObjectFactory.makeString("show-stats");
        $str539$transcript_filename = SubLObjectFactory.makeString("transcript_filename");
        $str540$Please_type_in_a_filename_ = SubLObjectFactory.makeString("Please type in a filename.");
        $str541$Transcript_Viewing_Area = SubLObjectFactory.makeString("Transcript Viewing Area");
        $str542$cb_transcript_viewer_handler = SubLObjectFactory.makeString("cb-transcript-viewer-handler");
        $kw543$ALL_LOCAL_TRANS = SubLObjectFactory.makeKeyword("ALL-LOCAL-TRANS");
        $str544$cg_cb_transcript_viewer = SubLObjectFactory.makeString("cg?cb-transcript-viewer");
        $kw545$GET = SubLObjectFactory.makeKeyword("GET");
        $str546$cb_transcript_viewer = SubLObjectFactory.makeString("cb-transcript-viewer");
        $str547$View_other_transcript_ = SubLObjectFactory.makeString("View other transcript:");
        $str548$Please_type_in_the_full_path_to_t = SubLObjectFactory.makeString("Please type in the full path to the transcript: (e.g. /cyc/top/transcripts/[kb#]/[transcript_name])");
        $str549$ERROR__ = SubLObjectFactory.makeString("ERROR: ");
        $str550$Stats = SubLObjectFactory.makeString("Stats");
        $str551$View_Transcript = SubLObjectFactory.makeString("View Transcript");
        $sym552$CB_TRANSCRIPT_VIEWER = SubLObjectFactory.makeSymbol("CB-TRANSCRIPT-VIEWER");
        $sym553$CB_TRANSCRIPT_VIEWER_HANDLER = SubLObjectFactory.makeSymbol("CB-TRANSCRIPT-VIEWER-HANDLER");
        $str554$Transcript_Statistics = SubLObjectFactory.makeString("Transcript Statistics");
        $str555$Transcript__ = SubLObjectFactory.makeString("Transcript: ");
        $str556$Constants_Created__ = SubLObjectFactory.makeString("Constants Created: ");
        $str557$Constants_Renamed__ = SubLObjectFactory.makeString("Constants Renamed: ");
        $str558$__ = SubLObjectFactory.makeString("=>");
        $str559$Constants_Killed__ = SubLObjectFactory.makeString("Constants Killed: ");
        $str560$No_transcripts_for_this_image_ = SubLObjectFactory.makeString("No transcripts for this image!");
        $str561$Local_transcripts_for_this_image_ = SubLObjectFactory.makeString("Local transcripts for this image:");
        $str562$cb_transcript_viewer_handler_stat = SubLObjectFactory.makeString("cb-transcript-viewer-handler&stats:");
        $sym563$CB_LINK_ALL_LOCAL_TRANS = SubLObjectFactory.makeSymbol("CB-LINK-ALL-LOCAL-TRANS");
        $str564$Viewer = SubLObjectFactory.makeString("Viewer");
        $kw565$VIEWER = SubLObjectFactory.makeKeyword("VIEWER");
        $sym566$CB_LINK_VIEWER = SubLObjectFactory.makeSymbol("CB-LINK-VIEWER");
        $str567$Transcript_Viewer = SubLObjectFactory.makeString("Transcript Viewer");
        $str568$View = SubLObjectFactory.makeString("View");
        $str569$View_Local_Transcripts = SubLObjectFactory.makeString("View Local Transcripts");
        $kw570$CB_SHOW_LOCAL_OPS = SubLObjectFactory.makeKeyword("CB-SHOW-LOCAL-OPS");
        $str571$cb_show_local_ops_html = SubLObjectFactory.makeString("cb-show-local-ops.html");
        $str572$Local_Operations = SubLObjectFactory.makeString("Local Operations");
        $str573$cb_confirm_clear_local_queue = SubLObjectFactory.makeString("cb-confirm-clear-local-queue");
        $str574$You_have_nothing_in_your_local_qu = SubLObjectFactory.makeString("You have nothing in your local queue.");
        $str575$_item = SubLObjectFactory.makeString(" item");
        $str576$s = SubLObjectFactory.makeString("s");
        $str577$_in_your_local_queue_ = SubLObjectFactory.makeString(" in your local queue.");
        $str578$Click_this_button_to_erase_the_lo = SubLObjectFactory.makeString("Click this button to erase the local queue:");
        $str579$Clear_Local_Queue = SubLObjectFactory.makeString("Clear Local Queue");
        $str580$Here_are_the_queued_local_operati = SubLObjectFactory.makeString("Here are the queued local operations:");
        $sym581$CB_SHOW_LOCAL_OPS = SubLObjectFactory.makeSymbol("CB-SHOW-LOCAL-OPS");
        $str582$Local_ = SubLObjectFactory.makeString("Local:");
        $str583$cb_show_local_ops = SubLObjectFactory.makeString("cb-show-local-ops");
        $sym584$CB_LINK_SHOW_LOCAL_OPS = SubLObjectFactory.makeSymbol("CB-LINK-SHOW-LOCAL-OPS");
        $kw585$CB_CONFIRM_CLEAR_LOCAL_QUEUE = SubLObjectFactory.makeKeyword("CB-CONFIRM-CLEAR-LOCAL-QUEUE");
        $str586$cb_confirm_clear_local_queue_html = SubLObjectFactory.makeString("cb-confirm-clear-local-queue.html");
        $str587$cb_clear_local_queue = SubLObjectFactory.makeString("cb-clear-local-queue");
        $str588$Are_you_ = SubLObjectFactory.makeString("Are you ");
        $str589$SURE = SubLObjectFactory.makeString("SURE");
        $str590$_you_want_to_clear_your_local_que = SubLObjectFactory.makeString(" you want to clear your local queue?");
        $str591$_operations_will_be_lost_ = SubLObjectFactory.makeString(" operations will be lost!");
        $str592$Yes__Clear_Local_Queue = SubLObjectFactory.makeString("Yes, Clear Local Queue");
        $sym593$CB_CONFIRM_CLEAR_LOCAL_QUEUE = SubLObjectFactory.makeSymbol("CB-CONFIRM-CLEAR-LOCAL-QUEUE");
        $kw594$CB_CONFIRM_CLEAR_LOCAL_AND_RESTART = SubLObjectFactory.makeKeyword("CB-CONFIRM-CLEAR-LOCAL-AND-RESTART");
        $str595$cb_confirm_clear_local_and_restar = SubLObjectFactory.makeString("cb-confirm-clear-local-and-restart.html");
        $str596$cb_clear_local_and_restart = SubLObjectFactory.makeString("cb-clear-local-and-restart");
        $str597$You_have_nothing_in_your_local_qu = SubLObjectFactory.makeString("You have nothing in your local queue. Restarting agenda...");
        $str598$Local_Queue_Cleared__Agenda_Resta = SubLObjectFactory.makeString("Local Queue Cleared, Agenda Restarted");
        $str599$_you_want_to_clear_your_local_que = SubLObjectFactory.makeString(" you want to clear your local queue before restarting the agenda?");
        $str600$Yes__Clear_Local_Queue_and_Restar = SubLObjectFactory.makeString("Yes, Clear Local Queue and Restart");
        $sym601$CB_CONFIRM_CLEAR_LOCAL_AND_RESTART = SubLObjectFactory.makeSymbol("CB-CONFIRM-CLEAR-LOCAL-AND-RESTART");
        $str602$cb_confirm_clear_local_and_restar = SubLObjectFactory.makeString("cb-confirm-clear-local-and-restart");
        $sym603$CB_LINK_DELETE_LOCAL_AND_RESTART = SubLObjectFactory.makeSymbol("CB-LINK-DELETE-LOCAL-AND-RESTART");
        $sym604$CB_LINK_DELETE_LOCAL_OPS = SubLObjectFactory.makeSymbol("CB-LINK-DELETE-LOCAL-OPS");
        $sym605$CB_CLEAR_LOCAL_AND_RESTART = SubLObjectFactory.makeSymbol("CB-CLEAR-LOCAL-AND-RESTART");
        $str606$Local_Queue_Cleared = SubLObjectFactory.makeString("Local Queue Cleared");
        $sym607$CB_CLEAR_LOCAL_QUEUE = SubLObjectFactory.makeSymbol("CB-CLEAR-LOCAL-QUEUE");
        $kw608$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT = SubLObjectFactory.makeKeyword("CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT");
        $str609$cb_system_show_specific_transcrip = SubLObjectFactory.makeString("cb-system-show-specific-transcript-file-as-ke-text.html");
        $str610$transcript_filename = SubLObjectFactory.makeString("transcript-filename");
        $str611$output_filename = SubLObjectFactory.makeString("output-filename");
        $str612$error_message = SubLObjectFactory.makeString("error-message");
        $str613$Transcript_file_viewed_in_KE_Text = SubLObjectFactory.makeString("Transcript file viewed in KE Text format");
        $str614$The_transcript_file_contains_no_o = SubLObjectFactory.makeString("The transcript file contains no operations.");
        $str615$cg_cb_write_local_transcript_as_k = SubLObjectFactory.makeString("cg?cb-write-local-transcript-as-ke-text");
        $kw616$POST = SubLObjectFactory.makeKeyword("POST");
        $str617$cb_system_write_specific_transcri = SubLObjectFactory.makeString("cb-system-write-specific-transcript-file-as-ke-text");
        $str618$You_may_write_this_transcript_in_ = SubLObjectFactory.makeString("You may write this transcript in KE Text format to a file.  Please type in the full path of the file to write to.");
        $kw619$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $str620$Write_to_File = SubLObjectFactory.makeString("Write to File");
        $str621$This_is_what_the_transcript_curre = SubLObjectFactory.makeString("This is what the transcript currently looks like converted to KE Text:");
        $sym622$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT = SubLObjectFactory.makeSymbol("CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT");
        $str623$Transcript_successfully_written_ = SubLObjectFactory.makeString("Transcript successfully written.");
        $sym624$CB_SYSTEM_WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT = SubLObjectFactory.makeSymbol("CB-SYSTEM-WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT");
    }
}

/*

	Total time: 5832 ms
	
*/