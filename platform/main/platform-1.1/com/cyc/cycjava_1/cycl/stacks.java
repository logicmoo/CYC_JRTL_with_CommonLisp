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

public  final class stacks extends SubLTranslatedFile {

  //// Constructor

  private stacks() {}
  public static final SubLFile me = new stacks();
  public static final String myName = "com.cyc.cycjava_1.cycl.stacks";

  //// Definitions

  public static final class $stack_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $num; }
    public SubLObject getField3() { return $elements; }
    public SubLObject setField2(SubLObject value) { return $num = value; }
    public SubLObject setField3(SubLObject value) { return $elements = value; }
    public SubLObject $num = NIL;
    public SubLObject $elements = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($stack_native.class, $sym0$STACK, $sym1$STACK_P, $list2, $list3, new String[] {"$num", "$elements"}, $list4, $list5, $sym6$PRINT_STACK);
  }

  @SubL(source = "cycl/stacks.lisp", position = 1487) 
  public static SubLSymbol $dtp_stack$ = null;

  @SubL(source = "cycl/stacks.lisp", position = 1487) 
  public static final SubLObject stack_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30052");
    return NIL;
  }

  public static final class $stack_p$UnaryFunction extends UnaryFunction {
    public $stack_p$UnaryFunction() { super(extractFunctionNamed("STACK-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30057"); }
  }

  @SubL(source = "cycl/stacks.lisp", position = 1487) 
  public static final SubLObject stack_struc_num(SubLObject object) {
    checkType(object, $sym1$STACK_P);
    return object.getField2();
  }

  @SubL(source = "cycl/stacks.lisp", position = 1487) 
  public static final SubLObject stack_struc_elements(SubLObject object) {
    checkType(object, $sym1$STACK_P);
    return object.getField3();
  }

  @SubL(source = "cycl/stacks.lisp", position = 1487) 
  public static final SubLObject _csetf_stack_struc_num(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STACK_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/stacks.lisp", position = 1487) 
  public static final SubLObject _csetf_stack_struc_elements(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STACK_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/stacks.lisp", position = 1487) 
  public static final SubLObject make_stack(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $stack_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw12$NUM)) {
            _csetf_stack_struc_num(v_new, current_value);
          } else if (pcase_var.eql($kw13$ELEMENTS)) {
            _csetf_stack_struc_elements(v_new, current_value);
          } else {
            Errors.error($str14$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Return a new, empty stack. */
  @SubL(source = "cycl/stacks.lisp", position = 1818) 
  public static final SubLObject create_stack() {
    return clear_stack(make_stack(UNPROVIDED));
  }

  /** Clear STACK and return it. */
  @SubL(source = "cycl/stacks.lisp", position = 1928) 
  public static final SubLObject clear_stack(SubLObject stack) {
    checkType(stack, $sym1$STACK_P);
    _csetf_stack_struc_num(stack, ZERO_INTEGER);
    _csetf_stack_struc_elements(stack, NIL);
    return stack;
  }

  /** Return T iff STACK is empty. */
  @SubL(source = "cycl/stacks.lisp", position = 2117) 
  public static final SubLObject stack_empty_p(SubLObject stack) {
    checkType(stack, $sym1$STACK_P);
    return Types.sublisp_null(stack_struc_elements(stack));
  }

  /** Add ITEM to the top of STACK.  Returns STACK. */
  @SubL(source = "cycl/stacks.lisp", position = 2898) 
  public static final SubLObject stack_push(SubLObject item, SubLObject stack) {
    checkType(stack, $sym1$STACK_P);
    _csetf_stack_struc_elements(stack, cons(item, stack_struc_elements(stack)));
    _csetf_stack_struc_num(stack, Numbers.add(stack_struc_num(stack), ONE_INTEGER));
    return stack;
  }

  /** Remove and return the top item in STACK. */
  @SubL(source = "cycl/stacks.lisp", position = 3109) 
  public static final SubLObject stack_pop(SubLObject stack) {
    checkType(stack, $sym1$STACK_P);
    if ((NIL == stack_empty_p(stack))) {
      {
        SubLObject elements = stack_struc_elements(stack);
        SubLObject item = elements.first();
        SubLObject rest = elements.rest();
        _csetf_stack_struc_num(stack, Numbers.subtract(stack_struc_num(stack), ONE_INTEGER));
        _csetf_stack_struc_elements(stack, rest);
        return item;
      }
    }
    return NIL;
  }

  /** Return the top item in STACK, without removing it. */
  @SubL(source = "cycl/stacks.lisp", position = 3462) 
  public static final SubLObject stack_peek(SubLObject stack) {
    checkType(stack, $sym1$STACK_P);
    if ((NIL == stack_empty_p(stack))) {
      {
        SubLObject elements = stack_struc_elements(stack);
        SubLObject item = elements.first();
        return item;
      }
    }
    return NIL;
  }

  public static final class $locked_stack_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $lock; }
    public SubLObject getField3() { return $stack; }
    public SubLObject setField2(SubLObject value) { return $lock = value; }
    public SubLObject setField3(SubLObject value) { return $stack = value; }
    public SubLObject $lock = NIL;
    public SubLObject $stack = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($locked_stack_native.class, $sym29$LOCKED_STACK, $sym30$LOCKED_STACK_P, $list31, $list32, new String[] {"$lock", "$stack"}, $list33, $list34, $sym35$PRINT_LOCKED_STACK);
  }

  @SubL(source = "cycl/stacks.lisp", position = 5422) 
  public static SubLSymbol $dtp_locked_stack$ = null;

  @SubL(source = "cycl/stacks.lisp", position = 5422) 
  public static final SubLObject locked_stack_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30051");
    return NIL;
  }

  public static final class $locked_stack_p$UnaryFunction extends UnaryFunction {
    public $locked_stack_p$UnaryFunction() { super(extractFunctionNamed("LOCKED-STACK-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30048"); }
  }

  public static final SubLObject declare_stacks_file() {
    declareFunction(myName, "stack_print_function_trampoline", "STACK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "stack_p", "STACK-P", 1, 0, false); new $stack_p$UnaryFunction();
    declareFunction(myName, "stack_struc_num", "STACK-STRUC-NUM", 1, 0, false);
    declareFunction(myName, "stack_struc_elements", "STACK-STRUC-ELEMENTS", 1, 0, false);
    declareFunction(myName, "_csetf_stack_struc_num", "_CSETF-STACK-STRUC-NUM", 2, 0, false);
    declareFunction(myName, "_csetf_stack_struc_elements", "_CSETF-STACK-STRUC-ELEMENTS", 2, 0, false);
    declareFunction(myName, "make_stack", "MAKE-STACK", 0, 1, false);
    declareFunction(myName, "print_stack", "PRINT-STACK", 3, 0, false);
    declareFunction(myName, "create_stack", "CREATE-STACK", 0, 0, false);
    declareFunction(myName, "clear_stack", "CLEAR-STACK", 1, 0, false);
    declareFunction(myName, "stack_empty_p", "STACK-EMPTY-P", 1, 0, false);
    declareFunction(myName, "stack_of_type_p", "STACK-OF-TYPE-P", 2, 0, false);
    declareFunction(myName, "stack_size", "STACK-SIZE", 1, 0, false);
    declareFunction(myName, "stack_elements", "STACK-ELEMENTS", 1, 0, false);
    declareFunction(myName, "stack_push", "STACK-PUSH", 2, 0, false);
    declareFunction(myName, "stack_pop", "STACK-POP", 1, 0, false);
    declareFunction(myName, "stack_peek", "STACK-PEEK", 1, 0, false);
    declareFunction(myName, "stack_delete", "STACK-DELETE", 2, 1, false);
    declareMacro(myName, "do_stack_elements", "DO-STACK-ELEMENTS");
    declareFunction(myName, "do_stack_elements_stack_elements", "DO-STACK-ELEMENTS-STACK-ELEMENTS", 1, 0, false);
    declareFunction(myName, "stack_find", "STACK-FIND", 2, 2, false);
    declareFunction(myName, "stack_find_if", "STACK-FIND-IF", 2, 1, false);
    declareFunction(myName, "print_stack_contents", "PRINT-STACK-CONTENTS", 1, 1, false);
    declareFunction(myName, "locked_stack_print_function_trampoline", "LOCKED-STACK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "locked_stack_p", "LOCKED-STACK-P", 1, 0, false); new $locked_stack_p$UnaryFunction();
    declareFunction(myName, "locked_stack_struc_lock", "LOCKED-STACK-STRUC-LOCK", 1, 0, false);
    declareFunction(myName, "locked_stack_struc_stack", "LOCKED-STACK-STRUC-STACK", 1, 0, false);
    declareFunction(myName, "_csetf_locked_stack_struc_lock", "_CSETF-LOCKED-STACK-STRUC-LOCK", 2, 0, false);
    declareFunction(myName, "_csetf_locked_stack_struc_stack", "_CSETF-LOCKED-STACK-STRUC-STACK", 2, 0, false);
    declareFunction(myName, "make_locked_stack", "MAKE-LOCKED-STACK", 0, 1, false);
    declareFunction(myName, "print_locked_stack", "PRINT-LOCKED-STACK", 3, 0, false);
    declareFunction(myName, "create_locked_stack", "CREATE-LOCKED-STACK", 0, 0, false);
    declareFunction(myName, "clear_locked_stack", "CLEAR-LOCKED-STACK", 1, 0, false);
    declareFunction(myName, "locked_stack_empty_p", "LOCKED-STACK-EMPTY-P", 1, 0, false);
    declareFunction(myName, "locked_stack_size", "LOCKED-STACK-SIZE", 1, 0, false);
    declareFunction(myName, "locked_stack_elements", "LOCKED-STACK-ELEMENTS", 1, 0, false);
    declareFunction(myName, "locked_stack_push", "LOCKED-STACK-PUSH", 2, 0, false);
    declareFunction(myName, "locked_stack_pop", "LOCKED-STACK-POP", 1, 0, false);
    declareFunction(myName, "locked_stack_delete", "LOCKED-STACK-DELETE", 2, 1, false);
    declareFunction(myName, "print_locked_stack_contents", "PRINT-LOCKED-STACK-CONTENTS", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_stacks_file() {
    $dtp_stack$ = defconstant("*DTP-STACK*", $sym0$STACK);
    $dtp_locked_stack$ = defconstant("*DTP-LOCKED-STACK*", $sym29$LOCKED_STACK);
    return NIL;
  }

  public static final SubLObject setup_stacks_file() {
    // CVS_ID("Id: stacks.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_stack$.getGlobalValue(), Symbols.symbol_function($sym7$STACK_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$STACK_STRUC_NUM, $sym9$_CSETF_STACK_STRUC_NUM);
    Structures.def_csetf($sym10$STACK_STRUC_ELEMENTS, $sym11$_CSETF_STACK_STRUC_ELEMENTS);
    Equality.identity($sym0$STACK);
    access_macros.register_macro_helper($sym24$DO_STACK_ELEMENTS_STACK_ELEMENTS, $sym25$DO_STACK_ELEMENTS);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_locked_stack$.getGlobalValue(), Symbols.symbol_function($sym36$LOCKED_STACK_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym37$LOCKED_STACK_STRUC_LOCK, $sym38$_CSETF_LOCKED_STACK_STRUC_LOCK);
    Structures.def_csetf($sym39$LOCKED_STACK_STRUC_STACK, $sym40$_CSETF_LOCKED_STACK_STRUC_STACK);
    Equality.identity($sym29$LOCKED_STACK);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$STACK = makeSymbol("STACK");
  public static final SubLSymbol $sym1$STACK_P = makeSymbol("STACK-P");
  public static final SubLList $list2 = list(makeSymbol("NUM"), makeSymbol("ELEMENTS"));
  public static final SubLList $list3 = list(makeKeyword("NUM"), makeKeyword("ELEMENTS"));
  public static final SubLList $list4 = list(makeSymbol("STACK-STRUC-NUM"), makeSymbol("STACK-STRUC-ELEMENTS"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-STACK-STRUC-NUM"), makeSymbol("_CSETF-STACK-STRUC-ELEMENTS"));
  public static final SubLSymbol $sym6$PRINT_STACK = makeSymbol("PRINT-STACK");
  public static final SubLSymbol $sym7$STACK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STACK-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$STACK_STRUC_NUM = makeSymbol("STACK-STRUC-NUM");
  public static final SubLSymbol $sym9$_CSETF_STACK_STRUC_NUM = makeSymbol("_CSETF-STACK-STRUC-NUM");
  public static final SubLSymbol $sym10$STACK_STRUC_ELEMENTS = makeSymbol("STACK-STRUC-ELEMENTS");
  public static final SubLSymbol $sym11$_CSETF_STACK_STRUC_ELEMENTS = makeSymbol("_CSETF-STACK-STRUC-ELEMENTS");
  public static final SubLSymbol $kw12$NUM = makeKeyword("NUM");
  public static final SubLSymbol $kw13$ELEMENTS = makeKeyword("ELEMENTS");
  public static final SubLString $str14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str15$__ = makeString("#<");
  public static final SubLSymbol $kw16$STREAM = makeKeyword("STREAM");
  public static final SubLString $str17$size_ = makeString("size=");
  public static final SubLSymbol $kw18$BASE = makeKeyword("BASE");
  public static final SubLList $list19 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("STACK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list20 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw21$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw22$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym23$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym24$DO_STACK_ELEMENTS_STACK_ELEMENTS = makeSymbol("DO-STACK-ELEMENTS-STACK-ELEMENTS");
  public static final SubLSymbol $sym25$DO_STACK_ELEMENTS = makeSymbol("DO-STACK-ELEMENTS");
  public static final SubLString $str26$__Stack_length____a = makeString("~%Stack length : ~a");
  public static final SubLString $str27$__Stack_contents__ = makeString("~%Stack contents :");
  public static final SubLString $str28$___s = makeString("~%~s");
  public static final SubLSymbol $sym29$LOCKED_STACK = makeSymbol("LOCKED-STACK");
  public static final SubLSymbol $sym30$LOCKED_STACK_P = makeSymbol("LOCKED-STACK-P");
  public static final SubLList $list31 = list(makeSymbol("LOCK"), makeSymbol("STACK"));
  public static final SubLList $list32 = list(makeKeyword("LOCK"), makeKeyword("STACK"));
  public static final SubLList $list33 = list(makeSymbol("LOCKED-STACK-STRUC-LOCK"), makeSymbol("LOCKED-STACK-STRUC-STACK"));
  public static final SubLList $list34 = list(makeSymbol("_CSETF-LOCKED-STACK-STRUC-LOCK"), makeSymbol("_CSETF-LOCKED-STACK-STRUC-STACK"));
  public static final SubLSymbol $sym35$PRINT_LOCKED_STACK = makeSymbol("PRINT-LOCKED-STACK");
  public static final SubLSymbol $sym36$LOCKED_STACK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LOCKED-STACK-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym37$LOCKED_STACK_STRUC_LOCK = makeSymbol("LOCKED-STACK-STRUC-LOCK");
  public static final SubLSymbol $sym38$_CSETF_LOCKED_STACK_STRUC_LOCK = makeSymbol("_CSETF-LOCKED-STACK-STRUC-LOCK");
  public static final SubLSymbol $sym39$LOCKED_STACK_STRUC_STACK = makeSymbol("LOCKED-STACK-STRUC-STACK");
  public static final SubLSymbol $sym40$_CSETF_LOCKED_STACK_STRUC_STACK = makeSymbol("_CSETF-LOCKED-STACK-STRUC-STACK");
  public static final SubLSymbol $kw41$LOCK = makeKeyword("LOCK");
  public static final SubLSymbol $kw42$STACK = makeKeyword("STACK");
  public static final SubLString $str43$Stack_Lock = makeString("Stack Lock");
  public static final SubLString $str44$__Locked_Stack_size____a = makeString("~%Locked Stack size : ~a");
  public static final SubLString $str45$__Locked_Stack_contents__ = makeString("~%Locked Stack contents :");

  //// Initializers

  public void declareFunctions() {
    declare_stacks_file();
  }

  public void initializeVariables() {
    init_stacks_file();
  }

  public void runTopLevelForms() {
    setup_stacks_file();
  }

}
