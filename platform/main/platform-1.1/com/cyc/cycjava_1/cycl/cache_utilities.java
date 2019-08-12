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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cache;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.integer_sequence_generator;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class cache_utilities extends SubLTranslatedFile {

  //// Constructor

  private cache_utilities() {}
  public static final SubLFile me = new cache_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.cache_utilities";

  //// Definitions

  /** Allocate a metrics object and then begin using it to gather metrics.
   @return BOOLEANP */
  @SubL(source = "cycl/cache-utilities.lisp", position = 10814) 
  public static final SubLObject cache_strategy_gather_metrics(SubLObject strategy) {
    checkType(strategy, $sym0$CACHE_STRATEGY_P);
    {
      SubLObject metrics = new_cache_metrics();
      return cache_strategy_object_gather_metrics(strategy, metrics);
    }
  }

  @SubL(source = "cycl/cache-utilities.lisp", position = 13581) 
  public static SubLSymbol $cache_strategy_object_p_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 13714) 
  public static SubLSymbol $cache_strategy_object_reset_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 13883) 
  public static SubLSymbol $cache_strategy_object_cache_capacity_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 14070) 
  public static SubLSymbol $cache_strategy_object_cache_size_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 14249) 
  public static SubLSymbol $cache_strategy_object_track_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 14447) 
  public static SubLSymbol $cache_strategy_object_trackedP_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 14658) 
  public static SubLSymbol $cache_strategy_object_untrack_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 14861) 
  public static SubLSymbol $cache_strategy_object_supports_parameter_p_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 15048) 
  public static SubLSymbol $cache_strategy_object_get_parameter_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 15288) 
  public static SubLSymbol $cache_strategy_object_set_parameter_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 15528) 
  public static SubLSymbol $cache_strategy_object_note_reference_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 15737) 
  public static SubLSymbol $cache_strategy_object_note_references_in_order_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 16357) 
  public static SubLSymbol $cache_strategy_object_get_metrics_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 16536) 
  public static SubLSymbol $cache_strategy_object_reset_metrics_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 16719) 
  public static SubLSymbol $cache_strategy_object_gather_metrics_method_table$ = null;

  /** By default, we do not know how to gather metrics. */
  @SubL(source = "cycl/cache-utilities.lisp", position = 16719) 
  public static final SubLObject cache_strategy_object_gather_metrics(SubLObject strategy, SubLObject metrics) {
    {
      SubLObject method_function = Structures.method_func(strategy, $cache_strategy_object_gather_metrics_method_table$.getGlobalValue());
      if ((NIL != method_function)) {
        return Functions.funcall(method_function, strategy, metrics);
      }
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31204");
    }
  }

  /** Determine whether the object is a cache strategy or not.
  @return BOOLEANP */
 @SubL(source = "cycl/cache-utilities.lisp", position = 3193) 
 public static final SubLObject cache_strategy_p(SubLObject object) {
   return cache_strategy_object_p(object);
 }


 /** If metrics are being kept, then note the cache miss.
  Otherwise, the operation is a NO-OP
  @return STRATEGY */
 @SubL(source = "cycl/cache-utilities.lisp", position = 7323) 
 public static final SubLObject cache_strategy_note_cache_miss(SubLObject strategy) {
   if ((NIL != cache_strategy_keeps_metrics_p(strategy))) {
     cache_metrics_note_miss(cache_strategy_get_metrics(strategy));
   }
   return strategy;
 }
 

 /** Update the metrics to reflect that the cache lookup resulted in a miss.
  @return CACHE-METRICS-P */
 @SubL(source = "cycl/cache-utilities.lisp", position = 20748) 
 public static final SubLObject cache_metrics_note_miss(SubLObject metrics) {
   checkType(metrics, $sym7$CACHE_METRICS_P);
   _csetf_cachemtr_miss_count(metrics, Numbers.add(cachemtr_miss_count(metrics), ONE_INTEGER));
   return metrics;
 }


 @SubL(source = "cycl/cache-utilities.lisp", position = 27857) 
 public static final SubLObject cache_strategy_object_keeps_metrics_p_metered_cache_method(SubLObject strategy) {
   return cache_strategy_mcache_object_keeps_metrics_p(strategy);
 }


 @SubL(source = "cycl/cache-utilities.lisp", position = 24264) 
 public static final SubLObject mcache_metrics(SubLObject object) {
   checkType(object, $sym31$METERED_CACHE_P);
   return object.getField3();
 }


 /** Inform the cache strategy'tracking system that the object mentioned was
  referenced. Objects that are not currently being tracked will be ignored.
  @return CACHE-STRATEGY-P */
 @SubL(source = "cycl/cache-utilities.lisp", position = 9064) 
 public static final SubLObject cache_strategy_note_reference(SubLObject strategy, SubLObject object) {
   if ((NIL != cache_strategy_trackedP(strategy, object))) {
     cache_strategy_object_note_reference(strategy, object);
   }
   return strategy;
 }
 

 /** Determine whether this object is currently being tracked
  @return BOOLEANP true if the object is already tracked in the 
  cache, FALSE if not */
 @SubL(source = "cycl/cache-utilities.lisp", position = 6009) 
 public static final SubLObject cache_strategy_trackedP(SubLObject strategy, SubLObject object) {
   checkType(strategy, $sym0$CACHE_STRATEGY_P);
   return cache_strategy_object_trackedP(strategy, object);
 }


 /** By default, we do not know whether the object is tracked. */
 @SubL(source = "cycl/cache-utilities.lisp", position = 14447) 
 public static final SubLObject cache_strategy_object_trackedP(SubLObject strategy, SubLObject object) {
   {
     SubLObject method_function = Structures.method_func(strategy, $cache_strategy_object_trackedP_method_table$.getGlobalValue());
     if ((NIL != method_function)) {
       return Functions.funcall(method_function, strategy, object);
     }
     return cache_strategy_method_not_implemented_for(strategy);
   }
 }


 @SubL(source = "cycl/cache-utilities.lisp", position = 26103) 
 public static final SubLObject cache_strategy_object_trackedP_metered_cache_method(SubLObject strategy, SubLObject object) {
   return cache_strategy_mcache_object_trackedP(strategy, object);
 }

 @SubL(source = "cycl/cache-utilities.lisp", position = 26925) 
 public static final SubLObject cache_strategy_object_note_reference_metered_cache_method(SubLObject strategy, SubLObject object) {
   return cache_strategy_mcache_object_note_reference(strategy, object);
 }

 @SubL(source = "cycl/cache-utilities.lisp", position = 29734) 
 public static final SubLObject cache_strategy_mcache_object_note_reference(SubLObject mcache, SubLObject object) {
   return cache.cache_set_without_values(mcache_cache(mcache), object, object);
 }


 @SubL(source = "cycl/cache-utilities.lisp", position = 29088) 
 public static final SubLObject cache_strategy_mcache_object_trackedP(SubLObject mcache, SubLObject object) {
   return cache.cache_contains_key_p(mcache_cache(mcache), object);
 }

 
 /** By default, we do not know how to note a reference. */
 @SubL(source = "cycl/cache-utilities.lisp", position = 15528) 
 public static final SubLObject cache_strategy_object_note_reference(SubLObject strategy, SubLObject object) {
   {
     SubLObject method_function = Structures.method_func(strategy, $cache_strategy_object_note_reference_method_table$.getGlobalValue());
     if ((NIL != method_function)) {
       return Functions.funcall(method_function, strategy, object);
     }
     return cache_strategy_method_not_implemented_for(strategy);
   }
 }

 
 
 @SubL(source = "cycl/cache-utilities.lisp", position = 30591) 
 public static final SubLObject cache_strategy_mcache_object_keeps_metrics_p(SubLObject mcache) {
   return cache_metrics_p(mcache_metrics(mcache));
 }


 @SubL(source = "cycl/cache-utilities.lisp", position = 19101) 
 public static final SubLObject cache_metrics_p(SubLObject object) {
   return ((object.getClass() == $cache_metrics_native.class) ? ((SubLObject) T) : NIL);
 }


 @SubL(source = "cycl/cache-utilities.lisp", position = 27263) 
 public static final SubLObject cache_strategy_object_get_metrics_metered_cache_method(SubLObject strategy) {
   return cache_strategy_mcache_object_get_metrics(strategy);
 }


 @SubL(source = "cycl/cache-utilities.lisp", position = 30052) 
 public static final SubLObject cache_strategy_mcache_object_get_metrics(SubLObject mcache) {
   return mcache_metrics(mcache);
 }
 
 
 @SubL(source = "cycl/cache-utilities.lisp", position = 19101) 
 public static final SubLObject cachemtr_miss_count(SubLObject object) {
   checkType(object, $sym7$CACHE_METRICS_P);
   return object.getField3();
 }

 

 /** If metrics are being kept, then note the cache hit.
  Otherwise the operation is a NO-OP.
  @return STRATEGY */
 @SubL(source = "cycl/cache-utilities.lisp", position = 6941) 
 public static final SubLObject cache_strategy_note_cache_hits(SubLObject strategy, SubLObject several) {
   if ((NIL != cache_strategy_keeps_metrics_p(strategy))) {
     {
       SubLObject metrics = cache_strategy_get_metrics(strategy);
       SubLObject i = NIL;
       for (i = ZERO_INTEGER; i.numL(several); i = Numbers.add(i, ONE_INTEGER)) {
         cache_metrics_note_hit(metrics);
       }
     }
   }
   return strategy;
 }


 /** If metrics are being kept, then note the cache hit.
  Otherwise the operation is a NO-OP.
  @return STRATEGY */
 @SubL(source = "cycl/cache-utilities.lisp", position = 6631) 
 public static final SubLObject cache_strategy_note_cache_hit(SubLObject strategy) {
   if ((NIL != cache_strategy_keeps_metrics_p(strategy))) {
     cache_metrics_note_hit(cache_strategy_get_metrics(strategy));
   }
   return strategy;
 }


 /** @return CACHE-METRICS-P or NIL if no metrics are being gathered */
 @SubL(source = "cycl/cache-utilities.lisp", position = 10146) 
 public static final SubLObject cache_strategy_get_metrics(SubLObject strategy) {
   if ((NIL != cache_strategy_keeps_metrics_p(strategy))) {
     return cache_strategy_object_get_metrics(strategy);
   }
   return NIL;
 }


 /** By default we do not know how to get the metrics. */
 @SubL(source = "cycl/cache-utilities.lisp", position = 16357) 
 public static final SubLObject cache_strategy_object_get_metrics(SubLObject strategy) {
   {
     SubLObject method_function = Structures.method_func(strategy, $cache_strategy_object_get_metrics_method_table$.getGlobalValue());
     if ((NIL != method_function)) {
       return Functions.funcall(method_function, strategy);
     }
     return cache_strategy_method_not_implemented_for(strategy);
   }
 }

 
 @SubL(source = "cycl/cache-utilities.lisp", position = 19101) 
 public static final SubLObject cachemtr_hit_count(SubLObject object) {
   checkType(object, $sym7$CACHE_METRICS_P);
   return object.getField2();
 }


 /** Update the metrics to reflect that the cache lookup resulted in a hit.
  @return CACHE-METRICS-P */
 @SubL(source = "cycl/cache-utilities.lisp", position = 20502) 
 public static final SubLObject cache_metrics_note_hit(SubLObject metrics) {
   checkType(metrics, $sym7$CACHE_METRICS_P);
   _csetf_cachemtr_hit_count(metrics, Numbers.add(cachemtr_hit_count(metrics), ONE_INTEGER));
   return metrics;
 }


 /** Determine if the cache strategy is currently gathering metrics or not.
  @return BOOLEANP */
 @SubL(source = "cycl/cache-utilities.lisp", position = 11411) 
 public static final SubLObject cache_strategy_keeps_metrics_p(SubLObject strategy) {
   checkType(strategy, $sym0$CACHE_STRATEGY_P);
   return cache_strategy_object_keeps_metrics_p(strategy);
 }




 /** By default, we do not know whether the strategy is keeping metrics or not. */
 @SubL(source = "cycl/cache-utilities.lisp", position = 17123) 
 public static final SubLObject cache_strategy_object_keeps_metrics_p(SubLObject strategy) {
   {
     SubLObject method_function = Structures.method_func(strategy, $cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue());
     if ((NIL != method_function)) {
       return Functions.funcall(method_function, strategy);
     }
     return cache_strategy_method_not_implemented_for(strategy);
   }
 }


 
 /** Track this object in the cache. If CACHE-STRATEGY-CACHE-FULL-P
  is TRUE, then select an object to untrack and return that
  no longer tracked object; otherwise return the newly tracked 
  object.    
  @return either the newly tracked object or, if the cache was
  at capacity, the ejected OBJECT */
 @SubL(source = "cycl/cache-utilities.lisp", position = 5549) 
 public static final SubLObject cache_strategy_track(SubLObject strategy, SubLObject object) {
   checkType(strategy, $sym0$CACHE_STRATEGY_P);
   return cache_strategy_object_track(strategy, object);
 }


 /** By default, we do not know how to track an object */
 @SubL(source = "cycl/cache-utilities.lisp", position = 14249) 
 public static final SubLObject cache_strategy_object_track(SubLObject strategy, SubLObject object) {
   {
     SubLObject method_function = Structures.method_func(strategy, $cache_strategy_object_track_method_table$.getGlobalValue());
     if ((NIL != method_function)) {
       return Functions.funcall(method_function, strategy, object);
     }
     return cache_strategy_method_not_implemented_for(strategy);
   }
 }


 @SubL(source = "cycl/cache-utilities.lisp", position = 13294) 
 public static final SubLObject cache_strategy_method_not_implemented_for(SubLObject object) {
   return Errors.error($str4$Not_implemented_for__A_, object);
 }

 
