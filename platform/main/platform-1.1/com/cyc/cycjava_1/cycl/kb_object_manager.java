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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.api_control_vars;
//dm import com.cyc.cycjava_1.cycl.cache;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.file_vector;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class kb_object_manager extends SubLTranslatedFile {

  //// Constructor

  private kb_object_manager() {}
  public static final SubLFile me = new kb_object_manager();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_object_manager";

  //// Definitions

  public static final class $kb_object_manager_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $name; }
    public SubLObject getField3() { return $content_lock; }
    public SubLObject getField4() { return $lru_size_percentage; }
    public SubLObject getField5() { return $content_table; }
    public SubLObject getField6() { return $usage_table; }
    public SubLObject getField7() { return $lru_information; }
    public SubLObject getField8() { return $file_vector; }
    public SubLObject getField9() { return $id_threshold; }
    public SubLObject getField10() { return $load_func; }
    public SubLObject getField11() { return $meter_swap_timeP; }
    public SubLObject getField12() { return $swap_time; }
    public SubLObject getField13() { return $dummy1; }
    public SubLObject getField14() { return $dummy2; }
    public SubLObject getField15() { return $dummy3; }
    public SubLObject setField2(SubLObject value) { return $name = value; }
    public SubLObject setField3(SubLObject value) { return $content_lock = value; }
    public SubLObject setField4(SubLObject value) { return $lru_size_percentage = value; }
    public SubLObject setField5(SubLObject value) { return $content_table = value; }
    public SubLObject setField6(SubLObject value) { return $usage_table = value; }
    public SubLObject setField7(SubLObject value) { return $lru_information = value; }
    public SubLObject setField8(SubLObject value) { return $file_vector = value; }
    public SubLObject setField9(SubLObject value) { return $id_threshold = value; }
    public SubLObject setField10(SubLObject value) { return $load_func = value; }
    public SubLObject setField11(SubLObject value) { return $meter_swap_timeP = value; }
    public SubLObject setField12(SubLObject value) { return $swap_time = value; }
    public SubLObject setField13(SubLObject value) { return $dummy1 = value; }
    public SubLObject setField14(SubLObject value) { return $dummy2 = value; }
    public SubLObject setField15(SubLObject value) { return $dummy3 = value; }
    public SubLObject $name = NIL;
    public SubLObject $content_lock = NIL;
    public SubLObject $lru_size_percentage = NIL;
    public SubLObject $content_table = NIL;
    public SubLObject $usage_table = NIL;
    public SubLObject $lru_information = NIL;
    public SubLObject $file_vector = NIL;
    public SubLObject $id_threshold = NIL;
    public SubLObject $load_func = NIL;
    public SubLObject $meter_swap_timeP = NIL;
    public SubLObject $swap_time = NIL;
    public SubLObject $dummy1 = NIL;
    public SubLObject $dummy2 = NIL;
    public SubLObject $dummy3 = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($kb_object_manager_native.class, $sym3$KB_OBJECT_MANAGER, $sym4$KB_OBJECT_MANAGER_P, $list5, $list6, new String[] {"$name", "$content_lock", "$lru_size_percentage", "$content_table", "$usage_table", "$lru_information", "$file_vector", "$id_threshold", "$load_func", "$meter_swap_timeP", "$swap_time", "$dummy1", "$dummy2", "$dummy3"}, $list7, $list8, $sym9$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static SubLSymbol $dtp_kb_object_manager$ = null;

  public static final class $kb_object_manager_p$UnaryFunction extends UnaryFunction {
    public $kb_object_manager_p$UnaryFunction() { super(extractFunctionNamed("KB-OBJECT-MANAGER-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32055"); }
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject kbom_name(SubLObject object) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.getField2();
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject kbom_content_lock(SubLObject object) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.getField3();
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject kbom_lru_size_percentage(SubLObject object) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.getField4();
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject kbom_content_table(SubLObject object) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.getField5();
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject kbom_usage_table(SubLObject object) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.getField6();
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject kbom_lru_information(SubLObject object) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.getField7();
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject kbom_file_vector(SubLObject object) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.getField8();
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject kbom_id_threshold(SubLObject object) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.getField9();
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject kbom_load_func(SubLObject object) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.getField10();
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject kbom_meter_swap_timeP(SubLObject object) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.getField11();
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject _csetf_kbom_name(SubLObject object, SubLObject value) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject _csetf_kbom_content_lock(SubLObject object, SubLObject value) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject _csetf_kbom_lru_size_percentage(SubLObject object, SubLObject value) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject _csetf_kbom_content_table(SubLObject object, SubLObject value) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject _csetf_kbom_usage_table(SubLObject object, SubLObject value) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject _csetf_kbom_lru_information(SubLObject object, SubLObject value) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject _csetf_kbom_file_vector(SubLObject object, SubLObject value) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject _csetf_kbom_id_threshold(SubLObject object, SubLObject value) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject _csetf_kbom_load_func(SubLObject object, SubLObject value) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.setField10(value);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject _csetf_kbom_meter_swap_timeP(SubLObject object, SubLObject value) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.setField11(value);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject _csetf_kbom_swap_time(SubLObject object, SubLObject value) {
    checkType(object, $sym4$KB_OBJECT_MANAGER_P);
    return object.setField12(value);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2331) 
  public static final SubLObject make_kb_object_manager(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $kb_object_manager_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw39$NAME)) {
            _csetf_kbom_name(v_new, current_value);
          } else if (pcase_var.eql($kw40$CONTENT_LOCK)) {
            _csetf_kbom_content_lock(v_new, current_value);
          } else if (pcase_var.eql($kw41$LRU_SIZE_PERCENTAGE)) {
            _csetf_kbom_lru_size_percentage(v_new, current_value);
          } else if (pcase_var.eql($kw42$CONTENT_TABLE)) {
            _csetf_kbom_content_table(v_new, current_value);
          } else if (pcase_var.eql($kw43$USAGE_TABLE)) {
            _csetf_kbom_usage_table(v_new, current_value);
          } else if (pcase_var.eql($kw44$LRU_INFORMATION)) {
            _csetf_kbom_lru_information(v_new, current_value);
          } else if (pcase_var.eql($kw45$FILE_VECTOR)) {
            _csetf_kbom_file_vector(v_new, current_value);
          } else if (pcase_var.eql($kw46$ID_THRESHOLD)) {
            _csetf_kbom_id_threshold(v_new, current_value);
          } else if (pcase_var.eql($kw47$LOAD_FUNC)) {
            _csetf_kbom_load_func(v_new, current_value);
          } else if (pcase_var.eql($kw48$METER_SWAP_TIME_)) {
            _csetf_kbom_meter_swap_timeP(v_new, current_value);
          } else if (pcase_var.eql($kw49$SWAP_TIME)) {
            _csetf_kbom_swap_time(v_new, current_value);
          } else if (pcase_var.eql($kw50$DUMMY1)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32024");
          } else if (pcase_var.eql($kw51$DUMMY2)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32025");
          } else if (pcase_var.eql($kw52$DUMMY3)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32026");
          } else {
            Errors.error($str53$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 2795) 
  public static final SubLObject new_kb_object_manager(SubLObject name, SubLObject size, SubLObject lru_size_percentage, SubLObject load_func, SubLObject exact_sizeP) {
    checkType(name, $sym54$STRINGP);
    checkType(size, $sym55$NON_NEGATIVE_INTEGER_P);
    checkType(lru_size_percentage, $sym56$POSITIVE_INTEGER_P);
    checkType(load_func, $sym57$FBOUNDP);
    {
      SubLObject kbom = make_kb_object_manager(UNPROVIDED);
      _csetf_kbom_name(kbom, name);
      _csetf_kbom_content_lock(kbom, Locks.make_lock(Sequences.cconcatenate(name, $str58$_content_manager_lock)));
      _csetf_kbom_lru_size_percentage(kbom, lru_size_percentage);
      setup_kb_object_content_table(kbom, size, exact_sizeP);
      _csetf_kbom_usage_table(kbom, $kw59$UNINITIALIZED);
      _csetf_kbom_file_vector(kbom, NIL);
      _csetf_kbom_id_threshold(kbom, ZERO_INTEGER);
      _csetf_kbom_load_func(kbom, load_func);
      _csetf_kbom_meter_swap_timeP(kbom, NIL);
      _csetf_kbom_swap_time(kbom, NIL);
      return kbom;
    }
  }

  /** @param EXACT?; whether SIZE is the exact desired size.  If so, we'll allocate the table
   in static space, otherwise we'll wait for @xref optimize-kb-object-content-table to do that. */
  @SubL(source = "cycl/kb-object-manager.lisp", position = 3868) 
  public static final SubLObject setup_kb_object_content_table(SubLObject kbom, SubLObject size, SubLObject exactP) {
    {
      SubLObject did_setupP = NIL;
      SubLObject lock = kb_object_manager_content_lock(kbom);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        {
          SubLObject content_table = kb_object_manager_content_table(kbom);
          if ((NIL == id_index.id_index_p(content_table))) {
            _csetf_kbom_content_table(kbom, id_index.new_id_index(size, ZERO_INTEGER));
            did_setupP = T;
          }
          did_setupP = setup_kb_object_content_support(kbom, NIL, size);
        }
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return did_setupP;
    }
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 4511) 
  private static SubLSymbol $min_kb_object_lru_size$ = null;

  @SubL(source = "cycl/kb-object-manager.lisp", position = 4638) 
  public static final SubLObject setup_kb_object_content_support(SubLObject kbom, SubLObject initialize_usage_countsP, SubLObject size) {
    if ((initialize_usage_countsP == UNPROVIDED)) {
      initialize_usage_countsP = NIL;
    }
    if ((size == UNPROVIDED)) {
      size = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(size.isFixnum()))) {
        size = id_index.id_index_new_id_threshold(kb_object_manager_content_table(kbom));
      }
      {
        SubLObject did_setupP = NIL;
        if ((NIL != initialize_usage_countsP)) {
          if ((NIL == id_index.id_index_p(kb_object_manager_usage_table(kbom)))) {
            _csetf_kbom_usage_table(kbom, id_index.new_id_index(size, ZERO_INTEGER));
            did_setupP = T;
          }
        }
        if ((NIL == cache.cache_p(kb_object_manager_lru_information(kbom)))) {
          {
            SubLObject lru_size = Numbers.max($min_kb_object_lru_size$.getGlobalValue(), Numbers.multiply(Numbers.integerDivide(size, $int61$100), kb_object_manager_lru_size_percentage(kbom)));
            {
              SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
              try {
                Storage.$current_area$.bind(Storage.get_static_area(), thread);
                _csetf_kbom_lru_information(kbom, cache.new_preallocated_cache(lru_size, Symbols.symbol_function(EQ)));
              } finally {
                Storage.$current_area$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return did_setupP;
      }
    }
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 5510) 
  public static final SubLObject initialize_kb_object_hl_store_cache(SubLObject kbom, SubLObject content_filename, SubLObject index_filename) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL != string_utilities.ends_with(content_filename, $str62$cfasl, UNPROVIDED))) {
          Errors.error($str63$Got__s__expected_an_extensionless, content_filename);
        }
      }
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL != string_utilities.ends_with(index_filename, $str62$cfasl, UNPROVIDED))) {
          Errors.error($str63$Got__s__expected_an_extensionless, index_filename);
        }
      }
      {
        SubLObject kb_object_cfasl_file = misc_utilities.get_hl_store_cache_filename(content_filename, $str62$cfasl);
        SubLObject kb_object_index_file = misc_utilities.get_hl_store_cache_filename(index_filename, $str62$cfasl);
        if (((NIL != Filesys.probe_file(kb_object_cfasl_file))
             && (NIL != Filesys.probe_file(kb_object_index_file)))) {
          {
            SubLObject old_file_vector = kbom_file_vector(kbom);
            if ((NIL != file_vector.file_vector_p(old_file_vector))) {
              file_vector.close_file_vector(old_file_vector);
            }
          }
          {
            SubLObject v_file_vector = new_kb_object_content_file_vector(kb_object_cfasl_file, kb_object_index_file);
            _csetf_kbom_file_vector(kbom, v_file_vector);
            _csetf_kbom_id_threshold(kbom, file_vector.file_vector_length(v_file_vector));
            return kb_object_content_file_vector_p(v_file_vector);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 7876) 
  public static final SubLObject clear_kb_object_content_table(SubLObject kbom) {
    {
      SubLObject result = NIL;
      SubLObject lock = kb_object_manager_content_lock(kbom);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        {
          SubLObject usage_table = kb_object_manager_usage_table(kbom);
          if ((NIL != id_index.id_index_p(usage_table))) {
            id_index.clear_id_index(usage_table);
          }
        }
        {
          SubLObject lru_information = kb_object_manager_lru_information(kbom);
          if ((NIL != cache.cache_p(lru_information))) {
            cache.cache_clear(lru_information);
          }
        }
        {
          SubLObject content_table = kb_object_manager_content_table(kbom);
          result = id_index.clear_id_index(content_table);
        }
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 8421) 
  public static final SubLObject kb_object_manager_name(SubLObject kbom) {
    checkType(kbom, $sym4$KB_OBJECT_MANAGER_P);
    return kbom_name(kbom);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 8546) 
  public static final SubLObject kb_object_manager_content_lock(SubLObject kbom) {
    checkType(kbom, $sym4$KB_OBJECT_MANAGER_P);
    return kbom_content_lock(kbom);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 8675) 
  public static final SubLObject kb_object_manager_lru_size_percentage(SubLObject kbom) {
    checkType(kbom, $sym4$KB_OBJECT_MANAGER_P);
    return kbom_lru_size_percentage(kbom);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 8818) 
  public static final SubLObject kb_object_manager_content_table(SubLObject kbom) {
    checkType(kbom, $sym4$KB_OBJECT_MANAGER_P);
    return kbom_content_table(kbom);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 8949) 
  public static final SubLObject kb_object_manager_usage_table(SubLObject kbom) {
    checkType(kbom, $sym4$KB_OBJECT_MANAGER_P);
    return kbom_usage_table(kbom);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 9076) 
  public static final SubLObject kb_object_manager_lru_information(SubLObject kbom) {
    checkType(kbom, $sym4$KB_OBJECT_MANAGER_P);
    return kbom_lru_information(kbom);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 9211) 
  public static final SubLObject kb_object_manager_file_vector(SubLObject kbom) {
    checkType(kbom, $sym4$KB_OBJECT_MANAGER_P);
    return kbom_file_vector(kbom);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 9338) 
  public static final SubLObject kb_object_manager_id_threshold(SubLObject kbom) {
    checkType(kbom, $sym4$KB_OBJECT_MANAGER_P);
    return kbom_id_threshold(kbom);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 9467) 
  public static final SubLObject kb_object_manager_load_func(SubLObject kbom) {
    checkType(kbom, $sym4$KB_OBJECT_MANAGER_P);
    return kbom_load_func(kbom);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 9590) 
  public static final SubLObject kb_object_manager_meter_swap_timeP(SubLObject kbom) {
    checkType(kbom, $sym4$KB_OBJECT_MANAGER_P);
    return kbom_meter_swap_timeP(kbom);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 9852) 
  public static final SubLObject kb_object_usage_counts_enabledP(SubLObject kbom) {
    return id_index.id_index_p(kb_object_manager_usage_table(kbom));
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 9983) 
  public static final SubLObject cached_kb_object_count(SubLObject kbom) {
    {
      SubLObject content_table = kb_object_manager_content_table(kbom);
      if ((NIL == id_index.id_index_p(content_table))) {
        return ZERO_INTEGER;
      }
      return id_index.id_index_count(content_table);
    }
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 10346) 
  public static final SubLObject lookup_kb_object_content(SubLObject kbom, SubLObject id) {
    {
      SubLObject content = NIL;
      SubLObject lock = kb_object_manager_content_lock(kbom);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        {
          SubLObject content_table = kb_object_manager_content_table(kbom);
          content = id_index.id_index_lookup(content_table, id, misc_utilities.uninitialized());
          if ((NIL != misc_utilities.uninitialized_p(content))) {
            if ((NIL != is_lru_cachable_kb_object_content_idP(kbom, id))) {
              swap_in_kb_object_content(kbom, id);
              content = id_index.id_index_lookup(content_table, id, UNPROVIDED);
            } else {
              content = NIL;
            }
          } else {
            update_kb_object_usage(kbom, id);
          }
        }
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return content;
    }
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 10948) 
  public static final SubLObject kb_object_manager_unbuiltP(SubLObject kbom) {
    checkType(kbom, $sym4$KB_OBJECT_MANAGER_P);
    if ((NIL != file_vector.file_vector_p(kb_object_manager_file_vector(kbom)))) {
      return NIL;
    }
    {
      SubLObject v_id_index = kb_object_manager_content_table(kbom);
      if (((NIL != id_index.id_index_p(v_id_index))
           && id_index.id_index_count(v_id_index).isPositive())) {
        return NIL;
      }
    }
    return T;
  }

  /** Note that ID will be used as the id for KB-OBJECT-CONTENT. */
  @SubL(source = "cycl/kb-object-manager.lisp", position = 11913) 
  public static final SubLObject register_kb_object_content(SubLObject kbom, SubLObject id, SubLObject kb_object_content) {
    {
      SubLObject lock = kb_object_manager_content_lock(kbom);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        id_index.id_index_enter(kb_object_manager_content_table(kbom), id, kb_object_content);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return kb_object_content;
  }

  /** Note that ID is not in use as an KB-OBJECT-CONTENT id */
  @SubL(source = "cycl/kb-object-manager.lisp", position = 12202) 
  public static final SubLObject deregister_kb_object_content(SubLObject kbom, SubLObject id) {
    {
      SubLObject deregistration = NIL;
      SubLObject lock = kb_object_manager_content_lock(kbom);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        deregistration = id_index.id_index_remove(kb_object_manager_content_table(kbom), id);
        drop_kb_object_usage(kbom, id);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return deregistration;
    }
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 12542) 
  public static final SubLObject new_kb_object_content_file_vector(SubLObject cfasl_file, SubLObject index_file) {
    return file_vector.new_file_vector(cfasl_file, index_file, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 12841) 
  public static final SubLObject kb_object_content_file_vector_p(SubLObject object) {
    return file_vector.file_vector_p(object);
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 12931) 
  public static final SubLObject kb_object_content_file_vector_lookup(SubLObject kbom, SubLObject id) {
    {
      SubLObject cfasl_stream = file_vector.position_file_vector(kb_object_manager_file_vector(kbom), id);
      SubLObject kb_object_id = cfasl.cfasl_input(cfasl_stream, UNPROVIDED, UNPROVIDED);
      if ((!((kb_object_id.isFixnum()
             && kb_object_id.numE(id))))) {
        Errors.error($str66$We_did_not_manage_to_swap_the_KB_, id, cfasl_stream, kb_object_id);
      }
      {
        SubLObject load_func = kb_object_manager_load_func(kbom);
        Functions.funcall(load_func, id, cfasl_stream);
      }
    }
    return id;
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 13492) 
  public static final SubLObject is_lru_cachable_kb_object_content_idP(SubLObject kbom, SubLObject id) {
    return Numbers.numL(id, kb_object_manager_id_threshold(kbom));
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 13634) 
  public static final SubLObject update_kb_object_usage(SubLObject kbom, SubLObject id) {
    if ((NIL != kb_object_usage_counts_enabledP(kbom))) {
      increment_kb_object_usage_count(kbom, id);
    }
    {
      SubLObject lru_information = kb_object_manager_lru_information(kbom);
      if ((NIL != cache.cache_p(lru_information))) {
        if ((NIL != is_lru_cachable_kb_object_content_idP(kbom, id))) {
          cache.cache_get_without_values(lru_information, id, UNPROVIDED);
        }
      }
    }
    return id;
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 14037) 
  public static final SubLObject drop_kb_object_usage(SubLObject kbom, SubLObject id) {
    {
      SubLObject lru_information = kb_object_manager_lru_information(kbom);
      if ((NIL != cache.cache_p(lru_information))) {
        if ((NIL != is_lru_cachable_kb_object_content_idP(kbom, id))) {
          cache.cache_remove(lru_information, id);
        }
      }
    }
    return id;
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 14473) 
  public static final SubLObject mark_kb_object_content_as_muted(SubLObject kbom, SubLObject id) {
    {
      SubLObject lru_information = kb_object_manager_lru_information(kbom);
      if ((NIL != cache.cache_p(lru_information))) {
        if ((NIL != is_lru_cachable_kb_object_content_idP(kbom, id))) {
          cache.cache_remove(lru_information, id);
        }
      }
    }
    return id;
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 15483) 
  public static final SubLObject swap_in_kb_object_content(SubLObject kbom, SubLObject id) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
        SubLObject _prev_bind_1 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
        SubLObject _prev_bind_2 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
        SubLObject _prev_bind_3 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
        SubLObject _prev_bind_4 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
        SubLObject _prev_bind_5 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
        try {
          api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
          api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
          api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
          api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
          api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
          api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
          if ((NIL != kb_object_manager_meter_swap_timeP(kbom))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32087");
          } else {
            swap_in_kb_object_content_internal(kbom, id);
          }
        } finally {
          api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_5, thread);
          api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_4, thread);
          api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_3, thread);
          api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_2, thread);
          api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_1, thread);
          api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
        }
      }
      return id;
    }
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 16362) 
  public static final SubLObject swap_in_kb_object_content_internal(SubLObject kbom, SubLObject id) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
          cfasl.$cfasl_common_symbols$.bind(NIL, thread);
          cfasl.cfasl_set_common_symbols(misc_utilities.get_hl_store_caches_shared_symbols());
          kb_object_content_file_vector_lookup(kbom, id);
        } finally {
          cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
      }
      increment_kb_object_usage_count(kbom, id);
      thread.resetMultipleValues();
      {
        SubLObject loser = cache.cache_set_return_dropped(kb_object_manager_lru_information(kbom), id, id);
        SubLObject oldest_value = thread.secondMultipleValue();
        SubLObject pairP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (loser.isFixnum()) {
          swap_out_pristine_kb_object_content(kbom, loser);
        }
      }
      return id;
    }
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 16945) 
  public static final SubLObject swap_out_pristine_kb_object_content(SubLObject kbom, SubLObject loser) {
    id_index.id_index_remove(kb_object_manager_content_table(kbom), loser);
    return loser;
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 17125) 
  public static final SubLObject swap_out_all_pristine_kb_objects_int(SubLObject kbom) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pristine_ids = NIL;
        SubLObject lru_information = kb_object_manager_lru_information(kbom);
        {
          SubLObject cache_var = lru_information;
          SubLObject order_var = $kw67$NEWEST;
          SubLObject entry = cache.do_cache_first(cache_var, order_var);
          SubLObject id = NIL;
          SubLObject value = NIL;
          while ((NIL == cache.do_cache_doneP(cache_var, entry))) {
            id = cache.do_cache_key(entry);
            value = cache.do_cache_value(entry);
            entry = cache.do_cache_next(entry, order_var);
            pristine_ids = cons(id, pristine_ids);
          }
        }
        pristine_ids = Sort.sort(pristine_ids, Symbols.symbol_function($sym68$_), UNPROVIDED);
        {
          SubLObject list_var = pristine_ids;
          utilities_macros.$progress_note$.setDynamicValue(Sequences.cconcatenate($str69$Swapping_out_, new SubLObject[] {kb_object_manager_name(kbom), $str70$_objects}), thread);
          utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
          utilities_macros.$progress_total$.setDynamicValue(Sequences.length(list_var), thread);
          utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
          {
            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
              utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
              utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
              utilities_macros.$within_noting_percent_progress$.bind(T, thread);
              utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
              utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
              {
                SubLObject csome_list_var = list_var;
                SubLObject id = NIL;
                for (id = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), id = csome_list_var.first()) {
                  utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                  utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                  cache.cache_remove(lru_information, id);
                  swap_out_pristine_kb_object_content(kbom, id);
                }
              }
              utilities_macros.noting_percent_progress_postamble();
            } finally {
              utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
              utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
              utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
              utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return Sequences.length(pristine_ids);
      }
    }
  }

  @SubL(source = "cycl/kb-object-manager.lisp", position = 17655) 
  public static final SubLObject increment_kb_object_usage_count(SubLObject kbom, SubLObject id) {
    if ((NIL != kb_object_usage_counts_enabledP(kbom))) {
      {
        SubLObject usage_table = kb_object_manager_usage_table(kbom);
        SubLObject old_counter = id_index.id_index_lookup(usage_table, id, UNPROVIDED);
        SubLObject new_counter = ((NIL != old_counter) ? ((SubLObject) number_utilities.f_1X(old_counter)) : ONE_INTEGER);
        id_index.id_index_enter(usage_table, id, new_counter);
        return id;
      }
    }
    return NIL;
  }

  public static final SubLObject declare_kb_object_manager_file() {
    declareMacro(myName, "with_kb_object_manager_lock_held", "WITH-KB-OBJECT-MANAGER-LOCK-HELD");
    declareFunction(myName, "kb_object_manager_print_function_trampoline", "KB-OBJECT-MANAGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "kb_object_manager_p", "KB-OBJECT-MANAGER-P", 1, 0, false); new $kb_object_manager_p$UnaryFunction();
    declareFunction(myName, "kbom_name", "KBOM-NAME", 1, 0, false);
    declareFunction(myName, "kbom_content_lock", "KBOM-CONTENT-LOCK", 1, 0, false);
    declareFunction(myName, "kbom_lru_size_percentage", "KBOM-LRU-SIZE-PERCENTAGE", 1, 0, false);
    declareFunction(myName, "kbom_content_table", "KBOM-CONTENT-TABLE", 1, 0, false);
    declareFunction(myName, "kbom_usage_table", "KBOM-USAGE-TABLE", 1, 0, false);
    declareFunction(myName, "kbom_lru_information", "KBOM-LRU-INFORMATION", 1, 0, false);
    declareFunction(myName, "kbom_file_vector", "KBOM-FILE-VECTOR", 1, 0, false);
    declareFunction(myName, "kbom_id_threshold", "KBOM-ID-THRESHOLD", 1, 0, false);
    declareFunction(myName, "kbom_load_func", "KBOM-LOAD-FUNC", 1, 0, false);
    declareFunction(myName, "kbom_meter_swap_timeP", "KBOM-METER-SWAP-TIME?", 1, 0, false);
    declareFunction(myName, "kbom_swap_time", "KBOM-SWAP-TIME", 1, 0, false);
    declareFunction(myName, "kbom_dummy1", "KBOM-DUMMY1", 1, 0, false);
    declareFunction(myName, "kbom_dummy2", "KBOM-DUMMY2", 1, 0, false);
    declareFunction(myName, "kbom_dummy3", "KBOM-DUMMY3", 1, 0, false);
    declareFunction(myName, "_csetf_kbom_name", "_CSETF-KBOM-NAME", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_content_lock", "_CSETF-KBOM-CONTENT-LOCK", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_lru_size_percentage", "_CSETF-KBOM-LRU-SIZE-PERCENTAGE", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_content_table", "_CSETF-KBOM-CONTENT-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_usage_table", "_CSETF-KBOM-USAGE-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_lru_information", "_CSETF-KBOM-LRU-INFORMATION", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_file_vector", "_CSETF-KBOM-FILE-VECTOR", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_id_threshold", "_CSETF-KBOM-ID-THRESHOLD", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_load_func", "_CSETF-KBOM-LOAD-FUNC", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_meter_swap_timeP", "_CSETF-KBOM-METER-SWAP-TIME?", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_swap_time", "_CSETF-KBOM-SWAP-TIME", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_dummy1", "_CSETF-KBOM-DUMMY1", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_dummy2", "_CSETF-KBOM-DUMMY2", 2, 0, false);
    declareFunction(myName, "_csetf_kbom_dummy3", "_CSETF-KBOM-DUMMY3", 2, 0, false);
    declareFunction(myName, "make_kb_object_manager", "MAKE-KB-OBJECT-MANAGER", 0, 1, false);
    declareFunction(myName, "new_kb_object_manager", "NEW-KB-OBJECT-MANAGER", 5, 0, false);
    declareFunction(myName, "setup_kb_object_content_table", "SETUP-KB-OBJECT-CONTENT-TABLE", 3, 0, false);
    declareFunction(myName, "setup_kb_object_content_support", "SETUP-KB-OBJECT-CONTENT-SUPPORT", 1, 2, false);
    declareFunction(myName, "initialize_kb_object_hl_store_cache", "INITIALIZE-KB-OBJECT-HL-STORE-CACHE", 3, 0, false);
    declareFunction(myName, "new_legacy_kb_object_manager", "NEW-LEGACY-KB-OBJECT-MANAGER", 6, 0, false);
    declareFunction(myName, "optimize_kb_object_content_table", "OPTIMIZE-KB-OBJECT-CONTENT-TABLE", 2, 0, false);
    declareFunction(myName, "clear_kb_object_content_table", "CLEAR-KB-OBJECT-CONTENT-TABLE", 1, 0, false);
    declareFunction(myName, "kb_object_manager_name", "KB-OBJECT-MANAGER-NAME", 1, 0, false);
    declareFunction(myName, "kb_object_manager_content_lock", "KB-OBJECT-MANAGER-CONTENT-LOCK", 1, 0, false);
    declareFunction(myName, "kb_object_manager_lru_size_percentage", "KB-OBJECT-MANAGER-LRU-SIZE-PERCENTAGE", 1, 0, false);
    declareFunction(myName, "kb_object_manager_content_table", "KB-OBJECT-MANAGER-CONTENT-TABLE", 1, 0, false);
    declareFunction(myName, "kb_object_manager_usage_table", "KB-OBJECT-MANAGER-USAGE-TABLE", 1, 0, false);
    declareFunction(myName, "kb_object_manager_lru_information", "KB-OBJECT-MANAGER-LRU-INFORMATION", 1, 0, false);
    declareFunction(myName, "kb_object_manager_file_vector", "KB-OBJECT-MANAGER-FILE-VECTOR", 1, 0, false);
    declareFunction(myName, "kb_object_manager_id_threshold", "KB-OBJECT-MANAGER-ID-THRESHOLD", 1, 0, false);
    declareFunction(myName, "kb_object_manager_load_func", "KB-OBJECT-MANAGER-LOAD-FUNC", 1, 0, false);
    declareFunction(myName, "kb_object_manager_meter_swap_timeP", "KB-OBJECT-MANAGER-METER-SWAP-TIME?", 1, 0, false);
    declareFunction(myName, "kb_object_manager_swap_time", "KB-OBJECT-MANAGER-SWAP-TIME", 1, 0, false);
    declareFunction(myName, "kb_object_usage_counts_enabledP", "KB-OBJECT-USAGE-COUNTS-ENABLED?", 1, 0, false);
    declareFunction(myName, "cached_kb_object_count", "CACHED-KB-OBJECT-COUNT", 1, 0, false);
    declareFunction(myName, "kb_object_id_cachedP", "KB-OBJECT-ID-CACHED?", 2, 0, false);
    declareFunction(myName, "lookup_kb_object_content", "LOOKUP-KB-OBJECT-CONTENT", 2, 0, false);
    declareFunction(myName, "kb_object_manager_unbuiltP", "KB-OBJECT-MANAGER-UNBUILT?", 1, 0, false);
    declareFunction(myName, "maintain_kb_object_usage_counts", "MAINTAIN-KB-OBJECT-USAGE-COUNTS", 1, 0, false);
    declareFunction(myName, "dont_maintain_kb_object_usage_counts", "DONT-MAINTAIN-KB-OBJECT-USAGE-COUNTS", 1, 0, false);
    declareFunction(myName, "register_kb_object_content", "REGISTER-KB-OBJECT-CONTENT", 3, 0, false);
    declareFunction(myName, "deregister_kb_object_content", "DEREGISTER-KB-OBJECT-CONTENT", 2, 0, false);
    declareFunction(myName, "new_kb_object_content_file_vector", "NEW-KB-OBJECT-CONTENT-FILE-VECTOR", 2, 0, false);
    declareFunction(myName, "kb_object_content_file_vector_cfasl_stream", "KB-OBJECT-CONTENT-FILE-VECTOR-CFASL-STREAM", 1, 0, false);
    declareFunction(myName, "kb_object_content_file_vector_p", "KB-OBJECT-CONTENT-FILE-VECTOR-P", 1, 0, false);
    declareFunction(myName, "kb_object_content_file_vector_lookup", "KB-OBJECT-CONTENT-FILE-VECTOR-LOOKUP", 2, 0, false);
    declareFunction(myName, "is_lru_cachable_kb_object_content_idP", "IS-LRU-CACHABLE-KB-OBJECT-CONTENT-ID?", 2, 0, false);
    declareFunction(myName, "update_kb_object_usage", "UPDATE-KB-OBJECT-USAGE", 2, 0, false);
    declareFunction(myName, "drop_kb_object_usage", "DROP-KB-OBJECT-USAGE", 2, 0, false);
    declareFunction(myName, "mark_kb_object_content_as_muted", "MARK-KB-OBJECT-CONTENT-AS-MUTED", 2, 0, false);
    declareFunction(myName, "meter_kb_object_content_swap_time", "METER-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
    declareFunction(myName, "dont_meter_kb_object_content_swap_time", "DONT-METER-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
    declareFunction(myName, "clear_kb_object_content_swap_time", "CLEAR-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
    declareFunction(myName, "get_file_backed_kb_object_id_threshold", "GET-FILE-BACKED-KB-OBJECT-ID-THRESHOLD", 1, 0, false);
    declareFunction(myName, "swap_in_kb_object_content", "SWAP-IN-KB-OBJECT-CONTENT", 2, 0, false);
    declareFunction(myName, "swap_in_kb_object_content_metered", "SWAP-IN-KB-OBJECT-CONTENT-METERED", 2, 0, false);
    declareFunction(myName, "swap_in_kb_object_content_internal", "SWAP-IN-KB-OBJECT-CONTENT-INTERNAL", 2, 0, false);
    declareFunction(myName, "swap_out_pristine_kb_object_content", "SWAP-OUT-PRISTINE-KB-OBJECT-CONTENT", 2, 0, false);
    declareFunction(myName, "swap_out_all_pristine_kb_objects_int", "SWAP-OUT-ALL-PRISTINE-KB-OBJECTS-INT", 1, 0, false);
    declareFunction(myName, "increment_kb_object_usage_count", "INCREMENT-KB-OBJECT-USAGE-COUNT", 2, 0, false);
    declareFunction(myName, "verify_kb_object_content_table_int", "VERIFY-KB-OBJECT-CONTENT-TABLE-INT", 2, 1, false);
    return NIL;
  }

  public static final SubLObject init_kb_object_manager_file() {
    $dtp_kb_object_manager$ = defconstant("*DTP-KB-OBJECT-MANAGER*", $sym3$KB_OBJECT_MANAGER);
    $min_kb_object_lru_size$ = deflexical("*MIN-KB-OBJECT-LRU-SIZE*", $int60$212);
    return NIL;
  }

  public static final SubLObject setup_kb_object_manager_file() {
    // CVS_ID("Id: kb-object-manager.lisp 128689 2009-09-02 19:44:42Z rck ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_kb_object_manager$.getGlobalValue(), Symbols.symbol_function($sym10$KB_OBJECT_MANAGER_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym11$KBOM_NAME, $sym12$_CSETF_KBOM_NAME);
    Structures.def_csetf($sym13$KBOM_CONTENT_LOCK, $sym14$_CSETF_KBOM_CONTENT_LOCK);
    Structures.def_csetf($sym15$KBOM_LRU_SIZE_PERCENTAGE, $sym16$_CSETF_KBOM_LRU_SIZE_PERCENTAGE);
    Structures.def_csetf($sym17$KBOM_CONTENT_TABLE, $sym18$_CSETF_KBOM_CONTENT_TABLE);
    Structures.def_csetf($sym19$KBOM_USAGE_TABLE, $sym20$_CSETF_KBOM_USAGE_TABLE);
    Structures.def_csetf($sym21$KBOM_LRU_INFORMATION, $sym22$_CSETF_KBOM_LRU_INFORMATION);
    Structures.def_csetf($sym23$KBOM_FILE_VECTOR, $sym24$_CSETF_KBOM_FILE_VECTOR);
    Structures.def_csetf($sym25$KBOM_ID_THRESHOLD, $sym26$_CSETF_KBOM_ID_THRESHOLD);
    Structures.def_csetf($sym27$KBOM_LOAD_FUNC, $sym28$_CSETF_KBOM_LOAD_FUNC);
    Structures.def_csetf($sym29$KBOM_METER_SWAP_TIME_, $sym30$_CSETF_KBOM_METER_SWAP_TIME_);
    Structures.def_csetf($sym31$KBOM_SWAP_TIME, $sym32$_CSETF_KBOM_SWAP_TIME);
    Structures.def_csetf($sym33$KBOM_DUMMY1, $sym34$_CSETF_KBOM_DUMMY1);
    Structures.def_csetf($sym35$KBOM_DUMMY2, $sym36$_CSETF_KBOM_DUMMY2);
    Structures.def_csetf($sym37$KBOM_DUMMY3, $sym38$_CSETF_KBOM_DUMMY3);
    Equality.identity($sym3$KB_OBJECT_MANAGER);
    access_macros.define_obsolete_register($sym64$NEW_LEGACY_KB_OBJECT_MANAGER, NIL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("KBOM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLSymbol $sym2$KB_OBJECT_MANAGER_CONTENT_LOCK = makeSymbol("KB-OBJECT-MANAGER-CONTENT-LOCK");
  public static final SubLSymbol $sym3$KB_OBJECT_MANAGER = makeSymbol("KB-OBJECT-MANAGER");
  public static final SubLSymbol $sym4$KB_OBJECT_MANAGER_P = makeSymbol("KB-OBJECT-MANAGER-P");
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("NAME"), makeSymbol("CONTENT-LOCK"), makeSymbol("LRU-SIZE-PERCENTAGE"), makeSymbol("CONTENT-TABLE"), makeSymbol("USAGE-TABLE"), makeSymbol("LRU-INFORMATION"), makeSymbol("FILE-VECTOR"), makeSymbol("ID-THRESHOLD"), makeSymbol("LOAD-FUNC"), makeSymbol("METER-SWAP-TIME?"), makeSymbol("SWAP-TIME"), makeSymbol("DUMMY1"), makeSymbol("DUMMY2"), makeSymbol("DUMMY3")});
  public static final SubLList $list6 = list(new SubLObject[] {makeKeyword("NAME"), makeKeyword("CONTENT-LOCK"), makeKeyword("LRU-SIZE-PERCENTAGE"), makeKeyword("CONTENT-TABLE"), makeKeyword("USAGE-TABLE"), makeKeyword("LRU-INFORMATION"), makeKeyword("FILE-VECTOR"), makeKeyword("ID-THRESHOLD"), makeKeyword("LOAD-FUNC"), makeKeyword("METER-SWAP-TIME?"), makeKeyword("SWAP-TIME"), makeKeyword("DUMMY1"), makeKeyword("DUMMY2"), makeKeyword("DUMMY3")});
  public static final SubLList $list7 = list(new SubLObject[] {makeSymbol("KBOM-NAME"), makeSymbol("KBOM-CONTENT-LOCK"), makeSymbol("KBOM-LRU-SIZE-PERCENTAGE"), makeSymbol("KBOM-CONTENT-TABLE"), makeSymbol("KBOM-USAGE-TABLE"), makeSymbol("KBOM-LRU-INFORMATION"), makeSymbol("KBOM-FILE-VECTOR"), makeSymbol("KBOM-ID-THRESHOLD"), makeSymbol("KBOM-LOAD-FUNC"), makeSymbol("KBOM-METER-SWAP-TIME?"), makeSymbol("KBOM-SWAP-TIME"), makeSymbol("KBOM-DUMMY1"), makeSymbol("KBOM-DUMMY2"), makeSymbol("KBOM-DUMMY3")});
  public static final SubLList $list8 = list(new SubLObject[] {makeSymbol("_CSETF-KBOM-NAME"), makeSymbol("_CSETF-KBOM-CONTENT-LOCK"), makeSymbol("_CSETF-KBOM-LRU-SIZE-PERCENTAGE"), makeSymbol("_CSETF-KBOM-CONTENT-TABLE"), makeSymbol("_CSETF-KBOM-USAGE-TABLE"), makeSymbol("_CSETF-KBOM-LRU-INFORMATION"), makeSymbol("_CSETF-KBOM-FILE-VECTOR"), makeSymbol("_CSETF-KBOM-ID-THRESHOLD"), makeSymbol("_CSETF-KBOM-LOAD-FUNC"), makeSymbol("_CSETF-KBOM-METER-SWAP-TIME?"), makeSymbol("_CSETF-KBOM-SWAP-TIME"), makeSymbol("_CSETF-KBOM-DUMMY1"), makeSymbol("_CSETF-KBOM-DUMMY2"), makeSymbol("_CSETF-KBOM-DUMMY3")});
  public static final SubLSymbol $sym9$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym10$KB_OBJECT_MANAGER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-OBJECT-MANAGER-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym11$KBOM_NAME = makeSymbol("KBOM-NAME");
  public static final SubLSymbol $sym12$_CSETF_KBOM_NAME = makeSymbol("_CSETF-KBOM-NAME");
  public static final SubLSymbol $sym13$KBOM_CONTENT_LOCK = makeSymbol("KBOM-CONTENT-LOCK");
  public static final SubLSymbol $sym14$_CSETF_KBOM_CONTENT_LOCK = makeSymbol("_CSETF-KBOM-CONTENT-LOCK");
  public static final SubLSymbol $sym15$KBOM_LRU_SIZE_PERCENTAGE = makeSymbol("KBOM-LRU-SIZE-PERCENTAGE");
  public static final SubLSymbol $sym16$_CSETF_KBOM_LRU_SIZE_PERCENTAGE = makeSymbol("_CSETF-KBOM-LRU-SIZE-PERCENTAGE");
  public static final SubLSymbol $sym17$KBOM_CONTENT_TABLE = makeSymbol("KBOM-CONTENT-TABLE");
  public static final SubLSymbol $sym18$_CSETF_KBOM_CONTENT_TABLE = makeSymbol("_CSETF-KBOM-CONTENT-TABLE");
  public static final SubLSymbol $sym19$KBOM_USAGE_TABLE = makeSymbol("KBOM-USAGE-TABLE");
  public static final SubLSymbol $sym20$_CSETF_KBOM_USAGE_TABLE = makeSymbol("_CSETF-KBOM-USAGE-TABLE");
  public static final SubLSymbol $sym21$KBOM_LRU_INFORMATION = makeSymbol("KBOM-LRU-INFORMATION");
  public static final SubLSymbol $sym22$_CSETF_KBOM_LRU_INFORMATION = makeSymbol("_CSETF-KBOM-LRU-INFORMATION");
  public static final SubLSymbol $sym23$KBOM_FILE_VECTOR = makeSymbol("KBOM-FILE-VECTOR");
  public static final SubLSymbol $sym24$_CSETF_KBOM_FILE_VECTOR = makeSymbol("_CSETF-KBOM-FILE-VECTOR");
  public static final SubLSymbol $sym25$KBOM_ID_THRESHOLD = makeSymbol("KBOM-ID-THRESHOLD");
  public static final SubLSymbol $sym26$_CSETF_KBOM_ID_THRESHOLD = makeSymbol("_CSETF-KBOM-ID-THRESHOLD");
  public static final SubLSymbol $sym27$KBOM_LOAD_FUNC = makeSymbol("KBOM-LOAD-FUNC");
  public static final SubLSymbol $sym28$_CSETF_KBOM_LOAD_FUNC = makeSymbol("_CSETF-KBOM-LOAD-FUNC");
  public static final SubLSymbol $sym29$KBOM_METER_SWAP_TIME_ = makeSymbol("KBOM-METER-SWAP-TIME?");
  public static final SubLSymbol $sym30$_CSETF_KBOM_METER_SWAP_TIME_ = makeSymbol("_CSETF-KBOM-METER-SWAP-TIME?");
  public static final SubLSymbol $sym31$KBOM_SWAP_TIME = makeSymbol("KBOM-SWAP-TIME");
  public static final SubLSymbol $sym32$_CSETF_KBOM_SWAP_TIME = makeSymbol("_CSETF-KBOM-SWAP-TIME");
  public static final SubLSymbol $sym33$KBOM_DUMMY1 = makeSymbol("KBOM-DUMMY1");
  public static final SubLSymbol $sym34$_CSETF_KBOM_DUMMY1 = makeSymbol("_CSETF-KBOM-DUMMY1");
  public static final SubLSymbol $sym35$KBOM_DUMMY2 = makeSymbol("KBOM-DUMMY2");
  public static final SubLSymbol $sym36$_CSETF_KBOM_DUMMY2 = makeSymbol("_CSETF-KBOM-DUMMY2");
  public static final SubLSymbol $sym37$KBOM_DUMMY3 = makeSymbol("KBOM-DUMMY3");
  public static final SubLSymbol $sym38$_CSETF_KBOM_DUMMY3 = makeSymbol("_CSETF-KBOM-DUMMY3");
  public static final SubLSymbol $kw39$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw40$CONTENT_LOCK = makeKeyword("CONTENT-LOCK");
  public static final SubLSymbol $kw41$LRU_SIZE_PERCENTAGE = makeKeyword("LRU-SIZE-PERCENTAGE");
  public static final SubLSymbol $kw42$CONTENT_TABLE = makeKeyword("CONTENT-TABLE");
  public static final SubLSymbol $kw43$USAGE_TABLE = makeKeyword("USAGE-TABLE");
  public static final SubLSymbol $kw44$LRU_INFORMATION = makeKeyword("LRU-INFORMATION");
  public static final SubLSymbol $kw45$FILE_VECTOR = makeKeyword("FILE-VECTOR");
  public static final SubLSymbol $kw46$ID_THRESHOLD = makeKeyword("ID-THRESHOLD");
  public static final SubLSymbol $kw47$LOAD_FUNC = makeKeyword("LOAD-FUNC");
  public static final SubLSymbol $kw48$METER_SWAP_TIME_ = makeKeyword("METER-SWAP-TIME?");
  public static final SubLSymbol $kw49$SWAP_TIME = makeKeyword("SWAP-TIME");
  public static final SubLSymbol $kw50$DUMMY1 = makeKeyword("DUMMY1");
  public static final SubLSymbol $kw51$DUMMY2 = makeKeyword("DUMMY2");
  public static final SubLSymbol $kw52$DUMMY3 = makeKeyword("DUMMY3");
  public static final SubLString $str53$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym54$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym55$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym56$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym57$FBOUNDP = makeSymbol("FBOUNDP");
  public static final SubLString $str58$_content_manager_lock = makeString(" content manager lock");
  public static final SubLSymbol $kw59$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLInteger $int60$212 = makeInteger(212);
  public static final SubLInteger $int61$100 = makeInteger(100);
  public static final SubLString $str62$cfasl = makeString("cfasl");
  public static final SubLString $str63$Got__s__expected_an_extensionless = makeString("Got ~s, expected an extensionless filename");
  public static final SubLSymbol $sym64$NEW_LEGACY_KB_OBJECT_MANAGER = makeSymbol("NEW-LEGACY-KB-OBJECT-MANAGER");
  public static final SubLFloat $float65$0_05 = makeDouble(0.05);
  public static final SubLString $str66$We_did_not_manage_to_swap_the_KB_ = makeString("We did not manage to swap the KB object ~D back in from the CFASL stream ~A; got ~D instead.");
  public static final SubLSymbol $kw67$NEWEST = makeKeyword("NEWEST");
  public static final SubLSymbol $sym68$_ = makeSymbol("<");
  public static final SubLString $str69$Swapping_out_ = makeString("Swapping out ");
  public static final SubLString $str70$_objects = makeString(" objects");
  public static final SubLString $str71$Verifying_integrity_of_ = makeString("Verifying integrity of ");
  public static final SubLString $str72$_content_table = makeString(" content table");
  public static final SubLSymbol $kw73$SKIP = makeKeyword("SKIP");
  public static final SubLString $str74$Entry__a_is_invalid___a__repairin = makeString("Entry ~a is invalid: ~a, repairing");
  public static final SubLString $str75$Entry__a_is_invalid___a = makeString("Entry ~a is invalid: ~a");

  //// Initializers

  public void declareFunctions() {
    declare_kb_object_manager_file();
  }

  public void initializeVariables() {
    init_kb_object_manager_file();
  }

  public void runTopLevelForms() {
    setup_kb_object_manager_file();
  }

}
