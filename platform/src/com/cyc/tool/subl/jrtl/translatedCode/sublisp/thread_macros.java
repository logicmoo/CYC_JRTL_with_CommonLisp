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

package  com.cyc.tool.subl.jrtl.translatedCode.sublisp;

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

public  final class thread_macros extends SubLTranslatedFile {

  //// Constructor

  private thread_macros() {}
  public static final SubLFile me = new thread_macros();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.thread_macros";

  //// Definitions

  @SubL(source = "sublisp/thread-macros.lisp", position = 709) 
  public static final SubLObject with_lock_held(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject lock = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
          lock = current.first();
          current = current.rest();
          {
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_1 = NIL;
            for (; (NIL != rest); ) {
              cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list0);
              current_1 = rest.first();
              rest = rest.rest();
              cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list0);
              if ((NIL == conses_high.member(current_1, $list1, UNPROVIDED, UNPROVIDED))) {
                bad = T;
              }
              if ((current_1 == $kw2$ALLOW_OTHER_KEYS)) {
                allow_other_keys_p = rest.first();
              }
              rest = rest.rest();
            }
            if (((NIL != bad)
                 && (NIL == allow_other_keys_p))) {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list0);
            }
            {
              SubLObject whostate_tail = cdestructuring_bind.property_list_member($kw3$WHOSTATE, current);
              SubLObject whostate = ((NIL != whostate_tail) ? ((SubLObject) conses_high.cadr(whostate_tail)) : $str4$Seize_lock);
              current = temp;
              {
                SubLObject body = current;
                return with_lock_held_internal(lock, whostate, body);
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/thread-macros.lisp", position = 1088) 
  public static final SubLObject with_lock_held_internal(SubLObject lock, SubLObject whostate, SubLObject body) {
    {
      SubLObject lock_var = Symbols.make_symbol($str5$LOCK);
      SubLObject release_var = Symbols.make_symbol($str6$RELEASE);
      return list($sym7$CLET, list(list(lock_var, lock), reader.bq_cons(release_var, $list8)), list($sym9$CUNWIND_PROTECT, listS($sym10$PROGN, list($sym11$CSETQ, release_var, list($sym12$SEIZE_LOCK, lock_var)), ConsesLow.append(body, NIL)), list($sym13$PWHEN, release_var, list($sym14$RELEASE_LOCK, lock_var))));
    }
  }

  public static final SubLObject declare_thread_macros_file() {
    declareMacro(myName, "with_lock_held", "WITH-LOCK-HELD");
    declareFunction(myName, "with_lock_held_internal", "WITH-LOCK-HELD-INTERNAL", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_thread_macros_file() {
    return NIL;
  }

  public static final SubLObject setup_thread_macros_file() {
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("LOCK"), makeSymbol("&KEY"), list(makeSymbol("WHOSTATE"), makeString("Seize lock"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list1 = list(makeKeyword("WHOSTATE"));
  public static final SubLSymbol $kw2$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw3$WHOSTATE = makeKeyword("WHOSTATE");
  public static final SubLString $str4$Seize_lock = makeString("Seize lock");
  public static final SubLString $str5$LOCK = makeString("LOCK");
  public static final SubLString $str6$RELEASE = makeString("RELEASE");
  public static final SubLSymbol $sym7$CLET = makeSymbol("CLET");
  public static final SubLList $list8 = list(NIL);
  public static final SubLSymbol $sym9$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym10$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym11$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym12$SEIZE_LOCK = makeSymbol("SEIZE-LOCK");
  public static final SubLSymbol $sym13$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym14$RELEASE_LOCK = makeSymbol("RELEASE-LOCK");

  //// Initializers

  public void declareFunctions() {
    declare_thread_macros_file();
  }

  public void initializeVariables() {
    init_thread_macros_file();
  }

  public void runTopLevelForms() {
    setup_thread_macros_file();
  }

}
