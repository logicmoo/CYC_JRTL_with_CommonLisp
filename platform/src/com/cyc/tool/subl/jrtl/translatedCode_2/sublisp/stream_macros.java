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

package  com.cyc.tool.subl.jrtl.translatedCode_2.sublisp;

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

public  final class stream_macros extends SubLTranslatedFile {

  //// Constructor

  private stream_macros() {}
  public static final SubLFile me = new stream_macros();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros";

  //// Definitions

  @SubL(source = "sublisp/stream-macros.lisp", position = 702) 
  public static final SubLObject ensure_private_stream(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject body = current;
      return ensure_private_stream_internal(body);
    }
  }

  @SubL(source = "sublisp/stream-macros.lisp", position = 1051) 
  public static SubLSymbol $stream_requires_locking$ = null;

  /** Can be wrapped around existing functions to ensure a private stream
   handle. */
  @SubL(source = "sublisp/stream-macros.lisp", position = 1123) 
  public static final SubLObject ensure_private_stream_internal(SubLObject body) {
    return listS($sym0$CLET, $list1, ConsesLow.append(body, NIL));
  }

  @SubL(source = "sublisp/stream-macros.lisp", position = 1321) 
  public static final SubLObject cwith_output_to_string(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject stream_var = NIL;
          SubLObject result_var = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
          stream_var = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list2);
          result_var = current.first();
          current = current.rest();
          if ((NIL == current)) {
            current = temp;
            {
              SubLObject body = current;
              return list($sym0$CLET, list(stream_var), list($sym3$CUNWIND_PROTECT, listS($sym4$PROGN, listS($sym5$CSETQ, stream_var, $list6), ConsesLow.append(body, list(list($sym7$CSETF, result_var, list($sym8$GET_OUTPUT_STREAM_STRING, stream_var))))), list($sym9$CLOSE, stream_var)));
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list2);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/stream-macros.lisp", position = 1688) 
  public static final SubLObject with_input_from_string(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject var = NIL;
          SubLObject string = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
          var = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
          string = current.first();
          current = current.rest();
          {
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_1 = NIL;
            for (; (NIL != rest); ) {
              cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list10);
              current_1 = rest.first();
              rest = rest.rest();
              cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list10);
              if ((NIL == conses_high.member(current_1, $list11, UNPROVIDED, UNPROVIDED))) {
                bad = T;
              }
              if ((current_1 == $kw12$ALLOW_OTHER_KEYS)) {
                allow_other_keys_p = rest.first();
              }
              rest = rest.rest();
            }
            if (((NIL != bad)
                 && (NIL == allow_other_keys_p))) {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list10);
            }
            {
              SubLObject index_tail = cdestructuring_bind.property_list_member($kw13$INDEX, current);
              SubLObject index = ((NIL != index_tail) ? ((SubLObject) conses_high.cadr(index_tail)) : NIL);
              SubLObject start_tail = cdestructuring_bind.property_list_member($kw14$START, current);
              SubLObject start = ((NIL != start_tail) ? ((SubLObject) conses_high.cadr(start_tail)) : ZERO_INTEGER);
              SubLObject end_tail = cdestructuring_bind.property_list_member($kw15$END, current);
              SubLObject end = ((NIL != end_tail) ? ((SubLObject) conses_high.cadr(end_tail)) : NIL);
              current = temp;
              {
                SubLObject body = current;
                return with_input_from_string_internal(var, string, index, start, end, body);
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/stream-macros.lisp", position = 2184) 
  public static final SubLObject with_input_from_string_internal(SubLObject var, SubLObject string, SubLObject index, SubLObject start, SubLObject end, SubLObject body) {
    return list($sym0$CLET, list(var), list($sym3$CUNWIND_PROTECT, listS($sym4$PROGN, list($sym5$CSETQ, var, list($sym16$MAKE_PRIVATE_STRING_INPUT_STREAM, string, start, end)), ConsesLow.append(body, ((NIL != index) ? ((SubLObject) list(list($sym7$CSETF, index, list($sym17$STREAM_INPUT_INDEX, var)))) : NIL), NIL)), list($sym9$CLOSE, var)));
  }

  @SubL(source = "sublisp/stream-macros.lisp", position = 2512) 
  public static final SubLObject with_open_stream(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject var = NIL;
          SubLObject stream = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
          var = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list18);
          stream = current.first();
          current = current.rest();
          if ((NIL == current)) {
            current = temp;
            {
              SubLObject body = current;
              SubLObject stream_var = Symbols.make_symbol($str19$STREAM_VAR);
              return list($sym0$CLET, list(stream_var), list($sym3$CUNWIND_PROTECT, list($sym4$PROGN, list($sym5$CSETQ, stream_var, stream), listS($sym0$CLET, list(list(var, stream_var)), ConsesLow.append(body, NIL))), list($sym20$PWHEN, stream_var, list($sym9$CLOSE, stream_var))));
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list18);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/stream-macros.lisp", position = 3046) 
  public static final SubLObject with_open_file(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list21);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject stream = NIL;
          SubLObject filespec = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list21);
          stream = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list21);
          filespec = current.first();
          current = current.rest();
          {
            SubLObject keys = current;
            current = temp;
            {
              SubLObject body = current;
              return listS($sym22$WITH_OPEN_STREAM, list(stream, listS($sym23$OPEN, filespec, ConsesLow.append(keys, NIL))), ConsesLow.append(body, NIL));
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/stream-macros.lisp", position = 3499) 
  public static final SubLObject with_bounding_index_designators(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject sequence = NIL;
          SubLObject start_var = NIL;
          SubLObject end_var = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
          sequence = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
          start_var = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list24);
          end_var = current.first();
          current = current.rest();
          if ((NIL == current)) {
            current = temp;
            {
              SubLObject body = current;
              SubLObject length = Symbols.make_symbol($str25$LENGTH);
              return listS($sym0$CLET, new SubLObject[] {list(list(length, list($sym26$LENGTH, sequence))), list($sym27$PUNLESS, start_var, listS($sym7$CSETF, start_var, $list28)), list($sym27$PUNLESS, end_var, list($sym7$CSETF, end_var, length)), list($sym29$MUST, listS($sym30$__, start_var, $list28), $str31$Negative_start_index__D_given_for, start_var, sequence), list($sym29$MUST, list($sym32$__, end_var, length), $str33$The_end_index__D_given_for__S_is_, end_var, sequence, length), list($sym29$MUST, list($sym32$__, start_var, end_var), $str34$The_start_index__D_given_for__S_i, start_var, sequence, end_var), ConsesLow.append(body, NIL)});
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list24);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/stream-macros.lisp", position = 4170) 
  public static final SubLObject with_stream_lock(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject stream = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list35);
      stream = current.first();
      current = current.rest();
      {
        SubLObject body = current;
        SubLObject lock = Symbols.make_symbol($str36$LOCK_VAR);
        return list($sym0$CLET, list(list(lock, list($sym37$STREAM_LOCK, stream))), list($sym38$PIF, list($sym39$LOCK_P, lock), list($sym40$WITH_LOCK_HELD, list(lock), reader.bq_cons($sym4$PROGN, ConsesLow.append(body, NIL))), reader.bq_cons($sym4$PROGN, ConsesLow.append(body, NIL))));
      }
    }
  }

  @SubL(source = "sublisp/stream-macros.lisp", position = 4457) 
  public static final SubLObject synonym_stream_p(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject stream = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list41);
      stream = current.first();
      current = current.rest();
      if ((NIL == current)) {
        return listS(EQ, list($sym42$STREAM_STREAM_TYPE, stream), $list43);
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list41);
      }
    }
    return NIL;
  }

  public static final SubLObject declare_stream_macros_file() {
    declareMacro("ensure_private_stream", "ENSURE-PRIVATE-STREAM");
    declareFunction("ensure_private_stream_internal", "ENSURE-PRIVATE-STREAM-INTERNAL", 1, 0, false);
    declareMacro("cwith_output_to_string", "CWITH-OUTPUT-TO-STRING");
    declareMacro("with_input_from_string", "WITH-INPUT-FROM-STRING");
    declareFunction("with_input_from_string_internal", "WITH-INPUT-FROM-STRING-INTERNAL", 6, 0, false);
    declareMacro("with_open_stream", "WITH-OPEN-STREAM");
    declareMacro("with_open_file", "WITH-OPEN-FILE");
    declareMacro("with_bounding_index_designators", "WITH-BOUNDING-INDEX-DESIGNATORS");
    declareMacro("with_stream_lock", "WITH-STREAM-LOCK");
    declareMacro("synonym_stream_p", "SYNONYM-STREAM-P");
    return NIL;
  }

  public static final SubLObject init_stream_macros_file() {
    $stream_requires_locking$ = defvar("*STREAM-REQUIRES-LOCKING*", T);
    return NIL;
  }

  public static final SubLObject setup_stream_macros_file() {
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLET = makeSymbol("CLET");
  public static final SubLList $list1 = list(list(makeSymbol("*STREAM-REQUIRES-LOCKING*"), NIL));
  public static final SubLList $list2 = list(list(makeSymbol("STREAM-VAR"), makeSymbol("RESULT-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym3$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym4$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym5$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list6 = list(list(makeSymbol("MAKE-PRIVATE-STRING-OUTPUT-STREAM")));
  public static final SubLSymbol $sym7$CSETF = makeSymbol("CSETF");
  public static final SubLSymbol $sym8$GET_OUTPUT_STREAM_STRING = makeSymbol("GET-OUTPUT-STREAM-STRING");
  public static final SubLSymbol $sym9$CLOSE = makeSymbol("CLOSE");
  public static final SubLList $list10 = list(list(makeSymbol("VAR"), makeSymbol("STRING"), makeSymbol("&KEY"), makeSymbol("INDEX"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list11 = list(makeKeyword("INDEX"), makeKeyword("START"), makeKeyword("END"));
  public static final SubLSymbol $kw12$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw13$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw14$START = makeKeyword("START");
  public static final SubLSymbol $kw15$END = makeKeyword("END");
  public static final SubLSymbol $sym16$MAKE_PRIVATE_STRING_INPUT_STREAM = makeSymbol("MAKE-PRIVATE-STRING-INPUT-STREAM");
  public static final SubLSymbol $sym17$STREAM_INPUT_INDEX = makeSymbol("STREAM-INPUT-INDEX");
  public static final SubLList $list18 = list(list(makeSymbol("VAR"), makeSymbol("STREAM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str19$STREAM_VAR = makeString("STREAM-VAR");
  public static final SubLSymbol $sym20$PWHEN = makeSymbol("PWHEN");
  public static final SubLList $list21 = list(list(makeSymbol("STREAM"), makeSymbol("FILESPEC"), makeSymbol("&REST"), makeSymbol("KEYS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym22$WITH_OPEN_STREAM = makeSymbol("WITH-OPEN-STREAM");
  public static final SubLSymbol $sym23$OPEN = makeSymbol("OPEN");
  public static final SubLList $list24 = list(list(makeSymbol("SEQUENCE"), makeSymbol("START-VAR"), makeSymbol("END-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str25$LENGTH = makeString("LENGTH");
  public static final SubLSymbol $sym26$LENGTH = makeSymbol("LENGTH");
  public static final SubLSymbol $sym27$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLList $list28 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym29$MUST = makeSymbol("MUST");
  public static final SubLSymbol $sym30$__ = makeSymbol(">=");
  public static final SubLString $str31$Negative_start_index__D_given_for = makeString("Negative start index ~D given for ~S.");
  public static final SubLSymbol $sym32$__ = makeSymbol("<=");
  public static final SubLString $str33$The_end_index__D_given_for__S_is_ = makeString("The end index ~D given for ~S is greater than the length, ~D.");
  public static final SubLString $str34$The_start_index__D_given_for__S_i = makeString("The start index ~D given for ~S is greater than the end index ~D.");
  public static final SubLList $list35 = list(makeSymbol("STREAM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str36$LOCK_VAR = makeString("LOCK-VAR");
  public static final SubLSymbol $sym37$STREAM_LOCK = makeSymbol("STREAM-LOCK");
  public static final SubLSymbol $sym38$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym39$LOCK_P = makeSymbol("LOCK-P");
  public static final SubLSymbol $sym40$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLList $list41 = list(makeSymbol("STREAM"));
  public static final SubLSymbol $sym42$STREAM_STREAM_TYPE = makeSymbol("STREAM-STREAM-TYPE");
  public static final SubLList $list43 = list(makeKeyword("SYNONYM"));

  //// Initializers

  public void declareFunctions() {
    declare_stream_macros_file();
  }

  public void initializeVariables() {
    init_stream_macros_file();
  }

  public void runTopLevelForms() {
    setup_stream_macros_file();
  }

}
