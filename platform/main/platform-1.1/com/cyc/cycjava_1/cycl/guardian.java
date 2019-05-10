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

package  com.cyc.cycjava_1.cycl;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.integer_sequence_generator;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.numeric_date_utilities;
import com.cyc.cycjava_1.cycl.process_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class guardian extends SubLTranslatedFile {

  //// Constructor

  private guardian() {}
  public static final SubLFile me = new guardian();
  public static final String myName = "com.cyc.cycjava_1.cycl.guardian";

  //// Definitions

  @SubL(source = "cycl/guardian.lisp", position = 1141) 
  private static SubLSymbol $guardian_process$ = null;

  @SubL(source = "cycl/guardian.lisp", position = 1866) 
  private static SubLSymbol $guarding_requests$ = null;

  @SubL(source = "cycl/guardian.lisp", position = 1910) 
  private static SubLSymbol $guardian_timeslice$ = null;

  @SubL(source = "cycl/guardian.lisp", position = 1954) 
  private static SubLSymbol $guardian_isg$ = null;

  public static final class $guardian_request_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $checker_fn; }
    public SubLObject getField4() { return $parameter; }
    public SubLObject getField5() { return $notification_fn; }
    public SubLObject getField6() { return $interrupt_p; }
    public SubLObject getField7() { return $process; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $checker_fn = value; }
    public SubLObject setField4(SubLObject value) { return $parameter = value; }
    public SubLObject setField5(SubLObject value) { return $notification_fn = value; }
    public SubLObject setField6(SubLObject value) { return $interrupt_p = value; }
    public SubLObject setField7(SubLObject value) { return $process = value; }
    public SubLObject $id = NIL;
    public SubLObject $checker_fn = NIL;
    public SubLObject $parameter = NIL;
    public SubLObject $notification_fn = NIL;
    public SubLObject $interrupt_p = NIL;
    public SubLObject $process = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($guardian_request_native.class, $sym3$GUARDIAN_REQUEST, $sym4$GUARDIAN_REQUEST_P, $list5, $list6, new String[] {"$id", "$checker_fn", "$parameter", "$notification_fn", "$interrupt_p", "$process"}, $list7, $list8, $sym9$PRINT_GUARDIAN_REQUEST);
  }

  @SubL(source = "cycl/guardian.lisp", position = 2022) 
  public static SubLSymbol $dtp_guardian_request$ = null;

  @SubL(source = "cycl/guardian.lisp", position = 2022) 
  public static final SubLObject guardian_request_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29594");
    return NIL;
  }

  public static final class $guardian_request_p$UnaryFunction extends UnaryFunction {
    public $guardian_request_p$UnaryFunction() { super(extractFunctionNamed("GUARDIAN-REQUEST-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29589"); }
  }

  @SubL(source = "cycl/guardian.lisp", position = 6593) 
  private static SubLSymbol $guardian_shutdown_marker$ = null;

  @SubL(source = "cycl/guardian.lisp", position = 7859) 
  private static SubLSymbol $guardian_sleep_marker$ = null;

  public static final SubLObject declare_guardian_file() {
    declareFunction(myName, "guardian_request_print_function_trampoline", "GUARDIAN-REQUEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "guardian_request_p", "GUARDIAN-REQUEST-P", 1, 0, false); new $guardian_request_p$UnaryFunction();
    declareFunction(myName, "guardian_request_id", "GUARDIAN-REQUEST-ID", 1, 0, false);
    declareFunction(myName, "guardian_request_checker_fn", "GUARDIAN-REQUEST-CHECKER-FN", 1, 0, false);
    declareFunction(myName, "guardian_request_parameter", "GUARDIAN-REQUEST-PARAMETER", 1, 0, false);
    declareFunction(myName, "guardian_request_notification_fn", "GUARDIAN-REQUEST-NOTIFICATION-FN", 1, 0, false);
    declareFunction(myName, "guardian_request_interrupt_p", "GUARDIAN-REQUEST-INTERRUPT-P", 1, 0, false);
    declareFunction(myName, "guardian_request_process", "GUARDIAN-REQUEST-PROCESS", 1, 0, false);
    declareFunction(myName, "_csetf_guardian_request_id", "_CSETF-GUARDIAN-REQUEST-ID", 2, 0, false);
    declareFunction(myName, "_csetf_guardian_request_checker_fn", "_CSETF-GUARDIAN-REQUEST-CHECKER-FN", 2, 0, false);
    declareFunction(myName, "_csetf_guardian_request_parameter", "_CSETF-GUARDIAN-REQUEST-PARAMETER", 2, 0, false);
    declareFunction(myName, "_csetf_guardian_request_notification_fn", "_CSETF-GUARDIAN-REQUEST-NOTIFICATION-FN", 2, 0, false);
    declareFunction(myName, "_csetf_guardian_request_interrupt_p", "_CSETF-GUARDIAN-REQUEST-INTERRUPT-P", 2, 0, false);
    declareFunction(myName, "_csetf_guardian_request_process", "_CSETF-GUARDIAN-REQUEST-PROCESS", 2, 0, false);
    declareFunction(myName, "make_guardian_request", "MAKE-GUARDIAN-REQUEST", 0, 1, false);
    declareFunction(myName, "new_guardian_request", "NEW-GUARDIAN-REQUEST", 5, 0, false);
    declareFunction(myName, "print_guardian_request", "PRINT-GUARDIAN-REQUEST", 3, 0, false);
    declareFunction(myName, "schedule_guardian_request", "SCHEDULE-GUARDIAN-REQUEST", 3, 2, false);
    declareFunction(myName, "guardian_request_id_p", "GUARDIAN-REQUEST-ID-P", 1, 0, false);
    declareFunction(myName, "cancel_guardian_request", "CANCEL-GUARDIAN-REQUEST", 1, 0, false);
    declareMacro(myName, "with_guardian_request", "WITH-GUARDIAN-REQUEST");
    declareFunction(myName, "active_guardian_requests", "ACTIVE-GUARDIAN-REQUESTS", 0, 0, false);
    declareFunction(myName, "print_active_guardian_requests", "PRINT-ACTIVE-GUARDIAN-REQUESTS", 0, 1, false);
    declareFunction(myName, "current_guardian_process", "CURRENT-GUARDIAN-PROCESS", 0, 0, false);
    declareFunction(myName, "initialize_guardian", "INITIALIZE-GUARDIAN", 0, 0, false);
    declareFunction(myName, "stop_guardian", "STOP-GUARDIAN", 0, 0, false);
    declareFunction(myName, "start_guardian", "START-GUARDIAN", 0, 0, false);
    declareFunction(myName, "ensure_guardian_running", "ENSURE-GUARDIAN-RUNNING", 0, 0, false);
    declareFunction(myName, "is_guardian_shutdown_marker", "IS-GUARDIAN-SHUTDOWN-MARKER", 1, 0, false);
    declareFunction(myName, "guardian_handler", "GUARDIAN-HANDLER", 0, 0, false);
    declareFunction(myName, "check_guardian_request", "CHECK-GUARDIAN-REQUEST", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_guardian_file() {
    $guardian_process$ = deflexical("*GUARDIAN-PROCESS*", ((NIL != Symbols.boundp($sym0$_GUARDIAN_PROCESS_)) ? ((SubLObject) $guardian_process$.getGlobalValue()) : NIL));
    $guarding_requests$ = deflexical("*GUARDING-REQUESTS*", ((NIL != Symbols.boundp($sym1$_GUARDING_REQUESTS_)) ? ((SubLObject) $guarding_requests$.getGlobalValue()) : NIL));
    $guardian_timeslice$ = deflexical("*GUARDIAN-TIMESLICE*", TWO_INTEGER);
    $guardian_isg$ = deflexical("*GUARDIAN-ISG*", ((NIL != Symbols.boundp($sym2$_GUARDIAN_ISG_)) ? ((SubLObject) $guardian_isg$.getGlobalValue()) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    $dtp_guardian_request$ = defconstant("*DTP-GUARDIAN-REQUEST*", $sym3$GUARDIAN_REQUEST);
    $guardian_shutdown_marker$ = deflexical("*GUARDIAN-SHUTDOWN-MARKER*", ((NIL != Symbols.boundp($sym65$_GUARDIAN_SHUTDOWN_MARKER_)) ? ((SubLObject) $guardian_shutdown_marker$.getGlobalValue()) : Symbols.make_symbol($str66$Guardian_Shutdown_Marker)));
    $guardian_sleep_marker$ = deflexical("*GUARDIAN-SLEEP-MARKER*", ((NIL != Symbols.boundp($sym75$_GUARDIAN_SLEEP_MARKER_)) ? ((SubLObject) $guardian_sleep_marker$.getGlobalValue()) : Symbols.make_symbol($str76$Guardian_Sleep_Marker)));
    return NIL;
  }

  public static final SubLObject setup_guardian_file() {
    // CVS_ID("Id: guardian.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_GUARDIAN_PROCESS_);
    subl_macro_promotions.declare_defglobal($sym1$_GUARDING_REQUESTS_);
    subl_macro_promotions.declare_defglobal($sym2$_GUARDIAN_ISG_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_guardian_request$.getGlobalValue(), Symbols.symbol_function($sym10$GUARDIAN_REQUEST_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym11$GUARDIAN_REQUEST_ID, $sym12$_CSETF_GUARDIAN_REQUEST_ID);
    Structures.def_csetf($sym13$GUARDIAN_REQUEST_CHECKER_FN, $sym14$_CSETF_GUARDIAN_REQUEST_CHECKER_FN);
    Structures.def_csetf($sym15$GUARDIAN_REQUEST_PARAMETER, $sym16$_CSETF_GUARDIAN_REQUEST_PARAMETER);
    Structures.def_csetf($sym17$GUARDIAN_REQUEST_NOTIFICATION_FN, $sym18$_CSETF_GUARDIAN_REQUEST_NOTIFICATION_FN);
    Structures.def_csetf($sym19$GUARDIAN_REQUEST_INTERRUPT_P, $sym20$_CSETF_GUARDIAN_REQUEST_INTERRUPT_P);
    Structures.def_csetf($sym21$GUARDIAN_REQUEST_PROCESS, $sym22$_CSETF_GUARDIAN_REQUEST_PROCESS);
    Equality.identity($sym3$GUARDIAN_REQUEST);
    utilities_macros.register_cyc_api_function($sym36$SCHEDULE_GUARDIAN_REQUEST, $list37, $str38$Schedule_a_guardian_request___fun, $list39, $list40);
    utilities_macros.register_cyc_api_function($sym41$GUARDIAN_REQUEST_ID_P, $list42, $str43$Determine_whether_this_is_a_prope, NIL, $list44);
    utilities_macros.register_cyc_api_function($sym46$CANCEL_GUARDIAN_REQUEST, $list42, $str47$Abort_a_guardian_request_that_is_, $list48, $list49);
    utilities_macros.register_cyc_api_macro($sym57$WITH_GUARDIAN_REQUEST, $list50, $str58$Setup_a_guardian_request_and_canc);
    utilities_macros.register_cyc_api_function($sym59$ACTIVE_GUARDIAN_REQUESTS, NIL, $str60$The_active_guardian_requests_____, NIL, NIL);
    utilities_macros.register_cyc_api_function($sym63$INITIALIZE_GUARDIAN, NIL, $str64$Starts_the_guardian_unless_it_is_, NIL, $list44);
    subl_macro_promotions.declare_defglobal($sym65$_GUARDIAN_SHUTDOWN_MARKER_);
    utilities_macros.register_cyc_api_function($sym67$STOP_GUARDIAN, NIL, $str68$Tell_the_guardian_to_shut_itself_, NIL, $list44);
    utilities_macros.register_cyc_api_function($sym71$START_GUARDIAN, NIL, $str72$Launch_the_guardian_process__pote, NIL, $list44);
    utilities_macros.register_cyc_api_function($sym73$ENSURE_GUARDIAN_RUNNING, NIL, $str74$Launch_the_guardian_process_if_it, NIL, $list44);
    subl_macro_promotions.declare_defglobal($sym75$_GUARDIAN_SLEEP_MARKER_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_GUARDIAN_PROCESS_ = makeSymbol("*GUARDIAN-PROCESS*");
  public static final SubLSymbol $sym1$_GUARDING_REQUESTS_ = makeSymbol("*GUARDING-REQUESTS*");
  public static final SubLSymbol $sym2$_GUARDIAN_ISG_ = makeSymbol("*GUARDIAN-ISG*");
  public static final SubLSymbol $sym3$GUARDIAN_REQUEST = makeSymbol("GUARDIAN-REQUEST");
  public static final SubLSymbol $sym4$GUARDIAN_REQUEST_P = makeSymbol("GUARDIAN-REQUEST-P");
  public static final SubLList $list5 = list(makeSymbol("ID"), makeSymbol("CHECKER-FN"), makeSymbol("PARAMETER"), makeSymbol("NOTIFICATION-FN"), makeSymbol("INTERRUPT-P"), makeSymbol("PROCESS"));
  public static final SubLList $list6 = list(makeKeyword("ID"), makeKeyword("CHECKER-FN"), makeKeyword("PARAMETER"), makeKeyword("NOTIFICATION-FN"), makeKeyword("INTERRUPT-P"), makeKeyword("PROCESS"));
  public static final SubLList $list7 = list(makeSymbol("GUARDIAN-REQUEST-ID"), makeSymbol("GUARDIAN-REQUEST-CHECKER-FN"), makeSymbol("GUARDIAN-REQUEST-PARAMETER"), makeSymbol("GUARDIAN-REQUEST-NOTIFICATION-FN"), makeSymbol("GUARDIAN-REQUEST-INTERRUPT-P"), makeSymbol("GUARDIAN-REQUEST-PROCESS"));
  public static final SubLList $list8 = list(makeSymbol("_CSETF-GUARDIAN-REQUEST-ID"), makeSymbol("_CSETF-GUARDIAN-REQUEST-CHECKER-FN"), makeSymbol("_CSETF-GUARDIAN-REQUEST-PARAMETER"), makeSymbol("_CSETF-GUARDIAN-REQUEST-NOTIFICATION-FN"), makeSymbol("_CSETF-GUARDIAN-REQUEST-INTERRUPT-P"), makeSymbol("_CSETF-GUARDIAN-REQUEST-PROCESS"));
  public static final SubLSymbol $sym9$PRINT_GUARDIAN_REQUEST = makeSymbol("PRINT-GUARDIAN-REQUEST");
  public static final SubLSymbol $sym10$GUARDIAN_REQUEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GUARDIAN-REQUEST-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym11$GUARDIAN_REQUEST_ID = makeSymbol("GUARDIAN-REQUEST-ID");
  public static final SubLSymbol $sym12$_CSETF_GUARDIAN_REQUEST_ID = makeSymbol("_CSETF-GUARDIAN-REQUEST-ID");
  public static final SubLSymbol $sym13$GUARDIAN_REQUEST_CHECKER_FN = makeSymbol("GUARDIAN-REQUEST-CHECKER-FN");
  public static final SubLSymbol $sym14$_CSETF_GUARDIAN_REQUEST_CHECKER_FN = makeSymbol("_CSETF-GUARDIAN-REQUEST-CHECKER-FN");
  public static final SubLSymbol $sym15$GUARDIAN_REQUEST_PARAMETER = makeSymbol("GUARDIAN-REQUEST-PARAMETER");
  public static final SubLSymbol $sym16$_CSETF_GUARDIAN_REQUEST_PARAMETER = makeSymbol("_CSETF-GUARDIAN-REQUEST-PARAMETER");
  public static final SubLSymbol $sym17$GUARDIAN_REQUEST_NOTIFICATION_FN = makeSymbol("GUARDIAN-REQUEST-NOTIFICATION-FN");
  public static final SubLSymbol $sym18$_CSETF_GUARDIAN_REQUEST_NOTIFICATION_FN = makeSymbol("_CSETF-GUARDIAN-REQUEST-NOTIFICATION-FN");
  public static final SubLSymbol $sym19$GUARDIAN_REQUEST_INTERRUPT_P = makeSymbol("GUARDIAN-REQUEST-INTERRUPT-P");
  public static final SubLSymbol $sym20$_CSETF_GUARDIAN_REQUEST_INTERRUPT_P = makeSymbol("_CSETF-GUARDIAN-REQUEST-INTERRUPT-P");
  public static final SubLSymbol $sym21$GUARDIAN_REQUEST_PROCESS = makeSymbol("GUARDIAN-REQUEST-PROCESS");
  public static final SubLSymbol $sym22$_CSETF_GUARDIAN_REQUEST_PROCESS = makeSymbol("_CSETF-GUARDIAN-REQUEST-PROCESS");
  public static final SubLSymbol $kw23$ID = makeKeyword("ID");
  public static final SubLSymbol $kw24$CHECKER_FN = makeKeyword("CHECKER-FN");
  public static final SubLSymbol $kw25$PARAMETER = makeKeyword("PARAMETER");
  public static final SubLSymbol $kw26$NOTIFICATION_FN = makeKeyword("NOTIFICATION-FN");
  public static final SubLSymbol $kw27$INTERRUPT_P = makeKeyword("INTERRUPT-P");
  public static final SubLSymbol $kw28$PROCESS = makeKeyword("PROCESS");
  public static final SubLString $str29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str30$__GUARDIAN_REQUEST__A__check__A_a = makeString("#<GUARDIAN-REQUEST ~A: check ~A argument ~A notify ~A via ~A using ~A>");
  public static final SubLString $str31$INTERRUPT = makeString("INTERRUPT");
  public static final SubLString $str32$FUNCALL = makeString("FUNCALL");
  public static final SubLSymbol $sym33$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym34$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $sym35$VALID_PROCESS_P = makeSymbol("VALID-PROCESS-P");
  public static final SubLSymbol $sym36$SCHEDULE_GUARDIAN_REQUEST = makeSymbol("SCHEDULE-GUARDIAN-REQUEST");
  public static final SubLList $list37 = list(makeSymbol("CHECKER-FN"), makeSymbol("PARAMETER"), makeSymbol("NOTIFICATION-FN"), makeSymbol("&OPTIONAL"), makeSymbol("PROCESS"), makeSymbol("INTERRUPT-P"));
  public static final SubLString $str38$Schedule_a_guardian_request___fun = makeString("Schedule a guardian request. (funcall checker-fn parameter) will be called\n   until it returns NIL. \n   In this case, the requesting process is notified, either via FUNCALL or INTERRUPT-PROCESS-WITH-ARGS\n   and passed the parameter one last time; the INTERRUPT-P flag decides which one it is; FUNCALL is default.\n   @note use FUNCALL when the function invoked cannot or need not run in the process being notified;\n   for example, TERMINATE-ACTIVE-TASK-PROCESS already calls INTERRRUPT-PROCESS, and not all LISP implementation\n   actually handle that gracefully, so there FUNCALL is sufficient.\n   @return the ticked for the guardian request");
  public static final SubLList $list39 = list(list(makeSymbol("CHECKER-FN"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("NOTIFICATION-FN"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("INTERRUPT-P"), makeSymbol("BOOLEANP")));
  public static final SubLList $list40 = list(makeSymbol("FIXNUMP"));
  public static final SubLSymbol $sym41$GUARDIAN_REQUEST_ID_P = makeSymbol("GUARDIAN-REQUEST-ID-P");
  public static final SubLList $list42 = list(makeSymbol("REQUEST-ID"));
  public static final SubLString $str43$Determine_whether_this_is_a_prope = makeString("Determine whether this is a proper guardian request id.");
  public static final SubLList $list44 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym45$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLSymbol $sym46$CANCEL_GUARDIAN_REQUEST = makeSymbol("CANCEL-GUARDIAN-REQUEST");
  public static final SubLString $str47$Abort_a_guardian_request_that_is_ = makeString("Abort a guardian request that is currently scheduled to be checked.\n   @return T");
  public static final SubLList $list48 = list(list(makeSymbol("REQUEST-ID"), makeSymbol("FIXNUMP")));
  public static final SubLList $list49 = list(makeSymbol("SYMBOLP"));
  public static final SubLList $list50 = list(list(makeSymbol("CHECKER-FN"), makeSymbol("PARAMETER"), makeSymbol("NOTIFICATION-FN")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym51$REQUEST_ID = makeUninternedSymbol("REQUEST-ID");
  public static final SubLSymbol $sym52$PROGN = makeSymbol("PROGN");
  public static final SubLList $list53 = list(makeSymbol("ENSURE-GUARDIAN-RUNNING"));
  public static final SubLSymbol $sym54$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym55$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym56$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym57$WITH_GUARDIAN_REQUEST = makeSymbol("WITH-GUARDIAN-REQUEST");
  public static final SubLString $str58$Setup_a_guardian_request_and_canc = makeString("Setup a guardian request and cancel if necessary.");
  public static final SubLSymbol $sym59$ACTIVE_GUARDIAN_REQUESTS = makeSymbol("ACTIVE-GUARDIAN-REQUESTS");
  public static final SubLString $str60$The_active_guardian_requests_____ = makeString("The active guardian requests.\n   @return 0 the elements on the request queue\n   @return 1 the UnivTime Stamp of the contents");
  public static final SubLString $str61$Currrently_no_guardian_active_ = makeString("Currrently no guardian active.");
  public static final SubLString $str62$Active_Guardian_Requests_at_ = makeString("Active Guardian Requests at ");
  public static final SubLSymbol $sym63$INITIALIZE_GUARDIAN = makeSymbol("INITIALIZE-GUARDIAN");
  public static final SubLString $str64$Starts_the_guardian_unless_it_is_ = makeString("Starts the guardian unless it is running.");
  public static final SubLSymbol $sym65$_GUARDIAN_SHUTDOWN_MARKER_ = makeSymbol("*GUARDIAN-SHUTDOWN-MARKER*");
  public static final SubLString $str66$Guardian_Shutdown_Marker = makeString("Guardian Shutdown Marker");
  public static final SubLSymbol $sym67$STOP_GUARDIAN = makeSymbol("STOP-GUARDIAN");
  public static final SubLString $str68$Tell_the_guardian_to_shut_itself_ = makeString("Tell the guardian to shut itself down.");
  public static final SubLString $str69$Guardian_Process = makeString("Guardian Process");
  public static final SubLSymbol $sym70$GUARDIAN_HANDLER = makeSymbol("GUARDIAN-HANDLER");
  public static final SubLSymbol $sym71$START_GUARDIAN = makeSymbol("START-GUARDIAN");
  public static final SubLString $str72$Launch_the_guardian_process__pote = makeString("Launch the guardian process, potentially overwriting an existing guardian.");
  public static final SubLSymbol $sym73$ENSURE_GUARDIAN_RUNNING = makeSymbol("ENSURE-GUARDIAN-RUNNING");
  public static final SubLString $str74$Launch_the_guardian_process_if_it = makeString("Launch the guardian process if it is not currently running.");
  public static final SubLSymbol $sym75$_GUARDIAN_SLEEP_MARKER_ = makeSymbol("*GUARDIAN-SLEEP-MARKER*");
  public static final SubLString $str76$Guardian_Sleep_Marker = makeString("Guardian Sleep Marker");
  public static final SubLString $str77$Connection_Guardian_Requests_ = makeString("Connection Guardian Requests)");
  public static final SubLSymbol $kw78$DELETE = makeKeyword("DELETE");
  public static final SubLSymbol $kw79$CHECK_FAILED = makeKeyword("CHECK-FAILED");
  public static final SubLSymbol $kw80$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym81$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

  //// Initializers

  public void declareFunctions() {
    declare_guardian_file();
  }

  public void initializeVariables() {
    init_guardian_file();
  }

  public void runTopLevelForms() {
    setup_guardian_file();
  }

}
