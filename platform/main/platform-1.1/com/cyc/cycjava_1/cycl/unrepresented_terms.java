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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.unrepresented_term_index_manager;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class unrepresented_terms extends SubLTranslatedFile {

  //// Constructor

  private unrepresented_terms() {}
  public static final SubLFile me = new unrepresented_terms();
  public static final String myName = "com.cyc.cycjava_1.cycl.unrepresented_terms";

  //// Definitions

  /** The UNREPRESENTED TERM -> SUID mapping table. */
  @SubL(source = "cycl/unrepresented-terms.lisp", position = 871) 
  private static SubLSymbol $unrepresented_term_to_suid$ = null;

  /** The SUID -> UNREPRESENTED TERM mapping table. */
  @SubL(source = "cycl/unrepresented-terms.lisp", position = 1090) 
  private static SubLSymbol $unrepresented_term_from_suid$ = null;

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 2433) 
  public static final SubLObject do_unrepresented_terms_table() {
    return $unrepresented_term_from_suid$.getGlobalValue();
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 3176) 
  public static final SubLObject setup_unrepresented_term_suid_table(SubLObject size, SubLObject exactP) {
    {
      SubLObject setupP = NIL;
      if ((NIL == $unrepresented_term_from_suid$.getGlobalValue())) {
        $unrepresented_term_from_suid$.setGlobalValue(id_index.new_id_index(size, ZERO_INTEGER));
        setupP = T;
      }
      if ((NIL == $unrepresented_term_to_suid$.getGlobalValue())) {
        $unrepresented_term_to_suid$.setGlobalValue(Hashtables.make_hash_table(size, Symbols.symbol_function(EQUAL), UNPROVIDED));
        setupP = T;
      }
      return setupP;
    }
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 3643) 
  public static final SubLObject finalize_unrepresented_term_suid_table(SubLObject max_unrepresented_term_id) {
    if ((max_unrepresented_term_id == UNPROVIDED)) {
      max_unrepresented_term_id = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      set_next_unrepresented_term_suid(max_unrepresented_term_id);
      if ((NIL == max_unrepresented_term_id)) {
        {
          SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
          try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            id_index.optimize_id_index($unrepresented_term_from_suid$.getGlobalValue(), UNPROVIDED);
          } finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 4046) 
  public static final SubLObject clear_unrepresented_term_suid_table() {
    id_index.clear_id_index($unrepresented_term_from_suid$.getGlobalValue());
    Hashtables.clrhash($unrepresented_term_to_suid$.getGlobalValue());
    set_next_unrepresented_term_suid(UNPROVIDED);
    return NIL;
  }

  /** Return the total number of unrepresented-terms mentioned in the KB. */
  @SubL(source = "cycl/unrepresented-terms.lisp", position = 4292) 
  public static final SubLObject kb_unrepresented_term_count() {
    return ((NIL != $unrepresented_term_from_suid$.getGlobalValue()) ? ((SubLObject) id_index.id_index_count($unrepresented_term_from_suid$.getGlobalValue())) : ZERO_INTEGER);
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 4529) 
  public static final SubLObject lookup_unrepresented_term_by_suid(SubLObject suid) {
    return id_index.id_index_lookup($unrepresented_term_from_suid$.getGlobalValue(), suid, UNPROVIDED);
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 4650) 
  public static final SubLObject lookup_unrepresented_term_suid(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject result = Hashtables.gethash(v_term, $unrepresented_term_to_suid$.getGlobalValue(), NIL);
        SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return result;
      }
    }
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 5252) 
  public static final SubLObject find_unrepresented_term_by_suid(SubLObject suid) {
    return lookup_unrepresented_term_by_suid(suid);
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 5357) 
  public static final SubLObject unrepresented_term_suid(SubLObject v_term) {
    return lookup_unrepresented_term_suid(v_term);
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 5451) 
  public static final SubLObject kb_unrepresented_term_p(SubLObject object) {
    return makeBoolean(((NIL != kb_indexing_datastructures.indexed_unrepresented_term_p(object))
           && (NIL != unrepresented_term_suid(object))));
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 5593) 
  public static final SubLObject set_next_unrepresented_term_suid(SubLObject max_unrepresented_term_id) {
    if ((max_unrepresented_term_id == UNPROVIDED)) {
      max_unrepresented_term_id = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject max = MINUS_ONE_INTEGER;
        if ((NIL != max_unrepresented_term_id)) {
          max = max_unrepresented_term_id;
        } else {
          {
            SubLObject idx = do_unrepresented_terms_table();
            SubLObject mess = $str24$Determining_maximum_unrepresented;
            SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            checkType(mess, $sym15$STRINGP);
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
                  if ((NIL == id_index.id_index_objects_empty_p(idx_9, $kw16$SKIP))) {
                    {
                      SubLObject idx_10 = idx_9;
                      if ((NIL == id_index.id_index_old_objects_empty_p(idx_10, $kw16$SKIP))) {
                        {
                          SubLObject vector_var = id_index.id_index_old_objects(idx_10);
                          SubLObject backwardP_var = NIL;
                          SubLObject length = Sequences.length(vector_var);
                          SubLObject v_iteration = NIL;
                          for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            {
                              SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                              SubLObject unrepresented_term = Vectors.aref(vector_var, id);
                              if ((!(((NIL != id_index.id_index_tombstone_p(unrepresented_term))
                                     && (NIL != id_index.id_index_skip_tombstones_p($kw16$SKIP)))))) {
                                if ((NIL != id_index.id_index_tombstone_p(unrepresented_term))) {
                                  unrepresented_term = $kw16$SKIP;
                                }
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                {
                                  SubLObject suid = unrepresented_term_suid(unrepresented_term);
                                  max = Numbers.max(max, suid);
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    {
                      SubLObject idx_11 = idx_9;
                      if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_11))
                             && (NIL != id_index.id_index_skip_tombstones_p($kw16$SKIP)))))) {
                        {
                          SubLObject v_new = id_index.id_index_new_objects(idx_11);
                          SubLObject id = id_index.id_index_new_id_threshold(idx_11);
                          SubLObject end_id = id_index.id_index_next_id(idx_11);
                          SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw16$SKIP)) ? ((SubLObject) NIL) : $kw16$SKIP);
                          while (id.numL(end_id)) {
                            {
                              SubLObject unrepresented_term = Hashtables.gethash_without_values(id, v_new, v_default);
                              if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw16$SKIP))
                                     && (NIL != id_index.id_index_tombstone_p(unrepresented_term)))))) {
                                utilities_macros.note_percent_progress(sofar, total);
                                sofar = Numbers.add(sofar, ONE_INTEGER);
                                {
                                  SubLObject suid = unrepresented_term_suid(unrepresented_term);
                                  max = Numbers.max(max, suid);
                                }
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
          SubLObject next_suid = Numbers.add(max, ONE_INTEGER);
          id_index.set_id_index_next_id($unrepresented_term_from_suid$.getGlobalValue(), next_suid);
          return next_suid;
        }
      }
    }
  }

  /** Note that SUID will be used as the suid for UNREPRESENTED-TERM. */
  @SubL(source = "cycl/unrepresented-terms.lisp", position = 6132) 
  public static final SubLObject register_unrepresented_term_suid(SubLObject v_term, SubLObject suid) {
    id_index.id_index_enter($unrepresented_term_from_suid$.getGlobalValue(), suid, v_term);
    Hashtables.sethash(v_term, $unrepresented_term_to_suid$.getGlobalValue(), suid);
    return v_term;
  }

  /** Note that SUID is not in use as a unrepresented term suid. */
  @SubL(source = "cycl/unrepresented-terms.lisp", position = 6389) 
  public static final SubLObject deregister_unrepresented_term_suid(SubLObject suid) {
    {
      SubLObject v_term = lookup_unrepresented_term_by_suid(suid);
      if ((NIL != v_term)) {
        id_index.id_index_remove($unrepresented_term_from_suid$.getGlobalValue(), suid);
        Hashtables.remhash(v_term, $unrepresented_term_to_suid$.getGlobalValue());
      }
      return list_utilities.sublisp_boolean(v_term);
    }
  }

  /** Return a new integer suid for a unrepresented-term. */
  @SubL(source = "cycl/unrepresented-terms.lisp", position = 6725) 
  public static final SubLObject make_unrepresented_term_suid() {
    return id_index.id_index_reserve($unrepresented_term_from_suid$.getGlobalValue());
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 6891) 
  public static final SubLObject find_or_create_unrepresented_term_suid(SubLObject v_term) {
    {
      SubLObject suid = unrepresented_term_suid(v_term);
      if ((NIL == suid)) {
        suid = make_unrepresented_term_suid();
        register_unrepresented_term_suid(v_term, suid);
      }
      return suid;
    }
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 7155) 
  public static final SubLObject finalize_unrepresented_terms(SubLObject max_unrepresented_term_id) {
    if ((max_unrepresented_term_id == UNPROVIDED)) {
      max_unrepresented_term_id = NIL;
    }
    finalize_unrepresented_term_suid_table(max_unrepresented_term_id);
    return NIL;
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 7323) 
  public static final SubLObject unrepresented_term_index(SubLObject v_term) {
    {
      SubLObject suid = unrepresented_term_suid(v_term);
      return ((NIL != suid) ? ((SubLObject) unrepresented_term_index_manager.lookup_unrepresented_term_index(suid)) : NIL);
    }
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 7548) 
  public static final SubLObject setup_unrepresented_term_table(SubLObject size, SubLObject exactP) {
    setup_unrepresented_term_suid_table(size, exactP);
    unrepresented_term_index_manager.setup_unrepresented_term_index_table(size, exactP);
    return NIL;
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 7806) 
  public static final SubLObject clear_unrepresented_term_table() {
    clear_unrepresented_term_suid_table();
    unrepresented_term_index_manager.clear_unrepresented_term_index_table();
    return NIL;
  }

  /** Primitively change the assertion index for TERM to NEW-INDEX.
   If BOOTSTRAP? is non-nil, then a new SUID will be created for TERM if one does not already exist. */
  @SubL(source = "cycl/unrepresented-terms.lisp", position = 7953) 
  public static final SubLObject reset_unrepresented_term_index(SubLObject v_term, SubLObject new_index, SubLObject bootstrapP) {
    if ((bootstrapP == UNPROVIDED)) {
      bootstrapP = NIL;
    }
    if ((NIL == new_index)) {
      {
        SubLObject suid = unrepresented_term_suid(v_term);
        if ((NIL != suid)) {
          unrepresented_term_index_manager.deregister_unrepresented_term_index(suid);
          deregister_unrepresented_term_suid(suid);
        }
      }
      return v_term;
    } else {
      {
        SubLObject suid = ((NIL != bootstrapP) ? ((SubLObject) find_or_create_unrepresented_term_suid(v_term)) : unrepresented_term_suid(v_term));
        if ((NIL != suid)) {
          unrepresented_term_index_manager.register_unrepresented_term_index(suid, new_index);
        }
      }
      return v_term;
    }
  }

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 8979) 
  public static SubLSymbol $unrepresented_term_dump_id_table$ = null;

  @SubL(source = "cycl/unrepresented-terms.lisp", position = 9340) 
  public static final SubLObject find_unrepresented_term_by_dump_id(SubLObject dump_id) {
    return find_unrepresented_term_by_suid(dump_id);
  }

  public static final SubLObject declare_unrepresented_terms_file() {
    declareFunction(myName, "new_unrepresented_terms_iterator", "NEW-UNREPRESENTED-TERMS-ITERATOR", 0, 0, false);
    declareMacro(myName, "do_kb_unrepresented_terms", "DO-KB-UNREPRESENTED-TERMS");
    declareMacro(myName, "do_old_unrepresented_terms", "DO-OLD-UNREPRESENTED-TERMS");
    declareMacro(myName, "do_new_unrepresented_terms", "DO-NEW-UNREPRESENTED-TERMS");
    declareFunction(myName, "do_unrepresented_terms_table", "DO-UNREPRESENTED-TERMS-TABLE", 0, 0, false);
    declareFunction(myName, "map_unrepresented_terms", "MAP-UNREPRESENTED-TERMS", 1, 0, false);
    declareMacro(myName, "do_kb_strings", "DO-KB-STRINGS");
    declareMacro(myName, "do_kb_numbers", "DO-KB-NUMBERS");
    declareFunction(myName, "setup_unrepresented_term_suid_table", "SETUP-UNREPRESENTED-TERM-SUID-TABLE", 2, 0, false);
    declareFunction(myName, "finalize_unrepresented_term_suid_table", "FINALIZE-UNREPRESENTED-TERM-SUID-TABLE", 0, 1, false);
    declareFunction(myName, "clear_unrepresented_term_suid_table", "CLEAR-UNREPRESENTED-TERM-SUID-TABLE", 0, 0, false);
    declareFunction(myName, "kb_unrepresented_term_count", "KB-UNREPRESENTED-TERM-COUNT", 0, 0, false);
    declareFunction(myName, "lookup_unrepresented_term_by_suid", "LOOKUP-UNREPRESENTED-TERM-BY-SUID", 1, 0, false);
    declareFunction(myName, "lookup_unrepresented_term_suid", "LOOKUP-UNREPRESENTED-TERM-SUID", 1, 0, false);
    declareFunction(myName, "next_unrepresented_term_suid", "NEXT-UNREPRESENTED-TERM-SUID", 0, 0, false);
    declareFunction(myName, "new_unrepresented_term_suid_threshold", "NEW-UNREPRESENTED-TERM-SUID-THRESHOLD", 0, 0, false);
    declareFunction(myName, "unrepresented_term_tables_setupP", "UNREPRESENTED-TERM-TABLES-SETUP?", 0, 0, false);
    declareFunction(myName, "find_unrepresented_term_by_suid", "FIND-UNREPRESENTED-TERM-BY-SUID", 1, 0, false);
    declareFunction(myName, "unrepresented_term_suid", "UNREPRESENTED-TERM-SUID", 1, 0, false);
    declareFunction(myName, "kb_unrepresented_term_p", "KB-UNREPRESENTED-TERM-P", 1, 0, false);
    declareFunction(myName, "set_next_unrepresented_term_suid", "SET-NEXT-UNREPRESENTED-TERM-SUID", 0, 1, false);
    declareFunction(myName, "register_unrepresented_term_suid", "REGISTER-UNREPRESENTED-TERM-SUID", 2, 0, false);
    declareFunction(myName, "deregister_unrepresented_term_suid", "DEREGISTER-UNREPRESENTED-TERM-SUID", 1, 0, false);
    declareFunction(myName, "make_unrepresented_term_suid", "MAKE-UNREPRESENTED-TERM-SUID", 0, 0, false);
    declareFunction(myName, "find_or_create_unrepresented_term_suid", "FIND-OR-CREATE-UNREPRESENTED-TERM-SUID", 1, 0, false);
    declareFunction(myName, "finalize_unrepresented_terms", "FINALIZE-UNREPRESENTED-TERMS", 0, 1, false);
    declareFunction(myName, "unrepresented_term_index", "UNREPRESENTED-TERM-INDEX", 1, 0, false);
    declareFunction(myName, "setup_unrepresented_term_table", "SETUP-UNREPRESENTED-TERM-TABLE", 2, 0, false);
    declareFunction(myName, "clear_unrepresented_term_table", "CLEAR-UNREPRESENTED-TERM-TABLE", 0, 0, false);
    declareFunction(myName, "reset_unrepresented_term_index", "RESET-UNREPRESENTED-TERM-INDEX", 2, 1, false);
    declareFunction(myName, "clear_unrepresented_term_index", "CLEAR-UNREPRESENTED-TERM-INDEX", 1, 0, false);
    declareFunction(myName, "remove_unrepresented_term_index", "REMOVE-UNREPRESENTED-TERM-INDEX", 1, 0, false);
    declareFunction(myName, "unrepresented_term_dump_id", "UNREPRESENTED-TERM-DUMP-ID", 1, 0, false);
    declareFunction(myName, "find_unrepresented_term_by_dump_id", "FIND-UNREPRESENTED-TERM-BY-DUMP-ID", 1, 0, false);
    declareMacro(myName, "with_unrepresented_term_dump_id_table", "WITH-UNREPRESENTED-TERM-DUMP-ID-TABLE");
    declareFunction(myName, "create_unrepresented_term_dump_id_table", "CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_unrepresented_terms_file() {
    $unrepresented_term_to_suid$ = deflexical("*UNREPRESENTED-TERM-TO-SUID*", maybeDefault( $sym0$_UNREPRESENTED_TERM_TO_SUID_, $unrepresented_term_to_suid$, NIL));
    $unrepresented_term_from_suid$ = deflexical("*UNREPRESENTED-TERM-FROM-SUID*", maybeDefault( $sym1$_UNREPRESENTED_TERM_FROM_SUID_, $unrepresented_term_from_suid$, NIL));
    $unrepresented_term_dump_id_table$ = defparameter("*UNREPRESENTED-TERM-DUMP-ID-TABLE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_unrepresented_terms_file() {
        subl_macro_promotions.declare_defglobal($sym0$_UNREPRESENTED_TERM_TO_SUID_);
    subl_macro_promotions.declare_defglobal($sym1$_UNREPRESENTED_TERM_FROM_SUID_);
    access_macros.register_macro_helper($sym13$DO_UNREPRESENTED_TERMS_TABLE, $sym14$DO_KB_UNREPRESENTED_TERMS);
    access_macros.register_macro_helper($sym27$CREATE_UNREPRESENTED_TERM_DUMP_ID_TABLE, $sym28$WITH_UNREPRESENTED_TERM_DUMP_ID_TABLE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_UNREPRESENTED_TERM_TO_SUID_ = makeSymbol("*UNREPRESENTED-TERM-TO-SUID*");
  public static final SubLSymbol $sym1$_UNREPRESENTED_TERM_FROM_SUID_ = makeSymbol("*UNREPRESENTED-TERM-FROM-SUID*");
  public static final SubLList $list2 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc unrepresented terms")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list3 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw4$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw5$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLString $str6$mapping_Cyc_unrepresented_terms = makeString("mapping Cyc unrepresented terms");
  public static final SubLSymbol $kw7$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym8$DO_KB_SUID_TABLE = makeSymbol("DO-KB-SUID-TABLE");
  public static final SubLList $list9 = list(makeSymbol("DO-UNREPRESENTED-TERMS-TABLE"));
  public static final SubLList $list10 = list(list(makeSymbol("UNREPRESENTED-TERM"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym11$DO_KB_SUID_TABLE_OLD_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-OLD-OBJECTS");
  public static final SubLSymbol $sym12$DO_KB_SUID_TABLE_NEW_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-NEW-OBJECTS");
  public static final SubLSymbol $sym13$DO_UNREPRESENTED_TERMS_TABLE = makeSymbol("DO-UNREPRESENTED-TERMS-TABLE");
  public static final SubLSymbol $sym14$DO_KB_UNREPRESENTED_TERMS = makeSymbol("DO-KB-UNREPRESENTED-TERMS");
  public static final SubLSymbol $sym15$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw16$SKIP = makeKeyword("SKIP");
  public static final SubLList $list17 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc strings")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str18$mapping_Cyc_strings = makeString("mapping Cyc strings");
  public static final SubLSymbol $sym19$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym20$SUBL_STRING_P = makeSymbol("SUBL-STRING-P");
  public static final SubLList $list21 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc numbers")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str22$mapping_Cyc_numbers = makeString("mapping Cyc numbers");
  public static final SubLSymbol $sym23$SUBL_REAL_NUMBER_P = makeSymbol("SUBL-REAL-NUMBER-P");
  public static final SubLString $str24$Determining_maximum_unrepresented = makeString("Determining maximum unrepresented-term SUID");
  public static final SubLSymbol $sym25$CLET = makeSymbol("CLET");
  public static final SubLList $list26 = list(list(makeSymbol("*UNREPRESENTED-TERM-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE"))));
  public static final SubLSymbol $sym27$CREATE_UNREPRESENTED_TERM_DUMP_ID_TABLE = makeSymbol("CREATE-UNREPRESENTED-TERM-DUMP-ID-TABLE");
  public static final SubLSymbol $sym28$WITH_UNREPRESENTED_TERM_DUMP_ID_TABLE = makeSymbol("WITH-UNREPRESENTED-TERM-DUMP-ID-TABLE");

  //// Initializers

  public void declareFunctions() {
    declare_unrepresented_terms_file();
  }

  public void initializeVariables() {
    init_unrepresented_terms_file();
  }

  public void runTopLevelForms() {
    setup_unrepresented_terms_file();
  }

}
