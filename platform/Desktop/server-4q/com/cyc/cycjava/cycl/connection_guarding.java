package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class connection_guarding
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.connection_guarding";
  public static final String myFingerPrint = "ec11866ad843a3375242cd5a0d7b458e824fe94d938652a2d99dc5e51aeb6c8f";
  private static final SubLSymbol $sym0$TASK_INFO;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$PIF;
  private static final SubLSymbol $sym4$NULL;
  private static final SubLSymbol $sym5$WITH_GUARDIAN_REQUEST;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$PROGN;
  private static final SubLSymbol $sym9$WITH_TERMINATION_ON_LOST_CONNECTION;
  private static final SubLList $list10;
  private static final SubLString $str11$Execute_the_body_under_the_assump;
  private static final SubLSymbol $sym12$GET_CURRENT_TASK_PROCESSOR_INFO_HELPER;
  private static final SubLSymbol $sym13$TASK_INFO_HAS_VALID_SOCKET_;
  private static final SubLSymbol $sym14$ABANDON_CURRENT_TASK_DUE_TO_SOCKET_LOSS;
  private static final SubLSymbol $kw15$ABORT;

  @SubLTranslatedFile.SubL(source = "cycl/connection-guarding.lisp", position = 896L)
  public static SubLObject with_termination_on_lost_connection(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject task_info = $sym0$TASK_INFO;
    return ConsesLow.list( $sym1$CLET, ConsesLow.list( reader.bq_cons( task_info, $list2 ) ), ConsesLow.list( $sym3$PIF, ConsesLow.list( $sym4$NULL, task_info ), ConsesLow.listS( $sym5$WITH_GUARDIAN_REQUEST, ConsesLow
        .listS( $list6, task_info, $list7 ), ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym8$PROGN, ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/connection-guarding.lisp", position = 1390L)
  public static SubLObject get_current_task_processor_info_helper()
  {
    return task_processor.get_current_task_processor_info();
  }

  @SubLTranslatedFile.SubL(source = "cycl/connection-guarding.lisp", position = 1544L)
  public static SubLObject task_info_has_valid_socketP(final SubLObject task_info)
  {
    return valid_java_socket_p( get_socket_for_current_task_request( task_info ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/connection-guarding.lisp", position = 1801L)
  public static SubLObject abandon_current_task_due_to_socket_loss(final SubLObject task_info)
  {
    final SubLObject task_giveback_info = task_processor.get_task_info_giveback_info( task_info );
    final SubLObject task_id = task_processor.get_task_info_id( task_info );
    task_processor.terminate_active_task_process( task_id, task_giveback_info, $kw15$ABORT );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/connection-guarding.lisp", position = 2168L)
  public static SubLObject get_socket_for_current_task_request(final SubLObject task_info)
  {
    SubLObject socket = NIL;
    if( NIL != task_info )
    {
      final SubLObject uuid_string = task_processor.get_task_info_giveback_info( task_info );
      socket = java_api_kernel.java_api_socket_out_stream( uuid_string );
    }
    return socket;
  }

  @SubLTranslatedFile.SubL(source = "cycl/connection-guarding.lisp", position = 2437L)
  public static SubLObject valid_java_socket_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isStream() && NIL != streams_high.output_stream_p( v_object ) );
  }

  public static SubLObject declare_connection_guarding_file()
  {
    SubLFiles.declareMacro( me, "with_termination_on_lost_connection", "WITH-TERMINATION-ON-LOST-CONNECTION" );
    SubLFiles.declareFunction( me, "get_current_task_processor_info_helper", "GET-CURRENT-TASK-PROCESSOR-INFO-HELPER", 0, 0, false );
    SubLFiles.declareFunction( me, "task_info_has_valid_socketP", "TASK-INFO-HAS-VALID-SOCKET?", 1, 0, false );
    SubLFiles.declareFunction( me, "abandon_current_task_due_to_socket_loss", "ABANDON-CURRENT-TASK-DUE-TO-SOCKET-LOSS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_socket_for_current_task_request", "GET-SOCKET-FOR-CURRENT-TASK-REQUEST", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_java_socket_p", "VALID-JAVA-SOCKET-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_connection_guarding_file()
  {
    return NIL;
  }

  public static SubLObject setup_connection_guarding_file()
  {
    utilities_macros.register_cyc_api_macro( $sym9$WITH_TERMINATION_ON_LOST_CONNECTION, $list10, $str11$Execute_the_body_under_the_assump );
    access_macros.register_macro_helper( $sym12$GET_CURRENT_TASK_PROCESSOR_INFO_HELPER, $sym9$WITH_TERMINATION_ON_LOST_CONNECTION );
    access_macros.register_macro_helper( $sym13$TASK_INFO_HAS_VALID_SOCKET_, $sym9$WITH_TERMINATION_ON_LOST_CONNECTION );
    access_macros.register_macro_helper( $sym14$ABANDON_CURRENT_TASK_DUE_TO_SOCKET_LOSS, $sym9$WITH_TERMINATION_ON_LOST_CONNECTION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_connection_guarding_file();
  }

  @Override
  public void initializeVariables()
  {
    init_connection_guarding_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_connection_guarding_file();
  }
  static
  {
    me = new connection_guarding();
    $sym0$TASK_INFO = makeUninternedSymbol( "TASK-INFO" );
    $sym1$CLET = makeSymbol( "CLET" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "GET-CURRENT-TASK-PROCESSOR-INFO-HELPER" ) ) );
    $sym3$PIF = makeSymbol( "PIF" );
    $sym4$NULL = makeSymbol( "NULL" );
    $sym5$WITH_GUARDIAN_REQUEST = makeSymbol( "WITH-GUARDIAN-REQUEST" );
    $list6 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TASK-INFO-HAS-VALID-SOCKET?" ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ABANDON-CURRENT-TASK-DUE-TO-SOCKET-LOSS" ) ) );
    $sym8$PROGN = makeSymbol( "PROGN" );
    $sym9$WITH_TERMINATION_ON_LOST_CONNECTION = makeSymbol( "WITH-TERMINATION-ON-LOST-CONNECTION" );
    $list10 = ConsesLow.list( makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str11$Execute_the_body_under_the_assump = makeString( "Execute the body under the assumption that " );
    $sym12$GET_CURRENT_TASK_PROCESSOR_INFO_HELPER = makeSymbol( "GET-CURRENT-TASK-PROCESSOR-INFO-HELPER" );
    $sym13$TASK_INFO_HAS_VALID_SOCKET_ = makeSymbol( "TASK-INFO-HAS-VALID-SOCKET?" );
    $sym14$ABANDON_CURRENT_TASK_DUE_TO_SOCKET_LOSS = makeSymbol( "ABANDON-CURRENT-TASK-DUE-TO-SOCKET-LOSS" );
    $kw15$ABORT = makeKeyword( "ABORT" );
  }
}
/*
 * 
 * Total time: 92 ms
 * 
 */