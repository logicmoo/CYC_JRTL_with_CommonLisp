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

package com.cyc.cycjava_1.cycl.inference.harness;
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
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.queues;

public  final class new_root_tactician_datastructures extends SubLTranslatedFile {

  //// Constructor

  private new_root_tactician_datastructures() {}
  public static final SubLFile me = new new_root_tactician_datastructures();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.new_root_tactician_datastructures";

  //// Definitions

  public static final class $new_root_strategy_data_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $new_root_index; }
    public SubLObject setField2(SubLObject value) { return $new_root_index = value; }
    public SubLObject $new_root_index = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($new_root_strategy_data_native.class, $sym0$NEW_ROOT_STRATEGY_DATA, $sym1$NEW_ROOT_STRATEGY_DATA_P, $list2, $list3, new String[] {"$new_root_index"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/new-root-tactician-datastructures.lisp", position = 1108) 
  public static SubLSymbol $dtp_new_root_strategy_data$ = null;

  public static final class $new_root_strategy_data_p$UnaryFunction extends UnaryFunction {
    public $new_root_strategy_data_p$UnaryFunction() { super(extractFunctionNamed("NEW-ROOT-STRATEGY-DATA-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35429"); }
  }

  public static final SubLObject declare_new_root_tactician_datastructures_file() {
    declareFunction(myName, "new_root_strategy_data_print_function_trampoline", "NEW-ROOT-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "new_root_strategy_data_p", "NEW-ROOT-STRATEGY-DATA-P", 1, 0, false); new $new_root_strategy_data_p$UnaryFunction();
    declareFunction(myName, "nr_strat_data_new_root_index", "NR-STRAT-DATA-NEW-ROOT-INDEX", 1, 0, false);
    declareFunction(myName, "_csetf_nr_strat_data_new_root_index", "_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX", 2, 0, false);
    declareFunction(myName, "make_new_root_strategy_data", "MAKE-NEW-ROOT-STRATEGY-DATA", 0, 1, false);
    declareFunction(myName, "new_new_root_strategy_data", "NEW-NEW-ROOT-STRATEGY-DATA", 1, 0, false);
    declareFunction(myName, "new_root_strategy_new_root_index", "NEW-ROOT-STRATEGY-NEW-ROOT-INDEX", 1, 0, false);
    declareFunction(myName, "new_root_strategy_problem_activeP", "NEW-ROOT-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
    declareFunction(myName, "new_root_strategy_peek_new_root", "NEW-ROOT-STRATEGY-PEEK-NEW-ROOT", 1, 0, false);
    declareFunction(myName, "new_root_strategy_note_problem_motivated", "NEW-ROOT-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
    declareFunction(myName, "new_root_strategy_add_new_root", "NEW-ROOT-STRATEGY-ADD-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "new_root_strategy_pop_new_root", "NEW-ROOT-STRATEGY-POP-NEW-ROOT", 1, 0, false);
    declareFunction(myName, "new_root_strategy_no_new_rootsP", "NEW-ROOT-STRATEGY-NO-NEW-ROOTS?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_new_root_tactician_datastructures_file() {
    $dtp_new_root_strategy_data$ = defconstant("*DTP-NEW-ROOT-STRATEGY-DATA*", $sym0$NEW_ROOT_STRATEGY_DATA);
    return NIL;
  }

  public static final SubLObject setup_new_root_tactician_datastructures_file() {
    // CVS_ID("Id: inference-new-root-tactician-datastructures.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_new_root_strategy_data$.getGlobalValue(), Symbols.symbol_function($sym7$NEW_ROOT_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$NR_STRAT_DATA_NEW_ROOT_INDEX, $sym9$_CSETF_NR_STRAT_DATA_NEW_ROOT_INDEX);
    Equality.identity($sym0$NEW_ROOT_STRATEGY_DATA);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$NEW_ROOT_STRATEGY_DATA = makeSymbol("NEW-ROOT-STRATEGY-DATA");
  public static final SubLSymbol $sym1$NEW_ROOT_STRATEGY_DATA_P = makeSymbol("NEW-ROOT-STRATEGY-DATA-P");
  public static final SubLList $list2 = list(makeSymbol("NEW-ROOT-INDEX"));
  public static final SubLList $list3 = list(makeKeyword("NEW-ROOT-INDEX"));
  public static final SubLList $list4 = list(makeSymbol("NR-STRAT-DATA-NEW-ROOT-INDEX"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX"));
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$NEW_ROOT_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NEW-ROOT-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$NR_STRAT_DATA_NEW_ROOT_INDEX = makeSymbol("NR-STRAT-DATA-NEW-ROOT-INDEX");
  public static final SubLSymbol $sym9$_CSETF_NR_STRAT_DATA_NEW_ROOT_INDEX = makeSymbol("_CSETF-NR-STRAT-DATA-NEW-ROOT-INDEX");
  public static final SubLSymbol $kw10$NEW_ROOT_INDEX = makeKeyword("NEW-ROOT-INDEX");
  public static final SubLString $str11$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym12$NEW_ROOT_STRATEGY_P = makeSymbol("NEW-ROOT-STRATEGY-P");
  public static final SubLSymbol $sym13$PROBLEM_P = makeSymbol("PROBLEM-P");

  //// Initializers

  public void declareFunctions() {
    declare_new_root_tactician_datastructures_file();
  }

  public void initializeVariables() {
    init_new_root_tactician_datastructures_file();
  }

  public void runTopLevelForms() {
    setup_new_root_tactician_datastructures_file();
  }

}
