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
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class kb_macros extends SubLTranslatedFile {

  //// Constructor

  private kb_macros() {}
  public static final SubLFile me = new kb_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_macros";

  //// Definitions

  /** A list of forts which we are in the process of removing. */
  @SubL(source = "cycl/kb-macros.lisp", position = 746) 
  public static SubLSymbol $forts_being_removed$ = null;

  /** Return T iff we are in the process of removing some fort. */
  @SubL(source = "cycl/kb-macros.lisp", position = 1097) 
  public static final SubLObject some_fort_being_removedP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return list_utilities.sublisp_boolean($forts_being_removed$.getDynamicValue(thread));
    }
  }

  public static final SubLObject declare_kb_macros_file() {
    //declareMacro(myName, "note_fort_being_removed", "NOTE-FORT-BEING-REMOVED");
    declareFunction(myName, "some_fort_being_removedP", "SOME-FORT-BEING-REMOVED?", 0, 0, false);
    //declareFunction(myName, "fort_being_removedP", "FORT-BEING-REMOVED?", 1, 0, false);
    //declareMacro(myName, "do_kb_suid_table", "DO-KB-SUID-TABLE");
    //declareMacro(myName, "do_kb_suid_table_old_objects", "DO-KB-SUID-TABLE-OLD-OBJECTS");
    //declareMacro(myName, "do_kb_suid_table_new_objects", "DO-KB-SUID-TABLE-NEW-OBJECTS");
    return NIL;
  }

  public static final SubLObject init_kb_macros_file() {
    $forts_being_removed$ = defparameter("*FORTS-BEING-REMOVED*", NIL);
    return NIL;
  }

  public static final SubLObject setup_kb_macros_file() {
    // CVS_ID("Id: kb-macros.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("FORT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym2$_FORTS_BEING_REMOVED_ = makeSymbol("*FORTS-BEING-REMOVED*");
  public static final SubLSymbol $sym3$CONS = makeSymbol("CONS");
  public static final SubLList $list4 = list(makeSymbol("*FORTS-BEING-REMOVED*"));
  public static final SubLList $list5 = list(list(makeSymbol("VAR"), makeSymbol("TABLE"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list6 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw7$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw8$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $kw9$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym10$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym11$DO_ID_INDEX = makeSymbol("DO-ID-INDEX");
  public static final SubLSymbol $kw12$ORDERED = makeKeyword("ORDERED");
  public static final SubLSymbol $sym13$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym14$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym15$DO_ID_INDEX_OLD_OBJECTS = makeSymbol("DO-ID-INDEX-OLD-OBJECTS");
  public static final SubLList $list16 = list(list(makeSymbol("VAR"), makeSymbol("TABLE"), makeSymbol("&KEY"), makeSymbol("ORDERED"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list17 = list(makeKeyword("ORDERED"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $sym18$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym19$DO_ID_INDEX_NEW_OBJECTS = makeSymbol("DO-ID-INDEX-NEW-OBJECTS");

  //// Initializers

  public void declareFunctions() {
    declare_kb_macros_file();
  }

  public void initializeVariables() {
    init_kb_macros_file();
  }

  public void runTopLevelForms() {
    setup_kb_macros_file();
  }

}
