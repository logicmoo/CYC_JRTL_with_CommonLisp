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

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.kb_object_manager;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class deduction_manager extends SubLTranslatedFile {

  //// Constructor

  private deduction_manager() {}
  public static final SubLFile me = new deduction_manager();
  public static final String myName = "com.cyc.cycjava_1.cycl.deduction_manager";

  //// Definitions

  /** The KB object manager for deductions */
  @SubL(source = "cycl/deduction-manager.lisp", position = 876) 
  private static SubLSymbol $deduction_content_manager$ = null;

  /** This is a guess based on *assertion-lru-size-percentage*. */
  @SubL(source = "cycl/deduction-manager.lisp", position = 1063) 
  private static SubLSymbol $deduction_lru_size_percentage$ = null;

  @SubL(source = "cycl/deduction-manager.lisp", position = 1406) 
  public static final SubLObject setup_deduction_content_table(SubLObject size, SubLObject exactP) {
    $deduction_content_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str2$deduction, size, $deduction_lru_size_percentage$.getGlobalValue(), $sym3$LOAD_DEDUCTION_DEF_FROM_CACHE, exactP));
    return T;
  }

  @SubL(source = "cycl/deduction-manager.lisp", position = 1826) 
  public static final SubLObject clear_deduction_content_table() {
    return kb_object_manager.clear_kb_object_content_table($deduction_content_manager$.getGlobalValue());
  }

  /** Return the number of deductions whose content is cached in memory. */
  @SubL(source = "cycl/deduction-manager.lisp", position = 2505) 
  public static final SubLObject cached_deduction_count() {
    return kb_object_manager.cached_kb_object_count($deduction_content_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/deduction-manager.lisp", position = 2694) 
  public static final SubLObject deduction_content_completely_cachedP() {
    return Numbers.numE(deduction_handles.deduction_count(), cached_deduction_count());
  }

  @SubL(source = "cycl/deduction-manager.lisp", position = 2950) 
  public static final SubLObject lookup_deduction_content(SubLObject id) {
    return kb_object_manager.lookup_kb_object_content($deduction_content_manager$.getGlobalValue(), id);
  }

  /** Note that ID will be used as the id for DEDUCTION-CONTENT. */
  @SubL(source = "cycl/deduction-manager.lisp", position = 3205) 
  public static final SubLObject register_deduction_content(SubLObject id, SubLObject deduction_content) {
    return kb_object_manager.register_kb_object_content($deduction_content_manager$.getGlobalValue(), id, deduction_content);
  }

  /** Note that ID is not in use as a NART id, i.e. points to no hl-formula. */
  @SubL(source = "cycl/deduction-manager.lisp", position = 3448) 
  public static final SubLObject deregister_deduction_content(SubLObject id) {
    return kb_object_manager.deregister_kb_object_content($deduction_content_manager$.getGlobalValue(), id);
  }

  @SubL(source = "cycl/deduction-manager.lisp", position = 3647) 
  public static final SubLObject mark_deduction_content_as_muted(SubLObject id) {
    return kb_object_manager.mark_kb_object_content_as_muted($deduction_content_manager$.getGlobalValue(), id);
  }

  @SubL(source = "cycl/deduction-manager.lisp", position = 4617) 
  public static final SubLObject swap_out_all_pristine_deductions() {
    return kb_object_manager.swap_out_all_pristine_kb_objects_int($deduction_content_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/deduction-manager.lisp", position = 4748) 
  public static final SubLObject initialize_deduction_hl_store_cache() {
    return kb_object_manager.initialize_kb_object_hl_store_cache($deduction_content_manager$.getGlobalValue(), $str2$deduction, $str4$deduction_index);
  }

  public static final SubLObject declare_deduction_manager_file() {
    declareFunction(myName, "setup_deduction_content_table", "SETUP-DEDUCTION-CONTENT-TABLE", 2, 0, false);
    declareFunction(myName, "optimize_deduction_content_table", "OPTIMIZE-DEDUCTION-CONTENT-TABLE", 1, 0, false);
    declareFunction(myName, "clear_deduction_content_table", "CLEAR-DEDUCTION-CONTENT-TABLE", 0, 0, false);
    declareFunction(myName, "maintain_deduction_usage_counts", "MAINTAIN-DEDUCTION-USAGE-COUNTS", 0, 0, false);
    declareFunction(myName, "dont_maintain_deduction_usage_counts", "DONT-MAINTAIN-DEDUCTION-USAGE-COUNTS", 0, 0, false);
    declareFunction(myName, "deduction_usage_counts_enabled_p", "DEDUCTION-USAGE-COUNTS-ENABLED-P", 0, 0, false);
    declareFunction(myName, "cached_deduction_count", "CACHED-DEDUCTION-COUNT", 0, 0, false);
    declareFunction(myName, "deduction_content_completely_cachedP", "DEDUCTION-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
    declareFunction(myName, "deduction_content_cached_p", "DEDUCTION-CONTENT-CACHED-P", 1, 0, false);
    declareFunction(myName, "lookup_deduction_content", "LOOKUP-DEDUCTION-CONTENT", 1, 0, false);
    declareFunction(myName, "get_file_backed_deduction_id_threshold", "GET-FILE-BACKED-DEDUCTION-ID-THRESHOLD", 0, 0, false);
    declareFunction(myName, "register_deduction_content", "REGISTER-DEDUCTION-CONTENT", 2, 0, false);
    declareFunction(myName, "deregister_deduction_content", "DEREGISTER-DEDUCTION-CONTENT", 1, 0, false);
    declareFunction(myName, "mark_deduction_content_as_muted", "MARK-DEDUCTION-CONTENT-AS-MUTED", 1, 0, false);
    declareFunction(myName, "meter_deduction_content_swap_time", "METER-DEDUCTION-CONTENT-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "dont_meter_deduction_content_swap_time", "DONT-METER-DEDUCTION-CONTENT-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "clear_deduction_content_swap_time", "CLEAR-DEDUCTION-CONTENT-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "current_deduction_content_swap_time", "CURRENT-DEDUCTION-CONTENT-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "swap_out_all_pristine_deductions", "SWAP-OUT-ALL-PRISTINE-DEDUCTIONS", 0, 0, false);
    declareFunction(myName, "initialize_deduction_hl_store_cache", "INITIALIZE-DEDUCTION-HL-STORE-CACHE", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_deduction_manager_file() {
    $deduction_content_manager$ = deflexical("*DEDUCTION-CONTENT-MANAGER*", maybeDefault( $sym0$_DEDUCTION_CONTENT_MANAGER_, $deduction_content_manager$, ()-> ($kw1$UNINITIALIZED)));
    $deduction_lru_size_percentage$ = deflexical("*DEDUCTION-LRU-SIZE-PERCENTAGE*", EIGHT_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_deduction_manager_file() {
        subl_macro_promotions.declare_defglobal($sym0$_DEDUCTION_CONTENT_MANAGER_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_DEDUCTION_CONTENT_MANAGER_ = makeSymbol("*DEDUCTION-CONTENT-MANAGER*");
  public static final SubLSymbol $kw1$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLString $str2$deduction = makeString("deduction");
  public static final SubLSymbol $sym3$LOAD_DEDUCTION_DEF_FROM_CACHE = makeSymbol("LOAD-DEDUCTION-DEF-FROM-CACHE");
  public static final SubLString $str4$deduction_index = makeString("deduction-index");

  //// Initializers

  public void declareFunctions() {
    declare_deduction_manager_file();
  }

  public void initializeVariables() {
    init_deduction_manager_file();
  }

  public void runTopLevelForms() {
    setup_deduction_manager_file();
  }

}
