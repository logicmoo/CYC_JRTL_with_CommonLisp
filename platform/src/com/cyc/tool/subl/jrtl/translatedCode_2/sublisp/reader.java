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

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map.Entry;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public  final class reader extends SubLTranslatedFile {

  //// Constructor

  private reader() {}
  public static final SubLFile me = new reader();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader";

  //// Definitions

  @SubL(source = "sublisp/reader.lisp", position = 4562) 
  public static final SubLObject loop(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject body = current;
      return listS($sym0$CDO, NIL, $list1, ConsesLow.append(body, NIL));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 4653) 
  public static SubLSymbol $whitespace_1_chars$ = null;

  /** True of characters whose glyphs server only to move the print position.
Note:  This is not the same as having the whitespace syntax type. */
  @SubL(source = "sublisp/reader.lisp", position = 4948) 
  public static final SubLObject whitespace_1_char_p(SubLObject v_char) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return conses_high.member(v_char, $whitespace_1_chars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }
  }

  /** True of characters that have the whitespace syntax type.
Note:  This is not the same as a character whose glyph serves
only to move the print position. */
  @SubL(source = "sublisp/reader.lisp", position = 5249) 
  public static final SubLObject whitespace_2_char_p(SubLObject v_char) {
    return whitespace_syntaxp(v_char);
  }

  @SubL(source = "sublisp/reader.lisp", position = 5476) 
  public static SubLSymbol $read_base$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 5623) 
  public static SubLSymbol $read_default_float_format$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 5688) 
  public static SubLSymbol $read_eval$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 5725) 
  public static SubLSymbol $read_suppress$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 5768) 
  public static SubLSymbol $features$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 5840) 
  public static SubLSymbol $readtable$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 5862) 
  private static SubLSymbol $initial_table_size$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 6222) 
  public static SubLSymbol $single_byte_max_code$ = null;

  public static final class $readtable_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $case; }
    public SubLObject getField3() { return $character_syntax; }
    public SubLObject getField4() { return $single_byte_char_syntax; }
    public SubLObject getField5() { return $macro_functions; }
    public SubLObject getField6() { return $single_byte_macro_functions; }
    public SubLObject getField7() { return $constituent_traits; }
    public SubLObject getField8() { return $single_byte_constit_traits; }
    public SubLObject getField9() { return $dispatch_tables; }
    public SubLObject setField2(SubLObject value) { return $case = value; }
    public SubLObject setField3(SubLObject value) { return $character_syntax = value; }
    public SubLObject setField4(SubLObject value) { return $single_byte_char_syntax = value; }
    public SubLObject setField5(SubLObject value) { return $macro_functions = value; }
    public SubLObject setField6(SubLObject value) { return $single_byte_macro_functions = value; }
    public SubLObject setField7(SubLObject value) { return $constituent_traits = value; }
    public SubLObject setField8(SubLObject value) { return $single_byte_constit_traits = value; }
    public SubLObject setField9(SubLObject value) { return $dispatch_tables = value; }
    public SubLObject $case = NIL;
    public SubLObject $character_syntax = NIL;
    public SubLObject $single_byte_char_syntax = NIL;
    public SubLObject $macro_functions = NIL;
    public SubLObject $single_byte_macro_functions = NIL;
    public SubLObject $constituent_traits = NIL;
    public SubLObject $single_byte_constit_traits = NIL;
    public SubLObject $dispatch_tables = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($readtable_native.class, $sym6$READTABLE, $sym7$READTABLE_P, $list8, $list9, new String[] {"$case", "$character_syntax", "$single_byte_char_syntax", "$macro_functions", "$single_byte_macro_functions", "$constituent_traits", "$single_byte_constit_traits", "$dispatch_tables"}, $list10, $list11, $sym12$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static SubLSymbol $dtp_readtable$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject readtable_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject readtable_p(SubLObject object) {
    return ((object.getClass() == $readtable_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $readtable_p$UnaryFunction extends UnaryFunction {
    public $readtable_p$UnaryFunction() { super(extractFunctionNamed("READTABLE-P")); }
    public SubLObject processItem(SubLObject arg1) { return readtable_p(arg1); }
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject readtable_case(SubLObject object) {
    checkType(object, $sym7$READTABLE_P);
    return object.getField2();
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject readtable_character_syntax(SubLObject object) {
    checkType(object, $sym7$READTABLE_P);
    return object.getField3();
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject readtable_single_byte_char_syntax(SubLObject object) {
    checkType(object, $sym7$READTABLE_P);
    return object.getField4();
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject readtable_macro_functions(SubLObject object) {
    checkType(object, $sym7$READTABLE_P);
    return object.getField5();
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject readtable_single_byte_macro_functions(SubLObject object) {
    checkType(object, $sym7$READTABLE_P);
    return object.getField6();
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject readtable_constituent_traits(SubLObject object) {
    checkType(object, $sym7$READTABLE_P);
    return object.getField7();
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject readtable_single_byte_constit_traits(SubLObject object) {
    checkType(object, $sym7$READTABLE_P);
    return object.getField8();
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject readtable_dispatch_tables(SubLObject object) {
    checkType(object, $sym7$READTABLE_P);
    return object.getField9();
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject _csetf_readtable_case(SubLObject object, SubLObject value) {
    checkType(object, $sym7$READTABLE_P);
    return object.setField2(value);
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject _csetf_readtable_character_syntax(SubLObject object, SubLObject value) {
    checkType(object, $sym7$READTABLE_P);
    return object.setField3(value);
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject _csetf_readtable_single_byte_char_syntax(SubLObject object, SubLObject value) {
    checkType(object, $sym7$READTABLE_P);
    return object.setField4(value);
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject _csetf_readtable_macro_functions(SubLObject object, SubLObject value) {
    checkType(object, $sym7$READTABLE_P);
    return object.setField5(value);
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject _csetf_readtable_single_byte_macro_functions(SubLObject object, SubLObject value) {
    checkType(object, $sym7$READTABLE_P);
    return object.setField6(value);
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject _csetf_readtable_constituent_traits(SubLObject object, SubLObject value) {
    checkType(object, $sym7$READTABLE_P);
    return object.setField7(value);
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject _csetf_readtable_single_byte_constit_traits(SubLObject object, SubLObject value) {
    checkType(object, $sym7$READTABLE_P);
    return object.setField8(value);
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject _csetf_readtable_dispatch_tables(SubLObject object, SubLObject value) {
    checkType(object, $sym7$READTABLE_P);
    return object.setField9(value);
  }

  @SubL(source = "sublisp/reader.lisp", position = 6265) 
  public static final SubLObject make_readtable(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $readtable_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw30$CASE)) {
            _csetf_readtable_case(v_new, current_value);
          } else if (pcase_var.eql($kw31$CHARACTER_SYNTAX)) {
            _csetf_readtable_character_syntax(v_new, current_value);
          } else if (pcase_var.eql($kw32$SINGLE_BYTE_CHAR_SYNTAX)) {
            _csetf_readtable_single_byte_char_syntax(v_new, current_value);
          } else if (pcase_var.eql($kw33$MACRO_FUNCTIONS)) {
            _csetf_readtable_macro_functions(v_new, current_value);
          } else if (pcase_var.eql($kw34$SINGLE_BYTE_MACRO_FUNCTIONS)) {
            _csetf_readtable_single_byte_macro_functions(v_new, current_value);
          } else if (pcase_var.eql($kw35$CONSTITUENT_TRAITS)) {
            _csetf_readtable_constituent_traits(v_new, current_value);
          } else if (pcase_var.eql($kw36$SINGLE_BYTE_CONSTIT_TRAITS)) {
            _csetf_readtable_single_byte_constit_traits(v_new, current_value);
          } else if (pcase_var.eql($kw37$DISPATCH_TABLES)) {
            _csetf_readtable_dispatch_tables(v_new, current_value);
          } else {
            Errors.error($str38$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 7471) 
  private static SubLSymbol $alphabetic$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 7626) 
  private static SubLSymbol $digit$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 7671) 
  private static SubLSymbol $package_marker$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 7716) 
  private static SubLSymbol $plus_sign$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 7761) 
  private static SubLSymbol $minus_sign$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 7806) 
  private static SubLSymbol $dot$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 7851) 
  private static SubLSymbol $decimal_point$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 7896) 
  private static SubLSymbol $ratio_marker$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 7941) 
  private static SubLSymbol $exponent_marker$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 7986) 
  private static SubLSymbol $invalid$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 8031) 
  public static final SubLObject create_readtable() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject readtable = make_readtable(UNPROVIDED);
        _csetf_readtable_case(readtable, $kw42$UPCASE);
        _csetf_readtable_character_syntax(readtable, Hashtables.make_hash_table($initial_table_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        _csetf_readtable_single_byte_char_syntax(readtable, Vectors.make_vector($single_byte_max_code$.getGlobalValue(), $kw43$CONSTITUENT));
        _csetf_readtable_macro_functions(readtable, Hashtables.make_hash_table($initial_table_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        _csetf_readtable_single_byte_macro_functions(readtable, Vectors.make_vector($single_byte_max_code$.getGlobalValue(), $sym44$CONSTITUENT_RMF));
        _csetf_readtable_constituent_traits(readtable, Hashtables.make_hash_table($initial_table_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        _csetf_readtable_single_byte_constit_traits(readtable, Vectors.make_vector($single_byte_max_code$.getGlobalValue(), $alphabetic$.getGlobalValue()));
        _csetf_readtable_dispatch_tables(readtable, NIL);
        return readtable;
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 8844) 
  public static SubLSymbol $standard_readtable$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 8876) 
  public static final SubLObject single_byte_p(SubLObject ch) {
    return Numbers.numL(Characters.char_code(ch), $single_byte_max_code$.getGlobalValue());
  }

  @SubL(source = "sublisp/reader.lisp", position = 8992) 
  public static final SubLObject character_syntax(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject ch = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list45);
      ch = current.first();
      current = current.rest();
      {
        SubLObject readtable = (current.isCons() ? ((SubLObject) current.first()) : $sym46$_READTABLE_);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list45);
        current = current.rest();
        if ((NIL == current)) {
          return list($sym47$FIF, list($sym48$SINGLE_BYTE_P, ch), list($sym49$AREF, list($sym18$READTABLE_SINGLE_BYTE_CHAR_SYNTAX, readtable), list($sym50$CHAR_CODE, ch)), listS($sym51$GETHASH, ch, list($sym16$READTABLE_CHARACTER_SYNTAX, readtable), $list52));
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list45);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/reader.lisp", position = 9244) 
  public static final SubLObject set_character_syntax(SubLObject ch, SubLObject syntax, SubLObject readtable) {
    if ((readtable == UNPROVIDED)) {
      readtable = $readtable$.getDynamicValue();
    }
    Hashtables.sethash(ch, readtable_character_syntax(readtable), syntax);
    if ((NIL != single_byte_p(ch))) {
      Vectors.set_aref(readtable_single_byte_char_syntax(readtable), Characters.char_code(ch), syntax);
    }
    return syntax;
  }

  @SubL(source = "sublisp/reader.lisp", position = 9521) 
  public static final SubLObject invalid_syntaxp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eq(((NIL != single_byte_p(ch)) ? ((SubLObject) Vectors.aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), Characters.char_code(ch))) : Hashtables.gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $kw43$CONSTITUENT)), $kw53$INVALID);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 9596) 
  public static final SubLObject terminating_macro_syntaxp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eq(((NIL != single_byte_p(ch)) ? ((SubLObject) Vectors.aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), Characters.char_code(ch))) : Hashtables.gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $kw43$CONSTITUENT)), $kw54$TERMINATING_MACRO);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 9690) 
  public static final SubLObject non_terminating_macro_syntaxp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eq(((NIL != single_byte_p(ch)) ? ((SubLObject) Vectors.aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), Characters.char_code(ch))) : Hashtables.gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $kw43$CONSTITUENT)), $kw55$NON_TERMINATING_MACRO);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 9792) 
  public static final SubLObject multiple_escape_syntaxp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eq(((NIL != single_byte_p(ch)) ? ((SubLObject) Vectors.aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), Characters.char_code(ch))) : Hashtables.gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $kw43$CONSTITUENT)), $kw56$MULTIPLE_ESCAPE);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 9882) 
  public static final SubLObject single_escape_syntaxp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eq(((NIL != single_byte_p(ch)) ? ((SubLObject) Vectors.aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), Characters.char_code(ch))) : Hashtables.gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $kw43$CONSTITUENT)), $kw57$SINGLE_ESCAPE);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 9968) 
  public static final SubLObject whitespace_syntaxp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eq(((NIL != single_byte_p(ch)) ? ((SubLObject) Vectors.aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), Characters.char_code(ch))) : Hashtables.gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $kw43$CONSTITUENT)), $kw58$WHITESPACE);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 10048) 
  public static final SubLObject constituent_syntaxp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eq(((NIL != single_byte_p(ch)) ? ((SubLObject) Vectors.aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), Characters.char_code(ch))) : Hashtables.gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $kw43$CONSTITUENT)), $kw43$CONSTITUENT);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 10130) 
  public static final SubLObject character_function(SubLObject ch, SubLObject readtable) {
    if ((readtable == UNPROVIDED)) {
      readtable = $readtable$.getDynamicValue();
    }
    if ((NIL != single_byte_p(ch))) {
      return Vectors.aref(readtable_single_byte_macro_functions(readtable), Characters.char_code(ch));
    } else {
      {
        SubLObject func = Hashtables.gethash(ch, readtable_macro_functions(readtable), UNPROVIDED);
        return ((NIL != func) ? ((SubLObject) func) : $sym44$CONSTITUENT_RMF);
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 10477) 
  public static final SubLObject set_character_function(SubLObject ch, SubLObject func, SubLObject readtable) {
    if ((readtable == UNPROVIDED)) {
      readtable = $readtable$.getDynamicValue();
    }
    Hashtables.sethash(ch, readtable_macro_functions(readtable), func);
    if ((NIL != single_byte_p(ch))) {
      Vectors.set_aref(readtable_single_byte_macro_functions(readtable), Characters.char_code(ch), func);
    }
    return func;
  }

  @SubL(source = "sublisp/reader.lisp", position = 10748) 
  public static final SubLObject character_traits(SubLObject ch, SubLObject readtable) {
    if ((readtable == UNPROVIDED)) {
      readtable = $readtable$.getDynamicValue();
    }
    return ((NIL != single_byte_p(ch)) ? ((SubLObject) Vectors.aref(readtable_single_byte_constit_traits(readtable), Characters.char_code(ch))) : Hashtables.gethash(ch, readtable_constituent_traits(readtable), $alphabetic$.getGlobalValue()));
  }

  @SubL(source = "sublisp/reader.lisp", position = 11109) 
  public static final SubLObject has_traitp(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject ch = NIL;
      SubLObject trait = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
      ch = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
      trait = current.first();
      current = current.rest();
      {
        SubLObject readtable = (current.isCons() ? ((SubLObject) current.first()) : $sym46$_READTABLE_);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list59);
        current = current.rest();
        if ((NIL == current)) {
          return list($sym60$PLUSP, list($sym61$LOGAND, trait, list($sym62$CHARACTER_TRAITS, ch, readtable)));
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list59);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/reader.lisp", position = 11245) 
  public static final SubLObject set_trait(SubLObject ch, SubLObject readtable, SubLObject trait) {
    {
      SubLObject new_traits = Numbers.logior(trait, character_traits(ch, readtable));
      Hashtables.sethash(ch, readtable_constituent_traits(readtable), new_traits);
      if ((NIL != single_byte_p(ch))) {
        Vectors.set_aref(readtable_single_byte_constit_traits(readtable), Characters.char_code(ch), new_traits);
      }
    }
    return trait;
  }

  /** A shorthand for saying that trait should be alphabetic from now on. */
  @SubL(source = "sublisp/reader.lisp", position = 11572) 
  public static final SubLObject reset_trait(SubLObject ch, SubLObject readtable) {
    if ((readtable == UNPROVIDED)) {
      readtable = $readtable$.getDynamicValue();
    }
    if ((NIL != single_byte_p(ch))) {
      Vectors.set_aref(readtable_single_byte_constit_traits(readtable), Characters.char_code(ch), $alphabetic$.getGlobalValue());
    }
    Hashtables.remhash(ch, readtable_constituent_traits(readtable));
    return NIL;
  }

  @SubL(source = "sublisp/reader.lisp", position = 11909) 
  public static final SubLObject alphabetic_traitp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((Numbers.logand($alphabetic$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))).isPositive()
             && (!((Numbers.logand($digit$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))).isPositive()
                 && (NIL != Characters.digit_char_p(ch, $read_base$.getDynamicValue(thread))))))));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 12092) 
  public static final SubLObject digit_traitp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((Numbers.logand($digit$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))).isPositive()
             && (NIL != Characters.digit_char_p(ch, $read_base$.getDynamicValue(thread)))));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 12202) 
  public static final SubLObject package_marker_traitp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Numbers.plusp(Numbers.logand($package_marker$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 12280) 
  public static final SubLObject plus_sign_traitp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Numbers.plusp(Numbers.logand($plus_sign$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 12347) 
  public static final SubLObject minus_sign_traitp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Numbers.plusp(Numbers.logand($minus_sign$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 12416) 
  public static final SubLObject dot_traitp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Numbers.plusp(Numbers.logand($dot$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 12471) 
  public static final SubLObject decimal_point_traitp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Numbers.plusp(Numbers.logand($decimal_point$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 12546) 
  public static final SubLObject ratio_marker_traitp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Numbers.plusp(Numbers.logand($ratio_marker$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 12619) 
  public static final SubLObject exponent_marker_traitp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Numbers.plusp(Numbers.logand($exponent_marker$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 12698) 
  public static final SubLObject invalid_traitp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Numbers.plusp(Numbers.logand($invalid$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 12761) 
  public static final SubLObject alphadigit_traitp(SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((Numbers.logand($alphabetic$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))).isPositive()
             && Numbers.logand($digit$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))).isPositive()));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 12875) 
  public static final SubLObject Xcopy_hash_table(SubLObject from, SubLObject to) {
    {
      SubLObject k = NIL;
      SubLObject v = NIL;
      {
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(from);
        try {
          while (Hashtables.iteratorHasNext(cdohash_iterator)) {
            final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
            k = Hashtables.getEntryKey(cdohash_entry);
            v = Hashtables.getEntryValue(cdohash_entry);
            Hashtables.sethash(k, to, v);
          }
        } finally {
          Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
      }
    }
    return to;
  }

  @SubL(source = "sublisp/reader.lisp", position = 13018) 
  public static final SubLObject copy_readtable(SubLObject from_readtable, SubLObject to_readtable) {
    if ((from_readtable == UNPROVIDED)) {
      from_readtable = $readtable$.getDynamicValue();
    }
    if ((to_readtable == UNPROVIDED)) {
      to_readtable = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == from_readtable)) {
        from_readtable = $standard_readtable$.getDynamicValue(thread);
      }
      if ((NIL != to_readtable)) {
        Hashtables.clrhash(readtable_character_syntax(to_readtable));
        Hashtables.clrhash(readtable_macro_functions(to_readtable));
        Hashtables.clrhash(readtable_constituent_traits(to_readtable));
      } else {
        to_readtable = create_readtable();
      }
      _csetf_readtable_case(to_readtable, readtable_case(from_readtable));
      Xcopy_hash_table(readtable_character_syntax(from_readtable), readtable_character_syntax(to_readtable));
      Xcopy_hash_table(readtable_macro_functions(from_readtable), readtable_macro_functions(to_readtable));
      Xcopy_hash_table(readtable_constituent_traits(from_readtable), readtable_constituent_traits(to_readtable));
      {
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; i.numL($single_byte_max_code$.getGlobalValue()); i = Numbers.add(i, ONE_INTEGER)) {
          Vectors.set_aref(readtable_single_byte_char_syntax(to_readtable), i, Vectors.aref(readtable_single_byte_char_syntax(from_readtable), i));
          Vectors.set_aref(readtable_single_byte_macro_functions(to_readtable), i, Vectors.aref(readtable_single_byte_macro_functions(from_readtable), i));
          Vectors.set_aref(readtable_single_byte_constit_traits(to_readtable), i, Vectors.aref(readtable_single_byte_constit_traits(from_readtable), i));
        }
      }
      {
        SubLObject dispatch_table = NIL;
        SubLObject cdolist_list_var = readtable_dispatch_tables(from_readtable);
        SubLObject bucket = NIL;
        for (bucket = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), bucket = cdolist_list_var.first()) {
          {
            SubLObject datum = bucket;
            SubLObject current = datum;
            SubLObject ch = NIL;
            SubLObject table = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list63);
            ch = current.first();
            current = current.rest();
            table = current;
            dispatch_table = cons(cons(ch, Xcopy_hash_table(table, Hashtables.make_hash_table(Hashtables.hash_table_count(table), UNPROVIDED, UNPROVIDED))), dispatch_table);
          }
        }
        _csetf_readtable_dispatch_tables(to_readtable, dispatch_table);
      }
      return to_readtable;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 14699) 
  public static final SubLObject make_dispatch_macro_character(SubLObject v_char, SubLObject non_terminating_p, SubLObject readtable) {
    if ((non_terminating_p == UNPROVIDED)) {
      non_terminating_p = NIL;
    }
    if ((readtable == UNPROVIDED)) {
      readtable = $readtable$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      _csetf_readtable_dispatch_tables(readtable, Sequences.delete(v_char, readtable_dispatch_tables(readtable), Symbols.symbol_function(EQL), Symbols.symbol_function($sym64$CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
      _csetf_readtable_dispatch_tables(readtable, cons(cons(v_char, Hashtables.make_hash_table($initial_table_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)), readtable_dispatch_tables(readtable)));
      set_character_function(v_char, $sym65$DISPATCHING_RMF, readtable);
      set_character_syntax(v_char, ((NIL != non_terminating_p) ? ((SubLObject) $kw55$NON_TERMINATING_MACRO) : $kw54$TERMINATING_MACRO), readtable);
      return T;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 15307) 
  public static final SubLObject readtablep(SubLObject object) {
    return readtable_p(object);
  }

  @SubL(source = "sublisp/reader.lisp", position = 15377) 
  public static final SubLObject set_dispatch_macro_character(SubLObject disp_char, SubLObject sub_char, SubLObject new_function, SubLObject readtable) {
    if ((readtable == UNPROVIDED)) {
      readtable = $readtable$.getDynamicValue();
    }
    if ((NIL != Characters.digit_char_p(sub_char, UNPROVIDED))) {
      Errors.error($str66$Attempt_to_make_decimal_digit__A_, sub_char);
    }
    {
      SubLObject bucket = conses_high.assoc(disp_char, readtable_dispatch_tables(readtable), UNPROVIDED, UNPROVIDED);
      if ((NIL == bucket)) {
        Errors.error($str67$_A_is_not_a_dispatching_macro_cha, disp_char, readtable);
      }
      Hashtables.sethash(Characters.char_upcase(sub_char), bucket.rest(), new_function);
    }
    return T;
  }

  @SubL(source = "sublisp/reader.lisp", position = 15884) 
  public static final SubLObject get_dispatch_macro_character(SubLObject disp_char, SubLObject sub_char, SubLObject readtable) {
    if ((readtable == UNPROVIDED)) {
      readtable = $readtable$.getDynamicValue();
    }
    {
      SubLObject bucket = conses_high.assoc(disp_char, readtable_dispatch_tables(readtable), UNPROVIDED, UNPROVIDED);
      if ((NIL == bucket)) {
        Errors.error($str67$_A_is_not_a_dispatching_macro_cha, disp_char, readtable);
      }
      return Hashtables.gethash(Characters.char_upcase(sub_char), bucket.rest(), UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 16229) 
  public static final SubLObject get_macro_character(SubLObject v_char, SubLObject readtable) {
    if ((readtable == UNPROVIDED)) {
      readtable = $readtable$.getDynamicValue();
    }
    {
      SubLObject syntax = ((NIL != single_byte_p(v_char)) ? ((SubLObject) Vectors.aref(readtable_single_byte_char_syntax(readtable), Characters.char_code(v_char))) : Hashtables.gethash(v_char, readtable_character_syntax(readtable), $kw43$CONSTITUENT));
      if (((syntax == $kw54$TERMINATING_MACRO)
          || (syntax == $kw55$NON_TERMINATING_MACRO))) {
        return Values.values(character_function(v_char, readtable), Equality.eq(syntax, $kw55$NON_TERMINATING_MACRO));
      } else {
        return Values.values(NIL, NIL);
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 16611) 
  public static final SubLObject set_macro_character(SubLObject v_char, SubLObject new_function, SubLObject non_terminating_p, SubLObject readtable) {
    if ((non_terminating_p == UNPROVIDED)) {
      non_terminating_p = NIL;
    }
    if ((readtable == UNPROVIDED)) {
      readtable = $readtable$.getDynamicValue();
    }
    set_character_function(v_char, new_function, readtable);
    set_character_syntax(v_char, ((NIL != non_terminating_p) ? ((SubLObject) $kw55$NON_TERMINATING_MACRO) : $kw54$TERMINATING_MACRO), readtable);
    return T;
  }

  @SubL(source = "sublisp/reader.lisp", position = 17001) 
  public static final SubLObject set_syntax_from_char(SubLObject to_char, SubLObject from_char, SubLObject from_readtable, SubLObject to_readtable) {
    if ((from_readtable == UNPROVIDED)) {
      from_readtable = NIL;
    }
    if ((to_readtable == UNPROVIDED)) {
      to_readtable = $readtable$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == from_readtable)) {
        from_readtable = $standard_readtable$.getDynamicValue(thread);
      }
      {
        SubLObject syntax = ((NIL != single_byte_p(from_char)) ? ((SubLObject) Vectors.aref(readtable_single_byte_char_syntax(from_readtable), Characters.char_code(from_char))) : Hashtables.gethash(from_char, readtable_character_syntax(from_readtable), $kw43$CONSTITUENT));
        SubLObject pcase_var = syntax;
        if ((pcase_var.eql($kw54$TERMINATING_MACRO)
            || pcase_var.eql($kw55$NON_TERMINATING_MACRO))) {
          {
            SubLObject rmf = character_function(from_char, from_readtable);
            if ((rmf == $sym65$DISPATCHING_RMF)) {
              {
                SubLObject from_table = conses_high.assoc(from_char, readtable_dispatch_tables(from_readtable), UNPROVIDED, UNPROVIDED).rest();
                SubLObject to_table = Hashtables.make_hash_table(Hashtables.hash_table_count(from_table), UNPROVIDED, UNPROVIDED);
                _csetf_readtable_dispatch_tables(to_readtable, cons(cons(to_char, Xcopy_hash_table(from_table, to_table)), Sequences.delete(to_char, readtable_dispatch_tables(to_readtable), Symbols.symbol_function(EQL), Symbols.symbol_function($sym64$CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
              }
            }
            set_character_function(to_char, rmf, to_readtable);
          }
        } else if (pcase_var.eql($kw43$CONSTITUENT)) {
          reset_trait(to_char, to_readtable);
        }
        set_character_syntax(to_char, syntax, to_readtable);
      }
      return T;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 18313) 
  public static final SubLObject set_syntax(SubLObject ch, SubLObject syntax, SubLObject function) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      set_macro_character(ch, function, NIL, $standard_readtable$.getDynamicValue(thread));
      set_character_syntax(ch, syntax, $standard_readtable$.getDynamicValue(thread));
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 22812) 
  private static SubLSymbol $throw_reader_error_p$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 23097) 
  public static final SubLObject simple_reader_error(SubLObject format_control, SubLObject format_arguments) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $throw_reader_error_p$.getDynamicValue(thread))) {
        Dynamic.sublisp_throw($sym100$READER_ERROR, T);
      } else {
        Functions.apply(Symbols.symbol_function($sym101$ERROR), format_control, format_arguments);
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 23289) 
  private static SubLSymbol $throw_end_of_file_p$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 23444) 
  public static final SubLObject end_of_file_error(SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $throw_end_of_file_p$.getDynamicValue(thread))) {
        Dynamic.sublisp_throw($sym102$END_OF_FILE, T);
      } else {
        simple_reader_error($str103$End_of_file_on_stream__S_, list(stream));
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 23644) 
  public static final SubLObject invalid_token_syntax_error(SubLObject stream, SubLObject token) {
    simple_reader_error($str104$_S_is_invalid_token_syntax_, list(read_token_string(token)));
    return NIL;
  }

  @SubL(source = "sublisp/reader.lisp", position = 23813) 
  public static final SubLObject unimplemented_reader_macro_error(SubLObject stream, SubLObject ch) {
    simple_reader_error($str105$The__A_reader_macro_is_not_implem, list(ch));
    return NIL;
  }

  @SubL(source = "sublisp/reader.lisp", position = 23974) 
  public static final SubLObject unnecessary_argument_error(SubLObject stream, SubLObject ch) {
    simple_reader_error($str106$The__A_reader_macro_does_not_take, list(ch));
    return NIL;
  }

  @SubL(source = "sublisp/reader.lisp", position = 24136) 
  public static final SubLObject illegal_argument_error(SubLObject stream, SubLObject ch, SubLObject arg) {
    simple_reader_error($str107$Illegal_argument__D_for_the__A_re, list(arg, ch));
    return NIL;
  }

  @SubL(source = "sublisp/reader.lisp", position = 24300) 
  private static SubLSymbol $read_lookup_table$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 24426) 
  public static final SubLObject read_internal(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
    if ((eof_error_p == UNPROVIDED)) {
      eof_error_p = T;
    }
    if ((eof_value == UNPROVIDED)) {
      eof_value = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      for (; true; ) {
        {
          SubLObject ch = streams_high.read_char(stream, eof_error_p, NIL, UNPROVIDED);
          if ((NIL != ch)) {
            {
              SubLObject func = character_function(ch, UNPROVIDED);
              SubLObject the_result = NIL;
              SubLObject good_p = NIL;
              if ((func == $sym44$CONSTITUENT_RMF)) {
                thread.resetMultipleValues();
                {
                  SubLObject result = constituent_rmf(stream, ch);
                  SubLObject goodp = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  the_result = result;
                  good_p = goodp;
                }
              } else if ((func == $sym68$WHITESPACE_RMF)) {
                thread.resetMultipleValues();
                {
                  SubLObject result = whitespace_rmf(stream, ch);
                  SubLObject goodp = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  the_result = result;
                  good_p = goodp;
                }
              } else if ((func == $sym71$LEFT_PAREN_RMF)) {
                thread.resetMultipleValues();
                {
                  SubLObject result = left_paren_rmf(stream, ch);
                  SubLObject goodp = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  the_result = result;
                  good_p = goodp;
                }
              } else if ((func == $sym72$RIGHT_PAREN_RMF)) {
                thread.resetMultipleValues();
                {
                  SubLObject result = right_paren_rmf(stream, ch);
                  SubLObject goodp = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  the_result = result;
                  good_p = goodp;
                }
              } else if ((func == $sym73$SINGLE_QUOTE_RMF)) {
                thread.resetMultipleValues();
                {
                  SubLObject result = single_quote_rmf(stream, ch);
                  SubLObject goodp = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  the_result = result;
                  good_p = goodp;
                }
              } else if ((func == $sym75$DOUBLE_QUOTE_RMF)) {
                thread.resetMultipleValues();
                {
                  SubLObject result = double_quote_rmf(stream, ch);
                  SubLObject goodp = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  the_result = result;
                  good_p = goodp;
                }
              } else if ((func == $sym76$BACKQUOTE_RMF)) {
                thread.resetMultipleValues();
                {
                  SubLObject result = backquote_rmf(stream, ch);
                  SubLObject goodp = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  the_result = result;
                  good_p = goodp;
                }
              } else if ((func == $sym77$COMMA_RMF)) {
                thread.resetMultipleValues();
                {
                  SubLObject result = comma_rmf(stream, ch);
                  SubLObject goodp = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  the_result = result;
                  good_p = goodp;
                }
              } else if ((func == $sym74$SEMICOLON_RMF)) {
                thread.resetMultipleValues();
                {
                  SubLObject result = semicolon_rmf(stream, ch);
                  SubLObject goodp = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  the_result = result;
                  good_p = goodp;
                }
              } else {
                thread.resetMultipleValues();
                {
                  SubLObject result = Functions.funcall(character_function(ch, UNPROVIDED), stream, ch);
                  SubLObject goodp = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  the_result = result;
                  good_p = goodp;
                }
              }
              if ((NIL != good_p)) {
                return the_result;
              }
            }
          } else {
            return eof_value;
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 27576) 
  public static final SubLObject read_preserving_whitespace(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursivep) {
    if ((stream == UNPROVIDED)) {
      stream = NIL;
    }
    if ((eof_error_p == UNPROVIDED)) {
      eof_error_p = T;
    }
    if ((eof_value == UNPROVIDED)) {
      eof_value = NIL;
    }
    if ((recursivep == UNPROVIDED)) {
      recursivep = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != recursivep)) {
        {
          SubLObject value = read_internal(stream, eof_error_p, eof_value);
          if ((NIL != $read_suppress$.getDynamicValue(thread))) {
            return NIL;
          } else {
            return value;
          }
        }
      } else {
        {
          SubLObject value = NIL;
          {
            SubLObject _prev_bind_0 = $read_lookup_table$.currentBinding(thread);
            try {
              $read_lookup_table$.bind(NIL, thread);
              value = read_preserving_whitespace(stream, eof_error_p, eof_value, T);
            } finally {
              $read_lookup_table$.rebind(_prev_bind_0, thread);
            }
          }
          return value;
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 28046) 
  public static final SubLObject read(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursivep) {
    if ((stream == UNPROVIDED)) {
      stream = NIL;
    }
    if ((eof_error_p == UNPROVIDED)) {
      eof_error_p = T;
    }
    if ((eof_value == UNPROVIDED)) {
      eof_value = NIL;
    }
    if ((recursivep == UNPROVIDED)) {
      recursivep = NIL;
    }
    {
      SubLObject value = read_preserving_whitespace(stream, eof_error_p, eof_value, recursivep);
      SubLObject ch = streams_high.read_char(stream, NIL, NIL, UNPROVIDED);
      if (((NIL != ch)
           && ((NIL == whitespace_syntaxp(ch))
            || (NIL != recursivep)))) {
        streams_high.unread_char(ch, stream);
      }
      return value;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 28443) 
  public static final SubLObject read_delimited_list(SubLObject v_char, SubLObject stream, SubLObject recursivep) {
    if ((stream == UNPROVIDED)) {
      stream = NIL;
    }
    if ((recursivep == UNPROVIDED)) {
      recursivep = NIL;
    }
    {
      SubLObject list = NIL;
      SubLObject tail = NIL;
      for (; true; ) {
        {
          SubLObject ch = streams_high.read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          if ((NIL != Characters.charE(ch, v_char))) {
            return list;
          } else if ((NIL != whitespace_syntaxp(ch))) {
          } else {
            streams_high.unread_char(ch, stream);
            {
              SubLObject next = cons(read(stream, T, NIL, T), NIL);
              if ((NIL != list)) {
                ConsesLow.rplacd(tail, next);
                tail = tail.rest();
              } else {
                list = next;
                tail = list;
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 28913) 
  public static final SubLObject read_from_string(SubLObject string, SubLObject eof_error_p, SubLObject eof_value, SubLObject start, SubLObject end, SubLObject preserve_whitespace) {
    if ((eof_error_p == UNPROVIDED)) {
      eof_error_p = T;
    }
    if ((eof_value == UNPROVIDED)) {
      eof_value = NIL;
    }
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    if ((preserve_whitespace == UNPROVIDED)) {
      preserve_whitespace = NIL;
    }
    {
      SubLObject result = NIL;
      SubLObject index = NIL;
      SubLObject in = NIL;
      try {
        in = streams_high.make_private_string_input_stream(string, start, end);
        if ((NIL != preserve_whitespace)) {
          result = read_preserving_whitespace(in, eof_error_p, eof_value, UNPROVIDED);
        } else {
          result = read(in, eof_error_p, eof_value, UNPROVIDED);
        }
        index = streams_high.stream_input_index(in);
      } finally {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
          try {
            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
            streams_high.close(in, UNPROVIDED);
          } finally {
            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
          }
        }
      }
      return Values.values(result, index);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 29330) 
  public static final SubLObject with_standard_io_syntax(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject body = current;
      return listS($sym108$CLET, $list109, ConsesLow.append(body, NIL));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 29570) 
  public static final SubLObject with_special_reader_error_handling(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject body = current;
      return bq_cons($sym110$PROGN, ConsesLow.append(body, NIL));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 30308) 
  public static final SubLObject read_ignoring_errors(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
    if ((stream == UNPROVIDED)) {
      stream = StreamsLow.$standard_input$.getDynamicValue();
    }
    if ((eof_error_p == UNPROVIDED)) {
      eof_error_p = T;
    }
    if ((eof_value == UNPROVIDED)) {
      eof_value = $kw111$EOF;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject end_of_file_p = NIL;
        SubLObject reader_error_p = NIL;
        SubLObject result = NIL;
        try {
          try {
            {
              SubLObject _prev_bind_0 = $throw_end_of_file_p$.currentBinding(thread);
              SubLObject _prev_bind_1 = $throw_reader_error_p$.currentBinding(thread);
              try {
                $throw_end_of_file_p$.bind(((NIL != $throw_end_of_file_p$.getDynamicValue(thread)) ? ((SubLObject) T) : makeBoolean((NIL == eof_error_p))), thread);
                $throw_reader_error_p$.bind(T, thread);
                result = read(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              } finally {
                $throw_reader_error_p$.rebind(_prev_bind_1, thread);
                $throw_end_of_file_p$.rebind(_prev_bind_0, thread);
              }
            }
          } catch (Throwable ccatch_env_var) {
            reader_error_p = Errors.handleThrowable(ccatch_env_var, $sym100$READER_ERROR);
          }
        } catch (Throwable ccatch_env_var) {
          end_of_file_p = Errors.handleThrowable(ccatch_env_var, $sym102$END_OF_FILE);
        }
        if ((NIL != reader_error_p)) {
          return Values.values(NIL, $kw112$ERROR);
        } else if ((NIL != end_of_file_p)) {
          return Values.values(eof_value, $kw112$ERROR);
        } else {
          return Values.values(result, NIL);
        }
      }
    }
  }

  /** Returns the values FORM NEW-START if read was successful.
Returns the values NIL :ERROR if there was a reader error.
Returns the values EOF-VALUE :ERROR if EOF-ERROR-P is nil and EOF occurs.
Causes an error if EOF-ERROR-P is not nil and EOF occurs.
Returns a second value which is an integer indicating the position in the string to
start reading from again or :ERROR if there was some kind of reader error. */
  @SubL(source = "sublisp/reader.lisp", position = 30932) 
  public static final SubLObject read_from_string_ignoring_errors(SubLObject string, SubLObject eof_error_p, SubLObject eof_value, SubLObject start, SubLObject end) {
    if ((eof_error_p == UNPROVIDED)) {
      eof_error_p = T;
    }
    if ((eof_value == UNPROVIDED)) {
      eof_value = $kw111$EOF;
    }
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject index = NIL;
        SubLObject value = NIL;
        SubLObject status = NIL;
        SubLObject stream = NIL;
        try {
          stream = streams_high.make_private_string_input_stream(string, start, end);
          thread.resetMultipleValues();
          {
            SubLObject value_1 = read_ignoring_errors(stream, eof_error_p, eof_value);
            SubLObject status_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            value = value_1;
            status = status_1;
          }
          index = streams_high.stream_input_index(stream);
        } finally {
          {
            SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
              streams_high.close(stream, UNPROVIDED);
            } finally {
              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
          }
        }
        if ((status == $kw112$ERROR)) {
          return Values.values(value, status);
        } else {
          return Values.values(value, index);
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 31841) 
  private static SubLSymbol $initial_token_size$ = null;

  public static final class $read_token_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $pointer; }
    public SubLObject getField3() { return $buffer; }
    public SubLObject getField4() { return $escapes; }
    public SubLObject setField2(SubLObject value) { return $pointer = value; }
    public SubLObject setField3(SubLObject value) { return $buffer = value; }
    public SubLObject setField4(SubLObject value) { return $escapes = value; }
    public SubLObject $pointer = NIL;
    public SubLObject $buffer = NIL;
    public SubLObject $escapes = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($read_token_native.class, $sym113$READ_TOKEN, $sym114$READ_TOKEN_P, $list115, $list116, new String[] {"$pointer", "$buffer", "$escapes"}, $list117, $list118, $sym12$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "sublisp/reader.lisp", position = 31900) 
  public static SubLSymbol $dtp_read_token$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 31900) 
  public static final SubLObject read_token_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  @SubL(source = "sublisp/reader.lisp", position = 31900) 
  public static final SubLObject read_token_p(SubLObject object) {
    return ((object.getClass() == $read_token_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $read_token_p$UnaryFunction extends UnaryFunction {
    public $read_token_p$UnaryFunction() { super(extractFunctionNamed("READ-TOKEN-P")); }
    public SubLObject processItem(SubLObject arg1) { return read_token_p(arg1); }
  }

  @SubL(source = "sublisp/reader.lisp", position = 31900) 
  public static final SubLObject read_token_pointer(SubLObject object) {
    checkType(object, $sym114$READ_TOKEN_P);
    return object.getField2();
  }

  @SubL(source = "sublisp/reader.lisp", position = 31900) 
  public static final SubLObject read_token_buffer(SubLObject object) {
    checkType(object, $sym114$READ_TOKEN_P);
    return object.getField3();
  }

  @SubL(source = "sublisp/reader.lisp", position = 31900) 
  public static final SubLObject read_token_escapes(SubLObject object) {
    checkType(object, $sym114$READ_TOKEN_P);
    return object.getField4();
  }

  @SubL(source = "sublisp/reader.lisp", position = 31900) 
  public static final SubLObject _csetf_read_token_pointer(SubLObject object, SubLObject value) {
    checkType(object, $sym114$READ_TOKEN_P);
    return object.setField2(value);
  }

  @SubL(source = "sublisp/reader.lisp", position = 31900) 
  public static final SubLObject _csetf_read_token_buffer(SubLObject object, SubLObject value) {
    checkType(object, $sym114$READ_TOKEN_P);
    return object.setField3(value);
  }

  @SubL(source = "sublisp/reader.lisp", position = 31900) 
  public static final SubLObject _csetf_read_token_escapes(SubLObject object, SubLObject value) {
    checkType(object, $sym114$READ_TOKEN_P);
    return object.setField4(value);
  }

  @SubL(source = "sublisp/reader.lisp", position = 31900) 
  public static final SubLObject make_read_token(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $read_token_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw126$POINTER)) {
            _csetf_read_token_pointer(v_new, current_value);
          } else if (pcase_var.eql($kw127$BUFFER)) {
            _csetf_read_token_buffer(v_new, current_value);
          } else if (pcase_var.eql($kw128$ESCAPES)) {
            _csetf_read_token_escapes(v_new, current_value);
          } else {
            Errors.error($str38$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 32004) 
  public static final SubLObject with_read_token(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject token = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list129);
      token = current.first();
      current = current.rest();
      {
        SubLObject body = current;
        return listS($sym108$CLET, list(bq_cons(token, $list130)), $list131, $list132, $list133, ConsesLow.append(body, NIL));
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 32281) 
  public static final SubLObject add_to_token(SubLObject ch, SubLObject token, SubLObject escapep) {
    {
      SubLObject buffer = read_token_buffer(token);
      SubLObject length = Sequences.length(buffer);
      if (read_token_pointer(token).numGE(length)) {
        {
          SubLObject new_buffer = Strings.make_string(Numbers.multiply(length, TWO_INTEGER), UNPROVIDED);
          SubLObject i = NIL;
          for (i = ZERO_INTEGER; i.numL(length); i = Numbers.add(i, ONE_INTEGER)) {
            Strings.set_char(new_buffer, i, Strings.sublisp_char(buffer, i));
          }
          _csetf_read_token_buffer(token, new_buffer);
        }
      }
    }
    Strings.set_char(read_token_buffer(token), read_token_pointer(token), ch);
    if ((NIL != escapep)) {
      _csetf_read_token_escapes(token, cons(read_token_pointer(token), read_token_escapes(token)));
    }
    _csetf_read_token_pointer(token, Numbers.add(read_token_pointer(token), ONE_INTEGER));
    return ch;
  }

  @SubL(source = "sublisp/reader.lisp", position = 32850) 
  public static final SubLObject read_token_string(SubLObject token) {
    return Sequences.subseq(read_token_buffer(token), ZERO_INTEGER, read_token_pointer(token));
  }

  @SubL(source = "sublisp/reader.lisp", position = 32966) 
  public static final SubLObject read_token(SubLObject stream, SubLObject token, SubLObject escapep) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      for (; true; ) {
        {
          SubLObject ch = streams_high.read_char(stream, NIL, NIL, UNPROVIDED);
          if ((NIL != escapep)) {
            if ((NIL == ch)) {
              end_of_file_error(stream);
            } else if (((NIL != constituent_syntaxp(ch))
                || (NIL != non_terminating_macro_syntaxp(ch))
                || (NIL != terminating_macro_syntaxp(ch))
                || (NIL != whitespace_syntaxp(ch)))) {
              add_to_token(ch, token, T);
            } else if ((NIL != single_escape_syntaxp(ch))) {
              add_to_token(streams_high.read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED), token, T);
            } else if ((NIL != multiple_escape_syntaxp(ch))) {
              escapep = NIL;
            } else if (((NIL != invalid_syntaxp(ch))
                 && (NIL == $read_suppress$.getDynamicValue(thread)))) {
              simple_reader_error($str134$_A_is_an_invalid_character_, list(ch));
            } else {
              simple_reader_error($str135$Fell_through_character_syntax_on_, list(ch));
            }
          } else {
            if ((NIL == ch)) {
              return token;
            } else if (((NIL != constituent_syntaxp(ch))
                || (NIL != non_terminating_macro_syntaxp(ch)))) {
              add_to_token(ch, token, NIL);
            } else if ((NIL != single_escape_syntaxp(ch))) {
              add_to_token(streams_high.read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED), token, T);
            } else if ((NIL != multiple_escape_syntaxp(ch))) {
              escapep = T;
            } else if (((NIL != invalid_syntaxp(ch))
                 && (NIL == $read_suppress$.getDynamicValue(thread)))) {
              simple_reader_error($str134$_A_is_an_invalid_character_, list(ch));
            } else if (((NIL != terminating_macro_syntaxp(ch))
                || (NIL != whitespace_syntaxp(ch)))) {
              streams_high.unread_char(ch, stream);
              return token;
            } else {
              simple_reader_error($str135$Fell_through_character_syntax_on_, list(ch));
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 34594) 
  public static final SubLObject potential_number_p(SubLObject string, SubLObject length) {
    {
      SubLObject letter_seen_p = NIL;
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; i.numL(length); i = Numbers.add(i, ONE_INTEGER)) {
        {
          SubLObject ch = Strings.sublisp_char(string, i);
          if (((NIL != digit_traitp(ch))
              || (NIL != plus_sign_traitp(ch))
              || (NIL != minus_sign_traitp(ch))
              || (NIL != ratio_marker_traitp(ch))
              || (NIL != decimal_point_traitp(ch))
              || (NIL != Characters.charE(ch, Characters.CHAR_caret))
              || (NIL != Characters.charE(ch, Characters.CHAR_underbar)))) {
            letter_seen_p = NIL;
          } else if ((NIL != exponent_marker_traitp(ch))) {
            letter_seen_p = T;
          } else if (((NIL != alphadigit_traitp(ch))
               && (NIL == letter_seen_p))) {
            letter_seen_p = T;
          } else {
            return NIL;
          }
        }
      }
    }
    {
      SubLObject decimal_point_p = NIL;
      SubLObject decimal_digit_p = NIL;
      SubLObject digit_p = NIL;
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; i.numL(length); i = Numbers.add(i, ONE_INTEGER)) {
        {
          SubLObject ch = Strings.sublisp_char(string, i);
          if ((NIL != digit_traitp(ch))) {
            digit_p = T;
          }
          if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
            decimal_digit_p = T;
          }
          if ((NIL != decimal_point_traitp(ch))) {
            decimal_point_p = T;
          }
        }
      }
      if ((((NIL != decimal_point_p)
             && (NIL == decimal_digit_p))
          || (NIL == digit_p))) {
        return NIL;
      }
    }
    {
      SubLObject first = Strings.sublisp_char(string, ZERO_INTEGER);
      if ((!(((NIL != digit_traitp(first))
            || (NIL != plus_sign_traitp(first))
            || (NIL != minus_sign_traitp(first))
            || (NIL != decimal_point_traitp(first))
            || (NIL != Characters.charE(first, Characters.CHAR_caret))
            || (NIL != Characters.charE(first, Characters.CHAR_underbar)))))) {
        return NIL;
      }
      if ((NIL != package_marker_traitp(first))) {
        return NIL;
      }
    }
    {
      SubLObject last = Strings.sublisp_char(string, Numbers.subtract(length, ONE_INTEGER));
      if (((NIL != plus_sign_traitp(last))
          || (NIL != minus_sign_traitp(last)))) {
        return NIL;
      }
    }
    return T;
  }

  @SubL(source = "sublisp/reader.lisp", position = 37714) 
  public static final SubLObject parse_token(SubLObject stream, SubLObject token) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $read_suppress$.getDynamicValue(thread))) {
        return NIL;
      } else {
        {
          SubLObject escapes = Sequences.nreverse(read_token_escapes(token));
          _csetf_read_token_escapes(token, escapes);
          if (((NIL == escapes)
               && (NIL != potential_number_p(read_token_buffer(token), read_token_pointer(token))))) {
            return parse_number(stream, token);
          } else {
            return parse_symbol_or_consing_dot(stream, token);
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 38239) 
  public static final SubLObject symbol_escapep(SubLObject symbol) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject name = Symbols.symbol_name(symbol);
        SubLObject length = Sequences.length(name);
        SubLObject escapep = NIL;
        {
          SubLObject _prev_bind_0 = $read_base$.currentBinding(thread);
          try {
            $read_base$.bind(print_high.$print_base$.getDynamicValue(thread), thread);
            escapep = potential_number_p(name, length);
          } finally {
            $read_base$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL != escapep)) {
          return T;
        }
        {
          SubLObject non_consing_dot = NIL;
          SubLObject v_case = readtable_case($readtable$.getDynamicValue(thread));
          SubLObject i = NIL;
          for (i = ZERO_INTEGER; i.numL(length); i = Numbers.add(i, ONE_INTEGER)) {
            {
              SubLObject ch = Strings.sublisp_char(name, i);
              if ((NIL == constituent_syntaxp(ch))) {
                return T;
              }
              if ((NIL != package_marker_traitp(ch))) {
                return T;
              }
              if ((NIL == dot_traitp(ch))) {
                non_consing_dot = T;
              }
              if ((NIL != Characters.both_case_p(ch))) {
                if (((NIL != Characters.lower_case_p(ch))
                     && (v_case == $kw42$UPCASE))) {
                  return T;
                }
                if (((NIL != Characters.upper_case_p(ch))
                     && (v_case == $kw136$DOWNCASE))) {
                  return T;
                }
              }
            }
          }
          return makeBoolean((NIL == non_consing_dot));
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 39241) 
  public static final SubLObject reader_find_package(SubLObject string, SubLObject start, SubLObject end) {
    {
      SubLObject v_package = Packages.find_package(Sequences.subseq(string, start, end));
      if ((NIL == v_package)) {
        simple_reader_error($str137$_S_is_not_a_known_package_, list(Sequences.subseq(string, start, end)));
      }
      return v_package;
    }
  }

  /** Deal with READTABLE-CASE. */
  @SubL(source = "sublisp/reader.lisp", position = 39501) 
  public static final SubLObject frob_case(SubLObject token) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject frobber = NIL;
        SubLObject pcase_var = readtable_case($readtable$.getDynamicValue(thread));
        if (pcase_var.eql($kw138$PRESERVE)) {
        } else if (pcase_var.eql($kw42$UPCASE)) {
          frobber = $kw42$UPCASE;
        } else if (pcase_var.eql($kw136$DOWNCASE)) {
          frobber = $kw136$DOWNCASE;
        } else if (pcase_var.eql($kw139$INVERT)) {
          {
            SubLObject buffer = read_token_buffer(token);
            SubLObject escapes = read_token_escapes(token);
            SubLObject upcase = NIL;
            SubLObject downcase = NIL;
            SubLObject cdotimes_end_var = read_token_pointer(token);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
              {
                SubLObject escape_idx = escapes.first();
                if (((NIL != escape_idx)
                     && escape_idx.numE(i))) {
                  escapes = escapes.rest();
                } else {
                  {
                    SubLObject ch = Strings.sublisp_char(buffer, i);
                    if ((NIL == Characters.charE(ch, Characters.char_downcase(ch)))) {
                      upcase = T;
                    }
                    if ((NIL == Characters.charE(ch, Characters.char_upcase(ch)))) {
                      downcase = T;
                    }
                  }
                }
              }
            }
            if (((NIL != upcase)
                 && (NIL != downcase))) {
            } else if ((NIL != upcase)) {
              frobber = $kw136$DOWNCASE;
            } else if ((NIL != downcase)) {
              frobber = $kw42$UPCASE;
            }
          }
        }
        if ((NIL != frobber)) {
          {
            SubLObject buffer = read_token_buffer(token);
            SubLObject escapes = read_token_escapes(token);
            SubLObject cdotimes_end_var = read_token_pointer(token);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
              {
                SubLObject escape_idx = escapes.first();
                if (((NIL != escape_idx)
                     && escape_idx.numE(i))) {
                  escapes = escapes.rest();
                } else {
                  {
                    SubLObject curr = Strings.sublisp_char(buffer, i);
                    if ((frobber == $kw42$UPCASE)) {
                      Strings.set_char(buffer, i, Characters.char_upcase(curr));
                    } else {
                      Strings.set_char(buffer, i, Characters.char_downcase(curr));
                    }
                  }
                }
              }
            }
          }
        }
      }
      return token;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 40973) 
  private static SubLSymbol $consing_dot$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 41019) 
  public static SubLSymbol $keyword_package$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 41075) 
  private static SubLSymbol $reading_list$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 41104) 
  private static SubLSymbol $reading_fake_list$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 41253) 
  public static final SubLObject parse_symbol_or_consing_dot(SubLObject stream, SubLObject token) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      frob_case(token);
      {
        SubLObject buffer = read_token_buffer(token);
        SubLObject length = read_token_pointer(token);
        SubLObject escapes = read_token_escapes(token);
        SubLObject pkg_idx1 = NIL;
        SubLObject pkg_idx2 = NIL;
        SubLObject dot_count = ZERO_INTEGER;
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; i.numL(length); i = Numbers.add(i, ONE_INTEGER)) {
          {
            SubLObject ch = Strings.sublisp_char(buffer, i);
            SubLObject escape_idx = escapes.first();
            if (((NIL != escape_idx)
                 && escape_idx.numE(i))) {
              escapes = escapes.rest();
            } else if ((NIL != package_marker_traitp(ch))) {
              if ((NIL != pkg_idx2)) {
                invalid_token_syntax_error(stream, token);
              } else if ((NIL != pkg_idx1)) {
                pkg_idx2 = i;
              } else {
                pkg_idx1 = i;
              }
            } else if ((NIL != dot_traitp(ch))) {
              dot_count = Numbers.add(dot_count, ONE_INTEGER);
            }
          }
        }
        if (dot_count.numE(length)) {
          if ((length.numE(ONE_INTEGER)
               && (NIL != $reading_list$.getDynamicValue(thread))
               && (NIL == $reading_fake_list$.getDynamicValue(thread)))) {
            return $consing_dot$.getDynamicValue(thread);
          } else {
            return invalid_token_syntax_error(stream, token);
          }
        } else if (((NIL != pkg_idx1)
             && (NIL == pkg_idx2)
             && pkg_idx1.numE(ZERO_INTEGER))) {
          if ((!(length.numG(ONE_INTEGER)))) {
            invalid_token_syntax_error(stream, token);
          }
          return Symbols.make_keyword(Sequences.subseq(buffer, ONE_INTEGER, length));
        } else if (((NIL != pkg_idx1)
             && (NIL == pkg_idx2)
             && pkg_idx1.numL(Numbers.subtract(length, ONE_INTEGER)))) {
          {
            SubLObject v_package = reader_find_package(buffer, ZERO_INTEGER, pkg_idx1);
            SubLObject name = Sequences.subseq(buffer, Numbers.add(pkg_idx1, ONE_INTEGER), length);
            thread.resetMultipleValues();
            {
              SubLObject symbol = Packages.find_symbol(name, v_package);
              SubLObject status = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if ((status == $kw142$EXTERNAL)) {
                return symbol;
              } else if ((v_package == $keyword_package$.getGlobalValue())) {
                return Symbols.make_keyword(name);
              } else {
                simple_reader_error($str143$_S_is_not_external_in__S_, list(name, v_package));
              }
            }
          }
        } else if (((NIL != pkg_idx1)
             && (NIL != pkg_idx2)
             && pkg_idx2.numE(Numbers.add(pkg_idx1, ONE_INTEGER))
             && pkg_idx1.numG(ZERO_INTEGER)
             && pkg_idx2.numL(Numbers.subtract(length, ONE_INTEGER)))) {
          return Packages.intern(Sequences.subseq(buffer, Numbers.add(pkg_idx2, ONE_INTEGER), length), reader_find_package(buffer, ZERO_INTEGER, pkg_idx1));
        } else if (((NIL == pkg_idx1)
             && (NIL == pkg_idx2)
             && length.isPositive())) {
          return Packages.intern(Sequences.subseq(buffer, ZERO_INTEGER, length), Packages.$package$.getDynamicValue(thread));
        } else {
          return invalid_token_syntax_error(stream, token);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 44874) 
  public static final SubLObject float_parse_integer(SubLObject string, SubLObject start, SubLObject end, SubLObject radix) {
    {
      SubLObject value = NIL;
      SubLObject i = NIL;
      for (i = start; (!(i.numGE(end))); i = Numbers.add(i, ONE_INTEGER)) {
        {
          SubLObject digit = Characters.digit_char_p(Strings.sublisp_char(string, i), radix);
          value = Numbers.add(Numbers.multiply(((NIL != value) ? ((SubLObject) value) : $float144$0_0), radix), Numbers.sublisp_float(digit, UNPROVIDED));
        }
      }
      return value;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 45200) 
  public static final SubLObject parse_number(SubLObject stream, SubLObject token) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject state = $kw145$INITIAL;
        SubLObject buffer = read_token_buffer(token);
        SubLObject length = read_token_pointer(token);
        SubLObject sign = ONE_INTEGER;
        SubLObject exponent_sign = ONE_INTEGER;
        SubLObject start1 = NIL;
        SubLObject end1 = NIL;
        SubLObject start2 = NIL;
        SubLObject end2 = NIL;
        SubLObject start3 = NIL;
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; i.numL(length); i = Numbers.add(i, ONE_INTEGER)) {
          {
            SubLObject ch = Strings.sublisp_char(buffer, i);
            SubLObject pcase_var = state;
            if (pcase_var.eql($kw145$INITIAL)) {
              if ((NIL != decimal_point_traitp(ch))) {
                state = $kw146$DOT1;
              } else if ((NIL != plus_sign_traitp(ch))) {
                state = $kw147$SIGN;
              } else if ((NIL != minus_sign_traitp(ch))) {
                sign = MINUS_ONE_INTEGER;
                state = $kw147$SIGN;
              } else if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
                start1 = i;
                state = $kw148$DECIMALS;
              } else if ((NIL != digit_traitp(ch))) {
                start1 = i;
                state = $kw149$DIGITS;
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else if (pcase_var.eql($kw147$SIGN)) {
              if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
                start1 = i;
                state = $kw148$DECIMALS;
              } else if ((NIL != digit_traitp(ch))) {
                start1 = i;
                state = $kw149$DIGITS;
              } else if ((NIL != decimal_point_traitp(ch))) {
                state = $kw146$DOT1;
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else if (pcase_var.eql($kw148$DECIMALS)) {
              if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
              } else if ((NIL != digit_traitp(ch))) {
                state = $kw149$DIGITS;
              } else if ((NIL != exponent_marker_traitp(ch))) {
                end1 = i;
                state = $kw150$EXPONENT;
              } else if ((NIL != decimal_point_traitp(ch))) {
                end1 = i;
                state = $kw151$DOT2;
              } else if ((NIL != ratio_marker_traitp(ch))) {
                end1 = i;
                state = $kw152$SLASH;
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else if (pcase_var.eql($kw149$DIGITS)) {
              if ((NIL != digit_traitp(ch))) {
              } else if ((NIL != ratio_marker_traitp(ch))) {
                end1 = i;
                state = $kw152$SLASH;
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else if (pcase_var.eql($kw152$SLASH)) {
              if ((NIL != digit_traitp(ch))) {
                start2 = i;
                state = $kw153$DENOMINATOR;
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else if (pcase_var.eql($kw153$DENOMINATOR)) {
              if ((NIL != digit_traitp(ch))) {
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else if (pcase_var.eql($kw146$DOT1)) {
              if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
                start2 = i;
                state = $kw154$FRACTION;
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else if (pcase_var.eql($kw154$FRACTION)) {
              if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else if (pcase_var.eql($kw151$DOT2)) {
              if ((NIL != exponent_marker_traitp(ch))) {
                start2 = ZERO_INTEGER;
                end2 = ZERO_INTEGER;
                state = $kw150$EXPONENT;
              } else if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
                start2 = i;
                state = $kw155$DECIMALS2;
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else if (pcase_var.eql($kw155$DECIMALS2)) {
              if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
              } else if ((NIL != exponent_marker_traitp(ch))) {
                end2 = i;
                state = $kw150$EXPONENT;
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else if (pcase_var.eql($kw150$EXPONENT)) {
              if ((NIL != plus_sign_traitp(ch))) {
                state = $kw156$EXPONENT_SIGN;
              } else if ((NIL != minus_sign_traitp(ch))) {
                exponent_sign = MINUS_ONE_INTEGER;
                state = $kw156$EXPONENT_SIGN;
              } else if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
                start3 = i;
                state = $kw157$EXPONENT_VALUE;
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else if (pcase_var.eql($kw156$EXPONENT_SIGN)) {
              if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
                start3 = i;
                state = $kw157$EXPONENT_VALUE;
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else if (pcase_var.eql($kw157$EXPONENT_VALUE)) {
              if ((NIL != Characters.digit_char_p(ch, TEN_INTEGER))) {
              } else {
                invalid_token_syntax_error(stream, token);
              }
            } else {
              simple_reader_error($str158$Can_t_happen_, NIL);
            }
          }
        }
        {
          SubLObject pcase_var = state;
          if (pcase_var.eql($kw149$DIGITS)) {
            return Numbers.multiply(sign, parse_integer(buffer, start1, length, $read_base$.getDynamicValue(thread), UNPROVIDED));
          } else if (pcase_var.eql($kw148$DECIMALS)) {
            return Numbers.multiply(sign, parse_integer(buffer, start1, length, $read_base$.getDynamicValue(thread), UNPROVIDED));
          } else if (pcase_var.eql($kw151$DOT2)) {
            return Numbers.multiply(sign, parse_integer(buffer, start1, end1, TEN_INTEGER, UNPROVIDED));
          } else if (pcase_var.eql($kw153$DENOMINATOR)) {
            return Numbers.multiply(sign, Numbers.divide(parse_integer(buffer, start1, end1, $read_base$.getDynamicValue(thread), UNPROVIDED), parse_integer(buffer, start2, length, $read_base$.getDynamicValue(thread), UNPROVIDED)));
          } else if (pcase_var.eql($kw154$FRACTION)) {
            return Numbers.multiply(sign, math_utilities.bellerophon(parse_integer(buffer, start2, length, TEN_INTEGER, UNPROVIDED), Numbers.minus(Numbers.subtract(length, start2))));
          } else if (pcase_var.eql($kw155$DECIMALS2)) {
            {
              SubLObject left = parse_integer(buffer, start1, end1, TEN_INTEGER, UNPROVIDED);
              SubLObject right = parse_integer(buffer, start2, length, TEN_INTEGER, UNPROVIDED);
              return Numbers.multiply(sign, math_utilities.bellerophon(Numbers.add(Numbers.multiply(left, Numbers.expt(TEN_INTEGER, Numbers.subtract(length, start2))), right), Numbers.minus(Numbers.subtract(length, start2))));
            }
          } else if (pcase_var.eql($kw157$EXPONENT_VALUE)) {
            {
              SubLObject left = ((NIL != start1) ? ((SubLObject) parse_integer(buffer, start1, end1, TEN_INTEGER, UNPROVIDED)) : NIL);
              SubLObject right = ((NIL != start2) ? ((SubLObject) parse_integer(buffer, start2, end2, TEN_INTEGER, UNPROVIDED)) : NIL);
              SubLObject exponent = parse_integer(buffer, start3, length, TEN_INTEGER, UNPROVIDED);
              if (((NIL != left)
                   && (NIL != right))) {
                return Numbers.multiply(sign, math_utilities.bellerophon(Numbers.add(Numbers.multiply(left, Numbers.expt(TEN_INTEGER, Numbers.subtract(end2, start2))), right), Numbers.subtract(Numbers.multiply(exponent_sign, exponent), Numbers.subtract(end2, start2))));
              } else if ((NIL != left)) {
                return Numbers.multiply(sign, math_utilities.bellerophon(left, Numbers.multiply(exponent_sign, exponent)));
              } else if ((NIL != right)) {
                return Numbers.multiply(sign, math_utilities.bellerophon(right, Numbers.subtract(Numbers.multiply(exponent_sign, exponent), Numbers.subtract(end2, start2))));
              } else {
                return invalid_token_syntax_error(stream, token);
              }
            }
          } else {
            return invalid_token_syntax_error(stream, token);
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 50448) 
  public static final SubLObject parse_integer(SubLObject string, SubLObject start, SubLObject end, SubLObject radix, SubLObject junk_allowed) {
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    if ((radix == UNPROVIDED)) {
      radix = TEN_INTEGER;
    }
    if ((junk_allowed == UNPROVIDED)) {
      junk_allowed = NIL;
    }
    if ((NIL == end)) {
      end = Sequences.length(string);
    }
    if ((NIL == junk_allowed)) {
      return Numbers.jrtl_parse_integer(string, start, end, radix);
    }
    {
      SubLObject sign = MINUS_ONE_INTEGER;
      SubLObject i = start;
      SubLObject state = $kw145$INITIAL;
      SubLObject value = NIL;
      for (; (!(i.numGE(end))); ) {
        {
          SubLObject ch = Strings.sublisp_char(string, i);
          SubLObject pcase_var = state;
          if (pcase_var.eql($kw145$INITIAL)) {
            if ((NIL != whitespace_1_char_p(ch))) {
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_plus))) {
              state = $kw147$SIGN;
            } else if ((NIL != Characters.charE(ch, Characters.CHAR_hyphen))) {
              sign = ONE_INTEGER;
              state = $kw147$SIGN;
            } else if ((NIL != Characters.digit_char_p(ch, radix))) {
              value = Numbers.minus(Characters.digit_char_p(ch, radix));
              state = $kw159$DIGIT;
            } else if ((NIL != junk_allowed)) {
              return Values.values(NIL, i);
            } else {
              simple_reader_error($str160$_S_does_not_contain_an_integer_, list(Sequences.subseq(string, start, end)));
            }
          } else if (pcase_var.eql($kw147$SIGN)) {
            if ((NIL != Characters.digit_char_p(ch, radix))) {
              value = Numbers.minus(Characters.digit_char_p(ch, radix));
              state = $kw159$DIGIT;
            } else if ((NIL != junk_allowed)) {
              return Values.values(NIL, i);
            } else {
              simple_reader_error($str160$_S_does_not_contain_an_integer_, list(Sequences.subseq(string, start, end)));
            }
          } else if (pcase_var.eql($kw159$DIGIT)) {
            if ((NIL != Characters.digit_char_p(ch, radix))) {
              value = Numbers.subtract(Numbers.multiply(value, radix), Characters.digit_char_p(ch, radix));
            } else if ((NIL != whitespace_1_char_p(ch))) {
              state = $kw161$TRAILING_WHITESPACE;
            } else if ((NIL != junk_allowed)) {
              return Values.values(Numbers.multiply(sign, value), i);
            } else {
              simple_reader_error($str160$_S_does_not_contain_an_integer_, list(Sequences.subseq(string, start, end)));
            }
          } else if (pcase_var.eql($kw161$TRAILING_WHITESPACE)) {
            if ((NIL != whitespace_1_char_p(ch))) {
            } else if ((NIL != junk_allowed)) {
              return Values.values(Numbers.multiply(sign, value), i);
            } else {
              simple_reader_error($str160$_S_does_not_contain_an_integer_, list(Sequences.subseq(string, start, end)));
            }
          }
        }
        i = Numbers.add(i, ONE_INTEGER);
      }
      if (((state == $kw159$DIGIT)
          || (state == $kw161$TRAILING_WHITESPACE))) {
        return Values.values(Numbers.multiply(sign, value), i);
      } else if ((NIL != junk_allowed)) {
        return Values.values(NIL, i);
      } else {
        simple_reader_error($str160$_S_does_not_contain_an_integer_, list(Sequences.subseq(string, start, end)));
      }
    }
    return NIL;
  }

  @SubL(source = "sublisp/reader.lisp", position = 52422) 
  public static final SubLObject whitespace_rmf(SubLObject stream, SubLObject ch) {
    return Values.values(NIL, NIL);
  }

  @SubL(source = "sublisp/reader.lisp", position = 52653) 
  public static final SubLObject constituent_rmf(SubLObject stream, SubLObject ch) {
    {
      SubLObject token = make_read_token(UNPROVIDED);
      _csetf_read_token_pointer(token, ZERO_INTEGER);
      _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
      _csetf_read_token_escapes(token, NIL);
      add_to_token(ch, token, NIL);
      return Values.values(parse_token(stream, read_token(stream, token, NIL)), T);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 52821) 
  public static final SubLObject invalid_rmf(SubLObject stream, SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $read_suppress$.getDynamicValue(thread))) {
        {
          SubLObject token = make_read_token(UNPROVIDED);
          _csetf_read_token_pointer(token, ZERO_INTEGER);
          _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
          _csetf_read_token_escapes(token, NIL);
          return Values.values(read_token(stream, token, NIL), T);
        }
      } else {
        simple_reader_error($str134$_A_is_an_invalid_character_, list(ch));
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 53095) 
  public static final SubLObject single_escape_rmf(SubLObject stream, SubLObject ch) {
    {
      SubLObject token = make_read_token(UNPROVIDED);
      _csetf_read_token_pointer(token, ZERO_INTEGER);
      _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
      _csetf_read_token_escapes(token, NIL);
      add_to_token(streams_high.read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED), token, T);
      read_token(stream, token, NIL);
      return Values.values(parse_token(stream, token), T);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 53303) 
  public static final SubLObject multiple_escape_rmf(SubLObject stream, SubLObject ch) {
    {
      SubLObject token = make_read_token(UNPROVIDED);
      _csetf_read_token_pointer(token, ZERO_INTEGER);
      _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
      _csetf_read_token_escapes(token, NIL);
      read_token(stream, token, T);
      return Values.values(parse_token(stream, token), T);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 53465) 
  public static final SubLObject sharpsign_capital_g_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != arg)) {
        simple_reader_error($str162$The__S_reader_macro_does_not_take, list(ch));
      }
      {
        SubLObject string = read(stream, NIL, NIL, T);
        if ((!(string.isString()))) {
          simple_reader_error($str163$The__S_reader_macro_expected_a_st, list(ch));
        }
        if ((NIL == Guids.guid_string_p(string))) {
          simple_reader_error($str164$The__S_reader_macro_could_not_int, list(ch, string));
        }
        if ((NIL != $read_suppress$.getDynamicValue(thread))) {
          return Values.values(NIL, T);
        } else {
          return Values.values(Guids.string_to_guid(string), T);
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 54169) 
  private static SubLSymbol $right_paren$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 54250) 
  public static final SubLObject left_paren_rmf(SubLObject stream, SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject state = $kw145$INITIAL;
        SubLObject list = NIL;
        SubLObject tail = NIL;
        SubLObject object = NIL;
        for (; true; ) {
          {
            SubLObject _prev_bind_0 = $reading_list$.currentBinding(thread);
            try {
              $reading_list$.bind(T, thread);
              object = read_internal(stream, UNPROVIDED, UNPROVIDED);
            } finally {
              $reading_list$.rebind(_prev_bind_0, thread);
            }
          }
          {
            SubLObject pcase_var = state;
            if (pcase_var.eql($kw145$INITIAL)) {
              if ((object == $right_paren$.getDynamicValue(thread))) {
                return Values.values(NIL, T);
              } else if ((object == $consing_dot$.getDynamicValue(thread))) {
                Errors.error($str166$Nothing_before_consing_dot_);
              } else {
                if ((NIL == $read_suppress$.getDynamicValue(thread))) {
                  list = cons(object, NIL);
                  tail = list;
                }
                state = $kw167$LIST;
              }
            } else if (pcase_var.eql($kw167$LIST)) {
              if ((object == $right_paren$.getDynamicValue(thread))) {
                return Values.values(list, T);
              } else if ((object == $consing_dot$.getDynamicValue(thread))) {
                state = $kw168$CONSING_DOT;
              } else {
                if ((NIL == $read_suppress$.getDynamicValue(thread))) {
                  ConsesLow.rplacd(tail, cons(object, NIL));
                  tail = tail.rest();
                }
              }
            } else if (pcase_var.eql($kw168$CONSING_DOT)) {
              if ((object == $right_paren$.getDynamicValue(thread))) {
                simple_reader_error($str169$Nothing_after_consing_dot_, NIL);
              } else if ((object == $consing_dot$.getDynamicValue(thread))) {
                simple_reader_error($str170$Too_many_consing_dots_, NIL);
              } else {
                if ((NIL == $read_suppress$.getDynamicValue(thread))) {
                  ConsesLow.rplacd(tail, object);
                }
                state = $kw171$AFTER_CONSING_DOT;
              }
            } else if (pcase_var.eql($kw171$AFTER_CONSING_DOT)) {
              if ((object == $right_paren$.getDynamicValue(thread))) {
                return Values.values(list, T);
              } else {
                simple_reader_error($str172$Too_many_objects_after_consing_do, NIL);
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 55869) 
  public static SubLSymbol $ignore_extra_right_parens$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 55937) 
  public static final SubLObject right_paren_rmf(SubLObject stream, SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $reading_list$.getDynamicValue(thread))) {
        return Values.values($right_paren$.getDynamicValue(thread), T);
      } else if ((NIL != $ignore_extra_right_parens$.getDynamicValue(thread))) {
        Errors.warn($str173$Ignoring_unmatched_close_parenthe);
        return Values.values(NIL, NIL);
      } else {
        simple_reader_error($str174$Unmatched__A_, list(ch));
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 56281) 
  public static final SubLObject single_quote_rmf(SubLObject stream, SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject object = read(stream, T, NIL, T);
        return Values.values(((NIL != $read_suppress$.getDynamicValue(thread)) ? ((SubLObject) NIL) : list($sym175$QUOTE, object)), T);
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 56467) 
  public static final SubLObject semicolon_rmf(SubLObject stream, SubLObject ch) {
    for (; true; ) {
      {
        SubLObject next_ch = streams_high.read_char(stream, NIL, NIL, UNPROVIDED);
        if (((NIL == next_ch)
            || (NIL != Characters.charE(next_ch, Characters.CHAR_return))
            || (NIL != Characters.charE(next_ch, Characters.CHAR_newline)))) {
          return Values.values(NIL, NIL);
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 56817) 
  public static final SubLObject double_quote_rmf(SubLObject stream, SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject state = $kw176$NORMAL;
        if ((NIL != $read_suppress$.getDynamicValue(thread))) {
          for (; true; ) {
            {
              SubLObject next_ch = streams_high.read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              SubLObject pcase_var = state;
              if (pcase_var.eql($kw176$NORMAL)) {
                if ((NIL != Characters.charE(next_ch, ch))) {
                  return Values.values(NIL, T);
                } else if ((NIL != single_escape_syntaxp(next_ch))) {
                  state = $kw177$ESCAPE;
                }
              } else if (pcase_var.eql($kw177$ESCAPE)) {
                state = $kw176$NORMAL;
              }
            }
          }
        } else {
          {
            SubLObject token = make_read_token(UNPROVIDED);
            _csetf_read_token_pointer(token, ZERO_INTEGER);
            _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
            _csetf_read_token_escapes(token, NIL);
            for (; true; ) {
              {
                SubLObject next_ch = streams_high.read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject pcase_var = state;
                if (pcase_var.eql($kw176$NORMAL)) {
                  if ((NIL != Characters.charE(next_ch, ch))) {
                    return Values.values(read_token_string(token), T);
                  } else if ((NIL != single_escape_syntaxp(next_ch))) {
                    state = $kw177$ESCAPE;
                  } else {
                    add_to_token(next_ch, token, NIL);
                  }
                } else if (pcase_var.eql($kw177$ESCAPE)) {
                  add_to_token(next_ch, token, NIL);
                  state = $kw176$NORMAL;
                }
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 57733) 
  public static final SubLObject bq_cons(SubLObject car, SubLObject cdr) {
    return cons(car, cdr);
  }

  @SubL(source = "sublisp/reader.lisp", position = 57913) 
  public static final SubLObject bq_list(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject objects = current;
      return bq_cons($sym178$LIST, ConsesLow.append(objects, NIL));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 57974) 
  public static final SubLObject bq_listX(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject objects = current;
      return bq_cons($sym179$LIST_, ConsesLow.append(objects, NIL));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 58037) 
  public static final SubLObject bq_append(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject lists = current;
      return bq_cons($sym180$APPEND, ConsesLow.append(lists, NIL));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 58098) 
  public static final SubLObject bq_nconc(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject lists = current;
      return bq_cons($sym181$NCONC, ConsesLow.append(lists, NIL));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 58157) 
  public static final SubLObject bq_vector(SubLObject contents) {
    return Functions.apply(Symbols.symbol_function($sym182$VECTOR), contents);
  }

  @SubL(source = "sublisp/reader.lisp", position = 58221) 
  public static final SubLObject bq_vector_append(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      SubLObject lists = current;
      return list($sym183$BQ_VECTOR, bq_cons($sym184$BQ_APPEND, ConsesLow.append(lists, NIL)));
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 58405) 
  private static SubLSymbol $bq_comma$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 59958) 
  private static SubLSymbol $bq_atsign$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 60003) 
  private static SubLSymbol $bq_dot$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 60048) 
  private static SubLSymbol $bq_vector$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 60101) 
  public static final SubLObject backquotify(SubLObject stream, SubLObject code) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (code.isAtom()) {
        if ((NIL == code)) {
          return Values.values(NIL, NIL);
        } else if ((NIL != self_evaluating_atom_p(code))) {
          return Values.values(T, code);
        } else {
          return Values.values($sym175$QUOTE, code);
        }
      } else if (((code.first() == $bq_atsign$.getDynamicValue(thread))
          || (code.first() == $bq_dot$.getDynamicValue(thread)))) {
        return Values.values(code.first(), code.rest());
      } else if ((code.first() == $bq_comma$.getDynamicValue(thread))) {
        thread.resetMultipleValues();
        {
          SubLObject flag = comma(code.rest());
          SubLObject thing = thread.secondMultipleValue();
          thread.resetMultipleValues();
          return Values.values(flag, thing);
        }
      } else if ((code.first() == $bq_vector$.getDynamicValue(thread))) {
        thread.resetMultipleValues();
        {
          SubLObject dflag = backquotify(stream, code.rest());
          SubLObject d = thread.secondMultipleValue();
          thread.resetMultipleValues();
          return Values.values($sym182$VECTOR, backquotify_1(dflag, d));
        }
      } else {
        thread.resetMultipleValues();
        {
          SubLObject aflag = backquotify(stream, code.first());
          SubLObject a = thread.secondMultipleValue();
          thread.resetMultipleValues();
          thread.resetMultipleValues();
          {
            SubLObject dflag = backquotify(stream, code.rest());
            SubLObject d = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (((dflag == $bq_atsign$.getDynamicValue(thread))
                || (dflag == $bq_dot$.getDynamicValue(thread)))) {
              simple_reader_error($str189$_A_after_dot_in__S_, list(dflag, code));
            }
            if ((aflag == $bq_atsign$.getDynamicValue(thread))) {
              return Values.values($sym180$APPEND, ((dflag == $sym180$APPEND) ? ((SubLObject) cons(a, d)) : list(a, backquotify_1(dflag, d))));
            } else if ((aflag == $bq_dot$.getDynamicValue(thread))) {
              return Values.values($sym181$NCONC, ((dflag == $sym181$NCONC) ? ((SubLObject) cons(a, d)) : list(a, backquotify_1(dflag, d))));
            } else if ((NIL == dflag)) {
              if ((NIL != conses_high.member(aflag, $list190, UNPROVIDED, UNPROVIDED))) {
                return Values.values($sym175$QUOTE, list(a));
              } else {
                return Values.values($sym178$LIST, list(backquotify_1(aflag, a)));
              }
            } else if (((dflag == $sym175$QUOTE)
                || (dflag == T))) {
              if ((NIL != conses_high.member(aflag, $list190, UNPROVIDED, UNPROVIDED))) {
                return Values.values($sym175$QUOTE, cons(a, d));
              } else {
                return Values.values($sym179$LIST_, list(backquotify_1(aflag, a), backquotify_1(dflag, d)));
              }
            } else {
              a = backquotify_1(aflag, a);
              if (((dflag == $sym178$LIST)
                  || (dflag == $sym179$LIST_))) {
                return Values.values(dflag, cons(a, d));
              } else {
                return Values.values($sym179$LIST_, list(a, backquotify_1(dflag, d)));
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 62076) 
  public static final SubLObject comma(SubLObject code) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (code.isAtom()) {
        if ((NIL == code)) {
          return Values.values(NIL, NIL);
        } else if ((NIL != self_evaluating_atom_p(code))) {
          return Values.values(T, code);
        } else {
          return Values.values($bq_comma$.getDynamicValue(thread), code);
        }
      } else if ((code.first() == $sym175$QUOTE)) {
        return Values.values(code.first(), conses_high.cadr(code));
      } else if ((NIL != conses_high.member(code.first(), $list191, UNPROVIDED, UNPROVIDED))) {
        return Values.values(code.first(), code.rest());
      } else if ((code.first() == $sym192$CONS)) {
        return Values.values($sym179$LIST_, code.rest());
      } else {
        return Values.values($bq_comma$.getDynamicValue(thread), code);
      }
    }
  }

  /** Return T iff evaluation of OBJECT necessarily returns OBJECT. */
  @SubL(source = "sublisp/reader.lisp", position = 62651) 
  public static final SubLObject self_evaluating_atom_p(SubLObject object) {
    return makeBoolean((object.isAtom()
           && ((NIL == object)
            || (T == object)
            || object.isKeyword()
            || (!(object.isSymbol())))));
  }

  @SubL(source = "sublisp/reader.lisp", position = 62890) 
  public static final SubLObject backquotify_1(SubLObject flag, SubLObject thing) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((flag == $bq_comma$.getDynamicValue(thread))
          || (flag == T)
          || (flag == NIL))) {
        return thing;
      } else if ((flag == $sym175$QUOTE)) {
        return list($sym175$QUOTE, thing);
      } else if ((flag == $sym179$LIST_)) {
        if ((NIL != conses_high.cddr(thing))) {
          return cons($sym193$BQ_LIST_, thing);
        } else {
          return cons($sym194$BQ_CONS, thing);
        }
      } else if ((flag == $sym182$VECTOR)) {
        return list($sym183$BQ_VECTOR, thing);
      } else {
        return cons(conses_high.assoc(flag, $list195, UNPROVIDED, UNPROVIDED).rest(), thing);
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 63498) 
  private static SubLSymbol $backquote_depth$ = null;

  @SubL(source = "sublisp/reader.lisp", position = 63528) 
  public static final SubLObject backquote_rmf(SubLObject stream, SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = $backquote_depth$.currentBinding(thread);
          try {
            $backquote_depth$.bind(Numbers.add($backquote_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            thread.resetMultipleValues();
            {
              SubLObject flag = backquotify(stream, read(stream, T, NIL, T));
              SubLObject thing = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if (((flag == $bq_atsign$.getDynamicValue(thread))
                  || (flag == $bq_dot$.getDynamicValue(thread)))) {
                simple_reader_error($str196$_A_read_after_backquote_in__S_, list(flag, thing));
              }
              result = backquotify_1(flag, thing);
            }
          } finally {
            $backquote_depth$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(result, $sym178$LIST);
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 63954) 
  public static final SubLObject comma_rmf(SubLObject stream, SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ($backquote_depth$.getDynamicValue(thread).isZero()) {
        if ((NIL != $read_suppress$.getDynamicValue(thread))) {
          return Values.values(NIL, T);
        } else {
          simple_reader_error($str197$_S_read_outside_a_backquote_, list(ch));
        }
      } else {
        {
          SubLObject peek_char = streams_high.read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          SubLObject result = NIL;
          {
            SubLObject _prev_bind_0 = $backquote_depth$.currentBinding(thread);
            try {
              $backquote_depth$.bind(Numbers.subtract($backquote_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
              {
                SubLObject pcase_var = peek_char;
                if (pcase_var.eql(Characters.CHAR_at)) {
                  result = cons($bq_atsign$.getDynamicValue(thread), read(stream, T, NIL, T));
                } else if (pcase_var.eql(Characters.CHAR_period)) {
                  result = cons($bq_dot$.getDynamicValue(thread), read(stream, T, NIL, T));
                } else {
                  streams_high.unread_char(peek_char, stream);
                  result = cons($bq_comma$.getDynamicValue(thread), read(stream, T, NIL, T));
                }
              }
            } finally {
              $backquote_depth$.rebind(_prev_bind_0, thread);
            }
          }
          return Values.values(result, $sym178$LIST);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 64590) 
  public static final SubLObject dispatching_rmf(SubLObject stream, SubLObject ch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject arg = NIL;
        SubLObject next_ch = streams_high.read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        for (; (NIL != Characters.digit_char_p(next_ch, TEN_INTEGER)); ) {
          if ((NIL == arg)) {
            arg = ZERO_INTEGER;
          }
          arg = Numbers.add(Numbers.multiply(arg, TEN_INTEGER), Characters.digit_char_p(next_ch, TEN_INTEGER));
          next_ch = streams_high.read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        {
          SubLObject function = get_dispatch_macro_character(ch, next_ch, UNPROVIDED);
          if ((NIL != function)) {
            thread.resetMultipleValues();
            {
              SubLObject value = Functions.funcall(function, stream, next_ch, arg);
              SubLObject goodp = thread.secondMultipleValue();
              thread.resetMultipleValues();
              return Values.values(value, goodp);
            }
          } else if ((NIL != $read_suppress$.getDynamicValue(thread))) {
            return Values.values(NIL, T);
          } else {
            simple_reader_error($str198$Undefined_reader_macro__A_A_, list(ch, next_ch));
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 65249) 
  public static final SubLObject sharpsign_backslash_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != arg)
           && (NIL == $read_suppress$.getDynamicValue(thread)))) {
        unnecessary_argument_error(stream, ch);
      }
      {
        SubLObject token = make_read_token(UNPROVIDED);
        _csetf_read_token_pointer(token, ZERO_INTEGER);
        _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
        _csetf_read_token_escapes(token, NIL);
        add_to_token(streams_high.read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED), token, T);
        read_token(stream, token, NIL);
        if ((NIL != $read_suppress$.getDynamicValue(thread))) {
          return Values.values(NIL, T);
        } else {
          {
            SubLObject name = read_token_string(token);
            SubLObject ch_1 = Characters.name_character(name);
            if ((NIL != ch_1)) {
              return Values.values(ch_1, T);
            } else {
              simple_reader_error($str199$_S_is_not_the_name_of_a_character, list(name));
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 65854) 
  public static final SubLObject sharpsign_single_quote_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != arg)
           && (NIL == $read_suppress$.getDynamicValue(thread)))) {
        unnecessary_argument_error(stream, ch);
      }
      {
        SubLObject subform = read(stream, T, NIL, T);
        if ((NIL != $read_suppress$.getDynamicValue(thread))) {
          return Values.values(NIL, T);
        } else {
          return Values.values(list($sym200$FUNCTION, subform), T);
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 66179) 
  public static final SubLObject sharpsign_left_paren_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject elts = read_delimited_list(Characters.CHAR_rparen, stream, T);
        if ((NIL != $read_suppress$.getDynamicValue(thread))) {
          return Values.values(NIL, T);
        } else {
          {
            SubLObject length = Sequences.length(elts);
            if (((NIL == arg)
                || arg.numE(length))) {
            } else if (length.numL(arg)) {
              elts = ConsesLow.append(elts, ConsesLow.make_list(Numbers.subtract(arg, length), conses_high.last(elts, UNPROVIDED).first()));
            } else {
              illegal_argument_error(stream, ch, arg);
            }
            return Values.values(($backquote_depth$.getDynamicValue(thread).numG(ZERO_INTEGER) ? ((SubLObject) cons($bq_vector$.getDynamicValue(thread), elts)) : Functions.apply(Symbols.symbol_function($sym182$VECTOR), elts)), T);
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 66714) 
  public static final SubLObject sharpsign_asterisk_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $read_suppress$.getDynamicValue(thread))) {
        read(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      } else {
        unimplemented_reader_macro_error(stream, ch);
      }
      return Values.values(NIL, T);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 66898) 
  public static final SubLObject sharpsign_colon_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != arg)
           && (NIL == $read_suppress$.getDynamicValue(thread)))) {
        unnecessary_argument_error(stream, ch);
      }
      {
        SubLObject token = make_read_token(UNPROVIDED);
        _csetf_read_token_pointer(token, ZERO_INTEGER);
        _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
        _csetf_read_token_escapes(token, NIL);
        read_token(stream, token, NIL);
        if ((NIL != $read_suppress$.getDynamicValue(thread))) {
          Values.values(NIL, T);
        } else {
          {
            SubLObject escapes = Sequences.nreverse(read_token_escapes(token));
            _csetf_read_token_escapes(token, escapes);
            if (((NIL == escapes)
                 && (NIL != potential_number_p(read_token_buffer(token), read_token_pointer(token))))) {
              invalid_token_syntax_error(stream, token);
            }
            frob_case(token);
            {
              SubLObject buffer = read_token_buffer(token);
              SubLObject length = read_token_pointer(token);
              SubLObject escapes_2 = read_token_escapes(token);
              SubLObject dot_count = ZERO_INTEGER;
              SubLObject i = NIL;
              for (i = ZERO_INTEGER; i.numL(length); i = Numbers.add(i, ONE_INTEGER)) {
                {
                  SubLObject ch_3 = Strings.sublisp_char(buffer, i);
                  SubLObject escape_idx = escapes_2.first();
                  if (((NIL != escape_idx)
                       && escape_idx.numE(i))) {
                    escapes_2 = escapes_2.rest();
                  } else if ((NIL != package_marker_traitp(ch_3))) {
                    invalid_token_syntax_error(stream, token);
                  } else if ((NIL != dot_traitp(ch_3))) {
                    dot_count = Numbers.add(dot_count, ONE_INTEGER);
                  }
                }
              }
              if (dot_count.numE(length)) {
                invalid_token_syntax_error(stream, token);
              } else {
                return Values.values(Symbols.make_symbol(read_token_string(token)), T);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 68078) 
  public static final SubLObject sharpsign_dot_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != arg)
           && (NIL == $read_suppress$.getDynamicValue(thread)))) {
        unnecessary_argument_error(stream, ch);
      }
      {
        SubLObject subform = read(stream, T, NIL, T);
        if ((NIL != $read_suppress$.getDynamicValue(thread))) {
          return Values.values(NIL, T);
        } else if ((NIL == $read_eval$.getDynamicValue(thread))) {
          simple_reader_error($str201$Attempt_the_use_the__A_reader_mac, list(ch, $sym202$_READ_EVAL_, $read_eval$.getDynamicValue(thread)));
        } else {
          return Values.values(Eval.eval(subform), T);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 68517) 
  public static final SubLObject read_number_in_radix(SubLObject stream, SubLObject radix) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject token = make_read_token(UNPROVIDED);
        _csetf_read_token_pointer(token, ZERO_INTEGER);
        _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
        _csetf_read_token_escapes(token, NIL);
        read_token(stream, token, NIL);
        if ((NIL != $read_suppress$.getDynamicValue(thread))) {
          return NIL;
        } else {
          {
            SubLObject number = NIL;
            {
              SubLObject _prev_bind_0 = $read_base$.currentBinding(thread);
              try {
                $read_base$.bind(radix, thread);
                number = parse_number(stream, token);
              } finally {
                $read_base$.rebind(_prev_bind_0, thread);
              }
            }
            return number;
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 68962) 
  public static final SubLObject sharpsign_b_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != arg)
           && (NIL == $read_suppress$.getDynamicValue(thread)))) {
        unnecessary_argument_error(stream, ch);
      }
      return Values.values(read_number_in_radix(stream, TWO_INTEGER), T);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 69143) 
  public static final SubLObject sharpsign_o_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != arg)
           && (NIL == $read_suppress$.getDynamicValue(thread)))) {
        unnecessary_argument_error(stream, ch);
      }
      return Values.values(read_number_in_radix(stream, EIGHT_INTEGER), T);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 69338) 
  public static final SubLObject sharpsign_x_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != arg)
           && (NIL == $read_suppress$.getDynamicValue(thread)))) {
        unnecessary_argument_error(stream, ch);
      }
      return Values.values(read_number_in_radix(stream, SIXTEEN_INTEGER), T);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 69534) 
  public static final SubLObject sharpsign_r_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    if ((!(((NIL != arg)
           && arg.numGE(TWO_INTEGER)
           && arg.numLE($int203$36))))) {
      illegal_argument_error(stream, ch, arg);
    }
    return Values.values(read_number_in_radix(stream, arg), T);
  }

  @SubL(source = "sublisp/reader.lisp", position = 69718) 
  public static final SubLObject sharpsign_c_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $read_suppress$.getDynamicValue(thread))) {
        read(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      } else {
        unimplemented_reader_macro_error(stream, ch);
      }
      return Values.values(NIL, T);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 69895) 
  public static final SubLObject sharpsign_a_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!((arg.eql(ONE_INTEGER)
            || (NIL != $read_suppress$.getDynamicValue(thread)))))) {
        unimplemented_reader_macro_error(stream, ch);
      }
      {
        SubLObject contents = NIL;
        {
          SubLObject _prev_bind_0 = $reading_fake_list$.currentBinding(thread);
          try {
            $reading_fake_list$.bind(T, thread);
            contents = read(stream, T, NIL, T);
          } finally {
            $reading_fake_list$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL != $read_suppress$.getDynamicValue(thread))) {
          return Values.values(NIL, T);
        } else if ((!(contents.isList()))) {
          simple_reader_error($str204$The_form_after__A_reader_macro_wa, list(ch));
        } else {
          return Values.values(Functions.apply(Symbols.symbol_function($sym182$VECTOR), contents), T);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 70402) 
  public static final SubLObject sharpsign_s_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $read_suppress$.getDynamicValue(thread))) {
        read(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      } else {
        unimplemented_reader_macro_error(stream, ch);
      }
      return Values.values(NIL, T);
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 70594) 
  public static final SubLObject sharpsign_p_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != arg)
           && (NIL == $read_suppress$.getDynamicValue(thread)))) {
        unnecessary_argument_error(stream, ch);
      }
      {
        SubLObject subform = read(stream, T, NIL, T);
        if ((NIL != $read_suppress$.getDynamicValue(thread))) {
          return Values.values(NIL, T);
        } else {
          return Values.values(subform, T);
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 70870) 
  public static final SubLObject read_lookup(SubLObject number) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $read_lookup_table$.getDynamicValue(thread))) {
        thread.resetMultipleValues();
        {
          SubLObject value = Hashtables.gethash(number, $read_lookup_table$.getDynamicValue(thread), UNPROVIDED);
          SubLObject valuep = thread.secondMultipleValue();
          thread.resetMultipleValues();
          return Values.values(value, valuep);
        }
      } else {
        return Values.values(NIL, NIL);
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 71119) 
  public static final SubLObject set_read_lookup(SubLObject number, SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $read_lookup_table$.getDynamicValue(thread))) {
        $read_lookup_table$.setDynamicValue(Hashtables.make_hash_table($int4$32, UNPROVIDED, UNPROVIDED), thread);
      }
      Hashtables.sethash(number, $read_lookup_table$.getDynamicValue(thread), object);
      return object;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 71308) 
  public static final SubLObject sharpsign_equals_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != arg)
            || (NIL != $read_suppress$.getDynamicValue(thread)))))) {
        illegal_argument_error(stream, ch, arg);
      }
      if ((NIL != $read_suppress$.getDynamicValue(thread))) {
        return Values.values(NIL, T);
      } else {
        {
          SubLObject subform = read(stream, T, NIL, T);
          thread.resetMultipleValues();
          {
            SubLObject old = read_lookup(arg);
            SubLObject oldp = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != oldp)) {
              simple_reader_error($str205$Label__S_appears_more_than_once_, list(arg));
            } else {
              set_read_lookup(arg, subform);
            }
            return Values.values(subform, T);
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 72022) 
  public static final SubLObject sharpsign_sharpsign_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != arg)
            || (NIL != $read_suppress$.getDynamicValue(thread)))))) {
        illegal_argument_error(stream, ch, arg);
      }
      if ((NIL != $read_suppress$.getDynamicValue(thread))) {
        return Values.values(NIL, T);
      } else {
        thread.resetMultipleValues();
        {
          SubLObject old = read_lookup(arg);
          SubLObject oldp = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != oldp)) {
            return Values.values(old, T);
          } else {
            simple_reader_error($str206$Label__S_has_not_been_seen_, list(arg));
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 72396) 
  public static final SubLObject features_match(SubLObject feature) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (feature.isCons()) {
        {
          SubLObject pcase_var = feature.first();
          if (pcase_var.eql($kw207$NOT)) {
            if ((NIL != conses_high.cddr(feature))) {
              simple_reader_error($str208$Bogus_feature_expression__S_, list(feature));
            }
            return makeBoolean((NIL == features_match(conses_high.cadr(feature))));
          } else if (pcase_var.eql($kw209$AND)) {
            {
              SubLObject cdolist_list_var = feature.rest();
              SubLObject subfeature = NIL;
              for (subfeature = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subfeature = cdolist_list_var.first()) {
                if ((NIL == features_match(subfeature))) {
                  return NIL;
                }
              }
            }
            return T;
          } else if (pcase_var.eql($kw210$OR)) {
            {
              SubLObject cdolist_list_var = feature.rest();
              SubLObject subfeature = NIL;
              for (subfeature = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subfeature = cdolist_list_var.first()) {
                if ((NIL != features_match(subfeature))) {
                  return T;
                }
              }
            }
            return NIL;
          } else {
            simple_reader_error($str211$Unknown_feature_operator__S_, list(feature.first()));
          }
        }
      } else {
        return conses_high.member(feature, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 73044) 
  public static final SubLObject fix_features(SubLObject features) {
    if ((NIL == features)) {
      return features;
    } else if (features.isSymbol()) {
      return Symbols.make_keyword(features);
    } else if (features.isCons()) {
      return cons(fix_features(features.first()), fix_features(features.rest()));
    } else {
      return features;
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 73319) 
  public static final SubLObject read_features(SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject features = NIL;
        {
          SubLObject _prev_bind_0 = $reading_fake_list$.currentBinding(thread);
          try {
            $reading_fake_list$.bind(T, thread);
            features = read(stream, T, NIL, T);
          } finally {
            $reading_fake_list$.rebind(_prev_bind_0, thread);
          }
        }
        return features_match(fix_features(features));
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 73609) 
  public static final SubLObject sharpsign_plus_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != arg)
           && (NIL == $read_suppress$.getDynamicValue(thread)))) {
        unnecessary_argument_error(stream, ch);
      }
      if ((NIL != read_features(stream))) {
        return Values.values(read(stream, T, NIL, T), T);
      } else {
        {
          SubLObject _prev_bind_0 = $read_suppress$.currentBinding(thread);
          try {
            $read_suppress$.bind(T, thread);
            read(stream, T, NIL, T);
          } finally {
            $read_suppress$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(NIL, NIL);
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 73936) 
  public static final SubLObject sharpsign_minus_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != arg)
           && (NIL == $read_suppress$.getDynamicValue(thread)))) {
        unnecessary_argument_error(stream, ch);
      }
      if ((NIL != read_features(stream))) {
        {
          SubLObject _prev_bind_0 = $read_suppress$.currentBinding(thread);
          try {
            $read_suppress$.bind(T, thread);
            read(stream, T, NIL, T);
          } finally {
            $read_suppress$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(NIL, NIL);
      } else {
        return Values.values(read(stream, T, NIL, T), T);
      }
    }
  }

  @SubL(source = "sublisp/reader.lisp", position = 74264) 
  public static final SubLObject sharpsign_vertical_bar_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != arg)
           && (NIL == $read_suppress$.getDynamicValue(thread)))) {
        unnecessary_argument_error(stream, ch);
      }
      {
        SubLObject depth = ONE_INTEGER;
        SubLObject state = $kw145$INITIAL;
        SubLObject ch_4 = NIL;
        for (ch_4 = streams_high.read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED); true; ch_4 = streams_high.read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
          {
            SubLObject pcase_var = state;
            if (pcase_var.eql($kw212$HASH)) {
              {
                SubLObject pcase_var_5 = ch_4;
                if (pcase_var_5.eql(Characters.CHAR_vertical)) {
                  depth = Numbers.add(depth, ONE_INTEGER);
                  state = $kw145$INITIAL;
                } else if (pcase_var_5.eql(Characters.CHAR_hash)) {
                } else {
                  state = $kw145$INITIAL;
                }
              }
            } else if (pcase_var.eql($kw213$VERTICAL_BAR)) {
              {
                SubLObject pcase_var_6 = ch_4;
                if (pcase_var_6.eql(Characters.CHAR_vertical)) {
                } else if (pcase_var_6.eql(Characters.CHAR_hash)) {
                  depth = Numbers.subtract(depth, ONE_INTEGER);
                  if (depth.isZero()) {
                    return Values.values(NIL, NIL);
                  }
                } else {
                  state = $kw145$INITIAL;
                }
              }
            } else if (pcase_var.eql($kw145$INITIAL)) {
              {
                SubLObject pcase_var_7 = ch_4;
                if (pcase_var_7.eql(Characters.CHAR_vertical)) {
                  state = $kw213$VERTICAL_BAR;
                } else if (pcase_var_7.eql(Characters.CHAR_hash)) {
                  state = $kw212$HASH;
                }
              }
            }
          }
        }
      }
    }
  }

  public static final SubLObject declare_reader_file() {
    declareMacro("loop", "LOOP");
    declareFunction("whitespace_1_char_p", "WHITESPACE-1-CHAR-P", 1, 0, false);
    declareFunction("whitespace_2_char_p", "WHITESPACE-2-CHAR-P", 1, 0, false);
    declareFunction("readtable_print_function_trampoline", "READTABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction("readtable_p", "READTABLE-P", 1, 0, false); new $readtable_p$UnaryFunction();
    declareFunction("readtable_case", "READTABLE-CASE", 1, 0, false);
    declareFunction("readtable_character_syntax", "READTABLE-CHARACTER-SYNTAX", 1, 0, false);
    declareFunction("readtable_single_byte_char_syntax", "READTABLE-SINGLE-BYTE-CHAR-SYNTAX", 1, 0, false);
    declareFunction("readtable_macro_functions", "READTABLE-MACRO-FUNCTIONS", 1, 0, false);
    declareFunction("readtable_single_byte_macro_functions", "READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", 1, 0, false);
    declareFunction("readtable_constituent_traits", "READTABLE-CONSTITUENT-TRAITS", 1, 0, false);
    declareFunction("readtable_single_byte_constit_traits", "READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", 1, 0, false);
    declareFunction("readtable_dispatch_tables", "READTABLE-DISPATCH-TABLES", 1, 0, false);
    declareFunction("_csetf_readtable_case", "_CSETF-READTABLE-CASE", 2, 0, false);
    declareFunction("_csetf_readtable_character_syntax", "_CSETF-READTABLE-CHARACTER-SYNTAX", 2, 0, false);
    declareFunction("_csetf_readtable_single_byte_char_syntax", "_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX", 2, 0, false);
    declareFunction("_csetf_readtable_macro_functions", "_CSETF-READTABLE-MACRO-FUNCTIONS", 2, 0, false);
    declareFunction("_csetf_readtable_single_byte_macro_functions", "_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", 2, 0, false);
    declareFunction("_csetf_readtable_constituent_traits", "_CSETF-READTABLE-CONSTITUENT-TRAITS", 2, 0, false);
    declareFunction("_csetf_readtable_single_byte_constit_traits", "_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", 2, 0, false);
    declareFunction("_csetf_readtable_dispatch_tables", "_CSETF-READTABLE-DISPATCH-TABLES", 2, 0, false);
    declareFunction("make_readtable", "MAKE-READTABLE", 0, 1, false);
    declareFunction("create_readtable", "CREATE-READTABLE", 0, 0, false);
    declareFunction("single_byte_p", "SINGLE-BYTE-P", 1, 0, false);
    declareMacro("character_syntax", "CHARACTER-SYNTAX");
    declareFunction("set_character_syntax", "SET-CHARACTER-SYNTAX", 2, 1, false);
    declareFunction("invalid_syntaxp", "INVALID-SYNTAXP", 1, 0, false);
    declareFunction("terminating_macro_syntaxp", "TERMINATING-MACRO-SYNTAXP", 1, 0, false);
    declareFunction("non_terminating_macro_syntaxp", "NON-TERMINATING-MACRO-SYNTAXP", 1, 0, false);
    declareFunction("multiple_escape_syntaxp", "MULTIPLE-ESCAPE-SYNTAXP", 1, 0, false);
    declareFunction("single_escape_syntaxp", "SINGLE-ESCAPE-SYNTAXP", 1, 0, false);
    declareFunction("whitespace_syntaxp", "WHITESPACE-SYNTAXP", 1, 0, false);
    declareFunction("constituent_syntaxp", "CONSTITUENT-SYNTAXP", 1, 0, false);
    declareFunction("character_function", "CHARACTER-FUNCTION", 1, 1, false);
    declareFunction("set_character_function", "SET-CHARACTER-FUNCTION", 2, 1, false);
    declareFunction("character_traits", "CHARACTER-TRAITS", 1, 1, false);
    declareMacro("has_traitp", "HAS-TRAITP");
    declareFunction("set_trait", "SET-TRAIT", 3, 0, false);
    declareFunction("reset_trait", "RESET-TRAIT", 1, 1, false);
    declareFunction("alphabetic_traitp", "ALPHABETIC-TRAITP", 1, 0, false);
    declareFunction("digit_traitp", "DIGIT-TRAITP", 1, 0, false);
    declareFunction("package_marker_traitp", "PACKAGE-MARKER-TRAITP", 1, 0, false);
    declareFunction("plus_sign_traitp", "PLUS-SIGN-TRAITP", 1, 0, false);
    declareFunction("minus_sign_traitp", "MINUS-SIGN-TRAITP", 1, 0, false);
    declareFunction("dot_traitp", "DOT-TRAITP", 1, 0, false);
    declareFunction("decimal_point_traitp", "DECIMAL-POINT-TRAITP", 1, 0, false);
    declareFunction("ratio_marker_traitp", "RATIO-MARKER-TRAITP", 1, 0, false);
    declareFunction("exponent_marker_traitp", "EXPONENT-MARKER-TRAITP", 1, 0, false);
    declareFunction("invalid_traitp", "INVALID-TRAITP", 1, 0, false);
    declareFunction("alphadigit_traitp", "ALPHADIGIT-TRAITP", 1, 0, false);
    declareFunction("Xcopy_hash_table", "%COPY-HASH-TABLE", 2, 0, false);
    declareFunction("copy_readtable", "COPY-READTABLE", 0, 2, false);
    declareFunction("make_dispatch_macro_character", "MAKE-DISPATCH-MACRO-CHARACTER", 1, 2, false);
    declareFunction("readtablep", "READTABLEP", 1, 0, false);
    declareFunction("set_dispatch_macro_character", "SET-DISPATCH-MACRO-CHARACTER", 3, 1, false);
    declareFunction("get_dispatch_macro_character", "GET-DISPATCH-MACRO-CHARACTER", 2, 1, false);
    declareFunction("get_macro_character", "GET-MACRO-CHARACTER", 1, 1, false);
    declareFunction("set_macro_character", "SET-MACRO-CHARACTER", 2, 2, false);
    declareFunction("set_syntax_from_char", "SET-SYNTAX-FROM-CHAR", 2, 2, false);
    declareFunction("set_syntax", "SET-SYNTAX", 3, 0, false);
    declareFunction("simple_reader_error", "SIMPLE-READER-ERROR", 2, 0, false);
    declareFunction("end_of_file_error", "END-OF-FILE-ERROR", 1, 0, false);
    declareFunction("invalid_token_syntax_error", "INVALID-TOKEN-SYNTAX-ERROR", 2, 0, false);
    declareFunction("unimplemented_reader_macro_error", "UNIMPLEMENTED-READER-MACRO-ERROR", 2, 0, false);
    declareFunction("unnecessary_argument_error", "UNNECESSARY-ARGUMENT-ERROR", 2, 0, false);
    declareFunction("illegal_argument_error", "ILLEGAL-ARGUMENT-ERROR", 3, 0, false);
    declareFunction("read_internal", "READ-INTERNAL", 1, 2, false);
    declareFunction("read_preserving_whitespace", "READ-PRESERVING-WHITESPACE", 0, 4, false);
    declareFunction("read", "READ", 0, 4, false);
    declareFunction("read_delimited_list", "READ-DELIMITED-LIST", 1, 2, false);
    declareFunction("read_from_string", "READ-FROM-STRING", 1, 5, false);
    declareMacro("with_standard_io_syntax", "WITH-STANDARD-IO-SYNTAX");
    declareMacro("with_special_reader_error_handling", "WITH-SPECIAL-READER-ERROR-HANDLING");
    declareFunction("read_ignoring_errors", "READ-IGNORING-ERRORS", 0, 3, false);
    declareFunction("read_from_string_ignoring_errors", "READ-FROM-STRING-IGNORING-ERRORS", 1, 4, false);
    declareFunction("read_token_print_function_trampoline", "READ-TOKEN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction("read_token_p", "READ-TOKEN-P", 1, 0, false); new $read_token_p$UnaryFunction();
    declareFunction("read_token_pointer", "READ-TOKEN-POINTER", 1, 0, false);
    declareFunction("read_token_buffer", "READ-TOKEN-BUFFER", 1, 0, false);
    declareFunction("read_token_escapes", "READ-TOKEN-ESCAPES", 1, 0, false);
    declareFunction("_csetf_read_token_pointer", "_CSETF-READ-TOKEN-POINTER", 2, 0, false);
    declareFunction("_csetf_read_token_buffer", "_CSETF-READ-TOKEN-BUFFER", 2, 0, false);
    declareFunction("_csetf_read_token_escapes", "_CSETF-READ-TOKEN-ESCAPES", 2, 0, false);
    declareFunction("make_read_token", "MAKE-READ-TOKEN", 0, 1, false);
    declareMacro("with_read_token", "WITH-READ-TOKEN");
    declareFunction("add_to_token", "ADD-TO-TOKEN", 3, 0, false);
    declareFunction("read_token_string", "READ-TOKEN-STRING", 1, 0, false);
    declareFunction("read_token", "READ-TOKEN", 3, 0, false);
    declareFunction("potential_number_p", "POTENTIAL-NUMBER-P", 2, 0, false);
    declareFunction("parse_token", "PARSE-TOKEN", 2, 0, false);
    declareFunction("symbol_escapep", "SYMBOL-ESCAPEP", 1, 0, false);
    declareFunction("reader_find_package", "READER-FIND-PACKAGE", 3, 0, false);
    declareFunction("frob_case", "FROB-CASE", 1, 0, false);
    declareFunction("parse_symbol_or_consing_dot", "PARSE-SYMBOL-OR-CONSING-DOT", 2, 0, false);
    declareFunction("float_parse_integer", "FLOAT-PARSE-INTEGER", 4, 0, false);
    declareFunction("parse_number", "PARSE-NUMBER", 2, 0, false);
    declareFunction("parse_integer", "PARSE-INTEGER", 1, 4, false);
    declareFunction("whitespace_rmf", "WHITESPACE-RMF", 2, 0, false);
    declareFunction("constituent_rmf", "CONSTITUENT-RMF", 2, 0, false);
    declareFunction("invalid_rmf", "INVALID-RMF", 2, 0, false);
    declareFunction("single_escape_rmf", "SINGLE-ESCAPE-RMF", 2, 0, false);
    declareFunction("multiple_escape_rmf", "MULTIPLE-ESCAPE-RMF", 2, 0, false);
    declareFunction("sharpsign_capital_g_rmf", "SHARPSIGN-CAPITAL-G-RMF", 3, 0, false);
    declareFunction("left_paren_rmf", "LEFT-PAREN-RMF", 2, 0, false);
    declareFunction("right_paren_rmf", "RIGHT-PAREN-RMF", 2, 0, false);
    declareFunction("single_quote_rmf", "SINGLE-QUOTE-RMF", 2, 0, false);
    declareFunction("semicolon_rmf", "SEMICOLON-RMF", 2, 0, false);
    declareFunction("double_quote_rmf", "DOUBLE-QUOTE-RMF", 2, 0, false);
    declareFunction("bq_cons", "BQ-CONS", 2, 0, false);
    declareMacro("bq_list", "BQ-LIST");
    declareMacro("bq_listX", "BQ-LIST*");
    declareMacro("bq_append", "BQ-APPEND");
    declareMacro("bq_nconc", "BQ-NCONC");
    declareFunction("bq_vector", "BQ-VECTOR", 1, 0, false);
    declareMacro("bq_vector_append", "BQ-VECTOR-APPEND");
    declareFunction("backquotify", "BACKQUOTIFY", 2, 0, false);
    declareFunction("comma", "COMMA", 1, 0, false);
    declareFunction("self_evaluating_atom_p", "SELF-EVALUATING-ATOM-P", 1, 0, false);
    declareFunction("backquotify_1", "BACKQUOTIFY-1", 2, 0, false);
    declareFunction("backquote_rmf", "BACKQUOTE-RMF", 2, 0, false);
    declareFunction("comma_rmf", "COMMA-RMF", 2, 0, false);
    declareFunction("dispatching_rmf", "DISPATCHING-RMF", 2, 0, false);
    declareFunction("sharpsign_backslash_rmf", "SHARPSIGN-BACKSLASH-RMF", 3, 0, false);
    declareFunction("sharpsign_single_quote_rmf", "SHARPSIGN-SINGLE-QUOTE-RMF", 3, 0, false);
    declareFunction("sharpsign_left_paren_rmf", "SHARPSIGN-LEFT-PAREN-RMF", 3, 0, false);
    declareFunction("sharpsign_asterisk_rmf", "SHARPSIGN-ASTERISK-RMF", 3, 0, false);
    declareFunction("sharpsign_colon_rmf", "SHARPSIGN-COLON-RMF", 3, 0, false);
    declareFunction("sharpsign_dot_rmf", "SHARPSIGN-DOT-RMF", 3, 0, false);
    declareFunction("read_number_in_radix", "READ-NUMBER-IN-RADIX", 2, 0, false);
    declareFunction("sharpsign_b_rmf", "SHARPSIGN-B-RMF", 3, 0, false);
    declareFunction("sharpsign_o_rmf", "SHARPSIGN-O-RMF", 3, 0, false);
    declareFunction("sharpsign_x_rmf", "SHARPSIGN-X-RMF", 3, 0, false);
    declareFunction("sharpsign_r_rmf", "SHARPSIGN-R-RMF", 3, 0, false);
    declareFunction("sharpsign_c_rmf", "SHARPSIGN-C-RMF", 3, 0, false);
    declareFunction("sharpsign_a_rmf", "SHARPSIGN-A-RMF", 3, 0, false);
    declareFunction("sharpsign_s_rmf", "SHARPSIGN-S-RMF", 3, 0, false);
    declareFunction("sharpsign_p_rmf", "SHARPSIGN-P-RMF", 3, 0, false);
    declareFunction("read_lookup", "READ-LOOKUP", 1, 0, false);
    declareFunction("set_read_lookup", "SET-READ-LOOKUP", 2, 0, false);
    declareFunction("sharpsign_equals_rmf", "SHARPSIGN-EQUALS-RMF", 3, 0, false);
    declareFunction("sharpsign_sharpsign_rmf", "SHARPSIGN-SHARPSIGN-RMF", 3, 0, false);
    declareFunction("features_match", "FEATURES-MATCH", 1, 0, false);
    declareFunction("fix_features", "FIX-FEATURES", 1, 0, false);
    declareFunction("read_features", "READ-FEATURES", 1, 0, false);
    declareFunction("sharpsign_plus_rmf", "SHARPSIGN-PLUS-RMF", 3, 0, false);
    declareFunction("sharpsign_minus_rmf", "SHARPSIGN-MINUS-RMF", 3, 0, false);
    declareFunction("sharpsign_vertical_bar_rmf", "SHARPSIGN-VERTICAL-BAR-RMF", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_reader_file() {
    $whitespace_1_chars$ = defvar("*WHITESPACE-1-CHARS*", list(Characters.CHAR_space, Characters.code_char(TEN_INTEGER), Characters.code_char(THIRTEEN_INTEGER), Characters.CHAR_tab, Characters.CHAR_page, Characters.CHAR_rubout));
    $read_base$ = defvar("*READ-BASE*", TEN_INTEGER);
    $read_default_float_format$ = defvar("*READ-DEFAULT-FLOAT-FORMAT*", $sym2$DOUBLE_FLOAT);
    $read_eval$ = defvar("*READ-EVAL*", T);
    $read_suppress$ = defvar("*READ-SUPPRESS*", NIL);
    $features$ = defvar("*FEATURES*", $list3);
    $readtable$ = defvar("*READTABLE*", NIL);
    $initial_table_size$ = defparameter("*INITIAL-TABLE-SIZE*", $int4$32);
    $single_byte_max_code$ = defconstant("*SINGLE-BYTE-MAX-CODE*", $int5$128);
    $dtp_readtable$ = defconstant("*DTP-READTABLE*", $sym6$READTABLE);
    $alphabetic$ = defconstant("*ALPHABETIC*", ONE_INTEGER);
    $digit$ = defconstant("*DIGIT*", TWO_INTEGER);
    $package_marker$ = defconstant("*PACKAGE-MARKER*", FOUR_INTEGER);
    $plus_sign$ = defconstant("*PLUS-SIGN*", EIGHT_INTEGER);
    $minus_sign$ = defconstant("*MINUS-SIGN*", SIXTEEN_INTEGER);
    $dot$ = defconstant("*DOT*", $int4$32);
    $decimal_point$ = defconstant("*DECIMAL-POINT*", $int39$64);
    $ratio_marker$ = defconstant("*RATIO-MARKER*", $int5$128);
    $exponent_marker$ = defconstant("*EXPONENT-MARKER*", $int40$256);
    $invalid$ = defconstant("*INVALID*", $int41$512);
    $standard_readtable$ = defvar("*STANDARD-READTABLE*", NIL);
    $throw_reader_error_p$ = defvar("*THROW-READER-ERROR-P*", NIL);
    $throw_end_of_file_p$ = defvar("*THROW-END-OF-FILE-P*", NIL);
    $read_lookup_table$ = defvar("*READ-LOOKUP-TABLE*", NIL);
    $initial_token_size$ = defconstant("*INITIAL-TOKEN-SIZE*", $int4$32);
    $dtp_read_token$ = defconstant("*DTP-READ-TOKEN*", $sym113$READ_TOKEN);
    $consing_dot$ = defparameter("*CONSING-DOT*", $sym140$CONSING_DOT);
    $keyword_package$ = deflexical("*KEYWORD-PACKAGE*", Packages.find_package($str141$KEYWORD));
    $reading_list$ = defvar("*READING-LIST*", NIL);
    $reading_fake_list$ = defvar("*READING-FAKE-LIST*", NIL);
    $right_paren$ = defparameter("*RIGHT-PAREN*", $sym165$RIGHT_PAREN);
    $ignore_extra_right_parens$ = defparameter("*IGNORE-EXTRA-RIGHT-PARENS*", NIL);
    $bq_comma$ = defparameter("*BQ-COMMA*", Symbols.make_symbol($str185$_));
    $bq_atsign$ = defparameter("*BQ-ATSIGN*", Symbols.make_symbol($str186$_));
    $bq_dot$ = defparameter("*BQ-DOT*", Symbols.make_symbol($str187$_));
    $bq_vector$ = defparameter("*BQ-VECTOR*", Symbols.make_symbol($str188$BQ_VECTOR));
    $backquote_depth$ = defvar("*BACKQUOTE-DEPTH*", ZERO_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_reader_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_readtable$.getGlobalValue(), Symbols.symbol_function($sym13$READTABLE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym14$READTABLE_CASE, $sym15$_CSETF_READTABLE_CASE);
    Structures.def_csetf($sym16$READTABLE_CHARACTER_SYNTAX, $sym17$_CSETF_READTABLE_CHARACTER_SYNTAX);
    Structures.def_csetf($sym18$READTABLE_SINGLE_BYTE_CHAR_SYNTAX, $sym19$_CSETF_READTABLE_SINGLE_BYTE_CHAR_SYNTAX);
    Structures.def_csetf($sym20$READTABLE_MACRO_FUNCTIONS, $sym21$_CSETF_READTABLE_MACRO_FUNCTIONS);
    Structures.def_csetf($sym22$READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS, $sym23$_CSETF_READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS);
    Structures.def_csetf($sym24$READTABLE_CONSTITUENT_TRAITS, $sym25$_CSETF_READTABLE_CONSTITUENT_TRAITS);
    Structures.def_csetf($sym26$READTABLE_SINGLE_BYTE_CONSTIT_TRAITS, $sym27$_CSETF_READTABLE_SINGLE_BYTE_CONSTIT_TRAITS);
    Structures.def_csetf($sym28$READTABLE_DISPATCH_TABLES, $sym29$_CSETF_READTABLE_DISPATCH_TABLES);
    Equality.identity($sym6$READTABLE);
    $standard_readtable$.setDynamicValue(create_readtable());
    {
      SubLObject cdolist_list_var = $whitespace_1_chars$.getDynamicValue();
      SubLObject v_char = NIL;
      for (v_char = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_char = cdolist_list_var.first()) {
        set_syntax(v_char, $kw58$WHITESPACE, $sym68$WHITESPACE_RMF);
      }
    }
    set_syntax(Characters.CHAR_backslash, $kw57$SINGLE_ESCAPE, $sym69$SINGLE_ESCAPE_RMF);
    set_syntax(Characters.CHAR_vertical, $kw56$MULTIPLE_ESCAPE, $sym70$MULTIPLE_ESCAPE_RMF);
    set_macro_character(Characters.CHAR_lparen, $sym71$LEFT_PAREN_RMF, NIL, $standard_readtable$.getDynamicValue());
    set_macro_character(Characters.CHAR_rparen, $sym72$RIGHT_PAREN_RMF, NIL, $standard_readtable$.getDynamicValue());
    set_macro_character(Characters.CHAR_quote, $sym73$SINGLE_QUOTE_RMF, NIL, $standard_readtable$.getDynamicValue());
    set_macro_character(Characters.CHAR_semicolon, $sym74$SEMICOLON_RMF, NIL, $standard_readtable$.getDynamicValue());
    set_macro_character(Characters.CHAR_quotation, $sym75$DOUBLE_QUOTE_RMF, NIL, $standard_readtable$.getDynamicValue());
    set_macro_character(Characters.CHAR_backquote, $sym76$BACKQUOTE_RMF, NIL, $standard_readtable$.getDynamicValue());
    set_macro_character(Characters.CHAR_comma, $sym77$COMMA_RMF, NIL, $standard_readtable$.getDynamicValue());
    make_dispatch_macro_character(Characters.CHAR_hash, T, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_backslash, $sym78$SHARPSIGN_BACKSLASH_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_quote, $sym79$SHARPSIGN_SINGLE_QUOTE_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_lparen, $sym80$SHARPSIGN_LEFT_PAREN_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_asterisk, $sym81$SHARPSIGN_ASTERISK_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_colon, $sym82$SHARPSIGN_COLON_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_period, $sym83$SHARPSIGN_DOT_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_B, $sym84$SHARPSIGN_B_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_O, $sym85$SHARPSIGN_O_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_X, $sym86$SHARPSIGN_X_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_R, $sym87$SHARPSIGN_R_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_C, $sym88$SHARPSIGN_C_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_A, $sym89$SHARPSIGN_A_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_S, $sym90$SHARPSIGN_S_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_P, $sym91$SHARPSIGN_P_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_G, $sym92$SHARPSIGN_CAPITAL_G_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_equal, $sym93$SHARPSIGN_EQUALS_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_hash, $sym94$SHARPSIGN_SHARPSIGN_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_plus, $sym95$SHARPSIGN_PLUS_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_hyphen, $sym96$SHARPSIGN_MINUS_RMF, $standard_readtable$.getDynamicValue());
    set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_vertical, $sym97$SHARPSIGN_VERTICAL_BAR_RMF, $standard_readtable$.getDynamicValue());
    {
      SubLObject invalid = $list98;
      SubLObject cdolist_list_var = invalid;
      SubLObject ch = NIL;
      for (ch = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ch = cdolist_list_var.first()) {
        set_trait(ch, $standard_readtable$.getDynamicValue(), $invalid$.getGlobalValue());
      }
    }
    {
      SubLObject alphadigit = $list99;
      SubLObject cdolist_list_var = alphadigit;
      SubLObject ch = NIL;
      for (ch = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ch = cdolist_list_var.first()) {
        set_trait(ch, $standard_readtable$.getDynamicValue(), $alphabetic$.getGlobalValue());
        set_trait(ch, $standard_readtable$.getDynamicValue(), $digit$.getGlobalValue());
      }
    }
    set_trait(Characters.CHAR_colon, $standard_readtable$.getDynamicValue(), $package_marker$.getGlobalValue());
    set_trait(Characters.CHAR_plus, $standard_readtable$.getDynamicValue(), $alphabetic$.getGlobalValue());
    set_trait(Characters.CHAR_plus, $standard_readtable$.getDynamicValue(), $plus_sign$.getGlobalValue());
    set_trait(Characters.CHAR_hyphen, $standard_readtable$.getDynamicValue(), $alphabetic$.getGlobalValue());
    set_trait(Characters.CHAR_hyphen, $standard_readtable$.getDynamicValue(), $minus_sign$.getGlobalValue());
    set_trait(Characters.CHAR_period, $standard_readtable$.getDynamicValue(), $alphabetic$.getGlobalValue());
    set_trait(Characters.CHAR_period, $standard_readtable$.getDynamicValue(), $dot$.getGlobalValue());
    set_trait(Characters.CHAR_period, $standard_readtable$.getDynamicValue(), $decimal_point$.getGlobalValue());
    set_trait(Characters.CHAR_slash, $standard_readtable$.getDynamicValue(), $alphabetic$.getGlobalValue());
    set_trait(Characters.CHAR_slash, $standard_readtable$.getDynamicValue(), $ratio_marker$.getGlobalValue());
    set_trait(Characters.CHAR_D, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
    set_trait(Characters.CHAR_d, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
    set_trait(Characters.CHAR_E, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
    set_trait(Characters.CHAR_e, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
    set_trait(Characters.CHAR_F, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
    set_trait(Characters.CHAR_f, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
    set_trait(Characters.CHAR_L, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
    set_trait(Characters.CHAR_l, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
    set_trait(Characters.CHAR_S, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
    set_trait(Characters.CHAR_s, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
    if ((!(((NIL != Symbols.boundp($sym46$_READTABLE_))
           && (NIL != $readtable$.getDynamicValue()))))) {
      $readtable$.setDynamicValue(copy_readtable($standard_readtable$.getDynamicValue(), UNPROVIDED));
    }
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_read_token$.getGlobalValue(), Symbols.symbol_function($sym119$READ_TOKEN_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym120$READ_TOKEN_POINTER, $sym121$_CSETF_READ_TOKEN_POINTER);
    Structures.def_csetf($sym122$READ_TOKEN_BUFFER, $sym123$_CSETF_READ_TOKEN_BUFFER);
    Structures.def_csetf($sym124$READ_TOKEN_ESCAPES, $sym125$_CSETF_READ_TOKEN_ESCAPES);
    Equality.identity($sym113$READ_TOKEN);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CDO = makeSymbol("CDO");
  public static final SubLList $list1 = list(NIL);
  public static final SubLSymbol $sym2$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLList $list3 = list(makeKeyword("SL2JAVA"));
  public static final SubLInteger $int4$32 = makeInteger(32);
  public static final SubLInteger $int5$128 = makeInteger(128);
  public static final SubLSymbol $sym6$READTABLE = makeSymbol("READTABLE");
  public static final SubLSymbol $sym7$READTABLE_P = makeSymbol("READTABLE-P");
  public static final SubLList $list8 = list(makeSymbol("CASE"), makeSymbol("CHARACTER-SYNTAX"), makeSymbol("SINGLE-BYTE-CHAR-SYNTAX"), makeSymbol("MACRO-FUNCTIONS"), makeSymbol("SINGLE-BYTE-MACRO-FUNCTIONS"), makeSymbol("CONSTITUENT-TRAITS"), makeSymbol("SINGLE-BYTE-CONSTIT-TRAITS"), makeSymbol("DISPATCH-TABLES"));
  public static final SubLList $list9 = list(makeKeyword("CASE"), makeKeyword("CHARACTER-SYNTAX"), makeKeyword("SINGLE-BYTE-CHAR-SYNTAX"), makeKeyword("MACRO-FUNCTIONS"), makeKeyword("SINGLE-BYTE-MACRO-FUNCTIONS"), makeKeyword("CONSTITUENT-TRAITS"), makeKeyword("SINGLE-BYTE-CONSTIT-TRAITS"), makeKeyword("DISPATCH-TABLES"));
  public static final SubLList $list10 = list(makeSymbol("READTABLE-CASE"), makeSymbol("READTABLE-CHARACTER-SYNTAX"), makeSymbol("READTABLE-SINGLE-BYTE-CHAR-SYNTAX"), makeSymbol("READTABLE-MACRO-FUNCTIONS"), makeSymbol("READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS"), makeSymbol("READTABLE-CONSTITUENT-TRAITS"), makeSymbol("READTABLE-SINGLE-BYTE-CONSTIT-TRAITS"), makeSymbol("READTABLE-DISPATCH-TABLES"));
  public static final SubLList $list11 = list(makeSymbol("_CSETF-READTABLE-CASE"), makeSymbol("_CSETF-READTABLE-CHARACTER-SYNTAX"), makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX"), makeSymbol("_CSETF-READTABLE-MACRO-FUNCTIONS"), makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS"), makeSymbol("_CSETF-READTABLE-CONSTITUENT-TRAITS"), makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS"), makeSymbol("_CSETF-READTABLE-DISPATCH-TABLES"));
  public static final SubLSymbol $sym12$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym13$READTABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("READTABLE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym14$READTABLE_CASE = makeSymbol("READTABLE-CASE");
  public static final SubLSymbol $sym15$_CSETF_READTABLE_CASE = makeSymbol("_CSETF-READTABLE-CASE");
  public static final SubLSymbol $sym16$READTABLE_CHARACTER_SYNTAX = makeSymbol("READTABLE-CHARACTER-SYNTAX");
  public static final SubLSymbol $sym17$_CSETF_READTABLE_CHARACTER_SYNTAX = makeSymbol("_CSETF-READTABLE-CHARACTER-SYNTAX");
  public static final SubLSymbol $sym18$READTABLE_SINGLE_BYTE_CHAR_SYNTAX = makeSymbol("READTABLE-SINGLE-BYTE-CHAR-SYNTAX");
  public static final SubLSymbol $sym19$_CSETF_READTABLE_SINGLE_BYTE_CHAR_SYNTAX = makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX");
  public static final SubLSymbol $sym20$READTABLE_MACRO_FUNCTIONS = makeSymbol("READTABLE-MACRO-FUNCTIONS");
  public static final SubLSymbol $sym21$_CSETF_READTABLE_MACRO_FUNCTIONS = makeSymbol("_CSETF-READTABLE-MACRO-FUNCTIONS");
  public static final SubLSymbol $sym22$READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS = makeSymbol("READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS");
  public static final SubLSymbol $sym23$_CSETF_READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS = makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS");
  public static final SubLSymbol $sym24$READTABLE_CONSTITUENT_TRAITS = makeSymbol("READTABLE-CONSTITUENT-TRAITS");
  public static final SubLSymbol $sym25$_CSETF_READTABLE_CONSTITUENT_TRAITS = makeSymbol("_CSETF-READTABLE-CONSTITUENT-TRAITS");
  public static final SubLSymbol $sym26$READTABLE_SINGLE_BYTE_CONSTIT_TRAITS = makeSymbol("READTABLE-SINGLE-BYTE-CONSTIT-TRAITS");
  public static final SubLSymbol $sym27$_CSETF_READTABLE_SINGLE_BYTE_CONSTIT_TRAITS = makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS");
  public static final SubLSymbol $sym28$READTABLE_DISPATCH_TABLES = makeSymbol("READTABLE-DISPATCH-TABLES");
  public static final SubLSymbol $sym29$_CSETF_READTABLE_DISPATCH_TABLES = makeSymbol("_CSETF-READTABLE-DISPATCH-TABLES");
  public static final SubLSymbol $kw30$CASE = makeKeyword("CASE");
  public static final SubLSymbol $kw31$CHARACTER_SYNTAX = makeKeyword("CHARACTER-SYNTAX");
  public static final SubLSymbol $kw32$SINGLE_BYTE_CHAR_SYNTAX = makeKeyword("SINGLE-BYTE-CHAR-SYNTAX");
  public static final SubLSymbol $kw33$MACRO_FUNCTIONS = makeKeyword("MACRO-FUNCTIONS");
  public static final SubLSymbol $kw34$SINGLE_BYTE_MACRO_FUNCTIONS = makeKeyword("SINGLE-BYTE-MACRO-FUNCTIONS");
  public static final SubLSymbol $kw35$CONSTITUENT_TRAITS = makeKeyword("CONSTITUENT-TRAITS");
  public static final SubLSymbol $kw36$SINGLE_BYTE_CONSTIT_TRAITS = makeKeyword("SINGLE-BYTE-CONSTIT-TRAITS");
  public static final SubLSymbol $kw37$DISPATCH_TABLES = makeKeyword("DISPATCH-TABLES");
  public static final SubLString $str38$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLInteger $int39$64 = makeInteger(64);
  public static final SubLInteger $int40$256 = makeInteger(256);
  public static final SubLInteger $int41$512 = makeInteger(512);
  public static final SubLSymbol $kw42$UPCASE = makeKeyword("UPCASE");
  public static final SubLSymbol $kw43$CONSTITUENT = makeKeyword("CONSTITUENT");
  public static final SubLSymbol $sym44$CONSTITUENT_RMF = makeSymbol("CONSTITUENT-RMF");
  public static final SubLList $list45 = list(makeSymbol("CH"), makeSymbol("&OPTIONAL"), list(makeSymbol("READTABLE"), list(makeSymbol("QUOTE"), makeSymbol("*READTABLE*"))));
  public static final SubLSymbol $sym46$_READTABLE_ = makeSymbol("*READTABLE*");
  public static final SubLSymbol $sym47$FIF = makeSymbol("FIF");
  public static final SubLSymbol $sym48$SINGLE_BYTE_P = makeSymbol("SINGLE-BYTE-P");
  public static final SubLSymbol $sym49$AREF = makeSymbol("AREF");
  public static final SubLSymbol $sym50$CHAR_CODE = makeSymbol("CHAR-CODE");
  public static final SubLSymbol $sym51$GETHASH = makeSymbol("GETHASH");
  public static final SubLList $list52 = list(makeKeyword("CONSTITUENT"));
  public static final SubLSymbol $kw53$INVALID = makeKeyword("INVALID");
  public static final SubLSymbol $kw54$TERMINATING_MACRO = makeKeyword("TERMINATING-MACRO");
  public static final SubLSymbol $kw55$NON_TERMINATING_MACRO = makeKeyword("NON-TERMINATING-MACRO");
  public static final SubLSymbol $kw56$MULTIPLE_ESCAPE = makeKeyword("MULTIPLE-ESCAPE");
  public static final SubLSymbol $kw57$SINGLE_ESCAPE = makeKeyword("SINGLE-ESCAPE");
  public static final SubLSymbol $kw58$WHITESPACE = makeKeyword("WHITESPACE");
  public static final SubLList $list59 = list(makeSymbol("CH"), makeSymbol("TRAIT"), makeSymbol("&OPTIONAL"), list(makeSymbol("READTABLE"), list(makeSymbol("QUOTE"), makeSymbol("*READTABLE*"))));
  public static final SubLSymbol $sym60$PLUSP = makeSymbol("PLUSP");
  public static final SubLSymbol $sym61$LOGAND = makeSymbol("LOGAND");
  public static final SubLSymbol $sym62$CHARACTER_TRAITS = makeSymbol("CHARACTER-TRAITS");
  public static final SubLList $list63 = cons(makeSymbol("CH"), makeSymbol("TABLE"));
  public static final SubLSymbol $sym64$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym65$DISPATCHING_RMF = makeSymbol("DISPATCHING-RMF");
  public static final SubLString $str66$Attempt_to_make_decimal_digit__A_ = makeString("Attempt to make decimal digit ~A be a dispatching macro character.");
  public static final SubLString $str67$_A_is_not_a_dispatching_macro_cha = makeString("~A is not a dispatching macro character in ~S.");
  public static final SubLSymbol $sym68$WHITESPACE_RMF = makeSymbol("WHITESPACE-RMF");
  public static final SubLSymbol $sym69$SINGLE_ESCAPE_RMF = makeSymbol("SINGLE-ESCAPE-RMF");
  public static final SubLSymbol $sym70$MULTIPLE_ESCAPE_RMF = makeSymbol("MULTIPLE-ESCAPE-RMF");
  public static final SubLSymbol $sym71$LEFT_PAREN_RMF = makeSymbol("LEFT-PAREN-RMF");
  public static final SubLSymbol $sym72$RIGHT_PAREN_RMF = makeSymbol("RIGHT-PAREN-RMF");
  public static final SubLSymbol $sym73$SINGLE_QUOTE_RMF = makeSymbol("SINGLE-QUOTE-RMF");
  public static final SubLSymbol $sym74$SEMICOLON_RMF = makeSymbol("SEMICOLON-RMF");
  public static final SubLSymbol $sym75$DOUBLE_QUOTE_RMF = makeSymbol("DOUBLE-QUOTE-RMF");
  public static final SubLSymbol $sym76$BACKQUOTE_RMF = makeSymbol("BACKQUOTE-RMF");
  public static final SubLSymbol $sym77$COMMA_RMF = makeSymbol("COMMA-RMF");
  public static final SubLSymbol $sym78$SHARPSIGN_BACKSLASH_RMF = makeSymbol("SHARPSIGN-BACKSLASH-RMF");
  public static final SubLSymbol $sym79$SHARPSIGN_SINGLE_QUOTE_RMF = makeSymbol("SHARPSIGN-SINGLE-QUOTE-RMF");
  public static final SubLSymbol $sym80$SHARPSIGN_LEFT_PAREN_RMF = makeSymbol("SHARPSIGN-LEFT-PAREN-RMF");
  public static final SubLSymbol $sym81$SHARPSIGN_ASTERISK_RMF = makeSymbol("SHARPSIGN-ASTERISK-RMF");
  public static final SubLSymbol $sym82$SHARPSIGN_COLON_RMF = makeSymbol("SHARPSIGN-COLON-RMF");
  public static final SubLSymbol $sym83$SHARPSIGN_DOT_RMF = makeSymbol("SHARPSIGN-DOT-RMF");
  public static final SubLSymbol $sym84$SHARPSIGN_B_RMF = makeSymbol("SHARPSIGN-B-RMF");
  public static final SubLSymbol $sym85$SHARPSIGN_O_RMF = makeSymbol("SHARPSIGN-O-RMF");
  public static final SubLSymbol $sym86$SHARPSIGN_X_RMF = makeSymbol("SHARPSIGN-X-RMF");
  public static final SubLSymbol $sym87$SHARPSIGN_R_RMF = makeSymbol("SHARPSIGN-R-RMF");
  public static final SubLSymbol $sym88$SHARPSIGN_C_RMF = makeSymbol("SHARPSIGN-C-RMF");
  public static final SubLSymbol $sym89$SHARPSIGN_A_RMF = makeSymbol("SHARPSIGN-A-RMF");
  public static final SubLSymbol $sym90$SHARPSIGN_S_RMF = makeSymbol("SHARPSIGN-S-RMF");
  public static final SubLSymbol $sym91$SHARPSIGN_P_RMF = makeSymbol("SHARPSIGN-P-RMF");
  public static final SubLSymbol $sym92$SHARPSIGN_CAPITAL_G_RMF = makeSymbol("SHARPSIGN-CAPITAL-G-RMF");
  public static final SubLSymbol $sym93$SHARPSIGN_EQUALS_RMF = makeSymbol("SHARPSIGN-EQUALS-RMF");
  public static final SubLSymbol $sym94$SHARPSIGN_SHARPSIGN_RMF = makeSymbol("SHARPSIGN-SHARPSIGN-RMF");
  public static final SubLSymbol $sym95$SHARPSIGN_PLUS_RMF = makeSymbol("SHARPSIGN-PLUS-RMF");
  public static final SubLSymbol $sym96$SHARPSIGN_MINUS_RMF = makeSymbol("SHARPSIGN-MINUS-RMF");
  public static final SubLSymbol $sym97$SHARPSIGN_VERTICAL_BAR_RMF = makeSymbol("SHARPSIGN-VERTICAL-BAR-RMF");
  public static final SubLList $list98 = list(Characters.CHAR_backspace, Characters.CHAR_tab, Characters.CHAR_newline, Characters.CHAR_newline, Characters.CHAR_page, Characters.CHAR_return, Characters.CHAR_space, Characters.CHAR_rubout);
  public static final SubLList $list99 = list(new SubLObject[] {Characters.CHAR_0, Characters.CHAR_1, Characters.CHAR_2, Characters.CHAR_3, Characters.CHAR_4, Characters.CHAR_5, Characters.CHAR_6, Characters.CHAR_7, Characters.CHAR_8, Characters.CHAR_9, Characters.CHAR_a, Characters.CHAR_b, Characters.CHAR_c, Characters.CHAR_d, Characters.CHAR_e, Characters.CHAR_f, Characters.CHAR_g, Characters.CHAR_h, Characters.CHAR_i, Characters.CHAR_j, Characters.CHAR_k, Characters.CHAR_l, Characters.CHAR_m, Characters.CHAR_n, Characters.CHAR_o, Characters.CHAR_p, Characters.CHAR_q, Characters.CHAR_r, Characters.CHAR_s, Characters.CHAR_t, Characters.CHAR_u, Characters.CHAR_v, Characters.CHAR_w, Characters.CHAR_x, Characters.CHAR_y, Characters.CHAR_z, Characters.CHAR_A, Characters.CHAR_B, Characters.CHAR_C, Characters.CHAR_D, Characters.CHAR_E, Characters.CHAR_F, Characters.CHAR_G, Characters.CHAR_H, Characters.CHAR_I, Characters.CHAR_J, Characters.CHAR_K, Characters.CHAR_L, Characters.CHAR_M, Characters.CHAR_N, Characters.CHAR_O, Characters.CHAR_P, Characters.CHAR_Q, Characters.CHAR_R, Characters.CHAR_S, Characters.CHAR_T, Characters.CHAR_U, Characters.CHAR_V, Characters.CHAR_W, Characters.CHAR_X, Characters.CHAR_Y, Characters.CHAR_Z});
  public static final SubLSymbol $sym100$READER_ERROR = makeSymbol("READER-ERROR");
  public static final SubLSymbol $sym101$ERROR = makeSymbol("ERROR");
  public static final SubLSymbol $sym102$END_OF_FILE = makeSymbol("END-OF-FILE");
  public static final SubLString $str103$End_of_file_on_stream__S_ = makeString("End of file on stream ~S.");
  public static final SubLString $str104$_S_is_invalid_token_syntax_ = makeString("~S is invalid token syntax.");
  public static final SubLString $str105$The__A_reader_macro_is_not_implem = makeString("The ~A reader macro is not implemented.");
  public static final SubLString $str106$The__A_reader_macro_does_not_take = makeString("The ~A reader macro does not take an argument.");
  public static final SubLString $str107$Illegal_argument__D_for_the__A_re = makeString("Illegal argument ~D for the ~A reader macro.");
  public static final SubLSymbol $sym108$CLET = makeSymbol("CLET");
  public static final SubLList $list109 = list(list(makeSymbol("*READ-BASE*"), TEN_INTEGER), list(makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), list(makeSymbol("QUOTE"), makeSymbol("SINGLE-FLOAT"))), list(makeSymbol("*READ-EVAL*"), T), list(makeSymbol("*READ-SUPPRESS*"), NIL), list(makeSymbol("*READTABLE*"), makeSymbol("*STANDARD-READTABLE*")));
  public static final SubLSymbol $sym110$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $kw111$EOF = makeKeyword("EOF");
  public static final SubLSymbol $kw112$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $sym113$READ_TOKEN = makeSymbol("READ-TOKEN");
  public static final SubLSymbol $sym114$READ_TOKEN_P = makeSymbol("READ-TOKEN-P");
  public static final SubLList $list115 = list(makeSymbol("POINTER"), makeSymbol("BUFFER"), makeSymbol("ESCAPES"));
  public static final SubLList $list116 = list(makeKeyword("POINTER"), makeKeyword("BUFFER"), makeKeyword("ESCAPES"));
  public static final SubLList $list117 = list(makeSymbol("READ-TOKEN-POINTER"), makeSymbol("READ-TOKEN-BUFFER"), makeSymbol("READ-TOKEN-ESCAPES"));
  public static final SubLList $list118 = list(makeSymbol("_CSETF-READ-TOKEN-POINTER"), makeSymbol("_CSETF-READ-TOKEN-BUFFER"), makeSymbol("_CSETF-READ-TOKEN-ESCAPES"));
  public static final SubLSymbol $sym119$READ_TOKEN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("READ-TOKEN-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym120$READ_TOKEN_POINTER = makeSymbol("READ-TOKEN-POINTER");
  public static final SubLSymbol $sym121$_CSETF_READ_TOKEN_POINTER = makeSymbol("_CSETF-READ-TOKEN-POINTER");
  public static final SubLSymbol $sym122$READ_TOKEN_BUFFER = makeSymbol("READ-TOKEN-BUFFER");
  public static final SubLSymbol $sym123$_CSETF_READ_TOKEN_BUFFER = makeSymbol("_CSETF-READ-TOKEN-BUFFER");
  public static final SubLSymbol $sym124$READ_TOKEN_ESCAPES = makeSymbol("READ-TOKEN-ESCAPES");
  public static final SubLSymbol $sym125$_CSETF_READ_TOKEN_ESCAPES = makeSymbol("_CSETF-READ-TOKEN-ESCAPES");
  public static final SubLSymbol $kw126$POINTER = makeKeyword("POINTER");
  public static final SubLSymbol $kw127$BUFFER = makeKeyword("BUFFER");
  public static final SubLSymbol $kw128$ESCAPES = makeKeyword("ESCAPES");
  public static final SubLList $list129 = list(makeSymbol("TOKEN"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list130 = list(list(makeSymbol("MAKE-READ-TOKEN")));
  public static final SubLList $list131 = list(makeSymbol("CSETF"), list(makeSymbol("READ-TOKEN-POINTER"), makeSymbol("TOKEN")), ZERO_INTEGER);
  public static final SubLList $list132 = list(makeSymbol("CSETF"), list(makeSymbol("READ-TOKEN-BUFFER"), makeSymbol("TOKEN")), list(makeSymbol("MAKE-STRING"), makeSymbol("*INITIAL-TOKEN-SIZE*")));
  public static final SubLList $list133 = list(makeSymbol("CSETF"), list(makeSymbol("READ-TOKEN-ESCAPES"), makeSymbol("TOKEN")), list(makeSymbol("QUOTE"), NIL));
  public static final SubLString $str134$_A_is_an_invalid_character_ = makeString("~A is an invalid character.");
  public static final SubLString $str135$Fell_through_character_syntax_on_ = makeString("Fell through character syntax on ~A.");
  public static final SubLSymbol $kw136$DOWNCASE = makeKeyword("DOWNCASE");
  public static final SubLString $str137$_S_is_not_a_known_package_ = makeString("~S is not a known package.");
  public static final SubLSymbol $kw138$PRESERVE = makeKeyword("PRESERVE");
  public static final SubLSymbol $kw139$INVERT = makeKeyword("INVERT");
  public static final SubLSymbol $sym140$CONSING_DOT = makeUninternedSymbol("CONSING-DOT");
  public static final SubLString $str141$KEYWORD = makeString("KEYWORD");
  public static final SubLSymbol $kw142$EXTERNAL = makeKeyword("EXTERNAL");
  public static final SubLString $str143$_S_is_not_external_in__S_ = makeString("~S is not external in ~S.");
  public static final SubLFloat $float144$0_0 = makeDouble(0.0);
  public static final SubLSymbol $kw145$INITIAL = makeKeyword("INITIAL");
  public static final SubLSymbol $kw146$DOT1 = makeKeyword("DOT1");
  public static final SubLSymbol $kw147$SIGN = makeKeyword("SIGN");
  public static final SubLSymbol $kw148$DECIMALS = makeKeyword("DECIMALS");
  public static final SubLSymbol $kw149$DIGITS = makeKeyword("DIGITS");
  public static final SubLSymbol $kw150$EXPONENT = makeKeyword("EXPONENT");
  public static final SubLSymbol $kw151$DOT2 = makeKeyword("DOT2");
  public static final SubLSymbol $kw152$SLASH = makeKeyword("SLASH");
  public static final SubLSymbol $kw153$DENOMINATOR = makeKeyword("DENOMINATOR");
  public static final SubLSymbol $kw154$FRACTION = makeKeyword("FRACTION");
  public static final SubLSymbol $kw155$DECIMALS2 = makeKeyword("DECIMALS2");
  public static final SubLSymbol $kw156$EXPONENT_SIGN = makeKeyword("EXPONENT-SIGN");
  public static final SubLSymbol $kw157$EXPONENT_VALUE = makeKeyword("EXPONENT-VALUE");
  public static final SubLString $str158$Can_t_happen_ = makeString("Can't happen.");
  public static final SubLSymbol $kw159$DIGIT = makeKeyword("DIGIT");
  public static final SubLString $str160$_S_does_not_contain_an_integer_ = makeString("~S does not contain an integer.");
  public static final SubLSymbol $kw161$TRAILING_WHITESPACE = makeKeyword("TRAILING-WHITESPACE");
  public static final SubLString $str162$The__S_reader_macro_does_not_take = makeString("The ~S reader macro does not take an argument.");
  public static final SubLString $str163$The__S_reader_macro_expected_a_st = makeString("The ~S reader macro expected a string.");
  public static final SubLString $str164$The__S_reader_macro_could_not_int = makeString("The ~S reader macro could not interpret ~S as a GUID string.");
  public static final SubLSymbol $sym165$RIGHT_PAREN = makeUninternedSymbol("RIGHT-PAREN");
  public static final SubLString $str166$Nothing_before_consing_dot_ = makeString("Nothing before consing dot.");
  public static final SubLSymbol $kw167$LIST = makeKeyword("LIST");
  public static final SubLSymbol $kw168$CONSING_DOT = makeKeyword("CONSING-DOT");
  public static final SubLString $str169$Nothing_after_consing_dot_ = makeString("Nothing after consing dot.");
  public static final SubLString $str170$Too_many_consing_dots_ = makeString("Too many consing dots.");
  public static final SubLSymbol $kw171$AFTER_CONSING_DOT = makeKeyword("AFTER-CONSING-DOT");
  public static final SubLString $str172$Too_many_objects_after_consing_do = makeString("Too many objects after consing dot.");
  public static final SubLString $str173$Ignoring_unmatched_close_parenthe = makeString("Ignoring unmatched close parenthesis.");
  public static final SubLString $str174$Unmatched__A_ = makeString("Unmatched ~A.");
  public static final SubLSymbol $sym175$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $kw176$NORMAL = makeKeyword("NORMAL");
  public static final SubLSymbol $kw177$ESCAPE = makeKeyword("ESCAPE");
  public static final SubLSymbol $sym178$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym179$LIST_ = makeSymbol("LIST*");
  public static final SubLSymbol $sym180$APPEND = makeSymbol("APPEND");
  public static final SubLSymbol $sym181$NCONC = makeSymbol("NCONC");
  public static final SubLSymbol $sym182$VECTOR = makeSymbol("VECTOR");
  public static final SubLSymbol $sym183$BQ_VECTOR = makeSymbol("BQ-VECTOR");
  public static final SubLSymbol $sym184$BQ_APPEND = makeSymbol("BQ-APPEND");
  public static final SubLString $str185$_ = makeString(",");
  public static final SubLString $str186$_ = makeString("@");
  public static final SubLString $str187$_ = makeString(".");
  public static final SubLString $str188$BQ_VECTOR = makeString("BQ-VECTOR");
  public static final SubLString $str189$_A_after_dot_in__S_ = makeString("~A after dot in ~S.");
  public static final SubLList $list190 = list(makeSymbol("QUOTE"), T, NIL);
  public static final SubLList $list191 = list(makeSymbol("APPEND"), makeSymbol("LIST"), makeSymbol("LIST*"), makeSymbol("NCONC"));
  public static final SubLSymbol $sym192$CONS = makeSymbol("CONS");
  public static final SubLSymbol $sym193$BQ_LIST_ = makeSymbol("BQ-LIST*");
  public static final SubLSymbol $sym194$BQ_CONS = makeSymbol("BQ-CONS");
  public static final SubLList $list195 = list(cons(makeSymbol("CONS"), makeSymbol("BQ-CONS")), cons(makeSymbol("LIST"), makeSymbol("BQ-LIST")), cons(makeSymbol("APPEND"), makeSymbol("BQ-APPEND")), cons(makeSymbol("NCONC"), makeSymbol("BQ-NCONC")));
  public static final SubLString $str196$_A_read_after_backquote_in__S_ = makeString("~A read after backquote in ~S.");
  public static final SubLString $str197$_S_read_outside_a_backquote_ = makeString("~S read outside a backquote.");
  public static final SubLString $str198$Undefined_reader_macro__A_A_ = makeString("Undefined reader macro ~A~A.");
  public static final SubLString $str199$_S_is_not_the_name_of_a_character = makeString("~S is not the name of a character.");
  public static final SubLSymbol $sym200$FUNCTION = makeSymbol("FUNCTION");
  public static final SubLString $str201$Attempt_the_use_the__A_reader_mac = makeString("Attempt the use the ~A reader macro when ~S is ~S.");
  public static final SubLSymbol $sym202$_READ_EVAL_ = makeSymbol("*READ-EVAL*");
  public static final SubLInteger $int203$36 = makeInteger(36);
  public static final SubLString $str204$The_form_after__A_reader_macro_wa = makeString("The form after ~A reader macro was not a list.");
  public static final SubLString $str205$Label__S_appears_more_than_once_ = makeString("Label ~S appears more than once.");
  public static final SubLString $str206$Label__S_has_not_been_seen_ = makeString("Label ~S has not been seen.");
  public static final SubLSymbol $kw207$NOT = makeKeyword("NOT");
  public static final SubLString $str208$Bogus_feature_expression__S_ = makeString("Bogus feature expression ~S.");
  public static final SubLSymbol $kw209$AND = makeKeyword("AND");
  public static final SubLSymbol $kw210$OR = makeKeyword("OR");
  public static final SubLString $str211$Unknown_feature_operator__S_ = makeString("Unknown feature operator ~S.");
  public static final SubLSymbol $kw212$HASH = makeKeyword("HASH");
  public static final SubLSymbol $kw213$VERTICAL_BAR = makeKeyword("VERTICAL-BAR");

  //// Initializers

  public void declareFunctions() {
    declare_reader_file();
  }

  public void initializeVariables() {
    init_reader_file();
  }

  public void runTopLevelForms() {
    setup_reader_file();
  }

}
