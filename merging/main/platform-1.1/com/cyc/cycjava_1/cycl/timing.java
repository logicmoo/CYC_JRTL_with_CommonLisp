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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class timing extends SubLTranslatedFile {

  //// Constructor

  private timing() {}
  public static final SubLFile me = new timing();
  public static final String myName = "com.cyc.cycjava_1.cycl.timing";

  //// Definitions

  /** The storage place for timing runs, parameterized by some key */
  @SubL(source = "cycl/timing.lisp", position = 1700) 
  private static SubLSymbol $time_testing_environment$ = null;

  /** The storage place for the timing info in this run pertaining to a function */
  @SubL(source = "cycl/timing.lisp", position = 1837) 
  private static SubLSymbol $timing_table$ = null;

  /** Do we want to time anything at all? */
  @SubL(source = "cycl/timing.lisp", position = 1976) 
  private static SubLSymbol $utilize_timing_hooks$ = null;

  /** a boolean describing scope of timing focus.. if true, everything deftimed contributes to timing reports */
  @SubL(source = "cycl/timing.lisp", position = 2065) 
  private static SubLSymbol $all_currently_active$ = null;

  /** Those specific functions you're interested in timing */
  @SubL(source = "cycl/timing.lisp", position = 2224) 
  private static SubLSymbol $timed_funs$ = null;

  public static final class $timing_info_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $count; }
    public SubLObject getField3() { return $total; }
    public SubLObject getField4() { return $max; }
    public SubLObject setField2(SubLObject value) { return $count = value; }
    public SubLObject setField3(SubLObject value) { return $total = value; }
    public SubLObject setField4(SubLObject value) { return $max = value; }
    public SubLObject $count = NIL;
    public SubLObject $total = NIL;
    public SubLObject $max = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($timing_info_native.class, $sym10$TIMING_INFO, $sym11$TIMING_INFO_P, $list12, $list13, new String[] {"$count", "$total", "$max"}, $list14, $list15, $sym16$PRINT_TIMING_INFO);
  }

  @SubL(source = "cycl/timing.lisp", position = 5452) 
  public static SubLSymbol $dtp_timing_info$ = null;

  @SubL(source = "cycl/timing.lisp", position = 5452) 
  public static final SubLObject timing_info_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12094");
    return NIL;
  }

  public static final class $timing_info_p$UnaryFunction extends UnaryFunction {
    public $timing_info_p$UnaryFunction() { super(extractFunctionNamed("TIMING-INFO-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12097"); }
  }

  public static final SubLObject declare_timing_file() {
    //declareMacro("with_new_testing_environement", "WITH-NEW-TESTING-ENVIRONEMENT");
    //declareMacro("timing_no_functions", "TIMING-NO-FUNCTIONS");
    //declareMacro("timing_all_functions", "TIMING-ALL-FUNCTIONS");
    //declareMacro("timing_these_functions", "TIMING-THESE-FUNCTIONS");
    //declareFunction("report_fun", "REPORT-FUN", 1, 0, false);
    //declareFunction("report_time", "REPORT-TIME", 1, 0, false);
    //declareFunction("report_timing_info", "REPORT-TIMING-INFO", 0, 1, false);
    //declareFunction("report_time_testing_info", "REPORT-TIME-TESTING-INFO", 0, 0, false);
    //declareFunction("clear_timing_info", "CLEAR-TIMING-INFO", 0, 0, false);
    //declareFunction("clear_time_testing_info", "CLEAR-TIME-TESTING-INFO", 0, 0, false);
    declareFunction("timing_info_print_function_trampoline", "TIMING-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction("timing_info_p", "TIMING-INFO-P", 1, 0, false); new $timing_info_p$UnaryFunction();
    //declareFunction("timing_info_count", "TIMING-INFO-COUNT", 1, 0, false);
    //declareFunction("timing_info_total", "TIMING-INFO-TOTAL", 1, 0, false);
    //declareFunction("timing_info_max", "TIMING-INFO-MAX", 1, 0, false);
    //declareFunction("_csetf_timing_info_count", "_CSETF-TIMING-INFO-COUNT", 2, 0, false);
    //declareFunction("_csetf_timing_info_total", "_CSETF-TIMING-INFO-TOTAL", 2, 0, false);
    //declareFunction("_csetf_timing_info_max", "_CSETF-TIMING-INFO-MAX", 2, 0, false);
    //declareFunction("make_timing_info", "MAKE-TIMING-INFO", 0, 1, false);
    //declareFunction("print_timing_info", "PRINT-TIMING-INFO", 3, 0, false);
    //declareFunction("time_functionP", "TIME-FUNCTION?", 1, 0, false);
    //declareFunction("record_time", "RECORD-TIME", 2, 0, false);
    //declareFunction("new_timing_info", "NEW-TIMING-INFO", 1, 0, false);
    //declareFunction("update_timing_info", "UPDATE-TIMING-INFO", 2, 0, false);
    //declareMacro("deftimed_generic", "DEFTIMED-GENERIC");
    //declareMacro("deftimed_private", "DEFTIMED-PRIVATE");
    //declareMacro("deftimed_protected", "DEFTIMED-PROTECTED");
    //declareMacro("deftimed", "DEFTIMED");
    //declareMacro("deftimed_public", "DEFTIMED-PUBLIC");
    //declareMacro("deftimed_api", "DEFTIMED-API");
    return NIL;
  }

  public static final SubLObject init_timing_file() {
    $time_testing_environment$ = defparameter("*TIME-TESTING-ENVIRONMENT*", Hashtables.make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
    $timing_table$ = defparameter("*TIMING-TABLE*", Hashtables.make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED));
    $utilize_timing_hooks$ = defparameter("*UTILIZE-TIMING-HOOKS*", T);
    $all_currently_active$ = defparameter("*ALL-CURRENTLY-ACTIVE*", NIL);
    $timed_funs$ = defparameter("*TIMED-FUNS*", NIL);
    $dtp_timing_info$ = defconstant("*DTP-TIMING-INFO*", $sym10$TIMING_INFO);
    return NIL;
  }

  public static final SubLObject setup_timing_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_timing_info$.getGlobalValue(), Symbols.symbol_function($sym17$TIMING_INFO_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym18$TIMING_INFO_COUNT, $sym19$_CSETF_TIMING_INFO_COUNT);
    Structures.def_csetf($sym20$TIMING_INFO_TOTAL, $sym21$_CSETF_TIMING_INFO_TOTAL);
    Structures.def_csetf($sym22$TIMING_INFO_MAX, $sym23$_CSETF_TIMING_INFO_MAX);
    Equality.identity($sym10$TIMING_INFO);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLET = makeSymbol("CLET");
  public static final SubLList $list1 = list(makeSymbol("*TIMING-TABLE*"), list(makeSymbol("MAKE-HASH-TABLE"), TEN_INTEGER));
  public static final SubLList $list2 = list(list(makeSymbol("*UTILIZE-TIMING-HOOKS*"), NIL), list(makeSymbol("*ALL-CURRENTLY-ACTIVE*"), NIL));
  public static final SubLList $list3 = list(list(makeSymbol("*UTILIZE-TIMING-HOOKS*"), T), list(makeSymbol("*ALL-CURRENTLY-ACTIVE*"), T));
  public static final SubLList $list4 = list(makeSymbol("FUNCTIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list5 = list(makeSymbol("*UTILIZE-TIMING-HOOKS*"), T);
  public static final SubLList $list6 = list(makeSymbol("*ALL-CURRENTLY-ACTIVE*"), NIL);
  public static final SubLSymbol $sym7$_TIMED_FUNS_ = makeSymbol("*TIMED-FUNS*");
  public static final SubLString $str8$Timing_info_cleared = makeString("Timing info cleared");
  public static final SubLString $str9$Time_testing_environment_cleared = makeString("Time testing environment cleared");
  public static final SubLSymbol $sym10$TIMING_INFO = makeSymbol("TIMING-INFO");
  public static final SubLSymbol $sym11$TIMING_INFO_P = makeSymbol("TIMING-INFO-P");
  public static final SubLList $list12 = list(makeSymbol("COUNT"), makeSymbol("TOTAL"), makeSymbol("MAX"));
  public static final SubLList $list13 = list(makeKeyword("COUNT"), makeKeyword("TOTAL"), makeKeyword("MAX"));
  public static final SubLList $list14 = list(makeSymbol("TIMING-INFO-COUNT"), makeSymbol("TIMING-INFO-TOTAL"), makeSymbol("TIMING-INFO-MAX"));
  public static final SubLList $list15 = list(makeSymbol("_CSETF-TIMING-INFO-COUNT"), makeSymbol("_CSETF-TIMING-INFO-TOTAL"), makeSymbol("_CSETF-TIMING-INFO-MAX"));
  public static final SubLSymbol $sym16$PRINT_TIMING_INFO = makeSymbol("PRINT-TIMING-INFO");
  public static final SubLSymbol $sym17$TIMING_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TIMING-INFO-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym18$TIMING_INFO_COUNT = makeSymbol("TIMING-INFO-COUNT");
  public static final SubLSymbol $sym19$_CSETF_TIMING_INFO_COUNT = makeSymbol("_CSETF-TIMING-INFO-COUNT");
  public static final SubLSymbol $sym20$TIMING_INFO_TOTAL = makeSymbol("TIMING-INFO-TOTAL");
  public static final SubLSymbol $sym21$_CSETF_TIMING_INFO_TOTAL = makeSymbol("_CSETF-TIMING-INFO-TOTAL");
  public static final SubLSymbol $sym22$TIMING_INFO_MAX = makeSymbol("TIMING-INFO-MAX");
  public static final SubLSymbol $sym23$_CSETF_TIMING_INFO_MAX = makeSymbol("_CSETF-TIMING-INFO-MAX");
  public static final SubLSymbol $kw24$COUNT = makeKeyword("COUNT");
  public static final SubLSymbol $kw25$TOTAL = makeKeyword("TOTAL");
  public static final SubLSymbol $kw26$MAX = makeKeyword("MAX");
  public static final SubLString $str27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str28$____TIMING_INFO__Count__S_Total__ = makeString("~&#<TIMING-INFO: Count=~S Total=~S Max=~S>~%");
  public static final SubLList $list29 = list(makeSymbol("DEFINING-FORM"), makeSymbol("FUN"), makeSymbol("ARGS"), makeSymbol("STUFF"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym30$LOCAL_TIMER = makeUninternedSymbol("LOCAL-TIMER");
  public static final SubLSymbol $sym31$RESULT = makeUninternedSymbol("RESULT");
  public static final SubLString $str32$_IN_TIMER = makeString("-IN-TIMER");
  public static final SubLSymbol $sym33$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym34$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym35$TIME_FUNCTION_ = makeSymbol("TIME-FUNCTION?");
  public static final SubLSymbol $sym36$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym37$CTIME = makeSymbol("CTIME");
  public static final SubLSymbol $sym38$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym39$MULTIPLE_VALUE_LIST = makeSymbol("MULTIPLE-VALUE-LIST");
  public static final SubLSymbol $sym40$RECORD_TIME = makeSymbol("RECORD-TIME");
  public static final SubLSymbol $sym41$RET = makeSymbol("RET");
  public static final SubLSymbol $sym42$VALUES_LIST = makeSymbol("VALUES-LIST");
  public static final SubLSymbol $sym43$DEFINE_PRIVATE = makeSymbol("DEFINE-PRIVATE");
  public static final SubLList $list44 = list(makeSymbol("FUN"), makeSymbol("ARGS"), list(makeSymbol("&REST"), makeSymbol("STUFF")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym45$DEFTIMED_GENERIC = makeSymbol("DEFTIMED-GENERIC");
  public static final SubLSymbol $sym46$DEFINE_PROTECTED = makeSymbol("DEFINE-PROTECTED");
  public static final SubLSymbol $sym47$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym48$DEFINE_PUBLIC = makeSymbol("DEFINE-PUBLIC");
  public static final SubLSymbol $sym49$DEFINE_API = makeSymbol("DEFINE-API");

  //// Initializers

  public void declareFunctions() {
    declare_timing_file();
  }

  public void initializeVariables() {
    init_timing_file();
  }

  public void runTopLevelForms() {
    setup_timing_file();
  }

}
