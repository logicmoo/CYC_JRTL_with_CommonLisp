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
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.cfasl_kb_methods;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.deduction_manager;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class deduction_handles extends SubLTranslatedFile {

  //// Constructor

  private deduction_handles() {}
  public static final SubLFile me = new deduction_handles();
  public static final String myName = "com.cyc.cycjava_1.cycl.deduction_handles";

  //// Definitions

  /** The ID -> DEDUCTION mapping table. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 1231) 
  private static SubLSymbol $deduction_from_id$ = null;

  @SubL(source = "cycl/deduction-handles.lisp", position = 3255) 
  public static final SubLObject do_deductions_table() {
    return $deduction_from_id$.getGlobalValue();
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 3354) 
  public static final SubLObject setup_deduction_table(SubLObject size, SubLObject exactP) {
    if ((NIL != $deduction_from_id$.getGlobalValue())) {
      return NIL;
    }
    $deduction_from_id$.setGlobalValue(id_index.new_id_index(size, ZERO_INTEGER));
    return T;
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 3572) 
  public static final SubLObject finalize_deductions(SubLObject max_deduction_id) {
    if ((max_deduction_id == UNPROVIDED)) {
      max_deduction_id = NIL;
    }
    set_next_deduction_id(max_deduction_id);
    if ((NIL == max_deduction_id)) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30888");
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32197");
    }
    return NIL;
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 4060) 
  public static final SubLObject clear_deduction_table() {
    return id_index.clear_id_index($deduction_from_id$.getGlobalValue());
  }

  /** Return the total number of deductions. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 4506) 
  public static final SubLObject deduction_count() {
    if ((NIL == $deduction_from_id$.getGlobalValue())) {
      return ZERO_INTEGER;
    }
    return id_index.id_index_count($deduction_from_id$.getGlobalValue());
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 4712) 
  public static final SubLObject lookup_deduction(SubLObject id) {
    return id_index.id_index_lookup($deduction_from_id$.getGlobalValue(), id, UNPROVIDED);
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 5596) 
  public static final SubLObject set_next_deduction_id(SubLObject max_deduction_id) {
    if ((max_deduction_id == UNPROVIDED)) {
      max_deduction_id = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject max = MINUS_ONE_INTEGER;
        if ((NIL != max_deduction_id)) {
          max = max_deduction_id;
        } else {
          {
            SubLObject idx = do_deductions_table();
            SubLObject mess = $str23$Determining_maximum_deduction_ID;
            SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            checkType(mess, $sym24$STRINGP);
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
                  if ((NIL == id_index.id_index_objects_empty_p(idx_4, $kw25$SKIP))) {
                    {
                      SubLObject idx_5 = idx_4;
                      if ((NIL == id_index.id_index_old_objects_empty_p(idx_5, $kw25$SKIP))) {
                        {
                          SubLObject vector_var = id_index.id_index_old_objects(idx_5);
                          SubLObject backwardP_var = NIL;
                          SubLObject length = Sequences.length(vector_var);
                          SubLObject v_iteration = NIL;
                          for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            {
                              SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                              SubLObject deduction = Vectors.aref(vector_var, id);
                              if ((!(((NIL != id_index.id_index_tombstone_p(deduction))
                                     && (NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP)))))) {
                                if ((NIL != id_index.id_index_tombstone_p(deduction))) {
                                  deduction = $kw25$SKIP;
                                }
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                max = Numbers.max(max, deduction_id(deduction));
                              }
                            }
                          }
                        }
                      }
                    }
                    {
                      SubLObject idx_6 = idx_4;
                      if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_6))
                             && (NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP)))))) {
                        {
                          SubLObject v_new = id_index.id_index_new_objects(idx_6);
                          SubLObject id = id_index.id_index_new_id_threshold(idx_6);
                          SubLObject end_id = id_index.id_index_next_id(idx_6);
                          SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP)) ? ((SubLObject) NIL) : $kw25$SKIP);
                          while (id.numL(end_id)) {
                            {
                              SubLObject deduction = Hashtables.gethash_without_values(id, v_new, v_default);
                              if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP))
                                     && (NIL != id_index.id_index_tombstone_p(deduction)))))) {
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                max = Numbers.max(max, deduction_id(deduction));
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
          id_index.set_id_index_next_id($deduction_from_id$.getGlobalValue(), next_id);
          return next_id;
        }
      }
    }
  }

  /** Note that ID will be used as the id for DEDUCTION. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 5983) 
  public static final SubLObject register_deduction_id(SubLObject deduction, SubLObject id) {
    reset_deduction_id(deduction, id);
    id_index.id_index_enter($deduction_from_id$.getGlobalValue(), id, deduction);
    return deduction;
  }

  /** Note that ID is not in use as a deduction id. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 6199) 
  public static final SubLObject deregister_deduction_id(SubLObject id) {
    return id_index.id_index_remove($deduction_from_id$.getGlobalValue(), id);
  }

  /** Return a new integer id for a deduction. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 6347) 
  public static final SubLObject make_deduction_id() {
    return id_index.id_index_reserve($deduction_from_id$.getGlobalValue());
  }

  public static final class $deduction_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject $id = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($deduction_native.class, $sym26$DEDUCTION, $sym27$DEDUCTION_P, $list29, $list30, new String[] {"$id"}, $list31, $list32, $sym33$PRINT_DEDUCTION);
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 6721) 
  public static SubLSymbol $dtp_deduction$ = null;

  @SubL(source = "cycl/deduction-handles.lisp", position = 6721) 
  public static final SubLObject deduction_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30889");
    return NIL;
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 6721) 
  public static final SubLObject deduction_p(SubLObject object) {
    return ((object.getClass() == $deduction_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $deduction_p$UnaryFunction extends UnaryFunction {
    public $deduction_p$UnaryFunction() { super(extractFunctionNamed("DEDUCTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return deduction_p(arg1); }
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 6721) 
  public static final SubLObject d_id(SubLObject object) {
    checkType(object, $sym27$DEDUCTION_P);
    return object.getField2();
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 6721) 
  public static final SubLObject _csetf_d_id(SubLObject object, SubLObject value) {
    checkType(object, $sym27$DEDUCTION_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 6721) 
  public static final SubLObject make_deduction(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $deduction_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw37$ID)) {
            _csetf_d_id(v_new, current_value);
          } else {
            Errors.error($str38$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 7266) 
  public static final SubLObject sxhash_deduction_method(SubLObject object) {
    {
      SubLObject id = d_id(object);
      if (id.isInteger()) {
        return id;
      }
    }
    return $int43$786;
  }

  public static final class $sxhash_deduction_method$UnaryFunction extends UnaryFunction {
    public $sxhash_deduction_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-DEDUCTION-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return sxhash_deduction_method(arg1); }
  }

  /** Make a new deduction shell, potentially in static space. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 7394) 
  public static final SubLObject get_deduction() {
    {
      SubLObject deduction = NIL;
      deduction = make_deduction(UNPROVIDED);
      return deduction;
    }
  }

  /** Invalidate DEDUCTION. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 7622) 
  public static final SubLObject free_deduction(SubLObject deduction) {
    _csetf_d_id(deduction, NIL);
    return deduction;
  }

  /** Return T iff OBJECT is a valid deduction handle. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 7915) 
  public static final SubLObject valid_deduction_handleP(SubLObject object) {
    return makeBoolean(((NIL != deduction_p(object))
           && (NIL != deduction_handle_validP(object))));
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 8152) 
  public static final SubLObject valid_deduction(SubLObject deduction, SubLObject robustP) {
    if ((robustP == UNPROVIDED)) {
      robustP = NIL;
    }
    return valid_deductionP(deduction, robustP);
  }

  /** Return T if DEDUCTION is a valid deduction.  
ROBUST requests more thorough checking. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 8297) 
  public static final SubLObject valid_deductionP(SubLObject deduction, SubLObject robustP) {
    if ((robustP == UNPROVIDED)) {
      robustP = NIL;
    }
    if ((NIL != valid_deduction_handleP(deduction))) {
      if ((NIL == robustP)) {
        return T;
      }
      {
        SubLObject supports = deductions_high.deduction_supports(deduction);
        return makeBoolean(((NIL != arguments.valid_supportP(deductions_high.deduction_assertion(deduction), UNPROVIDED))
               && supports.isCons()
               && (NIL != list_utilities.every_in_list($sym50$VALID_SUPPORT_, supports, UNPROVIDED))));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 8726) 
  public static final SubLObject make_deduction_shell(SubLObject id) {
    if ((id == UNPROVIDED)) {
      id = NIL;
    }
    if ((NIL == id)) {
      id = make_deduction_id();
    }
    checkType(id, $sym51$FIXNUMP);
    {
      SubLObject deduction = get_deduction();
      register_deduction_id(deduction, id);
      return deduction;
    }
  }

  /** Create a sample invalid deduction. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 9023) 
  public static final SubLObject create_sample_invalid_deduction() {
    return get_deduction();
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 9160) 
  public static final SubLObject free_all_deductions() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject idx = do_deductions_table();
        SubLObject mess = $str52$Freeing_deductions;
        SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        checkType(mess, $sym24$STRINGP);
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
              SubLObject idx_9 = idx;
              if ((NIL == id_index.id_index_objects_empty_p(idx_9, $kw25$SKIP))) {
                {
                  SubLObject idx_10 = idx_9;
                  if ((NIL == id_index.id_index_old_objects_empty_p(idx_10, $kw25$SKIP))) {
                    {
                      SubLObject vector_var = id_index.id_index_old_objects(idx_10);
                      SubLObject backwardP_var = NIL;
                      SubLObject length = Sequences.length(vector_var);
                      SubLObject v_iteration = NIL;
                      for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        {
                          SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                          SubLObject deduction = Vectors.aref(vector_var, id);
                          if ((!(((NIL != id_index.id_index_tombstone_p(deduction))
                                 && (NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP)))))) {
                            if ((NIL != id_index.id_index_tombstone_p(deduction))) {
                              deduction = $kw25$SKIP;
                            }
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, ONE_INTEGER);
                            free_deduction(deduction);
                          }
                        }
                      }
                    }
                  }
                }
                {
                  SubLObject idx_11 = idx_9;
                  if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_11))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP)))))) {
                    {
                      SubLObject v_new = id_index.id_index_new_objects(idx_11);
                      SubLObject id = id_index.id_index_new_id_threshold(idx_11);
                      SubLObject end_id = id_index.id_index_next_id(idx_11);
                      SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP)) ? ((SubLObject) NIL) : $kw25$SKIP);
                      while (id.numL(end_id)) {
                        {
                          SubLObject deduction = Hashtables.gethash_without_values(id, v_new, v_default);
                          if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP))
                                 && (NIL != id_index.id_index_tombstone_p(deduction)))))) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, ONE_INTEGER);
                            free_deduction(deduction);
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
      clear_deduction_table();
      deduction_manager.clear_deduction_content_table();
      return NIL;
    }
  }

  /** Return the id of DEDUCTION. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 9456) 
  public static final SubLObject deduction_id(SubLObject deduction) {
    checkType(deduction, $sym27$DEDUCTION_P);
    return d_id(deduction);
  }

  /** Primitively change the id of DEDUCTION to NEW-ID. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 9642) 
  public static final SubLObject reset_deduction_id(SubLObject deduction, SubLObject new_id) {
    _csetf_d_id(deduction, new_id);
    return deduction;
  }

  @SubL(source = "cycl/deduction-handles.lisp", position = 9818) 
  public static final SubLObject deduction_handle_validP(SubLObject deduction) {
    return Types.integerp(d_id(deduction));
  }

  /** Return the deduction with ID, or NIL if not present. */
  @SubL(source = "cycl/deduction-handles.lisp", position = 9921) 
  public static final SubLObject find_deduction_by_id(SubLObject id) {
    checkType(id, $sym57$INTEGERP);
    return lookup_deduction(id);
  }

  public static final SubLObject declare_deduction_handles_file() {
    declareFunction(myName, "new_deductions_iterator", "NEW-DEDUCTIONS-ITERATOR", 0, 0, false);
    declareMacro(myName, "do_deductions", "DO-DEDUCTIONS");
    declareMacro(myName, "do_old_deductions", "DO-OLD-DEDUCTIONS");
    declareMacro(myName, "do_new_deductions", "DO-NEW-DEDUCTIONS");
    declareFunction(myName, "do_deductions_table", "DO-DEDUCTIONS-TABLE", 0, 0, false);
    declareFunction(myName, "setup_deduction_table", "SETUP-DEDUCTION-TABLE", 2, 0, false);
    declareFunction(myName, "finalize_deductions", "FINALIZE-DEDUCTIONS", 0, 1, false);
    declareFunction(myName, "optimize_deduction_table", "OPTIMIZE-DEDUCTION-TABLE", 0, 0, false);
    declareFunction(myName, "clear_deduction_table", "CLEAR-DEDUCTION-TABLE", 0, 0, false);
    declareFunction(myName, "create_deduction_dump_id_table", "CREATE-DEDUCTION-DUMP-ID-TABLE", 0, 0, false);
    declareFunction(myName, "new_dense_deduction_id_index", "NEW-DENSE-DEDUCTION-ID-INDEX", 0, 0, false);
    declareFunction(myName, "deduction_count", "DEDUCTION-COUNT", 0, 0, false);
    declareFunction(myName, "lookup_deduction", "LOOKUP-DEDUCTION", 1, 0, false);
    declareFunction(myName, "next_deduction_id", "NEXT-DEDUCTION-ID", 0, 0, false);
    declareFunction(myName, "new_deduction_id_threshold", "NEW-DEDUCTION-ID-THRESHOLD", 0, 0, false);
    declareFunction(myName, "old_deduction_count", "OLD-DEDUCTION-COUNT", 0, 0, false);
    declareFunction(myName, "new_deduction_count", "NEW-DEDUCTION-COUNT", 0, 0, false);
    declareFunction(myName, "missing_old_deduction_ids", "MISSING-OLD-DEDUCTION-IDS", 0, 0, false);
    declareFunction(myName, "set_next_deduction_id", "SET-NEXT-DEDUCTION-ID", 0, 1, false);
    declareFunction(myName, "register_deduction_id", "REGISTER-DEDUCTION-ID", 2, 0, false);
    declareFunction(myName, "deregister_deduction_id", "DEREGISTER-DEDUCTION-ID", 1, 0, false);
    declareFunction(myName, "make_deduction_id", "MAKE-DEDUCTION-ID", 0, 0, false);
    declareFunction(myName, "deduction_print_function_trampoline", "DEDUCTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "deduction_p", "DEDUCTION-P", 1, 0, false); new $deduction_p$UnaryFunction();
    declareFunction(myName, "d_id", "D-ID", 1, 0, false);
    declareFunction(myName, "_csetf_d_id", "_CSETF-D-ID", 2, 0, false);
    declareFunction(myName, "make_deduction", "MAKE-DEDUCTION", 0, 1, false);
    declareFunction(myName, "print_deduction", "PRINT-DEDUCTION", 3, 0, false);
    declareFunction(myName, "sxhash_deduction_method", "SXHASH-DEDUCTION-METHOD", 1, 0, false); new $sxhash_deduction_method$UnaryFunction();
    declareFunction(myName, "get_deduction", "GET-DEDUCTION", 0, 0, false);
    declareFunction(myName, "free_deduction", "FREE-DEDUCTION", 1, 0, false);
    declareFunction(myName, "valid_deduction_handleP", "VALID-DEDUCTION-HANDLE?", 1, 0, false);
    declareFunction(myName, "valid_deduction", "VALID-DEDUCTION", 1, 1, false);
    declareFunction(myName, "valid_deductionP", "VALID-DEDUCTION?", 1, 1, false);
    declareFunction(myName, "make_deduction_shell", "MAKE-DEDUCTION-SHELL", 0, 1, false);
    declareFunction(myName, "create_sample_invalid_deduction", "CREATE-SAMPLE-INVALID-DEDUCTION", 0, 0, false);
    declareFunction(myName, "free_all_deductions", "FREE-ALL-DEDUCTIONS", 0, 0, false);
    declareFunction(myName, "deduction_id", "DEDUCTION-ID", 1, 0, false);
    declareFunction(myName, "reset_deduction_id", "RESET-DEDUCTION-ID", 2, 0, false);
    declareFunction(myName, "deduction_handle_validP", "DEDUCTION-HANDLE-VALID?", 1, 0, false);
    declareFunction(myName, "find_deduction_by_id", "FIND-DEDUCTION-BY-ID", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_deduction_handles_file() {
    $deduction_from_id$ = deflexical("*DEDUCTION-FROM-ID*", maybeDefault( $sym0$_DEDUCTION_FROM_ID_, $deduction_from_id$, NIL));
    $dtp_deduction$ = defconstant("*DTP-DEDUCTION*", $sym26$DEDUCTION);
    return NIL;
  }

  public static final SubLObject setup_deduction_handles_file() {
    // CVS_ID("Id: deduction-handles.lisp 128690 2009-09-02 19:44:47Z rck ");
    subl_macro_promotions.declare_defglobal($sym0$_DEDUCTION_FROM_ID_);
    utilities_macros.register_cyc_api_macro($sym10$DO_DEDUCTIONS, $list2, $str11$Iterate_over_all_HL_deduction_dat);
    access_macros.register_macro_helper($sym16$DO_DEDUCTIONS_TABLE, $sym10$DO_DEDUCTIONS);
    access_macros.register_macro_helper($sym17$CREATE_DEDUCTION_DUMP_ID_TABLE, $sym18$WITH_DEDUCTION_DUMP_ID_TABLE);
    utilities_macros.register_cyc_api_function($sym19$DEDUCTION_COUNT, NIL, $str20$Return_the_total_number_of_deduct, NIL, $list21);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_deduction$.getGlobalValue(), Symbols.symbol_function($sym34$DEDUCTION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym35$D_ID, $sym36$_CSETF_D_ID);
    Equality.identity($sym26$DEDUCTION);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_deduction$.getGlobalValue(), Symbols.symbol_function($sym44$SXHASH_DEDUCTION_METHOD));
    utilities_macros.register_cyc_api_function($sym27$DEDUCTION_P, $list45, $str46$Return_T_iff_OBJECT_is_a_CycL_ded, NIL, $list47);
    access_macros.define_obsolete_register($sym48$VALID_DEDUCTION, $list49);
    utilities_macros.register_cyc_api_function($sym53$DEDUCTION_ID, $list54, $str55$Return_the_id_of_DEDUCTION_, $list56, $list21);
    utilities_macros.register_cyc_api_function($sym58$FIND_DEDUCTION_BY_ID, $list29, $str59$Return_the_deduction_with_ID__or_, $list60, $list61);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_DEDUCTION_FROM_ID_ = makeSymbol("*DEDUCTION-FROM-ID*");
  public static final SubLSymbol $sym1$SECOND = makeSymbol("SECOND");
  public static final SubLList $list2 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc deductions")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str3$mapping_Cyc_deductions = makeString("mapping Cyc deductions");
  public static final SubLList $list4 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw5$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw6$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym7$DO_KB_SUID_TABLE = makeSymbol("DO-KB-SUID-TABLE");
  public static final SubLList $list8 = list(makeSymbol("DO-DEDUCTIONS-TABLE"));
  public static final SubLSymbol $kw9$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $sym10$DO_DEDUCTIONS = makeSymbol("DO-DEDUCTIONS");
  public static final SubLString $str11$Iterate_over_all_HL_deduction_dat = makeString("Iterate over all HL deduction datastructures, executing BODY within the scope of VAR.\n   VAR is a deduction.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");
  public static final SubLList $list12 = list(list(makeSymbol("DEDUCTION"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list13 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $sym14$DO_KB_SUID_TABLE_OLD_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-OLD-OBJECTS");
  public static final SubLSymbol $sym15$DO_KB_SUID_TABLE_NEW_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-NEW-OBJECTS");
  public static final SubLSymbol $sym16$DO_DEDUCTIONS_TABLE = makeSymbol("DO-DEDUCTIONS-TABLE");
  public static final SubLSymbol $sym17$CREATE_DEDUCTION_DUMP_ID_TABLE = makeSymbol("CREATE-DEDUCTION-DUMP-ID-TABLE");
  public static final SubLSymbol $sym18$WITH_DEDUCTION_DUMP_ID_TABLE = makeSymbol("WITH-DEDUCTION-DUMP-ID-TABLE");
  public static final SubLSymbol $sym19$DEDUCTION_COUNT = makeSymbol("DEDUCTION-COUNT");
  public static final SubLString $str20$Return_the_total_number_of_deduct = makeString("Return the total number of deductions.");
  public static final SubLList $list21 = list(makeSymbol("INTEGERP"));
  public static final SubLSymbol $kw22$OLD = makeKeyword("OLD");
  public static final SubLString $str23$Determining_maximum_deduction_ID = makeString("Determining maximum deduction ID");
  public static final SubLSymbol $sym24$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw25$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym26$DEDUCTION = makeSymbol("DEDUCTION");
  public static final SubLSymbol $sym27$DEDUCTION_P = makeSymbol("DEDUCTION-P");
  public static final SubLInteger $int28$144 = makeInteger(144);
  public static final SubLList $list29 = list(makeSymbol("ID"));
  public static final SubLList $list30 = list(makeKeyword("ID"));
  public static final SubLList $list31 = list(makeSymbol("D-ID"));
  public static final SubLList $list32 = list(makeSymbol("_CSETF-D-ID"));
  public static final SubLSymbol $sym33$PRINT_DEDUCTION = makeSymbol("PRINT-DEDUCTION");
  public static final SubLSymbol $sym34$DEDUCTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DEDUCTION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym35$D_ID = makeSymbol("D-ID");
  public static final SubLSymbol $sym36$_CSETF_D_ID = makeSymbol("_CSETF-D-ID");
  public static final SubLSymbol $kw37$ID = makeKeyword("ID");
  public static final SubLString $str38$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str39$__ = makeString("#<");
  public static final SubLSymbol $kw40$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw41$BASE = makeKeyword("BASE");
  public static final SubLString $str42$_The_CFASL_invalid_deduction_ = makeString("<The CFASL invalid deduction>");
  public static final SubLInteger $int43$786 = makeInteger(786);
  public static final SubLSymbol $sym44$SXHASH_DEDUCTION_METHOD = makeSymbol("SXHASH-DEDUCTION-METHOD");
  public static final SubLList $list45 = list(makeSymbol("OBJECT"));
  public static final SubLString $str46$Return_T_iff_OBJECT_is_a_CycL_ded = makeString("Return T iff OBJECT is a CycL deduction.");
  public static final SubLList $list47 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym48$VALID_DEDUCTION = makeSymbol("VALID-DEDUCTION");
  public static final SubLList $list49 = list(makeSymbol("VALID-DEDUCTION?"));
  public static final SubLSymbol $sym50$VALID_SUPPORT_ = makeSymbol("VALID-SUPPORT?");
  public static final SubLSymbol $sym51$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLString $str52$Freeing_deductions = makeString("Freeing deductions");
  public static final SubLSymbol $sym53$DEDUCTION_ID = makeSymbol("DEDUCTION-ID");
  public static final SubLList $list54 = list(makeSymbol("DEDUCTION"));
  public static final SubLString $str55$Return_the_id_of_DEDUCTION_ = makeString("Return the id of DEDUCTION.");
  public static final SubLList $list56 = list(list(makeSymbol("DEDUCTION"), makeSymbol("DEDUCTION-P")));
  public static final SubLSymbol $sym57$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym58$FIND_DEDUCTION_BY_ID = makeSymbol("FIND-DEDUCTION-BY-ID");
  public static final SubLString $str59$Return_the_deduction_with_ID__or_ = makeString("Return the deduction with ID, or NIL if not present.");
  public static final SubLList $list60 = list(list(makeSymbol("ID"), makeSymbol("INTEGERP")));
  public static final SubLList $list61 = list(list(makeSymbol("NIL-OR"), makeSymbol("DEDUCTION-P")));

  //// Initializers

  public void declareFunctions() {
    declare_deduction_handles_file();
  }

  public void initializeVariables() {
    init_deduction_handles_file();
  }

  public void runTopLevelForms() {
    setup_deduction_handles_file();
  }

}
