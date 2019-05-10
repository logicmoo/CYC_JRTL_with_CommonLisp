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

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_manager;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.cfasl_kb_methods;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class assertion_handles extends SubLTranslatedFile {

  //// Constructor

  private assertion_handles() {}
  public static final SubLFile me = new assertion_handles();
  public static final String myName = "com.cyc.cycjava_1.cycl.assertion_handles";

  //// Definitions

  /** The ID -> ASSERTION mapping table. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 1231) 
  private static SubLSymbol $assertion_from_id$ = null;

  @SubL(source = "cycl/assertion-handles.lisp", position = 2857) 
  public static final SubLObject do_assertions_table() {
    return $assertion_from_id$.getGlobalValue();
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 2956) 
  public static final SubLObject setup_assertion_table(SubLObject size, SubLObject exactP) {
    if ((NIL != $assertion_from_id$.getGlobalValue())) {
      return NIL;
    }
    $assertion_from_id$.setGlobalValue(id_index.new_id_index(size, ZERO_INTEGER));
    return T;
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 3174) 
  public static final SubLObject finalize_assertions(SubLObject max_assertion_id) {
    if ((max_assertion_id == UNPROVIDED)) {
      max_assertion_id = NIL;
    }
    set_next_assertion_id(max_assertion_id);
    if ((NIL == max_assertion_id)) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30896");
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32189");
    }
    return NIL;
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 3660) 
  public static final SubLObject clear_assertion_table() {
    return id_index.clear_id_index($assertion_from_id$.getGlobalValue());
  }

  /** Return the total number of assertions. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 4004) 
  public static final SubLObject assertion_count() {
    if ((NIL == $assertion_from_id$.getGlobalValue())) {
      return ZERO_INTEGER;
    }
    return id_index.id_index_count($assertion_from_id$.getGlobalValue());
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 4210) 
  public static final SubLObject lookup_assertion(SubLObject id) {
    return id_index.id_index_lookup($assertion_from_id$.getGlobalValue(), id, UNPROVIDED);
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 5033) 
  public static final SubLObject set_next_assertion_id(SubLObject max_assertion_id) {
    if ((max_assertion_id == UNPROVIDED)) {
      max_assertion_id = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject max = MINUS_ONE_INTEGER;
        if ((NIL != max_assertion_id)) {
          max = max_assertion_id;
        } else {
          {
            SubLObject idx = do_assertions_table();
            SubLObject mess = $str22$Determining_maximum_assertion_ID;
            SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            checkType(mess, $sym23$STRINGP);
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
                  SubLObject idx_4 = idx;
                  if ((NIL == id_index.id_index_objects_empty_p(idx_4, $kw24$SKIP))) {
                    {
                      SubLObject idx_5 = idx_4;
                      if ((NIL == id_index.id_index_old_objects_empty_p(idx_5, $kw24$SKIP))) {
                        {
                          SubLObject vector_var = id_index.id_index_old_objects(idx_5);
                          SubLObject backwardP_var = NIL;
                          SubLObject length = Sequences.length(vector_var);
                          SubLObject v_iteration = NIL;
                          for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            {
                              SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                              SubLObject assertion = Vectors.aref(vector_var, id);
                              if ((!(((NIL != id_index.id_index_tombstone_p(assertion))
                                     && (NIL != id_index.id_index_skip_tombstones_p($kw24$SKIP)))))) {
                                if ((NIL != id_index.id_index_tombstone_p(assertion))) {
                                  assertion = $kw24$SKIP;
                                }
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                max = Numbers.max(max, assertion_id(assertion));
                              }
                            }
                          }
                        }
                      }
                    }
                    {
                      SubLObject idx_6 = idx_4;
                      if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_6))
                             && (NIL != id_index.id_index_skip_tombstones_p($kw24$SKIP)))))) {
                        {
                          SubLObject v_new = id_index.id_index_new_objects(idx_6);
                          SubLObject id = id_index.id_index_new_id_threshold(idx_6);
                          SubLObject end_id = id_index.id_index_next_id(idx_6);
                          SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw24$SKIP)) ? ((SubLObject) NIL) : $kw24$SKIP);
                          while (id.numL(end_id)) {
                            {
                              SubLObject assertion = Hashtables.gethash_without_values(id, v_new, v_default);
                              if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw24$SKIP))
                                     && (NIL != id_index.id_index_tombstone_p(assertion)))))) {
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                max = Numbers.max(max, assertion_id(assertion));
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
          id_index.set_id_index_next_id($assertion_from_id$.getGlobalValue(), next_id);
          return next_id;
        }
      }
    }
  }

  /** Note that ID will be used as the id for ASSERTION. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 5420) 
  public static final SubLObject register_assertion_id(SubLObject assertion, SubLObject id) {
    reset_assertion_id(assertion, id);
    id_index.id_index_enter($assertion_from_id$.getGlobalValue(), id, assertion);
    return assertion;
  }

  /** Note that ID is not in use as an assertion id. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 5636) 
  public static final SubLObject deregister_assertion_id(SubLObject id) {
    return id_index.id_index_remove($assertion_from_id$.getGlobalValue(), id);
  }

  /** Return a new integer id for an assertion. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 5785) 
  public static final SubLObject make_assertion_id() {
    return id_index.id_index_reserve($assertion_from_id$.getGlobalValue());
  }

  public static final class $assertion_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject $id = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($assertion_native.class, $sym25$ASSERTION, $sym26$ASSERTION_P, $list28, $list29, new String[] {"$id"}, $list30, $list31, $sym32$PRINT_ASSERTION);
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 6239) 
  public static SubLSymbol $dtp_assertion$ = null;

  @SubL(source = "cycl/assertion-handles.lisp", position = 6239) 
  public static final SubLObject assertion_p(SubLObject object) {
    return ((object.getClass() == $assertion_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $assertion_p$UnaryFunction extends UnaryFunction {
    public $assertion_p$UnaryFunction() { super(extractFunctionNamed("ASSERTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return assertion_p(arg1); }
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 6239) 
  public static final SubLObject as_id(SubLObject object) {
    checkType(object, $sym26$ASSERTION_P);
    return object.getField2();
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 6239) 
  public static final SubLObject _csetf_as_id(SubLObject object, SubLObject value) {
    checkType(object, $sym26$ASSERTION_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 6239) 
  public static final SubLObject make_assertion(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $assertion_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw36$ID)) {
            _csetf_as_id(v_new, current_value);
          } else {
            Errors.error($str37$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 6367) 
  public static SubLSymbol $print_assertions_in_cnf$ = null;

  @SubL(source = "cycl/assertion-handles.lisp", position = 7238) 
  public static final SubLObject sxhash_assertion_method(SubLObject object) {
    {
      SubLObject id = as_id(object);
      if (id.isInteger()) {
        return id;
      }
    }
    return $int41$23;
  }

  public static final class $sxhash_assertion_method$UnaryFunction extends UnaryFunction {
    public $sxhash_assertion_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-ASSERTION-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return sxhash_assertion_method(arg1); }
  }

  /** Make a new assertion shell, potentially in static space. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 7366) 
  public static final SubLObject get_assertion() {
    {
      SubLObject assertion = NIL;
      assertion = make_assertion(UNPROVIDED);
      return assertion;
    }
  }

  /** Invalidate ASSERTION. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 7594) 
  public static final SubLObject free_assertion(SubLObject assertion) {
    _csetf_as_id(assertion, NIL);
    return assertion;
  }

  /** Return T iff OBJECT is a valid assertion handle. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 7886) 
  public static final SubLObject valid_assertion_handleP(SubLObject object) {
    return makeBoolean(((NIL != assertion_p(object))
           && (NIL != assertion_handle_validP(object))));
  }

  /** Return T if ASSERTION is a valid assertion. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 8064) 
  public static final SubLObject valid_assertionP(SubLObject assertion, SubLObject robustP) {
    if ((robustP == UNPROVIDED)) {
      robustP = NIL;
    }
    return valid_assertion_handleP(assertion);
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 8325) 
  public static final SubLObject make_assertion_shell(SubLObject id) {
    if ((id == UNPROVIDED)) {
      id = NIL;
    }
    if ((NIL == id)) {
      id = make_assertion_id();
    }
    checkType(id, $sym46$FIXNUMP);
    {
      SubLObject assertion = get_assertion();
      register_assertion_id(assertion, id);
      return assertion;
    }
  }

  /** Create a sample invalid-assertion. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 8574) 
  public static final SubLObject create_sample_invalid_assertion() {
    return get_assertion();
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 8939) 
  public static final SubLObject free_all_assertions() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject idx = do_assertions_table();
        SubLObject mess = $str47$Freeing_assertions;
        SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        checkType(mess, $sym23$STRINGP);
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
              SubLObject idx_7 = idx;
              if ((NIL == id_index.id_index_objects_empty_p(idx_7, $kw24$SKIP))) {
                {
                  SubLObject idx_8 = idx_7;
                  if ((NIL == id_index.id_index_old_objects_empty_p(idx_8, $kw24$SKIP))) {
                    {
                      SubLObject vector_var = id_index.id_index_old_objects(idx_8);
                      SubLObject backwardP_var = NIL;
                      SubLObject length = Sequences.length(vector_var);
                      SubLObject v_iteration = NIL;
                      for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        {
                          SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                          SubLObject assertion = Vectors.aref(vector_var, id);
                          if ((!(((NIL != id_index.id_index_tombstone_p(assertion))
                                 && (NIL != id_index.id_index_skip_tombstones_p($kw24$SKIP)))))) {
                            if ((NIL != id_index.id_index_tombstone_p(assertion))) {
                              assertion = $kw24$SKIP;
                            }
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, ONE_INTEGER);
                            free_assertion(assertion);
                          }
                        }
                      }
                    }
                  }
                }
                {
                  SubLObject idx_9 = idx_7;
                  if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_9))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw24$SKIP)))))) {
                    {
                      SubLObject v_new = id_index.id_index_new_objects(idx_9);
                      SubLObject id = id_index.id_index_new_id_threshold(idx_9);
                      SubLObject end_id = id_index.id_index_next_id(idx_9);
                      SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw24$SKIP)) ? ((SubLObject) NIL) : $kw24$SKIP);
                      while (id.numL(end_id)) {
                        {
                          SubLObject assertion = Hashtables.gethash_without_values(id, v_new, v_default);
                          if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw24$SKIP))
                                 && (NIL != id_index.id_index_tombstone_p(assertion)))))) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, ONE_INTEGER);
                            free_assertion(assertion);
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
      clear_assertion_table();
      assertion_manager.clear_assertion_content_table();
      return NIL;
    }
  }

  /** Return the id of this ASSERTION. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 9152) 
  public static final SubLObject assertion_id(SubLObject assertion) {
    checkType(assertion, $sym26$ASSERTION_P);
    return as_id(assertion);
  }

  /** Primitively change the assertion id for ASSERTION to NEW-ID. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 9341) 
  public static final SubLObject reset_assertion_id(SubLObject assertion, SubLObject new_id) {
    _csetf_as_id(assertion, new_id);
    return assertion;
  }

  @SubL(source = "cycl/assertion-handles.lisp", position = 9527) 
  public static final SubLObject assertion_handle_validP(SubLObject assertion) {
    return Types.integerp(as_id(assertion));
  }

  /** Return the assertion with ID, or NIL if not present. */
  @SubL(source = "cycl/assertion-handles.lisp", position = 9631) 
  public static final SubLObject find_assertion_by_id(SubLObject id) {
    checkType(id, $sym52$INTEGERP);
    return lookup_assertion(id);
  }

  public static final class $find_assertion_by_id$UnaryFunction extends UnaryFunction {
    public $find_assertion_by_id$UnaryFunction() { super(extractFunctionNamed("FIND-ASSERTION-BY-ID")); }
    public SubLObject processItem(SubLObject arg1) { return find_assertion_by_id(arg1); }
  }

  public static final SubLObject declare_assertion_handles_file() {
    declareFunction(myName, "new_assertions_iterator", "NEW-ASSERTIONS-ITERATOR", 0, 0, false);
    declareMacro(myName, "do_assertions", "DO-ASSERTIONS");
    declareMacro(myName, "do_old_assertions", "DO-OLD-ASSERTIONS");
    declareMacro(myName, "do_new_assertions", "DO-NEW-ASSERTIONS");
    declareFunction(myName, "do_assertions_table", "DO-ASSERTIONS-TABLE", 0, 0, false);
    declareFunction(myName, "setup_assertion_table", "SETUP-ASSERTION-TABLE", 2, 0, false);
    declareFunction(myName, "finalize_assertions", "FINALIZE-ASSERTIONS", 0, 1, false);
    declareFunction(myName, "optimize_assertion_table", "OPTIMIZE-ASSERTION-TABLE", 0, 0, false);
    declareFunction(myName, "clear_assertion_table", "CLEAR-ASSERTION-TABLE", 0, 0, false);
    declareFunction(myName, "create_assertion_dump_id_table", "CREATE-ASSERTION-DUMP-ID-TABLE", 0, 0, false);
    declareFunction(myName, "new_dense_assertion_id_index", "NEW-DENSE-ASSERTION-ID-INDEX", 0, 0, false);
    declareFunction(myName, "assertion_count", "ASSERTION-COUNT", 0, 0, false);
    declareFunction(myName, "lookup_assertion", "LOOKUP-ASSERTION", 1, 0, false);
    declareFunction(myName, "next_assertion_id", "NEXT-ASSERTION-ID", 0, 0, false);
    declareFunction(myName, "new_assertion_id_threshold", "NEW-ASSERTION-ID-THRESHOLD", 0, 0, false);
    declareFunction(myName, "old_assertion_count", "OLD-ASSERTION-COUNT", 0, 0, false);
    declareFunction(myName, "new_assertion_count", "NEW-ASSERTION-COUNT", 0, 0, false);
    declareFunction(myName, "missing_old_assertion_ids", "MISSING-OLD-ASSERTION-IDS", 0, 0, false);
    declareFunction(myName, "set_next_assertion_id", "SET-NEXT-ASSERTION-ID", 0, 1, false);
    declareFunction(myName, "register_assertion_id", "REGISTER-ASSERTION-ID", 2, 0, false);
    declareFunction(myName, "deregister_assertion_id", "DEREGISTER-ASSERTION-ID", 1, 0, false);
    declareFunction(myName, "make_assertion_id", "MAKE-ASSERTION-ID", 0, 0, false);
    declareFunction(myName, "assertion_print_function_trampoline", "ASSERTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "assertion_p", "ASSERTION-P", 1, 0, false); new $assertion_p$UnaryFunction();
    declareFunction(myName, "as_id", "AS-ID", 1, 0, false);
    declareFunction(myName, "_csetf_as_id", "_CSETF-AS-ID", 2, 0, false);
    declareFunction(myName, "make_assertion", "MAKE-ASSERTION", 0, 1, false);
    declareFunction(myName, "print_assertion", "PRINT-ASSERTION", 3, 0, false);
    declareFunction(myName, "sxhash_assertion_method", "SXHASH-ASSERTION-METHOD", 1, 0, false); new $sxhash_assertion_method$UnaryFunction();
    declareFunction(myName, "get_assertion", "GET-ASSERTION", 0, 0, false);
    declareFunction(myName, "free_assertion", "FREE-ASSERTION", 1, 0, false);
    declareFunction(myName, "valid_assertion_handleP", "VALID-ASSERTION-HANDLE?", 1, 0, false);
    declareFunction(myName, "valid_assertionP", "VALID-ASSERTION?", 1, 1, false);
    declareFunction(myName, "assertion_id_p", "ASSERTION-ID-P", 1, 0, false);
    declareFunction(myName, "make_assertion_shell", "MAKE-ASSERTION-SHELL", 0, 1, false);
    declareFunction(myName, "create_sample_invalid_assertion", "CREATE-SAMPLE-INVALID-ASSERTION", 0, 0, false);
    declareFunction(myName, "partition_create_invalid_assertion", "PARTITION-CREATE-INVALID-ASSERTION", 0, 0, false);
    declareFunction(myName, "free_all_assertions", "FREE-ALL-ASSERTIONS", 0, 0, false);
    declareFunction(myName, "assertion_id", "ASSERTION-ID", 1, 0, false);
    declareFunction(myName, "reset_assertion_id", "RESET-ASSERTION-ID", 2, 0, false);
    declareFunction(myName, "assertion_handle_validP", "ASSERTION-HANDLE-VALID?", 1, 0, false);
    declareFunction(myName, "find_assertion_by_id", "FIND-ASSERTION-BY-ID", 1, 0, false); new $find_assertion_by_id$UnaryFunction();
    return NIL;
  }

  public static final SubLObject init_assertion_handles_file() {
    $assertion_from_id$ = deflexical("*ASSERTION-FROM-ID*", maybeDefault( $sym0$_ASSERTION_FROM_ID_, $assertion_from_id$, NIL));
    $dtp_assertion$ = defconstant("*DTP-ASSERTION*", $sym25$ASSERTION);
    $print_assertions_in_cnf$ = defparameter("*PRINT-ASSERTIONS-IN-CNF*", NIL);
    return NIL;
  }

  public static final SubLObject setup_assertion_handles_file() {
    // CVS_ID("Id: assertion-handles.lisp 128690 2009-09-02 19:44:47Z rck ");
    subl_macro_promotions.declare_defglobal($sym0$_ASSERTION_FROM_ID_);
    utilities_macros.register_cyc_api_macro($sym9$DO_ASSERTIONS, $list1, $str10$Iterate_over_all_HL_assertion_dat);
    access_macros.register_macro_helper($sym15$DO_ASSERTIONS_TABLE, $sym9$DO_ASSERTIONS);
    access_macros.register_macro_helper($sym16$CREATE_ASSERTION_DUMP_ID_TABLE, $sym17$WITH_ASSERTION_DUMP_ID_TABLE);
    utilities_macros.register_cyc_api_function($sym18$ASSERTION_COUNT, NIL, $str19$Return_the_total_number_of_assert, NIL, $list20);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_assertion$.getGlobalValue(), Symbols.symbol_function($sym33$ASSERTION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym34$AS_ID, $sym35$_CSETF_AS_ID);
    Equality.identity($sym25$ASSERTION);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_assertion$.getGlobalValue(), Symbols.symbol_function($sym42$SXHASH_ASSERTION_METHOD));
    utilities_macros.register_cyc_api_function($sym26$ASSERTION_P, $list43, $str44$Return_T_iff_OBJECT_is_an_HL_asse, NIL, $list45);
    utilities_macros.register_cyc_api_function($sym48$ASSERTION_ID, $list49, $str50$Return_the_id_of_this_ASSERTION_, $list51, $list20);
    utilities_macros.register_cyc_api_function($sym53$FIND_ASSERTION_BY_ID, $list28, $str54$Return_the_assertion_with_ID__or_, $list55, $list56);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_ASSERTION_FROM_ID_ = makeSymbol("*ASSERTION-FROM-ID*");
  public static final SubLList $list1 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc assertions")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str2$mapping_Cyc_assertions = makeString("mapping Cyc assertions");
  public static final SubLList $list3 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw4$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw5$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym6$DO_KB_SUID_TABLE = makeSymbol("DO-KB-SUID-TABLE");
  public static final SubLList $list7 = list(makeSymbol("DO-ASSERTIONS-TABLE"));
  public static final SubLSymbol $kw8$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $sym9$DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");
  public static final SubLString $str10$Iterate_over_all_HL_assertion_dat = makeString("Iterate over all HL assertion datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the assertion.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");
  public static final SubLList $list11 = list(list(makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list12 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $sym13$DO_KB_SUID_TABLE_OLD_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-OLD-OBJECTS");
  public static final SubLSymbol $sym14$DO_KB_SUID_TABLE_NEW_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-NEW-OBJECTS");
  public static final SubLSymbol $sym15$DO_ASSERTIONS_TABLE = makeSymbol("DO-ASSERTIONS-TABLE");
  public static final SubLSymbol $sym16$CREATE_ASSERTION_DUMP_ID_TABLE = makeSymbol("CREATE-ASSERTION-DUMP-ID-TABLE");
  public static final SubLSymbol $sym17$WITH_ASSERTION_DUMP_ID_TABLE = makeSymbol("WITH-ASSERTION-DUMP-ID-TABLE");
  public static final SubLSymbol $sym18$ASSERTION_COUNT = makeSymbol("ASSERTION-COUNT");
  public static final SubLString $str19$Return_the_total_number_of_assert = makeString("Return the total number of assertions.");
  public static final SubLList $list20 = list(makeSymbol("INTEGERP"));
  public static final SubLSymbol $kw21$OLD = makeKeyword("OLD");
  public static final SubLString $str22$Determining_maximum_assertion_ID = makeString("Determining maximum assertion ID");
  public static final SubLSymbol $sym23$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw24$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym25$ASSERTION = makeSymbol("ASSERTION");
  public static final SubLSymbol $sym26$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLInteger $int27$141 = makeInteger(141);
  public static final SubLList $list28 = list(makeSymbol("ID"));
  public static final SubLList $list29 = list(makeKeyword("ID"));
  public static final SubLList $list30 = list(makeSymbol("AS-ID"));
  public static final SubLList $list31 = list(makeSymbol("_CSETF-AS-ID"));
  public static final SubLSymbol $sym32$PRINT_ASSERTION = makeSymbol("PRINT-ASSERTION");
  public static final SubLSymbol $sym33$ASSERTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ASSERTION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym34$AS_ID = makeSymbol("AS-ID");
  public static final SubLSymbol $sym35$_CSETF_AS_ID = makeSymbol("_CSETF-AS-ID");
  public static final SubLSymbol $kw36$ID = makeKeyword("ID");
  public static final SubLString $str37$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str38$__AS__S__S_ = makeString("#<AS:~S:~S>");
  public static final SubLString $str39$__AS__S_ = makeString("#<AS:~S>");
  public static final SubLString $str40$_The_CFASL_invalid_assertion_ = makeString("<The CFASL invalid assertion>");
  public static final SubLInteger $int41$23 = makeInteger(23);
  public static final SubLSymbol $sym42$SXHASH_ASSERTION_METHOD = makeSymbol("SXHASH-ASSERTION-METHOD");
  public static final SubLList $list43 = list(makeSymbol("OBJECT"));
  public static final SubLString $str44$Return_T_iff_OBJECT_is_an_HL_asse = makeString("Return T iff OBJECT is an HL assertion");
  public static final SubLList $list45 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym46$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLString $str47$Freeing_assertions = makeString("Freeing assertions");
  public static final SubLSymbol $sym48$ASSERTION_ID = makeSymbol("ASSERTION-ID");
  public static final SubLList $list49 = list(makeSymbol("ASSERTION"));
  public static final SubLString $str50$Return_the_id_of_this_ASSERTION_ = makeString("Return the id of this ASSERTION.");
  public static final SubLList $list51 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));
  public static final SubLSymbol $sym52$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym53$FIND_ASSERTION_BY_ID = makeSymbol("FIND-ASSERTION-BY-ID");
  public static final SubLString $str54$Return_the_assertion_with_ID__or_ = makeString("Return the assertion with ID, or NIL if not present.");
  public static final SubLList $list55 = list(list(makeSymbol("ID"), makeSymbol("INTEGERP")));
  public static final SubLList $list56 = list(list(makeSymbol("NIL-OR"), makeSymbol("ASSERTION-P")));

  //// Initializers

  public void declareFunctions() {
    declare_assertion_handles_file();
  }

  public void initializeVariables() {
    init_assertion_handles_file();
  }

  public void runTopLevelForms() {
    setup_assertion_handles_file();
  }

}