/** By default, nothing is a cache strategy object. */
@SubL(source = "cycl/cache-utilities.lisp", position = 13581) 
public static final SubLObject cache_strategy_object_p(SubLObject object) {
  {
    SubLObject method_function = Structures.method_func(object, $cache_strategy_object_p_method_table$.getGlobalValue());
    if ((NIL != method_function)) {
      return Functions.funcall(method_function, object);
    }
    return NIL;
  }
}
  @SubL(source = "cycl/cache-utilities.lisp", position = 16928) 
  public static SubLSymbol $cache_strategy_object_dont_gather_metrics_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 17123) 
  public static SubLSymbol $cache_strategy_object_keeps_metrics_p_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 17331) 
  public static SubLSymbol $new_cache_strategy_object_tracked_content_iterator_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 17534) 
  public static SubLSymbol $map_cache_strategy_object_tracked_content_method_table$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 18099) 
  public static SubLSymbol $cache_strategy_object_untrack_all_method_table$ = null;

  public static final class $cache_metrics_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $hit_count; }
    public SubLObject getField3() { return $miss_count; }
    public SubLObject setField2(SubLObject value) { return $hit_count = value; }
    public SubLObject setField3(SubLObject value) { return $miss_count = value; }
    public SubLObject $hit_count = NIL;
    public SubLObject $miss_count = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($cache_metrics_native.class, $sym6$CACHE_METRICS, $sym7$CACHE_METRICS_P, $list8, $list9, new String[] {"$hit_count", "$miss_count"}, $list10, $list11, $sym12$PRINT_CACHE_METRICS);
  }

  @SubL(source = "cycl/cache-utilities.lisp", position = 19101) 
  public static SubLSymbol $dtp_cache_metrics$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 19101) 
  public static final SubLObject cache_metrics_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31267");
    return NIL;
  }

  public static final class $cache_metrics_p$UnaryFunction extends UnaryFunction {
    public $cache_metrics_p$UnaryFunction() { super(extractFunctionNamed("CACHE-METRICS-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31150"); }
  }

  @SubL(source = "cycl/cache-utilities.lisp", position = 19101) 
  public static final SubLObject _csetf_cachemtr_hit_count(SubLObject object, SubLObject value) {
    checkType(object, $sym7$CACHE_METRICS_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/cache-utilities.lisp", position = 19101) 
  public static final SubLObject _csetf_cachemtr_miss_count(SubLObject object, SubLObject value) {
    checkType(object, $sym7$CACHE_METRICS_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/cache-utilities.lisp", position = 19101) 
  public static final SubLObject make_cache_metrics(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $cache_metrics_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw18$HIT_COUNT)) {
            _csetf_cachemtr_hit_count(v_new, current_value);
          } else if (pcase_var.eql($kw19$MISS_COUNT)) {
            _csetf_cachemtr_miss_count(v_new, current_value);
          } else {
            Errors.error($str20$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Create a new empty cache metrics infrastructure. */
  @SubL(source = "cycl/cache-utilities.lisp", position = 19623) 
  public static final SubLObject new_cache_metrics() {
    {
      SubLObject metrics = make_cache_metrics(UNPROVIDED);
      reset_cache_metrics_counts(metrics, UNPROVIDED, UNPROVIDED);
      return metrics;
    }
  }

  /** Reset the counts in the cache metrics. */
  @SubL(source = "cycl/cache-utilities.lisp", position = 19817) 
  public static final SubLObject reset_cache_metrics_counts(SubLObject metrics, SubLObject hits, SubLObject misses) {
    if ((hits == UNPROVIDED)) {
      hits = ZERO_INTEGER;
    }
    if ((misses == UNPROVIDED)) {
      misses = ZERO_INTEGER;
    }
    _csetf_cachemtr_hit_count(metrics, hits);
    _csetf_cachemtr_miss_count(metrics, misses);
    return metrics;
  }

  @SubL(source = "cycl/cache-utilities.lisp", position = 23092) 
  private static SubLSymbol $cfasl_wide_opcode_cache_metrics$ = null;

  public static final class $metered_cache_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $cache; }
    public SubLObject getField3() { return $metrics; }
    public SubLObject setField2(SubLObject value) { return $cache = value; }
    public SubLObject setField3(SubLObject value) { return $metrics = value; }
    public SubLObject $cache = NIL;
    public SubLObject $metrics = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($metered_cache_native.class, $sym30$METERED_CACHE, $sym31$METERED_CACHE_P, $list32, $list33, new String[] {"$cache", "$metrics"}, $list34, $list35, $sym36$PRINT_METERED_CACHE);
  }

  @SubL(source = "cycl/cache-utilities.lisp", position = 24264) 
  public static SubLSymbol $dtp_metered_cache$ = null;

  @SubL(source = "cycl/cache-utilities.lisp", position = 24264) 
  public static final SubLObject metered_cache_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31268");
    return NIL;
  }

  public static final class $metered_cache_p$UnaryFunction extends UnaryFunction {
    public $metered_cache_p$UnaryFunction() { super(extractFunctionNamed("METERED-CACHE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31264"); }
  }


  @SubL(source = "cycl/cache-utilities.lisp", position = 28737) 
  public static final SubLObject cache_strategy_mcache_object_track(SubLObject mcache, SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject key = cache.cache_set_return_dropped(mcache_cache(mcache), object, object);
        SubLObject value = thread.secondMultipleValue();
        SubLObject dropped_p = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return ((NIL != dropped_p) ? ((SubLObject) key) : object);
      }
    }
  }


  @SubL(source = "cycl/cache-utilities.lisp", position = 24264) 
  public static final SubLObject mcache_cache(SubLObject object) {
    checkType(object, $sym31$METERED_CACHE_P);
    return object.getField2();
  }

  
  @SubL(source = "cycl/cache-utilities.lisp", position = 25963) 
  public static final SubLObject cache_strategy_object_track_metered_cache_method(SubLObject strategy, SubLObject object) {
    return cache_strategy_mcache_object_track(strategy, object);
  }

  
  @SubL(source = "cycl/cache-utilities.lisp", position = 24264) 
  public static final SubLObject _csetf_mcache_cache(SubLObject object, SubLObject value) {
    checkType(object, $sym31$METERED_CACHE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/cache-utilities.lisp", position = 24264) 
  public static final SubLObject _csetf_mcache_metrics(SubLObject object, SubLObject value) {
    checkType(object, $sym31$METERED_CACHE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/cache-utilities.lisp", position = 24264) 
  public static final SubLObject make_metered_cache(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $metered_cache_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw42$CACHE)) {
            _csetf_mcache_cache(v_new, current_value);
          } else if (pcase_var.eql($kw43$METRICS)) {
            _csetf_mcache_metrics(v_new, current_value);
          } else {
            Errors.error($str20$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Allocate the new metered cache, leaving the metrics slot empty for now.
   @return the new metered cache */
  @SubL(source = "cycl/cache-utilities.lisp", position = 24460) 
  public static final SubLObject new_metered_cache(SubLObject v_cache) {
    {
      SubLObject mcache = make_metered_cache(UNPROVIDED);
      _csetf_mcache_cache(mcache, v_cache);
      return mcache;
    }
  }

  /** Allocate a new metered cache for a pre-allocated cache of the specified
   capacity and test-type
   @return the new metered cache */
  @SubL(source = "cycl/cache-utilities.lisp", position = 24711) 
  public static final SubLObject new_metered_preallocated_cache(SubLObject capacity, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    return new_metered_cache(cache.new_preallocated_cache(capacity, test));
  }

  /** METERED-CACHE-P has a cache strategy implementation. */
  @SubL(source = "cycl/cache-utilities.lisp", position = 25427) 
  public static final SubLObject cache_strategy_object_p_metered_cache_method(SubLObject object) {
    return T;
  }

  @SubL(source = "cycl/cache-utilities.lisp", position = 27543) 
  public static final SubLObject cache_strategy_object_gather_metrics_metered_cache_method(SubLObject strategy, SubLObject metrics) {
    return cache_strategy_mcache_object_gather_metrics(strategy, metrics);
  }

  @SubL(source = "cycl/cache-utilities.lisp", position = 30276) 
  public static final SubLObject cache_strategy_mcache_object_gather_metrics(SubLObject mcache, SubLObject metrics) {
    _csetf_mcache_metrics(mcache, metrics);
    return mcache;
  }

  public static final class $recording_cache_strategy_facade_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $cache_strategy; }
    public SubLObject getField3() { return $records; }
    public SubLObject getField4() { return $timestamper; }
    public SubLObject setField2(SubLObject value) { return $cache_strategy = value; }
    public SubLObject setField3(SubLObject value) { return $records = value; }
    public SubLObject setField4(SubLObject value) { return $timestamper = value; }
    public SubLObject $cache_strategy = NIL;
    public SubLObject $records = NIL;
    public SubLObject $timestamper = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($recording_cache_strategy_facade_native.class, $sym67$RECORDING_CACHE_STRATEGY_FACADE, $sym68$RECORDING_CACHE_STRATEGY_FACADE_P, $list69, $list70, new String[] {"$cache_strategy", "$records", "$timestamper"}, $list71, $list72, $sym73$PRINT_RECORDING_CACHE_STRATEGY_FACADE);
  }

  @SubL(source = "cycl/cache-utilities.lisp", position = 31881) 
  public static SubLSymbol $dtp_recording_cache_strategy_facade$ = null;

  public static final class $recording_cache_strategy_facade_p$UnaryFunction extends UnaryFunction {
    public $recording_cache_strategy_facade_p$UnaryFunction() { super(extractFunctionNamed("RECORDING-CACHE-STRATEGY-FACADE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31273"); }
  }

  public static final SubLObject declare_cache_utilities_file() {
    declareFunction(myName, "cache_strategy_p", "CACHE-STRATEGY-P", 1, 0, false);
    declareFunction(myName, "cache_strategy_or_symbol_p", "CACHE-STRATEGY-OR-SYMBOL-P", 1, 0, false);
    declareFunction(myName, "cache_strategy_reset", "CACHE-STRATEGY-RESET", 1, 0, false);
    declareFunction(myName, "cache_strategy_cache_capacity", "CACHE-STRATEGY-CACHE-CAPACITY", 1, 0, false);
    declareFunction(myName, "cache_strategy_cache_size", "CACHE-STRATEGY-CACHE-SIZE", 1, 0, false);
    declareFunction(myName, "cache_strategy_cache_load", "CACHE-STRATEGY-CACHE-LOAD", 1, 0, false);
    declareFunction(myName, "cache_strategy_cache_full_p", "CACHE-STRATEGY-CACHE-FULL-P", 1, 0, false);
    declareFunction(myName, "cache_strategy_cache_empty_p", "CACHE-STRATEGY-CACHE-EMPTY-P", 1, 0, false);
    declareFunction(myName, "cache_strategy_track", "CACHE-STRATEGY-TRACK", 2, 0, false);
    declareFunction(myName, "cache_strategy_trackedP", "CACHE-STRATEGY-TRACKED?", 2, 0, false);
    declareFunction(myName, "cache_strategy_untrack", "CACHE-STRATEGY-UNTRACK", 2, 0, false);
    declareFunction(myName, "cache_strategy_note_cache_hit", "CACHE-STRATEGY-NOTE-CACHE-HIT", 1, 0, false);
    declareFunction(myName, "cache_strategy_note_cache_hits", "CACHE-STRATEGY-NOTE-CACHE-HITS", 2, 0, false);
    declareFunction(myName, "cache_strategy_note_cache_miss", "CACHE-STRATEGY-NOTE-CACHE-MISS", 1, 0, false);
    declareFunction(myName, "cache_strategy_supports_parameter_p", "CACHE-STRATEGY-SUPPORTS-PARAMETER-P", 2, 0, false);
    declareFunction(myName, "cache_strategy_get_parameter", "CACHE-STRATEGY-GET-PARAMETER", 2, 1, false);
    declareFunction(myName, "cache_strategy_set_parameter", "CACHE-STRATEGY-SET-PARAMETER", 3, 0, false);
    declareFunction(myName, "cache_strategy_note_reference", "CACHE-STRATEGY-NOTE-REFERENCE", 2, 0, false);
    declareFunction(myName, "cache_strategy_note_references_in_order", "CACHE-STRATEGY-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
    declareFunction(myName, "cache_strategy_get_metrics", "CACHE-STRATEGY-GET-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_reset_metrics", "CACHE-STRATEGY-RESET-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_gather_metrics", "CACHE-STRATEGY-GATHER-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_dont_gather_metrics", "CACHE-STRATEGY-DONT-GATHER-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_keeps_metrics_p", "CACHE-STRATEGY-KEEPS-METRICS-P", 1, 0, false);
    declareFunction(myName, "new_cache_strategy_tracked_content_iterator", "NEW-CACHE-STRATEGY-TRACKED-CONTENT-ITERATOR", 1, 0, false);
    declareFunction(myName, "map_cache_strategy_tracked_content", "MAP-CACHE-STRATEGY-TRACKED-CONTENT", 2, 0, false);
    declareFunction(myName, "cache_strategy_untrack_all", "CACHE-STRATEGY-UNTRACK-ALL", 2, 0, false);
    declareFunction(myName, "cache_strategy_method_not_implemented_for", "CACHE-STRATEGY-METHOD-NOT-IMPLEMENTED-FOR", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_p", "CACHE-STRATEGY-OBJECT-P", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_reset", "CACHE-STRATEGY-OBJECT-RESET", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_cache_capacity", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_cache_size", "CACHE-STRATEGY-OBJECT-CACHE-SIZE", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_track", "CACHE-STRATEGY-OBJECT-TRACK", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_trackedP", "CACHE-STRATEGY-OBJECT-TRACKED?", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_untrack", "CACHE-STRATEGY-OBJECT-UNTRACK", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_supports_parameter_p", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_get_parameter", "CACHE-STRATEGY-OBJECT-GET-PARAMETER", 3, 0, false);
    declareFunction(myName, "cache_strategy_object_set_parameter", "CACHE-STRATEGY-OBJECT-SET-PARAMETER", 3, 0, false);
    declareFunction(myName, "cache_strategy_object_note_reference", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_note_references_in_order", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
    declareFunction(myName, "default_cache_strategy_object_note_references_in_order", "DEFAULT-CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_get_metrics", "CACHE-STRATEGY-OBJECT-GET-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_reset_metrics", "CACHE-STRATEGY-OBJECT-RESET-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_gather_metrics", "CACHE-STRATEGY-OBJECT-GATHER-METRICS", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_dont_gather_metrics", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_keeps_metrics_p", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P", 1, 0, false);
    declareFunction(myName, "new_cache_strategy_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false);
    declareFunction(myName, "map_cache_strategy_object_tracked_content", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT", 2, 0, false);
    declareFunction(myName, "default_map_cache_strategy_object_tracked_content", "DEFAULT-MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_untrack_all", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL", 2, 0, false);
    declareFunction(myName, "default_cache_strategy_object_untrack_all", "DEFAULT-CACHE-STRATEGY-OBJECT-UNTRACK-ALL", 2, 0, false);
    declareFunction(myName, "cache_metrics_print_function_trampoline", "CACHE-METRICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "cache_metrics_p", "CACHE-METRICS-P", 1, 0, false); new $cache_metrics_p$UnaryFunction();
    declareFunction(myName, "cachemtr_hit_count", "CACHEMTR-HIT-COUNT", 1, 0, false);
    declareFunction(myName, "cachemtr_miss_count", "CACHEMTR-MISS-COUNT", 1, 0, false);
    declareFunction(myName, "_csetf_cachemtr_hit_count", "_CSETF-CACHEMTR-HIT-COUNT", 2, 0, false);
    declareFunction(myName, "_csetf_cachemtr_miss_count", "_CSETF-CACHEMTR-MISS-COUNT", 2, 0, false);
    declareFunction(myName, "make_cache_metrics", "MAKE-CACHE-METRICS", 0, 1, false);
    declareFunction(myName, "print_cache_metrics", "PRINT-CACHE-METRICS", 3, 0, false);
    declareFunction(myName, "new_cache_metrics", "NEW-CACHE-METRICS", 0, 0, false);
    declareFunction(myName, "reset_cache_metrics_counts", "RESET-CACHE-METRICS-COUNTS", 1, 2, false);
    declareFunction(myName, "new_cache_metrics_with_counts", "NEW-CACHE-METRICS-WITH-COUNTS", 2, 0, false);
    declareFunction(myName, "cache_metrics_reset", "CACHE-METRICS-RESET", 1, 0, false);
    declareFunction(myName, "cache_metrics_note_hit", "CACHE-METRICS-NOTE-HIT", 1, 0, false);
    declareFunction(myName, "cache_metrics_note_miss", "CACHE-METRICS-NOTE-MISS", 1, 0, false);
    declareFunction(myName, "cache_metrics_hit_count", "CACHE-METRICS-HIT-COUNT", 1, 0, false);
    declareFunction(myName, "cache_metrics_miss_count", "CACHE-METRICS-MISS-COUNT", 1, 0, false);
    declareFunction(myName, "cache_metrics_hit_rate", "CACHE-METRICS-HIT-RATE", 1, 0, false);
    declareFunction(myName, "cache_metrics_miss_rate", "CACHE-METRICS-MISS-RATE", 1, 0, false);
    declareFunction(myName, "cache_metrics_cache_uses", "CACHE-METRICS-CACHE-USES", 1, 0, false);
    declareFunction(myName, "gather_cache_strategy_information", "GATHER-CACHE-STRATEGY-INFORMATION", 1, 0, false);
    declareFunction(myName, "cfasl_output_object_cache_metrics_method", "CFASL-OUTPUT-OBJECT-CACHE-METRICS-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_wide_output_cache_metrics", "CFASL-WIDE-OUTPUT-CACHE-METRICS", 2, 0, false);
    declareFunction(myName, "cfasl_output_cache_metrics_internal", "CFASL-OUTPUT-CACHE-METRICS-INTERNAL", 2, 0, false);
    declareFunction(myName, "cfasl_input_cache_metrics", "CFASL-INPUT-CACHE-METRICS", 1, 0, false);
    declareFunction(myName, "metered_cache_print_function_trampoline", "METERED-CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "metered_cache_p", "METERED-CACHE-P", 1, 0, false); new $metered_cache_p$UnaryFunction();
    declareFunction(myName, "mcache_cache", "MCACHE-CACHE", 1, 0, false);
    declareFunction(myName, "mcache_metrics", "MCACHE-METRICS", 1, 0, false);
    declareFunction(myName, "_csetf_mcache_cache", "_CSETF-MCACHE-CACHE", 2, 0, false);
    declareFunction(myName, "_csetf_mcache_metrics", "_CSETF-MCACHE-METRICS", 2, 0, false);
    declareFunction(myName, "make_metered_cache", "MAKE-METERED-CACHE", 0, 1, false);
    declareFunction(myName, "new_metered_cache", "NEW-METERED-CACHE", 1, 0, false);
    declareFunction(myName, "new_metered_preallocated_cache", "NEW-METERED-PREALLOCATED-CACHE", 1, 1, false);
    declareFunction(myName, "print_metered_cache", "PRINT-METERED-CACHE", 3, 0, false);
    declareFunction(myName, "cache_strategy_object_p_metered_cache_method", "CACHE-STRATEGY-OBJECT-P-METERED-CACHE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_reset_metered_cache_method", "CACHE-STRATEGY-OBJECT-RESET-METERED-CACHE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_cache_capacity_metered_cache_method", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-METERED-CACHE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_cache_size_metered_cache_method", "CACHE-STRATEGY-OBJECT-CACHE-SIZE-METERED-CACHE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_track_metered_cache_method", "CACHE-STRATEGY-OBJECT-TRACK-METERED-CACHE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_trackedP_metered_cache_method", "CACHE-STRATEGY-OBJECT-TRACKED?-METERED-CACHE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_untrack_metered_cache_method", "CACHE-STRATEGY-OBJECT-UNTRACK-METERED-CACHE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_supports_parameter_p_metered_cache_method", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-METERED-CACHE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_get_parameter_metered_cache_method", "CACHE-STRATEGY-OBJECT-GET-PARAMETER-METERED-CACHE-METHOD", 3, 0, false);
    declareFunction(myName, "cache_strategy_object_set_parameter_metered_cache_method", "CACHE-STRATEGY-OBJECT-SET-PARAMETER-METERED-CACHE-METHOD", 3, 0, false);
    declareFunction(myName, "cache_strategy_object_note_reference_metered_cache_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-METERED-CACHE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_note_references_in_order_metered_cache_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METERED-CACHE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_get_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-GET-METRICS-METERED-CACHE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_reset_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-RESET-METRICS-METERED-CACHE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_gather_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-GATHER-METRICS-METERED-CACHE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_dont_gather_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-METERED-CACHE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_keeps_metrics_p_metered_cache_method", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-METERED-CACHE-METHOD", 1, 0, false);
    declareFunction(myName, "new_cache_strategy_object_tracked_content_iterator_metered_cache_method", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METERED-CACHE-METHOD", 1, 0, false);
    declareFunction(myName, "map_cache_strategy_object_tracked_content_metered_cache_method", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-METERED-CACHE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_untrack_all_metered_cache_method", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL-METERED-CACHE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_reset", "CACHE-STRATEGY-MCACHE-OBJECT-RESET", 1, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_cache_capacity", "CACHE-STRATEGY-MCACHE-OBJECT-CACHE-CAPACITY", 1, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_track", "CACHE-STRATEGY-MCACHE-OBJECT-TRACK", 2, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_cache_size", "CACHE-STRATEGY-MCACHE-OBJECT-CACHE-SIZE", 1, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_trackedP", "CACHE-STRATEGY-MCACHE-OBJECT-TRACKED?", 2, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_untrack", "CACHE-STRATEGY-MCACHE-OBJECT-UNTRACK", 2, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_supports_parameter_p", "CACHE-STRATEGY-MCACHE-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_get_parameter", "CACHE-STRATEGY-MCACHE-OBJECT-GET-PARAMETER", 3, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_set_parameter", "CACHE-STRATEGY-MCACHE-OBJECT-SET-PARAMETER", 3, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_note_reference", "CACHE-STRATEGY-MCACHE-OBJECT-NOTE-REFERENCE", 2, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_note_references_in_order", "CACHE-STRATEGY-MCACHE-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_get_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-GET-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_reset_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-RESET-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_gather_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-GATHER-METRICS", 2, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_dont_gather_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-DONT-GATHER-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_keeps_metrics_p", "CACHE-STRATEGY-MCACHE-OBJECT-KEEPS-METRICS-P", 1, 0, false);
    declareFunction(myName, "new_cache_strategy_mcache_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-MCACHE-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false);
    declareFunction(myName, "map_cache_strategy_mcache_object_tracked_content", "MAP-CACHE-STRATEGY-MCACHE-OBJECT-TRACKED-CONTENT", 2, 0, false);
    declareFunction(myName, "cache_strategy_mcache_object_untrack_all", "CACHE-STRATEGY-MCACHE-OBJECT-UNTRACK-ALL", 2, 0, false);
    declareFunction(myName, "recording_cache_strategy_facade_print_function_trampoline", "RECORDING-CACHE-STRATEGY-FACADE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "recording_cache_strategy_facade_p", "RECORDING-CACHE-STRATEGY-FACADE-P", 1, 0, false); new $recording_cache_strategy_facade_p$UnaryFunction();
    declareFunction(myName, "rec_cachstrat_facade_cache_strategy", "REC-CACHSTRAT-FACADE-CACHE-STRATEGY", 1, 0, false);
    declareFunction(myName, "rec_cachstrat_facade_records", "REC-CACHSTRAT-FACADE-RECORDS", 1, 0, false);
    declareFunction(myName, "rec_cachstrat_facade_timestamper", "REC-CACHSTRAT-FACADE-TIMESTAMPER", 1, 0, false);
    declareFunction(myName, "_csetf_rec_cachstrat_facade_cache_strategy", "_CSETF-REC-CACHSTRAT-FACADE-CACHE-STRATEGY", 2, 0, false);
    declareFunction(myName, "_csetf_rec_cachstrat_facade_records", "_CSETF-REC-CACHSTRAT-FACADE-RECORDS", 2, 0, false);
    declareFunction(myName, "_csetf_rec_cachstrat_facade_timestamper", "_CSETF-REC-CACHSTRAT-FACADE-TIMESTAMPER", 2, 0, false);
    declareFunction(myName, "make_recording_cache_strategy_facade", "MAKE-RECORDING-CACHE-STRATEGY-FACADE", 0, 1, false);
    declareFunction(myName, "new_recording_cache_strategy_facade", "NEW-RECORDING-CACHE-STRATEGY-FACADE", 2, 0, false);
    declareFunction(myName, "recording_cache_strategy_facade_get_records", "RECORDING-CACHE-STRATEGY-FACADE-GET-RECORDS", 1, 0, false);
    declareFunction(myName, "recording_cache_strategy_facade_get_facaded_cache_strategy", "RECORDING-CACHE-STRATEGY-FACADE-GET-FACADED-CACHE-STRATEGY", 1, 0, false);
    declareFunction(myName, "recording_cache_strategy_facade_record_action", "RECORDING-CACHE-STRATEGY-FACADE-RECORD-ACTION", 3, 0, false);
    declareFunction(myName, "print_recording_cache_strategy_facade", "PRINT-RECORDING-CACHE-STRATEGY-FACADE", 3, 0, false);
    declareFunction(myName, "cache_strategy_object_p_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_reset_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-RESET-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_cache_capacity_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_cache_size_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-CACHE-SIZE-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_track_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-TRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_trackedP_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-TRACKED?-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_untrack_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-UNTRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_supports_parameter_p_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_get_parameter_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-GET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 3, 0, false);
    declareFunction(myName, "cache_strategy_object_set_parameter_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-SET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 3, 0, false);
    declareFunction(myName, "cache_strategy_object_note_reference_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_note_references_in_order_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_get_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-GET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_reset_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-RESET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_gather_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_dont_gather_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
    declareFunction(myName, "cache_strategy_object_keeps_metrics_p_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
    declareFunction(myName, "new_cache_strategy_object_tracked_content_iterator_recording_cache_strategy_facade_method", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
    declareFunction(myName, "map_cache_strategy_object_tracked_content_recording_cache_strategy_facade_method", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_object_untrack_all_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_cache_capacity", "CACHE-STRATEGY-REC-CACHE-OBJECT-CACHE-CAPACITY", 1, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_cache_size", "CACHE-STRATEGY-REC-CACHE-OBJECT-CACHE-SIZE", 1, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_dont_gather_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-DONT-GATHER-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_gather_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-GATHER-METRICS", 2, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_get_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-GET-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_get_parameter", "CACHE-STRATEGY-REC-CACHE-OBJECT-GET-PARAMETER", 3, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_keeps_metrics_p", "CACHE-STRATEGY-REC-CACHE-OBJECT-KEEPS-METRICS-P", 1, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_note_reference", "CACHE-STRATEGY-REC-CACHE-OBJECT-NOTE-REFERENCE", 2, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_note_references_in_order", "CACHE-STRATEGY-REC-CACHE-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_reset", "CACHE-STRATEGY-REC-CACHE-OBJECT-RESET", 1, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_reset_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-RESET-METRICS", 1, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_set_parameter", "CACHE-STRATEGY-REC-CACHE-OBJECT-SET-PARAMETER", 3, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_supports_parameter_p", "CACHE-STRATEGY-REC-CACHE-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_track", "CACHE-STRATEGY-REC-CACHE-OBJECT-TRACK", 2, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_trackedP", "CACHE-STRATEGY-REC-CACHE-OBJECT-TRACKED?", 2, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_untrack", "CACHE-STRATEGY-REC-CACHE-OBJECT-UNTRACK", 2, 0, false);
    declareFunction(myName, "cache_strategy_rec_cache_object_untrack_all", "CACHE-STRATEGY-REC-CACHE-OBJECT-UNTRACK-ALL", 2, 0, false);
    declareFunction(myName, "map_cache_strategy_rec_cache_object_tracked_content", "MAP-CACHE-STRATEGY-REC-CACHE-OBJECT-TRACKED-CONTENT", 2, 0, false);
    declareFunction(myName, "new_cache_strategy_rec_cache_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-REC-CACHE-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false);
    declareFunction(myName, "test_mcache_strategy_implementation_conformance", "TEST-MCACHE-STRATEGY-IMPLEMENTATION-CONFORMANCE", 1, 0, false);
    declareFunction(myName, "test_cache_strategy_implementation_conformance", "TEST-CACHE-STRATEGY-IMPLEMENTATION-CONFORMANCE", 1, 0, false);
    declareFunction(myName, "test_two_cache_strategy_implementations", "TEST-TWO-CACHE-STRATEGY-IMPLEMENTATIONS", 3, 0, false);
    declareFunction(myName, "faster_cache_strategy_implementation", "FASTER-CACHE-STRATEGY-IMPLEMENTATION", 3, 1, false);
    declareFunction(myName, "determine_faster_cache_strategy_implementation", "DETERMINE-FASTER-CACHE-STRATEGY-IMPLEMENTATION", 4, 1, false);
    declareFunction(myName, "random_integers_for_testing_caches", "RANDOM-INTEGERS-FOR-TESTING-CACHES", 2, 0, false);
    declareFunction(myName, "cache_to_dictionary", "CACHE-TO-DICTIONARY", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_cache_utilities_file() {
    $cache_strategy_object_p_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-P-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_reset_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-RESET-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_cache_capacity_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_cache_size_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-CACHE-SIZE-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_track_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-TRACK-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_trackedP_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-TRACKED?-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_untrack_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-UNTRACK-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_supports_parameter_p_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_get_parameter_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-GET-PARAMETER-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_set_parameter_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-SET-PARAMETER-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_note_reference_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_note_references_in_order_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_get_metrics_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-GET-METRICS-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_reset_metrics_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-RESET-METRICS-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_gather_metrics_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-GATHER-METRICS-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_dont_gather_metrics_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_keeps_metrics_p_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $new_cache_strategy_object_tracked_content_iterator_method_table$ = deflexical("*NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $map_cache_strategy_object_tracked_content_method_table$ = deflexical("*MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $cache_strategy_object_untrack_all_method_table$ = deflexical("*CACHE-STRATEGY-OBJECT-UNTRACK-ALL-METHOD-TABLE*", Vectors.make_vector($int5$256, NIL));
    $dtp_cache_metrics$ = defconstant("*DTP-CACHE-METRICS*", $sym6$CACHE_METRICS);
    $cfasl_wide_opcode_cache_metrics$ = defconstant("*CFASL-WIDE-OPCODE-CACHE-METRICS*", $int27$129);
    $dtp_metered_cache$ = defconstant("*DTP-METERED-CACHE*", $sym30$METERED_CACHE);
    $dtp_recording_cache_strategy_facade$ = defconstant("*DTP-RECORDING-CACHE-STRATEGY-FACADE*", $sym67$RECORDING_CACHE_STRATEGY_FACADE);
    return NIL;
  }

  public static final SubLObject setup_cache_utilities_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_cache_metrics$.getGlobalValue(), Symbols.symbol_function($sym13$CACHE_METRICS_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym14$CACHEMTR_HIT_COUNT, $sym15$_CSETF_CACHEMTR_HIT_COUNT);
    Structures.def_csetf($sym16$CACHEMTR_MISS_COUNT, $sym17$_CSETF_CACHEMTR_MISS_COUNT);
    Equality.identity($sym6$CACHE_METRICS);
    cfasl.register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_cache_metrics$.getGlobalValue(), $sym28$CFASL_INPUT_CACHE_METRICS);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_cache_metrics$.getGlobalValue(), Symbols.symbol_function($sym29$CFASL_OUTPUT_OBJECT_CACHE_METRICS_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym37$METERED_CACHE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym38$MCACHE_CACHE, $sym39$_CSETF_MCACHE_CACHE);
    Structures.def_csetf($sym40$MCACHE_METRICS, $sym41$_CSETF_MCACHE_METRICS);
    Equality.identity($sym30$METERED_CACHE);
    Structures.register_method($cache_strategy_object_p_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym47$CACHE_STRATEGY_OBJECT_P_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym48$CACHE_STRATEGY_OBJECT_RESET_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym49$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym50$CACHE_STRATEGY_OBJECT_CACHE_SIZE_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym51$CACHE_STRATEGY_OBJECT_TRACK_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym52$CACHE_STRATEGY_OBJECT_TRACKED__METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym53$CACHE_STRATEGY_OBJECT_UNTRACK_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym54$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym55$CACHE_STRATEGY_OBJECT_GET_PARAMETER_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym56$CACHE_STRATEGY_OBJECT_SET_PARAMETER_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym57$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym58$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_METERED_CACHE_METH));
    Structures.register_method($cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym59$CACHE_STRATEGY_OBJECT_GET_METRICS_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym60$CACHE_STRATEGY_OBJECT_RESET_METRICS_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym61$CACHE_STRATEGY_OBJECT_GATHER_METRICS_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym62$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym63$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_METERED_CACHE_METHOD));
    Structures.register_method($new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym64$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_METERED_CACHE_));
    Structures.register_method($map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym65$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_METERED_CACHE_METHOD));
    Structures.register_method($cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), Symbols.symbol_function($sym66$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_METERED_CACHE_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym74$RECORDING_CACHE_STRATEGY_FACADE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym75$REC_CACHSTRAT_FACADE_CACHE_STRATEGY, $sym76$_CSETF_REC_CACHSTRAT_FACADE_CACHE_STRATEGY);
    Structures.def_csetf($sym77$REC_CACHSTRAT_FACADE_RECORDS, $sym78$_CSETF_REC_CACHSTRAT_FACADE_RECORDS);
    Structures.def_csetf($sym79$REC_CACHSTRAT_FACADE_TIMESTAMPER, $sym80$_CSETF_REC_CACHSTRAT_FACADE_TIMESTAMPER);
    Equality.identity($sym67$RECORDING_CACHE_STRATEGY_FACADE);
    Structures.register_method($cache_strategy_object_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym86$CACHE_STRATEGY_OBJECT_P_RECORDING_CACHE_STRATEGY_FACADE_METHOD));
    Structures.register_method($cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym87$CACHE_STRATEGY_OBJECT_RESET_RECORDING_CACHE_STRATEGY_FACADE_METHO));
    Structures.register_method($cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym88$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_RECORDING_CACHE_STRATEGY_FAC));
    Structures.register_method($cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym89$CACHE_STRATEGY_OBJECT_CACHE_SIZE_RECORDING_CACHE_STRATEGY_FACADE_));
    Structures.register_method($cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym90$CACHE_STRATEGY_OBJECT_TRACK_RECORDING_CACHE_STRATEGY_FACADE_METHO));
    Structures.register_method($cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym91$CACHE_STRATEGY_OBJECT_TRACKED__RECORDING_CACHE_STRATEGY_FACADE_ME));
    Structures.register_method($cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym92$CACHE_STRATEGY_OBJECT_UNTRACK_RECORDING_CACHE_STRATEGY_FACADE_MET));
    Structures.register_method($cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym93$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_RECORDING_CACHE_STRATE));
    Structures.register_method($cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym94$CACHE_STRATEGY_OBJECT_GET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA));
    Structures.register_method($cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym95$CACHE_STRATEGY_OBJECT_SET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA));
    Structures.register_method($cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym96$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_RECORDING_CACHE_STRATEGY_FAC));
    Structures.register_method($cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym97$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_RECORDING_CACHE_ST));
    Structures.register_method($cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym98$CACHE_STRATEGY_OBJECT_GET_METRICS_RECORDING_CACHE_STRATEGY_FACADE));
    Structures.register_method($cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym99$CACHE_STRATEGY_OBJECT_RESET_METRICS_RECORDING_CACHE_STRATEGY_FACA));
    Structures.register_method($cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym100$CACHE_STRATEGY_OBJECT_GATHER_METRICS_RECORDING_CACHE_STRATEGY_FAC));
    Structures.register_method($cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym101$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_RECORDING_CACHE_STRATEG));
    Structures.register_method($cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym102$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_RECORDING_CACHE_STRATEGY_FA));
    Structures.register_method($new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym103$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_RECORDING_CACH));
    Structures.register_method($map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym104$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_RECORDING_CACHE_STRATEG));
    Structures.register_method($cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), Symbols.symbol_function($sym105$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_RECORDING_CACHE_STRATEGY_FACADE));
    generic_testing.define_test_case_table_int($sym109$TEST_MCACHE_STRATEGY_IMPLEMENTATION_CONFORMANCE, list(new SubLObject[] {$kw110$TEST, NIL, $kw111$OWNER, NIL, $kw112$CLASSES, NIL, $kw113$KB, $kw114$TINY, $kw115$WORKING_, T}), $list116);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CACHE_STRATEGY_P = makeSymbol("CACHE-STRATEGY-P");
  public static final SubLSymbol $sym1$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $kw2$UNSUPPORTED = makeKeyword("UNSUPPORTED");
  public static final SubLSymbol $sym3$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLString $str4$Not_implemented_for__A_ = makeString("Not implemented for ~A.");
  public static final SubLInteger $int5$256 = makeInteger(256);
  public static final SubLSymbol $sym6$CACHE_METRICS = makeSymbol("CACHE-METRICS");
  public static final SubLSymbol $sym7$CACHE_METRICS_P = makeSymbol("CACHE-METRICS-P");
  public static final SubLList $list8 = list(makeSymbol("HIT-COUNT"), makeSymbol("MISS-COUNT"));
  public static final SubLList $list9 = list(makeKeyword("HIT-COUNT"), makeKeyword("MISS-COUNT"));
  public static final SubLList $list10 = list(makeSymbol("CACHEMTR-HIT-COUNT"), makeSymbol("CACHEMTR-MISS-COUNT"));
  public static final SubLList $list11 = list(makeSymbol("_CSETF-CACHEMTR-HIT-COUNT"), makeSymbol("_CSETF-CACHEMTR-MISS-COUNT"));
  public static final SubLSymbol $sym12$PRINT_CACHE_METRICS = makeSymbol("PRINT-CACHE-METRICS");
  public static final SubLSymbol $sym13$CACHE_METRICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CACHE-METRICS-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym14$CACHEMTR_HIT_COUNT = makeSymbol("CACHEMTR-HIT-COUNT");
  public static final SubLSymbol $sym15$_CSETF_CACHEMTR_HIT_COUNT = makeSymbol("_CSETF-CACHEMTR-HIT-COUNT");
  public static final SubLSymbol $sym16$CACHEMTR_MISS_COUNT = makeSymbol("CACHEMTR-MISS-COUNT");
  public static final SubLSymbol $sym17$_CSETF_CACHEMTR_MISS_COUNT = makeSymbol("_CSETF-CACHEMTR-MISS-COUNT");
  public static final SubLSymbol $kw18$HIT_COUNT = makeKeyword("HIT-COUNT");
  public static final SubLSymbol $kw19$MISS_COUNT = makeKeyword("MISS-COUNT");
  public static final SubLString $str20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str21$__ = makeString("#<");
  public static final SubLSymbol $kw22$STREAM = makeKeyword("STREAM");
  public static final SubLString $str23$Hits__ = makeString("Hits: ");
  public static final SubLString $str24$_Misses__ = makeString(" Misses: ");
  public static final SubLSymbol $kw25$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym26$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLInteger $int27$129 = makeInteger(129);
  public static final SubLSymbol $sym28$CFASL_INPUT_CACHE_METRICS = makeSymbol("CFASL-INPUT-CACHE-METRICS");
  public static final SubLSymbol $sym29$CFASL_OUTPUT_OBJECT_CACHE_METRICS_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CACHE-METRICS-METHOD");
  public static final SubLSymbol $sym30$METERED_CACHE = makeSymbol("METERED-CACHE");
  public static final SubLSymbol $sym31$METERED_CACHE_P = makeSymbol("METERED-CACHE-P");
  public static final SubLList $list32 = list(makeSymbol("CACHE"), makeSymbol("METRICS"));
  public static final SubLList $list33 = list(makeKeyword("CACHE"), makeKeyword("METRICS"));
  public static final SubLList $list34 = list(makeSymbol("MCACHE-CACHE"), makeSymbol("MCACHE-METRICS"));
  public static final SubLList $list35 = list(makeSymbol("_CSETF-MCACHE-CACHE"), makeSymbol("_CSETF-MCACHE-METRICS"));
  public static final SubLSymbol $sym36$PRINT_METERED_CACHE = makeSymbol("PRINT-METERED-CACHE");
  public static final SubLSymbol $sym37$METERED_CACHE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("METERED-CACHE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym38$MCACHE_CACHE = makeSymbol("MCACHE-CACHE");
  public static final SubLSymbol $sym39$_CSETF_MCACHE_CACHE = makeSymbol("_CSETF-MCACHE-CACHE");
  public static final SubLSymbol $sym40$MCACHE_METRICS = makeSymbol("MCACHE-METRICS");
  public static final SubLSymbol $sym41$_CSETF_MCACHE_METRICS = makeSymbol("_CSETF-MCACHE-METRICS");
  public static final SubLSymbol $kw42$CACHE = makeKeyword("CACHE");
  public static final SubLSymbol $kw43$METRICS = makeKeyword("METRICS");
  public static final SubLString $str44$Cache__ = makeString("Cache: ");
  public static final SubLString $str45$_ = makeString(" ");
  public static final SubLString $str46$_no_metrics_ = makeString("(no metrics)");
  public static final SubLSymbol $sym47$CACHE_STRATEGY_OBJECT_P_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-P-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym48$CACHE_STRATEGY_OBJECT_RESET_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym49$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym50$CACHE_STRATEGY_OBJECT_CACHE_SIZE_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-SIZE-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym51$CACHE_STRATEGY_OBJECT_TRACK_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-TRACK-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym52$CACHE_STRATEGY_OBJECT_TRACKED__METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-TRACKED?-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym53$CACHE_STRATEGY_OBJECT_UNTRACK_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym54$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym55$CACHE_STRATEGY_OBJECT_GET_PARAMETER_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-GET-PARAMETER-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym56$CACHE_STRATEGY_OBJECT_SET_PARAMETER_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-SET-PARAMETER-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym57$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym58$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_METERED_CACHE_METH = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym59$CACHE_STRATEGY_OBJECT_GET_METRICS_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-GET-METRICS-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym60$CACHE_STRATEGY_OBJECT_RESET_METRICS_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-METRICS-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym61$CACHE_STRATEGY_OBJECT_GATHER_METRICS_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-GATHER-METRICS-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym62$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym63$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym64$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_METERED_CACHE_ = makeSymbol("NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym65$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_METERED_CACHE_METHOD = makeSymbol("MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym66$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-ALL-METERED-CACHE-METHOD");
  public static final SubLSymbol $sym67$RECORDING_CACHE_STRATEGY_FACADE = makeSymbol("RECORDING-CACHE-STRATEGY-FACADE");
  public static final SubLSymbol $sym68$RECORDING_CACHE_STRATEGY_FACADE_P = makeSymbol("RECORDING-CACHE-STRATEGY-FACADE-P");
  public static final SubLList $list69 = list(makeSymbol("CACHE-STRATEGY"), makeSymbol("RECORDS"), makeSymbol("TIMESTAMPER"));
  public static final SubLList $list70 = list(makeKeyword("CACHE-STRATEGY"), makeKeyword("RECORDS"), makeKeyword("TIMESTAMPER"));
  public static final SubLList $list71 = list(makeSymbol("REC-CACHSTRAT-FACADE-CACHE-STRATEGY"), makeSymbol("REC-CACHSTRAT-FACADE-RECORDS"), makeSymbol("REC-CACHSTRAT-FACADE-TIMESTAMPER"));
  public static final SubLList $list72 = list(makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-CACHE-STRATEGY"), makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-RECORDS"), makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-TIMESTAMPER"));
  public static final SubLSymbol $sym73$PRINT_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol("PRINT-RECORDING-CACHE-STRATEGY-FACADE");
  public static final SubLSymbol $sym74$RECORDING_CACHE_STRATEGY_FACADE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RECORDING-CACHE-STRATEGY-FACADE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym75$REC_CACHSTRAT_FACADE_CACHE_STRATEGY = makeSymbol("REC-CACHSTRAT-FACADE-CACHE-STRATEGY");
  public static final SubLSymbol $sym76$_CSETF_REC_CACHSTRAT_FACADE_CACHE_STRATEGY = makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-CACHE-STRATEGY");
  public static final SubLSymbol $sym77$REC_CACHSTRAT_FACADE_RECORDS = makeSymbol("REC-CACHSTRAT-FACADE-RECORDS");
  public static final SubLSymbol $sym78$_CSETF_REC_CACHSTRAT_FACADE_RECORDS = makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-RECORDS");
  public static final SubLSymbol $sym79$REC_CACHSTRAT_FACADE_TIMESTAMPER = makeSymbol("REC-CACHSTRAT-FACADE-TIMESTAMPER");
  public static final SubLSymbol $sym80$_CSETF_REC_CACHSTRAT_FACADE_TIMESTAMPER = makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-TIMESTAMPER");
  public static final SubLSymbol $kw81$CACHE_STRATEGY = makeKeyword("CACHE-STRATEGY");
  public static final SubLSymbol $kw82$RECORDS = makeKeyword("RECORDS");
  public static final SubLSymbol $kw83$TIMESTAMPER = makeKeyword("TIMESTAMPER");
  public static final SubLSymbol $sym84$INTEGER_SEQUENCE_GENERATOR_P = makeSymbol("INTEGER-SEQUENCE-GENERATOR-P");
  public static final SubLString $str85$_wrapped__ = makeString(" wrapped: ");
  public static final SubLSymbol $sym86$CACHE_STRATEGY_OBJECT_P_RECORDING_CACHE_STRATEGY_FACADE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym87$CACHE_STRATEGY_OBJECT_RESET_RECORDING_CACHE_STRATEGY_FACADE_METHO = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym88$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_RECORDING_CACHE_STRATEGY_FAC = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym89$CACHE_STRATEGY_OBJECT_CACHE_SIZE_RECORDING_CACHE_STRATEGY_FACADE_ = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-SIZE-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym90$CACHE_STRATEGY_OBJECT_TRACK_RECORDING_CACHE_STRATEGY_FACADE_METHO = makeSymbol("CACHE-STRATEGY-OBJECT-TRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym91$CACHE_STRATEGY_OBJECT_TRACKED__RECORDING_CACHE_STRATEGY_FACADE_ME = makeSymbol("CACHE-STRATEGY-OBJECT-TRACKED?-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym92$CACHE_STRATEGY_OBJECT_UNTRACK_RECORDING_CACHE_STRATEGY_FACADE_MET = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym93$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_RECORDING_CACHE_STRATE = makeSymbol("CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym94$CACHE_STRATEGY_OBJECT_GET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA = makeSymbol("CACHE-STRATEGY-OBJECT-GET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym95$CACHE_STRATEGY_OBJECT_SET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA = makeSymbol("CACHE-STRATEGY-OBJECT-SET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym96$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_RECORDING_CACHE_STRATEGY_FAC = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym97$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_RECORDING_CACHE_ST = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym98$CACHE_STRATEGY_OBJECT_GET_METRICS_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol("CACHE-STRATEGY-OBJECT-GET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym99$CACHE_STRATEGY_OBJECT_RESET_METRICS_RECORDING_CACHE_STRATEGY_FACA = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym100$CACHE_STRATEGY_OBJECT_GATHER_METRICS_RECORDING_CACHE_STRATEGY_FAC = makeSymbol("CACHE-STRATEGY-OBJECT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym101$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_RECORDING_CACHE_STRATEG = makeSymbol("CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym102$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_RECORDING_CACHE_STRATEGY_FA = makeSymbol("CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym103$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_RECORDING_CACH = makeSymbol("NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym104$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_RECORDING_CACHE_STRATEG = makeSymbol("MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $sym105$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-ALL-RECORDING-CACHE-STRATEGY-FACADE-METHOD");
  public static final SubLSymbol $kw106$NOTE_REF = makeKeyword("NOTE-REF");
  public static final SubLSymbol $kw107$TRACK = makeKeyword("TRACK");
  public static final SubLSymbol $kw108$UNTRACK = makeKeyword("UNTRACK");
  public static final SubLSymbol $sym109$TEST_MCACHE_STRATEGY_IMPLEMENTATION_CONFORMANCE = makeSymbol("TEST-MCACHE-STRATEGY-IMPLEMENTATION-CONFORMANCE");
  public static final SubLSymbol $kw110$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw111$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw112$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw113$KB = makeKeyword("KB");
  public static final SubLSymbol $kw114$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw115$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list116 = list(list(list(TEN_INTEGER), makeKeyword("SUCCESS")), list(list(TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(50)), makeKeyword("SUCCESS")));
  public static final SubLString $str117$Cannot_properly_validate_dirty_ca = makeString("Cannot properly validate dirty cache strategy ~A.");
  public static final SubLString $str118$Strategy__A_is_tracking_item__A_b = makeString("Strategy ~A is tracking item ~A before it is added.");
  public static final SubLString $str119$Strategy__A_is_suggesting_to_remo = makeString("Strategy ~A is suggesting to remove item ~A before the cache is full.");
  public static final SubLString $str120$Strategy__A_is_not_tracking_item_ = makeString("Strategy ~A is not tracking item ~A that was just added.");
  public static final SubLString $str121$After_adding__A_items_to_an_empty = makeString("After adding ~A items to an empty cache, the cache contains ~A items.");
  public static final SubLString $str122$The_strategy__A_does_not_implemen = makeString("The strategy ~A does not implement FULL-P correctly.");
  public static final SubLString $str123$Strategy__A_is_tracking_item__A_t = makeString("Strategy ~A is tracking item ~A though it is no longer present.");
  public static final SubLString $str124$After_removing__A_items_from_a_fu = makeString("After removing ~A items from a full cache, the cache still contains ~A items.");
  public static final SubLString $str125$The_strategy__A_is_not_implementi = makeString("The strategy ~A is not implementing EMPTY-P correctly.");
  public static final SubLSymbol $kw126$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLString $str127$The_two_strategies_disagree_on_th = makeString("The two strategies disagree on the result of adding item #~A (~A).~%~A gives ~A, ~A gives ~A.");
  public static final SubLSymbol $sym128$CACHE_P = makeSymbol("CACHE-P");
  public static final SubLSymbol $kw129$NEWEST = makeKeyword("NEWEST");

  //// Initializers

  public void declareFunctions() {
    declare_cache_utilities_file();
  }

  public void initializeVariables() {
    init_cache_utilities_file();
  }

  public void runTopLevelForms() {
    setup_cache_utilities_file();
  }

}
