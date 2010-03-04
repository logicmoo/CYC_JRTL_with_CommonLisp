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
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertions_low;
import com.cyc.cycjava.cycl.cfasl_kb_methods;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.kb_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.tms;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class clause_strucs extends SubLTranslatedFile {

  //// Constructor

  private clause_strucs() {}
  public static final SubLFile me = new clause_strucs();
  public static final String myName = "com.cyc.cycjava.cycl.clause_strucs";

  //// Definitions

  public static final class $clause_struc_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $cnf; }
    public SubLObject getField4() { return $assertions; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $cnf = value; }
    public SubLObject setField4(SubLObject value) { return $assertions = value; }
    public SubLObject $id = NIL;
    public SubLObject $cnf = NIL;
    public SubLObject $assertions = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($clause_struc_native.class, $sym0$CLAUSE_STRUC, $sym1$CLAUSE_STRUC_P, $list3, $list4, new String[] {"$id", "$cnf", "$assertions"}, $list5, $list6, $sym7$PRINT_CLAUSE_STRUC);
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 1211) 
  public static SubLSymbol $dtp_clause_struc$ = null;

  @SubL(source = "cycl/clause-strucs.lisp", position = 1211) 
  public static final SubLObject clause_struc_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11353");
    return NIL;
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 1211) 
  public static final SubLObject clause_struc_p(SubLObject object) {
    return ((object.getClass() == $clause_struc_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $clause_struc_p$UnaryFunction extends UnaryFunction {
    public $clause_struc_p$UnaryFunction() { super(extractFunctionNamed("CLAUSE-STRUC-P")); }
    public SubLObject processItem(SubLObject arg1) { return clause_struc_p(arg1); }
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 1211) 
  public static final SubLObject cls_cnf(SubLObject object) {
    checkType(object, $sym1$CLAUSE_STRUC_P);
    return object.getField3();
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 1211) 
  public static final SubLObject _csetf_cls_id(SubLObject object, SubLObject value) {
    checkType(object, $sym1$CLAUSE_STRUC_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 1211) 
  public static final SubLObject _csetf_cls_cnf(SubLObject object, SubLObject value) {
    checkType(object, $sym1$CLAUSE_STRUC_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 1211) 
  public static final SubLObject _csetf_cls_assertions(SubLObject object, SubLObject value) {
    checkType(object, $sym1$CLAUSE_STRUC_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 1211) 
  public static final SubLObject make_clause_struc(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $clause_struc_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw15$ID)) {
            _csetf_cls_id(v_new, current_value);
          } else if (pcase_var.eql($kw16$CNF)) {
            _csetf_cls_cnf(v_new, current_value);
          } else if (pcase_var.eql($kw17$ASSERTIONS)) {
            _csetf_cls_assertions(v_new, current_value);
          } else {
            Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 1924) 
  public static final SubLObject sxhash_clause_struc_method(SubLObject object) {
    {
      SubLObject id = Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11340");
      if (id.isInteger()) {
        return id;
      }
    }
    return $int23$242;
  }

  /** Free list for CLAUSE-STRUC objects */
  @SubL(source = "cycl/clause-strucs.lisp", position = 2057) 
  private static SubLSymbol $clause_struc_free_list$ = null;

  /** Lock for CLAUSE-STRUC object free list */
  @SubL(source = "cycl/clause-strucs.lisp", position = 2057) 
  private static SubLSymbol $clause_struc_free_lock$ = null;

  /** Make a new CLAUSE-STRUC in the static area */
  @SubL(source = "cycl/clause-strucs.lisp", position = 2057) 
  public static final SubLObject make_static_clause_struc() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject object = NIL;
        {
          SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
          try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            object = make_clause_struc(UNPROVIDED);
          } finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
          }
        }
        return object;
      }
    }
  }

  /** Initialize a CLAUSE-STRUC for use */
  @SubL(source = "cycl/clause-strucs.lisp", position = 2057) 
  public static final SubLObject init_clause_struc(SubLObject clause_struc) {
    _csetf_cls_id(clause_struc, NIL);
    _csetf_cls_cnf(clause_struc, NIL);
    _csetf_cls_assertions(clause_struc, NIL);
    return clause_struc;
  }

  /** Get a CLAUSE-STRUC from the free list, or make a new one if needed */
  @SubL(source = "cycl/clause-strucs.lisp", position = 2057) 
  public static final SubLObject get_clause_struc() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == utilities_macros.$structure_resourcing_enabled$.getGlobalValue())) {
        if ((NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread))) {
          return init_clause_struc(make_static_clause_struc());
        } else {
          return init_clause_struc(make_clause_struc(UNPROVIDED));
        }
      }
      {
        SubLObject object = NIL;
        SubLObject found = NIL;
        SubLObject lock = $clause_struc_free_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          object = $clause_struc_free_list$.getGlobalValue();
          for (; (!(((NIL != found)
                || (NIL == object)))); ) {
            if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11349"))) {
              $clause_struc_free_list$.setGlobalValue(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11341"));
              found = T;
            } else {
              object = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11342");
            }
          }
          if ((NIL == found)) {
            if ((NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread))) {
              object = make_static_clause_struc();
            } else {
              object = make_clause_struc(UNPROVIDED);
            }
            $clause_struc_free_list$.setGlobalValue(NIL);
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
        return init_clause_struc(object);
      }
    }
  }

  /** Primitively change the clause-struc id for CLAUSE-STRUC to NEW-ID. */
  @SubL(source = "cycl/clause-strucs.lisp", position = 2559) 
  public static final SubLObject reset_clause_struc_id(SubLObject clause_struc, SubLObject new_id) {
    _csetf_cls_id(clause_struc, new_id);
    return clause_struc;
  }

  /** Return the cnf of CLAUSE-STRUC. */
  @SubL(source = "cycl/clause-strucs.lisp", position = 2752) 
  public static final SubLObject clause_struc_cnf(SubLObject clause_struc) {
    checkType(clause_struc, $sym1$CLAUSE_STRUC_P);
    return cls_cnf(clause_struc);
  }

  /** Primitively set the assertions for CLAUSE-STRUC to NEW-ASSERTIONS. */
  @SubL(source = "cycl/clause-strucs.lisp", position = 3829) 
  public static final SubLObject reset_clause_struc_assertions(SubLObject clause_struc, SubLObject new_assertions) {
    _csetf_cls_assertions(clause_struc, new_assertions);
    return clause_struc;
  }

  /** Return the clause-struc with ID, or NIL if not present. */
  @SubL(source = "cycl/clause-strucs.lisp", position = 4872) 
  public static final SubLObject find_clause_struc_by_id(SubLObject id) {
    checkType(id, $sym36$INTEGERP);
    return lookup_clause_struc(id);
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 5387) 
  public static final SubLObject make_clause_struc_shell(SubLObject cnf, SubLObject id) {
    if ((id == UNPROVIDED)) {
      id = NIL;
    }
    checkType(cnf, $sym37$CNF_P);
    if ((NIL == id)) {
      id = Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11351");
    }
    checkType(id, $sym36$INTEGERP);
    {
      SubLObject clause_struc = get_clause_struc();
      register_clause_struc_id(clause_struc, id);
      _csetf_cls_cnf(clause_struc, cnf);
      return clause_struc;
    }
  }

  /** Create a sample invalid clause-struc. */
  @SubL(source = "cycl/clause-strucs.lisp", position = 5709) 
  public static final SubLObject create_sample_invalid_clause_struc() {
    return get_clause_struc();
  }

  /** The ID -> CLAUSE-STRUC mapping table. */
  @SubL(source = "cycl/clause-strucs.lisp", position = 7637) 
  private static SubLSymbol $clause_struc_from_id$ = null;

  @SubL(source = "cycl/clause-strucs.lisp", position = 8211) 
  public static final SubLObject clause_struc_table() {
    return $clause_struc_from_id$.getGlobalValue();
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 8944) 
  public static final SubLObject setup_clause_struc_table(SubLObject size, SubLObject exactP) {
    if ((NIL != $clause_struc_from_id$.getGlobalValue())) {
      return NIL;
    }
    $clause_struc_from_id$.setGlobalValue(id_index.new_id_index(size, ZERO_INTEGER));
    return T;
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 9155) 
  public static final SubLObject finalize_clause_strucs(SubLObject max_clause_struc_id) {
    if ((max_clause_struc_id == UNPROVIDED)) {
      max_clause_struc_id = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      set_next_clause_struc_id(max_clause_struc_id);
      if ((NIL == max_clause_struc_id)) {
        {
          SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
          try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            id_index.optimize_id_index($clause_struc_from_id$.getGlobalValue(), UNPROVIDED);
          } finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 10161) 
  public static final SubLObject free_all_clause_strucs() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject idx = clause_struc_table();
        SubLObject mess = $str54$Freeing_clause_strucs;
        SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        checkType(mess, $sym49$STRINGP);
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
            utilities_macros.noting_percent_progress_preamble(mess);
            {
              SubLObject idx_12 = idx;
              if ((NIL == id_index.id_index_objects_empty_p(idx_12, $kw50$SKIP))) {
                {
                  SubLObject idx_13 = idx_12;
                  if ((NIL == id_index.id_index_old_objects_empty_p(idx_13, $kw50$SKIP))) {
                    {
                      SubLObject vector_var = id_index.id_index_old_objects(idx_13);
                      SubLObject backwardP_var = NIL;
                      SubLObject length = Sequences.length(vector_var);
                      SubLObject v_iteration = NIL;
                      for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        {
                          SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                          SubLObject clause_struc = Vectors.aref(vector_var, id);
                          if ((!(((NIL != id_index.id_index_tombstone_p(clause_struc))
                                 && (NIL != id_index.id_index_skip_tombstones_p($kw50$SKIP)))))) {
                            if ((NIL != id_index.id_index_tombstone_p(clause_struc))) {
                              clause_struc = $kw50$SKIP;
                            }
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, ONE_INTEGER);
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11347");
                          }
                        }
                      }
                    }
                  }
                }
                {
                  SubLObject idx_14 = idx_12;
                  if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_14))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw50$SKIP)))))) {
                    {
                      SubLObject v_new = id_index.id_index_new_objects(idx_14);
                      SubLObject id = id_index.id_index_new_id_threshold(idx_14);
                      SubLObject end_id = id_index.id_index_next_id(idx_14);
                      SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw50$SKIP)) ? ((SubLObject) NIL) : $kw50$SKIP);
                      while (id.numL(end_id)) {
                        {
                          SubLObject clause_struc = Hashtables.gethash_without_values(id, v_new, v_default);
                          if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw50$SKIP))
                                 && (NIL != id_index.id_index_tombstone_p(clause_struc)))))) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, ONE_INTEGER);
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11348");
                          }
                        }
                        id = Numbers.add(id, ONE_INTEGER);
                      }
                    }
                  }
                }
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
      clear_clause_struc_table();
      return NIL;
    }
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 10363) 
  public static final SubLObject clear_clause_struc_table() {
    return id_index.clear_id_index($clause_struc_from_id$.getGlobalValue());
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 10646) 
  public static final SubLObject set_next_clause_struc_id(SubLObject max_clause_struc_id) {
    if ((max_clause_struc_id == UNPROVIDED)) {
      max_clause_struc_id = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject max = MINUS_ONE_INTEGER;
        if ((NIL != max_clause_struc_id)) {
          max = max_clause_struc_id;
        } else {
          {
            SubLObject idx = clause_struc_table();
            SubLObject mess = $str55$Determining_maximum_clause_struc_;
            SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            checkType(mess, $sym49$STRINGP);
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
                utilities_macros.noting_percent_progress_preamble(mess);
                {
                  SubLObject idx_15 = idx;
                  if ((NIL == id_index.id_index_objects_empty_p(idx_15, $kw50$SKIP))) {
                    {
                      SubLObject idx_16 = idx_15;
                      if ((NIL == id_index.id_index_old_objects_empty_p(idx_16, $kw50$SKIP))) {
                        {
                          SubLObject vector_var = id_index.id_index_old_objects(idx_16);
                          SubLObject backwardP_var = NIL;
                          SubLObject length = Sequences.length(vector_var);
                          SubLObject v_iteration = NIL;
                          for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            {
                              SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                              SubLObject clause_struc = Vectors.aref(vector_var, id);
                              if ((!(((NIL != id_index.id_index_tombstone_p(clause_struc))
                                     && (NIL != id_index.id_index_skip_tombstones_p($kw50$SKIP)))))) {
                                if ((NIL != id_index.id_index_tombstone_p(clause_struc))) {
                                  clause_struc = $kw50$SKIP;
                                }
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                max = Numbers.max(max, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11338"));
                              }
                            }
                          }
                        }
                      }
                    }
                    {
                      SubLObject idx_17 = idx_15;
                      if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_17))
                             && (NIL != id_index.id_index_skip_tombstones_p($kw50$SKIP)))))) {
                        {
                          SubLObject v_new = id_index.id_index_new_objects(idx_17);
                          SubLObject id = id_index.id_index_new_id_threshold(idx_17);
                          SubLObject end_id = id_index.id_index_next_id(idx_17);
                          SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw50$SKIP)) ? ((SubLObject) NIL) : $kw50$SKIP);
                          while (id.numL(end_id)) {
                            {
                              SubLObject clause_struc = Hashtables.gethash_without_values(id, v_new, v_default);
                              if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw50$SKIP))
                                     && (NIL != id_index.id_index_tombstone_p(clause_struc)))))) {
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                max = Numbers.max(max, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11339"));
                              }
                            }
                            id = Numbers.add(id, ONE_INTEGER);
                          }
                        }
                      }
                    }
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
        }
        {
          SubLObject next_id = Numbers.add(max, ONE_INTEGER);
          id_index.set_id_index_next_id($clause_struc_from_id$.getGlobalValue(), next_id);
          return next_id;
        }
      }
    }
  }

  /** Note that ID will be used as the id for CLAUSE-STRUC. */
  @SubL(source = "cycl/clause-strucs.lisp", position = 11067) 
  public static final SubLObject register_clause_struc_id(SubLObject clause_struc, SubLObject id) {
    reset_clause_struc_id(clause_struc, id);
    id_index.id_index_enter($clause_struc_from_id$.getGlobalValue(), id, clause_struc);
    return clause_struc;
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 11465) 
  public static final SubLObject lookup_clause_struc(SubLObject id) {
    return id_index.id_index_lookup($clause_struc_from_id$.getGlobalValue(), id, UNPROVIDED);
  }

  @SubL(source = "cycl/clause-strucs.lisp", position = 11700) 
  public static SubLSymbol $clause_struc_dump_id_table$ = null;

  public static final SubLObject declare_clause_strucs_file() {
    declareFunction(myName, "clause_struc_print_function_trampoline", "CLAUSE-STRUC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "clause_struc_p", "CLAUSE-STRUC-P", 1, 0, false); new $clause_struc_p$UnaryFunction();
    //declareFunction(myName, "cls_id", "CLS-ID", 1, 0, false);
    declareFunction(myName, "cls_cnf", "CLS-CNF", 1, 0, false);
    //declareFunction(myName, "cls_assertions", "CLS-ASSERTIONS", 1, 0, false);
    declareFunction(myName, "_csetf_cls_id", "_CSETF-CLS-ID", 2, 0, false);
    declareFunction(myName, "_csetf_cls_cnf", "_CSETF-CLS-CNF", 2, 0, false);
    declareFunction(myName, "_csetf_cls_assertions", "_CSETF-CLS-ASSERTIONS", 2, 0, false);
    declareFunction(myName, "make_clause_struc", "MAKE-CLAUSE-STRUC", 0, 1, false);
    //declareFunction(myName, "print_clause_struc", "PRINT-CLAUSE-STRUC", 3, 0, false);
    declareFunction(myName, "sxhash_clause_struc_method", "SXHASH-CLAUSE-STRUC-METHOD", 1, 0, false);
    declareFunction(myName, "make_static_clause_struc", "MAKE-STATIC-CLAUSE-STRUC", 0, 0, false);
    declareFunction(myName, "init_clause_struc", "INIT-CLAUSE-STRUC", 1, 0, false);
    //declareFunction(myName, "free_clause_struc_p", "FREE-CLAUSE-STRUC-P", 1, 0, false);
    //declareFunction(myName, "free_clause_struc", "FREE-CLAUSE-STRUC", 1, 0, false);
    declareFunction(myName, "get_clause_struc", "GET-CLAUSE-STRUC", 0, 0, false);
    //declareFunction(myName, "clause_struc_id", "CLAUSE-STRUC-ID", 1, 0, false);
    declareFunction(myName, "reset_clause_struc_id", "RESET-CLAUSE-STRUC-ID", 2, 0, false);
    declareFunction(myName, "clause_struc_cnf", "CLAUSE-STRUC-CNF", 1, 0, false);
    //declareFunction(myName, "gaf_clause_strucP", "GAF-CLAUSE-STRUC?", 1, 0, false);
    //declareFunction(myName, "clause_struc_formula", "CLAUSE-STRUC-FORMULA", 1, 1, false);
    //declareMacro(myName, "do_clause_struc_assertions", "DO-CLAUSE-STRUC-ASSERTIONS");
    //declareFunction(myName, "clause_struc_assertions", "CLAUSE-STRUC-ASSERTIONS", 1, 0, false);
    declareFunction(myName, "reset_clause_struc_assertions", "RESET-CLAUSE-STRUC-ASSERTIONS", 2, 0, false);
    //declareFunction(myName, "valid_clause_struc", "VALID-CLAUSE-STRUC", 1, 1, false);
    //declareFunction(myName, "invalid_clause_struc", "INVALID-CLAUSE-STRUC", 1, 1, false);
    declareFunction(myName, "find_clause_struc_by_id", "FIND-CLAUSE-STRUC-BY-ID", 1, 0, false);
    //declareFunction(myName, "create_clause_struc", "CREATE-CLAUSE-STRUC", 1, 0, false);
    declareFunction(myName, "make_clause_struc_shell", "MAKE-CLAUSE-STRUC-SHELL", 1, 1, false);
    declareFunction(myName, "create_sample_invalid_clause_struc", "CREATE-SAMPLE-INVALID-CLAUSE-STRUC", 0, 0, false);
    //declareFunction(myName, "add_clause_struc_assertion", "ADD-CLAUSE-STRUC-ASSERTION", 2, 0, false);
    //declareFunction(myName, "remove_clause_struc", "REMOVE-CLAUSE-STRUC", 1, 0, false);
    //declareFunction(myName, "remove_clause_struc_assertion", "REMOVE-CLAUSE-STRUC-ASSERTION", 2, 0, false);
    //declareFunction(myName, "simplify_clause_struc_uses", "SIMPLIFY-CLAUSE-STRUC-USES", 1, 0, false);
    //declareMacro(myName, "do_clause_strucs", "DO-CLAUSE-STRUCS");
    declareFunction(myName, "clause_struc_table", "CLAUSE-STRUC-TABLE", 0, 0, false);
    //declareFunction(myName, "clause_struc_count", "CLAUSE-STRUC-COUNT", 0, 0, false);
    //declareFunction(myName, "random_clause_struc", "RANDOM-CLAUSE-STRUC", 0, 0, false);
    //declareFunction(myName, "new_clause_struc_id_threshold", "NEW-CLAUSE-STRUC-ID-THRESHOLD", 0, 0, false);
    declareFunction(myName, "setup_clause_struc_table", "SETUP-CLAUSE-STRUC-TABLE", 2, 0, false);
    declareFunction(myName, "finalize_clause_strucs", "FINALIZE-CLAUSE-STRUCS", 0, 1, false);
    //declareFunction(myName, "clean_clause_struc_table", "CLEAN-CLAUSE-STRUC-TABLE", 0, 1, false);
    declareFunction(myName, "free_all_clause_strucs", "FREE-ALL-CLAUSE-STRUCS", 0, 0, false);
    declareFunction(myName, "clear_clause_struc_table", "CLEAR-CLAUSE-STRUC-TABLE", 0, 0, false);
    //declareFunction(myName, "next_clause_struc_id", "NEXT-CLAUSE-STRUC-ID", 0, 0, false);
    declareFunction(myName, "set_next_clause_struc_id", "SET-NEXT-CLAUSE-STRUC-ID", 0, 1, false);
    declareFunction(myName, "register_clause_struc_id", "REGISTER-CLAUSE-STRUC-ID", 2, 0, false);
    //declareFunction(myName, "deregister_clause_struc_id", "DEREGISTER-CLAUSE-STRUC-ID", 1, 0, false);
    declareFunction(myName, "lookup_clause_struc", "LOOKUP-CLAUSE-STRUC", 1, 0, false);
    //declareFunction(myName, "make_clause_struc_id", "MAKE-CLAUSE-STRUC-ID", 0, 0, false);
    //declareFunction(myName, "clause_struc_dump_id", "CLAUSE-STRUC-DUMP-ID", 1, 0, false);
    //declareFunction(myName, "find_clause_struc_by_dump_id", "FIND-CLAUSE-STRUC-BY-DUMP-ID", 1, 0, false);
    //declareMacro(myName, "with_clause_struc_dump_id_table", "WITH-CLAUSE-STRUC-DUMP-ID-TABLE");
    //declareFunction(myName, "create_clause_struc_dump_id_table", "CREATE-CLAUSE-STRUC-DUMP-ID-TABLE", 0, 0, false);
    //declareFunction(myName, "number_of_assertions_in_more_than_one_mt", "NUMBER-OF-ASSERTIONS-IN-MORE-THAN-ONE-MT", 0, 0, false);
    //declareFunction(myName, "mts_with_clause_strucs", "MTS-WITH-CLAUSE-STRUCS", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_clause_strucs_file() {
    $dtp_clause_struc$ = defconstant("*DTP-CLAUSE-STRUC*", $sym0$CLAUSE_STRUC);
    $clause_struc_free_list$ = deflexical("*CLAUSE-STRUC-FREE-LIST*", NIL);
    $clause_struc_free_lock$ = deflexical("*CLAUSE-STRUC-FREE-LOCK*", Locks.make_lock($str25$CLAUSE_STRUC_resource_lock));
    $clause_struc_from_id$ = deflexical("*CLAUSE-STRUC-FROM-ID*", ((NIL != Symbols.boundp($sym39$_CLAUSE_STRUC_FROM_ID_)) ? ((SubLObject) $clause_struc_from_id$.getGlobalValue()) : NIL));
    $clause_struc_dump_id_table$ = defparameter("*CLAUSE-STRUC-DUMP-ID-TABLE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_clause_strucs_file() {
    // CVS_ID("Id: clause-strucs.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_clause_struc$.getGlobalValue(), Symbols.symbol_function($sym8$CLAUSE_STRUC_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$CLS_ID, $sym10$_CSETF_CLS_ID);
    Structures.def_csetf($sym11$CLS_CNF, $sym12$_CSETF_CLS_CNF);
    Structures.def_csetf($sym13$CLS_ASSERTIONS, $sym14$_CSETF_CLS_ASSERTIONS);
    Equality.identity($sym0$CLAUSE_STRUC);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_clause_struc$.getGlobalValue(), Symbols.symbol_function($sym24$SXHASH_CLAUSE_STRUC_METHOD));
    subl_macro_promotions.declare_defglobal($sym39$_CLAUSE_STRUC_FROM_ID_);
    access_macros.register_macro_helper($sym46$CLAUSE_STRUC_TABLE, $sym47$DO_CLAUSE_STRUCS);
    access_macros.register_macro_helper($sym58$CREATE_CLAUSE_STRUC_DUMP_ID_TABLE, $sym59$WITH_CLAUSE_STRUC_DUMP_ID_TABLE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLAUSE_STRUC = makeSymbol("CLAUSE-STRUC");
  public static final SubLSymbol $sym1$CLAUSE_STRUC_P = makeSymbol("CLAUSE-STRUC-P");
  public static final SubLInteger $int2$142 = makeInteger(142);
  public static final SubLList $list3 = list(makeSymbol("ID"), makeSymbol("CNF"), makeSymbol("ASSERTIONS"));
  public static final SubLList $list4 = list(makeKeyword("ID"), makeKeyword("CNF"), makeKeyword("ASSERTIONS"));
  public static final SubLList $list5 = list(makeSymbol("CLS-ID"), makeSymbol("CLS-CNF"), makeSymbol("CLS-ASSERTIONS"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-CLS-ID"), makeSymbol("_CSETF-CLS-CNF"), makeSymbol("_CSETF-CLS-ASSERTIONS"));
  public static final SubLSymbol $sym7$PRINT_CLAUSE_STRUC = makeSymbol("PRINT-CLAUSE-STRUC");
  public static final SubLSymbol $sym8$CLAUSE_STRUC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CLAUSE-STRUC-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$CLS_ID = makeSymbol("CLS-ID");
  public static final SubLSymbol $sym10$_CSETF_CLS_ID = makeSymbol("_CSETF-CLS-ID");
  public static final SubLSymbol $sym11$CLS_CNF = makeSymbol("CLS-CNF");
  public static final SubLSymbol $sym12$_CSETF_CLS_CNF = makeSymbol("_CSETF-CLS-CNF");
  public static final SubLSymbol $sym13$CLS_ASSERTIONS = makeSymbol("CLS-ASSERTIONS");
  public static final SubLSymbol $sym14$_CSETF_CLS_ASSERTIONS = makeSymbol("_CSETF-CLS-ASSERTIONS");
  public static final SubLSymbol $kw15$ID = makeKeyword("ID");
  public static final SubLSymbol $kw16$CNF = makeKeyword("CNF");
  public static final SubLSymbol $kw17$ASSERTIONS = makeKeyword("ASSERTIONS");
  public static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str19$_ = makeString("<");
  public static final SubLString $str20$_ = makeString("?");
  public static final SubLString $str21$_ = makeString(">");
  public static final SubLString $str22$_The_CFASL_invalid_clause_struc_ = makeString("<The CFASL invalid clause struc>");
  public static final SubLInteger $int23$242 = makeInteger(242);
  public static final SubLSymbol $sym24$SXHASH_CLAUSE_STRUC_METHOD = makeSymbol("SXHASH-CLAUSE-STRUC-METHOD");
  public static final SubLString $str25$CLAUSE_STRUC_resource_lock = makeString("CLAUSE-STRUC resource lock");
  public static final SubLSymbol $kw26$FREE = makeKeyword("FREE");
  public static final SubLSymbol $kw27$TRUE = makeKeyword("TRUE");
  public static final SubLList $list28 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("CLAUSE-STRUC"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list29 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw30$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw31$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym32$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym33$CLAUSE_STRUC_ASSERTIONS = makeSymbol("CLAUSE-STRUC-ASSERTIONS");
  public static final SubLSymbol $sym34$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");
  public static final SubLSymbol $sym35$VALID_ASSERTION = makeSymbol("VALID-ASSERTION");
  public static final SubLSymbol $sym36$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym37$CNF_P = makeSymbol("CNF-P");
  public static final SubLSymbol $sym38$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym39$_CLAUSE_STRUC_FROM_ID_ = makeSymbol("*CLAUSE-STRUC-FROM-ID*");
  public static final SubLList $list40 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc clause structs")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list41 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw42$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLString $str43$mapping_Cyc_clause_structs = makeString("mapping Cyc clause structs");
  public static final SubLSymbol $sym44$DO_KB_SUID_TABLE = makeSymbol("DO-KB-SUID-TABLE");
  public static final SubLList $list45 = list(makeSymbol("CLAUSE-STRUC-TABLE"));
  public static final SubLSymbol $sym46$CLAUSE_STRUC_TABLE = makeSymbol("CLAUSE-STRUC-TABLE");
  public static final SubLSymbol $sym47$DO_CLAUSE_STRUCS = makeSymbol("DO-CLAUSE-STRUCS");
  public static final SubLString $str48$Cleaning_clause_struc_table = makeString("Cleaning clause-struc table");
  public static final SubLSymbol $sym49$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw50$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw51$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym52$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLString $str53$invalid_clause_struct__S = makeString("invalid clause-struct ~S");
  public static final SubLString $str54$Freeing_clause_strucs = makeString("Freeing clause-strucs");
  public static final SubLString $str55$Determining_maximum_clause_struc_ = makeString("Determining maximum clause-struc ID");
  public static final SubLSymbol $sym56$CLET = makeSymbol("CLET");
  public static final SubLList $list57 = list(list(makeSymbol("*CLAUSE-STRUC-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-CLAUSE-STRUC-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-CLAUSE-STRUC-HANDLE-FUNC*"), list(makeSymbol("QUOTE"), makeSymbol("CLAUSE-STRUC-DUMP-ID"))));
  public static final SubLSymbol $sym58$CREATE_CLAUSE_STRUC_DUMP_ID_TABLE = makeSymbol("CREATE-CLAUSE-STRUC-DUMP-ID-TABLE");
  public static final SubLSymbol $sym59$WITH_CLAUSE_STRUC_DUMP_ID_TABLE = makeSymbol("WITH-CLAUSE-STRUC-DUMP-ID-TABLE");

  //// Initializers

  public void declareFunctions() {
    declare_clause_strucs_file();
  }

  public void initializeVariables() {
    init_clause_strucs_file();
  }

  public void runTopLevelForms() {
    setup_clause_strucs_file();
  }

}
