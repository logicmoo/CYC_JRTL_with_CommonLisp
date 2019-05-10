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

package com.cyc.cycjava_1.cycl.sksi.sksi_infrastructure;
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
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class sksi_macros extends SubLTranslatedFile {

  //// Constructor

  private sksi_macros() {}
  public static final SubLFile me = new sksi_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.sksi.sksi_infrastructure.sksi_macros";

  //// Definitions

  @SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 4675) 
  public static SubLSymbol $sksi_sql_connection_cache$ = null;

  @SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 4877) 
  public static SubLSymbol $sksi_sql_statement_cache$ = null;

  @SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 4933) 
  public static SubLSymbol $sksi_sql_statement_pool_lock$ = null;

  public static final SubLObject declare_sksi_macros_file() {
    declareMacro(myName, "with_sksi_reformulation_caching", "WITH-SKSI-REFORMULATION-CACHING");
    declareMacro(myName, "without_sksi_reformulation_caching", "WITHOUT-SKSI-REFORMULATION-CACHING");
    declareMacro(myName, "with_sksi_sql_connection_resourcing", "WITH-SKSI-SQL-CONNECTION-RESOURCING");
    return NIL;
  }

  public static final SubLObject init_sksi_macros_file() {
    $sksi_sql_connection_cache$ = defparameter("*SKSI-SQL-CONNECTION-CACHE*", NIL);
    $sksi_sql_statement_cache$ = defparameter("*SKSI-SQL-STATEMENT-CACHE*", NIL);
    $sksi_sql_statement_pool_lock$ = defparameter("*SKSI-SQL-STATEMENT-POOL-LOCK*", NIL);
    return NIL;
  }

  public static final SubLObject setup_sksi_macros_file() {
    // CVS_ID("Id: sksi-macros.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLET = makeSymbol("CLET");
  public static final SubLList $list1 = list(list(makeSymbol("*MEMOIZE-SKSI-REFORMULATE?*"), T));
  public static final SubLList $list2 = list(list(makeSymbol("*MEMOIZE-SKSI-REFORMULATE?*"), NIL));
  public static final SubLSymbol $sym3$PROGN = makeSymbol("PROGN");

  //// Initializers

  public void declareFunctions() {
    declare_sksi_macros_file();
  }

  public void initializeVariables() {
    init_sksi_macros_file();
  }

  public void runTopLevelForms() {
    setup_sksi_macros_file();
  }

}
