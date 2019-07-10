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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.integer_sequence_generator;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class glob extends SubLTranslatedFile {

  //// Constructor

  private glob() {}
  public static final SubLFile me = new glob();
  public static final String myName = "com.cyc.cycjava_1.cycl.glob";

  //// Definitions

  public static final class $glob_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $test; }
    public SubLObject getField3() { return $max_size; }
    public SubLObject getField4() { return $id_state; }
    public SubLObject getField5() { return $lock; }
    public SubLObject getField6() { return $index; }
    public SubLObject getField7() { return $back_index; }
    public SubLObject getField8() { return $owner; }
    public SubLObject setField2(SubLObject value) { return $test = value; }
    public SubLObject setField3(SubLObject value) { return $max_size = value; }
    public SubLObject setField4(SubLObject value) { return $id_state = value; }
    public SubLObject setField5(SubLObject value) { return $lock = value; }
    public SubLObject setField6(SubLObject value) { return $index = value; }
    public SubLObject setField7(SubLObject value) { return $back_index = value; }
    public SubLObject setField8(SubLObject value) { return $owner = value; }
    public SubLObject $test = NIL;
    public SubLObject $max_size = NIL;
    public SubLObject $id_state = NIL;
    public SubLObject $lock = NIL;
    public SubLObject $index = NIL;
    public SubLObject $back_index = NIL;
    public SubLObject $owner = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($glob_native.class, $sym0$GLOB, $sym1$GLOB_P, $list2, $list3, new String[] {"$test", "$max_size", "$id_state", "$lock", "$index", "$back_index", "$owner"}, $list4, $list5, $sym6$PRINT_GLOB);
  }

  @SubL(source = "cycl/glob.lisp", position = 2403) 
  public static SubLSymbol $dtp_glob$ = null;

  @SubL(source = "cycl/glob.lisp", position = 2403) 
  public static final SubLObject glob_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12878");
    return NIL;
  }

  public static final class $glob_p$UnaryFunction extends UnaryFunction {
    public $glob_p$UnaryFunction() { super(extractFunctionNamed("GLOB-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12869"); }
  }

  @SubL(source = "cycl/glob.lisp", position = 8091) 
  private static SubLSymbol $default_initial_glob_size$ = null;

  public static final SubLObject declare_glob_file() {
    declareFunction(myName, "glob_print_function_trampoline", "GLOB-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "glob_p", "GLOB-P", 1, 0, false); new $glob_p$UnaryFunction();
    //declareFunction(myName, "glob_struc_test", "GLOB-STRUC-TEST", 1, 0, false);
    //declareFunction(myName, "glob_struc_max_size", "GLOB-STRUC-MAX-SIZE", 1, 0, false);
    //declareFunction(myName, "glob_struc_id_state", "GLOB-STRUC-ID-STATE", 1, 0, false);
    //declareFunction(myName, "glob_struc_lock", "GLOB-STRUC-LOCK", 1, 0, false);
    //declareFunction(myName, "glob_struc_index", "GLOB-STRUC-INDEX", 1, 0, false);
    //declareFunction(myName, "glob_struc_back_index", "GLOB-STRUC-BACK-INDEX", 1, 0, false);
    //declareFunction(myName, "glob_struc_owner", "GLOB-STRUC-OWNER", 1, 0, false);
    //declareFunction(myName, "_csetf_glob_struc_test", "_CSETF-GLOB-STRUC-TEST", 2, 0, false);
    //declareFunction(myName, "_csetf_glob_struc_max_size", "_CSETF-GLOB-STRUC-MAX-SIZE", 2, 0, false);
    //declareFunction(myName, "_csetf_glob_struc_id_state", "_CSETF-GLOB-STRUC-ID-STATE", 2, 0, false);
    //declareFunction(myName, "_csetf_glob_struc_lock", "_CSETF-GLOB-STRUC-LOCK", 2, 0, false);
    //declareFunction(myName, "_csetf_glob_struc_index", "_CSETF-GLOB-STRUC-INDEX", 2, 0, false);
    //declareFunction(myName, "_csetf_glob_struc_back_index", "_CSETF-GLOB-STRUC-BACK-INDEX", 2, 0, false);
    //declareFunction(myName, "_csetf_glob_struc_owner", "_CSETF-GLOB-STRUC-OWNER", 2, 0, false);
    //declareFunction(myName, "make_glob", "MAKE-GLOB", 0, 1, false);
    //declareFunction(myName, "print_glob", "PRINT-GLOB", 3, 0, false);
    //declareMacro(myName, "with_glob_lock", "WITH-GLOB-LOCK");
    //declareFunction(myName, "new_glob_id_state", "NEW-GLOB-ID-STATE", 0, 0, false);
    //declareFunction(myName, "glob_id_state_reset", "GLOB-ID-STATE-RESET", 1, 0, false);
    //declareFunction(myName, "glob_id_state_next", "GLOB-ID-STATE-NEXT", 1, 0, false);
    //declareFunction(myName, "new_glob_index", "NEW-GLOB-INDEX", 2, 0, false);
    //declareFunction(myName, "glob_index_reset", "GLOB-INDEX-RESET", 1, 0, false);
    //declareFunction(myName, "glob_index_style", "GLOB-INDEX-STYLE", 1, 0, false);
    //declareFunction(myName, "glob_index_size", "GLOB-INDEX-SIZE", 1, 0, false);
    //declareFunction(myName, "glob_index_enter", "GLOB-INDEX-ENTER", 3, 0, false);
    //declareFunction(myName, "glob_index_lookup", "GLOB-INDEX-LOOKUP", 3, 0, false);
    //declareFunction(myName, "glob_index_remove", "GLOB-INDEX-REMOVE", 2, 0, false);
    //declareFunction(myName, "new_glob_back_index", "NEW-GLOB-BACK-INDEX", 2, 0, false);
    //declareFunction(myName, "glob_back_index_reset", "GLOB-BACK-INDEX-RESET", 1, 0, false);
    //declareFunction(myName, "glob_back_index_style", "GLOB-BACK-INDEX-STYLE", 1, 0, false);
    //declareFunction(myName, "glob_back_index_enter", "GLOB-BACK-INDEX-ENTER", 3, 0, false);
    //declareFunction(myName, "glob_back_index_lookup", "GLOB-BACK-INDEX-LOOKUP", 3, 0, false);
    //declareFunction(myName, "glob_back_index_remove", "GLOB-BACK-INDEX-REMOVE", 2, 0, false);
    //declareFunction(myName, "glob_id_p", "GLOB-ID-P", 1, 0, false);
    //declareFunction(myName, "invalid_glob_id_p", "INVALID-GLOB-ID-P", 1, 0, false);
    //declareFunction(myName, "new_glob", "NEW-GLOB", 0, 3, false);
    //declareFunction(myName, "glob_reset", "GLOB-RESET", 1, 0, false);
    //declareFunction(myName, "initialize_glob_indices", "INITIALIZE-GLOB-INDICES", 2, 0, false);
    //declareFunction(myName, "reinitialize_glob_indices", "REINITIALIZE-GLOB-INDICES", 1, 0, false);
    //declareFunction(myName, "glob_test", "GLOB-TEST", 1, 0, false);
    //declareFunction(myName, "glob_max_size", "GLOB-MAX-SIZE", 1, 0, false);
    //declareFunction(myName, "glob_size", "GLOB-SIZE", 1, 0, false);
    //declareFunction(myName, "glob_owner", "GLOB-OWNER", 1, 0, false);
    //declareFunction(myName, "glob_lookup", "GLOB-LOOKUP", 2, 1, false);
    //declareFunction(myName, "glob_object_id", "GLOB-OBJECT-ID", 2, 1, false);
    //declareFunction(myName, "glob_enter", "GLOB-ENTER", 2, 0, false);
    //declareFunction(myName, "glob_remove", "GLOB-REMOVE", 2, 0, false);
    //declareFunction(myName, "glob_remove_id", "GLOB-REMOVE-ID", 2, 0, false);
    //declareFunction(myName, "glob_note_owner", "GLOB-NOTE-OWNER", 2, 0, false);
    //declareFunction(myName, "glob_enter_internal", "GLOB-ENTER-INTERNAL", 3, 0, false);
    //declareFunction(myName, "glob_remove_internal", "GLOB-REMOVE-INTERNAL", 3, 0, false);
    //declareFunction(myName, "new_glob_iterator", "NEW-GLOB-ITERATOR", 1, 0, false);
    //declareMacro(myName, "do_glob", "DO-GLOB");
    //declareFunction(myName, "do_glob_index", "DO-GLOB-INDEX", 1, 0, false);
    //declareFunction(myName, "print_glob_contents", "PRINT-GLOB-CONTENTS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_glob_file() {
    $dtp_glob$ = defconstant("*DTP-GLOB*", $sym0$GLOB);
    $default_initial_glob_size$ = deflexical("*DEFAULT-INITIAL-GLOB-SIZE*", $int43$50);
    return NIL;
  }

  public static final SubLObject setup_glob_file() {
    // CVS_ID("Id: glob.lisp 127324 2009-03-06 16:55:08Z goolsbey ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_glob$.getGlobalValue(), Symbols.symbol_function($sym7$GLOB_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$GLOB_STRUC_TEST, $sym9$_CSETF_GLOB_STRUC_TEST);
    Structures.def_csetf($sym10$GLOB_STRUC_MAX_SIZE, $sym11$_CSETF_GLOB_STRUC_MAX_SIZE);
    Structures.def_csetf($sym12$GLOB_STRUC_ID_STATE, $sym13$_CSETF_GLOB_STRUC_ID_STATE);
    Structures.def_csetf($sym14$GLOB_STRUC_LOCK, $sym15$_CSETF_GLOB_STRUC_LOCK);
    Structures.def_csetf($sym16$GLOB_STRUC_INDEX, $sym17$_CSETF_GLOB_STRUC_INDEX);
    Structures.def_csetf($sym18$GLOB_STRUC_BACK_INDEX, $sym19$_CSETF_GLOB_STRUC_BACK_INDEX);
    Structures.def_csetf($sym20$GLOB_STRUC_OWNER, $sym21$_CSETF_GLOB_STRUC_OWNER);
    Equality.identity($sym0$GLOB);
    access_macros.register_macro_helper($sym51$DO_GLOB_INDEX, $sym52$DO_GLOB);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$GLOB = makeSymbol("GLOB");
  public static final SubLSymbol $sym1$GLOB_P = makeSymbol("GLOB-P");
  public static final SubLList $list2 = list(makeSymbol("TEST"), makeSymbol("MAX-SIZE"), makeSymbol("ID-STATE"), makeSymbol("LOCK"), makeSymbol("INDEX"), makeSymbol("BACK-INDEX"), makeSymbol("OWNER"));
  public static final SubLList $list3 = list(makeKeyword("TEST"), makeKeyword("MAX-SIZE"), makeKeyword("ID-STATE"), makeKeyword("LOCK"), makeKeyword("INDEX"), makeKeyword("BACK-INDEX"), makeKeyword("OWNER"));
  public static final SubLList $list4 = list(makeSymbol("GLOB-STRUC-TEST"), makeSymbol("GLOB-STRUC-MAX-SIZE"), makeSymbol("GLOB-STRUC-ID-STATE"), makeSymbol("GLOB-STRUC-LOCK"), makeSymbol("GLOB-STRUC-INDEX"), makeSymbol("GLOB-STRUC-BACK-INDEX"), makeSymbol("GLOB-STRUC-OWNER"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-GLOB-STRUC-TEST"), makeSymbol("_CSETF-GLOB-STRUC-MAX-SIZE"), makeSymbol("_CSETF-GLOB-STRUC-ID-STATE"), makeSymbol("_CSETF-GLOB-STRUC-LOCK"), makeSymbol("_CSETF-GLOB-STRUC-INDEX"), makeSymbol("_CSETF-GLOB-STRUC-BACK-INDEX"), makeSymbol("_CSETF-GLOB-STRUC-OWNER"));
  public static final SubLSymbol $sym6$PRINT_GLOB = makeSymbol("PRINT-GLOB");
  public static final SubLSymbol $sym7$GLOB_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GLOB-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$GLOB_STRUC_TEST = makeSymbol("GLOB-STRUC-TEST");
  public static final SubLSymbol $sym9$_CSETF_GLOB_STRUC_TEST = makeSymbol("_CSETF-GLOB-STRUC-TEST");
  public static final SubLSymbol $sym10$GLOB_STRUC_MAX_SIZE = makeSymbol("GLOB-STRUC-MAX-SIZE");
  public static final SubLSymbol $sym11$_CSETF_GLOB_STRUC_MAX_SIZE = makeSymbol("_CSETF-GLOB-STRUC-MAX-SIZE");
  public static final SubLSymbol $sym12$GLOB_STRUC_ID_STATE = makeSymbol("GLOB-STRUC-ID-STATE");
  public static final SubLSymbol $sym13$_CSETF_GLOB_STRUC_ID_STATE = makeSymbol("_CSETF-GLOB-STRUC-ID-STATE");
  public static final SubLSymbol $sym14$GLOB_STRUC_LOCK = makeSymbol("GLOB-STRUC-LOCK");
  public static final SubLSymbol $sym15$_CSETF_GLOB_STRUC_LOCK = makeSymbol("_CSETF-GLOB-STRUC-LOCK");
  public static final SubLSymbol $sym16$GLOB_STRUC_INDEX = makeSymbol("GLOB-STRUC-INDEX");
  public static final SubLSymbol $sym17$_CSETF_GLOB_STRUC_INDEX = makeSymbol("_CSETF-GLOB-STRUC-INDEX");
  public static final SubLSymbol $sym18$GLOB_STRUC_BACK_INDEX = makeSymbol("GLOB-STRUC-BACK-INDEX");
  public static final SubLSymbol $sym19$_CSETF_GLOB_STRUC_BACK_INDEX = makeSymbol("_CSETF-GLOB-STRUC-BACK-INDEX");
  public static final SubLSymbol $sym20$GLOB_STRUC_OWNER = makeSymbol("GLOB-STRUC-OWNER");
  public static final SubLSymbol $sym21$_CSETF_GLOB_STRUC_OWNER = makeSymbol("_CSETF-GLOB-STRUC-OWNER");
  public static final SubLSymbol $kw22$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw23$MAX_SIZE = makeKeyword("MAX-SIZE");
  public static final SubLSymbol $kw24$ID_STATE = makeKeyword("ID-STATE");
  public static final SubLSymbol $kw25$LOCK = makeKeyword("LOCK");
  public static final SubLSymbol $kw26$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw27$BACK_INDEX = makeKeyword("BACK-INDEX");
  public static final SubLSymbol $kw28$OWNER = makeKeyword("OWNER");
  public static final SubLString $str29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str30$__ = makeString("#<");
  public static final SubLSymbol $kw31$STREAM = makeKeyword("STREAM");
  public static final SubLString $str32$_ = makeString("(");
  public static final SubLString $str33$_ = makeString(")");
  public static final SubLString $str34$_size_ = makeString(" size=");
  public static final SubLString $str35$_owner_ = makeString(" owner=");
  public static final SubLSymbol $kw36$BASE = makeKeyword("BASE");
  public static final SubLList $list37 = list(makeSymbol("GLOB"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym38$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLSymbol $kw39$DICTIONARY = makeKeyword("DICTIONARY");
  public static final SubLSymbol $kw40$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLSymbol $sym41$VALID_HASH_TEST_P = makeSymbol("VALID-HASH-TEST-P");
  public static final SubLSymbol $sym42$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLInteger $int43$50 = makeInteger(50);
  public static final SubLString $str44$glob_lock = makeString("glob lock");
  public static final SubLSymbol $sym45$GLOB_ID_P = makeSymbol("GLOB-ID-P");
  public static final SubLList $list46 = list(list(makeSymbol("ID"), makeSymbol("OBJECT"), makeSymbol("GLOB"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list47 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw48$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw49$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym50$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLSymbol $sym51$DO_GLOB_INDEX = makeSymbol("DO-GLOB-INDEX");
  public static final SubLSymbol $sym52$DO_GLOB = makeSymbol("DO-GLOB");

  //// Initializers

  public void declareFunctions() {
    declare_glob_file();
  }

  public void initializeVariables() {
    init_glob_file();
  }

  public void runTopLevelForms() {
    setup_glob_file();
  }

}
