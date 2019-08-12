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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class finite_state_transducer extends SubLTranslatedFile {

  //// Constructor

  private finite_state_transducer() {}
  public static final SubLFile me = new finite_state_transducer();
  public static final String myName = "com.cyc.cycjava_1.cycl.finite_state_transducer";

  //// Definitions

  public static final class $finite_state_transducer_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $initial_state; }
    public SubLObject getField3() { return $final_states; }
    public SubLObject getField4() { return $machine_table; }
    public SubLObject getField5() { return $token_builder; }
    public SubLObject getField6() { return $input; }
    public SubLObject getField7() { return $current_token_index; }
    public SubLObject getField8() { return $current_state; }
    public SubLObject getField9() { return $memory; }
    public SubLObject getField10() { return $indexed_output; }
    public SubLObject setField2(SubLObject value) { return $initial_state = value; }
    public SubLObject setField3(SubLObject value) { return $final_states = value; }
    public SubLObject setField4(SubLObject value) { return $machine_table = value; }
    public SubLObject setField5(SubLObject value) { return $token_builder = value; }
    public SubLObject setField6(SubLObject value) { return $input = value; }
    public SubLObject setField7(SubLObject value) { return $current_token_index = value; }
    public SubLObject setField8(SubLObject value) { return $current_state = value; }
    public SubLObject setField9(SubLObject value) { return $memory = value; }
    public SubLObject setField10(SubLObject value) { return $indexed_output = value; }
    public SubLObject $initial_state = NIL;
    public SubLObject $final_states = NIL;
    public SubLObject $machine_table = NIL;
    public SubLObject $token_builder = NIL;
    public SubLObject $input = NIL;
    public SubLObject $current_token_index = NIL;
    public SubLObject $current_state = NIL;
    public SubLObject $memory = NIL;
    public SubLObject $indexed_output = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($finite_state_transducer_native.class, $sym0$FINITE_STATE_TRANSDUCER, $sym1$FINITE_STATE_TRANSDUCER_P, $list2, $list3, new String[] {"$initial_state", "$final_states", "$machine_table", "$token_builder", "$input", "$current_token_index", "$current_state", "$memory", "$indexed_output"}, $list4, $list5, $sym6$PRINT_FST);
  }

  @SubL(source = "cycl/finite-state-transducer.lisp", position = 2170) 
  public static SubLSymbol $dtp_finite_state_transducer$ = null;

  @SubL(source = "cycl/finite-state-transducer.lisp", position = 2170) 
  public static final SubLObject finite_state_transducer_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29478");
    return NIL;
  }

  public static final class $finite_state_transducer_p$UnaryFunction extends UnaryFunction {
    public $finite_state_transducer_p$UnaryFunction() { super(extractFunctionNamed("FINITE-STATE-TRANSDUCER-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29449"); }
  }

  public static final SubLObject declare_finite_state_transducer_file() {
    declareFunction(myName, "finite_state_transducer_print_function_trampoline", "FINITE-STATE-TRANSDUCER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "finite_state_transducer_p", "FINITE-STATE-TRANSDUCER-P", 1, 0, false); new $finite_state_transducer_p$UnaryFunction();
    declareFunction(myName, "fst_initial_state", "FST-INITIAL-STATE", 1, 0, false);
    declareFunction(myName, "fst_final_states", "FST-FINAL-STATES", 1, 0, false);
    declareFunction(myName, "fst_machine_table", "FST-MACHINE-TABLE", 1, 0, false);
    declareFunction(myName, "fst_token_builder", "FST-TOKEN-BUILDER", 1, 0, false);
    declareFunction(myName, "fst_input", "FST-INPUT", 1, 0, false);
    declareFunction(myName, "fst_current_token_index", "FST-CURRENT-TOKEN-INDEX", 1, 0, false);
    declareFunction(myName, "fst_current_state", "FST-CURRENT-STATE", 1, 0, false);
    declareFunction(myName, "fst_memory", "FST-MEMORY", 1, 0, false);
    declareFunction(myName, "fst_indexed_output", "FST-INDEXED-OUTPUT", 1, 0, false);
    declareFunction(myName, "_csetf_fst_initial_state", "_CSETF-FST-INITIAL-STATE", 2, 0, false);
    declareFunction(myName, "_csetf_fst_final_states", "_CSETF-FST-FINAL-STATES", 2, 0, false);
    declareFunction(myName, "_csetf_fst_machine_table", "_CSETF-FST-MACHINE-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_fst_token_builder", "_CSETF-FST-TOKEN-BUILDER", 2, 0, false);
    declareFunction(myName, "_csetf_fst_input", "_CSETF-FST-INPUT", 2, 0, false);
    declareFunction(myName, "_csetf_fst_current_token_index", "_CSETF-FST-CURRENT-TOKEN-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_fst_current_state", "_CSETF-FST-CURRENT-STATE", 2, 0, false);
    declareFunction(myName, "_csetf_fst_memory", "_CSETF-FST-MEMORY", 2, 0, false);
    declareFunction(myName, "_csetf_fst_indexed_output", "_CSETF-FST-INDEXED-OUTPUT", 2, 0, false);
    declareFunction(myName, "make_finite_state_transducer", "MAKE-FINITE-STATE-TRANSDUCER", 0, 1, false);
    declareFunction(myName, "print_fst", "PRINT-FST", 1, 2, false);
    declareFunction(myName, "fst_output_start", "FST-OUTPUT-START", 1, 0, false);
    declareFunction(myName, "fst_output_end", "FST-OUTPUT-END", 1, 0, false);
    declareFunction(myName, "new_finite_state_transducer", "NEW-FINITE-STATE-TRANSDUCER", 3, 1, false);
    declareFunction(myName, "fst_output", "FST-OUTPUT", 1, 0, false);
    declareFunction(myName, "fst_match", "FST-MATCH", 2, 0, false);
    declareMacro(myName, "fst_do_match", "FST-DO-MATCH");
    declareFunction(myName, "fst_match_global", "FST-MATCH-GLOBAL", 2, 0, false);
    declareFunction(myName, "fst_initialize", "FST-INITIALIZE", 2, 0, false);
    declareFunction(myName, "fst_match_internal", "FST-MATCH-INTERNAL", 1, 0, false);
    declareFunction(myName, "fst_run", "FST-RUN", 1, 0, false);
    declareFunction(myName, "fst_current_token", "FST-CURRENT-TOKEN", 1, 0, false);
    declareFunction(myName, "fst_final_state_p", "FST-FINAL-STATE-P", 1, 0, false);
    declareFunction(myName, "fst_action_p", "FST-ACTION-P", 1, 0, false);
    declareFunction(myName, "fst_execute", "FST-EXECUTE", 2, 0, false);
    declareFunction(myName, "fst_emit", "FST-EMIT", 1, 0, false);
    declareFunction(myName, "fst_remember", "FST-REMEMBER", 1, 0, false);
    declareFunction(myName, "fst_backup", "FST-BACKUP", 1, 0, false);
    declareFunction(myName, "machine_table_set", "MACHINE-TABLE-SET", 5, 0, false);
    declareFunction(myName, "machine_table_get", "MACHINE-TABLE-GET", 3, 0, false);
    declareFunction(myName, "key_matches", "KEY-MATCHES", 2, 0, false);
    declareFunction(myName, "max_state", "MAX-STATE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_finite_state_transducer_file() {
    $dtp_finite_state_transducer$ = defconstant("*DTP-FINITE-STATE-TRANSDUCER*", $sym0$FINITE_STATE_TRANSDUCER);
    return NIL;
  }

  public static final SubLObject setup_finite_state_transducer_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_finite_state_transducer$.getGlobalValue(), Symbols.symbol_function($sym7$FINITE_STATE_TRANSDUCER_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$FST_INITIAL_STATE, $sym9$_CSETF_FST_INITIAL_STATE);
    Structures.def_csetf($sym10$FST_FINAL_STATES, $sym11$_CSETF_FST_FINAL_STATES);
    Structures.def_csetf($sym12$FST_MACHINE_TABLE, $sym13$_CSETF_FST_MACHINE_TABLE);
    Structures.def_csetf($sym14$FST_TOKEN_BUILDER, $sym15$_CSETF_FST_TOKEN_BUILDER);
    Structures.def_csetf($sym16$FST_INPUT, $sym17$_CSETF_FST_INPUT);
    Structures.def_csetf($sym18$FST_CURRENT_TOKEN_INDEX, $sym19$_CSETF_FST_CURRENT_TOKEN_INDEX);
    Structures.def_csetf($sym20$FST_CURRENT_STATE, $sym21$_CSETF_FST_CURRENT_STATE);
    Structures.def_csetf($sym22$FST_MEMORY, $sym23$_CSETF_FST_MEMORY);
    Structures.def_csetf($sym24$FST_INDEXED_OUTPUT, $sym25$_CSETF_FST_INDEXED_OUTPUT);
    Equality.identity($sym0$FINITE_STATE_TRANSDUCER);
    utilities_macros.note_funcall_helper_function($sym6$PRINT_FST);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$FINITE_STATE_TRANSDUCER = makeSymbol("FINITE-STATE-TRANSDUCER");
  public static final SubLSymbol $sym1$FINITE_STATE_TRANSDUCER_P = makeSymbol("FINITE-STATE-TRANSDUCER-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("INITIAL-STATE"), makeSymbol("FINAL-STATES"), makeSymbol("MACHINE-TABLE"), makeSymbol("TOKEN-BUILDER"), makeSymbol("INPUT"), makeSymbol("CURRENT-TOKEN-INDEX"), makeSymbol("CURRENT-STATE"), makeSymbol("MEMORY"), makeSymbol("INDEXED-OUTPUT")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("INITIAL-STATE"), makeKeyword("FINAL-STATES"), makeKeyword("MACHINE-TABLE"), makeKeyword("TOKEN-BUILDER"), makeKeyword("INPUT"), makeKeyword("CURRENT-TOKEN-INDEX"), makeKeyword("CURRENT-STATE"), makeKeyword("MEMORY"), makeKeyword("INDEXED-OUTPUT")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("FST-INITIAL-STATE"), makeSymbol("FST-FINAL-STATES"), makeSymbol("FST-MACHINE-TABLE"), makeSymbol("FST-TOKEN-BUILDER"), makeSymbol("FST-INPUT"), makeSymbol("FST-CURRENT-TOKEN-INDEX"), makeSymbol("FST-CURRENT-STATE"), makeSymbol("FST-MEMORY"), makeSymbol("FST-INDEXED-OUTPUT")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-FST-INITIAL-STATE"), makeSymbol("_CSETF-FST-FINAL-STATES"), makeSymbol("_CSETF-FST-MACHINE-TABLE"), makeSymbol("_CSETF-FST-TOKEN-BUILDER"), makeSymbol("_CSETF-FST-INPUT"), makeSymbol("_CSETF-FST-CURRENT-TOKEN-INDEX"), makeSymbol("_CSETF-FST-CURRENT-STATE"), makeSymbol("_CSETF-FST-MEMORY"), makeSymbol("_CSETF-FST-INDEXED-OUTPUT")});
  public static final SubLSymbol $sym6$PRINT_FST = makeSymbol("PRINT-FST");
  public static final SubLSymbol $sym7$FINITE_STATE_TRANSDUCER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FINITE-STATE-TRANSDUCER-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$FST_INITIAL_STATE = makeSymbol("FST-INITIAL-STATE");
  public static final SubLSymbol $sym9$_CSETF_FST_INITIAL_STATE = makeSymbol("_CSETF-FST-INITIAL-STATE");
  public static final SubLSymbol $sym10$FST_FINAL_STATES = makeSymbol("FST-FINAL-STATES");
  public static final SubLSymbol $sym11$_CSETF_FST_FINAL_STATES = makeSymbol("_CSETF-FST-FINAL-STATES");
  public static final SubLSymbol $sym12$FST_MACHINE_TABLE = makeSymbol("FST-MACHINE-TABLE");
  public static final SubLSymbol $sym13$_CSETF_FST_MACHINE_TABLE = makeSymbol("_CSETF-FST-MACHINE-TABLE");
  public static final SubLSymbol $sym14$FST_TOKEN_BUILDER = makeSymbol("FST-TOKEN-BUILDER");
  public static final SubLSymbol $sym15$_CSETF_FST_TOKEN_BUILDER = makeSymbol("_CSETF-FST-TOKEN-BUILDER");
  public static final SubLSymbol $sym16$FST_INPUT = makeSymbol("FST-INPUT");
  public static final SubLSymbol $sym17$_CSETF_FST_INPUT = makeSymbol("_CSETF-FST-INPUT");
  public static final SubLSymbol $sym18$FST_CURRENT_TOKEN_INDEX = makeSymbol("FST-CURRENT-TOKEN-INDEX");
  public static final SubLSymbol $sym19$_CSETF_FST_CURRENT_TOKEN_INDEX = makeSymbol("_CSETF-FST-CURRENT-TOKEN-INDEX");
  public static final SubLSymbol $sym20$FST_CURRENT_STATE = makeSymbol("FST-CURRENT-STATE");
  public static final SubLSymbol $sym21$_CSETF_FST_CURRENT_STATE = makeSymbol("_CSETF-FST-CURRENT-STATE");
  public static final SubLSymbol $sym22$FST_MEMORY = makeSymbol("FST-MEMORY");
  public static final SubLSymbol $sym23$_CSETF_FST_MEMORY = makeSymbol("_CSETF-FST-MEMORY");
  public static final SubLSymbol $sym24$FST_INDEXED_OUTPUT = makeSymbol("FST-INDEXED-OUTPUT");
  public static final SubLSymbol $sym25$_CSETF_FST_INDEXED_OUTPUT = makeSymbol("_CSETF-FST-INDEXED-OUTPUT");
  public static final SubLSymbol $kw26$INITIAL_STATE = makeKeyword("INITIAL-STATE");
  public static final SubLSymbol $kw27$FINAL_STATES = makeKeyword("FINAL-STATES");
  public static final SubLSymbol $kw28$MACHINE_TABLE = makeKeyword("MACHINE-TABLE");
  public static final SubLSymbol $kw29$TOKEN_BUILDER = makeKeyword("TOKEN-BUILDER");
  public static final SubLSymbol $kw30$INPUT = makeKeyword("INPUT");
  public static final SubLSymbol $kw31$CURRENT_TOKEN_INDEX = makeKeyword("CURRENT-TOKEN-INDEX");
  public static final SubLSymbol $kw32$CURRENT_STATE = makeKeyword("CURRENT-STATE");
  public static final SubLSymbol $kw33$MEMORY = makeKeyword("MEMORY");
  public static final SubLSymbol $kw34$INDEXED_OUTPUT = makeKeyword("INDEXED-OUTPUT");
  public static final SubLString $str35$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str36$__FST___S_ = makeString("#<FST: ~S>");
  public static final SubLSymbol $sym37$FST_OUTPUT = makeSymbol("FST-OUTPUT");
  public static final SubLSymbol $sym38$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str39$Invalid_final_states__a = makeString("Invalid final states ~a");
  public static final SubLSymbol $sym40$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym41$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym42$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym43$SEQUENCEP = makeSymbol("SEQUENCEP");
  public static final SubLList $list44 = list(list(makeSymbol("MATCH"), makeSymbol("SEQUENCE"), makeSymbol("FST")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym45$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym46$FST_INITIALIZE = makeSymbol("FST-INITIALIZE");
  public static final SubLSymbol $sym47$CDO = makeSymbol("CDO");
  public static final SubLSymbol $sym48$FST_MATCH_INTERNAL = makeSymbol("FST-MATCH-INTERNAL");
  public static final SubLSymbol $sym49$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym50$VECTOR = makeSymbol("VECTOR");
  public static final SubLSymbol $kw51$END = makeKeyword("END");
  public static final SubLList $list52 = list(makeKeyword("EMIT"), makeKeyword("REMEMBER"), makeKeyword("BACKUP"));
  public static final SubLSymbol $kw53$EMIT = makeKeyword("EMIT");
  public static final SubLSymbol $kw54$REMEMBER = makeKeyword("REMEMBER");
  public static final SubLSymbol $kw55$BACKUP = makeKeyword("BACKUP");
  public static final SubLString $str56$Invalid_FST_command__a = makeString("Invalid FST command ~a");
  public static final SubLSymbol $sym57$VECTORP = makeSymbol("VECTORP");
  public static final SubLSymbol $sym58$FST_ACTION_P = makeSymbol("FST-ACTION-P");
  public static final SubLString $str59$Invalid_FST_action_list__a = makeString("Invalid FST action list ~a");

  //// Initializers

  public void declareFunctions() {
    declare_finite_state_transducer_file();
  }

  public void initializeVariables() {
    init_finite_state_transducer_file();
  }

  public void runTopLevelForms() {
    setup_finite_state_transducer_file();
  }

}
