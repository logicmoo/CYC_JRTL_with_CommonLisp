/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.cycjava.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.operation_queues;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;

public  final class transcript_server extends SubLTranslatedFile {

  //// Constructor

  private transcript_server() {}
  public static final SubLFile me = new transcript_server();
  public static final String myName = "com.cyc.cycjava.cycl.transcript_server";

  //// Definitions

  /** Accessor for *use-transcript-server*. */
  @SubL(source = "cycl/transcript-server.lisp", position = 1083) 
  public static final SubLObject use_transcript_server() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return system_parameters.$use_transcript_server$.getDynamicValue(thread);
    }
  }

  /** Timeout value (in seconds) when connecting with the transcript server. */
  @SubL(source = "cycl/transcript-server.lisp", position = 1199) 
  private static SubLSymbol $master_transcript_server_connection_timeout$ = null;

  /** The version of the transcript server protocol
   0 = initial version
   1 = current version */
  @SubL(source = "cycl/transcript-server.lisp", position = 6773) 
  public static SubLSymbol $transcript_server_protocol_version$ = null;

  public static final SubLObject declare_transcript_server_file() {
    declareFunction(myName, "use_transcript_server", "USE-TRANSCRIPT-SERVER", 0, 0, false);
    //declareMacro(myName, "with_transcript_server_connection", "WITH-TRANSCRIPT-SERVER-CONNECTION");
    //declareMacro(myName, "transcript_server_message_body", "TRANSCRIPT-SERVER-MESSAGE-BODY");
    //declareFunction(myName, "transcript_server_message_startup", "TRANSCRIPT-SERVER-MESSAGE-STARTUP", 1, 0, false);
    //declareFunction(myName, "transcript_server_message_shutdown", "TRANSCRIPT-SERVER-MESSAGE-SHUTDOWN", 1, 0, false);
    //declareFunction(myName, "transcript_server_terpri", "TRANSCRIPT-SERVER-TERPRI", 1, 1, false);
    //declareFunction(myName, "transcript_server_read_line", "TRANSCRIPT-SERVER-READ-LINE", 1, 0, false);
    //declareFunction(myName, "transcript_server_reply_verify", "TRANSCRIPT-SERVER-REPLY-VERIFY", 2, 0, false);
    //declareFunction(myName, "ts_ack_server_connection", "TS-ACK-SERVER-CONNECTION", 1, 0, false);
    //declareFunction(myName, "ts_send_set_image_message", "TS-SEND-SET-IMAGE-MESSAGE", 1, 0, false);
    //declareFunction(myName, "ts_send_set_kb_message", "TS-SEND-SET-KB-MESSAGE", 1, 0, false);
    //declareFunction(myName, "ts_send_set_op_message", "TS-SEND-SET-OP-MESSAGE", 1, 0, false);
    //declareFunction(myName, "ts_send_how_many_ops_message", "TS-SEND-HOW-MANY-OPS-MESSAGE", 2, 0, false);
    //declareFunction(myName, "ts_send_send_ops_begin_message", "TS-SEND-SEND-OPS-BEGIN-MESSAGE", 2, 0, false);
    //declareFunction(myName, "ts_send_send_ops_op", "TS-SEND-SEND-OPS-OP", 2, 0, false);
    //declareFunction(myName, "ts_send_send_ops_end_message", "TS-SEND-SEND-OPS-END-MESSAGE", 1, 0, false);
    //declareFunction(myName, "ts_read_send_ops_reply", "TS-READ-SEND-OPS-REPLY", 1, 0, false);
    //declareFunction(myName, "ts_send_get_ops_message", "TS-SEND-GET-OPS-MESSAGE", 1, 0, false);
    //declareFunction(myName, "ts_send_quit_message", "TS-SEND-QUIT-MESSAGE", 1, 0, false);
    //declareFunction(myName, "transcript_server_connection_check", "TRANSCRIPT-SERVER-CONNECTION-CHECK", 0, 0, false);
    //declareFunction(myName, "transcript_server_check", "TRANSCRIPT-SERVER-CHECK", 0, 0, false);
    //declareFunction(myName, "total_master_transcript_operations", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS", 0, 1, false);
    //declareFunction(myName, "send_operations_to_server", "SEND-OPERATIONS-TO-SERVER", 0, 0, false);
    //declareFunction(myName, "send_operations_to_server_internal", "SEND-OPERATIONS-TO-SERVER-INTERNAL", 1, 0, false);
    //declareFunction(myName, "read_operations_from_server", "READ-OPERATIONS-FROM-SERVER", 0, 0, false);
    //declareFunction(myName, "read_operations_from_server_internal", "READ-OPERATIONS-FROM-SERVER-INTERNAL", 1, 0, false);
    //declareFunction(myName, "read_one_transcript_operation_from_server", "READ-ONE-TRANSCRIPT-OPERATION-FROM-SERVER", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_transcript_server_file() {
    $master_transcript_server_connection_timeout$ = deflexical("*MASTER-TRANSCRIPT-SERVER-CONNECTION-TIMEOUT*", TEN_INTEGER);
    $transcript_server_protocol_version$ = defvar("*TRANSCRIPT-SERVER-PROTOCOL-VERSION*", ONE_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_transcript_server_file() {
    // CVS_ID("Id: transcript-server.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("CHANNEL"), makeSymbol("&KEY"), makeSymbol("OPERATION-TIMEOUT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list1 = list(makeKeyword("OPERATION-TIMEOUT"));
  public static final SubLSymbol $kw2$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw3$OPERATION_TIMEOUT = makeKeyword("OPERATION-TIMEOUT");
  public static final SubLSymbol $sym4$ERROR_MESSAGE = makeUninternedSymbol("ERROR-MESSAGE");
  public static final SubLSymbol $sym5$CONNECTED = makeUninternedSymbol("CONNECTED");
  public static final SubLSymbol $sym6$INCOMPLETE = makeUninternedSymbol("INCOMPLETE");
  public static final SubLSymbol $sym7$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym8$CATCH_ERROR_MESSAGE = makeSymbol("CATCH-ERROR-MESSAGE");
  public static final SubLSymbol $sym9$WITH_TCP_CONNECTION = makeSymbol("WITH-TCP-CONNECTION");
  public static final SubLList $list10 = list(makeSymbol("*MASTER-TRANSCRIPT-LOCK-HOST*"), makeSymbol("*MASTER-TRANSCRIPT-SERVER-PORT*"), makeKeyword("TIMEOUT"), makeSymbol("*MASTER-TRANSCRIPT-SERVER-CONNECTION-TIMEOUT*"), makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE"));
  public static final SubLSymbol $sym11$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list12 = list(T);
  public static final SubLSymbol $sym13$WITH_TIMEOUT = makeSymbol("WITH-TIMEOUT");
  public static final SubLSymbol $sym14$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym15$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLList $list16 = list(list(makeSymbol("ERROR"), makeString("Transcript server connection timeout")));
  public static final SubLSymbol $sym17$PWHEN = makeSymbol("PWHEN");
  public static final SubLList $list18 = list(list(makeSymbol("ERROR"), makeString("Transcript server operation timeout")));
  public static final SubLSymbol $sym19$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym20$WARN = makeSymbol("WARN");
  public static final SubLString $str21$_A__Error_while_connecting_to_tra = makeString("~A: Error while connecting to transcript server!~%~A~%");
  public static final SubLList $list22 = list(makeSymbol("TIMESTRING"));
  public static final SubLList $list23 = list(makeSymbol("CHANNEL"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym24$TRANSCRIPT_SERVER_MESSAGE_STARTUP = makeSymbol("TRANSCRIPT-SERVER-MESSAGE-STARTUP");
  public static final SubLSymbol $sym25$TRANSCRIPT_SERVER_MESSAGE_SHUTDOWN = makeSymbol("TRANSCRIPT-SERVER-MESSAGE-SHUTDOWN");
  public static final SubLString $str26$Connection_to_transcript_server_w = makeString("Connection to transcript server was not cleanly closed");
  public static final SubLSymbol $kw27$EOF = makeKeyword("EOF");
  public static final SubLSymbol $kw28$ERROR = makeKeyword("ERROR");
  public static final SubLString $str29$400 = makeString("400");
  public static final SubLString $str30$200 = makeString("200");
  public static final SubLString $str31$Set_Image__A = makeString("Set-Image ~A");
  public static final SubLString $str32$201 = makeString("201");
  public static final SubLString $str33$Set_KB__A = makeString("Set-KB ~A");
  public static final SubLString $str34$202 = makeString("202");
  public static final SubLString $str35$Set_Op__A = makeString("Set-Op ~A");
  public static final SubLString $str36$203 = makeString("203");
  public static final SubLString $str37$210 = makeString("210");
  public static final SubLString $str38$211 = makeString("211");
  public static final SubLString $str39$212 = makeString("212");
  public static final SubLString $str40$How_Many_Ops__A = makeString("How-Many-Ops ~A");
  public static final SubLString $str41$207 = makeString("207");
  public static final SubLString $str42$Send_Ops__A = makeString("Send-Ops ~A");
  public static final SubLString $str43$_A = makeString("~A");
  public static final SubLString $str44$204 = makeString("204");
  public static final SubLString $str45$Get_Ops__A = makeString("Get-Ops ~A");
  public static final SubLString $str46$205 = makeString("205");
  public static final SubLString $str47$Quit = makeString("Quit");
  public static final SubLString $str48$206 = makeString("206");
  public static final SubLSymbol $sym49$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $kw50$PRIVATE = makeKeyword("PRIVATE");
  public static final SubLString $str51$Transcript_server_connection_time = makeString("Transcript server connection timeout");
  public static final SubLString $str52$Transcript_server_operation_timeo = makeString("Transcript server operation timeout");
  public static final SubLInteger $int53$45 = makeInteger(45);
  public static final SubLInteger $int54$240 = makeInteger(240);
  public static final SubLString $str55$Error_sending_operations_to_serve = makeString("Error sending operations to server");

  //// Initializers

  public void declareFunctions() {
    declare_transcript_server_file();
  }

  public void initializeVariables() {
    init_transcript_server_file();
  }

  public void runTopLevelForms() {
    setup_transcript_server_file();
  }

}
