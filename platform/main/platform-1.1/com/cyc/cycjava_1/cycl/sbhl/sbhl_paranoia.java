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

package  com.cyc.cycjava_1.cycl.sbhl;

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
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.kb_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava_1.cycl.system_parameters;

public  final class sbhl_paranoia extends SubLTranslatedFile {

  //// Constructor

  private sbhl_paranoia() {}
  public static final SubLFile me = new sbhl_paranoia();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia";

  //// Definitions

  /** Parameter that governs whether we perform work within @see sbhl-check-type */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 777) 
  public static SubLSymbol $sbhl_object_type_checking_p$ = null;

  /** Accessor. @return booleanp; the value of @see *sbhl-object-type-checking-p */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 1003) 
  public static final SubLObject sbhl_object_type_checking_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != $sbhl_object_type_checking_p$.getDynamicValue(thread))
            || (NIL == suspend_sbhl_type_checkingP())));
    }
  }

  /** Parameter that guides error behavior. */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 1469) 
  public static SubLSymbol $sbhl_type_error_action$ = null;

  /** controls extent of tracing, warnings, etc., for the sbhl modules [0 .. 5] */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 2465) 
  public static SubLSymbol $sbhl_trace_level$ = null;

  /** If *sbhl-trace-level* is greater than or equal to LEVEL, signal a cerror with FORMAT-STR. If *sbhl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn. */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 3076) 
  public static final SubLObject sbhl_error(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
    if ((arg1 == UNPROVIDED)) {
      arg1 = NIL;
    }
    if ((arg2 == UNPROVIDED)) {
      arg2 = NIL;
    }
    if ((arg3 == UNPROVIDED)) {
      arg3 = NIL;
    }
    if ((arg4 == UNPROVIDED)) {
      arg4 = NIL;
    }
    if ((arg5 == UNPROVIDED)) {
      arg5 = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(level, $sym21$INTEGERP);
      checkType(format_str, $sym22$STRINGP);
      if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
        Errors.cerror($str14$continue_anyway, format_str, new SubLObject[] {arg1, arg2, arg3, arg4, arg5});
      } else if (Numbers.add(TWO_INTEGER, $sbhl_trace_level$.getDynamicValue(thread)).numGE(level)) {
        Errors.warn(format_str, new SubLObject[] {arg1, arg2, arg3, arg4, arg5});
      }
      return NIL;
    }
  }


  /** If *sbhl-trace-level* is greater than or equal to LEVEL, signal a cerror with CONTINUE-STR and FORMAT-STR. If *sbhl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn. */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 3615) 
  public static final SubLObject sbhl_cerror(SubLObject level, SubLObject continue_str, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
    if ((arg1 == UNPROVIDED)) {
      arg1 = NIL;
    }
    if ((arg2 == UNPROVIDED)) {
      arg2 = NIL;
    }
    if ((arg3 == UNPROVIDED)) {
      arg3 = NIL;
    }
    if ((arg4 == UNPROVIDED)) {
      arg4 = NIL;
    }
    if ((arg5 == UNPROVIDED)) {
      arg5 = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(level, $sym21$INTEGERP);
      checkType(continue_str, $sym22$STRINGP);
      checkType(format_str, $sym22$STRINGP);
      if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
        Errors.cerror(continue_str, format_str, new SubLObject[] {arg1, arg2, arg3, arg4, arg5});
      } else if (Numbers.add(TWO_INTEGER, $sbhl_trace_level$.getDynamicValue(thread)).numGE(level)) {
        Errors.warn(format_str, new SubLObject[] {arg1, arg2, arg3, arg4, arg5});
      }
      return NIL;
    }
  }

  
  /** If *sbhl-trace-level* is greater than or equal to LEVEL, warn with FORMAT-STR. @see warn. */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 4216) 
  public static final SubLObject sbhl_warn(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
    if ((arg1 == UNPROVIDED)) {
      arg1 = NIL;
    }
    if ((arg2 == UNPROVIDED)) {
      arg2 = NIL;
    }
    if ((arg3 == UNPROVIDED)) {
      arg3 = NIL;
    }
    if ((arg4 == UNPROVIDED)) {
      arg4 = NIL;
    }
    if ((arg5 == UNPROVIDED)) {
      arg5 = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(level, $sym21$INTEGERP);
      checkType(format_str, $sym22$STRINGP);
      if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
        Functions.apply($sym16$WARN, format_str, new SubLObject[] {arg1, arg2, arg3, arg4, arg5});
        return NIL;
      }
      return NIL;
    }
  }

  /** @return whether to suspend type checking at the moment */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 4566) 
  public static final SubLObject suspend_sbhl_type_checkingP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != Types.$suspend_type_checkingP$.getDynamicValue(thread))
            || (NIL != system_parameters.$suspend_sbhl_type_checkingP$.getDynamicValue(thread))
            || (NIL != kb_macros.some_fort_being_removedP())
            || (NIL != control_vars.$within_unassert$.getDynamicValue(thread))));
    }
  }

  /** controls extent of integrity testing for the sbhl modules [0 .. 5] */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 5122) 
  public static SubLSymbol $sbhl_test_level$ = null;

  /** controls very expensive sbhl testing */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 5420) 
  public static SubLSymbol $sbhl_test_maxP$ = null;

  /** controls very expensive sbhl tracing */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 5646) 
  public static SubLSymbol $sbhl_trace_maxP$ = null;

  /** suppress retyping of forts iff this is non-nil */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 5876) 
  public static SubLSymbol $suppress_sbhl_recachingP$ = null;

  /** suppress use of fort types, and call the SBHL instead.
   This should be set to NIL during fort types initialization. */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 6101) 
  public static SubLSymbol $suspend_sbhl_cache_useP$ = null;

  /** Accessor. @return booleanp; whether we are using sbhl caches.
   If this is NIL, we are just using sbhl-predicate-relation-p */
  @SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 6359) 
  public static final SubLObject check_sbhl_cachesP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL == $suspend_sbhl_cache_useP$.getDynamicValue(thread))
             && (NIL != sbhl_cache.sbhl_caches_initialized_p())));
    }
  }

  public static final SubLObject declare_sbhl_paranoia_file() {
    declareFunction(myName, "sbhl_object_type_checking_p", "SBHL-OBJECT-TYPE-CHECKING-P", 0, 0, false);
    //declareMacro(myName, "without_sbhl_object_type_checking", "WITHOUT-SBHL-OBJECT-TYPE-CHECKING");
    //declareMacro(myName, "sbhl_check_type", "SBHL-CHECK-TYPE");
    //declareMacro(myName, "sbhl_check_type_if_present", "SBHL-CHECK-TYPE-IF-PRESENT");
    //declareFunction(myName, "sbhl_note", "SBHL-NOTE", 2, 5, false);
    declareFunction(myName, "sbhl_error", "SBHL-ERROR", 2, 5, false);
    //declareFunction(myName, "sbhl_cerror", "SBHL-CERROR", 3, 5, false);
    declareFunction(myName, "sbhl_warn", "SBHL-WARN", 2, 5, false);
    declareFunction(myName, "suspend_sbhl_type_checkingP", "SUSPEND-SBHL-TYPE-CHECKING?", 0, 0, false);
    //declareMacro(myName, "sbhl_trace", "SBHL-TRACE");
    //declareMacro(myName, "sbhl_test", "SBHL-TEST");
    //declareMacro(myName, "sbhl_test_max", "SBHL-TEST-MAX");
    //declareMacro(myName, "sbhl_trace_max", "SBHL-TRACE-MAX");
    declareFunction(myName, "check_sbhl_cachesP", "CHECK-SBHL-CACHES?", 0, 0, false);
    //declareMacro(myName, "without_sbhl_caches", "WITHOUT-SBHL-CACHES");
    //declareMacro(myName, "with_sbhl_caches", "WITH-SBHL-CACHES");
    return NIL;
  }

  public static final SubLObject init_sbhl_paranoia_file() {
    $sbhl_object_type_checking_p$ = defparameter("*SBHL-OBJECT-TYPE-CHECKING-P*", T);
    $sbhl_type_error_action$ = defparameter("*SBHL-TYPE-ERROR-ACTION*", $kw2$ERROR);
    $sbhl_trace_level$ = defparameter("*SBHL-TRACE-LEVEL*", ONE_INTEGER);
    $sbhl_test_level$ = defparameter("*SBHL-TEST-LEVEL*", THREE_INTEGER);
    $sbhl_test_maxP$ = defparameter("*SBHL-TEST-MAX?*", NIL);
    $sbhl_trace_maxP$ = defparameter("*SBHL-TRACE-MAX?*", NIL);
    $suppress_sbhl_recachingP$ = defparameter("*SUPPRESS-SBHL-RECACHING?*", NIL);
    $suspend_sbhl_cache_useP$ = defparameter("*SUSPEND-SBHL-CACHE-USE?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_sbhl_paranoia_file() {
    // CVS_ID("Id: sbhl-paranoia.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLET = makeSymbol("CLET");
  public static final SubLList $list1 = list(list(makeSymbol("*SBHL-OBJECT-TYPE-CKECKING-P*"), NIL));
  public static final SubLSymbol $kw2$ERROR = makeKeyword("ERROR");
  public static final SubLList $list3 = list(makeSymbol("OBJECT"), makeSymbol("TYPE-TEST"), makeSymbol("&OPTIONAL"), list(makeSymbol("LEVEL"), ONE_INTEGER));
  public static final SubLSymbol $sym4$PWHEN = makeSymbol("PWHEN");
  public static final SubLList $list5 = list(makeSymbol("SBHL-OBJECT-TYPE-CHECKING-P"));
  public static final SubLSymbol $sym6$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym7$PCASE = makeSymbol("PCASE");
  public static final SubLSymbol $sym8$_SBHL_TYPE_ERROR_ACTION_ = makeSymbol("*SBHL-TYPE-ERROR-ACTION*");
  public static final SubLSymbol $sym9$SBHL_ERROR = makeSymbol("SBHL-ERROR");
  public static final SubLString $str10$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym11$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $kw12$CERROR = makeKeyword("CERROR");
  public static final SubLSymbol $sym13$SBHL_CERROR = makeSymbol("SBHL-CERROR");
  public static final SubLString $str14$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw15$WARN = makeKeyword("WARN");
  public static final SubLSymbol $sym16$WARN = makeSymbol("WARN");
  public static final SubLSymbol $sym17$OTHERWISE = makeSymbol("OTHERWISE");
  public static final SubLList $list18 = list(makeSymbol("WARN"), makeString("~A is not a valid *sbhl-type-error-action* value"), makeSymbol("*SBHL-TYPE-ERROR-ACTION*"));
  public static final SubLSymbol $sym19$CERROR = makeSymbol("CERROR");
  public static final SubLSymbol $sym20$SBHL_CHECK_TYPE = makeSymbol("SBHL-CHECK-TYPE");
  public static final SubLSymbol $sym21$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym22$STRINGP = makeSymbol("STRINGP");
  public static final SubLList $list23 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym24$__ = makeSymbol(">=");
  public static final SubLSymbol $sym25$_SBHL_TRACE_LEVEL_ = makeSymbol("*SBHL-TRACE-LEVEL*");
  public static final SubLSymbol $sym26$_SBHL_TEST_LEVEL_ = makeSymbol("*SBHL-TEST-LEVEL*");
  public static final SubLSymbol $sym27$_SBHL_TEST_MAX__ = makeSymbol("*SBHL-TEST-MAX?*");
  public static final SubLSymbol $sym28$_SBHL_TRACE_MAX__ = makeSymbol("*SBHL-TRACE-MAX?*");
  public static final SubLList $list29 = list(list(makeSymbol("*SUSPEND-SBHL-CACHE-USE?*"), T));
  public static final SubLList $list30 = list(list(makeSymbol("*SUSPEND-SBHL-CACHE-USE?*"), NIL));

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_paranoia_file();
  }

  public void initializeVariables() {
    init_sbhl_paranoia_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_paranoia_file();
  }

}
