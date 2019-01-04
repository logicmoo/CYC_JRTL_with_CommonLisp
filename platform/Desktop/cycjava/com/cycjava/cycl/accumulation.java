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

package  com.cyc.cycjava.cycl;

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
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class accumulation extends SubLTranslatedFile {

  //// Constructor

  private accumulation() {}
  public static final SubLFile me = new accumulation();
  public static final String myName = "com.cyc.cycjava.cycl.accumulation";

  //// Definitions

  public static final class $accumulator_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $state; }
    public SubLObject getField3() { return $reset_fn; }
    public SubLObject getField4() { return $add_fn; }
    public SubLObject getField5() { return $add_all_fn; }
    public SubLObject getField6() { return $size_fn; }
    public SubLObject getField7() { return $contents_fn; }
    public SubLObject getField8() { return $iterator_fn; }
    public SubLObject setField2(SubLObject value) { return $state = value; }
    public SubLObject setField3(SubLObject value) { return $reset_fn = value; }
    public SubLObject setField4(SubLObject value) { return $add_fn = value; }
    public SubLObject setField5(SubLObject value) { return $add_all_fn = value; }
    public SubLObject setField6(SubLObject value) { return $size_fn = value; }
    public SubLObject setField7(SubLObject value) { return $contents_fn = value; }
    public SubLObject setField8(SubLObject value) { return $iterator_fn = value; }
    public SubLObject $state = NIL;
    public SubLObject $reset_fn = NIL;
    public SubLObject $add_fn = NIL;
    public SubLObject $add_all_fn = NIL;
    public SubLObject $size_fn = NIL;
    public SubLObject $contents_fn = NIL;
    public SubLObject $iterator_fn = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($accumulator_native.class, $sym0$ACCUMULATOR, $sym1$ACCUMULATOR_P, $list2, $list3, new String[] {"$state", "$reset_fn", "$add_fn", "$add_all_fn", "$size_fn", "$contents_fn", "$iterator_fn"}, $list4, $list5, $sym6$PRINT_ACCUMULATOR);
  }

  @SubL(source = "cycl/accumulation.lisp", position = 1708) 
  public static SubLSymbol $dtp_accumulator$ = null;

  @SubL(source = "cycl/accumulation.lisp", position = 1708) 
  public static final SubLObject accumulator_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30206");
    return NIL;
  }

  public static final class $accumulator_p$UnaryFunction extends UnaryFunction {
    public $accumulator_p$UnaryFunction() { super(extractFunctionNamed("ACCUMULATOR-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30186"); }
  }

  public static final SubLObject declare_accumulation_file() {
    declareFunction(myName, "accumulator_print_function_trampoline", "ACCUMULATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "accumulator_p", "ACCUMULATOR-P", 1, 0, false); new $accumulator_p$UnaryFunction();
    declareFunction(myName, "acc_state", "ACC-STATE", 1, 0, false);
    declareFunction(myName, "acc_reset_fn", "ACC-RESET-FN", 1, 0, false);
    declareFunction(myName, "acc_add_fn", "ACC-ADD-FN", 1, 0, false);
    declareFunction(myName, "acc_add_all_fn", "ACC-ADD-ALL-FN", 1, 0, false);
    declareFunction(myName, "acc_size_fn", "ACC-SIZE-FN", 1, 0, false);
    declareFunction(myName, "acc_contents_fn", "ACC-CONTENTS-FN", 1, 0, false);
    declareFunction(myName, "acc_iterator_fn", "ACC-ITERATOR-FN", 1, 0, false);
    declareFunction(myName, "_csetf_acc_state", "_CSETF-ACC-STATE", 2, 0, false);
    declareFunction(myName, "_csetf_acc_reset_fn", "_CSETF-ACC-RESET-FN", 2, 0, false);
    declareFunction(myName, "_csetf_acc_add_fn", "_CSETF-ACC-ADD-FN", 2, 0, false);
    declareFunction(myName, "_csetf_acc_add_all_fn", "_CSETF-ACC-ADD-ALL-FN", 2, 0, false);
    declareFunction(myName, "_csetf_acc_size_fn", "_CSETF-ACC-SIZE-FN", 2, 0, false);
    declareFunction(myName, "_csetf_acc_contents_fn", "_CSETF-ACC-CONTENTS-FN", 2, 0, false);
    declareFunction(myName, "_csetf_acc_iterator_fn", "_CSETF-ACC-ITERATOR-FN", 2, 0, false);
    declareFunction(myName, "make_accumulator", "MAKE-ACCUMULATOR", 0, 1, false);
    declareFunction(myName, "print_accumulator", "PRINT-ACCUMULATOR", 3, 0, false);
    declareFunction(myName, "new_accumulator", "NEW-ACCUMULATOR", 6, 1, false);
    declareFunction(myName, "accumulation_reset", "ACCUMULATION-RESET", 1, 0, false);
    declareFunction(myName, "accumulation_add", "ACCUMULATION-ADD", 2, 0, false);
    declareFunction(myName, "accumulation_add_all", "ACCUMULATION-ADD-ALL", 2, 0, false);
    declareFunction(myName, "accumulation_size", "ACCUMULATION-SIZE", 1, 0, false);
    declareFunction(myName, "accumulation_empty_p", "ACCUMULATION-EMPTY-P", 1, 0, false);
    declareFunction(myName, "accumulation_contents", "ACCUMULATION-CONTENTS", 1, 1, false);
    declareFunction(myName, "accumulation_contents_destructively", "ACCUMULATION-CONTENTS-DESTRUCTIVELY", 1, 0, false);
    declareFunction(myName, "accumulation_iterator", "ACCUMULATION-ITERATOR", 1, 0, false);
    declareMacro(myName, "do_accumulator_contents", "DO-ACCUMULATOR-CONTENTS");
    declareFunction(myName, "map_accumulator_contents", "MAP-ACCUMULATOR-CONTENTS", 2, 0, false);
    declareFunction(myName, "default_accumulation_add_all", "DEFAULT-ACCUMULATION-ADD-ALL", 2, 0, false);
    declareFunction(myName, "accumulation_peek_state", "ACCUMULATION-PEEK-STATE", 1, 0, false);
    declareFunction(myName, "new_list_accumulator", "NEW-LIST-ACCUMULATOR", 0, 1, false);
    declareFunction(myName, "list_accumulator_reset", "LIST-ACCUMULATOR-RESET", 1, 0, false);
    declareFunction(myName, "list_accumulator_add", "LIST-ACCUMULATOR-ADD", 2, 0, false);
    declareFunction(myName, "list_accumulator_size", "LIST-ACCUMULATOR-SIZE", 1, 0, false);
    declareFunction(myName, "list_accumulator_contents", "LIST-ACCUMULATOR-CONTENTS", 1, 1, false);
    declareFunction(myName, "list_accumulator_iterator", "LIST-ACCUMULATOR-ITERATOR", 1, 0, false);
    declareFunction(myName, "test_list_accumulator", "TEST-LIST-ACCUMULATOR", 1, 0, false);
    declareFunction(myName, "new_set_accumulator", "NEW-SET-ACCUMULATOR", 0, 1, false);
    declareFunction(myName, "set_accumulator_reset", "SET-ACCUMULATOR-RESET", 1, 0, false);
    declareFunction(myName, "set_accumulator_add", "SET-ACCUMULATOR-ADD", 2, 0, false);
    declareFunction(myName, "set_accumulator_size", "SET-ACCUMULATOR-SIZE", 1, 0, false);
    declareFunction(myName, "set_accumulator_contents", "SET-ACCUMULATOR-CONTENTS", 1, 1, false);
    declareFunction(myName, "set_accumulator_iterator", "SET-ACCUMULATOR-ITERATOR", 1, 0, false);
    declareFunction(myName, "test_set_accumulator", "TEST-SET-ACCUMULATOR", 2, 0, false);
    declareFunction(myName, "new_dictionary_accumulator", "NEW-DICTIONARY-ACCUMULATOR", 0, 1, false);
    declareFunction(myName, "new_dictionary_accumulator_tuple", "NEW-DICTIONARY-ACCUMULATOR-TUPLE", 2, 0, false);
    declareFunction(myName, "dictionary_accumulator_tuple_key", "DICTIONARY-ACCUMULATOR-TUPLE-KEY", 1, 0, false);
    declareFunction(myName, "dictionary_accumulator_tuple_value", "DICTIONARY-ACCUMULATOR-TUPLE-VALUE", 1, 0, false);
    declareFunction(myName, "dictionary_accumulator_reset", "DICTIONARY-ACCUMULATOR-RESET", 1, 0, false);
    declareFunction(myName, "dictionary_accumulator_add", "DICTIONARY-ACCUMULATOR-ADD", 2, 0, false);
    declareFunction(myName, "dictionary_accumulator_size", "DICTIONARY-ACCUMULATOR-SIZE", 1, 0, false);
    declareFunction(myName, "dictionary_accumulator_contents", "DICTIONARY-ACCUMULATOR-CONTENTS", 1, 1, false);
    declareFunction(myName, "dictionary_accumulator_iterator", "DICTIONARY-ACCUMULATOR-ITERATOR", 1, 0, false);
    declareFunction(myName, "test_dictionary_accumulator", "TEST-DICTIONARY-ACCUMULATOR", 2, 0, false);
    declareFunction(myName, "new_null_accumulator", "NEW-NULL-ACCUMULATOR", 0, 0, false);
    declareFunction(myName, "new_null_iterator_dummy", "NEW-NULL-ITERATOR-DUMMY", 1, 0, false);
    declareFunction(myName, "test_null_accumulator", "TEST-NULL-ACCUMULATOR", 1, 0, false);
    declareFunction(myName, "new_numeric_accumulator", "NEW-NUMERIC-ACCUMULATOR", 2, 0, false);
    declareFunction(myName, "numeric_accumulation_iterator", "NUMERIC-ACCUMULATION-ITERATOR", 1, 0, false);
    declareFunction(myName, "numeric_accumulator_size_fn", "NUMERIC-ACCUMULATOR-SIZE-FN", 1, 0, false);
    declareFunction(myName, "numeric_contents_fn_default_zero", "NUMERIC-CONTENTS-FN-DEFAULT-ZERO", 1, 1, false);
    declareFunction(myName, "numeric_contents_fn_default_one", "NUMERIC-CONTENTS-FN-DEFAULT-ONE", 1, 1, false);
    declareFunction(myName, "new_sum_accumulator", "NEW-SUM-ACCUMULATOR", 0, 0, false);
    declareFunction(myName, "dwimmed_sum", "DWIMMED-SUM", 2, 0, false);
    declareFunction(myName, "test_sum_accumulator", "TEST-SUM-ACCUMULATOR", 1, 0, false);
    declareFunction(myName, "new_count_accumulator", "NEW-COUNT-ACCUMULATOR", 0, 0, false);
    declareFunction(myName, "dwimmed_increment", "DWIMMED-INCREMENT", 2, 0, false);
    declareFunction(myName, "test_count_accumulator", "TEST-COUNT-ACCUMULATOR", 1, 0, false);
    declareFunction(myName, "new_product_accumulator", "NEW-PRODUCT-ACCUMULATOR", 0, 0, false);
    declareFunction(myName, "dwimmed_product", "DWIMMED-PRODUCT", 2, 0, false);
    declareFunction(myName, "test_product_accumulator", "TEST-PRODUCT-ACCUMULATOR", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_accumulation_file() {
    $dtp_accumulator$ = defconstant("*DTP-ACCUMULATOR*", $sym0$ACCUMULATOR);
    return NIL;
  }

  public static final SubLObject setup_accumulation_file() {
    // CVS_ID("Id: accumulation.lisp 127702 2009-04-23 16:39:29Z rck ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_accumulator$.getGlobalValue(), Symbols.symbol_function($sym7$ACCUMULATOR_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$ACC_STATE, $sym9$_CSETF_ACC_STATE);
    Structures.def_csetf($sym10$ACC_RESET_FN, $sym11$_CSETF_ACC_RESET_FN);
    Structures.def_csetf($sym12$ACC_ADD_FN, $sym13$_CSETF_ACC_ADD_FN);
    Structures.def_csetf($sym14$ACC_ADD_ALL_FN, $sym15$_CSETF_ACC_ADD_ALL_FN);
    Structures.def_csetf($sym16$ACC_SIZE_FN, $sym17$_CSETF_ACC_SIZE_FN);
    Structures.def_csetf($sym18$ACC_CONTENTS_FN, $sym19$_CSETF_ACC_CONTENTS_FN);
    Structures.def_csetf($sym20$ACC_ITERATOR_FN, $sym21$_CSETF_ACC_ITERATOR_FN);
    Equality.identity($sym0$ACCUMULATOR);
    utilities_macros.note_funcall_helper_function($sym80$NUMERIC_ACCUMULATION_ITERATOR);
    utilities_macros.note_funcall_helper_function($sym79$NUMERIC_ACCUMULATOR_SIZE_FN);
    utilities_macros.note_funcall_helper_function($sym81$NUMERIC_CONTENTS_FN_DEFAULT_ZERO);
    utilities_macros.note_funcall_helper_function($sym82$NUMERIC_CONTENTS_FN_DEFAULT_ONE);
    generic_testing.define_test_case_table_int($sym96$TEST_LIST_ACCUMULATOR, list(new SubLObject[] {$kw97$TEST, NIL, $kw98$OWNER, NIL, $kw99$CLASSES, NIL, $kw100$KB, $kw101$TINY, $kw102$WORKING_, T}), $list103);
    generic_testing.define_test_case_table_int($sym104$TEST_SET_ACCUMULATOR, list(new SubLObject[] {$kw97$TEST, NIL, $kw98$OWNER, NIL, $kw99$CLASSES, NIL, $kw100$KB, $kw101$TINY, $kw102$WORKING_, T}), $list105);
    generic_testing.define_test_case_table_int($sym106$TEST_DICTIONARY_ACCUMULATOR, list(new SubLObject[] {$kw97$TEST, NIL, $kw98$OWNER, NIL, $kw99$CLASSES, NIL, $kw100$KB, $kw101$TINY, $kw102$WORKING_, T}), $list107);
    generic_testing.define_test_case_table_int($sym108$TEST_NULL_ACCUMULATOR, list(new SubLObject[] {$kw97$TEST, NIL, $kw98$OWNER, NIL, $kw99$CLASSES, NIL, $kw100$KB, $kw101$TINY, $kw102$WORKING_, T}), $list109);
    generic_testing.define_test_case_table_int($sym110$TEST_SUM_ACCUMULATOR, list(new SubLObject[] {$kw97$TEST, NIL, $kw98$OWNER, NIL, $kw99$CLASSES, NIL, $kw100$KB, $kw101$TINY, $kw102$WORKING_, T}), $list111);
    generic_testing.define_test_case_table_int($sym112$TEST_COUNT_ACCUMULATOR, list(new SubLObject[] {$kw97$TEST, NIL, $kw98$OWNER, NIL, $kw99$CLASSES, NIL, $kw100$KB, $kw101$TINY, $kw102$WORKING_, T}), $list109);
    generic_testing.define_test_case_table_int($sym113$TEST_PRODUCT_ACCUMULATOR, list(new SubLObject[] {$kw97$TEST, NIL, $kw98$OWNER, NIL, $kw99$CLASSES, NIL, $kw100$KB, $kw101$TINY, $kw102$WORKING_, T}), $list114);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$ACCUMULATOR = makeSymbol("ACCUMULATOR");
  public static final SubLSymbol $sym1$ACCUMULATOR_P = makeSymbol("ACCUMULATOR-P");
  public static final SubLList $list2 = list(makeSymbol("STATE"), makeSymbol("RESET-FN"), makeSymbol("ADD-FN"), makeSymbol("ADD-ALL-FN"), makeSymbol("SIZE-FN"), makeSymbol("CONTENTS-FN"), makeSymbol("ITERATOR-FN"));
  public static final SubLList $list3 = list(makeKeyword("STATE"), makeKeyword("RESET-FN"), makeKeyword("ADD-FN"), makeKeyword("ADD-ALL-FN"), makeKeyword("SIZE-FN"), makeKeyword("CONTENTS-FN"), makeKeyword("ITERATOR-FN"));
  public static final SubLList $list4 = list(makeSymbol("ACC-STATE"), makeSymbol("ACC-RESET-FN"), makeSymbol("ACC-ADD-FN"), makeSymbol("ACC-ADD-ALL-FN"), makeSymbol("ACC-SIZE-FN"), makeSymbol("ACC-CONTENTS-FN"), makeSymbol("ACC-ITERATOR-FN"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-ACC-STATE"), makeSymbol("_CSETF-ACC-RESET-FN"), makeSymbol("_CSETF-ACC-ADD-FN"), makeSymbol("_CSETF-ACC-ADD-ALL-FN"), makeSymbol("_CSETF-ACC-SIZE-FN"), makeSymbol("_CSETF-ACC-CONTENTS-FN"), makeSymbol("_CSETF-ACC-ITERATOR-FN"));
  public static final SubLSymbol $sym6$PRINT_ACCUMULATOR = makeSymbol("PRINT-ACCUMULATOR");
  public static final SubLSymbol $sym7$ACCUMULATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ACCUMULATOR-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$ACC_STATE = makeSymbol("ACC-STATE");
  public static final SubLSymbol $sym9$_CSETF_ACC_STATE = makeSymbol("_CSETF-ACC-STATE");
  public static final SubLSymbol $sym10$ACC_RESET_FN = makeSymbol("ACC-RESET-FN");
  public static final SubLSymbol $sym11$_CSETF_ACC_RESET_FN = makeSymbol("_CSETF-ACC-RESET-FN");
  public static final SubLSymbol $sym12$ACC_ADD_FN = makeSymbol("ACC-ADD-FN");
  public static final SubLSymbol $sym13$_CSETF_ACC_ADD_FN = makeSymbol("_CSETF-ACC-ADD-FN");
  public static final SubLSymbol $sym14$ACC_ADD_ALL_FN = makeSymbol("ACC-ADD-ALL-FN");
  public static final SubLSymbol $sym15$_CSETF_ACC_ADD_ALL_FN = makeSymbol("_CSETF-ACC-ADD-ALL-FN");
  public static final SubLSymbol $sym16$ACC_SIZE_FN = makeSymbol("ACC-SIZE-FN");
  public static final SubLSymbol $sym17$_CSETF_ACC_SIZE_FN = makeSymbol("_CSETF-ACC-SIZE-FN");
  public static final SubLSymbol $sym18$ACC_CONTENTS_FN = makeSymbol("ACC-CONTENTS-FN");
  public static final SubLSymbol $sym19$_CSETF_ACC_CONTENTS_FN = makeSymbol("_CSETF-ACC-CONTENTS-FN");
  public static final SubLSymbol $sym20$ACC_ITERATOR_FN = makeSymbol("ACC-ITERATOR-FN");
  public static final SubLSymbol $sym21$_CSETF_ACC_ITERATOR_FN = makeSymbol("_CSETF-ACC-ITERATOR-FN");
  public static final SubLSymbol $kw22$STATE = makeKeyword("STATE");
  public static final SubLSymbol $kw23$RESET_FN = makeKeyword("RESET-FN");
  public static final SubLSymbol $kw24$ADD_FN = makeKeyword("ADD-FN");
  public static final SubLSymbol $kw25$ADD_ALL_FN = makeKeyword("ADD-ALL-FN");
  public static final SubLSymbol $kw26$SIZE_FN = makeKeyword("SIZE-FN");
  public static final SubLSymbol $kw27$CONTENTS_FN = makeKeyword("CONTENTS-FN");
  public static final SubLSymbol $kw28$ITERATOR_FN = makeKeyword("ITERATOR-FN");
  public static final SubLString $str29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str30$__ = makeString("#<");
  public static final SubLSymbol $kw31$STREAM = makeKeyword("STREAM");
  public static final SubLString $str32$empty = makeString("empty");
  public static final SubLString $str33$_A_elems = makeString("~A elems");
  public static final SubLSymbol $kw34$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym35$DEFAULT_ACCUMULATION_ADD_ALL = makeSymbol("DEFAULT-ACCUMULATION-ADD-ALL");
  public static final SubLSymbol $sym36$LISTP = makeSymbol("LISTP");
  public static final SubLString $str37$Implementation_Error__Accumulator = makeString("Implementation Error: Accumulator ~A has an invalid size function.");
  public static final SubLList $list38 = list(list(makeSymbol("VALUE"), makeSymbol("ACCUMULATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list39 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw40$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw41$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym42$ITERATOR_VAR = makeUninternedSymbol("ITERATOR-VAR");
  public static final SubLSymbol $sym43$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym44$ACCUMULATION_ITERATOR = makeSymbol("ACCUMULATION-ITERATOR");
  public static final SubLSymbol $sym45$DO_ITERATOR = makeSymbol("DO-ITERATOR");
  public static final SubLSymbol $sym46$LIST_ACCUMULATOR_RESET = makeSymbol("LIST-ACCUMULATOR-RESET");
  public static final SubLSymbol $sym47$LIST_ACCUMULATOR_ADD = makeSymbol("LIST-ACCUMULATOR-ADD");
  public static final SubLSymbol $sym48$LIST_ACCUMULATOR_SIZE = makeSymbol("LIST-ACCUMULATOR-SIZE");
  public static final SubLSymbol $sym49$LIST_ACCUMULATOR_CONTENTS = makeSymbol("LIST-ACCUMULATOR-CONTENTS");
  public static final SubLSymbol $sym50$LIST_ACCUMULATOR_ITERATOR = makeSymbol("LIST-ACCUMULATOR-ITERATOR");
  public static final SubLString $str51$New_list_accumulator__A_is_not_em = makeString("New list accumulator ~A is not empty?");
  public static final SubLString $str52$Accumulator_should_have__A_elemen = makeString("Accumulator should have ~A elements but has ~A.~%");
  public static final SubLString $str53$Mismatch_between_iterator_content = makeString("Mismatch between iterator contents of ~A and input list!");
  public static final SubLString $str54$Accumulator__A_contains_less_item = makeString("Accumulator ~A contains less items than the input iterator has!");
  public static final SubLString $str55$Destructively_emptied_accumulator = makeString("Destructively emptied accumulator ~A is not empty?");
  public static final SubLSymbol $sym56$SET_ACCUMULATOR_RESET = makeSymbol("SET-ACCUMULATOR-RESET");
  public static final SubLSymbol $sym57$SET_ACCUMULATOR_ADD = makeSymbol("SET-ACCUMULATOR-ADD");
  public static final SubLSymbol $sym58$SET_ACCUMULATOR_SIZE = makeSymbol("SET-ACCUMULATOR-SIZE");
  public static final SubLSymbol $sym59$SET_ACCUMULATOR_CONTENTS = makeSymbol("SET-ACCUMULATOR-CONTENTS");
  public static final SubLSymbol $sym60$SET_ACCUMULATOR_ITERATOR = makeSymbol("SET-ACCUMULATOR-ITERATOR");
  public static final SubLString $str61$New_set_accumulator__A_is_not_emp = makeString("New set accumulator ~A is not empty?");
  public static final SubLSymbol $sym62$DICTIONARY_ACCUMULATOR_RESET = makeSymbol("DICTIONARY-ACCUMULATOR-RESET");
  public static final SubLSymbol $sym63$DICTIONARY_ACCUMULATOR_ADD = makeSymbol("DICTIONARY-ACCUMULATOR-ADD");
  public static final SubLSymbol $sym64$DICTIONARY_ACCUMULATOR_SIZE = makeSymbol("DICTIONARY-ACCUMULATOR-SIZE");
  public static final SubLSymbol $sym65$DICTIONARY_ACCUMULATOR_CONTENTS = makeSymbol("DICTIONARY-ACCUMULATOR-CONTENTS");
  public static final SubLSymbol $sym66$DICTIONARY_ACCUMULATOR_ITERATOR = makeSymbol("DICTIONARY-ACCUMULATOR-ITERATOR");
  public static final SubLString $str67$Dictionary_accumulator_expects_tu = makeString("Dictionary accumulator expects tuples of (KEY . VALUE), not ~A.~%");
  public static final SubLList $list68 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));
  public static final SubLString $str69$New_dictionary_accumulator__A_is_ = makeString("New dictionary accumulator ~A is not empty?");
  public static final SubLSymbol $sym70$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym71$FALSE = makeSymbol("FALSE");
  public static final SubLSymbol $sym72$ZERO = makeSymbol("ZERO");
  public static final SubLSymbol $sym73$NEW_NULL_ITERATOR_DUMMY = makeSymbol("NEW-NULL-ITERATOR-DUMMY");
  public static final SubLString $str74$New_null_accumulator__A_is_not_em = makeString("New null accumulator ~A is not empty");
  public static final SubLString $str75$New_null_accumulator__A_is_no_lon = makeString("New null accumulator ~A is no longer empty");
  public static final SubLString $str76$Expected_iterator__a_to_be_empty = makeString("Expected iterator ~a to be empty");
  public static final SubLString $str77$Destructively_emptied_accumulator = makeString("Destructively emptied accumulator ~A is not empty");
  public static final SubLString $str78$Contents_were__a_instead_of_null = makeString("Contents were ~a instead of null");
  public static final SubLSymbol $sym79$NUMERIC_ACCUMULATOR_SIZE_FN = makeSymbol("NUMERIC-ACCUMULATOR-SIZE-FN");
  public static final SubLSymbol $sym80$NUMERIC_ACCUMULATION_ITERATOR = makeSymbol("NUMERIC-ACCUMULATION-ITERATOR");
  public static final SubLSymbol $sym81$NUMERIC_CONTENTS_FN_DEFAULT_ZERO = makeSymbol("NUMERIC-CONTENTS-FN-DEFAULT-ZERO");
  public static final SubLSymbol $sym82$NUMERIC_CONTENTS_FN_DEFAULT_ONE = makeSymbol("NUMERIC-CONTENTS-FN-DEFAULT-ONE");
  public static final SubLSymbol $sym83$DWIMMED_SUM = makeSymbol("DWIMMED-SUM");
  public static final SubLString $str84$New_sum_accumulator__A_is_not_emp = makeString("New sum accumulator ~A is not empty");
  public static final SubLString $str85$Accumulator_should_have_1_element = makeString("Accumulator should have 1 element but has ~A.~%");
  public static final SubLString $str86$Expected_iterator__a_to_have_only = makeString("Expected iterator ~a to have only 1 value");
  public static final SubLString $str87$Contents_did_not_sum_to__a = makeString("Contents did not sum to ~a");
  public static final SubLString $str88$Iterator_contained__a_instead_of_ = makeString("Iterator contained ~a instead of ~a");
  public static final SubLSymbol $sym89$DWIMMED_INCREMENT = makeSymbol("DWIMMED-INCREMENT");
  public static final SubLString $str90$New_count_accumulator__A_is_not_e = makeString("New count accumulator ~A is not empty");
  public static final SubLString $str91$Contents_did_not_count_to__a = makeString("Contents did not count to ~a");
  public static final SubLSymbol $sym92$DWIMMED_PRODUCT = makeSymbol("DWIMMED-PRODUCT");
  public static final SubLString $str93$New_product_accumulator__A_is_not = makeString("New product accumulator ~A is not empty");
  public static final SubLSymbol $sym94$_ = makeSymbol("*");
  public static final SubLString $str95$Contents_did_not_multiply_to__a = makeString("Contents did not multiply to ~a");
  public static final SubLSymbol $sym96$TEST_LIST_ACCUMULATOR = makeSymbol("TEST-LIST-ACCUMULATOR");
  public static final SubLSymbol $kw97$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw98$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw99$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw100$KB = makeKeyword("KB");
  public static final SubLSymbol $kw101$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw102$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list103 = list(list(list(list(new SubLObject[] {ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, ZERO_INTEGER})), T));
  public static final SubLSymbol $sym104$TEST_SET_ACCUMULATOR = makeSymbol("TEST-SET-ACCUMULATOR");
  public static final SubLList $list105 = list(list(list(list(new SubLObject[] {ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, ZERO_INTEGER}), EQUAL), T));
  public static final SubLSymbol $sym106$TEST_DICTIONARY_ACCUMULATOR = makeSymbol("TEST-DICTIONARY-ACCUMULATOR");
  public static final SubLList $list107 = list(list(list(list(new SubLObject[] {list(ONE_INTEGER, makeString("Eins")), list(TWO_INTEGER, makeString("Zwei")), list(THREE_INTEGER, makeString("Drei")), list(FOUR_INTEGER, makeString("Vier")), list(FIVE_INTEGER, makeString("F&uuml;nf")), list(SIX_INTEGER, makeString("Sechs")), list(SEVEN_INTEGER, makeString("Sieben")), list(EIGHT_INTEGER, makeString("Acht")), list(NINE_INTEGER, makeString("Neun")), list(TEN_INTEGER, makeString("Zehn"))}), EQUAL), T));
  public static final SubLSymbol $sym108$TEST_NULL_ACCUMULATOR = makeSymbol("TEST-NULL-ACCUMULATOR");
  public static final SubLList $list109 = list(list(list(list(new SubLObject[] {ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER})), T), list(list(list(makeString("a"), Characters.CHAR_b, THREE_INTEGER, list(makeSymbol("FUNCTION"), makeSymbol("FOURTH")))), T));
  public static final SubLSymbol $sym110$TEST_SUM_ACCUMULATOR = makeSymbol("TEST-SUM-ACCUMULATOR");
  public static final SubLList $list111 = list(list(list(list(new SubLObject[] {ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER})), T), list(list(list(ONE_INTEGER, ONE_INTEGER, ONE_INTEGER, makeInteger(-3))), T));
  public static final SubLSymbol $sym112$TEST_COUNT_ACCUMULATOR = makeSymbol("TEST-COUNT-ACCUMULATOR");
  public static final SubLSymbol $sym113$TEST_PRODUCT_ACCUMULATOR = makeSymbol("TEST-PRODUCT-ACCUMULATOR");
  public static final SubLList $list114 = list(list(list(list(new SubLObject[] {ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER})), T), list(list(list(TWO_INTEGER, makeDouble(0.5))), T));

  //// Initializers

  public void declareFunctions() {
    declare_accumulation_file();
  }

  public void initializeVariables() {
    init_accumulation_file();
  }

  public void runTopLevelForms() {
    setup_accumulation_file();
  }

}
