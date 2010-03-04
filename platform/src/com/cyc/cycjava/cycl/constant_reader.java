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
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constant_completion_low;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;

public  final class constant_reader extends SubLTranslatedFile {

  //// Constructor

  private constant_reader() {}
  public static final SubLFile me = new constant_reader();
  public static final String myName = "com.cyc.cycjava.cycl.constant_reader";

  //// Definitions

  /** The character that signals the reader that what follows is to be treated
as a CycL constant name */
  @SubL(source = "cycl/constant-reader.lisp", position = 1014) 
  private static SubLSymbol $constant_reader_macro_char$ = null;

  /** @return CHARACTERP; The character that signals the reader that what follows is to be treated
as a CycL constant name */
  @SubL(source = "cycl/constant-reader.lisp", position = 1223) 
  public static final SubLObject constant_reader_macro_char() {
    return $constant_reader_macro_char$.getGlobalValue();
  }

  /** The string that prefixes all CycL constant names */
  @SubL(source = "cycl/constant-reader.lisp", position = 1428) 
  private static SubLSymbol $constant_reader_prefix$ = null;

  @SubL(source = "cycl/constant-reader.lisp", position = 1736) 
  public static final SubLObject sharpsign_dollar_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != arg)) {
        reader.simple_reader_error($str1$The__S_reader_macro_does_not_take, list(ch));
      }
      {
        SubLObject length = $int2$64;
        SubLObject buffer = Strings.make_string(length, UNPROVIDED);
        SubLObject i = ZERO_INTEGER;
        SubLObject next = streams_high.read_char(stream, NIL, NIL, UNPROVIDED);
        while (((NIL != next)
             && (NIL != constant_completion_high.valid_constant_name_char_p(next)))) {
          if (i.numGE(length)) {
            length = Numbers.multiply(length, TWO_INTEGER);
            {
              SubLObject new_buffer = Strings.make_string(length, UNPROVIDED);
              SubLObject j = NIL;
              for (j = ZERO_INTEGER; j.numL(i); j = Numbers.add(j, ONE_INTEGER)) {
                Strings.set_char(new_buffer, j, Strings.sublisp_char(buffer, j));
              }
              buffer = new_buffer;
            }
          }
          Strings.set_char(buffer, i, next);
          i = Numbers.add(i, ONE_INTEGER);
          next = streams_high.read_char(stream, NIL, NIL, UNPROVIDED);
        }
        if ((NIL != next)) {
          streams_high.unread_char(next, stream);
        }
        if ((NIL != reader.$read_suppress$.getDynamicValue(thread))) {
          return Values.values(NIL, T);
        } else {
          {
            SubLObject name = (i.numE(length) ? ((SubLObject) buffer) : Sequences.subseq(buffer, ZERO_INTEGER, i));
            SubLObject constant = find_constant_by_name(name);
            if ((NIL != constant)) {
              return Values.values(constant, T);
            } else {
              if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31824"))) {
                reader.simple_reader_error($str3$_S_is_not_the_name_of_a_constant_, list(name));
              } else {
                {
                  SubLObject error_message = NIL;
                  try {
                    {
                      SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                      try {
                        Errors.$error_handler$.bind($sym4$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                          constant = constant_handles.reader_make_constant_shell(name);
                        } catch (Throwable catch_var) {
                          Errors.handleThrowable(catch_var, NIL);
                        }
                      } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                      }
                    }
                  } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                  }
                  if ((NIL != error_message)) {
                    reader.simple_reader_error(error_message, NIL);
                  }
                  return Values.values(constant, T);
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/constant-reader.lisp", position = 3066) 
  public static final SubLObject find_constant_by_name(SubLObject name) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject constant = NIL;
        {
          SubLObject _prev_bind_0 = constant_completion_low.$require_valid_constants$.currentBinding(thread);
          try {
            constant_completion_low.$require_valid_constants$.bind(NIL, thread);
            constant = constant_completion_high.constant_complete_exact(name, UNPROVIDED, UNPROVIDED);
          } finally {
            constant_completion_low.$require_valid_constants$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL == constant)) {
          constant = constant_handles.find_invalid_constant(name);
        }
        return constant;
      }
    }
  }

  public static final SubLObject declare_constant_reader_file() {
    declareFunction(myName, "constant_reader_macro_char", "CONSTANT-READER-MACRO-CHAR", 0, 0, false);
    declareFunction(myName, "constant_reader_prefix", "CONSTANT-READER-PREFIX", 0, 0, false);
    declareFunction(myName, "sharpsign_dollar_rmf", "SHARPSIGN-DOLLAR-RMF", 3, 0, false);
    declareFunction(myName, "find_constant_by_name", "FIND-CONSTANT-BY-NAME", 1, 0, false);
    declareFunction(myName, "stream_forbids_constant_creation", "STREAM-FORBIDS-CONSTANT-CREATION", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_constant_reader_file() {
    $constant_reader_macro_char$ = defconstant("*CONSTANT-READER-MACRO-CHAR*", Characters.CHAR_dollar);
    $constant_reader_prefix$ = defconstant("*CONSTANT-READER-PREFIX*", Sequences.cconcatenate($str0$_, Strings.string($constant_reader_macro_char$.getGlobalValue())));
    return NIL;
  }

  public static final SubLObject setup_constant_reader_file() {
    // CVS_ID("Id: constant-reader.lisp 126640 2008-12-04 13:39:36Z builder ");
    reader.set_dispatch_macro_character(Characters.CHAR_hash, constant_reader_macro_char(), $sym5$SHARPSIGN_DOLLAR_RMF, UNPROVIDED);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$_ = makeString("#");
  public static final SubLString $str1$The__S_reader_macro_does_not_take = makeString("The ~S reader macro does not take an argument.");
  public static final SubLInteger $int2$64 = makeInteger(64);
  public static final SubLString $str3$_S_is_not_the_name_of_a_constant_ = makeString("~S is not the name of a constant.");
  public static final SubLSymbol $sym4$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $sym5$SHARPSIGN_DOLLAR_RMF = makeSymbol("SHARPSIGN-DOLLAR-RMF");

  //// Initializers

  public void declareFunctions() {
    declare_constant_reader_file();
  }

  public void initializeVariables() {
    init_constant_reader_file();
  }

  public void runTopLevelForms() {
    setup_constant_reader_file();
  }

}
