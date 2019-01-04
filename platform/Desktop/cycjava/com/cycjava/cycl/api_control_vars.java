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
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class api_control_vars extends SubLTranslatedFile {

  //// Constructor

  private api_control_vars() {}
  public static final SubLFile me = new api_control_vars();
  public static final String myName = "com.cyc.cycjava.cycl.api_control_vars";

  //// Definitions

  /** Function used to determine constant handles during CFASL output.
If NIL, the default used is CONSTANT-INTERNAL-ID */
  @SubL(source = "cycl/api-control-vars.lisp", position = 557) 
  public static SubLSymbol $cfasl_constant_handle_func$ = null;

  /** Function used to look up constants from their handles during CFASL input.
If NIL, the default used is FIND-CONSTANT-BY-INTERNAL-ID */
  @SubL(source = "cycl/api-control-vars.lisp", position = 801) 
  public static SubLSymbol $cfasl_constant_handle_lookup_func$ = null;

  /** Function used to determine NART handles during CFASL output.
If NIL, the default used is NART-ID */
  @SubL(source = "cycl/api-control-vars.lisp", position = 1002) 
  public static SubLSymbol $cfasl_nart_handle_func$ = null;

  /** Function used to look up NARTs from their handles during CFASL input.
If NIL, the default used is FIND-NART-BY-ID */
  @SubL(source = "cycl/api-control-vars.lisp", position = 1159) 
  public static SubLSymbol $cfasl_nart_handle_lookup_func$ = null;

  /** Function used to determine assertion handles during CFASL output.
If NIL, the default used is ASSERTION-ID */
  @SubL(source = "cycl/api-control-vars.lisp", position = 1339) 
  public static SubLSymbol $cfasl_assertion_handle_func$ = null;

  /** Function used to look up assertions from their handles during CFASL input.
If NIL, the default used is FIND-ASSERTION-BY-ID */
  @SubL(source = "cycl/api-control-vars.lisp", position = 1511) 
  public static SubLSymbol $cfasl_assertion_handle_lookup_func$ = null;

  /** Function used to determine deduction handles during CFASL output.
If NIL, the default used is DEDUCTION-ID */
  @SubL(source = "cycl/api-control-vars.lisp", position = 1706) 
  public static SubLSymbol $cfasl_deduction_handle_func$ = null;

  /** Function used to look up deductions from their handles during CFASL input.
If NIL, the default used is FIND-DEDUCTION-BY-ID */
  @SubL(source = "cycl/api-control-vars.lisp", position = 1878) 
  public static SubLSymbol $cfasl_deduction_handle_lookup_func$ = null;

  /** Function used to determine KB HL supports during CFASL output.
If NIL, the default used is KB-HL-SUPPORT-ID */
  @SubL(source = "cycl/api-control-vars.lisp", position = 2073) 
  public static SubLSymbol $cfasl_kb_hl_support_handle_func$ = null;

  /** Function used to look up KB HL supports from their handles during CFASL input.
If NIL, the default used is FIND-KB-HL-SUPPORT-BY-ID */
  @SubL(source = "cycl/api-control-vars.lisp", position = 2250) 
  public static SubLSymbol $cfasl_kb_hl_support_handle_lookup_func$ = null;

  /** Function used to determine clause-struc handles during CFASL output.
If NIL, the default used is CLAUSE-STRUC-ID */
  @SubL(source = "cycl/api-control-vars.lisp", position = 2457) 
  public static SubLSymbol $cfasl_clause_struc_handle_func$ = null;

  /** Function used to look up clause-strucs from their handles during CFASL input.
If NIL, the default used is FIND-CLAUSE-STRUC-BY-ID */
  @SubL(source = "cycl/api-control-vars.lisp", position = 2638) 
  public static SubLSymbol $cfasl_clause_struc_handle_lookup_func$ = null;

  @SubL(source = "cycl/api-control-vars.lisp", position = 2842) 
  public static SubLSymbol $the_cyclist$ = null;

  @SubL(source = "cycl/api-control-vars.lisp", position = 3048) 
  public static SubLSymbol $use_local_queueP$ = null;

  /** The purpose to use for KE by default.  NIL = General Cyc KE. */
  @SubL(source = "cycl/api-control-vars.lisp", position = 3090) 
  public static SubLSymbol $default_ke_purpose$ = null;

  /** This variable contains current KE purpose for asserting formulas to the system.
NIL means that the KB purpose is generic extension of Cyc's knowledge. */
  @SubL(source = "cycl/api-control-vars.lisp", position = 3356) 
  public static SubLSymbol $ke_purpose$ = null;

  @SubL(source = "cycl/api-control-vars.lisp", position = 3566) 
  public static SubLSymbol $generate_readable_fi_results$ = null;

  public static final SubLObject declare_api_control_vars_file() {
    return NIL;
  }

  public static final SubLObject init_api_control_vars_file() {
    $cfasl_constant_handle_func$ = defparameter("*CFASL-CONSTANT-HANDLE-FUNC*", NIL);
    $cfasl_constant_handle_lookup_func$ = defparameter("*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*", NIL);
    $cfasl_nart_handle_func$ = defparameter("*CFASL-NART-HANDLE-FUNC*", NIL);
    $cfasl_nart_handle_lookup_func$ = defparameter("*CFASL-NART-HANDLE-LOOKUP-FUNC*", NIL);
    $cfasl_assertion_handle_func$ = defparameter("*CFASL-ASSERTION-HANDLE-FUNC*", NIL);
    $cfasl_assertion_handle_lookup_func$ = defparameter("*CFASL-ASSERTION-HANDLE-LOOKUP-FUNC*", NIL);
    $cfasl_deduction_handle_func$ = defparameter("*CFASL-DEDUCTION-HANDLE-FUNC*", NIL);
    $cfasl_deduction_handle_lookup_func$ = defparameter("*CFASL-DEDUCTION-HANDLE-LOOKUP-FUNC*", NIL);
    $cfasl_kb_hl_support_handle_func$ = defparameter("*CFASL-KB-HL-SUPPORT-HANDLE-FUNC*", NIL);
    $cfasl_kb_hl_support_handle_lookup_func$ = defparameter("*CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP-FUNC*", NIL);
    $cfasl_clause_struc_handle_func$ = defparameter("*CFASL-CLAUSE-STRUC-HANDLE-FUNC*", NIL);
    $cfasl_clause_struc_handle_lookup_func$ = defparameter("*CFASL-CLAUSE-STRUC-HANDLE-LOOKUP-FUNC*", NIL);
    $the_cyclist$ = defvar("*THE-CYCLIST*", NIL);
    $use_local_queueP$ = defparameter("*USE-LOCAL-QUEUE?*", T);
    $default_ke_purpose$ = defparameter("*DEFAULT-KE-PURPOSE*", NIL);
    $ke_purpose$ = defparameter("*KE-PURPOSE*", $default_ke_purpose$.getDynamicValue());
    $generate_readable_fi_results$ = defparameter("*GENERATE-READABLE-FI-RESULTS*", T);
    return NIL;
  }

  public static final SubLObject setup_api_control_vars_file() {
    // CVS_ID("Id: api-control-vars.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Initializers

  public void declareFunctions() {
    declare_api_control_vars_file();
  }

  public void initializeVariables() {
    init_api_control_vars_file();
  }

  public void runTopLevelForms() {
    setup_api_control_vars_file();
  }

}
