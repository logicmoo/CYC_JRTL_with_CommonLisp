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

package  com.cyc.cycjava.cycl.cyc_testing;

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
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;

public  final class cyc_testing_initialization extends SubLTranslatedFile {

  //// Constructor

  private cyc_testing_initialization() {}
  public static final SubLFile me = new cyc_testing_initialization();
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.cyc_testing_initialization";

  //// Definitions

  /** Set to t after initializations have been performed.
   IF YOU RECOMPILE THIS (thereby setting it back to nil), IT WILL BREAK CYC-TESTING.
   If you start getting errors like 'FOO is not a GENERIC-TEST-CASE-TABLE-P',
   you need to rerun perform-cyc-testing-initializations. */
  @SubL(source = "cycl/cyc-testing/cyc-testing-initialization.lisp", position = 1123) 
  private static SubLSymbol $cyc_tests_initializedP$ = null;

  @SubL(source = "cycl/cyc-testing/cyc-testing-initialization.lisp", position = 1452) 
  public static final SubLObject cyc_tests_initializedP() {
    return $cyc_tests_initializedP$.getGlobalValue();
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing-initialization.lisp", position = 1531) 
  public static final SubLObject perform_cyc_testing_initializations() {
    cyc_testing.index_all_cyc_tests_by_name();
    $cyc_tests_initializedP$.setGlobalValue(T);
    return NIL;
  }

  public static final SubLObject declare_cyc_testing_initialization_file() {
    declareFunction(myName, "cyc_tests_initializedP", "CYC-TESTS-INITIALIZED?", 0, 0, false);
    declareFunction(myName, "perform_cyc_testing_initializations", "PERFORM-CYC-TESTING-INITIALIZATIONS", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_cyc_testing_initialization_file() {
    $cyc_tests_initializedP$ = deflexical("*CYC-TESTS-INITIALIZED?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_cyc_testing_initialization_file() {
    // CVS_ID("Id: cyc-testing-initialization.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Initializers

  public void declareFunctions() {
    declare_cyc_testing_initialization_file();
  }

  public void initializeVariables() {
    init_cyc_testing_initialization_file();
  }

  public void runTopLevelForms() {
    setup_cyc_testing_initialization_file();
  }

}
