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

public  final class integer_sequence_generator extends SubLTranslatedFile {

  //// Constructor

  private integer_sequence_generator() {}
  public static final SubLFile me = new integer_sequence_generator();
  public static final String myName = "com.cyc.cycjava_1.cycl.integer_sequence_generator";

  //// Definitions

  public static final class $integer_sequence_generator_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $lock; }
    public SubLObject getField3() { return $current; }
    public SubLObject getField4() { return $start; }
    public SubLObject getField5() { return $limit; }
    public SubLObject getField6() { return $delta; }
    public SubLObject setField2(SubLObject value) { return $lock = value; }
    public SubLObject setField3(SubLObject value) { return $current = value; }
    public SubLObject setField4(SubLObject value) { return $start = value; }
    public SubLObject setField5(SubLObject value) { return $limit = value; }
    public SubLObject setField6(SubLObject value) { return $delta = value; }
    public SubLObject $lock = NIL;
    public SubLObject $current = NIL;
    public SubLObject $start = NIL;
    public SubLObject $limit = NIL;
    public SubLObject $delta = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($integer_sequence_generator_native.class, $sym0$INTEGER_SEQUENCE_GENERATOR, $sym1$INTEGER_SEQUENCE_GENERATOR_P, $list2, $list3, new String[] {"$lock", "$current", "$start", "$limit", "$delta"}, $list4, $list5, $sym6$PRINT_INTEGER_SEQUENCE_GENERATOR);
  }

  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 1205) 
  public static SubLSymbol $dtp_integer_sequence_generator$ = null;

  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 1205) 
  public static final SubLObject integer_sequence_generator_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31823");
    return NIL;
  }

  public static final class $integer_sequence_generator_p$UnaryFunction extends UnaryFunction {
    public $integer_sequence_generator_p$UnaryFunction() { super(extractFunctionNamed("INTEGER-SEQUENCE-GENERATOR-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31819"); }
  }

  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 1205) 
  public static final SubLObject isg_lock(SubLObject object) {
    checkType(object, $sym1$INTEGER_SEQUENCE_GENERATOR_P);
    return object.getField2();
  }

  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 1205) 
  public static final SubLObject isg_start(SubLObject object) {
    checkType(object, $sym1$INTEGER_SEQUENCE_GENERATOR_P);
    return object.getField4();
  }

  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 1205) 
  public static final SubLObject _csetf_isg_lock(SubLObject object, SubLObject value) {
    checkType(object, $sym1$INTEGER_SEQUENCE_GENERATOR_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 1205) 
  public static final SubLObject _csetf_isg_current(SubLObject object, SubLObject value) {
    checkType(object, $sym1$INTEGER_SEQUENCE_GENERATOR_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 1205) 
  public static final SubLObject _csetf_isg_start(SubLObject object, SubLObject value) {
    checkType(object, $sym1$INTEGER_SEQUENCE_GENERATOR_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 1205) 
  public static final SubLObject _csetf_isg_limit(SubLObject object, SubLObject value) {
    checkType(object, $sym1$INTEGER_SEQUENCE_GENERATOR_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 1205) 
  public static final SubLObject _csetf_isg_delta(SubLObject object, SubLObject value) {
    checkType(object, $sym1$INTEGER_SEQUENCE_GENERATOR_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 1205) 
  public static final SubLObject make_integer_sequence_generator(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $integer_sequence_generator_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw18$LOCK)) {
            _csetf_isg_lock(v_new, current_value);
          } else if (pcase_var.eql($kw19$CURRENT)) {
            _csetf_isg_current(v_new, current_value);
          } else if (pcase_var.eql($kw20$START)) {
            _csetf_isg_start(v_new, current_value);
          } else if (pcase_var.eql($kw21$LIMIT)) {
            _csetf_isg_limit(v_new, current_value);
          } else if (pcase_var.eql($kw22$DELTA)) {
            _csetf_isg_delta(v_new, current_value);
          } else {
            Errors.error($str23$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Create an Integer Sequence Generator to range from START to LIMIT in DELTA increments.
If LIMIT is NIL, it means there is no limit enforced. */
  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 2110) 
  public static final SubLObject new_integer_sequence_generator(SubLObject start, SubLObject limit, SubLObject delta) {
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((limit == UNPROVIDED)) {
      limit = NIL;
    }
    if ((delta == UNPROVIDED)) {
      delta = ONE_INTEGER;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(start, $sym28$INTEGERP);
      checkType(delta, $sym28$INTEGERP);
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if (delta.isZero()) {
          Errors.error($str29$DELTA_must_not_be_zero);
        }
      }
      if ((NIL != limit)) {
        checkType(limit, $sym28$INTEGERP);
      }
      {
        SubLObject isg = make_integer_sequence_generator(UNPROVIDED);
        SubLObject lock = Locks.make_lock($str30$ISG);
        _csetf_isg_lock(isg, lock);
        _csetf_isg_start(isg, start);
        _csetf_isg_limit(isg, limit);
        _csetf_isg_delta(isg, delta);
        return integer_sequence_generator_reset(isg);
      }
    }
  }

  /** Reset an Integer Sequence Generator to its original state. */
  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 2773) 
  public static final SubLObject integer_sequence_generator_reset(SubLObject isg) {
    checkType(isg, $sym1$INTEGER_SEQUENCE_GENERATOR_P);
    {
      SubLObject lock = isg_lock(isg);
      SubLObject lock_2 = lock;
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock_2);
        _csetf_isg_current(isg, isg_start(isg));
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock_2);
        }
      }
    }
    return isg;
  }

  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 3714) 
  private static SubLSymbol $cfasl_wide_opcode_isg$ = null;

  @SubL(source = "cycl/integer-sequence-generator.lisp", position = 3812) 
  public static final SubLObject cfasl_output_object_integer_sequence_generator_method(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31817");
    return object;
  }

  public static final SubLObject declare_integer_sequence_generator_file() {
    declareFunction("integer_sequence_generator_print_function_trampoline", "INTEGER-SEQUENCE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction("integer_sequence_generator_p", "INTEGER-SEQUENCE-GENERATOR-P", 1, 0, false); new $integer_sequence_generator_p$UnaryFunction();
    declareFunction("isg_lock", "ISG-LOCK", 1, 0, false);
    declareFunction("isg_current", "ISG-CURRENT", 1, 0, false);
    declareFunction("isg_start", "ISG-START", 1, 0, false);
    declareFunction("isg_limit", "ISG-LIMIT", 1, 0, false);
    declareFunction("isg_delta", "ISG-DELTA", 1, 0, false);
    declareFunction("_csetf_isg_lock", "_CSETF-ISG-LOCK", 2, 0, false);
    declareFunction("_csetf_isg_current", "_CSETF-ISG-CURRENT", 2, 0, false);
    declareFunction("_csetf_isg_start", "_CSETF-ISG-START", 2, 0, false);
    declareFunction("_csetf_isg_limit", "_CSETF-ISG-LIMIT", 2, 0, false);
    declareFunction("_csetf_isg_delta", "_CSETF-ISG-DELTA", 2, 0, false);
    declareFunction("make_integer_sequence_generator", "MAKE-INTEGER-SEQUENCE-GENERATOR", 0, 1, false);
    declareFunction("print_integer_sequence_generator", "PRINT-INTEGER-SEQUENCE-GENERATOR", 3, 0, false);
    declareFunction("fast_forward_isg", "FAST-FORWARD-ISG", 2, 0, false);
    declareFunction("new_integer_sequence_generator", "NEW-INTEGER-SEQUENCE-GENERATOR", 0, 3, false);
    declareFunction("integer_sequence_generator_reset", "INTEGER-SEQUENCE-GENERATOR-RESET", 1, 0, false);
    declareFunction("integer_sequence_generator_next", "INTEGER-SEQUENCE-GENERATOR-NEXT", 1, 0, false);
    declareFunction("cfasl_output_object_integer_sequence_generator_method", "CFASL-OUTPUT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD", 2, 0, false);
    declareFunction("cfasl_wide_output_isg", "CFASL-WIDE-OUTPUT-ISG", 2, 0, false);
    declareFunction("cfasl_output_isg_internal", "CFASL-OUTPUT-ISG-INTERNAL", 2, 0, false);
    declareFunction("cfasl_input_isg", "CFASL-INPUT-ISG", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_integer_sequence_generator_file() {
    $dtp_integer_sequence_generator$ = defconstant("*DTP-INTEGER-SEQUENCE-GENERATOR*", $sym0$INTEGER_SEQUENCE_GENERATOR);
    $cfasl_wide_opcode_isg$ = defconstant("*CFASL-WIDE-OPCODE-ISG*", $int32$130);
    return NIL;
  }

  public static final SubLObject setup_integer_sequence_generator_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_integer_sequence_generator$.getGlobalValue(), Symbols.symbol_function($sym7$INTEGER_SEQUENCE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$ISG_LOCK, $sym9$_CSETF_ISG_LOCK);
    Structures.def_csetf($sym10$ISG_CURRENT, $sym11$_CSETF_ISG_CURRENT);
    Structures.def_csetf($sym12$ISG_START, $sym13$_CSETF_ISG_START);
    Structures.def_csetf($sym14$ISG_LIMIT, $sym15$_CSETF_ISG_LIMIT);
    Structures.def_csetf($sym16$ISG_DELTA, $sym17$_CSETF_ISG_DELTA);
    Equality.identity($sym0$INTEGER_SEQUENCE_GENERATOR);
    cfasl.register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_isg$.getGlobalValue(), $sym33$CFASL_INPUT_ISG);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_integer_sequence_generator$.getGlobalValue(), Symbols.symbol_function($sym34$CFASL_OUTPUT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$INTEGER_SEQUENCE_GENERATOR = makeSymbol("INTEGER-SEQUENCE-GENERATOR");
  public static final SubLSymbol $sym1$INTEGER_SEQUENCE_GENERATOR_P = makeSymbol("INTEGER-SEQUENCE-GENERATOR-P");
  public static final SubLList $list2 = list(makeSymbol("LOCK"), makeSymbol("CURRENT"), makeSymbol("START"), makeSymbol("LIMIT"), makeSymbol("DELTA"));
  public static final SubLList $list3 = list(makeKeyword("LOCK"), makeKeyword("CURRENT"), makeKeyword("START"), makeKeyword("LIMIT"), makeKeyword("DELTA"));
  public static final SubLList $list4 = list(makeSymbol("ISG-LOCK"), makeSymbol("ISG-CURRENT"), makeSymbol("ISG-START"), makeSymbol("ISG-LIMIT"), makeSymbol("ISG-DELTA"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-ISG-LOCK"), makeSymbol("_CSETF-ISG-CURRENT"), makeSymbol("_CSETF-ISG-START"), makeSymbol("_CSETF-ISG-LIMIT"), makeSymbol("_CSETF-ISG-DELTA"));
  public static final SubLSymbol $sym6$PRINT_INTEGER_SEQUENCE_GENERATOR = makeSymbol("PRINT-INTEGER-SEQUENCE-GENERATOR");
  public static final SubLSymbol $sym7$INTEGER_SEQUENCE_GENERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INTEGER-SEQUENCE-GENERATOR-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$ISG_LOCK = makeSymbol("ISG-LOCK");
  public static final SubLSymbol $sym9$_CSETF_ISG_LOCK = makeSymbol("_CSETF-ISG-LOCK");
  public static final SubLSymbol $sym10$ISG_CURRENT = makeSymbol("ISG-CURRENT");
  public static final SubLSymbol $sym11$_CSETF_ISG_CURRENT = makeSymbol("_CSETF-ISG-CURRENT");
  public static final SubLSymbol $sym12$ISG_START = makeSymbol("ISG-START");
  public static final SubLSymbol $sym13$_CSETF_ISG_START = makeSymbol("_CSETF-ISG-START");
  public static final SubLSymbol $sym14$ISG_LIMIT = makeSymbol("ISG-LIMIT");
  public static final SubLSymbol $sym15$_CSETF_ISG_LIMIT = makeSymbol("_CSETF-ISG-LIMIT");
  public static final SubLSymbol $sym16$ISG_DELTA = makeSymbol("ISG-DELTA");
  public static final SubLSymbol $sym17$_CSETF_ISG_DELTA = makeSymbol("_CSETF-ISG-DELTA");
  public static final SubLSymbol $kw18$LOCK = makeKeyword("LOCK");
  public static final SubLSymbol $kw19$CURRENT = makeKeyword("CURRENT");
  public static final SubLSymbol $kw20$START = makeKeyword("START");
  public static final SubLSymbol $kw21$LIMIT = makeKeyword("LIMIT");
  public static final SubLSymbol $kw22$DELTA = makeKeyword("DELTA");
  public static final SubLString $str23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str24$__ISG_From__A = makeString("#<ISG:From ~A");
  public static final SubLString $str25$_to__A = makeString(" to ~A");
  public static final SubLString $str26$_by__A = makeString(" by ~A");
  public static final SubLString $str27$_at__A_ = makeString(" at ~A>");
  public static final SubLSymbol $sym28$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str29$DELTA_must_not_be_zero = makeString("DELTA must not be zero");
  public static final SubLString $str30$ISG = makeString("ISG");
  public static final SubLString $str31$Integer_Sequence_Generator__S_has = makeString("Integer Sequence Generator ~S has been exhausted");
  public static final SubLInteger $int32$130 = makeInteger(130);
  public static final SubLSymbol $sym33$CFASL_INPUT_ISG = makeSymbol("CFASL-INPUT-ISG");
  public static final SubLSymbol $sym34$CFASL_OUTPUT_OBJECT_INTEGER_SEQUENCE_GENERATOR_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INTEGER-SEQUENCE-GENERATOR-METHOD");

  //// Initializers

  public void declareFunctions() {
    declare_integer_sequence_generator_file();
  }

  public void initializeVariables() {
    init_integer_sequence_generator_file();
  }

  public void runTopLevelForms() {
    setup_integer_sequence_generator_file();
  }

}
