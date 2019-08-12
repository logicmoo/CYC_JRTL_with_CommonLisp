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

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class tcp_server_utilities extends SubLTranslatedFile {

  //// Constructor

  private tcp_server_utilities() {}
  public static final SubLFile me = new tcp_server_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.tcp_server_utilities";

  //// Definitions

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 1459) 
  private static SubLSymbol $tcp_server_lock$ = null;

  /** Within a TCP server handler, this is bound to an integer representing
   the socket's remote machine IP address. */
  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 1647) 
  public static SubLSymbol $remote_address$ = null;

  /** Within a TCP server handler, this is bound to a string representing
   the socket's remote machine hostname */
  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 1854) 
  public static SubLSymbol $remote_hostname$ = null;

  /** Return T iff OBJECT is a valid integer for a TCP port. */
  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 2057) 
  public static final SubLObject tcp_port_p(SubLObject object) {
    return makeBoolean((object.isFixnum()
           && ZERO_INTEGER.numLE(object)
           && object.numLE($int3$65535)));
  }

  /** Enable a new TCP server of TYPE bound to PORT.
TYPE must have already been declared via DEFINE-TCP-SERVER.
Any TCP server currently bound to PORT is first disabled. */
  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 3007) 
  public static final SubLObject enable_tcp_server(SubLObject type, SubLObject port) {
    checkType(port, $sym15$TCP_PORT_P);
    if (disable_tcp_server(port).numG(ZERO_INTEGER)) {
      Threads.sleep(ONE_INTEGER);
    }
    {
      SubLObject tcp_server = new_tcp_server(type, port);
      register_tcp_server(tcp_server);
      return tcp_server;
    }
  }

  /** Disable all TCP servers specified by DESIGNATOR.
Returns the total number of servers disabled.
If DESIGNATOR is a TCP-SERVER-P, disable that server.
If DESIGNATOR is a TCP-PORT-P, disable the server at that port.
Otherwise, disable all servers with DESIGNATOR as their type. */
  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 3574) 
  public static final SubLObject disable_tcp_server(SubLObject designator) {
    if ((NIL != tcp_server_p(designator))) {
      {
        SubLObject tcp_server = designator;
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31593");
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31594");
        return ONE_INTEGER;
      }
    } else if ((NIL != tcp_port_p(designator))) {
      {
        SubLObject port = designator;
        SubLObject tcp_server = find_tcp_server_by_port(port);
        if ((NIL != tcp_server)) {
          return disable_tcp_server(tcp_server);
        }
        return ZERO_INTEGER;
      }
    } else {
      {
        SubLObject type = designator;
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = all_tcp_servers();
        SubLObject tcp_server = NIL;
        for (tcp_server = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tcp_server = cdolist_list_var.first()) {
          if ((type == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31597"))) {
            total = Numbers.add(total, disable_tcp_server(tcp_server));
          }
        }
        return total;
      }
    }
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 4789) 
  public static final SubLObject validate_all_tcp_servers() {
    {
      SubLObject total = ZERO_INTEGER;
      SubLObject cdolist_list_var = all_tcp_servers();
      SubLObject tcp_server = NIL;
      for (tcp_server = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tcp_server = cdolist_list_var.first()) {
        if ((NIL == Threads.valid_process_p(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31596")))) {
          total = Numbers.add(total, disable_tcp_server(tcp_server));
        }
      }
      return total;
    }
  }

  public static final class $tcp_server_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $type; }
    public SubLObject getField3() { return $port; }
    public SubLObject getField4() { return $process; }
    public SubLObject setField2(SubLObject value) { return $type = value; }
    public SubLObject setField3(SubLObject value) { return $port = value; }
    public SubLObject setField4(SubLObject value) { return $process = value; }
    public SubLObject $type = NIL;
    public SubLObject $port = NIL;
    public SubLObject $process = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($tcp_server_native.class, $sym16$TCP_SERVER, $sym17$TCP_SERVER_P, $list18, $list19, new String[] {"$type", "$port", "$process"}, $list20, $list21, $sym22$PRINT_TCP_SERVER);
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 5580) 
  public static SubLSymbol $dtp_tcp_server$ = null;

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 5580) 
  public static final SubLObject tcp_server_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31595");
    return NIL;
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 5580) 
  public static final SubLObject tcp_server_p(SubLObject object) {
    return ((object.getClass() == $tcp_server_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $tcp_server_p$UnaryFunction extends UnaryFunction {
    public $tcp_server_p$UnaryFunction() { super(extractFunctionNamed("TCP-SERVER-P")); }
    public SubLObject processItem(SubLObject arg1) { return tcp_server_p(arg1); }
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 5580) 
  public static final SubLObject tcps_port(SubLObject object) {
    checkType(object, $sym17$TCP_SERVER_P);
    return object.getField3();
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 5580) 
  public static final SubLObject _csetf_tcps_type(SubLObject object, SubLObject value) {
    checkType(object, $sym17$TCP_SERVER_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 5580) 
  public static final SubLObject _csetf_tcps_port(SubLObject object, SubLObject value) {
    checkType(object, $sym17$TCP_SERVER_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 5580) 
  public static final SubLObject _csetf_tcps_process(SubLObject object, SubLObject value) {
    checkType(object, $sym17$TCP_SERVER_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 5580) 
  public static final SubLObject make_tcp_server(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $tcp_server_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw8$TYPE)) {
            _csetf_tcps_type(v_new, current_value);
          } else if (pcase_var.eql($kw30$PORT)) {
            _csetf_tcps_port(v_new, current_value);
          } else if (pcase_var.eql($kw31$PROCESS)) {
            _csetf_tcps_process(v_new, current_value);
          } else {
            Errors.error($str32$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Return the port of TCP-SERVER, or NIL if disabled. */
  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 6337) 
  public static final SubLObject tcp_server_port(SubLObject tcp_server) {
    checkType(tcp_server, $sym17$TCP_SERVER_P);
    return tcps_port(tcp_server);
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 6695) 
  public static final SubLObject new_tcp_server(SubLObject type, SubLObject port) {
    {
      SubLObject handler = tcp_server_type_handler(type);
      SubLObject tcps = make_tcp_server(UNPROVIDED);
      _csetf_tcps_type(tcps, type);
      _csetf_tcps_port(tcps, port);
      _csetf_tcps_process(tcps, start_tcp_server_process(type, port, handler));
      return tcps;
    }
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 7229) 
  private static SubLSymbol $all_tcp_servers$ = null;

  /** Return the TCP server running at PORT, or NIL if none. */
  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 7347) 
  public static final SubLObject find_tcp_server_by_port(SubLObject port) {
    checkType(port, $sym15$TCP_PORT_P);
    return Sequences.find(port, $all_tcp_servers$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function($sym38$TCP_SERVER_PORT), UNPROVIDED, UNPROVIDED);
  }

  /** Return a list of all TCP servers that are currently enabled. */
  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 7547) 
  public static final SubLObject all_tcp_servers() {
    return conses_high.copy_list($all_tcp_servers$.getGlobalValue());
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 7686) 
  public static final SubLObject register_tcp_server(SubLObject tcp_server) {
    {
      SubLObject lock = $tcp_server_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        $all_tcp_servers$.setGlobalValue(cons(tcp_server, $all_tcp_servers$.getGlobalValue()));
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return tcp_server;
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 8034) 
  private static SubLSymbol $tcp_server_type_table$ = null;

  /** Register that TCP servers of TYPE use HANDLER with MODE. */
  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 8151) 
  public static final SubLObject register_tcp_server_type(SubLObject type, SubLObject handler, SubLObject mode) {
    if ((mode == UNPROVIDED)) {
      mode = $kw10$TEXT;
    }
    checkType(handler, $sym40$FUNCTION_SPEC_P);
    checkType(mode, $sym11$TCP_SERVER_MODE_P);
    deregister_tcp_server_type(type);
    {
      SubLObject lock = $tcp_server_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        $tcp_server_type_table$.setGlobalValue(cons(list(type, handler, mode), $tcp_server_type_table$.getGlobalValue()));
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return type;
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 8507) 
  public static final SubLObject deregister_tcp_server_type(SubLObject type) {
    {
      SubLObject lock = $tcp_server_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        $tcp_server_type_table$.setGlobalValue(Sequences.delete(type, $tcp_server_type_table$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function($sym41$FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return type;
  }

  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 8703) 
  public static final SubLObject tcp_server_type_handler(SubLObject type) {
    return conses_high.second(Sequences.find(type, $tcp_server_type_table$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function($sym41$FIRST), UNPROVIDED, UNPROVIDED));
  }

  /** Method for starting a new TCP server of TYPE at PORT which has HANDLER. */
  @SubL(source = "cycl/tcp-server-utilities.lisp", position = 9640) 
  public static final SubLObject start_tcp_server_process(SubLObject type, SubLObject port, SubLObject handler) {
    {
      SubLObject server_process = NIL;
      server_process = Functions.funcall($sym43$START_TCP_SERVER, port, handler);
      return server_process;
    }
  }

  public static final SubLObject declare_tcp_server_utilities_file() {
    declareMacro(myName, "with_tcp_server_lock", "WITH-TCP-SERVER-LOCK");
    declareFunction(myName, "tcp_port_p", "TCP-PORT-P", 1, 0, false);
    declareFunction(myName, "tcp_server_mode_p", "TCP-SERVER-MODE-P", 1, 0, false);
    declareMacro(myName, "define_tcp_server", "DEFINE-TCP-SERVER");
    declareFunction(myName, "enable_tcp_server", "ENABLE-TCP-SERVER", 2, 0, false);
    declareFunction(myName, "disable_tcp_server", "DISABLE-TCP-SERVER", 1, 0, false);
    declareFunction(myName, "disable_all_tcp_servers", "DISABLE-ALL-TCP-SERVERS", 0, 0, false);
    declareFunction(myName, "validate_all_tcp_servers", "VALIDATE-ALL-TCP-SERVERS", 0, 0, false);
    declareFunction(myName, "restart_all_tcp_servers", "RESTART-ALL-TCP-SERVERS", 0, 0, false);
    declareFunction(myName, "tcp_server_print_function_trampoline", "TCP-SERVER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "tcp_server_p", "TCP-SERVER-P", 1, 0, false); new $tcp_server_p$UnaryFunction();
    declareFunction(myName, "tcps_type", "TCPS-TYPE", 1, 0, false);
    declareFunction(myName, "tcps_port", "TCPS-PORT", 1, 0, false);
    declareFunction(myName, "tcps_process", "TCPS-PROCESS", 1, 0, false);
    declareFunction(myName, "_csetf_tcps_type", "_CSETF-TCPS-TYPE", 2, 0, false);
    declareFunction(myName, "_csetf_tcps_port", "_CSETF-TCPS-PORT", 2, 0, false);
    declareFunction(myName, "_csetf_tcps_process", "_CSETF-TCPS-PROCESS", 2, 0, false);
    declareFunction(myName, "make_tcp_server", "MAKE-TCP-SERVER", 0, 1, false);
    declareFunction(myName, "print_tcp_server", "PRINT-TCP-SERVER", 3, 0, false);
    declareFunction(myName, "tcp_server_type", "TCP-SERVER-TYPE", 1, 0, false);
    declareFunction(myName, "tcp_server_port", "TCP-SERVER-PORT", 1, 0, false);
    declareFunction(myName, "tcp_server_process", "TCP-SERVER-PROCESS", 1, 0, false);
    declareFunction(myName, "new_tcp_server", "NEW-TCP-SERVER", 2, 0, false);
    declareFunction(myName, "free_tcp_server", "FREE-TCP-SERVER", 1, 0, false);
    declareFunction(myName, "find_tcp_server_by_port", "FIND-TCP-SERVER-BY-PORT", 1, 0, false);
    declareFunction(myName, "all_tcp_servers", "ALL-TCP-SERVERS", 0, 0, false);
    declareFunction(myName, "register_tcp_server", "REGISTER-TCP-SERVER", 1, 0, false);
    declareFunction(myName, "deregister_tcp_server", "DEREGISTER-TCP-SERVER", 1, 0, false);
    declareFunction(myName, "register_tcp_server_type", "REGISTER-TCP-SERVER-TYPE", 2, 1, false);
    declareFunction(myName, "deregister_tcp_server_type", "DEREGISTER-TCP-SERVER-TYPE", 1, 0, false);
    declareFunction(myName, "tcp_server_type_handler", "TCP-SERVER-TYPE-HANDLER", 1, 0, false);
    declareFunction(myName, "tcp_server_type_mode", "TCP-SERVER-TYPE-MODE", 1, 0, false);
    declareFunction(myName, "define_tcp_server_internal", "DEFINE-TCP-SERVER-INTERNAL", 6, 0, false);
    declareFunction(myName, "start_tcp_server_process", "START-TCP-SERVER-PROCESS", 3, 0, false);
    declareFunction(myName, "halt_tcp_server", "HALT-TCP-SERVER", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_tcp_server_utilities_file() {
    $tcp_server_lock$ = deflexical("*TCP-SERVER-LOCK*", Locks.make_lock($str0$TCP_Server_Lock));
    Tcp.$remote_address$ = defparameter("*REMOTE-ADDRESS*", NIL);
    Tcp.$remote_hostname$ = defparameter("*REMOTE-HOSTNAME*", NIL);
    $dtp_tcp_server$ = defconstant("*DTP-TCP-SERVER*", $sym16$TCP_SERVER);
    $all_tcp_servers$ = deflexical("*ALL-TCP-SERVERS*", maybeDefault( $sym37$_ALL_TCP_SERVERS_, $all_tcp_servers$, NIL));
    $tcp_server_type_table$ = deflexical("*TCP-SERVER-TYPE-TABLE*", maybeDefault( $sym39$_TCP_SERVER_TYPE_TABLE_, $tcp_server_type_table$, NIL));
    return NIL;
  }

  public static final SubLObject setup_tcp_server_utilities_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_tcp_server$.getGlobalValue(), Symbols.symbol_function($sym23$TCP_SERVER_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym24$TCPS_TYPE, $sym25$_CSETF_TCPS_TYPE);
    Structures.def_csetf($sym26$TCPS_PORT, $sym27$_CSETF_TCPS_PORT);
    Structures.def_csetf($sym28$TCPS_PROCESS, $sym29$_CSETF_TCPS_PROCESS);
    Equality.identity($sym16$TCP_SERVER);
    subl_macro_promotions.declare_defglobal($sym37$_ALL_TCP_SERVERS_);
    subl_macro_promotions.declare_defglobal($sym39$_TCP_SERVER_TYPE_TABLE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$TCP_Server_Lock = makeString("TCP Server Lock");
  public static final SubLSymbol $sym1$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLList $list2 = list(makeSymbol("*TCP-SERVER-LOCK*"));
  public static final SubLInteger $int3$65535 = makeInteger(65535);
  public static final SubLList $list4 = list(makeKeyword("TEXT"), makeKeyword("BINARY"));
  public static final SubLList $list5 = list(makeSymbol("NAME"), list(makeSymbol("IN-STREAM"), makeSymbol("OUT-STREAM")), list(makeSymbol("&KEY"), makeSymbol("TYPE"), list(makeSymbol("MODE"), makeKeyword("TEXT"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list6 = list(makeKeyword("TYPE"), makeKeyword("MODE"));
  public static final SubLSymbol $kw7$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw8$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw9$MODE = makeKeyword("MODE");
  public static final SubLSymbol $kw10$TEXT = makeKeyword("TEXT");
  public static final SubLSymbol $sym11$TCP_SERVER_MODE_P = makeSymbol("TCP-SERVER-MODE-P");
  public static final SubLSymbol $sym12$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym13$REGISTER_TCP_SERVER_TYPE = makeSymbol("REGISTER-TCP-SERVER-TYPE");
  public static final SubLSymbol $sym14$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym15$TCP_PORT_P = makeSymbol("TCP-PORT-P");
  public static final SubLSymbol $sym16$TCP_SERVER = makeSymbol("TCP-SERVER");
  public static final SubLSymbol $sym17$TCP_SERVER_P = makeSymbol("TCP-SERVER-P");
  public static final SubLList $list18 = list(makeSymbol("TYPE"), makeSymbol("PORT"), makeSymbol("PROCESS"));
  public static final SubLList $list19 = list(makeKeyword("TYPE"), makeKeyword("PORT"), makeKeyword("PROCESS"));
  public static final SubLList $list20 = list(makeSymbol("TCPS-TYPE"), makeSymbol("TCPS-PORT"), makeSymbol("TCPS-PROCESS"));
  public static final SubLList $list21 = list(makeSymbol("_CSETF-TCPS-TYPE"), makeSymbol("_CSETF-TCPS-PORT"), makeSymbol("_CSETF-TCPS-PROCESS"));
  public static final SubLSymbol $sym22$PRINT_TCP_SERVER = makeSymbol("PRINT-TCP-SERVER");
  public static final SubLSymbol $sym23$TCP_SERVER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TCP-SERVER-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym24$TCPS_TYPE = makeSymbol("TCPS-TYPE");
  public static final SubLSymbol $sym25$_CSETF_TCPS_TYPE = makeSymbol("_CSETF-TCPS-TYPE");
  public static final SubLSymbol $sym26$TCPS_PORT = makeSymbol("TCPS-PORT");
  public static final SubLSymbol $sym27$_CSETF_TCPS_PORT = makeSymbol("_CSETF-TCPS-PORT");
  public static final SubLSymbol $sym28$TCPS_PROCESS = makeSymbol("TCPS-PROCESS");
  public static final SubLSymbol $sym29$_CSETF_TCPS_PROCESS = makeSymbol("_CSETF-TCPS-PROCESS");
  public static final SubLSymbol $kw30$PORT = makeKeyword("PORT");
  public static final SubLSymbol $kw31$PROCESS = makeKeyword("PROCESS");
  public static final SubLString $str32$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str33$__ = makeString("#<");
  public static final SubLSymbol $kw34$STREAM = makeKeyword("STREAM");
  public static final SubLString $str35$_ = makeString("/");
  public static final SubLSymbol $kw36$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym37$_ALL_TCP_SERVERS_ = makeSymbol("*ALL-TCP-SERVERS*");
  public static final SubLSymbol $sym38$TCP_SERVER_PORT = makeSymbol("TCP-SERVER-PORT");
  public static final SubLSymbol $sym39$_TCP_SERVER_TYPE_TABLE_ = makeSymbol("*TCP-SERVER-TYPE-TABLE*");
  public static final SubLSymbol $sym40$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym41$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym42$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym43$START_TCP_SERVER = makeSymbol("START-TCP-SERVER", "SUBLISP");
  public static final SubLSymbol $kw44$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym45$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $sym46$STOP_TCP_SERVER = makeSymbol("STOP-TCP-SERVER", "SUBLISP");

  //// Initializers

  public void declareFunctions() {
    declare_tcp_server_utilities_file();
  }

  public void initializeVariables() {
    init_tcp_server_utilities_file();
  }

  public void runTopLevelForms() {
    setup_tcp_server_utilities_file();
  }

}
