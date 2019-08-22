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

package com.cyc.cycjava_1.cycl.sbhl;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cache_utilities;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.file_vector;
//dm import com.cyc.cycjava_1.cycl.file_vector_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_paths;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.map_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.process_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;

public  final class sbhl_graphs extends SubLTranslatedFile {

  //// Constructor

  private sbhl_graphs() {}
  public static final SubLFile me = new sbhl_graphs();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs";

  //// Definitions

  /** Temporary -- the equality test used for sbhl-graphs. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1120)
  private static SubLSymbol $sbhl_graph_equality_test$ = null;

  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1231)
  public static final SubLObject make_new_sbhl_graph() {
    return Hashtables.make_hash_table(ZERO_INTEGER, $sbhl_graph_equality_test$.getGlobalValue(), UNPROVIDED);
  }


  /** This is called by the load KB command after swapping in the references. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 5552)
  public static final SubLObject initialize_sbhl_graph_caches_during_load_kb(SubLObject data_file, SubLObject index_file) {
    return initialize_sbhl_graph_caches_file_vector(data_file, index_file);
  }


  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 3237)
  public static final SubLObject initialize_sbhl_graph_caches_file_vector(SubLObject data_file, SubLObject index_file) {
    if ((NIL != file_vector.file_vector_p($sbhl_backing_file_vector$.getGlobalValue()))) {
      file_vector.close_file_vector($sbhl_backing_file_vector$.getGlobalValue());
    }
    $sbhl_backing_file_vector$.setGlobalValue(file_vector.new_file_vector(data_file, index_file, UNPROVIDED));
    return NIL;
  }


  /** The file vector that backs the SBHL graph. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1443)
  public static SubLSymbol $sbhl_backing_file_vector$ = null;

  /** An ALIST-P that houses the association map from caches on a per-module basis */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1622)
  public static SubLSymbol $sbhl_backing_file_vector_caches_for_modules$ = null;

  /** The percentage of the graph size for the module that should be cached in memory */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1780)
  public static SubLSymbol $sbhl_backing_file_vector_cache_size_percentage$ = null;

  /** The minimal size of the cache, in the case of small population (e.g. #$negationMt
   or #$successorStrict-HL-TimePrecedence) */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1945)
  public static SubLSymbol $sbhl_backing_file_vector_cache_minimum_size$ = null;

  /** Whether the caches are supposed to keep metrics of their performance or not. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 2156)
  public static SubLSymbol $sbhl_backing_file_vector_cache_gather_cache_metricsP$ = null;

  /** The lock for ensuring that CFASL input against the stream is uninterrupted.
   See also FILE-VECTOR-UTILITIES for details on the implementation side. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 2324)
  public static SubLSymbol $sbhl_file_vector_data_stream_lock$ = null;

  /** The allocator to use to get the new caches. Each constructor takes a capacity and
   an optional equality test. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 2590)
  public static SubLSymbol $sbhl_backing_file_vector_cache_constructor$ = null;

  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 2811)
  public static final SubLObject initialize_sbhl_graph_caches() {
    {
      SubLObject data_file = misc_utilities.get_hl_store_cache_filename($str6$sbhl_module_graphs, $str7$cfasl);
      SubLObject index_file = misc_utilities.get_hl_store_cache_filename($str8$sbhl_module_graphs_index, $str7$cfasl);
      if (((NIL != Filesys.probe_file(data_file))
           && (NIL != Filesys.probe_file(index_file)))) {
      	initialize_sbhl_graph_caches_file_vector(data_file,index_file);
        return $kw9$INITIALIZED;
      }
      return $kw10$UNINITIALIZED;
    }
  }

  /** Allocate the cache strategy object for the SBHL graph file vector. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 3620)
  public static final SubLObject new_cache_strategy_for_sbhl_module(SubLObject sbhl_module, SubLObject capacity) {
    if ((capacity == UNPROVIDED)) {
      capacity = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cache_capacity = ((NIL != subl_promotions.non_negative_integer_p(capacity)) ? ((SubLObject) capacity) : cache_capacity_for_cache_strategy_for_sbhl_module(sbhl_module));
        SubLObject cache_strategy = Functions.funcall($sbhl_backing_file_vector_cache_constructor$.getGlobalValue(), cache_capacity);
        if ((NIL != $sbhl_backing_file_vector_cache_gather_cache_metricsP$.getDynamicValue(thread))) {
          cache_utilities.cache_strategy_gather_metrics(cache_strategy);
        }
        return cache_strategy;
      }
    }
  }

  /** Either fetch or allocate the CACHE-STRATEGY-P for the SBHL module provided.
   Assumes that the SBHL lock has already been acquired. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 4199)
  public static final SubLObject get_cache_strategy_for_sbhl_module(SubLObject sbhl_module) {
    {
      SubLObject v_cache = list_utilities.alist_lookup_without_values($sbhl_backing_file_vector_caches_for_modules$.getGlobalValue(), sbhl_module, UNPROVIDED, UNPROVIDED);
      if ((NIL == v_cache)) {
        v_cache = new_cache_strategy_for_sbhl_module(sbhl_module, UNPROVIDED);
        set_cache_strategy_for_sbhl_module(sbhl_module, v_cache);
      }
      return v_cache;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 4684)
  public static final SubLObject set_cache_strategy_for_sbhl_module(SubLObject sbhl_module, SubLObject cache_strategy) {
    checkType(cache_strategy, $sym11$CACHE_STRATEGY_OR_SYMBOL_P);
    $sbhl_backing_file_vector_caches_for_modules$.setGlobalValue(list_utilities.alist_enter($sbhl_backing_file_vector_caches_for_modules$.getGlobalValue(), sbhl_module, cache_strategy, UNPROVIDED));
    return sbhl_module;
  }

  /** Compute the cache capacity as a percentage of the known size of the SBHL module
   graph, but clamp it to the minimum from below.
   @return POSITIVE-INTEGER-P */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 5021)
  public static final SubLObject cache_capacity_for_cache_strategy_for_sbhl_module(SubLObject sbhl_module) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject graph = sbhl_module_vars.get_sbhl_module_graph(sbhl_module);
        SubLObject graph_size = map_utilities.map_size(graph);
        SubLObject estimated_cache_size = Numbers.integerDivide(Numbers.multiply(graph_size, $sbhl_backing_file_vector_cache_size_percentage$.getDynamicValue(thread)), $int2$100);
        return Numbers.max($sbhl_backing_file_vector_cache_minimum_size$.getDynamicValue(thread), estimated_cache_size);
      }
    }
  }

  /** Get the graph link from the graph, potentially swapping it
   in from the file vector backing.
   Notice that the underlying implementation is smart enough to
   only lock the data stream when it is actually necessary. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 7123)
  public static final SubLObject get_sbhl_graph_link_from_graph(SubLObject node, SubLObject graph, SubLObject v_cache) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
          SubLObject _prev_bind_1 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
          try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
            result = file_vector_utilities.file_vector_backed_map_wX_cache_get(graph, $sbhl_backing_file_vector$.getGlobalValue(), v_cache, node, UNPROVIDED);
          } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_1, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** Modify the graph in such a fashion that the file vector backed
   map can track the modification. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 7753)
  public static final SubLObject put_sbhl_graph_link_into_graph(SubLObject node, SubLObject graph, SubLObject v_cache, SubLObject value) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
          SubLObject _prev_bind_1 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
          try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
            result = file_vector_utilities.file_vector_backed_map_wX_cache_put(graph, v_cache, node, value);
          } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_1, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** Remove that node from the graph, with potential modifications
   that can be tracked by the file vector backing infrastructure. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 8234)
  public static final SubLObject remove_sbhl_graph_link_from_graph(SubLObject node, SubLObject graph, SubLObject v_cache) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
          SubLObject _prev_bind_1 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
          try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
            result = file_vector_utilities.file_vector_backed_map_wX_cache_remove(graph, v_cache, node, UNPROVIDED);
          } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_1, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** Inform the file vector backing infrastructure that the entry for
   the node in the graph is mutated. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 8739)
  public static final SubLObject touch_sbhl_link_graph(SubLObject node, SubLObject graph, SubLObject v_cache) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
          SubLObject _prev_bind_1 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
          try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind($sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
            result = file_vector_utilities.file_vector_backed_map_wX_cache_touch(graph, v_cache, node, $sbhl_backing_file_vector$.getGlobalValue());
          } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_1, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** Accessor: @return direction-link-p; the sbhl-direction-link structure for NODE within graph corresponding to PRED. uses MODULE / *sbhl-module* to access sbhl graph. @see get-sbhl-graph */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 9232)
  public static final SubLObject get_sbhl_graph_link(SubLObject node, SubLObject module) {
    checkType(module, $sym12$SBHL_MODULE_P);
    {
      SubLObject result = NIL;
      SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
      SubLObject needs_to_releaseP = NIL;
      try {
        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
        result = get_sbhl_graph_link_from_graph(node, sbhl_module_utilities.get_sbhl_graph(module), get_cache_strategy_for_sbhl_module(module));
      } finally {
        if ((NIL != needs_to_releaseP)) {
          ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
        }
      }
      return result;
    }
  }

  /** Modifier: Sets the value corresonding to NODE in graph determined by MODULE / *sbhl-module* to DIRECTION-LINK, if it is an @see sbhl-direction-link-p. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 9948)
  public static final SubLObject set_sbhl_graph_link(SubLObject node, SubLObject direction_link, SubLObject module) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_links.sbhl_direction_link_p(direction_link))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw13$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$_A_is_not_a__A, direction_link, $sym15$SBHL_DIRECTION_LINK_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw16$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2166");
            } else if (pcase_var.eql($kw18$WARN)) {
              Errors.warn($str14$_A_is_not_a__A, direction_link, $sym15$SBHL_DIRECTION_LINK_P);
            } else {
              Errors.warn($str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str17$continue_anyway, $str14$_A_is_not_a__A, direction_link, $sym15$SBHL_DIRECTION_LINK_P);
            }
          }
        }
      }
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw13$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$_A_is_not_a__A, node, $sym20$SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw16$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2167");
            } else if (pcase_var.eql($kw18$WARN)) {
              Errors.warn($str14$_A_is_not_a__A, node, $sym20$SBHL_NODE_OBJECT_P);
            } else {
              Errors.warn($str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str17$continue_anyway, $str14$_A_is_not_a__A, node, $sym20$SBHL_NODE_OBJECT_P);
            }
          }
        }
      }
      checkType(module, $sym12$SBHL_MODULE_P);
      {
        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
          needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
          put_sbhl_graph_link_into_graph(node, sbhl_module_utilities.get_sbhl_graph(module), get_cache_strategy_for_sbhl_module(module), direction_link);
        } finally {
          if ((NIL != needs_to_releaseP)) {
            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
          }
        }
      }
      return NIL;
    }
  }

  /** Modifier: Notifies the SBHL swapping infrastructure that the NODE has been modified and that
   the swapping mechanism needs to treat this as mutated. The graph is determined by
   MODULE / *sbhl-module* as in @see get-sbhl-graph. */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 10482)
  public static final SubLObject touch_sbhl_graph_link(SubLObject node, SubLObject direction_link, SubLObject module) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
        if ((NIL == sbhl_link_vars.sbhl_node_object_p(node))) {
          {
            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($kw13$ERROR)) {
              sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$_A_is_not_a__A, node, $sym20$SBHL_NODE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else if (pcase_var.eql($kw16$CERROR)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2168");
            } else if (pcase_var.eql($kw18$WARN)) {
              Errors.warn($str14$_A_is_not_a__A, node, $sym20$SBHL_NODE_OBJECT_P);
            } else {
              Errors.warn($str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
              Errors.cerror($str17$continue_anyway, $str14$_A_is_not_a__A, node, $sym20$SBHL_NODE_OBJECT_P);
            }
          }
        }
      }
      checkType(module, $sym12$SBHL_MODULE_P);
      {
        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
          needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
          touch_sbhl_link_graph(node, sbhl_module_utilities.get_sbhl_graph(module), get_cache_strategy_for_sbhl_module(module));
        } finally {
          if ((NIL != needs_to_releaseP)) {
            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
          }
        }
      }
      return NIL;
    }
  }

  /** Modifier: performs (remhash NODE graph) on graph determined by MODULE / *sbhl-module* */
  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 11040)
  public static final SubLObject remove_sbhl_graph_link(SubLObject node, SubLObject module) {
    checkType(module, $sym12$SBHL_MODULE_P);
    {
      SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
      SubLObject needs_to_releaseP = NIL;
      try {
        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
        remove_sbhl_graph_link_from_graph(node, sbhl_module_utilities.get_sbhl_graph(module), get_cache_strategy_for_sbhl_module(module));
      } finally {
        if ((NIL != needs_to_releaseP)) {
          ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 12073)
  public static final SubLObject swap_out_all_pristine_graph_links(SubLObject module) {
    file_vector_utilities.swap_out_all_pristine_file_vector_backed_map_objects(sbhl_module_utilities.get_sbhl_graph(module));
    return module;
  }

  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 12232)
  public static final SubLObject swap_out_all_pristine_sbhl_module_graph_links() {
    {
      SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_module_list();
      SubLObject sbhl_module = NIL;
      for (sbhl_module = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sbhl_module = cdolist_list_var.first()) {
        swap_out_all_pristine_graph_links(sbhl_module);
      }
    }
    return T;
  }

  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 15235)
  public static SubLSymbol $default_number_of_concurrent_readers$ = null;

  @SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 15375)
  public static SubLSymbol $default_number_of_terms_checked$ = null;

  public static final SubLObject declare_sbhl_graphs_file() {
    //declareFunction("optimize_sbhl_store", "OPTIMIZE-SBHL-STORE", 0, 0, false);
    //declareFunction("sbhl_graph_object_p", "SBHL-GRAPH-OBJECT-P", 1, 0, false);
    declareFunction("make_new_sbhl_graph", "MAKE-NEW-SBHL-GRAPH", 0, 0, false);
    //declareFunction("clear_sbhl_graph", "CLEAR-SBHL-GRAPH", 1, 0, false);
    declareFunction("initialize_sbhl_graph_caches", "INITIALIZE-SBHL-GRAPH-CACHES", 0, 0, false);
    //declareFunction("initialize_sbhl_graph_caches_file_vector", "INITIALIZE-SBHL-GRAPH-CACHES-FILE-VECTOR", 2, 0, false);
    declareFunction("new_cache_strategy_for_sbhl_module", "NEW-CACHE-STRATEGY-FOR-SBHL-MODULE", 1, 1, false);
    declareFunction("get_cache_strategy_for_sbhl_module", "GET-CACHE-STRATEGY-FOR-SBHL-MODULE", 1, 0, false);
    declareFunction("set_cache_strategy_for_sbhl_module", "SET-CACHE-STRATEGY-FOR-SBHL-MODULE", 2, 0, false);
    declareFunction("cache_capacity_for_cache_strategy_for_sbhl_module", "CACHE-CAPACITY-FOR-CACHE-STRATEGY-FOR-SBHL-MODULE", 1, 0, false);
    //declareFunction("initialize_sbhl_graph_caches_during_load_kb", "INITIALIZE-SBHL-GRAPH-CACHES-DURING-LOAD-KB", 2, 0, false);
    //declareFunction("sbhl_graph_completely_cachedP", "SBHL-GRAPH-COMPLETELY-CACHED?", 0, 0, false);
    //declareFunction("get_sbhl_module_caching_ratio", "GET-SBHL-MODULE-CACHING-RATIO", 1, 0, false);
    //declareFunction("get_sbhl_modules_caching_ratios", "GET-SBHL-MODULES-CACHING-RATIOS", 0, 0, false);
    declareFunction("get_sbhl_graph_link_from_graph", "GET-SBHL-GRAPH-LINK-FROM-GRAPH", 3, 0, false);
    declareFunction("put_sbhl_graph_link_into_graph", "PUT-SBHL-GRAPH-LINK-INTO-GRAPH", 4, 0, false);
    declareFunction("remove_sbhl_graph_link_from_graph", "REMOVE-SBHL-GRAPH-LINK-FROM-GRAPH", 3, 0, false);
    declareFunction("touch_sbhl_link_graph", "TOUCH-SBHL-LINK-GRAPH", 3, 0, false);
    declareFunction("get_sbhl_graph_link", "GET-SBHL-GRAPH-LINK", 2, 0, false);
    declareFunction("set_sbhl_graph_link", "SET-SBHL-GRAPH-LINK", 3, 0, false);
    declareFunction("touch_sbhl_graph_link", "TOUCH-SBHL-GRAPH-LINK", 3, 0, false);
    declareFunction("remove_sbhl_graph_link", "REMOVE-SBHL-GRAPH-LINK", 2, 0, false);
    //declareMacro("do_sbhl_graph_links", "DO-SBHL-GRAPH-LINKS");
    //declareFunction("swap_in_all_graph_links", "SWAP-IN-ALL-GRAPH-LINKS", 1, 0, false);
    declareFunction("swap_out_all_pristine_graph_links", "SWAP-OUT-ALL-PRISTINE-GRAPH-LINKS", 1, 0, false);
    declareFunction("swap_out_all_pristine_sbhl_module_graph_links", "SWAP-OUT-ALL-PRISTINE-SBHL-MODULE-GRAPH-LINKS", 0, 0, false);
    //declareFunction("get_sbhl_module_cache_strategy_metrics", "GET-SBHL-MODULE-CACHE-STRATEGY-METRICS", 1, 0, false);
    //declareFunction("get_all_sbhl_module_cache_strategy_metrics", "GET-ALL-SBHL-MODULE-CACHE-STRATEGY-METRICS", 0, 0, false);
    //declareFunction("get_sbhl_module_cache_strategy_information", "GET-SBHL-MODULE-CACHE-STRATEGY-INFORMATION", 1, 0, false);
    //declareFunction("show_all_sbhl_module_cache_strategies", "SHOW-ALL-SBHL-MODULE-CACHE-STRATEGIES", 0, 0, false);
    //declareFunction("stress_test_sbhl_graph_concurrent_swapping", "STRESS-TEST-SBHL-GRAPH-CONCURRENT-SWAPPING", 0, 2, false);
    //declareFunction("stress_test_read_randomly_from_sbhl", "STRESS-TEST-READ-RANDOMLY-FROM-SBHL", 2, 0, false);
    //declareFunction("stress_test_sbhl_graph_concurrent_cache_strategy_update", "STRESS-TEST-SBHL-GRAPH-CONCURRENT-CACHE-STRATEGY-UPDATE", 0, 1, false);
    //declareFunction("stress_test_check_same_specs", "STRESS-TEST-CHECK-SAME-SPECS", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_graphs_file() {
    $sbhl_graph_equality_test$ = deflexical("*SBHL-GRAPH-EQUALITY-TEST*", Symbols.symbol_function(EQ));
    $sbhl_backing_file_vector$ = deflexical("*SBHL-BACKING-FILE-VECTOR*", maybeDefault( $sym0$_SBHL_BACKING_FILE_VECTOR_, $sbhl_backing_file_vector$, NIL));
    $sbhl_backing_file_vector_caches_for_modules$ = deflexical("*SBHL-BACKING-FILE-VECTOR-CACHES-FOR-MODULES*", maybeDefault( $sym1$_SBHL_BACKING_FILE_VECTOR_CACHES_FOR_MODULES_, $sbhl_backing_file_vector_caches_for_modules$, NIL));
    $sbhl_backing_file_vector_cache_size_percentage$ = defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-SIZE-PERCENTAGE*", TWO_INTEGER);
    $sbhl_backing_file_vector_cache_minimum_size$ = defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-MINIMUM-SIZE*", $int2$100);
    $sbhl_backing_file_vector_cache_gather_cache_metricsP$ = defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-GATHER-CACHE-METRICS?*", T);
    $sbhl_file_vector_data_stream_lock$ = deflexical("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*", maybeDefault( $sym3$_SBHL_FILE_VECTOR_DATA_STREAM_LOCK_, $sbhl_file_vector_data_stream_lock$, ()-> (Locks.make_lock($str4$SBHL_File_Vector_Data_Stream_lock))));
    $sbhl_backing_file_vector_cache_constructor$ = deflexical("*SBHL-BACKING-FILE-VECTOR-CACHE-CONSTRUCTOR*", $sym5$NEW_METERED_PREALLOCATED_CACHE);
    $default_number_of_concurrent_readers$ = deflexical("*DEFAULT-NUMBER-OF-CONCURRENT-READERS*", TWENTY_INTEGER);
    $default_number_of_terms_checked$ = deflexical("*DEFAULT-NUMBER-OF-TERMS-CHECKED*", $int43$500);
    return NIL;
  }

  public static final SubLObject setup_sbhl_graphs_file() {
        subl_macro_promotions.declare_defglobal($sym0$_SBHL_BACKING_FILE_VECTOR_);
    subl_macro_promotions.declare_defglobal($sym1$_SBHL_BACKING_FILE_VECTOR_CACHES_FOR_MODULES_);
    subl_macro_promotions.declare_defglobal($sym3$_SBHL_FILE_VECTOR_DATA_STREAM_LOCK_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_SBHL_BACKING_FILE_VECTOR_ = makeSymbol("*SBHL-BACKING-FILE-VECTOR*");
  public static final SubLSymbol $sym1$_SBHL_BACKING_FILE_VECTOR_CACHES_FOR_MODULES_ = makeSymbol("*SBHL-BACKING-FILE-VECTOR-CACHES-FOR-MODULES*");
  public static final SubLInteger $int2$100 = makeInteger(100);
  public static final SubLSymbol $sym3$_SBHL_FILE_VECTOR_DATA_STREAM_LOCK_ = makeSymbol("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*");
  public static final SubLString $str4$SBHL_File_Vector_Data_Stream_lock = makeString("SBHL File Vector Data Stream lock");
  public static final SubLSymbol $sym5$NEW_METERED_PREALLOCATED_CACHE = makeSymbol("NEW-METERED-PREALLOCATED-CACHE");
  public static final SubLString $str6$sbhl_module_graphs = makeString("sbhl-module-graphs");
  public static final SubLString $str7$cfasl = makeString("cfasl");
  public static final SubLString $str8$sbhl_module_graphs_index = makeString("sbhl-module-graphs-index");
  public static final SubLSymbol $kw9$INITIALIZED = makeKeyword("INITIALIZED");
  public static final SubLSymbol $kw10$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $sym11$CACHE_STRATEGY_OR_SYMBOL_P = makeSymbol("CACHE-STRATEGY-OR-SYMBOL-P");
  public static final SubLSymbol $sym12$SBHL_MODULE_P = makeSymbol("SBHL-MODULE-P");
  public static final SubLSymbol $kw13$ERROR = makeKeyword("ERROR");
  public static final SubLString $str14$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym15$SBHL_DIRECTION_LINK_P = makeSymbol("SBHL-DIRECTION-LINK-P");
  public static final SubLSymbol $kw16$CERROR = makeKeyword("CERROR");
  public static final SubLString $str17$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw18$WARN = makeKeyword("WARN");
  public static final SubLString $str19$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLSymbol $sym20$SBHL_NODE_OBJECT_P = makeSymbol("SBHL-NODE-OBJECT-P");
  public static final SubLList $list21 = list(list(makeSymbol("NODE-VAR"), makeSymbol("LINK-VAR"), makeSymbol("&KEY"), makeSymbol("MODULE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list22 = list(makeKeyword("MODULE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw23$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw24$MODULE = makeKeyword("MODULE");
  public static final SubLSymbol $kw25$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym26$MAP = makeUninternedSymbol("MAP");
  public static final SubLSymbol $sym27$WITH_CFASL_COMMON_SYMBOLS_SIMPLE = makeSymbol("WITH-CFASL-COMMON-SYMBOLS-SIMPLE");
  public static final SubLList $list28 = list(makeSymbol("GET-HL-STORE-CACHES-SHARED-SYMBOLS"));
  public static final SubLSymbol $sym29$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym30$GET_SBHL_GRAPH = makeSymbol("GET-SBHL-GRAPH");
  public static final SubLSymbol $sym31$DO_FILE_VECTOR_BACKED_MAP = makeSymbol("DO-FILE-VECTOR-BACKED-MAP");
  public static final SubLList $list32 = list(makeSymbol("NODE"), makeUninternedSymbol("IMPL-VALUE"));
  public static final SubLString $str33$Capacity______Hits____Misses__Sma = makeString("Capacity      Hits    Misses  Small?~%");
  public static final SubLString $str34$_________________________________ = makeString("------------------------------------~%");
  public static final SubLSymbol $sym35$FORT__ = makeSymbol("FORT-<");
  public static final SubLString $str36$___A = makeString("~&~A");
  public static final SubLList $list37 = list(makeSymbol("PREDICATE-AGAIN"), makeSymbol("CAPACITY"), makeSymbol("HITS"), makeSymbol("MISSES"), makeSymbol("TOO-SMALL-P"));
  public static final SubLString $str38$_6_A__9_A__9_A__ = makeString("~6,A ~9,A ~9,A~%");
  public static final SubLString $str39$___ = makeString("---");
  public static final SubLString $str40$_6_d__9_d__9_d_____A__ = makeString("~6,d ~9,d ~9,d    ~A~%");
  public static final SubLString $str41$___ = makeString("!!!");
  public static final SubLString $str42$ = makeString("");
  public static final SubLInteger $int43$500 = makeInteger(500);
  public static final SubLString $str44$Concurrent_Reads_Stress_Test_Prob = makeString("Concurrent Reads Stress Test Problems");
  public static final SubLString $str45$Concurrent_SBHL_Reader_ = makeString("Concurrent SBHL Reader ");
  public static final SubLSymbol $sym46$STRESS_TEST_READ_RANDOMLY_FROM_SBHL = makeSymbol("STRESS-TEST-READ-RANDOMLY-FROM-SBHL");
  public static final SubLFloat $float47$0_1 = makeDouble(0.1);
  public static final SubLSymbol $sym48$VALID_PROCESS_P = makeSymbol("VALID-PROCESS-P");
  public static final SubLSymbol $sym49$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLObject $const50$Individual = constant_handles.reader_make_constant_shell(makeString("Individual"));
  public static final SubLString $str51$Concurrent_Cache_Strategy_Stress_ = makeString("Concurrent Cache Strategy Stress Test Problems");
  public static final SubLList $list52 = list(constant_handles.reader_make_constant_shell(makeString("Organism")));
  public static final SubLSymbol $sym53$STRESS_TEST_CHECK_SAME_SPECS = makeSymbol("STRESS-TEST-CHECK-SAME-SPECS");
  public static final SubLObject $const54$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_sbhl_graphs_file();
  }

  @Override
  public void initializeVariables() {
    init_sbhl_graphs_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_sbhl_graphs_file();
  }

}
