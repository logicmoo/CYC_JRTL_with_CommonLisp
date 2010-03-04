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

package  com.cyc.cycjava.cycl.inference.harness;

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
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class inference_datastructures_forward_propagate extends SubLTranslatedFile {

  //// Constructor

  private inference_datastructures_forward_propagate() {}
  public static final SubLFile me = new inference_datastructures_forward_propagate();
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate";

  //// Definitions

  public static final class $forward_propagate_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $old_queue; }
    public SubLObject getField3() { return $new_queue; }
    public SubLObject setField2(SubLObject value) { return $old_queue = value; }
    public SubLObject setField3(SubLObject value) { return $new_queue = value; }
    public SubLObject $old_queue = NIL;
    public SubLObject $new_queue = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($forward_propagate_native.class, $sym0$FORWARD_PROPAGATE, $sym1$FORWARD_PROPAGATE_P, $list2, $list3, new String[] {"$old_queue", "$new_queue"}, $list4, $list5, $sym6$PRINT_FORWARD_PROPAGATE);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164) 
  public static SubLSymbol $dtp_forward_propagate$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164) 
  public static final SubLObject forward_propagate_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35122");
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1164) 
  public static final SubLObject forward_propagate_p(SubLObject object) {
    return ((object.getClass() == $forward_propagate_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $forward_propagate_p$UnaryFunction extends UnaryFunction {
    public $forward_propagate_p$UnaryFunction() { super(extractFunctionNamed("FORWARD-PROPAGATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return forward_propagate_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 2286) 
  public static final SubLObject destroy_forward_propagate(SubLObject forward_propagate) {
    if ((NIL == forward_propagate_p(forward_propagate))) {
      return NIL;
    }
    queues.clear_queue(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35119"));
    queues.clear_queue(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35118"));
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35111");
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35108");
    return NIL;
  }

  public static final SubLObject declare_inference_datastructures_forward_propagate_file() {
    declareFunction(myName, "forward_propagate_print_function_trampoline", "FORWARD-PROPAGATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "forward_propagate_p", "FORWARD-PROPAGATE-P", 1, 0, false); new $forward_propagate_p$UnaryFunction();
    declareFunction(myName, "fpmt_old_queue", "FPMT-OLD-QUEUE", 1, 0, false);
    declareFunction(myName, "fpmt_new_queue", "FPMT-NEW-QUEUE", 1, 0, false);
    declareFunction(myName, "_csetf_fpmt_old_queue", "_CSETF-FPMT-OLD-QUEUE", 2, 0, false);
    declareFunction(myName, "_csetf_fpmt_new_queue", "_CSETF-FPMT-NEW-QUEUE", 2, 0, false);
    declareFunction(myName, "make_forward_propagate", "MAKE-FORWARD-PROPAGATE", 0, 1, false);
    declareFunction(myName, "print_forward_propagate", "PRINT-FORWARD-PROPAGATE", 3, 0, false);
    declareFunction(myName, "new_forward_propagate", "NEW-FORWARD-PROPAGATE", 0, 1, false);
    declareFunction(myName, "destroy_forward_propagate", "DESTROY-FORWARD-PROPAGATE", 1, 0, false);
    declareFunction(myName, "forward_propagate_old_queue", "FORWARD-PROPAGATE-OLD-QUEUE", 1, 0, false);
    declareFunction(myName, "set_forward_propagate_old_queue", "SET-FORWARD-PROPAGATE-OLD-QUEUE", 2, 0, false);
    declareFunction(myName, "clear_forward_propagate_old_queue", "CLEAR-FORWARD-PROPAGATE-OLD-QUEUE", 1, 0, false);
    declareFunction(myName, "forward_propagate_new_queue", "FORWARD-PROPAGATE-NEW-QUEUE", 1, 0, false);
    declareFunction(myName, "set_forward_propagate_new_queue", "SET-FORWARD-PROPAGATE-NEW-QUEUE", 2, 0, false);
    declareFunction(myName, "swap_forward_propagate_queues", "SWAP-FORWARD-PROPAGATE-QUEUES", 1, 0, false);
    declareFunction(myName, "enqueue_forward_propagate_assertions_to_new_queue", "ENQUEUE-FORWARD-PROPAGATE-ASSERTIONS-TO-NEW-QUEUE", 2, 0, false);
    declareFunction(myName, "dequeue_forward_propagate_assertion_from_old_queue", "DEQUEUE-FORWARD-PROPAGATE-ASSERTION-FROM-OLD-QUEUE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_datastructures_forward_propagate_file() {
    $dtp_forward_propagate$ = defconstant("*DTP-FORWARD-PROPAGATE*", $sym0$FORWARD_PROPAGATE);
    return NIL;
  }

  public static final SubLObject setup_inference_datastructures_forward_propagate_file() {
    // CVS_ID("Id: inference-datastructures-forward-propagate.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_forward_propagate$.getGlobalValue(), Symbols.symbol_function($sym7$FORWARD_PROPAGATE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$FPMT_OLD_QUEUE, $sym9$_CSETF_FPMT_OLD_QUEUE);
    Structures.def_csetf($sym10$FPMT_NEW_QUEUE, $sym11$_CSETF_FPMT_NEW_QUEUE);
    Equality.identity($sym0$FORWARD_PROPAGATE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$FORWARD_PROPAGATE = makeSymbol("FORWARD-PROPAGATE");
  public static final SubLSymbol $sym1$FORWARD_PROPAGATE_P = makeSymbol("FORWARD-PROPAGATE-P");
  public static final SubLList $list2 = list(makeSymbol("OLD-QUEUE"), makeSymbol("NEW-QUEUE"));
  public static final SubLList $list3 = list(makeKeyword("OLD-QUEUE"), makeKeyword("NEW-QUEUE"));
  public static final SubLList $list4 = list(makeSymbol("FPMT-OLD-QUEUE"), makeSymbol("FPMT-NEW-QUEUE"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-FPMT-OLD-QUEUE"), makeSymbol("_CSETF-FPMT-NEW-QUEUE"));
  public static final SubLSymbol $sym6$PRINT_FORWARD_PROPAGATE = makeSymbol("PRINT-FORWARD-PROPAGATE");
  public static final SubLSymbol $sym7$FORWARD_PROPAGATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORWARD-PROPAGATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$FPMT_OLD_QUEUE = makeSymbol("FPMT-OLD-QUEUE");
  public static final SubLSymbol $sym9$_CSETF_FPMT_OLD_QUEUE = makeSymbol("_CSETF-FPMT-OLD-QUEUE");
  public static final SubLSymbol $sym10$FPMT_NEW_QUEUE = makeSymbol("FPMT-NEW-QUEUE");
  public static final SubLSymbol $sym11$_CSETF_FPMT_NEW_QUEUE = makeSymbol("_CSETF-FPMT-NEW-QUEUE");
  public static final SubLSymbol $kw12$OLD_QUEUE = makeKeyword("OLD-QUEUE");
  public static final SubLSymbol $kw13$NEW_QUEUE = makeKeyword("NEW-QUEUE");
  public static final SubLString $str14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str15$_Forward_Propagate_old__a_new__a = makeString("<Forward Propagate old=~a new=~a");
  public static final SubLString $str16$_Invalid_Forward_Propagate__s_ = makeString("<Invalid Forward Propagate ~s>");
  public static final SubLSymbol $sym17$QUEUE_P = makeSymbol("QUEUE-P");
  public static final SubLSymbol $sym18$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
  public static final SubLSymbol $kw19$FREE = makeKeyword("FREE");
  public static final SubLSymbol $sym20$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym21$ASSERTION_P = makeSymbol("ASSERTION-P");

  //// Initializers

  public void declareFunctions() {
    declare_inference_datastructures_forward_propagate_file();
  }

  public void initializeVariables() {
    init_inference_datastructures_forward_propagate_file();
  }

  public void runTopLevelForms() {
    setup_inference_datastructures_forward_propagate_file();
  }

}
