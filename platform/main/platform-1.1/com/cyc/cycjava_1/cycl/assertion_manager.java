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

//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.kb_access_metering;
//dm import com.cyc.cycjava_1.cycl.kb_object_manager;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.inference.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;

public  final class assertion_manager extends SubLTranslatedFile {

  //// Constructor

  private assertion_manager() {}
  public static final SubLFile me = new assertion_manager();
  public static final String myName = "com.cyc.cycjava_1.cycl.assertion_manager";

  //// Definitions

  @SubL(source = "cycl/assertion-manager.lisp", position = 1357)
  public static SubLSymbol $arete_assertions_touched$ = null;

  @SubL(source = "cycl/assertion-manager.lisp", position = 1429)
  public static final SubLObject arete_note_assertion_touched(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      kb_access_metering.possibly_note_kb_access_assertion(assertion);
      if ((NIL != arete.$arete_log_kb_touchesP$.getDynamicValue(thread))) {
        dictionary_utilities.dictionary_increment($arete_assertions_touched$.getGlobalValue(), assertion, UNPROVIDED);
      }
      return NIL;
    }
  }

  /** The KB object manager for assertions */
  @SubL(source = "cycl/assertion-manager.lisp", position = 1646)
  private static SubLSymbol $assertion_content_manager$ = null;

  /** based on arete experiments, only 16% of all assertions are need for normal inference */
  @SubL(source = "cycl/assertion-manager.lisp", position = 1833)
  private static SubLSymbol $assertion_lru_size_percentage$ = null;

  @SubL(source = "cycl/assertion-manager.lisp", position = 2153)
  public static final SubLObject setup_assertion_content_table(SubLObject size, SubLObject exactP) {
    $assertion_content_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str3$assertion, size, $assertion_lru_size_percentage$.getGlobalValue(), $sym4$LOAD_ASSERTION_DEF_FROM_CACHE, exactP));
    return T;
  }

  @SubL(source = "cycl/assertion-manager.lisp", position = 2573)
  public static final SubLObject clear_assertion_content_table() {
    return kb_object_manager.clear_kb_object_content_table($assertion_content_manager$.getGlobalValue());
  }

  /** Return the number of assertions whose content is cached in memory. */
  @SubL(source = "cycl/assertion-manager.lisp", position = 3252)
  public static final SubLObject cached_assertion_count() {
    return kb_object_manager.cached_kb_object_count($assertion_content_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/assertion-manager.lisp", position = 3697)
  public static final SubLObject lookup_assertion_content(SubLObject id) {
    arete_note_assertion_touched(assertion_handles.find_assertion_by_id(id));
    return kb_object_manager.lookup_kb_object_content($assertion_content_manager$.getGlobalValue(), id);
  }

  /** Note that ID will be used as the id for ASSERTION-CONTENT. */
  @SubL(source = "cycl/assertion-manager.lisp", position = 4011)
  public static final SubLObject register_assertion_content(SubLObject id, SubLObject assertion_content) {
    return kb_object_manager.register_kb_object_content($assertion_content_manager$.getGlobalValue(), id, assertion_content);
  }

  /** Note that ID is not in use as an ASSERTION-CONTENT id */
  @SubL(source = "cycl/assertion-manager.lisp", position = 4254)
  public static final SubLObject deregister_assertion_content(SubLObject id) {
    return kb_object_manager.deregister_kb_object_content($assertion_content_manager$.getGlobalValue(), id);
  }

  @SubL(source = "cycl/assertion-manager.lisp", position = 4436)
  public static final SubLObject mark_assertion_content_as_muted(SubLObject id) {
    return kb_object_manager.mark_kb_object_content_as_muted($assertion_content_manager$.getGlobalValue(), id);
  }

  @SubL(source = "cycl/assertion-manager.lisp", position = 5406)
  public static final SubLObject swap_out_all_pristine_assertions() {
    return kb_object_manager.swap_out_all_pristine_kb_objects_int($assertion_content_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/assertion-manager.lisp", position = 5537)
  public static final SubLObject initialize_assertion_hl_store_cache() {
    return kb_object_manager.initialize_kb_object_hl_store_cache($assertion_content_manager$.getGlobalValue(), $str3$assertion, $str5$assertion_index);
  }

  public static final SubLObject declare_assertion_manager_file() {
    declareFunction(myName, "arete_note_assertion_touched", "ARETE-NOTE-ASSERTION-TOUCHED", 1, 0, false);
    declareFunction(myName, "setup_assertion_content_table", "SETUP-ASSERTION-CONTENT-TABLE", 2, 0, false);
    declareFunction(myName, "optimize_assertion_content_table", "OPTIMIZE-ASSERTION-CONTENT-TABLE", 1, 0, false);
    declareFunction(myName, "clear_assertion_content_table", "CLEAR-ASSERTION-CONTENT-TABLE", 0, 0, false);
    declareFunction(myName, "maintain_assertion_usage_counts", "MAINTAIN-ASSERTION-USAGE-COUNTS", 0, 0, false);
    declareFunction(myName, "dont_maintain_assertion_usage_counts", "DONT-MAINTAIN-ASSERTION-USAGE-COUNTS", 0, 0, false);
    declareFunction(myName, "assertion_usage_counts_enabled_p", "ASSERTION-USAGE-COUNTS-ENABLED-P", 0, 0, false);
    declareFunction(myName, "cached_assertion_count", "CACHED-ASSERTION-COUNT", 0, 0, false);
    declareFunction(myName, "assertion_content_completely_cachedP", "ASSERTION-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
    declareFunction(myName, "assertion_content_cached_p", "ASSERTION-CONTENT-CACHED-P", 1, 0, false);
    declareFunction(myName, "lookup_assertion_content", "LOOKUP-ASSERTION-CONTENT", 1, 0, false);
    declareFunction(myName, "get_file_backed_assertion_id_threshold", "GET-FILE-BACKED-ASSERTION-ID-THRESHOLD", 0, 0, false);
    declareFunction(myName, "register_assertion_content", "REGISTER-ASSERTION-CONTENT", 2, 0, false);
    declareFunction(myName, "deregister_assertion_content", "DEREGISTER-ASSERTION-CONTENT", 1, 0, false);
    declareFunction(myName, "mark_assertion_content_as_muted", "MARK-ASSERTION-CONTENT-AS-MUTED", 1, 0, false);
    declareFunction(myName, "meter_assertion_content_swap_time", "METER-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "dont_meter_assertion_content_swap_time", "DONT-METER-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "clear_assertion_content_swap_time", "CLEAR-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "current_assertion_content_swap_time", "CURRENT-ASSERTION-CONTENT-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "swap_out_all_pristine_assertions", "SWAP-OUT-ALL-PRISTINE-ASSERTIONS", 0, 0, false);
    declareFunction(myName, "initialize_assertion_hl_store_cache", "INITIALIZE-ASSERTION-HL-STORE-CACHE", 0, 0, false);
    declareFunction(myName, "verify_assertion_content_table_int", "VERIFY-ASSERTION-CONTENT-TABLE-INT", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_assertion_manager_file() {
    $arete_assertions_touched$ = deflexical("*ARETE-ASSERTIONS-TOUCHED*", maybeDefault( $sym0$_ARETE_ASSERTIONS_TOUCHED_, $arete_assertions_touched$, ()-> (dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED))));
    $assertion_content_manager$ = deflexical("*ASSERTION-CONTENT-MANAGER*", maybeDefault( $sym1$_ASSERTION_CONTENT_MANAGER_, $assertion_content_manager$, ()-> ($kw2$UNINITIALIZED)));
    $assertion_lru_size_percentage$ = deflexical("*ASSERTION-LRU-SIZE-PERCENTAGE*", SIXTEEN_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_assertion_manager_file() {
    // CVS_ID("Id: assertion-manager.lisp 128689 2009-09-02 19:44:42Z rck ");
    subl_macro_promotions.declare_defglobal($sym0$_ARETE_ASSERTIONS_TOUCHED_);
    subl_macro_promotions.declare_defglobal($sym1$_ASSERTION_CONTENT_MANAGER_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_ARETE_ASSERTIONS_TOUCHED_ = makeSymbol("*ARETE-ASSERTIONS-TOUCHED*");
  public static final SubLSymbol $sym1$_ASSERTION_CONTENT_MANAGER_ = makeSymbol("*ASSERTION-CONTENT-MANAGER*");
  public static final SubLSymbol $kw2$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLString $str3$assertion = makeString("assertion");
  public static final SubLSymbol $sym4$LOAD_ASSERTION_DEF_FROM_CACHE = makeSymbol("LOAD-ASSERTION-DEF-FROM-CACHE");
  public static final SubLString $str5$assertion_index = makeString("assertion-index");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_assertion_manager_file();
  }

  @Override
  public void initializeVariables() {
    init_assertion_manager_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_assertion_manager_file();
  }

}
