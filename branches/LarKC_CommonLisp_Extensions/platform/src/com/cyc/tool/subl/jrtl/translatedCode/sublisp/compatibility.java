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

public  final class compatibility extends SubLTranslatedFile {

  //// Constructor

  private compatibility() {}
  public static final SubLFile me = new compatibility();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility";

  //// Definitions

  /** Attempts to open the file FILENAME.  If successful, returns an 8-bit character text stream. If DIRECTION is :input, then input operations can be performed on the stream.  If DIRECTION is output, then output is directed to the file FILENAME, overwriting any existing file.  If DIRECTION is :append, then output is appended to the file.  For either output case, a new file is created if no file named FILENAME already exists. */
  @SubL(source = "sublisp/compatibility.lisp", position = 345) 
  public static final SubLObject open_text(SubLObject filename, SubLObject direction) {
    if ((direction == $kw0$INPUT)) {
      return StreamsLow.open(filename, new SubLObject[] {$kw1$DIRECTION, $kw0$INPUT, $kw2$IF_DOES_NOT_EXIST, NIL, $kw3$ELEMENT_TYPE, $kw4$TEXT});
    } else if ((direction == $kw5$OUTPUT)) {
      return StreamsLow.open(filename, new SubLObject[] {$kw1$DIRECTION, $kw5$OUTPUT, $kw6$IF_EXISTS, $kw7$NEW_VERSION, $kw2$IF_DOES_NOT_EXIST, $kw8$CREATE, $kw3$ELEMENT_TYPE, $kw4$TEXT});
    } else if ((direction == $kw9$APPEND)) {
      return StreamsLow.open(filename, new SubLObject[] {$kw1$DIRECTION, $kw5$OUTPUT, $kw6$IF_EXISTS, $kw9$APPEND, $kw2$IF_DOES_NOT_EXIST, $kw8$CREATE, $kw3$ELEMENT_TYPE, $kw4$TEXT});
    } else {
      Errors.error($str10$_S_called_with_invalid_direction_, $sym11$OPEN_TEXT, direction);
    }
    return NIL;
  }

  /** Attempts to open the file FILENAME.  If successful, returns an 8-bit binary byte stream. If DIRECTION is :input, then input operations can be performed on the stream.  If DIRECTION is output, then output is directed to the file FILENAME, overwriting any existing file.  If DIRECTION is :append, then output is appended to the file.  For either output case, a new file is created if no file named FILENAME already exists. */
  @SubL(source = "sublisp/compatibility.lisp", position = 1468) 
  public static final SubLObject open_binary(SubLObject filename, SubLObject direction) {
    if ((direction == $kw0$INPUT)) {
      return StreamsLow.open(filename, new SubLObject[] {$kw1$DIRECTION, $kw0$INPUT, $kw2$IF_DOES_NOT_EXIST, NIL, $kw3$ELEMENT_TYPE, $kw12$BINARY});
    } else if (((direction == $kw5$OUTPUT)
        || (direction == $kw13$IO))) {
      return StreamsLow.open(filename, new SubLObject[] {$kw1$DIRECTION, direction, $kw6$IF_EXISTS, $kw7$NEW_VERSION, $kw2$IF_DOES_NOT_EXIST, $kw8$CREATE, $kw3$ELEMENT_TYPE, $kw12$BINARY});
    } else if ((direction == $kw9$APPEND)) {
      return StreamsLow.open(filename, new SubLObject[] {$kw1$DIRECTION, $kw5$OUTPUT, $kw6$IF_EXISTS, $kw9$APPEND, $kw2$IF_DOES_NOT_EXIST, $kw8$CREATE, $kw3$ELEMENT_TYPE, $kw12$BINARY});
    } else {
      Errors.error($str14$_S_called_with_invalid_direction_, $sym15$OPEN_BINARY, direction);
    }
    return NIL;
  }

