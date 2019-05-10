package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_collaborator_scoop
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_collaborator_scoop";
  public static final String myFingerPrint = "7925d84ac1b98630089973cb45bef43fa17c935936cdf43545c9a649e3d062fe";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 806L)
  private static SubLSymbol $within_scoop_server$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 856L)
  public static SubLSymbol $scoop_server_port$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 906L)
  public static SubLSymbol $scoop_server_machine$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 972L)
  private static SubLSymbol $use_virb3_for_scoop$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 1401L)
  private static SubLSymbol $scoop_appname$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 1448L)
  private static SubLSymbol $scoop_definitions$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 1493L)
  private static SubLSymbol $scoop_members$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2642L)
  private static SubLSymbol $scoop_incoming_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2738L)
  private static SubLSymbol $scoop_outgoing_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2831L)
  private static SubLSymbol $scoop_sid$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2871L)
  private static SubLSymbol $scoop_tid$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2910L)
  private static SubLSymbol $scoop_transaction_stack$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 17157L)
  private static SubLSymbol $rkf_scoop_associate_machine$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 17258L)
  private static SubLSymbol $rkf_scoop_associate_port$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 22137L)
  private static SubLSymbol $scoop_xml_newline$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 22247L)
  private static SubLSymbol $scoop_xml_template_login$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 22867L)
  private static SubLSymbol $scoop_xml_template_logout$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 23472L)
  private static SubLSymbol $scoop_xml_template_create$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 23921L)
  private static SubLSymbol $scoop_xml_template_delete$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 24368L)
  private static SubLSymbol $scoop_xml_template_assert$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25305L)
  private static SubLSymbol $scoop_xml_template_unassert$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLSymbol $dtp_scoop_session$;
  private static final SubLInteger $int0$3599;
  private static final SubLString $str1$BOOTLEG_CYC_COM;
  private static final SubLSymbol $kw2$SCOOP;
  private static final SubLSymbol $sym3$SCOOP_SERVER_HANDLER;
  private static final SubLSymbol $kw4$TEXT;
  private static final SubLString $str5$CYC;
  private static final SubLSymbol $sym6$DOUBLE_FLOAT;
  private static final SubLSymbol $kw7$SCOOP_QUIT;
  private static final SubLString $str8$KRAKEN;
  private static final SubLSymbol $sym9$_SCOOP_DEFINITIONS_;
  private static final SubLSymbol $sym10$_SCOOP_MEMBERS_;
  private static final SubLSymbol $kw11$LOGIN;
  private static final SubLSymbol $kw12$EMNAME;
  private static final SubLString $str13$SCOOP_Login_Monitor;
  private static final SubLSymbol $kw14$APPNAME;
  private static final SubLSymbol $kw15$EMID;
  private static final SubLSymbol $kw16$LOGOUT;
  private static final SubLString $str17$SCOOP_Logout_Monitor;
  private static final SubLSymbol $kw18$CREATE;
  private static final SubLString $str19$SCOOP_Create_Monitor;
  private static final SubLSymbol $kw20$DELETE;
  private static final SubLString $str21$SCOOP_Delete_Monitor;
  private static final SubLSymbol $kw22$ASSERT;
  private static final SubLString $str23$SCOOP_Assert_Monitor;
  private static final SubLSymbol $kw24$UNASSERT;
  private static final SubLString $str25$SCOOP_Unassert_Monitor;
  private static final SubLSymbol $kw26$CONFLICT;
  private static final SubLString $str27$SCOOP_Conflict_Voter;
  private static final SubLSymbol $sym28$LISTP;
  private static final SubLString $str29$SCOOP_Incoming_VirB3_Queue;
  private static final SubLString $str30$SCOOP_Outgoing_VirB3_Queue;
  private static final SubLString $str31$SCOOP___A__;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLSymbol $kw34$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw35$INVITE;
  private static final SubLSymbol $kw36$SID;
  private static final SubLSymbol $kw37$TID;
  private static final SubLSymbol $kw38$MESSAGE_TYPE;
  private static final SubLSymbol $kw39$MESSAGE_ARGS;
  private static final SubLSymbol $kw40$SME;
  private static final SubLSymbol $kw41$DOMAIN_MT;
  private static final SubLSymbol $kw42$LEXICAL_MT;
  private static final SubLSymbol $kw43$PARSING_MT;
  private static final SubLSymbol $kw44$TERM;
  private static final SubLSymbol $kw45$TERM_NAME;
  private static final SubLSymbol $kw46$TERM_GUID;
  private static final SubLSymbol $kw47$WHO_DUNNIT;
  private static final SubLSymbol $kw48$ASSERTION;
  private static final SubLSymbol $kw49$EL_FORMULA;
  private static final SubLSymbol $kw50$MT;
  private static final SubLSymbol $kw51$TRACE;
  private static final SubLSymbol $kw52$QUIT;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLString $str63$Protocol_violation____cannot_hand;
  private static final SubLSymbol $kw64$DONE;
  private static final SubLString $str65$Scoop_Listener;
  private static final SubLSymbol $sym66$SCOOP_REPLY_POSTING_LISTENER;
  private static final SubLSymbol $kw67$ERROR;
  private static final SubLString $str68$The_connection_with_SCOOP_dropped;
  private static final SubLSymbol $kw69$EOF;
  private static final SubLSymbol $kw70$DISCONNECT;
  private static final SubLString $str71$Scoop_errored_out_and_generated_a;
  private static final SubLString $str72$Protocol_violation____received__A;
  private static final SubLSymbol $kw73$ACCEPT;
  private static final SubLString $str74$SCOOP_accepted_with__A__;
  private static final SubLSymbol $kw75$PROPOSE;
  private static final SubLSymbol $kw76$CONTRIBUTE;
  private static final SubLSymbol $kw77$STIMULATE;
  private static final SubLSymbol $kw78$PROPID;
  private static final SubLSymbol $kw79$AAL;
  private static final SubLSymbol $sym80$_ACTION;
  private static final SubLString $str81$UIA_START_SESSION;
  private static final SubLSymbol $sym82$_THE_POSTING;
  private static final SubLString $str83$POSTING;
  private static final SubLString $str84$UIA_STOP_SESSION;
  private static final SubLString $str85$UIA_CREATE;
  private static final SubLString $str86$UIA_KILL;
  private static final SubLString $str87$UIA_ASSERT;
  private static final SubLString $str88$UIA_UNASSERT;
  private static final SubLSymbol $kw89$CREATOR;
  private static final SubLSymbol $kw90$XML_SUMMARY;
  private static final SubLSymbol $kw91$KILL;
  private static final SubLString $str92$nautilus_cyc_com;
  private static final SubLInteger $int93$3621;
  private static final SubLSymbol $kw94$CONNECTION;
  private static final SubLSymbol $kw95$ADDRESS;
  private static final SubLSymbol $kw96$PORT;
  private static final SubLSymbol $kw97$MTS;
  private static final SubLSymbol $kw98$INTERACTION_DOMAIN_MT;
  private static final SubLSymbol $kw99$INTERACTION_LEXICAL_MT;
  private static final SubLSymbol $kw100$INTERACTION_PARSING_MT;
  private static final SubLSymbol $kw101$SESSION;
  private static final SubLSymbol $kw102$CONSTANT;
  private static final SubLSymbol $kw103$NAME;
  private static final SubLSymbol $kw104$GUID;
  private static final SubLSymbol $kw105$NART;
  private static final SubLSymbol $kw106$FORMULA;
  private static final SubLSymbol $kw107$FORWARD;
  private static final SubLObject $const108$Forward_AssertionDirection;
  private static final SubLSymbol $kw109$BACKWARD;
  private static final SubLObject $const110$Backward_AssertionDirection;
  private static final SubLSymbol $kw111$CODE;
  private static final SubLObject $const112$Code_AssertionDirection;
  private static final SubLSymbol $kw113$DIRECTION;
  private static final SubLSymbol $kw114$TRUE;
  private static final SubLObject $const115$True;
  private static final SubLSymbol $kw116$FALSE;
  private static final SubLObject $const117$False;
  private static final SubLSymbol $kw118$UNKNOWN;
  private static final SubLObject $const119$Unknown_HLTruthValue;
  private static final SubLSymbol $kw120$TRUTH;
  private static final SubLSymbol $kw121$DEFAULT;
  private static final SubLObject $const122$Default_JustificationStrength;
  private static final SubLSymbol $kw123$MONOTONIC;
  private static final SubLObject $const124$Monotonic_JustificationStrength;
  private static final SubLSymbol $kw125$STRENGTH;
  private static final SubLSymbol $kw126$TIMESTAMP;
  private static final SubLSymbol $kw127$DATE;
  private static final SubLSymbol $kw128$SECS;
  private static final SubLString $str129$__xml_version__1_0__encoding__UTF;
  private static final SubLString $str130$_SCOOP_;
  private static final SubLString $str131$_action_login__action_;
  private static final SubLString $str132$_user__A__user_;
  private static final SubLString $str133$_microTheory__A__microTheory_;
  private static final SubLString $str134$_clientAddress__A__clientAddress_;
  private static final SubLString $str135$_clientPort__A__clientPort_;
  private static final SubLString $str136$__SCOOP_;
  private static final SubLString $str137$_action_logout__action_;
  private static final SubLString $str138$_action_create__action_;
  private static final SubLString $str139$_constant__A__constant_;
  private static final SubLString $str140$_action_delete__action_;
  private static final SubLString $str141$_action_assert__action_;
  private static final SubLString $str142$_statement_;
  private static final SubLString $str143$_A;
  private static final SubLString $str144$__statement_;
  private static final SubLString $str145$_action_unassert__action_;
  private static final SubLString $str146$_statement__A__statement_;
  private static final SubLString $str147$_clientPort__D__clientPort_;
  private static final SubLSymbol $sym148$SCOOP_SESSION;
  private static final SubLSymbol $sym149$SCOOP_SESSION_P;
  private static final SubLList $list150;
  private static final SubLList $list151;
  private static final SubLList $list152;
  private static final SubLList $list153;
  private static final SubLSymbol $sym154$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym155$SCOOP_SESSION_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list156;
  private static final SubLSymbol $sym157$SCOOP_SESSION_MACHINE;
  private static final SubLSymbol $sym158$_CSETF_SCOOP_SESSION_MACHINE;
  private static final SubLSymbol $sym159$SCOOP_SESSION_PORT;
  private static final SubLSymbol $sym160$_CSETF_SCOOP_SESSION_PORT;
  private static final SubLSymbol $sym161$SCOOP_SESSION_TCP_SERVER;
  private static final SubLSymbol $sym162$_CSETF_SCOOP_SESSION_TCP_SERVER;
  private static final SubLSymbol $sym163$SCOOP_SESSION_INITIALIZED_P;
  private static final SubLSymbol $sym164$_CSETF_SCOOP_SESSION_INITIALIZED_P;
  private static final SubLSymbol $kw165$MACHINE;
  private static final SubLSymbol $kw166$TCP_SERVER;
  private static final SubLSymbol $kw167$INITIALIZED_P;
  private static final SubLString $str168$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw169$BEGIN;
  private static final SubLSymbol $sym170$MAKE_SCOOP_SESSION;
  private static final SubLSymbol $kw171$SLOT;
  private static final SubLSymbol $kw172$END;
  private static final SubLSymbol $sym173$VISIT_DEFSTRUCT_OBJECT_SCOOP_SESSION_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 1021L)
  public static SubLObject scoop_server_handler(final SubLObject in_stream, final SubLObject out_stream)
  {
    return scoop_server_top_level( in_stream, out_stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 1169L)
  public static SubLObject scoop_server_top_level(final SubLObject in_stream, final SubLObject out_stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = Packages.$package$.currentBinding( thread );
    final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding( thread );
    final SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding( thread );
    final SubLObject _prev_bind_4 = reader.$read_eval$.currentBinding( thread );
    try
    {
      Packages.$package$.bind( Packages.find_package( $str5$CYC ), thread );
      reader.$read_default_float_format$.bind( $sym6$DOUBLE_FLOAT, thread );
      print_high.$print_readably$.bind( NIL, thread );
      reader.$read_eval$.bind( NIL, thread );
      final SubLObject old_priority = Threads.process_priority( Threads.current_process() );
      try
      {
        Threads.set_process_priority( Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue() );
        SubLObject catch_var = NIL;
        try
        {
          thread.throwStack.push( $kw7$SCOOP_QUIT );
          final SubLObject _prev_bind_0_$1 = $within_scoop_server$.currentBinding( thread );
          try
          {
            $within_scoop_server$.bind( T, thread );
            scoop_server_handler_internal( in_stream, out_stream );
          }
          finally
          {
            $within_scoop_server$.rebind( _prev_bind_0_$1, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          catch_var = Errors.handleThrowable( ccatch_env_var, $kw7$SCOOP_QUIT );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          Threads.set_process_priority( Threads.current_process(), old_priority );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      reader.$read_eval$.rebind( _prev_bind_4, thread );
      print_high.$print_readably$.rebind( _prev_bind_3, thread );
      reader.$read_default_float_format$.rebind( _prev_bind_2, thread );
      Packages.$package$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 1538L)
  public static SubLObject initialize_scoop_definitions()
  {
    $scoop_definitions$.setGlobalValue( ConsesLow.list( new SubLObject[] { $kw11$LOGIN, ConsesLow.list( $kw12$EMNAME, $str13$SCOOP_Login_Monitor, $kw14$APPNAME, $scoop_appname$.getGlobalValue(), $kw15$EMID, Guids
        .guid_to_string( Guids.new_guid() ) ), $kw16$LOGOUT, ConsesLow.list( $kw12$EMNAME, $str17$SCOOP_Logout_Monitor, $kw14$APPNAME, $scoop_appname$.getGlobalValue(), $kw15$EMID, Guids.guid_to_string( Guids
            .new_guid() ) ), $kw18$CREATE, ConsesLow.list( $kw12$EMNAME, $str19$SCOOP_Create_Monitor, $kw14$APPNAME, $scoop_appname$.getGlobalValue(), $kw15$EMID, Guids.guid_to_string( Guids.new_guid() ) ), $kw20$DELETE,
      ConsesLow.list( $kw12$EMNAME, $str21$SCOOP_Delete_Monitor, $kw14$APPNAME, $scoop_appname$.getGlobalValue(), $kw15$EMID, Guids.guid_to_string( Guids.new_guid() ) ), $kw22$ASSERT, ConsesLow.list( $kw12$EMNAME,
          $str23$SCOOP_Assert_Monitor, $kw14$APPNAME, $scoop_appname$.getGlobalValue(), $kw15$EMID, Guids.guid_to_string( Guids.new_guid() ) ), $kw24$UNASSERT, ConsesLow.list( $kw12$EMNAME, $str25$SCOOP_Unassert_Monitor,
              $kw14$APPNAME, $scoop_appname$.getGlobalValue(), $kw15$EMID, Guids.guid_to_string( Guids.new_guid() ) ), $kw26$CONFLICT, ConsesLow.list( $kw12$EMNAME, $str27$SCOOP_Conflict_Voter, $kw14$APPNAME,
                  $scoop_appname$.getGlobalValue(), $kw15$EMID, Guids.guid_to_string( Guids.new_guid() ) )
    } ) );
    $scoop_members$.setGlobalValue( Sequences.delete_if( $sym28$LISTP, conses_high.copy_list( $scoop_definitions$.getGlobalValue() ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2533L)
  public static SubLObject scoop_definition_emid_by_type(final SubLObject type)
  {
    return conses_high.getf( conses_high.getf( $scoop_definitions$.getGlobalValue(), type, UNPROVIDED ), $kw15$EMID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 2964L)
  public static SubLObject scoop_trace(final SubLObject message)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $scoop_transaction_stack$.setDynamicValue( ConsesLow.cons( message, $scoop_transaction_stack$.getDynamicValue( thread ) ), thread );
    return message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 3066L)
  public static SubLObject scoop_trace_display_trace_stack()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = $scoop_transaction_stack$.getDynamicValue( thread );
    SubLObject message = NIL;
    message = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      Errors.warn( $str31$SCOOP___A__, message );
      cdolist_list_var = cdolist_list_var.rest();
      message = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 3212L)
  public static SubLObject scoop_server_handler_internal(final SubLObject in, final SubLObject out)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $scoop_transaction_stack$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $scoop_sid$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $scoop_tid$.currentBinding( thread );
    try
    {
      $scoop_transaction_stack$.bind( NIL, thread );
      $scoop_sid$.bind( Guids.guid_to_string( Guids.new_guid() ), thread );
      $scoop_tid$.bind( Guids.guid_to_string( Guids.new_guid() ), thread );
      SubLObject replies = NIL;
      replies = scoop_process_invite_all( in, out );
      if( NIL != replies )
      {
        scoop_message_forwarder( out, in );
      }
    }
    finally
    {
      $scoop_tid$.rebind( _prev_bind_3, thread );
      $scoop_sid$.rebind( _prev_bind_2, thread );
      $scoop_transaction_stack$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 3723L)
  public static SubLObject scoop_process_invite_all(final SubLObject in, final SubLObject out)
  {
    SubLObject success = NIL;
    SubLObject cdolist_list_var = $scoop_members$.getGlobalValue();
    SubLObject member = NIL;
    member = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject definition = conses_high.getf( $scoop_definitions$.getGlobalValue(), member, UNPROVIDED );
      final SubLObject current;
      final SubLObject datum = current = definition;
      SubLObject allow_other_keys_p = NIL;
      SubLObject rest = current;
      SubLObject bad = NIL;
      SubLObject current_$3 = NIL;
      while ( NIL != rest)
      {
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list32 );
        current_$3 = rest.first();
        rest = rest.rest();
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list32 );
        if( NIL == conses_high.member( current_$3, $list33, UNPROVIDED, UNPROVIDED ) )
        {
          bad = T;
        }
        if( current_$3 == $kw34$ALLOW_OTHER_KEYS )
        {
          allow_other_keys_p = rest.first();
        }
        rest = rest.rest();
      }
      if( NIL != bad && NIL == allow_other_keys_p )
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list32 );
      }
      final SubLObject emname_tail = cdestructuring_bind.property_list_member( $kw12$EMNAME, current );
      final SubLObject emname = ( NIL != emname_tail ) ? conses_high.cadr( emname_tail ) : NIL;
      final SubLObject appname_tail = cdestructuring_bind.property_list_member( $kw14$APPNAME, current );
      final SubLObject appname = ( NIL != appname_tail ) ? conses_high.cadr( appname_tail ) : NIL;
      final SubLObject emid_tail = cdestructuring_bind.property_list_member( $kw15$EMID, current );
      final SubLObject emid = ( NIL != emid_tail ) ? conses_high.cadr( emid_tail ) : NIL;
      scoop_process_invitation( in, out, emid, appname, emname );
      success = ConsesLow.cons( member, success );
      cdolist_list_var = cdolist_list_var.rest();
      member = cdolist_list_var.first();
    }
    return success;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 4157L)
  public static SubLObject scoop_process_invitation(final SubLObject in, final SubLObject out, final SubLObject emid, final SubLObject appname, final SubLObject emname)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = ConsesLow.list( new SubLObject[] { $kw35$INVITE, $kw36$SID, $scoop_sid$.getDynamicValue( thread ), $kw15$EMID, emid, $kw37$TID, $scoop_tid$.getDynamicValue( thread ), $kw14$APPNAME,
      appname, $kw12$EMNAME, emname
    } );
    SubLObject reply = NIL;
    write_scoop_server_reaction( out, message );
    scoop_trace( message );
    reply = read_scoop_server_request( in );
    scoop_trace( reply );
    return in;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 4591L)
  public static SubLObject new_scoop_message_packet(final SubLObject type, SubLObject plist)
  {
    if( plist == UNPROVIDED )
    {
      plist = NIL;
    }
    return ConsesLow.list( $kw38$MESSAGE_TYPE, type, $kw39$MESSAGE_ARGS, plist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 4754L)
  public static SubLObject get_scoop_message_packet_type(final SubLObject packet)
  {
    return conses_high.getf( packet, $kw38$MESSAGE_TYPE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 4850L)
  public static SubLObject get_scoop_message_packet_arguments(final SubLObject packet)
  {
    return conses_high.getf( packet, $kw39$MESSAGE_ARGS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 4950L)
  public static SubLObject get_scoop_message_packet_arg(final SubLObject packet, final SubLObject key, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    return conses_high.getf( get_scoop_message_packet_arguments( packet ), key, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 5101L)
  public static SubLObject scoop_schedule_outgoing_message_packet(final SubLObject packet)
  {
    return process_utilities.ipc_enqueue( packet, $scoop_outgoing_queue$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 5222L)
  public static SubLObject scoop_fetch_next_outgoing_message_packet()
  {
    return process_utilities.ipc_dequeue( $scoop_outgoing_queue$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 5329L)
  public static SubLObject scoop_schedule_login_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt)
  {
    final SubLObject packet = new_scoop_message_packet( $kw11$LOGIN, ConsesLow.list( $kw40$SME, sme, $kw41$DOMAIN_MT, domain_mt, $kw42$LEXICAL_MT, lexical_mt, $kw43$PARSING_MT, parsing_mt ) );
    scoop_schedule_outgoing_message_packet( packet );
    return packet;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 5818L)
  public static SubLObject scoop_schedule_logout_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt)
  {
    final SubLObject packet = new_scoop_message_packet( $kw16$LOGOUT, ConsesLow.list( $kw40$SME, sme, $kw41$DOMAIN_MT, domain_mt, $kw42$LEXICAL_MT, lexical_mt, $kw43$PARSING_MT, parsing_mt ) );
    scoop_schedule_outgoing_message_packet( packet );
    return packet;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 6228L)
  public static SubLObject scoop_schedule_create_message(final SubLObject v_term)
  {
    final SubLObject packet = new_scoop_message_packet( $kw18$CREATE, ConsesLow.list( $kw44$TERM, v_term ) );
    scoop_schedule_outgoing_message_packet( packet );
    return packet;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 6432L)
  public static SubLObject scoop_schedule_kill_message(final SubLObject term_name, final SubLObject term_guid, final SubLObject who_dunnit)
  {
    final SubLObject packet = new_scoop_message_packet( $kw20$DELETE, ConsesLow.list( $kw45$TERM_NAME, term_name, $kw46$TERM_GUID, term_guid, $kw47$WHO_DUNNIT, who_dunnit ) );
    scoop_schedule_outgoing_message_packet( packet );
    return packet;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 6804L)
  public static SubLObject scoop_schedule_assert_message(final SubLObject assertion)
  {
    final SubLObject packet = new_scoop_message_packet( $kw22$ASSERT, ConsesLow.list( $kw48$ASSERTION, assertion ) );
    scoop_schedule_outgoing_message_packet( packet );
    return packet;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 7023L)
  public static SubLObject scoop_schedule_unassert_message(final SubLObject el_formula, final SubLObject mt, final SubLObject who_dunnit)
  {
    final SubLObject packet = new_scoop_message_packet( $kw24$UNASSERT, ConsesLow.list( $kw49$EL_FORMULA, el_formula, $kw50$MT, mt, $kw47$WHO_DUNNIT, who_dunnit ) );
    scoop_schedule_outgoing_message_packet( packet );
    return packet;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 7379L)
  public static SubLObject scoop_schedule_trace_message()
  {
    final SubLObject packet = new_scoop_message_packet( $kw51$TRACE, UNPROVIDED );
    scoop_schedule_outgoing_message_packet( packet );
    return packet;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 7559L)
  public static SubLObject scoop_schedule_quit_message()
  {
    final SubLObject packet = new_scoop_message_packet( $kw52$QUIT, UNPROVIDED );
    scoop_schedule_outgoing_message_packet( packet );
    return packet;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 7737L)
  public static SubLObject scoop_message_forwarder(final SubLObject out, SubLObject in)
  {
    if( in == UNPROVIDED )
    {
      in = NIL;
    }
    SubLObject doneP = NIL;
    while ( NIL == doneP)
    {
      final SubLObject packet = scoop_fetch_next_outgoing_message_packet();
      final SubLObject message = get_scoop_message_packet_arguments( packet );
      final SubLObject type = get_scoop_message_packet_type( packet );
      SubLObject scoop_message = NIL;
      final SubLObject pcase_var = type;
      if( pcase_var.eql( $kw11$LOGIN ) )
      {
        final SubLObject current;
        final SubLObject datum = current = message;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list53 );
          current_$4 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list53 );
          if( NIL == conses_high.member( current_$4, $list54, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$4 == $kw34$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list53 );
        }
        final SubLObject sme_tail = cdestructuring_bind.property_list_member( $kw40$SME, current );
        final SubLObject sme = ( NIL != sme_tail ) ? conses_high.cadr( sme_tail ) : NIL;
        final SubLObject domain_mt_tail = cdestructuring_bind.property_list_member( $kw41$DOMAIN_MT, current );
        final SubLObject domain_mt = ( NIL != domain_mt_tail ) ? conses_high.cadr( domain_mt_tail ) : NIL;
        final SubLObject lexical_mt_tail = cdestructuring_bind.property_list_member( $kw42$LEXICAL_MT, current );
        final SubLObject lexical_mt = ( NIL != lexical_mt_tail ) ? conses_high.cadr( lexical_mt_tail ) : NIL;
        final SubLObject parsing_mt_tail = cdestructuring_bind.property_list_member( $kw43$PARSING_MT, current );
        final SubLObject parsing_mt = ( NIL != parsing_mt_tail ) ? conses_high.cadr( parsing_mt_tail ) : NIL;
        scoop_message = rkf_scoop_message_login( sme, domain_mt, lexical_mt, parsing_mt );
      }
      else if( pcase_var.eql( $kw16$LOGOUT ) )
      {
        final SubLObject current;
        final SubLObject datum = current = message;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list53 );
          current_$5 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list53 );
          if( NIL == conses_high.member( current_$5, $list54, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$5 == $kw34$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list53 );
        }
        final SubLObject sme_tail = cdestructuring_bind.property_list_member( $kw40$SME, current );
        final SubLObject sme = ( NIL != sme_tail ) ? conses_high.cadr( sme_tail ) : NIL;
        final SubLObject domain_mt_tail = cdestructuring_bind.property_list_member( $kw41$DOMAIN_MT, current );
        final SubLObject domain_mt = ( NIL != domain_mt_tail ) ? conses_high.cadr( domain_mt_tail ) : NIL;
        final SubLObject lexical_mt_tail = cdestructuring_bind.property_list_member( $kw42$LEXICAL_MT, current );
        final SubLObject lexical_mt = ( NIL != lexical_mt_tail ) ? conses_high.cadr( lexical_mt_tail ) : NIL;
        final SubLObject parsing_mt_tail = cdestructuring_bind.property_list_member( $kw43$PARSING_MT, current );
        final SubLObject parsing_mt = ( NIL != parsing_mt_tail ) ? conses_high.cadr( parsing_mt_tail ) : NIL;
        scoop_message = rkf_scoop_message_logout( sme, domain_mt, lexical_mt, parsing_mt );
      }
      else if( pcase_var.eql( $kw18$CREATE ) )
      {
        final SubLObject current;
        final SubLObject datum = current = message;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list55 );
          current_$6 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list55 );
          if( NIL == conses_high.member( current_$6, $list56, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$6 == $kw34$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list55 );
        }
        final SubLObject term_tail = cdestructuring_bind.property_list_member( $kw44$TERM, current );
        final SubLObject v_term = ( NIL != term_tail ) ? conses_high.cadr( term_tail ) : NIL;
        scoop_message = rkf_scoop_message_create( v_term );
      }
      else if( pcase_var.eql( $kw20$DELETE ) )
      {
        final SubLObject current;
        final SubLObject datum = current = message;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
          current_$7 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
          if( NIL == conses_high.member( current_$7, $list58, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$7 == $kw34$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list57 );
        }
        final SubLObject term_name_tail = cdestructuring_bind.property_list_member( $kw45$TERM_NAME, current );
        final SubLObject term_name = ( NIL != term_name_tail ) ? conses_high.cadr( term_name_tail ) : NIL;
        final SubLObject term_guid_tail = cdestructuring_bind.property_list_member( $kw46$TERM_GUID, current );
        final SubLObject term_guid = ( NIL != term_guid_tail ) ? conses_high.cadr( term_guid_tail ) : NIL;
        final SubLObject who_dunnit_tail = cdestructuring_bind.property_list_member( $kw47$WHO_DUNNIT, current );
        final SubLObject who_dunnit = ( NIL != who_dunnit_tail ) ? conses_high.cadr( who_dunnit_tail ) : NIL;
        scoop_message = rkf_scoop_message_kill( term_name, term_guid, who_dunnit );
      }
      else if( pcase_var.eql( $kw22$ASSERT ) )
      {
        final SubLObject current;
        final SubLObject datum = current = message;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list59 );
          current_$8 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list59 );
          if( NIL == conses_high.member( current_$8, $list60, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$8 == $kw34$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list59 );
        }
        final SubLObject assertion_tail = cdestructuring_bind.property_list_member( $kw48$ASSERTION, current );
        final SubLObject assertion = ( NIL != assertion_tail ) ? conses_high.cadr( assertion_tail ) : NIL;
        scoop_message = rkf_scoop_message_assert( assertion );
      }
      else if( pcase_var.eql( $kw24$UNASSERT ) )
      {
        final SubLObject current;
        final SubLObject datum = current = message;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list61 );
          current_$9 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list61 );
          if( NIL == conses_high.member( current_$9, $list62, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$9 == $kw34$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list61 );
        }
        final SubLObject el_formula_tail = cdestructuring_bind.property_list_member( $kw49$EL_FORMULA, current );
        final SubLObject el_formula = ( NIL != el_formula_tail ) ? conses_high.cadr( el_formula_tail ) : NIL;
        final SubLObject mt_tail = cdestructuring_bind.property_list_member( $kw50$MT, current );
        final SubLObject mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
        final SubLObject who_dunnit_tail = cdestructuring_bind.property_list_member( $kw47$WHO_DUNNIT, current );
        final SubLObject who_dunnit = ( NIL != who_dunnit_tail ) ? conses_high.cadr( who_dunnit_tail ) : NIL;
        scoop_message = rkf_scoop_message_unassert( el_formula, mt, who_dunnit );
      }
      else if( pcase_var.eql( $kw51$TRACE ) )
      {
        scoop_trace_display_trace_stack();
      }
      else if( pcase_var.eql( $kw52$QUIT ) )
      {
        doneP = T;
      }
      else
      {
        Errors.warn( $str63$Protocol_violation____cannot_hand, message );
      }
      if( NIL != scoop_message )
      {
        write_scoop_server_reaction( out, scoop_message );
        scoop_trace( scoop_message );
        if( !in.isStream() )
        {
          continue;
        }
        scoop_trace( read_scoop_server_request( in ) );
      }
    }
    return $kw64$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 9999L)
  public static SubLObject scoop_spawn_listener(final SubLObject in, final SubLObject out, final SubLObject sid, final SubLObject tid)
  {
    return subl_promotions.make_process_with_args( $str65$Scoop_Listener, $sym66$SCOOP_REPLY_POSTING_LISTENER, ConsesLow.list( in, sid, tid ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 10306L)
  public static SubLObject scoop_reply_posting_listener(final SubLObject in, final SubLObject sid, final SubLObject tid)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $scoop_sid$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $scoop_tid$.currentBinding( thread );
    try
    {
      $scoop_sid$.bind( sid, thread );
      $scoop_tid$.bind( tid, thread );
      SubLObject reply = NIL;
      SubLObject doneP = NIL;
      final SubLObject _prev_bind_0_$10 = Packages.$package$.currentBinding( thread );
      final SubLObject _prev_bind_1_$11 = reader.$read_default_float_format$.currentBinding( thread );
      final SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding( thread );
      final SubLObject _prev_bind_4 = reader.$read_eval$.currentBinding( thread );
      try
      {
        Packages.$package$.bind( Packages.find_package( $str5$CYC ), thread );
        reader.$read_default_float_format$.bind( $sym6$DOUBLE_FLOAT, thread );
        print_high.$print_readably$.bind( NIL, thread );
        reader.$read_eval$.bind( NIL, thread );
        final SubLObject old_priority = Threads.process_priority( Threads.current_process() );
        try
        {
          Threads.set_process_priority( Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue() );
          SubLObject catch_var = NIL;
          try
          {
            thread.throwStack.push( $kw7$SCOOP_QUIT );
            while ( NIL == doneP)
            {
              reply = $kw67$ERROR;
              try
              {
                reply = read_scoop_server_request( in );
                scoop_trace( reply );
              }
              finally
              {
                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( reply == $kw67$ERROR )
                  {
                    Errors.warn( $str68$The_connection_with_SCOOP_dropped );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
                }
              }
              if( reply == $kw69$EOF )
              {
                doneP = T;
              }
              else if( reply == $kw70$DISCONNECT )
              {
                Errors.warn( $str71$Scoop_errored_out_and_generated_a );
                doneP = T;
              }
              else if( !reply.isList() )
              {
                Errors.warn( $str72$Protocol_violation____received__A, reply );
                doneP = T;
              }
              else
              {
                final SubLObject pcase_var = reply.first();
                if( pcase_var.eql( $kw73$ACCEPT ) )
                {
                  Errors.warn( $str74$SCOOP_accepted_with__A__, reply );
                }
                else
                {
                  if( pcase_var.eql( $kw75$PROPOSE ) )
                  {
                    continue;
                  }
                  if( pcase_var.eql( $kw76$CONTRIBUTE ) )
                  {
                  }
                }
              }
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            catch_var = Errors.handleThrowable( ccatch_env_var, $kw7$SCOOP_QUIT );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            Threads.set_process_priority( Threads.current_process(), old_priority );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
          }
        }
      }
      finally
      {
        reader.$read_eval$.rebind( _prev_bind_4, thread );
        print_high.$print_readably$.rebind( _prev_bind_3, thread );
        reader.$read_default_float_format$.rebind( _prev_bind_1_$11, thread );
        Packages.$package$.rebind( _prev_bind_0_$10, thread );
      }
    }
    finally
    {
      $scoop_tid$.rebind( _prev_bind_2, thread );
      $scoop_sid$.rebind( _prev_bind_0, thread );
    }
    return $kw64$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 11652L)
  public static SubLObject read_scoop_server_request(final SubLObject in)
  {
    SubLObject input = NIL;
    input = reader.read( in, NIL, $kw69$EOF, UNPROVIDED );
    return input;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 11838L)
  public static SubLObject write_scoop_server_reaction(final SubLObject out, final SubLObject reply)
  {
    print_high.prin1( reply, out );
    string_utilities.network_terpri( out );
    streams_high.force_output( out );
    return out;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 11973L)
  public static SubLObject rkf_scoop_message_login(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject emid = scoop_definition_emid_by_type( $kw11$LOGIN );
    final SubLObject posting = rkf_virb3ify_login_message( sme, domain_mt, lexical_mt, parsing_mt );
    return ConsesLow.list( new SubLObject[] { $kw77$STIMULATE, $kw36$SID, $scoop_sid$.getDynamicValue( thread ), $kw15$EMID, emid, $kw37$TID, $scoop_tid$.getDynamicValue( thread ), $kw78$PROPID, Guids.guid_to_string(
        Guids.new_guid() ), $kw79$AAL, ConsesLow.list( ConsesLow.list( $sym80$_ACTION, $str81$UIA_START_SESSION, posting ), ConsesLow.list( $sym82$_THE_POSTING, $str83$POSTING, posting ) )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 12634L)
  public static SubLObject rkf_scoop_message_logout(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject emid = scoop_definition_emid_by_type( $kw16$LOGOUT );
    final SubLObject posting = rkf_virb3ify_logout_message( sme, domain_mt, lexical_mt, parsing_mt );
    return ConsesLow.list( new SubLObject[] { $kw77$STIMULATE, $kw36$SID, $scoop_sid$.getDynamicValue( thread ), $kw15$EMID, emid, $kw37$TID, $scoop_tid$.getDynamicValue( thread ), $kw78$PROPID, Guids.guid_to_string(
        Guids.new_guid() ), $kw79$AAL, ConsesLow.list( ConsesLow.list( $sym80$_ACTION, $str84$UIA_STOP_SESSION, posting ), ConsesLow.list( $sym82$_THE_POSTING, $str83$POSTING, posting ) )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 13182L)
  public static SubLObject rkf_scoop_message_create(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject emid = scoop_definition_emid_by_type( $kw16$LOGOUT );
    final SubLObject posting = rkf_virb3ify_create_message( v_term );
    return ConsesLow.list( new SubLObject[] { $kw77$STIMULATE, $kw36$SID, $scoop_sid$.getDynamicValue( thread ), $kw15$EMID, emid, $kw37$TID, $scoop_tid$.getDynamicValue( thread ), $kw78$PROPID, Guids.guid_to_string(
        Guids.new_guid() ), $kw79$AAL, ConsesLow.list( ConsesLow.list( $sym80$_ACTION, $str85$UIA_CREATE, posting ), ConsesLow.list( $sym82$_THE_POSTING, $str83$POSTING, posting ) )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 13645L)
  public static SubLObject rkf_scoop_message_kill(final SubLObject term_name, final SubLObject term_guid, final SubLObject who_dunnit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject emid = scoop_definition_emid_by_type( $kw20$DELETE );
    final SubLObject posting = rkf_virb3ify_delete_message( term_name, term_guid, who_dunnit );
    return ConsesLow.list( new SubLObject[] { $kw77$STIMULATE, $kw36$SID, $scoop_sid$.getDynamicValue( thread ), $kw15$EMID, emid, $kw37$TID, $scoop_tid$.getDynamicValue( thread ), $kw78$PROPID, Guids.guid_to_string(
        Guids.new_guid() ), $kw79$AAL, ConsesLow.list( ConsesLow.list( $sym80$_ACTION, $str86$UIA_KILL, posting ), ConsesLow.list( $sym82$_THE_POSTING, $str83$POSTING, posting ) )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 14173L)
  public static SubLObject rkf_scoop_message_assert(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject emid = scoop_definition_emid_by_type( $kw22$ASSERT );
    final SubLObject posting = rkf_virb3ify_assert_message( assertion );
    return ConsesLow.list( new SubLObject[] { $kw77$STIMULATE, $kw36$SID, $scoop_sid$.getDynamicValue( thread ), $kw15$EMID, emid, $kw37$TID, $scoop_tid$.getDynamicValue( thread ), $kw78$PROPID, Guids.guid_to_string(
        Guids.new_guid() ), $kw79$AAL, ConsesLow.list( ConsesLow.list( $sym80$_ACTION, $str87$UIA_ASSERT, posting ), ConsesLow.list( $sym82$_THE_POSTING, $str83$POSTING, posting ) )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 14643L)
  public static SubLObject rkf_scoop_message_unassert(final SubLObject el_formula, final SubLObject mt, final SubLObject who_dunnit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject emid = scoop_definition_emid_by_type( $kw24$UNASSERT );
    final SubLObject posting = rkf_virb3ify_unassert_message( el_formula, mt, who_dunnit );
    return ConsesLow.list( new SubLObject[] { $kw77$STIMULATE, $kw36$SID, $scoop_sid$.getDynamicValue( thread ), $kw15$EMID, emid, $kw37$TID, $scoop_tid$.getDynamicValue( thread ), $kw78$PROPID, Guids.guid_to_string(
        Guids.new_guid() ), $kw79$AAL, ConsesLow.list( ConsesLow.list( $sym80$_ACTION, $str88$UIA_UNASSERT, posting ), ConsesLow.list( $sym82$_THE_POSTING, $str83$POSTING, posting ) )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 15151L)
  public static SubLObject rkf_virb3ify_login_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt)
  {
    return rkf_virb3ify_session_message( sme, domain_mt, lexical_mt, parsing_mt, $kw11$LOGIN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 15376L)
  public static SubLObject rkf_virb3ify_logout_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt)
  {
    return rkf_virb3ify_session_message( sme, domain_mt, lexical_mt, parsing_mt, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 15547L)
  public static SubLObject rkf_virb3ify_create_message(final SubLObject v_term)
  {
    final SubLObject creator = bookkeeping_store.creator( v_term, UNPROVIDED );
    final SubLObject date = bookkeeping_store.creation_time( v_term, UNPROVIDED );
    final SubLObject second = bookkeeping_store.creation_second( v_term, UNPROVIDED );
    return ConsesLow.list( $kw18$CREATE, ConsesLow.list( rkf_virb3ify_labeled_expression( $kw44$TERM, v_term ), rkf_virb3ify_labeled_expression( $kw89$CREATOR, creator ), rkf_virb3ify_timestamp( date, second ), ConsesLow
        .list( $kw90$XML_SUMMARY, scoop_xml_create_writer( NIL, creator, v_term ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 16091L)
  public static SubLObject rkf_virb3ify_delete_message(final SubLObject term_name, final SubLObject term_guid, final SubLObject who_dunnit)
  {
    return ConsesLow.list( $kw91$KILL, ConsesLow.list( ConsesLow.list( $kw44$TERM, rkf_virb3ify_constant_assemble_pieces( term_name, term_guid ) ), ConsesLow.list( $kw90$XML_SUMMARY, scoop_xml_delete_writer( NIL,
        who_dunnit, term_name ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 16437L)
  public static SubLObject rkf_virb3ify_assert_message(final SubLObject assertion)
  {
    return ConsesLow.list( $kw48$ASSERTION, ConsesLow.append( rkf_virb3ify_assertion_content( assertion ), ConsesLow.list( ConsesLow.list( $kw90$XML_SUMMARY, scoop_xml_assert_writer( NIL, assertions_high.asserted_by(
        assertion ), assertion ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 16837L)
  public static SubLObject rkf_virb3ify_unassert_message(final SubLObject el_formula, final SubLObject mt, final SubLObject sme)
  {
    return ConsesLow.list( $kw48$ASSERTION, ConsesLow.append( rkf_virb3ify_unassert_content( el_formula, mt ), ConsesLow.list( ConsesLow.list( $kw90$XML_SUMMARY, scoop_xml_unassert_writer( NIL, sme, el_formula ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 17314L)
  public static SubLObject rkf_virb3ify_connection()
  {
    return ConsesLow.list( $kw94$CONNECTION, ConsesLow.list( $kw95$ADDRESS, $rkf_scoop_associate_machine$.getGlobalValue() ), ConsesLow.list( $kw96$PORT, $rkf_scoop_associate_port$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 17682L)
  public static SubLObject rkf_virb3ify_mts(final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt)
  {
    return ConsesLow.list( $kw97$MTS, ConsesLow.list( rkf_virb3ify_labeled_expression( $kw98$INTERACTION_DOMAIN_MT, domain_mt ), rkf_virb3ify_labeled_expression( $kw99$INTERACTION_LEXICAL_MT, lexical_mt ),
        rkf_virb3ify_labeled_expression( $kw100$INTERACTION_PARSING_MT, parsing_mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 18086L)
  public static SubLObject rkf_virb3ify_session_message(final SubLObject sme, final SubLObject domain_mt, final SubLObject lexical_mt, final SubLObject parsing_mt, final SubLObject loginP)
  {
    return ConsesLow.list( $kw101$SESSION, ConsesLow.list( rkf_virb3ify_labeled_expression( $kw40$SME, sme ), rkf_virb3ify_mts( domain_mt, lexical_mt, parsing_mt ), rkf_virb3ify_connection(), ConsesLow.list(
        $kw90$XML_SUMMARY, ( NIL != loginP ) ? scoop_xml_login_writer( NIL, sme, domain_mt ) : scoop_xml_logout_writer( NIL, sme, domain_mt ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 18613L)
  public static SubLObject rkf_virb3ify_constant_assemble_pieces(final SubLObject name, final SubLObject guid)
  {
    return ConsesLow.list( $kw102$CONSTANT, ConsesLow.list( $kw103$NAME, name ), ConsesLow.list( $kw104$GUID, Guids.guid_to_string( guid ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 18830L)
  public static SubLObject rkf_virb3ify_constant(final SubLObject constant)
  {
    return rkf_virb3ify_constant_assemble_pieces( constants_high.constant_name( constant ), constants_high.constant_guid( constant ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 19000L)
  public static SubLObject rkf_virb3ify_expression(final SubLObject expr)
  {
    if( expr.isSymbol() )
    {
      return expr;
    }
    if( NIL != constant_handles.constant_p( expr ) )
    {
      return rkf_virb3ify_constant( expr );
    }
    if( NIL != nart_handles.nart_p( expr ) )
    {
      return ConsesLow.list( $kw105$NART, rkf_virb3ify_expression( narts_high.nart_el_formula( expr ) ) );
    }
    if( expr.isAtom() )
    {
      return expr;
    }
    return ConsesLow.cons( rkf_virb3ify_expression( expr.first() ), rkf_virb3ify_expression( expr.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 19397L)
  public static SubLObject rkf_virb3ify_labeled_expression(final SubLObject label, final SubLObject expression)
  {
    return ConsesLow.list( label, rkf_virb3ify_expression( expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 19527L)
  public static SubLObject rkf_virb3ify_formula(final SubLObject expression)
  {
    return rkf_virb3ify_labeled_expression( $kw106$FORMULA, expression );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 19646L)
  public static SubLObject rkf_virb3ify_mt(final SubLObject mt, SubLObject mt_label)
  {
    if( mt_label == UNPROVIDED )
    {
      mt_label = $kw50$MT;
    }
    return rkf_virb3ify_labeled_expression( mt_label, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 19767L)
  public static SubLObject rkf_virb3ify_assertion_direction(final SubLObject direction)
  {
    SubLObject direction_fort = NIL;
    if( direction.eql( $kw107$FORWARD ) )
    {
      direction_fort = $const108$Forward_AssertionDirection;
    }
    else if( direction.eql( $kw109$BACKWARD ) )
    {
      direction_fort = $const110$Backward_AssertionDirection;
    }
    else if( direction.eql( $kw111$CODE ) )
    {
      direction_fort = $const112$Code_AssertionDirection;
    }
    return rkf_virb3ify_labeled_expression( $kw113$DIRECTION, direction_fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 20197L)
  public static SubLObject rkf_virb3ify_assertion_truth(final SubLObject truth)
  {
    SubLObject truth_fort = NIL;
    if( truth.eql( $kw114$TRUE ) )
    {
      truth_fort = $const115$True;
    }
    else if( truth.eql( $kw116$FALSE ) )
    {
      truth_fort = $const117$False;
    }
    else if( truth.eql( $kw118$UNKNOWN ) )
    {
      truth_fort = $const119$Unknown_HLTruthValue;
    }
    return rkf_virb3ify_labeled_expression( $kw120$TRUTH, truth_fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 20530L)
  public static SubLObject rkf_virb3ify_assertion_strength(final SubLObject strength)
  {
    SubLObject strength_fort = NIL;
    if( strength.eql( $kw121$DEFAULT ) )
    {
      strength_fort = $const122$Default_JustificationStrength;
    }
    else if( strength.eql( $kw123$MONOTONIC ) )
    {
      strength_fort = $const124$Monotonic_JustificationStrength;
    }
    return rkf_virb3ify_labeled_expression( $kw125$STRENGTH, strength_fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 20880L)
  public static SubLObject rkf_virb3ify_timestamp(final SubLObject date, final SubLObject seconds)
  {
    return ConsesLow.list( $kw126$TIMESTAMP, ConsesLow.list( $kw127$DATE, date ), ConsesLow.list( $kw128$SECS, seconds ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 21030L)
  public static SubLObject rkf_virb3ify_assertion_content(final SubLObject assertion)
  {
    return ConsesLow.list( rkf_virb3ify_formula( uncanonicalizer.assertion_el_formula( assertion ) ), rkf_virb3ify_mt( assertions_high.assertion_mt( assertion ), UNPROVIDED ), rkf_virb3ify_labeled_expression(
        $kw89$CREATOR, assertions_high.asserted_by( assertion ) ), rkf_virb3ify_assertion_direction( assertions_high.assertion_direction( assertion ) ), rkf_virb3ify_assertion_truth( assertions_high.assertion_truth(
            assertion ) ), rkf_virb3ify_assertion_strength( assertions_high.assertion_strength( assertion ) ), rkf_virb3ify_timestamp( assertions_high.asserted_when( assertion ), assertions_high.asserted_second(
                assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 21696L)
  public static SubLObject rkf_virb3ify_assertion(final SubLObject assertion)
  {
    return ConsesLow.list( $kw48$ASSERTION, rkf_virb3ify_assertion_content( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 21837L)
  public static SubLObject rkf_virb3ify_unassertion(final SubLObject el_formula, final SubLObject mt)
  {
    return ConsesLow.list( $kw48$ASSERTION, rkf_virb3ify_unassert_content( el_formula, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 21986L)
  public static SubLObject rkf_virb3ify_unassert_content(final SubLObject el_formula, final SubLObject mt)
  {
    return ConsesLow.list( rkf_virb3ify_formula( el_formula ), rkf_virb3ify_mt( mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 22594L)
  public static SubLObject scoop_xml_login_writer(final SubLObject stream, final SubLObject sme, final SubLObject mt)
  {
    return PrintLow.format( stream, $scoop_xml_template_login$.getGlobalValue(), new SubLObject[] { kb_paths.fort_name( sme ), kb_paths.fort_name( mt ), $rkf_scoop_associate_machine$.getGlobalValue(),
      $rkf_scoop_associate_port$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 23217L)
  public static SubLObject scoop_xml_logout_writer(final SubLObject stream, final SubLObject sme, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return PrintLow.format( stream, $scoop_xml_template_logout$.getGlobalValue(), new SubLObject[] { kb_paths.fort_name( sme ), kb_paths.fort_name( mt ), Environment.get_network_name( UNPROVIDED ), $scoop_server_port$
        .getDynamicValue( thread )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 23731L)
  public static SubLObject scoop_xml_create_writer(final SubLObject stream, final SubLObject sme, final SubLObject fort)
  {
    return PrintLow.format( stream, $scoop_xml_template_create$.getGlobalValue(), kb_paths.fort_name( sme ), kb_paths.fort_name( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 24180L)
  public static SubLObject scoop_xml_delete_writer(final SubLObject stream, final SubLObject sme, final SubLObject fort_name)
  {
    return PrintLow.format( stream, $scoop_xml_template_delete$.getGlobalValue(), kb_paths.fort_name( sme ), fort_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 24653L)
  public static SubLObject scoop_xml_cycl_expression(final SubLObject expr)
  {
    if( expr.isSymbol() )
    {
      return expr;
    }
    if( NIL != constant_handles.constant_p( expr ) )
    {
      return expr;
    }
    if( NIL != nart_handles.nart_p( expr ) )
    {
      return el_utilities.copy_formula( narts_high.nart_el_formula( expr ) );
    }
    if( expr.isAtom() )
    {
      return expr;
    }
    return ConsesLow.cons( scoop_xml_cycl_expression( expr.first() ), scoop_xml_cycl_expression( expr.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25065L)
  public static SubLObject scoop_xml_assert_writer(final SubLObject stream, final SubLObject sme, final SubLObject assertion)
  {
    return PrintLow.format( stream, $scoop_xml_template_assert$.getGlobalValue(), kb_paths.fort_name( sme ), scoop_xml_cycl_expression( uncanonicalizer.assertion_el_formula( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25654L)
  public static SubLObject scoop_xml_unassert_writer(final SubLObject stream, final SubLObject sme, final SubLObject el_formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return PrintLow.format( stream, $scoop_xml_template_unassert$.getGlobalValue(), new SubLObject[] { kb_paths.fort_name( sme ), el_formula, Environment.get_network_name( UNPROVIDED ), $scoop_server_port$
        .getDynamicValue( thread )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject scoop_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject scoop_session_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $scoop_session_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject scoop_session_machine(final SubLObject v_object)
  {
    assert NIL != scoop_session_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject scoop_session_port(final SubLObject v_object)
  {
    assert NIL != scoop_session_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject scoop_session_tcp_server(final SubLObject v_object)
  {
    assert NIL != scoop_session_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject scoop_session_initialized_p(final SubLObject v_object)
  {
    assert NIL != scoop_session_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject _csetf_scoop_session_machine(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != scoop_session_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject _csetf_scoop_session_port(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != scoop_session_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject _csetf_scoop_session_tcp_server(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != scoop_session_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject _csetf_scoop_session_initialized_p(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != scoop_session_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject make_scoop_session(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $scoop_session_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw165$MACHINE ) )
      {
        _csetf_scoop_session_machine( v_new, current_value );
      }
      else if( pcase_var.eql( $kw96$PORT ) )
      {
        _csetf_scoop_session_port( v_new, current_value );
      }
      else if( pcase_var.eql( $kw166$TCP_SERVER ) )
      {
        _csetf_scoop_session_tcp_server( v_new, current_value );
      }
      else if( pcase_var.eql( $kw167$INITIALIZED_P ) )
      {
        _csetf_scoop_session_initialized_p( v_new, current_value );
      }
      else
      {
        Errors.error( $str168$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject visit_defstruct_scoop_session(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw169$BEGIN, $sym170$MAKE_SCOOP_SESSION, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw171$SLOT, $kw165$MACHINE, scoop_session_machine( obj ) );
    Functions.funcall( visitor_fn, obj, $kw171$SLOT, $kw96$PORT, scoop_session_port( obj ) );
    Functions.funcall( visitor_fn, obj, $kw171$SLOT, $kw166$TCP_SERVER, scoop_session_tcp_server( obj ) );
    Functions.funcall( visitor_fn, obj, $kw171$SLOT, $kw167$INITIALIZED_P, scoop_session_initialized_p( obj ) );
    Functions.funcall( visitor_fn, obj, $kw172$END, $sym170$MAKE_SCOOP_SESSION, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 25917L)
  public static SubLObject visit_defstruct_object_scoop_session_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_scoop_session( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 26100L)
  public static SubLObject scoop_session_initializedP(final SubLObject scoop_session)
  {
    return makeBoolean( NIL != scoop_session_p( scoop_session ) && NIL != tcp_server_utilities.tcp_server_p( scoop_session_tcp_server( scoop_session ) ) && NIL != scoop_session_initialized_p( scoop_session ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 26334L)
  public static SubLObject new_scoop_session(final SubLObject machine, final SubLObject port)
  {
    final SubLObject scoops = make_scoop_session( UNPROVIDED );
    _csetf_scoop_session_machine( scoops, machine );
    _csetf_scoop_session_port( scoops, port );
    return scoops;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 26542L)
  public static SubLObject restart_scoop_session(final SubLObject scoops)
  {
    shutdown_scoop_session( scoops );
    initialize_scoop_definitions();
    _csetf_scoop_session_tcp_server( scoops, tcp_server_utilities.enable_tcp_server( $kw2$SCOOP, scoop_session_port( scoops ) ) );
    _csetf_scoop_session_initialized_p( scoops, tcp_server_utilities.tcp_server_p( scoop_session_tcp_server( scoops ) ) );
    return scoop_session_initializedP( scoops );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 26915L)
  public static SubLObject initialize_scoop_session(final SubLObject machine, final SubLObject port)
  {
    final SubLObject scoops = new_scoop_session( machine, port );
    restart_scoop_session( scoops );
    return scoops;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-collaborator-scoop.lisp", position = 27077L)
  public static SubLObject shutdown_scoop_session(final SubLObject scoops)
  {
    tcp_server_utilities.disable_tcp_server( scoop_session_port( scoops ) );
    _csetf_scoop_session_tcp_server( scoops, NIL );
    _csetf_scoop_session_initialized_p( scoops, NIL );
    return scoops;
  }

  public static SubLObject declare_rkf_collaborator_scoop_file()
  {
    SubLFiles.declareFunction( me, "scoop_server_handler", "SCOOP-SERVER-HANDLER", 2, 0, false );
    SubLFiles.declareFunction( me, "scoop_server_top_level", "SCOOP-SERVER-TOP-LEVEL", 2, 0, false );
    SubLFiles.declareFunction( me, "initialize_scoop_definitions", "INITIALIZE-SCOOP-DEFINITIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "scoop_definition_emid_by_type", "SCOOP-DEFINITION-EMID-BY-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "scoop_trace", "SCOOP-TRACE", 1, 0, false );
    SubLFiles.declareFunction( me, "scoop_trace_display_trace_stack", "SCOOP-TRACE-DISPLAY-TRACE-STACK", 0, 0, false );
    SubLFiles.declareFunction( me, "scoop_server_handler_internal", "SCOOP-SERVER-HANDLER-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "scoop_process_invite_all", "SCOOP-PROCESS-INVITE-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "scoop_process_invitation", "SCOOP-PROCESS-INVITATION", 5, 0, false );
    SubLFiles.declareFunction( me, "new_scoop_message_packet", "NEW-SCOOP-MESSAGE-PACKET", 1, 1, false );
    SubLFiles.declareFunction( me, "get_scoop_message_packet_type", "GET-SCOOP-MESSAGE-PACKET-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_scoop_message_packet_arguments", "GET-SCOOP-MESSAGE-PACKET-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_scoop_message_packet_arg", "GET-SCOOP-MESSAGE-PACKET-ARG", 2, 1, false );
    SubLFiles.declareFunction( me, "scoop_schedule_outgoing_message_packet", "SCOOP-SCHEDULE-OUTGOING-MESSAGE-PACKET", 1, 0, false );
    SubLFiles.declareFunction( me, "scoop_fetch_next_outgoing_message_packet", "SCOOP-FETCH-NEXT-OUTGOING-MESSAGE-PACKET", 0, 0, false );
    SubLFiles.declareFunction( me, "scoop_schedule_login_message", "SCOOP-SCHEDULE-LOGIN-MESSAGE", 4, 0, false );
    SubLFiles.declareFunction( me, "scoop_schedule_logout_message", "SCOOP-SCHEDULE-LOGOUT-MESSAGE", 4, 0, false );
    SubLFiles.declareFunction( me, "scoop_schedule_create_message", "SCOOP-SCHEDULE-CREATE-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "scoop_schedule_kill_message", "SCOOP-SCHEDULE-KILL-MESSAGE", 3, 0, false );
    SubLFiles.declareFunction( me, "scoop_schedule_assert_message", "SCOOP-SCHEDULE-ASSERT-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "scoop_schedule_unassert_message", "SCOOP-SCHEDULE-UNASSERT-MESSAGE", 3, 0, false );
    SubLFiles.declareFunction( me, "scoop_schedule_trace_message", "SCOOP-SCHEDULE-TRACE-MESSAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "scoop_schedule_quit_message", "SCOOP-SCHEDULE-QUIT-MESSAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "scoop_message_forwarder", "SCOOP-MESSAGE-FORWARDER", 1, 1, false );
    SubLFiles.declareFunction( me, "scoop_spawn_listener", "SCOOP-SPAWN-LISTENER", 4, 0, false );
    SubLFiles.declareFunction( me, "scoop_reply_posting_listener", "SCOOP-REPLY-POSTING-LISTENER", 3, 0, false );
    SubLFiles.declareFunction( me, "read_scoop_server_request", "READ-SCOOP-SERVER-REQUEST", 1, 0, false );
    SubLFiles.declareFunction( me, "write_scoop_server_reaction", "WRITE-SCOOP-SERVER-REACTION", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_scoop_message_login", "RKF-SCOOP-MESSAGE-LOGIN", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_scoop_message_logout", "RKF-SCOOP-MESSAGE-LOGOUT", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_scoop_message_create", "RKF-SCOOP-MESSAGE-CREATE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_scoop_message_kill", "RKF-SCOOP-MESSAGE-KILL", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_scoop_message_assert", "RKF-SCOOP-MESSAGE-ASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_scoop_message_unassert", "RKF-SCOOP-MESSAGE-UNASSERT", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_login_message", "RKF-VIRB3IFY-LOGIN-MESSAGE", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_logout_message", "RKF-VIRB3IFY-LOGOUT-MESSAGE", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_create_message", "RKF-VIRB3IFY-CREATE-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_delete_message", "RKF-VIRB3IFY-DELETE-MESSAGE", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_assert_message", "RKF-VIRB3IFY-ASSERT-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_unassert_message", "RKF-VIRB3IFY-UNASSERT-MESSAGE", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_connection", "RKF-VIRB3IFY-CONNECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_mts", "RKF-VIRB3IFY-MTS", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_session_message", "RKF-VIRB3IFY-SESSION-MESSAGE", 5, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_constant_assemble_pieces", "RKF-VIRB3IFY-CONSTANT-ASSEMBLE-PIECES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_constant", "RKF-VIRB3IFY-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_expression", "RKF-VIRB3IFY-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_labeled_expression", "RKF-VIRB3IFY-LABELED-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_formula", "RKF-VIRB3IFY-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_mt", "RKF-VIRB3IFY-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_assertion_direction", "RKF-VIRB3IFY-ASSERTION-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_assertion_truth", "RKF-VIRB3IFY-ASSERTION-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_assertion_strength", "RKF-VIRB3IFY-ASSERTION-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_timestamp", "RKF-VIRB3IFY-TIMESTAMP", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_assertion_content", "RKF-VIRB3IFY-ASSERTION-CONTENT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_assertion", "RKF-VIRB3IFY-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_unassertion", "RKF-VIRB3IFY-UNASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_virb3ify_unassert_content", "RKF-VIRB3IFY-UNASSERT-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( me, "scoop_xml_login_writer", "SCOOP-XML-LOGIN-WRITER", 3, 0, false );
    SubLFiles.declareFunction( me, "scoop_xml_logout_writer", "SCOOP-XML-LOGOUT-WRITER", 3, 0, false );
    SubLFiles.declareFunction( me, "scoop_xml_create_writer", "SCOOP-XML-CREATE-WRITER", 3, 0, false );
    SubLFiles.declareFunction( me, "scoop_xml_delete_writer", "SCOOP-XML-DELETE-WRITER", 3, 0, false );
    SubLFiles.declareFunction( me, "scoop_xml_cycl_expression", "SCOOP-XML-CYCL-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "scoop_xml_assert_writer", "SCOOP-XML-ASSERT-WRITER", 3, 0, false );
    SubLFiles.declareFunction( me, "scoop_xml_unassert_writer", "SCOOP-XML-UNASSERT-WRITER", 3, 0, false );
    SubLFiles.declareFunction( me, "scoop_session_print_function_trampoline", "SCOOP-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "scoop_session_p", "SCOOP-SESSION-P", 1, 0, false );
    new $scoop_session_p$UnaryFunction();
    SubLFiles.declareFunction( me, "scoop_session_machine", "SCOOP-SESSION-MACHINE", 1, 0, false );
    SubLFiles.declareFunction( me, "scoop_session_port", "SCOOP-SESSION-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "scoop_session_tcp_server", "SCOOP-SESSION-TCP-SERVER", 1, 0, false );
    SubLFiles.declareFunction( me, "scoop_session_initialized_p", "SCOOP-SESSION-INITIALIZED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_scoop_session_machine", "_CSETF-SCOOP-SESSION-MACHINE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_scoop_session_port", "_CSETF-SCOOP-SESSION-PORT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_scoop_session_tcp_server", "_CSETF-SCOOP-SESSION-TCP-SERVER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_scoop_session_initialized_p", "_CSETF-SCOOP-SESSION-INITIALIZED-P", 2, 0, false );
    SubLFiles.declareFunction( me, "make_scoop_session", "MAKE-SCOOP-SESSION", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_scoop_session", "VISIT-DEFSTRUCT-SCOOP-SESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_scoop_session_method", "VISIT-DEFSTRUCT-OBJECT-SCOOP-SESSION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "scoop_session_initializedP", "SCOOP-SESSION-INITIALIZED?", 1, 0, false );
    SubLFiles.declareFunction( me, "new_scoop_session", "NEW-SCOOP-SESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "restart_scoop_session", "RESTART-SCOOP-SESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_scoop_session", "INITIALIZE-SCOOP-SESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "shutdown_scoop_session", "SHUTDOWN-SCOOP-SESSION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_collaborator_scoop_file()
  {
    $within_scoop_server$ = SubLFiles.defparameter( "*WITHIN-SCOOP-SERVER*", NIL );
    $scoop_server_port$ = SubLFiles.defparameter( "*SCOOP-SERVER-PORT*", $int0$3599 );
    $scoop_server_machine$ = SubLFiles.defparameter( "*SCOOP-SERVER-MACHINE*", $str1$BOOTLEG_CYC_COM );
    $use_virb3_for_scoop$ = SubLFiles.defparameter( "*USE-VIRB3-FOR-SCOOP*", NIL );
    $scoop_appname$ = SubLFiles.deflexical( "*SCOOP-APPNAME*", $str8$KRAKEN );
    $scoop_definitions$ = SubLFiles.deflexical( "*SCOOP-DEFINITIONS*", ( maybeDefault( $sym9$_SCOOP_DEFINITIONS_, $scoop_definitions$, NIL ) ) );
    $scoop_members$ = SubLFiles.deflexical( "*SCOOP-MEMBERS*", ( maybeDefault( $sym10$_SCOOP_MEMBERS_, $scoop_members$, NIL ) ) );
    $scoop_incoming_queue$ = SubLFiles.deflexical( "*SCOOP-INCOMING-QUEUE*", process_utilities.new_ipc_queue( $str29$SCOOP_Incoming_VirB3_Queue ) );
    $scoop_outgoing_queue$ = SubLFiles.deflexical( "*SCOOP-OUTGOING-QUEUE*", process_utilities.new_ipc_queue( $str30$SCOOP_Outgoing_VirB3_Queue ) );
    $scoop_sid$ = SubLFiles.defparameter( "*SCOOP-SID*", NIL );
    $scoop_tid$ = SubLFiles.defparameter( "*SCOOP-TID*", NIL );
    $scoop_transaction_stack$ = SubLFiles.defparameter( "*SCOOP-TRANSACTION-STACK*", NIL );
    $rkf_scoop_associate_machine$ = SubLFiles.deflexical( "*RKF-SCOOP-ASSOCIATE-MACHINE*", $str92$nautilus_cyc_com );
    $rkf_scoop_associate_port$ = SubLFiles.deflexical( "*RKF-SCOOP-ASSOCIATE-PORT*", $int93$3621 );
    $scoop_xml_newline$ = SubLFiles.deflexical( "*SCOOP-XML-NEWLINE*", Strings.make_string( ONE_INTEGER, Characters.CHAR_newline ) );
    $scoop_xml_template_login$ = SubLFiles.deflexical( "*SCOOP-XML-TEMPLATE-LOGIN*", Sequences.cconcatenate( $str129$__xml_version__1_0__encoding__UTF, new SubLObject[] { $str130$_SCOOP_, $str131$_action_login__action_,
      $str132$_user__A__user_, $str133$_microTheory__A__microTheory_, $str134$_clientAddress__A__clientAddress_, $str135$_clientPort__A__clientPort_, $str136$__SCOOP_
    } ) );
    $scoop_xml_template_logout$ = SubLFiles.deflexical( "*SCOOP-XML-TEMPLATE-LOGOUT*", Sequences.cconcatenate( $str129$__xml_version__1_0__encoding__UTF, new SubLObject[] { $str130$_SCOOP_,
      $str137$_action_logout__action_, $str132$_user__A__user_, $str133$_microTheory__A__microTheory_, $str134$_clientAddress__A__clientAddress_, $str135$_clientPort__A__clientPort_, $str136$__SCOOP_
    } ) );
    $scoop_xml_template_create$ = SubLFiles.deflexical( "*SCOOP-XML-TEMPLATE-CREATE*", Sequences.cconcatenate( $str129$__xml_version__1_0__encoding__UTF, new SubLObject[] { $str130$_SCOOP_,
      $str138$_action_create__action_, $str132$_user__A__user_, $str139$_constant__A__constant_, $str136$__SCOOP_
    } ) );
    $scoop_xml_template_delete$ = SubLFiles.deflexical( "*SCOOP-XML-TEMPLATE-DELETE*", Sequences.cconcatenate( $str129$__xml_version__1_0__encoding__UTF, new SubLObject[] { $str130$_SCOOP_,
      $str140$_action_delete__action_, $str132$_user__A__user_, $str139$_constant__A__constant_, $str136$__SCOOP_
    } ) );
    $scoop_xml_template_assert$ = SubLFiles.deflexical( "*SCOOP-XML-TEMPLATE-ASSERT*", Sequences.cconcatenate( $str129$__xml_version__1_0__encoding__UTF, new SubLObject[] { $str130$_SCOOP_,
      $str141$_action_assert__action_, $str132$_user__A__user_, $str142$_statement_, $str143$_A, $str144$__statement_, $str136$__SCOOP_
    } ) );
    $scoop_xml_template_unassert$ = SubLFiles.deflexical( "*SCOOP-XML-TEMPLATE-UNASSERT*", Sequences.cconcatenate( $str129$__xml_version__1_0__encoding__UTF, new SubLObject[] { $str130$_SCOOP_,
      $str145$_action_unassert__action_, $str132$_user__A__user_, $str146$_statement__A__statement_, $str134$_clientAddress__A__clientAddress_, $str147$_clientPort__D__clientPort_, $str136$__SCOOP_
    } ) );
    $dtp_scoop_session$ = SubLFiles.defconstant( "*DTP-SCOOP-SESSION*", $sym148$SCOOP_SESSION );
    return NIL;
  }

  public static SubLObject setup_rkf_collaborator_scoop_file()
  {
    tcp_server_utilities.register_tcp_server_type( $kw2$SCOOP, $sym3$SCOOP_SERVER_HANDLER, $kw4$TEXT );
    subl_macro_promotions.declare_defglobal( $sym9$_SCOOP_DEFINITIONS_ );
    subl_macro_promotions.declare_defglobal( $sym10$_SCOOP_MEMBERS_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_scoop_session$.getGlobalValue(), Symbols.symbol_function( $sym155$SCOOP_SESSION_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list156 );
    Structures.def_csetf( $sym157$SCOOP_SESSION_MACHINE, $sym158$_CSETF_SCOOP_SESSION_MACHINE );
    Structures.def_csetf( $sym159$SCOOP_SESSION_PORT, $sym160$_CSETF_SCOOP_SESSION_PORT );
    Structures.def_csetf( $sym161$SCOOP_SESSION_TCP_SERVER, $sym162$_CSETF_SCOOP_SESSION_TCP_SERVER );
    Structures.def_csetf( $sym163$SCOOP_SESSION_INITIALIZED_P, $sym164$_CSETF_SCOOP_SESSION_INITIALIZED_P );
    Equality.identity( $sym148$SCOOP_SESSION );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_scoop_session$.getGlobalValue(), Symbols.symbol_function( $sym173$VISIT_DEFSTRUCT_OBJECT_SCOOP_SESSION_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_collaborator_scoop_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_collaborator_scoop_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_collaborator_scoop_file();
  }
  static
  {
    me = new rkf_collaborator_scoop();
    $within_scoop_server$ = null;
    $scoop_server_port$ = null;
    $scoop_server_machine$ = null;
    $use_virb3_for_scoop$ = null;
    $scoop_appname$ = null;
    $scoop_definitions$ = null;
    $scoop_members$ = null;
    $scoop_incoming_queue$ = null;
    $scoop_outgoing_queue$ = null;
    $scoop_sid$ = null;
    $scoop_tid$ = null;
    $scoop_transaction_stack$ = null;
    $rkf_scoop_associate_machine$ = null;
    $rkf_scoop_associate_port$ = null;
    $scoop_xml_newline$ = null;
    $scoop_xml_template_login$ = null;
    $scoop_xml_template_logout$ = null;
    $scoop_xml_template_create$ = null;
    $scoop_xml_template_delete$ = null;
    $scoop_xml_template_assert$ = null;
    $scoop_xml_template_unassert$ = null;
    $dtp_scoop_session$ = null;
    $int0$3599 = makeInteger( 3599 );
    $str1$BOOTLEG_CYC_COM = makeString( "BOOTLEG.CYC.COM" );
    $kw2$SCOOP = makeKeyword( "SCOOP" );
    $sym3$SCOOP_SERVER_HANDLER = makeSymbol( "SCOOP-SERVER-HANDLER" );
    $kw4$TEXT = makeKeyword( "TEXT" );
    $str5$CYC = makeString( "CYC" );
    $sym6$DOUBLE_FLOAT = makeSymbol( "DOUBLE-FLOAT" );
    $kw7$SCOOP_QUIT = makeKeyword( "SCOOP-QUIT" );
    $str8$KRAKEN = makeString( "KRAKEN" );
    $sym9$_SCOOP_DEFINITIONS_ = makeSymbol( "*SCOOP-DEFINITIONS*" );
    $sym10$_SCOOP_MEMBERS_ = makeSymbol( "*SCOOP-MEMBERS*" );
    $kw11$LOGIN = makeKeyword( "LOGIN" );
    $kw12$EMNAME = makeKeyword( "EMNAME" );
    $str13$SCOOP_Login_Monitor = makeString( "SCOOP Login Monitor" );
    $kw14$APPNAME = makeKeyword( "APPNAME" );
    $kw15$EMID = makeKeyword( "EMID" );
    $kw16$LOGOUT = makeKeyword( "LOGOUT" );
    $str17$SCOOP_Logout_Monitor = makeString( "SCOOP Logout Monitor" );
    $kw18$CREATE = makeKeyword( "CREATE" );
    $str19$SCOOP_Create_Monitor = makeString( "SCOOP Create Monitor" );
    $kw20$DELETE = makeKeyword( "DELETE" );
    $str21$SCOOP_Delete_Monitor = makeString( "SCOOP Delete Monitor" );
    $kw22$ASSERT = makeKeyword( "ASSERT" );
    $str23$SCOOP_Assert_Monitor = makeString( "SCOOP Assert Monitor" );
    $kw24$UNASSERT = makeKeyword( "UNASSERT" );
    $str25$SCOOP_Unassert_Monitor = makeString( "SCOOP Unassert Monitor" );
    $kw26$CONFLICT = makeKeyword( "CONFLICT" );
    $str27$SCOOP_Conflict_Voter = makeString( "SCOOP Conflict Voter" );
    $sym28$LISTP = makeSymbol( "LISTP" );
    $str29$SCOOP_Incoming_VirB3_Queue = makeString( "SCOOP Incoming VirB3 Queue" );
    $str30$SCOOP_Outgoing_VirB3_Queue = makeString( "SCOOP Outgoing VirB3 Queue" );
    $str31$SCOOP___A__ = makeString( "SCOOP: ~A~%" );
    $list32 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "EMNAME" ), makeSymbol( "APPNAME" ), makeSymbol( "EMID" ) );
    $list33 = ConsesLow.list( makeKeyword( "EMNAME" ), makeKeyword( "APPNAME" ), makeKeyword( "EMID" ) );
    $kw34$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw35$INVITE = makeKeyword( "INVITE" );
    $kw36$SID = makeKeyword( "SID" );
    $kw37$TID = makeKeyword( "TID" );
    $kw38$MESSAGE_TYPE = makeKeyword( "MESSAGE-TYPE" );
    $kw39$MESSAGE_ARGS = makeKeyword( "MESSAGE-ARGS" );
    $kw40$SME = makeKeyword( "SME" );
    $kw41$DOMAIN_MT = makeKeyword( "DOMAIN-MT" );
    $kw42$LEXICAL_MT = makeKeyword( "LEXICAL-MT" );
    $kw43$PARSING_MT = makeKeyword( "PARSING-MT" );
    $kw44$TERM = makeKeyword( "TERM" );
    $kw45$TERM_NAME = makeKeyword( "TERM-NAME" );
    $kw46$TERM_GUID = makeKeyword( "TERM-GUID" );
    $kw47$WHO_DUNNIT = makeKeyword( "WHO-DUNNIT" );
    $kw48$ASSERTION = makeKeyword( "ASSERTION" );
    $kw49$EL_FORMULA = makeKeyword( "EL-FORMULA" );
    $kw50$MT = makeKeyword( "MT" );
    $kw51$TRACE = makeKeyword( "TRACE" );
    $kw52$QUIT = makeKeyword( "QUIT" );
    $list53 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "SME" ), makeSymbol( "DOMAIN-MT" ), makeSymbol( "LEXICAL-MT" ), makeSymbol( "PARSING-MT" ) );
    $list54 = ConsesLow.list( makeKeyword( "SME" ), makeKeyword( "DOMAIN-MT" ), makeKeyword( "LEXICAL-MT" ), makeKeyword( "PARSING-MT" ) );
    $list55 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "TERM" ) );
    $list56 = ConsesLow.list( makeKeyword( "TERM" ) );
    $list57 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "TERM-NAME" ), makeSymbol( "TERM-GUID" ), makeSymbol( "WHO-DUNNIT" ) );
    $list58 = ConsesLow.list( makeKeyword( "TERM-NAME" ), makeKeyword( "TERM-GUID" ), makeKeyword( "WHO-DUNNIT" ) );
    $list59 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "ASSERTION" ) );
    $list60 = ConsesLow.list( makeKeyword( "ASSERTION" ) );
    $list61 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "EL-FORMULA" ), makeSymbol( "MT" ), makeSymbol( "WHO-DUNNIT" ) );
    $list62 = ConsesLow.list( makeKeyword( "EL-FORMULA" ), makeKeyword( "MT" ), makeKeyword( "WHO-DUNNIT" ) );
    $str63$Protocol_violation____cannot_hand = makeString( "Protocol violation -- cannot handle message packet ~A." );
    $kw64$DONE = makeKeyword( "DONE" );
    $str65$Scoop_Listener = makeString( "Scoop Listener" );
    $sym66$SCOOP_REPLY_POSTING_LISTENER = makeSymbol( "SCOOP-REPLY-POSTING-LISTENER" );
    $kw67$ERROR = makeKeyword( "ERROR" );
    $str68$The_connection_with_SCOOP_dropped = makeString( "The connection with SCOOP dropped." );
    $kw69$EOF = makeKeyword( "EOF" );
    $kw70$DISCONNECT = makeKeyword( "DISCONNECT" );
    $str71$Scoop_errored_out_and_generated_a = makeString( "Scoop errored out and generated a disconnect message." );
    $str72$Protocol_violation____received__A = makeString( "Protocol violation -- received ~A instead of a valid message." );
    $kw73$ACCEPT = makeKeyword( "ACCEPT" );
    $str74$SCOOP_accepted_with__A__ = makeString( "SCOOP accepted with ~A~%" );
    $kw75$PROPOSE = makeKeyword( "PROPOSE" );
    $kw76$CONTRIBUTE = makeKeyword( "CONTRIBUTE" );
    $kw77$STIMULATE = makeKeyword( "STIMULATE" );
    $kw78$PROPID = makeKeyword( "PROPID" );
    $kw79$AAL = makeKeyword( "AAL" );
    $sym80$_ACTION = makeSymbol( "?ACTION" );
    $str81$UIA_START_SESSION = makeString( "UIA-START-SESSION" );
    $sym82$_THE_POSTING = makeSymbol( "?THE-POSTING" );
    $str83$POSTING = makeString( "POSTING" );
    $str84$UIA_STOP_SESSION = makeString( "UIA-STOP-SESSION" );
    $str85$UIA_CREATE = makeString( "UIA-CREATE" );
    $str86$UIA_KILL = makeString( "UIA-KILL" );
    $str87$UIA_ASSERT = makeString( "UIA-ASSERT" );
    $str88$UIA_UNASSERT = makeString( "UIA-UNASSERT" );
    $kw89$CREATOR = makeKeyword( "CREATOR" );
    $kw90$XML_SUMMARY = makeKeyword( "XML-SUMMARY" );
    $kw91$KILL = makeKeyword( "KILL" );
    $str92$nautilus_cyc_com = makeString( "nautilus.cyc.com" );
    $int93$3621 = makeInteger( 3621 );
    $kw94$CONNECTION = makeKeyword( "CONNECTION" );
    $kw95$ADDRESS = makeKeyword( "ADDRESS" );
    $kw96$PORT = makeKeyword( "PORT" );
    $kw97$MTS = makeKeyword( "MTS" );
    $kw98$INTERACTION_DOMAIN_MT = makeKeyword( "INTERACTION-DOMAIN-MT" );
    $kw99$INTERACTION_LEXICAL_MT = makeKeyword( "INTERACTION-LEXICAL-MT" );
    $kw100$INTERACTION_PARSING_MT = makeKeyword( "INTERACTION-PARSING-MT" );
    $kw101$SESSION = makeKeyword( "SESSION" );
    $kw102$CONSTANT = makeKeyword( "CONSTANT" );
    $kw103$NAME = makeKeyword( "NAME" );
    $kw104$GUID = makeKeyword( "GUID" );
    $kw105$NART = makeKeyword( "NART" );
    $kw106$FORMULA = makeKeyword( "FORMULA" );
    $kw107$FORWARD = makeKeyword( "FORWARD" );
    $const108$Forward_AssertionDirection = constant_handles.reader_make_constant_shell( makeString( "Forward-AssertionDirection" ) );
    $kw109$BACKWARD = makeKeyword( "BACKWARD" );
    $const110$Backward_AssertionDirection = constant_handles.reader_make_constant_shell( makeString( "Backward-AssertionDirection" ) );
    $kw111$CODE = makeKeyword( "CODE" );
    $const112$Code_AssertionDirection = constant_handles.reader_make_constant_shell( makeString( "Code-AssertionDirection" ) );
    $kw113$DIRECTION = makeKeyword( "DIRECTION" );
    $kw114$TRUE = makeKeyword( "TRUE" );
    $const115$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $kw116$FALSE = makeKeyword( "FALSE" );
    $const117$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $kw118$UNKNOWN = makeKeyword( "UNKNOWN" );
    $const119$Unknown_HLTruthValue = constant_handles.reader_make_constant_shell( makeString( "Unknown-HLTruthValue" ) );
    $kw120$TRUTH = makeKeyword( "TRUTH" );
    $kw121$DEFAULT = makeKeyword( "DEFAULT" );
    $const122$Default_JustificationStrength = constant_handles.reader_make_constant_shell( makeString( "Default-JustificationStrength" ) );
    $kw123$MONOTONIC = makeKeyword( "MONOTONIC" );
    $const124$Monotonic_JustificationStrength = constant_handles.reader_make_constant_shell( makeString( "Monotonic-JustificationStrength" ) );
    $kw125$STRENGTH = makeKeyword( "STRENGTH" );
    $kw126$TIMESTAMP = makeKeyword( "TIMESTAMP" );
    $kw127$DATE = makeKeyword( "DATE" );
    $kw128$SECS = makeKeyword( "SECS" );
    $str129$__xml_version__1_0__encoding__UTF = makeString( "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" );
    $str130$_SCOOP_ = makeString( "<SCOOP>" );
    $str131$_action_login__action_ = makeString( "<action>login</action>" );
    $str132$_user__A__user_ = makeString( "<user>~A</user>" );
    $str133$_microTheory__A__microTheory_ = makeString( "<microTheory>~A</microTheory>" );
    $str134$_clientAddress__A__clientAddress_ = makeString( "<clientAddress>~A</clientAddress>" );
    $str135$_clientPort__A__clientPort_ = makeString( "<clientPort>~A</clientPort>" );
    $str136$__SCOOP_ = makeString( "</SCOOP>" );
    $str137$_action_logout__action_ = makeString( "<action>logout</action>" );
    $str138$_action_create__action_ = makeString( "<action>create</action>" );
    $str139$_constant__A__constant_ = makeString( "<constant>~A</constant>" );
    $str140$_action_delete__action_ = makeString( "<action>delete</action>" );
    $str141$_action_assert__action_ = makeString( "<action>assert</action>" );
    $str142$_statement_ = makeString( "<statement>" );
    $str143$_A = makeString( "~A" );
    $str144$__statement_ = makeString( "</statement>" );
    $str145$_action_unassert__action_ = makeString( "<action>unassert</action>" );
    $str146$_statement__A__statement_ = makeString( "<statement>~A</statement>" );
    $str147$_clientPort__D__clientPort_ = makeString( "<clientPort>~D</clientPort>" );
    $sym148$SCOOP_SESSION = makeSymbol( "SCOOP-SESSION" );
    $sym149$SCOOP_SESSION_P = makeSymbol( "SCOOP-SESSION-P" );
    $list150 = ConsesLow.list( makeSymbol( "MACHINE" ), makeSymbol( "PORT" ), makeSymbol( "TCP-SERVER" ), makeSymbol( "INITIALIZED-P" ) );
    $list151 = ConsesLow.list( makeKeyword( "MACHINE" ), makeKeyword( "PORT" ), makeKeyword( "TCP-SERVER" ), makeKeyword( "INITIALIZED-P" ) );
    $list152 = ConsesLow.list( makeSymbol( "SCOOP-SESSION-MACHINE" ), makeSymbol( "SCOOP-SESSION-PORT" ), makeSymbol( "SCOOP-SESSION-TCP-SERVER" ), makeSymbol( "SCOOP-SESSION-INITIALIZED-P" ) );
    $list153 = ConsesLow.list( makeSymbol( "_CSETF-SCOOP-SESSION-MACHINE" ), makeSymbol( "_CSETF-SCOOP-SESSION-PORT" ), makeSymbol( "_CSETF-SCOOP-SESSION-TCP-SERVER" ), makeSymbol(
        "_CSETF-SCOOP-SESSION-INITIALIZED-P" ) );
    $sym154$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym155$SCOOP_SESSION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SCOOP-SESSION-PRINT-FUNCTION-TRAMPOLINE" );
    $list156 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SCOOP-SESSION-P" ) );
    $sym157$SCOOP_SESSION_MACHINE = makeSymbol( "SCOOP-SESSION-MACHINE" );
    $sym158$_CSETF_SCOOP_SESSION_MACHINE = makeSymbol( "_CSETF-SCOOP-SESSION-MACHINE" );
    $sym159$SCOOP_SESSION_PORT = makeSymbol( "SCOOP-SESSION-PORT" );
    $sym160$_CSETF_SCOOP_SESSION_PORT = makeSymbol( "_CSETF-SCOOP-SESSION-PORT" );
    $sym161$SCOOP_SESSION_TCP_SERVER = makeSymbol( "SCOOP-SESSION-TCP-SERVER" );
    $sym162$_CSETF_SCOOP_SESSION_TCP_SERVER = makeSymbol( "_CSETF-SCOOP-SESSION-TCP-SERVER" );
    $sym163$SCOOP_SESSION_INITIALIZED_P = makeSymbol( "SCOOP-SESSION-INITIALIZED-P" );
    $sym164$_CSETF_SCOOP_SESSION_INITIALIZED_P = makeSymbol( "_CSETF-SCOOP-SESSION-INITIALIZED-P" );
    $kw165$MACHINE = makeKeyword( "MACHINE" );
    $kw166$TCP_SERVER = makeKeyword( "TCP-SERVER" );
    $kw167$INITIALIZED_P = makeKeyword( "INITIALIZED-P" );
    $str168$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw169$BEGIN = makeKeyword( "BEGIN" );
    $sym170$MAKE_SCOOP_SESSION = makeSymbol( "MAKE-SCOOP-SESSION" );
    $kw171$SLOT = makeKeyword( "SLOT" );
    $kw172$END = makeKeyword( "END" );
    $sym173$VISIT_DEFSTRUCT_OBJECT_SCOOP_SESSION_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SCOOP-SESSION-METHOD" );
  }

  public static final class $scoop_session_native
      extends
        SubLStructNative
  {
    public SubLObject $machine;
    public SubLObject $port;
    public SubLObject $tcp_server;
    public SubLObject $initialized_p;
    private static final SubLStructDeclNative structDecl;

    public $scoop_session_native()
    {
      this.$machine = CommonSymbols.NIL;
      this.$port = CommonSymbols.NIL;
      this.$tcp_server = CommonSymbols.NIL;
      this.$initialized_p = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $scoop_session_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$machine;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$port;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$tcp_server;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$initialized_p;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$machine = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$port = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$tcp_server = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$initialized_p = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $scoop_session_native.class, $sym148$SCOOP_SESSION, $sym149$SCOOP_SESSION_P, $list150, $list151, new String[] { "$machine", "$port", "$tcp_server", "$initialized_p"
      }, $list152, $list153, $sym154$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $scoop_session_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $scoop_session_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SCOOP-SESSION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return scoop_session_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 444 ms
 * 
 */