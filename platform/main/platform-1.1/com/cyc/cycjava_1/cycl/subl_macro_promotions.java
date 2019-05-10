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

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class subl_macro_promotions extends SubLTranslatedFile {

  //// Constructor

  private subl_macro_promotions() {}
  public static final SubLFile me = new subl_macro_promotions();
  public static final String myName = "com.cyc.cycjava_1.cycl.subl_macro_promotions";

  //// Definitions

  /** @note we would love for this to be a macro-helper, but define-macro-helper
    isn't available until ACCESS-MACROS */
  @SubL(source = "cycl/subl-macro-promotions.lisp", position = 1261) 
  public static final SubLObject declare_defglobal(SubLObject global) {
    Symbols.put(global, $kw7$INITIALIZATION_TYPE, $kw8$WORLD);
    return global;
  }

  /** The target thrown to by errors inside CATCH-ERROR-MESSAGE */
  @SubL(source = "cycl/subl-macro-promotions.lisp", position = 1475) 
  public static SubLSymbol $catch_error_message_target$ = null;

  /** Internal function for CATCH-ERROR-MESSAGE */
  @SubL(source = "cycl/subl-macro-promotions.lisp", position = 2025) 
  public static final SubLObject catch_error_message_handler() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Dynamic.sublisp_throw($catch_error_message_target$.getGlobalValue(), Errors.$error_message$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/subl-macro-promotions.lisp", position = 3458) 
  public static SubLSymbol $within_with_timeout$ = null;

  @SubL(source = "cycl/subl-macro-promotions.lisp", position = 3612) 
  public static SubLSymbol $with_timeout_nesting_depth$ = null;

  public static final SubLObject declare_subl_macro_promotions_file() {
    //declareMacro(myName, "defglobal", "DEFGLOBAL");
    declareFunction(myName, "declare_defglobal", "DECLARE-DEFGLOBAL", 1, 0, false);
    //declareMacro(myName, "catch_error_message", "CATCH-ERROR-MESSAGE");
    declareFunction(myName, "catch_error_message_handler", "CATCH-ERROR-MESSAGE-HANDLER", 0, 0, false);
    //declareMacro(myName, "with_timeout", "WITH-TIMEOUT");
    //declareFunction(myName, "with_timeout_internal", "WITH-TIMEOUT-INTERNAL", 3, 0, false);
    //declareFunction(myName, "with_timeout_make_tag", "WITH-TIMEOUT-MAKE-TAG", 0, 0, false);
    //declareFunction(myName, "with_timeout_start_timer", "WITH-TIMEOUT-START-TIMER", 2, 0, false);
    //declareFunction(myName, "timeout_tag_nesting_depth", "TIMEOUT-TAG-NESTING-DEPTH", 1, 0, false);
    //declareFunction(myName, "with_timeout_stop_timer", "WITH-TIMEOUT-STOP-TIMER", 1, 0, false);
    //declareFunction(myName, "with_timeout_timer_thread", "WITH-TIMEOUT-TIMER-THREAD", 5, 0, false);
    //declareFunction(myName, "with_timeout_signal_timeout", "WITH-TIMEOUT-SIGNAL-TIMEOUT", 2, 0, false);
    //declareFunction(myName, "with_timeout_throw", "WITH-TIMEOUT-THROW", 1, 0, false);
    //declareMacro(myName, "with_tcp_connection", "WITH-TCP-CONNECTION");
    //declareMacro(myName, "with_tcp_connection_with_timeout", "WITH-TCP-CONNECTION-WITH-TIMEOUT");
    //declareMacro(myName, "cmultiple_value_setq", "CMULTIPLE-VALUE-SETQ");
    //declareMacro(myName, "with_space_profiling", "WITH-SPACE-PROFILING");
    //declareFunction(myName, "with_space_profiling_sl2c", "WITH-SPACE-PROFILING-SL2C", 2, 0, false);
    //declareMacro(myName, "code_comment", "CODE-COMMENT");
    return NIL;
  }

  public static final SubLObject init_subl_macro_promotions_file() {
    $catch_error_message_target$ = SubLFiles.deflexical( "*CATCH-ERROR-MESSAGE-TARGET*", maybeDefault( $sym9$_CATCH_ERROR_MESSAGE_TARGET_, $catch_error_message_target$, () -> ( Symbols.make_symbol( $str10$ERROR ) ) ) );
    $catch_error_message_target$ = deflexical("*CATCH-ERROR-MESSAGE-TARGET*", maybeDefault( $sym9$_CATCH_ERROR_MESSAGE_TARGET_, $catch_error_message_target$, ()-> (Symbols.make_symbol($str10$ERROR))));
    $within_with_timeout$ = defparameter("*WITHIN-WITH-TIMEOUT*", NIL);
    $with_timeout_nesting_depth$ = defparameter("*WITH-TIMEOUT-NESTING-DEPTH*", ZERO_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_subl_macro_promotions_file() {
    // CVS_ID("Id: subl-macro-promotions.lisp 126823 2009-01-14 04:03:56Z rck ");
    declare_defglobal($sym9$_CATCH_ERROR_MESSAGE_TARGET_);
    access_macros.register_macro_helper($sym26$WITH_TIMEOUT_MAKE_TAG, $sym27$WITH_TIMEOUT);
    access_macros.register_macro_helper($sym24$WITH_TIMEOUT_START_TIMER, $sym27$WITH_TIMEOUT);
    access_macros.register_macro_helper($sym25$WITH_TIMEOUT_STOP_TIMER, $sym27$WITH_TIMEOUT);
    meta_macros.declare_indention_pattern($sym49$CMULTIPLE_VALUE_SETQ, $list50);
    access_macros.register_external_symbol($sym51$WITH_SPACE_PROFILING);
    access_macros.register_macro_helper($sym56$WITH_SPACE_PROFILING_SL2C, $sym51$WITH_SPACE_PROFILING);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));
  public static final SubLSymbol $sym1$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym2$DEFLEXICAL = makeSymbol("DEFLEXICAL");
  public static final SubLSymbol $sym3$FIF = makeSymbol("FIF");
  public static final SubLSymbol $sym4$BOUNDP = makeSymbol("BOUNDP");
  public static final SubLSymbol $sym5$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym6$DECLARE_DEFGLOBAL = makeSymbol("DECLARE-DEFGLOBAL");
  public static final SubLSymbol $kw7$INITIALIZATION_TYPE = makeKeyword("INITIALIZATION-TYPE");
  public static final SubLSymbol $kw8$WORLD = makeKeyword("WORLD");
  public static final SubLSymbol $sym9$_CATCH_ERROR_MESSAGE_TARGET_ = makeSymbol("*CATCH-ERROR-MESSAGE-TARGET*");
  public static final SubLString $str10$ERROR = makeString("ERROR");
  public static final SubLList $list11 = list(list(makeSymbol("VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym12$CCATCH = makeSymbol("CCATCH");
  public static final SubLSymbol $sym13$WITH_ERROR_HANDLER = makeSymbol("WITH-ERROR-HANDLER");
  public static final SubLList $list14 = list(makeSymbol("QUOTE"), makeSymbol("CATCH-ERROR-MESSAGE-HANDLER"));
  public static final SubLList $list15 = list(list(makeSymbol("TIME"), makeSymbol("TIMED-OUT-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym16$TAG = makeUninternedSymbol("TAG");
  public static final SubLSymbol $sym17$TIMER = makeUninternedSymbol("TIMER");
  public static final SubLSymbol $sym18$CLET = makeSymbol("CLET");
  public static final SubLList $list19 = list(list(makeSymbol("WITH-TIMEOUT-MAKE-TAG")));
  public static final SubLList $list20 = list(makeSymbol("*WITHIN-WITH-TIMEOUT*"), T);
  public static final SubLSymbol $sym21$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLList $list22 = list(list(makeSymbol("*WITH-TIMEOUT-NESTING-DEPTH*"), list(makeSymbol("+"), ONE_INTEGER, makeSymbol("*WITH-TIMEOUT-NESTING-DEPTH*"))));
  public static final SubLSymbol $sym23$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym24$WITH_TIMEOUT_START_TIMER = makeSymbol("WITH-TIMEOUT-START-TIMER");
  public static final SubLSymbol $sym25$WITH_TIMEOUT_STOP_TIMER = makeSymbol("WITH-TIMEOUT-STOP-TIMER");
  public static final SubLSymbol $sym26$WITH_TIMEOUT_MAKE_TAG = makeSymbol("WITH-TIMEOUT-MAKE-TAG");
  public static final SubLSymbol $sym27$WITH_TIMEOUT = makeSymbol("WITH-TIMEOUT");
  public static final SubLString $str28$WITH_TIMEOUT__A = makeString("WITH-TIMEOUT ~A");
  public static final SubLString $str29$_client = makeString(" client");
  public static final SubLString $str30$_timer = makeString(" timer");
  public static final SubLString $str31$_Timer_for_ = makeString(" Timer for ");
  public static final SubLSymbol $sym32$WITH_TIMEOUT_TIMER_THREAD = makeSymbol("WITH-TIMEOUT-TIMER-THREAD");
  public static final SubLSymbol $sym33$WITH_TIMEOUT_THROW = makeSymbol("WITH-TIMEOUT-THROW");
  public static final SubLList $list34 = list(list(makeSymbol("BI-STREAM"), makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("&KEY"), makeSymbol("TIMEOUT"), list(makeSymbol("ACCESS-MODE"), makeKeyword("PUBLIC"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list35 = list(makeKeyword("TIMEOUT"), makeKeyword("ACCESS-MODE"));
  public static final SubLSymbol $kw36$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw37$TIMEOUT = makeKeyword("TIMEOUT");
  public static final SubLSymbol $kw38$ACCESS_MODE = makeKeyword("ACCESS-MODE");
  public static final SubLSymbol $kw39$PUBLIC = makeKeyword("PUBLIC");
  public static final SubLSymbol $sym40$OPEN_TCP_STREAM_WITH_TIMEOUT = makeSymbol("OPEN-TCP-STREAM-WITH-TIMEOUT");
  public static final SubLSymbol $sym41$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym42$CLOSE = makeSymbol("CLOSE");
  public static final SubLSymbol $sym43$WITH_TCP_CONNECTION_WITH_TIMEOUT = makeSymbol("WITH-TCP-CONNECTION-WITH-TIMEOUT");
  public static final SubLList $list44 = list(makeSymbol("WITH-TCP-CONNECTION"));
  public static final SubLSymbol $sym45$WITH_TCP_CONNECTION = makeSymbol("WITH-TCP-CONNECTION");
  public static final SubLList $list46 = list(makeSymbol("VARIABLES"), makeSymbol("EXPRESSION"));
  public static final SubLSymbol $sym47$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym48$CMULTIPLE_VALUE_BIND = makeSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLSymbol $sym49$CMULTIPLE_VALUE_SETQ = makeSymbol("CMULTIPLE-VALUE-SETQ");
  public static final SubLList $list50 = list(makeSymbol("VARIABLES"), makeSymbol("EXPRESSION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym51$WITH_SPACE_PROFILING = makeSymbol("WITH-SPACE-PROFILING");
  public static final SubLList $list52 = list(list(makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*")))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list53 = list(makeKeyword("STREAM"));
  public static final SubLSymbol $kw54$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $sym55$_STANDARD_OUTPUT_ = makeSymbol("*STANDARD-OUTPUT*");
  public static final SubLSymbol $sym56$WITH_SPACE_PROFILING_SL2C = makeSymbol("WITH-SPACE-PROFILING-SL2C");
  public static final SubLSymbol $sym57$SPACE_INFO = makeUninternedSymbol("SPACE-INFO");
  public static final SubLList $list58 = list(list(makeSymbol("ADD-SPACE-PROBE", "SUBLISP")));
  public static final SubLSymbol $sym59$REMOVE_SPACE_PROBE = makeSymbol("REMOVE-SPACE-PROBE", "SUBLISP");
  public static final SubLSymbol $sym60$_INTERPRET_CSPACE_RESULTS = makeSymbol("%INTERPRET-CSPACE-RESULTS", "SUBLISP");
  public static final SubLList $list61 = list(makeSymbol("COMMENT-STRING"));
  public static final SubLSymbol $sym62$STRINGP = makeSymbol("STRINGP");
  public static final SubLList $list63 = list(makeSymbol("PROGN"));

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_subl_macro_promotions_file();
  }

  @Override
  public void initializeVariables() {
    init_subl_macro_promotions_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_subl_macro_promotions_file();
  }

}
