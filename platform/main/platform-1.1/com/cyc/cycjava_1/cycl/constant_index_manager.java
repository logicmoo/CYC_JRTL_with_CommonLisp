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

package  com.cyc.cycjava_1.cycl;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.kb_object_manager;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;

public  final class constant_index_manager extends SubLTranslatedFile {

  //// Constructor

  private constant_index_manager() {}
  public static final SubLFile me = new constant_index_manager();
  public static final String myName = "com.cyc.cycjava_1.cycl.constant_index_manager";

  //// Definitions

  /** The KB object manager for constant indices */
  @SubL(source = "cycl/constant-index-manager.lisp", position = 1476) 
  private static SubLSymbol $constant_index_manager$ = null;

  /** Based on arete experiments, only 16% of all constants are touched during normal inference,
   so we'll make a conservative guess that every one of those touched the constant's index. */
  @SubL(source = "cycl/constant-index-manager.lisp", position = 1657) 
  private static SubLSymbol $constant_index_lru_size_percentage$ = null;

  @SubL(source = "cycl/constant-index-manager.lisp", position = 1936) 
  public static final SubLObject setup_constant_index_table(SubLObject size, SubLObject exactP) {
    $constant_index_manager$.setGlobalValue(kb_object_manager.new_kb_object_manager($str2$constant_index, size, $constant_index_lru_size_percentage$.getGlobalValue(), $sym3$LOAD_CONSTANT_INDEX_FROM_CACHE, exactP));
    return T;
  }

