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
import com.cyc.cycjava.cycl.cfasl_kb_methods;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_macros;
import com.cyc.cycjava.cycl.nart_hl_formula_manager;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class nart_handles extends SubLTranslatedFile {

  //// Constructor

  private nart_handles() {}
  public static final SubLFile me = new nart_handles();
  public static final String myName = "com.cyc.cycjava.cycl.nart_handles";

  //// Definitions

  /** The ID -> NART mapping table. */
  @SubL(source = "cycl/nart-handles.lisp", position = 1197) 
  private static SubLSymbol $nart_from_id$ = null;

  @SubL(source = "cycl/nart-handles.lisp", position = 2663) 
  public static final SubLObject do_narts_table() {
    return $nart_from_id$.getGlobalValue();
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 2747) 
  public static final SubLObject setup_nart_table(SubLObject size, SubLObject exactP) {
    if ((NIL != $nart_from_id$.getGlobalValue())) {
      return NIL;
    }
    $nart_from_id$.setGlobalValue(id_index.new_id_index(size, ZERO_INTEGER));
    return T;
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 2950) 
  public static final SubLObject finalize_narts(SubLObject max_nart_id) {
    if ((max_nart_id == UNPROVIDED)) {
      max_nart_id = NIL;
    }
    set_next_nart_id(max_nart_id);
    if ((NIL == max_nart_id)) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30878");
    }
    return NIL;
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 3318) 
  public static final SubLObject clear_nart_table() {
    return id_index.clear_id_index($nart_from_id$.getGlobalValue());
  }

  /** Return the total number of NARTs. */
  @SubL(source = "cycl/nart-handles.lisp", position = 3625) 
  public static final SubLObject nart_count() {
    if ((NIL == $nart_from_id$.getGlobalValue())) {
      return ZERO_INTEGER;
    }
    return id_index.id_index_count($nart_from_id$.getGlobalValue());
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 3811) 
  public static final SubLObject lookup_nart(SubLObject id) {
    return id_index.id_index_lookup($nart_from_id$.getGlobalValue(), id, UNPROVIDED);
  }

  /** Return the internal ID where new NARTs started. */
  @SubL(source = "cycl/nart-handles.lisp", position = 3970) 
  public static final SubLObject new_nart_id_threshold() {
    return id_index.id_index_new_id_threshold($nart_from_id$.getGlobalValue());
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 4523) 
  public static final SubLObject set_next_nart_id(SubLObject max_nart_id) {
    if ((max_nart_id == UNPROVIDED)) {
      max_nart_id = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject max = MINUS_ONE_INTEGER;
        if ((NIL != max_nart_id)) {
          max = max_nart_id;
        } else {
          {
            SubLObject idx = do_narts_table();
            SubLObject mess = $str23$Determining_maximum_NART_ID;
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
                              SubLObject nart = Vectors.aref(vector_var, id);
                              if ((!(((NIL != id_index.id_index_tombstone_p(nart))
                                     && (NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP)))))) {
                                if ((NIL != id_index.id_index_tombstone_p(nart))) {
                                  nart = $kw25$SKIP;
                                }
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                max = Numbers.max(max, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30875"));
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
                              SubLObject nart = Hashtables.gethash_without_values(id, v_new, v_default);
                              if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP))
                                     && (NIL != id_index.id_index_tombstone_p(nart)))))) {
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                max = Numbers.max(max, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30876"));
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
          id_index.set_id_index_next_id($nart_from_id$.getGlobalValue(), next_id);
          return next_id;
        }
      }
    }
  }

  /** Note that ID will be used as the id for NART. */
  @SubL(source = "cycl/nart-handles.lisp", position = 4860) 
  public static final SubLObject register_nart_id(SubLObject nart, SubLObject id) {
    reset_nart_id(nart, id);
    id_index.id_index_enter($nart_from_id$.getGlobalValue(), id, nart);
    return nart;
  }

  public static final class $nart_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject $id = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($nart_native.class, $sym26$NART, $sym27$NART_P, $list29, $list30, new String[] {"$id"}, $list31, $list32, $sym33$PRINT_NART);
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 5508) 
  public static SubLSymbol $dtp_nart$ = null;

  @SubL(source = "cycl/nart-handles.lisp", position = 5508) 
  public static final SubLObject nart_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30879");
    return NIL;
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 5508) 
  public static final SubLObject nart_p(SubLObject object) {
    return ((object.getClass() == $nart_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $nart_p$UnaryFunction extends UnaryFunction {
    public $nart_p$UnaryFunction() { super(extractFunctionNamed("NART-P")); }
    public SubLObject processItem(SubLObject arg1) { return nart_p(arg1); }
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 5508) 
  public static final SubLObject n_id(SubLObject object) {
    checkType(object, $sym27$NART_P);
    return object.getField2();
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 5508) 
  public static final SubLObject _csetf_n_id(SubLObject object, SubLObject value) {
    checkType(object, $sym27$NART_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 5508) 
  public static final SubLObject make_nart(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $nart_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw37$ID)) {
            _csetf_n_id(v_new, current_value);
          } else {
            Errors.error($str38$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 6140) 
  public static final SubLObject sxhash_nart_method(SubLObject object) {
    {
      SubLObject id = n_id(object);
      if (id.isInteger()) {
        return id;
      }
    }
    return ZERO_INTEGER;
  }

  public static final class $sxhash_nart_method$UnaryFunction extends UnaryFunction {
    public $sxhash_nart_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-NART-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return sxhash_nart_method(arg1); }
  }

  /** Make a new nart shell, potentially in static space. */
  @SubL(source = "cycl/nart-handles.lisp", position = 6261) 
  public static final SubLObject get_nart() {
    {
      SubLObject nart = NIL;
      nart = make_nart(UNPROVIDED);
      return nart;
    }
  }

  /** Return T iff OBJECT is a valid NART handle. */
  @SubL(source = "cycl/nart-handles.lisp", position = 6762) 
  public static final SubLObject valid_nart_handleP(SubLObject object) {
    return makeBoolean(((NIL != nart_p(object))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30862"))));
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 7564) 
  public static final SubLObject make_nart_shell(SubLObject id) {
    if ((id == UNPROVIDED)) {
      id = NIL;
    }
    if ((NIL == id)) {
      id = Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30861");
    }
    checkType(id, $sym46$FIXNUMP);
    {
      SubLObject nart = get_nart();
      register_nart_id(nart, id);
      return nart;
    }
  }

  /** Create a sample invalid NART. */
  @SubL(source = "cycl/nart-handles.lisp", position = 7970) 
  public static final SubLObject create_sample_invalid_nart() {
    return get_nart();
  }

  @SubL(source = "cycl/nart-handles.lisp", position = 8092) 
  public static final SubLObject free_all_narts() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject idx = do_narts_table();
        SubLObject mess = $str47$Freeing_NARTs;
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
              SubLObject idx_7 = idx;
              if ((NIL == id_index.id_index_objects_empty_p(idx_7, $kw25$SKIP))) {
                {
                  SubLObject idx_8 = idx_7;
                  if ((NIL == id_index.id_index_old_objects_empty_p(idx_8, $kw25$SKIP))) {
                    {
                      SubLObject vector_var = id_index.id_index_old_objects(idx_8);
                      SubLObject backwardP_var = NIL;
                      SubLObject length = Sequences.length(vector_var);
                      SubLObject v_iteration = NIL;
                      for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        {
                          SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                          SubLObject nart = Vectors.aref(vector_var, id);
                          if ((!(((NIL != id_index.id_index_tombstone_p(nart))
                                 && (NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP)))))) {
                            if ((NIL != id_index.id_index_tombstone_p(nart))) {
                              nart = $kw25$SKIP;
                            }
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, ONE_INTEGER);
                            kb_indexing_datastructures.free_term_index(nart);
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30859");
                          }
                        }
                      }
                    }
                  }
                }
                {
                  SubLObject idx_9 = idx_7;
                  if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_9))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP)))))) {
                    {
                      SubLObject v_new = id_index.id_index_new_objects(idx_9);
                      SubLObject id = id_index.id_index_new_id_threshold(idx_9);
                      SubLObject end_id = id_index.id_index_next_id(idx_9);
                      SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP)) ? ((SubLObject) NIL) : $kw25$SKIP);
                      while (id.numL(end_id)) {
                        {
                          SubLObject nart = Hashtables.gethash_without_values(id, v_new, v_default);
                          if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw25$SKIP))
                                 && (NIL != id_index.id_index_tombstone_p(nart)))))) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, ONE_INTEGER);
                            kb_indexing_datastructures.free_term_index(nart);
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30860");
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
      clear_nart_table();
      nart_hl_formula_manager.clear_nart_hl_formula_table();
      return NIL;
    }
  }

  /** Primitively change the internal id for NART to NEW-ID. */
  @SubL(source = "cycl/nart-handles.lisp", position = 8480) 
  public static final SubLObject reset_nart_id(SubLObject nart, SubLObject new_id) {
    checkType(nart, $sym27$NART_P);
    _csetf_n_id(nart, new_id);
    return nart;
  }

  /** Return the NART with ID, or NIL if not present. */
  @SubL(source = "cycl/nart-handles.lisp", position = 8774) 
  public static final SubLObject find_nart_by_id(SubLObject id) {
    checkType(id, $sym52$INTEGERP);
    return lookup_nart(id);
  }

  public static final SubLObject declare_nart_handles_file() {
    declareFunction(myName, "new_narts_iterator", "NEW-NARTS-ITERATOR", 0, 0, false);
    declareMacro(myName, "do_narts", "DO-NARTS");
    declareMacro(myName, "do_old_narts", "DO-OLD-NARTS");
    declareMacro(myName, "do_new_narts", "DO-NEW-NARTS");
    declareFunction(myName, "do_narts_table", "DO-NARTS-TABLE", 0, 0, false);
    declareFunction(myName, "setup_nart_table", "SETUP-NART-TABLE", 2, 0, false);
    declareFunction(myName, "finalize_narts", "FINALIZE-NARTS", 0, 1, false);
    declareFunction(myName, "optimize_nart_table", "OPTIMIZE-NART-TABLE", 0, 0, false);
    declareFunction(myName, "clear_nart_table", "CLEAR-NART-TABLE", 0, 0, false);
    declareFunction(myName, "create_nart_dump_id_table", "CREATE-NART-DUMP-ID-TABLE", 0, 0, false);
    declareFunction(myName, "new_dense_nart_id_index", "NEW-DENSE-NART-ID-INDEX", 0, 0, false);
    declareFunction(myName, "nart_count", "NART-COUNT", 0, 0, false);
    declareFunction(myName, "lookup_nart", "LOOKUP-NART", 1, 0, false);
    declareFunction(myName, "next_nart_id", "NEXT-NART-ID", 0, 0, false);
    declareFunction(myName, "new_nart_id_threshold", "NEW-NART-ID-THRESHOLD", 0, 0, false);
    declareFunction(myName, "old_nart_count", "OLD-NART-COUNT", 0, 0, false);
    declareFunction(myName, "new_nart_count", "NEW-NART-COUNT", 0, 0, false);
    declareFunction(myName, "missing_old_nart_ids", "MISSING-OLD-NART-IDS", 0, 0, false);
    declareFunction(myName, "set_next_nart_id", "SET-NEXT-NART-ID", 0, 1, false);
    declareFunction(myName, "register_nart_id", "REGISTER-NART-ID", 2, 0, false);
    declareFunction(myName, "deregister_nart_id", "DEREGISTER-NART-ID", 1, 0, false);
    declareFunction(myName, "make_nart_id", "MAKE-NART-ID", 0, 0, false);
    declareFunction(myName, "nart_print_function_trampoline", "NART-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "nart_p", "NART-P", 1, 0, false); new $nart_p$UnaryFunction();
    declareFunction(myName, "n_id", "N-ID", 1, 0, false);
    declareFunction(myName, "_csetf_n_id", "_CSETF-N-ID", 2, 0, false);
    declareFunction(myName, "make_nart", "MAKE-NART", 0, 1, false);
    declareFunction(myName, "print_nart", "PRINT-NART", 3, 0, false);
    declareFunction(myName, "sxhash_nart_method", "SXHASH-NART-METHOD", 1, 0, false); new $sxhash_nart_method$UnaryFunction();
    declareFunction(myName, "get_nart", "GET-NART", 0, 0, false);
    declareFunction(myName, "free_nart", "FREE-NART", 1, 0, false);
    declareFunction(myName, "valid_nart_handleP", "VALID-NART-HANDLE?", 1, 0, false);
    declareFunction(myName, "valid_nartP", "VALID-NART?", 1, 1, false);
    declareFunction(myName, "valid_nart_robustP", "VALID-NART-ROBUST?", 1, 0, false);
    declareFunction(myName, "nart_id_p", "NART-ID-P", 1, 0, false);
    declareFunction(myName, "create_nart_shell", "CREATE-NART-SHELL", 0, 0, false);
    declareFunction(myName, "make_nart_shell", "MAKE-NART-SHELL", 0, 1, false);
    declareFunction(myName, "partition_create_invalid_nart", "PARTITION-CREATE-INVALID-NART", 0, 0, false);
    declareFunction(myName, "create_sample_invalid_nart", "CREATE-SAMPLE-INVALID-NART", 0, 0, false);
    declareFunction(myName, "free_all_narts", "FREE-ALL-NARTS", 0, 0, false);
    declareFunction(myName, "nart_id", "NART-ID", 1, 0, false);
    declareFunction(myName, "reset_nart_id", "RESET-NART-ID", 2, 0, false);
    declareFunction(myName, "nart_handle_validP", "NART-HANDLE-VALID?", 1, 0, false);
    declareFunction(myName, "find_nart_by_id", "FIND-NART-BY-ID", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_nart_handles_file() {
    $nart_from_id$ = deflexical("*NART-FROM-ID*", ((NIL != Symbols.boundp($sym0$_NART_FROM_ID_)) ? ((SubLObject) $nart_from_id$.getGlobalValue()) : NIL));
    $dtp_nart$ = defconstant("*DTP-NART*", $sym26$NART);
    return NIL;
  }

  public static final SubLObject setup_nart_handles_file() {
    // CVS_ID("Id: nart-handles.lisp 128690 2009-09-02 19:44:47Z rck ");
    subl_macro_promotions.declare_defglobal($sym0$_NART_FROM_ID_);
    utilities_macros.register_cyc_api_macro($sym10$DO_NARTS, $list2, $str11$Iterate_over_all_HL_NART_datastru);
    access_macros.register_macro_helper($sym16$DO_NARTS_TABLE, $sym10$DO_NARTS);
    access_macros.register_macro_helper($sym17$CREATE_NART_DUMP_ID_TABLE, $sym18$WITH_NART_DUMP_ID_TABLE);
    utilities_macros.register_cyc_api_function($sym19$NART_COUNT, NIL, $str20$Return_the_total_number_of_NARTs_, NIL, $list21);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_nart$.getGlobalValue(), Symbols.symbol_function($sym34$NART_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym35$N_ID, $sym36$_CSETF_N_ID);
    Equality.identity($sym26$NART);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_nart$.getGlobalValue(), Symbols.symbol_function($sym42$SXHASH_NART_METHOD));
    utilities_macros.register_cyc_api_function($sym27$NART_P, $list43, $str44$Return_T_iff_OBJECT_is_a_datastru, NIL, $list45);
    utilities_macros.register_cyc_api_function($sym48$NART_ID, $list49, $str50$Return_the_id_of_this_NART_, $list51, $list21);
    utilities_macros.register_cyc_api_function($sym53$FIND_NART_BY_ID, $list29, $str54$Return_the_NART_with_ID__or_NIL_i, $list55, $list56);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_NART_FROM_ID_ = makeSymbol("*NART-FROM-ID*");
  public static final SubLSymbol $sym1$SECOND = makeSymbol("SECOND");
  public static final SubLList $list2 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc NARTs")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str3$mapping_Cyc_NARTs = makeString("mapping Cyc NARTs");
  public static final SubLList $list4 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw5$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw6$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym7$DO_KB_SUID_TABLE = makeSymbol("DO-KB-SUID-TABLE");
  public static final SubLList $list8 = list(makeSymbol("DO-NARTS-TABLE"));
  public static final SubLSymbol $kw9$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $sym10$DO_NARTS = makeSymbol("DO-NARTS");
  public static final SubLString $str11$Iterate_over_all_HL_NART_datastru = makeString("Iterate over all HL NART datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the NART.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");
  public static final SubLList $list12 = list(list(makeSymbol("NART"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list13 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $sym14$DO_KB_SUID_TABLE_OLD_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-OLD-OBJECTS");
  public static final SubLSymbol $sym15$DO_KB_SUID_TABLE_NEW_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-NEW-OBJECTS");
  public static final SubLSymbol $sym16$DO_NARTS_TABLE = makeSymbol("DO-NARTS-TABLE");
  public static final SubLSymbol $sym17$CREATE_NART_DUMP_ID_TABLE = makeSymbol("CREATE-NART-DUMP-ID-TABLE");
  public static final SubLSymbol $sym18$WITH_NART_DUMP_ID_TABLE = makeSymbol("WITH-NART-DUMP-ID-TABLE");
  public static final SubLSymbol $sym19$NART_COUNT = makeSymbol("NART-COUNT");
  public static final SubLString $str20$Return_the_total_number_of_NARTs_ = makeString("Return the total number of NARTs.");
  public static final SubLList $list21 = list(makeSymbol("INTEGERP"));
  public static final SubLSymbol $kw22$OLD = makeKeyword("OLD");
  public static final SubLString $str23$Determining_maximum_NART_ID = makeString("Determining maximum NART ID");
  public static final SubLSymbol $sym24$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw25$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym26$NART = makeSymbol("NART");
  public static final SubLSymbol $sym27$NART_P = makeSymbol("NART-P");
  public static final SubLInteger $int28$146 = makeInteger(146);
  public static final SubLList $list29 = list(makeSymbol("ID"));
  public static final SubLList $list30 = list(makeKeyword("ID"));
  public static final SubLList $list31 = list(makeSymbol("N-ID"));
  public static final SubLList $list32 = list(makeSymbol("_CSETF-N-ID"));
  public static final SubLSymbol $sym33$PRINT_NART = makeSymbol("PRINT-NART");
  public static final SubLSymbol $sym34$NART_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NART-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym35$N_ID = makeSymbol("N-ID");
  public static final SubLSymbol $sym36$_CSETF_N_ID = makeSymbol("_CSETF-N-ID");
  public static final SubLSymbol $kw37$ID = makeKeyword("ID");
  public static final SubLString $str38$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str39$___S_ = makeString("#<~S>");
  public static final SubLString $str40$__The_CFASL_invalid_NART_ = makeString("#<The CFASL invalid NART>");
  public static final SubLString $str41$__NART__S_ = makeString("#<NART ~S>");
  public static final SubLSymbol $sym42$SXHASH_NART_METHOD = makeSymbol("SXHASH-NART-METHOD");
  public static final SubLList $list43 = list(makeSymbol("OBJECT"));
  public static final SubLString $str44$Return_T_iff_OBJECT_is_a_datastru = makeString("Return T iff OBJECT is a datastructure implementing a non-atomic reified term (NART).");
  public static final SubLList $list45 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym46$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLString $str47$Freeing_NARTs = makeString("Freeing NARTs");
  public static final SubLSymbol $sym48$NART_ID = makeSymbol("NART-ID");
  public static final SubLList $list49 = list(makeSymbol("NART"));
  public static final SubLString $str50$Return_the_id_of_this_NART_ = makeString("Return the id of this NART.");
  public static final SubLList $list51 = list(list(makeSymbol("NART"), makeSymbol("NART-P")));
  public static final SubLSymbol $sym52$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym53$FIND_NART_BY_ID = makeSymbol("FIND-NART-BY-ID");
  public static final SubLString $str54$Return_the_NART_with_ID__or_NIL_i = makeString("Return the NART with ID, or NIL if not present.");
  public static final SubLList $list55 = list(list(makeSymbol("ID"), makeSymbol("INTEGERP")));
  public static final SubLList $list56 = list(list(makeSymbol("NIL-OR"), makeSymbol("NART-P")));

  //// Initializers

  public void declareFunctions() {
    declare_nart_handles_file();
  }

  public void initializeVariables() {
    init_nart_handles_file();
  }

  public void runTopLevelForms() {
    setup_nart_handles_file();
  }

}
