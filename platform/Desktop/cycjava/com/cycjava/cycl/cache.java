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
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.subl_promotions;

public  final class cache extends SubLTranslatedFile {

  //// Constructor

  private cache() {}
  public static final SubLFile me = new cache();
  public static final String myName = "com.cyc.cycjava.cycl.cache";

  //// Definitions

  public static final class $cache_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $capacity; }
    public SubLObject getField3() { return $map; }
    public SubLObject getField4() { return $head_entry; }
    public SubLObject setField2(SubLObject value) { return $capacity = value; }
    public SubLObject setField3(SubLObject value) { return $map = value; }
    public SubLObject setField4(SubLObject value) { return $head_entry = value; }
    public SubLObject $capacity = NIL;
    public SubLObject $map = NIL;
    public SubLObject $head_entry = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($cache_native.class, $sym0$CACHE, $sym1$CACHE_P, $list2, $list3, new String[] {"$capacity", "$map", "$head_entry"}, $list4, $list5, $sym6$CACHE_PRINT);
  }

  @SubL(source = "cycl/cache.lisp", position = 3642) 
  public static SubLSymbol $dtp_cache$ = null;

  @SubL(source = "cycl/cache.lisp", position = 3642) 
  public static final SubLObject cache_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31602");
    return NIL;
  }

  @SubL(source = "cycl/cache.lisp", position = 3642) 
  public static final SubLObject cache_p(SubLObject object) {
    return ((object.getClass() == $cache_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $cache_p$UnaryFunction extends UnaryFunction {
    public $cache_p$UnaryFunction() { super(extractFunctionNamed("CACHE-P")); }
    public SubLObject processItem(SubLObject arg1) { return cache_p(arg1); }
  }

  @SubL(source = "cycl/cache.lisp", position = 3642) 
  public static final SubLObject cache_capacity(SubLObject object) {
    checkType(object, $sym1$CACHE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/cache.lisp", position = 3642) 
  public static final SubLObject cache_map(SubLObject object) {
    checkType(object, $sym1$CACHE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/cache.lisp", position = 3642) 
  public static final SubLObject cache_head_entry(SubLObject object) {
    checkType(object, $sym1$CACHE_P);
    return object.getField4();
  }


  /** Checks whether the key is currently associated with an entry in the
   cache. Other than GET, this does not change the ordering of the entries
   in the cache.
   @param CACHE cache-p; the cache within which to check for an association
   @param KEY object; the key to be checked for association
   @return T if the key has an association, NIL othewise */
  @SubL(source = "cycl/cache.lisp", position = 8735) 
  public static final SubLObject cache_contains_key_p(SubLObject v_cache, SubLObject key) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject value = Hashtables.gethash(key, cache_map(v_cache), UNPROVIDED);
        SubLObject found_p = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return found_p;
      }
    }
  }


 
  
  @SubL(source = "cycl/cache.lisp", position = 3642) 
  public static final SubLObject _csetf_cache_capacity(SubLObject object, SubLObject value) {
    checkType(object, $sym1$CACHE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/cache.lisp", position = 3642) 
  public static final SubLObject _csetf_cache_map(SubLObject object, SubLObject value) {
    checkType(object, $sym1$CACHE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/cache.lisp", position = 3642) 
  public static final SubLObject _csetf_cache_head_entry(SubLObject object, SubLObject value) {
    checkType(object, $sym1$CACHE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/cache.lisp", position = 3642) 
  public static final SubLObject make_cache(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $cache_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw14$CAPACITY)) {
            _csetf_cache_capacity(v_new, current_value);
          } else if (pcase_var.eql($kw15$MAP)) {
            _csetf_cache_map(v_new, current_value);
          } else if (pcase_var.eql($kw16$HEAD_ENTRY)) {
            _csetf_cache_head_entry(v_new, current_value);
          } else {
            Errors.error($str17$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  public static final class $cache_entry_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $newer; }
    public SubLObject getField3() { return $key; }
    public SubLObject getField4() { return $value; }
    public SubLObject getField5() { return $older; }
    public SubLObject setField2(SubLObject value) { return $newer = value; }
    public SubLObject setField3(SubLObject value) { return $key = value; }
    public SubLObject setField4(SubLObject value) { return $value = value; }
    public SubLObject setField5(SubLObject value) { return $older = value; }
    public SubLObject $newer = NIL;
    public SubLObject $key = NIL;
    public SubLObject $value = NIL;
    public SubLObject $older = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($cache_entry_native.class, $sym18$CACHE_ENTRY, $sym19$CACHE_ENTRY_P, $list20, $list21, new String[] {"$newer", "$key", "$value", "$older"}, $list22, $list23, $sym24$CACHE_ENTRY_PRINT);
  }

  @SubL(source = "cycl/cache.lisp", position = 4055) 
  public static SubLSymbol $dtp_cache_entry$ = null;

  @SubL(source = "cycl/cache.lisp", position = 4055) 
  public static final SubLObject cache_entry_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31598");
    return NIL;
  }

  @SubL(source = "cycl/cache.lisp", position = 4055) 
  public static final SubLObject cache_entry_p(SubLObject object) {
    return ((object.getClass() == $cache_entry_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $cache_entry_p$UnaryFunction extends UnaryFunction {
    public $cache_entry_p$UnaryFunction() { super(extractFunctionNamed("CACHE-ENTRY-P")); }
    public SubLObject processItem(SubLObject arg1) { return cache_entry_p(arg1); }
  }

  @SubL(source = "cycl/cache.lisp", position = 4055) 
  public static final SubLObject cache_entry_newer(SubLObject object) {
    checkType(object, $sym19$CACHE_ENTRY_P);
    return object.getField2();
  }

  @SubL(source = "cycl/cache.lisp", position = 4055) 
  public static final SubLObject cache_entry_key(SubLObject object) {
    checkType(object, $sym19$CACHE_ENTRY_P);
    return object.getField3();
  }

  @SubL(source = "cycl/cache.lisp", position = 4055) 
  public static final SubLObject cache_entry_value(SubLObject object) {
    checkType(object, $sym19$CACHE_ENTRY_P);
    return object.getField4();
  }

  @SubL(source = "cycl/cache.lisp", position = 4055) 
  public static final SubLObject cache_entry_older(SubLObject object) {
    checkType(object, $sym19$CACHE_ENTRY_P);
    return object.getField5();
  }

  @SubL(source = "cycl/cache.lisp", position = 4055) 
  public static final SubLObject _csetf_cache_entry_newer(SubLObject object, SubLObject value) {
    checkType(object, $sym19$CACHE_ENTRY_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/cache.lisp", position = 4055) 
  public static final SubLObject _csetf_cache_entry_key(SubLObject object, SubLObject value) {
    checkType(object, $sym19$CACHE_ENTRY_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/cache.lisp", position = 4055) 
  public static final SubLObject _csetf_cache_entry_value(SubLObject object, SubLObject value) {
    checkType(object, $sym19$CACHE_ENTRY_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/cache.lisp", position = 4055) 
  public static final SubLObject _csetf_cache_entry_older(SubLObject object, SubLObject value) {
    checkType(object, $sym19$CACHE_ENTRY_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/cache.lisp", position = 4055) 
  public static final SubLObject make_cache_entry(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $cache_entry_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw34$NEWER)) {
            _csetf_cache_entry_newer(v_new, current_value);
          } else if (pcase_var.eql($kw35$KEY)) {
            _csetf_cache_entry_key(v_new, current_value);
          } else if (pcase_var.eql($kw36$VALUE)) {
            _csetf_cache_entry_value(v_new, current_value);
          } else if (pcase_var.eql($kw37$OLDER)) {
            _csetf_cache_entry_older(v_new, current_value);
          } else {
            Errors.error($str17$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Whether to print the elements of a cache in the print method */
  @SubL(source = "cycl/cache.lisp", position = 4305) 
  public static SubLSymbol $print_cache_elementsP$ = null;

  /** When T, preallocate all of the cache entries and resource them */
  @SubL(source = "cycl/cache.lisp", position = 5355) 
  private static SubLSymbol $cache_entries_preallocateP$ = null;

  /** Creates a new cache with the specified capacity and test function
   @param CAPACITY positive-integer-p; the maximal number of entries CACHE 
   can hold
   @param TEST functionp; the equality test function of CACHE
   @return cache; the newly created cache */
  @SubL(source = "cycl/cache.lisp", position = 5480) 
  public static final SubLObject new_cache(SubLObject capacity, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = EQL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(capacity, $sym45$POSITIVE_INTEGER_P);
      checkType(test, $sym46$VALID_HASH_TEST_P);
      {
        SubLObject v_cache = make_cache(UNPROVIDED);
        SubLObject head_entry = make_cache_entry(UNPROVIDED);
        _csetf_cache_capacity(v_cache, capacity);
        _csetf_cache_map(v_cache, Hashtables.make_hash_table(capacity, test, UNPROVIDED));
        _csetf_cache_entry_newer(head_entry, head_entry);
        _csetf_cache_entry_older(head_entry, head_entry);
        _csetf_cache_head_entry(v_cache, head_entry);
        if ((NIL != $cache_entries_preallocateP$.getDynamicValue(thread))) {
          set_cache_free_list(v_cache, $kw47$RESOURCED);
          {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(capacity); i = Numbers.add(i, ONE_INTEGER)) {
              resource_cache_entry(v_cache, make_cache_entry(UNPROVIDED));
            }
          }
        }
        return v_cache;
      }
    }
  }

  /** Creates a new cache under preallocation strategy
   @param CAPACITY positive-integer-p; the maximal number of entries CACHE 
   can hold
   @param TEST functionp; the equality test function of CACHE
   @return cache; the newly created cache */
  @SubL(source = "cycl/cache.lisp", position = 6420) 
  public static final SubLObject new_preallocated_cache(SubLObject capacity, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = EQL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_cache = NIL;
        {
          SubLObject _prev_bind_0 = $cache_entries_preallocateP$.currentBinding(thread);
          try {
            $cache_entries_preallocateP$.bind(T, thread);
            v_cache = new_cache(capacity, test);
          } finally {
            $cache_entries_preallocateP$.rebind(_prev_bind_0, thread);
          }
        }
        return v_cache;
      }
    }
  }

  /** Returns true if CACHE is full, nil otherwise
  @param CACHE cache-p; the cache whose fullness is to be determined
  @return boolean; true if CACHE is full, nil otherwise */
  @SubL(source = "cycl/cache.lisp", position = 6864) 
  public static final SubLObject cache_full_p(SubLObject v_cache) {
    checkType(v_cache, $sym1$CACHE_P);
    return Numbers.numGE(cache_size(v_cache), cache_capacity(v_cache));
  }

  /** Returns true if CACHE is empty, nil otherwise
  @param CACHE cache-p; the cache whose emptyness is to be determined
  @return boolean; true if CACHE is empty, nil otherwise */
  @SubL(source = "cycl/cache.lisp", position = 7161) 
  public static final SubLObject cache_empty_p(SubLObject v_cache) {
    checkType(v_cache, $sym1$CACHE_P);
    return Equality.eq(cache_newest(v_cache), cache_head_entry(v_cache));
  }

  /** Returns the entry associated with KEY in CACHE
   @param CACHE cache-p; the cache from which to retrieve the value for KEY
   @param KEY object; the key for which to retrive a value from CACHE
   @return objects; (i) the value associated with KEY in CACHE (ii) a 
   boolean value indicating whether there was an entry for KEY in CACHE */
  @SubL(source = "cycl/cache.lisp", position = 7465) 
  public static final SubLObject cache_get(SubLObject v_cache, SubLObject key) {
    checkType(v_cache, $sym1$CACHE_P);
    return cache_get_int(v_cache, key, NIL, T);
  }

  /** Returns the entry associated with KEY in CACHE
   @param CACHE cache-p; the cache from which to retrieve the value for KEY
   @param KEY object; the key for which to retrive a value from CACHE
   @return the value associated with KEY in CACHE,
   or DEFAULT if there was no such entry for KEY in CACHE */
  @SubL(source = "cycl/cache.lisp", position = 7914) 
  public static final SubLObject cache_get_without_values(SubLObject v_cache, SubLObject key, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    checkType(v_cache, $sym1$CACHE_P);
    return cache_get_int(v_cache, key, v_default, NIL);
  }

  @SubL(source = "cycl/cache.lisp", position = 8367) 
  public static final SubLObject cache_get_int(SubLObject v_cache, SubLObject key, SubLObject v_default, SubLObject return_entry_p) {
    {
      SubLObject entry = Hashtables.gethash_without_values(key, cache_map(v_cache), UNPROVIDED);
      if ((NIL == entry)) {
        if ((NIL != return_entry_p)) {
          return Values.values(NIL, NIL);
        } else {
          return v_default;
        }
      }
      cache_queue_requeue(v_cache, entry);
      if ((NIL != return_entry_p)) {
        return Values.values(cache_entry_value(entry), T);
      } else {
        return cache_entry_value(entry);
      }
    }
  }

  /** Associates KEY with VALUE in CACHE
  @param CACHE cache-p; the cache within which to associate KEY with VALUE
  @param KEY object; the key to be associated with VALUE
  @param VALUE object; the value to associate with KEY
  @return objects; (i) the value previously associated with KEY in CACHE (ii) a
  boolean value indicating whether there was an entry previously associated with
  KEY in CACHE */
  @SubL(source = "cycl/cache.lisp", position = 9253) 
  public static final SubLObject cache_set(SubLObject v_cache, SubLObject key, SubLObject value) {
    checkType(v_cache, $sym1$CACHE_P);
    return cache_set_int(v_cache, key, value, T);
  }

  /** Associates KEY with VALUE in CACHE
  @param CACHE cache-p; the cache within which to associate KEY with VALUE
  @param KEY object; the key to be associated with VALUE
  @param VALUE object; the value to associate with KEY
  @return the value previously associated with KEY in CACHE */
  @SubL(source = "cycl/cache.lisp", position = 9774) 
  public static final SubLObject cache_set_without_values(SubLObject v_cache, SubLObject key, SubLObject value) {
    checkType(v_cache, $sym1$CACHE_P);
    return cache_set_int(v_cache, key, value, NIL);
  }

  /** Associates KEY with VALUE in CACHE
  @param CACHE cache-p; the cache within which to associate KEY with VALUE
  @param KEY object; the key to be associated with VALUE
  @param VALUE object; the value to associate with KEY
  @return 0 the key that was dropped from the cache, else NIL
  @return 1 the values that was dropped from the cache, else NIL
  @return 2 booleanp ; non-nil iff a key/value association was dropped from the cache. */
  @SubL(source = "cycl/cache.lisp", position = 10193) 
  public static final SubLObject cache_set_return_dropped(SubLObject v_cache, SubLObject key, SubLObject value) {
    {
      SubLObject oldest_key = NIL;
      SubLObject oldest_value = NIL;
      SubLObject dropped = NIL;
      if (((NIL != cache_full_p(v_cache))
           && ($kw48$UNKNOWN == cache_get_without_values(v_cache, key, $kw48$UNKNOWN)))) {
        oldest_key = cache_entry_key(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31599"));
        oldest_value = cache_get_without_values(v_cache, oldest_key, UNPROVIDED);
        dropped = T;
        cache_remove(v_cache, oldest_key);
      }
      cache_set_without_values(v_cache, key, value);
      return Values.values(oldest_key, oldest_value, dropped);
    }
  }

  @SubL(source = "cycl/cache.lisp", position = 11195) 
  public static final SubLObject cache_set_int(SubLObject v_cache, SubLObject key, SubLObject value, SubLObject return_old_entry) {
    {
      SubLObject old_entry = Hashtables.gethash_without_values(key, cache_map(v_cache), UNPROVIDED);
      SubLObject previous = NIL;
      if ((NIL != old_entry)) {
        previous = cache_entry_value(old_entry);
        _csetf_cache_entry_value(old_entry, value);
        cache_queue_requeue(v_cache, old_entry);
      } else {
        {
          SubLObject entry = NIL;
          if ((NIL != cache_full_p(v_cache))) {
            entry = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31600");
            Hashtables.remhash(cache_entry_key(entry), cache_map(v_cache));
            cache_queue_unlink(entry);
          } else {
            entry = get_new_cache_entry(v_cache);
          }
          _csetf_cache_entry_key(entry, key);
          _csetf_cache_entry_value(entry, value);
          Hashtables.sethash(key, cache_map(v_cache), entry);
          cache_queue_enqueue(v_cache, entry);
        }
      }
      if ((NIL != return_old_entry)) {
        return Values.values(previous, list_utilities.sublisp_boolean(old_entry));
      } else {
        return previous;
      }
    }
  }

  /** Removes the mapping for KEY from CACHE
  @param CACHE cache-p; the cache from which to remove the entry for KEY
  @param KEY object; the KEY to be removed from CACHE
  @return cache; (i) the value previously associated with KEY in CACHE (ii) a boolean value 
  indicating whether a value was previously associated with KEY in CACHE */
  @SubL(source = "cycl/cache.lisp", position = 12285) 
  public static final SubLObject cache_remove(SubLObject v_cache, SubLObject key) {
    checkType(v_cache, $sym1$CACHE_P);
    {
      SubLObject entry = Hashtables.gethash_without_values(key, cache_map(v_cache), UNPROVIDED);
      SubLObject value = NIL;
      if ((NIL != entry)) {
        cache_queue_remove(v_cache, entry);
        Hashtables.remhash(key, cache_map(v_cache));
        value = cache_entry_value(entry);
      }
      return Values.values(value, list_utilities.sublisp_boolean(entry));
    }
  }

  /** Removes all entries from CACHE, either individually (if precached)
   or agressively
  @param CACHE cache-p; the cache from which to remove all entries
  @return CACHE; a destructively modified version of CACHE without any entries */
  @SubL(source = "cycl/cache.lisp", position = 12948) 
  public static final SubLObject cache_clear(SubLObject v_cache) {
    checkType(v_cache, $sym1$CACHE_P);
    if ((NIL != is_cache_preallocated_p(v_cache))) {
      while ((NIL == cache_empty_p(v_cache))) {
        {
          SubLObject oldest = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31601");
          cache_remove(v_cache, cache_entry_key(oldest));
        }
      }
    } else {
      {
        SubLObject head_entry = cache_head_entry(v_cache);
        _csetf_cache_entry_newer(head_entry, head_entry);
        _csetf_cache_entry_older(head_entry, head_entry);
        Hashtables.clrhash(cache_map(v_cache));
      }
    }
    return v_cache;
  }

  /** Returns the number of entries in CACHE
   @param CACHE cache-p; the cache whose size is to be computed
   @return integer; the number entries in CACHE */
  @SubL(source = "cycl/cache.lisp", position = 13931) 
  public static final SubLObject cache_size(SubLObject v_cache) {
    checkType(v_cache, $sym1$CACHE_P);
    return Hashtables.hash_table_count(cache_map(v_cache));
  }

  @SubL(source = "cycl/cache.lisp", position = 15333) 
  public static final SubLObject do_cache_first(SubLObject v_cache, SubLObject order) {
    checkType(v_cache, $sym1$CACHE_P);
    return do_cache_next(cache_head_entry(v_cache), order);
  }

  @SubL(source = "cycl/cache.lisp", position = 15508) 
  public static final SubLObject do_cache_doneP(SubLObject v_cache, SubLObject entry) {
    return Equality.eq(entry, cache_head_entry(v_cache));
  }

  @SubL(source = "cycl/cache.lisp", position = 15624) 
  public static final SubLObject do_cache_key(SubLObject entry) {
    return cache_entry_key(entry);
  }

  @SubL(source = "cycl/cache.lisp", position = 15720) 
  public static final SubLObject do_cache_value(SubLObject entry) {
    return cache_entry_value(entry);
  }

  @SubL(source = "cycl/cache.lisp", position = 15820) 
  public static final SubLObject do_cache_next(SubLObject entry, SubLObject order) {
    {
      SubLObject pcase_var = order;
      if (pcase_var.eql($kw53$NEWEST)) {
        return cache_entry_older(entry);
      } else if (pcase_var.eql($kw66$OLDEST)) {
        return cache_entry_newer(entry);
      } else {
        return Errors.error($str68$_S_was_not_either__NEWEST_or__OLD, order);
      }
    }
  }

  @SubL(source = "cycl/cache.lisp", position = 19220) 
  private static SubLSymbol $cfasl_opcode_cache$ = null;

  @SubL(source = "cycl/cache.lisp", position = 19339) 
  public static final SubLObject cfasl_output_object_cache_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31604");
  }

  /** Returns the entry of CACHE that was added most recently
   @param CACHE cache-p; the cache whose most recently added cache entry is to be returned
   @return cache-entry; the entry of CACHE that was added most recently */
  @SubL(source = "cycl/cache.lisp", position = 20461) 
  public static final SubLObject cache_newest(SubLObject v_cache) {
    return cache_entry_older(cache_head_entry(v_cache));
  }

  /** Removes ENTRY from the CACHE's priority queue
   @param CACHE cache-p; the cache from whose queue to remove ENTRY;
   @param ENTRY cache-entry; the cache entry to remove from CACHE's queue
   @return cache; a destructively modified version of CACHE where ENTRY has been
   removed from CACHE's queue */
  @SubL(source = "cycl/cache.lisp", position = 21143) 
  public static final SubLObject cache_queue_remove(SubLObject v_cache, SubLObject entry) {
    cache_queue_unlink(entry);
    possibly_resource_cache_entry(v_cache, entry);
    return v_cache;
  }

  /** Update the cache queue so that the entry becomes the newest ENTRY
   @param CACHE cache-p; the cache whose queue to update
   @param ENTRY cache-entry; the cache entry to update
   @return cache; the updated CACHE with entry as CACHE-NEWEST */
  @SubL(source = "cycl/cache.lisp", position = 21643) 
  public static final SubLObject cache_queue_requeue(SubLObject v_cache, SubLObject entry) {
    cache_queue_unlink(entry);
    cache_queue_append(v_cache, entry);
    return v_cache;
  }

  /** Enqueues ENTRY onto CACHE's priority queue
   @param CACHE cache-p; the cache onto whose queue to enqueue ENTRY
   @param ENTRY cache-entry; the cache entry to enqueue onto CACHE's queue
   @return cache; a destructively modified version of CACHE where ENTRY has been
   enqueued onto CACHE's queue */
  @SubL(source = "cycl/cache.lisp", position = 22018) 
  public static final SubLObject cache_queue_enqueue(SubLObject v_cache, SubLObject entry) {
    return cache_queue_append(v_cache, entry);
  }

  /** Add ENTRY onto CACHE's priority queue at the end
   @param CACHE cache-p; the cache onto whose queue to enqueue ENTRY
   @param ENTRY cache-entry; the cache entry to enqueue onto CACHE's queue
   @return cache; a destructively modified version of CACHE where ENTRY has been
   enqueued onto CACHE's queue */
  @SubL(source = "cycl/cache.lisp", position = 22414) 
  public static final SubLObject cache_queue_append(SubLObject v_cache, SubLObject entry) {
    _csetf_cache_entry_newer(entry, cache_head_entry(v_cache));
    _csetf_cache_entry_older(entry, cache_newest(v_cache));
    _csetf_cache_entry_newer(cache_newest(v_cache), entry);
    _csetf_cache_entry_older(cache_head_entry(v_cache), entry);
    return v_cache;
  }

  /** Remove entry from its neighbors
   @param ENTRY cache-entry; the cache entry to remove from CACHE's queue */
  @SubL(source = "cycl/cache.lisp", position = 23024) 
  public static final SubLObject cache_queue_unlink(SubLObject entry) {
    _csetf_cache_entry_newer(cache_entry_older(entry), cache_entry_newer(entry));
    _csetf_cache_entry_older(cache_entry_newer(entry), cache_entry_older(entry));
    return entry;
  }

  @SubL(source = "cycl/cache.lisp", position = 23359) 
  public static final SubLObject is_cache_preallocated_p(SubLObject v_cache) {
    {
      SubLObject free_list = cache_free_list(v_cache);
      return makeBoolean(((free_list == $kw47$RESOURCED)
            || (NIL != cache_entry_p(free_list))));
    }
  }

  /** Fetch an empty entry from the free list or allocate a new one.
   @param CACHE cache-p; the cache whose free list we want
   @return cache-entry-p; either a new or a reused cache entry */
  @SubL(source = "cycl/cache.lisp", position = 23602) 
  public static final SubLObject get_new_cache_entry(SubLObject v_cache) {
    {
      SubLObject entry = unresource_cache_entry(v_cache);
      if ((NIL == entry)) {
        entry = make_cache_entry(UNPROVIDED);
      }
      return entry;
    }
  }

  /** Returns the resourced list of cache entries.
   @param CACHE cache-p; the cache whose free list we want
   @return cache-entry-p; NIL or the cache entries will be chained through the newer link */
  @SubL(source = "cycl/cache.lisp", position = 23967) 
  public static final SubLObject cache_free_list(SubLObject v_cache) {
    return cache_entry_key(cache_head_entry(v_cache));
  }

  /** Set the head of the cache free list, containing the resourced cached entries
   @param CACHE cache-p; the cache whose free list we modify
   @param ENTRY cache-entry-p or NIL; the new head of the free list
   @return CACHE cache-p; the cache we modified */
  @SubL(source = "cycl/cache.lisp", position = 24341) 
  public static final SubLObject set_cache_free_list(SubLObject v_cache, SubLObject head) {
    _csetf_cache_entry_key(cache_head_entry(v_cache), head);
    return v_cache;
  }

  /** Decide whether to put this entry onto the free list of cache 
   @param CACHE cache-p; the cache whose free list might get ENTRY
   @param ENTRY cache-entry-p; the entry that will be chained up 
   @return CACHE cache-p */
  @SubL(source = "cycl/cache.lisp", position = 24805) 
  public static final SubLObject possibly_resource_cache_entry(SubLObject v_cache, SubLObject entry) {
    if ((NIL != is_cache_preallocated_p(v_cache))) {
      resource_cache_entry(v_cache, entry);
    }
    return v_cache;
  }

  /** Put the entry onto the free list of the cache.
   @param CACHE cache-p; the cache whose free list will get entry
   @param ENTRY cache-entry-p; the entry that will be chained up 
   @return CACHE cache-p */
  @SubL(source = "cycl/cache.lisp", position = 25186) 
  public static final SubLObject resource_cache_entry(SubLObject v_cache, SubLObject entry) {
    scrub_cache_entry(entry);
    _csetf_cache_entry_newer(entry, cache_free_list(v_cache));
    return set_cache_free_list(v_cache, entry);
  }

  /** Get an ENTRY from the free list of CACHE if you can; return NIL otherwise.
   @param CACHE cache-p; the cache whose free list will get entry
   @return NIL or cache-entry-p; the old entry to (re)use, if available */
  @SubL(source = "cycl/cache.lisp", position = 25578) 
  public static final SubLObject unresource_cache_entry(SubLObject v_cache) {
    {
      SubLObject free_list = cache_free_list(v_cache);
      SubLObject entry = NIL;
      if ((NIL != cache_entry_p(free_list))) {
        entry = free_list;
        set_cache_free_list(v_cache, cache_entry_newer(entry));
        _csetf_cache_entry_newer(entry, NIL);
      }
      return entry;
    }
  }

  /** Clean up all slots to prevent any loitering. */
  @SubL(source = "cycl/cache.lisp", position = 26498) 
  public static final SubLObject scrub_cache_entry(SubLObject entry) {
    _csetf_cache_entry_value(entry, NIL);
    _csetf_cache_entry_key(entry, NIL);
    _csetf_cache_entry_newer(entry, NIL);
    _csetf_cache_entry_older(entry, NIL);
    return entry;
  }

  public static final SubLObject declare_cache_file() {
    declareFunction(myName, "cache_print_function_trampoline", "CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "cache_p", "CACHE-P", 1, 0, false); new $cache_p$UnaryFunction();
    declareFunction(myName, "cache_capacity", "CACHE-CAPACITY", 1, 0, false);
    declareFunction(myName, "cache_map", "CACHE-MAP", 1, 0, false);
    declareFunction(myName, "cache_head_entry", "CACHE-HEAD-ENTRY", 1, 0, false);
    declareFunction(myName, "_csetf_cache_capacity", "_CSETF-CACHE-CAPACITY", 2, 0, false);
    declareFunction(myName, "_csetf_cache_map", "_CSETF-CACHE-MAP", 2, 0, false);
    declareFunction(myName, "_csetf_cache_head_entry", "_CSETF-CACHE-HEAD-ENTRY", 2, 0, false);
    declareFunction(myName, "make_cache", "MAKE-CACHE", 0, 1, false);
    declareFunction(myName, "cache_entry_print_function_trampoline", "CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "cache_entry_p", "CACHE-ENTRY-P", 1, 0, false); new $cache_entry_p$UnaryFunction();
    declareFunction(myName, "cache_entry_newer", "CACHE-ENTRY-NEWER", 1, 0, false);
    declareFunction(myName, "cache_entry_key", "CACHE-ENTRY-KEY", 1, 0, false);
    declareFunction(myName, "cache_entry_value", "CACHE-ENTRY-VALUE", 1, 0, false);
    declareFunction(myName, "cache_entry_older", "CACHE-ENTRY-OLDER", 1, 0, false);
    declareFunction(myName, "_csetf_cache_entry_newer", "_CSETF-CACHE-ENTRY-NEWER", 2, 0, false);
    declareFunction(myName, "_csetf_cache_entry_key", "_CSETF-CACHE-ENTRY-KEY", 2, 0, false);
    declareFunction(myName, "_csetf_cache_entry_value", "_CSETF-CACHE-ENTRY-VALUE", 2, 0, false);
    declareFunction(myName, "_csetf_cache_entry_older", "_CSETF-CACHE-ENTRY-OLDER", 2, 0, false);
    declareFunction(myName, "make_cache_entry", "MAKE-CACHE-ENTRY", 0, 1, false);
    declareFunction(myName, "cache_print", "CACHE-PRINT", 3, 0, false);
    declareFunction(myName, "new_cache", "NEW-CACHE", 1, 1, false);
    declareFunction(myName, "new_preallocated_cache", "NEW-PREALLOCATED-CACHE", 1, 1, false);
    declareFunction(myName, "cache_full_p", "CACHE-FULL-P", 1, 0, false);
    declareFunction(myName, "cache_empty_p", "CACHE-EMPTY-P", 1, 0, false);
    declareFunction(myName, "cache_get", "CACHE-GET", 2, 0, false);
    declareFunction(myName, "cache_get_without_values", "CACHE-GET-WITHOUT-VALUES", 2, 1, false);
    declareFunction(myName, "cache_get_int", "CACHE-GET-INT", 4, 0, false);
    declareFunction(myName, "cache_contains_key_p", "CACHE-CONTAINS-KEY-P", 2, 0, false);
    declareFunction(myName, "cache_set", "CACHE-SET", 3, 0, false);
    declareFunction(myName, "cache_set_without_values", "CACHE-SET-WITHOUT-VALUES", 3, 0, false);
    declareFunction(myName, "cache_set_return_dropped", "CACHE-SET-RETURN-DROPPED", 3, 0, false);
    declareFunction(myName, "cache_set_int", "CACHE-SET-INT", 4, 0, false);
    declareFunction(myName, "cache_remove", "CACHE-REMOVE", 2, 0, false);
    declareFunction(myName, "cache_clear", "CACHE-CLEAR", 1, 0, false);
    declareFunction(myName, "cache_test", "CACHE-TEST", 1, 0, false);
    declareFunction(myName, "cache_size", "CACHE-SIZE", 1, 0, false);
    declareMacro(myName, "do_cache", "DO-CACHE");
    declareFunction(myName, "cache_copy", "CACHE-COPY", 1, 0, false);
    declareFunction(myName, "do_cache_first", "DO-CACHE-FIRST", 2, 0, false);
    declareFunction(myName, "do_cache_doneP", "DO-CACHE-DONE?", 2, 0, false);
    declareFunction(myName, "do_cache_key", "DO-CACHE-KEY", 1, 0, false);
    declareFunction(myName, "do_cache_value", "DO-CACHE-VALUE", 1, 0, false);
    declareFunction(myName, "do_cache_next", "DO-CACHE-NEXT", 2, 0, false);
    declareFunction(myName, "cache_keys", "CACHE-KEYS", 1, 0, false);
    declareFunction(myName, "cache_values", "CACHE-VALUES", 1, 0, false);
    declareFunction(myName, "map_cache", "MAP-CACHE", 2, 0, false);
    declareFunction(myName, "new_cache_iterator", "NEW-CACHE-ITERATOR", 1, 0, false);
    declareFunction(myName, "make_iterator_cache_state", "MAKE-ITERATOR-CACHE-STATE", 1, 0, false);
    declareFunction(myName, "cache_iterator_done", "CACHE-ITERATOR-DONE", 1, 0, false);
    declareFunction(myName, "cache_iterator_next", "CACHE-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "new_cache_content_iterator", "NEW-CACHE-CONTENT-ITERATOR", 1, 0, false);
    declareFunction(myName, "make_cache_content_iterator_state", "MAKE-CACHE-CONTENT-ITERATOR-STATE", 1, 0, false);
    declareFunction(myName, "cache_content_iterator_done", "CACHE-CONTENT-ITERATOR-DONE", 1, 0, false);
    declareFunction(myName, "cache_content_iterator_next", "CACHE-CONTENT-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "cfasl_output_object_cache_method", "CFASL-OUTPUT-OBJECT-CACHE-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_cache", "CFASL-OUTPUT-CACHE", 2, 0, false);
    declareFunction(myName, "cfasl_input_cache", "CFASL-INPUT-CACHE", 1, 0, false);
    declareFunction(myName, "cache_newest", "CACHE-NEWEST", 1, 0, false);
    declareFunction(myName, "cache_oldest", "CACHE-OLDEST", 1, 0, false);
    declareFunction(myName, "cache_queue_remove", "CACHE-QUEUE-REMOVE", 2, 0, false);
    declareFunction(myName, "cache_queue_requeue", "CACHE-QUEUE-REQUEUE", 2, 0, false);
    declareFunction(myName, "cache_queue_enqueue", "CACHE-QUEUE-ENQUEUE", 2, 0, false);
    declareFunction(myName, "cache_queue_append", "CACHE-QUEUE-APPEND", 2, 0, false);
    declareFunction(myName, "cache_queue_unlink", "CACHE-QUEUE-UNLINK", 1, 0, false);
    declareFunction(myName, "is_cache_preallocated_p", "IS-CACHE-PREALLOCATED-P", 1, 0, false);
    declareFunction(myName, "get_new_cache_entry", "GET-NEW-CACHE-ENTRY", 1, 0, false);
    declareFunction(myName, "cache_free_list", "CACHE-FREE-LIST", 1, 0, false);
    declareFunction(myName, "set_cache_free_list", "SET-CACHE-FREE-LIST", 2, 0, false);
    declareFunction(myName, "possibly_resource_cache_entry", "POSSIBLY-RESOURCE-CACHE-ENTRY", 2, 0, false);
    declareFunction(myName, "resource_cache_entry", "RESOURCE-CACHE-ENTRY", 2, 0, false);
    declareFunction(myName, "unresource_cache_entry", "UNRESOURCE-CACHE-ENTRY", 1, 0, false);
    declareFunction(myName, "cache_entry_print", "CACHE-ENTRY-PRINT", 3, 0, false);
    declareFunction(myName, "scrub_cache_entry", "SCRUB-CACHE-ENTRY", 1, 0, false);
    declareFunction(myName, "test_cache", "TEST-CACHE", 0, 1, false);
    declareFunction(myName, "test_get_randomly_populated_cache_and_control_map", "TEST-GET-RANDOMLY-POPULATED-CACHE-AND-CONTROL-MAP", 1, 0, false);
    declareFunction(myName, "test_cache_iterators", "TEST-CACHE-ITERATORS", 0, 1, false);
    return NIL;
  }

  public static final SubLObject init_cache_file() {
    $dtp_cache$ = defconstant("*DTP-CACHE*", $sym0$CACHE);
    $dtp_cache_entry$ = defconstant("*DTP-CACHE-ENTRY*", $sym18$CACHE_ENTRY);
    $print_cache_elementsP$ = defparameter("*PRINT-CACHE-ELEMENTS?*", NIL);
    $cache_entries_preallocateP$ = defparameter("*CACHE-ENTRIES-PREALLOCATE?*", NIL);
    $cfasl_opcode_cache$ = defconstant("*CFASL-OPCODE-CACHE*", $int75$63);
    return NIL;
  }

  public static final SubLObject setup_cache_file() {
    // CVS_ID("Id: cache.lisp 127819 2009-05-14 15:46:16Z aldag ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), Symbols.symbol_function($sym7$CACHE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$CACHE_CAPACITY, $sym9$_CSETF_CACHE_CAPACITY);
    Structures.def_csetf($sym10$CACHE_MAP, $sym11$_CSETF_CACHE_MAP);
    Structures.def_csetf($sym12$CACHE_HEAD_ENTRY, $sym13$_CSETF_CACHE_HEAD_ENTRY);
    Equality.identity($sym0$CACHE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_cache_entry$.getGlobalValue(), Symbols.symbol_function($sym25$CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym26$CACHE_ENTRY_NEWER, $sym27$_CSETF_CACHE_ENTRY_NEWER);
    Structures.def_csetf($sym28$CACHE_ENTRY_KEY, $sym29$_CSETF_CACHE_ENTRY_KEY);
    Structures.def_csetf($sym30$CACHE_ENTRY_VALUE, $sym31$_CSETF_CACHE_ENTRY_VALUE);
    Structures.def_csetf($sym32$CACHE_ENTRY_OLDER, $sym33$_CSETF_CACHE_ENTRY_OLDER);
    Equality.identity($sym18$CACHE_ENTRY);
    access_macros.register_macro_helper($sym58$DO_CACHE_FIRST, $sym67$DO_CACHE);
    access_macros.register_macro_helper($sym61$DO_CACHE_DONE_, $sym67$DO_CACHE);
    access_macros.register_macro_helper($sym63$DO_CACHE_KEY, $sym67$DO_CACHE);
    access_macros.register_macro_helper($sym64$DO_CACHE_VALUE, $sym67$DO_CACHE);
    access_macros.register_macro_helper($sym65$DO_CACHE_NEXT, $sym67$DO_CACHE);
    cfasl.register_cfasl_input_function($cfasl_opcode_cache$.getGlobalValue(), $sym76$CFASL_INPUT_CACHE);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), Symbols.symbol_function($sym77$CFASL_OUTPUT_OBJECT_CACHE_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CACHE = makeSymbol("CACHE");
  public static final SubLSymbol $sym1$CACHE_P = makeSymbol("CACHE-P");
  public static final SubLList $list2 = list(makeSymbol("CAPACITY"), makeSymbol("MAP"), makeSymbol("HEAD-ENTRY"));
  public static final SubLList $list3 = list(makeKeyword("CAPACITY"), makeKeyword("MAP"), makeKeyword("HEAD-ENTRY"));
  public static final SubLList $list4 = list(makeSymbol("CACHE-CAPACITY"), makeSymbol("CACHE-MAP"), makeSymbol("CACHE-HEAD-ENTRY"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-CACHE-CAPACITY"), makeSymbol("_CSETF-CACHE-MAP"), makeSymbol("_CSETF-CACHE-HEAD-ENTRY"));
  public static final SubLSymbol $sym6$CACHE_PRINT = makeSymbol("CACHE-PRINT");
  public static final SubLSymbol $sym7$CACHE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CACHE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$CACHE_CAPACITY = makeSymbol("CACHE-CAPACITY");
  public static final SubLSymbol $sym9$_CSETF_CACHE_CAPACITY = makeSymbol("_CSETF-CACHE-CAPACITY");
  public static final SubLSymbol $sym10$CACHE_MAP = makeSymbol("CACHE-MAP");
  public static final SubLSymbol $sym11$_CSETF_CACHE_MAP = makeSymbol("_CSETF-CACHE-MAP");
  public static final SubLSymbol $sym12$CACHE_HEAD_ENTRY = makeSymbol("CACHE-HEAD-ENTRY");
  public static final SubLSymbol $sym13$_CSETF_CACHE_HEAD_ENTRY = makeSymbol("_CSETF-CACHE-HEAD-ENTRY");
  public static final SubLSymbol $kw14$CAPACITY = makeKeyword("CAPACITY");
  public static final SubLSymbol $kw15$MAP = makeKeyword("MAP");
  public static final SubLSymbol $kw16$HEAD_ENTRY = makeKeyword("HEAD-ENTRY");
  public static final SubLString $str17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym18$CACHE_ENTRY = makeSymbol("CACHE-ENTRY");
  public static final SubLSymbol $sym19$CACHE_ENTRY_P = makeSymbol("CACHE-ENTRY-P");
  public static final SubLList $list20 = list(makeSymbol("NEWER"), makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("OLDER"));
  public static final SubLList $list21 = list(makeKeyword("NEWER"), makeKeyword("KEY"), makeKeyword("VALUE"), makeKeyword("OLDER"));
  public static final SubLList $list22 = list(makeSymbol("CACHE-ENTRY-NEWER"), makeSymbol("CACHE-ENTRY-KEY"), makeSymbol("CACHE-ENTRY-VALUE"), makeSymbol("CACHE-ENTRY-OLDER"));
  public static final SubLList $list23 = list(makeSymbol("_CSETF-CACHE-ENTRY-NEWER"), makeSymbol("_CSETF-CACHE-ENTRY-KEY"), makeSymbol("_CSETF-CACHE-ENTRY-VALUE"), makeSymbol("_CSETF-CACHE-ENTRY-OLDER"));
  public static final SubLSymbol $sym24$CACHE_ENTRY_PRINT = makeSymbol("CACHE-ENTRY-PRINT");
  public static final SubLSymbol $sym25$CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym26$CACHE_ENTRY_NEWER = makeSymbol("CACHE-ENTRY-NEWER");
  public static final SubLSymbol $sym27$_CSETF_CACHE_ENTRY_NEWER = makeSymbol("_CSETF-CACHE-ENTRY-NEWER");
  public static final SubLSymbol $sym28$CACHE_ENTRY_KEY = makeSymbol("CACHE-ENTRY-KEY");
  public static final SubLSymbol $sym29$_CSETF_CACHE_ENTRY_KEY = makeSymbol("_CSETF-CACHE-ENTRY-KEY");
  public static final SubLSymbol $sym30$CACHE_ENTRY_VALUE = makeSymbol("CACHE-ENTRY-VALUE");
  public static final SubLSymbol $sym31$_CSETF_CACHE_ENTRY_VALUE = makeSymbol("_CSETF-CACHE-ENTRY-VALUE");
  public static final SubLSymbol $sym32$CACHE_ENTRY_OLDER = makeSymbol("CACHE-ENTRY-OLDER");
  public static final SubLSymbol $sym33$_CSETF_CACHE_ENTRY_OLDER = makeSymbol("_CSETF-CACHE-ENTRY-OLDER");
  public static final SubLSymbol $kw34$NEWER = makeKeyword("NEWER");
  public static final SubLSymbol $kw35$KEY = makeKeyword("KEY");
  public static final SubLSymbol $kw36$VALUE = makeKeyword("VALUE");
  public static final SubLSymbol $kw37$OLDER = makeKeyword("OLDER");
  public static final SubLString $str38$__CACHE_ = makeString("#<CACHE/");
  public static final SubLString $str39$_ = makeString("/");
  public static final SubLString $str40$_ = makeString("(");
  public static final SubLString $str41$__ = makeString(", ");
  public static final SubLString $str42$___ = makeString("...");
  public static final SubLString $str43$_ = makeString(")");
  public static final SubLString $str44$_ = makeString(">");
  public static final SubLSymbol $sym45$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym46$VALID_HASH_TEST_P = makeSymbol("VALID-HASH-TEST-P");
  public static final SubLSymbol $kw47$RESOURCED = makeKeyword("RESOURCED");
  public static final SubLSymbol $kw48$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLList $list49 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("CACHE"), makeSymbol("&KEY"), list(makeSymbol("ORDER"), makeKeyword("NEWEST"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list50 = list(makeKeyword("ORDER"));
  public static final SubLSymbol $kw51$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw52$ORDER = makeKeyword("ORDER");
  public static final SubLSymbol $kw53$NEWEST = makeKeyword("NEWEST");
  public static final SubLSymbol $sym54$CACHE_VAR = makeUninternedSymbol("CACHE-VAR");
  public static final SubLSymbol $sym55$ORDER_VAR = makeUninternedSymbol("ORDER-VAR");
  public static final SubLSymbol $sym56$ENTRY = makeUninternedSymbol("ENTRY");
  public static final SubLSymbol $sym57$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym58$DO_CACHE_FIRST = makeSymbol("DO-CACHE-FIRST");
  public static final SubLSymbol $sym59$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym60$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym61$DO_CACHE_DONE_ = makeSymbol("DO-CACHE-DONE?");
  public static final SubLSymbol $sym62$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym63$DO_CACHE_KEY = makeSymbol("DO-CACHE-KEY");
  public static final SubLSymbol $sym64$DO_CACHE_VALUE = makeSymbol("DO-CACHE-VALUE");
  public static final SubLSymbol $sym65$DO_CACHE_NEXT = makeSymbol("DO-CACHE-NEXT");
  public static final SubLSymbol $kw66$OLDEST = makeKeyword("OLDEST");
  public static final SubLSymbol $sym67$DO_CACHE = makeSymbol("DO-CACHE");
  public static final SubLString $str68$_S_was_not_either__NEWEST_or__OLD = makeString("~S was not either :NEWEST or :OLDEST");
  public static final SubLSymbol $sym69$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym70$CACHE_ITERATOR_DONE = makeSymbol("CACHE-ITERATOR-DONE");
  public static final SubLSymbol $sym71$CACHE_ITERATOR_NEXT = makeSymbol("CACHE-ITERATOR-NEXT");
  public static final SubLList $list72 = list(makeSymbol("CURRENT"), makeSymbol("HEAD-ENTRY"));
  public static final SubLSymbol $sym73$CACHE_CONTENT_ITERATOR_DONE = makeSymbol("CACHE-CONTENT-ITERATOR-DONE");
  public static final SubLSymbol $sym74$CACHE_CONTENT_ITERATOR_NEXT = makeSymbol("CACHE-CONTENT-ITERATOR-NEXT");
  public static final SubLInteger $int75$63 = makeInteger(63);
  public static final SubLSymbol $sym76$CFASL_INPUT_CACHE = makeSymbol("CFASL-INPUT-CACHE");
  public static final SubLSymbol $sym77$CFASL_OUTPUT_OBJECT_CACHE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CACHE-METHOD");
  public static final SubLString $str78$____ = makeString(" -> ");
  public static final SubLInteger $int79$100 = makeInteger(100);
  public static final SubLSymbol $sym80$_ = makeSymbol(">");
  public static final SubLSymbol $sym81$CDR = makeSymbol("CDR");
  public static final SubLFloat $float82$0_5 = makeDouble(0.5);
  public static final SubLString $str83$Content_iterator__A_was_exhausted = makeString("Content iterator ~A was exhausted at item ~A before the entry iterator ~A!");
  public static final SubLString $str84$The_content_iterator_at_item__A_s = makeString("The content iterator at item ~A suggests key ~A, but the entry iterator says ~A.");
  public static final SubLString $str85$The_content_iterator_at_item__A_s = makeString("The content iterator at item ~A suggests value ~A, but the entry iterator suggests ~A.");
  public static final SubLString $str86$The_content_iterator__A_is_not_ex = makeString("The content iterator ~A is not exhausted after ~A items, but the entry iterator ~A is done.");
  public static final SubLString $str87$The_two_iterators_do_not_seem_to_ = makeString("The two iterators do not seem to have touched every item: ~A items touched, but cache size is ~A.");

  //// Initializers

  public void declareFunctions() {
    declare_cache_file();
  }

  public void initializeVariables() {
    init_cache_file();
  }

  public void runTopLevelForms() {
    setup_cache_file();
  }

}
