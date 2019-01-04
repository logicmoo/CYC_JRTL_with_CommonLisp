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
import com.cyc.cycjava.cycl.cache;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.kb_object_manager;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;

public  final class nart_hl_formula_manager extends SubLTranslatedFile {

  //// Constructor

  private nart_hl_formula_manager() {}
  public static final SubLFile me = new nart_hl_formula_manager();
  public static final String myName = "com.cyc.cycjava.cycl.nart_hl_formula_manager";

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
    declareFunction(myName, "setup_nart_hl_formula_table", "SETUP-NART-HL-FORMULA-TABLE", 2, 0, false);
    declareFunction(myName, "optimize_nart_hl_formula_table", "OPTIMIZE-NART-HL-FORMULA-TABLE", 1, 0, false);
    declareFunction(myName, "clear_nart_hl_formula_table", "CLEAR-NART-HL-FORMULA-TABLE", 0, 0, false);
    declareFunction(myName, "maintain_nart_hl_formula_usage_counts", "MAINTAIN-NART-HL-FORMULA-USAGE-COUNTS", 0, 0, false);
    declareFunction(myName, "dont_maintain_nart_hl_formula_usage_counts", "DONT-MAINTAIN-NART-HL-FORMULA-USAGE-COUNTS", 0, 0, false);
    declareFunction(myName, "nart_hl_formula_usage_counts_enabled_p", "NART-HL-FORMULA-USAGE-COUNTS-ENABLED-P", 0, 0, false);
    declareFunction(myName, "cached_nart_hl_formula_count", "CACHED-NART-HL-FORMULA-COUNT", 0, 0, false);
    declareFunction(myName, "nart_hl_formula_completely_cachedP", "NART-HL-FORMULA-COMPLETELY-CACHED?", 0, 0, false);
    declareFunction(myName, "lookup_nart_hl_formula", "LOOKUP-NART-HL-FORMULA", 1, 0, false);
    declareFunction(myName, "get_file_backed_nart_id_threshold", "GET-FILE-BACKED-NART-ID-THRESHOLD", 0, 0, false);
    declareFunction(myName, "nart_hl_formulas_unbuiltP", "NART-HL-FORMULAS-UNBUILT?", 0, 0, false);
    declareFunction(myName, "register_nart_hl_formula", "REGISTER-NART-HL-FORMULA", 2, 0, false);
    declareFunction(myName, "deregister_nart_hl_formula", "DEREGISTER-NART-HL-FORMULA", 1, 0, false);
    declareFunction(myName, "mark_nart_hl_formula_as_muted", "MARK-NART-HL-FORMULA-AS-MUTED", 1, 0, false);
    declareFunction(myName, "meter_nart_hl_formula_swap_time", "METER-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "dont_meter_nart_hl_formula_swap_time", "DONT-METER-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "clear_nart_hl_formula_swap_time", "CLEAR-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "current_nart_hl_formula_swap_time", "CURRENT-NART-HL-FORMULA-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "swap_out_all_pristine_nart_hl_formulas", "SWAP-OUT-ALL-PRISTINE-NART-HL-FORMULAS", 0, 0, false);
    declareFunction(myName, "initialize_nart_hl_formula_hl_store_cache", "INITIALIZE-NART-HL-FORMULA-HL-STORE-CACHE", 0, 0, false);
    declareFunction(myName, "nart_hl_formula_table_initializedP", "NART-HL-FORMULA-TABLE-INITIALIZED?", 0, 0, false);
    declareFunction(myName, "possibly_initialize_nart_hl_formula_manager_from_legacy_world", "POSSIBLY-INITIALIZE-NART-HL-FORMULA-MANAGER-FROM-LEGACY-WORLD", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_nart_hl_formula_manager_file() {
    $nart_hl_formula_manager$ = deflexical("*NART-HL-FORMULA-MANAGER*", ((NIL != Symbols.boundp($sym0$_NART_HL_FORMULA_MANAGER_)) ? ((SubLObject) $nart_hl_formula_manager$.getGlobalValue()) : $kw1$UNINITIALIZED));
    $nart_hl_formula_lru_size_percentage$ = deflexical("*NART-HL-FORMULA-LRU-SIZE-PERCENTAGE*", FIVE_INTEGER);
    $nart_hl_formula_table$ = deflexical("*NART-HL-FORMULA-TABLE*", ((NIL != Symbols.boundp($sym5$_NART_HL_FORMULA_TABLE_)) ? ((SubLObject) $nart_hl_formula_table$.getGlobalValue()) : NIL));
    return NIL;
  }

  public static final SubLObject setup_nart_hl_formula_manager_file() {
    // CVS_ID("Id: nart-hl-formula-manager.lisp 128689 2009-09-02 19:44:42Z rck ");
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
