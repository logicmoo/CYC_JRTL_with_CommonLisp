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

package  com.cyc.cycjava_1.cycl.inference.modules.removal;

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
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.backward;
import com.cyc.cycjava_1.cycl.cardinality_estimates;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.genl_predicates;
import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
import com.cyc.cycjava_1.cycl.iteration;

public  final class removal_modules_genlpreds extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_genlpreds() {}
  public static final SubLFile me = new removal_modules_genlpreds();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_genlpreds";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 525) 
  private static SubLSymbol $default_genlpreds_check_cost$ = null;

  public static final class $removal_genlpreds_check_expand$UnaryFunction extends UnaryFunction {
    public $removal_genlpreds_check_expand$UnaryFunction() { super(extractFunctionNamed("REMOVAL-GENLPREDS-CHECK-EXPAND")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32835"); }
  }

  public static final class $removal_genlpreds_check_expand$BinaryFunction extends BinaryFunction {
    public $removal_genlpreds_check_expand$BinaryFunction() { super(extractFunctionNamed("REMOVAL-GENLPREDS-CHECK-EXPAND")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32836"); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds.lisp", position = 3452) 
  private static SubLSymbol $default_not_genlpreds_check_cost$ = null;

  public static final SubLObject declare_removal_modules_genlpreds_file() {
    declareFunction(myName, "removal_genlpreds_check_expand", "REMOVAL-GENLPREDS-CHECK-EXPAND", 1, 1, false); new $removal_genlpreds_check_expand$UnaryFunction(); new $removal_genlpreds_check_expand$BinaryFunction();
    declareFunction(myName, "removal_all_genlpreds_cost", "REMOVAL-ALL-GENLPREDS-COST", 1, 1, false);
    declareFunction(myName, "removal_all_genlpreds_iterator", "REMOVAL-ALL-GENLPREDS-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_all_spec_preds_cost", "REMOVAL-ALL-SPEC-PREDS-COST", 1, 1, false);
    declareFunction(myName, "removal_all_spec_preds_iterator", "REMOVAL-ALL-SPEC-PREDS-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_not_genlpreds_check_expand", "REMOVAL-NOT-GENLPREDS-CHECK-EXPAND", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_genlpreds_file() {
    $default_genlpreds_check_cost$ = defparameter("*DEFAULT-GENLPREDS-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
    $default_not_genlpreds_check_cost$ = defparameter("*DEFAULT-NOT-GENLPREDS-CHECK-COST*", TWO_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_removal_modules_genlpreds_file() {
    // CVS_ID("Id: removal-modules-genlpreds.lisp 126640 2008-12-04 13:39:36Z builder ");
    inference_modules.inference_removal_module($kw2$REMOVAL_GENLPREDS_CHECK, $list3);
    inference_modules.inference_removal_module($kw4$REMOVAL_ALL_GENLPREDS, $list5);
    inference_modules.inference_removal_module($kw6$REMOVAL_ALL_SPEC_PREDS, $list7);
    inference_modules.inference_removal_module($kw9$REMOVAL_NOT_GENLPREDS_CHECK, $list10);
    inference_modules.register_solely_specific_removal_module_predicate($const11$genlPreds);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("SPEC-PRED"), makeSymbol("GENL-PRED"));
  public static final SubLSymbol $kw1$GENLPREDS = makeKeyword("GENLPREDS");
  public static final SubLSymbol $kw2$REMOVAL_GENLPREDS_CHECK = makeKeyword("REMOVAL-GENLPREDS-CHECK");
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-GENLPREDS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLPREDS-CHECK-EXPAND")});
  public static final SubLSymbol $kw4$REMOVAL_ALL_GENLPREDS = makeKeyword("REMOVAL-ALL-GENLPREDS");
  public static final SubLList $list5 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("PREDICATE-FORT"), makeKeyword("VARIABLE")), makeKeyword("COST"), makeSymbol("REMOVAL-ALL-GENLPREDS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), list(makeKeyword("BIND"), makeSymbol("SPEC-PRED")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-GENLPREDS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), list(makeKeyword("VALUE"), makeSymbol("SPEC-PRED")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlPreds <predicate-fort> <variable>)"), makeKeyword("EXAMPLE"), makeString("(#$genlPreds #$performedBy ?WHAT)")});
  public static final SubLSymbol $kw6$REMOVAL_ALL_SPEC_PREDS = makeKeyword("REMOVAL-ALL-SPEC-PREDS");
  public static final SubLList $list7 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("VARIABLE"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-ALL-SPEC-PREDS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("GENL-PRED"))), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-SPEC-PREDS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("GENL-PRED"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLPREDS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genlPreds <variable> <predicate-fort>"), makeKeyword("EXAMPLE"), makeString("(#$genlPreds ?WHAT #$performedBy)")});
  public static final SubLSymbol $kw8$MINIMIZE = makeKeyword("MINIMIZE");
  public static final SubLSymbol $kw9$REMOVAL_NOT_GENLPREDS_CHECK = makeKeyword("REMOVAL-NOT-GENLPREDS-CHECK");
  public static final SubLList $list10 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("PREDICATE-FORT"), makeKeyword("PREDICATE-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-GENLPREDS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-GENLPREDS-CHECK-EXPAND")});
  public static final SubLObject $const11$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_genlpreds_file();
  }

  public void initializeVariables() {
    init_removal_modules_genlpreds_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_genlpreds_file();
  }

}
