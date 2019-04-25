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

public final class cb_system_tools
    extends
      SubLTranslatedFile
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
  public static SubLObject cyc_system_doc_file()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return PrintLow.format( NIL, $str0$_Aref_system_html, system_parameters.$cyc_documentation_url$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 931L)
  public static SubLObject cb_mode(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str4$Cyc_communication_status_changing );
      return NIL;
    }
    operation_communication.possibly_save_transcript_ops();
    cb_frames.html_update_cb_status_script();
    final SubLObject title_var = $str5$Communication_Status_Area;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject message = html_utilities.html_extract_input( $str17$message, args );
            if( NIL != message )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( THREE_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject color_val = html_utilities.html_color( $kw18$RED );
              html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
              if( NIL != color_val )
              {
                html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_color( color_val ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( message );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
              }
              html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( THREE_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str20$cb_mode_handler, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw2$CB_MODE, UNPROVIDED, UNPROVIDED );
              html_utilities.html_reset_input( $str21$Current_Value );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str22$Submit, UNPROVIDED, UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              if( NIL != operation_queues.local_queue_empty() )
              {
                if( NIL != transcript_server.use_transcript_server() )
                {
                  transcript_server.transcript_server_check();
                }
                if( NIL != operation_queues.local_operations_anywhere() )
                {
                  html_utilities.html_princ( $str23$You_can_not_change_your_transmitt );
                  html_utilities.html_princ( $str24$your_local_transcript_by_either_s );
                  html_utilities.html_newline( TWO_INTEGER );
                  insert_stored_options();
                }
                else
                {
                  insert_transmit_options();
                }
              }
              else
              {
                insert_local_queue_warning();
              }
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              insert_read_options();
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$1, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 2458L)
  public static SubLObject insert_transmit_options()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str27$What_Do_You_Want_To_Do_With_Proce );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != operation_communication.allow_transmitting() )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_radio_input( $str29$transmit_mode, $str30$transmit, makeBoolean( NIL != operation_communication.not_recordingP() && NIL != operation_communication.transmittingP() ), UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( TWO_INTEGER );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw31$LEFT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str33$Send_Immediately_To_Everybody );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject t_and_s_modeP = makeBoolean( NIL != operation_communication.storingP() && NIL != operation_communication.transmittingP() );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_radio_input( $str29$transmit_mode, $str34$transmit_and_store, t_and_s_modeP, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( TWO_INTEGER );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw31$LEFT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str35$____and_Record_Locally );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        if( NIL != t_and_s_modeP )
        {
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw31$LEFT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str36$to_ );
              html_utilities.html_indent( UNPROVIDED );
              cb_utilities.cb_link( $kw37$WRITE_TRANS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_radio_input( $str29$transmit_mode, $str38$transmit_and_store_rolled, NIL, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( TWO_INTEGER );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw31$LEFT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str39$____and_Record_Locally_to_a_New_T );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $kw31$LEFT );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            insert_kb_not_current_message();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_radio_input( $str29$transmit_mode, $str40$store, makeBoolean( NIL != operation_communication.storingP() && NIL == operation_communication.transmittingP() ), UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( TWO_INTEGER );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw31$LEFT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str41$Store_For_Later );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_radio_input( $str29$transmit_mode, $str42$none, makeBoolean( NIL == operation_communication.transmittingP() && NIL != operation_communication.not_recordingP() ), UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( TWO_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw31$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str43$Do_Not_Record );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str44$Send_KB_Check_Point_for__ );
    html_utilities.html_indent( TWO_INTEGER );
    cb_mode_show_kb_checkpoint_options( $str45$kb_checkpoint_to_send, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 5054L)
  public static SubLObject insert_kb_not_current_message()
  {
    html_utilities.html_princ( $str46$Currently__you_are_not_allowed_to );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str47$Try_receiving_operations_if_you_w );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 5530L)
  public static SubLObject insert_stored_options()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_princ( $str48$You_have_ );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str50$cb_system_ready_transcript_file_w );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( operation_queues.local_operation_storage_queue_size() );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_princ( $str51$_operations );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    html_utilities.html_princ( $str52$_stored_ );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != operation_communication.allow_transmitting() )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_radio_input( $str40$store, $str53$send, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str54$Send_Stored_Operations_Now );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          insert_kb_not_current_message();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_radio_input( $str40$store, $str55$clear, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str56$Clear_Stored_Operations );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$40, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_emphasized_head$.getGlobalValue() );
    html_utilities.html_princ( $str57$Note_ );
    html_utilities.html_markup( html_macros.$html_emphasized_tail$.getGlobalValue() );
    html_utilities.html_princ( $str58$_All_of_the_above_options_will_st );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 7577L)
  public static SubLObject insert_local_queue_warning()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str59$You_still_have_ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    final SubLObject color_val = $kw18$RED;
    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
    if( NIL != color_val )
    {
      html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_color( color_val ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( operation_queues.local_queue_size() );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str60$_unprocessed_operations_on_your_l );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 7927L)
  public static SubLObject insert_read_options()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str61$Do_You_Want_To_Receive_Operations );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw62$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_radio_input( $str63$receive_mode, $str64$no, makeBoolean( NIL == operation_communication.receivingP() ), UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw31$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str65$No );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$43, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$44, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$41, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw62$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_radio_input( $str63$receive_mode, $str66$yes, operation_communication.receivingP(), UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$46, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw31$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str67$Yes );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$47, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$48, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$45, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( TWO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$50, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_checkbox_input( $str68$kb_checkpoint_, T, forts.fort_p( operation_communication.get_remote_operations_kb_check_point() ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( TWO_INTEGER );
          html_utilities.html_princ( $str69$Receive_only_up_to_KB_Check_Point );
          html_utilities.html_indent( TWO_INTEGER );
          cb_mode_show_kb_checkpoint_options( $str70$kb_checkpoint, $kw71$USE_CURRENT_CHECK_POINT );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$51, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$49, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    possibly_insert_experience_options();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 9287L)
  public static SubLObject cb_mode_show_kb_checkpoint_options(final SubLObject label, SubLObject use_current_check_pointP)
  {
    if( use_current_check_pointP == UNPROVIDED )
    {
      use_current_check_pointP = NIL;
    }
    cb_utilities.cb_fort_list_selector( label, isa.all_fort_instances( $cb_mode_checkpoint_collection$.getGlobalValue(), UNPROVIDED, UNPROVIDED ), ( NIL != use_current_check_pointP ) ? operation_communication
        .get_remote_operations_kb_check_point() : NIL, ONE_INTEGER, Symbols.symbol_function( IDENTITY ), T, $str42$none );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 9752L)
  public static SubLObject oe_patch_messages_enabled_and_email_validP()
  {
    return $oe_patch_messages_enabledP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 9853L)
  public static SubLObject cb_mode_handler(final SubLObject args)
  {
    SubLObject transmit_selection_string = html_utilities.html_extract_input( $str29$transmit_mode, args );
    final SubLObject stored_selection_string = html_utilities.html_extract_input( $str40$store, args );
    final SubLObject receive_selection_string = html_utilities.html_extract_input( $str63$receive_mode, args );
    final SubLObject use_filtersP = html_utilities.html_extract_input( $str75$filters_, args );
    final SubLObject kb_checkpoint_sending = cb_utilities.cb_decode_fort_list_selector_result( $str45$kb_checkpoint_to_send, args );
    final SubLObject kb_checkpoint_receivingP = html_utilities.html_extract_input( $str68$kb_checkpoint_, args );
    if( NIL != stored_selection_string )
    {
      if( stored_selection_string.equal( $str53$send ) )
      {
        if( NIL != oe_patch_messages_enabled_and_email_validP() )
        {
          display_oe_patch_message( args );
        }
        else
        {
          operation_communication.send_stored_operations();
        }
      }
      else if( stored_selection_string.equal( $str55$clear ) )
      {
        operation_communication.clear_stored_operations();
      }
    }
    if( NIL == cb_utilities.cb_fort_list_none_selected_p( kb_checkpoint_sending ) )
    {
      operation_communication.transmit_kb_check_point_operation( kb_checkpoint_sending );
    }
    if( NIL != transmit_selection_string )
    {
      if( NIL != Strings.stringE( $str38$transmit_and_store_rolled, transmit_selection_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        transcript_utilities.new_local_transcript();
        transcript_utilities.mark_local_transcript( $str76$SENT );
        transmit_selection_string = $str34$transmit_and_store;
      }
      if( !transmit_selection_string.equal( operation_communication.get_transmit_state( UNPROVIDED ) ) )
      {
        operation_communication.set_transmit_state( transmit_selection_string );
      }
    }
    if( NIL != receive_selection_string && !receive_selection_string.equal( operation_communication.get_receive_state( UNPROVIDED ) ) )
    {
      operation_communication.set_receive_state( receive_selection_string );
    }
    if( NIL != operation_communication.receivingP() )
    {
      if( NIL != kb_checkpoint_receivingP )
      {
        operation_communication.set_remote_operations_kb_check_point( cb_utilities.cb_decode_fort_list_selector_result( $str70$kb_checkpoint, args ) );
      }
    }
    else
    {
      operation_communication.clear_remote_operations_kb_check_point();
    }
    cb_mode( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 12017L)
  public static SubLObject cb_link_mode()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str78$cb_mode );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( $str79$Comm_ );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 12488L)
  public static SubLObject display_oe_patch_message(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stored_selection_string = html_utilities.html_extract_input( $str40$store, args );
    final SubLObject builder_note = html_utilities.html_extract_input( $str87$notes, args );
    final SubLObject submitted_to_builderP = Equality.equalp( html_utilities.html_extract_input( $str40$store, args ), $str88$builder );
    final SubLObject new_suffix = $str76$SENT;
    thread.resetMultipleValues();
    final SubLObject oe_message = default_oe_patch_message( builder_note, transcript_utilities.local_transcript(), new_suffix, submitted_to_builderP );
    final SubLObject require_patch_messageP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject title_var = $str89$OE_Patch_Message;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$52 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$53 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$55, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str90$cb_handle_oe_patch_message, T, UNPROVIDED );
              html_utilities.html_hidden_input( $str40$store, stored_selection_string, UNPROVIDED );
              html_utilities.html_hidden_input( $str87$notes, builder_note, UNPROVIDED );
              final SubLObject frame_name_var_$57 = NIL;
              html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              cb_parameters.cyc_cgi_url_int();
              html_utilities.html_princ( $str50$cb_system_ready_transcript_file_w );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var_$57 )
              {
                html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var_$57 );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str91$window_open__ );
              cb_parameters.cyc_cgi_url_int();
              html_utilities.html_princ( $str50$cb_system_ready_transcript_file_w );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str92$__ );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str94$null );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str95$___A____, $str83$ );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str96$return_false_ );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( file_utilities.normal_pathstring( transcript_utilities.local_transcript() ) );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$57, thread );
              }
              html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$Enter_a_short_description_to_go_i );
              cb_utilities.cb_help_preamble( $kw85$DISPLAY_OE_PATCH_MESSAGE, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_princ( $str98$To__ );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_text_input( $str99$to, $default_oe_patch_message_recipient$.getGlobalValue(), $int100$80 );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_princ( $str101$Short_Description__ );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_text_input( $str102$subj, oe_patch_message_subject_prefix(), $int100$80 );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_princ( $str103$Patch_Message__ );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str17$message );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $int104$100 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TWENTY_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_wrap$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str105$virtual );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( oe_message );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$58, thread );
              }
              html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              if( stored_selection_string.equal( $str53$send ) )
              {
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_submit$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str106$send_message_ );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str107$Transmit_and_Send_Patch_Message );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                if( NIL == require_patch_messageP )
                {
                  html_utilities.html_princ( $str108$_ );
                  html_utilities.html_submit_input( $str109$Transmit_without_Patch_Message, UNPROVIDED, UNPROVIDED );
                }
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$56, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$54, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$53, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$52, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 15067L)
  public static SubLObject oe_patch_message_subject_prefix()
  {
    return Sequences.cconcatenate( $str110$OE_Patch__kb_, new SubLObject[] { format_nil.format_nil_a_no_copy( operation_communication.kb_version_string() ), $str111$___
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 15184L)
  public static SubLObject default_oe_patch_message(SubLObject note, SubLObject transcript_file, SubLObject new_suffix, SubLObject submittedP)
  {
    if( note == UNPROVIDED )
    {
      note = NIL;
    }
    if( transcript_file == UNPROVIDED )
    {
      transcript_file = transcript_utilities.local_transcript();
    }
    if( new_suffix == UNPROVIDED )
    {
      new_suffix = $str76$SENT;
    }
    if( submittedP == UNPROVIDED )
    {
      submittedP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject message_string = NIL;
    SubLObject require_patch_messageP = NIL;
    final SubLObject max_lines_per_type = $int112$1000;
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( T, thread );
      final SubLObject stats = transcript_utilities.constant_modifications_in_transcript( transcript_file );
      SubLObject current;
      final SubLObject datum = current = stats;
      SubLObject operation_count = NIL;
      SubLObject transcript_create_list = NIL;
      SubLObject transcript_rename_list = NIL;
      SubLObject transcript_kill_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      operation_count = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      transcript_create_list = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      transcript_rename_list = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      transcript_kill_list = current.first();
      current = current.rest();
      if( NIL == current )
      {
        require_patch_messageP = makeBoolean( NIL != transcript_kill_list || NIL != transcript_rename_list || NIL != transcript_create_list );
        SubLObject stream = NIL;
        try
        {
          stream = streams_high.make_private_string_output_stream();
          PrintLow.format( stream, $str114$_A, ( NIL != submittedP ) ? $str115$Submitted : $str116$Transmitted );
          PrintLow.format( stream, $str117$_from_KB___A____, operation_communication.kb_version_string() );
          PrintLow.format( stream, $str118$Patch_Description_____ );
          if( NIL != string_utilities.non_empty_stringP( note ) )
          {
            PrintLow.format( stream, $str119$_S__, note );
          }
          PrintLow.format( stream, $str120$__Transcript___A__, transcript_utilities.mark_transcript_filename( file_utilities.normal_pathstring( transcript_file ), new_suffix ) );
          PrintLow.format( stream, $str121$Total_Operations___A__, operation_count );
          if( NIL != transcript_kill_list )
          {
            PrintLow.format( stream, $str122$__Killed_Constants____ );
            SubLObject done = NIL;
            SubLObject list_var = NIL;
            SubLObject info = NIL;
            SubLObject line_count = NIL;
            list_var = transcript_kill_list;
            info = list_var.first();
            for( line_count = ZERO_INTEGER; NIL == done && NIL != list_var; list_var = list_var.rest(), info = list_var.first(), line_count = Numbers.add( ONE_INTEGER, line_count ) )
            {
              SubLObject current_$61;
              final SubLObject datum_$60 = current_$61 = info;
              SubLObject op_num = NIL;
              SubLObject external_id = NIL;
              SubLObject name = NIL;
              SubLObject who = NIL;
              SubLObject when = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$61, datum_$60, $list123 );
              op_num = current_$61.first();
              current_$61 = current_$61.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$61, datum_$60, $list123 );
              external_id = current_$61.first();
              current_$61 = current_$61.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$61, datum_$60, $list123 );
              name = current_$61.first();
              current_$61 = current_$61.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$61, datum_$60, $list123 );
              who = current_$61.first();
              current_$61 = current_$61.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$61, datum_$60, $list123 );
              when = current_$61.first();
              current_$61 = current_$61.rest();
              if( NIL == current_$61 )
              {
                PrintLow.format( stream, $str124$_A__, name );
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$60, $list123 );
              }
              if( line_count.numG( max_lines_per_type ) )
              {
                done = T;
                PrintLow.format( stream, $str125$_and__A_more___, Numbers.subtract( Sequences.length( transcript_kill_list ), line_count ) );
              }
            }
          }
          if( NIL != transcript_rename_list )
          {
            PrintLow.format( stream, $str126$__Renames____ );
            SubLObject done = NIL;
            SubLObject list_var = NIL;
            SubLObject info = NIL;
            SubLObject line_count = NIL;
            list_var = transcript_rename_list;
            info = list_var.first();
            for( line_count = ZERO_INTEGER; NIL == done && NIL != list_var; list_var = list_var.rest(), info = list_var.first(), line_count = Numbers.add( ONE_INTEGER, line_count ) )
            {
              SubLObject current_$62;
              final SubLObject datum_$61 = current_$62 = info;
              SubLObject op_num = NIL;
              SubLObject external_id = NIL;
              SubLObject old_name = NIL;
              SubLObject new_name = NIL;
              SubLObject who2 = NIL;
              SubLObject when2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$62, datum_$61, $list127 );
              op_num = current_$62.first();
              current_$62 = current_$62.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$62, datum_$61, $list127 );
              external_id = current_$62.first();
              current_$62 = current_$62.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$62, datum_$61, $list127 );
              old_name = current_$62.first();
              current_$62 = current_$62.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$62, datum_$61, $list127 );
              new_name = current_$62.first();
              current_$62 = current_$62.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$62, datum_$61, $list127 );
              who2 = current_$62.first();
              current_$62 = current_$62.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$62, datum_$61, $list127 );
              when2 = current_$62.first();
              current_$62 = current_$62.rest();
              if( NIL == current_$62 )
              {
                PrintLow.format( stream, $str128$_A_____A__, old_name, new_name );
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$61, $list127 );
              }
              if( line_count.numG( max_lines_per_type ) )
              {
                done = T;
                PrintLow.format( stream, $str125$_and__A_more___, Numbers.subtract( Sequences.length( transcript_rename_list ), line_count ) );
              }
            }
          }
          transcript_create_list = Sequences.nreverse( transcript_create_list );
          if( NIL != transcript_create_list )
          {
            PrintLow.format( stream, $str129$__New_Constants____ );
            SubLObject cdolist_list_var = transcript_create_list;
            SubLObject info2 = NIL;
            info2 = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current_$63;
              final SubLObject datum_$62 = current_$63 = info2;
              SubLObject op_num2 = NIL;
              SubLObject external_id2 = NIL;
              SubLObject name2 = NIL;
              SubLObject who3 = NIL;
              SubLObject when3 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$63, datum_$62, $list123 );
              op_num2 = current_$63.first();
              current_$63 = current_$63.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$63, datum_$62, $list123 );
              external_id2 = current_$63.first();
              current_$63 = current_$63.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$63, datum_$62, $list123 );
              name2 = current_$63.first();
              current_$63 = current_$63.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$63, datum_$62, $list123 );
              who3 = current_$63.first();
              current_$63 = current_$63.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$63, datum_$62, $list123 );
              when3 = current_$63.first();
              current_$63 = current_$63.rest();
              if( NIL == current_$63 )
              {
                PrintLow.format( stream, $str124$_A__, name2 );
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$62, $list123 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              info2 = cdolist_list_var.first();
            }
          }
          message_string = streams_high.get_output_stream_string( stream );
        }
        finally
        {
          final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            streams_high.close( stream, UNPROVIDED );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$66, thread );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list113 );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( message_string, require_patch_messageP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 18312L)
  public static SubLObject cb_handle_oe_patch_message(final SubLObject args)
  {
    final SubLObject subject = html_utilities.html_extract_input( $str102$subj, args );
    final SubLObject message = html_utilities.html_extract_string( $str17$message, args, UNPROVIDED );
    final SubLObject stored_selection_string = html_utilities.html_extract_input( $str40$store, args );
    final SubLObject send_mailP = html_utilities.html_extract_input( $str106$send_message_, args );
    final SubLObject to = ( NIL != send_mailP ) ? html_utilities.html_extract_input( $str99$to, args ) : NIL;
    final SubLObject from = kb_accessors.email_address_text( operation_communication.the_cyclist() );
    SubLObject mode_args = NIL;
    mode_args = send_or_submit_transcript_with_message( transcript_utilities.local_transcript(), stored_selection_string, message, subject, from, to );
    cb_mode( mode_args );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 18891L)
  public static SubLObject send_or_submit_transcript_with_message(final SubLObject transcript, final SubLObject action_type, SubLObject message, final SubLObject email_subj, SubLObject email_from, SubLObject email_to)
  {
    if( email_from == UNPROVIDED )
    {
      email_from = kb_accessors.email_address_text( operation_communication.the_cyclist() );
    }
    if( email_to == UNPROVIDED )
    {
      email_to = $default_oe_patch_message_recipient$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ret_value = NIL;
    SubLObject ke_text_file = NIL;
    SubLObject mail_successfulP = NIL;
    SubLObject mail_error_message = Sequences.cconcatenate( $str131$Mail_not_sent_due_to_invalid_from, new SubLObject[] { format_nil.format_nil_s_no_copy( email_from ), $str132$__or_to__, format_nil.format_nil_s_no_copy(
        email_to ), $str133$__address
    } );
    if( NIL != string_utilities.non_empty_stringP( email_to ) && NIL != string_utilities.non_empty_stringP( email_from ) )
    {
      ke_text_file = ke_text_for_patch_message( transcript );
      message = Sequences.cconcatenate( message, ke_text_file );
      thread.resetMultipleValues();
      final SubLObject mail_successfulP_$67 = mail_utilities.mail_message( email_from, email_to, message, email_subj, $oe_patch_message_smtp_host$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED );
      final SubLObject mail_error_message_$68 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      mail_successfulP = mail_successfulP_$67;
      mail_error_message = mail_error_message_$68;
    }
    if( action_type.equal( $str53$send ) )
    {
      operation_communication.send_stored_operations();
    }
    if( NIL == mail_successfulP )
    {
      final SubLObject result_string = action_type.equal( $str53$send ) ? $str134$sent : $str135$submitted;
      final SubLObject message_$69 = ( NIL == email_to ) ? Sequences.cconcatenate( $str136$Transcript_, new SubLObject[] { result_string, $str137$__but_no_mail_sent_
      } ) : Sequences.cconcatenate( $str136$Transcript_, new SubLObject[] { result_string, $str138$__but_mail_message_encountered_er, mail_error_message
      } );
      ret_value = ConsesLow.list( ConsesLow.list( $str17$message, message_$69 ) );
    }
    return ret_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 20391L)
  public static SubLObject ke_text_for_patch_message(SubLObject transcript_file)
  {
    if( transcript_file == UNPROVIDED )
    {
      transcript_file = transcript_utilities.local_transcript();
    }
    SubLObject ke_text_file = NIL;
    final SubLObject max_transcript_lines = $int139$5000;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      PrintLow.format( stream, $str140$_________________________ );
      PrintLow.format( stream, $str141$Transcript_as_KE_Text___ );
      SubLObject done = NIL;
      final SubLObject ke_text_lines = transcript_utilities.transcript_file_to_ke_text( transcript_file );
      SubLObject list_var = NIL;
      SubLObject ke_text_line = NIL;
      SubLObject line_count = NIL;
      list_var = ke_text_lines;
      ke_text_line = list_var.first();
      for( line_count = ZERO_INTEGER; NIL == done && NIL != list_var; list_var = list_var.rest(), ke_text_line = list_var.first(), line_count = Numbers.add( ONE_INTEGER, line_count ) )
      {
        PrintLow.format( stream, $str124$_A__, ke_text_line );
        if( line_count.numG( max_transcript_lines ) )
        {
          done = T;
          PrintLow.format( stream, $str142$___and__A_more_operations___, Numbers.subtract( Sequences.length( ke_text_lines ), line_count ) );
        }
      }
      ke_text_file = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return ke_text_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 21077L)
  public static SubLObject cb_link_roll_current_kb(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current_kb = control_vars.kb_loaded();
    final SubLObject next_kb = number_utilities.f_1X( current_kb );
    if( NIL == linktext )
    {
      linktext = Sequences.cconcatenate( $str143$_Roll_to_KB_, new SubLObject[] { format_nil.format_nil_s_no_copy( next_kb ), $str144$_
      } );
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw145$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str146$cb_roll_current_kb );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 21518L)
  public static SubLObject cb_roll_current_kb(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str151$Rolling_the_KB );
      return NIL;
    }
    final SubLObject current_kb = control_vars.kb_loaded();
    final SubLObject next_kb = number_utilities.f_1X( current_kb );
    final SubLObject title_var;
    final SubLObject title = title_var = Sequences.cconcatenate( $str152$Roll_to_KB_, format_nil.format_nil_a_no_copy( next_kb ) );
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$70 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$71 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$73, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str153$cb_handle_roll_current_kb, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw149$CB_REMOTE_FILTERS, UNPROVIDED, UNPROVIDED );
              final SubLObject color_val = $kw18$RED;
              html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
              if( NIL != color_val )
              {
                html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_color( color_val ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
                html_utilities.html_princ_strong( $str154$WARNING_ );
                html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$75, thread );
              }
              html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_princ( $str155$Rolling_the_KB_is_will_filter_eve );
              html_utilities.html_newline( TWO_INTEGER );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str156$Do_you_still_want_to_roll_to_KB__, next_kb );
              html_utilities.html_indent( FOUR_INTEGER );
              html_utilities.html_submit_input( $str67$Yes, $str66$yes, UNPROVIDED );
              html_utilities.html_submit_input( $str65$No, $str64$no, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$74, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$72, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$71, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$70, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 22787L)
  public static SubLObject cb_handle_roll_current_kb(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str151$Rolling_the_KB );
      return NIL;
    }
    final SubLObject rollP = html_utilities.html_extract_input( $str66$yes, args );
    if( NIL == rollP )
    {
      return cb_mode( UNPROVIDED );
    }
    final SubLObject current_kb = control_vars.kb_loaded();
    final SubLObject next_kb = number_utilities.f_1X( current_kb );
    operation_communication.close_kb( current_kb, next_kb );
    return cb_mode( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 23384L)
  public static SubLObject cb_agenda_halt_explanation_display()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$last_agenda_error_message$.getGlobalValue() )
    {
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str160$Agenda_halted_due_to_ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      final SubLObject _prev_bind_0 = html_cycl_string_printer.$html_large_string_limit$.currentBinding( thread );
      try
      {
        html_cycl_string_printer.$html_large_string_limit$.bind( $int161$32768, thread );
        html_macros.verify_not_within_html_pre();
        html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
        final SubLObject _prev_bind_0_$76 = html_macros.$within_html_pre$.currentBinding( thread );
        try
        {
          html_macros.$within_html_pre$.bind( T, thread );
          html_utilities.html_princ_doc_string( control_vars.$last_agenda_error_message$.getGlobalValue(), UNPROVIDED );
        }
        finally
        {
          html_macros.$within_html_pre$.rebind( _prev_bind_0_$76, thread );
        }
        html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
      }
      finally
      {
        html_cycl_string_printer.$html_large_string_limit$.rebind( _prev_bind_0, thread );
      }
      SubLObject cdolist_list_var = control_vars.$last_agenda_error_explanatory_supports$.getGlobalValue();
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !support.eql( control_vars.$last_agenda_error_explanatory_supports$.getGlobalValue().first() ) )
        {
          html_utilities.html_newline( UNPROVIDED );
        }
        if( NIL != assertion_handles.assertion_p( support ) )
        {
          cb_utilities.cb_show_assertion_readably( support, T, UNPROVIDED );
        }
        else
        {
          cb_utilities.cb_form( support, ZERO_INTEGER, T );
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 24071L)
  public static SubLObject cb_agenda(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str164$The_Cyc_Agenda_Control_Facilities );
      return NIL;
    }
    final SubLObject title_var = $str165$Agenda_Process_Control;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$77 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$78 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$80, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw162$CB_AGENDA, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str166$cb_abort_agenda, T, UNPROVIDED );
              html_utilities.html_princ( $str167$Here_you_control_the_turning_on_a );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_princ( $str168$Currently__your_Agenda_is_ );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
              if( NIL != agenda.agenda_running() )
              {
                html_utilities.html_princ( $str169$running );
              }
              else
              {
                html_utilities.html_princ( $str170$halted );
              }
              html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_princ( $str171$_ );
              if( NIL != control_vars.$last_agenda_op$.getGlobalValue() && ( NIL != agenda.agenda_running() || $kw172$HALT == agenda.agenda_error_mode() ) )
              {
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      final SubLObject state = agenda.agenda_state();
                      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                      if( agenda.agenda_state().equalp( $str173$Run ) )
                      {
                        html_utilities.html_princ( $str174$Current );
                      }
                      else
                      {
                        html_utilities.html_princ( $str175$Last );
                      }
                      html_utilities.html_princ( $str176$_Agenda_operation_ );
                      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                      if( state.equalp( $str173$Run ) )
                      {
                        html_utilities.html_indent( TWO_INTEGER );
                        html_utilities.html_submit_input( $str177$Abort_Operation, UNPROVIDED, UNPROVIDED );
                        html_utilities.html_indent( TWO_INTEGER );
                        cb_utilities.cb_link( $kw178$AGENDA, $str179$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                      html_utilities.html_newline( UNPROVIDED );
                      cb_utilities.cb_form( cb_transform_operation_for_display( agenda.agenda_form_to_show() ), ZERO_INTEGER, T );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$84, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    final SubLObject propagating_assertions = forward.all_currently_forward_propagating_assertions();
                    if( NIL != propagating_assertions )
                    {
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( $str180$50_ );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        SubLObject list_var = NIL;
                        SubLObject assertion = NIL;
                        SubLObject index = NIL;
                        list_var = propagating_assertions;
                        assertion = list_var.first();
                        for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), assertion = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
                        {
                          if( !index.isZero() )
                          {
                            html_utilities.html_newline( TWO_INTEGER );
                          }
                          html_utilities.html_princ_strong( $str181$Propagating_Assertion_ );
                          thread.resetMultipleValues();
                          final SubLObject direct_count = cb_assertion_dependency_counts( assertion );
                          final SubLObject indirect_count = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          if( direct_count.isPositive() )
                          {
                            html_utilities.html_indent( FOUR_INTEGER );
                            html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
                            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str182$_A_direct_, direct_count );
                            if( indirect_count.isPositive() )
                            {
                              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str183$and__A_indirect_, indirect_count );
                            }
                            cb_utilities.cb_link( $kw184$ASSERTION_DEPENDENCIES, assertion, $str185$dependencies, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
                          }
                          html_utilities.html_newline( UNPROVIDED );
                          cb_utilities.cb_show_assertion_readably( assertion, T, T );
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$85, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    }
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$83, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$82, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              }
              if( NIL == agenda.agenda_running() && $kw172$HALT == agenda.agenda_error_mode() )
              {
                cb_agenda_halt_explanation_display();
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$81, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            cb_toggle_agenda_status_display();
            cb_agenda_error_mode_display();
            if( NIL == operation_queues.local_queue_empty() )
            {
              cb_agenda_local_queue_display();
            }
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$79, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$78, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$77, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 26637L)
  public static SubLObject cb_assertion_dependency_counts(final SubLObject assertion)
  {
    final SubLObject dependent_assertion_count = Sequences.length( assertions_interface.all_dependent_assertions( assertion ) );
    final SubLObject direct_dependent_count;
    final SubLObject dependent_count = direct_dependent_count = assertions_high.assertion_dependent_count( assertion );
    final SubLObject indirect_dependent_count = Numbers.subtract( dependent_assertion_count, direct_dependent_count, ONE_INTEGER );
    return Values.values( direct_dependent_count, indirect_dependent_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 27097L)
  public static SubLObject cb_link_agenda(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str187$Agenda_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str188$cb_agenda );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 27285L)
  public static SubLObject cb_abort_agenda(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( NIL == agenda.agenda_running() )
    {
      return cb_utilities.cb_error( $str190$The_agenda_is_no_longer_running_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    agenda.abort_agenda();
    agenda.wait_for_agenda_not_running( THREE_INTEGER );
    cb_agenda( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 27533L)
  public static SubLObject cb_toggle_agenda_status_display()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
    html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str19$post );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_macros.$within_html_form$.bind( T, thread );
      html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
      html_utilities.html_hidden_input( $str192$cb_toggle_agenda_status, T, UNPROVIDED );
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str193$Click_the_button_to_change_your_A );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      if( NIL != agenda.agenda_running() )
      {
        html_utilities.html_submit_input( $str194$Halt_Agenda, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        html_utilities.html_submit_input( $str195$Start_Agenda, UNPROVIDED, UNPROVIDED );
      }
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
      html_utilities.html_princ( $str196$__For_detailed_help_on_the_Cyc_ag );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str197$_A__A, cyc_system_doc_file(), $cyc_system_doc_agenda_index$.getDynamicValue( thread ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str198$Cyc_Agenda_Documentation );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$86, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      html_utilities.html_princ( $str171$_ );
      html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
      html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
    }
    finally
    {
      html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
      html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 28175L)
  public static SubLObject cb_toggle_agenda_status(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject runningP = agenda.agenda_running();
    html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw9$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str199$Agenda_Process_Changed );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      cb_frames.html_update_cb_status_script();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$87 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != color_value )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color_value ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            html_utilities.html_princ( $str199$Agenda_Process_Changed );
            html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            if( NIL != runningP )
            {
              html_utilities.html_princ( $str200$Halting_the_Agenda____ );
            }
            else
            {
              html_utilities.html_princ( $str201$Starting_the_Agenda____ );
            }
            html_utilities.html_flush();
            if( NIL != runningP )
            {
              agenda.halt_agenda( TWO_INTEGER );
            }
            else
            {
              agenda.start_agenda( TWO_INTEGER );
            }
            if( NIL != runningP )
            {
              agenda.wait_for_agenda_not_running( THREE_INTEGER );
            }
            else
            {
              agenda.wait_for_agenda_running( THREE_INTEGER );
            }
            html_utilities.html_newline( UNPROVIDED );
            final SubLObject now_runningP = agenda.agenda_running();
            if( !runningP.equalp( now_runningP ) )
            {
              html_utilities.html_princ( $str202$Your_Cyc_Agenda_is_now_ );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
              if( NIL != now_runningP )
              {
                html_utilities.html_princ( $str169$running );
              }
              else
              {
                html_utilities.html_princ( $str170$halted );
              }
              html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            else
            {
              html_utilities.html_princ( $str203$Your_Cyc_Agenda_is_still_ );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
              if( NIL != now_runningP )
              {
                html_utilities.html_princ( $str169$running );
              }
              else
              {
                html_utilities.html_princ( $str170$halted );
              }
              html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_princ( $str204$When_it_finishes_its_current_oper );
            }
            cb_utilities.cb_frame_update_message_page_info( $str205$Agenda );
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$89, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$88, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$87, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 29520L)
  public static SubLObject cb_agenda_error_mode_display()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mode = agenda.agenda_error_mode();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
    html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str19$post );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_macros.$within_html_form$.bind( T, thread );
      html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
      html_utilities.html_hidden_input( $str207$cb_agenda_error_mode_handler, T, UNPROVIDED );
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      html_utilities.html_princ( $str208$Currently__when_Cyc_encounters_an );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_indent( SEVEN_INTEGER );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      final SubLObject pcase_var = mode;
      if( pcase_var.eql( $kw209$IGNORE ) )
      {
        html_utilities.html_princ( $str210$Continues__ignoring_the_error_ );
      }
      else if( pcase_var.eql( $kw172$HALT ) )
      {
        html_utilities.html_princ( $str211$Halts_the_Agenda_and_displays_the );
      }
      else if( pcase_var.eql( $kw212$DEBUG ) )
      {
        html_utilities.html_princ( $str213$Enters_the_debugger_ );
      }
      else if( pcase_var.eql( $kw214$LOG ) )
      {
        html_utilities.html_princ( PrintLow.format( NIL, $str215$Logs_the_error_and_continues_ ) );
        html_utilities.html_br();
        html_utilities.html_indent( SEVEN_INTEGER );
        if( NIL != agenda.get_agenda_log_file() )
        {
          cb_utilities.cb_link( $kw216$AGENDA_ERROR_FILE, file_utilities.get_absolute_path_string( agenda.get_agenda_log_file() ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      else
      {
        cb_utilities.cb_error( $str217$Illegal_state_in_cb_agenda_error_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_princ( $str218$Choose_the_new_error_handling_mod );
      html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
      html_utilities.html_princ( $str219$Submit_New_Mode );
      html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
      html_utilities.html_princ( $str220$__to_initiate_the_change_ );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_radio_input( $str221$agenda_error_state, $str222$_ignore, Equality.eq( mode, $kw209$IGNORE ), UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      html_utilities.html_princ( $str223$Ignore_and_Continue );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_radio_input( $str221$agenda_error_state, $str224$_halt, Equality.eq( mode, $kw172$HALT ), UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      html_utilities.html_princ( $str225$Halt_and_Display_Reason );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_radio_input( $str221$agenda_error_state, $str226$_log, Equality.eq( mode, $kw214$LOG ), UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      html_utilities.html_princ( $str227$Log_Errors_to_File );
      html_utilities.html_indent( EIGHT_INTEGER );
      html_utilities.html_filename_input( $str228$pathname, agenda.get_agenda_log_file(), $int229$60 );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_reset_input( $str230$Current_Mode );
      html_utilities.html_indent( TWO_INTEGER );
      html_utilities.html_submit_input( $str219$Submit_New_Mode, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( TWO_INTEGER );
      html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
    }
    finally
    {
      html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
      html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 31596L)
  public static SubLObject cb_agenda_error_mode_handler(final SubLObject args)
  {
    final SubLObject previous_mode = agenda.agenda_error_mode();
    final SubLObject selection_string = html_utilities.html_extract_input( $str221$agenda_error_state, args );
    final SubLObject log_file = html_utilities.html_extract_input( $str228$pathname, args );
    final SubLObject selection = reader.read_from_string_ignoring_errors( selection_string, NIL, NIL, UNPROVIDED, UNPROVIDED );
    agenda.set_agenda_error_mode( selection );
    if( NIL != agenda.agenda_logs_errorsP() )
    {
      if( NIL != string_utilities.non_empty_stringP( log_file ) )
      {
        if( NIL == agenda.set_agenda_log_file( log_file ) )
        {
          agenda.set_agenda_error_mode( previous_mode );
        }
      }
      else
      {
        agenda.set_agenda_error_mode( previous_mode );
      }
    }
    else
    {
      agenda.clear_agenda_log_file();
    }
    cb_agenda( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 32423L)
  public static SubLObject cb_agenda_local_queue_display()
  {
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str48$You_have_ );
    html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
    html_utilities.html_princ( operation_queues.local_queue_size() );
    html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
    html_utilities.html_princ( $str232$_operations_waiting_in_your_local );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_indent( FOUR_INTEGER );
    cb_utilities.cb_link( $kw233$SHOW_LOCAL_OPS, $str234$Look_at_the_operations_in_the_loc, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_indent( FOUR_INTEGER );
    cb_utilities.cb_link( $kw235$DELETE_LOCAL_OPS, $str236$Delete_the_local_queue_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_indent( FOUR_INTEGER );
    cb_utilities.cb_link( $kw237$DELETE_LOCAL_AND_RESTART, $str238$Delete_the_local_queue_and_restar, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 33034L)
  public static SubLObject cb_link_agenda_error_file(SubLObject filename)
  {
    if( filename == UNPROVIDED )
    {
      filename = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str239$cb_agenda_error_file_viewer );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str240$Agenda_Error_File___A, filename );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 33224L)
  public static SubLObject cb_agenda_error_file_viewer(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Filesys.probe_file( agenda.get_agenda_log_file() ) )
    {
      html_utilities.html_markup( file_utilities.slurp_file( agenda.get_agenda_log_file() ) );
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str242$Agenda_log_file_empty___S, agenda.get_agenda_log_file() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 42984L)
  public static SubLObject cb_link_system1(final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str244$cb_system );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( text );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 43813L)
  public static SubLObject cb_link_system()
  {
    cb_utilities.cb_link( $kw245$SYSTEM1, $str247$System_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 44698L)
  public static SubLObject cb_system(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str252$Cyc_System_Area );
      return NIL;
    }
    operation_communication.possibly_save_transcript_ops();
    html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw9$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str253$System_Area );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      cb_frames.html_update_cb_status_script();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$90 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != color_value )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color_value ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            html_utilities.html_princ( $str253$System_Area );
            html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            cb_utilities.cb_help_preamble( $kw250$CB_SYSTEM, $kw145$SELF, $str254$Here_are_your_system_settings_ );
            html_utilities.html_newline( TWO_INTEGER );
            cb_show_system_settings();
            if( NIL == ke.cyclist_is_guest() )
            {
              html_utilities.html_newline( UNPROVIDED );
              if( NIL != system_parameters.$cb_allow_halt_imageP$.getDynamicValue( thread ) )
              {
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                cb_utilities.cb_link( $kw255$CONFIRM_HALT_CYC, $str256$_Halt_this_image_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_indent( TWO_INTEGER );
              }
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              cb_utilities.cb_link( $kw257$PROCESS_INSPECTOR, $str258$_Process_Inspector_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_newline( UNPROVIDED );
            }
            show_transcript_information();
            show_queue_information();
            show_historical_information();
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$92, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$91, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$90, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 46046L)
  public static SubLObject html_cb_write_image_int(SubLObject default_file)
  {
    if( default_file == UNPROVIDED )
    {
      default_file = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
    html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str19$post );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_macros.$within_html_form$.bind( T, thread );
      html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
      html_utilities.html_hidden_input( $str260$cb_write_image_handler, T, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str261$Write_image_to_file__ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_princ( $str262$File_name__ );
      html_utilities.html_filename_input( $str263$file, default_file, $int264$40 );
      html_utilities.html_indent( UNPROVIDED );
      html_utilities.html_submit_input( $str265$Write_image, UNPROVIDED, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
      if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
      {
        html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str266$_Warning__this_may_take_some_time );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$93, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
    }
    finally
    {
      html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
      html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 46046L)
  public static SubLObject cb_write_image_handler(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str267$Write_Image;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$94 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$95 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$97, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject file = html_utilities.html_extract_input( $str263$file, args );
            if( NIL == file || NIL != string_utilities.empty_string_p( file ) )
            {
              html_utilities.html_princ( $str268$Please_enter_a_filename_ );
              html_utilities.html_newline( UNPROVIDED );
            }
            else
            {
              thread.resetMultipleValues();
              final SubLObject path = file_utilities.deconstruct_path( file );
              final SubLObject filename = thread.secondMultipleValue();
              thread.resetMultipleValues();
              final SubLObject path_string = file_utilities.reconstruct_path( path, $str83$, UNPROVIDED );
              if( NIL == Filesys.probe_file( path_string ) )
              {
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
                {
                  html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( file_utilities.why_not_probe_fileP( path_string ) );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$98, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              else
              {
                html_utilities.html_princ( $str269$Writing_to_file__ );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                html_utilities.html_princ( file );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                html_utilities.html_princ( $str270$__ );
                html_utilities.html_flush();
                Threads.sleep( FIVE_INTEGER );
                Mapper.write_image( file, T );
                html_utilities.html_princ( $str271$__Done_ );
                html_utilities.html_newline( UNPROVIDED );
              }
            }
            html_cb_write_image_int( file );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$96, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$95, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$94, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 47401L)
  public static SubLObject cb_show_system_settings()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str273$Machine_name__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$100, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( THREE_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$101, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( Environment.get_network_name( Environment.get_machine_name( $str274$unknown ) ) );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$102, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$99, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str275$SubL_implementation__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$104, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$105, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( Environment.lisp_implementation_type() );
          html_utilities.html_princ( $str108$_ );
          html_utilities.html_princ( Environment.lisp_implementation_version() );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$106, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$103, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str276$Base_TCP_port__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$108, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$109, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( system_parameters.$base_tcp_port$.getDynamicValue( thread ) );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$110, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$107, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str277$Image_name__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$112, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$113, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( control_vars.cyc_image_id() );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$114, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$111, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject pid = Environment.get_process_id( UNPROVIDED );
      if( NIL != pid )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str278$Image_Process_ID__ );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$116, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$117, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( pid );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$118, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$115, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      final SubLObject start_time = numeric_date_utilities.timestring( system_info.cycl_start_time() );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str279$Image_start_time_ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$120, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$121, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( start_time );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str280$__up__A_, numeric_date_utilities.readable_elapsed_time_string( system_info.cycl_uptime(), ZERO_INTEGER ) );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$122, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$119, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str281$Cyc_revision_level__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$124, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$125, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( system_info.cyc_revision_string() );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$126, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$123, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str282$Cyc_code_version__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$128, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$129, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( misc_utilities.cyc_system_code_string() );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$130, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$127, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str283$Current_KB__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$132, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$133, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( operation_communication.kb_version_string() );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$134, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$131, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 49706L)
  public static SubLObject show_queue_information()
  {
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str284$Queue_Information__ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str285$Master_Transcript_Operations_Read );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( Numbers.add( operation_communication.kb_op_number(), operation_queues.remote_queue_size() ) );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str286$Master_Transcript_Operations_Read );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( operation_queues.remote_queue_size() );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str287$Master_Transcript_Operations_Proc );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( operation_communication.remote_ops_processed() );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str288$Master_Transcript_Operations_Proc );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( Numbers.subtract( operation_communication.remote_ops_processed(), operation_communication.total_master_transcript_operations_processed() ) );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str289$Master_Transcript_Operations_Proc );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( operation_communication.total_master_transcript_operations_processed() );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str290$Unprocessed_Local_Queue_Operation );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( operation_queues.local_queue_size() );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str291$Local_Queue_Operations_Processed_ );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( operation_queues.transcript_queue_size() );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str292$Current_Local_Transcript_Operatio );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( operation_queues.local_operation_storage_queue_size() );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    if( operation_communication.total_auxiliary_operations_run().numG( ZERO_INTEGER ) || operation_queues.auxiliary_queue_size().numG( ZERO_INTEGER ) )
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_princ( $str293$Unprocessed_auxiliary_queue_opera );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( operation_queues.auxiliary_queue_size() );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 52025L)
  public static SubLObject show_transcript_information()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str294$Transcript_Information_ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str295$Master_Transcript___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    final SubLObject total_ops = transcript_utilities.total_master_transcript_operations( UNPROVIDED );
    if( NIL != transcript_server.use_transcript_server() )
    {
      html_utilities.html_princ( $str296$Maintained_By_Transcript_Server );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str297$___A__A_, system_parameters.$master_transcript_lock_host$.getDynamicValue( thread ), system_parameters.$master_transcript_server_port$
          .getDynamicValue( thread ) );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str298$Operations___ );
      html_utilities.html_princ( total_ops );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
    }
    else
    {
      if( transcript_utilities.master_transcript().isString() )
      {
        cb_utilities.cb_link( $kw299$READ_TRANS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        html_utilities.html_princ( $str300$None );
      }
      if( transcript_utilities.master_transcript().isString() )
      {
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( $str301$Characters___ );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_princ( file_utilities.get_file_length( transcript_utilities.master_transcript() ) );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        if( NIL != system_parameters.$really_count_transcript_ops$.getDynamicValue( thread ) )
        {
          html_utilities.html_princ( $str298$Operations___ );
        }
        else
        {
          html_utilities.html_princ( $str302$Estimated_Ops___ );
        }
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_princ( total_ops );
      }
      html_utilities.html_newline( UNPROVIDED );
    }
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str303$Local_Transcript___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    if( NIL != operation_communication.writing_transcriptsP() )
    {
      cb_utilities.cb_link( $kw37$WRITE_TRANS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      html_utilities.html_princ( $str300$None );
    }
    html_utilities.html_newline( UNPROVIDED );
    if( NIL != operation_communication.writing_transcriptsP() )
    {
      html_utilities.html_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str298$Operations___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      if( NIL != operation_communication.transmittingP() )
      {
        html_utilities.html_princ( operation_communication.total_local_operations_transmitted() );
      }
      else
      {
        html_utilities.html_princ( operation_queues.local_operation_storage_queue_size() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 53584L)
  public static SubLObject show_historical_information()
  {
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str304$Historical_Information_ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_princ( $str305$Remote_Operations_Processed__ );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( operation_communication.remote_ops_processed() );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str306$Local_Operations_Recorded___ );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( operation_communication.total_local_operations_recorded() );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str307$Local_Operations_Sent_To_Master_T );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( operation_communication.total_local_operations_transmitted() );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    if( operation_communication.total_auxiliary_operations_run().numG( ZERO_INTEGER ) )
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_princ( $str308$Auxiliary_Queue_Operations_Proces );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( operation_communication.total_auxiliary_operations_run() );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 54351L)
  public static SubLObject cb_link_read_trans()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject filename = Eval.eval( conses_high.second( conses_high.assoc( $str309$read, cb_parameters.$transcript_file_shorthand$.getDynamicValue( thread ), Symbols.symbol_function( $sym310$STRING_EQUAL ),
        UNPROVIDED ) ) );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str311$cb_system_ready_transcript_file_r );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( filename );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    html_transcript_stats_link( filename );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 54911L)
  public static SubLObject cb_link_write_trans()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject filename = Eval.eval( conses_high.second( conses_high.assoc( $str313$write, cb_parameters.$transcript_file_shorthand$.getDynamicValue( thread ), Symbols.symbol_function( $sym310$STRING_EQUAL ),
        UNPROVIDED ) ) );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str50$cb_system_ready_transcript_file_w );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( filename );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    html_transcript_stats_link( filename );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 55459L)
  public static SubLObject cb_link_view_transcript(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str315$cb_system_ready_transcript_file__, filename );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( file_utilities.normal_pathstring( filename ) );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    html_transcript_stats_link( filename );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 55804L)
  public static SubLObject html_transcript_stats_link(final SubLObject transcript_filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( transcript_filename.isString() )
    {
      html_utilities.html_indent( UNPROVIDED );
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      html_utilities.html_princ( $str318$cb_transcript_viewer_handler_ );
      html_utilities.html_princ( Sequences.cconcatenate( $str319$stats_, transcript_filename ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != frame_name_var )
      {
        html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( frame_name_var );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str320$_Stats_ );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 56116L)
  public static SubLObject cb_system_ready_transcript_file(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject filename = args.first();
    if( NIL != conses_high.assoc( filename, cb_parameters.$transcript_file_shorthand$.getDynamicValue( thread ), $sym321$STRING_, UNPROVIDED ) )
    {
      filename = Eval.eval( conses_high.second( conses_high.assoc( filename, cb_parameters.$transcript_file_shorthand$.getDynamicValue( thread ), Symbols.symbol_function( $sym310$STRING_EQUAL ), UNPROVIDED ) ) );
    }
    cb_system_get_transcript( filename );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 57082L)
  public static SubLObject cb_system_get_transcript(final SubLObject filename)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject ops = NIL;
    if( filename.isString() && NIL != Filesys.probe_file( filename ) )
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( filename, $kw323$INPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str324$Unable_to_open__S, filename );
        }
        SubLObject str;
        SubLObject expr;
        for( str = stream, expr = NIL, expr = reader.read_ignoring_errors( str, NIL, NIL ); NIL != expr; expr = reader.read_ignoring_errors( str, NIL, NIL ) )
        {
          ops = ConsesLow.cons( expr, ops );
          count = Numbers.add( count, ONE_INTEGER );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
      ops = Sequences.nreverse( ops );
    }
    cb_system_show_specific_transcript_file( filename, count, ops );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 57924L)
  public static SubLObject cb_system_show_specific_transcript_file(final SubLObject name, final SubLObject count, final SubLObject ops)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str327$File_Contents__Transcript_File;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$135 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$136 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$138, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$139 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw325$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              final SubLObject href = PrintLow.format( NIL, $str328$cg_cb_system_show_specific_transc, name );
              html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( href );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$140 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str329$View_Transcript_in_KE_Text_format );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$140, thread );
              }
              html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str330$File__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              cb_utilities.cb_link( $kw316$VIEW_TRANSCRIPT, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str331$Operations__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_princ( count );
              html_utilities.html_newline( TWO_INTEGER );
              if( name.isString() )
              {
                if( NIL != Filesys.probe_file( name ) && count.numG( ZERO_INTEGER ) )
                {
                  html_macros.verify_not_within_html_pre();
                  html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
                  final SubLObject _prev_bind_0_$141 = html_macros.$within_html_pre$.currentBinding( thread );
                  try
                  {
                    html_macros.$within_html_pre$.bind( T, thread );
                    SubLObject cdolist_list_var = ops;
                    SubLObject expr = NIL;
                    expr = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      cb_utilities.cb_form( cb_transform_operation_for_display( expr ), ZERO_INTEGER, T );
                      html_utilities.html_terpri( TWO_INTEGER );
                      cdolist_list_var = cdolist_list_var.rest();
                      expr = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    html_macros.$within_html_pre$.rebind( _prev_bind_0_$141, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
                }
                else
                {
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str332$No_operations_have_been_saved_yet );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_princ( name );
                }
              }
              else
              {
                PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str333$_s_is_not_a_pathname_string_, name );
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$139, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$137, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$136, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$135, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 59250L)
  public static SubLObject cb_transform_operation_for_display(SubLObject expression)
  {
    expression = encapsulation.unencapsulate_partial( expression );
    expression = canon_tl.tl_var_to_el_var_transform( expression );
    expression = canon_tl.tl_nart_transform( expression );
    return expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 59720L)
  public static SubLObject cb_choose_project(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject purpose = fi.ke_purpose();
    final SubLObject title_var = $str336$Choose_KE_Project;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$142 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$143 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$145, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$146 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str337$cb_choose_project_handler, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw334$CB_CHOOSE_PROJECT, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str338$Choose_your_project_from_the_opti );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              SubLObject project_list = ongoing_cyc_projects();
              project_list = kb_utilities.sort_terms( project_list, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_radio_input( $str339$project, NIL, Types.sublisp_null( purpose ), UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_princ( $str340$No_Project_Selected );
              html_utilities.html_newline( UNPROVIDED );
              SubLObject cdolist_list_var = project_list;
              SubLObject project = NIL;
              project = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                html_utilities.html_indent( THREE_INTEGER );
                html_utilities.html_radio_input( $str339$project, project, Equality.eq( purpose, project ), UNPROVIDED );
                html_utilities.html_indent( TWO_INTEGER );
                cb_utilities.cb_form( project, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                project = cdolist_list_var.first();
              }
              html_utilities.html_reset_input( $str341$Reset );
              html_utilities.html_submit_input( $str22$Submit, UNPROVIDED, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$146, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$144, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$143, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$142, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 60803L)
  public static SubLObject ongoing_cyc_projects()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject projects = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const343$EverythingPSC );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      projects = conses_high.intersection( isa.all_fort_instances( $const73$Cyc_BasedProject, UNPROVIDED, UNPROVIDED ), isa.all_fort_instances( $const344$OngoingStatus, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return projects;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 61225L)
  public static SubLObject cb_choose_project_handler(final SubLObject args)
  {
    final SubLObject project = html_utilities.html_extract_input( $str339$project, args );
    if( project.equal( $str345$nil ) )
    {
      fi.set_ke_purpose( NIL );
    }
    else
    {
      fi.set_ke_purpose( cb_utilities.cb_guess_fort( project, UNPROVIDED ) );
    }
    cb_tools.html_update_cb_toolbar_script();
    cb_utilities.cb_message_page_with_history( $str346$Project_has_been_changed_, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 61628L)
  public static SubLObject cb_link_choose_project(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str348$Current_Project;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str349$cb_choose_project );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 61891L)
  public static SubLObject cb_authenticate_the_cyclist(final SubLObject user, final SubLObject passphrase)
  {
    operation_communication.authenticate_the_cyclist( user, passphrase, $const352$CycBrowser );
    return cb_after_login_events();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 62195L)
  public static SubLObject cb_set_the_cyclist(final SubLObject user)
  {
    operation_communication.set_the_cyclist( user );
    return cb_after_login_events();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 62349L)
  public static SubLObject cb_after_login_events()
  {
    final SubLObject user = operation_communication.the_cyclist();
    if( NIL == operation_communication.the_cyclist_is_guestP() )
    {
      final SubLObject projects = cb_login_find_default_projects_for_cyclist( user );
      fi.set_ke_purpose( projects.first() );
      cb_tools.load_user_preferences();
    }
    return user;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 62714L)
  public static SubLObject cb_login_find_default_projects_for_cyclist(final SubLObject cyclist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    final SubLObject _prev_bind_0 = control_vars.$cache_inference_results$.currentBinding( thread );
    try
    {
      control_vars.$cache_inference_results$.bind( NIL, thread );
      results = ask_utilities.query_template( $sym353$_PROJECT, ConsesLow.listS( $const354$cyclistPrimaryProject, cyclist, $list355 ), $const343$EverythingPSC, $list356 );
    }
    finally
    {
      control_vars.$cache_inference_results$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 63248L)
  public static SubLObject note_image_purpose(final SubLObject purpose)
  {
    $image_purpose$.setDynamicValue( purpose );
    return purpose;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 63389L)
  public static SubLObject cb_login(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject attempted_name = html_utilities.html_extract_value( $str359$new_login_name, args, UNPROVIDED );
    final SubLObject bad_passwordP = Types.stringp( attempted_name );
    final SubLObject title_var = $str360$Login_Area;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$147 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw10$SAM_AUTOCOMPLETE_CSS );
        cyc_file_dependencies.javascript( $kw11$SHA1 );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$148 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$150, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str361$cb_login_handler, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw357$CB_LOGIN, UNPROVIDED, UNPROVIDED );
              if( NIL != $image_purpose$.getDynamicValue( thread ) )
              {
                html_utilities.html_princ( $str362$This_image_has_been_designated__ );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $image_purpose$.getDynamicValue( thread ) );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( TWO_INTEGER );
              }
              html_utilities.html_princ( $str363$You_are_currently_logged_in_as_ );
              html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
              cb_utilities.cb_form( operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
              html_utilities.html_princ( $str171$_ );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str364$Click_ );
              cb_utilities.cb_link( $kw365$LOGOUT, $str366$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_princ( $str367$_to_logout_now_ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str368$Type_in_your_new_login_name_below );
              html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
              html_utilities.html_princ( $str22$Submit );
              html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
              html_utilities.html_princ( $str369$__button_ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              if( NIL != operation_communication.image_requires_authenticationP() )
              {
                html_utilities.html_user_id_and_password( $str359$new_login_name, $str370$new_login_hashed_password, $str371$Cyclist, $str372$Password, attempted_name, bad_passwordP );
              }
              else
              {
                cb_unauthenticated_login_pane( $str359$new_login_name );
              }
              final SubLObject purpose = fi.ke_purpose();
              html_utilities.html_newline( TWO_INTEGER );
              cb_utilities.cb_link( $kw350$CHOOSE_PROJECT, $str348$Current_Project, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_princ( $str373$___ );
              if( NIL != purpose )
              {
                cb_utilities.cb_form( purpose, UNPROVIDED, UNPROVIDED );
              }
              else
              {
                html_utilities.html_princ( $str340$No_Project_Selected );
              }
              html_utilities.html_newline( THREE_INTEGER );
              html_utilities.html_princ( $str374$The_following_are_currently_logge );
              html_utilities.html_princ( Environment.get_network_name( $str274$unknown ) );
              html_utilities.html_princ( $str375$_ );
              html_utilities.html_newline( TWO_INTEGER );
              final SubLObject user_list = html_kernel.html_interface_users();
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( FIVE_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$152 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_underlined_head$.getGlobalValue() );
                    html_utilities.html_princ( $str376$User );
                    html_utilities.html_markup( html_macros.$html_underlined_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$154, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_underlined_head$.getGlobalValue() );
                    html_utilities.html_princ( $str377$Local_Machine );
                    html_utilities.html_markup( html_macros.$html_underlined_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$155, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  SubLObject cdolist_list_var = user_list;
                  SubLObject a_user = NIL;
                  a_user = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$156 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      SubLObject current;
                      final SubLObject datum = current = a_user;
                      SubLObject machine_name = NIL;
                      SubLObject user_name = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list378 );
                      machine_name = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list378 );
                      user_name = current.first();
                      current = current.rest();
                      if( NIL == current )
                      {
                        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$157 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          cb_utilities.cb_form( user_name, UNPROVIDED, UNPROVIDED );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$157, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        if( NIL != web_utilities.current_html_cyc_login_session_idP( machine_name ) )
                        {
                          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_princ( web_utilities.cyc_login_session_id_machine_name( machine_name ) );
                            html_utilities.html_indent( UNPROVIDED );
                            html_utilities.html_princ( $str379$_Session_id__ );
                            html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                            html_utilities.html_princ( machine_name );
                            html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                            html_utilities.html_indent( UNPROVIDED );
                            cb_utilities.cb_link( $kw380$FORCE_LOGOUT, machine_name, $str381$_Force_Logout_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            html_utilities.html_princ( $str382$_ );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$158, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        }
                        else
                        {
                          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_princ( machine_name );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$159, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$160 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          if( machine_name.equal( html_kernel.http_state_key_for_request() ) )
                          {
                            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
                            html_utilities.html_indent( UNPROVIDED );
                            html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
                            html_utilities.html_glyph( $kw383$LARR, UNPROVIDED );
                            html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
                            html_utilities.html_princ( $str384$_you );
                            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
                          }
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$160, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum, $list378 );
                      }
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$156, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                    html_utilities.html_source_readability_terpri( UNPROVIDED );
                    cdolist_list_var = cdolist_list_var.rest();
                    a_user = cdolist_list_var.first();
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$153, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$152, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              if( NIL == list_utilities.lengthL( html_kernel.html_interface_users(), TWO_INTEGER, UNPROVIDED ) )
              {
                html_utilities.html_newline( TWO_INTEGER );
                cb_utilities.cb_link( $kw385$NOTIFY_ALL_USERS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$151, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$149, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$148, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$147, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 66728L)
  public static SubLObject cb_force_logout(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject session_id = html_utilities.html_extract_input( $str387$sessionId, args );
    final SubLObject logout_result = ( NIL != html_kernel.clear_html_state_for_machine( session_id ) ) ? $kw388$SUCCESS : $kw389$FAILURE;
    web_utilities.destroy_cyc_login_session( session_id );
    cb_login( UNPROVIDED );
    return logout_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 67028L)
  public static SubLObject cb_link_force_logout(final SubLObject session_id, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = session_id;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str391$_a_sessionId__a, $str392$cb_force_logout, session_id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 67268L)
  public static SubLObject cb_unauthenticated_login_pane(final SubLObject user_id_field)
  {
    html_complete.html_complete_button( user_id_field, $str394$Complete, $const395$HumanCyclist, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_text_input( user_id_field, NIL, $int396$27 );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_reset_input( $str397$Clear );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_submit_input( $str22$Submit, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 67561L)
  public static SubLObject cb_link_notify_all_users()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str398$cb_notify_all_users );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( $str399$Send_Email_to_all_Users );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 67715L)
  public static SubLObject cb_notify_all_users(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str401$Mail_all_users;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$161 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$162 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$163 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$164 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$164, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_blockquote_head$.getGlobalValue() );
            html_utilities.html_princ( $str402$Please_enter_the_message_you_wish );
            html_utilities.html_markup( html_macros.$html_blockquote_tail$.getGlobalValue() );
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$165 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str403$cb_send_email_to_selected_users, T, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$166 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                cb_notify_users_draw_header();
                SubLObject rows_count = ZERO_INTEGER;
                SubLObject cdolist_list_var = Sequences.remove_duplicates( html_kernel.html_interface_users(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym407$SECOND ), UNPROVIDED, UNPROVIDED );
                SubLObject user_entry = NIL;
                user_entry = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  SubLObject current;
                  final SubLObject datum = current = user_entry;
                  SubLObject machine_name = NIL;
                  SubLObject user = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list404 );
                  machine_name = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list404 );
                  user = current.first();
                  current = current.rest();
                  if( NIL == current )
                  {
                    if( !user.eql( operation_communication.the_cyclist() ) && !user.eql( $const405$Guest ) )
                    {
                      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$167 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$168 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          if( rows_count.isZero() )
                          {
                            html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                            html_utilities.html_princ( $str406$To_ );
                            html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                          }
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$168, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        cb_notify_users_draw_one_user( user );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$167, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                      html_utilities.html_source_readability_terpri( UNPROVIDED );
                      rows_count = Numbers.add( rows_count, ONE_INTEGER );
                    }
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum, $list404 );
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  user_entry = cdolist_list_var.first();
                }
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$169 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$170 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    html_utilities.html_princ( $str408$From__ );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$170, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  cb_notify_users_draw_one_user( operation_communication.the_cyclist() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$169, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$171 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$172 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    html_utilities.html_princ( $str409$Subject__ );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$172, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( THREE_INTEGER );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw31$LEFT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$173 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( ZERO_INTEGER );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$174 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_text_input( $str410$subject, $str83$, $int411$72 );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$174, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$173, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$171, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$175 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$176 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    html_utilities.html_princ( $str412$Message__ );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$176, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( THREE_INTEGER );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw31$LEFT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$177 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( $str17$message );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( $int411$72 );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( FIVE_INTEGER );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$178 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$178, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$177, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$175, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$166, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_submit_input( $str413$Send_Email, UNPROVIDED, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$165, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$163, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$162, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$161, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 69596L)
  public static SubLObject cb_notify_users_draw_one_user(final SubLObject user)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      cb_utilities.cb_form( user, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( preferred_email_address_for_user( user ) );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      final SubLObject input = cb_notify_users_generate_exclusion_mark_from_user( user );
      html_utilities.html_checkbox_input( input, $str415$exclude, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    return user;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 69934L)
  public static SubLObject cb_notify_users_draw_header()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$179 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$179, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$180 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
        html_utilities.html_princ( $str376$User );
        html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$180, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$181 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
        html_utilities.html_princ( $str416$Email_Address );
        html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$181, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$182 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
        html_utilities.html_princ( $str417$Exclude_ );
        html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$182, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70256L)
  public static SubLObject clear_cb_notify_users_generate_exclusion_mark_from_user()
  {
    final SubLObject cs = $cb_notify_users_generate_exclusion_mark_from_user_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70256L)
  public static SubLObject remove_cb_notify_users_generate_exclusion_mark_from_user(final SubLObject user)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cb_notify_users_generate_exclusion_mark_from_user_caching_state$.getGlobalValue(), ConsesLow.list( user ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70256L)
  public static SubLObject cb_notify_users_generate_exclusion_mark_from_user_internal(final SubLObject user)
  {
    return Sequences.cconcatenate( $str419$exclude_, kb_paths.fort_name( user ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70256L)
  public static SubLObject cb_notify_users_generate_exclusion_mark_from_user(final SubLObject user)
  {
    SubLObject caching_state = $cb_notify_users_generate_exclusion_mark_from_user_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym418$CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER, $sym420$_CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER_CACHING_STATE_, NIL, EQ,
          ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, user, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cb_notify_users_generate_exclusion_mark_from_user_internal( user ) ) );
      memoization_state.caching_state_put( caching_state, user, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70400L)
  public static SubLObject preferred_email_address_for_user(final SubLObject user)
  {
    SubLObject result = NIL;
    result = ask_utilities.ask_variable( $kw421$ADDRESS, ConsesLow.listS( $const422$preferredEMailAddressText, user, $list423 ), $const424$CyclistsMt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED );
    if( NIL == result )
    {
      return $str274$unknown;
    }
    return result.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 70689L)
  public static SubLObject cb_send_email_to_selected_users(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = html_utilities.html_extract_input( $str17$message, args );
    final SubLObject subject = html_utilities.html_extract_input( $str410$subject, args );
    SubLObject recipients = NIL;
    final SubLObject title_var = $str425$Sending_Message;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$183 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$184 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$185 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$186 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$186, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_newline( TWO_INTEGER );
            html_utilities.html_markup( html_macros.$html_blockquote_head$.getGlobalValue() );
            html_utilities.html_princ( $str426$Sending_message_with_following_co );
            html_utilities.html_newline( TWO_INTEGER );
            html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( ZERO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$187 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$188 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw62$RIGHT ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$189 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str427$Subject );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$189, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw31$LEFT ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$190 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_macros.verify_not_within_html_pre();
                  html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
                  final SubLObject _prev_bind_0_$191 = html_macros.$within_html_pre$.currentBinding( thread );
                  try
                  {
                    html_macros.$within_html_pre$.bind( T, thread );
                    html_utilities.html_princ( subject );
                  }
                  finally
                  {
                    html_macros.$within_html_pre$.rebind( _prev_bind_0_$191, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$190, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$188, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$192 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw62$RIGHT ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$193 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str428$Message_ );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$193, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw31$LEFT ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$194 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_macros.verify_not_within_html_pre();
                  html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
                  final SubLObject _prev_bind_0_$195 = html_macros.$within_html_pre$.currentBinding( thread );
                  try
                  {
                    html_macros.$within_html_pre$.bind( T, thread );
                    html_utilities.html_princ( message );
                  }
                  finally
                  {
                    html_macros.$within_html_pre$.rebind( _prev_bind_0_$195, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$194, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$192, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$187, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_blockquote_tail$.getGlobalValue() );
            html_utilities.html_newline( TWO_INTEGER );
            html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
            html_utilities.html_princ( $str429$Sending_Log );
            html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
            html_utilities.html_newline( TWO_INTEGER );
            html_utilities.html_markup( html_macros.$html_unordered_list_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$196 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              SubLObject cdolist_list_var = html_kernel.html_interface_users();
              SubLObject user_entry = NIL;
              user_entry = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = user_entry;
                SubLObject machine = NIL;
                SubLObject user = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list430 );
                machine = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list430 );
                user = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  final SubLObject exclude_mark = cb_notify_users_generate_exclusion_mark_from_user( user );
                  if( NIL != html_utilities.html_extract_input( exclude_mark, args ) )
                  {
                    html_utilities.html_markup( html_macros.$html_list_item_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$197 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_princ( $str431$Excluding_user_ );
                      cb_utilities.cb_form( user, UNPROVIDED, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$197, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_list_item_tail$.getGlobalValue() );
                  }
                  else
                  {
                    recipients = ConsesLow.cons( user, recipients );
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list430 );
                }
                cdolist_list_var = cdolist_list_var.rest();
                user_entry = cdolist_list_var.first();
              }
              final SubLObject from = preferred_email_address_for_user( operation_communication.the_cyclist() );
              SubLObject cdolist_list_var2 = recipients;
              SubLObject recipient = NIL;
              recipient = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                final SubLObject to = preferred_email_address_for_user( recipient );
                thread.resetMultipleValues();
                final SubLObject message_sent_p = mail_utilities.mail_message( from, to, message, subject, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                final SubLObject error_message = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != message_sent_p )
                {
                  html_utilities.html_markup( html_macros.$html_list_item_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$198 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str432$Sent_message_to_ );
                    cb_utilities.cb_form( recipient, UNPROVIDED, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$198, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_list_item_tail$.getGlobalValue() );
                }
                else
                {
                  html_utilities.html_markup( html_macros.$html_list_item_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$199 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    final SubLObject color_val = html_macros.$html_color_lighter_red$.getGlobalValue();
                    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                    if( NIL != color_val )
                    {
                      html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_color( color_val ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    }
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$200 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_princ( $str433$Error_on_sending_message_to_ );
                      cb_utilities.cb_form( recipient, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_princ( $str373$___ );
                      html_utilities.html_princ( error_message );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$200, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$199, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_list_item_tail$.getGlobalValue() );
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                recipient = cdolist_list_var2.first();
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$196, thread );
            }
            html_utilities.html_markup( html_macros.$html_unordered_list_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$185, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$184, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$183, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return args;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 73084L)
  public static SubLObject cb_link_login(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str435$Login_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str436$cb_login );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 73275L)
  public static SubLObject cb_login_handler(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject input_name = string_utilities.trim_whitespace( html_utilities.html_extract_value( $str359$new_login_name, args, $str83$ ) );
    final SubLObject hashed_password = html_utilities.html_extract_value( $str370$new_login_hashed_password, args, $str83$ );
    final SubLObject login_result = cyc_login( input_name, hashed_password );
    if( login_result == $kw388$SUCCESS )
    {
      if( NIL == possibly_redirect( args ) )
      {
        cb_login_known_cyclist();
      }
      return NIL;
    }
    if( NIL != operation_communication.image_requires_authenticationP() )
    {
      cb_login( args );
      return NIL;
    }
    final SubLObject dwimmed_cyclist = dwim_cyclist_name_to_cyclist( input_name );
    if( NIL != dwimmed_cyclist )
    {
      cb_set_the_cyclist( dwimmed_cyclist );
      if( NIL == possibly_redirect( args ) )
      {
        cb_login_known_cyclist();
      }
      return NIL;
    }
    final SubLObject login_name = ( Sequences.length( input_name ).numG( ZERO_INTEGER ) && ( NIL != Sequences.find( Characters.CHAR_space, input_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Characters
        .lower_case_p( Strings.sublisp_char( input_name, ZERO_INTEGER ) ) ) ) ? cyc_navigator_internals.make_ok_cyclist_name( input_name ) : input_name;
    final SubLObject constant = fi.fi_find_int( login_name );
    if( login_name.isString() && NIL != constant_completion_high.valid_constant_name_p( login_name ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym439$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const343$EverythingPSC, thread );
        if( NIL != constant && NIL != kb_accessors.human_cyclistP( constant ) )
        {
          cb_set_the_cyclist( constant );
          if( NIL == possibly_redirect( args ) )
          {
            cb_login_known_cyclist();
          }
        }
        else if( NIL != constant && NIL == kb_accessors.human_cyclistP( constant ) )
        {
          cb_login_used_constant( constant );
        }
        else
        {
          cb_login_unknown_cyclist( login_name );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cb_login( args );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 75576L)
  public static SubLObject dwim_cyclist_name_to_cyclist(final SubLObject input_name)
  {
    final SubLObject candidates = cb_frames.terms_for_browsing( input_name, UNPROVIDED, UNPROVIDED );
    final SubLObject cyclists = list_utilities.remove_if_not( $sym441$HUMAN_CYCLIST_, candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != list_utilities.singletonP( cyclists ) ) ? cyclists.first() : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 75811L)
  public static SubLObject cyc_login(final SubLObject input_name, SubLObject hashed_password)
  {
    if( hashed_password == UNPROVIDED )
    {
      hashed_password = NIL;
    }
    if( NIL != operation_communication.non_guest_cyclist_nameP( input_name ) )
    {
      if( NIL != operation_communication.image_requires_authenticationP() )
      {
        cb_authenticate_the_cyclist( input_name, hashed_password );
      }
      else
      {
        cb_set_the_cyclist( input_name );
      }
      if( NIL == operation_communication.the_cyclist_is_guestP() )
      {
        return $kw388$SUCCESS;
      }
    }
    return $kw389$FAILURE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 76195L)
  public static SubLObject possibly_redirect(final SubLObject args)
  {
    final SubLObject redirect_fn_string = html_utilities.html_extract_input( $str442$redirect_handler, args );
    final SubLObject new_arg_start = Sequences.position( $str442$redirect_handler, args, Symbols.symbol_function( EQUALP ), $sym443$FIRST_LIST, UNPROVIDED, UNPROVIDED );
    if( NIL != redirect_fn_string )
    {
      final SubLObject redirect_fn = reader.read_from_string_ignoring_errors( redirect_fn_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != html_macros.html_handler_functionP( redirect_fn ) )
      {
        Functions.funcall( redirect_fn, conses_high.nthcdr( number_utilities.f_1X( new_arg_start ), args ) );
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 76633L)
  public static SubLObject first_list(final SubLObject obj)
  {
    if( NIL != list_utilities.proper_list_p( obj ) )
    {
      return obj.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 76802L)
  public static SubLObject cb_login_used_constant(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str444$Known_Constant;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$201 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$202 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$203 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$204 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$204, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$205 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_back_button( UNPROVIDED, UNPROVIDED );
              html_utilities.html_princ( $str445$The_name_you_typed_in__ );
              cb_utilities.cb_form( constant, UNPROVIDED, UNPROVIDED );
              html_utilities.html_princ( $str446$_is_already_used_in_the_Knowledge );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_princ( $str447$Please_go_back_and_try_a_differen );
              html_utilities.html_newline( TWO_INTEGER );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$205, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$203, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$202, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$201, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 77332L)
  public static SubLObject cb_login_known_cyclist()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_events.cb_post_login_event( operation_communication.the_cyclist() );
    html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw9$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str448$Successful_Login );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      cb_tools.html_update_cb_toolbar_script();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$206 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != color_value )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color_value ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$207 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_princ( $str448$Successful_Login );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_princ( $str449$Welcome__ );
          html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
          html_utilities.html_princ( cb_user_address_string( operation_communication.the_cyclist() ) );
          html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
          html_utilities.html_princ( $str450$_ );
          html_utilities.html_newline( TWO_INTEGER );
          final SubLObject project = fi.ke_purpose();
          if( NIL != project )
          {
            html_utilities.html_princ( $str451$Your_project_has_been_set_to_ );
            cb_utilities.cb_form( project, UNPROVIDED, UNPROVIDED );
            html_utilities.html_princ( $str171$_ );
            html_utilities.html_newline( UNPROVIDED );
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$208 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str349$cb_choose_project, T, UNPROVIDED );
              html_utilities.html_submit_input( $str452$Change_Project, UNPROVIDED, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$208, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          }
          else
          {
            html_utilities.html_princ( $str453$Your_project_is_currently_not_set );
            html_utilities.html_newline( UNPROVIDED );
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$209 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str349$cb_choose_project, T, UNPROVIDED );
              html_utilities.html_submit_input( $str454$Choose_Project, UNPROVIDED, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$209, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$210 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_4 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_5 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            cb_utilities.cb_frame_update_message_page_info( $str455$Login );
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_5, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_4, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$210, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$207, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$206, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 78755L)
  public static SubLObject cb_user_address_string(SubLObject user)
  {
    if( user == UNPROVIDED )
    {
      user = operation_communication.the_cyclist();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject string = NIL;
    if( NIL != kb_control_vars.lexicon_kb_loaded_p() )
    {
      final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding( thread );
      try
      {
        pph_vars.$pph_demerit_cutoff$.bind( ONE_INTEGER, thread );
        pph_vars.$pph_language_mt$.bind( cb_tools.cb_paraphrase_mt(), thread );
        final SubLObject titles = ask_utilities.query_variable( $sym457$_TITLE, ConsesLow.listS( $const458$titleOfPerson, user, $list459 ), $const460$InferencePSC, UNPROVIDED );
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
        for( doneP = NIL, rest = NIL, rest = $cb_address_titles$.getGlobalValue(); NIL == doneP && NIL != rest; rest = rest.rest() )
        {
          cons = rest.first();
          datum = ( current = cons );
          known_title = NIL;
          prefix_string = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list461 );
          known_title = current.first();
          current = ( prefix_string = current.rest() );
          if( NIL != subl_promotions.memberP( known_title, titles, UNPROVIDED, UNPROVIDED ) )
          {
            target_pred = ( known_title.eql( $const462$Sir ) ? $const463$givenNames : $const464$familyName );
            thread.resetMultipleValues();
            family_name = pph_main.generate_text_wXsentential_force( user, $kw465$NONE, ConsesLow.list( target_pred ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            pred = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != family_name && NIL != genl_predicates.genl_predicateP( pred, target_pred, UNPROVIDED, UNPROVIDED ) )
            {
              string = Sequences.cconcatenate( prefix_string, new SubLObject[] { $str108$_, family_name
              } );
            }
            doneP = T;
          }
        }
        if( NIL == string )
        {
          thread.resetMultipleValues();
          final SubLObject given_name = pph_main.generate_text_wXsentential_force( user, $kw465$NONE, $list466, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject pred2 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != given_name && NIL != genl_predicates.genl_predicateP( pred2, $const463$givenNames, UNPROVIDED, UNPROVIDED ) )
          {
            string = given_name;
          }
        }
      }
      finally
      {
        pph_vars.$pph_language_mt$.rebind( _prev_bind_2, thread );
        pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL == string )
    {
      string = cb_utilities.cb_string_for_term( user );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 80017L)
  public static SubLObject cb_login_unknown_cyclist(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str467$Unknown_Cyclist;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$211 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$212 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$213 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$214 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$214, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$215 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str468$cb_create_new_cyclist, name, UNPROVIDED );
              html_utilities.html_princ( $str469$The_name_ );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( name );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_princ( $str470$_is_not_the_name_of_a_known_ );
              cb_utilities.cb_form( $const395$HumanCyclist, UNPROVIDED, UNPROVIDED );
              html_utilities.html_princ( $str171$_ );
              html_utilities.html_newline( TWO_INTEGER );
              if( NIL == ke.cyclist_is_guest() )
              {
                html_utilities.html_princ( $str471$Do_you_want_to_create_a_new_Cyc_c );
                html_utilities.html_newline( TWO_INTEGER );
                cb_utilities.cb_back_button( $kw145$SELF, $str65$No );
                html_utilities.html_submit_input( $str472$Yes__Create_Cyclist, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$215, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$213, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$212, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$211, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 80888L)
  public static SubLObject cb_create_new_cyclist(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str473$creating_new_cyclists );
      return NIL;
    }
    final SubLObject name = args.first();
    if( NIL != name )
    {
      final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding( thread );
      try
      {
        api_control_vars.$use_local_queueP$.bind( NIL, thread );
        final SubLObject constant = ke.ke_create( name );
        ke.ke_assert( ConsesLow.listS( $const474$isa, constant, $list475 ), $const424$CyclistsMt, UNPROVIDED, UNPROVIDED );
        if( NIL != kb_accessors.human_cyclistP( constant ) )
        {
          cb_set_the_cyclist( constant );
          cb_login_known_cyclist();
        }
      }
      finally
      {
        api_control_vars.$use_local_queueP$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cb_utilities.cb_error( $str476$Unable_to_create_a_new_cyclist__w, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 81509L)
  public static SubLObject cb_logout(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str478$Logout;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$216 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$217 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$218 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$219 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$219, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_princ( $str479$You_have_now_logged_out_from_this );
            html_utilities.html_newline( TWO_INTEGER );
            html_utilities.html_princ( $str364$Click_ );
            cb_utilities.cb_link( $kw480$START, $str366$here, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_princ( $str481$_to_reconnect_to_Cyc_ );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$218, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$217, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$216, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_flush();
    html_kernel.clear_html_state_for_machine( html_kernel.http_state_key_for_request() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 83101L)
  public static SubLObject cb_link_logout(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str483$_Logout_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw32$TOP );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str484$cb_logout );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 83299L)
  public static SubLObject cb_set_password(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem = html_utilities.html_extract_input( $str486$problem, args );
    final SubLObject login_name = html_utilities.html_extract_value( $str487$user_login, args, kb_paths.fort_name( operation_communication.the_cyclist() ) );
    final SubLObject title_var = $str488$Specify_Cyc_Browser_Password;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$220 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        cyc_file_dependencies.javascript( $kw11$SHA1 );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$221 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$222 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$223 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$223, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            if( problem.isString() )
            {
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw28$CENTER ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_width$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str489$80_ );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$224 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$225 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$226 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                    if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
                    {
                      html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    }
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$227 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                      html_utilities.html_princ( $str490$Error_ );
                      html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$227, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$226, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$228 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str491$Could_not_set_password_for_ );
                    html_utilities.html_princ( login_name );
                    html_utilities.html_princ( $str171$_ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$228, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$225, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$229 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw32$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$230 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    html_utilities.html_princ( $str492$Reason_ );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$230, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$231 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( problem );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$231, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$229, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$224, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
            }
            html_utilities.html_princ( $str493$Please_specify_a_new_password_for );
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_princ( $str494$_Note__Only_you_can_reset_your_ow );
            html_utilities.html_newline( UNPROVIDED );
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$232 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str495$cb_set_password_handler, T, UNPROVIDED );
              html_utilities.html_user_id_and_password( $str487$user_login, $str370$new_login_hashed_password, $str371$Cyclist, $str496$New_Password, login_name, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$232, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$222, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$221, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$220, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 84813L)
  public static SubLObject cb_link_set_password(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str498$_Set_Password_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str499$cb_set_password );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 85125L)
  public static SubLObject cb_set_password_handler(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject login_name = string_utilities.trim_whitespace( html_utilities.html_extract_value( $str487$user_login, args, $str83$ ) );
    final SubLObject password = html_utilities.html_extract_value( $str370$new_login_hashed_password, args, $str83$ );
    if( NIL != string_utilities.empty_string_p( login_name ) || NIL != string_utilities.empty_string_p( password ) )
    {
      return cb_set_password( cb_set_password_args_with_problem( args, $str505$Please_fill_in_all_fields_ ) );
    }
    final SubLObject candidates = cb_frames.terms_for_browsing( login_name, UNPROVIDED, UNPROVIDED );
    final SubLObject cyclists = list_utilities.remove_if_not( $sym441$HUMAN_CYCLIST_, candidates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == cyclists )
    {
      return cb_set_password( cb_set_password_args_with_problem( args, $str506$No_known_cyclist_by_this_name_ ) );
    }
    if( NIL == list_utilities.singletonP( cyclists ) )
    {
      return cb_set_password( cb_set_password_args_with_problem( args, Sequences.cconcatenate( $str507$The_name_could_mean_any_of_follow, format_nil.format_nil_a_no_copy( cyclists ) ) ) );
    }
    final SubLObject user = cyclists.first();
    thread.resetMultipleValues();
    final SubLObject status = operation_communication.specify_authentication_info_for_user( user, password, $const352$CycBrowser );
    final SubLObject message = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != status )
    {
      return cb_browser.cb_c_predicate_extent( $list508 );
    }
    return cb_set_password( cb_set_password_args_with_problem( args, message ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 86616L)
  public static SubLObject cb_set_password_args_with_problem(final SubLObject args, final SubLObject message)
  {
    return ConsesLow.cons( ConsesLow.list( $str486$problem, message ), args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 86729L)
  public static SubLObject cb_confirm_halt_cyc(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str512$the_Halt_Cyc_Image );
    }
    else
    {
      final SubLObject title_var = $str513$Halt_Cyc_Image;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$233 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw9$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$234 = html_macros.$html_inside_bodyP$.currentBinding( thread );
          try
          {
            html_macros.$html_inside_bodyP$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
            if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str12$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$235 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$236 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str14$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str15$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str16$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$236, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              if( NIL != title_var )
              {
                html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_princ( title_var );
                html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw32$TOP );
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str19$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$237 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str514$cb_halt_cyc, T, UNPROVIDED );
                cb_utilities.cb_help_preamble( $kw510$CB_CONFIRM_HALT_CYC, UNPROVIDED, UNPROVIDED );
                cb_halt_or_restart_confirm( $str515$halt );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$237, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$235, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$234, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$233, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 86729L)
  public static SubLObject cb_link_confirm_halt_cyc(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str517$_Halt_Cyc_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str518$cb_confirm_halt_cyc );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 86729L)
  public static SubLObject cb_halt_cyc(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str512$the_Halt_Cyc_Image );
    }
    else if( NIL == system_parameters.$cb_allow_halt_imageP$.getDynamicValue( thread ) )
    {
      final SubLObject title_var = $str520$Halt_Image_Not_Allowed;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$238 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw9$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$239 = html_macros.$html_inside_bodyP$.currentBinding( thread );
          try
          {
            html_macros.$html_inside_bodyP$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
            if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str12$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$240 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$241 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str14$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str15$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str16$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$241, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              if( NIL != title_var )
              {
                html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_princ( title_var );
                html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              html_utilities.html_princ( $str521$Sorry__this_image_cannot_be_halte );
              html_utilities.html_flush();
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$240, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$239, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$238, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject title_var = $str522$Cyc_Image_Halted;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$242 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw9$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$243 = html_macros.$html_inside_bodyP$.currentBinding( thread );
          try
          {
            html_macros.$html_inside_bodyP$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
            if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str12$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$244 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$245 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str14$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str15$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str16$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$245, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              if( NIL != title_var )
              {
                html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_princ( title_var );
                html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              html_utilities.html_princ( $str523$This_Cyc_image_will_be_halted___G );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$244, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$243, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$242, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_flush();
      final SubLObject _prev_bind_2 = StreamsLow.$error_output$.currentBinding( thread );
      try
      {
        StreamsLow.$error_output$.bind( StreamsLow.$debug_io$.getDynamicValue( thread ), thread );
        final SubLObject message = Sequences.cconcatenate( $str524$Halted_by_, new SubLObject[] { format_nil.format_nil_s_no_copy( operation_communication.the_cyclist() ), $str525$_Via_HTML_interface
        } );
        operation_communication.halt_cyc_image( message );
      }
      finally
      {
        StreamsLow.$error_output$.rebind( _prev_bind_2, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 86729L)
  public static SubLObject cb_halt_or_restart_confirm(final SubLObject operation_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_newline( TWO_INTEGER );
    final SubLObject operation_string_$246 = $str515$halt;
    html_utilities.html_princ( $str527$This_will_ );
    html_utilities.html_princ( operation_string_$246 );
    html_utilities.html_princ( $str528$_the_Cyc_image_ );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( control_vars.$cyc_image_id$.getDynamicValue( thread ) );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_princ( $str171$_ );
    if( operation_queues.transmit_queue_size().isPositive() )
    {
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_color( $str529$red ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str530$Warning__ );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str531$There_are__A_operations_waiting_i, operation_queues.transmit_queue_size() );
      html_utilities.html_princ( operation_string );
      html_utilities.html_princ( $str532$_now__they_will_be_lost_ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    }
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_princ( $str533$Do_you_really_want_to_do_this_ );
    html_utilities.html_newline( TWO_INTEGER );
    cb_utilities.cb_back_button( $kw145$SELF, $str65$No );
    html_utilities.html_indent( TWO_INTEGER );
    final SubLObject label = Sequences.cconcatenate( $str534$Yes__, new SubLObject[] { format_nil.format_nil_a_no_copy( operation_string ), $str535$_system
    } );
    html_utilities.html_submit_input( label, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 90624L)
  public static SubLObject cb_transcript_viewer(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject transcript_filename = NIL;
    SubLObject show_stats = NIL;
    SubLObject error_message = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isList() )
      {
        if( $str538$show_stats.equal( arg.first() ) )
        {
          show_stats = T;
        }
        if( $str539$transcript_filename.equal( arg.first() ) )
        {
          transcript_filename = string_utilities.trim_whitespace( conses_high.second( arg ) );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    if( NIL != transcript_filename )
    {
      if( transcript_filename.equal( $str83$ ) )
      {
        error_message = $str540$Please_type_in_a_filename_;
      }
      else if( NIL == Filesys.probe_file( transcript_filename ) )
      {
        error_message = file_utilities.why_not_probe_fileP( transcript_filename );
      }
    }
    if( NIL != transcript_filename && NIL == error_message )
    {
      if( NIL != show_stats )
      {
        transcript_filename = Sequences.cconcatenate( $str319$stats_, transcript_filename );
      }
      cb_transcript_viewer_handler( ConsesLow.list( transcript_filename ) );
    }
    final SubLObject title_var = $str541$Transcript_Viewing_Area;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$247 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$248 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$249 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$250 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$250, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$251 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str542$cb_transcript_viewer_handler, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw536$CB_TRANSCRIPT_VIEWER, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              cb_utilities.cb_link( $kw543$ALL_LOCAL_TRANS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$251, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str544$cg_cb_transcript_viewer );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $kw545$GET );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$252 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_4 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_5 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str546$cb_transcript_viewer, T, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str547$View_other_transcript_ );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_princ( $str548$Please_type_in_the_full_path_to_t );
              html_utilities.html_br();
              html_utilities.html_indent( TWO_INTEGER );
              final SubLObject transcript_filename2 = ( NIL != transcript_filename ) ? transcript_filename : file_utilities.normal_pathstring( transcript_utilities.local_transcript() );
              html_utilities.html_filename_input( $str539$transcript_filename, transcript_filename2, $int100$80 );
              html_utilities.html_newline( UNPROVIDED );
              if( NIL != error_message )
              {
                html_utilities.html_indent( TWO_INTEGER );
                final SubLObject color_val = $kw18$RED;
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != color_val )
                {
                  html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( color_val ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$253 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str549$ERROR__ );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                  html_utilities.html_princ( error_message );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$253, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_submit_input( $str550$Stats, $str538$show_stats, UNPROVIDED );
              html_utilities.html_indent( FOUR_INTEGER );
              html_utilities.html_submit_input( $str551$View_Transcript, UNPROVIDED, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_5, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_4, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$252, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$249, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$248, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$247, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 92512L)
  public static SubLObject cb_transcript_viewer_handler(final SubLObject args)
  {
    final SubLObject show_statistics = string_utilities.starts_with( args.first(), $str319$stats_ );
    final SubLObject file = args.first();
    if( NIL != show_statistics )
    {
      get_statistics_on_transcript( string_utilities.remove_substring( file, $str319$stats_ ) );
    }
    else
    {
      display_transcript( file );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 92790L)
  public static SubLObject display_transcript(final SubLObject transcript)
  {
    cb_system_get_transcript( transcript );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 92882L)
  public static SubLObject get_statistics_on_transcript(final SubLObject file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stats = transcript_utilities.constant_modifications_in_transcript( file );
    final SubLObject title_var = $str554$Transcript_Statistics;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$254 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$255 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$256 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$257 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$257, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$258 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_back_button( UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str555$Transcript__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
              html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              cb_parameters.cyc_cgi_url_int();
              html_utilities.html_princ( Sequences.cconcatenate( $str318$cb_transcript_viewer_handler_, file ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$259 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( file );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$259, thread );
              }
              html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str331$Operations__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_princ( stats.first() );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str556$Constants_Created__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_princ( conses_high.list_length( conses_high.second( stats ) ) );
              html_utilities.html_newline( UNPROVIDED );
              SubLObject cdolist_list_var = conses_high.second( stats );
              SubLObject creates = NIL;
              creates = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                final SubLObject constant = constants_high.find_constant( conses_high.third( creates ) );
                if( NIL != constant )
                {
                  cb_utilities.cb_form( constant, UNPROVIDED, UNPROVIDED );
                }
                else
                {
                  html_utilities.html_princ( conses_high.third( creates ) );
                }
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_terpri( UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                creates = cdolist_list_var.first();
              }
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str557$Constants_Renamed__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_princ( conses_high.list_length( conses_high.third( stats ) ) );
              html_utilities.html_newline( UNPROVIDED );
              cdolist_list_var = conses_high.third( stats );
              SubLObject renames = NIL;
              renames = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                html_utilities.html_princ( conses_high.third( renames ) );
                html_utilities.html_princ( $str558$__ );
                final SubLObject constant = constants_high.find_constant( conses_high.fourth( renames ) );
                if( NIL != constant )
                {
                  cb_utilities.cb_form( constant, UNPROVIDED, UNPROVIDED );
                }
                else
                {
                  html_utilities.html_princ( conses_high.fourth( renames ) );
                }
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_terpri( UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                renames = cdolist_list_var.first();
              }
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str559$Constants_Killed__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_princ( conses_high.list_length( conses_high.fourth( stats ) ) );
              html_utilities.html_newline( UNPROVIDED );
              cdolist_list_var = conses_high.fourth( stats );
              SubLObject kills = NIL;
              kills = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                html_utilities.html_princ( conses_high.third( kills ) );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_terpri( UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                kills = cdolist_list_var.first();
              }
              html_utilities.html_newline( TWO_INTEGER );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$258, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$256, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$255, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$254, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 94317L)
  public static SubLObject cb_link_all_local_trans()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject transcripts = transcript_utilities.get_all_transcripts_image();
    if( NIL == transcripts )
    {
      html_utilities.html_princ( $str560$No_transcripts_for_this_image_ );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str561$Local_transcripts_for_this_image_ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( TWO_INTEGER );
      SubLObject cdolist_list_var = Sequences.reverse( transcript_utilities.get_all_transcripts_image() );
      SubLObject file = NIL;
      file = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
        html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ( Sequences.cconcatenate( $str562$cb_transcript_viewer_handler_stat, file ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != frame_name_var )
        {
          html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( frame_name_var );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str550$Stats );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
        html_utilities.html_indent( FIVE_INTEGER );
        frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
        html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ( Sequences.cconcatenate( $str318$cb_transcript_viewer_handler_, file ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != frame_name_var )
        {
          html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( frame_name_var );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( file );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
        html_utilities.html_newline( TWO_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        file = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 95069L)
  public static SubLObject cb_link_viewer(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str564$Viewer;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str546$cb_transcript_viewer );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 95484L)
  public static SubLObject cb_show_local_ops(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str572$Local_Operations;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$260 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$261 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$262 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$263 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$263, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$264 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str573$cb_confirm_clear_local_queue, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw570$CB_SHOW_LOCAL_OPS, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              final SubLObject total = operation_queues.local_queue_size();
              if( total.numE( ZERO_INTEGER ) )
              {
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str574$You_have_nothing_in_your_local_qu );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              }
              else
              {
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str48$You_have_ );
                html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
                html_utilities.html_princ( total );
                html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
                html_utilities.html_princ( $str575$_item );
                if( total.numG( ONE_INTEGER ) )
                {
                  html_utilities.html_princ( $str576$s );
                }
                html_utilities.html_princ( $str577$_in_your_local_queue_ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str578$Click_this_button_to_erase_the_lo );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_indent( THREE_INTEGER );
                html_utilities.html_submit_input( $str579$Clear_Local_Queue, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str580$Here_are_the_queued_local_operati );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( TWO_INTEGER );
                SubLObject cdolist_list_var;
                final SubLObject operations = cdolist_list_var = operation_queues.local_queue_contents();
                SubLObject an_op = NIL;
                an_op = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  an_op = cb_transform_operation_for_display( an_op );
                  cb_utilities.cb_form( an_op, ZERO_INTEGER, T );
                  html_utilities.html_newline( UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  an_op = cdolist_list_var.first();
                }
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$264, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$262, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$261, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$260, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 96693L)
  public static SubLObject cb_link_show_local_ops(SubLObject text)
  {
    if( text == UNPROVIDED )
    {
      text = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == text )
    {
      text = $str582$Local_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str583$cb_show_local_ops );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( text );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 97058L)
  public static SubLObject cb_confirm_clear_local_queue(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str579$Clear_Local_Queue;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$265 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$266 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$267 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$268 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$268, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$269 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str587$cb_clear_local_queue, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw585$CB_CONFIRM_CLEAR_LOCAL_QUEUE, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              final SubLObject total = operation_queues.local_queue_size();
              if( total.numE( ZERO_INTEGER ) )
              {
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str574$You_have_nothing_in_your_local_qu );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              }
              else
              {
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str588$Are_you_ );
                html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
                html_utilities.html_princ( $str589$SURE );
                html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
                html_utilities.html_princ( $str590$_you_want_to_clear_your_local_que );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
                html_utilities.html_princ( total );
                html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
                html_utilities.html_princ( $str591$_operations_will_be_lost_ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                cb_utilities.cb_back_button( $kw145$SELF, $str65$No );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_submit_input( $str592$Yes__Clear_Local_Queue, UNPROVIDED, UNPROVIDED );
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$269, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$267, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$266, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$265, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 98048L)
  public static SubLObject cb_confirm_clear_local_and_restart(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str579$Clear_Local_Queue;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$270 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$271 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$272 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$273 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$273, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str19$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$274 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str596$cb_clear_local_and_restart, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw594$CB_CONFIRM_CLEAR_LOCAL_AND_RESTART, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              final SubLObject total = operation_queues.local_queue_size();
              if( total.numE( ZERO_INTEGER ) )
              {
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str597$You_have_nothing_in_your_local_qu );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                while ( NIL == agenda.agenda_running())
                {
                  agenda.start_agenda( TWO_INTEGER );
                }
                cb_utilities.cb_message_page_with_history( $str598$Local_Queue_Cleared__Agenda_Resta, T );
              }
              else
              {
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str588$Are_you_ );
                html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
                html_utilities.html_princ( $str589$SURE );
                html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
                html_utilities.html_princ( $str599$_you_want_to_clear_your_local_que );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
                html_utilities.html_princ( total );
                html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
                html_utilities.html_princ( $str591$_operations_will_be_lost_ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                cb_utilities.cb_back_button( $kw145$SELF, $str65$No );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_submit_input( $str600$Yes__Clear_Local_Queue_and_Restar, UNPROVIDED, UNPROVIDED );
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$274, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$272, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$271, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$270, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 99307L)
  public static SubLObject cb_link_delete_local_and_restart(final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str602$cb_confirm_clear_local_and_restar );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( text );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 99599L)
  public static SubLObject cb_link_delete_local_ops(final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw49$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str573$cb_confirm_clear_local_queue );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( text );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 99852L)
  public static SubLObject cb_clear_local_and_restart(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    operation_queues.clear_local_queue();
    while ( NIL == agenda.agenda_running())
    {
      agenda.start_agenda( TWO_INTEGER );
    }
    cb_utilities.cb_message_page_with_history( $str598$Local_Queue_Cleared__Agenda_Resta, T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 100286L)
  public static SubLObject cb_clear_local_queue(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    operation_queues.clear_local_queue();
    cb_utilities.cb_message_page_with_history( $str606$Local_Queue_Cleared, T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 100504L)
  public static SubLObject cb_system_show_specific_transcript_file_as_ke_text(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject transcript_filename = NIL;
    SubLObject output_filename = $str83$;
    SubLObject error_message = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isList() )
      {
        if( $str610$transcript_filename.equal( arg.first() ) )
        {
          transcript_filename = conses_high.second( arg );
        }
        if( $str611$output_filename.equal( arg.first() ) )
        {
          output_filename = conses_high.second( arg );
        }
        if( $str612$error_message.equal( arg.first() ) )
        {
          error_message = conses_high.second( arg );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    final SubLObject title_var = $str613$Transcript_file_viewed_in_KE_Text;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$275 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$276 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$277 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$278 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$278, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject ke_text_string_list = transcript_utilities.transcript_file_to_ke_text( transcript_filename );
            if( NIL == ke_text_string_list )
            {
              html_utilities.html_princ( $str614$The_transcript_file_contains_no_o );
            }
            else if( ke_text_string_list.isString() )
            {
              html_utilities.html_princ( ke_text_string_list );
            }
            else
            {
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$279 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                cb_utilities.cb_help_preamble( $kw608$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                html_utilities.html_princ( $str330$File__ );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                cb_utilities.cb_link( $kw316$VIEW_TRANSCRIPT, transcript_filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str615$cg_cb_write_local_transcript_as_k );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $kw616$POST );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$280 = html_macros.$html_safe_print$.currentBinding( thread );
                final SubLObject _prev_bind_1_$281 = html_macros.$within_html_form$.currentBinding( thread );
                final SubLObject _prev_bind_2_$282 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_macros.$within_html_form$.bind( T, thread );
                  html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                  html_utilities.html_hidden_input( $str617$cb_system_write_specific_transcri, T, UNPROVIDED );
                  html_utilities.html_hidden_input( $str610$transcript_filename, transcript_filename, UNPROVIDED );
                  html_utilities.html_princ( $str618$You_may_write_this_transcript_in_ );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_text_input( $str611$output_filename, output_filename, $int229$60 );
                  html_utilities.html_glyph( $kw619$NBSP, TWO_INTEGER );
                  html_utilities.html_submit_input( $str620$Write_to_File, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_newline( UNPROVIDED );
                  if( NIL != error_message )
                  {
                    final SubLObject color_val = $kw18$RED;
                    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                    if( NIL != color_val )
                    {
                      html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_color( color_val ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    }
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$281 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                      html_utilities.html_princ( $str549$ERROR__ );
                      html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                      html_utilities.html_princ( error_message );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$281, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                    html_utilities.html_newline( UNPROVIDED );
                  }
                  html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
                }
                finally
                {
                  html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_2_$282, thread );
                  html_macros.$within_html_form$.rebind( _prev_bind_1_$281, thread );
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$280, thread );
                }
                html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                html_utilities.html_princ( $str621$This_is_what_the_transcript_curre );
                html_utilities.html_newline( UNPROVIDED );
                html_macros.verify_not_within_html_pre();
                html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
                final SubLObject _prev_bind_0_$282 = html_macros.$within_html_pre$.currentBinding( thread );
                try
                {
                  html_macros.$within_html_pre$.bind( T, thread );
                  SubLObject cdolist_list_var2 = ke_text_string_list;
                  SubLObject ke_text_string = NIL;
                  ke_text_string = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    html_utilities.html_princ( ke_text_string );
                    html_utilities.html_newline( UNPROVIDED );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    ke_text_string = cdolist_list_var2.first();
                  }
                }
                finally
                {
                  html_macros.$within_html_pre$.rebind( _prev_bind_0_$282, thread );
                }
                html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$279, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            }
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$277, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$276, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$275, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 100504L)
  public static SubLObject cb_system_write_specific_transcript_file_as_ke_text(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject transcript_filename = NIL;
    SubLObject output_filename = NIL;
    SubLObject error_message = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isList() )
      {
        if( $str610$transcript_filename.equal( arg.first() ) )
        {
          transcript_filename = string_utilities.trim_whitespace( conses_high.second( arg ) );
        }
        if( $str611$output_filename.equal( arg.first() ) )
        {
          output_filename = conses_high.second( arg );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    if( NIL != output_filename && output_filename.equal( $str83$ ) )
    {
      error_message = $str540$Please_type_in_a_filename_;
    }
    if( NIL != error_message )
    {
      cb_system_show_specific_transcript_file_as_ke_text( ConsesLow.list( ConsesLow.list( $str610$transcript_filename, transcript_filename ), ConsesLow.list( $str611$output_filename, output_filename ), ConsesLow.list(
          $str612$error_message, error_message ) ) );
      return NIL;
    }
    final SubLObject error_message_$285 = transcript_utilities.write_specific_transcript_file_as_ke_text( transcript_filename, output_filename );
    if( NIL != error_message_$285 )
    {
      cb_system_show_specific_transcript_file_as_ke_text( ConsesLow.list( ConsesLow.list( $str610$transcript_filename, transcript_filename ), ConsesLow.list( $str611$output_filename, output_filename ), ConsesLow.list(
          $str612$error_message, error_message_$285 ) ) );
    }
    else
    {
      final SubLObject title_var = $str623$Transcript_successfully_written_;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$286 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw9$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$287 = html_macros.$html_inside_bodyP$.currentBinding( thread );
          try
          {
            html_macros.$html_inside_bodyP$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
            if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str12$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$288 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$289 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str14$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str15$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str16$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$289, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              if( NIL != title_var )
              {
                html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_princ( title_var );
                html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              cb_utilities.cb_help_preamble( $kw608$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, UNPROVIDED, UNPROVIDED );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$288, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$287, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$286, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-system-tools.lisp", position = 104507L)
  public static SubLObject possibly_insert_experience_options()
  {
    return NIL;
  }

  public static SubLObject declare_cb_system_tools_file()
  {
    SubLFiles.declareFunction( me, "cyc_system_doc_file", "CYC-SYSTEM-DOC-FILE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_mode", "CB-MODE", 0, 1, false );
    SubLFiles.declareFunction( me, "insert_transmit_options", "INSERT-TRANSMIT-OPTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "insert_kb_not_current_message", "INSERT-KB-NOT-CURRENT-MESSAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "insert_stored_options", "INSERT-STORED-OPTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "insert_local_queue_warning", "INSERT-LOCAL-QUEUE-WARNING", 0, 0, false );
    SubLFiles.declareFunction( me, "insert_read_options", "INSERT-READ-OPTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_mode_show_kb_checkpoint_options", "CB-MODE-SHOW-KB-CHECKPOINT-OPTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "oe_patch_messages_enabled_and_email_validP", "OE-PATCH-MESSAGES-ENABLED-AND-EMAIL-VALID?", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_mode_handler", "CB-MODE-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_mode", "CB-LINK-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "display_oe_patch_message", "DISPLAY-OE-PATCH-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "oe_patch_message_subject_prefix", "OE-PATCH-MESSAGE-SUBJECT-PREFIX", 0, 0, false );
    SubLFiles.declareFunction( me, "default_oe_patch_message", "DEFAULT-OE-PATCH-MESSAGE", 0, 4, false );
    SubLFiles.declareFunction( me, "cb_handle_oe_patch_message", "CB-HANDLE-OE-PATCH-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "send_or_submit_transcript_with_message", "SEND-OR-SUBMIT-TRANSCRIPT-WITH-MESSAGE", 4, 2, false );
    SubLFiles.declareFunction( me, "ke_text_for_patch_message", "KE-TEXT-FOR-PATCH-MESSAGE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_roll_current_kb", "CB-LINK-ROLL-CURRENT-KB", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_roll_current_kb", "CB-ROLL-CURRENT-KB", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_roll_current_kb", "CB-HANDLE-ROLL-CURRENT-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_agenda_halt_explanation_display", "CB-AGENDA-HALT-EXPLANATION-DISPLAY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_agenda", "CB-AGENDA", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_assertion_dependency_counts", "CB-ASSERTION-DEPENDENCY-COUNTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_agenda", "CB-LINK-AGENDA", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_abort_agenda", "CB-ABORT-AGENDA", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_toggle_agenda_status_display", "CB-TOGGLE-AGENDA-STATUS-DISPLAY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_toggle_agenda_status", "CB-TOGGLE-AGENDA-STATUS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_agenda_error_mode_display", "CB-AGENDA-ERROR-MODE-DISPLAY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_agenda_error_mode_handler", "CB-AGENDA-ERROR-MODE-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_agenda_local_queue_display", "CB-AGENDA-LOCAL-QUEUE-DISPLAY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_link_agenda_error_file", "CB-LINK-AGENDA-ERROR-FILE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_agenda_error_file_viewer", "CB-AGENDA-ERROR-FILE-VIEWER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_system1", "CB-LINK-SYSTEM1", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_system", "CB-LINK-SYSTEM", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_system", "CB-SYSTEM", 1, 0, false );
    SubLFiles.declareFunction( me, "html_cb_write_image_int", "HTML-CB-WRITE-IMAGE-INT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_write_image_handler", "CB-WRITE-IMAGE-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_system_settings", "CB-SHOW-SYSTEM-SETTINGS", 0, 0, false );
    SubLFiles.declareFunction( me, "show_queue_information", "SHOW-QUEUE-INFORMATION", 0, 0, false );
    SubLFiles.declareFunction( me, "show_transcript_information", "SHOW-TRANSCRIPT-INFORMATION", 0, 0, false );
    SubLFiles.declareFunction( me, "show_historical_information", "SHOW-HISTORICAL-INFORMATION", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_link_read_trans", "CB-LINK-READ-TRANS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_link_write_trans", "CB-LINK-WRITE-TRANS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_link_view_transcript", "CB-LINK-VIEW-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "html_transcript_stats_link", "HTML-TRANSCRIPT-STATS-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_system_ready_transcript_file", "CB-SYSTEM-READY-TRANSCRIPT-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_system_get_transcript", "CB-SYSTEM-GET-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_system_show_specific_transcript_file", "CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_transform_operation_for_display", "CB-TRANSFORM-OPERATION-FOR-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_choose_project", "CB-CHOOSE-PROJECT", 0, 1, false );
    SubLFiles.declareFunction( me, "ongoing_cyc_projects", "ONGOING-CYC-PROJECTS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_choose_project_handler", "CB-CHOOSE-PROJECT-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_choose_project", "CB-LINK-CHOOSE-PROJECT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_authenticate_the_cyclist", "CB-AUTHENTICATE-THE-CYCLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_set_the_cyclist", "CB-SET-THE-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_after_login_events", "CB-AFTER-LOGIN-EVENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_login_find_default_projects_for_cyclist", "CB-LOGIN-FIND-DEFAULT-PROJECTS-FOR-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "note_image_purpose", "NOTE-IMAGE-PURPOSE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_login", "CB-LOGIN", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_force_logout", "CB-FORCE-LOGOUT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_force_logout", "CB-LINK-FORCE-LOGOUT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_unauthenticated_login_pane", "CB-UNAUTHENTICATED-LOGIN-PANE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_notify_all_users", "CB-LINK-NOTIFY-ALL-USERS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_notify_all_users", "CB-NOTIFY-ALL-USERS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_notify_users_draw_one_user", "CB-NOTIFY-USERS-DRAW-ONE-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_notify_users_draw_header", "CB-NOTIFY-USERS-DRAW-HEADER", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_cb_notify_users_generate_exclusion_mark_from_user", "CLEAR-CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cb_notify_users_generate_exclusion_mark_from_user", "REMOVE-CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_notify_users_generate_exclusion_mark_from_user_internal", "CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_notify_users_generate_exclusion_mark_from_user", "CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "preferred_email_address_for_user", "PREFERRED-EMAIL-ADDRESS-FOR-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_send_email_to_selected_users", "CB-SEND-EMAIL-TO-SELECTED-USERS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_login", "CB-LINK-LOGIN", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_login_handler", "CB-LOGIN-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "dwim_cyclist_name_to_cyclist", "DWIM-CYCLIST-NAME-TO-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_login", "CYC-LOGIN", 1, 1, false );
    SubLFiles.declareFunction( me, "possibly_redirect", "POSSIBLY-REDIRECT", 1, 0, false );
    SubLFiles.declareFunction( me, "first_list", "FIRST-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_login_used_constant", "CB-LOGIN-USED-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_login_known_cyclist", "CB-LOGIN-KNOWN-CYCLIST", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_user_address_string", "CB-USER-ADDRESS-STRING", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_login_unknown_cyclist", "CB-LOGIN-UNKNOWN-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_create_new_cyclist", "CB-CREATE-NEW-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_logout", "CB-LOGOUT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_logout", "CB-LINK-LOGOUT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_set_password", "CB-SET-PASSWORD", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_set_password", "CB-LINK-SET-PASSWORD", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_set_password_handler", "CB-SET-PASSWORD-HANDLER", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_set_password_args_with_problem", "CB-SET-PASSWORD-ARGS-WITH-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_confirm_halt_cyc", "CB-CONFIRM-HALT-CYC", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_confirm_halt_cyc", "CB-LINK-CONFIRM-HALT-CYC", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_halt_cyc", "CB-HALT-CYC", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_halt_or_restart_confirm", "CB-HALT-OR-RESTART-CONFIRM", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_transcript_viewer", "CB-TRANSCRIPT-VIEWER", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_transcript_viewer_handler", "CB-TRANSCRIPT-VIEWER-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "display_transcript", "DISPLAY-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_statistics_on_transcript", "GET-STATISTICS-ON-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_all_local_trans", "CB-LINK-ALL-LOCAL-TRANS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_link_viewer", "CB-LINK-VIEWER", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_show_local_ops", "CB-SHOW-LOCAL-OPS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_show_local_ops", "CB-LINK-SHOW-LOCAL-OPS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_confirm_clear_local_queue", "CB-CONFIRM-CLEAR-LOCAL-QUEUE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_confirm_clear_local_and_restart", "CB-CONFIRM-CLEAR-LOCAL-AND-RESTART", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_delete_local_and_restart", "CB-LINK-DELETE-LOCAL-AND-RESTART", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_delete_local_ops", "CB-LINK-DELETE-LOCAL-OPS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_clear_local_and_restart", "CB-CLEAR-LOCAL-AND-RESTART", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_clear_local_queue", "CB-CLEAR-LOCAL-QUEUE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_system_show_specific_transcript_file_as_ke_text", "CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_system_write_specific_transcript_file_as_ke_text", "CB-SYSTEM-WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT", 0, 1, false );
    SubLFiles.declareFunction( me, "possibly_insert_experience_options", "POSSIBLY-INSERT-EXPERIENCE-OPTIONS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_system_tools_file()
  {
    $cyc_system_doc_comm_mode_index$ = SubLFiles.defparameter( "*CYC-SYSTEM-DOC-COMM-MODE-INDEX*", $str1$com_modes );
    $cb_mode_checkpoint_collection$ = SubLFiles.deflexical( "*CB-MODE-CHECKPOINT-COLLECTION*", maybeDefault( $sym72$_CB_MODE_CHECKPOINT_COLLECTION_, $cb_mode_checkpoint_collection$, $const73$Cyc_BasedProject ) );
    $oe_patch_messages_enabledP$ = SubLFiles.deflexical( "*OE-PATCH-MESSAGES-ENABLED?*", ( maybeDefault( $sym74$_OE_PATCH_MESSAGES_ENABLED__, $oe_patch_messages_enabledP$, NIL ) ) );
    $default_oe_patch_message_recipient$ = SubLFiles.deflexical( "*DEFAULT-OE-PATCH-MESSAGE-RECIPIENT*", ( maybeDefault( $sym82$_DEFAULT_OE_PATCH_MESSAGE_RECIPIENT_, $default_oe_patch_message_recipient$, $str83$ ) ) );
    $oe_patch_message_smtp_host$ = SubLFiles.deflexical( "*OE-PATCH-MESSAGE-SMTP-HOST*", ( maybeDefault( $sym84$_OE_PATCH_MESSAGE_SMTP_HOST_, $oe_patch_message_smtp_host$, $str83$ ) ) );
    $cyc_system_doc_agenda_index$ = SubLFiles.defparameter( "*CYC-SYSTEM-DOC-AGENDA-INDEX*", $str159$cyc_agenda );
    $image_purpose$ = SubLFiles.defparameter( "*IMAGE-PURPOSE*", NIL );
    $cb_notify_users_generate_exclusion_mark_from_user_caching_state$ = SubLFiles.deflexical( "*CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER-CACHING-STATE*", NIL );
    $cb_address_titles$ = SubLFiles.deflexical( "*CB-ADDRESS-TITLES*", $list456 );
    return NIL;
  }

  public static SubLObject setup_cb_system_tools_file()
  {
    Hashtables.sethash( $kw2$CB_MODE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str3$cb_mode_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym25$CB_MODE, $kw26$HTML_HANDLER );
    subl_macro_promotions.declare_defglobal( $sym72$_CB_MODE_CHECKPOINT_COLLECTION_ );
    subl_macro_promotions.declare_defglobal( $sym74$_OE_PATCH_MESSAGES_ENABLED__ );
    html_macros.note_cgi_handler_function( $sym77$CB_MODE_HANDLER, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw80$MODE, $sym81$CB_LINK_MODE, ZERO_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym82$_DEFAULT_OE_PATCH_MESSAGE_RECIPIENT_ );
    subl_macro_promotions.declare_defglobal( $sym84$_OE_PATCH_MESSAGE_SMTP_HOST_ );
    Hashtables.sethash( $kw85$DISPLAY_OE_PATCH_MESSAGE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str86$display_oe_patch_message_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym130$CB_HANDLE_OE_PATCH_MESSAGE, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw147$ROLL_CURRENT_KB, $sym148$CB_LINK_ROLL_CURRENT_KB, ONE_INTEGER );
    Hashtables.sethash( $kw149$CB_REMOTE_FILTERS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str150$cb_remote_filters_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym157$CB_ROLL_CURRENT_KB, $kw26$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym158$CB_HANDLE_ROLL_CURRENT_KB, $kw26$HTML_HANDLER );
    Hashtables.sethash( $kw162$CB_AGENDA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str163$cb_agenda_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym186$CB_AGENDA, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw178$AGENDA, $sym189$CB_LINK_AGENDA, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym191$CB_ABORT_AGENDA, $kw26$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym206$CB_TOGGLE_AGENDA_STATUS, $kw26$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym231$CB_AGENDA_ERROR_MODE_HANDLER, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw216$AGENDA_ERROR_FILE, $sym241$CB_LINK_AGENDA_ERROR_FILE, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym243$CB_AGENDA_ERROR_FILE_VIEWER, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw245$SYSTEM1, $sym246$CB_LINK_SYSTEM1, ONE_INTEGER );
    cb_utilities.setup_cb_link_method( $kw248$SYSTEM, $sym249$CB_LINK_SYSTEM, ZERO_INTEGER );
    Hashtables.sethash( $kw250$CB_SYSTEM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str251$cb_system_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym259$CB_SYSTEM, $kw26$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym272$CB_WRITE_IMAGE_HANDLER, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw299$READ_TRANS, $sym312$CB_LINK_READ_TRANS, ZERO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw37$WRITE_TRANS, $sym314$CB_LINK_WRITE_TRANS, ZERO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw316$VIEW_TRANSCRIPT, $sym317$CB_LINK_VIEW_TRANSCRIPT, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym322$CB_SYSTEM_READY_TRANSCRIPT_FILE, $kw26$HTML_HANDLER );
    Hashtables.sethash( $kw325$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str326$cb_system_show_specific_transcrip, NIL ) );
    Hashtables.sethash( $kw334$CB_CHOOSE_PROJECT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str335$cb_choose_project_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym342$CB_CHOOSE_PROJECT, $kw26$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym347$CB_CHOOSE_PROJECT_HANDLER, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw350$CHOOSE_PROJECT, $sym351$CB_LINK_CHOOSE_PROJECT, ONE_INTEGER );
    Hashtables.sethash( $kw357$CB_LOGIN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str358$cb_login_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym386$CB_LOGIN, $kw26$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym390$CB_FORCE_LOGOUT, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw380$FORCE_LOGOUT, $sym393$CB_LINK_FORCE_LOGOUT, TWO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw385$NOTIFY_ALL_USERS, $sym400$CB_LINK_NOTIFY_ALL_USERS, ZERO_INTEGER );
    html_macros.note_cgi_handler_function( $sym414$CB_NOTIFY_ALL_USERS, $kw26$HTML_HANDLER );
    memoization_state.note_globally_cached_function( $sym418$CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER );
    html_macros.note_cgi_handler_function( $sym434$CB_SEND_EMAIL_TO_SELECTED_USERS, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw437$LOGIN, $sym438$CB_LINK_LOGIN, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym440$CB_LOGIN_HANDLER, $kw26$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym477$CB_CREATE_NEW_CYCLIST, $kw26$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym482$CB_LOGOUT, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw365$LOGOUT, $sym485$CB_LINK_LOGOUT, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym497$CB_SET_PASSWORD, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw500$SET_PASSWORD, $sym501$CB_LINK_SET_PASSWORD, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw500$SET_PASSWORD, $str502$Set_Password, $str503$Passwd, $str504$Set_passwords_for_Cyclist_Authent );
    html_macros.note_cgi_handler_function( $sym509$CB_SET_PASSWORD_HANDLER, $kw26$HTML_HANDLER );
    Hashtables.sethash( $kw510$CB_CONFIRM_HALT_CYC, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str511$cb_confirm_halt_cyc_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym516$CB_CONFIRM_HALT_CYC, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw255$CONFIRM_HALT_CYC, $sym519$CB_LINK_CONFIRM_HALT_CYC, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym526$CB_HALT_CYC, $kw26$HTML_HANDLER );
    Hashtables.sethash( $kw536$CB_TRANSCRIPT_VIEWER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str537$cb_transcript_viewer_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym552$CB_TRANSCRIPT_VIEWER, $kw26$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym553$CB_TRANSCRIPT_VIEWER_HANDLER, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw543$ALL_LOCAL_TRANS, $sym563$CB_LINK_ALL_LOCAL_TRANS, ZERO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw565$VIEWER, $sym566$CB_LINK_VIEWER, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw565$VIEWER, $str567$Transcript_Viewer, $str568$View, $str569$View_Local_Transcripts );
    Hashtables.sethash( $kw570$CB_SHOW_LOCAL_OPS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str571$cb_show_local_ops_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym581$CB_SHOW_LOCAL_OPS, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw233$SHOW_LOCAL_OPS, $sym584$CB_LINK_SHOW_LOCAL_OPS, ONE_INTEGER );
    Hashtables.sethash( $kw585$CB_CONFIRM_CLEAR_LOCAL_QUEUE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str586$cb_confirm_clear_local_queue_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym593$CB_CONFIRM_CLEAR_LOCAL_QUEUE, $kw26$HTML_HANDLER );
    Hashtables.sethash( $kw594$CB_CONFIRM_CLEAR_LOCAL_AND_RESTART, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str595$cb_confirm_clear_local_and_restar, NIL ) );
    html_macros.note_cgi_handler_function( $sym601$CB_CONFIRM_CLEAR_LOCAL_AND_RESTART, $kw26$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw237$DELETE_LOCAL_AND_RESTART, $sym603$CB_LINK_DELETE_LOCAL_AND_RESTART, ONE_INTEGER );
    cb_utilities.setup_cb_link_method( $kw235$DELETE_LOCAL_OPS, $sym604$CB_LINK_DELETE_LOCAL_OPS, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym605$CB_CLEAR_LOCAL_AND_RESTART, $kw26$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym607$CB_CLEAR_LOCAL_QUEUE, $kw26$HTML_HANDLER );
    Hashtables.sethash( $kw608$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str609$cb_system_show_specific_transcrip, NIL ) );
    html_macros.note_cgi_handler_function( $sym622$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, $kw26$HTML_HANDLER );
    Hashtables.sethash( $kw608$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str609$cb_system_show_specific_transcrip, NIL ) );
    html_macros.note_cgi_handler_function( $sym624$CB_SYSTEM_WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, $kw26$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_system_tools_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_system_tools_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_system_tools_file();
  }
  static
  {
    me = new cb_system_tools();
    $cyc_system_doc_comm_mode_index$ = null;
    $cb_mode_checkpoint_collection$ = null;
    $oe_patch_messages_enabledP$ = null;
    $default_oe_patch_message_recipient$ = null;
    $oe_patch_message_smtp_host$ = null;
    $cyc_system_doc_agenda_index$ = null;
    $image_purpose$ = null;
    $cb_notify_users_generate_exclusion_mark_from_user_caching_state$ = null;
    $cb_address_titles$ = null;
    $str0$_Aref_system_html = makeString( "~Aref/system.html" );
    $str1$com_modes = makeString( "com-modes" );
    $kw2$CB_MODE = makeKeyword( "CB-MODE" );
    $str3$cb_mode_html = makeString( "cb-mode.html" );
    $str4$Cyc_communication_status_changing = makeString( "Cyc communication status changing facilities" );
    $str5$Communication_Status_Area = makeString( "Communication Status Area" );
    $str6$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str7$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw8$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw9$CB_CYC = makeKeyword( "CB-CYC" );
    $kw10$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw11$SHA1 = makeKeyword( "SHA1" );
    $str12$yui_skin_sam = makeString( "yui-skin-sam" );
    $str13$reloadFrameButton = makeString( "reloadFrameButton" );
    $str14$button = makeString( "button" );
    $str15$reload = makeString( "reload" );
    $str16$Refresh_Frames = makeString( "Refresh Frames" );
    $str17$message = makeString( "message" );
    $kw18$RED = makeKeyword( "RED" );
    $str19$post = makeString( "post" );
    $str20$cb_mode_handler = makeString( "cb-mode-handler" );
    $str21$Current_Value = makeString( "Current Value" );
    $str22$Submit = makeString( "Submit" );
    $str23$You_can_not_change_your_transmitt = makeString( "You can not change your transmitting status until you empty " );
    $str24$your_local_transcript_by_either_s = makeString( "your local transcript by either sending or clearing it" );
    $sym25$CB_MODE = makeSymbol( "CB-MODE" );
    $kw26$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str27$What_Do_You_Want_To_Do_With_Proce = makeString( "What Do You Want To Do With Processed Operations?" );
    $kw28$CENTER = makeKeyword( "CENTER" );
    $str29$transmit_mode = makeString( "transmit-mode" );
    $str30$transmit = makeString( "transmit" );
    $kw31$LEFT = makeKeyword( "LEFT" );
    $kw32$TOP = makeKeyword( "TOP" );
    $str33$Send_Immediately_To_Everybody = makeString( "Send Immediately To Everybody" );
    $str34$transmit_and_store = makeString( "transmit and store" );
    $str35$____and_Record_Locally = makeString( "... and Record Locally" );
    $str36$to_ = makeString( "to:" );
    $kw37$WRITE_TRANS = makeKeyword( "WRITE-TRANS" );
    $str38$transmit_and_store_rolled = makeString( "transmit and store rolled" );
    $str39$____and_Record_Locally_to_a_New_T = makeString( "... and Record Locally to a New Transcript" );
    $str40$store = makeString( "store" );
    $str41$Store_For_Later = makeString( "Store For Later" );
    $str42$none = makeString( "none" );
    $str43$Do_Not_Record = makeString( "Do Not Record" );
    $str44$Send_KB_Check_Point_for__ = makeString( "Send KB Check Point for: " );
    $str45$kb_checkpoint_to_send = makeString( "kb_checkpoint_to_send" );
    $str46$Currently__you_are_not_allowed_to = makeString( "Currently, you are not allowed to send operations, most likely because you are not in the current KB." );
    $str47$Try_receiving_operations_if_you_w = makeString( "Try receiving operations if you wish to send." );
    $str48$You_have_ = makeString( "You have " );
    $kw49$MAIN = makeKeyword( "MAIN" );
    $str50$cb_system_ready_transcript_file_w = makeString( "cb-system-ready-transcript-file&write" );
    $str51$_operations = makeString( " operations" );
    $str52$_stored_ = makeString( " stored." );
    $str53$send = makeString( "send" );
    $str54$Send_Stored_Operations_Now = makeString( "Send Stored Operations Now" );
    $str55$clear = makeString( "clear" );
    $str56$Clear_Stored_Operations = makeString( "Clear Stored Operations" );
    $str57$Note_ = makeString( "Note:" );
    $str58$_All_of_the_above_options_will_st = makeString( " All of the above options will start a new local transcript" );
    $str59$You_still_have_ = makeString( "You still have " );
    $str60$_unprocessed_operations_on_your_l = makeString( " unprocessed operations on your local queue.  You can not change your transmitting status until the queue has been processed." );
    $str61$Do_You_Want_To_Receive_Operations = makeString( "Do You Want To Receive Operations From Others?" );
    $kw62$RIGHT = makeKeyword( "RIGHT" );
    $str63$receive_mode = makeString( "receive-mode" );
    $str64$no = makeString( "no" );
    $str65$No = makeString( "No" );
    $str66$yes = makeString( "yes" );
    $str67$Yes = makeString( "Yes" );
    $str68$kb_checkpoint_ = makeString( "kb_checkpoint?" );
    $str69$Receive_only_up_to_KB_Check_Point = makeString( "Receive only up to KB Check Point :" );
    $str70$kb_checkpoint = makeString( "kb_checkpoint" );
    $kw71$USE_CURRENT_CHECK_POINT = makeKeyword( "USE-CURRENT-CHECK-POINT" );
    $sym72$_CB_MODE_CHECKPOINT_COLLECTION_ = makeSymbol( "*CB-MODE-CHECKPOINT-COLLECTION*" );
    $const73$Cyc_BasedProject = constant_handles.reader_make_constant_shell( makeString( "Cyc-BasedProject" ) );
    $sym74$_OE_PATCH_MESSAGES_ENABLED__ = makeSymbol( "*OE-PATCH-MESSAGES-ENABLED?*" );
    $str75$filters_ = makeString( "filters?" );
    $str76$SENT = makeString( "SENT" );
    $sym77$CB_MODE_HANDLER = makeSymbol( "CB-MODE-HANDLER" );
    $str78$cb_mode = makeString( "cb-mode" );
    $str79$Comm_ = makeString( "Comm:" );
    $kw80$MODE = makeKeyword( "MODE" );
    $sym81$CB_LINK_MODE = makeSymbol( "CB-LINK-MODE" );
    $sym82$_DEFAULT_OE_PATCH_MESSAGE_RECIPIENT_ = makeSymbol( "*DEFAULT-OE-PATCH-MESSAGE-RECIPIENT*" );
    $str83$ = makeString( "" );
    $sym84$_OE_PATCH_MESSAGE_SMTP_HOST_ = makeSymbol( "*OE-PATCH-MESSAGE-SMTP-HOST*" );
    $kw85$DISPLAY_OE_PATCH_MESSAGE = makeKeyword( "DISPLAY-OE-PATCH-MESSAGE" );
    $str86$display_oe_patch_message_html = makeString( "display-oe-patch-message.html" );
    $str87$notes = makeString( "notes" );
    $str88$builder = makeString( "builder" );
    $str89$OE_Patch_Message = makeString( "OE Patch Message" );
    $str90$cb_handle_oe_patch_message = makeString( "cb-handle-oe-patch-message" );
    $str91$window_open__ = makeString( "window.open('" );
    $str92$__ = makeString( "'," );
    $str93$__A_ = makeString( "'~A'" );
    $str94$null = makeString( "null" );
    $str95$___A____ = makeString( ",'~A'); " );
    $str96$return_false_ = makeString( "return false;" );
    $str97$Enter_a_short_description_to_go_i = makeString(
        "Enter a short description to go in the subject of the email message, and a longer description in the \"Patch Message\" if warranted.  To not send a message at all, remove all email addresses from the \"To\" line.   " );
    $str98$To__ = makeString( "To: " );
    $str99$to = makeString( "to" );
    $int100$80 = makeInteger( 80 );
    $str101$Short_Description__ = makeString( "Short Description: " );
    $str102$subj = makeString( "subj" );
    $str103$Patch_Message__ = makeString( "Patch Message: " );
    $int104$100 = makeInteger( 100 );
    $str105$virtual = makeString( "virtual" );
    $str106$send_message_ = makeString( "send-message?" );
    $str107$Transmit_and_Send_Patch_Message = makeString( "Transmit and Send Patch Message" );
    $str108$_ = makeString( " " );
    $str109$Transmit_without_Patch_Message = makeString( "Transmit without Patch Message" );
    $str110$OE_Patch__kb_ = makeString( "OE Patch (kb=" );
    $str111$___ = makeString( "): " );
    $int112$1000 = makeInteger( 1000 );
    $list113 = ConsesLow.list( makeSymbol( "OPERATION-COUNT" ), makeSymbol( "TRANSCRIPT-CREATE-LIST" ), makeSymbol( "TRANSCRIPT-RENAME-LIST" ), makeSymbol( "TRANSCRIPT-KILL-LIST" ) );
    $str114$_A = makeString( "~A" );
    $str115$Submitted = makeString( "Submitted" );
    $str116$Transmitted = makeString( "Transmitted" );
    $str117$_from_KB___A____ = makeString( " from KB: ~A~%~%" );
    $str118$Patch_Description_____ = makeString( "Patch Description:~%~%" );
    $str119$_S__ = makeString( "~S~%" );
    $str120$__Transcript___A__ = makeString( "~%Transcript: ~A~%" );
    $str121$Total_Operations___A__ = makeString( "Total Operations: ~A~%" );
    $str122$__Killed_Constants____ = makeString( "~%Killed Constants: ~%" );
    $list123 = ConsesLow.list( makeSymbol( "OP-NUM" ), makeSymbol( "EXTERNAL-ID" ), makeSymbol( "NAME" ), makeSymbol( "WHO" ), makeSymbol( "WHEN" ) );
    $str124$_A__ = makeString( "~A~%" );
    $str125$_and__A_more___ = makeString( "[and ~A more]~%" );
    $str126$__Renames____ = makeString( "~%Renames: ~%" );
    $list127 = ConsesLow.list( makeSymbol( "OP-NUM" ), makeSymbol( "EXTERNAL-ID" ), makeSymbol( "OLD-NAME" ), makeSymbol( "NEW-NAME" ), makeSymbol( "WHO" ), makeSymbol( "WHEN" ) );
    $str128$_A_____A__ = makeString( "~A -> ~A~%" );
    $str129$__New_Constants____ = makeString( "~%New Constants: ~%" );
    $sym130$CB_HANDLE_OE_PATCH_MESSAGE = makeSymbol( "CB-HANDLE-OE-PATCH-MESSAGE" );
    $str131$Mail_not_sent_due_to_invalid_from = makeString( "Mail not sent due to invalid from (" );
    $str132$__or_to__ = makeString( ") or to (" );
    $str133$__address = makeString( ") address" );
    $str134$sent = makeString( "sent" );
    $str135$submitted = makeString( "submitted" );
    $str136$Transcript_ = makeString( "Transcript " );
    $str137$__but_no_mail_sent_ = makeString( ", but no mail sent." );
    $str138$__but_mail_message_encountered_er = makeString( ", but mail message encountered error: " );
    $int139$5000 = makeInteger( 5000 );
    $str140$_________________________ = makeString( "~%---------------------~%" );
    $str141$Transcript_as_KE_Text___ = makeString( "Transcript as KE Text ~%" );
    $str142$___and__A_more_operations___ = makeString( ";;[and ~A more operations]~%" );
    $str143$_Roll_to_KB_ = makeString( "[Roll to KB " );
    $str144$_ = makeString( "]" );
    $kw145$SELF = makeKeyword( "SELF" );
    $str146$cb_roll_current_kb = makeString( "cb-roll-current-kb" );
    $kw147$ROLL_CURRENT_KB = makeKeyword( "ROLL-CURRENT-KB" );
    $sym148$CB_LINK_ROLL_CURRENT_KB = makeSymbol( "CB-LINK-ROLL-CURRENT-KB" );
    $kw149$CB_REMOTE_FILTERS = makeKeyword( "CB-REMOTE-FILTERS" );
    $str150$cb_remote_filters_html = makeString( "cb-remote-filters.html" );
    $str151$Rolling_the_KB = makeString( "Rolling the KB" );
    $str152$Roll_to_KB_ = makeString( "Roll to KB " );
    $str153$cb_handle_roll_current_kb = makeString( "cb-handle-roll-current-kb" );
    $str154$WARNING_ = makeString( "WARNING:" );
    $str155$Rolling_the_KB_is_will_filter_eve = makeString( "Rolling the KB is will filter every operation until the start of the next KB." );
    $str156$Do_you_still_want_to_roll_to_KB__ = makeString( "Do you still want to roll to KB ~S ?" );
    $sym157$CB_ROLL_CURRENT_KB = makeSymbol( "CB-ROLL-CURRENT-KB" );
    $sym158$CB_HANDLE_ROLL_CURRENT_KB = makeSymbol( "CB-HANDLE-ROLL-CURRENT-KB" );
    $str159$cyc_agenda = makeString( "cyc-agenda" );
    $str160$Agenda_halted_due_to_ = makeString( "Agenda halted due to:" );
    $int161$32768 = makeInteger( 32768 );
    $kw162$CB_AGENDA = makeKeyword( "CB-AGENDA" );
    $str163$cb_agenda_html = makeString( "cb-agenda.html" );
    $str164$The_Cyc_Agenda_Control_Facilities = makeString( "The Cyc Agenda Control Facilities" );
    $str165$Agenda_Process_Control = makeString( "Agenda Process Control" );
    $str166$cb_abort_agenda = makeString( "cb-abort-agenda" );
    $str167$Here_you_control_the_turning_on_a = makeString( "Here you control the turning on and off of your Cyc Agenda." );
    $str168$Currently__your_Agenda_is_ = makeString( "Currently, your Agenda is " );
    $str169$running = makeString( "running" );
    $str170$halted = makeString( "halted" );
    $str171$_ = makeString( "." );
    $kw172$HALT = makeKeyword( "HALT" );
    $str173$Run = makeString( "Run" );
    $str174$Current = makeString( "Current" );
    $str175$Last = makeString( "Last" );
    $str176$_Agenda_operation_ = makeString( " Agenda operation:" );
    $str177$Abort_Operation = makeString( "Abort Operation" );
    $kw178$AGENDA = makeKeyword( "AGENDA" );
    $str179$_Refresh_ = makeString( "[Refresh]" );
    $str180$50_ = makeString( "50%" );
    $str181$Propagating_Assertion_ = makeString( "Propagating Assertion:" );
    $str182$_A_direct_ = makeString( "~A direct " );
    $str183$and__A_indirect_ = makeString( "and ~A indirect " );
    $kw184$ASSERTION_DEPENDENCIES = makeKeyword( "ASSERTION-DEPENDENCIES" );
    $str185$dependencies = makeString( "dependencies" );
    $sym186$CB_AGENDA = makeSymbol( "CB-AGENDA" );
    $str187$Agenda_ = makeString( "Agenda:" );
    $str188$cb_agenda = makeString( "cb-agenda" );
    $sym189$CB_LINK_AGENDA = makeSymbol( "CB-LINK-AGENDA" );
    $str190$The_agenda_is_no_longer_running_ = makeString( "The agenda is no longer running." );
    $sym191$CB_ABORT_AGENDA = makeSymbol( "CB-ABORT-AGENDA" );
    $str192$cb_toggle_agenda_status = makeString( "cb-toggle-agenda-status" );
    $str193$Click_the_button_to_change_your_A = makeString( "Click the button to change your Agenda status:" );
    $str194$Halt_Agenda = makeString( "Halt Agenda" );
    $str195$Start_Agenda = makeString( "Start Agenda" );
    $str196$__For_detailed_help_on_the_Cyc_ag = makeString( "--For detailed help on the Cyc agenda, read the " );
    $str197$_A__A = makeString( "~A#~A" );
    $str198$Cyc_Agenda_Documentation = makeString( "Cyc Agenda Documentation" );
    $str199$Agenda_Process_Changed = makeString( "Agenda Process Changed" );
    $str200$Halting_the_Agenda____ = makeString( "Halting the Agenda ..." );
    $str201$Starting_the_Agenda____ = makeString( "Starting the Agenda ..." );
    $str202$Your_Cyc_Agenda_is_now_ = makeString( "Your Cyc Agenda is now " );
    $str203$Your_Cyc_Agenda_is_still_ = makeString( "Your Cyc Agenda is still " );
    $str204$When_it_finishes_its_current_oper = makeString( "When it finishes its current operation, its state will change as you requested." );
    $str205$Agenda = makeString( "Agenda" );
    $sym206$CB_TOGGLE_AGENDA_STATUS = makeSymbol( "CB-TOGGLE-AGENDA-STATUS" );
    $str207$cb_agenda_error_mode_handler = makeString( "cb-agenda-error-mode-handler" );
    $str208$Currently__when_Cyc_encounters_an = makeString( "Currently, when Cyc encounters an error with local operations within the Agenda it:" );
    $kw209$IGNORE = makeKeyword( "IGNORE" );
    $str210$Continues__ignoring_the_error_ = makeString( "Continues, ignoring the error." );
    $str211$Halts_the_Agenda_and_displays_the = makeString( "Halts the Agenda and displays the reasons." );
    $kw212$DEBUG = makeKeyword( "DEBUG" );
    $str213$Enters_the_debugger_ = makeString( "Enters the debugger." );
    $kw214$LOG = makeKeyword( "LOG" );
    $str215$Logs_the_error_and_continues_ = makeString( "Logs the error and continues." );
    $kw216$AGENDA_ERROR_FILE = makeKeyword( "AGENDA-ERROR-FILE" );
    $str217$Illegal_state_in_cb_agenda_error_ = makeString( "Illegal state in cb-agenda-error-mode-display." );
    $str218$Choose_the_new_error_handling_mod = makeString( "Choose the new error handling mode below and select [" );
    $str219$Submit_New_Mode = makeString( "Submit New Mode" );
    $str220$__to_initiate_the_change_ = makeString( "] to initiate the change:" );
    $str221$agenda_error_state = makeString( "agenda-error-state" );
    $str222$_ignore = makeString( ":ignore" );
    $str223$Ignore_and_Continue = makeString( "Ignore and Continue" );
    $str224$_halt = makeString( ":halt" );
    $str225$Halt_and_Display_Reason = makeString( "Halt and Display Reason" );
    $str226$_log = makeString( ":log" );
    $str227$Log_Errors_to_File = makeString( "Log Errors to File" );
    $str228$pathname = makeString( "pathname" );
    $int229$60 = makeInteger( 60 );
    $str230$Current_Mode = makeString( "Current Mode" );
    $sym231$CB_AGENDA_ERROR_MODE_HANDLER = makeSymbol( "CB-AGENDA-ERROR-MODE-HANDLER" );
    $str232$_operations_waiting_in_your_local = makeString( " operations waiting in your local queue." );
    $kw233$SHOW_LOCAL_OPS = makeKeyword( "SHOW-LOCAL-OPS" );
    $str234$Look_at_the_operations_in_the_loc = makeString( "Look at the operations in the local queue." );
    $kw235$DELETE_LOCAL_OPS = makeKeyword( "DELETE-LOCAL-OPS" );
    $str236$Delete_the_local_queue_ = makeString( "Delete the local queue." );
    $kw237$DELETE_LOCAL_AND_RESTART = makeKeyword( "DELETE-LOCAL-AND-RESTART" );
    $str238$Delete_the_local_queue_and_restar = makeString( "Delete the local queue and restart agenda." );
    $str239$cb_agenda_error_file_viewer = makeString( "cb-agenda-error-file-viewer" );
    $str240$Agenda_Error_File___A = makeString( "Agenda Error File: ~A" );
    $sym241$CB_LINK_AGENDA_ERROR_FILE = makeSymbol( "CB-LINK-AGENDA-ERROR-FILE" );
    $str242$Agenda_log_file_empty___S = makeString( "Agenda log file empty: ~S" );
    $sym243$CB_AGENDA_ERROR_FILE_VIEWER = makeSymbol( "CB-AGENDA-ERROR-FILE-VIEWER" );
    $str244$cb_system = makeString( "cb-system" );
    $kw245$SYSTEM1 = makeKeyword( "SYSTEM1" );
    $sym246$CB_LINK_SYSTEM1 = makeSymbol( "CB-LINK-SYSTEM1" );
    $str247$System_ = makeString( "System:" );
    $kw248$SYSTEM = makeKeyword( "SYSTEM" );
    $sym249$CB_LINK_SYSTEM = makeSymbol( "CB-LINK-SYSTEM" );
    $kw250$CB_SYSTEM = makeKeyword( "CB-SYSTEM" );
    $str251$cb_system_html = makeString( "cb-system.html" );
    $str252$Cyc_System_Area = makeString( "Cyc System Area" );
    $str253$System_Area = makeString( "System Area" );
    $str254$Here_are_your_system_settings_ = makeString( "Here are your system settings:" );
    $kw255$CONFIRM_HALT_CYC = makeKeyword( "CONFIRM-HALT-CYC" );
    $str256$_Halt_this_image_ = makeString( "[Halt this image]" );
    $kw257$PROCESS_INSPECTOR = makeKeyword( "PROCESS-INSPECTOR" );
    $str258$_Process_Inspector_ = makeString( "[Process Inspector]" );
    $sym259$CB_SYSTEM = makeSymbol( "CB-SYSTEM" );
    $str260$cb_write_image_handler = makeString( "cb-write-image-handler" );
    $str261$Write_image_to_file__ = makeString( "Write image to file: " );
    $str262$File_name__ = makeString( "File name: " );
    $str263$file = makeString( "file" );
    $int264$40 = makeInteger( 40 );
    $str265$Write_image = makeString( "Write image" );
    $str266$_Warning__this_may_take_some_time = makeString( " Warning: this may take some time." );
    $str267$Write_Image = makeString( "Write Image" );
    $str268$Please_enter_a_filename_ = makeString( "Please enter a filename." );
    $str269$Writing_to_file__ = makeString( "Writing to file \"" );
    $str270$__ = makeString( "\"." );
    $str271$__Done_ = makeString( "  Done." );
    $sym272$CB_WRITE_IMAGE_HANDLER = makeSymbol( "CB-WRITE-IMAGE-HANDLER" );
    $str273$Machine_name__ = makeString( "Machine name: " );
    $str274$unknown = makeString( "unknown" );
    $str275$SubL_implementation__ = makeString( "SubL implementation: " );
    $str276$Base_TCP_port__ = makeString( "Base TCP port: " );
    $str277$Image_name__ = makeString( "Image name: " );
    $str278$Image_Process_ID__ = makeString( "Image Process ID: " );
    $str279$Image_start_time_ = makeString( "Image start time:" );
    $str280$__up__A_ = makeString( " (up ~A)" );
    $str281$Cyc_revision_level__ = makeString( "Cyc revision level: " );
    $str282$Cyc_code_version__ = makeString( "Cyc code version: " );
    $str283$Current_KB__ = makeString( "Current KB: " );
    $str284$Queue_Information__ = makeString( "Queue Information: " );
    $str285$Master_Transcript_Operations_Read = makeString( "Master Transcript Operations Read:  " );
    $str286$Master_Transcript_Operations_Read = makeString( "Master Transcript Operations Read but Unprocessed:  " );
    $str287$Master_Transcript_Operations_Proc = makeString( "Master Transcript Operations Processed:  " );
    $str288$Master_Transcript_Operations_Proc = makeString( "Master Transcript Operations Processed but Filtered:  " );
    $str289$Master_Transcript_Operations_Proc = makeString( "Master Transcript Operations Processed and Evaluated:  " );
    $str290$Unprocessed_Local_Queue_Operation = makeString( "Unprocessed Local Queue Operations:  " );
    $str291$Local_Queue_Operations_Processed_ = makeString( "Local Queue Operations Processed But Unrecorded:  " );
    $str292$Current_Local_Transcript_Operatio = makeString( "Current Local Transcript Operations Processed And Recorded:  " );
    $str293$Unprocessed_auxiliary_queue_opera = makeString( "Unprocessed auxiliary queue operations:  " );
    $str294$Transcript_Information_ = makeString( "Transcript Information:" );
    $str295$Master_Transcript___ = makeString( "Master Transcript:  " );
    $str296$Maintained_By_Transcript_Server = makeString( "Maintained By Transcript Server" );
    $str297$___A__A_ = makeString( " (~A:~A)" );
    $str298$Operations___ = makeString( "Operations:  " );
    $kw299$READ_TRANS = makeKeyword( "READ-TRANS" );
    $str300$None = makeString( "None" );
    $str301$Characters___ = makeString( "Characters:  " );
    $str302$Estimated_Ops___ = makeString( "Estimated Ops:  " );
    $str303$Local_Transcript___ = makeString( "Local Transcript:  " );
    $str304$Historical_Information_ = makeString( "Historical Information:" );
    $str305$Remote_Operations_Processed__ = makeString( "Remote Operations Processed: " );
    $str306$Local_Operations_Recorded___ = makeString( "Local Operations Recorded:  " );
    $str307$Local_Operations_Sent_To_Master_T = makeString( "Local Operations Sent To Master Transcript:  " );
    $str308$Auxiliary_Queue_Operations_Proces = makeString( "Auxiliary Queue Operations Processed:  " );
    $str309$read = makeString( "read" );
    $sym310$STRING_EQUAL = makeSymbol( "STRING-EQUAL" );
    $str311$cb_system_ready_transcript_file_r = makeString( "cb-system-ready-transcript-file&read" );
    $sym312$CB_LINK_READ_TRANS = makeSymbol( "CB-LINK-READ-TRANS" );
    $str313$write = makeString( "write" );
    $sym314$CB_LINK_WRITE_TRANS = makeSymbol( "CB-LINK-WRITE-TRANS" );
    $str315$cb_system_ready_transcript_file__ = makeString( "cb-system-ready-transcript-file&~A" );
    $kw316$VIEW_TRANSCRIPT = makeKeyword( "VIEW-TRANSCRIPT" );
    $sym317$CB_LINK_VIEW_TRANSCRIPT = makeSymbol( "CB-LINK-VIEW-TRANSCRIPT" );
    $str318$cb_transcript_viewer_handler_ = makeString( "cb-transcript-viewer-handler&" );
    $str319$stats_ = makeString( "stats:" );
    $str320$_Stats_ = makeString( "[Stats]" );
    $sym321$STRING_ = makeSymbol( "STRING=" );
    $sym322$CB_SYSTEM_READY_TRANSCRIPT_FILE = makeSymbol( "CB-SYSTEM-READY-TRANSCRIPT-FILE" );
    $kw323$INPUT = makeKeyword( "INPUT" );
    $str324$Unable_to_open__S = makeString( "Unable to open ~S" );
    $kw325$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE = makeKeyword( "CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE" );
    $str326$cb_system_show_specific_transcrip = makeString( "cb-system-show-specific-transcript-file.html" );
    $str327$File_Contents__Transcript_File = makeString( "File Contents: Transcript File" );
    $str328$cg_cb_system_show_specific_transc = makeString( "cg?cb-system-show-specific-transcript-file-as-ke-text&transcript-filename=~A" );
    $str329$View_Transcript_in_KE_Text_format = makeString( "View Transcript in KE Text format." );
    $str330$File__ = makeString( "File: " );
    $str331$Operations__ = makeString( "Operations: " );
    $str332$No_operations_have_been_saved_yet = makeString( "No operations have been saved yet in" );
    $str333$_s_is_not_a_pathname_string_ = makeString( "~s is not a pathname string." );
    $kw334$CB_CHOOSE_PROJECT = makeKeyword( "CB-CHOOSE-PROJECT" );
    $str335$cb_choose_project_html = makeString( "cb-choose-project.html" );
    $str336$Choose_KE_Project = makeString( "Choose KE Project" );
    $str337$cb_choose_project_handler = makeString( "cb-choose-project-handler" );
    $str338$Choose_your_project_from_the_opti = makeString( "Choose your project from the options below." );
    $str339$project = makeString( "project" );
    $str340$No_Project_Selected = makeString( "No Project Selected" );
    $str341$Reset = makeString( "Reset" );
    $sym342$CB_CHOOSE_PROJECT = makeSymbol( "CB-CHOOSE-PROJECT" );
    $const343$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const344$OngoingStatus = constant_handles.reader_make_constant_shell( makeString( "OngoingStatus" ) );
    $str345$nil = makeString( "nil" );
    $str346$Project_has_been_changed_ = makeString( "Project has been changed." );
    $sym347$CB_CHOOSE_PROJECT_HANDLER = makeSymbol( "CB-CHOOSE-PROJECT-HANDLER" );
    $str348$Current_Project = makeString( "Current Project" );
    $str349$cb_choose_project = makeString( "cb-choose-project" );
    $kw350$CHOOSE_PROJECT = makeKeyword( "CHOOSE-PROJECT" );
    $sym351$CB_LINK_CHOOSE_PROJECT = makeSymbol( "CB-LINK-CHOOSE-PROJECT" );
    $const352$CycBrowser = constant_handles.reader_make_constant_shell( makeString( "CycBrowser" ) );
    $sym353$_PROJECT = makeSymbol( "?PROJECT" );
    $const354$cyclistPrimaryProject = constant_handles.reader_make_constant_shell( makeString( "cyclistPrimaryProject" ) );
    $list355 = ConsesLow.list( makeSymbol( "?PROJECT" ) );
    $list356 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $kw357$CB_LOGIN = makeKeyword( "CB-LOGIN" );
    $str358$cb_login_html = makeString( "cb-login.html" );
    $str359$new_login_name = makeString( "new_login_name" );
    $str360$Login_Area = makeString( "Login Area" );
    $str361$cb_login_handler = makeString( "cb-login-handler" );
    $str362$This_image_has_been_designated__ = makeString( "This image has been designated: " );
    $str363$You_are_currently_logged_in_as_ = makeString( "You are currently logged in as " );
    $str364$Click_ = makeString( "Click " );
    $kw365$LOGOUT = makeKeyword( "LOGOUT" );
    $str366$here = makeString( "here" );
    $str367$_to_logout_now_ = makeString( " to logout now." );
    $str368$Type_in_your_new_login_name_below = makeString( "Type in your new login name below and press the [" );
    $str369$__button_ = makeString( "] button:" );
    $str370$new_login_hashed_password = makeString( "new_login_hashed_password" );
    $str371$Cyclist = makeString( "Cyclist" );
    $str372$Password = makeString( "Password" );
    $str373$___ = makeString( " : " );
    $str374$The_following_are_currently_logge = makeString( "The following are currently logged in to " );
    $str375$_ = makeString( ":" );
    $str376$User = makeString( "User" );
    $str377$Local_Machine = makeString( "Local Machine" );
    $list378 = ConsesLow.list( makeSymbol( "MACHINE-NAME" ), makeSymbol( "USER-NAME" ) );
    $str379$_Session_id__ = makeString( "(Session id: " );
    $kw380$FORCE_LOGOUT = makeKeyword( "FORCE-LOGOUT" );
    $str381$_Force_Logout_ = makeString( "[Force Logout]" );
    $str382$_ = makeString( ")" );
    $kw383$LARR = makeKeyword( "LARR" );
    $str384$_you = makeString( " you" );
    $kw385$NOTIFY_ALL_USERS = makeKeyword( "NOTIFY-ALL-USERS" );
    $sym386$CB_LOGIN = makeSymbol( "CB-LOGIN" );
    $str387$sessionId = makeString( "sessionId" );
    $kw388$SUCCESS = makeKeyword( "SUCCESS" );
    $kw389$FAILURE = makeKeyword( "FAILURE" );
    $sym390$CB_FORCE_LOGOUT = makeSymbol( "CB-FORCE-LOGOUT" );
    $str391$_a_sessionId__a = makeString( "~a&sessionId=~a" );
    $str392$cb_force_logout = makeString( "cb-force-logout" );
    $sym393$CB_LINK_FORCE_LOGOUT = makeSymbol( "CB-LINK-FORCE-LOGOUT" );
    $str394$Complete = makeString( "Complete" );
    $const395$HumanCyclist = constant_handles.reader_make_constant_shell( makeString( "HumanCyclist" ) );
    $int396$27 = makeInteger( 27 );
    $str397$Clear = makeString( "Clear" );
    $str398$cb_notify_all_users = makeString( "cb-notify-all-users" );
    $str399$Send_Email_to_all_Users = makeString( "Send Email to all Users" );
    $sym400$CB_LINK_NOTIFY_ALL_USERS = makeSymbol( "CB-LINK-NOTIFY-ALL-USERS" );
    $str401$Mail_all_users = makeString( "Mail all users" );
    $str402$Please_enter_the_message_you_wish = makeString( "Please enter the message you wish to send to the following users." );
    $str403$cb_send_email_to_selected_users = makeString( "cb-send-email-to-selected-users" );
    $list404 = ConsesLow.list( makeSymbol( "MACHINE-NAME" ), makeSymbol( "USER" ) );
    $const405$Guest = constant_handles.reader_make_constant_shell( makeString( "Guest" ) );
    $str406$To_ = makeString( "To:" );
    $sym407$SECOND = makeSymbol( "SECOND" );
    $str408$From__ = makeString( "From: " );
    $str409$Subject__ = makeString( "Subject: " );
    $str410$subject = makeString( "subject" );
    $int411$72 = makeInteger( 72 );
    $str412$Message__ = makeString( "Message: " );
    $str413$Send_Email = makeString( "Send Email" );
    $sym414$CB_NOTIFY_ALL_USERS = makeSymbol( "CB-NOTIFY-ALL-USERS" );
    $str415$exclude = makeString( "exclude" );
    $str416$Email_Address = makeString( "Email Address" );
    $str417$Exclude_ = makeString( "Exclude?" );
    $sym418$CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER = makeSymbol( "CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER" );
    $str419$exclude_ = makeString( "exclude_" );
    $sym420$_CB_NOTIFY_USERS_GENERATE_EXCLUSION_MARK_FROM_USER_CACHING_STATE_ = makeSymbol( "*CB-NOTIFY-USERS-GENERATE-EXCLUSION-MARK-FROM-USER-CACHING-STATE*" );
    $kw421$ADDRESS = makeKeyword( "ADDRESS" );
    $const422$preferredEMailAddressText = constant_handles.reader_make_constant_shell( makeString( "preferredEMailAddressText" ) );
    $list423 = ConsesLow.list( makeKeyword( "ADDRESS" ) );
    $const424$CyclistsMt = constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) );
    $str425$Sending_Message = makeString( "Sending Message" );
    $str426$Sending_message_with_following_co = makeString( "Sending message with following content:" );
    $str427$Subject = makeString( "Subject" );
    $str428$Message_ = makeString( "Message:" );
    $str429$Sending_Log = makeString( "Sending Log" );
    $list430 = ConsesLow.list( makeSymbol( "MACHINE" ), makeSymbol( "USER" ) );
    $str431$Excluding_user_ = makeString( "Excluding user " );
    $str432$Sent_message_to_ = makeString( "Sent message to " );
    $str433$Error_on_sending_message_to_ = makeString( "Error on sending message to " );
    $sym434$CB_SEND_EMAIL_TO_SELECTED_USERS = makeSymbol( "CB-SEND-EMAIL-TO-SELECTED-USERS" );
    $str435$Login_ = makeString( "Login:" );
    $str436$cb_login = makeString( "cb-login" );
    $kw437$LOGIN = makeKeyword( "LOGIN" );
    $sym438$CB_LINK_LOGIN = makeSymbol( "CB-LINK-LOGIN" );
    $sym439$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $sym440$CB_LOGIN_HANDLER = makeSymbol( "CB-LOGIN-HANDLER" );
    $sym441$HUMAN_CYCLIST_ = makeSymbol( "HUMAN-CYCLIST?" );
    $str442$redirect_handler = makeString( "redirect-handler" );
    $sym443$FIRST_LIST = makeSymbol( "FIRST-LIST" );
    $str444$Known_Constant = makeString( "Known Constant" );
    $str445$The_name_you_typed_in__ = makeString( "The name you typed in, " );
    $str446$_is_already_used_in_the_Knowledge = makeString( " is already used in the Knowledge Base as a Cyc constant." );
    $str447$Please_go_back_and_try_a_differen = makeString( "Please go back and try a different login name." );
    $str448$Successful_Login = makeString( "Successful Login" );
    $str449$Welcome__ = makeString( "Welcome, " );
    $str450$_ = makeString( "!" );
    $str451$Your_project_has_been_set_to_ = makeString( "Your project has been set to " );
    $str452$Change_Project = makeString( "Change Project" );
    $str453$Your_project_is_currently_not_set = makeString( "Your project is currently not set." );
    $str454$Choose_Project = makeString( "Choose Project" );
    $str455$Login = makeString( "Login" );
    $list456 = ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "Dr" ) ), makeString( "Dr." ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
        "Reverend-Title" ) ), makeString( "Rev." ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "Prof" ) ), makeString( "Prof." ) ), ConsesLow.cons( constant_handles
            .reader_make_constant_shell( makeString( "President-Title" ) ), makeString( "President" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "Sir" ) ), makeString( "Sir" ) ),
        ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "Major-Title" ) ), makeString( "Maj." ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "Lieutenant-Title" ) ),
            makeString( "Lt." ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "LieutenantColonel-Title" ) ), makeString( "Ltc." ) ) );
    $sym457$_TITLE = makeSymbol( "?TITLE" );
    $const458$titleOfPerson = constant_handles.reader_make_constant_shell( makeString( "titleOfPerson" ) );
    $list459 = ConsesLow.list( makeSymbol( "?TITLE" ) );
    $const460$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $list461 = ConsesLow.cons( makeSymbol( "KNOWN-TITLE" ), makeSymbol( "PREFIX-STRING" ) );
    $const462$Sir = constant_handles.reader_make_constant_shell( makeString( "Sir" ) );
    $const463$givenNames = constant_handles.reader_make_constant_shell( makeString( "givenNames" ) );
    $const464$familyName = constant_handles.reader_make_constant_shell( makeString( "familyName" ) );
    $kw465$NONE = makeKeyword( "NONE" );
    $list466 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "givenNames" ) ) );
    $str467$Unknown_Cyclist = makeString( "Unknown Cyclist" );
    $str468$cb_create_new_cyclist = makeString( "cb-create-new-cyclist" );
    $str469$The_name_ = makeString( "The name " );
    $str470$_is_not_the_name_of_a_known_ = makeString( " is not the name of a known " );
    $str471$Do_you_want_to_create_a_new_Cyc_c = makeString(
        "Do you want to create a new Cyc constant with this name?  You will be able to use this constant as you would any other in the Knowledge Base as well as login with this new name." );
    $str472$Yes__Create_Cyclist = makeString( "Yes, Create Cyclist" );
    $str473$creating_new_cyclists = makeString( "creating new cyclists" );
    $const474$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list475 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HumanCyclist" ) ) );
    $str476$Unable_to_create_a_new_cyclist__w = makeString( "Unable to create a new cyclist (why?" );
    $sym477$CB_CREATE_NEW_CYCLIST = makeSymbol( "CB-CREATE-NEW-CYCLIST" );
    $str478$Logout = makeString( "Logout" );
    $str479$You_have_now_logged_out_from_this = makeString( "You have now logged out from this Cyc image.  Goodbye!" );
    $kw480$START = makeKeyword( "START" );
    $str481$_to_reconnect_to_Cyc_ = makeString( " to reconnect to Cyc." );
    $sym482$CB_LOGOUT = makeSymbol( "CB-LOGOUT" );
    $str483$_Logout_ = makeString( "[Logout]" );
    $str484$cb_logout = makeString( "cb-logout" );
    $sym485$CB_LINK_LOGOUT = makeSymbol( "CB-LINK-LOGOUT" );
    $str486$problem = makeString( "problem" );
    $str487$user_login = makeString( "user_login" );
    $str488$Specify_Cyc_Browser_Password = makeString( "Specify Cyc Browser Password" );
    $str489$80_ = makeString( "80%" );
    $str490$Error_ = makeString( "Error!" );
    $str491$Could_not_set_password_for_ = makeString( "Could not set password for " );
    $str492$Reason_ = makeString( "Reason:" );
    $str493$Please_specify_a_new_password_for = makeString( "Please specify a new password for a cyclist." );
    $str494$_Note__Only_you_can_reset_your_ow = makeString( "(Note: Only you can reset your own password.)" );
    $str495$cb_set_password_handler = makeString( "cb-set-password-handler" );
    $str496$New_Password = makeString( "New Password" );
    $sym497$CB_SET_PASSWORD = makeSymbol( "CB-SET-PASSWORD" );
    $str498$_Set_Password_ = makeString( "[Set Password]" );
    $str499$cb_set_password = makeString( "cb-set-password" );
    $kw500$SET_PASSWORD = makeKeyword( "SET-PASSWORD" );
    $sym501$CB_LINK_SET_PASSWORD = makeSymbol( "CB-LINK-SET-PASSWORD" );
    $str502$Set_Password = makeString( "Set Password" );
    $str503$Passwd = makeString( "Passwd" );
    $str504$Set_passwords_for_Cyclist_Authent = makeString( "Set passwords for Cyclist Authentication" );
    $str505$Please_fill_in_all_fields_ = makeString( "Please fill in all fields." );
    $str506$No_known_cyclist_by_this_name_ = makeString( "No known cyclist by this name." );
    $str507$The_name_could_mean_any_of_follow = makeString( "The name could mean any of following cyclists: " );
    $list508 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "encryptedPasswordForUser" ) ) );
    $sym509$CB_SET_PASSWORD_HANDLER = makeSymbol( "CB-SET-PASSWORD-HANDLER" );
    $kw510$CB_CONFIRM_HALT_CYC = makeKeyword( "CB-CONFIRM-HALT-CYC" );
    $str511$cb_confirm_halt_cyc_html = makeString( "cb-confirm-halt-cyc.html" );
    $str512$the_Halt_Cyc_Image = makeString( "the Halt Cyc Image" );
    $str513$Halt_Cyc_Image = makeString( "Halt Cyc Image" );
    $str514$cb_halt_cyc = makeString( "cb-halt-cyc" );
    $str515$halt = makeString( "halt" );
    $sym516$CB_CONFIRM_HALT_CYC = makeSymbol( "CB-CONFIRM-HALT-CYC" );
    $str517$_Halt_Cyc_ = makeString( "[Halt Cyc]" );
    $str518$cb_confirm_halt_cyc = makeString( "cb-confirm-halt-cyc" );
    $sym519$CB_LINK_CONFIRM_HALT_CYC = makeSymbol( "CB-LINK-CONFIRM-HALT-CYC" );
    $str520$Halt_Image_Not_Allowed = makeString( "Halt Image Not Allowed" );
    $str521$Sorry__this_image_cannot_be_halte = makeString( "Sorry, this image cannot be halted through the Cyc Browser." );
    $str522$Cyc_Image_Halted = makeString( "Cyc Image Halted" );
    $str523$This_Cyc_image_will_be_halted___G = makeString( "This Cyc image will be halted.  Goodbye!" );
    $str524$Halted_by_ = makeString( "Halted by " );
    $str525$_Via_HTML_interface = makeString( " Via HTML interface" );
    $sym526$CB_HALT_CYC = makeSymbol( "CB-HALT-CYC" );
    $str527$This_will_ = makeString( "This will " );
    $str528$_the_Cyc_image_ = makeString( " the Cyc image " );
    $str529$red = makeString( "red" );
    $str530$Warning__ = makeString( "Warning: " );
    $str531$There_are__A_operations_waiting_i = makeString( "There are ~A operations waiting in the transmit queue.  If you " );
    $str532$_now__they_will_be_lost_ = makeString( " now, they will be lost." );
    $str533$Do_you_really_want_to_do_this_ = makeString( "Do you really want to do this?" );
    $str534$Yes__ = makeString( "Yes, " );
    $str535$_system = makeString( " system" );
    $kw536$CB_TRANSCRIPT_VIEWER = makeKeyword( "CB-TRANSCRIPT-VIEWER" );
    $str537$cb_transcript_viewer_html = makeString( "cb-transcript-viewer.html" );
    $str538$show_stats = makeString( "show-stats" );
    $str539$transcript_filename = makeString( "transcript_filename" );
    $str540$Please_type_in_a_filename_ = makeString( "Please type in a filename." );
    $str541$Transcript_Viewing_Area = makeString( "Transcript Viewing Area" );
    $str542$cb_transcript_viewer_handler = makeString( "cb-transcript-viewer-handler" );
    $kw543$ALL_LOCAL_TRANS = makeKeyword( "ALL-LOCAL-TRANS" );
    $str544$cg_cb_transcript_viewer = makeString( "cg?cb-transcript-viewer" );
    $kw545$GET = makeKeyword( "GET" );
    $str546$cb_transcript_viewer = makeString( "cb-transcript-viewer" );
    $str547$View_other_transcript_ = makeString( "View other transcript:" );
    $str548$Please_type_in_the_full_path_to_t = makeString( "Please type in the full path to the transcript: (e.g. /cyc/top/transcripts/[kb#]/[transcript_name])" );
    $str549$ERROR__ = makeString( "ERROR: " );
    $str550$Stats = makeString( "Stats" );
    $str551$View_Transcript = makeString( "View Transcript" );
    $sym552$CB_TRANSCRIPT_VIEWER = makeSymbol( "CB-TRANSCRIPT-VIEWER" );
    $sym553$CB_TRANSCRIPT_VIEWER_HANDLER = makeSymbol( "CB-TRANSCRIPT-VIEWER-HANDLER" );
    $str554$Transcript_Statistics = makeString( "Transcript Statistics" );
    $str555$Transcript__ = makeString( "Transcript: " );
    $str556$Constants_Created__ = makeString( "Constants Created: " );
    $str557$Constants_Renamed__ = makeString( "Constants Renamed: " );
    $str558$__ = makeString( "=>" );
    $str559$Constants_Killed__ = makeString( "Constants Killed: " );
    $str560$No_transcripts_for_this_image_ = makeString( "No transcripts for this image!" );
    $str561$Local_transcripts_for_this_image_ = makeString( "Local transcripts for this image:" );
    $str562$cb_transcript_viewer_handler_stat = makeString( "cb-transcript-viewer-handler&stats:" );
    $sym563$CB_LINK_ALL_LOCAL_TRANS = makeSymbol( "CB-LINK-ALL-LOCAL-TRANS" );
    $str564$Viewer = makeString( "Viewer" );
    $kw565$VIEWER = makeKeyword( "VIEWER" );
    $sym566$CB_LINK_VIEWER = makeSymbol( "CB-LINK-VIEWER" );
    $str567$Transcript_Viewer = makeString( "Transcript Viewer" );
    $str568$View = makeString( "View" );
    $str569$View_Local_Transcripts = makeString( "View Local Transcripts" );
    $kw570$CB_SHOW_LOCAL_OPS = makeKeyword( "CB-SHOW-LOCAL-OPS" );
    $str571$cb_show_local_ops_html = makeString( "cb-show-local-ops.html" );
    $str572$Local_Operations = makeString( "Local Operations" );
    $str573$cb_confirm_clear_local_queue = makeString( "cb-confirm-clear-local-queue" );
    $str574$You_have_nothing_in_your_local_qu = makeString( "You have nothing in your local queue." );
    $str575$_item = makeString( " item" );
    $str576$s = makeString( "s" );
    $str577$_in_your_local_queue_ = makeString( " in your local queue." );
    $str578$Click_this_button_to_erase_the_lo = makeString( "Click this button to erase the local queue:" );
    $str579$Clear_Local_Queue = makeString( "Clear Local Queue" );
    $str580$Here_are_the_queued_local_operati = makeString( "Here are the queued local operations:" );
    $sym581$CB_SHOW_LOCAL_OPS = makeSymbol( "CB-SHOW-LOCAL-OPS" );
    $str582$Local_ = makeString( "Local:" );
    $str583$cb_show_local_ops = makeString( "cb-show-local-ops" );
    $sym584$CB_LINK_SHOW_LOCAL_OPS = makeSymbol( "CB-LINK-SHOW-LOCAL-OPS" );
    $kw585$CB_CONFIRM_CLEAR_LOCAL_QUEUE = makeKeyword( "CB-CONFIRM-CLEAR-LOCAL-QUEUE" );
    $str586$cb_confirm_clear_local_queue_html = makeString( "cb-confirm-clear-local-queue.html" );
    $str587$cb_clear_local_queue = makeString( "cb-clear-local-queue" );
    $str588$Are_you_ = makeString( "Are you " );
    $str589$SURE = makeString( "SURE" );
    $str590$_you_want_to_clear_your_local_que = makeString( " you want to clear your local queue?" );
    $str591$_operations_will_be_lost_ = makeString( " operations will be lost!" );
    $str592$Yes__Clear_Local_Queue = makeString( "Yes, Clear Local Queue" );
    $sym593$CB_CONFIRM_CLEAR_LOCAL_QUEUE = makeSymbol( "CB-CONFIRM-CLEAR-LOCAL-QUEUE" );
    $kw594$CB_CONFIRM_CLEAR_LOCAL_AND_RESTART = makeKeyword( "CB-CONFIRM-CLEAR-LOCAL-AND-RESTART" );
    $str595$cb_confirm_clear_local_and_restar = makeString( "cb-confirm-clear-local-and-restart.html" );
    $str596$cb_clear_local_and_restart = makeString( "cb-clear-local-and-restart" );
    $str597$You_have_nothing_in_your_local_qu = makeString( "You have nothing in your local queue. Restarting agenda..." );
    $str598$Local_Queue_Cleared__Agenda_Resta = makeString( "Local Queue Cleared, Agenda Restarted" );
    $str599$_you_want_to_clear_your_local_que = makeString( " you want to clear your local queue before restarting the agenda?" );
    $str600$Yes__Clear_Local_Queue_and_Restar = makeString( "Yes, Clear Local Queue and Restart" );
    $sym601$CB_CONFIRM_CLEAR_LOCAL_AND_RESTART = makeSymbol( "CB-CONFIRM-CLEAR-LOCAL-AND-RESTART" );
    $str602$cb_confirm_clear_local_and_restar = makeString( "cb-confirm-clear-local-and-restart" );
    $sym603$CB_LINK_DELETE_LOCAL_AND_RESTART = makeSymbol( "CB-LINK-DELETE-LOCAL-AND-RESTART" );
    $sym604$CB_LINK_DELETE_LOCAL_OPS = makeSymbol( "CB-LINK-DELETE-LOCAL-OPS" );
    $sym605$CB_CLEAR_LOCAL_AND_RESTART = makeSymbol( "CB-CLEAR-LOCAL-AND-RESTART" );
    $str606$Local_Queue_Cleared = makeString( "Local Queue Cleared" );
    $sym607$CB_CLEAR_LOCAL_QUEUE = makeSymbol( "CB-CLEAR-LOCAL-QUEUE" );
    $kw608$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT = makeKeyword( "CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT" );
    $str609$cb_system_show_specific_transcrip = makeString( "cb-system-show-specific-transcript-file-as-ke-text.html" );
    $str610$transcript_filename = makeString( "transcript-filename" );
    $str611$output_filename = makeString( "output-filename" );
    $str612$error_message = makeString( "error-message" );
    $str613$Transcript_file_viewed_in_KE_Text = makeString( "Transcript file viewed in KE Text format" );
    $str614$The_transcript_file_contains_no_o = makeString( "The transcript file contains no operations." );
    $str615$cg_cb_write_local_transcript_as_k = makeString( "cg?cb-write-local-transcript-as-ke-text" );
    $kw616$POST = makeKeyword( "POST" );
    $str617$cb_system_write_specific_transcri = makeString( "cb-system-write-specific-transcript-file-as-ke-text" );
    $str618$You_may_write_this_transcript_in_ = makeString( "You may write this transcript in KE Text format to a file.  Please type in the full path of the file to write to." );
    $kw619$NBSP = makeKeyword( "NBSP" );
    $str620$Write_to_File = makeString( "Write to File" );
    $str621$This_is_what_the_transcript_curre = makeString( "This is what the transcript currently looks like converted to KE Text:" );
    $sym622$CB_SYSTEM_SHOW_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT = makeSymbol( "CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT" );
    $str623$Transcript_successfully_written_ = makeString( "Transcript successfully written." );
    $sym624$CB_SYSTEM_WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT = makeSymbol( "CB-SYSTEM-WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT" );
  }
}
/*
 * 
 * Total time: 5832 ms
 * 
 */