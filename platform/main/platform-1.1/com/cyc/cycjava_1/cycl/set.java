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

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.keyhash;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class set extends SubLTranslatedFile {

  //// Constructor

  private set() {}
  public static final SubLFile me = new set();
  public static final String myName = "com.cyc.cycjava_1.cycl.set";

  //// Definitions

  public static final class $set_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $contents; }
    public SubLObject getField3() { return $test; }
    public SubLObject setField2(SubLObject value) { return $contents = value; }
    public SubLObject setField3(SubLObject value) { return $test = value; }
    public SubLObject $contents = NIL;
    public SubLObject $test = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($set_native.class, $sym0$SET, $sym1$SET_P, $list3, $list4, new String[] {"$contents", "$test"}, $list5, $list6, $sym7$PRINT_SET);
  }

  @SubL(source = "cycl/set.lisp", position = 1852) 
  public static SubLSymbol $dtp_set$ = null;

  @SubL(source = "cycl/set.lisp", position = 1852) 
  public static final SubLObject set_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31815");
    return NIL;
  }

  @SubL(source = "cycl/set.lisp", position = 1852) 
  public static final SubLObject set_p(SubLObject object) {
    return ((object.getClass() == $set_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $set_p$UnaryFunction extends UnaryFunction {
    public $set_p$UnaryFunction() { super(extractFunctionNamed("SET-P")); }
    public SubLObject processItem(SubLObject arg1) { return set_p(arg1); }
  }

  @SubL(source = "cycl/set.lisp", position = 1852) 
  public static final SubLObject set_struct_contents(SubLObject object) {
    checkType(object, $sym1$SET_P);
    return object.getField2();
  }

  @SubL(source = "cycl/set.lisp", position = 1852) 
  public static final SubLObject set_struct_test(SubLObject object) {
    checkType(object, $sym1$SET_P);
    return object.getField3();
  }

  @SubL(source = "cycl/set.lisp", position = 1852) 
  public static final SubLObject _csetf_set_struct_contents(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SET_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/set.lisp", position = 1852) 
  public static final SubLObject _csetf_set_struct_test(SubLObject object, SubLObject value) {
    checkType(object, $sym1$SET_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/set.lisp", position = 1852) 
  public static final SubLObject make_set(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $set_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw13$CONTENTS)) {
            _csetf_set_struct_contents(v_new, current_value);
          } else if (pcase_var.eql($kw14$TEST)) {
            _csetf_set_struct_test(v_new, current_value);
          } else {
            Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/set.lisp", position = 2797) 
  public static SubLSymbol $new_set_default_test_function$ = null;

  /** Allocate a new set with TEST as the equality test.
  Assume that SIZE elements will likely be immediately added.
  @return set-p */
  @SubL(source = "cycl/set.lisp", position = 3060) 
  public static final SubLObject new_set(SubLObject test, SubLObject size) {
    if ((test == UNPROVIDED)) {
      test = $new_set_default_test_function$.getGlobalValue();
    }
    if ((size == UNPROVIDED)) {
      size = ZERO_INTEGER;
    }
    checkType(test, $sym26$VALID_HASH_TEST_P);
    checkType(size, $sym27$INTEGERP);
    if (test.isSymbol()) {
      test = Symbols.symbol_function(test);
    }
    {
      SubLObject v_set = make_set(UNPROVIDED);
      _csetf_set_struct_test(v_set, test);
      _csetf_set_struct_contents(v_set, set_contents.new_set_contents(size, test));
      return v_set;
    }
  }

  /** Return the number of items currently entered in SET.
   @return integerp. */
  @SubL(source = "cycl/set.lisp", position = 4026) 
  public static final SubLObject set_size(SubLObject v_set) {
    checkType(v_set, $sym1$SET_P);
    return set_contents.set_contents_size(set_struct_contents(v_set));
  }

  /** @return boolean; non-nil iff SET is empty, nil otherwise */
  @SubL(source = "cycl/set.lisp", position = 4216) 
  public static final SubLObject set_emptyP(SubLObject v_set) {
    checkType(v_set, $sym1$SET_P);
    return set_contents.set_contents_emptyP(set_struct_contents(v_set));
  }

  /** @return boolean; t iff ELEMENT is in SET. */
  @SubL(source = "cycl/set.lisp", position = 4660) 
  public static final SubLObject set_memberP(SubLObject element, SubLObject v_set) {
    checkType(v_set, $sym1$SET_P);
    return set_contents.set_contents_memberP(element, set_struct_contents(v_set), set_struct_test(v_set));
  }

  /** Add this ELEMENT into the SET.
   @return boolean, t iff ELEMENT was not already there. */
  @SubL(source = "cycl/set.lisp", position = 5477) 
  public static final SubLObject set_add(SubLObject element, SubLObject v_set) {
    if ((NIL == set_memberP(element, v_set))) {
      _csetf_set_struct_contents(v_set, set_contents.set_contents_add(element, set_struct_contents(v_set), set_struct_test(v_set)));
      return T;
    }
    return NIL;
  }

  /** If ELEMENT is present in SET, then take it out of SET.
   @return boolean; t iff ELEMENT was in SET to begin with. */
  @SubL(source = "cycl/set.lisp", position = 5851) 
  public static final SubLObject set_remove(SubLObject element, SubLObject v_set) {
    if ((NIL != set_memberP(element, v_set))) {
      _csetf_set_struct_contents(v_set, set_contents.set_contents_delete(element, set_struct_contents(v_set), set_struct_test(v_set)));
      return T;
    }
    return NIL;
  }

  /** Reset SET to the status of being just allocated.
   @return set */
  @SubL(source = "cycl/set.lisp", position = 6206) 
  public static final SubLObject clear_set(SubLObject v_set) {
    checkType(v_set, $sym1$SET_P);
    _csetf_set_struct_contents(v_set, set_contents.clear_set_contents(set_struct_contents(v_set)));
    return v_set;
  }

  /** Returns an iterator for the elements of SET. */
  @SubL(source = "cycl/set.lisp", position = 6427) 
  public static final SubLObject new_set_iterator(SubLObject v_set) {
    checkType(v_set, $sym1$SET_P);
    return set_contents.new_set_contents_iterator(set_struct_contents(v_set));
  }

  @SubL(source = "cycl/set.lisp", position = 7093) 
  public static final SubLObject do_set_internal(SubLObject v_set) {
    checkType(v_set, $sym1$SET_P);
    return set_struct_contents(v_set);
  }

  @SubL(source = "cycl/set.lisp", position = 7577) 
  private static SubLSymbol $cfasl_opcode_set$ = null;

  @SubL(source = "cycl/set.lisp", position = 7691) 
  public static final SubLObject cfasl_output_object_set_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31811");
  }

  @SubL(source = "cycl/set.lisp", position = 8132) 
  public static final SubLObject cfasl_input_set(SubLObject stream) {
    {
      SubLObject test = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject size = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject v_set = NIL;
      SubLObject pcase_var = test;
      if ((pcase_var.eql(EQ)
          || pcase_var.eql(EQL)
          || pcase_var.eql(EQUAL)
          || pcase_var.eql(EQUALP))) {
        test = Symbols.symbol_function(test);
      }
      v_set = new_set(test, size);
      _csetf_set_struct_contents(v_set, set_contents.cfasl_input_set_contents(stream, set_struct_contents(v_set), size, test));
      return v_set;
    }
  }

  public static final class $cfasl_input_set$UnaryFunction extends UnaryFunction {
    public $cfasl_input_set$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-SET")); }
    public SubLObject processItem(SubLObject arg1) { return cfasl_input_set(arg1); }
  }

  @SubL(source = "cycl/set.lisp", position = 8547) 
  private static SubLSymbol $cfasl_opcode_legacy_set$ = null;

  /** @return list; a list of the elements of SET. */
  @SubL(source = "cycl/set.lisp", position = 9112) 
  public static final SubLObject set_element_list(SubLObject v_set) {
    checkType(v_set, $sym1$SET_P);
    return set_contents.set_contents_element_list(set_struct_contents(v_set));
  }

  /** Rehashes a set if its contents is keyhash style */
  @SubL(source = "cycl/set.lisp", position = 9588) 
  public static final SubLObject set_rebuild(SubLObject v_set) {
    checkType(v_set, $sym1$SET_P);
    _csetf_set_struct_contents(v_set, set_contents.set_contents_rebuild(set_struct_contents(v_set)));
    return v_set;
  }

  public static final SubLObject declare_set_file() {
    declareFunction(myName, "set_print_function_trampoline", "SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "set_p", "SET-P", 1, 0, false); new $set_p$UnaryFunction();
    declareFunction(myName, "set_struct_contents", "SET-STRUCT-CONTENTS", 1, 0, false);
    declareFunction(myName, "set_struct_test", "SET-STRUCT-TEST", 1, 0, false);
    declareFunction(myName, "_csetf_set_struct_contents", "_CSETF-SET-STRUCT-CONTENTS", 2, 0, false);
    declareFunction(myName, "_csetf_set_struct_test", "_CSETF-SET-STRUCT-TEST", 2, 0, false);
    declareFunction(myName, "make_set", "MAKE-SET", 0, 1, false);
    declareFunction(myName, "print_set", "PRINT-SET", 3, 0, false);
    declareFunction(myName, "set_style", "SET-STYLE", 1, 0, false);
    declareFunction(myName, "new_set", "NEW-SET", 0, 2, false);
    declareFunction(myName, "copy_set", "COPY-SET", 1, 0, false);
    declareFunction(myName, "set_test", "SET-TEST", 1, 0, false);
    declareFunction(myName, "set_size", "SET-SIZE", 1, 0, false);
    declareFunction(myName, "set_emptyP", "SET-EMPTY?", 1, 0, false);
    declareFunction(myName, "empty_set_p", "EMPTY-SET-P", 1, 0, false);
    declareFunction(myName, "non_empty_set_p", "NON-EMPTY-SET-P", 1, 0, false);
    declareFunction(myName, "set_memberP", "SET-MEMBER?", 2, 0, false);
    declareFunction(myName, "set_matching_element", "SET-MATCHING-ELEMENT", 2, 0, false);
    declareFunction(myName, "set_random_element", "SET-RANDOM-ELEMENT", 1, 0, false);
    declareFunction(myName, "set_add", "SET-ADD", 2, 0, false);
    declareFunction(myName, "set_remove", "SET-REMOVE", 2, 0, false);
    declareFunction(myName, "clear_set", "CLEAR-SET", 1, 0, false);
    declareFunction(myName, "new_set_iterator", "NEW-SET-ITERATOR", 1, 0, false);
    declareMacro(myName, "do_set", "DO-SET");
    declareFunction(myName, "do_set_internal", "DO-SET-INTERNAL", 1, 0, false);
    declareFunction(myName, "map_set", "MAP-SET", 2, 1, false);
    declareFunction(myName, "cfasl_output_object_set_method", "CFASL-OUTPUT-OBJECT-SET-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_set", "CFASL-OUTPUT-SET", 2, 0, false);
    declareFunction(myName, "cfasl_input_set", "CFASL-INPUT-SET", 1, 0, false); new $cfasl_input_set$UnaryFunction();
    declareFunction(myName, "cfasl_input_legacy_set", "CFASL-INPUT-LEGACY-SET", 1, 0, false);
    declareFunction(myName, "set_element_list", "SET-ELEMENT-LIST", 1, 0, false);
    declareFunction(myName, "set_rebuild", "SET-REBUILD", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_set_file() {
    $dtp_set$ = defconstant("*DTP-SET*", $sym0$SET);
    $new_set_default_test_function$ = deflexical("*NEW-SET-DEFAULT-TEST-FUNCTION*", Symbols.symbol_function(EQL));
    $cfasl_opcode_set$ = defconstant("*CFASL-OPCODE-SET*", $int35$60);
    $cfasl_opcode_legacy_set$ = defconstant("*CFASL-OPCODE-LEGACY-SET*", $int38$67);
    return NIL;
  }

  public static final SubLObject setup_set_file() {
    // CVS_ID("Id: set.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), Symbols.symbol_function($sym8$SET_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$SET_STRUCT_CONTENTS, $sym10$_CSETF_SET_STRUCT_CONTENTS);
    Structures.def_csetf($sym11$SET_STRUCT_TEST, $sym12$_CSETF_SET_STRUCT_TEST);
    Equality.identity($sym0$SET);
    access_macros.register_macro_helper($sym33$DO_SET_INTERNAL, $sym34$DO_SET);
    cfasl.register_cfasl_input_function($cfasl_opcode_set$.getGlobalValue(), $sym36$CFASL_INPUT_SET);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_set$.getGlobalValue(), Symbols.symbol_function($sym37$CFASL_OUTPUT_OBJECT_SET_METHOD));
    cfasl.register_cfasl_input_function($cfasl_opcode_legacy_set$.getGlobalValue(), $sym39$CFASL_INPUT_LEGACY_SET);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SET = makeSymbol("SET");
  public static final SubLSymbol $sym1$SET_P = makeSymbol("SET-P");
  public static final SubLInteger $int2$136 = makeInteger(136);
  public static final SubLList $list3 = list(makeSymbol("CONTENTS"), makeSymbol("TEST"));
  public static final SubLList $list4 = list(makeKeyword("CONTENTS"), makeKeyword("TEST"));
  public static final SubLList $list5 = list(makeSymbol("SET-STRUCT-CONTENTS"), makeSymbol("SET-STRUCT-TEST"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-SET-STRUCT-CONTENTS"), makeSymbol("_CSETF-SET-STRUCT-TEST"));
  public static final SubLSymbol $sym7$PRINT_SET = makeSymbol("PRINT-SET");
  public static final SubLSymbol $sym8$SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SET-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$SET_STRUCT_CONTENTS = makeSymbol("SET-STRUCT-CONTENTS");
  public static final SubLSymbol $sym10$_CSETF_SET_STRUCT_CONTENTS = makeSymbol("_CSETF-SET-STRUCT-CONTENTS");
  public static final SubLSymbol $sym11$SET_STRUCT_TEST = makeSymbol("SET-STRUCT-TEST");
  public static final SubLSymbol $sym12$_CSETF_SET_STRUCT_TEST = makeSymbol("_CSETF-SET-STRUCT-TEST");
  public static final SubLSymbol $kw13$CONTENTS = makeKeyword("CONTENTS");
  public static final SubLSymbol $kw14$TEST = makeKeyword("TEST");
  public static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str16$__ = makeString("#<");
  public static final SubLSymbol $kw17$STREAM = makeKeyword("STREAM");
  public static final SubLString $str18$_ = makeString("(");
  public static final SubLString $str19$_ = makeString(" ");
  public static final SubLString $str20$_ = makeString(")");
  public static final SubLString $str21$_size_ = makeString(" size=");
  public static final SubLSymbol $kw22$BASE = makeKeyword("BASE");
  public static final SubLSymbol $kw23$LIST = makeKeyword("LIST");
  public static final SubLSymbol $kw24$KEYHASH = makeKeyword("KEYHASH");
  public static final SubLSymbol $kw25$SINGLETON = makeKeyword("SINGLETON");
  public static final SubLSymbol $sym26$VALID_HASH_TEST_P = makeSymbol("VALID-HASH-TEST-P");
  public static final SubLSymbol $sym27$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLList $list28 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SET"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list29 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw30$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw31$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym32$DO_SET_CONTENTS = makeSymbol("DO-SET-CONTENTS");
  public static final SubLSymbol $sym33$DO_SET_INTERNAL = makeSymbol("DO-SET-INTERNAL");
  public static final SubLSymbol $sym34$DO_SET = makeSymbol("DO-SET");
  public static final SubLInteger $int35$60 = makeInteger(60);
  public static final SubLSymbol $sym36$CFASL_INPUT_SET = makeSymbol("CFASL-INPUT-SET");
  public static final SubLSymbol $sym37$CFASL_OUTPUT_OBJECT_SET_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-SET-METHOD");
  public static final SubLInteger $int38$67 = makeInteger(67);
  public static final SubLSymbol $sym39$CFASL_INPUT_LEGACY_SET = makeSymbol("CFASL-INPUT-LEGACY-SET");

  //// Initializers

  public void declareFunctions() {
    declare_set_file();
  }

  public void initializeVariables() {
    init_set_file();
  }

  public void runTopLevelForms() {
    setup_set_file();
  }

}
