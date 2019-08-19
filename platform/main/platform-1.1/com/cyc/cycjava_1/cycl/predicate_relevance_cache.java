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
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cache;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genl_predicates;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class predicate_relevance_cache extends SubLTranslatedFile {

  //// Constructor

  private predicate_relevance_cache() {}
  public static final SubLFile me = new predicate_relevance_cache();
  public static final String myName = "com.cyc.cycjava_1.cycl.predicate_relevance_cache";

  //// Definitions

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 964) 
  public static final SubLObject cached_spec_predP(SubLObject genl, SubLObject spec, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return (((NIL != forts.fort_p(genl))
           && (NIL != forts.fort_p(spec))) ? ((SubLObject) fort_cache_spec_predP(genl, spec, mt)) : Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32012"));
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 1286) 
  public static final SubLObject cached_spec_inverseP(SubLObject genl, SubLObject spec, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return (((NIL != forts.fort_p(genl))
           && (NIL != forts.fort_p(spec))) ? ((SubLObject) fort_cache_spec_inverseP(genl, spec, mt)) : Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32011"));
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 1916) 
  public static final SubLObject clear_predicate_relevance_cache() {
    clear_spec_pred_fort_cache();
    clear_spec_pred_naut_cache();
    clear_spec_inverse_fort_cache();
    clear_spec_inverse_naut_cache();
    clear_genl_pred_fort_cache();
    clear_genl_pred_naut_cache();
    clear_genl_inverse_fort_cache();
    clear_genl_inverse_naut_cache();
    return NIL;
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2240) 
  private static SubLSymbol $pred_relevance_cache_size$ = null;

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2305) 
  private static SubLSymbol $spec_pred_fort_cache$ = null;

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2400) 
  private static SubLSymbol $spec_inverse_fort_cache$ = null;

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2494) 
  private static SubLSymbol $genl_pred_fort_cache$ = null;

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2588) 
  private static SubLSymbol $genl_inverse_fort_cache$ = null;

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2682) 
  private static SubLSymbol $spec_pred_naut_cache$ = null;

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2777) 
  private static SubLSymbol $spec_inverse_naut_cache$ = null;

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2871) 
  private static SubLSymbol $genl_pred_naut_cache$ = null;

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 2965) 
  private static SubLSymbol $genl_inverse_naut_cache$ = null;

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 3059) 
  public static final SubLObject fort_cache_relevant_predP(SubLObject v_cache, SubLObject key_pred, SubLObject relevant_pred, SubLObject mt, SubLObject update_function) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject key = list(key_pred, mt);
        thread.resetMultipleValues();
        {
          SubLObject relevant_predicates = cache.cache_get(v_cache, key);
          SubLObject entryP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL == entryP)) {
            relevant_predicates = update_relevant_pred_fort_cache(update_function, key_pred, mt);
            cache.cache_set(v_cache, key, relevant_predicates);
          }
          return set_contents.set_contents_memberP(relevant_pred, relevant_predicates, Symbols.symbol_function(EQ));
        }
      }
    }
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 3521) 
  public static final SubLObject update_relevant_pred_fort_cache(SubLObject update_function, SubLObject pred, SubLObject mt) {
    {
      SubLObject pcase_var = update_function;
      if (pcase_var.eql($sym9$ALL_SPEC_PREDICATES)) {
        return set_utilities.construct_set_contents_from_list(genl_predicates.all_spec_predicates(pred, mt, UNPROVIDED), Symbols.symbol_function(EQ), UNPROVIDED);
      } else if (pcase_var.eql($sym10$ALL_SPEC_INVERSES)) {
        return set_utilities.construct_set_contents_from_list(genl_predicates.all_spec_inverses(pred, mt, UNPROVIDED), Symbols.symbol_function(EQ), UNPROVIDED);
      } else if (pcase_var.eql($sym11$ALL_GENL_PREDICATES)) {
        return set_utilities.construct_set_contents_from_list(genl_predicates.all_genl_predicates(pred, mt, UNPROVIDED), Symbols.symbol_function(EQ), UNPROVIDED);
      } else if (pcase_var.eql($sym12$ALL_GENL_INVERSES)) {
        return set_utilities.construct_set_contents_from_list(genl_predicates.all_genl_inverses(pred, mt, UNPROVIDED), Symbols.symbol_function(EQ), UNPROVIDED);
      } else {
        return set_utilities.construct_set_contents_from_list(Functions.funcall(update_function, pred, mt), Symbols.symbol_function(EQ), UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5039) 
  public static final SubLObject fort_cache_spec_predP(SubLObject genl, SubLObject spec, SubLObject mt) {
    return fort_cache_relevant_predP($spec_pred_fort_cache$.getGlobalValue(), genl, spec, mt, $sym9$ALL_SPEC_PREDICATES);
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5345) 
  public static final SubLObject clear_spec_pred_fort_cache() {
    return cache.cache_clear($spec_pred_fort_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5438) 
  public static final SubLObject clear_spec_pred_naut_cache() {
    return cache.cache_clear($spec_pred_naut_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5531) 
  public static final SubLObject fort_cache_spec_inverseP(SubLObject genl, SubLObject spec, SubLObject mt) {
    return fort_cache_relevant_predP($spec_inverse_fort_cache$.getGlobalValue(), genl, spec, mt, $sym10$ALL_SPEC_INVERSES);
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5847) 
  public static final SubLObject clear_spec_inverse_fort_cache() {
    return cache.cache_clear($spec_inverse_fort_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 5946) 
  public static final SubLObject clear_spec_inverse_naut_cache() {
    return cache.cache_clear($spec_inverse_naut_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 6351) 
  public static final SubLObject clear_genl_pred_fort_cache() {
    return cache.cache_clear($genl_pred_fort_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 6444) 
  public static final SubLObject clear_genl_pred_naut_cache() {
    return cache.cache_clear($genl_pred_naut_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 6853) 
  public static final SubLObject clear_genl_inverse_fort_cache() {
    return cache.cache_clear($spec_inverse_fort_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/predicate-relevance-cache.lisp", position = 6952) 
  public static final SubLObject clear_genl_inverse_naut_cache() {
    return cache.cache_clear($spec_inverse_naut_cache$.getGlobalValue());
  }

  public static final SubLObject declare_predicate_relevance_cache_file() {
    declareFunction("cached_spec_predP", "CACHED-SPEC-PRED?", 2, 1, false);
    declareFunction("cached_spec_inverseP", "CACHED-SPEC-INVERSE?", 2, 1, false);
    declareFunction("cached_genl_predP", "CACHED-GENL-PRED?", 2, 1, false);
    declareFunction("cached_genl_inverseP", "CACHED-GENL-INVERSE?", 2, 1, false);
    declareFunction("clear_predicate_relevance_cache", "CLEAR-PREDICATE-RELEVANCE-CACHE", 0, 0, false);
    declareFunction("fort_cache_relevant_predP", "FORT-CACHE-RELEVANT-PRED?", 5, 0, false);
    declareFunction("update_relevant_pred_fort_cache", "UPDATE-RELEVANT-PRED-FORT-CACHE", 3, 0, false);
    declareFunction("naut_cache_relevant_predP", "NAUT-CACHE-RELEVANT-PRED?", 5, 0, false);
    declareFunction("update_relevant_pred_naut_cache", "UPDATE-RELEVANT-PRED-NAUT-CACHE", 4, 0, false);
    declareFunction("fort_cache_spec_predP", "FORT-CACHE-SPEC-PRED?", 3, 0, false);
    declareFunction("naut_cache_spec_predP", "NAUT-CACHE-SPEC-PRED?", 3, 0, false);
    declareFunction("clear_spec_pred_fort_cache", "CLEAR-SPEC-PRED-FORT-CACHE", 0, 0, false);
    declareFunction("clear_spec_pred_naut_cache", "CLEAR-SPEC-PRED-NAUT-CACHE", 0, 0, false);
    declareFunction("fort_cache_spec_inverseP", "FORT-CACHE-SPEC-INVERSE?", 3, 0, false);
    declareFunction("naut_cache_spec_inverseP", "NAUT-CACHE-SPEC-INVERSE?", 3, 0, false);
    declareFunction("clear_spec_inverse_fort_cache", "CLEAR-SPEC-INVERSE-FORT-CACHE", 0, 0, false);
    declareFunction("clear_spec_inverse_naut_cache", "CLEAR-SPEC-INVERSE-NAUT-CACHE", 0, 0, false);
    declareFunction("fort_cache_genl_predP", "FORT-CACHE-GENL-PRED?", 3, 0, false);
    declareFunction("naut_cache_genl_predP", "NAUT-CACHE-GENL-PRED?", 3, 0, false);
    declareFunction("clear_genl_pred_fort_cache", "CLEAR-GENL-PRED-FORT-CACHE", 0, 0, false);
    declareFunction("clear_genl_pred_naut_cache", "CLEAR-GENL-PRED-NAUT-CACHE", 0, 0, false);
    declareFunction("fort_cache_genl_inverseP", "FORT-CACHE-GENL-INVERSE?", 3, 0, false);
    declareFunction("naut_cache_genl_inverseP", "NAUT-CACHE-GENL-INVERSE?", 3, 0, false);
    declareFunction("clear_genl_inverse_fort_cache", "CLEAR-GENL-INVERSE-FORT-CACHE", 0, 0, false);
    declareFunction("clear_genl_inverse_naut_cache", "CLEAR-GENL-INVERSE-NAUT-CACHE", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_predicate_relevance_cache_file() {
    $pred_relevance_cache_size$ = deflexical("*PRED-RELEVANCE-CACHE-SIZE*", $int0$128);
    $spec_pred_fort_cache$ = deflexical("*SPEC-PRED-FORT-CACHE*", maybeDefault( $sym1$_SPEC_PRED_FORT_CACHE_, $spec_pred_fort_cache$, ()-> (cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function(EQUAL)))));
    $spec_inverse_fort_cache$ = deflexical("*SPEC-INVERSE-FORT-CACHE*", maybeDefault( $sym2$_SPEC_INVERSE_FORT_CACHE_, $spec_inverse_fort_cache$, ()-> (cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function(EQUAL)))));
    $genl_pred_fort_cache$ = deflexical("*GENL-PRED-FORT-CACHE*", maybeDefault( $sym3$_GENL_PRED_FORT_CACHE_, $genl_pred_fort_cache$, ()-> (cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function(EQUAL)))));
    $genl_inverse_fort_cache$ = deflexical("*GENL-INVERSE-FORT-CACHE*", maybeDefault( $sym4$_GENL_INVERSE_FORT_CACHE_, $genl_inverse_fort_cache$, ()-> (cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function(EQUAL)))));
    $spec_pred_naut_cache$ = deflexical("*SPEC-PRED-NAUT-CACHE*", maybeDefault( $sym5$_SPEC_PRED_NAUT_CACHE_, $spec_pred_naut_cache$, ()-> (cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function(EQUAL)))));
    $spec_inverse_naut_cache$ = deflexical("*SPEC-INVERSE-NAUT-CACHE*", maybeDefault( $sym6$_SPEC_INVERSE_NAUT_CACHE_, $spec_inverse_naut_cache$, ()-> (cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function(EQUAL)))));
    $genl_pred_naut_cache$ = deflexical("*GENL-PRED-NAUT-CACHE*", maybeDefault( $sym7$_GENL_PRED_NAUT_CACHE_, $genl_pred_naut_cache$, ()-> (cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function(EQUAL)))));
    $genl_inverse_naut_cache$ = deflexical("*GENL-INVERSE-NAUT-CACHE*", maybeDefault( $sym8$_GENL_INVERSE_NAUT_CACHE_, $genl_inverse_naut_cache$, ()-> (cache.new_cache($pred_relevance_cache_size$.getGlobalValue(), Symbols.symbol_function(EQUAL)))));
    return NIL;
  }

  public static final SubLObject setup_predicate_relevance_cache_file() {
        subl_macro_promotions.declare_defglobal($sym1$_SPEC_PRED_FORT_CACHE_);
    subl_macro_promotions.declare_defglobal($sym2$_SPEC_INVERSE_FORT_CACHE_);
    subl_macro_promotions.declare_defglobal($sym3$_GENL_PRED_FORT_CACHE_);
    subl_macro_promotions.declare_defglobal($sym4$_GENL_INVERSE_FORT_CACHE_);
    subl_macro_promotions.declare_defglobal($sym5$_SPEC_PRED_NAUT_CACHE_);
    subl_macro_promotions.declare_defglobal($sym6$_SPEC_INVERSE_NAUT_CACHE_);
    subl_macro_promotions.declare_defglobal($sym7$_GENL_PRED_NAUT_CACHE_);
    subl_macro_promotions.declare_defglobal($sym8$_GENL_INVERSE_NAUT_CACHE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$128 = makeInteger(128);
  public static final SubLSymbol $sym1$_SPEC_PRED_FORT_CACHE_ = makeSymbol("*SPEC-PRED-FORT-CACHE*");
  public static final SubLSymbol $sym2$_SPEC_INVERSE_FORT_CACHE_ = makeSymbol("*SPEC-INVERSE-FORT-CACHE*");
  public static final SubLSymbol $sym3$_GENL_PRED_FORT_CACHE_ = makeSymbol("*GENL-PRED-FORT-CACHE*");
  public static final SubLSymbol $sym4$_GENL_INVERSE_FORT_CACHE_ = makeSymbol("*GENL-INVERSE-FORT-CACHE*");
  public static final SubLSymbol $sym5$_SPEC_PRED_NAUT_CACHE_ = makeSymbol("*SPEC-PRED-NAUT-CACHE*");
  public static final SubLSymbol $sym6$_SPEC_INVERSE_NAUT_CACHE_ = makeSymbol("*SPEC-INVERSE-NAUT-CACHE*");
  public static final SubLSymbol $sym7$_GENL_PRED_NAUT_CACHE_ = makeSymbol("*GENL-PRED-NAUT-CACHE*");
  public static final SubLSymbol $sym8$_GENL_INVERSE_NAUT_CACHE_ = makeSymbol("*GENL-INVERSE-NAUT-CACHE*");
  public static final SubLSymbol $sym9$ALL_SPEC_PREDICATES = makeSymbol("ALL-SPEC-PREDICATES");
  public static final SubLSymbol $sym10$ALL_SPEC_INVERSES = makeSymbol("ALL-SPEC-INVERSES");
  public static final SubLSymbol $sym11$ALL_GENL_PREDICATES = makeSymbol("ALL-GENL-PREDICATES");
  public static final SubLSymbol $sym12$ALL_GENL_INVERSES = makeSymbol("ALL-GENL-INVERSES");
  public static final SubLSymbol $sym13$SPEC_PREDICATE_ = makeSymbol("SPEC-PREDICATE?");
  public static final SubLSymbol $sym14$SPEC_INVERSE_ = makeSymbol("SPEC-INVERSE?");
  public static final SubLSymbol $sym15$GENL_PREDICATE_ = makeSymbol("GENL-PREDICATE?");
  public static final SubLSymbol $sym16$GENL_INVERSE_ = makeSymbol("GENL-INVERSE?");

  //// Initializers

  public void declareFunctions() {
    declare_predicate_relevance_cache_file();
  }

  public void initializeVariables() {
    init_predicate_relevance_cache_file();
  }

  public void runTopLevelForms() {
    setup_predicate_relevance_cache_file();
  }

}
