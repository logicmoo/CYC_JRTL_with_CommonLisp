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

package  com.cyc.cycjava_1.cycl;

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
import com.cyc.cycjava_1.cycl.subl_macros;

public  final class format_nil extends SubLTranslatedFile {

  //// Constructor

  private format_nil() {}
  public static final SubLFile me = new format_nil();
  public static final String myName = "com.cyc.cycjava_1.cycl.format_nil";

  //// Definitions

  /** Return a string representation of INTEGER */
  @SubL(source = "cycl/format-nil.lisp", position = 1552) 
  public static final SubLObject princ_integer_to_string(SubLObject integer) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(integer, $sym2$INTEGERP);
      if ((integer.isBignum()
          || (!(TEN_INTEGER.eql(print_high.$print_base$.getDynamicValue(thread)))))) {
        return print_high.princ_to_string(integer);
      }
      {
        SubLObject string_length = Numbers.add((integer.isNegative() ? ((SubLObject) ONE_INTEGER) : ZERO_INTEGER), integer_decimal_length(integer));
        SubLObject string = Strings.make_string(string_length, UNPROVIDED);
        SubLObject magnitude = Numbers.abs(integer);
        SubLObject digits = $str3$0123456789;
        SubLObject digit = NIL;
        SubLObject index = ZERO_INTEGER;
        while ((!(magnitude.numL(TEN_INTEGER)))) {
          digit = Numbers.mod(magnitude, TEN_INTEGER);
          magnitude = Numbers.integerDivide(magnitude, TEN_INTEGER);
          Strings.set_char(string, index, Strings.sublisp_char(digits, digit));
          index = Numbers.add(index, ONE_INTEGER);
        }
        Strings.set_char(string, index, Strings.sublisp_char(digits, magnitude));
        index = Numbers.add(index, ONE_INTEGER);
        if (integer.isNegative()) {
          Strings.set_char(string, index, Characters.CHAR_hyphen);
        }
        string = Sequences.nreverse(string);
        return string;
      }
    }
  }

  @SubL(source = "cycl/format-nil.lisp", position = 2390) 
  public static final SubLObject format_nil_a(SubLObject object) {
    if (object.isSymbol()) {
      return Sequences.copy_seq(Symbols.symbol_name(object));
    } else if (object.isString()) {
      return Sequences.copy_seq(object);
    } else if (object.isInteger()) {
      return princ_integer_to_string(object);
    } else {
      return print_high.princ_to_string(object);
    }
  }

  @SubL(source = "cycl/format-nil.lisp", position = 2703) 
  public static final SubLObject format_nil_a_no_copy(SubLObject object) {
    if (object.isSymbol()) {
      return Symbols.symbol_name(object);
    } else if (object.isString()) {
      return object;
    } else if (object.isInteger()) {
      return princ_integer_to_string(object);
    } else {
      return print_high.princ_to_string(object);
    }
  }

  @SubL(source = "cycl/format-nil.lisp", position = 4003) 
  public static SubLSymbol $format_nil_percent$ = null;

  @SubL(source = "cycl/format-nil.lisp", position = 4179) 
  public static SubLSymbol $format_nil_tilde$ = null;

  /** Return the number of digits needed to express INTEGER in base 10. */
  @SubL(source = "cycl/format-nil.lisp", position = 8186) 
  public static final SubLObject integer_decimal_length(SubLObject integer) {
    checkType(integer, $sym2$INTEGERP);
    {
      SubLObject magnitude = Numbers.abs(integer);
      SubLObject length = ONE_INTEGER;
      while ((!(magnitude.numL(TEN_INTEGER)))) {
        length = Numbers.add(length, ONE_INTEGER);
        magnitude = Numbers.integerDivide(magnitude, TEN_INTEGER);
      }
      return length;
    }
  }

  public static final SubLObject declare_format_nil_file() {
    declareMacro(myName, "format_nil", "FORMAT-NIL");
    declareFunction(myName, "princ_integer_to_string", "PRINC-INTEGER-TO-STRING", 1, 0, false);
    declareFunction(myName, "format_nil_a", "FORMAT-NIL-A", 1, 0, false);
    declareFunction(myName, "format_nil_a_no_copy", "FORMAT-NIL-A-NO-COPY", 1, 0, false);
    declareFunction(myName, "format_nil_s", "FORMAT-NIL-S", 1, 0, false);
    declareFunction(myName, "format_nil_s_no_copy", "FORMAT-NIL-S-NO-COPY", 1, 0, false);
    declareFunction(myName, "format_nil_d", "FORMAT-NIL-D", 1, 0, false);
    declareFunction(myName, "format_nil_d_no_copy", "FORMAT-NIL-D-NO-COPY", 1, 0, false);
    declareFunction(myName, "format_nil_percent", "FORMAT-NIL-PERCENT", 0, 0, false);
    declareFunction(myName, "format_nil_tilde", "FORMAT-NIL-TILDE", 0, 0, false);
    declareFunction(myName, "format_nil_internal", "FORMAT-NIL-INTERNAL", 2, 0, false);
    declareFunction(myName, "format_nil_control_validator", "FORMAT-NIL-CONTROL-VALIDATOR", 1, 0, false);
    declareFunction(myName, "format_nil_simplify", "FORMAT-NIL-SIMPLIFY", 1, 0, false);
    declareFunction(myName, "format_nil_expand", "FORMAT-NIL-EXPAND", 2, 0, false);
    declareFunction(myName, "format_nil_control_split", "FORMAT-NIL-CONTROL-SPLIT", 1, 0, false);
    declareFunction(myName, "format_nil_control_split_internal", "FORMAT-NIL-CONTROL-SPLIT-INTERNAL", 1, 0, false);
    declareFunction(myName, "integer_decimal_length", "INTEGER-DECIMAL-LENGTH", 1, 0, false);
    declareFunction(myName, "format_one_per_line", "FORMAT-ONE-PER-LINE", 1, 1, false);
    declareFunction(myName, "print_one_per_line", "PRINT-ONE-PER-LINE", 1, 1, false);
    declareFunction(myName, "print_one_aspect_per_line", "PRINT-ONE-ASPECT-PER-LINE", 2, 1, false);
    declareFunction(myName, "force_format", "FORCE-FORMAT", 2, 8, false);
    return NIL;
  }

  public static final SubLObject init_format_nil_file() {
    $format_nil_percent$ = defconstant("*FORMAT-NIL-PERCENT*", $str12$_);
    $format_nil_tilde$ = defconstant("*FORMAT-NIL-TILDE*", $str14$_);
    return NIL;
  }

  public static final SubLObject setup_format_nil_file() {
    // CVS_ID("Id: format-nil.lisp 127322 2009-03-06 16:14:59Z goolsbey ");
    access_macros.register_macro_helper($sym4$FORMAT_NIL_A, $sym5$FORMAT_NIL);
    access_macros.register_macro_helper($sym6$FORMAT_NIL_A_NO_COPY, $sym5$FORMAT_NIL);
    access_macros.register_macro_helper($sym7$FORMAT_NIL_S, $sym5$FORMAT_NIL);
    access_macros.register_macro_helper($sym8$FORMAT_NIL_S_NO_COPY, $sym5$FORMAT_NIL);
    access_macros.register_macro_helper($sym9$FORMAT_NIL_D, $sym5$FORMAT_NIL);
    access_macros.register_macro_helper($sym11$FORMAT_NIL_D_NO_COPY, $sym5$FORMAT_NIL);
    access_macros.register_macro_helper($sym13$FORMAT_NIL_PERCENT, $sym5$FORMAT_NIL);
    access_macros.register_macro_helper($sym15$FORMAT_NIL_TILDE, $sym5$FORMAT_NIL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS"));
  public static final SubLSymbol $sym1$FORMAT = makeSymbol("FORMAT");
  public static final SubLSymbol $sym2$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str3$0123456789 = makeString("0123456789");
  public static final SubLSymbol $sym4$FORMAT_NIL_A = makeSymbol("FORMAT-NIL-A");
  public static final SubLSymbol $sym5$FORMAT_NIL = makeSymbol("FORMAT-NIL");
  public static final SubLSymbol $sym6$FORMAT_NIL_A_NO_COPY = makeSymbol("FORMAT-NIL-A-NO-COPY");
  public static final SubLSymbol $sym7$FORMAT_NIL_S = makeSymbol("FORMAT-NIL-S");
  public static final SubLSymbol $sym8$FORMAT_NIL_S_NO_COPY = makeSymbol("FORMAT-NIL-S-NO-COPY");
  public static final SubLSymbol $sym9$FORMAT_NIL_D = makeSymbol("FORMAT-NIL-D");
  public static final SubLSymbol $sym10$NUMBERP = makeSymbol("NUMBERP");
  public static final SubLSymbol $sym11$FORMAT_NIL_D_NO_COPY = makeSymbol("FORMAT-NIL-D-NO-COPY");
  public static final SubLString $str12$_ = makeString("\n");
  public static final SubLSymbol $sym13$FORMAT_NIL_PERCENT = makeSymbol("FORMAT-NIL-PERCENT");
  public static final SubLString $str14$_ = makeString("~");
  public static final SubLSymbol $sym15$FORMAT_NIL_TILDE = makeSymbol("FORMAT-NIL-TILDE");
  public static final SubLString $str16$ASD__ = makeString("ASD%~");
  public static final SubLSymbol $sym17$CHAR_EQUAL = makeSymbol("CHAR-EQUAL");
  public static final SubLSymbol $sym18$_FORMAT_NIL_PERCENT_ = makeSymbol("*FORMAT-NIL-PERCENT*");
  public static final SubLList $list19 = list(makeSymbol("FORMAT-NIL-PERCENT"));
  public static final SubLSymbol $sym20$_FORMAT_NIL_TILDE_ = makeSymbol("*FORMAT-NIL-TILDE*");
  public static final SubLList $list21 = list(makeSymbol("FORMAT-NIL-TILDE"));
  public static final SubLSymbol $sym22$COPY_SEQ = makeSymbol("COPY-SEQ");
  public static final SubLList $list23 = list(makeSymbol("OPERATOR"), makeSymbol("ARG"));
  public static final SubLSymbol $sym24$CCONCATENATE = makeSymbol("CCONCATENATE");
  public static final SubLList $list25 = cons(makeSymbol("NEXT-CONTROL"), makeSymbol("REST-CONTROL"));
  public static final SubLString $str26$_A = makeString("~A");
  public static final SubLString $str27$_S = makeString("~S");
  public static final SubLString $str28$_D = makeString("~D");
  public static final SubLString $str29$__ = makeString("~%");
  public static final SubLString $str30$__ = makeString("~~");
  public static final SubLSymbol $sym31$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str32$ = makeString("");
  public static final SubLString $str33$___A = makeString("~%~A");

  //// Initializers

  public void declareFunctions() {
    declare_format_nil_file();
  }

  public void initializeVariables() {
    init_format_nil_file();
  }

  public void runTopLevelForms() {
    setup_format_nil_file();
  }

}
