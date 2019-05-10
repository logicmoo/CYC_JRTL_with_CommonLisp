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
import com.cyc.cycjava_1.cycl.cfasl;
import com.cyc.cycjava_1.cycl.cfasl_utilities;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.format_nil;
import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava_1.cycl.hash_table_utilities;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.map_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.set_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class id_index extends SubLTranslatedFile {

  //// Constructor

  private id_index() {}
  public static final SubLFile me = new id_index();
  public static final String myName = "com.cyc.cycjava_1.cycl.id_index";

  //// Definitions

  public static final class $id_index_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $lock; }
    public SubLObject getField3() { return $count; }
    public SubLObject getField4() { return $next_id; }
    public SubLObject getField5() { return $old_objects; }
    public SubLObject getField6() { return $new_objects; }
    public SubLObject setField2(SubLObject value) { return $lock = value; }
    public SubLObject setField3(SubLObject value) { return $count = value; }
    public SubLObject setField4(SubLObject value) { return $next_id = value; }
    public SubLObject setField5(SubLObject value) { return $old_objects = value; }
    public SubLObject setField6(SubLObject value) { return $new_objects = value; }
    public SubLObject $lock = NIL;
    public SubLObject $count = NIL;
    public SubLObject $next_id = NIL;
    public SubLObject $old_objects = NIL;
    public SubLObject $new_objects = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($id_index_native.class, $sym0$ID_INDEX, $sym1$ID_INDEX_P, $list2, $list3, new String[] {"$lock", "$count", "$next_id", "$old_objects", "$new_objects"}, $list4, $list5, $sym6$PRINT_ID_INDEX);
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static SubLSymbol $dtp_id_index$ = null;

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject id_index_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10317");
    return NIL;
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject id_index_p(SubLObject object) {
    return ((object.getClass() == $id_index_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $id_index_p$UnaryFunction extends UnaryFunction {
    public $id_index_p$UnaryFunction() { super(extractFunctionNamed("ID-INDEX-P")); }
    public SubLObject processItem(SubLObject arg1) { return id_index_p(arg1); }
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject idix_lock(SubLObject object) {
    checkType(object, $sym1$ID_INDEX_P);
    return object.getField2();
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject idix_count(SubLObject object) {
    checkType(object, $sym1$ID_INDEX_P);
    return object.getField3();
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject idix_next_id(SubLObject object) {
    checkType(object, $sym1$ID_INDEX_P);
    return object.getField4();
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject idix_old_objects(SubLObject object) {
    checkType(object, $sym1$ID_INDEX_P);
    return object.getField5();
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject idix_new_objects(SubLObject object) {
    checkType(object, $sym1$ID_INDEX_P);
    return object.getField6();
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject _csetf_idix_lock(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ID_INDEX_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject _csetf_idix_count(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ID_INDEX_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject _csetf_idix_next_id(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ID_INDEX_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject _csetf_idix_old_objects(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ID_INDEX_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject _csetf_idix_new_objects(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ID_INDEX_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/id-index.lisp", position = 1883) 
  public static final SubLObject make_id_index(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $id_index_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw18$LOCK)) {
            _csetf_idix_lock(v_new, current_value);
          } else if (pcase_var.eql($kw19$COUNT)) {
            _csetf_idix_count(v_new, current_value);
          } else if (pcase_var.eql($kw20$NEXT_ID)) {
            _csetf_idix_next_id(v_new, current_value);
          } else if (pcase_var.eql($kw21$OLD_OBJECTS)) {
            _csetf_idix_old_objects(v_new, current_value);
          } else if (pcase_var.eql($kw22$NEW_OBJECTS)) {
            _csetf_idix_new_objects(v_new, current_value);
          } else {
            Errors.error($str23$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Return the total number of objects indexed in ID-INDEX. */
  @SubL(source = "cycl/id-index.lisp", position = 2511) 
  public static final SubLObject id_index_count(SubLObject v_id_index) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    return idix_count(v_id_index);
  }

  /** Return T iff ID-INDEX is empty. */
  @SubL(source = "cycl/id-index.lisp", position = 2730) 
  public static final SubLObject id_index_empty_p(SubLObject v_id_index) {
    return Numbers.numE(ZERO_INTEGER, id_index_count(v_id_index));
  }

  /** Return the number of old objects in ID-INDEX. */
  @SubL(source = "cycl/id-index.lisp", position = 2851) 
  public static final SubLObject id_index_old_object_count(SubLObject v_id_index) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    return Numbers.subtract(id_index_count(v_id_index), id_index_new_object_count(v_id_index));
  }

  /** Return the number of new objects in ID-INDEX. */
  @SubL(source = "cycl/id-index.lisp", position = 3068) 
  public static final SubLObject id_index_new_object_count(SubLObject v_id_index) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    return Hashtables.hash_table_count(id_index_new_objects(v_id_index));
  }

  /** Return the ID at which new objects start in ID-INDEX. */
  @SubL(source = "cycl/id-index.lisp", position = 3266) 
  public static final SubLObject id_index_new_id_threshold(SubLObject v_id_index) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    return Sequences.length(id_index_old_objects(v_id_index));
  }

  /** Return the next internal ID which would be used in ID-INDEX. */
  @SubL(source = "cycl/id-index.lisp", position = 3463) 
  public static final SubLObject id_index_next_id(SubLObject v_id_index) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    return idix_next_id(v_id_index);
  }

  /** Start reserving internal IDs in ID-INDEX at NEXT-ID. */
  @SubL(source = "cycl/id-index.lisp", position = 3640) 
  public static final SubLObject set_id_index_next_id(SubLObject v_id_index, SubLObject next_id) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    checkType(next_id, $sym29$INTEGERP);
    _csetf_idix_next_id(v_id_index, next_id);
    return next_id;
  }

  /** Return the vector for old objects in ID-INDEX */
  @SubL(source = "cycl/id-index.lisp", position = 3896) 
  public static final SubLObject id_index_old_objects(SubLObject v_id_index) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    return idix_old_objects(v_id_index);
  }

  /** Return the hashtable for new objects in ID-INDEX */
  @SubL(source = "cycl/id-index.lisp", position = 4134) 
  public static final SubLObject id_index_new_objects(SubLObject v_id_index) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    return idix_new_objects(v_id_index);
  }

  /** Return the lock used to control modifications of ID-INDEX */
  @SubL(source = "cycl/id-index.lisp", position = 4651) 
  public static final SubLObject id_index_lock(SubLObject v_id_index) {
    return idix_lock(v_id_index);
  }

  /** Number of old entries anticipated for each new entry. */
  @SubL(source = "cycl/id-index.lisp", position = 4858) 
  private static SubLSymbol $id_index_default_scaling_factor$ = null;

  @SubL(source = "cycl/id-index.lisp", position = 5021) 
  private static SubLSymbol $id_index_equality_test$ = null;

  /** Return a new ID-INDEX with ids for new entries starting at NEW-ID-START.
Access to OLD-OBJECTS-SIZE number of ids starting at 0 will be optimized. */
  @SubL(source = "cycl/id-index.lisp", position = 5780) 
  public static final SubLObject new_id_index(SubLObject old_objects_size, SubLObject new_id_start) {
    if ((old_objects_size == UNPROVIDED)) {
      old_objects_size = ZERO_INTEGER;
    }
    if ((new_id_start == UNPROVIDED)) {
      new_id_start = old_objects_size;
    }
    checkType(new_id_start, $sym41$NON_NEGATIVE_INTEGER_P);
    checkType(old_objects_size, $sym41$NON_NEGATIVE_INTEGER_P);
    {
      SubLObject new_objects_size = Numbers.max(TEN_INTEGER, Numbers.integerDivide(old_objects_size, $id_index_default_scaling_factor$.getGlobalValue()));
      SubLObject v_id_index = make_id_index(UNPROVIDED);
      SubLObject lock = Locks.make_lock($str42$ID_INDEX);
      SubLObject old_objects = Vectors.make_vector(old_objects_size, NIL);
      SubLObject new_objects = Hashtables.make_hash_table(new_objects_size, $id_index_equality_test$.getGlobalValue(), UNPROVIDED);
      _csetf_idix_lock(v_id_index, lock);
      _csetf_idix_count(v_id_index, ZERO_INTEGER);
      _csetf_idix_next_id(v_id_index, new_id_start);
      _csetf_idix_old_objects(v_id_index, old_objects);
      _csetf_idix_new_objects(v_id_index, new_objects);
      return v_id_index;
    }
  }

  /** Reserve an internal ID from ID-INDEX and return it. */
  @SubL(source = "cycl/id-index.lisp", position = 6730) 
  public static final SubLObject id_index_reserve(SubLObject v_id_index) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    {
      SubLObject id = NIL;
      SubLObject id_index_lock = id_index_lock(v_id_index);
      SubLObject lock = id_index_lock;
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        {
          SubLObject next_id = id_index_next_id(v_id_index);
          _csetf_idix_next_id(v_id_index, Numbers.add(idix_next_id(v_id_index), ONE_INTEGER));
          id = next_id;
        }
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return id;
    }
  }

  @SubL(source = "cycl/id-index.lisp", position = 7113) 
  private static SubLSymbol $id_index_empty_list$ = null;

  @SubL(source = "cycl/id-index.lisp", position = 7187) 
  public static final SubLObject id_index_empty_list() {
    return $id_index_empty_list$.getGlobalValue();
  }

  @SubL(source = "cycl/id-index.lisp", position = 7257) 
  public static final SubLObject id_index_tombstone() {
    return NIL;
  }

  @SubL(source = "cycl/id-index.lisp", position = 7341) 
  public static final SubLObject id_index_tombstone_p(SubLObject object) {
    return Equality.eq(object, id_index_tombstone());
  }

  @SubL(source = "cycl/id-index.lisp", position = 7457) 
  public static final SubLObject id_index_lookup(SubLObject v_id_index, SubLObject id, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLObject result = id_index_lookup_int(v_id_index, id);
      if ((NIL != id_index_tombstone_p(result))) {
        return v_default;
      } else if ((result == id_index_empty_list())) {
        return NIL;
      } else {
        return result;
      }
    }
  }

  /** Return the object associated with ID in ID-INDEX. */
  @SubL(source = "cycl/id-index.lisp", position = 7720) 
  public static final SubLObject id_index_lookup_int(SubLObject v_id_index, SubLObject id) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    checkType(id, $sym29$INTEGERP);
    if ((NIL != id_index_old_object_id_p(v_id_index, id))) {
      {
        SubLObject old_objects = id_index_old_objects(v_id_index);
        return Vectors.aref(old_objects, id);
      }
    } else {
      {
        SubLObject new_objects = id_index_new_objects(v_id_index);
        return Hashtables.gethash_without_values(id, new_objects, NIL);
      }
    }
  }

  /** Enter OBJECT in ID-INDEX as the object associated with the key ID.
   ID-INDEX is locked during the modification. */
  @SubL(source = "cycl/id-index.lisp", position = 8141) 
  public static final SubLObject id_index_enter(SubLObject v_id_index, SubLObject id, SubLObject object) {
    {
      SubLObject id_index_lock = id_index_lock(v_id_index);
      SubLObject lock = id_index_lock;
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        id_index_enter_unlocked(v_id_index, id, object);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return v_id_index;
  }

  /** Enter OBJECT in ID-INDEX as the object associated with the key ID.
   ID-INDEX is assumed to be already locked from the outside. */
  @SubL(source = "cycl/id-index.lisp", position = 8412) 
  public static final SubLObject id_index_enter_unlocked(SubLObject v_id_index, SubLObject id, SubLObject object) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    checkType(id, $sym29$INTEGERP);
    {
      SubLObject existing = id_index_lookup_int(v_id_index, id);
      SubLObject dwimmed_object = ((NIL != object) ? ((SubLObject) object) : id_index_empty_list());
      if ((NIL != id_index_old_object_id_p(v_id_index, id))) {
        {
          SubLObject old_objects = id_index_old_objects(v_id_index);
          Vectors.set_aref(old_objects, id, dwimmed_object);
        }
      } else {
        {
          SubLObject new_objects = id_index_new_objects(v_id_index);
          Hashtables.sethash(id, new_objects, dwimmed_object);
        }
      }
      if ((NIL != id_index_tombstone_p(existing))) {
        _csetf_idix_count(v_id_index, Numbers.add(idix_count(v_id_index), ONE_INTEGER));
      }
    }
    return v_id_index;
  }

  /** Enter OBJECT in ID-INDEX as the object associated with the key ID.
   ID-INDEX is locked during the modification.
   If the insert fills up the old objects vector, grow the vector. */
  @SubL(source = "cycl/id-index.lisp", position = 9210) 
  public static final SubLObject id_index_enter_autoextend(SubLObject v_id_index, SubLObject id, SubLObject object) {
    id_index_enter(v_id_index, id, object);
    return id_index_possibly_autoextend(v_id_index, id);
  }

  /** Enter OBJECT in ID-INDEX as the object associated with the key ID.
   ID-INDEX is assumed to be already locked from the outside.
   If the insert fills up the old objects vector, grow the vector. */
  @SubL(source = "cycl/id-index.lisp", position = 9548) 
  public static final SubLObject id_index_enter_unlocked_autoextend(SubLObject v_id_index, SubLObject id, SubLObject object) {
    id_index_enter_unlocked(v_id_index, id, object);
    return id_index_possibly_autoextend(v_id_index, id);
  }

  /** If id was the last id in oldspace, grow the vector. */
  @SubL(source = "cycl/id-index.lisp", position = 9919) 
  public static final SubLObject id_index_possibly_autoextend(SubLObject v_id_index, SubLObject id) {
    {
      SubLObject threshold = id_index_new_id_threshold(v_id_index);
      if (number_utilities.f_1X(id).numGE(threshold)) {
        optimize_id_index(v_id_index, number_utilities.f_2X(Numbers.max(threshold, id)));
      }
    }
    return v_id_index;
  }

  /** Remove any association for ID in ID-INDEX. */
  @SubL(source = "cycl/id-index.lisp", position = 10249) 
  public static final SubLObject id_index_remove(SubLObject v_id_index, SubLObject id) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    checkType(id, $sym29$INTEGERP);
    {
      SubLObject id_index_lock = id_index_lock(v_id_index);
      SubLObject lock = id_index_lock;
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        {
          SubLObject existing = id_index_lookup_int(v_id_index, id);
          if ((NIL != id_index_old_object_id_p(v_id_index, id))) {
            {
              SubLObject old_objects = id_index_old_objects(v_id_index);
              Vectors.set_aref(old_objects, id, id_index_tombstone());
            }
          } else {
            {
              SubLObject new_objects = id_index_new_objects(v_id_index);
              Hashtables.remhash(id, new_objects);
            }
          }
          if ((NIL == id_index_tombstone_p(existing))) {
            _csetf_idix_count(v_id_index, Numbers.subtract(idix_count(v_id_index), ONE_INTEGER));
          }
        }
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return v_id_index;
  }

  /** Remove all ID associations in ID-INDEX. */
  @SubL(source = "cycl/id-index.lisp", position = 10901) 
  public static final SubLObject clear_id_index(SubLObject v_id_index) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    {
      SubLObject id_index_lock = id_index_lock(v_id_index);
      SubLObject lock = id_index_lock;
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        _csetf_idix_count(v_id_index, ZERO_INTEGER);
        Sequences.fill(id_index_old_objects(v_id_index), NIL, UNPROVIDED, UNPROVIDED);
        Hashtables.clrhash(id_index_new_objects(v_id_index));
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return v_id_index;
  }

  @SubL(source = "cycl/id-index.lisp", position = 11203) 
  public static final SubLObject id_index_old_object_id_p(SubLObject v_id_index, SubLObject id) {
    return makeBoolean(((!(id.isNegative()))
           && id.numL(id_index_new_id_threshold(v_id_index))));
  }

  @SubL(source = "cycl/id-index.lisp", position = 15737) 
  public static final SubLObject id_index_objects_empty_p(SubLObject v_id_index, SubLObject tombstone) {
    if ((NIL != id_index_skip_tombstones_p(tombstone))) {
      return id_index_empty_p(v_id_index);
    }
    return NIL;
  }

  @SubL(source = "cycl/id-index.lisp", position = 17374) 
  public static final SubLObject id_index_old_objects_empty_p(SubLObject v_id_index, SubLObject tombstone) {
    if ((NIL != id_index_skip_tombstones_p(tombstone))) {
      return Numbers.numE(ZERO_INTEGER, id_index_old_object_count(v_id_index));
    }
    return NIL;
  }

  @SubL(source = "cycl/id-index.lisp", position = 17596) 
  public static final SubLObject id_index_skip_tombstones_p(SubLObject tombstone) {
    return Equality.eq($kw56$SKIP, tombstone);
  }

  @SubL(source = "cycl/id-index.lisp", position = 20450) 
  public static final SubLObject id_index_new_objects_empty_p(SubLObject v_id_index) {
    return Numbers.numE(ZERO_INTEGER, id_index_new_object_count(v_id_index));
  }

  @SubL(source = "cycl/id-index.lisp", position = 25111) 
  private static SubLSymbol $cfasl_wide_opcode_id_index$ = null;

  /** Optimize ID-INDEX by merging the new objects into the old objects. */
  @SubL(source = "cycl/id-index.lisp", position = 29839) 
  public static final SubLObject optimize_id_index(SubLObject v_id_index, SubLObject size) {
    if ((size == UNPROVIDED)) {
      size = NIL;
    }
    checkType(v_id_index, $sym1$ID_INDEX_P);
    if ((NIL != size)) {
      checkType(size, $sym41$NON_NEGATIVE_INTEGER_P);
    }
    {
      SubLObject id_index_lock = id_index_lock(v_id_index);
      SubLObject lock = id_index_lock;
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        {
          SubLObject next_id = id_index_next_id(v_id_index);
          SubLObject new_size = ((NIL != size) ? ((SubLObject) Numbers.max(size, next_id)) : next_id);
          SubLObject new_objects = id_index_new_objects(v_id_index);
          SubLObject old_objects = id_index_old_objects(v_id_index);
          SubLObject old_object_limit = Sequences.length(old_objects);
          if (new_size.numG(old_object_limit)) {
            {
              SubLObject optimized_old_objects = Vectors.make_vector(new_size, NIL);
              Sequences.replace(optimized_old_objects, old_objects, ZERO_INTEGER, Numbers.min(new_size, old_object_limit), ZERO_INTEGER, Numbers.min(new_size, old_object_limit));
              {
                SubLObject id = NIL;
                SubLObject object = NIL;
                {
                  final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(new_objects);
                  try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                      final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                      id = Hashtables.getEntryKey(cdohash_entry);
                      object = Hashtables.getEntryValue(cdohash_entry);
                      Vectors.set_aref(optimized_old_objects, id, object);
                    }
                  } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                  }
                }
              }
              _csetf_idix_old_objects(v_id_index, optimized_old_objects);
              Hashtables.clrhash(new_objects);
            }
          }
        }
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return v_id_index;
  }

  /** @return listp; a list of the values of ID-INDEX. */
  @SubL(source = "cycl/id-index.lisp", position = 34708) 
  public static final SubLObject id_index_values(SubLObject v_id_index) {
    checkType(v_id_index, $sym1$ID_INDEX_P);
    {
      SubLObject values = NIL;
      SubLObject idx = v_id_index;
      if ((NIL == id_index_objects_empty_p(idx, $kw56$SKIP))) {
        {
          SubLObject idx_15 = idx;
          if ((NIL == id_index_old_objects_empty_p(idx_15, $kw56$SKIP))) {
            {
              SubLObject vector_var = id_index_old_objects(idx_15);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject object = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index_tombstone_p(object))
                         && (NIL != id_index_skip_tombstones_p($kw56$SKIP)))))) {
                    if ((NIL != id_index_tombstone_p(object))) {
                      object = $kw56$SKIP;
                    }
                    values = cons(object, values);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_16 = idx;
          if ((NIL == id_index_new_objects_empty_p(idx_16))) {
            {
              SubLObject cdohash_table = id_index_new_objects(idx_16);
              SubLObject id = NIL;
              SubLObject object = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    object = Hashtables.getEntryValue(cdohash_entry);
                    values = cons(object, values);
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
      return Sequences.nreverse(values);
    }
  }

  public static final SubLObject declare_id_index_file() {
    declareFunction(myName, "id_index_print_function_trampoline", "ID-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "id_index_p", "ID-INDEX-P", 1, 0, false); new $id_index_p$UnaryFunction();
    declareFunction(myName, "idix_lock", "IDIX-LOCK", 1, 0, false);
    declareFunction(myName, "idix_count", "IDIX-COUNT", 1, 0, false);
    declareFunction(myName, "idix_next_id", "IDIX-NEXT-ID", 1, 0, false);
    declareFunction(myName, "idix_old_objects", "IDIX-OLD-OBJECTS", 1, 0, false);
    declareFunction(myName, "idix_new_objects", "IDIX-NEW-OBJECTS", 1, 0, false);
    declareFunction(myName, "_csetf_idix_lock", "_CSETF-IDIX-LOCK", 2, 0, false);
    declareFunction(myName, "_csetf_idix_count", "_CSETF-IDIX-COUNT", 2, 0, false);
    declareFunction(myName, "_csetf_idix_next_id", "_CSETF-IDIX-NEXT-ID", 2, 0, false);
    declareFunction(myName, "_csetf_idix_old_objects", "_CSETF-IDIX-OLD-OBJECTS", 2, 0, false);
    declareFunction(myName, "_csetf_idix_new_objects", "_CSETF-IDIX-NEW-OBJECTS", 2, 0, false);
    declareFunction(myName, "make_id_index", "MAKE-ID-INDEX", 0, 1, false);
    //declareFunction(myName, "print_id_index", "PRINT-ID-INDEX", 3, 0, false);
    declareFunction(myName, "id_index_count", "ID-INDEX-COUNT", 1, 0, false);
    declareFunction(myName, "id_index_empty_p", "ID-INDEX-EMPTY-P", 1, 0, false);
    declareFunction(myName, "id_index_old_object_count", "ID-INDEX-OLD-OBJECT-COUNT", 1, 0, false);
    declareFunction(myName, "id_index_new_object_count", "ID-INDEX-NEW-OBJECT-COUNT", 1, 0, false);
    declareFunction(myName, "id_index_new_id_threshold", "ID-INDEX-NEW-ID-THRESHOLD", 1, 0, false);
    declareFunction(myName, "id_index_next_id", "ID-INDEX-NEXT-ID", 1, 0, false);
    declareFunction(myName, "set_id_index_next_id", "SET-ID-INDEX-NEXT-ID", 2, 0, false);
    declareFunction(myName, "id_index_old_objects", "ID-INDEX-OLD-OBJECTS", 1, 0, false);
    declareFunction(myName, "id_index_new_objects", "ID-INDEX-NEW-OBJECTS", 1, 0, false);
    //declareMacro(myName, "with_id_index_locked", "WITH-ID-INDEX-LOCKED");
    declareFunction(myName, "id_index_lock", "ID-INDEX-LOCK", 1, 0, false);
    //declareFunction(myName, "convert_id_index_key_test", "CONVERT-ID-INDEX-KEY-TEST", 1, 0, false);
    declareFunction(myName, "new_id_index", "NEW-ID-INDEX", 0, 2, false);
    declareFunction(myName, "id_index_reserve", "ID-INDEX-RESERVE", 1, 0, false);
    declareFunction(myName, "id_index_empty_list", "ID-INDEX-EMPTY-LIST", 0, 0, false);
    declareFunction(myName, "id_index_tombstone", "ID-INDEX-TOMBSTONE", 0, 0, false);
    declareFunction(myName, "id_index_tombstone_p", "ID-INDEX-TOMBSTONE-P", 1, 0, false);
    declareFunction(myName, "id_index_lookup", "ID-INDEX-LOOKUP", 2, 1, false);
    declareFunction(myName, "id_index_lookup_int", "ID-INDEX-LOOKUP-INT", 2, 0, false);
    declareFunction(myName, "id_index_enter", "ID-INDEX-ENTER", 3, 0, false);
    declareFunction(myName, "id_index_enter_unlocked", "ID-INDEX-ENTER-UNLOCKED", 3, 0, false);
    declareFunction(myName, "id_index_enter_autoextend", "ID-INDEX-ENTER-AUTOEXTEND", 3, 0, false);
    declareFunction(myName, "id_index_enter_unlocked_autoextend", "ID-INDEX-ENTER-UNLOCKED-AUTOEXTEND", 3, 0, false);
    declareFunction(myName, "id_index_possibly_autoextend", "ID-INDEX-POSSIBLY-AUTOEXTEND", 2, 0, false);
    declareFunction(myName, "id_index_remove", "ID-INDEX-REMOVE", 2, 0, false);
    declareFunction(myName, "clear_id_index", "CLEAR-ID-INDEX", 1, 0, false);
    declareFunction(myName, "id_index_old_object_id_p", "ID-INDEX-OLD-OBJECT-ID-P", 2, 0, false);
    //declareFunction(myName, "new_id_index_iterator", "NEW-ID-INDEX-ITERATOR", 1, 0, false);
    //declareFunction(myName, "new_id_index_values_iterator", "NEW-ID-INDEX-VALUES-ITERATOR", 1, 0, false);
    //declareFunction(myName, "new_id_index_old_objects_iterator", "NEW-ID-INDEX-OLD-OBJECTS-ITERATOR", 1, 0, false);
    //declareFunction(myName, "iterate_id_index_old_objects_necessary", "ITERATE-ID-INDEX-OLD-OBJECTS-NECESSARY", 1, 0, false);
    //declareFunction(myName, "new_id_index_old_objects_values_iterator", "NEW-ID-INDEX-OLD-OBJECTS-VALUES-ITERATOR", 1, 0, false);
    //declareFunction(myName, "new_id_index_new_objects_iterator", "NEW-ID-INDEX-NEW-OBJECTS-ITERATOR", 1, 0, false);
    //declareFunction(myName, "new_id_index_new_objects_values_iterator", "NEW-ID-INDEX-NEW-OBJECTS-VALUES-ITERATOR", 1, 0, false);
    //declareMacro(myName, "do_id_index", "DO-ID-INDEX");
    //declareMacro(myName, "old_do_id_index", "OLD-DO-ID-INDEX");
    declareFunction(myName, "id_index_objects_empty_p", "ID-INDEX-OBJECTS-EMPTY-P", 2, 0, false);
    //declareMacro(myName, "do_id_index_old_objects", "DO-ID-INDEX-OLD-OBJECTS");
    declareFunction(myName, "id_index_old_objects_empty_p", "ID-INDEX-OLD-OBJECTS-EMPTY-P", 2, 0, false);
    declareFunction(myName, "id_index_skip_tombstones_p", "ID-INDEX-SKIP-TOMBSTONES-P", 1, 0, false);
    //declareMacro(myName, "do_id_index_new_objects", "DO-ID-INDEX-NEW-OBJECTS");
    declareFunction(myName, "id_index_new_objects_empty_p", "ID-INDEX-NEW-OBJECTS-EMPTY-P", 1, 0, false);
    //declareFunction(myName, "id_index_new_object_ids", "ID-INDEX-NEW-OBJECT-IDS", 1, 0, false);
    //declareMacro(myName, "new_do_id_index", "NEW-DO-ID-INDEX");
    //declareFunction(myName, "do_id_index_next_id", "DO-ID-INDEX-NEXT-ID", 4, 0, false);
    //declareFunction(myName, "do_id_index_next_state", "DO-ID-INDEX-NEXT-STATE", 4, 0, false);
    //declareFunction(myName, "do_id_index_state_object", "DO-ID-INDEX-STATE-OBJECT", 4, 0, false);
    //declareFunction(myName, "do_id_index_object_validP", "DO-ID-INDEX-OBJECT-VALID?", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_id_index_method", "CFASL-OUTPUT-OBJECT-ID-INDEX-METHOD", 2, 0, false);
    //declareFunction(myName, "cfasl_wide_output_id_index", "CFASL-WIDE-OUTPUT-ID-INDEX", 2, 0, false);
    //declareFunction(myName, "cfasl_output_id_index_internal", "CFASL-OUTPUT-ID-INDEX-INTERNAL", 2, 0, false);
    //declareFunction(myName, "cfasl_input_id_index", "CFASL-INPUT-ID-INDEX", 1, 0, false);
    //declareFunction(myName, "test_id_index_cfasl_serialization", "TEST-ID-INDEX-CFASL-SERIALIZATION", 2, 2, false);
    //declareFunction(myName, "id_index_optimized_p", "ID-INDEX-OPTIMIZED-P", 1, 0, false);
    declareFunction(myName, "optimize_id_index", "OPTIMIZE-ID-INDEX", 1, 1, false);
    //declareFunction(myName, "id_index_compact_p", "ID-INDEX-COMPACT-P", 1, 0, false);
    //declareFunction(myName, "compact_id_index", "COMPACT-ID-INDEX", 1, 1, false);
    //declareFunction(myName, "new_indirect_compact_id_index", "NEW-INDIRECT-COMPACT-ID-INDEX", 1, 0, false);
    //declareFunction(myName, "id_index_ids", "ID-INDEX-IDS", 1, 0, false);
    declareFunction(myName, "id_index_values", "ID-INDEX-VALUES", 1, 0, false);
    //declareFunction(myName, "clone_id_index", "CLONE-ID-INDEX", 1, 0, false);
    //declareFunction(myName, "copy_id_index", "COPY-ID-INDEX", 1, 1, false);
    //declareFunction(myName, "id_index_missing_ids", "ID-INDEX-MISSING-IDS", 1, 2, false);
    //declareFunction(myName, "test_id_index_missing_ids", "TEST-ID-INDEX-MISSING-IDS", 3, 0, false);
    //declareFunction(myName, "build_reverse_index_for_id_index", "BUILD-REVERSE-INDEX-FOR-ID-INDEX", 2, 1, false);
    //declareFunction(myName, "new_id_index_from_reverse_index", "NEW-ID-INDEX-FROM-REVERSE-INDEX", 1, 0, false);
    //declareFunction(myName, "find_max_index_id_in_reverse_index", "FIND-MAX-INDEX-ID-IN-REVERSE-INDEX", 1, 0, false);
    //declareFunction(myName, "test_new_index_from_reverse_index", "TEST-NEW-INDEX-FROM-REVERSE-INDEX", 2, 2, false);
    //declareFunction(myName, "new_id_index_for_testing_purposes", "NEW-ID-INDEX-FOR-TESTING-PURPOSES", 2, 1, false);
    //declareFunction(myName, "test_do_id_index_with_tombstones", "TEST-DO-ID-INDEX-WITH-TOMBSTONES", 3, 0, false);
    //declareFunction(myName, "new_id_index_for_testing_purposes_with_random_holes", "NEW-ID-INDEX-FOR-TESTING-PURPOSES-WITH-RANDOM-HOLES", 3, 1, false);
    //declareFunction(myName, "populate_reverse_index_for_id_index", "POPULATE-REVERSE-INDEX-FOR-ID-INDEX", 2, 0, false);
    //declareFunction(myName, "to_hex_string", "TO-HEX-STRING", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_id_index_file() {
    $dtp_id_index$ = defconstant("*DTP-ID-INDEX*", $sym0$ID_INDEX);
    $id_index_default_scaling_factor$ = deflexical("*ID-INDEX-DEFAULT-SCALING-FACTOR*", $int40$100);
    $id_index_equality_test$ = deflexical("*ID-INDEX-EQUALITY-TEST*", EQ);
    $id_index_empty_list$ = deflexical("*ID-INDEX-EMPTY-LIST*", ((NIL != Symbols.boundp($sym43$_ID_INDEX_EMPTY_LIST_)) ? ((SubLObject) $id_index_empty_list$.getGlobalValue()) : Symbols.make_symbol($str44$THE_EMPTY_LIST)));
    $cfasl_wide_opcode_id_index$ = defconstant("*CFASL-WIDE-OPCODE-ID-INDEX*", $int128$128);
    return NIL;
  }

  public static final SubLObject setup_id_index_file() {
    // CVS_ID("Id: id-index.lisp 128690 2009-09-02 19:44:47Z rck ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_id_index$.getGlobalValue(), Symbols.symbol_function($sym7$ID_INDEX_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$IDIX_LOCK, $sym9$_CSETF_IDIX_LOCK);
    Structures.def_csetf($sym10$IDIX_COUNT, $sym11$_CSETF_IDIX_COUNT);
    Structures.def_csetf($sym12$IDIX_NEXT_ID, $sym13$_CSETF_IDIX_NEXT_ID);
    Structures.def_csetf($sym14$IDIX_OLD_OBJECTS, $sym15$_CSETF_IDIX_OLD_OBJECTS);
    Structures.def_csetf($sym16$IDIX_NEW_OBJECTS, $sym17$_CSETF_IDIX_NEW_OBJECTS);
    Equality.identity($sym0$ID_INDEX);
    access_macros.register_macro_helper($sym30$ID_INDEX_OLD_OBJECTS, $sym31$DO_ID_INDEX_OLD_OBJECTS);
    access_macros.register_macro_helper($sym32$ID_INDEX_NEW_OBJECTS, $sym33$DO_ID_INDEX_NEW_OBJECTS);
    access_macros.register_macro_helper($sym37$ID_INDEX_LOCK, $sym39$WITH_ID_INDEX_LOCKED);
    subl_macro_promotions.declare_defglobal($sym43$_ID_INDEX_EMPTY_LIST_);
    access_macros.register_macro_helper($sym45$ID_INDEX_TOMBSTONE_P, $sym46$DO_ID_INDEX);
    access_macros.register_macro_helper($sym63$ID_INDEX_OBJECTS_EMPTY_P, $sym46$DO_ID_INDEX);
    access_macros.register_macro_helper($sym31$DO_ID_INDEX_OLD_OBJECTS, $sym46$DO_ID_INDEX);
    access_macros.register_macro_helper($sym78$ID_INDEX_OLD_OBJECTS_EMPTY_P, $sym31$DO_ID_INDEX_OLD_OBJECTS);
    access_macros.register_macro_helper($sym81$ID_INDEX_SKIP_TOMBSTONES_P, $list89);
    access_macros.register_macro_helper($sym33$DO_ID_INDEX_NEW_OBJECTS, $sym46$DO_ID_INDEX);
    access_macros.register_macro_helper($sym101$ID_INDEX_NEW_OBJECTS_EMPTY_P, $sym33$DO_ID_INDEX_NEW_OBJECTS);
    access_macros.register_macro_helper($sym112$ID_INDEX_NEW_OBJECT_IDS, $sym33$DO_ID_INDEX_NEW_OBJECTS);
    access_macros.register_macro_helper($sym121$DO_ID_INDEX_NEXT_ID, $sym114$NEW_DO_ID_INDEX);
    access_macros.register_macro_helper($sym123$DO_ID_INDEX_NEXT_STATE, $sym114$NEW_DO_ID_INDEX);
    access_macros.register_macro_helper($sym125$DO_ID_INDEX_STATE_OBJECT, $sym114$NEW_DO_ID_INDEX);
    access_macros.register_macro_helper($sym126$DO_ID_INDEX_OBJECT_VALID_, $sym114$NEW_DO_ID_INDEX);
    cfasl.register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_id_index$.getGlobalValue(), $sym129$CFASL_INPUT_ID_INDEX);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_id_index$.getGlobalValue(), Symbols.symbol_function($sym130$CFASL_OUTPUT_OBJECT_ID_INDEX_METHOD));
    generic_testing.define_test_case_table_int($sym135$TEST_ID_INDEX_CFASL_SERIALIZATION, list(new SubLObject[] {$kw136$TEST, NIL, $kw137$OWNER, NIL, $kw138$CLASSES, NIL, $kw139$KB, $kw140$TINY, $kw141$WORKING_, T}), $list142);
    generic_testing.define_test_case_table_int($sym157$TEST_ID_INDEX_MISSING_IDS, list(new SubLObject[] {$kw136$TEST, NIL, $kw137$OWNER, NIL, $kw138$CLASSES, NIL, $kw139$KB, $kw140$TINY, $kw141$WORKING_, T}), $list158);
    generic_testing.define_test_case_table_int($sym163$TEST_NEW_INDEX_FROM_REVERSE_INDEX, list(new SubLObject[] {$kw136$TEST, NIL, $kw137$OWNER, NIL, $kw138$CLASSES, NIL, $kw139$KB, $kw140$TINY, $kw141$WORKING_, T}), $list142);
    generic_testing.define_test_case_table_int($sym169$TEST_DO_ID_INDEX_WITH_TOMBSTONES, list(new SubLObject[] {$kw136$TEST, NIL, $kw137$OWNER, NIL, $kw138$CLASSES, NIL, $kw139$KB, $kw140$TINY, $kw141$WORKING_, NIL}), $list158);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$ID_INDEX = makeSymbol("ID-INDEX");
  public static final SubLSymbol $sym1$ID_INDEX_P = makeSymbol("ID-INDEX-P");
  public static final SubLList $list2 = list(makeSymbol("LOCK"), makeSymbol("COUNT"), makeSymbol("NEXT-ID"), makeSymbol("OLD-OBJECTS"), makeSymbol("NEW-OBJECTS"));
  public static final SubLList $list3 = list(makeKeyword("LOCK"), makeKeyword("COUNT"), makeKeyword("NEXT-ID"), makeKeyword("OLD-OBJECTS"), makeKeyword("NEW-OBJECTS"));
  public static final SubLList $list4 = list(makeSymbol("IDIX-LOCK"), makeSymbol("IDIX-COUNT"), makeSymbol("IDIX-NEXT-ID"), makeSymbol("IDIX-OLD-OBJECTS"), makeSymbol("IDIX-NEW-OBJECTS"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-IDIX-LOCK"), makeSymbol("_CSETF-IDIX-COUNT"), makeSymbol("_CSETF-IDIX-NEXT-ID"), makeSymbol("_CSETF-IDIX-OLD-OBJECTS"), makeSymbol("_CSETF-IDIX-NEW-OBJECTS"));
  public static final SubLSymbol $sym6$PRINT_ID_INDEX = makeSymbol("PRINT-ID-INDEX");
  public static final SubLSymbol $sym7$ID_INDEX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ID-INDEX-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$IDIX_LOCK = makeSymbol("IDIX-LOCK");
  public static final SubLSymbol $sym9$_CSETF_IDIX_LOCK = makeSymbol("_CSETF-IDIX-LOCK");
  public static final SubLSymbol $sym10$IDIX_COUNT = makeSymbol("IDIX-COUNT");
  public static final SubLSymbol $sym11$_CSETF_IDIX_COUNT = makeSymbol("_CSETF-IDIX-COUNT");
  public static final SubLSymbol $sym12$IDIX_NEXT_ID = makeSymbol("IDIX-NEXT-ID");
  public static final SubLSymbol $sym13$_CSETF_IDIX_NEXT_ID = makeSymbol("_CSETF-IDIX-NEXT-ID");
  public static final SubLSymbol $sym14$IDIX_OLD_OBJECTS = makeSymbol("IDIX-OLD-OBJECTS");
  public static final SubLSymbol $sym15$_CSETF_IDIX_OLD_OBJECTS = makeSymbol("_CSETF-IDIX-OLD-OBJECTS");
  public static final SubLSymbol $sym16$IDIX_NEW_OBJECTS = makeSymbol("IDIX-NEW-OBJECTS");
  public static final SubLSymbol $sym17$_CSETF_IDIX_NEW_OBJECTS = makeSymbol("_CSETF-IDIX-NEW-OBJECTS");
  public static final SubLSymbol $kw18$LOCK = makeKeyword("LOCK");
  public static final SubLSymbol $kw19$COUNT = makeKeyword("COUNT");
  public static final SubLSymbol $kw20$NEXT_ID = makeKeyword("NEXT-ID");
  public static final SubLSymbol $kw21$OLD_OBJECTS = makeKeyword("OLD-OBJECTS");
  public static final SubLSymbol $kw22$NEW_OBJECTS = makeKeyword("NEW-OBJECTS");
  public static final SubLString $str23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str24$__ = makeString("#<");
  public static final SubLSymbol $kw25$STREAM = makeKeyword("STREAM");
  public static final SubLString $str26$COUNT_ = makeString("COUNT=");
  public static final SubLString $str27$_NEXT_ = makeString(" NEXT=");
  public static final SubLSymbol $kw28$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym29$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym30$ID_INDEX_OLD_OBJECTS = makeSymbol("ID-INDEX-OLD-OBJECTS");
  public static final SubLSymbol $sym31$DO_ID_INDEX_OLD_OBJECTS = makeSymbol("DO-ID-INDEX-OLD-OBJECTS");
  public static final SubLSymbol $sym32$ID_INDEX_NEW_OBJECTS = makeSymbol("ID-INDEX-NEW-OBJECTS");
  public static final SubLSymbol $sym33$DO_ID_INDEX_NEW_OBJECTS = makeSymbol("DO-ID-INDEX-NEW-OBJECTS");
  public static final SubLList $list34 = list(makeSymbol("ID-INDEX"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym35$ID_INDEX_LOCK = makeUninternedSymbol("ID-INDEX-LOCK");
  public static final SubLSymbol $sym36$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym37$ID_INDEX_LOCK = makeSymbol("ID-INDEX-LOCK");
  public static final SubLSymbol $sym38$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLSymbol $sym39$WITH_ID_INDEX_LOCKED = makeSymbol("WITH-ID-INDEX-LOCKED");
  public static final SubLInteger $int40$100 = makeInteger(100);
  public static final SubLSymbol $sym41$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLString $str42$ID_INDEX = makeString("ID-INDEX");
  public static final SubLSymbol $sym43$_ID_INDEX_EMPTY_LIST_ = makeSymbol("*ID-INDEX-EMPTY-LIST*");
  public static final SubLString $str44$THE_EMPTY_LIST = makeString("THE-EMPTY-LIST");
  public static final SubLSymbol $sym45$ID_INDEX_TOMBSTONE_P = makeSymbol("ID-INDEX-TOMBSTONE-P");
  public static final SubLSymbol $sym46$DO_ID_INDEX = makeSymbol("DO-ID-INDEX");
  public static final SubLList $list47 = list(makeSymbol("NEW-ID-INDEX-OLD-OBJECTS-ITERATOR"), makeSymbol("NEW-ID-INDEX-NEW-OBJECTS-ITERATOR"));
  public static final SubLList $list48 = list(makeSymbol("NEW-ID-INDEX-OLD-OBJECTS-VALUES-ITERATOR"), makeSymbol("NEW-ID-INDEX-NEW-OBJECTS-VALUES-ITERATOR"));
  public static final SubLSymbol $sym49$ITERATE_ID_INDEX_OLD_OBJECTS_NECESSARY = makeSymbol("ITERATE-ID-INDEX-OLD-OBJECTS-NECESSARY");
  public static final SubLList $list50 = list(makeSymbol("ID"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym51$BOOLEAN = makeSymbol("BOOLEAN");
  public static final SubLList $list52 = list(list(makeSymbol("ID"), makeSymbol("OBJECT"), makeSymbol("ID-INDEX"), makeSymbol("&KEY"), list(makeSymbol("TOMBSTONE"), makeKeyword("SKIP")), makeSymbol("ORDERED"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list53 = list(makeKeyword("TOMBSTONE"), makeKeyword("ORDERED"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw54$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw55$TOMBSTONE = makeKeyword("TOMBSTONE");
  public static final SubLSymbol $kw56$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw57$ORDERED = makeKeyword("ORDERED");
  public static final SubLSymbol $kw58$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $kw59$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym60$OLD_DO_ID_INDEX = makeSymbol("OLD-DO-ID-INDEX");
  public static final SubLSymbol $sym61$IDX = makeUninternedSymbol("IDX");
  public static final SubLSymbol $sym62$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym63$ID_INDEX_OBJECTS_EMPTY_P = makeSymbol("ID-INDEX-OBJECTS-EMPTY-P");
  public static final SubLSymbol $sym64$IDX = makeUninternedSymbol("IDX");
  public static final SubLSymbol $sym65$MESS = makeUninternedSymbol("MESS");
  public static final SubLSymbol $sym66$TOTAL = makeUninternedSymbol("TOTAL");
  public static final SubLSymbol $sym67$SOFAR = makeUninternedSymbol("SOFAR");
  public static final SubLSymbol $sym68$ID_INDEX_COUNT = makeSymbol("ID-INDEX-COUNT");
  public static final SubLList $list69 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym70$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list71 = list(makeSymbol("STRINGP"));
  public static final SubLSymbol $sym72$NOTING_PERCENT_PROGRESS = makeSymbol("NOTING-PERCENT-PROGRESS");
  public static final SubLSymbol $sym73$NOTE_PERCENT_PROGRESS = makeSymbol("NOTE-PERCENT-PROGRESS");
  public static final SubLSymbol $sym74$CINC = makeSymbol("CINC");
  public static final SubLList $list75 = list(list(makeSymbol("ID"), makeSymbol("OBJECT"), makeSymbol("ID-INDEX"), makeSymbol("&KEY"), list(makeSymbol("TOMBSTONE"), makeKeyword("SKIP")), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list76 = list(makeKeyword("TOMBSTONE"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $sym77$IDX = makeUninternedSymbol("IDX");
  public static final SubLSymbol $sym78$ID_INDEX_OLD_OBJECTS_EMPTY_P = makeSymbol("ID-INDEX-OLD-OBJECTS-EMPTY-P");
  public static final SubLSymbol $sym79$DO_VECTOR_INDEX = makeSymbol("DO-VECTOR-INDEX");
  public static final SubLSymbol $sym80$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym81$ID_INDEX_SKIP_TOMBSTONES_P = makeSymbol("ID-INDEX-SKIP-TOMBSTONES-P");
  public static final SubLSymbol $sym82$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym83$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym84$IDX = makeUninternedSymbol("IDX");
  public static final SubLSymbol $sym85$MESS = makeUninternedSymbol("MESS");
  public static final SubLSymbol $sym86$TOTAL = makeUninternedSymbol("TOTAL");
  public static final SubLSymbol $sym87$SOFAR = makeUninternedSymbol("SOFAR");
  public static final SubLSymbol $sym88$ID_INDEX_OLD_OBJECT_COUNT = makeSymbol("ID-INDEX-OLD-OBJECT-COUNT");
  public static final SubLList $list89 = list(makeSymbol("DO-ID-INDEX-OLD-OBJECTS"), makeSymbol("DO-ID-INDEX-NEW-OBJECTS"));
  public static final SubLSymbol $sym90$IDX = makeUninternedSymbol("IDX");
  public static final SubLSymbol $sym91$MESS = makeUninternedSymbol("MESS");
  public static final SubLSymbol $sym92$TOTAL = makeUninternedSymbol("TOTAL");
  public static final SubLSymbol $sym93$SOFAR = makeUninternedSymbol("SOFAR");
  public static final SubLSymbol $sym94$ID_INDEX_NEW_OBJECT_COUNT = makeSymbol("ID-INDEX-NEW-OBJECT-COUNT");
  public static final SubLSymbol $sym95$IDX = makeUninternedSymbol("IDX");
  public static final SubLSymbol $sym96$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym97$IDX = makeUninternedSymbol("IDX");
  public static final SubLSymbol $sym98$NEW = makeUninternedSymbol("NEW");
  public static final SubLSymbol $sym99$END_ID = makeUninternedSymbol("END-ID");
  public static final SubLSymbol $sym100$DEFAULT = makeUninternedSymbol("DEFAULT");
  public static final SubLSymbol $sym101$ID_INDEX_NEW_OBJECTS_EMPTY_P = makeSymbol("ID-INDEX-NEW-OBJECTS-EMPTY-P");
  public static final SubLSymbol $sym102$ID_INDEX_NEW_ID_THRESHOLD = makeSymbol("ID-INDEX-NEW-ID-THRESHOLD");
  public static final SubLSymbol $sym103$ID_INDEX_NEXT_ID = makeSymbol("ID-INDEX-NEXT-ID");
  public static final SubLSymbol $sym104$FUNLESS = makeSymbol("FUNLESS");
  public static final SubLSymbol $sym105$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym106$_ = makeSymbol("<");
  public static final SubLSymbol $sym107$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym108$GETHASH_WITHOUT_VALUES = makeSymbol("GETHASH-WITHOUT-VALUES");
  public static final SubLString $str109$Setting__TOMBSTONE_to__A_requires = makeString("Setting :TOMBSTONE to ~A requires that :ORDERED be set to T");
  public static final SubLSymbol $sym110$IDX = makeUninternedSymbol("IDX");
  public static final SubLSymbol $sym111$DO_HASH_TABLE = makeSymbol("DO-HASH-TABLE");
  public static final SubLSymbol $sym112$ID_INDEX_NEW_OBJECT_IDS = makeSymbol("ID-INDEX-NEW-OBJECT-IDS");
  public static final SubLSymbol $sym113$IDX = makeUninternedSymbol("IDX");
  public static final SubLSymbol $sym114$NEW_DO_ID_INDEX = makeSymbol("NEW-DO-ID-INDEX");
  public static final SubLSymbol $sym115$MESS = makeUninternedSymbol("MESS");
  public static final SubLSymbol $sym116$TOTAL = makeUninternedSymbol("TOTAL");
  public static final SubLSymbol $sym117$SOFAR = makeUninternedSymbol("SOFAR");
  public static final SubLSymbol $sym118$TOMB = makeUninternedSymbol("TOMB");
  public static final SubLSymbol $sym119$ORD = makeUninternedSymbol("ORD");
  public static final SubLSymbol $sym120$STATE_VAR = makeUninternedSymbol("STATE-VAR");
  public static final SubLSymbol $sym121$DO_ID_INDEX_NEXT_ID = makeSymbol("DO-ID-INDEX-NEXT-ID");
  public static final SubLList $list122 = list(NIL, NIL);
  public static final SubLSymbol $sym123$DO_ID_INDEX_NEXT_STATE = makeSymbol("DO-ID-INDEX-NEXT-STATE");
  public static final SubLList $list124 = list(NIL);
  public static final SubLSymbol $sym125$DO_ID_INDEX_STATE_OBJECT = makeSymbol("DO-ID-INDEX-STATE-OBJECT");
  public static final SubLSymbol $sym126$DO_ID_INDEX_OBJECT_VALID_ = makeSymbol("DO-ID-INDEX-OBJECT-VALID?");
  public static final SubLString $str127$unexpected_new_do_id_index_iterat = makeString("unexpected new-do-id-index iteration state ~S");
  public static final SubLInteger $int128$128 = makeInteger(128);
  public static final SubLSymbol $sym129$CFASL_INPUT_ID_INDEX = makeSymbol("CFASL-INPUT-ID-INDEX");
  public static final SubLSymbol $sym130$CFASL_OUTPUT_OBJECT_ID_INDEX_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-ID-INDEX-METHOD");
  public static final SubLString $str131$Expected__A_old_elements__got__A_ = makeString("Expected ~A old elements, got ~A instead.");
  public static final SubLString $str132$Expected__A_new_elements__got__A_ = makeString("Expected ~A new elements, got ~A instead.");
  public static final SubLString $str133$The_new_ID_index_should_have__A_e = makeString("The new ID index should have ~A entries, but it has ~A.");
  public static final SubLString $str134$The_new_ID_index_should_have_an_o = makeString("The new ID index should have an old space size of ~A, not ~A.");
  public static final SubLSymbol $sym135$TEST_ID_INDEX_CFASL_SERIALIZATION = makeSymbol("TEST-ID-INDEX-CFASL-SERIALIZATION");
  public static final SubLSymbol $kw136$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw137$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw138$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw139$KB = makeKeyword("KB");
  public static final SubLSymbol $kw140$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw141$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list142 = list(list(list(makeInteger(100), TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(100), TWENTY_INTEGER, makeSymbol("TO-HEX-STRING"), EQUAL), makeKeyword("SUCCESS")));
  public static final SubLSymbol $sym143$TO_STRING = makeSymbol("TO-STRING");
  public static final SubLString $str144$We_did_not_get_an_ID_index_back__ = makeString("We did not get an ID index back, but got ~A instead.");
  public static final SubLString $str145$The_old_ID_index__A_does_not_have = makeString("The old ID index ~A does not have the same number of elements as the new ID index ~A.");
  public static final SubLSymbol $kw146$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLString $str147$Compacting_ID_index = makeString("Compacting ID index");
  public static final SubLSymbol $sym148$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym149$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLString $str150$Updating_object_IDs = makeString("Updating object IDs");
  public static final SubLSymbol $kw151$ALL = makeKeyword("ALL");
  public static final SubLList $list152 = list(makeKeyword("ALL"), makeKeyword("OLD"), makeKeyword("NEW"));
  public static final SubLString $str153$Type_must_be_one_of_____ALL__OLD_ = makeString("Type must be one of -- :ALL :OLD :NEW");
  public static final SubLSymbol $kw154$NEW = makeKeyword("NEW");
  public static final SubLList $list155 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));
  public static final SubLSymbol $kw156$OLD = makeKeyword("OLD");
  public static final SubLSymbol $sym157$TEST_ID_INDEX_MISSING_IDS = makeSymbol("TEST-ID-INDEX-MISSING-IDS");
  public static final SubLList $list158 = list(list(list(makeInteger(100), TWENTY_INTEGER, TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(1000), makeInteger(200), makeInteger(200)), makeKeyword("SUCCESS")), list(list(makeInteger(255), ZERO_INTEGER, makeInteger(40)), makeKeyword("SUCCESS")));
  public static final SubLString $str159$ID__A_is_missing__it_is__A_ = makeString("ID ~A is missing; it is ~A.");
  public static final SubLString $str160$expected_to_be_present = makeString("expected to be present");
  public static final SubLString $str161$expected_to_be_absent = makeString("expected to be absent");
  public static final SubLList $list162 = list(makeSymbol("KEY"), makeSymbol("ID"));
  public static final SubLSymbol $sym163$TEST_NEW_INDEX_FROM_REVERSE_INDEX = makeSymbol("TEST-NEW-INDEX-FROM-REVERSE-INDEX");
  public static final SubLString $str164$The_old_ID_index__A_is_of_a_diffe = makeString("The old ID index ~A is of a different size than the new ID index ~A.");
  public static final SubLSymbol $kw165$NOT_FOUND = makeKeyword("NOT-FOUND");
  public static final SubLString $str166$The_reverse_index_for__A_does_not = makeString("The reverse index for ~A does not contain ~A.");
  public static final SubLString $str167$The_new_ID_index_does_not_have__A = makeString("The new ID index does not have ~A at location ~A.");
  public static final SubLString $str168$There_is_a_mismatch_between_the__ = makeString("There is a mismatch between the ~A-nth expected next ID, ~A and the actual ID suggested ~A.");
  public static final SubLSymbol $sym169$TEST_DO_ID_INDEX_WITH_TOMBSTONES = makeSymbol("TEST-DO-ID-INDEX-WITH-TOMBSTONES");
  public static final SubLSymbol $kw170$RIP = makeKeyword("RIP");
  public static final SubLString $str171$Error__the_ID_range_is_not_truely = makeString("Error, the ID range is not truely consecutive; expected ~A got ~A.");
  public static final SubLString $str172$Error_at_index__A__expected_tombs = makeString("Error at index ~A, expected tombstone, got ~A.");
  public static final SubLString $str173$Error_at_index__A__expected_objec = makeString("Error at index ~A, expected object, got tombstone.");
  public static final SubLString $str174$There_are_holes_that_we_did_not_s = makeString("There are holes that we did not see: ~A were missing.");
  public static final SubLString $str175$Error__ID__A_is_not_in_line_with_ = makeString("Error, ID ~A is not in line with counter ~A.");
  public static final SubLString $str176$_DONE_should_have_taken_us_to__A_ = makeString(":DONE should have taken us to ~A but it got us to ~A.");
  public static final SubLString $str177$Hey__we_deleted_everything_and_th = makeString("Hey, we deleted everything and the ID index is not empty?");
  public static final SubLString $str178$Error__an_empty_ID_index_contains = makeString("Error, an empty ID index contains non-tombstone ~A???");
  public static final SubLString $str179$Hey___A______A__they_did_not_show = makeString("Hey, ~A =/= ~A; they did not show us all the tombstones ...!");
  public static final SubLString $str180$_X = makeString("~X");

  //// Initializers

  public void declareFunctions() {
    declare_id_index_file();
  }

  public void initializeVariables() {
    init_id_index_file();
  }

  public void runTopLevelForms() {
    setup_id_index_file();
  }

}
