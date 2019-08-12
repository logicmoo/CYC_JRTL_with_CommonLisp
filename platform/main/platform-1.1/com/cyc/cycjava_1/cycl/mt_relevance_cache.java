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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cache;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class mt_relevance_cache extends SubLTranslatedFile {

  //// Constructor

  private mt_relevance_cache() {}
  public static final SubLFile me = new mt_relevance_cache();
  public static final String myName = "com.cyc.cycjava_1.cycl.mt_relevance_cache";

  //// Definitions

  /** optimized for kb-mapping: this assumes all baseMt assertions are visible in BaseKB */
  @SubL(source = "cycl/mt-relevance-cache.lisp", position = 1046) 
  public static final SubLObject basemtP(SubLObject mt, SubLObject basemt) {
    mt = bind_mt_indexicals(mt);
    basemt = bind_mt_indexicals(basemt);
    return monad_basemtP(mt, basemt);
  }

  /** Clear the Mt relevance cache. */
  @SubL(source = "cycl/mt-relevance-cache.lisp", position = 1584) 
  public static final SubLObject clear_mt_relevance_cache() {
    clear_monad_mt_fort_cache();
    clear_monad_mt_naut_cache();
    if ((NIL != hlmt.hlmts_supportedP())) {
    }
    return T;
  }

  /** Update the Mt relevance cache with information that ASSERTION is
   being added to or removed from the KB. */
  @SubL(source = "cycl/mt-relevance-cache.lisp", position = 1820) 
  public static final SubLObject update_mt_relevance_cache(SubLObject argument, SubLObject assertion) {
    return clear_mt_relevance_cache();
  }

  @SubL(source = "cycl/mt-relevance-cache.lisp", position = 2071) 
  public static final SubLObject bind_mt_indexicals(SubLObject mt) {
    if ((NIL == forts.fort_p(mt))) {
    }
    return mt;
  }

  @SubL(source = "cycl/mt-relevance-cache.lisp", position = 2273) 
  public static final SubLObject monad_basemtP(SubLObject mt, SubLObject basemt) {
    if (mt.equal(basemt)) {
      return T;
    } else if (((NIL != forts.fort_p(mt))
         && (NIL != forts.fort_p(basemt)))) {
      return monad_mt_fort_cache_base_mt(mt, basemt);
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31128");
    }
  }

  @SubL(source = "cycl/mt-relevance-cache.lisp", position = 3399) 
  private static SubLSymbol $mt_relevance_cache_unknown$ = null;

  @SubL(source = "cycl/mt-relevance-cache.lisp", position = 5531) 
  private static SubLSymbol $monad_mt_fort_cache$ = null;

  @SubL(source = "cycl/mt-relevance-cache.lisp", position = 5666) 
  public static final SubLObject monad_mt_fort_cache_base_mt(SubLObject mt, SubLObject basemt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject v_genl_mts = cache.cache_get($monad_mt_fort_cache$.getGlobalValue(), mt);
        SubLObject entryP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == entryP)) {
          v_genl_mts = set_utilities.construct_set_contents_from_list(genl_mts.all_genl_mts(mt, UNPROVIDED, UNPROVIDED), Symbols.symbol_function(EQ), UNPROVIDED);
          cache.cache_set($monad_mt_fort_cache$.getGlobalValue(), mt, v_genl_mts);
        }
        return set_contents.set_contents_memberP(basemt, v_genl_mts, Symbols.symbol_function(EQ));
      }
    }
  }

  @SubL(source = "cycl/mt-relevance-cache.lisp", position = 6018) 
  public static final SubLObject clear_monad_mt_fort_cache() {
    return cache.cache_clear($monad_mt_fort_cache$.getGlobalValue());
  }

  @SubL(source = "cycl/mt-relevance-cache.lisp", position = 6109) 
  private static SubLSymbol $monad_mt_naut_cache$ = null;

  @SubL(source = "cycl/mt-relevance-cache.lisp", position = 6600) 
  public static final SubLObject clear_monad_mt_naut_cache() {
    return cache.cache_clear($monad_mt_naut_cache$.getGlobalValue());
  }

  public static final SubLObject declare_mt_relevance_cache_file() {
    declareFunction(myName, "basemtP", "BASEMT?", 2, 0, false);
    declareFunction(myName, "clear_mt_relevance_cache", "CLEAR-MT-RELEVANCE-CACHE", 0, 0, false);
    declareFunction(myName, "update_mt_relevance_cache", "UPDATE-MT-RELEVANCE-CACHE", 2, 0, false);
    declareFunction(myName, "bind_mt_indexicals", "BIND-MT-INDEXICALS", 1, 0, false);
    declareFunction(myName, "monad_basemtP", "MONAD-BASEMT?", 2, 0, false);
    declareFunction(myName, "hlmt_basemtP", "HLMT-BASEMT?", 2, 0, false);
    declareFunction(myName, "non_monad_basemtP", "NON-MONAD-BASEMT?", 2, 0, false);
    declareFunction(myName, "mt_relevance_cache_unknown_p", "MT-RELEVANCE-CACHE-UNKNOWN-P", 1, 0, false);
    declareFunction(myName, "mt_relevance_cache_get", "MT-RELEVANCE-CACHE-GET", 2, 0, false);
    declareFunction(myName, "mt_relevance_cache_set", "MT-RELEVANCE-CACHE-SET", 3, 0, false);
    declareFunction(myName, "mt_relevance_cache_remove", "MT-RELEVANCE-CACHE-REMOVE", 2, 0, false);
    declareFunction(myName, "mt_relevance_cache_base_mt", "MT-RELEVANCE-CACHE-BASE-MT", 4, 0, false);
    declareFunction(myName, "mt_relevance_cache_update", "MT-RELEVANCE-CACHE-UPDATE", 5, 0, false);
    declareFunction(myName, "monad_mt_fort_cache_base_mt", "MONAD-MT-FORT-CACHE-BASE-MT", 2, 0, false);
    declareFunction(myName, "clear_monad_mt_fort_cache", "CLEAR-MONAD-MT-FORT-CACHE", 0, 0, false);
    declareFunction(myName, "monad_mt_naut_cache_base_mt", "MONAD-MT-NAUT-CACHE-BASE-MT", 2, 0, false);
    declareFunction(myName, "clear_monad_mt_naut_cache", "CLEAR-MONAD-MT-NAUT-CACHE", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_mt_relevance_cache_file() {
    $mt_relevance_cache_unknown$ = deflexical("*MT-RELEVANCE-CACHE-UNKNOWN*", $kw0$UNKNOWN);
    $monad_mt_fort_cache$ = deflexical("*MONAD-MT-FORT-CACHE*", maybeDefault( $sym4$_MONAD_MT_FORT_CACHE_, $monad_mt_fort_cache$, ()-> (cache.new_cache($int5$256, Symbols.symbol_function(EQ)))));
    $monad_mt_naut_cache$ = deflexical("*MONAD-MT-NAUT-CACHE*", maybeDefault( $sym6$_MONAD_MT_NAUT_CACHE_, $monad_mt_naut_cache$, ()-> (cache.new_cache($int5$256, Symbols.symbol_function(EQUAL)))));
    return NIL;
  }

  public static final SubLObject setup_mt_relevance_cache_file() {
        subl_macro_promotions.declare_defglobal($sym4$_MONAD_MT_FORT_CACHE_);
    subl_macro_promotions.declare_defglobal($sym6$_MONAD_MT_NAUT_CACHE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLString $str1$Unsupported_Mt_relevance_cache_ty = makeString("Unsupported Mt relevance cache type.");
  public static final SubLString $str2$Corrupt_entry_in_Mt_relevance_cac = makeString("Corrupt entry in Mt relevance cache for ~s.  Removing entry.");
  public static final SubLString $str3$Previous_entry_for__s_corrupt___R = makeString("Previous entry for ~s corrupt.  Replacing entry.");
  public static final SubLSymbol $sym4$_MONAD_MT_FORT_CACHE_ = makeSymbol("*MONAD-MT-FORT-CACHE*");
  public static final SubLInteger $int5$256 = makeInteger(256);
  public static final SubLSymbol $sym6$_MONAD_MT_NAUT_CACHE_ = makeSymbol("*MONAD-MT-NAUT-CACHE*");

  //// Initializers

  public void declareFunctions() {
    declare_mt_relevance_cache_file();
  }

  public void initializeVariables() {
    init_mt_relevance_cache_file();
  }

  public void runTopLevelForms() {
    setup_mt_relevance_cache_file();
  }

}
