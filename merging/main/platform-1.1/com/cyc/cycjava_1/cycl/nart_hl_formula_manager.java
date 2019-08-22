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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cache;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_object_manager;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;

public  final class nart_hl_formula_manager extends SubLTranslatedFile {

  //// Constructor

  private nart_hl_formula_manager() {}
  public static final SubLFile me = new nart_hl_formula_manager();
  public static final String myName = "com.cyc.cycjava_1.cycl.nart_hl_formula_manager";

  //// Definitions

  /** The KB object manager for nart-hl-formulas */
  @SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 857) 
  private static SubLSymbol $nart_hl_formula_manager$ = null;

  /** A wild guess */
  @SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 1060) 
  private static SubLSymbol $nart_hl_formula_lru_size_percentage$ = null;

  @SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 1176) 
  public static final SubLObject setup_nart_hl_formula_table(SubLObject size, SubLObject exactP) {
    $nart_hl_formula_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str2$nart_hl_formula, size, $nart_hl_formula_lru_size_percentage$.getGlobalValue(), $sym3$LOAD_NART_HL_FORMULA_FROM_CACHE, exactP));
    return T;
  }

  @SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 1614) 
  public static final SubLObject clear_nart_hl_formula_table() {
    return kb_object_manager.clear_kb_object_content_table($nart_hl_formula_manager$.getGlobalValue());
  }

  /** Return the number of nart-hl-formulas whose content is cached in memory. */
  @SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2319) 
  public static final SubLObject cached_nart_hl_formula_count() {
    return kb_object_manager.cached_kb_object_count($nart_hl_formula_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2876) 
  public static final SubLObject nart_hl_formulas_unbuiltP() {
    if (nart_handles.nart_count().isZero()) {
      return NIL;
    }
    return kb_object_manager.kb_object_manager_unbuiltP($nart_hl_formula_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4408) 
  public static final SubLObject swap_out_all_pristine_nart_hl_formulas() {
    return kb_object_manager.swap_out_all_pristine_kb_objects_int($nart_hl_formula_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4543) 
  public static final SubLObject initialize_nart_hl_formula_hl_store_cache() {
    return kb_object_manager.initialize_kb_object_hl_store_cache($nart_hl_formula_manager$.getGlobalValue(), $str2$nart_hl_formula, $str4$nart_hl_formula_index);
  }

  @SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4881) 
  private static SubLSymbol $nart_hl_formula_table$ = null;

  public static final SubLObject declare_nart_hl_formula_manager_file() {
    declareFunction("setup_nart_hl_formula_table", "SETUP-NART-HL-FORMULA-TABLE", 2, 0, false);
    declareFunction("optimize_nart_hl_formula_table", "OPTIMIZE-NART-HL-FORMULA-TABLE", 1, 0, false);
    declareFunction("clear_nart_hl_formula_table", "CLEAR-NART-HL-FORMULA-TABLE", 0, 0, false);
    declareFunction("maintain_nart_hl_formula_usage_counts", "MAINTAIN-NART-HL-FORMULA-USAGE-COUNTS", 0, 0, false);
    declareFunction("dont_maintain_nart_hl_formula_usage_counts", "DONT-MAINTAIN-NART-HL-FORMULA-USAGE-COUNTS", 0, 0, false);
    declareFunction("nart_hl_formula_usage_counts_enabled_p", "NART-HL-FORMULA-USAGE-COUNTS-ENABLED-P", 0, 0, false);
    declareFunction("cached_nart_hl_formula_count", "CACHED-NART-HL-FORMULA-COUNT", 0, 0, false);
    declareFunction("nart_hl_formula_completely_cachedP", "NART-HL-FORMULA-COMPLETELY-CACHED?", 0, 0, false);
    declareFunction("lookup_nart_hl_formula", "LOOKUP-NART-HL-FORMULA", 1, 0, false);
    declareFunction("get_file_backed_nart_id_threshold", "GET-FILE-BACKED-NART-ID-THRESHOLD", 0, 0, false);
    declareFunction("nart_hl_formulas_unbuiltP", "NART-HL-FORMULAS-UNBUILT?", 0, 0, false);
    declareFunction("register_nart_hl_formula", "REGISTER-NART-HL-FORMULA", 2, 0, false);
    declareFunction("deregister_nart_hl_formula", "DEREGISTER-NART-HL-FORMULA", 1, 0, false);
    declareFunction("mark_nart_hl_formula_as_muted", "MARK-NART-HL-FORMULA-AS-MUTED", 1, 0, false);
    declareFunction("meter_nart_hl_formula_swap_time", "METER-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
    declareFunction("dont_meter_nart_hl_formula_swap_time", "DONT-METER-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
    declareFunction("clear_nart_hl_formula_swap_time", "CLEAR-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
    declareFunction("current_nart_hl_formula_swap_time", "CURRENT-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
    declareFunction("swap_out_all_pristine_nart_hl_formulas", "SWAP-OUT-ALL-PRISTINE-NART-HL-FORMULAS", 0, 0, false);
    declareFunction("initialize_nart_hl_formula_hl_store_cache", "INITIALIZE-NART-HL-FORMULA-HL-STORE-CACHE", 0, 0, false);
    declareFunction("nart_hl_formula_table_initializedP", "NART-HL-FORMULA-TABLE-INITIALIZED?", 0, 0, false);
    declareFunction("possibly_initialize_nart_hl_formula_manager_from_legacy_world", "POSSIBLY-INITIALIZE-NART-HL-FORMULA-MANAGER-FROM-LEGACY-WORLD", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_nart_hl_formula_manager_file() {
    $nart_hl_formula_manager$ = deflexical("*NART-HL-FORMULA-MANAGER*", maybeDefault( $sym0$_NART_HL_FORMULA_MANAGER_, $nart_hl_formula_manager$, ()-> ($kw1$UNINITIALIZED)));
    $nart_hl_formula_lru_size_percentage$ = deflexical("*NART-HL-FORMULA-LRU-SIZE-PERCENTAGE*", FIVE_INTEGER);
    $nart_hl_formula_table$ = deflexical("*NART-HL-FORMULA-TABLE*", maybeDefault( $sym5$_NART_HL_FORMULA_TABLE_, $nart_hl_formula_table$, NIL));
    return NIL;
  }

  public static final SubLObject setup_nart_hl_formula_manager_file() {
        subl_macro_promotions.declare_defglobal($sym0$_NART_HL_FORMULA_MANAGER_);
    subl_macro_promotions.declare_defglobal($sym5$_NART_HL_FORMULA_TABLE_);
    access_macros.define_obsolete_register($sym6$POSSIBLY_INITIALIZE_NART_HL_FORMULA_MANAGER_FROM_LEGACY_WORLD, NIL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_NART_HL_FORMULA_MANAGER_ = makeSymbol("*NART-HL-FORMULA-MANAGER*");
  public static final SubLSymbol $kw1$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLString $str2$nart_hl_formula = makeString("nart-hl-formula");
  public static final SubLSymbol $sym3$LOAD_NART_HL_FORMULA_FROM_CACHE = makeSymbol("LOAD-NART-HL-FORMULA-FROM-CACHE");
  public static final SubLString $str4$nart_hl_formula_index = makeString("nart-hl-formula-index");
  public static final SubLSymbol $sym5$_NART_HL_FORMULA_TABLE_ = makeSymbol("*NART-HL-FORMULA-TABLE*");
  public static final SubLSymbol $sym6$POSSIBLY_INITIALIZE_NART_HL_FORMULA_MANAGER_FROM_LEGACY_WORLD = makeSymbol("POSSIBLY-INITIALIZE-NART-HL-FORMULA-MANAGER-FROM-LEGACY-WORLD");
  public static final SubLInteger $int7$100 = makeInteger(100);

  //// Initializers

  public void declareFunctions() {
    declare_nart_hl_formula_manager_file();
  }

  public void initializeVariables() {
    init_nart_hl_formula_manager_file();
  }

  public void runTopLevelForms() {
    setup_nart_hl_formula_manager_file();
  }

}
