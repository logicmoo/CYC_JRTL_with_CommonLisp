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
//dm import com.cyc.cycjava_1.cycl.cache;
//dm import com.cyc.cycjava_1.cycl.cache_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class simple_lru_cache_strategy extends SubLTranslatedFile {

  //// Constructor

  private simple_lru_cache_strategy() {}
  public static final SubLFile me = new simple_lru_cache_strategy();
  public static final String myName = "com.cyc.cycjava_1.cycl.simple_lru_cache_strategy";

  //// Definitions

  public static final class $simple_lru_cache_strategy_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $capacity; }
    public SubLObject getField3() { return $index; }
    public SubLObject getField4() { return $payload; }
    public SubLObject getField5() { return $head; }
    public SubLObject getField6() { return $tail; }
    public SubLObject getField7() { return $freelist_head; }
    public SubLObject getField8() { return $metrics; }
    public SubLObject setField2(SubLObject value) { return $capacity = value; }
    public SubLObject setField3(SubLObject value) { return $index = value; }
    public SubLObject setField4(SubLObject value) { return $payload = value; }
    public SubLObject setField5(SubLObject value) { return $head = value; }
    public SubLObject setField6(SubLObject value) { return $tail = value; }
    public SubLObject setField7(SubLObject value) { return $freelist_head = value; }
    public SubLObject setField8(SubLObject value) { return $metrics = value; }
    public SubLObject $capacity = NIL;
    public SubLObject $index = NIL;
    public SubLObject $payload = NIL;
    public SubLObject $head = NIL;
    public SubLObject $tail = NIL;
    public SubLObject $freelist_head = NIL;
    public SubLObject $metrics = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($simple_lru_cache_strategy_native.class, $sym0$SIMPLE_LRU_CACHE_STRATEGY, $sym1$SIMPLE_LRU_CACHE_STRATEGY_P, $list2, $list3, new String[] {"$capacity", "$index", "$payload", "$head", "$tail", "$freelist_head", "$metrics"}, $list4, $list5, $sym6$PRINT_SIMPLE_LRU_CACHE_STRATEGY);
  }

  @SubL(source = "cycl/simple-lru-cache-strategy.lisp", position = 2211) 
  public static SubLSymbol $dtp_simple_lru_cache_strategy$ = null;

  @SubL(source = "cycl/simple-lru-cache-strategy.lisp", position = 2211) 
  public static final SubLObject simple_lru_cache_strategy_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29372");
    return NIL;
  }

  public static final class $simple_lru_cache_strategy_p$UnaryFunction extends UnaryFunction {
    public $simple_lru_cache_strategy_p$UnaryFunction() { super(extractFunctionNamed("SIMPLE-LRU-CACHE-STRATEGY-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29397"); }
  }

  @SubL(source = "cycl/simple-lru-cache-strategy.lisp", position = 22125) 
  public static final SubLObject cache_strategy_object_p_simple_lru_cache_strategy_method(SubLObject strategy) {
    return T;
  }

  @SubL(source = "cycl/simple-lru-cache-strategy.lisp", position = 22719) 
  public static final SubLObject cache_strategy_object_reset_simple_lru_cache_strategy_method(SubLObject strategy) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29353");
  }

  @SubL(source = "cycl/simple-lru-cache-strategy.lisp", position = 22861) 
  public static final SubLObject cache_strategy_object_cache_capacity_simple_lru_cache_strategy_method(SubLObject strategy) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29351");
  }

  @SubL(source = "cycl/simple-lru-cache-strategy.lisp", position = 23021) 
  public static final SubLObject cache_strategy_object_cache_size_simple_lru_cache_strategy_method(SubLObject strategy) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29352");
  }

  @SubL(source = "cycl/simple-lru-cache-strategy.lisp", position = 23173) 
  public static final SubLObject cache_strategy_object_track_simple_lru_cache_strategy_method(SubLObject strategy, SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29354");
  }

  public static final SubLObject declare_simple_lru_cache_strategy_file() {
    declareFunction(myName, "simple_lru_cache_strategy_print_function_trampoline", "SIMPLE-LRU-CACHE-STRATEGY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_p", "SIMPLE-LRU-CACHE-STRATEGY-P", 1, 0, false); new $simple_lru_cache_strategy_p$UnaryFunction();
    declareFunction(myName, "slru_cachestrat_capacity", "SLRU-CACHESTRAT-CAPACITY", 1, 0, false);
    declareFunction(myName, "slru_cachestrat_index", "SLRU-CACHESTRAT-INDEX", 1, 0, false);
    declareFunction(myName, "slru_cachestrat_payload", "SLRU-CACHESTRAT-PAYLOAD", 1, 0, false);
    declareFunction(myName, "slru_cachestrat_head", "SLRU-CACHESTRAT-HEAD", 1, 0, false);
    declareFunction(myName, "slru_cachestrat_tail", "SLRU-CACHESTRAT-TAIL", 1, 0, false);
    declareFunction(myName, "slru_cachestrat_freelist_head", "SLRU-CACHESTRAT-FREELIST-HEAD", 1, 0, false);
    declareFunction(myName, "slru_cachestrat_metrics", "SLRU-CACHESTRAT-METRICS", 1, 0, false);
    declareFunction(myName, "_csetf_slru_cachestrat_capacity", "_CSETF-SLRU-CACHESTRAT-CAPACITY", 2, 0, false);
    declareFunction(myName, "_csetf_slru_cachestrat_index", "_CSETF-SLRU-CACHESTRAT-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_slru_cachestrat_payload", "_CSETF-SLRU-CACHESTRAT-PAYLOAD", 2, 0, false);
    declareFunction(myName, "_csetf_slru_cachestrat_head", "_CSETF-SLRU-CACHESTRAT-HEAD", 2, 0, false);
    declareFunction(myName, "_csetf_slru_cachestrat_tail", "_CSETF-SLRU-CACHESTRAT-TAIL", 2, 0, false);
    declareFunction(myName, "_csetf_slru_cachestrat_freelist_head", "_CSETF-SLRU-CACHESTRAT-FREELIST-HEAD", 2, 0, false);
    declareFunction(myName, "_csetf_slru_cachestrat_metrics", "_CSETF-SLRU-CACHESTRAT-METRICS", 2, 0, false);
    declareFunction(myName, "make_simple_lru_cache_strategy", "MAKE-SIMPLE-LRU-CACHE-STRATEGY", 0, 1, false);
    declareFunction(myName, "print_simple_lru_cache_strategy", "PRINT-SIMPLE-LRU-CACHE-STRATEGY", 3, 0, false);
    declareFunction(myName, "new_simple_lru_cache_strategy", "NEW-SIMPLE-LRU-CACHE-STRATEGY", 1, 1, false);
    declareFunction(myName, "clear_simple_lru_cache_strategy", "CLEAR-SIMPLE-LRU-CACHE-STRATEGY", 1, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_size", "SIMPLE-LRU-CACHE-STRATEGY-SIZE", 1, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_capacity", "SIMPLE-LRU-CACHE-STRATEGY-CAPACITY", 1, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_trackedP", "SIMPLE-LRU-CACHE-STRATEGY-TRACKED?", 2, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_track", "SIMPLE-LRU-CACHE-STRATEGY-TRACK", 2, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_note_reference", "SIMPLE-LRU-CACHE-STRATEGY-NOTE-REFERENCE", 2, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_untrack", "SIMPLE-LRU-CACHE-STRATEGY-UNTRACK", 2, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_peek_most_recent_nth", "SIMPLE-LRU-CACHE-STRATEGY-PEEK-MOST-RECENT-NTH", 2, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_peek_most_recent", "SIMPLE-LRU-CACHE-STRATEGY-PEEK-MOST-RECENT", 1, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_peek_least_recent", "SIMPLE-LRU-CACHE-STRATEGY-PEEK-LEAST-RECENT", 1, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_peek_least_recent_nth", "SIMPLE-LRU-CACHE-STRATEGY-PEEK-LEAST-RECENT-NTH", 2, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_most_recent_items", "SIMPLE-LRU-CACHE-STRATEGY-MOST-RECENT-ITEMS", 1, 0, false);
    declareFunction(myName, "simple_lru_cache_strategy_least_recent_items", "SIMPLE-LRU-CACHE-STRATEGY-LEAST-RECENT-ITEMS", 1, 0, false);
    declareFunction(myName, "new_simple_lru_cache_current_content_iterator", "NEW-SIMPLE-LRU-CACHE-CURRENT-CONTENT-ITERATOR", 1, 1, false);
    declareFunction(myName, "slru_cache_index_datum", "SLRU-CACHE-INDEX-DATUM", 1, 0, false);
    declareFunction(myName, "slru_cache_index_backref", "SLRU-CACHE-INDEX-BACKREF", 1, 0, false);
    declareFunction(myName, "slru_cache_index_fwdref", "SLRU-CACHE-INDEX-FWDREF", 1, 0, false);
    declareFunction(myName, "slru_cache_payload_size", "SLRU-CACHE-PAYLOAD-SIZE", 1, 0, false);
    declareFunction(myName, "get_slru_cache_index_datum", "GET-SLRU-CACHE-INDEX-DATUM", 2, 0, false);
    declareFunction(myName, "get_slru_cache_index_backref", "GET-SLRU-CACHE-INDEX-BACKREF", 2, 0, false);
    declareFunction(myName, "get_slru_cache_index_fwdref", "GET-SLRU-CACHE-INDEX-FWDREF", 2, 0, false);
    declareFunction(myName, "get_slru_cache_index_type", "GET-SLRU-CACHE-INDEX-TYPE", 1, 0, false);
    declareFunction(myName, "set_slru_cache_payload_index_datum", "SET-SLRU-CACHE-PAYLOAD-INDEX-DATUM", 3, 0, false);
    declareFunction(myName, "set_slru_cache_payload_index_backref", "SET-SLRU-CACHE-PAYLOAD-INDEX-BACKREF", 3, 0, false);
    declareFunction(myName, "set_slru_cache_payload_index_fwdref", "SET-SLRU-CACHE-PAYLOAD-INDEX-FWDREF", 3, 0, false);
    declareFunction(myName, "set_slru_cache_index_datum", "SET-SLRU-CACHE-INDEX-DATUM", 3, 0, false);
    declareFunction(myName, "set_slru_cache_index_backref", "SET-SLRU-CACHE-INDEX-BACKREF", 3, 0, false);
    declareFunction(myName, "set_slru_cache_index_fwdref", "SET-SLRU-CACHE-INDEX-FWDREF", 3, 0, false);
    declareFunction(myName, "slru_cache_reset_linked_list", "SLRU-CACHE-RESET-LINKED-LIST", 1, 0, false);
    declareFunction(myName, "slru_cache_linked_list_dequeue", "SLRU-CACHE-LINKED-LIST-DEQUEUE", 2, 0, false);
    declareFunction(myName, "slru_cache_linked_list_dequeue_and_resource", "SLRU-CACHE-LINKED-LIST-DEQUEUE-AND-RESOURCE", 2, 0, false);
    declareFunction(myName, "slru_cache_linked_list_insert_new_at_head", "SLRU-CACHE-LINKED-LIST-INSERT-NEW-AT-HEAD", 2, 0, false);
    declareFunction(myName, "slru_cache_linked_list_insert_known_at_head", "SLRU-CACHE-LINKED-LIST-INSERT-KNOWN-AT-HEAD", 3, 0, false);
    declareFunction(myName, "slru_cache_linked_list_insert_recycling_at_head", "SLRU-CACHE-LINKED-LIST-INSERT-RECYCLING-AT-HEAD", 2, 0, false);
    declareFunction(myName, "slru_cache_linked_list_recycle_tail_as_head", "SLRU-CACHE-LINKED-LIST-RECYCLE-TAIL-AS-HEAD", 1, 0, false);
    declareFunction(myName, "slru_cache_linked_list_insert_index_at_front", "SLRU-CACHE-LINKED-LIST-INSERT-INDEX-AT-FRONT", 2, 0, false);
    declareFunction(myName, "print_slru_cache_linked_list_status", "PRINT-SLRU-CACHE-LINKED-LIST-STATUS", 1, 0, false);
    declareFunction(myName, "slru_cache_freelist_empty_p", "SLRU-CACHE-FREELIST-EMPTY-P", 1, 0, false);
    declareFunction(myName, "slru_cache_reset_freelist", "SLRU-CACHE-RESET-FREELIST", 1, 0, false);
    declareFunction(myName, "slru_cache_freelist_dequeue", "SLRU-CACHE-FREELIST-DEQUEUE", 1, 0, false);
    declareFunction(myName, "slru_cache_freelist_enqueue", "SLRU-CACHE-FREELIST-ENQUEUE", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_p_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_reset_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-RESET-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_cache_capacity_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_cache_size_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-CACHE-SIZE-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_track_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-TRACK-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_trackedP_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-TRACKED?-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_untrack_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-UNTRACK-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_supports_parameter_p_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_get_parameter_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-GET-PARAMETER-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 3, 0, false);
    declareFunction(myName, "cache_strategy_object_set_parameter_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-SET-PARAMETER-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 3, 0, false);
    declareFunction(myName, "cache_strategy_object_note_reference_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_note_references_in_order_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_get_metrics_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-GET-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_reset_metrics_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-RESET-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_gather_metrics_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-GATHER-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_dont_gather_metrics_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_keeps_metrics_p_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
    declareFunction(myName, "new_cache_strategy_object_tracked_content_iterator_simple_lru_cache_strategy_method", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
    declareFunction(myName, "map_cache_strategy_object_tracked_content_simple_lru_cache_strategy_method", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_untrack_all_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_cache_capacity", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-CACHE-CAPACITY", 1, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_cache_size", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-CACHE-SIZE", 1, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_dont_gather_metrics", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-DONT-GATHER-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_gather_metrics", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-GATHER-METRICS", 2, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_get_metrics", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-GET-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_get_parameter", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-GET-PARAMETER", 3, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_keeps_metrics_p", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-KEEPS-METRICS-P", 1, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_note_reference", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-NOTE-REFERENCE", 2, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_note_references_in_order", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_reset", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-RESET", 1, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_reset_metrics", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-RESET-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_set_parameter", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-SET-PARAMETER", 3, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_supports_parameter_p", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_track", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-TRACK", 2, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_trackedP", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-TRACKED?", 2, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_untrack", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-UNTRACK", 2, 0, false);
    declareFunction(myName, "cache_strategy_slru_cache_object_untrack_all", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-UNTRACK-ALL", 2, 0, false);
    declareFunction(myName, "map_cache_strategy_slru_cache_object_tracked_content", "MAP-CACHE-STRATEGY-SLRU-CACHE-OBJECT-TRACKED-CONTENT", 2, 0, false);
    declareFunction(myName, "new_cache_strategy_slru_cache_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-SLRU-CACHE-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false);
    declareFunction(myName, "test_basic_slru_cache_strategy", "TEST-BASIC-SLRU-CACHE-STRATEGY", 0, 1, false);
    declareFunction(myName, "compare_slru_cache_strategy_with_cache", "COMPARE-SLRU-CACHE-STRATEGY-WITH-CACHE", 1, 1, false);
    declareFunction(myName, "compare_slru_cache_strategy_speed_with_cache", "COMPARE-SLRU-CACHE-STRATEGY-SPEED-WITH-CACHE", 1, 2, false);
    declareFunction(myName, "test_slru_cache_strategy_compare_directions", "TEST-SLRU-CACHE-STRATEGY-COMPARE-DIRECTIONS", 1, 0, false);
    declareFunction(myName, "test_slru_cache_strategy_peek_operators", "TEST-SLRU-CACHE-STRATEGY-PEEK-OPERATORS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_simple_lru_cache_strategy_file() {
    $dtp_simple_lru_cache_strategy$ = defconstant("*DTP-SIMPLE-LRU-CACHE-STRATEGY*", $sym0$SIMPLE_LRU_CACHE_STRATEGY);
    return NIL;
  }

  public static final SubLObject setup_simple_lru_cache_strategy_file() {
    // CVS_ID("Id: simple-lru-cache-strategy.lisp 126880 2009-01-22 21:59:16Z tbrussea ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym7$SIMPLE_LRU_CACHE_STRATEGY_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$SLRU_CACHESTRAT_CAPACITY, $sym9$_CSETF_SLRU_CACHESTRAT_CAPACITY);
    Structures.def_csetf($sym10$SLRU_CACHESTRAT_INDEX, $sym11$_CSETF_SLRU_CACHESTRAT_INDEX);
    Structures.def_csetf($sym12$SLRU_CACHESTRAT_PAYLOAD, $sym13$_CSETF_SLRU_CACHESTRAT_PAYLOAD);
    Structures.def_csetf($sym14$SLRU_CACHESTRAT_HEAD, $sym15$_CSETF_SLRU_CACHESTRAT_HEAD);
    Structures.def_csetf($sym16$SLRU_CACHESTRAT_TAIL, $sym17$_CSETF_SLRU_CACHESTRAT_TAIL);
    Structures.def_csetf($sym18$SLRU_CACHESTRAT_FREELIST_HEAD, $sym19$_CSETF_SLRU_CACHESTRAT_FREELIST_HEAD);
    Structures.def_csetf($sym20$SLRU_CACHESTRAT_METRICS, $sym21$_CSETF_SLRU_CACHESTRAT_METRICS);
    Equality.identity($sym0$SIMPLE_LRU_CACHE_STRATEGY);
    Structures.register_method(cache_utilities.$cache_strategy_object_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym50$CACHE_STRATEGY_OBJECT_P_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
    Structures.register_method(cache_utilities.$cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym51$CACHE_STRATEGY_OBJECT_RESET_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
    Structures.register_method(cache_utilities.$cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym52$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_SIMPLE_LRU_CACHE_STRATEGY_ME));
    Structures.register_method(cache_utilities.$cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym53$CACHE_STRATEGY_OBJECT_CACHE_SIZE_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
    Structures.register_method(cache_utilities.$cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym54$CACHE_STRATEGY_OBJECT_TRACK_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
    Structures.register_method(cache_utilities.$cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym55$CACHE_STRATEGY_OBJECT_TRACKED__SIMPLE_LRU_CACHE_STRATEGY_METHOD));
    Structures.register_method(cache_utilities.$cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym56$CACHE_STRATEGY_OBJECT_UNTRACK_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
    Structures.register_method(cache_utilities.$cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym57$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_SIMPLE_LRU_CACHE_STRAT));
    Structures.register_method(cache_utilities.$cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym58$CACHE_STRATEGY_OBJECT_GET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET));
    Structures.register_method(cache_utilities.$cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym59$CACHE_STRATEGY_OBJECT_SET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET));
    Structures.register_method(cache_utilities.$cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym60$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_SIMPLE_LRU_CACHE_STRATEGY_ME));
    Structures.register_method(cache_utilities.$cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym61$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_SIMPLE_LRU_CACHE_S));
    Structures.register_method(cache_utilities.$cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym62$CACHE_STRATEGY_OBJECT_GET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_METHO));
    Structures.register_method(cache_utilities.$cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym63$CACHE_STRATEGY_OBJECT_RESET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_MET));
    Structures.register_method(cache_utilities.$cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym64$CACHE_STRATEGY_OBJECT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATEGY_ME));
    Structures.register_method(cache_utilities.$cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym65$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATE));
    Structures.register_method(cache_utilities.$cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym66$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_SIMPLE_LRU_CACHE_STRATEGY_M));
    Structures.register_method(cache_utilities.$new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym67$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_SIMPLE_LRU_CAC));
    Structures.register_method(cache_utilities.$map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym68$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_SIMPLE_LRU_CACHE_STRATE));
    Structures.register_method(cache_utilities.$cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), Symbols.symbol_function($sym69$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_SIMPLE_LRU_CACHE_STRATEGY_METHO));
    generic_testing.define_test_case_table_int($sym70$TEST_BASIC_SLRU_CACHE_STRATEGY, list(new SubLObject[] {$kw71$TEST, NIL, $kw72$OWNER, NIL, $kw73$CLASSES, NIL, $kw74$KB, $kw75$TINY, $kw76$WORKING_, T}), $list77);
    generic_testing.define_test_case_table_int($sym90$COMPARE_SLRU_CACHE_STRATEGY_WITH_CACHE, list(new SubLObject[] {$kw71$TEST, NIL, $kw72$OWNER, NIL, $kw73$CLASSES, NIL, $kw74$KB, $kw75$TINY, $kw76$WORKING_, NIL}), $list91);
    generic_testing.define_test_case_table_int($sym93$COMPARE_SLRU_CACHE_STRATEGY_SPEED_WITH_CACHE, list(new SubLObject[] {$kw71$TEST, NIL, $kw72$OWNER, NIL, $kw73$CLASSES, NIL, $kw74$KB, $kw75$TINY, $kw76$WORKING_, NIL}), $list94);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SIMPLE_LRU_CACHE_STRATEGY = makeSymbol("SIMPLE-LRU-CACHE-STRATEGY");
  public static final SubLSymbol $sym1$SIMPLE_LRU_CACHE_STRATEGY_P = makeSymbol("SIMPLE-LRU-CACHE-STRATEGY-P");
  public static final SubLList $list2 = list(makeSymbol("CAPACITY"), makeSymbol("INDEX"), makeSymbol("PAYLOAD"), makeSymbol("HEAD"), makeSymbol("TAIL"), makeSymbol("FREELIST-HEAD"), makeSymbol("METRICS"));
  public static final SubLList $list3 = list(makeKeyword("CAPACITY"), makeKeyword("INDEX"), makeKeyword("PAYLOAD"), makeKeyword("HEAD"), makeKeyword("TAIL"), makeKeyword("FREELIST-HEAD"), makeKeyword("METRICS"));
  public static final SubLList $list4 = list(makeSymbol("SLRU-CACHESTRAT-CAPACITY"), makeSymbol("SLRU-CACHESTRAT-INDEX"), makeSymbol("SLRU-CACHESTRAT-PAYLOAD"), makeSymbol("SLRU-CACHESTRAT-HEAD"), makeSymbol("SLRU-CACHESTRAT-TAIL"), makeSymbol("SLRU-CACHESTRAT-FREELIST-HEAD"), makeSymbol("SLRU-CACHESTRAT-METRICS"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-SLRU-CACHESTRAT-CAPACITY"), makeSymbol("_CSETF-SLRU-CACHESTRAT-INDEX"), makeSymbol("_CSETF-SLRU-CACHESTRAT-PAYLOAD"), makeSymbol("_CSETF-SLRU-CACHESTRAT-HEAD"), makeSymbol("_CSETF-SLRU-CACHESTRAT-TAIL"), makeSymbol("_CSETF-SLRU-CACHESTRAT-FREELIST-HEAD"), makeSymbol("_CSETF-SLRU-CACHESTRAT-METRICS"));
  public static final SubLSymbol $sym6$PRINT_SIMPLE_LRU_CACHE_STRATEGY = makeSymbol("PRINT-SIMPLE-LRU-CACHE-STRATEGY");
  public static final SubLSymbol $sym7$SIMPLE_LRU_CACHE_STRATEGY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SIMPLE-LRU-CACHE-STRATEGY-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$SLRU_CACHESTRAT_CAPACITY = makeSymbol("SLRU-CACHESTRAT-CAPACITY");
  public static final SubLSymbol $sym9$_CSETF_SLRU_CACHESTRAT_CAPACITY = makeSymbol("_CSETF-SLRU-CACHESTRAT-CAPACITY");
  public static final SubLSymbol $sym10$SLRU_CACHESTRAT_INDEX = makeSymbol("SLRU-CACHESTRAT-INDEX");
  public static final SubLSymbol $sym11$_CSETF_SLRU_CACHESTRAT_INDEX = makeSymbol("_CSETF-SLRU-CACHESTRAT-INDEX");
  public static final SubLSymbol $sym12$SLRU_CACHESTRAT_PAYLOAD = makeSymbol("SLRU-CACHESTRAT-PAYLOAD");
  public static final SubLSymbol $sym13$_CSETF_SLRU_CACHESTRAT_PAYLOAD = makeSymbol("_CSETF-SLRU-CACHESTRAT-PAYLOAD");
  public static final SubLSymbol $sym14$SLRU_CACHESTRAT_HEAD = makeSymbol("SLRU-CACHESTRAT-HEAD");
  public static final SubLSymbol $sym15$_CSETF_SLRU_CACHESTRAT_HEAD = makeSymbol("_CSETF-SLRU-CACHESTRAT-HEAD");
  public static final SubLSymbol $sym16$SLRU_CACHESTRAT_TAIL = makeSymbol("SLRU-CACHESTRAT-TAIL");
  public static final SubLSymbol $sym17$_CSETF_SLRU_CACHESTRAT_TAIL = makeSymbol("_CSETF-SLRU-CACHESTRAT-TAIL");
  public static final SubLSymbol $sym18$SLRU_CACHESTRAT_FREELIST_HEAD = makeSymbol("SLRU-CACHESTRAT-FREELIST-HEAD");
  public static final SubLSymbol $sym19$_CSETF_SLRU_CACHESTRAT_FREELIST_HEAD = makeSymbol("_CSETF-SLRU-CACHESTRAT-FREELIST-HEAD");
  public static final SubLSymbol $sym20$SLRU_CACHESTRAT_METRICS = makeSymbol("SLRU-CACHESTRAT-METRICS");
  public static final SubLSymbol $sym21$_CSETF_SLRU_CACHESTRAT_METRICS = makeSymbol("_CSETF-SLRU-CACHESTRAT-METRICS");
  public static final SubLSymbol $kw22$CAPACITY = makeKeyword("CAPACITY");
  public static final SubLSymbol $kw23$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw24$PAYLOAD = makeKeyword("PAYLOAD");
  public static final SubLSymbol $kw25$HEAD = makeKeyword("HEAD");
  public static final SubLSymbol $kw26$TAIL = makeKeyword("TAIL");
  public static final SubLSymbol $kw27$FREELIST_HEAD = makeKeyword("FREELIST-HEAD");
  public static final SubLSymbol $kw28$METRICS = makeKeyword("METRICS");
  public static final SubLString $str29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str30$__ = makeString("#<");
  public static final SubLSymbol $kw31$STREAM = makeKeyword("STREAM");
  public static final SubLString $str32$_ = makeString(" ");
  public static final SubLString $str33$_ = makeString("/");
  public static final SubLSymbol $kw34$BASE = makeKeyword("BASE");
  public static final SubLString $str35$Invalid_state_transition_in_TRACK = makeString("Invalid state transition in TRACK");
  public static final SubLString $str36$There_is_a_situation_where_RECYCL = makeString("There is a situation where RECYCLE introduces a new spot--investigate!");
  public static final SubLSymbol $kw37$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $kw38$DATUM = makeKeyword("DATUM");
  public static final SubLSymbol $kw39$BACKREF = makeKeyword("BACKREF");
  public static final SubLSymbol $kw40$FWDREF = makeKeyword("FWDREF");
  public static final SubLString $str41$Wow__MOD_is_broken_____ = makeString("Wow, MOD is broken ...!");
  public static final SubLSymbol $kw42$ERROR = makeKeyword("ERROR");
  public static final SubLString $str43$Head__ = makeString("Head: ");
  public static final SubLString $str44$__ = makeString(" [");
  public static final SubLString $str45$___ = makeString("| #");
  public static final SubLString $str46$__v_ = makeString(": v=");
  public static final SubLString $str47$___M_ = makeString(" <-M ");
  public static final SubLString $str48$_L___ = makeString(" L-> ");
  public static final SubLString $str49$___Tail__ = makeString("|] Tail: ");
  public static final SubLSymbol $sym50$CACHE_STRATEGY_OBJECT_P_SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym51$CACHE_STRATEGY_OBJECT_RESET_SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym52$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_SIMPLE_LRU_CACHE_STRATEGY_ME = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym53$CACHE_STRATEGY_OBJECT_CACHE_SIZE_SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-SIZE-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym54$CACHE_STRATEGY_OBJECT_TRACK_SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-TRACK-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym55$CACHE_STRATEGY_OBJECT_TRACKED__SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-TRACKED?-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym56$CACHE_STRATEGY_OBJECT_UNTRACK_SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym57$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_SIMPLE_LRU_CACHE_STRAT = makeSymbol("CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym58$CACHE_STRATEGY_OBJECT_GET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET = makeSymbol("CACHE-STRATEGY-OBJECT-GET-PARAMETER-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym59$CACHE_STRATEGY_OBJECT_SET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET = makeSymbol("CACHE-STRATEGY-OBJECT-SET-PARAMETER-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym60$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_SIMPLE_LRU_CACHE_STRATEGY_ME = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym61$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_SIMPLE_LRU_CACHE_S = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym62$CACHE_STRATEGY_OBJECT_GET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_METHO = makeSymbol("CACHE-STRATEGY-OBJECT-GET-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym63$CACHE_STRATEGY_OBJECT_RESET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_MET = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym64$CACHE_STRATEGY_OBJECT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATEGY_ME = makeSymbol("CACHE-STRATEGY-OBJECT-GATHER-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym65$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATE = makeSymbol("CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym66$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_SIMPLE_LRU_CACHE_STRATEGY_M = makeSymbol("CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym67$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_SIMPLE_LRU_CAC = makeSymbol("NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym68$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_SIMPLE_LRU_CACHE_STRATE = makeSymbol("MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym69$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_SIMPLE_LRU_CACHE_STRATEGY_METHO = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-ALL-SIMPLE-LRU-CACHE-STRATEGY-METHOD");
  public static final SubLSymbol $sym70$TEST_BASIC_SLRU_CACHE_STRATEGY = makeSymbol("TEST-BASIC-SLRU-CACHE-STRATEGY");
  public static final SubLSymbol $kw71$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw72$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw73$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw74$KB = makeKeyword("KB");
  public static final SubLSymbol $kw75$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw76$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list77 = list(list(list(TEN_INTEGER), makeKeyword("SUCCESS")), list(list(TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(50)), makeKeyword("SUCCESS")));
  public static final SubLString $str78$The_freshly_allocated_cache_strat = makeString("The freshly allocated cache strategy is not empty.");
  public static final SubLString $str79$There_are_not__A__but__A_items_in = makeString("There are not ~A, but ~A items in the cache.");
  public static final SubLString $str80$The_item__A_is_being_tracked_befo = makeString("The item ~A is being tracked before we added it.");
  public static final SubLString $str81$The_addition_of_the_item__A_to_th = makeString("The addition of the item ~A to the cache did not result in that item being returned.");
  public static final SubLString $str82$The_newly_added_item__A_is_not_th = makeString("The newly added item ~A is not the most recent item ~A.");
  public static final SubLString $str83$The_item__A_is_not_tracked_despit = makeString("The item ~A is not tracked despite the fact that we just added it.");
  public static final SubLString $str84$The_just_touched_item__A_is_not_t = makeString("The just-touched item ~A is not the most recent item ~A.");
  public static final SubLString $str85$The_most_recent_nth__A_is_not_eve = makeString("The most-recent nth ~A is not even but ~A.");
  public static final SubLString $str86$The_least_recent_nth__A_is_not_od = makeString("The least-recent nth ~A is not odd but ~A.");
  public static final SubLString $str87$At__A__the_previous_most_recent__ = makeString("At ~A, the previous most-recent ~A is not larger than the current ~A.");
  public static final SubLString $str88$At__A__the_previous_least_recent_ = makeString("At ~A, the previous least-recent ~A is not smaller than the current ~A.");
  public static final SubLSymbol $kw89$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $sym90$COMPARE_SLRU_CACHE_STRATEGY_WITH_CACHE = makeSymbol("COMPARE-SLRU-CACHE-STRATEGY-WITH-CACHE");
  public static final SubLList $list91 = list(list(list(TEN_INTEGER, TWO_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(100), TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(1000), makeInteger(50)), makeKeyword("SUCCESS")));
  public static final SubLString $str92$The_CACHE_P_and_the_SLRU_CACHE_ar = makeString("The CACHE-P and the SLRU-CACHE are out of sync. ~%Upon adding item ~A, CACHE-P returned ~A and SLRU-CACHE ~A~%Prior State: ~A~%");
  public static final SubLSymbol $sym93$COMPARE_SLRU_CACHE_STRATEGY_SPEED_WITH_CACHE = makeSymbol("COMPARE-SLRU-CACHE-STRATEGY-SPEED-WITH-CACHE");
  public static final SubLList $list94 = list(list(list(makeInteger(1000), makeInteger(50)), makeKeyword("SUCCESS")), list(list(makeInteger(2000), makeInteger(80)), makeKeyword("SUCCESS")));
  public static final SubLString $str95$Sorry__but_on_run___A_CACHE_P_too = makeString("Sorry, but on run #~A CACHE-P took ~As and SLRU took ~As");
  public static final SubLString $str96$The_most_recent_item_list_is__A__ = makeString("The most recent item list is ~A, but the least recent item list is ~A.");
  public static final SubLString $str97$At__A__the_most_recent_value_shou = makeString("At ~A, the most recent value should have been a NON-NEGATIVE-INTEGER-P but is ~A instead.");
  public static final SubLString $str98$At__A__the_least_recent_value_sho = makeString("At ~A, the least recent value should have been a NON-NEGATIVE-INTEGER-P but is ~A instead.");
  public static final SubLString $str99$The_most_recent_nth_of__A_was_sup = makeString("The most-recent nth of ~A was supposed to be ~A but was ~A instead.");
  public static final SubLString $str100$The_least_recent_nth_of__A_was_su = makeString("The least-recent nth of ~A was supposed to be ~A but was ~A instead.");

  //// Initializers

  public void declareFunctions() {
    declare_simple_lru_cache_strategy_file();
  }

  public void initializeVariables() {
    init_simple_lru_cache_strategy_file();
  }

  public void runTopLevelForms() {
    setup_simple_lru_cache_strategy_file();
  }

}
