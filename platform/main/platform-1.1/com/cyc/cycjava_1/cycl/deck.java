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
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.stacks;

public  final class deck extends SubLTranslatedFile {

  //// Constructor

  private deck() {}
  public static final SubLFile me = new deck();
  public static final String myName = "com.cyc.cycjava_1.cycl.deck";

  //// Definitions

  public static final class $deck_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $type; }
    public SubLObject getField3() { return $data; }
    public SubLObject setField2(SubLObject value) { return $type = value; }
    public SubLObject setField3(SubLObject value) { return $data = value; }
    public SubLObject $type = NIL;
    public SubLObject $data = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($deck_native.class, $sym0$DECK, $sym1$DECK_P, $list2, $list3, new String[] {"$type", "$data"}, $list4, $list5, $sym6$PRINT_DECK);
  }

  @SubL(source = "cycl/deck.lisp", position = 929) 
  public static SubLSymbol $dtp_deck$ = null;

  @SubL(source = "cycl/deck.lisp", position = 929) 
  public static final SubLObject deck_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31863");
    return NIL;
  }

  public static final class $deck_p$UnaryFunction extends UnaryFunction {
    public $deck_p$UnaryFunction() { super(extractFunctionNamed("DECK-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31861"); }
  }

  @SubL(source = "cycl/deck.lisp", position = 929) 
  public static final SubLObject deck_type(SubLObject object) {
    checkType(object, $sym1$DECK_P);
    return object.getField2();
  }

  @SubL(source = "cycl/deck.lisp", position = 929) 
  public static final SubLObject deck_data(SubLObject object) {
    checkType(object, $sym1$DECK_P);
    return object.getField3();
  }

  @SubL(source = "cycl/deck.lisp", position = 929) 
  public static final SubLObject _csetf_deck_type(SubLObject object, SubLObject value) {
    checkType(object, $sym1$DECK_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/deck.lisp", position = 929) 
  public static final SubLObject _csetf_deck_data(SubLObject object, SubLObject value) {
    checkType(object, $sym1$DECK_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/deck.lisp", position = 929) 
  public static final SubLObject make_deck(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $deck_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw12$TYPE)) {
            _csetf_deck_type(v_new, current_value);
          } else if (pcase_var.eql($kw13$DATA)) {
            _csetf_deck_data(v_new, current_value);
          } else {
            Errors.error($str14$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Return a new, empty deck. */
  @SubL(source = "cycl/deck.lisp", position = 1357) 
  public static final SubLObject create_deck(SubLObject type) {
    checkType(type, $sym20$DECK_TYPE_P);
    {
      SubLObject v_deck = make_deck(UNPROVIDED);
      SubLObject pcase_var = type;
      if (pcase_var.eql($kw18$QUEUE)) {
        _csetf_deck_type(v_deck, $kw18$QUEUE);
        _csetf_deck_data(v_deck, queues.create_queue());
      } else if (pcase_var.eql($kw19$STACK)) {
        _csetf_deck_type(v_deck, $kw19$STACK);
        _csetf_deck_data(v_deck, stacks.create_stack());
      }
      return v_deck;
    }
  }

  /** Clear DECK and return it. */
  @SubL(source = "cycl/deck.lisp", position = 1720) 
  public static final SubLObject clear_deck(SubLObject v_deck) {
    checkType(v_deck, $sym1$DECK_P);
    {
      SubLObject pcase_var = deck_type(v_deck);
      if (pcase_var.eql($kw18$QUEUE)) {
        queues.clear_queue(deck_data(v_deck));
      } else if (pcase_var.eql($kw19$STACK)) {
        stacks.clear_stack(deck_data(v_deck));
      }
    }
    return v_deck;
  }

  /** Return T iff DECK is empty. */
  @SubL(source = "cycl/deck.lisp", position = 1940) 
  public static final SubLObject deck_empty_p(SubLObject v_deck) {
    checkType(v_deck, $sym1$DECK_P);
    {
      SubLObject pcase_var = deck_type(v_deck);
      if (pcase_var.eql($kw18$QUEUE)) {
        return queues.queue_empty_p(deck_data(v_deck));
      } else if (pcase_var.eql($kw19$STACK)) {
        return stacks.stack_empty_p(deck_data(v_deck));
      }
    }
    return NIL;
  }

  /** Add an element ELT to DECK.  Returns DECK */
  @SubL(source = "cycl/deck.lisp", position = 2637) 
  public static final SubLObject deck_push(SubLObject elt, SubLObject v_deck) {
    checkType(v_deck, $sym1$DECK_P);
    {
      SubLObject pcase_var = deck_type(v_deck);
      if (pcase_var.eql($kw18$QUEUE)) {
        queues.enqueue(elt, deck_data(v_deck));
      } else if (pcase_var.eql($kw19$STACK)) {
        stacks.stack_push(elt, deck_data(v_deck));
      }
    }
    return v_deck;
  }

  /** Remove and return the next accessible element from DECK. */
  @SubL(source = "cycl/deck.lisp", position = 2882) 
  public static final SubLObject deck_pop(SubLObject v_deck) {
    checkType(v_deck, $sym1$DECK_P);
    {
      SubLObject pcase_var = deck_type(v_deck);
      if (pcase_var.eql($kw18$QUEUE)) {
        return queues.dequeue(deck_data(v_deck));
      } else if (pcase_var.eql($kw19$STACK)) {
        return stacks.stack_pop(deck_data(v_deck));
      }
    }
    return NIL;
  }

  public static final SubLObject declare_deck_file() {
    declareFunction(myName, "deck_print_function_trampoline", "DECK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "deck_p", "DECK-P", 1, 0, false); new $deck_p$UnaryFunction();
    declareFunction(myName, "deck_type", "DECK-TYPE", 1, 0, false);
    declareFunction(myName, "deck_data", "DECK-DATA", 1, 0, false);
    declareFunction(myName, "_csetf_deck_type", "_CSETF-DECK-TYPE", 2, 0, false);
    declareFunction(myName, "_csetf_deck_data", "_CSETF-DECK-DATA", 2, 0, false);
    declareFunction(myName, "make_deck", "MAKE-DECK", 0, 1, false);
    declareFunction(myName, "print_deck", "PRINT-DECK", 3, 0, false);
    declareFunction(myName, "deck_type_p", "DECK-TYPE-P", 1, 0, false);
    declareFunction(myName, "create_deck", "CREATE-DECK", 1, 0, false);
    declareFunction(myName, "clear_deck", "CLEAR-DECK", 1, 0, false);
    declareFunction(myName, "deck_empty_p", "DECK-EMPTY-P", 1, 0, false);
    declareFunction(myName, "deck_size", "DECK-SIZE", 1, 0, false);
    declareFunction(myName, "deck_elements", "DECK-ELEMENTS", 1, 0, false);
    declareFunction(myName, "deck_push", "DECK-PUSH", 2, 0, false);
    declareFunction(myName, "deck_pop", "DECK-POP", 1, 0, false);
    declareFunction(myName, "deck_peek", "DECK-PEEK", 1, 0, false);
    declareFunction(myName, "remdeck", "REMDECK", 2, 1, false);
    return NIL;
  }

  public static final SubLObject init_deck_file() {
    $dtp_deck$ = defconstant("*DTP-DECK*", $sym0$DECK);
    return NIL;
  }

  public static final SubLObject setup_deck_file() {
    // CVS_ID("Id: deck.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_deck$.getGlobalValue(), Symbols.symbol_function($sym7$DECK_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$DECK_TYPE, $sym9$_CSETF_DECK_TYPE);
    Structures.def_csetf($sym10$DECK_DATA, $sym11$_CSETF_DECK_DATA);
    Equality.identity($sym0$DECK);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$DECK = makeSymbol("DECK");
  public static final SubLSymbol $sym1$DECK_P = makeSymbol("DECK-P");
  public static final SubLList $list2 = list(makeSymbol("TYPE"), makeSymbol("DATA"));
  public static final SubLList $list3 = list(makeKeyword("TYPE"), makeKeyword("DATA"));
  public static final SubLList $list4 = list(makeSymbol("DECK-TYPE"), makeSymbol("DECK-DATA"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-DECK-TYPE"), makeSymbol("_CSETF-DECK-DATA"));
  public static final SubLSymbol $sym6$PRINT_DECK = makeSymbol("PRINT-DECK");
  public static final SubLSymbol $sym7$DECK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DECK-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$DECK_TYPE = makeSymbol("DECK-TYPE");
  public static final SubLSymbol $sym9$_CSETF_DECK_TYPE = makeSymbol("_CSETF-DECK-TYPE");
  public static final SubLSymbol $sym10$DECK_DATA = makeSymbol("DECK-DATA");
  public static final SubLSymbol $sym11$_CSETF_DECK_DATA = makeSymbol("_CSETF-DECK-DATA");
  public static final SubLSymbol $kw12$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw13$DATA = makeKeyword("DATA");
  public static final SubLString $str14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str15$__ = makeString("#<");
  public static final SubLSymbol $kw16$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw17$BASE = makeKeyword("BASE");
  public static final SubLSymbol $kw18$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw19$STACK = makeKeyword("STACK");
  public static final SubLSymbol $sym20$DECK_TYPE_P = makeSymbol("DECK-TYPE-P");

  //// Initializers

  public void declareFunctions() {
    declare_deck_file();
  }

  public void initializeVariables() {
    init_deck_file();
  }

  public void runTopLevelForms() {
    setup_deck_file();
  }

}