  /** Given the access styles :private and :public, and the types :binary and
   :text for the files, we define this macro to implement the matrix of choices
   computationally. */
  @SubL(source = "sublisp/compatibility.lisp", position = 2557) 
  public static final SubLObject with_streamed_file_internal(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject stream = NIL;
          SubLObject filename = NIL;
          SubLObject direction = NIL;
          SubLObject access = NIL;
          SubLObject type = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          stream = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          filename = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          direction = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          access = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          type = current.first();
          current = current.rest();
          if ((NIL == current)) {
            current = temp;
            {
              SubLObject body = current;
              SubLObject stream_var = Symbols.make_symbol($str17$STREAM);
              SubLObject open_func = NIL;
              SubLObject open_clause = NIL;
              if ((type == $kw12$BINARY)) {
                open_func = $sym15$OPEN_BINARY;
              } else if ((type == $kw4$TEXT)) {
                open_func = $sym11$OPEN_TEXT;
              } else {
                Errors.error($str18$_S_invoked_with_invalid_file_type, $sym19$WITH_STREAMED_FILE_INTERNAL, type);
              }
              open_clause = list($sym20$CSETQ, stream_var, list(open_func, filename, direction));
              if ((access == $kw21$PRIVATE)) {
                open_clause = list($sym22$ENSURE_PRIVATE_STREAM, open_clause);
              } else if ((access != $kw23$PUBLIC)) {
                Errors.error($str24$_S_invoked_with_invalid_access_se, $sym19$WITH_STREAMED_FILE_INTERNAL, access);
              }
              return list($sym25$CLET, list(stream_var), list($sym26$CUNWIND_PROTECT, list($sym27$PROGN, open_clause, list($sym28$PUNLESS, list($sym29$STREAMP, stream_var), list($sym30$ERROR, $str31$Unable_to_open__S, filename)), listS($sym25$CLET, list(list(stream, stream_var)), ConsesLow.append(body, NIL))), list($sym32$PWHEN, list($sym29$STREAMP, stream_var), list($sym33$CLOSE, stream_var))));
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/compatibility.lisp", position = 3935) 
  public static final SubLObject with_text_file(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject stream = NIL;
          SubLObject filename = NIL;
          SubLObject direction = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
          stream = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
          filename = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
          direction = current.first();
          current = current.rest();
          if ((NIL == current)) {
            current = temp;
            {
              SubLObject body = current;
              return listS($sym19$WITH_STREAMED_FILE_INTERNAL, listS(stream, filename, direction, $list35), ConsesLow.append(body, NIL));
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list34);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/compatibility.lisp", position = 4135) 
  public static final SubLObject with_private_text_file(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject stream = NIL;
          SubLObject filename = NIL;
          SubLObject direction = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
          stream = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
          filename = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
          direction = current.first();
          current = current.rest();
          if ((NIL == current)) {
            current = temp;
            {
              SubLObject body = current;
              return listS($sym19$WITH_STREAMED_FILE_INTERNAL, listS(stream, filename, direction, $list36), ConsesLow.append(body, NIL));
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list34);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/compatibility.lisp", position = 4312) 
  public static final SubLObject with_binary_file(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject stream = NIL;
          SubLObject filename = NIL;
          SubLObject direction = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
          stream = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
          filename = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
          direction = current.first();
          current = current.rest();
          if ((NIL == current)) {
            current = temp;
            {
              SubLObject body = current;
              return listS($sym19$WITH_STREAMED_FILE_INTERNAL, listS(stream, filename, direction, $list37), ConsesLow.append(body, NIL));
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list34);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/compatibility.lisp", position = 4484) 
  public static final SubLObject with_private_binary_file(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject stream = NIL;
          SubLObject filename = NIL;
          SubLObject direction = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
          stream = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
          filename = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list34);
          direction = current.first();
          current = current.rest();
          if ((NIL == current)) {
            current = temp;
            {
              SubLObject body = current;
              return listS($sym19$WITH_STREAMED_FILE_INTERNAL, listS(stream, filename, direction, $list38), ConsesLow.append(body, NIL));
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list34);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/compatibility.lisp", position = 4665) 
  public static final SubLObject get_file_position(SubLObject stream) {
    return streams_high.file_position(stream, UNPROVIDED);
  }

  @SubL(source = "sublisp/compatibility.lisp", position = 4782) 
  public static final SubLObject set_file_position(SubLObject stream, SubLObject n) {
    return streams_high.file_position(stream, n);
  }

  @SubL(source = "sublisp/compatibility.lisp", position = 4857) 
  public static final SubLObject default_struct_print_function(SubLObject object, SubLObject stream, SubLObject depth) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != print_high.$print_readably$.getDynamicValue(thread))) {
        print_high.print_not_readable(object, stream);
      } else {
        {
          SubLObject object_1 = object;
          SubLObject stream_2 = stream;
          streams_high.write_string($str39$__, stream_2, UNPROVIDED, UNPROVIDED);
          PrintLow.write(Types.type_of(object_1), new SubLObject[] {$kw40$STREAM, stream_2});
          streams_high.write_char(Characters.CHAR_space, stream_2);
          PrintLow.write(Equality.pointer(object_1), new SubLObject[] {$kw40$STREAM, stream_2, $kw41$BASE, SIXTEEN_INTEGER});
          streams_high.write_char(Characters.CHAR_greater, stream_2);
        }
      }
      return object;
    }
  }

  public static final SubLObject declare_compatibility_file() {
    declareFunction(myName, "open_text", "OPEN-TEXT", 2, 0, false);
    declareFunction(myName, "open_binary", "OPEN-BINARY", 2, 0, false);
    declareMacro(myName, "with_streamed_file_internal", "WITH-STREAMED-FILE-INTERNAL");
    declareMacro(myName, "with_text_file", "WITH-TEXT-FILE");
    declareMacro(myName, "with_private_text_file", "WITH-PRIVATE-TEXT-FILE");
    declareMacro(myName, "with_binary_file", "WITH-BINARY-FILE");
    declareMacro(myName, "with_private_binary_file", "WITH-PRIVATE-BINARY-FILE");
    declareFunction(myName, "get_file_position", "GET-FILE-POSITION", 1, 0, false);
    declareFunction(myName, "set_file_position", "SET-FILE-POSITION", 2, 0, false);
    declareFunction(myName, "default_struct_print_function", "DEFAULT-STRUCT-PRINT-FUNCTION", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_compatibility_file() {
    return NIL;
  }

  public static final SubLObject setup_compatibility_file() {
    // CVS_ID("Id: compatibility.lisp 127883 2009-05-28 14:39:29Z daves ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$INPUT = makeKeyword("INPUT");
  public static final SubLSymbol $kw1$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw2$IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");
  public static final SubLSymbol $kw3$ELEMENT_TYPE = makeKeyword("ELEMENT-TYPE");
  public static final SubLSymbol $kw4$TEXT = makeKeyword("TEXT");
  public static final SubLSymbol $kw5$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLSymbol $kw6$IF_EXISTS = makeKeyword("IF-EXISTS");
  public static final SubLSymbol $kw7$NEW_VERSION = makeKeyword("NEW-VERSION");
  public static final SubLSymbol $kw8$CREATE = makeKeyword("CREATE");
  public static final SubLSymbol $kw9$APPEND = makeKeyword("APPEND");
  public static final SubLString $str10$_S_called_with_invalid_direction_ = makeString("~S called with invalid direction argument of ~S.");
  public static final SubLSymbol $sym11$OPEN_TEXT = makeSymbol("OPEN-TEXT");
  public static final SubLSymbol $kw12$BINARY = makeKeyword("BINARY");
  public static final SubLSymbol $kw13$IO = makeKeyword("IO");
  public static final SubLString $str14$_S_called_with_invalid_direction_ = makeString("~S called with invalid direction argument of ~A");
  public static final SubLSymbol $sym15$OPEN_BINARY = makeSymbol("OPEN-BINARY");
  public static final SubLList $list16 = list(list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeSymbol("DIRECTION"), makeSymbol("ACCESS"), makeSymbol("TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str17$STREAM = makeString("STREAM");
  public static final SubLString $str18$_S_invoked_with_invalid_file_type = makeString("~S invoked with invalid file type ~S specified.");
  public static final SubLSymbol $sym19$WITH_STREAMED_FILE_INTERNAL = makeSymbol("WITH-STREAMED-FILE-INTERNAL");
  public static final SubLSymbol $sym20$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $kw21$PRIVATE = makeKeyword("PRIVATE");
  public static final SubLSymbol $sym22$ENSURE_PRIVATE_STREAM = makeSymbol("ENSURE-PRIVATE-STREAM");
  public static final SubLSymbol $kw23$PUBLIC = makeKeyword("PUBLIC");
  public static final SubLString $str24$_S_invoked_with_invalid_access_se = makeString("~S invoked with invalid access setting ~S.");
  public static final SubLSymbol $sym25$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym26$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym27$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym28$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym29$STREAMP = makeSymbol("STREAMP");
  public static final SubLSymbol $sym30$ERROR = makeSymbol("ERROR");
  public static final SubLString $str31$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $sym32$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym33$CLOSE = makeSymbol("CLOSE");
  public static final SubLList $list34 = list(list(makeSymbol("STREAM"), makeSymbol("FILENAME"), makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list35 = list(makeKeyword("PUBLIC"), makeKeyword("TEXT"));
  public static final SubLList $list36 = list(makeKeyword("PRIVATE"), makeKeyword("TEXT"));
  public static final SubLList $list37 = list(makeKeyword("PUBLIC"), makeKeyword("BINARY"));
  public static final SubLList $list38 = list(makeKeyword("PRIVATE"), makeKeyword("BINARY"));
  public static final SubLString $str39$__ = makeString("#<");
  public static final SubLSymbol $kw40$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw41$BASE = makeKeyword("BASE");

  //// Initializers

  public void declareFunctions() {
    declare_compatibility_file();
  }

  public void initializeVariables() {
    init_compatibility_file();
  }

  public void runTopLevelForms() {
    setup_compatibility_file();
  }

}