  /** Return the number of constant-indices whose content is cached in memory. */
  @SubL(source = "cycl/constant-index-manager.lisp", position = 3047) 
  public static final SubLObject cached_constant_index_count() {
    return kb_object_manager.cached_kb_object_count($constant_index_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/constant-index-manager.lisp", position = 3362) 
  public static final SubLObject lookup_constant_index(SubLObject id) {
    return kb_object_manager.lookup_kb_object_content($constant_index_manager$.getGlobalValue(), id);
  }

  /** Note that ID will be used as the id for CONSTANT-INDEX. */
  @SubL(source = "cycl/constant-index-manager.lisp", position = 3616) 
  public static final SubLObject register_constant_index(SubLObject id, SubLObject constant_index) {
    return kb_object_manager.register_kb_object_content($constant_index_manager$.getGlobalValue(), id, constant_index);
  }

  /** Note that ID is not in use as an CONSTANT-INDEX id */
  @SubL(source = "cycl/constant-index-manager.lisp", position = 3844) 
  public static final SubLObject deregister_constant_index(SubLObject id) {
    return kb_object_manager.deregister_kb_object_content($constant_index_manager$.getGlobalValue(), id);
  }

  /** We never want to swap out the indices of these constants */
  @SubL(source = "cycl/constant-index-manager.lisp", position = 4017) 
  private static SubLSymbol $permanently_cached_constant_indices$ = null;

  @SubL(source = "cycl/constant-index-manager.lisp", position = 4219) 
  public static final SubLObject mark_constant_index_as_muted(SubLObject id) {
    return kb_object_manager.mark_kb_object_content_as_muted($constant_index_manager$.getGlobalValue(), id);
  }

  /** First, make sure it's swapped in.  Then make sure it won't ever get swapped out. */
  @SubL(source = "cycl/constant-index-manager.lisp", position = 4344) 
  public static final SubLObject mark_constant_index_as_permanently_cached(SubLObject id) {
    lookup_constant_index(id);
    return mark_constant_index_as_muted(id);
  }

  @SubL(source = "cycl/constant-index-manager.lisp", position = 5371) 
  public static final SubLObject swap_out_all_pristine_constant_indices() {
    return kb_object_manager.swap_out_all_pristine_kb_objects_int($constant_index_manager$.getGlobalValue());
  }

  @SubL(source = "cycl/constant-index-manager.lisp", position = 5505) 
  public static final SubLObject initialize_constant_index_hl_store_cache() {
    {
      SubLObject result = kb_object_manager.initialize_kb_object_hl_store_cache($constant_index_manager$.getGlobalValue(), $str5$indices, $str6$indices_index);
      SubLObject cdolist_list_var = $permanently_cached_constant_indices$.getGlobalValue();
      SubLObject constant = NIL;
      for (constant = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), constant = cdolist_list_var.first()) {
        mark_constant_index_as_permanently_cached(constant_handles.constant_suid(constant));
      }
      return result;
    }
  }

  public static final SubLObject declare_constant_index_manager_file() {
    declareFunction(myName, "setup_constant_index_table", "SETUP-CONSTANT-INDEX-TABLE", 2, 0, false);
    declareFunction(myName, "optimize_constant_index_table", "OPTIMIZE-CONSTANT-INDEX-TABLE", 1, 0, false);
    declareFunction(myName, "clear_constant_index_table", "CLEAR-CONSTANT-INDEX-TABLE", 0, 0, false);
    declareFunction(myName, "maintain_constant_index_usage_counts", "MAINTAIN-CONSTANT-INDEX-USAGE-COUNTS", 0, 0, false);
    declareFunction(myName, "dont_maintain_constant_index_usage_counts", "DONT-MAINTAIN-CONSTANT-INDEX-USAGE-COUNTS", 0, 0, false);
    declareFunction(myName, "constant_index_usage_counts_enabled_p", "CONSTANT-INDEX-USAGE-COUNTS-ENABLED-P", 0, 0, false);
    declareFunction(myName, "cached_constant_index_count", "CACHED-CONSTANT-INDEX-COUNT", 0, 0, false);
    declareFunction(myName, "constant_indices_completely_cachedP", "CONSTANT-INDICES-COMPLETELY-CACHED?", 0, 0, false);
    declareFunction(myName, "lookup_constant_index", "LOOKUP-CONSTANT-INDEX", 1, 0, false);
    declareFunction(myName, "get_file_backed_constant_internal_id_threshold", "GET-FILE-BACKED-CONSTANT-INTERNAL-ID-THRESHOLD", 0, 0, false);
    declareFunction(myName, "register_constant_index", "REGISTER-CONSTANT-INDEX", 2, 0, false);
    declareFunction(myName, "deregister_constant_index", "DEREGISTER-CONSTANT-INDEX", 1, 0, false);
    declareFunction(myName, "mark_constant_index_as_muted", "MARK-CONSTANT-INDEX-AS-MUTED", 1, 0, false);
    declareFunction(myName, "mark_constant_index_as_permanently_cached", "MARK-CONSTANT-INDEX-AS-PERMANENTLY-CACHED", 1, 0, false);
    declareFunction(myName, "meter_constant_index_swap_time", "METER-CONSTANT-INDEX-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "dont_meter_constant_index_swap_time", "DONT-METER-CONSTANT-INDEX-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "clear_constant_index_swap_time", "CLEAR-CONSTANT-INDEX-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "current_constant_index_swap_time", "CURRENT-CONSTANT-INDEX-SWAP-TIME", 0, 0, false);
    declareFunction(myName, "swap_out_all_pristine_constant_indices", "SWAP-OUT-ALL-PRISTINE-CONSTANT-INDICES", 0, 0, false);
    declareFunction(myName, "initialize_constant_index_hl_store_cache", "INITIALIZE-CONSTANT-INDEX-HL-STORE-CACHE", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_constant_index_manager_file() {
    $constant_index_manager$ = deflexical("*CONSTANT-INDEX-MANAGER*", ((NIL != Symbols.boundp($sym0$_CONSTANT_INDEX_MANAGER_)) ? ((SubLObject) $constant_index_manager$.getGlobalValue()) : $kw1$UNINITIALIZED));
    $constant_index_lru_size_percentage$ = deflexical("*CONSTANT-INDEX-LRU-SIZE-PERCENTAGE*", SIXTEEN_INTEGER);
    $permanently_cached_constant_indices$ = deflexical("*PERMANENTLY-CACHED-CONSTANT-INDICES*", $list4);
    return NIL;
  }

  public static final SubLObject setup_constant_index_manager_file() {
    // CVS_ID("Id: constant-index-manager.lisp 128689 2009-09-02 19:44:42Z rck ");
    subl_macro_promotions.declare_defglobal($sym0$_CONSTANT_INDEX_MANAGER_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_CONSTANT_INDEX_MANAGER_ = makeSymbol("*CONSTANT-INDEX-MANAGER*");
  public static final SubLSymbol $kw1$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLString $str2$constant_index = makeString("constant-index");
  public static final SubLSymbol $sym3$LOAD_CONSTANT_INDEX_FROM_CACHE = makeSymbol("LOAD-CONSTANT-INDEX-FROM-CACHE");
  public static final SubLList $list4 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")));
  public static final SubLString $str5$indices = makeString("indices");
  public static final SubLString $str6$indices_index = makeString("indices-index");

  //// Initializers

  public void declareFunctions() {
    declare_constant_index_manager_file();
  }

  public void initializeVariables() {
    init_constant_index_manager_file();
  }

  public void runTopLevelForms() {
    setup_constant_index_manager_file();
  }

}
