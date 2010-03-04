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

public  final class condition_macros extends SubLTranslatedFile {

  //// Constructor

  private condition_macros() {}
  public static final SubLFile me = new condition_macros();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.condition_macros";

  //// Definitions

  @SubL(source = "sublisp/condition-macros.lisp", position = 821) 
  public static final SubLObject with_simple_restart(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject name = NIL;
          SubLObject format_control = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
          name = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
          format_control = current.first();
          current = current.rest();
          {
            SubLObject format_arguments = current;
            current = temp;
            {
              SubLObject body = current;
              return with_simple_restart_internal(name, format_control, format_arguments, body);
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/condition-macros.lisp", position = 1332) 
  public static final SubLObject with_simple_restart_internal(SubLObject name, SubLObject format_control, SubLObject format_arguments, SubLObject body) {
    {
      SubLObject tag = Symbols.make_symbol($str1$RESTART_TAG);
      SubLObject dummy = Symbols.make_symbol($str2$DUMMY);
      return list($sym3$CLET, list(list(tag, ((NIL != name) ? ((SubLObject) list($sym4$QUOTE, name)) : list($sym4$QUOTE, tag))), dummy), list($sym5$IGNORE, dummy), list($sym3$CLET, list(list($sym6$_RESTARTS_, listS($sym7$CONS, listS($sym8$LIST, tag, format_control, ConsesLow.append(format_arguments, NIL)), $list9))), listS($sym10$CCATCH, tag, dummy, ConsesLow.append(body, NIL))));
    }
  }

  /** Trampoline CYC-LISP:ERROR to SL:ERROR. */
  @SubL(source = "sublisp/condition-macros.lisp", position = 1739) 
  public static final SubLObject with_sublisp_error_handling(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject body = current;
      return with_sublisp_error_handling_internal(body);
    }
  }

  @SubL(source = "sublisp/condition-macros.lisp", position = 2441) 
  public static final SubLObject with_sublisp_error_handling_internal(SubLObject body) {
    return reader.bq_cons($sym11$PROGN, ConsesLow.append(body, NIL));
  }

  @SubL(source = "sublisp/condition-macros.lisp", position = 2533) 
  public static final SubLObject with_error_handler_internal(SubLObject handler, SubLObject body) {
    return listS($sym3$CLET, list(list($sym12$_ERROR_HANDLER_, handler)), ConsesLow.append(body, NIL));
  }

  /** Execute BODY as an implicit progn, until it either finishes or any error occurs. */
  @SubL(source = "sublisp/condition-macros.lisp", position = 3220) 
  public static final SubLObject ignore_errors(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject body = current;
      return ignore_errors_internal(body);
    }
  }

  @SubL(source = "sublisp/condition-macros.lisp", position = 3587) 
  public static final SubLObject ignore_errors_internal(SubLObject body) {
    {
      SubLObject tag = Symbols.make_symbol($str13$IGNORE_ERRORS_TAG);
      return list($sym3$CLET, list(tag), list($sym10$CCATCH, $kw14$IGNORE_ERRORS_TARGET, tag, list($sym5$IGNORE, tag), listS($sym15$WITH_ERROR_HANDLER, $list16, ConsesLow.append(body, NIL))));
    }
  }

  @SubL(source = "sublisp/condition-macros.lisp", position = 3840) 
  public static final SubLObject ignore_errors_handler() {
    Dynamic.sublisp_throw($kw14$IGNORE_ERRORS_TARGET, NIL);
    return NIL;
  }

  public static final SubLObject declare_condition_macros_file() {
    declareMacro(myName, "with_simple_restart", "WITH-SIMPLE-RESTART");
    declareFunction(myName, "with_simple_restart_internal", "WITH-SIMPLE-RESTART-INTERNAL", 4, 0, false);
    declareMacro(myName, "with_sublisp_error_handling", "WITH-SUBLISP-ERROR-HANDLING");
    declareFunction(myName, "with_sublisp_error_handling_internal", "WITH-SUBLISP-ERROR-HANDLING-INTERNAL", 1, 0, false);
    declareFunction(myName, "with_error_handler_internal", "WITH-ERROR-HANDLER-INTERNAL", 2, 0, false);
    declareMacro(myName, "ignore_errors", "IGNORE-ERRORS");
    declareFunction(myName, "ignore_errors_internal", "IGNORE-ERRORS-INTERNAL", 1, 0, false);
    declareFunction(myName, "ignore_errors_handler", "IGNORE-ERRORS-HANDLER", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_condition_macros_file() {
    return NIL;
  }

  public static final SubLObject setup_condition_macros_file() {
    // CVS_ID("Id: condition-macros.lisp 126834 2009-01-15 23:07:06Z goolsbey ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("NAME"), makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str1$RESTART_TAG = makeString("RESTART-TAG");
  public static final SubLString $str2$DUMMY = makeString("DUMMY");
  public static final SubLSymbol $sym3$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym4$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym5$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym6$_RESTARTS_ = makeSymbol("*RESTARTS*");
  public static final SubLSymbol $sym7$CONS = makeSymbol("CONS");
  public static final SubLSymbol $sym8$LIST = makeSymbol("LIST");
  public static final SubLList $list9 = list(makeSymbol("*RESTARTS*"));
  public static final SubLSymbol $sym10$CCATCH = makeSymbol("CCATCH");
  public static final SubLSymbol $sym11$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym12$_ERROR_HANDLER_ = makeSymbol("*ERROR-HANDLER*");
  public static final SubLString $str13$IGNORE_ERRORS_TAG = makeString("IGNORE-ERRORS-TAG");
  public static final SubLSymbol $kw14$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym15$WITH_ERROR_HANDLER = makeSymbol("WITH-ERROR-HANDLER");
  public static final SubLList $list16 = list(makeSymbol("FUNCTION"), makeSymbol("IGNORE-ERRORS-HANDLER"));

  //// Initializers

  public void declareFunctions() {
    declare_condition_macros_file();
  }

  public void initializeVariables() {
    init_condition_macros_file();
  }

  public void runTopLevelForms() {
    setup_condition_macros_file();
  }

}
