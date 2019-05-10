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

package com.cyc.cycjava_1.cycl.inference.modules.removal;
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
//dm import com.cyc.cycjava_1.cycl.backward_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
//dm import com.cyc.cycjava_1.cycl.relation_evaluation;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_evaluation;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class removal_modules_different extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_different() {}
  public static final SubLFile me = new removal_modules_different();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_different";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 548) 
  private static SubLSymbol $default_different_duplicate_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 670) 
  public static final SubLObject asent_duplicate_args_p(SubLObject asent) {
    return list_utilities.duplicatesP(cycl_utilities.atomic_sentence_args(asent, UNPROVIDED), Symbols.symbol_function(EQUAL), UNPROVIDED);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-different.lisp", position = 2329) 
  public static final SubLObject removal_different_duplicate_exclusive(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return asent_duplicate_args_p(asent);
  }

  public static final class $removal_different_duplicate_exclusive$UnaryFunction extends UnaryFunction {
    public $removal_different_duplicate_exclusive$UnaryFunction() { super(extractFunctionNamed("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE")); }
    public SubLObject processItem(SubLObject arg1) { return removal_different_duplicate_exclusive(arg1, UNPROVIDED); }
  }

  public static final class $removal_different_duplicate_exclusive$BinaryFunction extends BinaryFunction {
    public $removal_different_duplicate_exclusive$BinaryFunction() { super(extractFunctionNamed("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_different_duplicate_exclusive(arg1, arg2); }
  }

  public static final SubLObject declare_removal_modules_different_file() {
    declareFunction(myName, "asent_duplicate_args_p", "ASENT-DUPLICATE-ARGS-P", 1, 0, false);
    declareFunction(myName, "make_binary_different_eval_support", "MAKE-BINARY-DIFFERENT-EVAL-SUPPORT", 2, 0, false);
    declareFunction(myName, "different_delay_pos_preference", "DIFFERENT-DELAY-POS-PREFERENCE", 3, 0, false);
    declareFunction(myName, "removal_different_duplicate_exclusive", "REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE", 1, 1, false); new $removal_different_duplicate_exclusive$UnaryFunction(); new $removal_different_duplicate_exclusive$BinaryFunction();
    declareFunction(myName, "different_symbols_delay_pos_preference", "DIFFERENT-SYMBOLS-DELAY-POS-PREFERENCE", 3, 0, false);
    declareFunction(myName, "removal_different_symbols_duplicate_exclusive", "REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE", 1, 1, false);
    declareFunction(myName, "cyc_possibly_evaluate", "CYC-POSSIBLY-EVALUATE", 1, 0, false);
    declareFunction(myName, "cyc_possibly_evaluate_args", "CYC-POSSIBLY-EVALUATE-ARGS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_different_file() {
    $default_different_duplicate_cost$ = defparameter("*DEFAULT-DIFFERENT-DUPLICATE-COST*", ZERO_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_removal_modules_different_file() {
    // CVS_ID("Id: removal-modules-different.lisp 126640 2008-12-04 13:39:36Z builder ");
    inference_modules.register_solely_specific_removal_module_predicate($const0$different);
    inference_modules.inference_removal_module_use_generic($const0$different, $kw1$REMOVAL_EVAL);
    inference_modules.inference_removal_module_use_generic($const0$different, $kw2$REMOVAL_NOT_EVAL);
    preference_modules.inference_preference_module($kw3$DIFFERENT_DELAY_POS, $list4);
    utilities_macros.note_funcall_helper_function($sym8$DIFFERENT_DELAY_POS_PREFERENCE);
    inference_modules.inference_removal_module($kw9$REMOVAL_DIFFERENT_DUPLICATE, $list10);
    inference_modules.register_solely_specific_removal_module_predicate($const11$differentSymbols);
    inference_modules.inference_removal_module_use_generic($const11$differentSymbols, $kw1$REMOVAL_EVAL);
    inference_modules.inference_removal_module_use_generic($const11$differentSymbols, $kw2$REMOVAL_NOT_EVAL);
    inference_modules.inference_removal_module_use_meta_removal($const11$differentSymbols, $kw12$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
    inference_modules.inference_removal_module_use_meta_removal($const11$differentSymbols, $kw13$META_REMOVAL_COMPLETELY_DECIDABLE_POS);
    preference_modules.inference_preference_module($kw14$DIFFERENT_SYMBOLS_DELAY_POS, $list15);
    utilities_macros.note_funcall_helper_function($sym16$DIFFERENT_SYMBOLS_DELAY_POS_PREFERENCE);
    inference_modules.inference_removal_module($kw17$REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE, $list18);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$different = constant_handles.reader_make_constant_shell(makeString("different"));
  public static final SubLSymbol $kw1$REMOVAL_EVAL = makeKeyword("REMOVAL-EVAL");
  public static final SubLSymbol $kw2$REMOVAL_NOT_EVAL = makeKeyword("REMOVAL-NOT-EVAL");
  public static final SubLSymbol $kw3$DIFFERENT_DELAY_POS = makeKeyword("DIFFERENT-DELAY-POS");
  public static final SubLList $list4 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("different")), makeKeyword("REQUIRED-PATTERN"), cons(constant_handles.reader_make_constant_shell(makeString("different")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("DIFFERENT-DELAY-POS-PREFERENCE"));
  public static final SubLSymbol $sym5$HL_VARIABLE_P = makeSymbol("HL-VARIABLE-P");
  public static final SubLSymbol $kw6$DISALLOWED = makeKeyword("DISALLOWED");
  public static final SubLSymbol $kw7$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLSymbol $sym8$DIFFERENT_DELAY_POS_PREFERENCE = makeSymbol("DIFFERENT-DELAY-POS-PREFERENCE");
  public static final SubLSymbol $kw9$REMOVAL_DIFFERENT_DUPLICATE = makeKeyword("REMOVAL-DIFFERENT-DUPLICATE");
  public static final SubLList $list10 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("different")), makeKeyword("REQUIRED-PATTERN"), cons(constant_handles.reader_make_constant_shell(makeString("different")), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-DIFFERENT-DUPLICATE-EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE")});
  public static final SubLObject $const11$differentSymbols = constant_handles.reader_make_constant_shell(makeString("differentSymbols"));
  public static final SubLSymbol $kw12$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
  public static final SubLSymbol $kw13$META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
  public static final SubLSymbol $kw14$DIFFERENT_SYMBOLS_DELAY_POS = makeKeyword("DIFFERENT-SYMBOLS-DELAY-POS");
  public static final SubLList $list15 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("differentSymbols")), makeKeyword("REQUIRED-PATTERN"), cons(constant_handles.reader_make_constant_shell(makeString("differentSymbols")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("DIFFERENT-SYMBOLS-DELAY-POS-PREFERENCE"));
  public static final SubLSymbol $sym16$DIFFERENT_SYMBOLS_DELAY_POS_PREFERENCE = makeSymbol("DIFFERENT-SYMBOLS-DELAY-POS-PREFERENCE");
  public static final SubLSymbol $kw17$REMOVAL_DIFFERENT_SYMBOLS_DUPLICATE = makeKeyword("REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE");
  public static final SubLList $list18 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("differentSymbols")), makeKeyword("REQUIRED-PATTERN"), cons(constant_handles.reader_make_constant_shell(makeString("differentSymbols")), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-DIFFERENT-SYMBOLS-DUPLICATE-EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DIFFERENT-DUPLICATE-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE")});

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_different_file();
  }

  public void initializeVariables() {
    init_removal_modules_different_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_different_file();
  }

}
