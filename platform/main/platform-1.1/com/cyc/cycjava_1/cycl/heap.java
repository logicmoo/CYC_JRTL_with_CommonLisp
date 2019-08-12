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

import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class heap extends SubLTranslatedFile {

  //// Constructor

  private heap() {}
  public static final SubLFile me = new heap();
  public static final String myName = "com.cyc.cycjava_1.cycl.heap";

  //// Definitions

  public static final class $heap_impl_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $next; }
    public SubLObject getField3() { return $nodes; }
    public SubLObject getField4() { return $predicate; }
    public SubLObject getField5() { return $key; }
    public SubLObject setField2(SubLObject value) { return $next = value; }
    public SubLObject setField3(SubLObject value) { return $nodes = value; }
    public SubLObject setField4(SubLObject value) { return $predicate = value; }
    public SubLObject setField5(SubLObject value) { return $key = value; }
    public SubLObject $next = NIL;
    public SubLObject $nodes = NIL;
    public SubLObject $predicate = NIL;
    public SubLObject $key = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($heap_impl_native.class, $sym0$HEAP_IMPL, $sym1$HEAP_IMPL_P, $list2, $list3, new String[] {"$next", "$nodes", "$predicate", "$key"}, $list4, $list5, $sym6$PRINT_HEAP_IMPL);
  }

  @SubL(source = "cycl/heap.lisp", position = 2465) 
  public static SubLSymbol $dtp_heap_impl$ = null;

  @SubL(source = "cycl/heap.lisp", position = 2465) 
  public static final SubLObject heap_impl_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9597");
    return NIL;
  }

  public static final class $heap_impl_p$UnaryFunction extends UnaryFunction {
    public $heap_impl_p$UnaryFunction() { super(extractFunctionNamed("HEAP-IMPL-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9565"); }
  }

  @SubL(source = "cycl/heap.lisp", position = 2719) 
  private static SubLSymbol $empty_heap_element$ = null;

  /** The position 0 is special and used for insert/delete operations */
  @SubL(source = "cycl/heap.lisp", position = 2796) 
  private static SubLSymbol $heap_root_index$ = null;

  public static final class $heap_test_example_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $priority; }
    public SubLObject getField3() { return $value; }
    public SubLObject setField2(SubLObject value) { return $priority = value; }
    public SubLObject setField3(SubLObject value) { return $value = value; }
    public SubLObject $priority = NIL;
    public SubLObject $value = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($heap_test_example_native.class, $sym68$HEAP_TEST_EXAMPLE, $sym69$HEAP_TEST_EXAMPLE_P, $list70, $list71, new String[] {"$priority", "$value"}, $list72, $list73, $sym74$PRINT_HEAP_TEST_EXAMPLE);
  }

  @SubL(source = "cycl/heap.lisp", position = 24244) 
  public static SubLSymbol $dtp_heap_test_example$ = null;

  @SubL(source = "cycl/heap.lisp", position = 24244) 
  public static final SubLObject heap_test_example_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9598");
    return NIL;
  }

  public static final class $heap_test_example_p$UnaryFunction extends UnaryFunction {
    public $heap_test_example_p$UnaryFunction() { super(extractFunctionNamed("HEAP-TEST-EXAMPLE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9590"); }
  }

  public static final SubLObject declare_heap_file() {
    declareFunction(myName, "heap_impl_print_function_trampoline", "HEAP-IMPL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "heap_impl_p", "HEAP-IMPL-P", 1, 0, false); new $heap_impl_p$UnaryFunction();
    //declareFunction(myName, "heap_impl_next", "HEAP-IMPL-NEXT", 1, 0, false);
    //declareFunction(myName, "heap_impl_nodes", "HEAP-IMPL-NODES", 1, 0, false);
    //declareFunction(myName, "heap_impl_predicate", "HEAP-IMPL-PREDICATE", 1, 0, false);
    //declareFunction(myName, "heap_impl_key", "HEAP-IMPL-KEY", 1, 0, false);
    //declareFunction(myName, "_csetf_heap_impl_next", "_CSETF-HEAP-IMPL-NEXT", 2, 0, false);
    //declareFunction(myName, "_csetf_heap_impl_nodes", "_CSETF-HEAP-IMPL-NODES", 2, 0, false);
    //declareFunction(myName, "_csetf_heap_impl_predicate", "_CSETF-HEAP-IMPL-PREDICATE", 2, 0, false);
    //declareFunction(myName, "_csetf_heap_impl_key", "_CSETF-HEAP-IMPL-KEY", 2, 0, false);
    //declareFunction(myName, "make_heap_impl", "MAKE-HEAP-IMPL", 0, 1, false);
    //declareFunction(myName, "is_empty_heap_elementP", "IS-EMPTY-HEAP-ELEMENT?", 1, 0, false);
    //declareFunction(myName, "new_heap_impl", "NEW-HEAP-IMPL", 1, 2, false);
    //declareFunction(myName, "clone_existing_heap", "CLONE-EXISTING-HEAP", 1, 0, false);
    //declareFunction(myName, "print_heap_impl", "PRINT-HEAP-IMPL", 3, 0, false);
    //declareFunction(myName, "create_heap", "CREATE-HEAP", 1, 2, false);
    //declareFunction(myName, "clear_heap", "CLEAR-HEAP", 1, 0, false);
    //declareFunction(myName, "clone_heap", "CLONE-HEAP", 1, 0, false);
    //declareFunction(myName, "heap_p", "HEAP-P", 1, 0, false);
    //declareFunction(myName, "heap_size", "HEAP-SIZE", 1, 0, false);
    //declareFunction(myName, "heap_count", "HEAP-COUNT", 1, 0, false);
    //declareFunction(myName, "heap_predicate", "HEAP-PREDICATE", 1, 0, false);
    //declareFunction(myName, "heap_key", "HEAP-KEY", 1, 0, false);
    //declareFunction(myName, "apply_heap_predicate", "APPLY-HEAP-PREDICATE", 3, 0, false);
    //declareFunction(myName, "apply_heap_key", "APPLY-HEAP-KEY", 2, 0, false);
    //declareFunction(myName, "heap_is_empty_p", "HEAP-IS-EMPTY-P", 1, 0, false);
    //declareFunction(myName, "heap_is_full_p", "HEAP-IS-FULL-P", 1, 0, false);
    //declareFunction(myName, "create_max_heap", "CREATE-MAX-HEAP", 1, 1, false);
    //declareFunction(myName, "create_min_heap", "CREATE-MIN-HEAP", 1, 1, false);
    //declareFunction(myName, "heap_insert", "HEAP-INSERT", 2, 0, false);
    //declareFunction(myName, "heap_enqueue", "HEAP-ENQUEUE", 2, 0, false);
    //declareFunction(myName, "heap_peek", "HEAP-PEEK", 1, 0, false);
    //declareFunction(myName, "heap_dequeue", "HEAP-DEQUEUE", 1, 0, false);
    //declareFunction(myName, "heap_remove", "HEAP-REMOVE", 1, 0, false);
    //declareFunction(myName, "heap_find", "HEAP-FIND", 2, 2, false);
    //declareFunction(myName, "heap_reconsider", "HEAP-RECONSIDER", 3, 1, false);
    //declareFunction(myName, "heap_find_spot", "HEAP-FIND-SPOT", 4, 0, false);
    //declareFunction(myName, "heap_reconsider_trickle_down", "HEAP-RECONSIDER-TRICKLE-DOWN", 2, 0, false);
    //declareFunction(myName, "heap_reconsider_bubble_up", "HEAP-RECONSIDER-BUBBLE-UP", 2, 0, false);
    //declareFunction(myName, "new_heap_iterator", "NEW-HEAP-ITERATOR", 1, 1, false);
    //declareFunction(myName, "make_heap_iterator_state", "MAKE-HEAP-ITERATOR-STATE", 2, 0, false);
    //declareFunction(myName, "heap_iterator_next", "HEAP-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "expand_heap_iterator_stack", "EXPAND-HEAP-ITERATOR-STACK", 1, 0, false);
    //declareFunction(myName, "expand_current_heap_iterator_stack_top", "EXPAND-CURRENT-HEAP-ITERATOR-STACK-TOP", 1, 0, false);
    //declareFunction(myName, "push_heap_iterator_stack", "PUSH-HEAP-ITERATOR-STACK", 3, 0, false);
    //declareFunction(myName, "pop_heap_iterator_stack", "POP-HEAP-ITERATOR-STACK", 1, 0, false);
    //declareFunction(myName, "top_heap_iterator_stack_action", "TOP-HEAP-ITERATOR-STACK-ACTION", 1, 0, false);
    //declareFunction(myName, "top_heap_iterator_stack_node_index", "TOP-HEAP-ITERATOR-STACK-NODE-INDEX", 1, 0, false);
    //declareFunction(myName, "top_heap_iterator_stack_node", "TOP-HEAP-ITERATOR-STACK-NODE", 1, 0, false);
    //declareFunction(myName, "heap_iterator_done", "HEAP-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "heap_keys", "HEAP-KEYS", 1, 0, false);
    //declareFunction(myName, "heap_keys_fast", "HEAP-KEYS-FAST", 1, 0, false);
    //declareFunction(myName, "heap_elements_fast", "HEAP-ELEMENTS-FAST", 1, 0, false);
    //declareFunction(myName, "heap_elements", "HEAP-ELEMENTS", 1, 0, false);
    //declareFunction(myName, "heap_root", "HEAP-ROOT", 1, 0, false);
    //declareFunction(myName, "set_heap_root", "SET-HEAP-ROOT", 2, 0, false);
    //declareFunction(myName, "heap_delete_last", "HEAP-DELETE-LAST", 1, 0, false);
    //declareFunction(myName, "heap_bubble_up", "HEAP-BUBBLE-UP", 2, 0, false);
    //declareFunction(myName, "heap_trickle_down", "HEAP-TRICKLE-DOWN", 2, 0, false);
    //declareFunction(myName, "heap_find_spot_of_element", "HEAP-FIND-SPOT-OF-ELEMENT", 3, 2, false);
    //declareFunction(myName, "heap_unit_test_insert_remove", "HEAP-UNIT-TEST-INSERT-REMOVE", 1, 3, false);
    //declareFunction(myName, "heap_unit_test_sorting", "HEAP-UNIT-TEST-SORTING", 1, 0, false);
    declareFunction(myName, "heap_test_example_print_function_trampoline", "HEAP-TEST-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "heap_test_example_p", "HEAP-TEST-EXAMPLE-P", 1, 0, false); new $heap_test_example_p$UnaryFunction();
    //declareFunction(myName, "heap_test_example_priority", "HEAP-TEST-EXAMPLE-PRIORITY", 1, 0, false);
    //declareFunction(myName, "heap_test_example_value", "HEAP-TEST-EXAMPLE-VALUE", 1, 0, false);
    //declareFunction(myName, "_csetf_heap_test_example_priority", "_CSETF-HEAP-TEST-EXAMPLE-PRIORITY", 2, 0, false);
    //declareFunction(myName, "_csetf_heap_test_example_value", "_CSETF-HEAP-TEST-EXAMPLE-VALUE", 2, 0, false);
    //declareFunction(myName, "make_heap_test_example", "MAKE-HEAP-TEST-EXAMPLE", 0, 1, false);
    //declareFunction(myName, "print_heap_test_example", "PRINT-HEAP-TEST-EXAMPLE", 3, 0, false);
    //declareFunction(myName, "get_heap_test_example_priority", "GET-HEAP-TEST-EXAMPLE-PRIORITY", 1, 0, false);
    //declareFunction(myName, "change_heap_test_example_priority", "CHANGE-HEAP-TEST-EXAMPLE-PRIORITY", 2, 0, false);
    //declareFunction(myName, "get_heap_test_example_value", "GET-HEAP-TEST-EXAMPLE-VALUE", 1, 0, false);
    //declareFunction(myName, "new_heap_test_example", "NEW-HEAP-TEST-EXAMPLE", 2, 0, false);
    //declareFunction(myName, "heap_unit_test_prioritizing", "HEAP-UNIT-TEST-PRIORITIZING", 1, 1, false);
    //declareFunction(myName, "heap_unit_test_priorities", "HEAP-UNIT-TEST-PRIORITIES", 2, 2, false);
    //declareFunction(myName, "heap_unit_test_priorities_still_orderedP", "HEAP-UNIT-TEST-PRIORITIES-STILL-ORDERED?", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_heap_file() {
    $dtp_heap_impl$ = defconstant("*DTP-HEAP-IMPL*", $sym0$HEAP_IMPL);
    $empty_heap_element$ = deflexical("*EMPTY-HEAP-ELEMENT*", maybeDefault( $sym21$_EMPTY_HEAP_ELEMENT_, $empty_heap_element$, ()-> (Symbols.make_symbol($str22$Empty_Heap_Element))));
    $heap_root_index$ = deflexical("*HEAP-ROOT-INDEX*", ONE_INTEGER);
    $dtp_heap_test_example$ = defconstant("*DTP-HEAP-TEST-EXAMPLE*", $sym68$HEAP_TEST_EXAMPLE);
    return NIL;
  }

  public static final SubLObject setup_heap_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_heap_impl$.getGlobalValue(), Symbols.symbol_function($sym7$HEAP_IMPL_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$HEAP_IMPL_NEXT, $sym9$_CSETF_HEAP_IMPL_NEXT);
    Structures.def_csetf($sym10$HEAP_IMPL_NODES, $sym11$_CSETF_HEAP_IMPL_NODES);
    Structures.def_csetf($sym12$HEAP_IMPL_PREDICATE, $sym13$_CSETF_HEAP_IMPL_PREDICATE);
    Structures.def_csetf($sym14$HEAP_IMPL_KEY, $sym15$_CSETF_HEAP_IMPL_KEY);
    Equality.identity($sym0$HEAP_IMPL);
    subl_macro_promotions.declare_defglobal($sym21$_EMPTY_HEAP_ELEMENT_);
    generic_testing.define_test_case_table_int($sym46$HEAP_UNIT_TEST_INSERT_REMOVE, list(new SubLObject[] {$kw47$TEST, NIL, $kw48$OWNER, NIL, $kw49$CLASSES, NIL, $kw50$KB, $kw51$TINY, $kw52$WORKING_, T}), $list53);
    generic_testing.define_test_case_table_int($sym61$HEAP_UNIT_TEST_SORTING, list(new SubLObject[] {$kw47$TEST, NIL, $kw48$OWNER, NIL, $kw49$CLASSES, NIL, $kw50$KB, $kw51$TINY, $kw52$WORKING_, T}), $list62);
    generic_testing.define_test_case_table_int($sym66$HEAP_UNIT_TEST_PRIORITIZING, list(new SubLObject[] {$kw47$TEST, NIL, $kw48$OWNER, NIL, $kw49$CLASSES, NIL, $kw50$KB, $kw51$TINY, $kw52$WORKING_, T}), $list67);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_heap_test_example$.getGlobalValue(), Symbols.symbol_function($sym75$HEAP_TEST_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym76$HEAP_TEST_EXAMPLE_PRIORITY, $sym77$_CSETF_HEAP_TEST_EXAMPLE_PRIORITY);
    Structures.def_csetf($sym78$HEAP_TEST_EXAMPLE_VALUE, $sym79$_CSETF_HEAP_TEST_EXAMPLE_VALUE);
    Equality.identity($sym68$HEAP_TEST_EXAMPLE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$HEAP_IMPL = makeSymbol("HEAP-IMPL");
  public static final SubLSymbol $sym1$HEAP_IMPL_P = makeSymbol("HEAP-IMPL-P");
  public static final SubLList $list2 = list(makeSymbol("NEXT"), makeSymbol("NODES"), makeSymbol("PREDICATE"), makeSymbol("KEY"));
  public static final SubLList $list3 = list(makeKeyword("NEXT"), makeKeyword("NODES"), makeKeyword("PREDICATE"), makeKeyword("KEY"));
  public static final SubLList $list4 = list(makeSymbol("HEAP-IMPL-NEXT"), makeSymbol("HEAP-IMPL-NODES"), makeSymbol("HEAP-IMPL-PREDICATE"), makeSymbol("HEAP-IMPL-KEY"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-HEAP-IMPL-NEXT"), makeSymbol("_CSETF-HEAP-IMPL-NODES"), makeSymbol("_CSETF-HEAP-IMPL-PREDICATE"), makeSymbol("_CSETF-HEAP-IMPL-KEY"));
  public static final SubLSymbol $sym6$PRINT_HEAP_IMPL = makeSymbol("PRINT-HEAP-IMPL");
  public static final SubLSymbol $sym7$HEAP_IMPL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HEAP-IMPL-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$HEAP_IMPL_NEXT = makeSymbol("HEAP-IMPL-NEXT");
  public static final SubLSymbol $sym9$_CSETF_HEAP_IMPL_NEXT = makeSymbol("_CSETF-HEAP-IMPL-NEXT");
  public static final SubLSymbol $sym10$HEAP_IMPL_NODES = makeSymbol("HEAP-IMPL-NODES");
  public static final SubLSymbol $sym11$_CSETF_HEAP_IMPL_NODES = makeSymbol("_CSETF-HEAP-IMPL-NODES");
  public static final SubLSymbol $sym12$HEAP_IMPL_PREDICATE = makeSymbol("HEAP-IMPL-PREDICATE");
  public static final SubLSymbol $sym13$_CSETF_HEAP_IMPL_PREDICATE = makeSymbol("_CSETF-HEAP-IMPL-PREDICATE");
  public static final SubLSymbol $sym14$HEAP_IMPL_KEY = makeSymbol("HEAP-IMPL-KEY");
  public static final SubLSymbol $sym15$_CSETF_HEAP_IMPL_KEY = makeSymbol("_CSETF-HEAP-IMPL-KEY");
  public static final SubLSymbol $kw16$NEXT = makeKeyword("NEXT");
  public static final SubLSymbol $kw17$NODES = makeKeyword("NODES");
  public static final SubLSymbol $kw18$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $kw19$KEY = makeKeyword("KEY");
  public static final SubLString $str20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym21$_EMPTY_HEAP_ELEMENT_ = makeSymbol("*EMPTY-HEAP-ELEMENT*");
  public static final SubLString $str22$Empty_Heap_Element = makeString("Empty Heap Element");
  public static final SubLSymbol $sym23$__ = makeSymbol("<=");
  public static final SubLString $str24$__ = makeString("#<");
  public static final SubLSymbol $kw25$STREAM = makeKeyword("STREAM");
  public static final SubLString $str26$HEAP_ = makeString("HEAP ");
  public static final SubLString $str27$_of_key_ = makeString(" of key ");
  public static final SubLString $str28$_ = makeString(" ");
  public static final SubLString $str29$_ = makeString("/");
  public static final SubLSymbol $kw30$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym31$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLSymbol $sym32$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym33$HEAP_P = makeSymbol("HEAP-P");
  public static final SubLSymbol $sym34$__ = makeSymbol(">=");
  public static final SubLString $str35$The_heap__A_is_full__must_remove_ = makeString("The heap ~A is full; must remove item before insert.");
  public static final SubLString $str36$Cannot_remove_an_item_from_empty_ = makeString("Cannot remove an item from empty heap ~A.");
  public static final SubLSymbol $sym37$HEAP_ITERATOR_DONE = makeSymbol("HEAP-ITERATOR-DONE");
  public static final SubLSymbol $sym38$HEAP_ITERATOR_NEXT = makeSymbol("HEAP-ITERATOR-NEXT");
  public static final SubLSymbol $kw39$EXPAND = makeKeyword("EXPAND");
  public static final SubLSymbol $kw40$SHOW = makeKeyword("SHOW");
  public static final SubLString $str41$Error_in_heap_iterator__iterator_ = makeString("Error in heap iterator: iterator-next called without :SHOW on top.");
  public static final SubLString $str42$Invalid_sate_transition__unknown_ = makeString("Invalid sate transition: unknown code ~A on action stack in heap iterator.");
  public static final SubLList $list43 = list(makeSymbol("STACK-POINTER"), makeSymbol("ACTION-STACK"), makeSymbol("NODE-STACK"), makeSymbol("HEAP"), makeSymbol("REVERSE-ORDER?"));
  public static final SubLString $str44$Error__stack_underflow_during_hea = makeString("Error: stack underflow during heap iteration.");
  public static final SubLString $str45$Error_in_heap_iterator_state_ = makeString("Error in heap iterator state.");
  public static final SubLSymbol $sym46$HEAP_UNIT_TEST_INSERT_REMOVE = makeSymbol("HEAP-UNIT-TEST-INSERT-REMOVE");
  public static final SubLSymbol $kw47$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw48$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw49$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw50$KB = makeKeyword("KB");
  public static final SubLSymbol $kw51$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw52$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list53 = list(list(list(ONE_INTEGER), makeKeyword("SUCCESS")), list(list(TEN_INTEGER, makeSymbol("<="), makeSymbol("FIRST"), makeSymbol("LIST")), makeKeyword("SUCCESS")), list(list(makeInteger(212), makeSymbol(">="), makeSymbol("FIRST"), makeSymbol("LIST")), makeKeyword("SUCCESS")));
  public static final SubLString $str54$The_heap_is_not_empty_after_creat = makeString("The heap is not empty after creation.");
  public static final SubLString $str55$The_heap_is_not_full_after_popula = makeString("The heap is not full after population");
  public static final SubLString $str56$Cannot_find_element__A_in_the_hea = makeString("Cannot find element ~A in the heap.");
  public static final SubLString $str57$Cannot_determine_index_of_element = makeString("Cannot determine index of element ~A in the heap.");
  public static final SubLString $str58$The_heap_and_the_vector_disagree_ = makeString("The heap and the vector disagree on priority of item #~A: vector sez ~A, heap sez ~A");
  public static final SubLString $str59$The_heap_is_not_empty_after_remov = makeString("The heap is not empty after removing all");
  public static final SubLSymbol $kw60$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $sym61$HEAP_UNIT_TEST_SORTING = makeSymbol("HEAP-UNIT-TEST-SORTING");
  public static final SubLList $list62 = list(list(list(makeString("asortingexample")), makeKeyword("SUCCESS")), list(list(makeString("there was a king who ruled the land his majesty was in command")), makeKeyword("SUCCESS")), list(list(makeString("flying flags from every steeple showering silver on the people")), makeKeyword("SUCCESS")), list(list(makeString("--Pink Floyd, from: Piper at the Gates of Dawn")), makeKeyword("SUCCESS")));
  public static final SubLSymbol $sym63$CHAR_CODE = makeSymbol("CHAR-CODE");
  public static final SubLSymbol $sym64$_ = makeSymbol("<");
  public static final SubLString $str65$Heap__A_and_reference_string__A_d = makeString("Heap ~A and reference string ~A differ at position ~D.");
  public static final SubLSymbol $sym66$HEAP_UNIT_TEST_PRIORITIZING = makeSymbol("HEAP-UNIT-TEST-PRIORITIZING");
  public static final SubLList $list67 = list(list(list(makeString("asortingexample")), makeKeyword("SUCCESS")), list(list(makeString("there was a king who ruled the land his majesty was in command")), makeKeyword("SUCCESS")), list(list(makeString("flying flags from every steeple showering silver on the people")), makeKeyword("SUCCESS")), list(list(makeString("--Pink Floyd, from: Piper at the Gates of Dawn")), makeKeyword("SUCCESS")), list(list(makeKeyword("COPYRIGHT-NOTICE")), makeKeyword("SUCCESS")));
  public static final SubLSymbol $sym68$HEAP_TEST_EXAMPLE = makeSymbol("HEAP-TEST-EXAMPLE");
  public static final SubLSymbol $sym69$HEAP_TEST_EXAMPLE_P = makeSymbol("HEAP-TEST-EXAMPLE-P");
  public static final SubLList $list70 = list(makeSymbol("PRIORITY"), makeSymbol("VALUE"));
  public static final SubLList $list71 = list(makeKeyword("PRIORITY"), makeKeyword("VALUE"));
  public static final SubLList $list72 = list(makeSymbol("HEAP-TEST-EXAMPLE-PRIORITY"), makeSymbol("HEAP-TEST-EXAMPLE-VALUE"));
  public static final SubLList $list73 = list(makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-PRIORITY"), makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-VALUE"));
  public static final SubLSymbol $sym74$PRINT_HEAP_TEST_EXAMPLE = makeSymbol("PRINT-HEAP-TEST-EXAMPLE");
  public static final SubLSymbol $sym75$HEAP_TEST_EXAMPLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HEAP-TEST-EXAMPLE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym76$HEAP_TEST_EXAMPLE_PRIORITY = makeSymbol("HEAP-TEST-EXAMPLE-PRIORITY");
  public static final SubLSymbol $sym77$_CSETF_HEAP_TEST_EXAMPLE_PRIORITY = makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-PRIORITY");
  public static final SubLSymbol $sym78$HEAP_TEST_EXAMPLE_VALUE = makeSymbol("HEAP-TEST-EXAMPLE-VALUE");
  public static final SubLSymbol $sym79$_CSETF_HEAP_TEST_EXAMPLE_VALUE = makeSymbol("_CSETF-HEAP-TEST-EXAMPLE-VALUE");
  public static final SubLSymbol $kw80$PRIORITY = makeKeyword("PRIORITY");
  public static final SubLSymbol $kw81$VALUE = makeKeyword("VALUE");
  public static final SubLString $str82$_priority_ = makeString(" priority ");
  public static final SubLString $str83$_value_ = makeString(" value ");
  public static final SubLSymbol $sym84$NUMBERP = makeSymbol("NUMBERP");
  public static final SubLSymbol $kw85$COPYRIGHT_NOTICE = makeKeyword("COPYRIGHT-NOTICE");
  public static final SubLList $list86 = list(FIVE_INTEGER, TEN_INTEGER, FIFTEEN_INTEGER, TWENTY_INTEGER, makeInteger(25));
  public static final SubLSymbol $kw87$FAILURE = makeKeyword("FAILURE");
  public static final SubLSymbol $sym88$GET_HEAP_TEST_EXAMPLE_PRIORITY = makeSymbol("GET-HEAP-TEST-EXAMPLE-PRIORITY");
  public static final SubLString $str89$Doing_a__A_heap_of_size__D_on_str = makeString("Doing a ~A heap of size ~D on string ~A.~%");
  public static final SubLString $str90$min = makeString("min");
  public static final SubLString $str91$max = makeString("max");
  public static final SubLString $str92$_A_lost_and_left_ = makeString("~A lost and left.");
  public static final SubLString $str93$Adding__A_to_heap____elements_ = makeString("Adding ~A to heap -> elements.");
  public static final SubLString $str94$Changing_the_priority_of__A_from_ = makeString("Changing the priority of ~A from ~D to ~D had no effect on reconsider.~%Prior: ~A~%Current: ~A~%");
  public static final SubLString $str95$__ = makeString("<=");
  public static final SubLString $str96$__ = makeString(">=");
  public static final SubLString $str97$The_heap_is_not_in_proper_order__ = makeString("The heap is not in proper order: ~D is not ~A ~D.~%Heap: ~A");

  //// Initializers

  public void declareFunctions() {
    declare_heap_file();
  }

  public void initializeVariables() {
    init_heap_file();
  }

  public void runTopLevelForms() {
    setup_heap_file();
  }

}
